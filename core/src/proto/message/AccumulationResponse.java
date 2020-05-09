package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class AccumulationResponse
        implements io.protostuff.Message<AccumulationResponse> {

    private static final AccumulationResponse DEFAULT_INSTANCE = newBuilder().build();

    private proto.message.Accumulation accumulate;

    private boolean __merge_lock = false;
    private int __bitField0;

    private AccumulationResponse() {
        this.accumulate = proto.message.Accumulation.getDefaultInstance();
    }

    private AccumulationResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static AccumulationResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<AccumulationResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public proto.message.Accumulation getAccumulate() {
        return accumulate;
    }

    public boolean hasAccumulate() {
        return (__bitField0 & 1) == 1;
    }

    public AccumulationResponse withAccumulate(proto.message.Accumulation value) {
        return AccumulationResponse.newBuilder()
            .mergeFrom(this)
            .setAccumulate(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<AccumulationResponse> cachedSchema() {
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
        AccumulationResponse that = (AccumulationResponse) obj;
        if (!java.util.Objects.equals(this.accumulate, that.accumulate)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.accumulate == null ? 0 : this.accumulate.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasAccumulate()) {
            parts.add("accumulate=" + getAccumulate());
        }
        return "AccumulationResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<AccumulationResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("accumulate", 1);
        }

        @Override
        public AccumulationResponse newMessage() {
            return new AccumulationResponse();
        }

        @Override
        public Class<AccumulationResponse> typeClass() {
            return AccumulationResponse.class;
        }

        @Override
        public String messageName() {
            return AccumulationResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return AccumulationResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(AccumulationResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, AccumulationResponse instance) throws java.io.IOException {
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
                    	instance.accumulate = input.mergeObject(null, proto.message.Accumulation.getSchema());
                    	instance.__bitField0 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, AccumulationResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeObject(1, instance.accumulate, proto.message.Accumulation.getSchema(), false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "accumulate";
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

        private proto.message.Accumulation accumulate;

        private int __bitField0;

        private Builder() {
            this.accumulate = proto.message.Accumulation.getDefaultInstance();
        }

        public Builder mergeFrom(AccumulationResponse instance) {
            if (instance.hasAccumulate()) {
                this.setAccumulate(instance.getAccumulate());
            }

            return this;
        }

        public proto.message.Accumulation getAccumulate() {
            return accumulate;
        }

        public Builder setAccumulate(proto.message.Accumulation value) {
            if (value == null) {
                throw new NullPointerException("Cannot set AccumulationResponse#accumulate to null");
            }

            this.accumulate = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearAccumulate() {
            this.accumulate = proto.message.Accumulation.getDefaultInstance();
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasAccumulate() {
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
            if (!java.util.Objects.equals(this.accumulate, that.accumulate)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.accumulate == null ? 0 : this.accumulate.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasAccumulate()) {
                parts.add("accumulate=" + getAccumulate());
            }
            return "AccumulationResponse{" + String.join(", ", parts) + "}";
        }

        public AccumulationResponse build() {
            proto.message.AccumulationResponse result = new proto.message.AccumulationResponse();
            result.__bitField0 = __bitField0;
            result.accumulate = this.accumulate;
            return result;
        }

    }



}