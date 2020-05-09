package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class IngamePetRampagePreSkillResponse
        implements io.protostuff.Message<IngamePetRampagePreSkillResponse> {

    private static final IngamePetRampagePreSkillResponse DEFAULT_INSTANCE = newBuilder().build();

    private String userId;

    private int accumulation;

    private int accumulationMax;

    private boolean __merge_lock = false;
    private int __bitField0;

    private IngamePetRampagePreSkillResponse() {
        this.userId = "";
        this.accumulation = 0;
        this.accumulationMax = 0;
    }

    private IngamePetRampagePreSkillResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static IngamePetRampagePreSkillResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<IngamePetRampagePreSkillResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getUserId() {
        return userId;
    }

    public boolean hasUserId() {
        return (__bitField0 & 1) == 1;
    }

    public IngamePetRampagePreSkillResponse withUserId(String value) {
        return IngamePetRampagePreSkillResponse.newBuilder()
            .mergeFrom(this)
            .setUserId(value)
            .build();
    }

    public int getAccumulation() {
        return accumulation;
    }

    public boolean hasAccumulation() {
        return (__bitField0 & 2) == 2;
    }

    public IngamePetRampagePreSkillResponse withAccumulation(int value) {
        return IngamePetRampagePreSkillResponse.newBuilder()
            .mergeFrom(this)
            .setAccumulation(value)
            .build();
    }

    public int getAccumulationMax() {
        return accumulationMax;
    }

    public boolean hasAccumulationMax() {
        return (__bitField0 & 4) == 4;
    }

    public IngamePetRampagePreSkillResponse withAccumulationMax(int value) {
        return IngamePetRampagePreSkillResponse.newBuilder()
            .mergeFrom(this)
            .setAccumulationMax(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<IngamePetRampagePreSkillResponse> cachedSchema() {
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
        IngamePetRampagePreSkillResponse that = (IngamePetRampagePreSkillResponse) obj;
        if (!java.util.Objects.equals(this.userId, that.userId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.accumulation, that.accumulation)) {
            return false;
        }
        if (!java.util.Objects.equals(this.accumulationMax, that.accumulationMax)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.userId == null ? 0 : this.userId.hashCode());
        result = 31 * result + Integer.hashCode(this.accumulation);
        result = 31 * result + Integer.hashCode(this.accumulationMax);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasUserId()) {
            parts.add("userId=" + getUserId());
        }
        if (hasAccumulation()) {
            parts.add("accumulation=" + getAccumulation());
        }
        if (hasAccumulationMax()) {
            parts.add("accumulationMax=" + getAccumulationMax());
        }
        return "IngamePetRampagePreSkillResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<IngamePetRampagePreSkillResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("userId", 1);
        	__fieldMap.put("accumulation", 2);
        	__fieldMap.put("accumulationMax", 3);
        }

        @Override
        public IngamePetRampagePreSkillResponse newMessage() {
            return new IngamePetRampagePreSkillResponse();
        }

        @Override
        public Class<IngamePetRampagePreSkillResponse> typeClass() {
            return IngamePetRampagePreSkillResponse.class;
        }

        @Override
        public String messageName() {
            return IngamePetRampagePreSkillResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return IngamePetRampagePreSkillResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(IngamePetRampagePreSkillResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, IngamePetRampagePreSkillResponse instance) throws java.io.IOException {
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
                    	instance.userId = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.accumulation = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.accumulationMax = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, IngamePetRampagePreSkillResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.userId, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.accumulation, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.accumulationMax, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "userId";
        		case 2: return "accumulation";
        		case 3: return "accumulationMax";
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

        private String userId;

        private int accumulation;

        private int accumulationMax;

        private int __bitField0;

        private Builder() {
            this.userId = "";
            this.accumulation = 0;
            this.accumulationMax = 0;
        }

        public Builder mergeFrom(IngamePetRampagePreSkillResponse instance) {
            if (instance.hasUserId()) {
                this.setUserId(instance.getUserId());
            }

            if (instance.hasAccumulation()) {
                this.setAccumulation(instance.getAccumulation());
            }

            if (instance.hasAccumulationMax()) {
                this.setAccumulationMax(instance.getAccumulationMax());
            }

            return this;
        }

        public String getUserId() {
            return userId;
        }

        public Builder setUserId(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set IngamePetRampagePreSkillResponse#userId to null");
            }

            this.userId = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearUserId() {
            this.userId = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasUserId() {
            return (__bitField0 & 1) == 1;
        }

        public int getAccumulation() {
            return accumulation;
        }

        public Builder setAccumulation(int value) {
            this.accumulation = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearAccumulation() {
            this.accumulation = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasAccumulation() {
            return (__bitField0 & 2) == 2;
        }

        public int getAccumulationMax() {
            return accumulationMax;
        }

        public Builder setAccumulationMax(int value) {
            this.accumulationMax = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearAccumulationMax() {
            this.accumulationMax = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasAccumulationMax() {
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
            if (!java.util.Objects.equals(this.userId, that.userId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.accumulation, that.accumulation)) {
                return false;
            }
            if (!java.util.Objects.equals(this.accumulationMax, that.accumulationMax)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.userId == null ? 0 : this.userId.hashCode());
            result = 31 * result + Integer.hashCode(this.accumulation);
            result = 31 * result + Integer.hashCode(this.accumulationMax);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasUserId()) {
                parts.add("userId=" + getUserId());
            }
            if (hasAccumulation()) {
                parts.add("accumulation=" + getAccumulation());
            }
            if (hasAccumulationMax()) {
                parts.add("accumulationMax=" + getAccumulationMax());
            }
            return "IngamePetRampagePreSkillResponse{" + String.join(", ", parts) + "}";
        }

        public IngamePetRampagePreSkillResponse build() {
            proto.message.IngamePetRampagePreSkillResponse result = new proto.message.IngamePetRampagePreSkillResponse();
            result.__bitField0 = __bitField0;
            result.userId = this.userId;
            result.accumulation = this.accumulation;
            result.accumulationMax = this.accumulationMax;
            return result;
        }

    }



}