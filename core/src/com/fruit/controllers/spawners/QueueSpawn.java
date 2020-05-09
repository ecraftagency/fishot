package com.fruit.controllers.spawners;

import static com.fruit.controllers.ThrowEngine.*;

public class QueueSpawn extends ConstantSpawn {

  public QueueSpawn(SpawnInfo spawnInfo) {
    super(spawnInfo);
  }

  @Override
  public void reset() {
    super.reset();
  }

  @Override
  public void prepareSubSpawner(Path spawner) {
    spawner.setSpawnDuration(si.stepDuration, si.finishDuration);
    spawner.setSpawnVelX(si.minVelX, si.maxVelX);
    spawner.setSpawnVelY(si.minVelY, si.maxVelY);
    spawner.setThrowSpeed(si.minThrowSpeed, si.maxThrowSpeed);
    spawner.setPad(si.padLeft, si.padRight);
    spawner.setAngularVel(si.minAngularVel, si.maxAngularVel);
    spawner.setBombRate(si.bombRate);
    spawner.setIceRate(si.iceRate);
    spawner.setSpawnCount(spawnInput.queue.size + 1, spawnInput.queue.size + 1, spawnInput.queue);
  }
}