package com.fruit.views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.DragListener;
import com.badlogic.gdx.utils.Array;
import com.fruit.swipe.SwipeHandler;
import com.fruit.swipe.mesh.SwipeTriStrip;

@SuppressWarnings("unused")
public class SwipeRenderer extends DragListener implements IRenderer {
  private Texture           tex;
  private SwipeTriStrip     tris;
  private SwipeHandler      swipe;
  private static final int MAX_INPUT_POINT = 10;
  private static final int MIN_DISTANCE = 10;
  private static final int MAX_DISTANCE = 10;
  private static final int TRIS_THICKNESS = 30;
  private int swipeCount = 0;
  private Array<SwipeListener> swipeListeners;

  public SwipeRenderer() {
    tris                  = new SwipeTriStrip();
    tex                   = new Texture("gradient.png");
    swipeListeners        = new Array<>();

    tex.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
    swipe = new SwipeHandler(MAX_INPUT_POINT);
    swipe.minDistance     = MIN_DISTANCE;
    swipe.initialDistance = MAX_DISTANCE;
  }

  public void addSwipeListener(SwipeListener listener) {
    if (listener != null)
      swipeListeners.add(listener);
  }

  public void removeSwipeListener(SwipeListener listener) {
    if (listener != null)
      swipeListeners.removeValue(listener, true);
  }

  @Override
  public void render(Batch batch, Camera cam) {
    cam.update();
    batch.setProjectionMatrix(cam.combined);
    Gdx.gl.glEnable(GL20.GL_BLEND);
    Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
    tex.bind();
    tris.thickness  = TRIS_THICKNESS;
    tris.update(swipe.path());
    tris.color      = new Color(1,1,1,0.5f);
    tris.draw(cam);
  }

  @Override
  public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
    swipe.touchUp(event, x, y, pointer, button);
    swipeCount++;
    super.touchUp(event, x, y, pointer, button);
  }

  @Override
  public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
    swipe.touchDown(event, x, y, pointer, button);
    return super.touchDown(event, x, y, pointer, button);
  }

  @Override
  public void touchDragged(InputEvent event, float x, float y, int pointer) {
    swipe.touchDragged(event, x, y, pointer);
    for (SwipeListener listener : swipeListeners) {
      SwipeContext ctx =  SwipeContext.newInst(swipe.path(), swipeCount, swipe.getSwipeDirection());
      listener.splash(ctx);
    }
    super.touchDragged(event, x, y, pointer);
  }

  public interface SwipeListener {
    void splash(SwipeContext ctx);
  }

  public static class SwipeContext {
    public Array<Vector2> swipePath;
    public int swipeId;
    public Vector2 swipeDirection;

    static SwipeContext newInst(Array<Vector2> swipePath, int swipeId, Vector2 swipeDirection) {
      SwipeContext ctx = new SwipeContext();
      ctx.swipeId = swipeId;
      ctx.swipePath = swipePath;
      ctx.swipeDirection = swipeDirection;
      return ctx;
    }
  }
}