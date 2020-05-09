package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class UseItemResponse
        implements io.protostuff.Message<UseItemResponse> {

    private static final UseItemResponse DEFAULT_INSTANCE = newBuilder().build();

    private int itemId;

    private int result;

    private String fromUserId;

    private int fromUserUnlockGold;

    private int fromUserTotalGold;

    private String toUserId;

    private int toUserUnlockGold;

    private int toUserTotalGold;

    private int toUserStunToSecond;

    private int toUserItemAmount;

    private boolean __merge_lock = false;
    private int __bitField0;

    private UseItemResponse() {
        this.itemId = 0;
        this.result = proto.message.InGameResultCode.JOIN_BOARD_SUCCESS_PLAY.getNumber();
        this.fromUserId = "";
        this.fromUserUnlockGold = 0;
        this.fromUserTotalGold = 0;
        this.toUserId = "";
        this.toUserUnlockGold = 0;
        this.toUserTotalGold = 0;
        this.toUserStunToSecond = 0;
        this.toUserItemAmount = 0;
    }

    private UseItemResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static UseItemResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<UseItemResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getItemId() {
        return itemId;
    }

    public boolean hasItemId() {
        return (__bitField0 & 1) == 1;
    }

    public UseItemResponse withItemId(int value) {
        return UseItemResponse.newBuilder()
            .mergeFrom(this)
            .setItemId(value)
            .build();
    }

    public proto.message.InGameResultCode getResult() {
        return proto.message.InGameResultCode.valueOf(result);
    }

    public int getResultValue() {
        return result;
    }

    public boolean hasResult() {
        return (__bitField0 & 2) == 2;
    }

    public UseItemResponse withResult(proto.message.InGameResultCode value) {
        return UseItemResponse.newBuilder()
            .mergeFrom(this)
            .setResult(value)
            .build();
    }

    public String getFromUserId() {
        return fromUserId;
    }

    public boolean hasFromUserId() {
        return (__bitField0 & 4) == 4;
    }

    public UseItemResponse withFromUserId(String value) {
        return UseItemResponse.newBuilder()
            .mergeFrom(this)
            .setFromUserId(value)
            .build();
    }

    public int getFromUserUnlockGold() {
        return fromUserUnlockGold;
    }

    public boolean hasFromUserUnlockGold() {
        return (__bitField0 & 8) == 8;
    }

    public UseItemResponse withFromUserUnlockGold(int value) {
        return UseItemResponse.newBuilder()
            .mergeFrom(this)
            .setFromUserUnlockGold(value)
            .build();
    }

    public int getFromUserTotalGold() {
        return fromUserTotalGold;
    }

    public boolean hasFromUserTotalGold() {
        return (__bitField0 & 16) == 16;
    }

    public UseItemResponse withFromUserTotalGold(int value) {
        return UseItemResponse.newBuilder()
            .mergeFrom(this)
            .setFromUserTotalGold(value)
            .build();
    }

    public String getToUserId() {
        return toUserId;
    }

    public boolean hasToUserId() {
        return (__bitField0 & 32) == 32;
    }

    public UseItemResponse withToUserId(String value) {
        return UseItemResponse.newBuilder()
            .mergeFrom(this)
            .setToUserId(value)
            .build();
    }

    public int getToUserUnlockGold() {
        return toUserUnlockGold;
    }

    public boolean hasToUserUnlockGold() {
        return (__bitField0 & 64) == 64;
    }

    public UseItemResponse withToUserUnlockGold(int value) {
        return UseItemResponse.newBuilder()
            .mergeFrom(this)
            .setToUserUnlockGold(value)
            .build();
    }

    public int getToUserTotalGold() {
        return toUserTotalGold;
    }

    public boolean hasToUserTotalGold() {
        return (__bitField0 & 128) == 128;
    }

    public UseItemResponse withToUserTotalGold(int value) {
        return UseItemResponse.newBuilder()
            .mergeFrom(this)
            .setToUserTotalGold(value)
            .build();
    }

    public int getToUserStunToSecond() {
        return toUserStunToSecond;
    }

    public boolean hasToUserStunToSecond() {
        return (__bitField0 & 256) == 256;
    }

    public UseItemResponse withToUserStunToSecond(int value) {
        return UseItemResponse.newBuilder()
            .mergeFrom(this)
            .setToUserStunToSecond(value)
            .build();
    }

    public int getToUserItemAmount() {
        return toUserItemAmount;
    }

    public boolean hasToUserItemAmount() {
        return (__bitField0 & 512) == 512;
    }

    public UseItemResponse withToUserItemAmount(int value) {
        return UseItemResponse.newBuilder()
            .mergeFrom(this)
            .setToUserItemAmount(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<UseItemResponse> cachedSchema() {
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
        UseItemResponse that = (UseItemResponse) obj;
        if (!java.util.Objects.equals(this.itemId, that.itemId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.result, that.result)) {
            return false;
        }
        if (!java.util.Objects.equals(this.fromUserId, that.fromUserId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.fromUserUnlockGold, that.fromUserUnlockGold)) {
            return false;
        }
        if (!java.util.Objects.equals(this.fromUserTotalGold, that.fromUserTotalGold)) {
            return false;
        }
        if (!java.util.Objects.equals(this.toUserId, that.toUserId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.toUserUnlockGold, that.toUserUnlockGold)) {
            return false;
        }
        if (!java.util.Objects.equals(this.toUserTotalGold, that.toUserTotalGold)) {
            return false;
        }
        if (!java.util.Objects.equals(this.toUserStunToSecond, that.toUserStunToSecond)) {
            return false;
        }
        if (!java.util.Objects.equals(this.toUserItemAmount, that.toUserItemAmount)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.itemId);
        result = 31 * result + Integer.hashCode(this.result);
        result = 31 * result + (this.fromUserId == null ? 0 : this.fromUserId.hashCode());
        result = 31 * result + Integer.hashCode(this.fromUserUnlockGold);
        result = 31 * result + Integer.hashCode(this.fromUserTotalGold);
        result = 31 * result + (this.toUserId == null ? 0 : this.toUserId.hashCode());
        result = 31 * result + Integer.hashCode(this.toUserUnlockGold);
        result = 31 * result + Integer.hashCode(this.toUserTotalGold);
        result = 31 * result + Integer.hashCode(this.toUserStunToSecond);
        result = 31 * result + Integer.hashCode(this.toUserItemAmount);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasItemId()) {
            parts.add("itemId=" + getItemId());
        }
        if (hasResult()) {
            parts.add("result=" + getResult() + '(' + getResultValue() + ')');
        }
        if (hasFromUserId()) {
            parts.add("fromUserId=" + getFromUserId());
        }
        if (hasFromUserUnlockGold()) {
            parts.add("fromUserUnlockGold=" + getFromUserUnlockGold());
        }
        if (hasFromUserTotalGold()) {
            parts.add("fromUserTotalGold=" + getFromUserTotalGold());
        }
        if (hasToUserId()) {
            parts.add("toUserId=" + getToUserId());
        }
        if (hasToUserUnlockGold()) {
            parts.add("toUserUnlockGold=" + getToUserUnlockGold());
        }
        if (hasToUserTotalGold()) {
            parts.add("toUserTotalGold=" + getToUserTotalGold());
        }
        if (hasToUserStunToSecond()) {
            parts.add("toUserStunToSecond=" + getToUserStunToSecond());
        }
        if (hasToUserItemAmount()) {
            parts.add("toUserItemAmount=" + getToUserItemAmount());
        }
        return "UseItemResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<UseItemResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("itemId", 1);
        	__fieldMap.put("result", 2);
        	__fieldMap.put("fromUserId", 3);
        	__fieldMap.put("fromUserUnlockGold", 4);
        	__fieldMap.put("fromUserTotalGold", 5);
        	__fieldMap.put("toUserId", 6);
        	__fieldMap.put("toUserUnlockGold", 7);
        	__fieldMap.put("toUserTotalGold", 8);
        	__fieldMap.put("toUserStunToSecond", 9);
        	__fieldMap.put("toUserItemAmount", 10);
        }

        @Override
        public UseItemResponse newMessage() {
            return new UseItemResponse();
        }

        @Override
        public Class<UseItemResponse> typeClass() {
            return UseItemResponse.class;
        }

        @Override
        public String messageName() {
            return UseItemResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return UseItemResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(UseItemResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, UseItemResponse instance) throws java.io.IOException {
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
                    	instance.itemId = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.result = input.readEnum();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.fromUserId = input.readString();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.fromUserUnlockGold = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.fromUserTotalGold = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.toUserId = input.readString();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.toUserUnlockGold = input.readInt32();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.toUserTotalGold = input.readInt32();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 9:
                    	instance.toUserStunToSecond = input.readInt32();
                    	instance.__bitField0 |= 256;
                    	break;
                    case 10:
                    	instance.toUserItemAmount = input.readInt32();
                    	instance.__bitField0 |= 512;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, UseItemResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.itemId, false);
            }

            if((instance.__bitField0 & 2) == 2) {
            	output.writeEnum(2, instance.result, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeString(3, instance.fromUserId, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.fromUserUnlockGold, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.fromUserTotalGold, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeString(6, instance.toUserId, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeInt32(7, instance.toUserUnlockGold, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeInt32(8, instance.toUserTotalGold, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeInt32(9, instance.toUserStunToSecond, false);
            }

            if((instance.__bitField0 & 512) == 512) {
                output.writeInt32(10, instance.toUserItemAmount, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "itemId";
        		case 2: return "result";
        		case 3: return "fromUserId";
        		case 4: return "fromUserUnlockGold";
        		case 5: return "fromUserTotalGold";
        		case 6: return "toUserId";
        		case 7: return "toUserUnlockGold";
        		case 8: return "toUserTotalGold";
        		case 9: return "toUserStunToSecond";
        		case 10: return "toUserItemAmount";
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

        private int itemId;

        private int result;

        private String fromUserId;

        private int fromUserUnlockGold;

        private int fromUserTotalGold;

        private String toUserId;

        private int toUserUnlockGold;

        private int toUserTotalGold;

        private int toUserStunToSecond;

        private int toUserItemAmount;

        private int __bitField0;

        private Builder() {
            this.itemId = 0;
            this.result = proto.message.InGameResultCode.JOIN_BOARD_SUCCESS_PLAY.getNumber();
            this.fromUserId = "";
            this.fromUserUnlockGold = 0;
            this.fromUserTotalGold = 0;
            this.toUserId = "";
            this.toUserUnlockGold = 0;
            this.toUserTotalGold = 0;
            this.toUserStunToSecond = 0;
            this.toUserItemAmount = 0;
        }

        public Builder mergeFrom(UseItemResponse instance) {
            if (instance.hasItemId()) {
                this.setItemId(instance.getItemId());
            }

            if (instance.hasResult()) {
                this.setResult(instance.getResult());
            }

            if (instance.hasFromUserId()) {
                this.setFromUserId(instance.getFromUserId());
            }

            if (instance.hasFromUserUnlockGold()) {
                this.setFromUserUnlockGold(instance.getFromUserUnlockGold());
            }

            if (instance.hasFromUserTotalGold()) {
                this.setFromUserTotalGold(instance.getFromUserTotalGold());
            }

            if (instance.hasToUserId()) {
                this.setToUserId(instance.getToUserId());
            }

            if (instance.hasToUserUnlockGold()) {
                this.setToUserUnlockGold(instance.getToUserUnlockGold());
            }

            if (instance.hasToUserTotalGold()) {
                this.setToUserTotalGold(instance.getToUserTotalGold());
            }

            if (instance.hasToUserStunToSecond()) {
                this.setToUserStunToSecond(instance.getToUserStunToSecond());
            }

            if (instance.hasToUserItemAmount()) {
                this.setToUserItemAmount(instance.getToUserItemAmount());
            }

            return this;
        }

        public int getItemId() {
            return itemId;
        }

        public Builder setItemId(int value) {
            this.itemId = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearItemId() {
            this.itemId = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasItemId() {
            return (__bitField0 & 1) == 1;
        }

        public proto.message.InGameResultCode getResult() {
            return proto.message.InGameResultCode.valueOf(result);
        }

        public int getResultValue() {
            return result;
        }

        public Builder setResult(proto.message.InGameResultCode value) {
            if (value == null) {
                throw new NullPointerException("Cannot set UseItemResponse#result to null");
            }

            if (value == proto.message.InGameResultCode.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set UseItemResponse#result to UNRECOGNIZED");
            }

            this.result = value.getNumber();
            __bitField0 |= 2;
            return this;
        }

        public Builder setResultValue(int value) {
            this.result = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearResult() {
            this.result = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasResult() {
            return (__bitField0 & 2) == 2;
        }

        public String getFromUserId() {
            return fromUserId;
        }

        public Builder setFromUserId(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set UseItemResponse#fromUserId to null");
            }

            this.fromUserId = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearFromUserId() {
            this.fromUserId = "";
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasFromUserId() {
            return (__bitField0 & 4) == 4;
        }

        public int getFromUserUnlockGold() {
            return fromUserUnlockGold;
        }

        public Builder setFromUserUnlockGold(int value) {
            this.fromUserUnlockGold = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearFromUserUnlockGold() {
            this.fromUserUnlockGold = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasFromUserUnlockGold() {
            return (__bitField0 & 8) == 8;
        }

        public int getFromUserTotalGold() {
            return fromUserTotalGold;
        }

        public Builder setFromUserTotalGold(int value) {
            this.fromUserTotalGold = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearFromUserTotalGold() {
            this.fromUserTotalGold = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasFromUserTotalGold() {
            return (__bitField0 & 16) == 16;
        }

        public String getToUserId() {
            return toUserId;
        }

        public Builder setToUserId(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set UseItemResponse#toUserId to null");
            }

            this.toUserId = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearToUserId() {
            this.toUserId = "";
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasToUserId() {
            return (__bitField0 & 32) == 32;
        }

        public int getToUserUnlockGold() {
            return toUserUnlockGold;
        }

        public Builder setToUserUnlockGold(int value) {
            this.toUserUnlockGold = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearToUserUnlockGold() {
            this.toUserUnlockGold = 0;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasToUserUnlockGold() {
            return (__bitField0 & 64) == 64;
        }

        public int getToUserTotalGold() {
            return toUserTotalGold;
        }

        public Builder setToUserTotalGold(int value) {
            this.toUserTotalGold = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearToUserTotalGold() {
            this.toUserTotalGold = 0;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasToUserTotalGold() {
            return (__bitField0 & 128) == 128;
        }

        public int getToUserStunToSecond() {
            return toUserStunToSecond;
        }

        public Builder setToUserStunToSecond(int value) {
            this.toUserStunToSecond = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearToUserStunToSecond() {
            this.toUserStunToSecond = 0;
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasToUserStunToSecond() {
            return (__bitField0 & 256) == 256;
        }

        public int getToUserItemAmount() {
            return toUserItemAmount;
        }

        public Builder setToUserItemAmount(int value) {
            this.toUserItemAmount = value;
            __bitField0 |= 512;
            return this;
        }

        public Builder clearToUserItemAmount() {
            this.toUserItemAmount = 0;
            __bitField0 &= ~512;
            return this;
        }

        public boolean hasToUserItemAmount() {
            return (__bitField0 & 512) == 512;
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
            if (!java.util.Objects.equals(this.itemId, that.itemId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.result, that.result)) {
                return false;
            }
            if (!java.util.Objects.equals(this.fromUserId, that.fromUserId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.fromUserUnlockGold, that.fromUserUnlockGold)) {
                return false;
            }
            if (!java.util.Objects.equals(this.fromUserTotalGold, that.fromUserTotalGold)) {
                return false;
            }
            if (!java.util.Objects.equals(this.toUserId, that.toUserId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.toUserUnlockGold, that.toUserUnlockGold)) {
                return false;
            }
            if (!java.util.Objects.equals(this.toUserTotalGold, that.toUserTotalGold)) {
                return false;
            }
            if (!java.util.Objects.equals(this.toUserStunToSecond, that.toUserStunToSecond)) {
                return false;
            }
            if (!java.util.Objects.equals(this.toUserItemAmount, that.toUserItemAmount)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.itemId);
            result = 31 * result + Integer.hashCode(this.result);
            result = 31 * result + (this.fromUserId == null ? 0 : this.fromUserId.hashCode());
            result = 31 * result + Integer.hashCode(this.fromUserUnlockGold);
            result = 31 * result + Integer.hashCode(this.fromUserTotalGold);
            result = 31 * result + (this.toUserId == null ? 0 : this.toUserId.hashCode());
            result = 31 * result + Integer.hashCode(this.toUserUnlockGold);
            result = 31 * result + Integer.hashCode(this.toUserTotalGold);
            result = 31 * result + Integer.hashCode(this.toUserStunToSecond);
            result = 31 * result + Integer.hashCode(this.toUserItemAmount);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasItemId()) {
                parts.add("itemId=" + getItemId());
            }
            if (hasResult()) {
                parts.add("result=" + getResult() + '(' + getResultValue() + ')');
            }
            if (hasFromUserId()) {
                parts.add("fromUserId=" + getFromUserId());
            }
            if (hasFromUserUnlockGold()) {
                parts.add("fromUserUnlockGold=" + getFromUserUnlockGold());
            }
            if (hasFromUserTotalGold()) {
                parts.add("fromUserTotalGold=" + getFromUserTotalGold());
            }
            if (hasToUserId()) {
                parts.add("toUserId=" + getToUserId());
            }
            if (hasToUserUnlockGold()) {
                parts.add("toUserUnlockGold=" + getToUserUnlockGold());
            }
            if (hasToUserTotalGold()) {
                parts.add("toUserTotalGold=" + getToUserTotalGold());
            }
            if (hasToUserStunToSecond()) {
                parts.add("toUserStunToSecond=" + getToUserStunToSecond());
            }
            if (hasToUserItemAmount()) {
                parts.add("toUserItemAmount=" + getToUserItemAmount());
            }
            return "UseItemResponse{" + String.join(", ", parts) + "}";
        }

        public UseItemResponse build() {
            proto.message.UseItemResponse result = new proto.message.UseItemResponse();
            result.__bitField0 = __bitField0;
            result.itemId = this.itemId;
            result.result = this.result;
            result.fromUserId = this.fromUserId;
            result.fromUserUnlockGold = this.fromUserUnlockGold;
            result.fromUserTotalGold = this.fromUserTotalGold;
            result.toUserId = this.toUserId;
            result.toUserUnlockGold = this.toUserUnlockGold;
            result.toUserTotalGold = this.toUserTotalGold;
            result.toUserStunToSecond = this.toUserStunToSecond;
            result.toUserItemAmount = this.toUserItemAmount;
            return result;
        }

    }



}