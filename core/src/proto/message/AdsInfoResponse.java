package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class AdsInfoResponse
        implements io.protostuff.Message<AdsInfoResponse> {

    private static final AdsInfoResponse DEFAULT_INSTANCE = newBuilder().build();

    private int max;

    private int current;

    private boolean __merge_lock = false;
    private int __bitField0;

    private AdsInfoResponse() {
        this.max = 0;
        this.current = 0;
    }

    private AdsInfoResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static AdsInfoResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<AdsInfoResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getMax() {
        return max;
    }

    public boolean hasMax() {
        return (__bitField0 & 1) == 1;
    }

    public AdsInfoResponse withMax(int value) {
        return AdsInfoResponse.newBuilder()
            .mergeFrom(this)
            .setMax(value)
            .build();
    }

    public int getCurrent() {
        return current;
    }

    public boolean hasCurrent() {
        return (__bitField0 & 2) == 2;
    }

    public AdsInfoResponse withCurrent(int value) {
        return AdsInfoResponse.newBuilder()
            .mergeFrom(this)
            .setCurrent(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<AdsInfoResponse> cachedSchema() {
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
        AdsInfoResponse that = (AdsInfoResponse) obj;
        if (!java.util.Objects.equals(this.max, that.max)) {
            return false;
        }
        if (!java.util.Objects.equals(this.current, that.current)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.max);
        result = 31 * result + Integer.hashCode(this.current);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasMax()) {
            parts.add("max=" + getMax());
        }
        if (hasCurrent()) {
            parts.add("current=" + getCurrent());
        }
        return "AdsInfoResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<AdsInfoResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("max", 1);
        	__fieldMap.put("current", 2);
        }

        @Override
        public AdsInfoResponse newMessage() {
            return new AdsInfoResponse();
        }

        @Override
        public Class<AdsInfoResponse> typeClass() {
            return AdsInfoResponse.class;
        }

        @Override
        public String messageName() {
            return AdsInfoResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return AdsInfoResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(AdsInfoResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, AdsInfoResponse instance) throws java.io.IOException {
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
                    	instance.max = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.current = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, AdsInfoResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.max, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.current, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "max";
        		case 2: return "current";
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

        private int max;

        private int current;

        private int __bitField0;

        private Builder() {
            this.max = 0;
            this.current = 0;
        }

        public Builder mergeFrom(AdsInfoResponse instance) {
            if (instance.hasMax()) {
                this.setMax(instance.getMax());
            }

            if (instance.hasCurrent()) {
                this.setCurrent(instance.getCurrent());
            }

            return this;
        }

        public int getMax() {
            return max;
        }

        public Builder setMax(int value) {
            this.max = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearMax() {
            this.max = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasMax() {
            return (__bitField0 & 1) == 1;
        }

        public int getCurrent() {
            return current;
        }

        public Builder setCurrent(int value) {
            this.current = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearCurrent() {
            this.current = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasCurrent() {
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
            if (!java.util.Objects.equals(this.max, that.max)) {
                return false;
            }
            if (!java.util.Objects.equals(this.current, that.current)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.max);
            result = 31 * result + Integer.hashCode(this.current);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasMax()) {
                parts.add("max=" + getMax());
            }
            if (hasCurrent()) {
                parts.add("current=" + getCurrent());
            }
            return "AdsInfoResponse{" + String.join(", ", parts) + "}";
        }

        public AdsInfoResponse build() {
            proto.message.AdsInfoResponse result = new proto.message.AdsInfoResponse();
            result.__bitField0 = __bitField0;
            result.max = this.max;
            result.current = this.current;
            return result;
        }

    }



}