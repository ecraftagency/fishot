package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class IngameSkillResponse
        implements io.protostuff.Message<IngameSkillResponse> {

    private static final IngameSkillResponse DEFAULT_INSTANCE = newBuilder().build();

    private int skillType;

    private boolean active;

    private int gold;

    private String userId;

    private int freeTime;

    private int freeTimeAdd;

    private boolean __merge_lock = false;
    private int __bitField0;

    private IngameSkillResponse() {
        this.skillType = proto.message.IngameSkillType.TYPE_NORMAL_BULLET.getNumber();
        this.active = false;
        this.gold = 0;
        this.userId = "";
        this.freeTime = 0;
        this.freeTimeAdd = 0;
    }

    private IngameSkillResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static IngameSkillResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<IngameSkillResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public proto.message.IngameSkillType getSkillType() {
        return proto.message.IngameSkillType.valueOf(skillType);
    }

    public int getSkillTypeValue() {
        return skillType;
    }

    public boolean hasSkillType() {
        return (__bitField0 & 1) == 1;
    }

    public IngameSkillResponse withSkillType(proto.message.IngameSkillType value) {
        return IngameSkillResponse.newBuilder()
            .mergeFrom(this)
            .setSkillType(value)
            .build();
    }

    public boolean getActive() {
        return active;
    }

    public boolean hasActive() {
        return (__bitField0 & 2) == 2;
    }

    public IngameSkillResponse withActive(boolean value) {
        return IngameSkillResponse.newBuilder()
            .mergeFrom(this)
            .setActive(value)
            .build();
    }

    public int getGold() {
        return gold;
    }

    public boolean hasGold() {
        return (__bitField0 & 4) == 4;
    }

    public IngameSkillResponse withGold(int value) {
        return IngameSkillResponse.newBuilder()
            .mergeFrom(this)
            .setGold(value)
            .build();
    }

    public String getUserId() {
        return userId;
    }

    public boolean hasUserId() {
        return (__bitField0 & 8) == 8;
    }

    public IngameSkillResponse withUserId(String value) {
        return IngameSkillResponse.newBuilder()
            .mergeFrom(this)
            .setUserId(value)
            .build();
    }

    public int getFreeTime() {
        return freeTime;
    }

    public boolean hasFreeTime() {
        return (__bitField0 & 16) == 16;
    }

    public IngameSkillResponse withFreeTime(int value) {
        return IngameSkillResponse.newBuilder()
            .mergeFrom(this)
            .setFreeTime(value)
            .build();
    }

    public int getFreeTimeAdd() {
        return freeTimeAdd;
    }

    public boolean hasFreeTimeAdd() {
        return (__bitField0 & 32) == 32;
    }

    public IngameSkillResponse withFreeTimeAdd(int value) {
        return IngameSkillResponse.newBuilder()
            .mergeFrom(this)
            .setFreeTimeAdd(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<IngameSkillResponse> cachedSchema() {
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
        IngameSkillResponse that = (IngameSkillResponse) obj;
        if (!java.util.Objects.equals(this.skillType, that.skillType)) {
            return false;
        }
        if (!java.util.Objects.equals(this.active, that.active)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gold, that.gold)) {
            return false;
        }
        if (!java.util.Objects.equals(this.userId, that.userId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.freeTime, that.freeTime)) {
            return false;
        }
        if (!java.util.Objects.equals(this.freeTimeAdd, that.freeTimeAdd)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.skillType);
        result = 31 * result + Boolean.hashCode(this.active);
        result = 31 * result + Integer.hashCode(this.gold);
        result = 31 * result + (this.userId == null ? 0 : this.userId.hashCode());
        result = 31 * result + Integer.hashCode(this.freeTime);
        result = 31 * result + Integer.hashCode(this.freeTimeAdd);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasSkillType()) {
            parts.add("skillType=" + getSkillType() + '(' + getSkillTypeValue() + ')');
        }
        if (hasActive()) {
            parts.add("active=" + getActive());
        }
        if (hasGold()) {
            parts.add("gold=" + getGold());
        }
        if (hasUserId()) {
            parts.add("userId=" + getUserId());
        }
        if (hasFreeTime()) {
            parts.add("freeTime=" + getFreeTime());
        }
        if (hasFreeTimeAdd()) {
            parts.add("freeTimeAdd=" + getFreeTimeAdd());
        }
        return "IngameSkillResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<IngameSkillResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("skillType", 1);
        	__fieldMap.put("active", 2);
        	__fieldMap.put("gold", 3);
        	__fieldMap.put("userId", 4);
        	__fieldMap.put("freeTime", 5);
        	__fieldMap.put("freeTimeAdd", 6);
        }

        @Override
        public IngameSkillResponse newMessage() {
            return new IngameSkillResponse();
        }

        @Override
        public Class<IngameSkillResponse> typeClass() {
            return IngameSkillResponse.class;
        }

        @Override
        public String messageName() {
            return IngameSkillResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return IngameSkillResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(IngameSkillResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, IngameSkillResponse instance) throws java.io.IOException {
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
                    	instance.skillType = input.readEnum();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.active = input.readBool();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.gold = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.userId = input.readString();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.freeTime = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.freeTimeAdd = input.readInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, IngameSkillResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.skillType, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeBool(2, instance.active, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.gold, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeString(4, instance.userId, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.freeTime, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeInt32(6, instance.freeTimeAdd, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "skillType";
        		case 2: return "active";
        		case 3: return "gold";
        		case 4: return "userId";
        		case 5: return "freeTime";
        		case 6: return "freeTimeAdd";
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

        private int skillType;

        private boolean active;

        private int gold;

        private String userId;

        private int freeTime;

        private int freeTimeAdd;

        private int __bitField0;

        private Builder() {
            this.skillType = proto.message.IngameSkillType.TYPE_NORMAL_BULLET.getNumber();
            this.active = false;
            this.gold = 0;
            this.userId = "";
            this.freeTime = 0;
            this.freeTimeAdd = 0;
        }

        public Builder mergeFrom(IngameSkillResponse instance) {
            if (instance.hasSkillType()) {
                this.setSkillType(instance.getSkillType());
            }

            if (instance.hasActive()) {
                this.setActive(instance.getActive());
            }

            if (instance.hasGold()) {
                this.setGold(instance.getGold());
            }

            if (instance.hasUserId()) {
                this.setUserId(instance.getUserId());
            }

            if (instance.hasFreeTime()) {
                this.setFreeTime(instance.getFreeTime());
            }

            if (instance.hasFreeTimeAdd()) {
                this.setFreeTimeAdd(instance.getFreeTimeAdd());
            }

            return this;
        }

        public proto.message.IngameSkillType getSkillType() {
            return proto.message.IngameSkillType.valueOf(skillType);
        }

        public int getSkillTypeValue() {
            return skillType;
        }

        public Builder setSkillType(proto.message.IngameSkillType value) {
            if (value == null) {
                throw new NullPointerException("Cannot set IngameSkillResponse#skillType to null");
            }

            if (value == proto.message.IngameSkillType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set IngameSkillResponse#skillType to UNRECOGNIZED");
            }

            this.skillType = value.getNumber();
            __bitField0 |= 1;
            return this;
        }

        public Builder setSkillTypeValue(int value) {
            this.skillType = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearSkillType() {
            this.skillType = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasSkillType() {
            return (__bitField0 & 1) == 1;
        }

        public boolean getActive() {
            return active;
        }

        public Builder setActive(boolean value) {
            this.active = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearActive() {
            this.active = false;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasActive() {
            return (__bitField0 & 2) == 2;
        }

        public int getGold() {
            return gold;
        }

        public Builder setGold(int value) {
            this.gold = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearGold() {
            this.gold = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasGold() {
            return (__bitField0 & 4) == 4;
        }

        public String getUserId() {
            return userId;
        }

        public Builder setUserId(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set IngameSkillResponse#userId to null");
            }

            this.userId = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearUserId() {
            this.userId = "";
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasUserId() {
            return (__bitField0 & 8) == 8;
        }

        public int getFreeTime() {
            return freeTime;
        }

        public Builder setFreeTime(int value) {
            this.freeTime = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearFreeTime() {
            this.freeTime = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasFreeTime() {
            return (__bitField0 & 16) == 16;
        }

        public int getFreeTimeAdd() {
            return freeTimeAdd;
        }

        public Builder setFreeTimeAdd(int value) {
            this.freeTimeAdd = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearFreeTimeAdd() {
            this.freeTimeAdd = 0;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasFreeTimeAdd() {
            return (__bitField0 & 32) == 32;
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
            if (!java.util.Objects.equals(this.skillType, that.skillType)) {
                return false;
            }
            if (!java.util.Objects.equals(this.active, that.active)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gold, that.gold)) {
                return false;
            }
            if (!java.util.Objects.equals(this.userId, that.userId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.freeTime, that.freeTime)) {
                return false;
            }
            if (!java.util.Objects.equals(this.freeTimeAdd, that.freeTimeAdd)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.skillType);
            result = 31 * result + Boolean.hashCode(this.active);
            result = 31 * result + Integer.hashCode(this.gold);
            result = 31 * result + (this.userId == null ? 0 : this.userId.hashCode());
            result = 31 * result + Integer.hashCode(this.freeTime);
            result = 31 * result + Integer.hashCode(this.freeTimeAdd);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasSkillType()) {
                parts.add("skillType=" + getSkillType() + '(' + getSkillTypeValue() + ')');
            }
            if (hasActive()) {
                parts.add("active=" + getActive());
            }
            if (hasGold()) {
                parts.add("gold=" + getGold());
            }
            if (hasUserId()) {
                parts.add("userId=" + getUserId());
            }
            if (hasFreeTime()) {
                parts.add("freeTime=" + getFreeTime());
            }
            if (hasFreeTimeAdd()) {
                parts.add("freeTimeAdd=" + getFreeTimeAdd());
            }
            return "IngameSkillResponse{" + String.join(", ", parts) + "}";
        }

        public IngameSkillResponse build() {
            proto.message.IngameSkillResponse result = new proto.message.IngameSkillResponse();
            result.__bitField0 = __bitField0;
            result.skillType = this.skillType;
            result.active = this.active;
            result.gold = this.gold;
            result.userId = this.userId;
            result.freeTime = this.freeTime;
            result.freeTimeAdd = this.freeTimeAdd;
            return result;
        }

    }



}