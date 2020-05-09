package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public enum TypeBetMode implements io.protostuff.EnumLite<TypeBetMode>{

    TYPE_TIME_BET(1),
    TYPE_POINT_BET(2),
    UNRECOGNIZED(-1);

    private final int value;

    private TypeBetMode(int n) {
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

    public static final TypeBetMode valueOf(int tag) {
        switch(tag) {
            case 1: return TYPE_TIME_BET;
            case 2: return TYPE_POINT_BET;
            default: return UNRECOGNIZED;
        }
    }
}