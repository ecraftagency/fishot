package com.fruit.controllers;

import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Queue;
import com.fruit.controllers.composite.SimpleScoreRecorder;
import com.fruit.controllers.spawners.SliceSpawn;
import com.fruit.controllers.spawners.paths.CurvePath;
import com.fruit.controllers.spawners.paths.MixPath;
import com.fruit.controllers.spawners.paths.WavePath;

import static com.fruit.controllers.ThrowEngine.*;
import static com.fruit.Const.*;

public class SliceMode implements ModeLogic<SliceCtxInfo> {
  private static final Array<Integer>   fruitTypes      = new Array<>();
  private static final int              WAVE_PER_STAGE  = 9;
  private static final int[][]          waveData        = new int[][]{
          {0,   1,  -1,  -1,  -1,  -1},
          {0,   1,   1,  -1,  -1,  -1},
          {0,   1,   2,  -1,  -1,  -1},
          {0,   0,   0,  -1,  -1,  -1},
          {0,   0,   0,   0,  -1,  -1},
          {0,   0,   1,   1,  -1,  -1},
          {0,   1,   2,   2,  -1,  -1},
          {0,   1,   2,   3,  -1,  -1},
          {0,   0,   0,   0,   0,  -1},
  };

  static {
    fruitTypes.add(0);
    fruitTypes.add(1);
    fruitTypes.add(2);
    fruitTypes.add(3);
  }

  private float             acc;
  private float             nextSpawn;
  private SpawnInput        spawnInput;
  private SliceCtxInfo      ctxInfo;
  private SpawnLogic        spawner;
  private ScoreRecorder     scoreRecorder;
  private Array<ThrowInfo>  throwInfo;
  private Queue<ThrowInfo>  pathQueue;
  private ThrowEngine       engine;
  private boolean           isInit;

  private int               currentStage;
  private int               currentWave;
  private Queue<ThrowInfo>  bufferPath;
  private boolean           deadWave;
  private float             stageTime;
  boolean                   waveCheck = false;
  float                     deadCounter;
  int                       currentSwipeID;

  SliceCustomEvent          customEvent;

  public SliceMode(ThrowEngine engine) {
    pathQueue = new Queue<>();
    ctxInfo   = new SliceCtxInfo();
    spawner   = new SliceSpawn(sliceSpawnInfo);

    scoreRecorder         = new SimpleScoreRecorder(PREF_KEYS.SLICE_HIGH_SCORE);
    nextSpawn             = 1;
    spawnInput            = new SpawnInput();
    spawnInput.waveID     = -1;
    spawnInput.newWave    = true;
    spawnInput.queue      = new Queue<>();
    throwInfo             = new Array<>();
    this.engine           = engine;
    isInit                = false;

    spawner.addSpawn(new MixPath(false, false, 200));
    spawner.addSpawn(new WavePath(false, false, true, 200));

    spawner.addSpawn(new CurvePath(false, false, Align.topLeft, 200));
    spawner.addSpawn(new CurvePath(false, false, Align.bottomRight, 200));
    spawner.addSpawn(new CurvePath(false, false, Align.bottomLeft, 200));

    spawnInput.queue = pathQueue;


    currentStage    = 1;
    currentWave     = 0;
    bufferPath      = new Queue<>();
    deadWave        = false;
    stageTime       = SLICE.STAGE_TIME;
    currentSwipeID  = -1;

    customEvent = new SliceCustomEvent();
  }

  private void reloadFruit(boolean refresh) {
    if (refresh) {
      currentWave   %= WAVE_PER_STAGE;
      int[] fruits   = waveData[currentWave];
      fruitTypes.shuffle();
      pathQueue.clear();
      bufferPath.clear();
      for (int fruit : fruits) {
        if (fruit == -1)
          break;
        ThrowInfo ti = new ThrowInfo();
        ti.type = fruitTypes.get(fruit);
        bufferPath.addLast(ti);
        pathQueue.addLast(ti);
      }
      customEvent.id = 0;
      customEvent.fruitPath = bufferPath;
      engine.signalCustomEvent(customEvent);
    }
    else {
      pathQueue.clear();
      for (ThrowInfo ti : bufferPath)
        pathQueue.addLast(ti);
    }
    currentSwipeID = -1;
  }

  @Override
  public void step(float delta, float sclDelta) {
    if (!isInit) {
      reloadFruit(true);
      customEvent.id = 2;
      customEvent.nextStageNumber = currentStage;
      engine.signalCustomEvent(customEvent);
      customEvent.id = 3;
      customEvent.waveNumber = currentWave;
      engine.signalCustomEvent(customEvent);
      isInit = true;
    }

    acc += sclDelta;
    deadCounter += sclDelta;
    stageTime -= sclDelta;

    if (stageTime < 0) { //game over
      engine.signalEndgame();
    }

    if (deadCounter >= SLICE.FINISH_DURATION - 1 && waveCheck) {//post runnable <- 1
      waveCheck = false;
      if (pathQueue.size == 0 && !deadWave) {
        currentWave++;
        if (currentWave == WAVE_PER_STAGE) {
          currentWave = 0;
          currentStage++; // new stage
          stageTime = SLICE.STAGE_TIME;
          customEvent.id = 2;
          customEvent.nextStageNumber = currentStage;
          engine.signalCustomEvent(customEvent);
        }
        customEvent.id = 3;
        customEvent.waveNumber = currentWave;
        engine.signalCustomEvent(customEvent);
        reloadFruit(true);
      }
      else {
        reloadFruit(false);
      }
      deadWave = false;
    }

    if (acc > nextSpawn) {
      acc = 0;
      throwInfo.clear();

      SpawnOutput po      = spawner.spawn(spawnInput, throwInfo);
      spawnInput.waveID   = po.waveID;
      nextSpawn           = po.nextSpawnDuration;
      spawnInput.newWave  = po.isNewWave;
      engine.signalNewWave(throwInfo);

      if (spawnInput.newWave){
        //post runnable 1 ->
        waveCheck = true;
        deadCounter = 0;
      }
    }
  }

  @Override
  public void onHit(HitContext ctx) {
    boolean validFruitHit = false;
    boolean validSwipeHit;

    if (currentSwipeID == -1) { //very first hit of wave
      currentSwipeID = ctx.swipeId;
      validSwipeHit = true;
    }
    else {
      validSwipeHit = currentSwipeID == ctx.swipeId;
    }

    for (ThrowInfo ti : pathQueue) {
      if (ctx.fruitType == ti.type) {
        validFruitHit = true;
        pathQueue.removeValue(ti, false);
        break;
      }
    }

    if (!validFruitHit) {
      deadWave = true;
      customEvent.id = 1;
      engine.signalCustomEvent(customEvent);
    }

    if (!validSwipeHit) {
      deadWave = true;
      customEvent.id = 4;
      engine.signalCustomEvent(customEvent);
    }
  }

  @Override
  public void onUnderBound(HitContext ctx) {

  }

  @Override
  public SliceCtxInfo getContextInfo() {
    ctxInfo.bestStage = scoreRecorder.getHighScore();
    ctxInfo.currentStage = currentStage;
    ctxInfo.currentWave = currentWave;
    ctxInfo.remainTime = stageTime/SLICE.STAGE_TIME;
    ctxInfo.bestStage = scoreRecorder.getHighScore();
    return ctxInfo;
  }

  @Override
  public void reset() {
    pathQueue.clear();
    spawnInput.newWave = false;
    isInit = false;
    scoreRecorder.recordScore(currentStage);
    pathQueue.clear();
    acc = 0;
    nextSpawn = 1;
    spawnInput.waveID = -1;
    throwInfo.clear();
    spawner.reset();


    scoreRecorder.recordScore(currentStage);
    currentWave = 0;
    currentStage = 1;
    bufferPath.clear();
    deadWave = false;
    stageTime = SLICE.STAGE_TIME;
    currentSwipeID = -1;

    customEvent.id = -1;
    customEvent.fruitPath = null;
    customEvent.nextStageNumber = 0;
    customEvent.waveNumber = 0;
  }
}
