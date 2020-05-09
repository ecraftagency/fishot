package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public enum PetResult implements io.protostuff.EnumLite<PetResult>{

    PET_RESULT_SUCCESS(1),
    PET_RESULT_FAIL(2),
    PET_RESULT_FAIL_MONEY(3),
    PET_RESULT_SUCCESS_WHEEL(4),
    PET_RESULT_SUCCESS_GOLD(5),
    PET_RESULT_FAIL_RECEIVED(6),
    UNRECOGNIZED(-1);

    private final int value;

    private PetResult(int n) {
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

    public static final PetResult valueOf(int tag) {
        switch(tag) {
            case 1: return PET_RESULT_SUCCESS;
            case 2: return PET_RESULT_FAIL;
            case 3: return PET_RESULT_FAIL_MONEY;
            case 4: return PET_RESULT_SUCCESS_WHEEL;
            case 5: return PET_RESULT_SUCCESS_GOLD;
            case 6: return PET_RESULT_FAIL_RECEIVED;
            default: return UNRECOGNIZED;
        }
    }
}