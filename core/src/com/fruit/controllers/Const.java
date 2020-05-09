package com.fruit.controllers;

public class Const {
  public static class CLASSIC {
    public static float         PAD_LEFT                    = -100;
    public static float         PAD_RIGHT                   = -200;

    public static float         STEP_DURATION               = 0.5f;
    public static float         FINISH_DURATION             = 2f;
    public static float         STEP_DECREASE               = -0.02f;
    public static float         MIN_STEP_DECREASE           = -0.3f;

    public static int           MIN_COUNT                   = 2;
    public static int           MAX_COUNT                   = 4;
    public static float         COUNT_INCREASE              = 0.1f;
    public static float         MAX_COUNT_INCREASE          = 6.4f;

    public static float         MIN_VEL_X                   = 0;
    public static float         MAX_VEL_X                   = 400;

    public static float         MIN_VEL_Y                   = 900;
    public static float         MAX_VEL_Y                   = 1100;

    public static float         MIN_ANGULAR_VEL             = 150;
    public static float         MAX_ANGULAR_VEL             = 250;

    public static float         DEFAULT_Y                   = -210;

    public static float         BOMB_RATE                   = 200;
    public static float         BOMB_RATE_INCREASE          = 1;
    public static float         MAX_BOMB_RATE_INCREASE      = 100;

    public static float         ICE_RATE                    = 200;

    public static float         MIN_THROW_SPEED             = 1f;
    public static float         MAX_THROW_SPEED             = 1.1f;
    public static float         THROW_SPEED_INCREASE        = 0.01f;
    public static float         MAX_THROW_SPEED_INCREASE    = 2f;

    public static boolean       HAVE_BOMB                   = true;   // enable/disable bomb
    public static boolean       HAVE_ICE                    = true;   // enable/disable ice
    public static int           SCORE_PER_HIT               = 50;
    public static int           SESSION_NLIFE               = 3;
  }

  public static class TIMING {
    public static float         TIME_OUT                    = 90; //second

    public static float         PAD_LEFT                    = -100;
    public static float         PAD_RIGHT                   = -200;

    public static float         STEP_DURATION               = 0.5f;
    public static float         FINISH_DURATION             = 2f;

    public static int           MIN_COUNT                   = 4;
    public static int           MAX_COUNT                   = 8;

    public static float         MIN_VEL_X                   = 0;
    public static float         MAX_VEL_X                   = 400;

    public static float         MIN_VEL_Y                   = 900;
    public static float         MAX_VEL_Y                   = 1100;

    public static float         MIN_ANGULAR_VEL             = 150;
    public static float         MAX_ANGULAR_VEL             = 250;

    public static float         DEFAULT_Y                   = -210;

    public static float         MIN_THROW_SPEED             = 1f;
    public static float         MAX_THROW_SPEED             = 1.1f;
  }

  public static class QUEUE {
    public static int           MAX_QUEUE_CAPACITY          = 6;
    public static float         QUEUE_SPEED_SCALE           = 3;
    public static float         QUEUE_SPEED_SCALE_DURATION  = 1;
    public static float         DEAD_DELAY                  = 2.5f;
    public static int           SCORE_PER_HIT               = 50;
    public static float         QUEUE_IN_DURATION           = 2;

    public static float         PAD_LEFT                    = 200;
    public static float         PAD_RIGHT                   = -200;

    public static float         STEP_DURATION               = 0.15f;
    public static float         FINISH_DURATION             = 3f;

    public static float         MIN_VEL_X                   = 0;
    public static float         MAX_VEL_X                   = 300;

    public static float         MIN_VEL_Y                   = 800;
    public static float         MAX_VEL_Y                   = 1100;

    public static float         MIN_ANGULAR_VEL             = 150;
    public static float         MAX_ANGULAR_VEL             = 250;

    public static float         DEFAULT_Y                   = -210;

    public static float         MIN_THROW_SPEED             = 1f;
    public static float         MAX_THROW_SPEED             = 1.1f;
  }

  public static class SLICE {
    public static float         STAGE_TIME                  = 55;

    public static float         PAD_LEFT                    = -100;
    public static float         PAD_RIGHT                   = -200;

    public static float         STEP_DURATION               = 0.4f;
    public static float         FINISH_DURATION             = 3.5f;
    public static float         STEP_DECREASE               = -0.02f;
    public static float         MIN_STEP_DECREASE           = -0.3f;

    public static int           MIN_COUNT                   = 2;
    public static int           MAX_COUNT                   = 8;
    public static float         COUNT_INCREASE              = 0.1f;
    public static float         MAX_COUNT_INCREASE          = 6.4f;

    public static float         MIN_VEL_X                   = 0;
    public static float         MAX_VEL_X                   = 400;

    public static float         MIN_VEL_Y                   = 900;
    public static float         MAX_VEL_Y                   = 1100;

    public static float         MIN_ANGULAR_VEL             = 150;
    public static float         MAX_ANGULAR_VEL             = 250;

    public static float         DEFAULT_Y                   = -210;

    public static float         BOMB_RATE                   = 200;
    public static float         BOMB_RATE_INCREASE          = 1;
    public static float         MAX_BOMB_RATE_INCREASE      = 100;

    public static float         ICE_RATE                    = 200;

    public static float         MIN_THROW_SPEED             = 1f;
    public static float         MAX_THROW_SPEED             = 1.1f;
    public static float         THROW_SPEED_INCREASE        = 0.01f;
    public static float         MAX_THROW_SPEED_INCREASE    = 2f;
  }

  public static class Combo {
    public static float         COMBO_THRESHOLD             = 0.022f;
    public static int           MIN_COMBO_COUNT             = 2;
  }

  public static class PREF_KEYS {
    public static String  CLASSIC_HIGH_SCORE                = "classic_high_score";
    public static String  QUEUE_HIGH_SCORE                  = "queue_high_score";
    public static String  TIMING_HIGH_SCORE                 = "timing_high_score";
    public static String  SLICE_HIGH_SCORE                  = "slice_high_score";
  }
}