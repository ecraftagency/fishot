package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class WheelIngameResponse
        implements io.protostuff.Message<WheelIngameResponse> {

    private static final WheelIngameResponse DEFAULT_INSTANCE = newBuilder().build();

    private int ticketFree;

    private int ticketVIP;

    private boolean __merge_lock = false;
    private int __bitField0;

    private WheelIngameResponse() {
        this.ticketFree = 0;
        this.ticketVIP = 0;
    }

    private WheelIngameResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static WheelIngameResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<WheelIngameResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getTicketFree() {
        return ticketFree;
    }

    public boolean hasTicketFree() {
        return (__bitField0 & 1) == 1;
    }

    public WheelIngameResponse withTicketFree(int value) {
        return WheelIngameResponse.newBuilder()
            .mergeFrom(this)
            .setTicketFree(value)
            .build();
    }

    public int getTicketVIP() {
        return ticketVIP;
    }

    public boolean hasTicketVIP() {
        return (__bitField0 & 2) == 2;
    }

    public WheelIngameResponse withTicketVIP(int value) {
        return WheelIngameResponse.newBuilder()
            .mergeFrom(this)
            .setTicketVIP(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<WheelIngameResponse> cachedSchema() {
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
        WheelIngameResponse that = (WheelIngameResponse) obj;
        if (!java.util.Objects.equals(this.ticketFree, that.ticketFree)) {
            return false;
        }
        if (!java.util.Objects.equals(this.ticketVIP, that.ticketVIP)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.ticketFree);
        result = 31 * result + Integer.hashCode(this.ticketVIP);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasTicketFree()) {
            parts.add("ticketFree=" + getTicketFree());
        }
        if (hasTicketVIP()) {
            parts.add("ticketVIP=" + getTicketVIP());
        }
        return "WheelIngameResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<WheelIngameResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("ticketFree", 1);
        	__fieldMap.put("ticketVIP", 2);
        }

        @Override
        public WheelIngameResponse newMessage() {
            return new WheelIngameResponse();
        }

        @Override
        public Class<WheelIngameResponse> typeClass() {
            return WheelIngameResponse.class;
        }

        @Override
        public String messageName() {
            return WheelIngameResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return WheelIngameResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(WheelIngameResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, WheelIngameResponse instance) throws java.io.IOException {
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
                    	instance.ticketFree = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.ticketVIP = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, WheelIngameResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.ticketFree, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.ticketVIP, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "ticketFree";
        		case 2: return "ticketVIP";
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

        private int ticketFree;

        private int ticketVIP;

        private int __bitField0;

        private Builder() {
            this.ticketFree = 0;
            this.ticketVIP = 0;
        }

        public Builder mergeFrom(WheelIngameResponse instance) {
            if (instance.hasTicketFree()) {
                this.setTicketFree(instance.getTicketFree());
            }

            if (instance.hasTicketVIP()) {
                this.setTicketVIP(instance.getTicketVIP());
            }

            return this;
        }

        public int getTicketFree() {
            return ticketFree;
        }

        public Builder setTicketFree(int value) {
            this.ticketFree = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearTicketFree() {
            this.ticketFree = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasTicketFree() {
            return (__bitField0 & 1) == 1;
        }

        public int getTicketVIP() {
            return ticketVIP;
        }

        public Builder setTicketVIP(int value) {
            this.ticketVIP = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearTicketVIP() {
            this.ticketVIP = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasTicketVIP() {
            return (__bitField0 & 2) == 2;
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
            if (!java.util.Objects.equals(this.ticketFree, that.ticketFree)) {
                return false;
            }
            if (!java.util.Objects.equals(this.ticketVIP, that.ticketVIP)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.ticketFree);
            result = 31 * result + Integer.hashCode(this.ticketVIP);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasTicketFree()) {
                parts.add("ticketFree=" + getTicketFree());
            }
            if (hasTicketVIP()) {
                parts.add("ticketVIP=" + getTicketVIP());
            }
            return "WheelIngameResponse{" + String.join(", ", parts) + "}";
        }

        public WheelIngameResponse build() {
            proto.message.WheelIngameResponse result = new proto.message.WheelIngameResponse();
            result.__bitField0 = __bitField0;
            result.ticketFree = this.ticketFree;
            result.ticketVIP = this.ticketVIP;
            return result;
        }

    }



}