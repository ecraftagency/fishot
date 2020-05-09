package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class DonateFriendSendItemsResponse
        implements io.protostuff.Message<DonateFriendSendItemsResponse> {

    private static final DonateFriendSendItemsResponse DEFAULT_INSTANCE = newBuilder().build();

    private int result;

    private String userIDFriend;

    private int numberSendDonate;

    private boolean __merge_lock = false;
    private int __bitField0;

    private DonateFriendSendItemsResponse() {
        this.result = proto.message.ProfileResultCode.PROFILE_CLAIM_INBOX_OK.getNumber();
        this.userIDFriend = "";
        this.numberSendDonate = 0;
    }

    private DonateFriendSendItemsResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static DonateFriendSendItemsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<DonateFriendSendItemsResponse> getSchema()
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

    public DonateFriendSendItemsResponse withResult(proto.message.ProfileResultCode value) {
        return DonateFriendSendItemsResponse.newBuilder()
            .mergeFrom(this)
            .setResult(value)
            .build();
    }

    public String getUserIDFriend() {
        return userIDFriend;
    }

    public boolean hasUserIDFriend() {
        return (__bitField0 & 2) == 2;
    }

    public DonateFriendSendItemsResponse withUserIDFriend(String value) {
        return DonateFriendSendItemsResponse.newBuilder()
            .mergeFrom(this)
            .setUserIDFriend(value)
            .build();
    }

    public int getNumberSendDonate() {
        return numberSendDonate;
    }

    public boolean hasNumberSendDonate() {
        return (__bitField0 & 4) == 4;
    }

    public DonateFriendSendItemsResponse withNumberSendDonate(int value) {
        return DonateFriendSendItemsResponse.newBuilder()
            .mergeFrom(this)
            .setNumberSendDonate(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<DonateFriendSendItemsResponse> cachedSchema() {
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
        DonateFriendSendItemsResponse that = (DonateFriendSendItemsResponse) obj;
        if (!java.util.Objects.equals(this.result, that.result)) {
            return false;
        }
        if (!java.util.Objects.equals(this.userIDFriend, that.userIDFriend)) {
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
        result = 31 * result + (this.userIDFriend == null ? 0 : this.userIDFriend.hashCode());
        result = 31 * result + Integer.hashCode(this.numberSendDonate);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasResult()) {
            parts.add("result=" + getResult() + '(' + getResultValue() + ')');
        }
        if (hasUserIDFriend()) {
            parts.add("userIDFriend=" + getUserIDFriend());
        }
        if (hasNumberSendDonate()) {
            parts.add("numberSendDonate=" + getNumberSendDonate());
        }
        return "DonateFriendSendItemsResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<DonateFriendSendItemsResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("result", 1);
        	__fieldMap.put("userIDFriend", 2);
        	__fieldMap.put("numberSendDonate", 3);
        }

        @Override
        public DonateFriendSendItemsResponse newMessage() {
            return new DonateFriendSendItemsResponse();
        }

        @Override
        public Class<DonateFriendSendItemsResponse> typeClass() {
            return DonateFriendSendItemsResponse.class;
        }

        @Override
        public String messageName() {
            return DonateFriendSendItemsResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return DonateFriendSendItemsResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(DonateFriendSendItemsResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, DonateFriendSendItemsResponse instance) throws java.io.IOException {
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
                    	instance.userIDFriend = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.numberSendDonate = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, DonateFriendSendItemsResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.result, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.userIDFriend, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.numberSendDonate, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "result";
        		case 2: return "userIDFriend";
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

        private String userIDFriend;

        private int numberSendDonate;

        private int __bitField0;

        private Builder() {
            this.result = proto.message.ProfileResultCode.PROFILE_CLAIM_INBOX_OK.getNumber();
            this.userIDFriend = "";
            this.numberSendDonate = 0;
        }

        public Builder mergeFrom(DonateFriendSendItemsResponse instance) {
            if (instance.hasResult()) {
                this.setResult(instance.getResult());
            }

            if (instance.hasUserIDFriend()) {
                this.setUserIDFriend(instance.getUserIDFriend());
            }

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
                throw new NullPointerException("Cannot set DonateFriendSendItemsResponse#result to null");
            }

            if (value == proto.message.ProfileResultCode.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set DonateFriendSendItemsResponse#result to UNRECOGNIZED");
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

        public String getUserIDFriend() {
            return userIDFriend;
        }

        public Builder setUserIDFriend(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set DonateFriendSendItemsResponse#userIDFriend to null");
            }

            this.userIDFriend = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearUserIDFriend() {
            this.userIDFriend = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasUserIDFriend() {
            return (__bitField0 & 2) == 2;
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
            if (!java.util.Objects.equals(this.userIDFriend, that.userIDFriend)) {
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
            result = 31 * result + (this.userIDFriend == null ? 0 : this.userIDFriend.hashCode());
            result = 31 * result + Integer.hashCode(this.numberSendDonate);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasResult()) {
                parts.add("result=" + getResult() + '(' + getResultValue() + ')');
            }
            if (hasUserIDFriend()) {
                parts.add("userIDFriend=" + getUserIDFriend());
            }
            if (hasNumberSendDonate()) {
                parts.add("numberSendDonate=" + getNumberSendDonate());
            }
            return "DonateFriendSendItemsResponse{" + String.join(", ", parts) + "}";
        }

        public DonateFriendSendItemsResponse build() {
            proto.message.DonateFriendSendItemsResponse result = new proto.message.DonateFriendSendItemsResponse();
            result.__bitField0 = __bitField0;
            result.result = this.result;
            result.userIDFriend = this.userIDFriend;
            result.numberSendDonate = this.numberSendDonate;
            return result;
        }

    }



}