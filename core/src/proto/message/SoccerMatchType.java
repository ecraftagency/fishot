package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public enum SoccerMatchType implements io.protostuff.EnumLite<SoccerMatchType>{

    MATCH_TYPE_NEXT_MATCHES(1),
    MATCH_TYPE_RESULT(2),
    MATCH_TYPE_HISTORY(3),
    UNRECOGNIZED(-1);

    private final int value;

    private SoccerMatchType(int n) {
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

    public static final SoccerMatchType valueOf(int tag) {
        switch(tag) {
            case 1: return MATCH_TYPE_NEXT_MATCHES;
            case 2: return MATCH_TYPE_RESULT;
            case 3: return MATCH_TYPE_HISTORY;
            default: return UNRECOGNIZED;
        }
    }
}