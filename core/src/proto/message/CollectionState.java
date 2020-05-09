package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public enum CollectionState implements io.protostuff.EnumLite<CollectionState>{

    STATE_LOCK(1),
    STATE_UNLOCK(2),
    UNRECOGNIZED(-1);

    private final int value;

    private CollectionState(int n) {
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

    public static final CollectionState valueOf(int tag) {
        switch(tag) {
            case 1: return STATE_LOCK;
            case 2: return STATE_UNLOCK;
            default: return UNRECOGNIZED;
        }
    }
}