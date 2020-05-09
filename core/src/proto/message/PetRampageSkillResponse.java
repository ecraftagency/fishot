package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class PetRampageSkillResponse
        implements io.protostuff.Message<PetRampageSkillResponse> {

    private static final PetRampageSkillResponse DEFAULT_INSTANCE = newBuilder().build();

    private int acc;

    private int accMax;

    private int cannonID;

    private int maxDuration;

    private float skillAccBuff;

    private boolean __merge_lock = false;
    private int __bitField0;

    private PetRampageSkillResponse() {
        this.acc = 0;
        this.accMax = 0;
        this.cannonID = 0;
        this.maxDuration = 0;
        this.skillAccBuff = 0f;
    }

    private PetRampageSkillResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static PetRampageSkillResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<PetRampageSkillResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getAcc() {
        return acc;
    }

    public boolean hasAcc() {
        return (__bitField0 & 1) == 1;
    }

    public PetRampageSkillResponse withAcc(int value) {
        return PetRampageSkillResponse.newBuilder()
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

    public PetRampageSkillResponse withAccMax(int value) {
        return PetRampageSkillResponse.newBuilder()
            .mergeFrom(this)
            .setAccMax(value)
            .build();
    }

    public int getCannonID() {
        return cannonID;
    }

    public boolean hasCannonID() {
        return (__bitField0 & 4) == 4;
    }

    public PetRampageSkillResponse withCannonID(int value) {
        return PetRampageSkillResponse.newBuilder()
            .mergeFrom(this)
            .setCannonID(value)
            .build();
    }

    public int getMaxDuration() {
        return maxDuration;
    }

    public boolean hasMaxDuration() {
        return (__bitField0 & 8) == 8;
    }

    public PetRampageSkillResponse withMaxDuration(int value) {
        return PetRampageSkillResponse.newBuilder()
            .mergeFrom(this)
            .setMaxDuration(value)
            .build();
    }

    public float getSkillAccBuff() {
        return skillAccBuff;
    }

    public boolean hasSkillAccBuff() {
        return (__bitField0 & 16) == 16;
    }

    public PetRampageSkillResponse withSkillAccBuff(float value) {
        return PetRampageSkillResponse.newBuilder()
            .mergeFrom(this)
            .setSkillAccBuff(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<PetRampageSkillResponse> cachedSchema() {
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
        PetRampageSkillResponse that = (PetRampageSkillResponse) obj;
        if (!java.util.Objects.equals(this.acc, that.acc)) {
            return false;
        }
        if (!java.util.Objects.equals(this.accMax, that.accMax)) {
            return false;
        }
        if (!java.util.Objects.equals(this.cannonID, that.cannonID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.maxDuration, that.maxDuration)) {
            return false;
        }
        if (!java.util.Objects.equals(this.skillAccBuff, that.skillAccBuff)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.acc);
        result = 31 * result + Integer.hashCode(this.accMax);
        result = 31 * result + Integer.hashCode(this.cannonID);
        result = 31 * result + Integer.hashCode(this.maxDuration);
        result = 31 * result + Float.hashCode(this.skillAccBuff);

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
        if (hasCannonID()) {
            parts.add("cannonID=" + getCannonID());
        }
        if (hasMaxDuration()) {
            parts.add("maxDuration=" + getMaxDuration());
        }
        if (hasSkillAccBuff()) {
            parts.add("skillAccBuff=" + getSkillAccBuff());
        }
        return "PetRampageSkillResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<PetRampageSkillResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("acc", 1);
        	__fieldMap.put("accMax", 2);
        	__fieldMap.put("cannonID", 3);
        	__fieldMap.put("maxDuration", 4);
        	__fieldMap.put("skillAccBuff", 5);
        }

        @Override
        public PetRampageSkillResponse newMessage() {
            return new PetRampageSkillResponse();
        }

        @Override
        public Class<PetRampageSkillResponse> typeClass() {
            return PetRampageSkillResponse.class;
        }

        @Override
        public String messageName() {
            return PetRampageSkillResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return PetRampageSkillResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(PetRampageSkillResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, PetRampageSkillResponse instance) throws java.io.IOException {
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
                    	instance.cannonID = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.maxDuration = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.skillAccBuff = input.readFloat();
                    	instance.__bitField0 |= 16;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, PetRampageSkillResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.acc, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.accMax, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.cannonID, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.maxDuration, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeFloat(5, instance.skillAccBuff, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "acc";
        		case 2: return "accMax";
        		case 3: return "cannonID";
        		case 4: return "maxDuration";
        		case 5: return "skillAccBuff";
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

        private int cannonID;

        private int maxDuration;

        private float skillAccBuff;

        private int __bitField0;

        private Builder() {
            this.acc = 0;
            this.accMax = 0;
            this.cannonID = 0;
            this.maxDuration = 0;
            this.skillAccBuff = 0f;
        }

        public Builder mergeFrom(PetRampageSkillResponse instance) {
            if (instance.hasAcc()) {
                this.setAcc(instance.getAcc());
            }

            if (instance.hasAccMax()) {
                this.setAccMax(instance.getAccMax());
            }

            if (instance.hasCannonID()) {
                this.setCannonID(instance.getCannonID());
            }

            if (instance.hasMaxDuration()) {
                this.setMaxDuration(instance.getMaxDuration());
            }

            if (instance.hasSkillAccBuff()) {
                this.setSkillAccBuff(instance.getSkillAccBuff());
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

        public int getCannonID() {
            return cannonID;
        }

        public Builder setCannonID(int value) {
            this.cannonID = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearCannonID() {
            this.cannonID = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasCannonID() {
            return (__bitField0 & 4) == 4;
        }

        public int getMaxDuration() {
            return maxDuration;
        }

        public Builder setMaxDuration(int value) {
            this.maxDuration = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearMaxDuration() {
            this.maxDuration = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasMaxDuration() {
            return (__bitField0 & 8) == 8;
        }

        public float getSkillAccBuff() {
            return skillAccBuff;
        }

        public Builder setSkillAccBuff(float value) {
            this.skillAccBuff = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearSkillAccBuff() {
            this.skillAccBuff = 0f;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasSkillAccBuff() {
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
            if (!java.util.Objects.equals(this.cannonID, that.cannonID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.maxDuration, that.maxDuration)) {
                return false;
            }
            if (!java.util.Objects.equals(this.skillAccBuff, that.skillAccBuff)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.acc);
            result = 31 * result + Integer.hashCode(this.accMax);
            result = 31 * result + Integer.hashCode(this.cannonID);
            result = 31 * result + Integer.hashCode(this.maxDuration);
            result = 31 * result + Float.hashCode(this.skillAccBuff);

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
            if (hasCannonID()) {
                parts.add("cannonID=" + getCannonID());
            }
            if (hasMaxDuration()) {
                parts.add("maxDuration=" + getMaxDuration());
            }
            if (hasSkillAccBuff()) {
                parts.add("skillAccBuff=" + getSkillAccBuff());
            }
            return "PetRampageSkillResponse{" + String.join(", ", parts) + "}";
        }

        public PetRampageSkillResponse build() {
            proto.message.PetRampageSkillResponse result = new proto.message.PetRampageSkillResponse();
            result.__bitField0 = __bitField0;
            result.acc = this.acc;
            result.accMax = this.accMax;
            result.cannonID = this.cannonID;
            result.maxDuration = this.maxDuration;
            result.skillAccBuff = this.skillAccBuff;
            return result;
        }

    }



}