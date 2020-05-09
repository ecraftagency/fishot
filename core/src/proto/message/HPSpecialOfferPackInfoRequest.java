package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_happy_play.proto")
public final class HPSpecialOfferPackInfoRequest
        implements io.protostuff.Message<HPSpecialOfferPackInfoRequest> {

    private static final HPSpecialOfferPackInfoRequest DEFAULT_INSTANCE = newBuilder().build();

    private boolean __merge_lock = false;

    private HPSpecialOfferPackInfoRequest() {
    }

    private HPSpecialOfferPackInfoRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static HPSpecialOfferPackInfoRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<HPSpecialOfferPackInfoRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }



    @Override
    public io.protostuff.Schema<HPSpecialOfferPackInfoRequest> cachedSchema() {
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
        HPSpecialOfferPackInfoRequest that = (HPSpecialOfferPackInfoRequest) obj;
        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        return "HPSpecialOfferPackInfoRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<HPSpecialOfferPackInfoRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        }

        @Override
        public HPSpecialOfferPackInfoRequest newMessage() {
            return new HPSpecialOfferPackInfoRequest();
        }

        @Override
        public Class<HPSpecialOfferPackInfoRequest> typeClass() {
            return HPSpecialOfferPackInfoRequest.class;
        }

        @Override
        public String messageName() {
            return HPSpecialOfferPackInfoRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return HPSpecialOfferPackInfoRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(HPSpecialOfferPackInfoRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, HPSpecialOfferPackInfoRequest instance) throws java.io.IOException {
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
        public void writeTo(io.protostuff.Output output, HPSpecialOfferPackInfoRequest instance) throws java.io.IOException {
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

        public Builder mergeFrom(HPSpecialOfferPackInfoRequest instance) {
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
            return "HPSpecialOfferPackInfoRequest{" + String.join(", ", parts) + "}";
        }

        public HPSpecialOfferPackInfoRequest build() {
            proto.message.HPSpecialOfferPackInfoRequest result = new proto.message.HPSpecialOfferPackInfoRequest();
            return result;
        }

    }



}