package com.fruit.views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.SnapshotArray;
import com.fruit.Const;
import com.fruit.FruitGame;
import static com.fruit.controllers.ThrowEngine.*;

import com.fruit.pool_objects.Fruit;
import com.fruit.pool_objects.IPAction;

public class FruitLayer extends Group
implements SwipeRenderer.SwipeListener, ThrowListener, ItemResolver {
  private static       Vector2  point     = new Vector2(0,0);

  private static final float    FRUIT_SCALE           = 0.5f;
  private static final float    DEADLINE              = -230;
  private static final float    ICE_TIME_SCALE        = 0.1f;
  private static final float    TIME_SCALE_DURATION   = 3f;

  private Array<EventListener>  eventListeners;
  private float                 speed                 = 1;
  private float                 timeScaleDuration     = TIME_SCALE_DURATION;

  public FruitLayer() {
    setHeight(FruitGame.renderer.getHeight());
    setWidth(FruitGame.renderer.getWidth());

    eventListeners = new Array<>();
    setDebug(FruitGame.DEBUG);
  }

  public void addHitListener(EventListener listener) {
    if (listener != null)
      eventListeners.add(listener);
  }

  private float acc;
  private float time_scale_counter;
  @Override
  public void act(float delta) {
    if (FruitGame.DEBUG) {
      acc += delta;
      if (acc >= 1) {
        acc = 0;
        Gdx.app.log("Fruit renderer children: ", getChildren().size + "");
      }
    }

    for (Actor actor : getChildren()) {
      if (actor.getY() < DEADLINE) {
        Fruit fruit = (Fruit)actor;
        inst().signalDeadFruit(HitContext.inst(fruit.getType(), -1));
        for (EventListener listener : eventListeners)
          listener.onOutOfBound(fruit);
        removeFruit(fruit);
      }
    }

    time_scale_counter += delta;
    if (time_scale_counter >= timeScaleDuration)
      speed = 1;
    super.act(delta*speed);
  }

  @Override
  public void splash(SwipeRenderer.SwipeContext ctx) {
    if (ctx.swipePath == null || ctx.swipePath.size == 0 || ctx.swipeDirection == null)
      return;
    Vector2 hitPoint = ctx.swipePath.get(0);

    for (Actor actor : getChildren()) {
      Fruit fruit = (Fruit)actor;
      if (fruit.getBound().contains(point.set((int)hitPoint.x, (int)hitPoint.y))) {
        if (fruit.getType() == Fruit.ICE){
          speed = ICE_TIME_SCALE;
          time_scale_counter = 0;
          inst().timeScale(speed, TIME_SCALE_DURATION);
        }
        inst().signalHitFruit(HitContext.inst(fruit.getType(), ctx.swipeId));
        for (EventListener listener : eventListeners)
          listener.onHit(fruit, ctx);
        removeFruit(fruit);
      }
    }
  }

  private void removeFruit(Fruit fruit) {
    removeActor(fruit);
    Fruit.free(fruit);
  }

  @Override
  protected void drawDebugBounds(ShapeRenderer sr) {
    if (!getDebug())
      return;
    for (Actor actor : getChildren()) {
      Fruit fruit = (Fruit)actor;
      Rectangle bound = fruit.getBound();
      sr.end();
      sr.begin(ShapeRenderer.ShapeType.Line);
      sr.setProjectionMatrix(FruitGame.renderer.getCamera().combined);
      sr.rect(bound.getX(), bound.getY(), bound.getWidth(), bound.getHeight());
    }
  }

  @Override
  public void fruitWave(Array<ThrowInfo> fruitInfo) {
    for (ThrowInfo fi : fruitInfo) {
      Fruit fruit = Fruit.obtain(fi.type);
      fruit.setPosition(fi.x, fi.y);
      addActor(fruit);
      fruit.setScale(FRUIT_SCALE);
      IPAction throwAction = IPAction.obtain(fi.x, fi.y, fi.velX, fi.velY,
              fi.throwSpeed, fi.angularVel);
      fruit.setThrowAction(throwAction);
      fruit.addAction(throwAction);
    }
  }

  @Override
  public void engineStop() {
    Gdx.app.postRunnable(() -> {
      SnapshotArray<Actor> actors = getChildren();
      clear();
      for (Actor actor : actors)
        removeFruit((Fruit) actor);
    });
  }

  @Override
  public void comboOccur(int comboCount) {

  }

  @Override
  public void customEvent(Object ctxData) {

  }

  @Override
  public void onItemCast(int itemID) {
    if (itemID == Const.ITEM.ICE) {
      speed = Const.ITEM.ICE_SCALE;
      time_scale_counter = 0;
      inst().timeScale(speed, Const.ITEM.ICE_SCALE_DURATION);
    }
  }

  /************************************************************************************************/
  public interface EventListener {
    void onHit(Fruit fruit, SwipeRenderer.SwipeContext ctx);
    void onOutOfBound(Fruit fruit);
  }
}