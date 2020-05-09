package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class SetBetMoneyResponse
        implements io.protostuff.Message<SetBetMoneyResponse> {

    private static final SetBetMoneyResponse DEFAULT_INSTANCE = newBuilder().build();

    private int result;

    private int value;

    private boolean __merge_lock = false;
    private int __bitField0;

    private SetBetMoneyResponse() {
        this.result = proto.message.InGameResultCode.JOIN_BOARD_SUCCESS_PLAY.getNumber();
        this.value = 0;
    }

    private SetBetMoneyResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static SetBetMoneyResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<SetBetMoneyResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public proto.message.InGameResultCode getResult() {
        return proto.message.InGameResultCode.valueOf(result);
    }

    public int getResultValue() {
        return result;
    }

    public boolean hasResult() {
        return (__bitField0 & 1) == 1;
    }

    public SetBetMoneyResponse withResult(proto.message.InGameResultCode value) {
        return SetBetMoneyResponse.newBuilder()
            .mergeFrom(this)
            .setResult(value)
            .build();
    }

    public int getValue() {
        return value;
    }

    public boolean hasValue() {
        return (__bitField0 & 2) == 2;
    }

    public SetBetMoneyResponse withValue(int value) {
        return SetBetMoneyResponse.newBuilder()
            .mergeFrom(this)
            .setValue(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<SetBetMoneyResponse> cachedSchema() {
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
        SetBetMoneyResponse that = (SetBetMoneyResponse) obj;
        if (!java.util.Objects.equals(this.result, that.result)) {
            return false;
        }
        if (!java.util.Objects.equals(this.value, that.value)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.result);
        result = 31 * result + Integer.hashCode(this.value);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasResult()) {
            parts.add("result=" + getResult() + '(' + getResultValue() + ')');
        }
        if (hasValue()) {
            parts.add("value=" + getValue());
        }
        return "SetBetMoneyResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<SetBetMoneyResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("result", 1);
        	__fieldMap.put("value", 2);
        }

        @Override
        public SetBetMoneyResponse newMessage() {
            return new SetBetMoneyResponse();
        }

        @Override
        public Class<SetBetMoneyResponse> typeClass() {
            return SetBetMoneyResponse.class;
        }

        @Override
        public String messageName() {
            return SetBetMoneyResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return SetBetMoneyResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(SetBetMoneyResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, SetBetMoneyResponse instance) throws java.io.IOException {
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
                    	instance.value = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, SetBetMoneyResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.result, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.value, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "result";
        		case 2: return "value";
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

        private int value;

        private int __bitField0;

        private Builder() {
            this.result = proto.message.InGameResultCode.JOIN_BOARD_SUCCESS_PLAY.getNumber();
            this.value = 0;
        }

        public Builder mergeFrom(SetBetMoneyResponse instance) {
            if (instance.hasResult()) {
                this.setResult(instance.getResult());
            }

            if (instance.hasValue()) {
                this.setValue(instance.getValue());
            }

            return this;
        }

        public proto.message.InGameResultCode getResult() {
            return proto.message.InGameResultCode.valueOf(result);
        }

        public int getResultValue() {
            return result;
        }

        public Builder setResult(proto.message.InGameResultCode value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SetBetMoneyResponse#result to null");
            }

            if (value == proto.message.InGameResultCode.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set SetBetMoneyResponse#result to UNRECOGNIZED");
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

        public int getValue() {
            return value;
        }

        public Builder setValue(int value) {
            this.value = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearValue() {
            this.value = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasValue() {
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
            if (!java.util.Objects.equals(this.result, that.result)) {
                return false;
            }
            if (!java.util.Objects.equals(this.value, that.value)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.result);
            result = 31 * result + Integer.hashCode(this.value);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasResult()) {
                parts.add("result=" + getResult() + '(' + getResultValue() + ')');
            }
            if (hasValue()) {
                parts.add("value=" + getValue());
            }
            return "SetBetMoneyResponse{" + String.join(", ", parts) + "}";
        }

        public SetBetMoneyResponse build() {
            proto.message.SetBetMoneyResponse result = new proto.message.SetBetMoneyResponse();
            result.__bitField0 = __bitField0;
            result.result = this.result;
            result.value = this.value;
            return result;
        }

    }



}