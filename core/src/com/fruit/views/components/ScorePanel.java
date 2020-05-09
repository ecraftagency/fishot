package com.fruit.views.components;

import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.fruit.AssetLoader;
import com.fruit.FruitGame;

public class ScorePanel extends Group {
  private static final  float           scoreTextX      = 130;
  private static final  float           scoreTextY      = 32;
  private static final  float           iconPadX        = 10;
  private static final  float           iconPadY        = 14;
  private static final  float           iconScl         = 0.65f;

  private static final  String          iconKey         = "fruit_icon";
  private static final  String          paneKey         = "score_pane";


  private               Label           score;

  public ScorePanel() {
    Image scorePane       = new Image(AssetLoader.getTextureRegion(paneKey));
    Image icon            = new Image(AssetLoader.getTextureRegion(iconKey));
    Group textHolder      = new Group();
    Label.LabelStyle ls   = new Label.LabelStyle();
    ls.font               = FruitGame.go330;
    score                 = new Label("0", ls);

    textHolder.addActor(score);
    textHolder.setScale(1.3f, 1.3f);
    textHolder.setPosition(scoreTextX, scoreTextY);
    icon.setScale(iconScl);
    icon.setPosition(iconPadX, iconPadY);
    addActor(scorePane);
    addActor(icon);
    addActor(textHolder);
  }

  public void setScore(int score) {
    this.score.setText("" + score);
  }
}
