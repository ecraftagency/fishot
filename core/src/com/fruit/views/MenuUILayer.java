package com.fruit.views;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.Align;
import com.fruit.AssetLoader;
import com.fruit.FruitGame;
import com.fruit.pool_objects.Fruit;
import com.fruit.views.components.SliceButton;

public class MenuUILayer extends Group implements SwipeRenderer.SwipeListener {
  private static final  String          selectModeTxt       = "SELECT YOUR MODE";
  private static final  String          titleKey            = "fruit_title";
  private static final  String          queueButtonTxt      = "QUEUE";
  private static final  String          ClassicButtonTxt    = "ARCADE";
  private static final  String          timingButtonTxt     = "TIMING";
  private static final  String          sliceButtonTxt      = "SLICE";

  private               Image           title;
  private               Label           selectModeLbl;
  private               SliceButton     queueButton;
  private               SliceButton     classicButton;
  private               SliceButton     timingButton;
  private               SliceButton     sliceButton;

  private static final  float           titlePadTop         = 250;
  private static final  float           buttonPadBottom     = 70;
  private static final  float           titleScl            = 0.7f;
  private static final  float           buttonScl           = 0.6f;
  private static final  float           buttonSpace         = 320;
  private static final  float           selectModePadUp     = 300;

  public MenuUILayer() {
    TextureRegion tg = AssetLoader.getTextureRegion(titleKey);
    title = new Image(new TextureRegionDrawable(tg));
    title.setOrigin(Align.center);
    title.setScale(titleScl);
    title.addAction(Actions.repeat(-1,
                      Actions.sequence(
                        Actions.scaleTo(0.8f, 0.9f, 1.5f),
                        Actions.delay(0.2f),
                        Actions.scaleTo(0.7f, 0.7f, 1.5f),
                        Actions.delay(0.2f)
                    )));
    addActor(title);

    queueButton = new SliceButton(2, queueButtonTxt,
            () -> FruitGame.inst.setScreen(FruitGame.queueGameScreen));
    queueButton.setScale(buttonScl);
    addActor(queueButton);


    classicButton = new SliceButton(1, ClassicButtonTxt,
            () -> FruitGame.inst.setScreen(FruitGame.classicGameScreen));
    classicButton.setScale(buttonScl);
    addActor(classicButton);


    timingButton = new SliceButton(3, timingButtonTxt,
            () -> FruitGame.inst.setScreen(FruitGame.timingGameScreen));
    timingButton.setScale(buttonScl);
    addActor(timingButton);

    sliceButton = new SliceButton(0, sliceButtonTxt,
            () -> FruitGame.inst.setScreen(FruitGame.sliceGameScreen));
    sliceButton.setScale(buttonScl);
    addActor(sliceButton);


    Label.LabelStyle ls = new Label.LabelStyle();
    ls.font = FruitGame.go360BB;
    selectModeLbl = new Label(selectModeTxt, ls);
    addActor(selectModeLbl);

//    Leaderboard ldb = new Leaderboard();
//    addActor(ldb);
//    ldb.setPosition(200, 200);
//    ldb.setScale(1.6f);

    setDebug(FruitGame.DEBUG);
  }

  public void onResize() {
    setHeight(FruitGame.renderer.getHeight());
    setWidth(FruitGame.renderer.getWidth());

    float x = (getWidth() - title.getWidth())/2;
    float y = getHeight() - titlePadTop;
    title.setPosition(x, y);

    float padX = (getWidth() - classicButton.getWidth()*4
            - (buttonSpace - classicButton.getWidth())*3)/2;
    classicButton.setPosition(padX, buttonPadBottom);
    queueButton.setPosition(classicButton.getX() + buttonSpace, buttonPadBottom);
    timingButton.setPosition(queueButton.getX() + buttonSpace, buttonPadBottom);
    sliceButton.setPosition(timingButton.getX() + buttonSpace, buttonPadBottom);

    x = (getWidth() - selectModeLbl.getWidth())/2;
    y = getHeight() - selectModePadUp;
    selectModeLbl.setPosition(x, y);
  }

  @Override
  public void splash(SwipeRenderer.SwipeContext ctx) {
    if (ctx.swipePath == null || ctx.swipePath.size == 0 || ctx.swipeDirection == null)
      return;
    Vector2 hitPoint = ctx.swipePath.get(0);

    for (Actor actor : getChildren()) {
      if (actor instanceof SliceButton) {
        SliceButton button = (SliceButton)actor;
        Fruit fruit = button.fruit;
        if (fruit.getBound().contains(new Vector2(hitPoint.x, hitPoint.y))) {
          classicButton.fruit.getBound().set(0,0,0,0);
          timingButton.fruit.getBound().set(0,0,0,0);
          queueButton.fruit.getBound().set(0,0,0,0);
          button.onSplash(ctx);
        }
      }
    }
  }

  @Override
  protected void drawDebugBounds(ShapeRenderer sr) {
    if (!getDebug())
      return;
    for (Actor actor : getChildren()) {
      if (actor instanceof SliceButton) {
        SliceButton button = (SliceButton) actor;
        Rectangle bound = button.fruit.getBound();
        sr.end();
        sr.begin(ShapeRenderer.ShapeType.Line);
        sr.setProjectionMatrix(FruitGame.renderer.getCamera().combined);
        sr.rect(bound.getX(), bound.getY(), bound.getWidth(), bound.getHeight());
      }
    }
  }
}
