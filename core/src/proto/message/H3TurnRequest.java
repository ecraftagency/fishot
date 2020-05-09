package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class H3TurnRequest
        implements io.protostuff.Message<H3TurnRequest> {

    private static final H3TurnRequest DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<proto.message.BetCase> betCases;

    private int ticketFree;

    private int ticketVIP;

    private int gold;

    private boolean __merge_lock = false;
    private int __bitField0;

    private H3TurnRequest() {
        this.betCases = java.util.Collections.emptyList();
        this.ticketFree = 0;
        this.ticketVIP = 0;
        this.gold = 0;
    }

    private H3TurnRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static H3TurnRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<H3TurnRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<proto.message.BetCase> getBetCasesList() {
        return betCases;
    }

    public int getBetCasesCount() {
        return betCases.size();
    }

    public proto.message.BetCase getBetCases(int index) {
        return betCases.get(index);
    }

    public H3TurnRequest withBetCases(java.util.List<proto.message.BetCase> value) {
        return H3TurnRequest.newBuilder()
            .mergeFrom(this)
            .clearBetCases()
            .addAllBetCases(value)
            .build();
    }

    public int getTicketFree() {
        return ticketFree;
    }

    public boolean hasTicketFree() {
        return (__bitField0 & 2) == 2;
    }

    public H3TurnRequest withTicketFree(int value) {
        return H3TurnRequest.newBuilder()
            .mergeFrom(this)
            .setTicketFree(value)
            .build();
    }

    public int getTicketVIP() {
        return ticketVIP;
    }

    public boolean hasTicketVIP() {
        return (__bitField0 & 4) == 4;
    }

    public H3TurnRequest withTicketVIP(int value) {
        return H3TurnRequest.newBuilder()
            .mergeFrom(this)
            .setTicketVIP(value)
            .build();
    }

    public int getGold() {
        return gold;
    }

    public boolean hasGold() {
        return (__bitField0 & 8) == 8;
    }

    public H3TurnRequest withGold(int value) {
        return H3TurnRequest.newBuilder()
            .mergeFrom(this)
            .setGold(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<H3TurnRequest> cachedSchema() {
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
        H3TurnRequest that = (H3TurnRequest) obj;
        if (!java.util.Objects.equals(this.betCases, that.betCases)) {
            return false;
        }
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
        result = 31 * result + (this.betCases == null ? 0 : this.betCases.hashCode());
        result = 31 * result + Integer.hashCode(this.ticketFree);
        result = 31 * result + Integer.hashCode(this.ticketVIP);
        result = 31 * result + Integer.hashCode(this.gold);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!betCases.isEmpty()) {
            parts.add("betCases=" + getBetCasesList());
        }
        if (hasTicketFree()) {
            parts.add("ticketFree=" + getTicketFree());
        }
        if (hasTicketVIP()) {
            parts.add("ticketVIP=" + getTicketVIP());
        }
        if (hasGold()) {
            parts.add("gold=" + getGold());
        }
        return "H3TurnRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<H3TurnRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("betCases", 1);
        	__fieldMap.put("ticketFree", 2);
        	__fieldMap.put("ticketVIP", 3);
        	__fieldMap.put("gold", 4);
        }

        @Override
        public H3TurnRequest newMessage() {
            return new H3TurnRequest();
        }

        @Override
        public Class<H3TurnRequest> typeClass() {
            return H3TurnRequest.class;
        }

        @Override
        public String messageName() {
            return H3TurnRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return H3TurnRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(H3TurnRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, H3TurnRequest instance) throws java.io.IOException {
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
                    	if(!((instance.__bitField0 & 1) == 1)) {
                    	    instance.betCases = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.betCases.add(input.mergeObject(null, proto.message.BetCase.getSchema()));

                    	break;
                    case 2:
                    	instance.ticketFree = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.ticketVIP = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.gold = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.betCases = java.util.Collections.unmodifiableList(instance.betCases);
            }




        }

        @Override
        public void writeTo(io.protostuff.Output output, H3TurnRequest instance) throws java.io.IOException {
            for(proto.message.BetCase betCases : instance.betCases) {
                output.writeObject(1, betCases, proto.message.BetCase.getSchema(), true);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.ticketFree, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.ticketVIP, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.gold, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "betCases";
        		case 2: return "ticketFree";
        		case 3: return "ticketVIP";
        		case 4: return "gold";
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

        private java.util.List<proto.message.BetCase> betCases;

        private int ticketFree;

        private int ticketVIP;

        private int gold;

        private int __bitField0;

        private Builder() {
            this.betCases = java.util.Collections.emptyList();
            this.ticketFree = 0;
            this.ticketVIP = 0;
            this.gold = 0;
        }

        public Builder mergeFrom(H3TurnRequest instance) {
            this.addAllBetCases(instance.getBetCasesList());

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

        public java.util.List<proto.message.BetCase> getBetCasesList() {
            return betCases;
        }

        public Builder setBetCases(int index, proto.message.BetCase value) {
            if (value == null) {
                throw new NullPointerException("Cannot set H3TurnRequest#betCases to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.betCases = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.betCases.set(index, value);
            return this;
        }

        public Builder addBetCases(proto.message.BetCase value) {
            if (value == null) {
                throw new NullPointerException("Cannot set H3TurnRequest#betCases to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.betCases = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.betCases.add(value);
            return this;
        }

        public Builder addAllBetCases(java.lang.Iterable<proto.message.BetCase> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set H3TurnRequest#betCases to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.betCases = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final proto.message.BetCase value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set H3TurnRequest#betCases to null");
                }
                this.betCases.add(value);
            }
            return this;
        }

        public Builder clearBetCases() {
            this.betCases = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getBetCasesCount() {
            return betCases.size();
        }

        public proto.message.BetCase getBetCases(int index) {
            return betCases.get(index);
        }

        public int getTicketFree() {
            return ticketFree;
        }

        public Builder setTicketFree(int value) {
            this.ticketFree = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearTicketFree() {
            this.ticketFree = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasTicketFree() {
            return (__bitField0 & 2) == 2;
        }

        public int getTicketVIP() {
            return ticketVIP;
        }

        public Builder setTicketVIP(int value) {
            this.ticketVIP = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearTicketVIP() {
            this.ticketVIP = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasTicketVIP() {
            return (__bitField0 & 4) == 4;
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




        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || this.getClass() != obj.getClass()) {
                return false;
            }
            Builder that = (Builder) obj;
            if (!java.util.Objects.equals(this.betCases, that.betCases)) {
                return false;
            }
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
            result = 31 * result + (this.betCases == null ? 0 : this.betCases.hashCode());
            result = 31 * result + Integer.hashCode(this.ticketFree);
            result = 31 * result + Integer.hashCode(this.ticketVIP);
            result = 31 * result + Integer.hashCode(this.gold);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!betCases.isEmpty()) {
                parts.add("betCases=" + getBetCasesList());
            }
            if (hasTicketFree()) {
                parts.add("ticketFree=" + getTicketFree());
            }
            if (hasTicketVIP()) {
                parts.add("ticketVIP=" + getTicketVIP());
            }
            if (hasGold()) {
                parts.add("gold=" + getGold());
            }
            return "H3TurnRequest{" + String.join(", ", parts) + "}";
        }

        public H3TurnRequest build() {
            proto.message.H3TurnRequest result = new proto.message.H3TurnRequest();
            result.__bitField0 = __bitField0;
            result.betCases = java.util.Collections.unmodifiableList(this.betCases);
            result.ticketFree = this.ticketFree;
            result.ticketVIP = this.ticketVIP;
            result.gold = this.gold;
            return result;
        }

    }



}