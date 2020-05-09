package com.fruit.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.fruit.AssetLoader;
import com.fruit.FruitGame;
import com.fruit.third_parties.Wheel;

public class PartnerScreen implements Screen {
  private Image backGround;
  private int viewOption;
  private boolean           hadResized        = false;


  private static final      float             BASE_RATIO        = 1280f/720f;
  public  static            int               WHEEL_VIEW        = 0;


  public PartnerScreen() {
    FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("opensans.ttf"));
    FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
    parameter.characters = FreeTypeFontGenerator.DEFAULT_CHARS + "ưừứ";
    parameter.size = 25;
    parameter.spaceX = 1;
    parameter.genMipMaps = true;
    parameter.minFilter = Texture.TextureFilter.MipMapLinearNearest;
    parameter.magFilter = Texture.TextureFilter.Linear;
    parameter.borderStraight = true;
    parameter.borderColor = Color.BLACK;
    parameter.borderWidth = 2.6f;
    BitmapFont font12 = generator.generateFont(parameter);
    generator.dispose();


    Wheel.wheelTex = AssetLoader.getTextureRegion("wheel");
    Wheel.wheelTick = Gdx.audio.newSound(Gdx.files.internal("sound/wheel_sound.mp3"));
    Wheel.pointer = AssetLoader.getTextureRegion("pointer");
    Wheel.wheelDot = AssetLoader.getTextureRegion("dot");
    Wheel.lightDot = AssetLoader.getTextureRegion("lightdot");
    Wheel.wheelText = font12;
    Wheel.TEXT_SPACE = 4f;
    Wheel.PARTITION = 12;
    Wheel.Y_DOWN = false;

    Wheel.wheelItems.add(Wheel.WheelItem.newInst(AssetLoader.getTextureRegion("fruit_watermelon"), 0, 2, "the", 800));
    Wheel.wheelItems.add(Wheel.WheelItem.newInst(AssetLoader.getTextureRegion("fruit_banana"), 1, 2, "ninja", 103));
    Wheel.wheelItems.add(Wheel.WheelItem.newInst(AssetLoader.getTextureRegion("fruit_grape"), 2, 2, "cool", 1054));
    Wheel.wheelItems.add(Wheel.WheelItem.newInst(AssetLoader.getTextureRegion("fruit_orange"), 3, 2, "a", 929));
    Wheel.wheelItems.add(Wheel.WheelItem.newInst(AssetLoader.getTextureRegion("fruit_bomb"), 4, 2, "need", 505));
    Wheel.wheelItems.add(Wheel.WheelItem.newInst(AssetLoader.getTextureRegion("fruit_icegrape"), 5, 2, "also", 351));
    Wheel.wheelItems.add(Wheel.WheelItem.newInst(AssetLoader.getTextureRegion("fruit_watermelon"), 6, 2, "fruit", 981));
    Wheel.wheelItems.add(Wheel.WheelItem.newInst(AssetLoader.getTextureRegion("fruit_banana"), 7, 2, "nice", 1182));
    Wheel.wheelItems.add(Wheel.WheelItem.newInst(AssetLoader.getTextureRegion("fruit_grape"), 8, 2, "of", 1281));
    Wheel.wheelItems.add(Wheel.WheelItem.newInst(AssetLoader.getTextureRegion("fruit_orange"), 9, 2, "full", 503));
    Wheel.wheelItems.add(Wheel.WheelItem.newInst(AssetLoader.getTextureRegion("fruit_bomb"), 10, 2, "is", 1367));
    Wheel.wheelItems.add(Wheel.WheelItem.newInst(AssetLoader.getTextureRegion("fruit_icegrape"), 11, 2, "world", 944));

    Wheel.inst().setWheelListener(new Wheel.EventListener() {
      @Override
      public boolean start() {
        return true;
      }

      @Override
      public void end(Wheel.WheelItem item) {
        Gdx.app.log("output item", item.getId() + " - " + item.getQtyText());
      }

      @Override
      public void error(String msg) {
        Gdx.app.log("Wheel error", msg);
      }
    });

    Wheel.inst().init();
    Wheel.inst().setPosition(700, 100);

    Gdx.app.log("log", Wheel.inst().getWidth() + " " + Wheel.inst().getHeight());
    TextureRegion bgTex = AssetLoader.getTextureRegion("fruit_bg");
    backGround          = new Image(new TextureRegionDrawable(bgTex));
  }

  public void setViewOption(int viewOption) {
    this.viewOption = viewOption;
  }

  @Override
  public void show() {
    hadResized          = false;

    FruitGame.renderer.addActor(backGround);

    if (viewOption == WHEEL_VIEW) {
      Wheel.inst().setPosition(0,0);
      FruitGame.renderer.addActor(Wheel.inst());
    }
  }

  @Override
  public void render(float delta) {
    if (!hadResized) {
      if (viewOption == WHEEL_VIEW) {
        float x = (FruitGame.renderer.getWidth() - Wheel.inst().getWidth())/2;
        float y = (FruitGame.renderer.getHeight() - Wheel.inst().getHeight())/2;

        Wheel.inst().setPosition(x, y);
      }
      hadResized = true;
    }
    FruitGame.renderer.act(delta);
    FruitGame.renderer.draw();
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
