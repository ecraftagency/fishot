package com.fruit.controllers;

import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Queue;
import com.fruit.controllers.composite.SimpleComboCalc;
import com.fruit.controllers.composite.SimpleScoreRecorder;
import com.fruit.controllers.spawners.LinearSpawn;
import com.fruit.controllers.spawners.paths.CurvePath;
import com.fruit.controllers.spawners.paths.MixPath;
import com.fruit.controllers.spawners.paths.WavePath;
import com.fruit.pool_objects.Fruit;
import static com.fruit.Const.*;
import static com.fruit.controllers.ThrowEngine.*;

@SuppressWarnings("unused")
public class ClassicMode implements ModeLogic<ClassicCtxInfo> {
  private float                             acc;
  private float                             stepDuration;
  int                                       nLife;
  int                                       remainLife;
  ThrowEngine                               engine;
  SpawnLogic spawner;
  ComboLogic                                comboCalc;
  ThrowEngine.ClassicCtxInfo                ctxInfo;
  private int                               score;
  ScoreRecorder                             scoreRecorder;
  private Array<ThrowInfo>                  spawnArray          = new Array<>();
  private SpawnInput                        spawnInput;

  public ClassicMode(ThrowEngine engine) {
    this.engine         = engine;
    nLife               = CLASSIC.SESSION_NLIFE;
    remainLife          = nLife;
    stepDuration        = 1;
    spawner             = new LinearSpawn(classicSpawnInfo);

    comboCalc           = new SimpleComboCalc(engine);
    ctxInfo             = new ThrowEngine.ClassicCtxInfo();
    scoreRecorder       = new SimpleScoreRecorder(PREF_KEYS.CLASSIC_HIGH_SCORE);
    spawnInput          = new SpawnInput();
    spawnInput.queue    = new Queue<>();
    spawnInput.waveID   = -1;

    spawner.addSpawn(new MixPath(CLASSIC.HAVE_BOMB, CLASSIC.HAVE_ICE, 500));
    spawner.addSpawn(new WavePath(CLASSIC.HAVE_BOMB, CLASSIC.HAVE_ICE, false, 300));
    spawner.addSpawn(new CurvePath(CLASSIC.HAVE_BOMB, CLASSIC.HAVE_ICE, Align.topRight, 50));
    spawner.addSpawn(new CurvePath(CLASSIC.HAVE_BOMB, CLASSIC.HAVE_ICE, Align.topLeft, 50));
    spawner.addSpawn(new CurvePath(CLASSIC.HAVE_BOMB, CLASSIC.HAVE_ICE, Align.bottomRight, 50));
    spawner.addSpawn(new CurvePath(CLASSIC.HAVE_BOMB, CLASSIC.HAVE_ICE, Align.bottomLeft, 50));
  }

  @Override
  public void step(float delta, float sclDelta) {
    acc += sclDelta;
    if (acc > stepDuration) {
      acc = 0;
      spawnArray.clear();
      SpawnOutput po      = spawner.spawn(spawnInput, spawnArray);
      spawnInput.waveID   = po.waveID;
      stepDuration        = po.nextSpawnDuration;
      spawnInput.newWave  = po.isNewWave;
      engine.signalNewWave(spawnArray);
    }
    comboCalc.step(delta);
  }

  @Override
  public void onHit(ThrowEngine.HitContext ctx) {
    if (ctx.fruitType == Fruit.BOMB)
      remainLife--;
    if (ctx.fruitType < Fruit.N_FRUIT) {
      score += CLASSIC.SCORE_PER_HIT;
      comboCalc.onHit(ctx.swipeId);
    }
    if (remainLife <= 0) {
      engine.signalEndgame();
    }
  }

  @Override
  public void onUnderBound(ThrowEngine.HitContext ctx) {
    if (ctx.fruitType < Fruit.N_FRUIT)
      remainLife--;
    if (remainLife <= 0) {
      engine.signalEndgame();
    }
  }

  @Override
  public ThrowEngine.ClassicCtxInfo getContextInfo() {
    ctxInfo.remainLife = remainLife;
    ctxInfo.waveScore = score;
    ctxInfo.highScore = scoreRecorder.getHighScore();
    return ctxInfo;
  }

  @Override
  public void reset() {
    spawner.reset();
    acc = 0;
    remainLife = nLife;
    scoreRecorder.recordScore(score);
    score = 0;
    stepDuration = 1;
    spawnInput.waveID = -1;
    spawnInput.queue.clear();
  }
}
