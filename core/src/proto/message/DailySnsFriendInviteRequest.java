package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class DailySnsFriendInviteRequest
        implements io.protostuff.Message<DailySnsFriendInviteRequest> {

    private static final DailySnsFriendInviteRequest DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<String> snsId;

    private int snsFlag;

    private java.util.List<String> fbId;

    private boolean submited;

    private int requestType;

    private boolean __merge_lock = false;
    private int __bitField0;

    private DailySnsFriendInviteRequest() {
        this.snsId = java.util.Collections.emptyList();
        this.snsFlag = 0;
        this.fbId = java.util.Collections.emptyList();
        this.submited = false;
        this.requestType = 0;
    }

    private DailySnsFriendInviteRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static DailySnsFriendInviteRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<DailySnsFriendInviteRequest> getSchema()
    {
    	return Schema.INSTANCE;
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

    public DailySnsFriendInviteRequest withSnsId(java.util.List<String> value) {
        return DailySnsFriendInviteRequest.newBuilder()
            .mergeFrom(this)
            .clearSnsId()
            .addAllSnsId(value)
            .build();
    }

    public int getSnsFlag() {
        return snsFlag;
    }

    public boolean hasSnsFlag() {
        return (__bitField0 & 2) == 2;
    }

    public DailySnsFriendInviteRequest withSnsFlag(int value) {
        return DailySnsFriendInviteRequest.newBuilder()
            .mergeFrom(this)
            .setSnsFlag(value)
            .build();
    }

    public java.util.List<String> getFbIdList() {
        return fbId;
    }

    public int getFbIdCount() {
        return fbId.size();
    }

    public String getFbId(int index) {
        return fbId.get(index);
    }

    public DailySnsFriendInviteRequest withFbId(java.util.List<String> value) {
        return DailySnsFriendInviteRequest.newBuilder()
            .mergeFrom(this)
            .clearFbId()
            .addAllFbId(value)
            .build();
    }

    public boolean getSubmited() {
        return submited;
    }

    public boolean hasSubmited() {
        return (__bitField0 & 8) == 8;
    }

    public DailySnsFriendInviteRequest withSubmited(boolean value) {
        return DailySnsFriendInviteRequest.newBuilder()
            .mergeFrom(this)
            .setSubmited(value)
            .build();
    }

    public int getRequestType() {
        return requestType;
    }

    public boolean hasRequestType() {
        return (__bitField0 & 16) == 16;
    }

    public DailySnsFriendInviteRequest withRequestType(int value) {
        return DailySnsFriendInviteRequest.newBuilder()
            .mergeFrom(this)
            .setRequestType(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<DailySnsFriendInviteRequest> cachedSchema() {
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
        DailySnsFriendInviteRequest that = (DailySnsFriendInviteRequest) obj;
        if (!java.util.Objects.equals(this.snsId, that.snsId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.snsFlag, that.snsFlag)) {
            return false;
        }
        if (!java.util.Objects.equals(this.fbId, that.fbId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.submited, that.submited)) {
            return false;
        }
        if (!java.util.Objects.equals(this.requestType, that.requestType)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.snsId == null ? 0 : this.snsId.hashCode());
        result = 31 * result + Integer.hashCode(this.snsFlag);
        result = 31 * result + (this.fbId == null ? 0 : this.fbId.hashCode());
        result = 31 * result + Boolean.hashCode(this.submited);
        result = 31 * result + Integer.hashCode(this.requestType);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!snsId.isEmpty()) {
            parts.add("snsId=" + getSnsIdList());
        }
        if (hasSnsFlag()) {
            parts.add("snsFlag=" + getSnsFlag());
        }
        if (!fbId.isEmpty()) {
            parts.add("fbId=" + getFbIdList());
        }
        if (hasSubmited()) {
            parts.add("submited=" + getSubmited());
        }
        if (hasRequestType()) {
            parts.add("requestType=" + getRequestType());
        }
        return "DailySnsFriendInviteRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<DailySnsFriendInviteRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("snsId", 1);
        	__fieldMap.put("snsFlag", 2);
        	__fieldMap.put("fbId", 3);
        	__fieldMap.put("submited", 4);
        	__fieldMap.put("requestType", 5);
        }

        @Override
        public DailySnsFriendInviteRequest newMessage() {
            return new DailySnsFriendInviteRequest();
        }

        @Override
        public Class<DailySnsFriendInviteRequest> typeClass() {
            return DailySnsFriendInviteRequest.class;
        }

        @Override
        public String messageName() {
            return DailySnsFriendInviteRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return DailySnsFriendInviteRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(DailySnsFriendInviteRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, DailySnsFriendInviteRequest instance) throws java.io.IOException {
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
                    	if(!((instance.__bitField0 & 1) == 1)) {
                    	    instance.snsId = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.snsId.add(input.readString());

                    	break;
                    case 2:
                    	instance.snsFlag = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	if(!((instance.__bitField0 & 4) == 4)) {
                    	    instance.fbId = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 4;
                    	}
                    	instance.fbId.add(input.readString());

                    	break;
                    case 4:
                    	instance.submited = input.readBool();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.requestType = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.snsId = java.util.Collections.unmodifiableList(instance.snsId);
            }


            if((instance.__bitField0 & 4) == 4) {
                instance.fbId = java.util.Collections.unmodifiableList(instance.fbId);
            }



        }

        @Override
        public void writeTo(io.protostuff.Output output, DailySnsFriendInviteRequest instance) throws java.io.IOException {
            for(String snsId : instance.snsId) {
                output.writeString(1, snsId, true);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.snsFlag, false);
            }

            for(String fbId : instance.fbId) {
                output.writeString(3, fbId, true);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeBool(4, instance.submited, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.requestType, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "snsId";
        		case 2: return "snsFlag";
        		case 3: return "fbId";
        		case 4: return "submited";
        		case 5: return "requestType";
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

        private java.util.List<String> snsId;

        private int snsFlag;

        private java.util.List<String> fbId;

        private boolean submited;

        private int requestType;

        private int __bitField0;

        private Builder() {
            this.snsId = java.util.Collections.emptyList();
            this.snsFlag = 0;
            this.fbId = java.util.Collections.emptyList();
            this.submited = false;
            this.requestType = 0;
        }

        public Builder mergeFrom(DailySnsFriendInviteRequest instance) {
            this.addAllSnsId(instance.getSnsIdList());

            if (instance.hasSnsFlag()) {
                this.setSnsFlag(instance.getSnsFlag());
            }

            this.addAllFbId(instance.getFbIdList());

            if (instance.hasSubmited()) {
                this.setSubmited(instance.getSubmited());
            }

            if (instance.hasRequestType()) {
                this.setRequestType(instance.getRequestType());
            }

            return this;
        }

        public java.util.List<String> getSnsIdList() {
            return snsId;
        }

        public Builder setSnsId(int index, String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set DailySnsFriendInviteRequest#snsId to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.snsId = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.snsId.set(index, value);
            return this;
        }

        public Builder addSnsId(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set DailySnsFriendInviteRequest#snsId to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.snsId = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.snsId.add(value);
            return this;
        }

        public Builder addAllSnsId(java.lang.Iterable<String> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set DailySnsFriendInviteRequest#snsId to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.snsId = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final String value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set DailySnsFriendInviteRequest#snsId to null");
                }
                this.snsId.add(value);
            }
            return this;
        }

        public Builder clearSnsId() {
            this.snsId = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getSnsIdCount() {
            return snsId.size();
        }

        public String getSnsId(int index) {
            return snsId.get(index);
        }

        public int getSnsFlag() {
            return snsFlag;
        }

        public Builder setSnsFlag(int value) {
            this.snsFlag = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearSnsFlag() {
            this.snsFlag = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasSnsFlag() {
            return (__bitField0 & 2) == 2;
        }

        public java.util.List<String> getFbIdList() {
            return fbId;
        }

        public Builder setFbId(int index, String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set DailySnsFriendInviteRequest#fbId to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.fbId = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.fbId.set(index, value);
            return this;
        }

        public Builder addFbId(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set DailySnsFriendInviteRequest#fbId to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.fbId = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.fbId.add(value);
            return this;
        }

        public Builder addAllFbId(java.lang.Iterable<String> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set DailySnsFriendInviteRequest#fbId to null");
            }
            if(!((__bitField0 & 4) == 4)) {
                this.fbId = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            for (final String value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set DailySnsFriendInviteRequest#fbId to null");
                }
                this.fbId.add(value);
            }
            return this;
        }

        public Builder clearFbId() {
            this.fbId = java.util.Collections.emptyList();
            __bitField0 &= ~4;
            return this;
        }

        public int getFbIdCount() {
            return fbId.size();
        }

        public String getFbId(int index) {
            return fbId.get(index);
        }

        public boolean getSubmited() {
            return submited;
        }

        public Builder setSubmited(boolean value) {
            this.submited = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearSubmited() {
            this.submited = false;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasSubmited() {
            return (__bitField0 & 8) == 8;
        }

        public int getRequestType() {
            return requestType;
        }

        public Builder setRequestType(int value) {
            this.requestType = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearRequestType() {
            this.requestType = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasRequestType() {
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
            if (!java.util.Objects.equals(this.snsId, that.snsId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.snsFlag, that.snsFlag)) {
                return false;
            }
            if (!java.util.Objects.equals(this.fbId, that.fbId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.submited, that.submited)) {
                return false;
            }
            if (!java.util.Objects.equals(this.requestType, that.requestType)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.snsId == null ? 0 : this.snsId.hashCode());
            result = 31 * result + Integer.hashCode(this.snsFlag);
            result = 31 * result + (this.fbId == null ? 0 : this.fbId.hashCode());
            result = 31 * result + Boolean.hashCode(this.submited);
            result = 31 * result + Integer.hashCode(this.requestType);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!snsId.isEmpty()) {
                parts.add("snsId=" + getSnsIdList());
            }
            if (hasSnsFlag()) {
                parts.add("snsFlag=" + getSnsFlag());
            }
            if (!fbId.isEmpty()) {
                parts.add("fbId=" + getFbIdList());
            }
            if (hasSubmited()) {
                parts.add("submited=" + getSubmited());
            }
            if (hasRequestType()) {
                parts.add("requestType=" + getRequestType());
            }
            return "DailySnsFriendInviteRequest{" + String.join(", ", parts) + "}";
        }

        public DailySnsFriendInviteRequest build() {
            proto.message.DailySnsFriendInviteRequest result = new proto.message.DailySnsFriendInviteRequest();
            result.__bitField0 = __bitField0;
            result.snsId = java.util.Collections.unmodifiableList(this.snsId);
            result.snsFlag = this.snsFlag;
            result.fbId = java.util.Collections.unmodifiableList(this.fbId);
            result.submited = this.submited;
            result.requestType = this.requestType;
            return result;
        }

    }



}