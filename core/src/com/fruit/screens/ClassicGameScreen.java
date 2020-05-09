package com.fruit.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.fruit.Const;
import com.fruit.FruitGame;
import com.fruit.controllers.composite.ItemAdapter;
import com.fruit.controllers.ClassicMode;
import com.fruit.controllers.ThrowEngine;
import com.fruit.views.ClassicUILayer;
import com.fruit.views.EffectLayer;
import com.fruit.views.FruitLayer;
import com.fruit.views.SwipeRenderer;
import com.fruit.AssetLoader;

public class ClassicGameScreen implements Screen {
  private               SwipeRenderer             swipeRenderer;
  private               FruitLayer                fruitLayer;
  private               EffectLayer               lowBoundEFRenderer;
  private               EffectLayer               upBoundEFRenderer;
  private               ClassicUILayer            classicUiLayer;
  private               Image                     backGround;
  private static final  float                     BASE_RATIO        = 1280f/720f;
  private               boolean                   hadResized        = false;
  private ThrowEngine.ModeLogic modeLogic;

  public ClassicGameScreen() { // per instance
    swipeRenderer             = new SwipeRenderer();
    fruitLayer                = new FruitLayer();
    lowBoundEFRenderer        = new EffectLayer();
    upBoundEFRenderer         = new EffectLayer();
    classicUiLayer            = new ClassicUILayer();
    modeLogic = new ClassicMode(ThrowEngine.inst());

    upBoundEFRenderer.setBombHitBehavior(new EffectLayer.BlankHitBehavior());
    upBoundEFRenderer.setIceHitBehavior(new EffectLayer.BlankHitBehavior());
    upBoundEFRenderer.setFruitHitBehavior(new EffectLayer.SlashHitBehavior(upBoundEFRenderer));

    fruitLayer.addHitListener(lowBoundEFRenderer);
    fruitLayer.addHitListener(upBoundEFRenderer);
    swipeRenderer.addSwipeListener(fruitLayer);
  }

  @Override
  public void show() { // per setScreen call
    TextureRegion bgTex = AssetLoader.getTextureRegion("fruit_bg");
    backGround          = new Image(new TextureRegionDrawable(bgTex));
    hadResized          = false;

    FruitGame.renderer.addActor(backGround);
    FruitGame.renderer.addListener(swipeRenderer);
    FruitGame.renderer.addActor(lowBoundEFRenderer);
    FruitGame.renderer.addActor(fruitLayer);
    FruitGame.renderer.addActor(upBoundEFRenderer);
    FruitGame.renderer.addActor(classicUiLayer);

    ThrowEngine.inst().clearListeners();
    ThrowEngine.inst().addThrowListener(fruitLayer);
    ThrowEngine.inst().addThrowListener(classicUiLayer);
    ThrowEngine.inst().setSpawnHandler(modeLogic);


    ThrowEngine.inst().clearItems();
    ThrowEngine.Item ice = new ItemAdapter(Const.ITEM.ICE);
    ice.addResolver(fruitLayer);
    ThrowEngine.inst().setItem(ice);

    ThrowEngine.inst().reset();
  }

  @Override
  public void render(float delta) {
    if(!hadResized) {
      fruitLayer.setWidth(FruitGame.renderer.getWidth());
      fruitLayer.setHeight(FruitGame.renderer.getHeight());
      lowBoundEFRenderer.setWidth(FruitGame.renderer.getWidth());
      lowBoundEFRenderer.setHeight(FruitGame.renderer.getHeight());
      classicUiLayer.setWidth(FruitGame.renderer.getWidth());
      classicUiLayer.setHeight(FruitGame.renderer.getHeight());
      classicUiLayer.onResize();
    }

    FruitGame.renderer.act();
    FruitGame.renderer.draw();
    swipeRenderer.render(FruitGame.renderer.getBatch(), FruitGame.renderer.getCamera());
    ThrowEngine.inst().step(delta);
  }

  @Override
  public void resize(int width, int height) {
    FruitGame.renderer.getViewport().update(width, height, true);
    float ratio = width/(height*1.0f);
    float scl   = ratio/BASE_RATIO;
    if (ratio - BASE_RATIO < 0.001f) {
      scl = width/1280f;
    }
    backGround.setScale(scl);
    hadResized = false;
  }

  @Override
  public void pause() {

  }

  @Override
  public void resume() {

  }

  @Override
  public void hide() {

  }

  @Override
  public void dispose() {

  }
}
