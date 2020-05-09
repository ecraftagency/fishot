package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class WheelCarrierResponse
        implements io.protostuff.Message<WheelCarrierResponse> {

    private static final WheelCarrierResponse DEFAULT_INSTANCE = newBuilder().build();

    private int result;

    private int carrier;

    private boolean __merge_lock = false;
    private int __bitField0;

    private WheelCarrierResponse() {
        this.result = proto.message.ProfileResultCode.PROFILE_CLAIM_INBOX_OK.getNumber();
        this.carrier = 0;
    }

    private WheelCarrierResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static WheelCarrierResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<WheelCarrierResponse> getSchema()
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

    public WheelCarrierResponse withResult(proto.message.ProfileResultCode value) {
        return WheelCarrierResponse.newBuilder()
            .mergeFrom(this)
            .setResult(value)
            .build();
    }

    public int getCarrier() {
        return carrier;
    }

    public boolean hasCarrier() {
        return (__bitField0 & 2) == 2;
    }

    public WheelCarrierResponse withCarrier(int value) {
        return WheelCarrierResponse.newBuilder()
            .mergeFrom(this)
            .setCarrier(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<WheelCarrierResponse> cachedSchema() {
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
        WheelCarrierResponse that = (WheelCarrierResponse) obj;
        if (!java.util.Objects.equals(this.result, that.result)) {
            return false;
        }
        if (!java.util.Objects.equals(this.carrier, that.carrier)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.result);
        result = 31 * result + Integer.hashCode(this.carrier);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasResult()) {
            parts.add("result=" + getResult() + '(' + getResultValue() + ')');
        }
        if (hasCarrier()) {
            parts.add("carrier=" + getCarrier());
        }
        return "WheelCarrierResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<WheelCarrierResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("result", 1);
        	__fieldMap.put("carrier", 2);
        }

        @Override
        public WheelCarrierResponse newMessage() {
            return new WheelCarrierResponse();
        }

        @Override
        public Class<WheelCarrierResponse> typeClass() {
            return WheelCarrierResponse.class;
        }

        @Override
        public String messageName() {
            return WheelCarrierResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return WheelCarrierResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(WheelCarrierResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, WheelCarrierResponse instance) throws java.io.IOException {
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
                    	instance.carrier = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, WheelCarrierResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.result, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.carrier, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "result";
        		case 2: return "carrier";
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

        private int carrier;

        private int __bitField0;

        private Builder() {
            this.result = proto.message.ProfileResultCode.PROFILE_CLAIM_INBOX_OK.getNumber();
            this.carrier = 0;
        }

        public Builder mergeFrom(WheelCarrierResponse instance) {
            if (instance.hasResult()) {
                this.setResult(instance.getResult());
            }

            if (instance.hasCarrier()) {
                this.setCarrier(instance.getCarrier());
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
                throw new NullPointerException("Cannot set WheelCarrierResponse#result to null");
            }

            if (value == proto.message.ProfileResultCode.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set WheelCarrierResponse#result to UNRECOGNIZED");
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

        public int getCarrier() {
            return carrier;
        }

        public Builder setCarrier(int value) {
            this.carrier = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearCarrier() {
            this.carrier = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasCarrier() {
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
            if (!java.util.Objects.equals(this.carrier, that.carrier)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.result);
            result = 31 * result + Integer.hashCode(this.carrier);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasResult()) {
                parts.add("result=" + getResult() + '(' + getResultValue() + ')');
            }
            if (hasCarrier()) {
                parts.add("carrier=" + getCarrier());
            }
            return "WheelCarrierResponse{" + String.join(", ", parts) + "}";
        }

        public WheelCarrierResponse build() {
            proto.message.WheelCarrierResponse result = new proto.message.WheelCarrierResponse();
            result.__bitField0 = __bitField0;
            result.result = this.result;
            result.carrier = this.carrier;
            return result;
        }

    }



}