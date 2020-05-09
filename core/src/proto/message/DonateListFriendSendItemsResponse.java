package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class DonateListFriendSendItemsResponse
        implements io.protostuff.Message<DonateListFriendSendItemsResponse> {

    private static final DonateListFriendSendItemsResponse DEFAULT_INSTANCE = newBuilder().build();

    private int result;

    private java.util.List<String> userIDFriends;

    private int numberSendDonate;

    private boolean __merge_lock = false;
    private int __bitField0;

    private DonateListFriendSendItemsResponse() {
        this.result = proto.message.ProfileResultCode.PROFILE_CLAIM_INBOX_OK.getNumber();
        this.userIDFriends = java.util.Collections.emptyList();
        this.numberSendDonate = 0;
    }

    private DonateListFriendSendItemsResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static DonateListFriendSendItemsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<DonateListFriendSendItemsResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public proto.message.ProfileResultCode getResult() {
        return proto.message.ProfileResultCode.valueOf(result);
    }

    public int getResultValue() {
        return result;
    }

    public boolean hasResult() {
        return (__bitField0 & 1) == 1;
    }

    public DonateListFriendSendItemsResponse withResult(proto.message.ProfileResultCode value) {
        return DonateListFriendSendItemsResponse.newBuilder()
            .mergeFrom(this)
            .setResult(value)
            .build();
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

    public DonateListFriendSendItemsResponse withUserIDFriends(java.util.List<String> value) {
        return DonateListFriendSendItemsResponse.newBuilder()
            .mergeFrom(this)
            .clearUserIDFriends()
            .addAllUserIDFriends(value)
            .build();
    }

    public int getNumberSendDonate() {
        return numberSendDonate;
    }

    public boolean hasNumberSendDonate() {
        return (__bitField0 & 4) == 4;
    }

    public DonateListFriendSendItemsResponse withNumberSendDonate(int value) {
        return DonateListFriendSendItemsResponse.newBuilder()
            .mergeFrom(this)
            .setNumberSendDonate(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<DonateListFriendSendItemsResponse> cachedSchema() {
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
        DonateListFriendSendItemsResponse that = (DonateListFriendSendItemsResponse) obj;
        if (!java.util.Objects.equals(this.result, that.result)) {
            return false;
        }
        if (!java.util.Objects.equals(this.userIDFriends, that.userIDFriends)) {
            return false;
        }
        if (!java.util.Objects.equals(this.numberSendDonate, that.numberSendDonate)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.result);
        result = 31 * result + (this.userIDFriends == null ? 0 : this.userIDFriends.hashCode());
        result = 31 * result + Integer.hashCode(this.numberSendDonate);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasResult()) {
            parts.add("result=" + getResult() + '(' + getResultValue() + ')');
        }
        if (!userIDFriends.isEmpty()) {
            parts.add("userIDFriends=" + getUserIDFriendsList());
        }
        if (hasNumberSendDonate()) {
            parts.add("numberSendDonate=" + getNumberSendDonate());
        }
        return "DonateListFriendSendItemsResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<DonateListFriendSendItemsResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("result", 1);
        	__fieldMap.put("userIDFriends", 2);
        	__fieldMap.put("numberSendDonate", 3);
        }

        @Override
        public DonateListFriendSendItemsResponse newMessage() {
            return new DonateListFriendSendItemsResponse();
        }

        @Override
        public Class<DonateListFriendSendItemsResponse> typeClass() {
            return DonateListFriendSendItemsResponse.class;
        }

        @Override
        public String messageName() {
            return DonateListFriendSendItemsResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return DonateListFriendSendItemsResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(DonateListFriendSendItemsResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, DonateListFriendSendItemsResponse instance) throws java.io.IOException {
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
                    	instance.result = input.readEnum();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	if(!((instance.__bitField0 & 2) == 2)) {
                    	    instance.userIDFriends = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 2;
                    	}
                    	instance.userIDFriends.add(input.readString());

                    	break;
                    case 3:
                    	instance.numberSendDonate = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 2) == 2) {
                instance.userIDFriends = java.util.Collections.unmodifiableList(instance.userIDFriends);
            }


        }

        @Override
        public void writeTo(io.protostuff.Output output, DonateListFriendSendItemsResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.result, false);
            }

            for(String userIDFriends : instance.userIDFriends) {
                output.writeString(2, userIDFriends, true);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.numberSendDonate, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "result";
        		case 2: return "userIDFriends";
        		case 3: return "numberSendDonate";
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

        private int result;

        private java.util.List<String> userIDFriends;

        private int numberSendDonate;

        private int __bitField0;

        private Builder() {
            this.result = proto.message.ProfileResultCode.PROFILE_CLAIM_INBOX_OK.getNumber();
            this.userIDFriends = java.util.Collections.emptyList();
            this.numberSendDonate = 0;
        }

        public Builder mergeFrom(DonateListFriendSendItemsResponse instance) {
            if (instance.hasResult()) {
                this.setResult(instance.getResult());
            }

            this.addAllUserIDFriends(instance.getUserIDFriendsList());

            if (instance.hasNumberSendDonate()) {
                this.setNumberSendDonate(instance.getNumberSendDonate());
            }

            return this;
        }

        public proto.message.ProfileResultCode getResult() {
            return proto.message.ProfileResultCode.valueOf(result);
        }

        public int getResultValue() {
            return result;
        }

        public Builder setResult(proto.message.ProfileResultCode value) {
            if (value == null) {
                throw new NullPointerException("Cannot set DonateListFriendSendItemsResponse#result to null");
            }

            if (value == proto.message.ProfileResultCode.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set DonateListFriendSendItemsResponse#result to UNRECOGNIZED");
            }

            this.result = value.getNumber();
            __bitField0 |= 1;
            return this;
        }

        public Builder setResultValue(int value) {
            this.result = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearResult() {
            this.result = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasResult() {
            return (__bitField0 & 1) == 1;
        }

        public java.util.List<String> getUserIDFriendsList() {
            return userIDFriends;
        }

        public Builder setUserIDFriends(int index, String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set DonateListFriendSendItemsResponse#userIDFriends to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.userIDFriends = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.userIDFriends.set(index, value);
            return this;
        }

        public Builder addUserIDFriends(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set DonateListFriendSendItemsResponse#userIDFriends to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.userIDFriends = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.userIDFriends.add(value);
            return this;
        }

        public Builder addAllUserIDFriends(java.lang.Iterable<String> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set DonateListFriendSendItemsResponse#userIDFriends to null");
            }
            if(!((__bitField0 & 2) == 2)) {
                this.userIDFriends = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            for (final String value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set DonateListFriendSendItemsResponse#userIDFriends to null");
                }
                this.userIDFriends.add(value);
            }
            return this;
        }

        public Builder clearUserIDFriends() {
            this.userIDFriends = java.util.Collections.emptyList();
            __bitField0 &= ~2;
            return this;
        }

        public int getUserIDFriendsCount() {
            return userIDFriends.size();
        }

        public String getUserIDFriends(int index) {
            return userIDFriends.get(index);
        }

        public int getNumberSendDonate() {
            return numberSendDonate;
        }

        public Builder setNumberSendDonate(int value) {
            this.numberSendDonate = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearNumberSendDonate() {
            this.numberSendDonate = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasNumberSendDonate() {
            return (__bitField0 & 4) == 4;
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
            if (!java.util.Objects.equals(this.result, that.result)) {
                return false;
            }
            if (!java.util.Objects.equals(this.userIDFriends, that.userIDFriends)) {
                return false;
            }
            if (!java.util.Objects.equals(this.numberSendDonate, that.numberSendDonate)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.result);
            result = 31 * result + (this.userIDFriends == null ? 0 : this.userIDFriends.hashCode());
            result = 31 * result + Integer.hashCode(this.numberSendDonate);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasResult()) {
                parts.add("result=" + getResult() + '(' + getResultValue() + ')');
            }
            if (!userIDFriends.isEmpty()) {
                parts.add("userIDFriends=" + getUserIDFriendsList());
            }
            if (hasNumberSendDonate()) {
                parts.add("numberSendDonate=" + getNumberSendDonate());
            }
            return "DonateListFriendSendItemsResponse{" + String.join(", ", parts) + "}";
        }

        public DonateListFriendSendItemsResponse build() {
            proto.message.DonateListFriendSendItemsResponse result = new proto.message.DonateListFriendSendItemsResponse();
            result.__bitField0 = __bitField0;
            result.result = this.result;
            result.userIDFriends = java.util.Collections.unmodifiableList(this.userIDFriends);
            result.numberSendDonate = this.numberSendDonate;
            return result;
        }

    }



}