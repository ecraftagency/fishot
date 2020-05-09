package com.fruit.views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.utils.Array;
import com.fruit.AssetLoader;
import com.fruit.FruitGame;
import com.fruit.Const;
import com.fruit.controllers.ThrowEngine;
import com.fruit.views.components.EndGamePanel;
import com.fruit.views.components.FruitRoller;
import com.fruit.views.components.ScorePanel;

public class QueueUILayer extends Group implements ThrowEngine.ThrowListener {
  private static final  float     panescl       = 0.8f;
  private static final  float     panePadX      = 30;
  private static final  float     panePadY      = 120;

  private static final  float     rollerPadX    = 485;
  private static final  float     rollerPadY    = 130;

  private               ScorePanel        sp;
  private               FruitRoller       roller;
  private               EndGamePanel      endgamePanel;


  public QueueUILayer() {
    setHeight(FruitGame.renderer.getHeight());
    setWidth(FruitGame.renderer.getWidth());

    sp      = new ScorePanel();
    roller  = new FruitRoller();

    sp.setScale(panescl);
    sp.setVisible(false);

    roller.setVisible(false);
    addActor(sp);
    addActor(roller);

    endgamePanel = new EndGamePanel();
  }

  private float acc;
  @Override
  public void act(float delta) {
    if (FruitGame.DEBUG) {
      acc += delta;
      if (acc >= 1) {
        acc = 0;
        Gdx.app.log("OrderUIRenderer: ", getChildren().size + "");
      }
    }

    ThrowEngine.ClassicCtxInfo ctx =
            (ThrowEngine.ClassicCtxInfo) ThrowEngine.inst().getContextInfo();
    sp.setScore(ctx.waveScore);
    super.act(delta);
  }

  public void onResize() {
    float y = getHeight() - panePadY;
    float x;

    sp.setPosition(panePadX, y);
    sp.setVisible(true);

    x = getWidth() - rollerPadX;
    y = getHeight() - rollerPadY;
    roller.setVisible(true);
    roller.setPosition(x, y);
    endgamePanel.onResize();
  }

  @Override
  public void fruitWave(Array<ThrowEngine.ThrowInfo> fruitInfo) {

  }

  @Override
  public void engineStop() {
    AssetLoader.getSound("endgame").play(Const.PREFS.VOLUME);
    roller.clearFruit();
    ThrowEngine.ClassicCtxInfo ctx =
            (ThrowEngine.ClassicCtxInfo)ThrowEngine.inst().getContextInfo();
    endgamePanel.setScore(ctx.waveScore);
    endgamePanel.setHighScore(ctx.highScore);
    addActor(endgamePanel);
  }

  @Override
  public void comboOccur(int comboCount) {

  }

  @Override
  public void customEvent(Object ctxData) {
    if (ctxData instanceof ThrowEngine.ThrowInfo) {
      ThrowEngine.ThrowInfo fruit = (ThrowEngine.ThrowInfo) ctxData;
      roller.addFruit(fruit);
      return;
    }
    if (ctxData instanceof ThrowEngine.HitContext) {
      ThrowEngine.HitContext hitInfo = (ThrowEngine.HitContext) ctxData;
      roller.removeFruit(hitInfo);
    }
    if (ctxData instanceof Float) {
      roller.setRollSpeed((Float)ctxData);
    }
    if (ctxData instanceof Integer) {
      AssetLoader.getSound("alert").play(Const.PREFS.VOLUME);
      roller.alert();
    }
  }
}
