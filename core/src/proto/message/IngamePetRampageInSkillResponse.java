package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class IngamePetRampageInSkillResponse
        implements io.protostuff.Message<IngamePetRampageInSkillResponse> {

    private static final IngamePetRampageInSkillResponse DEFAULT_INSTANCE = newBuilder().build();

    private String userId;

    private int gold;

    private long skillTimeCurrent;

    private long skillTimeMax;

    private long skillDuration;

    private int userGold;

    private int cannonId;

    private int level;

    private int bulletSkillType;

    private boolean __merge_lock = false;
    private int __bitField0;

    private IngamePetRampageInSkillResponse() {
        this.userId = "";
        this.gold = 0;
        this.skillTimeCurrent = 0L;
        this.skillTimeMax = 0L;
        this.skillDuration = 0L;
        this.userGold = 0;
        this.cannonId = 0;
        this.level = 0;
        this.bulletSkillType = 0;
    }

    private IngamePetRampageInSkillResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static IngamePetRampageInSkillResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<IngamePetRampageInSkillResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getUserId() {
        return userId;
    }

    public boolean hasUserId() {
        return (__bitField0 & 1) == 1;
    }

    public IngamePetRampageInSkillResponse withUserId(String value) {
        return IngamePetRampageInSkillResponse.newBuilder()
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

    public IngamePetRampageInSkillResponse withGold(int value) {
        return IngamePetRampageInSkillResponse.newBuilder()
            .mergeFrom(this)
            .setGold(value)
            .build();
    }

    public long getSkillTimeCurrent() {
        return skillTimeCurrent;
    }

    public boolean hasSkillTimeCurrent() {
        return (__bitField0 & 4) == 4;
    }

    public IngamePetRampageInSkillResponse withSkillTimeCurrent(long value) {
        return IngamePetRampageInSkillResponse.newBuilder()
            .mergeFrom(this)
            .setSkillTimeCurrent(value)
            .build();
    }

    public long getSkillTimeMax() {
        return skillTimeMax;
    }

    public boolean hasSkillTimeMax() {
        return (__bitField0 & 8) == 8;
    }

    public IngamePetRampageInSkillResponse withSkillTimeMax(long value) {
        return IngamePetRampageInSkillResponse.newBuilder()
            .mergeFrom(this)
            .setSkillTimeMax(value)
            .build();
    }

    public long getSkillDuration() {
        return skillDuration;
    }

    public boolean hasSkillDuration() {
        return (__bitField0 & 16) == 16;
    }

    public IngamePetRampageInSkillResponse withSkillDuration(long value) {
        return IngamePetRampageInSkillResponse.newBuilder()
            .mergeFrom(this)
            .setSkillDuration(value)
            .build();
    }

    public int getUserGold() {
        return userGold;
    }

    public boolean hasUserGold() {
        return (__bitField0 & 32) == 32;
    }

    public IngamePetRampageInSkillResponse withUserGold(int value) {
        return IngamePetRampageInSkillResponse.newBuilder()
            .mergeFrom(this)
            .setUserGold(value)
            .build();
    }

    public int getCannonId() {
        return cannonId;
    }

    public boolean hasCannonId() {
        return (__bitField0 & 64) == 64;
    }

    public IngamePetRampageInSkillResponse withCannonId(int value) {
        return IngamePetRampageInSkillResponse.newBuilder()
            .mergeFrom(this)
            .setCannonId(value)
            .build();
    }

    public int getLevel() {
        return level;
    }

    public boolean hasLevel() {
        return (__bitField0 & 128) == 128;
    }

    public IngamePetRampageInSkillResponse withLevel(int value) {
        return IngamePetRampageInSkillResponse.newBuilder()
            .mergeFrom(this)
            .setLevel(value)
            .build();
    }

    public int getBulletSkillType() {
        return bulletSkillType;
    }

    public boolean hasBulletSkillType() {
        return (__bitField0 & 256) == 256;
    }

    public IngamePetRampageInSkillResponse withBulletSkillType(int value) {
        return IngamePetRampageInSkillResponse.newBuilder()
            .mergeFrom(this)
            .setBulletSkillType(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<IngamePetRampageInSkillResponse> cachedSchema() {
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
        IngamePetRampageInSkillResponse that = (IngamePetRampageInSkillResponse) obj;
        if (!java.util.Objects.equals(this.userId, that.userId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gold, that.gold)) {
            return false;
        }
        if (!java.util.Objects.equals(this.skillTimeCurrent, that.skillTimeCurrent)) {
            return false;
        }
        if (!java.util.Objects.equals(this.skillTimeMax, that.skillTimeMax)) {
            return false;
        }
        if (!java.util.Objects.equals(this.skillDuration, that.skillDuration)) {
            return false;
        }
        if (!java.util.Objects.equals(this.userGold, that.userGold)) {
            return false;
        }
        if (!java.util.Objects.equals(this.cannonId, that.cannonId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.level, that.level)) {
            return false;
        }
        if (!java.util.Objects.equals(this.bulletSkillType, that.bulletSkillType)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.userId == null ? 0 : this.userId.hashCode());
        result = 31 * result + Integer.hashCode(this.gold);
        result = 31 * result + Long.hashCode(this.skillTimeCurrent);
        result = 31 * result + Long.hashCode(this.skillTimeMax);
        result = 31 * result + Long.hashCode(this.skillDuration);
        result = 31 * result + Integer.hashCode(this.userGold);
        result = 31 * result + Integer.hashCode(this.cannonId);
        result = 31 * result + Integer.hashCode(this.level);
        result = 31 * result + Integer.hashCode(this.bulletSkillType);

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
        if (hasSkillTimeCurrent()) {
            parts.add("skillTimeCurrent=" + getSkillTimeCurrent());
        }
        if (hasSkillTimeMax()) {
            parts.add("skillTimeMax=" + getSkillTimeMax());
        }
        if (hasSkillDuration()) {
            parts.add("skillDuration=" + getSkillDuration());
        }
        if (hasUserGold()) {
            parts.add("userGold=" + getUserGold());
        }
        if (hasCannonId()) {
            parts.add("cannonId=" + getCannonId());
        }
        if (hasLevel()) {
            parts.add("level=" + getLevel());
        }
        if (hasBulletSkillType()) {
            parts.add("bulletSkillType=" + getBulletSkillType());
        }
        return "IngamePetRampageInSkillResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<IngamePetRampageInSkillResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("userId", 1);
        	__fieldMap.put("gold", 2);
        	__fieldMap.put("skillTimeCurrent", 3);
        	__fieldMap.put("skillTimeMax", 4);
        	__fieldMap.put("skillDuration", 5);
        	__fieldMap.put("userGold", 6);
        	__fieldMap.put("cannonId", 7);
        	__fieldMap.put("level", 8);
        	__fieldMap.put("bulletSkillType", 9);
        }

        @Override
        public IngamePetRampageInSkillResponse newMessage() {
            return new IngamePetRampageInSkillResponse();
        }

        @Override
        public Class<IngamePetRampageInSkillResponse> typeClass() {
            return IngamePetRampageInSkillResponse.class;
        }

        @Override
        public String messageName() {
            return IngamePetRampageInSkillResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return IngamePetRampageInSkillResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(IngamePetRampageInSkillResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, IngamePetRampageInSkillResponse instance) throws java.io.IOException {
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
                    	instance.skillTimeCurrent = input.readInt64();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.skillTimeMax = input.readInt64();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.skillDuration = input.readInt64();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.userGold = input.readInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.cannonId = input.readInt32();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.level = input.readInt32();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 9:
                    	instance.bulletSkillType = input.readInt32();
                    	instance.__bitField0 |= 256;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, IngamePetRampageInSkillResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.userId, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.gold, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt64(3, instance.skillTimeCurrent, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt64(4, instance.skillTimeMax, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt64(5, instance.skillDuration, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeInt32(6, instance.userGold, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeInt32(7, instance.cannonId, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeInt32(8, instance.level, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeInt32(9, instance.bulletSkillType, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "userId";
        		case 2: return "gold";
        		case 3: return "skillTimeCurrent";
        		case 4: return "skillTimeMax";
        		case 5: return "skillDuration";
        		case 6: return "userGold";
        		case 7: return "cannonId";
        		case 8: return "level";
        		case 9: return "bulletSkillType";
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

        private long skillTimeCurrent;

        private long skillTimeMax;

        private long skillDuration;

        private int userGold;

        private int cannonId;

        private int level;

        private int bulletSkillType;

        private int __bitField0;

        private Builder() {
            this.userId = "";
            this.gold = 0;
            this.skillTimeCurrent = 0L;
            this.skillTimeMax = 0L;
            this.skillDuration = 0L;
            this.userGold = 0;
            this.cannonId = 0;
            this.level = 0;
            this.bulletSkillType = 0;
        }

        public Builder mergeFrom(IngamePetRampageInSkillResponse instance) {
            if (instance.hasUserId()) {
                this.setUserId(instance.getUserId());
            }

            if (instance.hasGold()) {
                this.setGold(instance.getGold());
            }

            if (instance.hasSkillTimeCurrent()) {
                this.setSkillTimeCurrent(instance.getSkillTimeCurrent());
            }

            if (instance.hasSkillTimeMax()) {
                this.setSkillTimeMax(instance.getSkillTimeMax());
            }

            if (instance.hasSkillDuration()) {
                this.setSkillDuration(instance.getSkillDuration());
            }

            if (instance.hasUserGold()) {
                this.setUserGold(instance.getUserGold());
            }

            if (instance.hasCannonId()) {
                this.setCannonId(instance.getCannonId());
            }

            if (instance.hasLevel()) {
                this.setLevel(instance.getLevel());
            }

            if (instance.hasBulletSkillType()) {
                this.setBulletSkillType(instance.getBulletSkillType());
            }

            return this;
        }

        public String getUserId() {
            return userId;
        }

        public Builder setUserId(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set IngamePetRampageInSkillResponse#userId to null");
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

        public long getSkillTimeCurrent() {
            return skillTimeCurrent;
        }

        public Builder setSkillTimeCurrent(long value) {
            this.skillTimeCurrent = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearSkillTimeCurrent() {
            this.skillTimeCurrent = 0L;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasSkillTimeCurrent() {
            return (__bitField0 & 4) == 4;
        }

        public long getSkillTimeMax() {
            return skillTimeMax;
        }

        public Builder setSkillTimeMax(long value) {
            this.skillTimeMax = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearSkillTimeMax() {
            this.skillTimeMax = 0L;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasSkillTimeMax() {
            return (__bitField0 & 8) == 8;
        }

        public long getSkillDuration() {
            return skillDuration;
        }

        public Builder setSkillDuration(long value) {
            this.skillDuration = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearSkillDuration() {
            this.skillDuration = 0L;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasSkillDuration() {
            return (__bitField0 & 16) == 16;
        }

        public int getUserGold() {
            return userGold;
        }

        public Builder setUserGold(int value) {
            this.userGold = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearUserGold() {
            this.userGold = 0;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasUserGold() {
            return (__bitField0 & 32) == 32;
        }

        public int getCannonId() {
            return cannonId;
        }

        public Builder setCannonId(int value) {
            this.cannonId = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearCannonId() {
            this.cannonId = 0;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasCannonId() {
            return (__bitField0 & 64) == 64;
        }

        public int getLevel() {
            return level;
        }

        public Builder setLevel(int value) {
            this.level = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearLevel() {
            this.level = 0;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasLevel() {
            return (__bitField0 & 128) == 128;
        }

        public int getBulletSkillType() {
            return bulletSkillType;
        }

        public Builder setBulletSkillType(int value) {
            this.bulletSkillType = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearBulletSkillType() {
            this.bulletSkillType = 0;
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasBulletSkillType() {
            return (__bitField0 & 256) == 256;
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
            if (!java.util.Objects.equals(this.skillTimeCurrent, that.skillTimeCurrent)) {
                return false;
            }
            if (!java.util.Objects.equals(this.skillTimeMax, that.skillTimeMax)) {
                return false;
            }
            if (!java.util.Objects.equals(this.skillDuration, that.skillDuration)) {
                return false;
            }
            if (!java.util.Objects.equals(this.userGold, that.userGold)) {
                return false;
            }
            if (!java.util.Objects.equals(this.cannonId, that.cannonId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.level, that.level)) {
                return false;
            }
            if (!java.util.Objects.equals(this.bulletSkillType, that.bulletSkillType)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.userId == null ? 0 : this.userId.hashCode());
            result = 31 * result + Integer.hashCode(this.gold);
            result = 31 * result + Long.hashCode(this.skillTimeCurrent);
            result = 31 * result + Long.hashCode(this.skillTimeMax);
            result = 31 * result + Long.hashCode(this.skillDuration);
            result = 31 * result + Integer.hashCode(this.userGold);
            result = 31 * result + Integer.hashCode(this.cannonId);
            result = 31 * result + Integer.hashCode(this.level);
            result = 31 * result + Integer.hashCode(this.bulletSkillType);

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
            if (hasSkillTimeCurrent()) {
                parts.add("skillTimeCurrent=" + getSkillTimeCurrent());
            }
            if (hasSkillTimeMax()) {
                parts.add("skillTimeMax=" + getSkillTimeMax());
            }
            if (hasSkillDuration()) {
                parts.add("skillDuration=" + getSkillDuration());
            }
            if (hasUserGold()) {
                parts.add("userGold=" + getUserGold());
            }
            if (hasCannonId()) {
                parts.add("cannonId=" + getCannonId());
            }
            if (hasLevel()) {
                parts.add("level=" + getLevel());
            }
            if (hasBulletSkillType()) {
                parts.add("bulletSkillType=" + getBulletSkillType());
            }
            return "IngamePetRampageInSkillResponse{" + String.join(", ", parts) + "}";
        }

        public IngamePetRampageInSkillResponse build() {
            proto.message.IngamePetRampageInSkillResponse result = new proto.message.IngamePetRampageInSkillResponse();
            result.__bitField0 = __bitField0;
            result.userId = this.userId;
            result.gold = this.gold;
            result.skillTimeCurrent = this.skillTimeCurrent;
            result.skillTimeMax = this.skillTimeMax;
            result.skillDuration = this.skillDuration;
            result.userGold = this.userGold;
            result.cannonId = this.cannonId;
            result.level = this.level;
            result.bulletSkillType = this.bulletSkillType;
            return result;
        }

    }



}