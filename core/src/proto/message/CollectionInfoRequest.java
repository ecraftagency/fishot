package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class CollectionInfoRequest
        implements io.protostuff.Message<CollectionInfoRequest> {

    private static final CollectionInfoRequest DEFAULT_INSTANCE = newBuilder().build();

    private boolean __merge_lock = false;

    private CollectionInfoRequest() {
    }

    private CollectionInfoRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static CollectionInfoRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<CollectionInfoRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }



    @Override
    public io.protostuff.Schema<CollectionInfoRequest> cachedSchema() {
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
        CollectionInfoRequest that = (CollectionInfoRequest) obj;
        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        return "CollectionInfoRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<CollectionInfoRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        }

        @Override
        public CollectionInfoRequest newMessage() {
            return new CollectionInfoRequest();
        }

        @Override
        public Class<CollectionInfoRequest> typeClass() {
            return CollectionInfoRequest.class;
        }

        @Override
        public String messageName() {
            return CollectionInfoRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return CollectionInfoRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(CollectionInfoRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, CollectionInfoRequest instance) throws java.io.IOException {
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
        public void writeTo(io.protostuff.Output output, CollectionInfoRequest instance) throws java.io.IOException {
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

        public Builder mergeFrom(CollectionInfoRequest instance) {
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
            return "CollectionInfoRequest{" + String.join(", ", parts) + "}";
        }

        public CollectionInfoRequest build() {
            proto.message.CollectionInfoRequest result = new proto.message.CollectionInfoRequest();
            return result;
        }

    }



}