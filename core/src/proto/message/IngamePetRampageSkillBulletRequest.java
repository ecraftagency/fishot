package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class IngamePetRampageSkillBulletRequest
        implements io.protostuff.Message<IngamePetRampageSkillBulletRequest> {

    private static final IngamePetRampageSkillBulletRequest DEFAULT_INSTANCE = newBuilder().build();

    private int skillType;

    private java.util.List<Long> targetedFishes;

    private boolean __merge_lock = false;
    private int __bitField0;

    private IngamePetRampageSkillBulletRequest() {
        this.skillType = 0;
        this.targetedFishes = java.util.Collections.emptyList();
    }

    private IngamePetRampageSkillBulletRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static IngamePetRampageSkillBulletRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<IngamePetRampageSkillBulletRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getSkillType() {
        return skillType;
    }

    public boolean hasSkillType() {
        return (__bitField0 & 1) == 1;
    }

    public IngamePetRampageSkillBulletRequest withSkillType(int value) {
        return IngamePetRampageSkillBulletRequest.newBuilder()
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

    public IngamePetRampageSkillBulletRequest withTargetedFishes(java.util.List<Long> value) {
        return IngamePetRampageSkillBulletRequest.newBuilder()
            .mergeFrom(this)
            .clearTargetedFishes()
            .addAllTargetedFishes(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<IngamePetRampageSkillBulletRequest> cachedSchema() {
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
        IngamePetRampageSkillBulletRequest that = (IngamePetRampageSkillBulletRequest) obj;
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
        result = 31 * result + Integer.hashCode(this.skillType);
        result = 31 * result + (this.targetedFishes == null ? 0 : this.targetedFishes.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasSkillType()) {
            parts.add("skillType=" + getSkillType());
        }
        if (!targetedFishes.isEmpty()) {
            parts.add("targetedFishes=" + getTargetedFishesList());
        }
        return "IngamePetRampageSkillBulletRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<IngamePetRampageSkillBulletRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("skillType", 1);
        	__fieldMap.put("targetedFishes", 2);
        }

        @Override
        public IngamePetRampageSkillBulletRequest newMessage() {
            return new IngamePetRampageSkillBulletRequest();
        }

        @Override
        public Class<IngamePetRampageSkillBulletRequest> typeClass() {
            return IngamePetRampageSkillBulletRequest.class;
        }

        @Override
        public String messageName() {
            return IngamePetRampageSkillBulletRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return IngamePetRampageSkillBulletRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(IngamePetRampageSkillBulletRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, IngamePetRampageSkillBulletRequest instance) throws java.io.IOException {
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
                    	instance.skillType = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	if(!((instance.__bitField0 & 2) == 2)) {
                    	    instance.targetedFishes = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 2;
                    	}
                    	instance.targetedFishes.add(input.readInt64());

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 2) == 2) {
                instance.targetedFishes = java.util.Collections.unmodifiableList(instance.targetedFishes);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, IngamePetRampageSkillBulletRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.skillType, false);
            }

            for(long targetedFishes : instance.targetedFishes) {
                output.writeInt64(2, targetedFishes, true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "skillType";
        		case 2: return "targetedFishes";
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

        private java.util.List<Long> targetedFishes;

        private int __bitField0;

        private Builder() {
            this.skillType = 0;
            this.targetedFishes = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(IngamePetRampageSkillBulletRequest instance) {
            if (instance.hasSkillType()) {
                this.setSkillType(instance.getSkillType());
            }

            this.addAllTargetedFishes(instance.getTargetedFishesList());

            return this;
        }

        public int getSkillType() {
            return skillType;
        }

        public Builder setSkillType(int value) {
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

        public java.util.List<Long> getTargetedFishesList() {
            return targetedFishes;
        }

        public Builder setTargetedFishes(int index, long value) {
            if(!((__bitField0 & 2) == 2)) {
                this.targetedFishes = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.targetedFishes.set(index, value);
            return this;
        }

        public Builder addTargetedFishes(long value) {
            if(!((__bitField0 & 2) == 2)) {
                this.targetedFishes = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.targetedFishes.add(value);
            return this;
        }

        public Builder addAllTargetedFishes(java.lang.Iterable<Long> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set IngamePetRampageSkillBulletRequest#targetedFishes to null");
            }
            if(!((__bitField0 & 2) == 2)) {
                this.targetedFishes = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            for (final Long value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set IngamePetRampageSkillBulletRequest#targetedFishes to null");
                }
                this.targetedFishes.add(value);
            }
            return this;
        }

        public Builder clearTargetedFishes() {
            this.targetedFishes = java.util.Collections.emptyList();
            __bitField0 &= ~2;
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
            result = 31 * result + Integer.hashCode(this.skillType);
            result = 31 * result + (this.targetedFishes == null ? 0 : this.targetedFishes.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasSkillType()) {
                parts.add("skillType=" + getSkillType());
            }
            if (!targetedFishes.isEmpty()) {
                parts.add("targetedFishes=" + getTargetedFishesList());
            }
            return "IngamePetRampageSkillBulletRequest{" + String.join(", ", parts) + "}";
        }

        public IngamePetRampageSkillBulletRequest build() {
            proto.message.IngamePetRampageSkillBulletRequest result = new proto.message.IngamePetRampageSkillBulletRequest();
            result.__bitField0 = __bitField0;
            result.skillType = this.skillType;
            result.targetedFishes = java.util.Collections.unmodifiableList(this.targetedFishes);
            return result;
        }

    }



}