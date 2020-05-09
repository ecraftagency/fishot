package com.fruit;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.fruit.screens.ClassicGameScreen;
import com.fruit.screens.PartnerScreen;
import com.fruit.screens.QueueGameScreen;
import com.fruit.screens.SliceGameScreen;
import com.fruit.screens.StartScreen;
import com.fruit.screens.TimingGameScreen;

public class FruitGame extends Game {
  public static Stage      renderer;
  public static BitmapFont go330;
  public static BitmapFont go360;
  public static BitmapFont go380;
  public static BitmapFont go360BB;

  public static boolean DEBUG = false;
  public static StartScreen         startScreen;
  public static ClassicGameScreen   classicGameScreen;
  public static QueueGameScreen     queueGameScreen;
  public static TimingGameScreen    timingGameScreen;
  public static SliceGameScreen     sliceGameScreen;
  public static PartnerScreen       partnerScreen;

  public static FruitGame inst;

  @Override
  public void create() {
    renderer = new Stage();
    renderer.setViewport(new ExtendViewport(1280, 720, 2376, 1080));
    OrthographicCamera cam = (OrthographicCamera)renderer.getCamera();
    cam.setToOrtho(false, renderer.getWidth(), renderer.getWidth());
    Gdx.input.setInputProcessor(renderer);
    AssetLoader.init();

    go330    = Utils.genBitmapFont(40, 1, true, Color.valueOf("FF9E00"), Color.BLACK, 2.6f);
    go360    = Utils.genBitmapFont(60, 1, true, Color.WHITE, Color.BLACK, 1f);
    go380    = Utils.genBitmapFont(80, 1, true, Color.WHITE, Color.BLACK, 1f);
    go360BB  = Utils.genBitmapFont(60, 1, true, Color.WHITE, Color.valueOf("333333"), 2.6f);

    startScreen           = new StartScreen();
    classicGameScreen     = new ClassicGameScreen();
    queueGameScreen       = new QueueGameScreen();
    timingGameScreen      = new TimingGameScreen();
    sliceGameScreen       = new SliceGameScreen();
    partnerScreen         = new PartnerScreen();
    setScreen(startScreen);

    inst = this;
  }

  @Override
  public void setScreen(Screen screen) {
    renderer.clear();
    super.setScreen(screen);
  }

  @Override
  public void render() {
    Gdx.gl20.glClearColor(.0f, .0f, .0f, 1);
    Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);
    super.render();
  }
}