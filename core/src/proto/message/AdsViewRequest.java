package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class AdsViewRequest
        implements io.protostuff.Message<AdsViewRequest> {

    private static final AdsViewRequest DEFAULT_INSTANCE = newBuilder().build();

    private boolean __merge_lock = false;

    private AdsViewRequest() {
    }

    private AdsViewRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static AdsViewRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<AdsViewRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }



    @Override
    public io.protostuff.Schema<AdsViewRequest> cachedSchema() {
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
        AdsViewRequest that = (AdsViewRequest) obj;
        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        return "AdsViewRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<AdsViewRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        }

        @Override
        public AdsViewRequest newMessage() {
            return new AdsViewRequest();
        }

        @Override
        public Class<AdsViewRequest> typeClass() {
            return AdsViewRequest.class;
        }

        @Override
        public String messageName() {
            return AdsViewRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return AdsViewRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(AdsViewRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, AdsViewRequest instance) throws java.io.IOException {
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
        public void writeTo(io.protostuff.Output output, AdsViewRequest instance) throws java.io.IOException {
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

        public Builder mergeFrom(AdsViewRequest instance) {
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
            return "AdsViewRequest{" + String.join(", ", parts) + "}";
        }

        public AdsViewRequest build() {
            proto.message.AdsViewRequest result = new proto.message.AdsViewRequest();
            return result;
        }

    }



}