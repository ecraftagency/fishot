package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class FriendSearchResponse
        implements io.protostuff.Message<FriendSearchResponse> {

    private static final FriendSearchResponse DEFAULT_INSTANCE = newBuilder().build();

    private String userID;

    private String template;

    private java.util.List<proto.message.FriendDetail> friendDetail;

    private boolean __merge_lock = false;
    private int __bitField0;

    private FriendSearchResponse() {
        this.userID = "";
        this.template = "";
        this.friendDetail = java.util.Collections.emptyList();
    }

    private FriendSearchResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static FriendSearchResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<FriendSearchResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getUserID() {
        return userID;
    }

    public boolean hasUserID() {
        return (__bitField0 & 1) == 1;
    }

    public FriendSearchResponse withUserID(String value) {
        return FriendSearchResponse.newBuilder()
            .mergeFrom(this)
            .setUserID(value)
            .build();
    }

    public String getTemplate() {
        return template;
    }

    public boolean hasTemplate() {
        return (__bitField0 & 2) == 2;
    }

    public FriendSearchResponse withTemplate(String value) {
        return FriendSearchResponse.newBuilder()
            .mergeFrom(this)
            .setTemplate(value)
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

    public FriendSearchResponse withFriendDetail(java.util.List<proto.message.FriendDetail> value) {
        return FriendSearchResponse.newBuilder()
            .mergeFrom(this)
            .clearFriendDetail()
            .addAllFriendDetail(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<FriendSearchResponse> cachedSchema() {
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
        FriendSearchResponse that = (FriendSearchResponse) obj;
        if (!java.util.Objects.equals(this.userID, that.userID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.template, that.template)) {
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
        result = 31 * result + (this.template == null ? 0 : this.template.hashCode());
        result = 31 * result + (this.friendDetail == null ? 0 : this.friendDetail.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasUserID()) {
            parts.add("userID=" + getUserID());
        }
        if (hasTemplate()) {
            parts.add("template=" + getTemplate());
        }
        if (!friendDetail.isEmpty()) {
            parts.add("friendDetail=" + getFriendDetailList());
        }
        return "FriendSearchResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<FriendSearchResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("userID", 1);
        	__fieldMap.put("template", 2);
        	__fieldMap.put("friendDetail", 3);
        }

        @Override
        public FriendSearchResponse newMessage() {
            return new FriendSearchResponse();
        }

        @Override
        public Class<FriendSearchResponse> typeClass() {
            return FriendSearchResponse.class;
        }

        @Override
        public String messageName() {
            return FriendSearchResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return FriendSearchResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(FriendSearchResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, FriendSearchResponse instance) throws java.io.IOException {
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
                    	instance.template = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	if(!((instance.__bitField0 & 4) == 4)) {
                    	    instance.friendDetail = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 4;
                    	}
                    	instance.friendDetail.add(input.mergeObject(null, proto.message.FriendDetail.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 4) == 4) {
                instance.friendDetail = java.util.Collections.unmodifiableList(instance.friendDetail);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, FriendSearchResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.userID, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.template, false);
            }

            for(proto.message.FriendDetail friendDetail : instance.friendDetail) {
                output.writeObject(3, friendDetail, proto.message.FriendDetail.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "userID";
        		case 2: return "template";
        		case 3: return "friendDetail";
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

        private String template;

        private java.util.List<proto.message.FriendDetail> friendDetail;

        private int __bitField0;

        private Builder() {
            this.userID = "";
            this.template = "";
            this.friendDetail = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(FriendSearchResponse instance) {
            if (instance.hasUserID()) {
                this.setUserID(instance.getUserID());
            }

            if (instance.hasTemplate()) {
                this.setTemplate(instance.getTemplate());
            }

            this.addAllFriendDetail(instance.getFriendDetailList());

            return this;
        }

        public String getUserID() {
            return userID;
        }

        public Builder setUserID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendSearchResponse#userID to null");
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

        public String getTemplate() {
            return template;
        }

        public Builder setTemplate(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendSearchResponse#template to null");
            }

            this.template = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearTemplate() {
            this.template = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasTemplate() {
            return (__bitField0 & 2) == 2;
        }

        public java.util.List<proto.message.FriendDetail> getFriendDetailList() {
            return friendDetail;
        }

        public Builder setFriendDetail(int index, proto.message.FriendDetail value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendSearchResponse#friendDetail to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.friendDetail = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.friendDetail.set(index, value);
            return this;
        }

        public Builder addFriendDetail(proto.message.FriendDetail value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendSearchResponse#friendDetail to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.friendDetail = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.friendDetail.add(value);
            return this;
        }

        public Builder addAllFriendDetail(java.lang.Iterable<proto.message.FriendDetail> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set FriendSearchResponse#friendDetail to null");
            }
            if(!((__bitField0 & 4) == 4)) {
                this.friendDetail = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            for (final proto.message.FriendDetail value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set FriendSearchResponse#friendDetail to null");
                }
                this.friendDetail.add(value);
            }
            return this;
        }

        public Builder clearFriendDetail() {
            this.friendDetail = java.util.Collections.emptyList();
            __bitField0 &= ~4;
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
            if (!java.util.Objects.equals(this.template, that.template)) {
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
            result = 31 * result + (this.template == null ? 0 : this.template.hashCode());
            result = 31 * result + (this.friendDetail == null ? 0 : this.friendDetail.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasUserID()) {
                parts.add("userID=" + getUserID());
            }
            if (hasTemplate()) {
                parts.add("template=" + getTemplate());
            }
            if (!friendDetail.isEmpty()) {
                parts.add("friendDetail=" + getFriendDetailList());
            }
            return "FriendSearchResponse{" + String.join(", ", parts) + "}";
        }

        public FriendSearchResponse build() {
            proto.message.FriendSearchResponse result = new proto.message.FriendSearchResponse();
            result.__bitField0 = __bitField0;
            result.userID = this.userID;
            result.template = this.template;
            result.friendDetail = java.util.Collections.unmodifiableList(this.friendDetail);
            return result;
        }

    }



}