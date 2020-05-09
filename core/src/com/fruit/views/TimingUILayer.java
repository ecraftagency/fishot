package com.fruit.views;

import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.utils.Array;
import com.fruit.AssetLoader;
import com.fruit.controllers.ThrowEngine;
import com.fruit.views.components.EndGamePanel;
import com.fruit.views.components.TimeBar;

public class TimingUILayer extends Group implements ThrowEngine.ThrowListener {
  private TimeBar timeBar;
  private static final float timeBarPadTop = 150;
  private EndGamePanel endGamePanel;

  public TimingUILayer() {
    timeBar = new TimeBar();
    timeBar.setVisible(false);
    addActor(timeBar);
    endGamePanel = new EndGamePanel();
  }

  @Override
  public void fruitWave(Array<ThrowEngine.ThrowInfo> fruitInfo) {

  }

  public void onResize() {
    float y = getHeight() - timeBarPadTop;
    float x = (getWidth() - timeBar.getWidth())/2;
    timeBar.setPosition(x, y);
    timeBar.setVisible(true);

    endGamePanel.onResize();
  }

  @Override
  public void engineStop() {
    AssetLoader.getSound("endgame").play();
    Object ctxObj = ThrowEngine.inst().getContextInfo();
    if (ctxObj instanceof ThrowEngine.TimingCtxInfo) {
      ThrowEngine.TimingCtxInfo ctxInfo = (ThrowEngine.TimingCtxInfo)ctxObj;
      endGamePanel.setScore(ctxInfo.score);
      endGamePanel.setHighScore(ctxInfo.highScore);
      addActor(endGamePanel);
    }
  }

  @Override
  public void act(float delta) {
    Object ctxObj = ThrowEngine.inst().getContextInfo();
    if (ctxObj instanceof ThrowEngine.TimingCtxInfo) {
      ThrowEngine.TimingCtxInfo ctxInfo = (ThrowEngine.TimingCtxInfo)ctxObj;
      timeBar.updateModel(ctxInfo);
    }
    super.act(delta);
  }

  @Override
  public void comboOccur(int comboCount) {

  }

  @Override
  public void customEvent(Object ctxData) {

  }
}
