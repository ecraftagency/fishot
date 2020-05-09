package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class DonateFriendReceiveItemsRequest
        implements io.protostuff.Message<DonateFriendReceiveItemsRequest> {

    private static final DonateFriendReceiveItemsRequest DEFAULT_INSTANCE = newBuilder().build();

    private String userIDFriend;

    private boolean __merge_lock = false;
    private int __bitField0;

    private DonateFriendReceiveItemsRequest() {
        this.userIDFriend = "";
    }

    private DonateFriendReceiveItemsRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static DonateFriendReceiveItemsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<DonateFriendReceiveItemsRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getUserIDFriend() {
        return userIDFriend;
    }

    public boolean hasUserIDFriend() {
        return (__bitField0 & 1) == 1;
    }

    public DonateFriendReceiveItemsRequest withUserIDFriend(String value) {
        return DonateFriendReceiveItemsRequest.newBuilder()
            .mergeFrom(this)
            .setUserIDFriend(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<DonateFriendReceiveItemsRequest> cachedSchema() {
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
        DonateFriendReceiveItemsRequest that = (DonateFriendReceiveItemsRequest) obj;
        if (!java.util.Objects.equals(this.userIDFriend, that.userIDFriend)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.userIDFriend == null ? 0 : this.userIDFriend.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasUserIDFriend()) {
            parts.add("userIDFriend=" + getUserIDFriend());
        }
        return "DonateFriendReceiveItemsRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<DonateFriendReceiveItemsRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("userIDFriend", 1);
        }

        @Override
        public DonateFriendReceiveItemsRequest newMessage() {
            return new DonateFriendReceiveItemsRequest();
        }

        @Override
        public Class<DonateFriendReceiveItemsRequest> typeClass() {
            return DonateFriendReceiveItemsRequest.class;
        }

        @Override
        public String messageName() {
            return DonateFriendReceiveItemsRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return DonateFriendReceiveItemsRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(DonateFriendReceiveItemsRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, DonateFriendReceiveItemsRequest instance) throws java.io.IOException {
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
                    	instance.userIDFriend = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, DonateFriendReceiveItemsRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.userIDFriend, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "userIDFriend";
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

        private String userIDFriend;

        private int __bitField0;

        private Builder() {
            this.userIDFriend = "";
        }

        public Builder mergeFrom(DonateFriendReceiveItemsRequest instance) {
            if (instance.hasUserIDFriend()) {
                this.setUserIDFriend(instance.getUserIDFriend());
            }

            return this;
        }

        public String getUserIDFriend() {
            return userIDFriend;
        }

        public Builder setUserIDFriend(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set DonateFriendReceiveItemsRequest#userIDFriend to null");
            }

            this.userIDFriend = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearUserIDFriend() {
            this.userIDFriend = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasUserIDFriend() {
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
            if (!java.util.Objects.equals(this.userIDFriend, that.userIDFriend)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.userIDFriend == null ? 0 : this.userIDFriend.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasUserIDFriend()) {
                parts.add("userIDFriend=" + getUserIDFriend());
            }
            return "DonateFriendReceiveItemsRequest{" + String.join(", ", parts) + "}";
        }

        public DonateFriendReceiveItemsRequest build() {
            proto.message.DonateFriendReceiveItemsRequest result = new proto.message.DonateFriendReceiveItemsRequest();
            result.__bitField0 = __bitField0;
            result.userIDFriend = this.userIDFriend;
            return result;
        }

    }



}