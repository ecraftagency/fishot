package com.fruit.views;

import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.utils.Array;
import com.fruit.AssetLoader;
import com.fruit.Const;
import com.fruit.controllers.ThrowEngine;
import com.fruit.views.components.EndGamePanel;
import com.fruit.views.components.FruitRollerV;
import com.fruit.views.components.StagePanel;

public class SliceUILayer extends Group implements ThrowEngine.ThrowListener {
  private static final  float     rollerPadRight    = 485;
  private static final  float     rollerPadTop      = 130;
  private static final  float     panePadLeft       = 30;
  private static final  float     panePadTop        = 120;
  private static final  float     panescl           = 0.8f;

  private FruitRollerV    fruitRoller;
  private StagePanel      stagePanel;
  private EndGamePanel    endgamePanel;

  public SliceUILayer() {
    fruitRoller   = new FruitRollerV();
    stagePanel    = new StagePanel();
    endgamePanel  = new EndGamePanel();
    addActor(fruitRoller);
    addActor(stagePanel);

    fruitRoller.setVisible(false);
    stagePanel.setVisible(false);
    stagePanel.setScale(panescl);
  }

  public void onResize() {
    fruitRoller.setPosition(getWidth() - rollerPadRight, getHeight() - rollerPadTop);
    stagePanel.setPosition(panePadLeft, getHeight() - panePadTop);


    fruitRoller.setVisible(true);
    stagePanel.setVisible(true);

    endgamePanel.onResize();
  }

  @Override
  public void act(float delta) {
    super.act(delta);
    Object obj = ThrowEngine.inst().getContextInfo();
    if(obj instanceof ThrowEngine.SliceCtxInfo) {
      ThrowEngine.SliceCtxInfo ctxInfo =
              (ThrowEngine.SliceCtxInfo)obj;
      stagePanel.setTimeProgress(ctxInfo.remainTime);
    }
  }

  @Override
  public void fruitWave(Array<ThrowEngine.ThrowInfo> fruitInfo) {

  }

  @Override
  public void engineStop() {
    AssetLoader.getSound("endgame").play(Const.PREFS.VOLUME);
    addActor(endgamePanel);
    Object obj = ThrowEngine.inst().getContextInfo();
    if(obj instanceof ThrowEngine.SliceCtxInfo) {
      ThrowEngine.SliceCtxInfo ctxInfo =
              (ThrowEngine.SliceCtxInfo)obj;
      stagePanel.setTimeProgress(ctxInfo.remainTime);
      endgamePanel.setScore(ctxInfo.currentStage);
      endgamePanel.setHighScore(ctxInfo.bestStage);
    }
  }

  @Override
  public void comboOccur(int comboCount) {

  }

  @Override
  public void customEvent(Object ctxData) {
    //!danger
    if (ctxData instanceof ThrowEngine.SliceCustomEvent){
      ThrowEngine.SliceCustomEvent event =
              (ThrowEngine.SliceCustomEvent)ctxData;
      if (event.id == 0) //new fruit queue
        fruitRoller.addFruit(event.fruitPath);
      if (event.id == 1) { //invalid fruit hit
        fruitRoller.alert();
        AssetLoader.getSound("alert").play(Const.PREFS.VOLUME);
      }
      if (event.id == 2) { //next stage
        stagePanel.setStageNumber(event.nextStageNumber);
      }
      if (event.id == 3) { //next stage
        stagePanel.setWaveNumber(event.waveNumber);
      }
      if (event.id == 4) { //invalid swipe hit
        fruitRoller.alert();
        AssetLoader.getSound("alert").play(Const.PREFS.VOLUME);
      }
    }
  }
}