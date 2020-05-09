package com.fruit.controllers.spawners;

import static com.fruit.controllers.ThrowEngine.*;

public class LinearSpawn extends ConstantSpawn {
  private float       stepDurationDec = 0;
  private float       countInc = 0;
  private float       bombRateInc = 0;
  private float       throwSpeedInc = 0;

  public LinearSpawn(SpawnInfo spawnInfo) {
    super(spawnInfo);
  }

  @Override
  public void prepareSubSpawner(Path spawner) {
    stepDurationDec += si.stepDurationDecrease;
    if (stepDurationDec <= si.minStepDecrease)
      stepDurationDec = si.minStepDecrease;

    countInc += si.countIncrease;
    if (countInc >= si.maxCountIncrease)
      countInc = si.maxCountIncrease;

    bombRateInc += si.bombRateIncrease;
    if (bombRateInc >= si.maxBombRateIncrease)
      bombRateInc = si.maxBombRateIncrease;

    throwSpeedInc += si.throwSpeedIncrease;
    if (throwSpeedInc >= si.maxThrowSpeedIncrease)
      throwSpeedInc = si.maxThrowSpeedIncrease;

    spawner.setSpawnDuration(si.stepDuration + stepDurationDec, si.finishDuration);
    spawner.setSpawnVelX(si.minVelX, si.maxVelX);
    spawner.setSpawnVelY(si.minVelY, si.maxVelY);
    spawner.setThrowSpeed(si.minThrowSpeed + throwSpeedInc, si.maxThrowSpeed + throwSpeedInc);
    spawner.setPad(si.padLeft, si.padRight);
    spawner.setAngularVel(si.minAngularVel, si.maxAngularVel);
    spawner.setBombRate(si.bombRate + bombRateInc);
    spawner.setIceRate(si.iceRate);
    spawner.setSpawnCount(si.minCount + (int)countInc, si.maxCount + (int)countInc, spawnInput.queue);
  }

  @Override
  public void reset() {
    super.reset();
    stepDurationDec = 0;
    countInc = 0;
    bombRateInc = 0;
    throwSpeedInc = 0;
  }
}
