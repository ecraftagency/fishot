package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class DailySnsFriendInviteResponse
        implements io.protostuff.Message<DailySnsFriendInviteResponse> {

    private static final DailySnsFriendInviteResponse DEFAULT_INSTANCE = newBuilder().build();

    private int numSuccess;

    private int rewardUnit;

    private int snsFlag;

    private java.util.List<String> snsId;

    private int dailyCount;

    private int dailyMax;

    private int rewardType;

    private boolean __merge_lock = false;
    private int __bitField0;

    private DailySnsFriendInviteResponse() {
        this.numSuccess = 0;
        this.rewardUnit = 0;
        this.snsFlag = 0;
        this.snsId = java.util.Collections.emptyList();
        this.dailyCount = 0;
        this.dailyMax = 0;
        this.rewardType = 0;
    }

    private DailySnsFriendInviteResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static DailySnsFriendInviteResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<DailySnsFriendInviteResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getNumSuccess() {
        return numSuccess;
    }

    public boolean hasNumSuccess() {
        return (__bitField0 & 1) == 1;
    }

    public DailySnsFriendInviteResponse withNumSuccess(int value) {
        return DailySnsFriendInviteResponse.newBuilder()
            .mergeFrom(this)
            .setNumSuccess(value)
            .build();
    }

    public int getRewardUnit() {
        return rewardUnit;
    }

    public boolean hasRewardUnit() {
        return (__bitField0 & 2) == 2;
    }

    public DailySnsFriendInviteResponse withRewardUnit(int value) {
        return DailySnsFriendInviteResponse.newBuilder()
            .mergeFrom(this)
            .setRewardUnit(value)
            .build();
    }

    public int getSnsFlag() {
        return snsFlag;
    }

    public boolean hasSnsFlag() {
        return (__bitField0 & 4) == 4;
    }

    public DailySnsFriendInviteResponse withSnsFlag(int value) {
        return DailySnsFriendInviteResponse.newBuilder()
            .mergeFrom(this)
            .setSnsFlag(value)
            .build();
    }

    public java.util.List<String> getSnsIdList() {
        return snsId;
    }

    public int getSnsIdCount() {
        return snsId.size();
    }

    public String getSnsId(int index) {
        return snsId.get(index);
    }

    public DailySnsFriendInviteResponse withSnsId(java.util.List<String> value) {
        return DailySnsFriendInviteResponse.newBuilder()
            .mergeFrom(this)
            .clearSnsId()
            .addAllSnsId(value)
            .build();
    }

    public int getDailyCount() {
        return dailyCount;
    }

    public boolean hasDailyCount() {
        return (__bitField0 & 16) == 16;
    }

    public DailySnsFriendInviteResponse withDailyCount(int value) {
        return DailySnsFriendInviteResponse.newBuilder()
            .mergeFrom(this)
            .setDailyCount(value)
            .build();
    }

    public int getDailyMax() {
        return dailyMax;
    }

    public boolean hasDailyMax() {
        return (__bitField0 & 32) == 32;
    }

    public DailySnsFriendInviteResponse withDailyMax(int value) {
        return DailySnsFriendInviteResponse.newBuilder()
            .mergeFrom(this)
            .setDailyMax(value)
            .build();
    }

    public int getRewardType() {
        return rewardType;
    }

    public boolean hasRewardType() {
        return (__bitField0 & 64) == 64;
    }

    public DailySnsFriendInviteResponse withRewardType(int value) {
        return DailySnsFriendInviteResponse.newBuilder()
            .mergeFrom(this)
            .setRewardType(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<DailySnsFriendInviteResponse> cachedSchema() {
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
        DailySnsFriendInviteResponse that = (DailySnsFriendInviteResponse) obj;
        if (!java.util.Objects.equals(this.numSuccess, that.numSuccess)) {
            return false;
        }
        if (!java.util.Objects.equals(this.rewardUnit, that.rewardUnit)) {
            return false;
        }
        if (!java.util.Objects.equals(this.snsFlag, that.snsFlag)) {
            return false;
        }
        if (!java.util.Objects.equals(this.snsId, that.snsId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.dailyCount, that.dailyCount)) {
            return false;
        }
        if (!java.util.Objects.equals(this.dailyMax, that.dailyMax)) {
            return false;
        }
        if (!java.util.Objects.equals(this.rewardType, that.rewardType)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.numSuccess);
        result = 31 * result + Integer.hashCode(this.rewardUnit);
        result = 31 * result + Integer.hashCode(this.snsFlag);
        result = 31 * result + (this.snsId == null ? 0 : this.snsId.hashCode());
        result = 31 * result + Integer.hashCode(this.dailyCount);
        result = 31 * result + Integer.hashCode(this.dailyMax);
        result = 31 * result + Integer.hashCode(this.rewardType);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasNumSuccess()) {
            parts.add("numSuccess=" + getNumSuccess());
        }
        if (hasRewardUnit()) {
            parts.add("rewardUnit=" + getRewardUnit());
        }
        if (hasSnsFlag()) {
            parts.add("snsFlag=" + getSnsFlag());
        }
        if (!snsId.isEmpty()) {
            parts.add("snsId=" + getSnsIdList());
        }
        if (hasDailyCount()) {
            parts.add("dailyCount=" + getDailyCount());
        }
        if (hasDailyMax()) {
            parts.add("dailyMax=" + getDailyMax());
        }
        if (hasRewardType()) {
            parts.add("rewardType=" + getRewardType());
        }
        return "DailySnsFriendInviteResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<DailySnsFriendInviteResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("numSuccess", 1);
        	__fieldMap.put("rewardUnit", 2);
        	__fieldMap.put("snsFlag", 3);
        	__fieldMap.put("snsId", 4);
        	__fieldMap.put("dailyCount", 5);
        	__fieldMap.put("dailyMax", 6);
        	__fieldMap.put("rewardType", 7);
        }

        @Override
        public DailySnsFriendInviteResponse newMessage() {
            return new DailySnsFriendInviteResponse();
        }

        @Override
        public Class<DailySnsFriendInviteResponse> typeClass() {
            return DailySnsFriendInviteResponse.class;
        }

        @Override
        public String messageName() {
            return DailySnsFriendInviteResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return DailySnsFriendInviteResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(DailySnsFriendInviteResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, DailySnsFriendInviteResponse instance) throws java.io.IOException {
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
                    	instance.numSuccess = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.rewardUnit = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.snsFlag = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	if(!((instance.__bitField0 & 8) == 8)) {
                    	    instance.snsId = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 8;
                    	}
                    	instance.snsId.add(input.readString());

                    	break;
                    case 5:
                    	instance.dailyCount = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.dailyMax = input.readInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.rewardType = input.readInt32();
                    	instance.__bitField0 |= 64;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 8) == 8) {
                instance.snsId = java.util.Collections.unmodifiableList(instance.snsId);
            }




        }

        @Override
        public void writeTo(io.protostuff.Output output, DailySnsFriendInviteResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.numSuccess, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.rewardUnit, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.snsFlag, false);
            }

            for(String snsId : instance.snsId) {
                output.writeString(4, snsId, true);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.dailyCount, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeInt32(6, instance.dailyMax, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeInt32(7, instance.rewardType, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "numSuccess";
        		case 2: return "rewardUnit";
        		case 3: return "snsFlag";
        		case 4: return "snsId";
        		case 5: return "dailyCount";
        		case 6: return "dailyMax";
        		case 7: return "rewardType";
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

        private int numSuccess;

        private int rewardUnit;

        private int snsFlag;

        private java.util.List<String> snsId;

        private int dailyCount;

        private int dailyMax;

        private int rewardType;

        private int __bitField0;

        private Builder() {
            this.numSuccess = 0;
            this.rewardUnit = 0;
            this.snsFlag = 0;
            this.snsId = java.util.Collections.emptyList();
            this.dailyCount = 0;
            this.dailyMax = 0;
            this.rewardType = 0;
        }

        public Builder mergeFrom(DailySnsFriendInviteResponse instance) {
            if (instance.hasNumSuccess()) {
                this.setNumSuccess(instance.getNumSuccess());
            }

            if (instance.hasRewardUnit()) {
                this.setRewardUnit(instance.getRewardUnit());
            }

            if (instance.hasSnsFlag()) {
                this.setSnsFlag(instance.getSnsFlag());
            }

            this.addAllSnsId(instance.getSnsIdList());

            if (instance.hasDailyCount()) {
                this.setDailyCount(instance.getDailyCount());
            }

            if (instance.hasDailyMax()) {
                this.setDailyMax(instance.getDailyMax());
            }

            if (instance.hasRewardType()) {
                this.setRewardType(instance.getRewardType());
            }

            return this;
        }

        public int getNumSuccess() {
            return numSuccess;
        }

        public Builder setNumSuccess(int value) {
            this.numSuccess = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearNumSuccess() {
            this.numSuccess = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasNumSuccess() {
            return (__bitField0 & 1) == 1;
        }

        public int getRewardUnit() {
            return rewardUnit;
        }

        public Builder setRewardUnit(int value) {
            this.rewardUnit = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearRewardUnit() {
            this.rewardUnit = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasRewardUnit() {
            return (__bitField0 & 2) == 2;
        }

        public int getSnsFlag() {
            return snsFlag;
        }

        public Builder setSnsFlag(int value) {
            this.snsFlag = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearSnsFlag() {
            this.snsFlag = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasSnsFlag() {
            return (__bitField0 & 4) == 4;
        }

        public java.util.List<String> getSnsIdList() {
            return snsId;
        }

        public Builder setSnsId(int index, String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set DailySnsFriendInviteResponse#snsId to null");
            }

            if(!((__bitField0 & 8) == 8)) {
                this.snsId = new java.util.ArrayList<>();
                __bitField0 |= 8;
            }
            this.snsId.set(index, value);
            return this;
        }

        public Builder addSnsId(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set DailySnsFriendInviteResponse#snsId to null");
            }

            if(!((__bitField0 & 8) == 8)) {
                this.snsId = new java.util.ArrayList<>();
                __bitField0 |= 8;
            }
            this.snsId.add(value);
            return this;
        }

        public Builder addAllSnsId(java.lang.Iterable<String> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set DailySnsFriendInviteResponse#snsId to null");
            }
            if(!((__bitField0 & 8) == 8)) {
                this.snsId = new java.util.ArrayList<>();
                __bitField0 |= 8;
            }
            for (final String value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set DailySnsFriendInviteResponse#snsId to null");
                }
                this.snsId.add(value);
            }
            return this;
        }

        public Builder clearSnsId() {
            this.snsId = java.util.Collections.emptyList();
            __bitField0 &= ~8;
            return this;
        }

        public int getSnsIdCount() {
            return snsId.size();
        }

        public String getSnsId(int index) {
            return snsId.get(index);
        }

        public int getDailyCount() {
            return dailyCount;
        }

        public Builder setDailyCount(int value) {
            this.dailyCount = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearDailyCount() {
            this.dailyCount = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasDailyCount() {
            return (__bitField0 & 16) == 16;
        }

        public int getDailyMax() {
            return dailyMax;
        }

        public Builder setDailyMax(int value) {
            this.dailyMax = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearDailyMax() {
            this.dailyMax = 0;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasDailyMax() {
            return (__bitField0 & 32) == 32;
        }

        public int getRewardType() {
            return rewardType;
        }

        public Builder setRewardType(int value) {
            this.rewardType = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearRewardType() {
            this.rewardType = 0;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasRewardType() {
            return (__bitField0 & 64) == 64;
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
            if (!java.util.Objects.equals(this.numSuccess, that.numSuccess)) {
                return false;
            }
            if (!java.util.Objects.equals(this.rewardUnit, that.rewardUnit)) {
                return false;
            }
            if (!java.util.Objects.equals(this.snsFlag, that.snsFlag)) {
                return false;
            }
            if (!java.util.Objects.equals(this.snsId, that.snsId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.dailyCount, that.dailyCount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.dailyMax, that.dailyMax)) {
                return false;
            }
            if (!java.util.Objects.equals(this.rewardType, that.rewardType)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.numSuccess);
            result = 31 * result + Integer.hashCode(this.rewardUnit);
            result = 31 * result + Integer.hashCode(this.snsFlag);
            result = 31 * result + (this.snsId == null ? 0 : this.snsId.hashCode());
            result = 31 * result + Integer.hashCode(this.dailyCount);
            result = 31 * result + Integer.hashCode(this.dailyMax);
            result = 31 * result + Integer.hashCode(this.rewardType);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasNumSuccess()) {
                parts.add("numSuccess=" + getNumSuccess());
            }
            if (hasRewardUnit()) {
                parts.add("rewardUnit=" + getRewardUnit());
            }
            if (hasSnsFlag()) {
                parts.add("snsFlag=" + getSnsFlag());
            }
            if (!snsId.isEmpty()) {
                parts.add("snsId=" + getSnsIdList());
            }
            if (hasDailyCount()) {
                parts.add("dailyCount=" + getDailyCount());
            }
            if (hasDailyMax()) {
                parts.add("dailyMax=" + getDailyMax());
            }
            if (hasRewardType()) {
                parts.add("rewardType=" + getRewardType());
            }
            return "DailySnsFriendInviteResponse{" + String.join(", ", parts) + "}";
        }

        public DailySnsFriendInviteResponse build() {
            proto.message.DailySnsFriendInviteResponse result = new proto.message.DailySnsFriendInviteResponse();
            result.__bitField0 = __bitField0;
            result.numSuccess = this.numSuccess;
            result.rewardUnit = this.rewardUnit;
            result.snsFlag = this.snsFlag;
            result.snsId = java.util.Collections.unmodifiableList(this.snsId);
            result.dailyCount = this.dailyCount;
            result.dailyMax = this.dailyMax;
            result.rewardType = this.rewardType;
            return result;
        }

    }



}