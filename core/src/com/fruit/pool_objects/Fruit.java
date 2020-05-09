package com.fruit.pool_objects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.Pool;
import com.fruit.FruitGame;
import com.fruit.AssetLoader;

import java.util.HashMap;

@SuppressWarnings("unused")
public class Fruit extends Actor implements Pool.Poolable {
  public  static final  int                             N_FRUIT         = 4;
  public  static final   int                            BANANA          = 0;
  public  static final   int                            ORANGE          = 1;
  public  static final   int                            GRAPE           = 2;
  public  static final   int                            WATERMELON      = 3;
  public  static final   int                            WHEEL           = 4;
  public  static final   int                            BOMB            = 5;
  public  static final   int                            ICE             = 6;
  public  static final  float                           BOUNDING_SCALE  = 0.8f;

  private static final  HashMap<Integer, String>        FRUIT_KEY       = new HashMap<>();
  private static final  String                          ICE_KEY         = "fruit_ice";
  private static final  float                           ICE_SCALE       = 1.3f;
  public  static final  int                             ICE_STATE       = 1;

  private static        int                             uuid;
  private static final  int FRUIT_STATE = 0;

  private               int                             id;
  private               int                             type;
  private               Rectangle                       bound;
  private               TextureRegion                   fruitTexture;
  private               TextureRegion                   iceTG;
  private               IPAction                        throwAction;
  private               int                             state;

  static {
    FRUIT_KEY.put(0, "fruit_banana");
    FRUIT_KEY.put(1, "fruit_orange");
    FRUIT_KEY.put(2, "fruit_grape");
    FRUIT_KEY.put(3, "fruit_watermelon");
    FRUIT_KEY.put(4, "fruit_wheel");
    FRUIT_KEY.put(5, "fruit_bomb");
    FRUIT_KEY.put(6, "fruit_icegrape");
  }

  @Override
  public void reset() {
    bound.set(0,0,0,0);
    setPosition(0, 0);
    fruitTexture  = null;
    throwAction   = null;

    setHeight(0);
    setWidth(0);
    setOrigin(Align.center);
    clearActions();
    clear();
    clearListeners();
    setPosition(0, 0);
    setRotation(0);
    setScale(1);
    state = FRUIT_STATE;
  }

  public void setState(int state) {
    if (this.state == FRUIT_STATE && state == ICE_STATE && type <= 3) {
      this.state = state;
      throwAction.setTimeScale(throwAction.getTimeScale()/2);
    }
  }

  public Fruit _clone() {
    Fruit clone = Fruit.obtain(this.type);
    clone.bound.set(this.bound);
    clone.setRotation(this.getRotation());
    clone.setPosition(this.getX(), this.getY());
    clone.setScale(this.getScaleX());
    return clone;
  }

  public void setThrowAction(IPAction throwAction) {
    this.throwAction = throwAction;
  }

  public int getId() {
    return id;
  }

  @Override
  public void draw(Batch batch, float parentAlpha) {
    if (this.fruitTexture != null) {
      Color color = getColor();
      float             x   = getX();
      float             y   = getY();
      float             w   = getWidth();
      float             h   = getHeight();
      float             ox  = getOriginX();
      float             oy  = getOriginY();
      float             sx  = getScaleX();
      float             sy  = getScaleY();
      float             r   = getRotation();

      batch.setColor(color.r, color.g, color.b, color.a * parentAlpha);
      if (state == FRUIT_STATE) {
        batch.draw(fruitTexture, x, y, ox, oy, w, h, sx, sy, r);
      }
      else {
        batch.draw(iceTG, x, y, ox, oy, w, h, sx* ICE_SCALE, sy* ICE_SCALE, r);

        batch.setColor(Color.CHARTREUSE);
        batch.draw(fruitTexture, x, y, ox, oy, w, h, sx, sy, r);
      }
    }
  }

  public Rectangle getBound() {
    return bound;
  }

  public int getType() {
    return type;
  }

  @Override
  public void setPosition(float x, float y, int alignment) {
    super.setPosition(x, y, alignment);
    updateBound();
  }

  @Override
  public void setPosition(float x, float y) {
    super.setPosition(x, y);
    updateBound();
  }

  @Override
  public void setX(float x) {
    super.setX(x);
    updateBound();
  }

  @Override
  public void setY(float y) {
    super.setY(y);
    updateBound();
  }

  @Override
  public void setScale(float scaleXY) {
    super.setScale(scaleXY);
    updateBound();
  }

  public void updateBound() {
    float    x    = getX() + getWidth() * (1 - getScaleX()*BOUNDING_SCALE) / 2;
    float    y    = getY() + getHeight() * (1 - getScaleY()*BOUNDING_SCALE) / 2;
    float    w    = getWidth()*getScaleX()*BOUNDING_SCALE;
    float    h    = getHeight()*getScaleY()*BOUNDING_SCALE;
    bound.set(x, y, w, h);
  }

  private static final Pool<Fruit> fruitPool = new Pool<Fruit>() {
    @Override
    protected Fruit newObject() {
      uuid++;
      if (FruitGame.DEBUG)
        Gdx.app.log("created fruit: ", uuid + "");
      return new Fruit();
    }
  };

  public static Fruit obtain(int type) {
    Fruit fruit         = fruitPool.obtain();
    fruit.id            = uuid;
    fruit.type          = type;
    TextureRegion tg    = AssetLoader.getTextureRegion(FRUIT_KEY.get(fruit.type));
    fruit.iceTG         = AssetLoader.getTextureRegion(ICE_KEY);

    if (tg != null) {
      fruit.fruitTexture        = tg;
      fruit.bound               = new Rectangle(0, 0, tg.getRegionWidth(), tg.getRegionHeight());
      fruit.setWidth(tg.getRegionWidth());
      fruit.setHeight(tg.getRegionHeight());
      fruit.setOrigin(Align.center);
    }
    return fruit;
  }

  public static void free(Fruit fruit) {
    if (fruit.throwAction != null)
      IPAction.free(fruit.throwAction);
    fruitPool.free(fruit);
  }
}
