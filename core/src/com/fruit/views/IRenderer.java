package com.fruit.views;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.g2d.Batch;

public interface IRenderer {
  void render(Batch batch, Camera cam);
}
