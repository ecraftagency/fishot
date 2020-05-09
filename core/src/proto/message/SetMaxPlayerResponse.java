package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class SetMaxPlayerResponse
        implements io.protostuff.Message<SetMaxPlayerResponse> {

    private static final SetMaxPlayerResponse DEFAULT_INSTANCE = newBuilder().build();

    private int result;

    private int maxPlayer;

    private boolean __merge_lock = false;
    private int __bitField0;

    private SetMaxPlayerResponse() {
        this.result = proto.message.InGameResultCode.JOIN_BOARD_SUCCESS_PLAY.getNumber();
        this.maxPlayer = 0;
    }

    private SetMaxPlayerResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static SetMaxPlayerResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<SetMaxPlayerResponse> getSchema()
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

    public SetMaxPlayerResponse withResult(proto.message.InGameResultCode value) {
        return SetMaxPlayerResponse.newBuilder()
            .mergeFrom(this)
            .setResult(value)
            .build();
    }

    public int getMaxPlayer() {
        return maxPlayer;
    }

    public boolean hasMaxPlayer() {
        return (__bitField0 & 2) == 2;
    }

    public SetMaxPlayerResponse withMaxPlayer(int value) {
        return SetMaxPlayerResponse.newBuilder()
            .mergeFrom(this)
            .setMaxPlayer(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<SetMaxPlayerResponse> cachedSchema() {
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
        SetMaxPlayerResponse that = (SetMaxPlayerResponse) obj;
        if (!java.util.Objects.equals(this.result, that.result)) {
            return false;
        }
        if (!java.util.Objects.equals(this.maxPlayer, that.maxPlayer)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.result);
        result = 31 * result + Integer.hashCode(this.maxPlayer);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasResult()) {
            parts.add("result=" + getResult() + '(' + getResultValue() + ')');
        }
        if (hasMaxPlayer()) {
            parts.add("maxPlayer=" + getMaxPlayer());
        }
        return "SetMaxPlayerResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<SetMaxPlayerResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("result", 1);
        	__fieldMap.put("maxPlayer", 2);
        }

        @Override
        public SetMaxPlayerResponse newMessage() {
            return new SetMaxPlayerResponse();
        }

        @Override
        public Class<SetMaxPlayerResponse> typeClass() {
            return SetMaxPlayerResponse.class;
        }

        @Override
        public String messageName() {
            return SetMaxPlayerResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return SetMaxPlayerResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(SetMaxPlayerResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, SetMaxPlayerResponse instance) throws java.io.IOException {
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
                    	instance.maxPlayer = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, SetMaxPlayerResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.result, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.maxPlayer, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "result";
        		case 2: return "maxPlayer";
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

        private int maxPlayer;

        private int __bitField0;

        private Builder() {
            this.result = proto.message.InGameResultCode.JOIN_BOARD_SUCCESS_PLAY.getNumber();
            this.maxPlayer = 0;
        }

        public Builder mergeFrom(SetMaxPlayerResponse instance) {
            if (instance.hasResult()) {
                this.setResult(instance.getResult());
            }

            if (instance.hasMaxPlayer()) {
                this.setMaxPlayer(instance.getMaxPlayer());
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
                throw new NullPointerException("Cannot set SetMaxPlayerResponse#result to null");
            }

            if (value == proto.message.InGameResultCode.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set SetMaxPlayerResponse#result to UNRECOGNIZED");
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

        public int getMaxPlayer() {
            return maxPlayer;
        }

        public Builder setMaxPlayer(int value) {
            this.maxPlayer = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearMaxPlayer() {
            this.maxPlayer = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasMaxPlayer() {
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
            if (!java.util.Objects.equals(this.maxPlayer, that.maxPlayer)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.result);
            result = 31 * result + Integer.hashCode(this.maxPlayer);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasResult()) {
                parts.add("result=" + getResult() + '(' + getResultValue() + ')');
            }
            if (hasMaxPlayer()) {
                parts.add("maxPlayer=" + getMaxPlayer());
            }
            return "SetMaxPlayerResponse{" + String.join(", ", parts) + "}";
        }

        public SetMaxPlayerResponse build() {
            proto.message.SetMaxPlayerResponse result = new proto.message.SetMaxPlayerResponse();
            result.__bitField0 = __bitField0;
            result.result = this.result;
            result.maxPlayer = this.maxPlayer;
            return result;
        }

    }



}