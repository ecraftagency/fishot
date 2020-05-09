package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class H3EnterResponse
        implements io.protostuff.Message<H3EnterResponse> {

    private static final H3EnterResponse DEFAULT_INSTANCE = newBuilder().build();

    private int ticketFree;

    private int ticketVIP;

    private int gold;

    private boolean __merge_lock = false;
    private int __bitField0;

    private H3EnterResponse() {
        this.ticketFree = 0;
        this.ticketVIP = 0;
        this.gold = 0;
    }

    private H3EnterResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static H3EnterResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<H3EnterResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getTicketFree() {
        return ticketFree;
    }

    public boolean hasTicketFree() {
        return (__bitField0 & 1) == 1;
    }

    public H3EnterResponse withTicketFree(int value) {
        return H3EnterResponse.newBuilder()
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

    public H3EnterResponse withTicketVIP(int value) {
        return H3EnterResponse.newBuilder()
            .mergeFrom(this)
            .setTicketVIP(value)
            .build();
    }

    public int getGold() {
        return gold;
    }

    public boolean hasGold() {
        return (__bitField0 & 4) == 4;
    }

    public H3EnterResponse withGold(int value) {
        return H3EnterResponse.newBuilder()
            .mergeFrom(this)
            .setGold(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<H3EnterResponse> cachedSchema() {
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
        H3EnterResponse that = (H3EnterResponse) obj;
        if (!java.util.Objects.equals(this.ticketFree, that.ticketFree)) {
            return false;
        }
        if (!java.util.Objects.equals(this.ticketVIP, that.ticketVIP)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gold, that.gold)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.ticketFree);
        result = 31 * result + Integer.hashCode(this.ticketVIP);
        result = 31 * result + Integer.hashCode(this.gold);

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
        if (hasGold()) {
            parts.add("gold=" + getGold());
        }
        return "H3EnterResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<H3EnterResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("ticketFree", 1);
        	__fieldMap.put("ticketVIP", 2);
        	__fieldMap.put("gold", 3);
        }

        @Override
        public H3EnterResponse newMessage() {
            return new H3EnterResponse();
        }

        @Override
        public Class<H3EnterResponse> typeClass() {
            return H3EnterResponse.class;
        }

        @Override
        public String messageName() {
            return H3EnterResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return H3EnterResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(H3EnterResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, H3EnterResponse instance) throws java.io.IOException {
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
                    case 3:
                    	instance.gold = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, H3EnterResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.ticketFree, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.ticketVIP, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.gold, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "ticketFree";
        		case 2: return "ticketVIP";
        		case 3: return "gold";
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

        private int gold;

        private int __bitField0;

        private Builder() {
            this.ticketFree = 0;
            this.ticketVIP = 0;
            this.gold = 0;
        }

        public Builder mergeFrom(H3EnterResponse instance) {
            if (instance.hasTicketFree()) {
                this.setTicketFree(instance.getTicketFree());
            }

            if (instance.hasTicketVIP()) {
                this.setTicketVIP(instance.getTicketVIP());
            }

            if (instance.hasGold()) {
                this.setGold(instance.getGold());
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

        public int getGold() {
            return gold;
        }

        public Builder setGold(int value) {
            this.gold = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearGold() {
            this.gold = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasGold() {
            return (__bitField0 & 4) == 4;
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
            if (!java.util.Objects.equals(this.gold, that.gold)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.ticketFree);
            result = 31 * result + Integer.hashCode(this.ticketVIP);
            result = 31 * result + Integer.hashCode(this.gold);

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
            if (hasGold()) {
                parts.add("gold=" + getGold());
            }
            return "H3EnterResponse{" + String.join(", ", parts) + "}";
        }

        public H3EnterResponse build() {
            proto.message.H3EnterResponse result = new proto.message.H3EnterResponse();
            result.__bitField0 = __bitField0;
            result.ticketFree = this.ticketFree;
            result.ticketVIP = this.ticketVIP;
            result.gold = this.gold;
            return result;
        }

    }



}