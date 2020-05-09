package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public enum SystemResultCode implements io.protostuff.EnumLite<SystemResultCode>{

    LOGIN_SUCCESS(1),
    LOGIN_FAIL_ERROR(-1),
    LOGIN_DELAY(-2),
    LOGIN_FAIL_BAN(-3),
    MESSAGE_NORMAL(-4),
    MESSAGE_LOW_VERSION(-5),
    MESSAGE_DAILY_SUPPORT(-6),
    MESSAGE_BROADCAST(-7),
    UNRECOGNIZED(-1);

    private final int value;

    private SystemResultCode(int n) {
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

    public static final SystemResultCode valueOf(int tag) {
        switch(tag) {
            case 1: return LOGIN_SUCCESS;
            case -1: return LOGIN_FAIL_ERROR;
            case -2: return LOGIN_DELAY;
            case -3: return LOGIN_FAIL_BAN;
            case -4: return MESSAGE_NORMAL;
            case -5: return MESSAGE_LOW_VERSION;
            case -6: return MESSAGE_DAILY_SUPPORT;
            case -7: return MESSAGE_BROADCAST;
            default: return UNRECOGNIZED;
        }
    }
}