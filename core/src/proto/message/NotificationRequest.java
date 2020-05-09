package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public final class NotificationRequest
        implements io.protostuff.Message<NotificationRequest> {

    private static final NotificationRequest DEFAULT_INSTANCE = newBuilder().build();

    private boolean __merge_lock = false;

    private NotificationRequest() {
    }

    private NotificationRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static NotificationRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<NotificationRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }



    @Override
    public io.protostuff.Schema<NotificationRequest> cachedSchema() {
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
        NotificationRequest that = (NotificationRequest) obj;
        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        return "NotificationRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<NotificationRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        }

        @Override
        public NotificationRequest newMessage() {
            return new NotificationRequest();
        }

        @Override
        public Class<NotificationRequest> typeClass() {
            return NotificationRequest.class;
        }

        @Override
        public String messageName() {
            return NotificationRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return NotificationRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(NotificationRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, NotificationRequest instance) throws java.io.IOException {
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
        public void writeTo(io.protostuff.Output output, NotificationRequest instance) throws java.io.IOException {
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

        public Builder mergeFrom(NotificationRequest instance) {
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
            return "NotificationRequest{" + String.join(", ", parts) + "}";
        }

        public NotificationRequest build() {
            proto.message.NotificationRequest result = new proto.message.NotificationRequest();
            return result;
        }

    }



}