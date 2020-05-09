package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class GiftCodeResponse
        implements io.protostuff.Message<GiftCodeResponse> {

    private static final GiftCodeResponse DEFAULT_INSTANCE = newBuilder().build();

    private int result;

    private boolean __merge_lock = false;
    private int __bitField0;

    private GiftCodeResponse() {
        this.result = proto.message.ProfileResultCode.PROFILE_CLAIM_INBOX_OK.getNumber();
    }

    private GiftCodeResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static GiftCodeResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<GiftCodeResponse> getSchema()
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

    public GiftCodeResponse withResult(proto.message.ProfileResultCode value) {
        return GiftCodeResponse.newBuilder()
            .mergeFrom(this)
            .setResult(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<GiftCodeResponse> cachedSchema() {
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
        GiftCodeResponse that = (GiftCodeResponse) obj;
        if (!java.util.Objects.equals(this.result, that.result)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.result);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasResult()) {
            parts.add("result=" + getResult() + '(' + getResultValue() + ')');
        }
        return "GiftCodeResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<GiftCodeResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("result", 1);
        }

        @Override
        public GiftCodeResponse newMessage() {
            return new GiftCodeResponse();
        }

        @Override
        public Class<GiftCodeResponse> typeClass() {
            return GiftCodeResponse.class;
        }

        @Override
        public String messageName() {
            return GiftCodeResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return GiftCodeResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(GiftCodeResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, GiftCodeResponse instance) throws java.io.IOException {
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
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, GiftCodeResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.result, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "result";
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

        private int __bitField0;

        private Builder() {
            this.result = proto.message.ProfileResultCode.PROFILE_CLAIM_INBOX_OK.getNumber();
        }

        public Builder mergeFrom(GiftCodeResponse instance) {
            if (instance.hasResult()) {
                this.setResult(instance.getResult());
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
                throw new NullPointerException("Cannot set GiftCodeResponse#result to null");
            }

            if (value == proto.message.ProfileResultCode.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set GiftCodeResponse#result to UNRECOGNIZED");
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

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.result);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasResult()) {
                parts.add("result=" + getResult() + '(' + getResultValue() + ')');
            }
            return "GiftCodeResponse{" + String.join(", ", parts) + "}";
        }

        public GiftCodeResponse build() {
            proto.message.GiftCodeResponse result = new proto.message.GiftCodeResponse();
            result.__bitField0 = __bitField0;
            result.result = this.result;
            return result;
        }

    }



}