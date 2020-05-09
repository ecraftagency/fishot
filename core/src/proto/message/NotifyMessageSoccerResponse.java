package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public final class NotifyMessageSoccerResponse
        implements io.protostuff.Message<NotifyMessageSoccerResponse> {

    private static final NotifyMessageSoccerResponse DEFAULT_INSTANCE = newBuilder().build();

    private proto.message.NotifyMessage msg;

    private boolean __merge_lock = false;
    private int __bitField0;

    private NotifyMessageSoccerResponse() {
        this.msg = proto.message.NotifyMessage.getDefaultInstance();
    }

    private NotifyMessageSoccerResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static NotifyMessageSoccerResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<NotifyMessageSoccerResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public proto.message.NotifyMessage getMsg() {
        return msg;
    }

    public boolean hasMsg() {
        return (__bitField0 & 1) == 1;
    }

    public NotifyMessageSoccerResponse withMsg(proto.message.NotifyMessage value) {
        return NotifyMessageSoccerResponse.newBuilder()
            .mergeFrom(this)
            .setMsg(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<NotifyMessageSoccerResponse> cachedSchema() {
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
        NotifyMessageSoccerResponse that = (NotifyMessageSoccerResponse) obj;
        if (!java.util.Objects.equals(this.msg, that.msg)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.msg == null ? 0 : this.msg.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasMsg()) {
            parts.add("msg=" + getMsg());
        }
        return "NotifyMessageSoccerResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<NotifyMessageSoccerResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("msg", 1);
        }

        @Override
        public NotifyMessageSoccerResponse newMessage() {
            return new NotifyMessageSoccerResponse();
        }

        @Override
        public Class<NotifyMessageSoccerResponse> typeClass() {
            return NotifyMessageSoccerResponse.class;
        }

        @Override
        public String messageName() {
            return NotifyMessageSoccerResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return NotifyMessageSoccerResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(NotifyMessageSoccerResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, NotifyMessageSoccerResponse instance) throws java.io.IOException {
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
                    case 1:
                    	instance.msg = input.mergeObject(null, proto.message.NotifyMessage.getSchema());
                    	instance.__bitField0 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, NotifyMessageSoccerResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeObject(1, instance.msg, proto.message.NotifyMessage.getSchema(), false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "msg";
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

        private proto.message.NotifyMessage msg;

        private int __bitField0;

        private Builder() {
            this.msg = proto.message.NotifyMessage.getDefaultInstance();
        }

        public Builder mergeFrom(NotifyMessageSoccerResponse instance) {
            if (instance.hasMsg()) {
                this.setMsg(instance.getMsg());
            }

            return this;
        }

        public proto.message.NotifyMessage getMsg() {
            return msg;
        }

        public Builder setMsg(proto.message.NotifyMessage value) {
            if (value == null) {
                throw new NullPointerException("Cannot set NotifyMessageSoccerResponse#msg to null");
            }

            this.msg = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearMsg() {
            this.msg = proto.message.NotifyMessage.getDefaultInstance();
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasMsg() {
            return (__bitField0 & 1) == 1;
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
            if (!java.util.Objects.equals(this.msg, that.msg)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.msg == null ? 0 : this.msg.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasMsg()) {
                parts.add("msg=" + getMsg());
            }
            return "NotifyMessageSoccerResponse{" + String.join(", ", parts) + "}";
        }

        public NotifyMessageSoccerResponse build() {
            proto.message.NotifyMessageSoccerResponse result = new proto.message.NotifyMessageSoccerResponse();
            result.__bitField0 = __bitField0;
            result.msg = this.msg;
            return result;
        }

    }



}