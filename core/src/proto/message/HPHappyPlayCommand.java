package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_happy_play.proto")
public enum HPHappyPlayCommand implements io.protostuff.EnumLite<HPHappyPlayCommand>{

    HAPPY_PLAY_REFUND_EVENT_REQUEST(11),
    HAPPY_PLAY_REFUND_EVENT_RESPONSE(12),
    HAPPY_PLAY_APPLE_IAP_INFO_REQUEST(13),
    HAPPY_PLAY_APPLE_IAP_INFO_RESPONSE(14),
    HAPPY_PLAY_APPLE_IAP_BUY_REQUEST(15),
    HAPPY_PLAY_APPLE_IAP_BUY_RESPONSE(16),
    HAPPY_PLAY_GOOGLE_IAP_INFO_REQUEST(19),
    HAPPY_PLAY_GOOGLE_IAP_INFO_RESPONSE(20),
    HAPPY_PLAY_GOOGLE_IAP_BUY_REQUEST(21),
    HAPPY_PLAY_GOOGLE_IAP_BUY_RESPONSE(22),
    HAPPY_PLAY_LOM_INFO_REQUEST(27),
    HAPPY_PLAY_LOM_INFO_RESPONSE(28),
    HAPPY_PLAY_LOM_URL_REQUEST(29),
    HAPPY_PLAY_LOM_URL_RESPONSE(30),
    HAPPY_PLAY_LOM_BUY_REQUEST(31),
    HAPPY_PLAY_LOM_BUY_RESPONSE(32),
    HAPPY_PLAY_BP_INFO_REQUEST(33),
    HAPPY_PLAY_BP_INFO_RESPONSE(34),
    HAPPY_PLAY_BP_URL_REQUEST(35),
    HAPPY_PLAY_BP_URL_RESPONSE(36),
    HAPPY_PLAY_BP_BUY_REQUEST(37),
    HAPPY_PLAY_BP_BUY_RESPONSE(38),
    HAPPY_PLAY_LOM_GLOBAL_INFO_REQUEST(39),
    HAPPY_PLAY_LOM_GLOBAL_INFO_RESPONSE(40),
    HAPPY_PLAY_LOM_GLOBAL_URL_REQUEST(41),
    HAPPY_PLAY_LOM_GLOBAL_URL_RESPONSE(42),
    HAPPY_PLAY_LOM_GLOBAL_BUY_REQUEST(43),
    HAPPY_PLAY_LOM_GLOBAL_BUY_RESPONSE(44),
    HAPPY_PLAY_PROMOTION_INFO_REQUEST(45),
    HAPPY_PLAY_PROMOTION_INFO_RESPONSE(46),
    HAPPY_PLAY_BOOSTER_PACK_INFO_REQUEST(47),
    HAPPY_PLAY_BOOSTER_PACK_INFO_RESPONSE(48),
    HAPPY_PLAY_CD_INFO_REQUEST(49),
    HAPPY_PLAY_CD_INFO_RESPONSE(50),
    HAPPY_PLAY_CD_BUY_REQUEST(51),
    HAPPY_PLAY_CD_BUY_RESPONSE(52),
    HAPPY_PLAY_SPECIAL_OFFER_PACK_INFO_REQUEST(53),
    HAPPY_PLAY_SPECIAL_OFFER_PACK_INFO_RESPONSE(54),
    UNRECOGNIZED(-1);

    private final int value;

    private HPHappyPlayCommand(int n) {
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

    public static final HPHappyPlayCommand valueOf(int tag) {
        switch(tag) {
            case 11: return HAPPY_PLAY_REFUND_EVENT_REQUEST;
            case 12: return HAPPY_PLAY_REFUND_EVENT_RESPONSE;
            case 13: return HAPPY_PLAY_APPLE_IAP_INFO_REQUEST;
            case 14: return HAPPY_PLAY_APPLE_IAP_INFO_RESPONSE;
            case 15: return HAPPY_PLAY_APPLE_IAP_BUY_REQUEST;
            case 16: return HAPPY_PLAY_APPLE_IAP_BUY_RESPONSE;
            case 19: return HAPPY_PLAY_GOOGLE_IAP_INFO_REQUEST;
            case 20: return HAPPY_PLAY_GOOGLE_IAP_INFO_RESPONSE;
            case 21: return HAPPY_PLAY_GOOGLE_IAP_BUY_REQUEST;
            case 22: return HAPPY_PLAY_GOOGLE_IAP_BUY_RESPONSE;
            case 27: return HAPPY_PLAY_LOM_INFO_REQUEST;
            case 28: return HAPPY_PLAY_LOM_INFO_RESPONSE;
            case 29: return HAPPY_PLAY_LOM_URL_REQUEST;
            case 30: return HAPPY_PLAY_LOM_URL_RESPONSE;
            case 31: return HAPPY_PLAY_LOM_BUY_REQUEST;
            case 32: return HAPPY_PLAY_LOM_BUY_RESPONSE;
            case 33: return HAPPY_PLAY_BP_INFO_REQUEST;
            case 34: return HAPPY_PLAY_BP_INFO_RESPONSE;
            case 35: return HAPPY_PLAY_BP_URL_REQUEST;
            case 36: return HAPPY_PLAY_BP_URL_RESPONSE;
            case 37: return HAPPY_PLAY_BP_BUY_REQUEST;
            case 38: return HAPPY_PLAY_BP_BUY_RESPONSE;
            case 39: return HAPPY_PLAY_LOM_GLOBAL_INFO_REQUEST;
            case 40: return HAPPY_PLAY_LOM_GLOBAL_INFO_RESPONSE;
            case 41: return HAPPY_PLAY_LOM_GLOBAL_URL_REQUEST;
            case 42: return HAPPY_PLAY_LOM_GLOBAL_URL_RESPONSE;
            case 43: return HAPPY_PLAY_LOM_GLOBAL_BUY_REQUEST;
            case 44: return HAPPY_PLAY_LOM_GLOBAL_BUY_RESPONSE;
            case 45: return HAPPY_PLAY_PROMOTION_INFO_REQUEST;
            case 46: return HAPPY_PLAY_PROMOTION_INFO_RESPONSE;
            case 47: return HAPPY_PLAY_BOOSTER_PACK_INFO_REQUEST;
            case 48: return HAPPY_PLAY_BOOSTER_PACK_INFO_RESPONSE;
            case 49: return HAPPY_PLAY_CD_INFO_REQUEST;
            case 50: return HAPPY_PLAY_CD_INFO_RESPONSE;
            case 51: return HAPPY_PLAY_CD_BUY_REQUEST;
            case 52: return HAPPY_PLAY_CD_BUY_RESPONSE;
            case 53: return HAPPY_PLAY_SPECIAL_OFFER_PACK_INFO_REQUEST;
            case 54: return HAPPY_PLAY_SPECIAL_OFFER_PACK_INFO_RESPONSE;
            default: return UNRECOGNIZED;
        }
    }
}