package com.fruit.controllers.spawners.composite;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Queue;
import com.fruit.FruitGame;
import com.fruit.controllers.ThrowEngine;
import com.fruit.pool_objects.Fruit;

import static com.fruit.controllers.Const.*;

public class MixPath implements ThrowEngine.Path {
  int                             spawned             = 0;
  int                             spawnCount          = 1;
  float                           minVelX             = 0;
  float                           maxVelX             = 400;
  float                           minVelY             = 800;
  float                           maxVelY             = 1100;
  float                           minThrowSpeed       = 0.9f;
  float                           maxThrowSpeed       = 1.1f;
  float                           stepDuration        = 0.5f;
  float                           finishDuration      = 2f;
  float                           minX                = 200;
  float                           maxX                = 1000;
  float                           minAngularVel       = 100;
  float                           maxAngularVel       = 200;
  boolean                         haveBomb;
  boolean                         haveIce;
  float                           bombRate            = 200;
  float                           iceRate             = 200;
  int                             percent;
  Array<Integer>                  waveDefine;

  ThrowEngine.ThrowInfo ti = new ThrowEngine.ThrowInfo();

  public MixPath(boolean haveBomb, boolean haveIce, int percent) {
    this.haveBomb   = haveBomb;
    this.haveIce    = haveIce;
    this.percent    = percent;
    waveDefine      = new Array<>();
  }

  @Override
  public boolean finishSpawning() {
    return spawned >= spawnCount;
  }

  @Override
  public float spawn(Array<ThrowEngine.ThrowInfo> outputInfo) {
    if (spawned < waveDefine.size)
      ti.type = waveDefine.get(spawned);
    else
      ti.type = MathUtils.random(0, Fruit.N_FRUIT - 1);
    ti.x = MathUtils.random(minX, maxX);
    ti.y = CLASSIC.DEFAULT_Y;
    ti.velX = MathUtils.random(minVelX, maxVelX);
    ti.velY = MathUtils.random(minVelY, maxVelY);
    ti.throwSpeed = MathUtils.random(minThrowSpeed, maxThrowSpeed);
    spawned++;
    outputInfo.add(ti);

    ti.angularVel = MathUtils.random(minAngularVel, maxAngularVel);

    if (haveIce) {
      float r = MathUtils.random(0f, 10000f);
      if (iceRate > r)
        ti.type = Fruit.ICE;
    }

    if (haveBomb) {
      float r = MathUtils.random(0f, 10000f);
      if (bombRate > r)
        ti.type = Fruit.BOMB;
    }

    if (ti.x > FruitGame.renderer.getWidth()/2) {
      ti.velX *= -1;
      ti.angularVel *= -1;
    }

    if (spawned >= spawnCount)
      return finishDuration;
    return stepDuration;
  }

  @Override
  public void reset() {
    spawned = 0;
    spawnCount = 1;
    minVelX = 0;
    maxVelX = 0;
    minVelY = 0;
    maxVelY = 0;
    stepDuration = 0.5f;
    finishDuration = 2f;
    minThrowSpeed = 0.9f;
    maxThrowSpeed = 1.1f;
    minX = 200;
    maxX = 1000;
    minAngularVel = 100;
    maxAngularVel = 200;
  }

  @Override
  public void setSpawnCount(int min, int max, Queue<ThrowEngine.ThrowInfo> predefined) {
    spawnCount = MathUtils.random(min, max);
    waveDefine.clear();
    if (spawnCount > predefined.size) {
      int rElem = spawnCount - predefined.size;
      for (int i = 0; i < rElem; i++)
        waveDefine.add(MathUtils.random(0, Fruit.N_FRUIT - 1));
    }
    for (ThrowEngine.ThrowInfo info : predefined)
      waveDefine.add(info.type);
    waveDefine.shuffle();
  }

  @Override
  public void setSpawnVelX(float min, float max) {
    minVelX = min;
    maxVelX = max;
  }

  @Override
  public void setSpawnVelY(float min, float max) {
    minVelY = min;
    maxVelY = max;
  }

  @Override
  public void setSpawnDuration(float step, float finish) {
    stepDuration = step;
    finishDuration = finish;
  }

  @Override
  public void setThrowSpeed(float min, float max) {
    minThrowSpeed = min;
    maxThrowSpeed = max;
  }

  @Override
  public void setPad(float left, float right) {
    minX = left;
    maxX = FruitGame.renderer.getWidth() + right;
  }

  @Override
  public void setAngularVel(float min, float max) {
    minAngularVel = min;
    maxAngularVel = max;
  }

  @Override
  public void setBombRate(float bombRate) {
    this.bombRate = bombRate;
  }

  @Override
  public void setIceRate(float iceRate) {
    this.iceRate = iceRate;
  }

  @Override
  public int getPriority() {
    return percent;
  }
}
