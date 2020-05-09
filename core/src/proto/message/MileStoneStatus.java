package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public enum MileStoneStatus implements io.protostuff.EnumLite<MileStoneStatus>{

    LOCK(1),
    UNLOCKED(2),
    CLAIMED(3),
    UNRECOGNIZED(-1);

    private final int value;

    private MileStoneStatus(int n) {
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

    public static final MileStoneStatus valueOf(int tag) {
        switch(tag) {
            case 1: return LOCK;
            case 2: return UNLOCKED;
            case 3: return CLAIMED;
            default: return UNRECOGNIZED;
        }
    }
}