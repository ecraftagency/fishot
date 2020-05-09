package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class WheelEnterResponse
        implements io.protostuff.Message<WheelEnterResponse> {

    private static final WheelEnterResponse DEFAULT_INSTANCE = newBuilder().build();

    private int ticketFree;

    private int ticketVIP;

    private java.util.List<proto.message.WheelGift> gifts;

    private int gold;

    private int jackpot;

    private java.util.List<Integer> jackpotGolds;

    private java.util.List<proto.message.WheelJackpot> jackpots;

    private java.util.List<Integer> carriers;

    private int carrierSel;

    private boolean __merge_lock = false;
    private int __bitField0;

    private WheelEnterResponse() {
        this.ticketFree = 0;
        this.ticketVIP = 0;
        this.gifts = java.util.Collections.emptyList();
        this.gold = 0;
        this.jackpot = 0;
        this.jackpotGolds = java.util.Collections.emptyList();
        this.jackpots = java.util.Collections.emptyList();
        this.carriers = java.util.Collections.emptyList();
        this.carrierSel = 0;
    }

    private WheelEnterResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static WheelEnterResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<WheelEnterResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getTicketFree() {
        return ticketFree;
    }

    public boolean hasTicketFree() {
        return (__bitField0 & 1) == 1;
    }

    public WheelEnterResponse withTicketFree(int value) {
        return WheelEnterResponse.newBuilder()
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

    public WheelEnterResponse withTicketVIP(int value) {
        return WheelEnterResponse.newBuilder()
            .mergeFrom(this)
            .setTicketVIP(value)
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

    public WheelEnterResponse withGifts(java.util.List<proto.message.WheelGift> value) {
        return WheelEnterResponse.newBuilder()
            .mergeFrom(this)
            .clearGifts()
            .addAllGifts(value)
            .build();
    }

    public int getGold() {
        return gold;
    }

    public boolean hasGold() {
        return (__bitField0 & 8) == 8;
    }

    public WheelEnterResponse withGold(int value) {
        return WheelEnterResponse.newBuilder()
            .mergeFrom(this)
            .setGold(value)
            .build();
    }

    public int getJackpot() {
        return jackpot;
    }

    public boolean hasJackpot() {
        return (__bitField0 & 16) == 16;
    }

    public WheelEnterResponse withJackpot(int value) {
        return WheelEnterResponse.newBuilder()
            .mergeFrom(this)
            .setJackpot(value)
            .build();
    }

    public java.util.List<Integer> getJackpotGoldsList() {
        return jackpotGolds;
    }

    public int getJackpotGoldsCount() {
        return jackpotGolds.size();
    }

    public int getJackpotGolds(int index) {
        return jackpotGolds.get(index);
    }

    public WheelEnterResponse withJackpotGolds(java.util.List<Integer> value) {
        return WheelEnterResponse.newBuilder()
            .mergeFrom(this)
            .clearJackpotGolds()
            .addAllJackpotGolds(value)
            .build();
    }

    public java.util.List<proto.message.WheelJackpot> getJackpotsList() {
        return jackpots;
    }

    public int getJackpotsCount() {
        return jackpots.size();
    }

    public proto.message.WheelJackpot getJackpots(int index) {
        return jackpots.get(index);
    }

    public WheelEnterResponse withJackpots(java.util.List<proto.message.WheelJackpot> value) {
        return WheelEnterResponse.newBuilder()
            .mergeFrom(this)
            .clearJackpots()
            .addAllJackpots(value)
            .build();
    }

    public java.util.List<Integer> getCarriersList() {
        return carriers;
    }

    public int getCarriersCount() {
        return carriers.size();
    }

    public int getCarriers(int index) {
        return carriers.get(index);
    }

    public WheelEnterResponse withCarriers(java.util.List<Integer> value) {
        return WheelEnterResponse.newBuilder()
            .mergeFrom(this)
            .clearCarriers()
            .addAllCarriers(value)
            .build();
    }

    public int getCarrierSel() {
        return carrierSel;
    }

    public boolean hasCarrierSel() {
        return (__bitField0 & 256) == 256;
    }

    public WheelEnterResponse withCarrierSel(int value) {
        return WheelEnterResponse.newBuilder()
            .mergeFrom(this)
            .setCarrierSel(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<WheelEnterResponse> cachedSchema() {
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
        WheelEnterResponse that = (WheelEnterResponse) obj;
        if (!java.util.Objects.equals(this.ticketFree, that.ticketFree)) {
            return false;
        }
        if (!java.util.Objects.equals(this.ticketVIP, that.ticketVIP)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gifts, that.gifts)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gold, that.gold)) {
            return false;
        }
        if (!java.util.Objects.equals(this.jackpot, that.jackpot)) {
            return false;
        }
        if (!java.util.Objects.equals(this.jackpotGolds, that.jackpotGolds)) {
            return false;
        }
        if (!java.util.Objects.equals(this.jackpots, that.jackpots)) {
            return false;
        }
        if (!java.util.Objects.equals(this.carriers, that.carriers)) {
            return false;
        }
        if (!java.util.Objects.equals(this.carrierSel, that.carrierSel)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.ticketFree);
        result = 31 * result + Integer.hashCode(this.ticketVIP);
        result = 31 * result + (this.gifts == null ? 0 : this.gifts.hashCode());
        result = 31 * result + Integer.hashCode(this.gold);
        result = 31 * result + Integer.hashCode(this.jackpot);
        result = 31 * result + (this.jackpotGolds == null ? 0 : this.jackpotGolds.hashCode());
        result = 31 * result + (this.jackpots == null ? 0 : this.jackpots.hashCode());
        result = 31 * result + (this.carriers == null ? 0 : this.carriers.hashCode());
        result = 31 * result + Integer.hashCode(this.carrierSel);

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
        if (!gifts.isEmpty()) {
            parts.add("gifts=" + getGiftsList());
        }
        if (hasGold()) {
            parts.add("gold=" + getGold());
        }
        if (hasJackpot()) {
            parts.add("jackpot=" + getJackpot());
        }
        if (!jackpotGolds.isEmpty()) {
            parts.add("jackpotGolds=" + getJackpotGoldsList());
        }
        if (!jackpots.isEmpty()) {
            parts.add("jackpots=" + getJackpotsList());
        }
        if (!carriers.isEmpty()) {
            parts.add("carriers=" + getCarriersList());
        }
        if (hasCarrierSel()) {
            parts.add("carrierSel=" + getCarrierSel());
        }
        return "WheelEnterResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<WheelEnterResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("ticketFree", 1);
        	__fieldMap.put("ticketVIP", 2);
        	__fieldMap.put("gifts", 3);
        	__fieldMap.put("gold", 4);
        	__fieldMap.put("jackpot", 6);
        	__fieldMap.put("jackpotGolds", 7);
        	__fieldMap.put("jackpots", 8);
        	__fieldMap.put("carriers", 9);
        	__fieldMap.put("carrierSel", 10);
        }

        @Override
        public WheelEnterResponse newMessage() {
            return new WheelEnterResponse();
        }

        @Override
        public Class<WheelEnterResponse> typeClass() {
            return WheelEnterResponse.class;
        }

        @Override
        public String messageName() {
            return WheelEnterResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return WheelEnterResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(WheelEnterResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, WheelEnterResponse instance) throws java.io.IOException {
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
                    	if(!((instance.__bitField0 & 4) == 4)) {
                    	    instance.gifts = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 4;
                    	}
                    	instance.gifts.add(input.mergeObject(null, proto.message.WheelGift.getSchema()));

                    	break;
                    case 4:
                    	instance.gold = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 6:
                    	instance.jackpot = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 7:
                    	if(!((instance.__bitField0 & 32) == 32)) {
                    	    instance.jackpotGolds = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 32;
                    	}
                    	instance.jackpotGolds.add(input.readInt32());

                    	break;
                    case 8:
                    	if(!((instance.__bitField0 & 64) == 64)) {
                    	    instance.jackpots = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 64;
                    	}
                    	instance.jackpots.add(input.mergeObject(null, proto.message.WheelJackpot.getSchema()));

                    	break;
                    case 9:
                    	if(!((instance.__bitField0 & 128) == 128)) {
                    	    instance.carriers = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 128;
                    	}
                    	instance.carriers.add(input.readInt32());

                    	break;
                    case 10:
                    	instance.carrierSel = input.readInt32();
                    	instance.__bitField0 |= 256;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 4) == 4) {
                instance.gifts = java.util.Collections.unmodifiableList(instance.gifts);
            }



            if((instance.__bitField0 & 32) == 32) {
                instance.jackpotGolds = java.util.Collections.unmodifiableList(instance.jackpotGolds);
            }

            if((instance.__bitField0 & 64) == 64) {
                instance.jackpots = java.util.Collections.unmodifiableList(instance.jackpots);
            }

            if((instance.__bitField0 & 128) == 128) {
                instance.carriers = java.util.Collections.unmodifiableList(instance.carriers);
            }


        }

        @Override
        public void writeTo(io.protostuff.Output output, WheelEnterResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.ticketFree, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.ticketVIP, false);
            }

            for(proto.message.WheelGift gifts : instance.gifts) {
                output.writeObject(3, gifts, proto.message.WheelGift.getSchema(), true);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.gold, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(6, instance.jackpot, false);
            }

            for(int jackpotGolds : instance.jackpotGolds) {
                output.writeInt32(7, jackpotGolds, true);
            }

            for(proto.message.WheelJackpot jackpots : instance.jackpots) {
                output.writeObject(8, jackpots, proto.message.WheelJackpot.getSchema(), true);
            }

            for(int carriers : instance.carriers) {
                output.writeInt32(9, carriers, true);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeInt32(10, instance.carrierSel, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "ticketFree";
        		case 2: return "ticketVIP";
        		case 3: return "gifts";
        		case 4: return "gold";
        		case 6: return "jackpot";
        		case 7: return "jackpotGolds";
        		case 8: return "jackpots";
        		case 9: return "carriers";
        		case 10: return "carrierSel";
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

        private java.util.List<proto.message.WheelGift> gifts;

        private int gold;

        private int jackpot;

        private java.util.List<Integer> jackpotGolds;

        private java.util.List<proto.message.WheelJackpot> jackpots;

        private java.util.List<Integer> carriers;

        private int carrierSel;

        private int __bitField0;

        private Builder() {
            this.ticketFree = 0;
            this.ticketVIP = 0;
            this.gifts = java.util.Collections.emptyList();
            this.gold = 0;
            this.jackpot = 0;
            this.jackpotGolds = java.util.Collections.emptyList();
            this.jackpots = java.util.Collections.emptyList();
            this.carriers = java.util.Collections.emptyList();
            this.carrierSel = 0;
        }

        public Builder mergeFrom(WheelEnterResponse instance) {
            if (instance.hasTicketFree()) {
                this.setTicketFree(instance.getTicketFree());
            }

            if (instance.hasTicketVIP()) {
                this.setTicketVIP(instance.getTicketVIP());
            }

            this.addAllGifts(instance.getGiftsList());

            if (instance.hasGold()) {
                this.setGold(instance.getGold());
            }

            if (instance.hasJackpot()) {
                this.setJackpot(instance.getJackpot());
            }

            this.addAllJackpotGolds(instance.getJackpotGoldsList());

            this.addAllJackpots(instance.getJackpotsList());

            this.addAllCarriers(instance.getCarriersList());

            if (instance.hasCarrierSel()) {
                this.setCarrierSel(instance.getCarrierSel());
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

        public java.util.List<proto.message.WheelGift> getGiftsList() {
            return gifts;
        }

        public Builder setGifts(int index, proto.message.WheelGift value) {
            if (value == null) {
                throw new NullPointerException("Cannot set WheelEnterResponse#gifts to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.gifts = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.gifts.set(index, value);
            return this;
        }

        public Builder addGifts(proto.message.WheelGift value) {
            if (value == null) {
                throw new NullPointerException("Cannot set WheelEnterResponse#gifts to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.gifts = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.gifts.add(value);
            return this;
        }

        public Builder addAllGifts(java.lang.Iterable<proto.message.WheelGift> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set WheelEnterResponse#gifts to null");
            }
            if(!((__bitField0 & 4) == 4)) {
                this.gifts = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            for (final proto.message.WheelGift value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set WheelEnterResponse#gifts to null");
                }
                this.gifts.add(value);
            }
            return this;
        }

        public Builder clearGifts() {
            this.gifts = java.util.Collections.emptyList();
            __bitField0 &= ~4;
            return this;
        }

        public int getGiftsCount() {
            return gifts.size();
        }

        public proto.message.WheelGift getGifts(int index) {
            return gifts.get(index);
        }

        public int getGold() {
            return gold;
        }

        public Builder setGold(int value) {
            this.gold = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearGold() {
            this.gold = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasGold() {
            return (__bitField0 & 8) == 8;
        }

        public int getJackpot() {
            return jackpot;
        }

        public Builder setJackpot(int value) {
            this.jackpot = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearJackpot() {
            this.jackpot = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasJackpot() {
            return (__bitField0 & 16) == 16;
        }

        public java.util.List<Integer> getJackpotGoldsList() {
            return jackpotGolds;
        }

        public Builder setJackpotGolds(int index, int value) {
            if(!((__bitField0 & 32) == 32)) {
                this.jackpotGolds = new java.util.ArrayList<>();
                __bitField0 |= 32;
            }
            this.jackpotGolds.set(index, value);
            return this;
        }

        public Builder addJackpotGolds(int value) {
            if(!((__bitField0 & 32) == 32)) {
                this.jackpotGolds = new java.util.ArrayList<>();
                __bitField0 |= 32;
            }
            this.jackpotGolds.add(value);
            return this;
        }

        public Builder addAllJackpotGolds(java.lang.Iterable<Integer> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set WheelEnterResponse#jackpotGolds to null");
            }
            if(!((__bitField0 & 32) == 32)) {
                this.jackpotGolds = new java.util.ArrayList<>();
                __bitField0 |= 32;
            }
            for (final Integer value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set WheelEnterResponse#jackpotGolds to null");
                }
                this.jackpotGolds.add(value);
            }
            return this;
        }

        public Builder clearJackpotGolds() {
            this.jackpotGolds = java.util.Collections.emptyList();
            __bitField0 &= ~32;
            return this;
        }

        public int getJackpotGoldsCount() {
            return jackpotGolds.size();
        }

        public int getJackpotGolds(int index) {
            return jackpotGolds.get(index);
        }

        public java.util.List<proto.message.WheelJackpot> getJackpotsList() {
            return jackpots;
        }

        public Builder setJackpots(int index, proto.message.WheelJackpot value) {
            if (value == null) {
                throw new NullPointerException("Cannot set WheelEnterResponse#jackpots to null");
            }

            if(!((__bitField0 & 64) == 64)) {
                this.jackpots = new java.util.ArrayList<>();
                __bitField0 |= 64;
            }
            this.jackpots.set(index, value);
            return this;
        }

        public Builder addJackpots(proto.message.WheelJackpot value) {
            if (value == null) {
                throw new NullPointerException("Cannot set WheelEnterResponse#jackpots to null");
            }

            if(!((__bitField0 & 64) == 64)) {
                this.jackpots = new java.util.ArrayList<>();
                __bitField0 |= 64;
            }
            this.jackpots.add(value);
            return this;
        }

        public Builder addAllJackpots(java.lang.Iterable<proto.message.WheelJackpot> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set WheelEnterResponse#jackpots to null");
            }
            if(!((__bitField0 & 64) == 64)) {
                this.jackpots = new java.util.ArrayList<>();
                __bitField0 |= 64;
            }
            for (final proto.message.WheelJackpot value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set WheelEnterResponse#jackpots to null");
                }
                this.jackpots.add(value);
            }
            return this;
        }

        public Builder clearJackpots() {
            this.jackpots = java.util.Collections.emptyList();
            __bitField0 &= ~64;
            return this;
        }

        public int getJackpotsCount() {
            return jackpots.size();
        }

        public proto.message.WheelJackpot getJackpots(int index) {
            return jackpots.get(index);
        }

        public java.util.List<Integer> getCarriersList() {
            return carriers;
        }

        public Builder setCarriers(int index, int value) {
            if(!((__bitField0 & 128) == 128)) {
                this.carriers = new java.util.ArrayList<>();
                __bitField0 |= 128;
            }
            this.carriers.set(index, value);
            return this;
        }

        public Builder addCarriers(int value) {
            if(!((__bitField0 & 128) == 128)) {
                this.carriers = new java.util.ArrayList<>();
                __bitField0 |= 128;
            }
            this.carriers.add(value);
            return this;
        }

        public Builder addAllCarriers(java.lang.Iterable<Integer> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set WheelEnterResponse#carriers to null");
            }
            if(!((__bitField0 & 128) == 128)) {
                this.carriers = new java.util.ArrayList<>();
                __bitField0 |= 128;
            }
            for (final Integer value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set WheelEnterResponse#carriers to null");
                }
                this.carriers.add(value);
            }
            return this;
        }

        public Builder clearCarriers() {
            this.carriers = java.util.Collections.emptyList();
            __bitField0 &= ~128;
            return this;
        }

        public int getCarriersCount() {
            return carriers.size();
        }

        public int getCarriers(int index) {
            return carriers.get(index);
        }

        public int getCarrierSel() {
            return carrierSel;
        }

        public Builder setCarrierSel(int value) {
            this.carrierSel = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearCarrierSel() {
            this.carrierSel = 0;
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasCarrierSel() {
            return (__bitField0 & 256) == 256;
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
            if (!java.util.Objects.equals(this.gifts, that.gifts)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gold, that.gold)) {
                return false;
            }
            if (!java.util.Objects.equals(this.jackpot, that.jackpot)) {
                return false;
            }
            if (!java.util.Objects.equals(this.jackpotGolds, that.jackpotGolds)) {
                return false;
            }
            if (!java.util.Objects.equals(this.jackpots, that.jackpots)) {
                return false;
            }
            if (!java.util.Objects.equals(this.carriers, that.carriers)) {
                return false;
            }
            if (!java.util.Objects.equals(this.carrierSel, that.carrierSel)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.ticketFree);
            result = 31 * result + Integer.hashCode(this.ticketVIP);
            result = 31 * result + (this.gifts == null ? 0 : this.gifts.hashCode());
            result = 31 * result + Integer.hashCode(this.gold);
            result = 31 * result + Integer.hashCode(this.jackpot);
            result = 31 * result + (this.jackpotGolds == null ? 0 : this.jackpotGolds.hashCode());
            result = 31 * result + (this.jackpots == null ? 0 : this.jackpots.hashCode());
            result = 31 * result + (this.carriers == null ? 0 : this.carriers.hashCode());
            result = 31 * result + Integer.hashCode(this.carrierSel);

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
            if (!gifts.isEmpty()) {
                parts.add("gifts=" + getGiftsList());
            }
            if (hasGold()) {
                parts.add("gold=" + getGold());
            }
            if (hasJackpot()) {
                parts.add("jackpot=" + getJackpot());
            }
            if (!jackpotGolds.isEmpty()) {
                parts.add("jackpotGolds=" + getJackpotGoldsList());
            }
            if (!jackpots.isEmpty()) {
                parts.add("jackpots=" + getJackpotsList());
            }
            if (!carriers.isEmpty()) {
                parts.add("carriers=" + getCarriersList());
            }
            if (hasCarrierSel()) {
                parts.add("carrierSel=" + getCarrierSel());
            }
            return "WheelEnterResponse{" + String.join(", ", parts) + "}";
        }

        public WheelEnterResponse build() {
            proto.message.WheelEnterResponse result = new proto.message.WheelEnterResponse();
            result.__bitField0 = __bitField0;
            result.ticketFree = this.ticketFree;
            result.ticketVIP = this.ticketVIP;
            result.gifts = java.util.Collections.unmodifiableList(this.gifts);
            result.gold = this.gold;
            result.jackpot = this.jackpot;
            result.jackpotGolds = java.util.Collections.unmodifiableList(this.jackpotGolds);
            result.jackpots = java.util.Collections.unmodifiableList(this.jackpots);
            result.carriers = java.util.Collections.unmodifiableList(this.carriers);
            result.carrierSel = this.carrierSel;
            return result;
        }

    }



}