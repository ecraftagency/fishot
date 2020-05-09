package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public enum SoccerPredictedType implements io.protostuff.EnumLite<SoccerPredictedType>{

    PREDICTION_SCORE(1),
    PREDICTION_WIN_LOSE(2),
    PREDICTION_TOTAL_SCORE(3),
    UNRECOGNIZED(-1);

    private final int value;

    private SoccerPredictedType(int n) {
        this.value = n;
    }

    @Override
    public int getNumber() {
        if (value == -1) {
          throw new java.lang.IllegalStateException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
    }

    public static final SoccerPredictedType valueOf(int tag) {
        switch(tag) {
            case 1: return PREDICTION_SCORE;
            case 2: return PREDICTION_WIN_LOSE;
            case 3: return PREDICTION_TOTAL_SCORE;
            default: return UNRECOGNIZED;
        }
    }
}