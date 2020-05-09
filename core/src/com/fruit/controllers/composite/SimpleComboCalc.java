package com.fruit.controllers.composite;

import com.badlogic.gdx.utils.Array;
import com.fruit.controllers.ThrowEngine;
import java.util.HashMap;
import static com.fruit.controllers.Const.*;
import static com.fruit.controllers.ThrowEngine.*;

public class SimpleComboCalc implements ComboLogic {
  private                 float                               acc;
  private                 HashMap<Integer, Array<Float>>      hitHistory;
  private                 ThrowEngine                         engine;
  private                 float                               lastHitTime;

  public SimpleComboCalc(ThrowEngine engine) {
    hitHistory = new HashMap<>();
    this.engine = engine;
  }

  @Override
  public void step(float dt) {
    acc += dt;
    if (acc - lastHitTime >= Combo.COMBO_THRESHOLD) {
      if (hitHistory.size() >= 1 && hitHistory.entrySet().iterator().hasNext()) {
        Array<Float> hitTimes = hitHistory.entrySet().iterator().next().getValue();
        if (hitTimes.size >= Combo.MIN_COMBO_COUNT)
          engine.signalCombo(hitTimes.size);
        hitHistory.clear();
      }
    }
  }

  @Override
  public void onHit(int swipeId) {
    float currentHitTime = acc;
    lastHitTime = currentHitTime;
    if (hitHistory.size() == 0) { //very first onHit
      Array<Float> hitTimes = new Array<>();
      hitTimes.add(currentHitTime);
      hitHistory.put(swipeId, hitTimes);
    }
    else { //later hits
      if (hitHistory.containsKey(swipeId)) { //same swipe type
        Array<Float> hitTimes = hitHistory.get(swipeId);
        if (hitTimes.size >= 1) {
          float lastHitTime = hitTimes.get(hitTimes.size - 1);
          if (currentHitTime - lastHitTime < Combo.COMBO_THRESHOLD) {
            hitTimes.add(currentHitTime);
          }
        }
      }
      else { //different swipe type
        hitHistory.clear();
        Array<Float> hitTimes = new Array<>();
        hitTimes.add(currentHitTime);
        hitHistory.put(swipeId, hitTimes);
      }
    }
  }
}
