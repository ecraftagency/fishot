package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class WheelLeaveResponse
        implements io.protostuff.Message<WheelLeaveResponse> {

    private static final WheelLeaveResponse DEFAULT_INSTANCE = newBuilder().build();

    private int ticketFree;

    private int ticketVIP;

    private int gold;

    private java.util.List<proto.message.InventorySimpleItem> items;

    private boolean __merge_lock = false;
    private int __bitField0;

    private WheelLeaveResponse() {
        this.ticketFree = 0;
        this.ticketVIP = 0;
        this.gold = 0;
        this.items = java.util.Collections.emptyList();
    }

    private WheelLeaveResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static WheelLeaveResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<WheelLeaveResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getTicketFree() {
        return ticketFree;
    }

    public boolean hasTicketFree() {
        return (__bitField0 & 1) == 1;
    }

    public WheelLeaveResponse withTicketFree(int value) {
        return WheelLeaveResponse.newBuilder()
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

    public WheelLeaveResponse withTicketVIP(int value) {
        return WheelLeaveResponse.newBuilder()
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

    public WheelLeaveResponse withGold(int value) {
        return WheelLeaveResponse.newBuilder()
            .mergeFrom(this)
            .setGold(value)
            .build();
    }

    public java.util.List<proto.message.InventorySimpleItem> getItemsList() {
        return items;
    }

    public int getItemsCount() {
        return items.size();
    }

    public proto.message.InventorySimpleItem getItems(int index) {
        return items.get(index);
    }

    public WheelLeaveResponse withItems(java.util.List<proto.message.InventorySimpleItem> value) {
        return WheelLeaveResponse.newBuilder()
            .mergeFrom(this)
            .clearItems()
            .addAllItems(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<WheelLeaveResponse> cachedSchema() {
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
        WheelLeaveResponse that = (WheelLeaveResponse) obj;
        if (!java.util.Objects.equals(this.ticketFree, that.ticketFree)) {
            return false;
        }
        if (!java.util.Objects.equals(this.ticketVIP, that.ticketVIP)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gold, that.gold)) {
            return false;
        }
        if (!java.util.Objects.equals(this.items, that.items)) {
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
        result = 31 * result + (this.items == null ? 0 : this.items.hashCode());

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
        if (!items.isEmpty()) {
            parts.add("items=" + getItemsList());
        }
        return "WheelLeaveResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<WheelLeaveResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("ticketFree", 1);
        	__fieldMap.put("ticketVIP", 2);
        	__fieldMap.put("gold", 3);
        	__fieldMap.put("items", 4);
        }

        @Override
        public WheelLeaveResponse newMessage() {
            return new WheelLeaveResponse();
        }

        @Override
        public Class<WheelLeaveResponse> typeClass() {
            return WheelLeaveResponse.class;
        }

        @Override
        public String messageName() {
            return WheelLeaveResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return WheelLeaveResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(WheelLeaveResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, WheelLeaveResponse instance) throws java.io.IOException {
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
                    case 4:
                    	if(!((instance.__bitField0 & 8) == 8)) {
                    	    instance.items = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 8;
                    	}
                    	instance.items.add(input.mergeObject(null, proto.message.InventorySimpleItem.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 8) == 8) {
                instance.items = java.util.Collections.unmodifiableList(instance.items);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, WheelLeaveResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.ticketFree, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.ticketVIP, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.gold, false);
            }

            for(proto.message.InventorySimpleItem items : instance.items) {
                output.writeObject(4, items, proto.message.InventorySimpleItem.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "ticketFree";
        		case 2: return "ticketVIP";
        		case 3: return "gold";
        		case 4: return "items";
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

        private java.util.List<proto.message.InventorySimpleItem> items;

        private int __bitField0;

        private Builder() {
            this.ticketFree = 0;
            this.ticketVIP = 0;
            this.gold = 0;
            this.items = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(WheelLeaveResponse instance) {
            if (instance.hasTicketFree()) {
                this.setTicketFree(instance.getTicketFree());
            }

            if (instance.hasTicketVIP()) {
                this.setTicketVIP(instance.getTicketVIP());
            }

            if (instance.hasGold()) {
                this.setGold(instance.getGold());
            }

            this.addAllItems(instance.getItemsList());

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

        public java.util.List<proto.message.InventorySimpleItem> getItemsList() {
            return items;
        }

        public Builder setItems(int index, proto.message.InventorySimpleItem value) {
            if (value == null) {
                throw new NullPointerException("Cannot set WheelLeaveResponse#items to null");
            }

            if(!((__bitField0 & 8) == 8)) {
                this.items = new java.util.ArrayList<>();
                __bitField0 |= 8;
            }
            this.items.set(index, value);
            return this;
        }

        public Builder addItems(proto.message.InventorySimpleItem value) {
            if (value == null) {
                throw new NullPointerException("Cannot set WheelLeaveResponse#items to null");
            }

            if(!((__bitField0 & 8) == 8)) {
                this.items = new java.util.ArrayList<>();
                __bitField0 |= 8;
            }
            this.items.add(value);
            return this;
        }

        public Builder addAllItems(java.lang.Iterable<proto.message.InventorySimpleItem> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set WheelLeaveResponse#items to null");
            }
            if(!((__bitField0 & 8) == 8)) {
                this.items = new java.util.ArrayList<>();
                __bitField0 |= 8;
            }
            for (final proto.message.InventorySimpleItem value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set WheelLeaveResponse#items to null");
                }
                this.items.add(value);
            }
            return this;
        }

        public Builder clearItems() {
            this.items = java.util.Collections.emptyList();
            __bitField0 &= ~8;
            return this;
        }

        public int getItemsCount() {
            return items.size();
        }

        public proto.message.InventorySimpleItem getItems(int index) {
            return items.get(index);
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
            if (!java.util.Objects.equals(this.items, that.items)) {
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
            result = 31 * result + (this.items == null ? 0 : this.items.hashCode());

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
            if (!items.isEmpty()) {
                parts.add("items=" + getItemsList());
            }
            return "WheelLeaveResponse{" + String.join(", ", parts) + "}";
        }

        public WheelLeaveResponse build() {
            proto.message.WheelLeaveResponse result = new proto.message.WheelLeaveResponse();
            result.__bitField0 = __bitField0;
            result.ticketFree = this.ticketFree;
            result.ticketVIP = this.ticketVIP;
            result.gold = this.gold;
            result.items = java.util.Collections.unmodifiableList(this.items);
            return result;
        }

    }



}