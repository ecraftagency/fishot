package com.fruit.views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.Array;
import com.fruit.FruitGame;
import com.fruit.controllers.ThrowEngine;
import com.fruit.AssetLoader;
import com.fruit.views.components.EndGamePanel;
import com.fruit.views.components.ScorePanel;

public class ClassicUILayer extends Group implements ThrowEngine.ThrowListener {
  private               Array<Image>    lifeSheets;
  private               EndGamePanel    endgamePanel;

  private static final  float     panePadX    = 30;
  private static final  float     panePadY    = 120;
  private static final  float     panescl     = 0.8f;

  private static final  float     lifeScl      = 0.8f;
  private static final  float     lifePadX     = 300;
  private static final  float     lifePadY     = 100;

  private static final  float     comboLblPadUp = 400;

  private               Sound[]     combo;
  private               Sound       endgame;
  private               ScorePanel  sp;

  public ClassicUILayer() {
    setHeight(FruitGame.renderer.getHeight());
    setWidth(FruitGame.renderer.getWidth());

    sp = new ScorePanel();
    sp.setScale(panescl);
    sp.setVisible(false);
    addActor(sp);

    combo = new Sound[] {
            AssetLoader.getSound("combo1"),
            AssetLoader.getSound("combo2"),
            AssetLoader.getSound("combo3"),
            AssetLoader.getSound("combo4"),
    };

    endgame = AssetLoader.getSound("endgame");

    lifeSheets = new Array<>();
    lifeSheets.add(new Image(new TextureRegionDrawable(AssetLoader.getTextureRegion("fruit_zero"))));
    lifeSheets.add(new Image(new TextureRegionDrawable(AssetLoader.getTextureRegion("fruit_one"))));
    lifeSheets.add(new Image(new TextureRegionDrawable(AssetLoader.getTextureRegion("fruit_two"))));
    lifeSheets.add(new Image(new TextureRegionDrawable(AssetLoader.getTextureRegion("fruit_three"))));

    for (Image life : lifeSheets) {
      addActor(life);
      life.setScale(lifeScl);
      life.setVisible(false);
    }

    endgamePanel = new EndGamePanel();
  }

  public void onResize() {
    float y = getHeight() - panePadY;
    float x;

    sp.setPosition(panePadX, y);
    sp.setVisible(true);


    for (Image life : lifeSheets) {
      y = getHeight() - lifePadY;
      x = getWidth() - lifePadX;
      life.setPosition(x, y);
    }

    endgamePanel.onResize();
  }

  private float acc;
  @Override
  public void act(float delta) {
    if (FruitGame.DEBUG) {
      acc += delta;
      if (acc >= 1) {
        acc = 0;
        Gdx.app.log("ClassicUILayer: ", getChildren().size + "");
      }
    }
    ThrowEngine.ClassicCtxInfo ctx =
            (ThrowEngine.ClassicCtxInfo) ThrowEngine.inst().getContextInfo();
    int life = ctx.remainLife;
    for (Image lifei : lifeSheets)
      lifei.setVisible(false);
    life %= lifeSheets.size;
    lifeSheets.get(life).setVisible(true);

    sp.setScore(ctx.waveScore);
    super.act(delta);
  }

  @Override
  public void engineStop() {
    endgame.play();
    ThrowEngine.ClassicCtxInfo ctx =
            (ThrowEngine.ClassicCtxInfo)ThrowEngine.inst().getContextInfo();
    endgamePanel.setScore(ctx.waveScore);
    endgamePanel.setHighScore(ctx.highScore);
    addActor(endgamePanel);
  }

  @Override
  public void comboOccur(int comboCount) {
    if (comboCount >= 5) {
      combo[3].play();
    }
    else if (comboCount >= 4) {
      combo[2].play();
    }
    else if (comboCount >= 3) {
      combo[1].play();
    }
    else if (comboCount >= 2) {
      combo[0].play();
    }

    Label.LabelStyle ls = new Label.LabelStyle();
    ls.font = FruitGame.go330;
    String comboTxt = "COMBO" + comboCount;
    Label comboLbl = new Label(comboTxt, ls);


    Group holder = new Group();
    holder.addActor(comboLbl);
    addActor(holder);
    holder.setWidth(comboLbl.getWidth());
    holder.setHeight(comboLbl.getHeight());
    holder.setOrigin(Align.center);
    float x = (getWidth() - comboLbl.getWidth())/2;
    holder.setPosition(x, comboLblPadUp);
    holder.setScale(0.5f);

    final ClassicUILayer _this = this;
    holder.addAction(Actions.sequence(
                            Actions.parallel(
                                    Actions.fadeOut(0.5f),
                                    Actions.scaleTo(1.5f, 1.5f, 0.5f)
                            ),
                            Actions.run(() -> _this.removeActor(holder))
    ));
  }

  @Override
  public void fruitWave(Array<ThrowEngine.ThrowInfo> fruitInfo) {

  }

  @Override
  public void customEvent(Object ctxData) {

  }
}
