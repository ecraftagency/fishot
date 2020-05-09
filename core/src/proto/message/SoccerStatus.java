package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public enum SoccerStatus implements io.protostuff.EnumLite<SoccerStatus>{

    STATUS_LIVE(1),
    STATUS_FINISH(2),
    STATUS_CANCEL(3),
    UNRECOGNIZED(-1);

    private final int value;

    private SoccerStatus(int n) {
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

    public static final SoccerStatus valueOf(int tag) {
        switch(tag) {
            case 1: return STATUS_LIVE;
            case 2: return STATUS_FINISH;
            case 3: return STATUS_CANCEL;
            default: return UNRECOGNIZED;
        }
    }
}