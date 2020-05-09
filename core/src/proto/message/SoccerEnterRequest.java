package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class SoccerEnterRequest
        implements io.protostuff.Message<SoccerEnterRequest> {

    private static final SoccerEnterRequest DEFAULT_INSTANCE = newBuilder().build();

    private boolean __merge_lock = false;

    private SoccerEnterRequest() {
    }

    private SoccerEnterRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static SoccerEnterRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<SoccerEnterRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }



    @Override
    public io.protostuff.Schema<SoccerEnterRequest> cachedSchema() {
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
        SoccerEnterRequest that = (SoccerEnterRequest) obj;
        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        return "SoccerEnterRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<SoccerEnterRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        }

        @Override
        public SoccerEnterRequest newMessage() {
            return new SoccerEnterRequest();
        }

        @Override
        public Class<SoccerEnterRequest> typeClass() {
            return SoccerEnterRequest.class;
        }

        @Override
        public String messageName() {
            return SoccerEnterRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return SoccerEnterRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(SoccerEnterRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, SoccerEnterRequest instance) throws java.io.IOException {
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
        public void writeTo(io.protostuff.Output output, SoccerEnterRequest instance) throws java.io.IOException {
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

        public Builder mergeFrom(SoccerEnterRequest instance) {
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
            return "SoccerEnterRequest{" + String.join(", ", parts) + "}";
        }

        public SoccerEnterRequest build() {
            proto.message.SoccerEnterRequest result = new proto.message.SoccerEnterRequest();
            return result;
        }

    }



}