package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class AdsViewResponse
        implements io.protostuff.Message<AdsViewResponse> {

    private static final AdsViewResponse DEFAULT_INSTANCE = newBuilder().build();

    private int maxViewPerDay;

    private int countViewLeft;

    private boolean __merge_lock = false;
    private int __bitField0;

    private AdsViewResponse() {
        this.maxViewPerDay = 0;
        this.countViewLeft = 0;
    }

    private AdsViewResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static AdsViewResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<AdsViewResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getMaxViewPerDay() {
        return maxViewPerDay;
    }

    public boolean hasMaxViewPerDay() {
        return (__bitField0 & 1) == 1;
    }

    public AdsViewResponse withMaxViewPerDay(int value) {
        return AdsViewResponse.newBuilder()
            .mergeFrom(this)
            .setMaxViewPerDay(value)
            .build();
    }

    public int getCountViewLeft() {
        return countViewLeft;
    }

    public boolean hasCountViewLeft() {
        return (__bitField0 & 2) == 2;
    }

    public AdsViewResponse withCountViewLeft(int value) {
        return AdsViewResponse.newBuilder()
            .mergeFrom(this)
            .setCountViewLeft(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<AdsViewResponse> cachedSchema() {
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
        AdsViewResponse that = (AdsViewResponse) obj;
        if (!java.util.Objects.equals(this.maxViewPerDay, that.maxViewPerDay)) {
            return false;
        }
        if (!java.util.Objects.equals(this.countViewLeft, that.countViewLeft)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.maxViewPerDay);
        result = 31 * result + Integer.hashCode(this.countViewLeft);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasMaxViewPerDay()) {
            parts.add("maxViewPerDay=" + getMaxViewPerDay());
        }
        if (hasCountViewLeft()) {
            parts.add("countViewLeft=" + getCountViewLeft());
        }
        return "AdsViewResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<AdsViewResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("maxViewPerDay", 1);
        	__fieldMap.put("countViewLeft", 2);
        }

        @Override
        public AdsViewResponse newMessage() {
            return new AdsViewResponse();
        }

        @Override
        public Class<AdsViewResponse> typeClass() {
            return AdsViewResponse.class;
        }

        @Override
        public String messageName() {
            return AdsViewResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return AdsViewResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(AdsViewResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, AdsViewResponse instance) throws java.io.IOException {
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
                    	instance.maxViewPerDay = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.countViewLeft = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, AdsViewResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.maxViewPerDay, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.countViewLeft, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "maxViewPerDay";
        		case 2: return "countViewLeft";
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

        private int maxViewPerDay;

        private int countViewLeft;

        private int __bitField0;

        private Builder() {
            this.maxViewPerDay = 0;
            this.countViewLeft = 0;
        }

        public Builder mergeFrom(AdsViewResponse instance) {
            if (instance.hasMaxViewPerDay()) {
                this.setMaxViewPerDay(instance.getMaxViewPerDay());
            }

            if (instance.hasCountViewLeft()) {
                this.setCountViewLeft(instance.getCountViewLeft());
            }

            return this;
        }

        public int getMaxViewPerDay() {
            return maxViewPerDay;
        }

        public Builder setMaxViewPerDay(int value) {
            this.maxViewPerDay = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearMaxViewPerDay() {
            this.maxViewPerDay = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasMaxViewPerDay() {
            return (__bitField0 & 1) == 1;
        }

        public int getCountViewLeft() {
            return countViewLeft;
        }

        public Builder setCountViewLeft(int value) {
            this.countViewLeft = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearCountViewLeft() {
            this.countViewLeft = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasCountViewLeft() {
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
            if (!java.util.Objects.equals(this.maxViewPerDay, that.maxViewPerDay)) {
                return false;
            }
            if (!java.util.Objects.equals(this.countViewLeft, that.countViewLeft)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.maxViewPerDay);
            result = 31 * result + Integer.hashCode(this.countViewLeft);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasMaxViewPerDay()) {
                parts.add("maxViewPerDay=" + getMaxViewPerDay());
            }
            if (hasCountViewLeft()) {
                parts.add("countViewLeft=" + getCountViewLeft());
            }
            return "AdsViewResponse{" + String.join(", ", parts) + "}";
        }

        public AdsViewResponse build() {
            proto.message.AdsViewResponse result = new proto.message.AdsViewResponse();
            result.__bitField0 = __bitField0;
            result.maxViewPerDay = this.maxViewPerDay;
            result.countViewLeft = this.countViewLeft;
            return result;
        }

    }



}