package com.fruit.controllers;

import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Queue;
import static com.fruit.controllers.Const.*;

@SuppressWarnings("unused")
public class ThrowEngine {
  /************************************************************************************************/
  //delegates, listeners and composite interfaces
  public interface ThrowListener {
    void fruitWave(Array<ThrowInfo> fruitInfo);
    void engineStop();
    void comboOccur(int comboCount);
    void customEvent(Object ctxData);
  }

  public interface ComboLogic {
    void step(float dt);
    void onHit(int swipeId);
  }

  public interface ScoreRecorder {
    void  recordScore(int score);
    int   getHighScore();
  }

  public interface Path {
    float     spawn(Array<ThrowInfo> outputInfo);
    boolean   finishSpawning();
    void      reset();
    void      setSpawnCount(int min, int max, Queue<ThrowInfo> predefined);
    void      setSpawnVelX(float min, float max);
    void      setSpawnVelY(float min, float max);
    void      setSpawnDuration(float step, float finish);
    void      setThrowSpeed(float min, float max);
    void      setPad(float left, float right);
    void      setAngularVel(float min, float max);
    void      setBombRate(float bombRate);
    void      setIceRate(float iceRate);
    int       getPriority();
  }

  public interface SpawnLogic {
    SpawnOutput       spawn(SpawnInput inputData, Array<ThrowInfo> outputArray);
    void              addSpawn(Path path);
    void              reset();
  }

  public interface ModeLogic<T> {
    void step(float delta, float sclDelta);
    void onHit(HitContext ctx);
    void onUnderBound(HitContext ctx);
    T    getContextInfo();
    void reset();
  }

  /************************************************************************************************/

  private static  final     int                   STOP                = 0;
  private static  final     int                   RUNNING             = 1;
  private static  final     int                   PAUSE               = 2;
  private static  final   float                   TIME_SCALE          = 0.1f;
  private static  final   float                   SCALE_DURATION      = 3f;

  public static SpawnInfo classicSpawnInfo    = new SpawnInfo();
  public static SpawnInfo timingSpawnInfo     = new SpawnInfo();
  public static SpawnInfo queueSpawnInfo      = new SpawnInfo();
  public static SpawnInfo sliceSpawnInfo      = new SpawnInfo();

  private static          ThrowEngine             inst;

  private                 Array<ThrowListener>    throwListeners;
  private                 ModeLogic               spawnHandler;
  private                 float                   speed;
  private                 float                   timeScaleCounter    = 0;
  private                 float                   timeScaleDuration   = 0;
  private                 int                     state               = RUNNING;

  private ThrowEngine() {
    throwListeners    = new Array<>();
    spawnHandler      = new ModeLogic() {
      @Override
      public void step(float delta, float sclDelta) { }

      @Override
      public void onHit(HitContext ctx) { }

      @Override
      public void onUnderBound(HitContext ctx) { }

      @Override
      public Object getContextInfo() {
        return new Object();
      }

      @Override
      public void reset() { }
    };

    classicSpawnInfo.padLeft                  = CLASSIC.PAD_LEFT;
    classicSpawnInfo.padRight                 = CLASSIC.PAD_RIGHT;
    classicSpawnInfo.stepDuration             = CLASSIC.STEP_DURATION;
    classicSpawnInfo.finishDuration           = CLASSIC.FINISH_DURATION;
    classicSpawnInfo.stepDurationDecrease     = CLASSIC.STEP_DECREASE;
    classicSpawnInfo.minStepDecrease          = CLASSIC.MIN_STEP_DECREASE;
    classicSpawnInfo.minCount                 = CLASSIC.MIN_COUNT;
    classicSpawnInfo.maxCount                 = CLASSIC.MAX_COUNT;
    classicSpawnInfo.countIncrease            = CLASSIC.COUNT_INCREASE;
    classicSpawnInfo.maxCountIncrease         = CLASSIC.MAX_COUNT_INCREASE;
    classicSpawnInfo.minVelX                  = CLASSIC.MIN_VEL_X;
    classicSpawnInfo.maxVelX                  = CLASSIC.MAX_VEL_X;
    classicSpawnInfo.minVelY                  = CLASSIC.MIN_VEL_Y;
    classicSpawnInfo.maxVelY                  = CLASSIC.MAX_VEL_Y;
    classicSpawnInfo.minAngularVel            = CLASSIC.MIN_ANGULAR_VEL;
    classicSpawnInfo.maxAngularVel            = CLASSIC.MAX_ANGULAR_VEL;
    classicSpawnInfo.defaultY                 = CLASSIC.DEFAULT_Y;
    classicSpawnInfo.bombRate                 = CLASSIC.BOMB_RATE;
    classicSpawnInfo.bombRateIncrease         = CLASSIC.BOMB_RATE_INCREASE;
    classicSpawnInfo.maxBombRateIncrease      = CLASSIC.MAX_BOMB_RATE_INCREASE;
    classicSpawnInfo.iceRate                  = CLASSIC.ICE_RATE;
    classicSpawnInfo.minThrowSpeed            = CLASSIC.MIN_THROW_SPEED;
    classicSpawnInfo.maxThrowSpeed            = CLASSIC.MAX_THROW_SPEED;
    classicSpawnInfo.throwSpeedIncrease       = CLASSIC.THROW_SPEED_INCREASE;
    classicSpawnInfo.maxThrowSpeedIncrease    = CLASSIC.MAX_THROW_SPEED_INCREASE;


    timingSpawnInfo.padLeft                   = TIMING.PAD_LEFT;
    timingSpawnInfo.padRight                  = TIMING.PAD_RIGHT;
    timingSpawnInfo.stepDuration              = TIMING.STEP_DURATION;
    timingSpawnInfo.finishDuration            = TIMING.FINISH_DURATION;
    timingSpawnInfo.minCount                  = TIMING.MIN_COUNT;
    timingSpawnInfo.maxCount                  = TIMING.MAX_COUNT;
    timingSpawnInfo.minVelX                   = TIMING.MIN_VEL_X;
    timingSpawnInfo.maxVelX                   = TIMING.MAX_VEL_X;
    timingSpawnInfo.minVelY                   = TIMING.MIN_VEL_Y;
    timingSpawnInfo.maxVelY                   = TIMING.MAX_VEL_Y;
    timingSpawnInfo.minAngularVel             = TIMING.MIN_ANGULAR_VEL;
    timingSpawnInfo.maxAngularVel             = TIMING.MAX_ANGULAR_VEL;
    timingSpawnInfo.defaultY                  = TIMING.DEFAULT_Y;
    timingSpawnInfo.minThrowSpeed             = TIMING.MIN_THROW_SPEED;
    timingSpawnInfo.maxThrowSpeed             = TIMING.MAX_THROW_SPEED;

    queueSpawnInfo.padLeft                    = QUEUE.PAD_LEFT;
    queueSpawnInfo.padRight                   = QUEUE.PAD_RIGHT;
    queueSpawnInfo.stepDuration               = QUEUE.STEP_DURATION;
    queueSpawnInfo.finishDuration             = QUEUE.FINISH_DURATION;
    queueSpawnInfo.minVelX                    = QUEUE.MIN_VEL_X;
    queueSpawnInfo.maxVelX                    = QUEUE.MAX_VEL_X;
    queueSpawnInfo.minVelY                    = QUEUE.MIN_VEL_Y;
    queueSpawnInfo.maxVelY                    = QUEUE.MAX_VEL_Y;
    queueSpawnInfo.minAngularVel              = QUEUE.MIN_ANGULAR_VEL;
    queueSpawnInfo.maxAngularVel              = QUEUE.MAX_ANGULAR_VEL;
    queueSpawnInfo.defaultY                   = QUEUE.DEFAULT_Y;
    queueSpawnInfo.minThrowSpeed              = QUEUE.MIN_THROW_SPEED;
    queueSpawnInfo.maxThrowSpeed              = QUEUE.MAX_THROW_SPEED;

    sliceSpawnInfo.padLeft                    = SLICE.PAD_LEFT;
    sliceSpawnInfo.padRight                   = SLICE.PAD_RIGHT;
    sliceSpawnInfo.stepDuration               = SLICE.STEP_DURATION;
    sliceSpawnInfo.finishDuration             = SLICE.FINISH_DURATION;
    sliceSpawnInfo.stepDurationDecrease       = SLICE.STEP_DECREASE;
    sliceSpawnInfo.minStepDecrease            = SLICE.MIN_STEP_DECREASE;
    sliceSpawnInfo.minCount                   = SLICE.MIN_COUNT;
    sliceSpawnInfo.maxCount                   = SLICE.MAX_COUNT;
    sliceSpawnInfo.countIncrease              = SLICE.COUNT_INCREASE;
    sliceSpawnInfo.maxCountIncrease           = SLICE.MAX_COUNT_INCREASE;
    sliceSpawnInfo.minVelX                    = SLICE.MIN_VEL_X;
    sliceSpawnInfo.maxVelX                    = SLICE.MAX_VEL_X;
    sliceSpawnInfo.minVelY                    = SLICE.MIN_VEL_Y;
    sliceSpawnInfo.maxVelY                    = SLICE.MAX_VEL_Y;
    sliceSpawnInfo.minAngularVel              = SLICE.MIN_ANGULAR_VEL;
    sliceSpawnInfo.maxAngularVel              = SLICE.MAX_ANGULAR_VEL;
    sliceSpawnInfo.defaultY                   = SLICE.DEFAULT_Y;
    sliceSpawnInfo.bombRate                   = SLICE.BOMB_RATE;
    sliceSpawnInfo.bombRateIncrease           = SLICE.BOMB_RATE_INCREASE;
    sliceSpawnInfo.maxBombRateIncrease        = SLICE.MAX_BOMB_RATE_INCREASE;
    sliceSpawnInfo.iceRate                    = SLICE.ICE_RATE;
    sliceSpawnInfo.minThrowSpeed              = SLICE.MIN_THROW_SPEED;
    sliceSpawnInfo.maxThrowSpeed              = SLICE.MAX_THROW_SPEED;
    sliceSpawnInfo.throwSpeedIncrease         = SLICE.THROW_SPEED_INCREASE;
    sliceSpawnInfo.maxThrowSpeedIncrease      = SLICE.MAX_THROW_SPEED_INCREASE;
  }

  public static ThrowEngine inst() {
    if (inst == null)
      inst = new ThrowEngine();
    return inst;
  }

  //public signals
  public void step(float delta) {
    if (state == RUNNING) {
      timeScaleCounter += delta;
      spawnHandler.step(delta, delta*speed);
      if (timeScaleCounter >= timeScaleDuration) {
        speed = 1;
      }
    }
  }

  public void reset() {
    spawnHandler.reset();
    state = RUNNING;
    speed = 1;
    timeScaleCounter = 0;
    timeScaleDuration = 0;
  }

  public void clearListeners() {
    throwListeners.clear();
  }

  public void setSpawnHandler(ModeLogic spawnHandler) {
    this.spawnHandler = spawnHandler;
  }

  public void timeScale(float scl, float duration) {
    speed = scl;
    timeScaleCounter = 0;
    timeScaleDuration = duration;
  }

  public void addThrowListener(ThrowListener listener) {
    if (listener != null)
      throwListeners.add(listener);
  }

  public void signalDeadFruit(HitContext ctx) {
    if (state == RUNNING) {
      spawnHandler.onUnderBound(ctx);
    }
  }

  public void signalHitFruit(HitContext ctx) {
    if (state == RUNNING) {
      spawnHandler.onHit(ctx);
    }
  }

  public Object getContextInfo() {
    return spawnHandler.getContextInfo();
  }

  public void signalCombo(int count) {
    if (state == RUNNING) {
      for (ThrowListener listener : throwListeners)
        listener.comboOccur(count);
    }
  }

  //private signals
  void signalNewWave(Array<ThrowInfo> fruitInfo) {
    for (ThrowListener listener : throwListeners)
      listener.fruitWave(fruitInfo);
  }

  void signalEndgame() {
    state = STOP;
    for (ThrowListener listener : throwListeners)
      listener.engineStop();
  }

  void signalCustomEvent(Object ctxData) {
    for (ThrowListener listener : throwListeners) {
      listener.customEvent(ctxData);
    }
  }

  /************************************************************************************************/
  //fruit data
  public static class ThrowInfo {
    public int    type;
    public float  x;
    public float  y;
    public float  velX;
    public float  velY;
    public float  throwSpeed;
    public float  angularVel;
  }

  /************************************************************************************************/
  //event context
  public static class HitContext {
    public int fruitType;
    public int swipeId;
    public static HitContext inst(int fruitId, int swipeId) {
      HitContext r = new HitContext();
      r.fruitType = fruitId;
      r.swipeId = swipeId;
      return r;
    }
  }

  /************************************************************************************************/
  //context data model
  public static class ClassicCtxInfo {
    public int waveScore;
    public int highScore;
    public int remainLife;
  }

  public static class OrderCtxInfo {
    public int waveScore;
    public int highScore;
  }

  public static class TimingCtxInfo {
    public float secondLeft;
    public int   score;
    public int   highScore;
  }

  public static class SliceCtxInfo {
    public int    currentStage;
    public int    bestStage;
    public int    currentWave;
    public float  remainTime;
  }

  public static class SliceCustomEvent {
    public int id;
    public Queue<ThrowInfo> fruitPath;
    public int nextStageNumber;
    public int waveNumber;
  }


  /************************************************************************************************/
  //spawn data

  public static class SpawnOutput {
    public float    nextSpawnDuration;
    public int      waveID;
    public boolean  isNewWave = false;
  }

  public static class SpawnInput {
    public int                waveID;
    public Queue<ThrowInfo>   queue;
    public boolean            newWave = false;
  }

  public static class SpawnInfo {
    public float    padLeft;
    public float    padRight;
    public float    stepDuration;
    public float    finishDuration;
    public float    stepDurationDecrease;
    public float    minStepDecrease;
    public int      minCount;
    public int      maxCount;
    public float    countIncrease;
    public float    maxCountIncrease;
    public float    minVelX;
    public float    maxVelX;
    public float    minVelY;
    public float    maxVelY;
    public float    minAngularVel;
    public float    maxAngularVel;
    public float    defaultY;
    public float    bombRate;
    public float    bombRateIncrease;
    public float    maxBombRateIncrease;
    public float    iceRate;
    public float    minThrowSpeed;
    public float    maxThrowSpeed;
    public float    throwSpeedIncrease;
    public float    maxThrowSpeedIncrease;
  }
}
