package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class DonateFriendReceiveItemsResponse
        implements io.protostuff.Message<DonateFriendReceiveItemsResponse> {

    private static final DonateFriendReceiveItemsResponse DEFAULT_INSTANCE = newBuilder().build();

    private int result;

    private String userIDFriend;

    private int numberReceiveDonate;

    private int gold;

    private boolean __merge_lock = false;
    private int __bitField0;

    private DonateFriendReceiveItemsResponse() {
        this.result = proto.message.ProfileResultCode.PROFILE_CLAIM_INBOX_OK.getNumber();
        this.userIDFriend = "";
        this.numberReceiveDonate = 0;
        this.gold = 0;
    }

    private DonateFriendReceiveItemsResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static DonateFriendReceiveItemsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<DonateFriendReceiveItemsResponse> getSchema()
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

    public DonateFriendReceiveItemsResponse withResult(proto.message.ProfileResultCode value) {
        return DonateFriendReceiveItemsResponse.newBuilder()
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

    public DonateFriendReceiveItemsResponse withUserIDFriend(String value) {
        return DonateFriendReceiveItemsResponse.newBuilder()
            .mergeFrom(this)
            .setUserIDFriend(value)
            .build();
    }

    public int getNumberReceiveDonate() {
        return numberReceiveDonate;
    }

    public boolean hasNumberReceiveDonate() {
        return (__bitField0 & 4) == 4;
    }

    public DonateFriendReceiveItemsResponse withNumberReceiveDonate(int value) {
        return DonateFriendReceiveItemsResponse.newBuilder()
            .mergeFrom(this)
            .setNumberReceiveDonate(value)
            .build();
    }

    public int getGold() {
        return gold;
    }

    public boolean hasGold() {
        return (__bitField0 & 8) == 8;
    }

    public DonateFriendReceiveItemsResponse withGold(int value) {
        return DonateFriendReceiveItemsResponse.newBuilder()
            .mergeFrom(this)
            .setGold(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<DonateFriendReceiveItemsResponse> cachedSchema() {
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
        DonateFriendReceiveItemsResponse that = (DonateFriendReceiveItemsResponse) obj;
        if (!java.util.Objects.equals(this.result, that.result)) {
            return false;
        }
        if (!java.util.Objects.equals(this.userIDFriend, that.userIDFriend)) {
            return false;
        }
        if (!java.util.Objects.equals(this.numberReceiveDonate, that.numberReceiveDonate)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gold, that.gold)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.result);
        result = 31 * result + (this.userIDFriend == null ? 0 : this.userIDFriend.hashCode());
        result = 31 * result + Integer.hashCode(this.numberReceiveDonate);
        result = 31 * result + Integer.hashCode(this.gold);

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
        if (hasNumberReceiveDonate()) {
            parts.add("numberReceiveDonate=" + getNumberReceiveDonate());
        }
        if (hasGold()) {
            parts.add("gold=" + getGold());
        }
        return "DonateFriendReceiveItemsResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<DonateFriendReceiveItemsResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("result", 1);
        	__fieldMap.put("userIDFriend", 2);
        	__fieldMap.put("numberReceiveDonate", 3);
        	__fieldMap.put("gold", 4);
        }

        @Override
        public DonateFriendReceiveItemsResponse newMessage() {
            return new DonateFriendReceiveItemsResponse();
        }

        @Override
        public Class<DonateFriendReceiveItemsResponse> typeClass() {
            return DonateFriendReceiveItemsResponse.class;
        }

        @Override
        public String messageName() {
            return DonateFriendReceiveItemsResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return DonateFriendReceiveItemsResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(DonateFriendReceiveItemsResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, DonateFriendReceiveItemsResponse instance) throws java.io.IOException {
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
                    	instance.numberReceiveDonate = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.gold = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, DonateFriendReceiveItemsResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.result, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.userIDFriend, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.numberReceiveDonate, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.gold, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "result";
        		case 2: return "userIDFriend";
        		case 3: return "numberReceiveDonate";
        		case 4: return "gold";
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

        private int numberReceiveDonate;

        private int gold;

        private int __bitField0;

        private Builder() {
            this.result = proto.message.ProfileResultCode.PROFILE_CLAIM_INBOX_OK.getNumber();
            this.userIDFriend = "";
            this.numberReceiveDonate = 0;
            this.gold = 0;
        }

        public Builder mergeFrom(DonateFriendReceiveItemsResponse instance) {
            if (instance.hasResult()) {
                this.setResult(instance.getResult());
            }

            if (instance.hasUserIDFriend()) {
                this.setUserIDFriend(instance.getUserIDFriend());
            }

            if (instance.hasNumberReceiveDonate()) {
                this.setNumberReceiveDonate(instance.getNumberReceiveDonate());
            }

            if (instance.hasGold()) {
                this.setGold(instance.getGold());
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
                throw new NullPointerException("Cannot set DonateFriendReceiveItemsResponse#result to null");
            }

            if (value == proto.message.ProfileResultCode.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set DonateFriendReceiveItemsResponse#result to UNRECOGNIZED");
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
                throw new NullPointerException("Cannot set DonateFriendReceiveItemsResponse#userIDFriend to null");
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

        public int getNumberReceiveDonate() {
            return numberReceiveDonate;
        }

        public Builder setNumberReceiveDonate(int value) {
            this.numberReceiveDonate = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearNumberReceiveDonate() {
            this.numberReceiveDonate = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasNumberReceiveDonate() {
            return (__bitField0 & 4) == 4;
        }

        public int getGold() {
            return gold;
        }

        public Builder setGold(int value) {
            this.gold = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearGold() {
            this.gold = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasGold() {
            return (__bitField0 & 8) == 8;
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
            if (!java.util.Objects.equals(this.numberReceiveDonate, that.numberReceiveDonate)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gold, that.gold)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.result);
            result = 31 * result + (this.userIDFriend == null ? 0 : this.userIDFriend.hashCode());
            result = 31 * result + Integer.hashCode(this.numberReceiveDonate);
            result = 31 * result + Integer.hashCode(this.gold);

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
            if (hasNumberReceiveDonate()) {
                parts.add("numberReceiveDonate=" + getNumberReceiveDonate());
            }
            if (hasGold()) {
                parts.add("gold=" + getGold());
            }
            return "DonateFriendReceiveItemsResponse{" + String.join(", ", parts) + "}";
        }

        public DonateFriendReceiveItemsResponse build() {
            proto.message.DonateFriendReceiveItemsResponse result = new proto.message.DonateFriendReceiveItemsResponse();
            result.__bitField0 = __bitField0;
            result.result = this.result;
            result.userIDFriend = this.userIDFriend;
            result.numberReceiveDonate = this.numberReceiveDonate;
            result.gold = this.gold;
            return result;
        }

    }



}