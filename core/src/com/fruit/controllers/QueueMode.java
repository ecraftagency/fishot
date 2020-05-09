package com.fruit.controllers;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Queue;
import com.fruit.controllers.composite.SimpleScoreRecorder;
import com.fruit.controllers.spawners.QueueSpawn;
import com.fruit.controllers.spawners.composite.MixPath;
import com.fruit.pool_objects.Fruit;
import static com.fruit.controllers.ThrowEngine.*;
import static com.fruit.controllers.Const.*;

public class QueueMode implements ModeLogic<ClassicCtxInfo> {

  private ThrowEngine                   engine;
  private float                         acc;
  private float                         queueAcc;
  private float                         waveDuration        = 1;
  private float                         queueDuration       = 0;
  private float                         queueSpeed          = 1;
  private float                         speedSclDuration    = 1;
  private float                         speedSclCounter     = 0;
  private ClassicCtxInfo                ctxInfo;
  private Queue<ThrowInfo> fruitQueue;
  private float                         deadCounter         = 0;
  private boolean                       dead                = false;
  private float                         alertCounter        = 0;
  private int                           score               = 0;
  private Array<ThrowInfo>              spawnArray          = new Array<>();
  private SpawnLogic                    spawner;
  private SpawnInput                    spawnInput;
  private ScoreRecorder                 scoreRecorder;

  public QueueMode(ThrowEngine engine) {
    this.engine         = engine;
    ctxInfo             = new ClassicCtxInfo();
    fruitQueue          = new Queue<>();
    spawner             = new QueueSpawn(queueSpawnInfo);
    spawnInput          = new SpawnInput();
    spawnInput.waveID   = -1;
    spawnInput.queue    = new Queue<>();

    spawner.addSpawn(new MixPath(false, false, 1000));
    spawnInput.queue    = fruitQueue;
    scoreRecorder       = new SimpleScoreRecorder(PREF_KEYS.QUEUE_HIGH_SCORE);
  }

  @Override
  public void step(float delta, float sclDelta) {
    acc += sclDelta;
    queueAcc += sclDelta*queueSpeed;
    speedSclCounter += sclDelta;

    if (speedSclCounter >= speedSclDuration) {
      queueSpeed = 1;
      engine.signalCustomEvent(queueSpeed);
    }

    if (acc > waveDuration) {
      acc = 0;
      spawnArray.clear();
      SpawnOutput po        = spawner.spawn(spawnInput, spawnArray);
      spawnInput.waveID     = po.waveID;
      waveDuration          = po.nextSpawnDuration;
      spawnInput.newWave    = po.isNewWave;
      engine.signalNewWave(spawnArray);
    }

    if (dead) {
      deadCounter += sclDelta;
      alertCounter += sclDelta;
      if (deadCounter >= QUEUE.DEAD_DELAY) {
        engine.signalEndgame();
      }
      if (alertCounter > 1f) {
        alertCounter = 0;
        engine.signalCustomEvent(0);
      }
    }

    if (queueAcc > queueDuration) {
      queueDuration = QUEUE.QUEUE_IN_DURATION;
      queueAcc = 0;
      if (fruitQueue.size < QUEUE.MAX_QUEUE_CAPACITY) {
        ThrowInfo fruitInfo = new ThrowInfo();
        fruitInfo.type = MathUtils.random(0, Fruit.N_FRUIT - 1);
        fruitQueue.addLast(fruitInfo);
        engine.signalCustomEvent(fruitInfo);

        if (fruitQueue.size >= QUEUE.MAX_QUEUE_CAPACITY) {
          deadCounter = 0;
          alertCounter = 0;
          dead = true;
        }
        else {
          dead = false;
        }
      }
    }
  }

  @Override
  public void onHit(HitContext ctx) {
    boolean hit = false;
    if (fruitQueue.size > 0) {
      ThrowInfo first = fruitQueue.get(0);
      if (ctx.fruitType == first.type) {
        hit = true;
        fruitQueue.removeFirst();
        engine.signalCustomEvent(ctx);
        score += QUEUE.SCORE_PER_HIT;
      }
    }

    if (!hit) {
      queueSpeed = QUEUE.QUEUE_SPEED_SCALE;
      speedSclDuration = QUEUE.QUEUE_SPEED_SCALE_DURATION;
      speedSclCounter = 0;
      engine.signalCustomEvent(queueSpeed);
    }
  }

  @Override
  public void onUnderBound(HitContext ctx) {

  }

  @Override
  public ClassicCtxInfo getContextInfo() {
    ctxInfo.highScore = scoreRecorder.getHighScore();
    ctxInfo.waveScore = score;
    return ctxInfo;
  }

  @Override
  public void reset() {
    fruitQueue.clear();
    scoreRecorder.recordScore(score);
    acc = 0;
    queueAcc = 0;
    speedSclDuration = 1;
    queueSpeed = 1;
    queueDuration = 0;
    speedSclDuration = 0;
    speedSclCounter = 0;
    dead = false;
    deadCounter = 0;
    score = 0;
    spawner.reset();
  }
}