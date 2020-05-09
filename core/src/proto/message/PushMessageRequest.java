package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public final class PushMessageRequest
        implements io.protostuff.Message<PushMessageRequest> {

    private static final PushMessageRequest DEFAULT_INSTANCE = newBuilder().build();

    private boolean __merge_lock = false;

    private PushMessageRequest() {
    }

    private PushMessageRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static PushMessageRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<PushMessageRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }



    @Override
    public io.protostuff.Schema<PushMessageRequest> cachedSchema() {
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
        PushMessageRequest that = (PushMessageRequest) obj;
        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        return "PushMessageRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<PushMessageRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        }

        @Override
        public PushMessageRequest newMessage() {
            return new PushMessageRequest();
        }

        @Override
        public Class<PushMessageRequest> typeClass() {
            return PushMessageRequest.class;
        }

        @Override
        public String messageName() {
            return PushMessageRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return PushMessageRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(PushMessageRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, PushMessageRequest instance) throws java.io.IOException {
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
        public void writeTo(io.protostuff.Output output, PushMessageRequest instance) throws java.io.IOException {
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

        public Builder mergeFrom(PushMessageRequest instance) {
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
            return "PushMessageRequest{" + String.join(", ", parts) + "}";
        }

        public PushMessageRequest build() {
            proto.message.PushMessageRequest result = new proto.message.PushMessageRequest();
            return result;
        }

    }



}