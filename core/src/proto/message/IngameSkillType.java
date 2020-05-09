package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public enum IngameSkillType implements io.protostuff.EnumLite<IngameSkillType>{

    TYPE_NORMAL_BULLET(0),
    TYPE_FREE_BULLET(1),
    TYPE_BUFF_BULLET(2),
    UNRECOGNIZED(-1);

    private final int value;

    private IngameSkillType(int n) {
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

    public static final IngameSkillType valueOf(int tag) {
        switch(tag) {
            case 0: return TYPE_NORMAL_BULLET;
            case 1: return TYPE_FREE_BULLET;
            case 2: return TYPE_BUFF_BULLET;
            default: return UNRECOGNIZED;
        }
    }
}