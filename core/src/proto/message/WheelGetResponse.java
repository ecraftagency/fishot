package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class WheelGetResponse
        implements io.protostuff.Message<WheelGetResponse> {

    private static final WheelGetResponse DEFAULT_INSTANCE = newBuilder().build();

    private int ticketType;

    private java.util.List<proto.message.WheelGift> gifts;

    private boolean __merge_lock = false;
    private int __bitField0;

    private WheelGetResponse() {
        this.ticketType = 0;
        this.gifts = java.util.Collections.emptyList();
    }

    private WheelGetResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static WheelGetResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<WheelGetResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getTicketType() {
        return ticketType;
    }

    public boolean hasTicketType() {
        return (__bitField0 & 1) == 1;
    }

    public WheelGetResponse withTicketType(int value) {
        return WheelGetResponse.newBuilder()
            .mergeFrom(this)
            .setTicketType(value)
            .build();
    }

    public java.util.List<proto.message.WheelGift> getGiftsList() {
        return gifts;
    }

    public int getGiftsCount() {
        return gifts.size();
    }

    public proto.message.WheelGift getGifts(int index) {
        return gifts.get(index);
    }

    public WheelGetResponse withGifts(java.util.List<proto.message.WheelGift> value) {
        return WheelGetResponse.newBuilder()
            .mergeFrom(this)
            .clearGifts()
            .addAllGifts(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<WheelGetResponse> cachedSchema() {
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
        WheelGetResponse that = (WheelGetResponse) obj;
        if (!java.util.Objects.equals(this.ticketType, that.ticketType)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gifts, that.gifts)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.ticketType);
        result = 31 * result + (this.gifts == null ? 0 : this.gifts.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasTicketType()) {
            parts.add("ticketType=" + getTicketType());
        }
        if (!gifts.isEmpty()) {
            parts.add("gifts=" + getGiftsList());
        }
        return "WheelGetResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<WheelGetResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("ticketType", 1);
        	__fieldMap.put("gifts", 2);
        }

        @Override
        public WheelGetResponse newMessage() {
            return new WheelGetResponse();
        }

        @Override
        public Class<WheelGetResponse> typeClass() {
            return WheelGetResponse.class;
        }

        @Override
        public String messageName() {
            return WheelGetResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return WheelGetResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(WheelGetResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, WheelGetResponse instance) throws java.io.IOException {
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
                    case 2:
                    	if(!((instance.__bitField0 & 2) == 2)) {
                    	    instance.gifts = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 2;
                    	}
                    	instance.gifts.add(input.mergeObject(null, proto.message.WheelGift.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 2) == 2) {
                instance.gifts = java.util.Collections.unmodifiableList(instance.gifts);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, WheelGetResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.ticketType, false);
            }

            for(proto.message.WheelGift gifts : instance.gifts) {
                output.writeObject(2, gifts, proto.message.WheelGift.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "ticketType";
        		case 2: return "gifts";
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

        private java.util.List<proto.message.WheelGift> gifts;

        private int __bitField0;

        private Builder() {
            this.ticketType = 0;
            this.gifts = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(WheelGetResponse instance) {
            if (instance.hasTicketType()) {
                this.setTicketType(instance.getTicketType());
            }

            this.addAllGifts(instance.getGiftsList());

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

        public java.util.List<proto.message.WheelGift> getGiftsList() {
            return gifts;
        }

        public Builder setGifts(int index, proto.message.WheelGift value) {
            if (value == null) {
                throw new NullPointerException("Cannot set WheelGetResponse#gifts to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.gifts = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.gifts.set(index, value);
            return this;
        }

        public Builder addGifts(proto.message.WheelGift value) {
            if (value == null) {
                throw new NullPointerException("Cannot set WheelGetResponse#gifts to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.gifts = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.gifts.add(value);
            return this;
        }

        public Builder addAllGifts(java.lang.Iterable<proto.message.WheelGift> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set WheelGetResponse#gifts to null");
            }
            if(!((__bitField0 & 2) == 2)) {
                this.gifts = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            for (final proto.message.WheelGift value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set WheelGetResponse#gifts to null");
                }
                this.gifts.add(value);
            }
            return this;
        }

        public Builder clearGifts() {
            this.gifts = java.util.Collections.emptyList();
            __bitField0 &= ~2;
            return this;
        }

        public int getGiftsCount() {
            return gifts.size();
        }

        public proto.message.WheelGift getGifts(int index) {
            return gifts.get(index);
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
            if (!java.util.Objects.equals(this.gifts, that.gifts)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.ticketType);
            result = 31 * result + (this.gifts == null ? 0 : this.gifts.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasTicketType()) {
                parts.add("ticketType=" + getTicketType());
            }
            if (!gifts.isEmpty()) {
                parts.add("gifts=" + getGiftsList());
            }
            return "WheelGetResponse{" + String.join(", ", parts) + "}";
        }

        public WheelGetResponse build() {
            proto.message.WheelGetResponse result = new proto.message.WheelGetResponse();
            result.__bitField0 = __bitField0;
            result.ticketType = this.ticketType;
            result.gifts = java.util.Collections.unmodifiableList(this.gifts);
            return result;
        }

    }



}