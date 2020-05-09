package com.fruit.controllers.spawners;

import com.fruit.controllers.ThrowEngine;

public class SliceSpawn extends QueueSpawn {
  public SliceSpawn(ThrowEngine.SpawnInfo spawnInfo) {
    super(spawnInfo);
  }

  @Override
  public void reset() {
    super.reset();
  }

  @Override
  public void prepareSubSpawner(ThrowEngine.Path spawner) {
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
