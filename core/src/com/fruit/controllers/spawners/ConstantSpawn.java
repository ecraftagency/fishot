package com.fruit.controllers.spawners;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.Array;
import static com.fruit.controllers.ThrowEngine.*;

public class ConstantSpawn implements SpawnLogic {
  Array<Path>    spawners          = new Array<>();
  Path currentSpawner;
  SpawnInfo       si;
  SpawnInput      spawnInput;

  public ConstantSpawn(SpawnInfo spawnInfo) {
    this.si = spawnInfo;
  }

  @Override
  public SpawnOutput spawn(SpawnInput inputData, Array<ThrowInfo> outputArray) {
    if (spawners.size == 0)
      return new SpawnOutput();

    int waveID    = inputData.waveID;
    spawnInput    = inputData;

    if (waveID == -1) { // very first
      int spawnID = getNextSpawner();
      currentSpawner = spawners.get(spawnID);
      prepareSubSpawner(currentSpawner);
      float next = currentSpawner.spawn(outputArray);
      SpawnOutput po = new SpawnOutput();
      po.nextSpawnDuration = next;

      if (po.isNewWave = currentSpawner.finishSpawning()) {
        currentSpawner.reset();
        spawnID = getNextSpawner();
        currentSpawner = spawners.get(spawnID);
        po.waveID = spawnID;
      }

      po.waveID = spawnID;
      return po;
    }
    else {

      if (spawnInput.newWave) {
        prepareSubSpawner(currentSpawner);
        spawnInput.newWave = false;
      }

      waveID %= spawners.size;
      float next = spawners.get(waveID).spawn(outputArray);
      SpawnOutput po = new SpawnOutput();
      int spawnID = waveID;
      po.nextSpawnDuration = next;
      po.isNewWave = false;
      if (po.isNewWave = currentSpawner.finishSpawning()) {
        currentSpawner.reset();
        spawnID = getNextSpawner();
        currentSpawner = spawners.get(spawnID);
      }
      po.waveID = spawnID;
      return po;
    }
  }

  @Override
  public void addSpawn(Path path) {
    spawners.add(path);
  }

  public int getNextSpawner() {
    int r = MathUtils.random(0, 1000);
    int acc = 0;
    for (int i = 0; i < spawners.size; i++) {
      acc += spawners.get(i).getPriority();
      if (acc >= r)
        return i;
    }
    return 0;
  }

  public void prepareSubSpawner(Path spawner) {
    spawner.setSpawnDuration(si.stepDuration, si.finishDuration);
    spawner.setSpawnVelX(si.minVelX, si.maxVelX);
    spawner.setSpawnVelY(si.minVelY, si.maxVelY);
    spawner.setThrowSpeed(si.minThrowSpeed, si.maxThrowSpeed);
    spawner.setPad(si.padLeft, si.padRight);
    spawner.setAngularVel(si.minAngularVel, si.maxAngularVel);
    spawner.setBombRate(si.bombRate);
    spawner.setIceRate(si.iceRate);
    spawner.setSpawnCount(si.minCount, si.maxCount, spawnInput.queue);
  }

  @Override
  public void reset() {
  }
}