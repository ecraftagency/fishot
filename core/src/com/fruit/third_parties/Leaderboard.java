package com.fruit.third_parties;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.Align;
import com.fruit.AssetLoader;

public class Leaderboard extends Group {
  private Image bg;

  public Leaderboard() {
    TextureRegion bgTex = AssetLoader.getTextureRegion("fruit_endgame_board");
    bg = new Image(bgTex);
    bg.setOrigin(Align.center);
    setWidth(bg.getWidth());
    setHeight(bg.getHeight());
    setOrigin(Align.center);
    addActor(bg);
  }
}