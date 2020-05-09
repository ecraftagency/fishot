package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_happy_play.proto")
public final class HPBoosterPackInfoRequest
        implements io.protostuff.Message<HPBoosterPackInfoRequest> {

    private static final HPBoosterPackInfoRequest DEFAULT_INSTANCE = newBuilder().build();

    private boolean __merge_lock = false;

    private HPBoosterPackInfoRequest() {
    }

    private HPBoosterPackInfoRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static HPBoosterPackInfoRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<HPBoosterPackInfoRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }



    @Override
    public io.protostuff.Schema<HPBoosterPackInfoRequest> cachedSchema() {
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
        HPBoosterPackInfoRequest that = (HPBoosterPackInfoRequest) obj;
        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        return "HPBoosterPackInfoRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<HPBoosterPackInfoRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        }

        @Override
        public HPBoosterPackInfoRequest newMessage() {
            return new HPBoosterPackInfoRequest();
        }

        @Override
        public Class<HPBoosterPackInfoRequest> typeClass() {
            return HPBoosterPackInfoRequest.class;
        }

        @Override
        public String messageName() {
            return HPBoosterPackInfoRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return HPBoosterPackInfoRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(HPBoosterPackInfoRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, HPBoosterPackInfoRequest instance) throws java.io.IOException {
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
        public void writeTo(io.protostuff.Output output, HPBoosterPackInfoRequest instance) throws java.io.IOException {
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

        public Builder mergeFrom(HPBoosterPackInfoRequest instance) {
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
            return "HPBoosterPackInfoRequest{" + String.join(", ", parts) + "}";
        }

        public HPBoosterPackInfoRequest build() {
            proto.message.HPBoosterPackInfoRequest result = new proto.message.HPBoosterPackInfoRequest();
            return result;
        }

    }



}