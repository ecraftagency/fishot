package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class PetUpdateResponse
        implements io.protostuff.Message<PetUpdateResponse> {

    private static final PetUpdateResponse DEFAULT_INSTANCE = newBuilder().build();

    private int acc;

    private int accMax;

    private boolean unlock;

    private int unlockMoney;

    private int bonusGold;

    private boolean __merge_lock = false;
    private int __bitField0;

    private PetUpdateResponse() {
        this.acc = 0;
        this.accMax = 0;
        this.unlock = false;
        this.unlockMoney = 0;
        this.bonusGold = 0;
    }

    private PetUpdateResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static PetUpdateResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<PetUpdateResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getAcc() {
        return acc;
    }

    public boolean hasAcc() {
        return (__bitField0 & 1) == 1;
    }

    public PetUpdateResponse withAcc(int value) {
        return PetUpdateResponse.newBuilder()
            .mergeFrom(this)
            .setAcc(value)
            .build();
    }

    public int getAccMax() {
        return accMax;
    }

    public boolean hasAccMax() {
        return (__bitField0 & 2) == 2;
    }

    public PetUpdateResponse withAccMax(int value) {
        return PetUpdateResponse.newBuilder()
            .mergeFrom(this)
            .setAccMax(value)
            .build();
    }

    public boolean getUnlock() {
        return unlock;
    }

    public boolean hasUnlock() {
        return (__bitField0 & 4) == 4;
    }

    public PetUpdateResponse withUnlock(boolean value) {
        return PetUpdateResponse.newBuilder()
            .mergeFrom(this)
            .setUnlock(value)
            .build();
    }

    public int getUnlockMoney() {
        return unlockMoney;
    }

    public boolean hasUnlockMoney() {
        return (__bitField0 & 8) == 8;
    }

    public PetUpdateResponse withUnlockMoney(int value) {
        return PetUpdateResponse.newBuilder()
            .mergeFrom(this)
            .setUnlockMoney(value)
            .build();
    }

    public int getBonusGold() {
        return bonusGold;
    }

    public boolean hasBonusGold() {
        return (__bitField0 & 16) == 16;
    }

    public PetUpdateResponse withBonusGold(int value) {
        return PetUpdateResponse.newBuilder()
            .mergeFrom(this)
            .setBonusGold(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<PetUpdateResponse> cachedSchema() {
        return Schema.INSTANCE;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        PetUpdateResponse that = (PetUpdateResponse) obj;
        if (!java.util.Objects.equals(this.acc, that.acc)) {
            return false;
        }
        if (!java.util.Objects.equals(this.accMax, that.accMax)) {
            return false;
        }
        if (!java.util.Objects.equals(this.unlock, that.unlock)) {
            return false;
        }
        if (!java.util.Objects.equals(this.unlockMoney, that.unlockMoney)) {
            return false;
        }
        if (!java.util.Objects.equals(this.bonusGold, that.bonusGold)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.acc);
        result = 31 * result + Integer.hashCode(this.accMax);
        result = 31 * result + Boolean.hashCode(this.unlock);
        result = 31 * result + Integer.hashCode(this.unlockMoney);
        result = 31 * result + Integer.hashCode(this.bonusGold);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasAcc()) {
            parts.add("acc=" + getAcc());
        }
        if (hasAccMax()) {
            parts.add("accMax=" + getAccMax());
        }
        if (hasUnlock()) {
            parts.add("unlock=" + getUnlock());
        }
        if (hasUnlockMoney()) {
            parts.add("unlockMoney=" + getUnlockMoney());
        }
        if (hasBonusGold()) {
            parts.add("bonusGold=" + getBonusGold());
        }
        return "PetUpdateResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<PetUpdateResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("acc", 1);
        	__fieldMap.put("accMax", 2);
        	__fieldMap.put("unlock", 3);
        	__fieldMap.put("unlockMoney", 4);
        	__fieldMap.put("bonusGold", 5);
        }

        @Override
        public PetUpdateResponse newMessage() {
            return new PetUpdateResponse();
        }

        @Override
        public Class<PetUpdateResponse> typeClass() {
            return PetUpdateResponse.class;
        }

        @Override
        public String messageName() {
            return PetUpdateResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return PetUpdateResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(PetUpdateResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, PetUpdateResponse instance) throws java.io.IOException {
        	if (instance.__merge_lock) {
        		throw new IllegalStateException("Cannot reuse message instance");
        	} else {
        		instance.__merge_lock = true;
        	}
        	while(true) {
        		int number = input.readFieldNumber(this);
                if (number == 0) {
                    break;
                }
                switch(number) {
                    case 1:
                    	instance.acc = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.accMax = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.unlock = input.readBool();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.unlockMoney = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.bonusGold = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, PetUpdateResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.acc, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.accMax, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeBool(3, instance.unlock, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.unlockMoney, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.bonusGold, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "acc";
        		case 2: return "accMax";
        		case 3: return "unlock";
        		case 4: return "unlockMoney";
        		case 5: return "bonusGold";
        		default: return null;
        	}
        }

        @Override
        public int getFieldNumber(String name) {
        	final Integer number = __fieldMap.get(name);
        	return number == null ? 0 : number.intValue();
        }

    }

    public static final class Builder  {

        private int acc;

        private int accMax;

        private boolean unlock;

        private int unlockMoney;

        private int bonusGold;

        private int __bitField0;

        private Builder() {
            this.acc = 0;
            this.accMax = 0;
            this.unlock = false;
            this.unlockMoney = 0;
            this.bonusGold = 0;
        }

        public Builder mergeFrom(PetUpdateResponse instance) {
            if (instance.hasAcc()) {
                this.setAcc(instance.getAcc());
            }

            if (instance.hasAccMax()) {
                this.setAccMax(instance.getAccMax());
            }

            if (instance.hasUnlock()) {
                this.setUnlock(instance.getUnlock());
            }

            if (instance.hasUnlockMoney()) {
                this.setUnlockMoney(instance.getUnlockMoney());
            }

            if (instance.hasBonusGold()) {
                this.setBonusGold(instance.getBonusGold());
            }

            return this;
        }

        public int getAcc() {
            return acc;
        }

        public Builder setAcc(int value) {
            this.acc = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearAcc() {
            this.acc = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasAcc() {
            return (__bitField0 & 1) == 1;
        }

        public int getAccMax() {
            return accMax;
        }

        public Builder setAccMax(int value) {
            this.accMax = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearAccMax() {
            this.accMax = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasAccMax() {
            return (__bitField0 & 2) == 2;
        }

        public boolean getUnlock() {
            return unlock;
        }

        public Builder setUnlock(boolean value) {
            this.unlock = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearUnlock() {
            this.unlock = false;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasUnlock() {
            return (__bitField0 & 4) == 4;
        }

        public int getUnlockMoney() {
            return unlockMoney;
        }

        public Builder setUnlockMoney(int value) {
            this.unlockMoney = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearUnlockMoney() {
            this.unlockMoney = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasUnlockMoney() {
            return (__bitField0 & 8) == 8;
        }

        public int getBonusGold() {
            return bonusGold;
        }

        public Builder setBonusGold(int value) {
            this.bonusGold = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearBonusGold() {
            this.bonusGold = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasBonusGold() {
            return (__bitField0 & 16) == 16;
        }




        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || this.getClass() != obj.getClass()) {
                return false;
            }
            Builder that = (Builder) obj;
            if (!java.util.Objects.equals(this.acc, that.acc)) {
                return false;
            }
            if (!java.util.Objects.equals(this.accMax, that.accMax)) {
                return false;
            }
            if (!java.util.Objects.equals(this.unlock, that.unlock)) {
                return false;
            }
            if (!java.util.Objects.equals(this.unlockMoney, that.unlockMoney)) {
                return false;
            }
            if (!java.util.Objects.equals(this.bonusGold, that.bonusGold)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.acc);
            result = 31 * result + Integer.hashCode(this.accMax);
            result = 31 * result + Boolean.hashCode(this.unlock);
            result = 31 * result + Integer.hashCode(this.unlockMoney);
            result = 31 * result + Integer.hashCode(this.bonusGold);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasAcc()) {
                parts.add("acc=" + getAcc());
            }
            if (hasAccMax()) {
                parts.add("accMax=" + getAccMax());
            }
            if (hasUnlock()) {
                parts.add("unlock=" + getUnlock());
            }
            if (hasUnlockMoney()) {
                parts.add("unlockMoney=" + getUnlockMoney());
            }
            if (hasBonusGold()) {
                parts.add("bonusGold=" + getBonusGold());
            }
            return "PetUpdateResponse{" + String.join(", ", parts) + "}";
        }

        public PetUpdateResponse build() {
            proto.message.PetUpdateResponse result = new proto.message.PetUpdateResponse();
            result.__bitField0 = __bitField0;
            result.acc = this.acc;
            result.accMax = this.accMax;
            result.unlock = this.unlock;
            result.unlockMoney = this.unlockMoney;
            result.bonusGold = this.bonusGold;
            return result;
        }

    }



}