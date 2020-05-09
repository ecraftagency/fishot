package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public enum SoccerResult implements io.protostuff.EnumLite<SoccerResult>{

    RESULT_SUCCESS(1),
    RESULT_SUCCESS_NOT_UPDATE(2),
    RESULT_FAIL(3),
    RESULT_FAIL_OUT_MAX(4),
    RESULT_FAIL_OUT_MIN(5),
    RESULT_FAIL_OUT_MONEY(6),
    RESULT_FAIL_OUT_MATCH(7),
    RESULT_FAIL_TIME_OVER(8),
    RESULT_FAIL_NO_MATCH(9),
    RESULT_FAIL_ALREADY_RECEIVE(10),
    UNRECOGNIZED(-1);

    private final int value;

    private SoccerResult(int n) {
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

    public static final SoccerResult valueOf(int tag) {
        switch(tag) {
            case 1: return RESULT_SUCCESS;
            case 2: return RESULT_SUCCESS_NOT_UPDATE;
            case 3: return RESULT_FAIL;
            case 4: return RESULT_FAIL_OUT_MAX;
            case 5: return RESULT_FAIL_OUT_MIN;
            case 6: return RESULT_FAIL_OUT_MONEY;
            case 7: return RESULT_FAIL_OUT_MATCH;
            case 8: return RESULT_FAIL_TIME_OVER;
            case 9: return RESULT_FAIL_NO_MATCH;
            case 10: return RESULT_FAIL_ALREADY_RECEIVE;
            default: return UNRECOGNIZED;
        }
    }
}