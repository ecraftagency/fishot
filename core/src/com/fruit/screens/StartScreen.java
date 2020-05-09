package com.fruit.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.fruit.AssetLoader;
import com.fruit.FruitGame;
import com.fruit.views.MenuUILayer;
import com.fruit.views.SwipeRenderer;

public class StartScreen implements Screen {
  private                   Image backGround;
  private static final      float             BASE_RATIO        = 1280f/720f;
  private                   boolean           hadResized        = false;
  private MenuUILayer modeMenu;
  private                   SwipeRenderer     swipeRenderer;


  public StartScreen() {
    modeMenu            = new MenuUILayer();
    swipeRenderer       = new SwipeRenderer();
    TextureRegion bgTex = AssetLoader.getTextureRegion("fruit_bg");
    backGround          = new Image(new TextureRegionDrawable(bgTex));
  }

  @Override
  public void show() {
    hadResized          = false;

    FruitGame.renderer.addActor(backGround);
    FruitGame.renderer.addActor(modeMenu);
    FruitGame.renderer.addListener(swipeRenderer);
    swipeRenderer.addSwipeListener(modeMenu);
    AssetLoader.getSound("start").play();
  }

  @Override
  public void render(float delta) {
    if (!hadResized) {
      modeMenu.onResize();
      hadResized = true;
    }
    FruitGame.renderer.act();
    FruitGame.renderer.draw();
    swipeRenderer.render(FruitGame.renderer.getBatch(),
            FruitGame.renderer.getCamera());
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
