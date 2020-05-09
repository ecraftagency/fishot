package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public enum SystemCommand implements io.protostuff.EnumLite<SystemCommand>{

    SYSTEM_MSG_PING(68),
    SYSTEM_MSG_ERROR_RESPONSE(69),
    SYSTEM_MSG_LOGIN_REQUEST(1),
    SYSTEM_MSG_LOGIN_RESPONSE(2),
    SYSTEM_MSG_PUSH_RESPONSE(3),
    SYSTEM_MSG_MAINTAIN_RESPONSE(4),
    SYSTEM_MSG_GAME_FUNC_RESPONSE(5),
    SYSTEM_MSG_ORBIT_DATA_CHECKSUM(6),
    SYSTEM_MSG_APPFLYERLOG_REQUEST(7),
    SYSTEM_MSG_SNS_SERVER_TOKEN_REQUEST(8),
    SYSTEM_MSG_SNS_SERVER_TOKEN_RESPONSE(9),
    SYSTEM_IMAGE_SHARE_REQUEST(10),
    SYSTEM_MSG_KEEP_HEARTBEAT(11),
    SYSTEM_MSG_NOTIFICATION_REQUEST(12),
    SYSTEM_MSG_NOTIFICATION_RESPONSE(13),
    SYSTEM_MSG_PUSH_REQUEST(14),
    SYSTEM_MSG_SERVER_STATUS_REQUEST(15),
    SYSTEM_MSG_SERVER_STATUS_RESPONSE(16),
    SYSTEM_MSG_SOCCER_CALLBACK_RESPONSE(17),
    SYSTEM_IMAGE_SHARE_INFO_REQUEST(18),
    SYSTEM_IMAGE_SHARE_INFO_RESPONSE(19),
    SYSTEM_IMAGE_SHARE_RESPONSE(20),
    SYSTEM_IMAGE_SHARE_BOARD_RESPONSE(21),
    SYSTEM_LANGUAGE_CHANGE_REQUEST(22),
    SYSTEM_LANGUAGE_CHANGE_RESPONSE(23),
    SYSTEM_MSG_PING_TEST_REQUEST(24),
    SYSTEM_MSG_PING_TEST_RESPONSE(25),
    SYSTEM_MSG_NETWORK_LOGGER_REQUEST(26),
    UNRECOGNIZED(-1);

    private final int value;

    private SystemCommand(int n) {
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

    public static final SystemCommand valueOf(int tag) {
        switch(tag) {
            case 68: return SYSTEM_MSG_PING;
            case 69: return SYSTEM_MSG_ERROR_RESPONSE;
            case 1: return SYSTEM_MSG_LOGIN_REQUEST;
            case 2: return SYSTEM_MSG_LOGIN_RESPONSE;
            case 3: return SYSTEM_MSG_PUSH_RESPONSE;
            case 4: return SYSTEM_MSG_MAINTAIN_RESPONSE;
            case 5: return SYSTEM_MSG_GAME_FUNC_RESPONSE;
            case 6: return SYSTEM_MSG_ORBIT_DATA_CHECKSUM;
            case 7: return SYSTEM_MSG_APPFLYERLOG_REQUEST;
            case 8: return SYSTEM_MSG_SNS_SERVER_TOKEN_REQUEST;
            case 9: return SYSTEM_MSG_SNS_SERVER_TOKEN_RESPONSE;
            case 10: return SYSTEM_IMAGE_SHARE_REQUEST;
            case 11: return SYSTEM_MSG_KEEP_HEARTBEAT;
            case 12: return SYSTEM_MSG_NOTIFICATION_REQUEST;
            case 13: return SYSTEM_MSG_NOTIFICATION_RESPONSE;
            case 14: return SYSTEM_MSG_PUSH_REQUEST;
            case 15: return SYSTEM_MSG_SERVER_STATUS_REQUEST;
            case 16: return SYSTEM_MSG_SERVER_STATUS_RESPONSE;
            case 17: return SYSTEM_MSG_SOCCER_CALLBACK_RESPONSE;
            case 18: return SYSTEM_IMAGE_SHARE_INFO_REQUEST;
            case 19: return SYSTEM_IMAGE_SHARE_INFO_RESPONSE;
            case 20: return SYSTEM_IMAGE_SHARE_RESPONSE;
            case 21: return SYSTEM_IMAGE_SHARE_BOARD_RESPONSE;
            case 22: return SYSTEM_LANGUAGE_CHANGE_REQUEST;
            case 23: return SYSTEM_LANGUAGE_CHANGE_RESPONSE;
            case 24: return SYSTEM_MSG_PING_TEST_REQUEST;
            case 25: return SYSTEM_MSG_PING_TEST_RESPONSE;
            case 26: return SYSTEM_MSG_NETWORK_LOGGER_REQUEST;
            default: return UNRECOGNIZED;
        }
    }
}