package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class IngamePetRampageSkillBulletResponse
        implements io.protostuff.Message<IngamePetRampageSkillBulletResponse> {

    private static final IngamePetRampageSkillBulletResponse DEFAULT_INSTANCE = newBuilder().build();

    private String userID;

    private int skillType;

    private java.util.List<Long> targetedFishes;

    private boolean __merge_lock = false;
    private int __bitField0;

    private IngamePetRampageSkillBulletResponse() {
        this.userID = "";
        this.skillType = 0;
        this.targetedFishes = java.util.Collections.emptyList();
    }

    private IngamePetRampageSkillBulletResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static IngamePetRampageSkillBulletResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<IngamePetRampageSkillBulletResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getUserID() {
        return userID;
    }

    public boolean hasUserID() {
        return (__bitField0 & 1) == 1;
    }

    public IngamePetRampageSkillBulletResponse withUserID(String value) {
        return IngamePetRampageSkillBulletResponse.newBuilder()
            .mergeFrom(this)
            .setUserID(value)
            .build();
    }

    public int getSkillType() {
        return skillType;
    }

    public boolean hasSkillType() {
        return (__bitField0 & 2) == 2;
    }

    public IngamePetRampageSkillBulletResponse withSkillType(int value) {
        return IngamePetRampageSkillBulletResponse.newBuilder()
            .mergeFrom(this)
            .setSkillType(value)
            .build();
    }

    public java.util.List<Long> getTargetedFishesList() {
        return targetedFishes;
    }

    public int getTargetedFishesCount() {
        return targetedFishes.size();
    }

    public long getTargetedFishes(int index) {
        return targetedFishes.get(index);
    }

    public IngamePetRampageSkillBulletResponse withTargetedFishes(java.util.List<Long> value) {
        return IngamePetRampageSkillBulletResponse.newBuilder()
            .mergeFrom(this)
            .clearTargetedFishes()
            .addAllTargetedFishes(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<IngamePetRampageSkillBulletResponse> cachedSchema() {
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
        IngamePetRampageSkillBulletResponse that = (IngamePetRampageSkillBulletResponse) obj;
        if (!java.util.Objects.equals(this.userID, that.userID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.skillType, that.skillType)) {
            return false;
        }
        if (!java.util.Objects.equals(this.targetedFishes, that.targetedFishes)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
        result = 31 * result + Integer.hashCode(this.skillType);
        result = 31 * result + (this.targetedFishes == null ? 0 : this.targetedFishes.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasUserID()) {
            parts.add("userID=" + getUserID());
        }
        if (hasSkillType()) {
            parts.add("skillType=" + getSkillType());
        }
        if (!targetedFishes.isEmpty()) {
            parts.add("targetedFishes=" + getTargetedFishesList());
        }
        return "IngamePetRampageSkillBulletResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<IngamePetRampageSkillBulletResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("userID", 1);
        	__fieldMap.put("skillType", 2);
        	__fieldMap.put("targetedFishes", 3);
        }

        @Override
        public IngamePetRampageSkillBulletResponse newMessage() {
            return new IngamePetRampageSkillBulletResponse();
        }

        @Override
        public Class<IngamePetRampageSkillBulletResponse> typeClass() {
            return IngamePetRampageSkillBulletResponse.class;
        }

        @Override
        public String messageName() {
            return IngamePetRampageSkillBulletResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return IngamePetRampageSkillBulletResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(IngamePetRampageSkillBulletResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, IngamePetRampageSkillBulletResponse instance) throws java.io.IOException {
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
                    	instance.userID = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.skillType = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	if(!((instance.__bitField0 & 4) == 4)) {
                    	    instance.targetedFishes = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 4;
                    	}
                    	instance.targetedFishes.add(input.readInt64());

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 4) == 4) {
                instance.targetedFishes = java.util.Collections.unmodifiableList(instance.targetedFishes);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, IngamePetRampageSkillBulletResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.userID, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.skillType, false);
            }

            for(long targetedFishes : instance.targetedFishes) {
                output.writeInt64(3, targetedFishes, true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "userID";
        		case 2: return "skillType";
        		case 3: return "targetedFishes";
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

        private String userID;

        private int skillType;

        private java.util.List<Long> targetedFishes;

        private int __bitField0;

        private Builder() {
            this.userID = "";
            this.skillType = 0;
            this.targetedFishes = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(IngamePetRampageSkillBulletResponse instance) {
            if (instance.hasUserID()) {
                this.setUserID(instance.getUserID());
            }

            if (instance.hasSkillType()) {
                this.setSkillType(instance.getSkillType());
            }

            this.addAllTargetedFishes(instance.getTargetedFishesList());

            return this;
        }

        public String getUserID() {
            return userID;
        }

        public Builder setUserID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set IngamePetRampageSkillBulletResponse#userID to null");
            }

            this.userID = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearUserID() {
            this.userID = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasUserID() {
            return (__bitField0 & 1) == 1;
        }

        public int getSkillType() {
            return skillType;
        }

        public Builder setSkillType(int value) {
            this.skillType = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearSkillType() {
            this.skillType = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasSkillType() {
            return (__bitField0 & 2) == 2;
        }

        public java.util.List<Long> getTargetedFishesList() {
            return targetedFishes;
        }

        public Builder setTargetedFishes(int index, long value) {
            if(!((__bitField0 & 4) == 4)) {
                this.targetedFishes = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.targetedFishes.set(index, value);
            return this;
        }

        public Builder addTargetedFishes(long value) {
            if(!((__bitField0 & 4) == 4)) {
                this.targetedFishes = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.targetedFishes.add(value);
            return this;
        }

        public Builder addAllTargetedFishes(java.lang.Iterable<Long> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set IngamePetRampageSkillBulletResponse#targetedFishes to null");
            }
            if(!((__bitField0 & 4) == 4)) {
                this.targetedFishes = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            for (final Long value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set IngamePetRampageSkillBulletResponse#targetedFishes to null");
                }
                this.targetedFishes.add(value);
            }
            return this;
        }

        public Builder clearTargetedFishes() {
            this.targetedFishes = java.util.Collections.emptyList();
            __bitField0 &= ~4;
            return this;
        }

        public int getTargetedFishesCount() {
            return targetedFishes.size();
        }

        public long getTargetedFishes(int index) {
            return targetedFishes.get(index);
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
            if (!java.util.Objects.equals(this.userID, that.userID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.skillType, that.skillType)) {
                return false;
            }
            if (!java.util.Objects.equals(this.targetedFishes, that.targetedFishes)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
            result = 31 * result + Integer.hashCode(this.skillType);
            result = 31 * result + (this.targetedFishes == null ? 0 : this.targetedFishes.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasUserID()) {
                parts.add("userID=" + getUserID());
            }
            if (hasSkillType()) {
                parts.add("skillType=" + getSkillType());
            }
            if (!targetedFishes.isEmpty()) {
                parts.add("targetedFishes=" + getTargetedFishesList());
            }
            return "IngamePetRampageSkillBulletResponse{" + String.join(", ", parts) + "}";
        }

        public IngamePetRampageSkillBulletResponse build() {
            proto.message.IngamePetRampageSkillBulletResponse result = new proto.message.IngamePetRampageSkillBulletResponse();
            result.__bitField0 = __bitField0;
            result.userID = this.userID;
            result.skillType = this.skillType;
            result.targetedFishes = java.util.Collections.unmodifiableList(this.targetedFishes);
            return result;
        }

    }



}