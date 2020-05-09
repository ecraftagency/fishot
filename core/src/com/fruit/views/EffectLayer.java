package com.fruit.views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.Array;
import com.fruit.FruitGame;
import com.fruit.Const;
import com.fruit.pool_objects.Fruit;
import com.fruit.pool_objects.IPAction;
import com.fruit.AssetLoader;

import static com.fruit.views.FruitLayer.*;
import java.util.HashMap;

@SuppressWarnings("unused")
public class EffectLayer extends Group implements EventListener {
  private interface HitBehavior {
    void addHitEffect(Fruit fruit, SwipeRenderer.SwipeContext ctx);
  }

  public static final float              SLASH_DELAY                        = 1.5f;
  public static final float              SLASH_FADE_DURATION                = 0.6f;
  public static final float              SLASH_SCALE                        = 1.3f;
  public static final float              PART_ALIVE_TIME                    = 2;
  public static final float              PART_FADE_DURATION                 = 2;

  public static final float              PART_MIN_VEL_X                     = 200;
  public static final float              PART_MIN_VEL_Y                     = 200;
  public static final float              PART_MAX_VEL_X                     = 400;
  public static final float              PART_MAX_VEL_Y                     = 400;
  public static final float              PART_MIN_ANGULAR_VEL               = 50f;
  public static final float              PART_MAX_ANGULAR_VEL               = 100f;
  public static final float              PART_MIN_SPEED                     = 1.0f;
  public static final float              PART_MAX_SPEED                     = 1.2f;

  public static final float              DELAY                              = 0.2f;
  public static final float              SPLASH_DURATION                    = 0.2f;
  public static final float              SPLASH_SCL_MIN                     = 1f;
  public static final float              SPLASH_SCL_MAX                     = 3f;

  private Array<AnimationContext>         animations            = new Array<>();
  private Sound                           softFail;

  private HitBehavior                     fruitHitBehavior;
  private HitBehavior                     bombHitBehavior;
  private HitBehavior                     iceHitBehavior;

  public EffectLayer() {
    setHeight(FruitGame.renderer.getHeight());
    setWidth(FruitGame.renderer.getWidth());

    softFail = AssetLoader.getSound("softfail");

    fruitHitBehavior = new FruitHitEffectV2(this);
    bombHitBehavior = new BombHitBehavior(this);
    iceHitBehavior = new IceHitBehavior();
  }

  @Override
  public void draw(Batch batch, float parentAlpha) {
    Array<AnimationContext> finishAnimation = new Array<>();
    super.draw(batch, parentAlpha);
    for (AnimationContext ctx : animations) {
      if (ctx.finish)
        finishAnimation.add(ctx);
      else
        ctx.draw(batch);
    }

    for (AnimationContext ctx : finishAnimation)
      animations.removeValue(ctx, true);
    finishAnimation.clear();
  }

  private float acc;
  @Override
  public void act(float delta) {
    super.act(delta);
    for (AnimationContext ctx : animations)
      ctx.update(delta);

    if (FruitGame.DEBUG) {
      acc += delta;
      if (acc >= 1) {
        acc = 0;
        Gdx.app.log("EffectLayer: ", getChildren().size + "");
      }
    }
  }

  @Override
  public void onHit(Fruit fruit, SwipeRenderer.SwipeContext ctx) {
    if (fruit.getType() == Fruit.BOMB) {
      bombHitBehavior.addHitEffect(fruit, ctx);
    }
    else if (fruit.getType() == Fruit.ICE) {
      iceHitBehavior.addHitEffect(fruit, ctx);
    }
    else {
      fruitHitBehavior.addHitEffect(fruit, ctx);
    }
  }

  @Override
  public void onOutOfBound(Fruit fruit) {
    if (fruit.getType() < Fruit.N_FRUIT)
      softFail.play(Const.PREFS.VOLUME);
  }

  public void setFruitHitBehavior(HitBehavior fruitHitBehavior) {
    this.fruitHitBehavior = fruitHitBehavior;
  }

  public void setIceHitBehavior(HitBehavior iceHitBehavior) {
    this.iceHitBehavior = iceHitBehavior;
  }

  public void setBombHitBehavior(HitBehavior bombHitBehavior) {
    this.bombHitBehavior = bombHitBehavior;
  }

  /**********************************************************************************************/
  //animation encapsulation
  private static class AnimationContext {
    float x;
    float y;
    float fw;
    float fh;
    Animation<TextureRegion> animation;
    float stateTime = 0;
    boolean finish = false;
    TextureRegion currentFrame;
    float scl = 1;

    public void update(float delta) {
      currentFrame = animation.getKeyFrame(stateTime);
      stateTime += delta;
      if (animation.isAnimationFinished(stateTime))
        finish = true;
      animation.setPlayMode(Animation.PlayMode.LOOP);
    }

    void draw(Batch batch) {
      if (currentFrame != null) {
        batch.setProjectionMatrix(FruitGame.renderer.getCamera().combined);
        batch.setColor(1,1,1,1);
        float w = currentFrame.getRegionWidth();
        float h = currentFrame.getRegionHeight();
        float ox = scl*w/2;
        float oy = scl*h/2;
        float _x = this.x + scl*(fw - w)/2f;
        float _y = this.y + scl*(fh - h)/2f;
        batch.draw(currentFrame, _x, _y, ox, oy, w, h, scl, scl, 0);
      }
    }
  }

  /**********************************************************************************************/
  //fruit hit behavior encapsulation
  public static class FruitHitEffectV1 implements HitBehavior {
    static HashMap<Integer, TextureRegion> splashText     = new HashMap<>();
    static HashMap<Integer, TextureRegion> fruitLeftTex   = new HashMap<>();
    static HashMap<Integer, TextureRegion> fruitRightTex  = new HashMap<>();

    Sound[]                                 slice;
    Group                                   holder;

    public FruitHitEffectV1(Group holder) {
      splashText.put(0, AssetLoader.getTextureRegion("fruit_banana_splash"));
      splashText.put(1, AssetLoader.getTextureRegion("fruit_orange_splash"));
      splashText.put(2, AssetLoader.getTextureRegion("fruit_grape_splash"));
      splashText.put(3, AssetLoader.getTextureRegion("fruit_watermelon_splash"));

      fruitLeftTex.put(0, AssetLoader.getTextureRegion("fruit_banana_left"));
      fruitLeftTex.put(1, AssetLoader.getTextureRegion("fruit_orange_left"));
      fruitLeftTex.put(2, AssetLoader.getTextureRegion("fruit_grape_left"));
      fruitLeftTex.put(3, AssetLoader.getTextureRegion("fruit_watermelon_left"));

      fruitRightTex.put(0, AssetLoader.getTextureRegion("fruit_banana_right"));
      fruitRightTex.put(1, AssetLoader.getTextureRegion("fruit_orange_right"));
      fruitRightTex.put(2, AssetLoader.getTextureRegion("fruit_grape_right"));
      fruitRightTex.put(3, AssetLoader.getTextureRegion("fruit_watermelon_right"));

      slice =  new Sound[]{
              AssetLoader.getSound("slice_banana"),
              AssetLoader.getSound("slice_orange"),
              AssetLoader.getSound("slice_grape"),
              AssetLoader.getSound("slice_watermelon"),

      };

      this.holder = holder;
    }

    @Override
    public void addHitEffect(Fruit fruit, SwipeRenderer.SwipeContext ctx) {
      TextureRegion tg    = splashText.get(fruit.getType());
      if (tg != null) {
        Image splashEffect  = new Image(new TextureRegionDrawable(tg));
        splashEffect.setHeight(tg.getRegionHeight());
        splashEffect.setWidth(tg.getRegionWidth());
        float scl = fruit.getScaleX()* SLASH_SCALE;
        float x   = fruit.getX() - SLASH_SCALE *(splashEffect.getWidth() - fruit.getWidth())/2;
        float y   = fruit.getY() - SLASH_SCALE *(splashEffect.getHeight() - fruit.getHeight())/2;

        splashEffect.setOrigin(Align.center);
        splashEffect.addAction(Actions.delay(SLASH_DELAY, Actions.sequence(
                Actions.fadeOut(SLASH_FADE_DURATION),
                Actions.delay(SLASH_FADE_DURATION, Actions.run(() -> holder.removeActor(splashEffect)))
        )));
        splashEffect.setScale(scl);
        splashEffect.setPosition(x, y);
        holder.addActor(splashEffect);
        renderParts(fruit, ctx);
        slice[fruit.getType()%Fruit.N_FRUIT].play(Const.PREFS.VOLUME);
      }
    }

    void renderParts(Fruit fruit, SwipeRenderer.SwipeContext ctx) {
      TextureRegion left = fruitLeftTex.get(fruit.getType());
      TextureRegion right = fruitRightTex.get(fruit.getType());

      Image leftPart = new Image(new TextureRegionDrawable(left));
      Image rightPart = new Image(new TextureRegionDrawable(right));

      float angle  = fruit.getRotation()%180 + 90;
      float sine   = MathUtils.sinDeg(angle%90);
      float cos    = MathUtils.cosDeg(angle%90);
      float w      = left.getRegionWidth()*fruit.getScaleX();
      float h      = left.getRegionHeight()*fruit.getScaleY();
      float leftX  = fruit.getX() + w*sine/4;
      float leftY  = fruit.getY() + h*cos/4;
      float rightX = fruit.getX() - w*sine/4;
      float rightY = fruit.getY() - h*cos/4;

      leftPart.setPosition(leftX, leftY);
      leftPart.setOrigin(Align.center);
      leftPart.setRotation(angle);
      leftPart.setScale(fruit.getScaleX());
      holder.addActor(leftPart);

      float velX = MathUtils.random(PART_MIN_VEL_X, PART_MAX_VEL_X);
      float velY = MathUtils.random(PART_MIN_VEL_Y, PART_MAX_VEL_Y);
      float spd  = MathUtils.random(PART_MIN_SPEED, PART_MAX_SPEED);
      float anv  = MathUtils.random(PART_MIN_ANGULAR_VEL, PART_MAX_ANGULAR_VEL);

      IPAction leftAction = IPAction.obtain(leftX, leftY, velX, velY, spd, anv);

      leftPart.addAction(leftAction);
      leftPart.addAction(Actions.delay(PART_ALIVE_TIME, Actions.run(() -> {
        holder.removeActor(leftPart);
        IPAction.free(leftAction);
      })));
      leftPart.addAction(Actions.fadeOut(PART_FADE_DURATION));


      rightPart.setPosition(rightX, rightY);
      rightPart.setOrigin(Align.center);
      rightPart.setRotation(angle);
      rightPart.setScale(fruit.getScaleX());
      holder.addActor(rightPart);

      velX = MathUtils.random(PART_MIN_VEL_X, PART_MAX_VEL_X);
      velY = MathUtils.random(PART_MIN_VEL_Y, PART_MAX_VEL_Y);
      spd  = MathUtils.random(PART_MIN_SPEED, PART_MAX_SPEED);
      anv  = MathUtils.random(PART_MIN_ANGULAR_VEL, PART_MAX_ANGULAR_VEL);
      IPAction rightAction = IPAction.obtain(rightX, rightY, -velX, velY, spd, anv);

      rightPart.addAction(rightAction);
      rightPart.addAction(Actions.delay(PART_ALIVE_TIME, Actions.run(() -> {
        holder.removeActor(rightPart);
        IPAction.free(rightAction);
      })));
      rightPart.addAction(Actions.fadeOut(PART_FADE_DURATION));
    }
  }

  /**********************************************************************************************/
  //fruit hit behavior encapsulation
  private static class FruitHitEffectV2 extends FruitHitEffectV1 {
    FruitHitEffectV2(Group holder) {
      super(holder);
    }

    @Override
    public void addHitEffect(Fruit fruit, SwipeRenderer.SwipeContext ctx) {
      Fruit clone = fruit._clone();

      float angle = ctx.swipeDirection.angle()%180;
      clone.setRotation(angle);
      holder.addActor(clone);
      slice[fruit.getType()%Fruit.N_FRUIT].play(Const.PREFS.VOLUME);

      clone.addAction(Actions.delay(DELAY, Actions.run(() -> {
        TextureRegion tg    = splashText.get(clone.getType());
        if (tg != null) {
          Image splashEffect  = new Image(new TextureRegionDrawable(tg));
          splashEffect.setHeight(tg.getRegionHeight());
          splashEffect.setWidth(tg.getRegionWidth());
          float scl = clone.getScaleX()* SLASH_SCALE;
          float x   = clone.getX() - SLASH_SCALE *(splashEffect.getWidth() - clone.getWidth())/2;
          float y   = clone.getY() - SLASH_SCALE *(splashEffect.getHeight() - clone.getHeight())/2;

          splashEffect.setOrigin(Align.center);
          splashEffect.addAction(Actions.delay(SLASH_DELAY, Actions.sequence(
                  Actions.fadeOut(SLASH_FADE_DURATION),
                  Actions.delay(SLASH_FADE_DURATION, Actions.run(() -> holder.removeActor(splashEffect)))
          )));
          splashEffect.setScale(scl);
          splashEffect.setPosition(x, y);
          holder.addActor(splashEffect);
        }

        renderParts(clone, ctx);
        holder.removeActor(clone);
        Fruit.free(clone);
      })));
    }
  }

  /**********************************************************************************************/
  //bomb hit behavior encapsulation
  private static class BombHitBehavior implements HitBehavior {
    private TextureRegion[]                 explosionKeyFrames;
    private Group holder;
    private Sound                           explosion;
    BombHitBehavior (Group holder) {
      this.holder = holder;
      Animation<TextureRegion> anim = AssetLoader.getAnimation("explosion",
              3, 4, 0.09f);
      explosionKeyFrames = anim.getKeyFrames();
      explosion = AssetLoader.getSound("explosion");
    }

    @Override
    public void addHitEffect(Fruit fruit, SwipeRenderer.SwipeContext ctx) {
      float   frameDuration               = 0.09f;
      Animation<TextureRegion> exploAnim  = new Animation<>(frameDuration, explosionKeyFrames);
      AnimationContext animCtx            = new AnimationContext();
      animCtx.x                           = fruit.getX();
      animCtx.y                           = fruit.getY();
      animCtx.animation                   = exploAnim;
      animCtx.stateTime                   = 0.0f;
      animCtx.finish                      = false;
      animCtx.fw                          = fruit.getWidth();
      animCtx.fh                          = fruit.getHeight();
      animCtx.scl                         = fruit.getScaleX()*2.5f;

      EffectLayer efr = (EffectLayer)holder;
      efr.animations.add(animCtx);
      explosion.play(Const.PREFS.VOLUME);
    }
  }

  private static class IceHitBehavior implements  HitBehavior {
    private Sound[]                         iceSound;

    IceHitBehavior() {
      iceSound = new Sound[] {
              AssetLoader.getSound("ice1"),
              AssetLoader.getSound("ice2"),
              AssetLoader.getSound("ice3")
      };
    }
    @Override
    public void addHitEffect(Fruit fruit, SwipeRenderer.SwipeContext ctx) {

      int i = MathUtils.random(0, 2);
      iceSound[i].play(Const.PREFS.VOLUME);
    }
  }

  /**********************************************************************************************/
  //blank behavior
  public static class BlankHitBehavior implements HitBehavior {
    @Override
    public void addHitEffect(Fruit fruit, SwipeRenderer.SwipeContext ctx) {

    }
  }

  /**********************************************************************************************/
  //blank behavior
  public static class SlashHitBehavior implements HitBehavior {
    Group holder;
    public SlashHitBehavior(Group holder) {
      this.holder = holder;
    }
    @Override
    public void addHitEffect(Fruit fruit, SwipeRenderer.SwipeContext ctx) {
      if (fruit.getType() < Fruit.N_FRUIT) {
        TextureRegion s = AssetLoader.getTextureRegion("fruit_slash");
        Image slash = new Image(s);
        slash.setOrigin(Align.center);
        slash.setRotation(ctx.swipeDirection.angle());
        float sy = fruit.getY() + fruit.getHeight()*fruit.getScaleY();
        slash.setPosition(fruit.getX(), sy);
        holder.addActor(slash);
        slash.addAction(Actions.sequence(
                Actions.scaleTo(SPLASH_SCL_MAX,SPLASH_SCL_MAX, SPLASH_DURATION/2f),
                Actions.scaleTo(SPLASH_SCL_MIN,SPLASH_SCL_MIN, SPLASH_DURATION/2f),
                Actions.run(() -> holder.removeActor(slash))
        ));
      }
    }
  }
}