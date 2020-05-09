package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public enum InboxItemType implements io.protostuff.EnumLite<InboxItemType>{

    INBOX_TYPE_MONEY_UNLOCK(1),
    INBOX_TYPE_MONEY_LOCK(2),
    INBOX_TYPE_USER_EXP(3),
    INBOX_TYPE_SYSTEM_MESSAGE(4),
    INBOX_TYPE_FRIEND_MESSAGE(5),
    INBOX_TYPE_USER_MESSAGE(6),
    INBOX_TYPE_OPT_CODE(7),
    INBOX_TYPE_ONLINE_REWARD(8),
    INBOX_TYPE_UPGARDE_REWARD(9),
    INBOX_TYPE_PEARL(10),
    INBOX_TYPE_SYSTEM_REPLY(11),
    INBOX_TYPE_TICKET_FREE(12),
    INBOX_TYPE_TICKET_VIP(13),
    INBOX_TYPE_CASHOUT(14),
    INBOX_TYPE_PET_PIECE(15),
    INBOX_TYPE_INVENTORY_ITEM(16),
    INBOX_TYPE_INGAME_ITEM(17),
    UNRECOGNIZED(-1);

    private final int value;

    private InboxItemType(int n) {
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

    public static final InboxItemType valueOf(int tag) {
        switch(tag) {
            case 1: return INBOX_TYPE_MONEY_UNLOCK;
            case 2: return INBOX_TYPE_MONEY_LOCK;
            case 3: return INBOX_TYPE_USER_EXP;
            case 4: return INBOX_TYPE_SYSTEM_MESSAGE;
            case 5: return INBOX_TYPE_FRIEND_MESSAGE;
            case 6: return INBOX_TYPE_USER_MESSAGE;
            case 7: return INBOX_TYPE_OPT_CODE;
            case 8: return INBOX_TYPE_ONLINE_REWARD;
            case 9: return INBOX_TYPE_UPGARDE_REWARD;
            case 10: return INBOX_TYPE_PEARL;
            case 11: return INBOX_TYPE_SYSTEM_REPLY;
            case 12: return INBOX_TYPE_TICKET_FREE;
            case 13: return INBOX_TYPE_TICKET_VIP;
            case 14: return INBOX_TYPE_CASHOUT;
            case 15: return INBOX_TYPE_PET_PIECE;
            case 16: return INBOX_TYPE_INVENTORY_ITEM;
            case 17: return INBOX_TYPE_INGAME_ITEM;
            default: return UNRECOGNIZED;
        }
    }
}