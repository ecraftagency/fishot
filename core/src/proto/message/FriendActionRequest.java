package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class FriendActionRequest
        implements io.protostuff.Message<FriendActionRequest> {

    private static final FriendActionRequest DEFAULT_INSTANCE = newBuilder().build();

    private String friendID;

    private boolean __merge_lock = false;
    private int __bitField0;

    private FriendActionRequest() {
        this.friendID = "";
    }

    private FriendActionRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static FriendActionRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<FriendActionRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getFriendID() {
        return friendID;
    }

    public boolean hasFriendID() {
        return (__bitField0 & 1) == 1;
    }

    public FriendActionRequest withFriendID(String value) {
        return FriendActionRequest.newBuilder()
            .mergeFrom(this)
            .setFriendID(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<FriendActionRequest> cachedSchema() {
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
        FriendActionRequest that = (FriendActionRequest) obj;
        if (!java.util.Objects.equals(this.friendID, that.friendID)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.friendID == null ? 0 : this.friendID.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasFriendID()) {
            parts.add("friendID=" + getFriendID());
        }
        return "FriendActionRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<FriendActionRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("friendID", 1);
        }

        @Override
        public FriendActionRequest newMessage() {
            return new FriendActionRequest();
        }

        @Override
        public Class<FriendActionRequest> typeClass() {
            return FriendActionRequest.class;
        }

        @Override
        public String messageName() {
            return FriendActionRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return FriendActionRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(FriendActionRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, FriendActionRequest instance) throws java.io.IOException {
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
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, FriendActionRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.friendID, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "friendID";
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

        private int __bitField0;

        private Builder() {
            this.friendID = "";
        }

        public Builder mergeFrom(FriendActionRequest instance) {
            if (instance.hasFriendID()) {
                this.setFriendID(instance.getFriendID());
            }

            return this;
        }

        public String getFriendID() {
            return friendID;
        }

        public Builder setFriendID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendActionRequest#friendID to null");
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

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.friendID == null ? 0 : this.friendID.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasFriendID()) {
                parts.add("friendID=" + getFriendID());
            }
            return "FriendActionRequest{" + String.join(", ", parts) + "}";
        }

        public FriendActionRequest build() {
            proto.message.FriendActionRequest result = new proto.message.FriendActionRequest();
            result.__bitField0 = __bitField0;
            result.friendID = this.friendID;
            return result;
        }

    }



}