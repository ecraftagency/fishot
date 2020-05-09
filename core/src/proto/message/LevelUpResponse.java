package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class LevelUpResponse
        implements io.protostuff.Message<LevelUpResponse> {

    private static final LevelUpResponse DEFAULT_INSTANCE = newBuilder().build();

    private int newLevel;

    private int goldReward;

    private java.util.List<Integer> itemReward;

    private int nextLevelExp;

    private boolean __merge_lock = false;
    private int __bitField0;

    private LevelUpResponse() {
        this.newLevel = 0;
        this.goldReward = 0;
        this.itemReward = java.util.Collections.emptyList();
        this.nextLevelExp = 0;
    }

    private LevelUpResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static LevelUpResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<LevelUpResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getNewLevel() {
        return newLevel;
    }

    public boolean hasNewLevel() {
        return (__bitField0 & 1) == 1;
    }

    public LevelUpResponse withNewLevel(int value) {
        return LevelUpResponse.newBuilder()
            .mergeFrom(this)
            .setNewLevel(value)
            .build();
    }

    public int getGoldReward() {
        return goldReward;
    }

    public boolean hasGoldReward() {
        return (__bitField0 & 2) == 2;
    }

    public LevelUpResponse withGoldReward(int value) {
        return LevelUpResponse.newBuilder()
            .mergeFrom(this)
            .setGoldReward(value)
            .build();
    }

    public java.util.List<Integer> getItemRewardList() {
        return itemReward;
    }

    public int getItemRewardCount() {
        return itemReward.size();
    }

    public int getItemReward(int index) {
        return itemReward.get(index);
    }

    public LevelUpResponse withItemReward(java.util.List<Integer> value) {
        return LevelUpResponse.newBuilder()
            .mergeFrom(this)
            .clearItemReward()
            .addAllItemReward(value)
            .build();
    }

    public int getNextLevelExp() {
        return nextLevelExp;
    }

    public boolean hasNextLevelExp() {
        return (__bitField0 & 8) == 8;
    }

    public LevelUpResponse withNextLevelExp(int value) {
        return LevelUpResponse.newBuilder()
            .mergeFrom(this)
            .setNextLevelExp(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<LevelUpResponse> cachedSchema() {
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
        LevelUpResponse that = (LevelUpResponse) obj;
        if (!java.util.Objects.equals(this.newLevel, that.newLevel)) {
            return false;
        }
        if (!java.util.Objects.equals(this.goldReward, that.goldReward)) {
            return false;
        }
        if (!java.util.Objects.equals(this.itemReward, that.itemReward)) {
            return false;
        }
        if (!java.util.Objects.equals(this.nextLevelExp, that.nextLevelExp)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.newLevel);
        result = 31 * result + Integer.hashCode(this.goldReward);
        result = 31 * result + (this.itemReward == null ? 0 : this.itemReward.hashCode());
        result = 31 * result + Integer.hashCode(this.nextLevelExp);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasNewLevel()) {
            parts.add("newLevel=" + getNewLevel());
        }
        if (hasGoldReward()) {
            parts.add("goldReward=" + getGoldReward());
        }
        if (!itemReward.isEmpty()) {
            parts.add("itemReward=" + getItemRewardList());
        }
        if (hasNextLevelExp()) {
            parts.add("nextLevelExp=" + getNextLevelExp());
        }
        return "LevelUpResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<LevelUpResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("newLevel", 1);
        	__fieldMap.put("goldReward", 2);
        	__fieldMap.put("itemReward", 3);
        	__fieldMap.put("nextLevelExp", 4);
        }

        @Override
        public LevelUpResponse newMessage() {
            return new LevelUpResponse();
        }

        @Override
        public Class<LevelUpResponse> typeClass() {
            return LevelUpResponse.class;
        }

        @Override
        public String messageName() {
            return LevelUpResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return LevelUpResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(LevelUpResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, LevelUpResponse instance) throws java.io.IOException {
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
                    	instance.newLevel = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.goldReward = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	if(!((instance.__bitField0 & 4) == 4)) {
                    	    instance.itemReward = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 4;
                    	}
                    	instance.itemReward.add(input.readInt32());

                    	break;
                    case 4:
                    	instance.nextLevelExp = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 4) == 4) {
                instance.itemReward = java.util.Collections.unmodifiableList(instance.itemReward);
            }


        }

        @Override
        public void writeTo(io.protostuff.Output output, LevelUpResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.newLevel, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.goldReward, false);
            }

            for(int itemReward : instance.itemReward) {
                output.writeInt32(3, itemReward, true);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.nextLevelExp, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "newLevel";
        		case 2: return "goldReward";
        		case 3: return "itemReward";
        		case 4: return "nextLevelExp";
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

        private int newLevel;

        private int goldReward;

        private java.util.List<Integer> itemReward;

        private int nextLevelExp;

        private int __bitField0;

        private Builder() {
            this.newLevel = 0;
            this.goldReward = 0;
            this.itemReward = java.util.Collections.emptyList();
            this.nextLevelExp = 0;
        }

        public Builder mergeFrom(LevelUpResponse instance) {
            if (instance.hasNewLevel()) {
                this.setNewLevel(instance.getNewLevel());
            }

            if (instance.hasGoldReward()) {
                this.setGoldReward(instance.getGoldReward());
            }

            this.addAllItemReward(instance.getItemRewardList());

            if (instance.hasNextLevelExp()) {
                this.setNextLevelExp(instance.getNextLevelExp());
            }

            return this;
        }

        public int getNewLevel() {
            return newLevel;
        }

        public Builder setNewLevel(int value) {
            this.newLevel = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearNewLevel() {
            this.newLevel = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasNewLevel() {
            return (__bitField0 & 1) == 1;
        }

        public int getGoldReward() {
            return goldReward;
        }

        public Builder setGoldReward(int value) {
            this.goldReward = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearGoldReward() {
            this.goldReward = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasGoldReward() {
            return (__bitField0 & 2) == 2;
        }

        public java.util.List<Integer> getItemRewardList() {
            return itemReward;
        }

        public Builder setItemReward(int index, int value) {
            if(!((__bitField0 & 4) == 4)) {
                this.itemReward = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.itemReward.set(index, value);
            return this;
        }

        public Builder addItemReward(int value) {
            if(!((__bitField0 & 4) == 4)) {
                this.itemReward = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.itemReward.add(value);
            return this;
        }

        public Builder addAllItemReward(java.lang.Iterable<Integer> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set LevelUpResponse#itemReward to null");
            }
            if(!((__bitField0 & 4) == 4)) {
                this.itemReward = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            for (final Integer value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set LevelUpResponse#itemReward to null");
                }
                this.itemReward.add(value);
            }
            return this;
        }

        public Builder clearItemReward() {
            this.itemReward = java.util.Collections.emptyList();
            __bitField0 &= ~4;
            return this;
        }

        public int getItemRewardCount() {
            return itemReward.size();
        }

        public int getItemReward(int index) {
            return itemReward.get(index);
        }

        public int getNextLevelExp() {
            return nextLevelExp;
        }

        public Builder setNextLevelExp(int value) {
            this.nextLevelExp = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearNextLevelExp() {
            this.nextLevelExp = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasNextLevelExp() {
            return (__bitField0 & 8) == 8;
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
            if (!java.util.Objects.equals(this.newLevel, that.newLevel)) {
                return false;
            }
            if (!java.util.Objects.equals(this.goldReward, that.goldReward)) {
                return false;
            }
            if (!java.util.Objects.equals(this.itemReward, that.itemReward)) {
                return false;
            }
            if (!java.util.Objects.equals(this.nextLevelExp, that.nextLevelExp)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.newLevel);
            result = 31 * result + Integer.hashCode(this.goldReward);
            result = 31 * result + (this.itemReward == null ? 0 : this.itemReward.hashCode());
            result = 31 * result + Integer.hashCode(this.nextLevelExp);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasNewLevel()) {
                parts.add("newLevel=" + getNewLevel());
            }
            if (hasGoldReward()) {
                parts.add("goldReward=" + getGoldReward());
            }
            if (!itemReward.isEmpty()) {
                parts.add("itemReward=" + getItemRewardList());
            }
            if (hasNextLevelExp()) {
                parts.add("nextLevelExp=" + getNextLevelExp());
            }
            return "LevelUpResponse{" + String.join(", ", parts) + "}";
        }

        public LevelUpResponse build() {
            proto.message.LevelUpResponse result = new proto.message.LevelUpResponse();
            result.__bitField0 = __bitField0;
            result.newLevel = this.newLevel;
            result.goldReward = this.goldReward;
            result.itemReward = java.util.Collections.unmodifiableList(this.itemReward);
            result.nextLevelExp = this.nextLevelExp;
            return result;
        }

    }



}