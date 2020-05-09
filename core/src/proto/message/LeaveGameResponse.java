package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class LeaveGameResponse
        implements io.protostuff.Message<LeaveGameResponse> {

    private static final LeaveGameResponse DEFAULT_INSTANCE = newBuilder().build();

    private boolean __merge_lock = false;

    private LeaveGameResponse() {
    }

    private LeaveGameResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static LeaveGameResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<LeaveGameResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }



    @Override
    public io.protostuff.Schema<LeaveGameResponse> cachedSchema() {
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
        LeaveGameResponse that = (LeaveGameResponse) obj;
        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        return "LeaveGameResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<LeaveGameResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        }

        @Override
        public LeaveGameResponse newMessage() {
            return new LeaveGameResponse();
        }

        @Override
        public Class<LeaveGameResponse> typeClass() {
            return LeaveGameResponse.class;
        }

        @Override
        public String messageName() {
            return LeaveGameResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return LeaveGameResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(LeaveGameResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, LeaveGameResponse instance) throws java.io.IOException {
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
        public void writeTo(io.protostuff.Output output, LeaveGameResponse instance) throws java.io.IOException {
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

        public Builder mergeFrom(LeaveGameResponse instance) {
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
            return "LeaveGameResponse{" + String.join(", ", parts) + "}";
        }

        public LeaveGameResponse build() {
            proto.message.LeaveGameResponse result = new proto.message.LeaveGameResponse();
            return result;
        }

    }



}