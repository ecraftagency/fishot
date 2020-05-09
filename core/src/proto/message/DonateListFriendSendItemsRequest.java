package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class DonateListFriendSendItemsRequest
        implements io.protostuff.Message<DonateListFriendSendItemsRequest> {

    private static final DonateListFriendSendItemsRequest DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<String> userIDFriends;

    private boolean __merge_lock = false;
    private int __bitField0;

    private DonateListFriendSendItemsRequest() {
        this.userIDFriends = java.util.Collections.emptyList();
    }

    private DonateListFriendSendItemsRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static DonateListFriendSendItemsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<DonateListFriendSendItemsRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<String> getUserIDFriendsList() {
        return userIDFriends;
    }

    public int getUserIDFriendsCount() {
        return userIDFriends.size();
    }

    public String getUserIDFriends(int index) {
        return userIDFriends.get(index);
    }

    public DonateListFriendSendItemsRequest withUserIDFriends(java.util.List<String> value) {
        return DonateListFriendSendItemsRequest.newBuilder()
            .mergeFrom(this)
            .clearUserIDFriends()
            .addAllUserIDFriends(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<DonateListFriendSendItemsRequest> cachedSchema() {
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
        DonateListFriendSendItemsRequest that = (DonateListFriendSendItemsRequest) obj;
        if (!java.util.Objects.equals(this.userIDFriends, that.userIDFriends)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.userIDFriends == null ? 0 : this.userIDFriends.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!userIDFriends.isEmpty()) {
            parts.add("userIDFriends=" + getUserIDFriendsList());
        }
        return "DonateListFriendSendItemsRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<DonateListFriendSendItemsRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("userIDFriends", 1);
        }

        @Override
        public DonateListFriendSendItemsRequest newMessage() {
            return new DonateListFriendSendItemsRequest();
        }

        @Override
        public Class<DonateListFriendSendItemsRequest> typeClass() {
            return DonateListFriendSendItemsRequest.class;
        }

        @Override
        public String messageName() {
            return DonateListFriendSendItemsRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return DonateListFriendSendItemsRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(DonateListFriendSendItemsRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, DonateListFriendSendItemsRequest instance) throws java.io.IOException {
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
                    	    instance.userIDFriends = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.userIDFriends.add(input.readString());

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.userIDFriends = java.util.Collections.unmodifiableList(instance.userIDFriends);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, DonateListFriendSendItemsRequest instance) throws java.io.IOException {
            for(String userIDFriends : instance.userIDFriends) {
                output.writeString(1, userIDFriends, true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "userIDFriends";
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

        private java.util.List<String> userIDFriends;

        private int __bitField0;

        private Builder() {
            this.userIDFriends = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(DonateListFriendSendItemsRequest instance) {
            this.addAllUserIDFriends(instance.getUserIDFriendsList());

            return this;
        }

        public java.util.List<String> getUserIDFriendsList() {
            return userIDFriends;
        }

        public Builder setUserIDFriends(int index, String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set DonateListFriendSendItemsRequest#userIDFriends to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.userIDFriends = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.userIDFriends.set(index, value);
            return this;
        }

        public Builder addUserIDFriends(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set DonateListFriendSendItemsRequest#userIDFriends to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.userIDFriends = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.userIDFriends.add(value);
            return this;
        }

        public Builder addAllUserIDFriends(java.lang.Iterable<String> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set DonateListFriendSendItemsRequest#userIDFriends to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.userIDFriends = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final String value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set DonateListFriendSendItemsRequest#userIDFriends to null");
                }
                this.userIDFriends.add(value);
            }
            return this;
        }

        public Builder clearUserIDFriends() {
            this.userIDFriends = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getUserIDFriendsCount() {
            return userIDFriends.size();
        }

        public String getUserIDFriends(int index) {
            return userIDFriends.get(index);
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
            if (!java.util.Objects.equals(this.userIDFriends, that.userIDFriends)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.userIDFriends == null ? 0 : this.userIDFriends.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!userIDFriends.isEmpty()) {
                parts.add("userIDFriends=" + getUserIDFriendsList());
            }
            return "DonateListFriendSendItemsRequest{" + String.join(", ", parts) + "}";
        }

        public DonateListFriendSendItemsRequest build() {
            proto.message.DonateListFriendSendItemsRequest result = new proto.message.DonateListFriendSendItemsRequest();
            result.__bitField0 = __bitField0;
            result.userIDFriends = java.util.Collections.unmodifiableList(this.userIDFriends);
            return result;
        }

    }



}