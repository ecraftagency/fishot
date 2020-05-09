package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_happy_play.proto")
public final class HPAppleHPIAPInfoRequest
        implements io.protostuff.Message<HPAppleHPIAPInfoRequest> {

    private static final HPAppleHPIAPInfoRequest DEFAULT_INSTANCE = newBuilder().build();

    private boolean __merge_lock = false;

    private HPAppleHPIAPInfoRequest() {
    }

    private HPAppleHPIAPInfoRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static HPAppleHPIAPInfoRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<HPAppleHPIAPInfoRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }



    @Override
    public io.protostuff.Schema<HPAppleHPIAPInfoRequest> cachedSchema() {
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
        HPAppleHPIAPInfoRequest that = (HPAppleHPIAPInfoRequest) obj;
        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        return "HPAppleHPIAPInfoRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<HPAppleHPIAPInfoRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        }

        @Override
        public HPAppleHPIAPInfoRequest newMessage() {
            return new HPAppleHPIAPInfoRequest();
        }

        @Override
        public Class<HPAppleHPIAPInfoRequest> typeClass() {
            return HPAppleHPIAPInfoRequest.class;
        }

        @Override
        public String messageName() {
            return HPAppleHPIAPInfoRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return HPAppleHPIAPInfoRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(HPAppleHPIAPInfoRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, HPAppleHPIAPInfoRequest instance) throws java.io.IOException {
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
        public void writeTo(io.protostuff.Output output, HPAppleHPIAPInfoRequest instance) throws java.io.IOException {
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

        public Builder mergeFrom(HPAppleHPIAPInfoRequest instance) {
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
            return "HPAppleHPIAPInfoRequest{" + String.join(", ", parts) + "}";
        }

        public HPAppleHPIAPInfoRequest build() {
            proto.message.HPAppleHPIAPInfoRequest result = new proto.message.HPAppleHPIAPInfoRequest();
            return result;
        }

    }



}