package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public enum ListType implements io.protostuff.EnumLite<ListType>{

    PENDING_LIST(1),
    SWIMMING_LIST(2),
    BOSSES_LIST(3),
    UNRECOGNIZED(-1);

    private final int value;

    private ListType(int n) {
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

    public static final ListType valueOf(int tag) {
        switch(tag) {
            case 1: return PENDING_LIST;
            case 2: return SWIMMING_LIST;
            case 3: return BOSSES_LIST;
            default: return UNRECOGNIZED;
        }
    }
}