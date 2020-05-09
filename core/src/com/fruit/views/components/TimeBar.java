package com.fruit.views.components;

import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.fruit.AssetLoader;
import com.fruit.FruitGame;
import com.fruit.controllers.ThrowEngine;

public class TimeBar extends Group {
  private static final String paneKey = "fruit_time_bar";
  private Label currentHitTxt;
  private Label bestHitTxt;
  private Label timer;

  private Group currentHolder;
  private Group bestHolder;

  public TimeBar() {
    Image pane = new Image(AssetLoader.getTextureRegion(paneKey));
    addActor(pane);
    setWidth(pane.getWidth());
    setHeight(pane.getHeight());

    currentHolder = new Group();
    currentHolder.setPosition(42, 39);
    currentHolder.setWidth(106);
    currentHolder.setHeight(48);
    addActor(currentHolder);

    bestHolder = new Group();
    bestHolder.setPosition(284, 39);
    bestHolder.setWidth(106);
    bestHolder.setHeight(48);
    addActor(bestHolder);

    Label.LabelStyle ls = new Label.LabelStyle();
    ls.font = FruitGame.go330;

    currentHitTxt = new Label("000", ls);
    bestHitTxt    = new Label("0", ls);
    timer         = new Label("0:00", ls);

    currentHolder.addActor(currentHitTxt);
    float x = (currentHolder.getWidth() - currentHitTxt.getWidth())/2;
    float y = (currentHolder.getHeight() - currentHitTxt.getHeight())/2;
    currentHitTxt.setPosition(x, y);

    bestHolder.addActor(bestHitTxt);
    x = (bestHolder.getWidth() - bestHitTxt.getWidth())/2;
    bestHitTxt.setPosition(x, y);

    addActor(timer);
    x = (getWidth() - timer.getWidth())/2;
    y = (getHeight() - timer.getHeight())/2;
    timer.setPosition(x, y);
  }


  public void updateModel(ThrowEngine.TimingCtxInfo ctxInfo) {
    currentHitTxt.setText(ctxInfo.score + "");
    bestHitTxt.setText(ctxInfo.highScore + "");

    int minute = (int)(ctxInfo.secondLeft/60);
    int second = (int)(ctxInfo.secondLeft%60);
    String s   = second < 10 ? "0" + second : "" + second;
    timer.setText(minute + ":" + s);

    currentHitTxt.setWidth(currentHitTxt.getText().length * 24);
    float x = (currentHolder.getWidth() - currentHitTxt.getWidth())/2;
    float y = (currentHolder.getHeight() - currentHitTxt.getHeight())/2;
    currentHitTxt.setPosition(x, y);

    bestHitTxt.setWidth(bestHitTxt.getText().length * 24);
    x = (bestHolder.getWidth() - bestHitTxt.getWidth())/2;
    bestHitTxt.setPosition(x, y);
  }
}