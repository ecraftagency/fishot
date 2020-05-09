package com.fruit.controllers.spawners.paths;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.Array;
import com.fruit.FruitGame;
import com.fruit.controllers.ThrowEngine;

public class CurvePath extends MixPath {
  private int align;
  public CurvePath(boolean haveBomb, boolean haveIce, int align, int percent) {
    super(haveBomb, haveIce, percent);
    this.align = align;
  }
  @Override
  public float spawn(Array<ThrowEngine.ThrowInfo> outputInfo) {
    float res = super.spawn(outputInfo);
    if (align == Align.topLeft) {
      ti.velX = MathUtils.random(500, 700);
      ti.velY = 100;
      ti.y = FruitGame.renderer.getHeight() - 210;
      ti.x = -210;
    }
    else if (align == Align.bottomLeft) {
      ti.velX = MathUtils.random(500, 700);
      ti.x = -210;
      ti.y = -210;
    }
    else if (align == Align.bottomRight) {
      ti.velX = -1*MathUtils.random(500, 700);
      ti.x = FruitGame.renderer.getWidth();
      ti.y = -210;
    }
    else {
      ti.velX = -1*MathUtils.random(500, 700);
      ti.velY = 100;
      ti.y = FruitGame.renderer.getHeight() - 210;
      ti.x = FruitGame.renderer.getWidth();
    }

    return res;
  }
}
