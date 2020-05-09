package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class LeaveRoomResponse
        implements io.protostuff.Message<LeaveRoomResponse> {

    private static final LeaveRoomResponse DEFAULT_INSTANCE = newBuilder().build();

    private boolean __merge_lock = false;

    private LeaveRoomResponse() {
    }

    private LeaveRoomResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static LeaveRoomResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<LeaveRoomResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }



    @Override
    public io.protostuff.Schema<LeaveRoomResponse> cachedSchema() {
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
        LeaveRoomResponse that = (LeaveRoomResponse) obj;
        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        return "LeaveRoomResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<LeaveRoomResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        }

        @Override
        public LeaveRoomResponse newMessage() {
            return new LeaveRoomResponse();
        }

        @Override
        public Class<LeaveRoomResponse> typeClass() {
            return LeaveRoomResponse.class;
        }

        @Override
        public String messageName() {
            return LeaveRoomResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return LeaveRoomResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(LeaveRoomResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, LeaveRoomResponse instance) throws java.io.IOException {
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
        public void writeTo(io.protostuff.Output output, LeaveRoomResponse instance) throws java.io.IOException {
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

        public Builder mergeFrom(LeaveRoomResponse instance) {
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
            return "LeaveRoomResponse{" + String.join(", ", parts) + "}";
        }

        public LeaveRoomResponse build() {
            proto.message.LeaveRoomResponse result = new proto.message.LeaveRoomResponse();
            return result;
        }

    }



}