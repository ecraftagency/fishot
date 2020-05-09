package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class AccumulatePromotionRequest
        implements io.protostuff.Message<AccumulatePromotionRequest> {

    private static final AccumulatePromotionRequest DEFAULT_INSTANCE = newBuilder().build();

    private boolean __merge_lock = false;

    private AccumulatePromotionRequest() {
    }

    private AccumulatePromotionRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static AccumulatePromotionRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<AccumulatePromotionRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }



    @Override
    public io.protostuff.Schema<AccumulatePromotionRequest> cachedSchema() {
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
        AccumulatePromotionRequest that = (AccumulatePromotionRequest) obj;
        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        return "AccumulatePromotionRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<AccumulatePromotionRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        }

        @Override
        public AccumulatePromotionRequest newMessage() {
            return new AccumulatePromotionRequest();
        }

        @Override
        public Class<AccumulatePromotionRequest> typeClass() {
            return AccumulatePromotionRequest.class;
        }

        @Override
        public String messageName() {
            return AccumulatePromotionRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return AccumulatePromotionRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(AccumulatePromotionRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, AccumulatePromotionRequest instance) throws java.io.IOException {
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
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, AccumulatePromotionRequest instance) throws java.io.IOException {
        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
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


        private Builder() {
        }

        public Builder mergeFrom(AccumulatePromotionRequest instance) {
            return this;
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
            return true;
        }

        @Override
        public int hashCode() {
            return 0;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            return "AccumulatePromotionRequest{" + String.join(", ", parts) + "}";
        }

        public AccumulatePromotionRequest build() {
            proto.message.AccumulatePromotionRequest result = new proto.message.AccumulatePromotionRequest();
            return result;
        }

    }



}