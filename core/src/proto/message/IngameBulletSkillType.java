package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public enum IngameBulletSkillType implements io.protostuff.EnumLite<IngameBulletSkillType>{

    TYPE_NORMAL_SKILL_BULLET(0),
    TYPE_JUMP_SKILL_BULLET(1),
    UNRECOGNIZED(-1);

    private final int value;

    private IngameBulletSkillType(int n) {
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

    public static final IngameBulletSkillType valueOf(int tag) {
        switch(tag) {
            case 0: return TYPE_NORMAL_SKILL_BULLET;
            case 1: return TYPE_JUMP_SKILL_BULLET;
            default: return UNRECOGNIZED;
        }
    }
}