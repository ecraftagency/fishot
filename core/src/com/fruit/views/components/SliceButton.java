package com.fruit.views.components;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.Align;
import com.fruit.AssetLoader;
import com.fruit.FruitGame;
import com.fruit.Const;
import com.fruit.pool_objects.Fruit;
import com.fruit.pool_objects.IPAction;
import com.fruit.views.SwipeRenderer;

import java.util.HashMap;

public class SliceButton extends Group {
  static HashMap<Integer, TextureRegion> fruitLeftTex   = new HashMap<>();
  static HashMap<Integer, TextureRegion> fruitRightTex  = new HashMap<>();
  static int N_ICON  = 5;

  Image holder;
  public Fruit fruit;
  Label text;
  Sound click;
  SlashHandler slashHandler;

  private static final String clickSndKey = "button";
  private static final String holderKey   = "fruit_button";
  private static final float  fruitScl    = 0.7f;
  private static final float  textY       = -100f;

  public SliceButton(int fruitID, String txt, SlashHandler slashHandler, boolean haveHolder) {

    fruitLeftTex.put(0, AssetLoader.getTextureRegion("fruit_banana_left"));
    fruitLeftTex.put(1, AssetLoader.getTextureRegion("fruit_orange_left"));
    fruitLeftTex.put(2, AssetLoader.getTextureRegion("fruit_grape_left"));
    fruitLeftTex.put(3, AssetLoader.getTextureRegion("fruit_watermelon_left"));
    fruitLeftTex.put(4, AssetLoader.getTextureRegion("fruit_wheel_left"));

    fruitRightTex.put(0, AssetLoader.getTextureRegion("fruit_banana_right"));
    fruitRightTex.put(1, AssetLoader.getTextureRegion("fruit_orange_right"));
    fruitRightTex.put(2, AssetLoader.getTextureRegion("fruit_grape_right"));
    fruitRightTex.put(3, AssetLoader.getTextureRegion("fruit_watermelon_right"));
    fruitRightTex.put(4, AssetLoader.getTextureRegion("fruit_wheel_right"));

    this.slashHandler = slashHandler;
    click = AssetLoader.getSound(clickSndKey);
    TextureRegion holderTG = AssetLoader.getTextureRegion(holderKey);
    holder = new Image(holderTG);
    holder.setOrigin(Align.center);
    holder.setWidth(holderTG.getRegionWidth());
    holder.setHeight(holderTG.getRegionHeight());

    holder.addAction(new Action() {
      private float acc;
      @Override
      public boolean act(float delta) {
        acc += delta;
        actor.setRotation(-acc*20);
        return false;
      }
    });
    holder.setVisible(haveHolder);
    addActor(holder);

    setWidth(holder.getWidth());
    setHeight(holder.getHeight());
    setOrigin(Align.center);

    fruit = Fruit.obtain(fruitID%N_ICON);
    fruit.setScale(fruitScl);
    fruit.setOrigin(Align.center);
    addActor(fruit);
    float y = (getHeight() - fruit.getHeight())/2;
    float x = (getWidth() - fruit.getWidth())/2;
    fruit.setPosition(x, y);
    fruit.addAction(new Action() {
      float acc;
      @Override
      public boolean act(float delta) {
        acc += delta;
        actor.setRotation(50*acc);
        return false;
      }
    });

    Label.LabelStyle ls = new Label.LabelStyle();
    ls.font = FruitGame.go380;
    text = new Label(txt, ls);
    text.setOrigin(Align.center);
    addActor(text);
    x = (getWidth() - text.getWidth())/2;
    text.setPosition(x, textY);
  }

  public void onSplash(SwipeRenderer.SwipeContext ctx) {
    fruit.getBound().set(0,0,0,0);
    fruit.setVisible(false);

    TextureRegion left = fruitLeftTex.get(fruit.getType());
    TextureRegion right = fruitRightTex.get(fruit.getType());

    Image leftPart = new Image(new TextureRegionDrawable(left));
    Image rightPart = new Image(new TextureRegionDrawable(right));

    float angle  = ctx.swipeDirection.angle()%180;
    float sine   = MathUtils.sinDeg(angle%90);
    float cos    = MathUtils.cosDeg(angle%90);
    float w      = left.getRegionWidth()*fruit.getScaleX();
    float h      = left.getRegionHeight()*fruit.getScaleY();
    float leftX  = fruit.getX() + w*sine/4;
    float leftY  = fruit.getY() + h*cos/4;
    float rightX = fruit.getX() - w*sine/4;
    float rightY = fruit.getY() - h*cos/4;

    leftPart.setPosition(leftX, leftY);
    leftPart.setOrigin(Align.center);
    leftPart.setRotation(angle);
    leftPart.setScale(fruit.getScaleX());
    addActor(leftPart);

    IPAction leftAction = IPAction.obtain(leftX, leftY, -200, 300, 2, 200);

    leftPart.addAction(leftAction);
    leftPart.addAction(Actions.delay(1, Actions.run(() -> {
      removeActor(leftPart);
      IPAction.free(leftAction);
    })));


    rightPart.setPosition(rightX, rightY);
    rightPart.setOrigin(Align.center);
    rightPart.setRotation(angle);
    rightPart.setScale(fruit.getScaleX());
    addActor(rightPart);

    IPAction rightAction = IPAction.obtain(rightX, rightY, 300, 300, 2, 200);

    rightPart.addAction(rightAction);
    rightPart.addAction(Actions.delay(1, Actions.run(() -> {
      removeActor(rightPart);
      IPAction.free(rightAction);
    })));

    addAction(Actions.delay(1, Actions.run(() -> {
      slashHandler.onSlash();
    })));
    AssetLoader.getSound("slice_banana").play(Const.PREFS.VOLUME);
  }

  @Override
  public void setPosition(float x, float y) {
    super.setPosition(x, y);
    float bx = getX() + getWidth()*getScaleX()/2;
    float by = getY() + getHeight()*getScaleX()/2;
    float bw = 300*fruit.getScaleX()*getScaleX();
    float bh = 300*fruit.getScaleY()*getScaleY();
    fruit.setVisible(true);
    fruit.getBound().set(bx, by, bw, bh);
  }

  @FunctionalInterface
  public interface SlashHandler {
    void onSlash();
  }
}
