package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class FriendListDetailResponse
        implements io.protostuff.Message<FriendListDetailResponse> {

    private static final FriendListDetailResponse DEFAULT_INSTANCE = newBuilder().build();

    private String userID;

    private java.util.List<proto.message.FriendDetail> friendDetail;

    private boolean __merge_lock = false;
    private int __bitField0;

    private FriendListDetailResponse() {
        this.userID = "";
        this.friendDetail = java.util.Collections.emptyList();
    }

    private FriendListDetailResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static FriendListDetailResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<FriendListDetailResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getUserID() {
        return userID;
    }

    public boolean hasUserID() {
        return (__bitField0 & 1) == 1;
    }

    public FriendListDetailResponse withUserID(String value) {
        return FriendListDetailResponse.newBuilder()
            .mergeFrom(this)
            .setUserID(value)
            .build();
    }

    public java.util.List<proto.message.FriendDetail> getFriendDetailList() {
        return friendDetail;
    }

    public int getFriendDetailCount() {
        return friendDetail.size();
    }

    public proto.message.FriendDetail getFriendDetail(int index) {
        return friendDetail.get(index);
    }

    public FriendListDetailResponse withFriendDetail(java.util.List<proto.message.FriendDetail> value) {
        return FriendListDetailResponse.newBuilder()
            .mergeFrom(this)
            .clearFriendDetail()
            .addAllFriendDetail(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<FriendListDetailResponse> cachedSchema() {
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
        FriendListDetailResponse that = (FriendListDetailResponse) obj;
        if (!java.util.Objects.equals(this.userID, that.userID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.friendDetail, that.friendDetail)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
        result = 31 * result + (this.friendDetail == null ? 0 : this.friendDetail.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasUserID()) {
            parts.add("userID=" + getUserID());
        }
        if (!friendDetail.isEmpty()) {
            parts.add("friendDetail=" + getFriendDetailList());
        }
        return "FriendListDetailResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<FriendListDetailResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("userID", 1);
        	__fieldMap.put("friendDetail", 2);
        }

        @Override
        public FriendListDetailResponse newMessage() {
            return new FriendListDetailResponse();
        }

        @Override
        public Class<FriendListDetailResponse> typeClass() {
            return FriendListDetailResponse.class;
        }

        @Override
        public String messageName() {
            return FriendListDetailResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return FriendListDetailResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(FriendListDetailResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, FriendListDetailResponse instance) throws java.io.IOException {
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
                    	if(!((instance.__bitField0 & 2) == 2)) {
                    	    instance.friendDetail = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 2;
                    	}
                    	instance.friendDetail.add(input.mergeObject(null, proto.message.FriendDetail.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 2) == 2) {
                instance.friendDetail = java.util.Collections.unmodifiableList(instance.friendDetail);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, FriendListDetailResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.userID, false);
            }

            for(proto.message.FriendDetail friendDetail : instance.friendDetail) {
                output.writeObject(2, friendDetail, proto.message.FriendDetail.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "userID";
        		case 2: return "friendDetail";
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

        private java.util.List<proto.message.FriendDetail> friendDetail;

        private int __bitField0;

        private Builder() {
            this.userID = "";
            this.friendDetail = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(FriendListDetailResponse instance) {
            if (instance.hasUserID()) {
                this.setUserID(instance.getUserID());
            }

            this.addAllFriendDetail(instance.getFriendDetailList());

            return this;
        }

        public String getUserID() {
            return userID;
        }

        public Builder setUserID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendListDetailResponse#userID to null");
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

        public java.util.List<proto.message.FriendDetail> getFriendDetailList() {
            return friendDetail;
        }

        public Builder setFriendDetail(int index, proto.message.FriendDetail value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendListDetailResponse#friendDetail to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.friendDetail = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.friendDetail.set(index, value);
            return this;
        }

        public Builder addFriendDetail(proto.message.FriendDetail value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendListDetailResponse#friendDetail to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.friendDetail = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.friendDetail.add(value);
            return this;
        }

        public Builder addAllFriendDetail(java.lang.Iterable<proto.message.FriendDetail> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set FriendListDetailResponse#friendDetail to null");
            }
            if(!((__bitField0 & 2) == 2)) {
                this.friendDetail = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            for (final proto.message.FriendDetail value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set FriendListDetailResponse#friendDetail to null");
                }
                this.friendDetail.add(value);
            }
            return this;
        }

        public Builder clearFriendDetail() {
            this.friendDetail = java.util.Collections.emptyList();
            __bitField0 &= ~2;
            return this;
        }

        public int getFriendDetailCount() {
            return friendDetail.size();
        }

        public proto.message.FriendDetail getFriendDetail(int index) {
            return friendDetail.get(index);
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
            if (!java.util.Objects.equals(this.friendDetail, that.friendDetail)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
            result = 31 * result + (this.friendDetail == null ? 0 : this.friendDetail.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasUserID()) {
                parts.add("userID=" + getUserID());
            }
            if (!friendDetail.isEmpty()) {
                parts.add("friendDetail=" + getFriendDetailList());
            }
            return "FriendListDetailResponse{" + String.join(", ", parts) + "}";
        }

        public FriendListDetailResponse build() {
            proto.message.FriendListDetailResponse result = new proto.message.FriendListDetailResponse();
            result.__bitField0 = __bitField0;
            result.userID = this.userID;
            result.friendDetail = java.util.Collections.unmodifiableList(this.friendDetail);
            return result;
        }

    }



}