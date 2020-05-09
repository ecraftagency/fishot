package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class FriendMessageSendRequest
        implements io.protostuff.Message<FriendMessageSendRequest> {

    private static final FriendMessageSendRequest DEFAULT_INSTANCE = newBuilder().build();

    private String friendID;

    private String message;

    private boolean __merge_lock = false;
    private int __bitField0;

    private FriendMessageSendRequest() {
        this.friendID = "";
        this.message = "";
    }

    private FriendMessageSendRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static FriendMessageSendRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<FriendMessageSendRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getFriendID() {
        return friendID;
    }

    public boolean hasFriendID() {
        return (__bitField0 & 1) == 1;
    }

    public FriendMessageSendRequest withFriendID(String value) {
        return FriendMessageSendRequest.newBuilder()
            .mergeFrom(this)
            .setFriendID(value)
            .build();
    }

    public String getMessage() {
        return message;
    }

    public boolean hasMessage() {
        return (__bitField0 & 2) == 2;
    }

    public FriendMessageSendRequest withMessage(String value) {
        return FriendMessageSendRequest.newBuilder()
            .mergeFrom(this)
            .setMessage(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<FriendMessageSendRequest> cachedSchema() {
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
        FriendMessageSendRequest that = (FriendMessageSendRequest) obj;
        if (!java.util.Objects.equals(this.friendID, that.friendID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.message, that.message)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.friendID == null ? 0 : this.friendID.hashCode());
        result = 31 * result + (this.message == null ? 0 : this.message.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasFriendID()) {
            parts.add("friendID=" + getFriendID());
        }
        if (hasMessage()) {
            parts.add("message=" + getMessage());
        }
        return "FriendMessageSendRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<FriendMessageSendRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("friendID", 1);
        	__fieldMap.put("message", 2);
        }

        @Override
        public FriendMessageSendRequest newMessage() {
            return new FriendMessageSendRequest();
        }

        @Override
        public Class<FriendMessageSendRequest> typeClass() {
            return FriendMessageSendRequest.class;
        }

        @Override
        public String messageName() {
            return FriendMessageSendRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return FriendMessageSendRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(FriendMessageSendRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, FriendMessageSendRequest instance) throws java.io.IOException {
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
                    	instance.friendID = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.message = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, FriendMessageSendRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.friendID, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.message, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "friendID";
        		case 2: return "message";
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

        private String friendID;

        private String message;

        private int __bitField0;

        private Builder() {
            this.friendID = "";
            this.message = "";
        }

        public Builder mergeFrom(FriendMessageSendRequest instance) {
            if (instance.hasFriendID()) {
                this.setFriendID(instance.getFriendID());
            }

            if (instance.hasMessage()) {
                this.setMessage(instance.getMessage());
            }

            return this;
        }

        public String getFriendID() {
            return friendID;
        }

        public Builder setFriendID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendMessageSendRequest#friendID to null");
            }

            this.friendID = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearFriendID() {
            this.friendID = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasFriendID() {
            return (__bitField0 & 1) == 1;
        }

        public String getMessage() {
            return message;
        }

        public Builder setMessage(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendMessageSendRequest#message to null");
            }

            this.message = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearMessage() {
            this.message = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasMessage() {
            return (__bitField0 & 2) == 2;
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
            if (!java.util.Objects.equals(this.friendID, that.friendID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.message, that.message)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.friendID == null ? 0 : this.friendID.hashCode());
            result = 31 * result + (this.message == null ? 0 : this.message.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasFriendID()) {
                parts.add("friendID=" + getFriendID());
            }
            if (hasMessage()) {
                parts.add("message=" + getMessage());
            }
            return "FriendMessageSendRequest{" + String.join(", ", parts) + "}";
        }

        public FriendMessageSendRequest build() {
            proto.message.FriendMessageSendRequest result = new proto.message.FriendMessageSendRequest();
            result.__bitField0 = __bitField0;
            result.friendID = this.friendID;
            result.message = this.message;
            return result;
        }

    }



}