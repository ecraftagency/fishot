package com.fruit.controllers.spawners.paths;

import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Queue;
import com.fruit.controllers.ThrowEngine;

public class WavePath extends MixPath {
  float distance = 100;
  boolean noDelay = false;

  public WavePath(boolean haveBomb, boolean haveIce, boolean noDelay, int percent) {
    super(haveBomb, haveIce, percent);
    this.noDelay = noDelay;
  }

  @Override
  public float spawn(Array<ThrowEngine.ThrowInfo> outputInfo) {
    float res = super.spawn(outputInfo);
    ti.velX = 0;
    ti.x = (spawned-1)*distance;

    if (noDelay && spawned < spawnCount)
      return 0f;
    else
      return res;
  }

  @Override
  public void reset() {
    super.reset();
    distance = 100;
  }

  @Override
  public void setSpawnCount(int min, int max, Queue<ThrowEngine.ThrowInfo> predefined) {
    super.setSpawnCount(min, max, predefined);
    float range = this.maxX - this.minX;
    distance = range/spawnCount;
  }
}
