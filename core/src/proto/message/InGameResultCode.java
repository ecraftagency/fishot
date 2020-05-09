package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public enum InGameResultCode implements io.protostuff.EnumLite<InGameResultCode>{

    JOIN_BOARD_SUCCESS_PLAY(1),
    JOIN_BOARD_SUCCESS_VIEW(2),
    JOIN_GAME_SUCCESS(3),
    JOIN_ROOM_SUCCESS(4),
    SET_BET_MONEY_SUCCESS(5),
    SET_MAX_PLAYER_SUCCESS(6),
    SOLO_RECEIVER_ACCEPT(7),
    USE_ITEM_SUCCESS(8),
    UDP_ESTABLISH_SUCCESS(9),
    JOIN_BOARD_FAIL_PASSWORD(-1),
    JOIN_BOARD_FAIL_MONEY(-2),
    JOIN_BOARD_ERROR(-3),
    JOIN_GAME_FAIL(-4),
    JOIN_ROOM_FAIL_MONEY(-5),
    JOIN_ROOM_FAIL_ERROR(-6),
    SET_BET_MONEY_FAIL(-7),
    SET_MAX_PLAYER_FAIL(-8),
    JOIN_BOARD_FAIL_FULL(-9),
    SOLO_DENY_RECEIVER_BUSY(-10),
    SOLO_DENY_RECEIVER_OFFLINE(-11),
    SOLO_DENY_RECEIVER_MONEY(-12),
    SOLO_DENY_SENDER_MONEY(-13),
    USE_ITEM_FAILED_MONEY(-14),
    USE_ITEM_FAILED_ITEM(-15),
    USE_ITEM_FAILED_USER(-16),
    SOLO_DENY_SENDER_COOL_DOWN(-17),
    SOLO_DENY_SENDER_ABORT(-18),
    JOIN_BOARD_FAIL_SOLO(-19),
    SOLO_DENY_RECEIVER_ABORT(-20),
    SOLO_DENY_MAINTAIN(-21),
    USE_ITEM_FAILED_MAINTAIN(-22),
    CREATE_BOARD_SUCCESS(-23),
    CREATE_BOARD_FAIL(-24),
    CREATE_BOARD_FAIL_MONEY(-25),
    CREATE_BOARD_FAIL_CHANNEL(-26),
    USE_ITEM_FAILED_ALREADY_USED(-27),
    USE_ITEM_FAILED_NO_ITEM(-28),
    UDP_ESTABLISH_FAIL(-29),
    USE_ITEM_FAILED_BLOCKED(-30),
    UNRECOGNIZED(-1);

    private final int value;

    private InGameResultCode(int n) {
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

    public static final InGameResultCode valueOf(int tag) {
        switch(tag) {
            case 1: return JOIN_BOARD_SUCCESS_PLAY;
            case 2: return JOIN_BOARD_SUCCESS_VIEW;
            case 3: return JOIN_GAME_SUCCESS;
            case 4: return JOIN_ROOM_SUCCESS;
            case 5: return SET_BET_MONEY_SUCCESS;
            case 6: return SET_MAX_PLAYER_SUCCESS;
            case 7: return SOLO_RECEIVER_ACCEPT;
            case 8: return USE_ITEM_SUCCESS;
            case 9: return UDP_ESTABLISH_SUCCESS;
            case -1: return JOIN_BOARD_FAIL_PASSWORD;
            case -2: return JOIN_BOARD_FAIL_MONEY;
            case -3: return JOIN_BOARD_ERROR;
            case -4: return JOIN_GAME_FAIL;
            case -5: return JOIN_ROOM_FAIL_MONEY;
            case -6: return JOIN_ROOM_FAIL_ERROR;
            case -7: return SET_BET_MONEY_FAIL;
            case -8: return SET_MAX_PLAYER_FAIL;
            case -9: return JOIN_BOARD_FAIL_FULL;
            case -10: return SOLO_DENY_RECEIVER_BUSY;
            case -11: return SOLO_DENY_RECEIVER_OFFLINE;
            case -12: return SOLO_DENY_RECEIVER_MONEY;
            case -13: return SOLO_DENY_SENDER_MONEY;
            case -14: return USE_ITEM_FAILED_MONEY;
            case -15: return USE_ITEM_FAILED_ITEM;
            case -16: return USE_ITEM_FAILED_USER;
            case -17: return SOLO_DENY_SENDER_COOL_DOWN;
            case -18: return SOLO_DENY_SENDER_ABORT;
            case -19: return JOIN_BOARD_FAIL_SOLO;
            case -20: return SOLO_DENY_RECEIVER_ABORT;
            case -21: return SOLO_DENY_MAINTAIN;
            case -22: return USE_ITEM_FAILED_MAINTAIN;
            case -23: return CREATE_BOARD_SUCCESS;
            case -24: return CREATE_BOARD_FAIL;
            case -25: return CREATE_BOARD_FAIL_MONEY;
            case -26: return CREATE_BOARD_FAIL_CHANNEL;
            case -27: return USE_ITEM_FAILED_ALREADY_USED;
            case -28: return USE_ITEM_FAILED_NO_ITEM;
            case -29: return UDP_ESTABLISH_FAIL;
            case -30: return USE_ITEM_FAILED_BLOCKED;
            default: return UNRECOGNIZED;
        }
    }
}