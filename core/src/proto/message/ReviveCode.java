package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public enum ReviveCode implements io.protostuff.EnumLite<ReviveCode>{

    REVIVE_CODE_SUCCESS(1),
    REVIVE_CODE_FAIL_EXPIRED(2),
    UNRECOGNIZED(-1);

    private final int value;

    private ReviveCode(int n) {
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

    public static final ReviveCode valueOf(int tag) {
        switch(tag) {
            case 1: return REVIVE_CODE_SUCCESS;
            case 2: return REVIVE_CODE_FAIL_EXPIRED;
            default: return UNRECOGNIZED;
        }
    }
}