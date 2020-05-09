package com.fruit.views.components;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.fruit.AssetLoader;
import com.fruit.FruitGame;
import com.fruit.controllers.ThrowEngine;
import com.fruit.pool_objects.Fruit;

import java.util.HashMap;

public class FruitRoller extends Group {
  private static final  String rollerKey                      = "fruit_queue";
  private static final  float  clipX                          = 47;
  private static final  float  clipY                          = 19;

  private static        HashMap<Integer, String> fruitKeys;

  private ClipArea  clipArea;
  private Image     pane;

  static {
    fruitKeys = new HashMap<>();
    fruitKeys.put(0, "fruit_banana");
    fruitKeys.put(1, "fruit_orange");
    fruitKeys.put(2, "fruit_grape");
    fruitKeys.put(3, "fruit_watermelon");
  }

  public FruitRoller() {
    pane = new Image(AssetLoader.getTextureRegion(rollerKey));
    clipArea = new ClipArea(true);
    clipArea.setPosition(clipX, clipY);
    addActor(pane);
    addActor(clipArea);
  }

  public void addFruit(ThrowEngine.ThrowInfo info) {
    Image fruit = new Image(AssetLoader.getTextureRegion(fruitKeys.get(info.type% Fruit.N_FRUIT)));
    fruit.setUserObject(info);
    fruit.setPosition(360, 0);
    fruit.setScale(0.2f);
    clipArea.addActor(fruit);
  }

  public void removeFruit(ThrowEngine.HitContext info) {
    Gdx.app.postRunnable(() -> {
      for (Actor actor : clipArea.getChildren()){
        ThrowEngine.ThrowInfo fruitInfo = (ThrowEngine.ThrowInfo)actor.getUserObject();
        if (fruitInfo.type == info.fruitType) {
          clipArea.removeActor(actor);
          return;
        }
      }
    });
  }

  public void alert() {
    Color c = pane.getColor();
    pane.addAction(Actions.sequence(
            Actions.color(Color.RED, 0.25f),
            Actions.color(c, 0)
    ));
  }

  public void clearFruit() {
    clipArea.clear();
  }

  public void setRollSpeed(float speed) {
    clipArea.setRollSpeed(speed);
  }

  static class ClipArea extends Group {
    private static final float ROLL_PER_FRAME = -2;
    public float rollSpeed = 1;
    private boolean roll;

    ClipArea(boolean roll) {
      setHeight(60);
      setWidth(360);
      this.roll = roll;
    }

    public void setRollSpeed(float rollSpeed) {
      this.rollSpeed = rollSpeed;
    }

    @Override
    public void act(float delta) {
      super.act(delta);
      if (roll) {
        for (int i = 0; i < getChildren().size; i++) {
          Actor a = getChild(i);
          float baseX = 60*i;
          float currentX = a.getX();
          if (currentX > baseX) {
            float dx = ROLL_PER_FRAME * rollSpeed;

            if ((a.getX() + dx) < baseX)
              a.setX(baseX);
            else
              a.setX(a.getX() + dx);
          }
        }
      }
    }

    private static Vector3 xyProj = new Vector3();
    private static Vector3 hwProj = new Vector3();
    @Override
    public void draw(Batch batch, float parentAlpha) {
      Actor     p     = getParent();
      float     scl   = this.getScaleX()*p.getScaleX();
      float     clipX = getX()*scl + p.getX();
      float     clipY = getY()*scl + p.getY();
      float     clipW = getWidth()*scl;
      float     clipH = getHeight()*scl;

      batch.end();
      Gdx.gl.glEnable(GL20.GL_SCISSOR_TEST);
      Vector3 xy = FruitGame.renderer.getCamera().project(xyProj.set(clipX, clipY, 0));
      Vector3 wh = FruitGame.renderer.getCamera().project(hwProj.set(clipW, clipH, 0));
      Gdx.gl.glScissor((int)xy.x, (int)xy.y, (int)wh.x, (int)wh.y);
      batch.begin();
      super.draw(batch, parentAlpha);
      batch.end();
      Gdx.gl.glDisable(GL20.GL_SCISSOR_TEST);
      batch.begin();

    }
  }
}
