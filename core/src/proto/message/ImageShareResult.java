package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public enum ImageShareResult implements io.protostuff.EnumLite<ImageShareResult>{

    SHARE_SUCCESS(1),
    SHARE_FAIL(2),
    UNRECOGNIZED(-1);

    private final int value;

    private ImageShareResult(int n) {
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

    public static final ImageShareResult valueOf(int tag) {
        switch(tag) {
            case 1: return SHARE_SUCCESS;
            case 2: return SHARE_FAIL;
            default: return UNRECOGNIZED;
        }
    }
}