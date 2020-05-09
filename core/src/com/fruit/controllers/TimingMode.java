package com.fruit.controllers;

import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Queue;
import com.fruit.controllers.composite.SimpleScoreRecorder;
import com.fruit.controllers.spawners.ConstantSpawn;
import com.fruit.controllers.spawners.paths.MixPath;
import com.fruit.controllers.spawners.paths.WavePath;
import static com.fruit.Const.*;

import static com.fruit.controllers.ThrowEngine.*;

public class TimingMode implements ModeLogic<TimingCtxInfo>, ItemResolver {

  private ThrowEngine                           engine;
  private SpawnLogic                            spawner;
  private float                                 acc;
  private float                                 nextSpawn     = 1;
  private Array<ThrowInfo>                      throwInfo;
  private int                                   spawnedCount  = 0;
  private SpawnInput                            spawnInput;
  private float                                 timeOut       = TIMING.TIME_OUT;
  private TimingCtxInfo                         ctxInfo;
  private int                                   score         = 0;
  private ScoreRecorder                         scoreRecorder;

  public TimingMode(ThrowEngine engine) {
    this.engine       = engine;
    spawner           = new ConstantSpawn(timingSpawnInfo);
    throwInfo         = new Array<>();
    spawnInput        = new SpawnInput();
    spawnInput.queue  = new Queue<>();
    spawnInput.waveID = -1;
    ctxInfo           = new TimingCtxInfo();

    spawner.addSpawn(new MixPath(false, false, 500));
    spawner.addSpawn(new WavePath(false, false, false, 500));

    scoreRecorder     = new SimpleScoreRecorder(PREF_KEYS.TIMING_HIGH_SCORE);
  }

  @Override
  public void step(float delta, float sclDelta) {
    acc     += sclDelta;
    timeOut -= sclDelta;

    if (timeOut <= 0) {
      engine.signalEndgame();
      return;
    }

    if (acc > nextSpawn && spawnedCount == 0) {
      acc = 0;
      throwInfo.clear();
      SpawnOutput po = spawner.spawn(spawnInput, throwInfo);
      nextSpawn           = 0;
      spawnInput.waveID   = po.waveID;
      spawnInput.newWave  = po.isNewWave;
      engine.signalNewWave(throwInfo);
      spawnedCount++;
    }
  }

  @Override
  public void onHit(ThrowEngine.HitContext ctx) {
    score++;
    spawnedCount--;
  }

  @Override
  public void onUnderBound(ThrowEngine.HitContext ctx) {
    spawnedCount--;
  }

  @Override
  public ThrowEngine.TimingCtxInfo getContextInfo() {
    ctxInfo.secondLeft = timeOut;
    ctxInfo.score = score;
    ctxInfo.highScore = scoreRecorder.getHighScore();
    return ctxInfo;
  }

  @Override
  public void reset() {
    spawnedCount = 0;
    acc = 0;
    nextSpawn = 1;
    spawnInput.waveID = -1;
    spawnInput.queue.clear();
    timeOut = TIMING.TIME_OUT;
    scoreRecorder.recordScore(score);
    score = 0;
    spawner.reset();
  }

  @Override
  public void onItemCast(int itemID) {
    if (itemID == ITEM.TIME)
      timeOut += 20;
  }
}