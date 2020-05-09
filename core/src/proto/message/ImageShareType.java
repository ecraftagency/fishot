package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public enum ImageShareType implements io.protostuff.EnumLite<ImageShareType>{

    SHARE_NORMAL(1),
    SHARE_BOARD(2),
    UNRECOGNIZED(-1);

    private final int value;

    private ImageShareType(int n) {
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

    public static final ImageShareType valueOf(int tag) {
        switch(tag) {
            case 1: return SHARE_NORMAL;
            case 2: return SHARE_BOARD;
            default: return UNRECOGNIZED;
        }
    }
}