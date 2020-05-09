package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class IngamePetRampageEndSkillResponse
        implements io.protostuff.Message<IngamePetRampageEndSkillResponse> {

    private static final IngamePetRampageEndSkillResponse DEFAULT_INSTANCE = newBuilder().build();

    private String userId;

    private int gold;

    private int userGold;

    private int accumulation;

    private int accumulationMax;

    private boolean __merge_lock = false;
    private int __bitField0;

    private IngamePetRampageEndSkillResponse() {
        this.userId = "";
        this.gold = 0;
        this.userGold = 0;
        this.accumulation = 0;
        this.accumulationMax = 0;
    }

    private IngamePetRampageEndSkillResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static IngamePetRampageEndSkillResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<IngamePetRampageEndSkillResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getUserId() {
        return userId;
    }

    public boolean hasUserId() {
        return (__bitField0 & 1) == 1;
    }

    public IngamePetRampageEndSkillResponse withUserId(String value) {
        return IngamePetRampageEndSkillResponse.newBuilder()
            .mergeFrom(this)
            .setUserId(value)
            .build();
    }

    public int getGold() {
        return gold;
    }

    public boolean hasGold() {
        return (__bitField0 & 2) == 2;
    }

    public IngamePetRampageEndSkillResponse withGold(int value) {
        return IngamePetRampageEndSkillResponse.newBuilder()
            .mergeFrom(this)
            .setGold(value)
            .build();
    }

    public int getUserGold() {
        return userGold;
    }

    public boolean hasUserGold() {
        return (__bitField0 & 4) == 4;
    }

    public IngamePetRampageEndSkillResponse withUserGold(int value) {
        return IngamePetRampageEndSkillResponse.newBuilder()
            .mergeFrom(this)
            .setUserGold(value)
            .build();
    }

    public int getAccumulation() {
        return accumulation;
    }

    public boolean hasAccumulation() {
        return (__bitField0 & 8) == 8;
    }

    public IngamePetRampageEndSkillResponse withAccumulation(int value) {
        return IngamePetRampageEndSkillResponse.newBuilder()
            .mergeFrom(this)
            .setAccumulation(value)
            .build();
    }

    public int getAccumulationMax() {
        return accumulationMax;
    }

    public boolean hasAccumulationMax() {
        return (__bitField0 & 16) == 16;
    }

    public IngamePetRampageEndSkillResponse withAccumulationMax(int value) {
        return IngamePetRampageEndSkillResponse.newBuilder()
            .mergeFrom(this)
            .setAccumulationMax(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<IngamePetRampageEndSkillResponse> cachedSchema() {
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
        IngamePetRampageEndSkillResponse that = (IngamePetRampageEndSkillResponse) obj;
        if (!java.util.Objects.equals(this.userId, that.userId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gold, that.gold)) {
            return false;
        }
        if (!java.util.Objects.equals(this.userGold, that.userGold)) {
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
        result = 31 * result + Integer.hashCode(this.gold);
        result = 31 * result + Integer.hashCode(this.userGold);
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
        if (hasGold()) {
            parts.add("gold=" + getGold());
        }
        if (hasUserGold()) {
            parts.add("userGold=" + getUserGold());
        }
        if (hasAccumulation()) {
            parts.add("accumulation=" + getAccumulation());
        }
        if (hasAccumulationMax()) {
            parts.add("accumulationMax=" + getAccumulationMax());
        }
        return "IngamePetRampageEndSkillResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<IngamePetRampageEndSkillResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("userId", 1);
        	__fieldMap.put("gold", 2);
        	__fieldMap.put("userGold", 3);
        	__fieldMap.put("accumulation", 4);
        	__fieldMap.put("accumulationMax", 5);
        }

        @Override
        public IngamePetRampageEndSkillResponse newMessage() {
            return new IngamePetRampageEndSkillResponse();
        }

        @Override
        public Class<IngamePetRampageEndSkillResponse> typeClass() {
            return IngamePetRampageEndSkillResponse.class;
        }

        @Override
        public String messageName() {
            return IngamePetRampageEndSkillResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return IngamePetRampageEndSkillResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(IngamePetRampageEndSkillResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, IngamePetRampageEndSkillResponse instance) throws java.io.IOException {
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
                    	instance.gold = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.userGold = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.accumulation = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.accumulationMax = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, IngamePetRampageEndSkillResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.userId, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.gold, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.userGold, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.accumulation, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.accumulationMax, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "userId";
        		case 2: return "gold";
        		case 3: return "userGold";
        		case 4: return "accumulation";
        		case 5: return "accumulationMax";
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

        private int gold;

        private int userGold;

        private int accumulation;

        private int accumulationMax;

        private int __bitField0;

        private Builder() {
            this.userId = "";
            this.gold = 0;
            this.userGold = 0;
            this.accumulation = 0;
            this.accumulationMax = 0;
        }

        public Builder mergeFrom(IngamePetRampageEndSkillResponse instance) {
            if (instance.hasUserId()) {
                this.setUserId(instance.getUserId());
            }

            if (instance.hasGold()) {
                this.setGold(instance.getGold());
            }

            if (instance.hasUserGold()) {
                this.setUserGold(instance.getUserGold());
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
                throw new NullPointerException("Cannot set IngamePetRampageEndSkillResponse#userId to null");
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

        public int getUserGold() {
            return userGold;
        }

        public Builder setUserGold(int value) {
            this.userGold = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearUserGold() {
            this.userGold = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasUserGold() {
            return (__bitField0 & 4) == 4;
        }

        public int getAccumulation() {
            return accumulation;
        }

        public Builder setAccumulation(int value) {
            this.accumulation = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearAccumulation() {
            this.accumulation = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasAccumulation() {
            return (__bitField0 & 8) == 8;
        }

        public int getAccumulationMax() {
            return accumulationMax;
        }

        public Builder setAccumulationMax(int value) {
            this.accumulationMax = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearAccumulationMax() {
            this.accumulationMax = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasAccumulationMax() {
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
            if (!java.util.Objects.equals(this.userId, that.userId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gold, that.gold)) {
                return false;
            }
            if (!java.util.Objects.equals(this.userGold, that.userGold)) {
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
            result = 31 * result + Integer.hashCode(this.gold);
            result = 31 * result + Integer.hashCode(this.userGold);
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
            if (hasGold()) {
                parts.add("gold=" + getGold());
            }
            if (hasUserGold()) {
                parts.add("userGold=" + getUserGold());
            }
            if (hasAccumulation()) {
                parts.add("accumulation=" + getAccumulation());
            }
            if (hasAccumulationMax()) {
                parts.add("accumulationMax=" + getAccumulationMax());
            }
            return "IngamePetRampageEndSkillResponse{" + String.join(", ", parts) + "}";
        }

        public IngamePetRampageEndSkillResponse build() {
            proto.message.IngamePetRampageEndSkillResponse result = new proto.message.IngamePetRampageEndSkillResponse();
            result.__bitField0 = __bitField0;
            result.userId = this.userId;
            result.gold = this.gold;
            result.userGold = this.userGold;
            result.accumulation = this.accumulation;
            result.accumulationMax = this.accumulationMax;
            return result;
        }

    }



}