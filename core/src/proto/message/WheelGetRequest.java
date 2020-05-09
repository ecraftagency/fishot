package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class WheelGetRequest
        implements io.protostuff.Message<WheelGetRequest> {

    private static final WheelGetRequest DEFAULT_INSTANCE = newBuilder().build();

    private int ticketType;

    private boolean __merge_lock = false;
    private int __bitField0;

    private WheelGetRequest() {
        this.ticketType = 0;
    }

    private WheelGetRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static WheelGetRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<WheelGetRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getTicketType() {
        return ticketType;
    }

    public boolean hasTicketType() {
        return (__bitField0 & 1) == 1;
    }

    public WheelGetRequest withTicketType(int value) {
        return WheelGetRequest.newBuilder()
            .mergeFrom(this)
            .setTicketType(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<WheelGetRequest> cachedSchema() {
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
        WheelGetRequest that = (WheelGetRequest) obj;
        if (!java.util.Objects.equals(this.ticketType, that.ticketType)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.ticketType);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasTicketType()) {
            parts.add("ticketType=" + getTicketType());
        }
        return "WheelGetRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<WheelGetRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("ticketType", 1);
        }

        @Override
        public WheelGetRequest newMessage() {
            return new WheelGetRequest();
        }

        @Override
        public Class<WheelGetRequest> typeClass() {
            return WheelGetRequest.class;
        }

        @Override
        public String messageName() {
            return WheelGetRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return WheelGetRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(WheelGetRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, WheelGetRequest instance) throws java.io.IOException {
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
                    	instance.ticketType = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, WheelGetRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.ticketType, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "ticketType";
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

        private int ticketType;

        private int __bitField0;

        private Builder() {
            this.ticketType = 0;
        }

        public Builder mergeFrom(WheelGetRequest instance) {
            if (instance.hasTicketType()) {
                this.setTicketType(instance.getTicketType());
            }

            return this;
        }

        public int getTicketType() {
            return ticketType;
        }

        public Builder setTicketType(int value) {
            this.ticketType = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearTicketType() {
            this.ticketType = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasTicketType() {
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
            if (!java.util.Objects.equals(this.ticketType, that.ticketType)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.ticketType);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasTicketType()) {
                parts.add("ticketType=" + getTicketType());
            }
            return "WheelGetRequest{" + String.join(", ", parts) + "}";
        }

        public WheelGetRequest build() {
            proto.message.WheelGetRequest result = new proto.message.WheelGetRequest();
            result.__bitField0 = __bitField0;
            result.ticketType = this.ticketType;
            return result;
        }

    }



}