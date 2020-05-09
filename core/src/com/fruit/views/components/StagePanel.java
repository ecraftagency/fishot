package com.fruit.views.components;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.Array;
import com.fruit.AssetLoader;
import com.fruit.FruitGame;

public class StagePanel extends Group {
  private static final  float           scoreTextX      = 130;
  private static final  float           scoreTextY      = 40;
  private static final  float           iconPadX        = 10;
  private static final  float           iconPadY        = 14;
  private static final  float           iconScl         = 0.65f;
  private static final  int             N_WAVE          = 9;

  private static final  String          iconKey         = "fruit_icon";
  private static final  String          paneKey         = "score_pane";
  private static final  String          stageText       = "STAGE";
  private static final  String          greenDotKey     = "fruit_green_dot";
  private static final  String          grayDotKey      = "fruit_gray_dot";
  private static final  String          circleK         = "fruit_circle";


  private Label                         stageNumber;
  private Array<Image>                  progressDots;
  private TextureRegionDrawable         greenDot;
  private TextureRegionDrawable         grayDot;
  private ProgressClipArea              clipArea;

  public StagePanel() {
    Image scorePane       = new Image(AssetLoader.getTextureRegion(paneKey));
    Image icon            = new Image(AssetLoader.getTextureRegion(iconKey));
    greenDot              = new TextureRegionDrawable(AssetLoader.getTextureRegion(greenDotKey));
    grayDot               = new TextureRegionDrawable(AssetLoader.getTextureRegion(grayDotKey));
    progressDots          = new Array<>();

    Group textHolder      = new Group();
    Label.LabelStyle ls   = new Label.LabelStyle();
    ls.font               = FruitGame.go360BB;
    stageNumber           = new Label(stageText, ls);

    Image circle          = new Image(AssetLoader.getTextureRegion(circleK));
    clipArea              = new ProgressClipArea(circle.getWidth(), circle.getHeight());

    textHolder.addActor(stageNumber);
    textHolder.setScale(0.7f, 0.7f);
    textHolder.setPosition(scoreTextX, scoreTextY);
    icon.setScale(iconScl);
    icon.setPosition(iconPadX, iconPadY);
    addActor(scorePane);
    addActor(icon);
    addActor(textHolder);

    float startX  = 80;
    float stepX   = 25;
    float y       = -5;

    for (int i = 0; i < N_WAVE; i++) {
      Image dot = new Image(grayDot);
      progressDots.add(dot);
      dot.setPosition(startX += stepX, y);
      addActor(dot);
    }

    clipArea.addActor(circle);
    addActor(clipArea);
    clipArea.setPosition(iconPadX, iconPadY);
  }

  public void setStageNumber(int stageNumber) {
    this.stageNumber.setText(stageText + " " + stageNumber);
    for (Image image : progressDots)
      image.setDrawable(grayDot);
  }

  public void setWaveNumber(int waveNumber) {
    waveNumber %= N_WAVE;
    for (int i = 0; i <= waveNumber; i++)
      progressDots.get(i).setDrawable(greenDot);
  }

  public void setTimeProgress(float percent) {
    clipArea.setProgress(percent);
  }

  static class ProgressClipArea extends Group {
    float height;
    ProgressClipArea(float width, float height) {
      this.height = height;
      setHeight(height);
      setWidth(width);
    }

    public void setProgress(float percent) {
      setHeight(height*percent);
    }

    private static Vector3 xyProj = new Vector3();
    private static Vector3 hwProj = new Vector3();
    @Override
    public void draw(Batch batch, float parentAlpha) {
      Actor     p     = getParent();
      float     scl   = this.getScaleX()*p.getScaleX();
      float     clipX = getX()*scl + p.getX();
      float     clipY = getY()*scl + p.getY();
      float     clipW = getWidth()*scl;
      float     clipH = getHeight()*scl;

      batch.end();
      Gdx.gl.glEnable(GL20.GL_SCISSOR_TEST);
      Vector3 xy = FruitGame.renderer.getCamera().project(xyProj.set(clipX, clipY, 0));
      Vector3 wh = FruitGame.renderer.getCamera().project(hwProj.set(clipW, clipH, 0));
      Gdx.gl.glScissor((int)xy.x, (int)xy.y, (int)wh.x, (int)wh.y);
      batch.begin();
      super.draw(batch, parentAlpha);
      batch.end();
      Gdx.gl.glDisable(GL20.GL_SCISSOR_TEST);
      batch.begin();
    }
  }
}
