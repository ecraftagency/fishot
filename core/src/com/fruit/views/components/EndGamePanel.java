package com.fruit.views.components;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.Align;
import com.fruit.AssetLoader;
import com.fruit.FruitGame;
import com.fruit.controllers.ThrowEngine;

public class EndGamePanel extends Group {
  private Image panel;
  private Image homeIcon;
  private Image replayIcon;
  private Image crownIcon;
  private Image rollingLight;
  private Label title;
  private Group holder;
  private Label score;
  private Label highScore;
  private Sound buttonClick;
  Image semiTL;

  public EndGamePanel() {
    buttonClick = AssetLoader.getSound("button");
    addDarkLayer();
    rollingLight = new Image(new TextureRegionDrawable(AssetLoader.getTextureRegion("fruit_light")));
    addActor(rollingLight);
    rollingLight.addAction(new Action() {
      float acc = 0;
      float vel = 20;
      @Override
      public boolean act(float delta) {
        acc+=delta;
        rollingLight.setRotation(vel*acc);
        return false;
      }
    });

    crownIcon = new Image(new TextureRegionDrawable(AssetLoader.getTextureRegion("fruit_crown_icon")));
    addActor(crownIcon);
    crownIcon.addAction(new Action() {
      float acc = 0;
      float scl = 5;
      @Override
      public boolean act(float delta) {
        acc+=delta;
        float rotate = scl * MathUtils.sin(acc);
        crownIcon.setRotation(rotate);
        return false;
      }
    });

    panel = new Image(new TextureRegionDrawable(AssetLoader.getTextureRegion("fruit_endgame_board")));
    addActor(panel);

    holder = new Group();
    holder.setWidth(panel.getWidth());
    holder.setHeight(panel.getHeight());
    holder.addActor(panel);
    addActor(holder);

    Group _this = this;
    homeIcon = new Image(new TextureRegionDrawable(AssetLoader.getTextureRegion("fruit_home_icon")));
    holder.addActor(homeIcon);
    homeIcon.addListener(new ClickListener() {
      @Override
      public void clicked(InputEvent event, float x, float y) {
        buttonClick.play();
        Group p = getParent();
        p.removeActor(_this);
        FruitGame.inst.setScreen(FruitGame.startScreen);
        super.clicked(event, x, y);
      }
    });

    replayIcon = new Image(new TextureRegionDrawable(AssetLoader.getTextureRegion("fruit_replay_icon")));
    holder.addActor(replayIcon);

    replayIcon.addListener(new ClickListener() {
      @Override
      public void clicked(InputEvent event, float x, float y) {
        buttonClick.play();
        Group p = getParent();
        p.removeActor(_this);
        ThrowEngine.inst().reset();
        super.clicked(event, x, y);
      }
    });

    Label.LabelStyle ls = new Label.LabelStyle();
    ls.font = FruitGame.go360;
    title = new Label("GAME OVER", ls);
    holder.addActor(title);

    Label.LabelStyle sls = new Label.LabelStyle();
    sls.font = FruitGame.go330;
    score = new Label("", sls);
    score.setAlignment(Align.left);
    holder.addActor(score);

    highScore = new Label("", sls);
    holder.addActor(highScore);
  }

  void addDarkLayer() {
    Pixmap pixmap = new Pixmap(1,1, Pixmap.Format.RGBA8888);
    pixmap.setColor(Color.BLACK);
    pixmap.fillRectangle(0, 0, 1, 1);
    Texture texture1=new Texture(pixmap);
    pixmap.dispose();

    semiTL=new Image(texture1);
    semiTL.getColor().a=.8f;
    addActor(semiTL);
  }

  public void onResize() {
    setWidth(FruitGame.renderer.getWidth());
    setHeight(FruitGame.renderer.getHeight());

    semiTL.setSize(FruitGame.renderer.getWidth(),FruitGame.renderer.getHeight());

    rollingLight.setOrigin(Align.center);

    float x = (getWidth() - rollingLight.getWidth())/2;
    float y = (getHeight() - rollingLight.getHeight())/2;
    rollingLight.setPosition(x, y);

    x = (getWidth() - crownIcon.getWidth())/2;
    y = (getHeight() - crownIcon.getHeight())/2 + 235;
    crownIcon.setPosition(x, y);
    crownIcon.setOrigin(Align.center);

    x = (getWidth() - panel.getWidth())/2;
    y = (getHeight() - panel.getHeight())/2;
    holder.setPosition(x, y);

    homeIcon.setPosition(130, 40);
    homeIcon.setScale(0.6f);

    replayIcon.setPosition(300, 40);
    replayIcon.setScale(0.6f);

    title.setPosition(100, 295);

    score.setPosition(40, 230);
    highScore.setPosition(40, 170);
  }

  public void setScore(int score) {
    this.score.setText("SCORE               " + score);
  }

  public void setHighScore(int highScore) {
    this.highScore.setText("HIGHSCORE       " + highScore);
  }
}
