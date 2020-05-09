package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class BossKillResponse
        implements io.protostuff.Message<BossKillResponse> {

    private static final BossKillResponse DEFAULT_INSTANCE = newBuilder().build();

    private String killerID;

    private long bossHordeID;

    private java.util.List<proto.message.BossKillResponse.BossReward> bossRewards;

    private boolean __merge_lock = false;
    private int __bitField0;

    private BossKillResponse() {
        this.killerID = "";
        this.bossHordeID = 0L;
        this.bossRewards = java.util.Collections.emptyList();
    }

    private BossKillResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static BossKillResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<BossKillResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getKillerID() {
        return killerID;
    }

    public boolean hasKillerID() {
        return (__bitField0 & 1) == 1;
    }

    public BossKillResponse withKillerID(String value) {
        return BossKillResponse.newBuilder()
            .mergeFrom(this)
            .setKillerID(value)
            .build();
    }

    public long getBossHordeID() {
        return bossHordeID;
    }

    public boolean hasBossHordeID() {
        return (__bitField0 & 2) == 2;
    }

    public BossKillResponse withBossHordeID(long value) {
        return BossKillResponse.newBuilder()
            .mergeFrom(this)
            .setBossHordeID(value)
            .build();
    }

    public java.util.List<proto.message.BossKillResponse.BossReward> getBossRewardsList() {
        return bossRewards;
    }

    public int getBossRewardsCount() {
        return bossRewards.size();
    }

    public proto.message.BossKillResponse.BossReward getBossRewards(int index) {
        return bossRewards.get(index);
    }

    public BossKillResponse withBossRewards(java.util.List<proto.message.BossKillResponse.BossReward> value) {
        return BossKillResponse.newBuilder()
            .mergeFrom(this)
            .clearBossRewards()
            .addAllBossRewards(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<BossKillResponse> cachedSchema() {
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
        BossKillResponse that = (BossKillResponse) obj;
        if (!java.util.Objects.equals(this.killerID, that.killerID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.bossHordeID, that.bossHordeID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.bossRewards, that.bossRewards)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.killerID == null ? 0 : this.killerID.hashCode());
        result = 31 * result + Long.hashCode(this.bossHordeID);
        result = 31 * result + (this.bossRewards == null ? 0 : this.bossRewards.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasKillerID()) {
            parts.add("killerID=" + getKillerID());
        }
        if (hasBossHordeID()) {
            parts.add("bossHordeID=" + getBossHordeID());
        }
        if (!bossRewards.isEmpty()) {
            parts.add("bossRewards=" + getBossRewardsList());
        }
        return "BossKillResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<BossKillResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("killerID", 1);
        	__fieldMap.put("bossHordeID", 2);
        	__fieldMap.put("bossRewards", 3);
        }

        @Override
        public BossKillResponse newMessage() {
            return new BossKillResponse();
        }

        @Override
        public Class<BossKillResponse> typeClass() {
            return BossKillResponse.class;
        }

        @Override
        public String messageName() {
            return BossKillResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return BossKillResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(BossKillResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, BossKillResponse instance) throws java.io.IOException {
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
                    	instance.killerID = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.bossHordeID = input.readInt64();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	if(!((instance.__bitField0 & 4) == 4)) {
                    	    instance.bossRewards = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 4;
                    	}
                    	instance.bossRewards.add(input.mergeObject(null, proto.message.BossKillResponse.BossReward.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 4) == 4) {
                instance.bossRewards = java.util.Collections.unmodifiableList(instance.bossRewards);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, BossKillResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.killerID, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt64(2, instance.bossHordeID, false);
            }

            for(proto.message.BossKillResponse.BossReward bossRewards : instance.bossRewards) {
                output.writeObject(3, bossRewards, proto.message.BossKillResponse.BossReward.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "killerID";
        		case 2: return "bossHordeID";
        		case 3: return "bossRewards";
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

        private String killerID;

        private long bossHordeID;

        private java.util.List<proto.message.BossKillResponse.BossReward> bossRewards;

        private int __bitField0;

        private Builder() {
            this.killerID = "";
            this.bossHordeID = 0L;
            this.bossRewards = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(BossKillResponse instance) {
            if (instance.hasKillerID()) {
                this.setKillerID(instance.getKillerID());
            }

            if (instance.hasBossHordeID()) {
                this.setBossHordeID(instance.getBossHordeID());
            }

            this.addAllBossRewards(instance.getBossRewardsList());

            return this;
        }

        public String getKillerID() {
            return killerID;
        }

        public Builder setKillerID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set BossKillResponse#killerID to null");
            }

            this.killerID = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearKillerID() {
            this.killerID = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasKillerID() {
            return (__bitField0 & 1) == 1;
        }

        public long getBossHordeID() {
            return bossHordeID;
        }

        public Builder setBossHordeID(long value) {
            this.bossHordeID = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearBossHordeID() {
            this.bossHordeID = 0L;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasBossHordeID() {
            return (__bitField0 & 2) == 2;
        }

        public java.util.List<proto.message.BossKillResponse.BossReward> getBossRewardsList() {
            return bossRewards;
        }

        public Builder setBossRewards(int index, proto.message.BossKillResponse.BossReward value) {
            if (value == null) {
                throw new NullPointerException("Cannot set BossKillResponse#bossRewards to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.bossRewards = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.bossRewards.set(index, value);
            return this;
        }

        public Builder addBossRewards(proto.message.BossKillResponse.BossReward value) {
            if (value == null) {
                throw new NullPointerException("Cannot set BossKillResponse#bossRewards to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.bossRewards = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.bossRewards.add(value);
            return this;
        }

        public Builder addAllBossRewards(java.lang.Iterable<proto.message.BossKillResponse.BossReward> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set BossKillResponse#bossRewards to null");
            }
            if(!((__bitField0 & 4) == 4)) {
                this.bossRewards = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            for (final proto.message.BossKillResponse.BossReward value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set BossKillResponse#bossRewards to null");
                }
                this.bossRewards.add(value);
            }
            return this;
        }

        public Builder clearBossRewards() {
            this.bossRewards = java.util.Collections.emptyList();
            __bitField0 &= ~4;
            return this;
        }

        public int getBossRewardsCount() {
            return bossRewards.size();
        }

        public proto.message.BossKillResponse.BossReward getBossRewards(int index) {
            return bossRewards.get(index);
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
            if (!java.util.Objects.equals(this.killerID, that.killerID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.bossHordeID, that.bossHordeID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.bossRewards, that.bossRewards)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.killerID == null ? 0 : this.killerID.hashCode());
            result = 31 * result + Long.hashCode(this.bossHordeID);
            result = 31 * result + (this.bossRewards == null ? 0 : this.bossRewards.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasKillerID()) {
                parts.add("killerID=" + getKillerID());
            }
            if (hasBossHordeID()) {
                parts.add("bossHordeID=" + getBossHordeID());
            }
            if (!bossRewards.isEmpty()) {
                parts.add("bossRewards=" + getBossRewardsList());
            }
            return "BossKillResponse{" + String.join(", ", parts) + "}";
        }

        public BossKillResponse build() {
            proto.message.BossKillResponse result = new proto.message.BossKillResponse();
            result.__bitField0 = __bitField0;
            result.killerID = this.killerID;
            result.bossHordeID = this.bossHordeID;
            result.bossRewards = java.util.Collections.unmodifiableList(this.bossRewards);
            return result;
        }

    }

    public static final class BossReward
            implements io.protostuff.Message<BossReward> {

        private static final BossReward DEFAULT_INSTANCE = newBuilder().build();

        private String userID;

        private int accumulateGold;

        private int reward;

        private int currentExp;

        private boolean __merge_lock = false;
        private int __bitField0;

        private BossReward() {
            this.userID = "";
            this.accumulateGold = 0;
            this.reward = 0;
            this.currentExp = 0;
        }

        private BossReward(Builder builder) {
            __merge_lock = true;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public static BossReward getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static io.protostuff.Schema<BossReward> getSchema()
        {
        	return Schema.INSTANCE;
        }

        public String getUserID() {
            return userID;
        }

        public boolean hasUserID() {
            return (__bitField0 & 1) == 1;
        }

        public BossReward withUserID(String value) {
            return BossReward.newBuilder()
                .mergeFrom(this)
                .setUserID(value)
                .build();
        }

        public int getAccumulateGold() {
            return accumulateGold;
        }

        public boolean hasAccumulateGold() {
            return (__bitField0 & 2) == 2;
        }

        public BossReward withAccumulateGold(int value) {
            return BossReward.newBuilder()
                .mergeFrom(this)
                .setAccumulateGold(value)
                .build();
        }

        public int getReward() {
            return reward;
        }

        public boolean hasReward() {
            return (__bitField0 & 4) == 4;
        }

        public BossReward withReward(int value) {
            return BossReward.newBuilder()
                .mergeFrom(this)
                .setReward(value)
                .build();
        }

        public int getCurrentExp() {
            return currentExp;
        }

        public boolean hasCurrentExp() {
            return (__bitField0 & 8) == 8;
        }

        public BossReward withCurrentExp(int value) {
            return BossReward.newBuilder()
                .mergeFrom(this)
                .setCurrentExp(value)
                .build();
        }



        @Override
        public io.protostuff.Schema<BossReward> cachedSchema() {
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
            BossReward that = (BossReward) obj;
            if (!java.util.Objects.equals(this.userID, that.userID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.accumulateGold, that.accumulateGold)) {
                return false;
            }
            if (!java.util.Objects.equals(this.reward, that.reward)) {
                return false;
            }
            if (!java.util.Objects.equals(this.currentExp, that.currentExp)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
            result = 31 * result + Integer.hashCode(this.accumulateGold);
            result = 31 * result + Integer.hashCode(this.reward);
            result = 31 * result + Integer.hashCode(this.currentExp);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasUserID()) {
                parts.add("userID=" + getUserID());
            }
            if (hasAccumulateGold()) {
                parts.add("accumulateGold=" + getAccumulateGold());
            }
            if (hasReward()) {
                parts.add("reward=" + getReward());
            }
            if (hasCurrentExp()) {
                parts.add("currentExp=" + getCurrentExp());
            }
            return "BossReward{" + String.join(", ", parts) + "}";
        }

        public static final class Schema implements io.protostuff.Schema<BossReward>{

            private static final Schema INSTANCE = new Schema();

            private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

            static {
            	__fieldMap.put("userID", 1);
            	__fieldMap.put("accumulateGold", 2);
            	__fieldMap.put("reward", 3);
            	__fieldMap.put("currentExp", 4);
            }

            @Override
            public BossReward newMessage() {
                return new BossReward();
            }

            @Override
            public Class<BossReward> typeClass() {
                return BossReward.class;
            }

            @Override
            public String messageName() {
                return BossReward.class.getSimpleName();
            }

            @Override
            public String messageFullName() {
                return BossReward.class.getName();
            }

            @Override
            @Deprecated
            public boolean isInitialized(BossReward message) {
                return true;
            }

            @Override
            public void mergeFrom(io.protostuff.Input input, BossReward instance) throws java.io.IOException {
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
                        	instance.accumulateGold = input.readInt32();
                        	instance.__bitField0 |= 2;
                        	break;
                        case 3:
                        	instance.reward = input.readInt32();
                        	instance.__bitField0 |= 4;
                        	break;
                        case 4:
                        	instance.currentExp = input.readInt32();
                        	instance.__bitField0 |= 8;
                        	break;
                        default:
                            input.handleUnknownField(number, this);
                    }
            	}
            }

            @Override
            public void writeTo(io.protostuff.Output output, BossReward instance) throws java.io.IOException {
                if((instance.__bitField0 & 1) == 1) {
                    output.writeString(1, instance.userID, false);
                }

                if((instance.__bitField0 & 2) == 2) {
                    output.writeInt32(2, instance.accumulateGold, false);
                }

                if((instance.__bitField0 & 4) == 4) {
                    output.writeInt32(3, instance.reward, false);
                }

                if((instance.__bitField0 & 8) == 8) {
                    output.writeInt32(4, instance.currentExp, false);
                }

            }

            @Override
            public String getFieldName(int number) {
            	switch(number) {
            		case 1: return "userID";
            		case 2: return "accumulateGold";
            		case 3: return "reward";
            		case 4: return "currentExp";
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

            private int accumulateGold;

            private int reward;

            private int currentExp;

            private int __bitField0;

            private Builder() {
                this.userID = "";
                this.accumulateGold = 0;
                this.reward = 0;
                this.currentExp = 0;
            }

            public Builder mergeFrom(BossReward instance) {
                if (instance.hasUserID()) {
                    this.setUserID(instance.getUserID());
                }

                if (instance.hasAccumulateGold()) {
                    this.setAccumulateGold(instance.getAccumulateGold());
                }

                if (instance.hasReward()) {
                    this.setReward(instance.getReward());
                }

                if (instance.hasCurrentExp()) {
                    this.setCurrentExp(instance.getCurrentExp());
                }

                return this;
            }

            public String getUserID() {
                return userID;
            }

            public Builder setUserID(String value) {
                if (value == null) {
                    throw new NullPointerException("Cannot set BossReward#userID to null");
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

            public int getAccumulateGold() {
                return accumulateGold;
            }

            public Builder setAccumulateGold(int value) {
                this.accumulateGold = value;
                __bitField0 |= 2;
                return this;
            }

            public Builder clearAccumulateGold() {
                this.accumulateGold = 0;
                __bitField0 &= ~2;
                return this;
            }

            public boolean hasAccumulateGold() {
                return (__bitField0 & 2) == 2;
            }

            public int getReward() {
                return reward;
            }

            public Builder setReward(int value) {
                this.reward = value;
                __bitField0 |= 4;
                return this;
            }

            public Builder clearReward() {
                this.reward = 0;
                __bitField0 &= ~4;
                return this;
            }

            public boolean hasReward() {
                return (__bitField0 & 4) == 4;
            }

            public int getCurrentExp() {
                return currentExp;
            }

            public Builder setCurrentExp(int value) {
                this.currentExp = value;
                __bitField0 |= 8;
                return this;
            }

            public Builder clearCurrentExp() {
                this.currentExp = 0;
                __bitField0 &= ~8;
                return this;
            }

            public boolean hasCurrentExp() {
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
                if (!java.util.Objects.equals(this.userID, that.userID)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.accumulateGold, that.accumulateGold)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.reward, that.reward)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.currentExp, that.currentExp)) {
                    return false;
                }

                return true;
            }

            @Override
            public int hashCode() {
                int result = 1;
                result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
                result = 31 * result + Integer.hashCode(this.accumulateGold);
                result = 31 * result + Integer.hashCode(this.reward);
                result = 31 * result + Integer.hashCode(this.currentExp);

                return result;
            }

            @Override
            public String toString() {
                java.util.List<String> parts = new java.util.ArrayList<>();
                if (hasUserID()) {
                    parts.add("userID=" + getUserID());
                }
                if (hasAccumulateGold()) {
                    parts.add("accumulateGold=" + getAccumulateGold());
                }
                if (hasReward()) {
                    parts.add("reward=" + getReward());
                }
                if (hasCurrentExp()) {
                    parts.add("currentExp=" + getCurrentExp());
                }
                return "BossReward{" + String.join(", ", parts) + "}";
            }

            public BossReward build() {
                proto.message.BossKillResponse.BossReward result = new proto.message.BossKillResponse.BossReward();
                result.__bitField0 = __bitField0;
                result.userID = this.userID;
                result.accumulateGold = this.accumulateGold;
                result.reward = this.reward;
                result.currentExp = this.currentExp;
                return result;
            }

        }



    }


}