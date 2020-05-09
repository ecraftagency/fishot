package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class H3LeaveRequest
        implements io.protostuff.Message<H3LeaveRequest> {

    private static final H3LeaveRequest DEFAULT_INSTANCE = newBuilder().build();

    private boolean __merge_lock = false;

    private H3LeaveRequest() {
    }

    private H3LeaveRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static H3LeaveRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<H3LeaveRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }



    @Override
    public io.protostuff.Schema<H3LeaveRequest> cachedSchema() {
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
        H3LeaveRequest that = (H3LeaveRequest) obj;
        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        return "H3LeaveRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<H3LeaveRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        }

        @Override
        public H3LeaveRequest newMessage() {
            return new H3LeaveRequest();
        }

        @Override
        public Class<H3LeaveRequest> typeClass() {
            return H3LeaveRequest.class;
        }

        @Override
        public String messageName() {
            return H3LeaveRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return H3LeaveRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(H3LeaveRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, H3LeaveRequest instance) throws java.io.IOException {
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
        public void writeTo(io.protostuff.Output output, H3LeaveRequest instance) throws java.io.IOException {
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

        public Builder mergeFrom(H3LeaveRequest instance) {
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
            return "H3LeaveRequest{" + String.join(", ", parts) + "}";
        }

        public H3LeaveRequest build() {
            proto.message.H3LeaveRequest result = new proto.message.H3LeaveRequest();
            return result;
        }

    }



}