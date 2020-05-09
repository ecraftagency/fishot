package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class PetUnlockResponse
        implements io.protostuff.Message<PetUnlockResponse> {

    private static final PetUnlockResponse DEFAULT_INSTANCE = newBuilder().build();

    private int result;

    private int gold;

    private int bonusGold;

    private boolean __merge_lock = false;
    private int __bitField0;

    private PetUnlockResponse() {
        this.result = proto.message.PetResult.PET_RESULT_SUCCESS.getNumber();
        this.gold = 0;
        this.bonusGold = 0;
    }

    private PetUnlockResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static PetUnlockResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<PetUnlockResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public proto.message.PetResult getResult() {
        return proto.message.PetResult.valueOf(result);
    }

    public int getResultValue() {
        return result;
    }

    public boolean hasResult() {
        return (__bitField0 & 1) == 1;
    }

    public PetUnlockResponse withResult(proto.message.PetResult value) {
        return PetUnlockResponse.newBuilder()
            .mergeFrom(this)
            .setResult(value)
            .build();
    }

    public int getGold() {
        return gold;
    }

    public boolean hasGold() {
        return (__bitField0 & 2) == 2;
    }

    public PetUnlockResponse withGold(int value) {
        return PetUnlockResponse.newBuilder()
            .mergeFrom(this)
            .setGold(value)
            .build();
    }

    public int getBonusGold() {
        return bonusGold;
    }

    public boolean hasBonusGold() {
        return (__bitField0 & 4) == 4;
    }

    public PetUnlockResponse withBonusGold(int value) {
        return PetUnlockResponse.newBuilder()
            .mergeFrom(this)
            .setBonusGold(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<PetUnlockResponse> cachedSchema() {
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
        PetUnlockResponse that = (PetUnlockResponse) obj;
        if (!java.util.Objects.equals(this.result, that.result)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gold, that.gold)) {
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
        result = 31 * result + Integer.hashCode(this.result);
        result = 31 * result + Integer.hashCode(this.gold);
        result = 31 * result + Integer.hashCode(this.bonusGold);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasResult()) {
            parts.add("result=" + getResult() + '(' + getResultValue() + ')');
        }
        if (hasGold()) {
            parts.add("gold=" + getGold());
        }
        if (hasBonusGold()) {
            parts.add("bonusGold=" + getBonusGold());
        }
        return "PetUnlockResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<PetUnlockResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("result", 1);
        	__fieldMap.put("gold", 2);
        	__fieldMap.put("bonusGold", 3);
        }

        @Override
        public PetUnlockResponse newMessage() {
            return new PetUnlockResponse();
        }

        @Override
        public Class<PetUnlockResponse> typeClass() {
            return PetUnlockResponse.class;
        }

        @Override
        public String messageName() {
            return PetUnlockResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return PetUnlockResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(PetUnlockResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, PetUnlockResponse instance) throws java.io.IOException {
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
                    	instance.result = input.readEnum();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.gold = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.bonusGold = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, PetUnlockResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.result, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.gold, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.bonusGold, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "result";
        		case 2: return "gold";
        		case 3: return "bonusGold";
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

        private int result;

        private int gold;

        private int bonusGold;

        private int __bitField0;

        private Builder() {
            this.result = proto.message.PetResult.PET_RESULT_SUCCESS.getNumber();
            this.gold = 0;
            this.bonusGold = 0;
        }

        public Builder mergeFrom(PetUnlockResponse instance) {
            if (instance.hasResult()) {
                this.setResult(instance.getResult());
            }

            if (instance.hasGold()) {
                this.setGold(instance.getGold());
            }

            if (instance.hasBonusGold()) {
                this.setBonusGold(instance.getBonusGold());
            }

            return this;
        }

        public proto.message.PetResult getResult() {
            return proto.message.PetResult.valueOf(result);
        }

        public int getResultValue() {
            return result;
        }

        public Builder setResult(proto.message.PetResult value) {
            if (value == null) {
                throw new NullPointerException("Cannot set PetUnlockResponse#result to null");
            }

            if (value == proto.message.PetResult.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set PetUnlockResponse#result to UNRECOGNIZED");
            }

            this.result = value.getNumber();
            __bitField0 |= 1;
            return this;
        }

        public Builder setResultValue(int value) {
            this.result = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearResult() {
            this.result = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasResult() {
            return (__bitField0 & 1) == 1;
        }

        public int getGold() {
            return gold;
        }

        public Builder setGold(int value) {
            this.gold = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearGold() {
            this.gold = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasGold() {
            return (__bitField0 & 2) == 2;
        }

        public int getBonusGold() {
            return bonusGold;
        }

        public Builder setBonusGold(int value) {
            this.bonusGold = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearBonusGold() {
            this.bonusGold = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasBonusGold() {
            return (__bitField0 & 4) == 4;
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
            if (!java.util.Objects.equals(this.result, that.result)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gold, that.gold)) {
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
            result = 31 * result + Integer.hashCode(this.result);
            result = 31 * result + Integer.hashCode(this.gold);
            result = 31 * result + Integer.hashCode(this.bonusGold);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasResult()) {
                parts.add("result=" + getResult() + '(' + getResultValue() + ')');
            }
            if (hasGold()) {
                parts.add("gold=" + getGold());
            }
            if (hasBonusGold()) {
                parts.add("bonusGold=" + getBonusGold());
            }
            return "PetUnlockResponse{" + String.join(", ", parts) + "}";
        }

        public PetUnlockResponse build() {
            proto.message.PetUnlockResponse result = new proto.message.PetUnlockResponse();
            result.__bitField0 = __bitField0;
            result.result = this.result;
            result.gold = this.gold;
            result.bonusGold = this.bonusGold;
            return result;
        }

    }



}