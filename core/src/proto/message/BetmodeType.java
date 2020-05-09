package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public enum BetmodeType implements io.protostuff.EnumLite<BetmodeType>{

    TYPE_NORMAL(1),
    TYPE_COMPARISION(2),
    TYPE_LUCKY_STAR(3),
    UNRECOGNIZED(-1);

    private final int value;

    private BetmodeType(int n) {
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

    public static final BetmodeType valueOf(int tag) {
        switch(tag) {
            case 1: return TYPE_NORMAL;
            case 2: return TYPE_COMPARISION;
            case 3: return TYPE_LUCKY_STAR;
            default: return UNRECOGNIZED;
        }
    }
}