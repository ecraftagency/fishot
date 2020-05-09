package com.fruit.views.components;

import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.Align;
import com.fruit.AssetLoader;
import com.fruit.Const;
import com.fruit.FruitGame;
import com.fruit.controllers.ThrowEngine;

public class ScorePanel extends Group {
  private static final  float           scoreTextX      = 130;
  private static final  float           scoreTextY      = 32;
  private static final  float           iconPadX        = 10;
  private static final  float           iconPadY        = 14;
  private static final  float           icePadXLeft     = 18 - 30;
  private static final  float           icePadBottom    = 24 - 30;
  private static final  float           iconScl         = 0.65f;
  private static final  float           iceScl          = 0.55f;

  private static final  String          iconKey         = "fruit_icon";
  private static final  String          paneKey         = "score_pane";
  private static final  String          iceKey          = "fruit_ice_cube";


  private               Label           score;
  private               Action          roting;
  private               float           iceProgress;

  public ScorePanel() {
    Image scorePane       = new Image(AssetLoader.getTextureRegion(paneKey));
    Image icon            = new Image(AssetLoader.getTextureRegion(iconKey));
    Group textHolder      = new Group();
    Label.LabelStyle ls   = new Label.LabelStyle();
    ls.font               = FruitGame.go330;
    score                 = new Label("0", ls);
    roting                = new Action() {
      float acc;
      @Override
      public boolean act(float delta) {
        actor.setRotation(30*(acc-=delta));
        return false;
      }
    };
    Image iceCube = new Image(AssetLoader.getTextureRegion(iceKey));

    textHolder.addActor(score);
    textHolder.setScale(1.3f, 1.3f);
    textHolder.setPosition(scoreTextX, scoreTextY);
    icon.setScale(iconScl);
    icon.setPosition(iconPadX, iconPadY);
    iceCube.setScale(iceScl);
    iceCube.setOrigin(Align.center);
    iceCube.setPosition(icePadXLeft, icePadBottom);
    addActor(scorePane);
    addActor(icon);
    addActor(iceCube);
    addActor(textHolder);
    icon.setVisible(false);
    iceCube.addAction(roting);
    iceCube.addListener(new ClickListener() {
      @Override
      public void clicked(InputEvent event, float x, float y) {
        ThrowEngine.inst().useItem(Const.ITEM.ICE);
        super.clicked(event, x, y);
      }
    });
  }



  public void setScore(int score) {
    this.score.setText("" + score);
  }
}
