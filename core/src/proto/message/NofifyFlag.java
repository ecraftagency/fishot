package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public enum NofifyFlag implements io.protostuff.EnumLite<NofifyFlag>{

    NOTIFY_TEXT(0),
    NOTIFY_NEW_VER(1),
    NOTIFY_SNS_FRIEND_INVITE(2),
    NOTIFY_BET_MODE(3),
    UNRECOGNIZED(-1);

    private final int value;

    private NofifyFlag(int n) {
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

    public static final NofifyFlag valueOf(int tag) {
        switch(tag) {
            case 0: return NOTIFY_TEXT;
            case 1: return NOTIFY_NEW_VER;
            case 2: return NOTIFY_SNS_FRIEND_INVITE;
            case 3: return NOTIFY_BET_MODE;
            default: return UNRECOGNIZED;
        }
    }
}