package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_happy_play.proto")
public final class HPGoogleHPIAPInfoRequest
        implements io.protostuff.Message<HPGoogleHPIAPInfoRequest> {

    private static final HPGoogleHPIAPInfoRequest DEFAULT_INSTANCE = newBuilder().build();

    private boolean __merge_lock = false;

    private HPGoogleHPIAPInfoRequest() {
    }

    private HPGoogleHPIAPInfoRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static HPGoogleHPIAPInfoRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<HPGoogleHPIAPInfoRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }



    @Override
    public io.protostuff.Schema<HPGoogleHPIAPInfoRequest> cachedSchema() {
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
        HPGoogleHPIAPInfoRequest that = (HPGoogleHPIAPInfoRequest) obj;
        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        return "HPGoogleHPIAPInfoRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<HPGoogleHPIAPInfoRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        }

        @Override
        public HPGoogleHPIAPInfoRequest newMessage() {
            return new HPGoogleHPIAPInfoRequest();
        }

        @Override
        public Class<HPGoogleHPIAPInfoRequest> typeClass() {
            return HPGoogleHPIAPInfoRequest.class;
        }

        @Override
        public String messageName() {
            return HPGoogleHPIAPInfoRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return HPGoogleHPIAPInfoRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(HPGoogleHPIAPInfoRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, HPGoogleHPIAPInfoRequest instance) throws java.io.IOException {
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
        public void writeTo(io.protostuff.Output output, HPGoogleHPIAPInfoRequest instance) throws java.io.IOException {
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

        public Builder mergeFrom(HPGoogleHPIAPInfoRequest instance) {
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
            return "HPGoogleHPIAPInfoRequest{" + String.join(", ", parts) + "}";
        }

        public HPGoogleHPIAPInfoRequest build() {
            proto.message.HPGoogleHPIAPInfoRequest result = new proto.message.HPGoogleHPIAPInfoRequest();
            return result;
        }

    }



}