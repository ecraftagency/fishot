package com.fruit.views.components;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Queue;
import com.fruit.AssetLoader;
import com.fruit.controllers.ThrowEngine;
import com.fruit.pool_objects.Fruit;

import java.util.HashMap;

public class FruitRollerV extends Group {
  private static final  String rollerKey                      = "fruit_queue";
  private static final  float  clipX                          = 47;
  private static final  float  clipY                          = 19;

  private static HashMap<Integer, String> fruitKeys;

  private FruitRoller.ClipArea clipArea;
  private Image pane;
  Array<Actor> current;


  static {
    fruitKeys = new HashMap<>();
    fruitKeys.put(0, "fruit_banana");
    fruitKeys.put(1, "fruit_orange");
    fruitKeys.put(2, "fruit_grape");
    fruitKeys.put(3, "fruit_watermelon");
  }

  public FruitRollerV() {
    pane = new Image(AssetLoader.getTextureRegion(rollerKey));
    clipArea = new FruitRoller.ClipArea(false);
    clipArea.setPosition(clipX, clipY);
    addActor(pane);
    addActor(clipArea);
    current = new Array<>();
  }


  public void addFruit(Queue<ThrowEngine.ThrowInfo> infos) {
    for (Actor actor : clipArea.getChildren()) {
      actor.addAction(Actions.sequence(
              Actions.moveTo(actor.getX(), -60, 0.7f, Interpolation.fastSlow),
              Actions.run(() -> clipArea.removeActor(actor))
      ));
    }

    int step = 60;
    int start = 5*step;
    for (ThrowEngine.ThrowInfo info : infos) {
      Image fruit = new Image(AssetLoader.getTextureRegion(fruitKeys.get(info.type% Fruit.N_FRUIT)));
      fruit.setUserObject(info);
      fruit.setPosition(start, 60);
      fruit.setScale(0.2f);
      clipArea.addActor(fruit);
      start -= step;
      fruit.addAction(Actions.moveTo(fruit.getX(), 0, 0.7f, Interpolation.fastSlow));
    }
  }

  public void alert() {
    Color c = pane.getColor();
    pane.addAction(Actions.sequence(
            Actions.color(Color.RED, 0.25f),
            Actions.color(c, 0)
    ));
  }
}
