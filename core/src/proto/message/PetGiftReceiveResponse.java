package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class PetGiftReceiveResponse
        implements io.protostuff.Message<PetGiftReceiveResponse> {

    private static final PetGiftReceiveResponse DEFAULT_INSTANCE = newBuilder().build();

    private int result;

    private boolean __merge_lock = false;
    private int __bitField0;

    private PetGiftReceiveResponse() {
        this.result = proto.message.PetResult.PET_RESULT_SUCCESS.getNumber();
    }

    private PetGiftReceiveResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static PetGiftReceiveResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<PetGiftReceiveResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public proto.message.PetResult getResult() {
        return proto.message.PetResult.valueOf(result);
    }

    public int getResultValue() {
        return result;
    }

    public boolean hasResult() {
        return (__bitField0 & 1) == 1;
    }

    public PetGiftReceiveResponse withResult(proto.message.PetResult value) {
        return PetGiftReceiveResponse.newBuilder()
            .mergeFrom(this)
            .setResult(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<PetGiftReceiveResponse> cachedSchema() {
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
        PetGiftReceiveResponse that = (PetGiftReceiveResponse) obj;
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
        return "PetGiftReceiveResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<PetGiftReceiveResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("result", 1);
        }

        @Override
        public PetGiftReceiveResponse newMessage() {
            return new PetGiftReceiveResponse();
        }

        @Override
        public Class<PetGiftReceiveResponse> typeClass() {
            return PetGiftReceiveResponse.class;
        }

        @Override
        public String messageName() {
            return PetGiftReceiveResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return PetGiftReceiveResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(PetGiftReceiveResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, PetGiftReceiveResponse instance) throws java.io.IOException {
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
        public void writeTo(io.protostuff.Output output, PetGiftReceiveResponse instance) throws java.io.IOException {
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
            this.result = proto.message.PetResult.PET_RESULT_SUCCESS.getNumber();
        }

        public Builder mergeFrom(PetGiftReceiveResponse instance) {
            if (instance.hasResult()) {
                this.setResult(instance.getResult());
            }

            return this;
        }

        public proto.message.PetResult getResult() {
            return proto.message.PetResult.valueOf(result);
        }

        public int getResultValue() {
            return result;
        }

        public Builder setResult(proto.message.PetResult value) {
            if (value == null) {
                throw new NullPointerException("Cannot set PetGiftReceiveResponse#result to null");
            }

            if (value == proto.message.PetResult.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set PetGiftReceiveResponse#result to UNRECOGNIZED");
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
            return "PetGiftReceiveResponse{" + String.join(", ", parts) + "}";
        }

        public PetGiftReceiveResponse build() {
            proto.message.PetGiftReceiveResponse result = new proto.message.PetGiftReceiveResponse();
            result.__bitField0 = __bitField0;
            result.result = this.result;
            return result;
        }

    }



}