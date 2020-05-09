package com.fruit.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.fruit.AssetLoader;
import com.fruit.FruitGame;
import com.fruit.controllers.QueueMode;
import com.fruit.controllers.ThrowEngine;
import com.fruit.pool_objects.Fruit;
import com.fruit.views.EffectLayer;
import com.fruit.views.FruitLayer;
import com.fruit.views.QueueUILayer;
import com.fruit.views.SwipeRenderer;

public class QueueGameScreen implements Screen {
  private               SwipeRenderer             swipeRenderer;
  private               FruitLayer                fruitLayer;
  private               EffectLayer               lowBoundEFRenderer;
  private               EffectLayer               upBoundEFRenderer;
  private               QueueUILayer              queueUILayer;
  private               Image                     backGround;
  private static final  float                     BASE_RATIO            = 1280f/720f;
  private static final  String                    bgKey                 = "fruit_bg";
  private               boolean                   hadResized            = false;
  private ThrowEngine.ModeLogic modeLogic;

  public QueueGameScreen() {
    swipeRenderer             = new SwipeRenderer();
    fruitLayer = new FruitLayer();
    lowBoundEFRenderer        = new EffectLayer() {
      @Override
      public void onOutOfBound(Fruit fruit) {

      }
    };
    upBoundEFRenderer         = new EffectLayer() {
      @Override
      public void onOutOfBound(Fruit fruit) {

      }
    };

    queueUILayer = new QueueUILayer();
    modeLogic = new QueueMode(ThrowEngine.inst());

    upBoundEFRenderer.setBombHitBehavior(new EffectLayer.BlankHitBehavior());
    upBoundEFRenderer.setIceHitBehavior(new EffectLayer.BlankHitBehavior());
    upBoundEFRenderer.setFruitHitBehavior(new EffectLayer.SlashHitBehavior(upBoundEFRenderer));

    fruitLayer.addHitListener(lowBoundEFRenderer);
    fruitLayer.addHitListener(upBoundEFRenderer);
    swipeRenderer.addSwipeListener(fruitLayer);
  }

  @Override
  public void show() {
    backGround          = new Image(AssetLoader.getTextureRegion(bgKey));
    hadResized          = false;

    FruitGame.renderer.addActor(backGround);
    FruitGame.renderer.addListener(swipeRenderer);
    FruitGame.renderer.addActor(lowBoundEFRenderer);
    FruitGame.renderer.addActor(fruitLayer);
    FruitGame.renderer.addActor(upBoundEFRenderer);
    FruitGame.renderer.addActor(queueUILayer);

    ThrowEngine.inst().clearListeners();
    ThrowEngine.inst().addThrowListener(fruitLayer);
    ThrowEngine.inst().addThrowListener(queueUILayer);
    ThrowEngine.inst().setSpawnHandler(modeLogic);
    ThrowEngine.inst().reset();
  }

  @Override
  public void render(float delta) {
    if(!hadResized) {
      fruitLayer.setWidth(FruitGame.renderer.getWidth());
      fruitLayer.setHeight(FruitGame.renderer.getHeight());
      lowBoundEFRenderer.setWidth(FruitGame.renderer.getWidth());
      lowBoundEFRenderer.setHeight(FruitGame.renderer.getHeight());
      queueUILayer.setWidth(FruitGame.renderer.getWidth());
      queueUILayer.setHeight(FruitGame.renderer.getHeight());
      queueUILayer.onResize();
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
