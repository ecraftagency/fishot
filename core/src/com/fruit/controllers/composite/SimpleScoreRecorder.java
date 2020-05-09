package com.fruit.controllers.composite;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;

import static com.fruit.controllers.ThrowEngine.*;

public class SimpleScoreRecorder implements ScoreRecorder {
  private int       highScore;
  private String    highScoreKey;
  Preferences prefs = Gdx.app.getPreferences("Game Data");

  public SimpleScoreRecorder(String highScoreKey) {
    this.highScoreKey = highScoreKey;
    highScore = prefs.getInteger(highScoreKey, 0);
  }

  @Override
  public void recordScore(int score) {
    if (score > highScore) {
      highScore = score;
      prefs.putInteger(highScoreKey, highScore);
      prefs.flush();
    }
  }

  @Override
  public int getHighScore() {
    return highScore;
  }
}