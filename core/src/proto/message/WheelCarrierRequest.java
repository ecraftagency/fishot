package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class WheelCarrierRequest
        implements io.protostuff.Message<WheelCarrierRequest> {

    private static final WheelCarrierRequest DEFAULT_INSTANCE = newBuilder().build();

    private int carrier;

    private boolean __merge_lock = false;
    private int __bitField0;

    private WheelCarrierRequest() {
        this.carrier = 0;
    }

    private WheelCarrierRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static WheelCarrierRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<WheelCarrierRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getCarrier() {
        return carrier;
    }

    public boolean hasCarrier() {
        return (__bitField0 & 1) == 1;
    }

    public WheelCarrierRequest withCarrier(int value) {
        return WheelCarrierRequest.newBuilder()
            .mergeFrom(this)
            .setCarrier(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<WheelCarrierRequest> cachedSchema() {
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
        WheelCarrierRequest that = (WheelCarrierRequest) obj;
        if (!java.util.Objects.equals(this.carrier, that.carrier)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.carrier);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasCarrier()) {
            parts.add("carrier=" + getCarrier());
        }
        return "WheelCarrierRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<WheelCarrierRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("carrier", 1);
        }

        @Override
        public WheelCarrierRequest newMessage() {
            return new WheelCarrierRequest();
        }

        @Override
        public Class<WheelCarrierRequest> typeClass() {
            return WheelCarrierRequest.class;
        }

        @Override
        public String messageName() {
            return WheelCarrierRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return WheelCarrierRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(WheelCarrierRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, WheelCarrierRequest instance) throws java.io.IOException {
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
                    	instance.carrier = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, WheelCarrierRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.carrier, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "carrier";
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

        private int carrier;

        private int __bitField0;

        private Builder() {
            this.carrier = 0;
        }

        public Builder mergeFrom(WheelCarrierRequest instance) {
            if (instance.hasCarrier()) {
                this.setCarrier(instance.getCarrier());
            }

            return this;
        }

        public int getCarrier() {
            return carrier;
        }

        public Builder setCarrier(int value) {
            this.carrier = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearCarrier() {
            this.carrier = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasCarrier() {
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
            if (!java.util.Objects.equals(this.carrier, that.carrier)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.carrier);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasCarrier()) {
                parts.add("carrier=" + getCarrier());
            }
            return "WheelCarrierRequest{" + String.join(", ", parts) + "}";
        }

        public WheelCarrierRequest build() {
            proto.message.WheelCarrierRequest result = new proto.message.WheelCarrierRequest();
            result.__bitField0 = __bitField0;
            result.carrier = this.carrier;
            return result;
        }

    }



}