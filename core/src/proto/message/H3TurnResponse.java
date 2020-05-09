package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class H3TurnResponse
        implements io.protostuff.Message<H3TurnResponse> {

    private static final H3TurnResponse DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<proto.message.BetCase> resCases;

    private int result;

    private int ticketFree;

    private int ticketVIP;

    private int gold;

    private boolean __merge_lock = false;
    private int __bitField0;

    private H3TurnResponse() {
        this.resCases = java.util.Collections.emptyList();
        this.result = proto.message.ProfileResultCode.PROFILE_CLAIM_INBOX_OK.getNumber();
        this.ticketFree = 0;
        this.ticketVIP = 0;
        this.gold = 0;
    }

    private H3TurnResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static H3TurnResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<H3TurnResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<proto.message.BetCase> getResCasesList() {
        return resCases;
    }

    public int getResCasesCount() {
        return resCases.size();
    }

    public proto.message.BetCase getResCases(int index) {
        return resCases.get(index);
    }

    public H3TurnResponse withResCases(java.util.List<proto.message.BetCase> value) {
        return H3TurnResponse.newBuilder()
            .mergeFrom(this)
            .clearResCases()
            .addAllResCases(value)
            .build();
    }

    public proto.message.ProfileResultCode getResult() {
        return proto.message.ProfileResultCode.valueOf(result);
    }

    public int getResultValue() {
        return result;
    }

    public boolean hasResult() {
        return (__bitField0 & 2) == 2;
    }

    public H3TurnResponse withResult(proto.message.ProfileResultCode value) {
        return H3TurnResponse.newBuilder()
            .mergeFrom(this)
            .setResult(value)
            .build();
    }

    public int getTicketFree() {
        return ticketFree;
    }

    public boolean hasTicketFree() {
        return (__bitField0 & 4) == 4;
    }

    public H3TurnResponse withTicketFree(int value) {
        return H3TurnResponse.newBuilder()
            .mergeFrom(this)
            .setTicketFree(value)
            .build();
    }

    public int getTicketVIP() {
        return ticketVIP;
    }

    public boolean hasTicketVIP() {
        return (__bitField0 & 8) == 8;
    }

    public H3TurnResponse withTicketVIP(int value) {
        return H3TurnResponse.newBuilder()
            .mergeFrom(this)
            .setTicketVIP(value)
            .build();
    }

    public int getGold() {
        return gold;
    }

    public boolean hasGold() {
        return (__bitField0 & 16) == 16;
    }

    public H3TurnResponse withGold(int value) {
        return H3TurnResponse.newBuilder()
            .mergeFrom(this)
            .setGold(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<H3TurnResponse> cachedSchema() {
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
        H3TurnResponse that = (H3TurnResponse) obj;
        if (!java.util.Objects.equals(this.resCases, that.resCases)) {
            return false;
        }
        if (!java.util.Objects.equals(this.result, that.result)) {
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
        result = 31 * result + (this.resCases == null ? 0 : this.resCases.hashCode());
        result = 31 * result + Integer.hashCode(this.result);
        result = 31 * result + Integer.hashCode(this.ticketFree);
        result = 31 * result + Integer.hashCode(this.ticketVIP);
        result = 31 * result + Integer.hashCode(this.gold);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!resCases.isEmpty()) {
            parts.add("resCases=" + getResCasesList());
        }
        if (hasResult()) {
            parts.add("result=" + getResult() + '(' + getResultValue() + ')');
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
        return "H3TurnResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<H3TurnResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("resCases", 1);
        	__fieldMap.put("result", 2);
        	__fieldMap.put("ticketFree", 3);
        	__fieldMap.put("ticketVIP", 4);
        	__fieldMap.put("gold", 5);
        }

        @Override
        public H3TurnResponse newMessage() {
            return new H3TurnResponse();
        }

        @Override
        public Class<H3TurnResponse> typeClass() {
            return H3TurnResponse.class;
        }

        @Override
        public String messageName() {
            return H3TurnResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return H3TurnResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(H3TurnResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, H3TurnResponse instance) throws java.io.IOException {
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
                    	    instance.resCases = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.resCases.add(input.mergeObject(null, proto.message.BetCase.getSchema()));

                    	break;
                    case 2:
                    	instance.result = input.readEnum();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.ticketFree = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.ticketVIP = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.gold = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.resCases = java.util.Collections.unmodifiableList(instance.resCases);
            }





        }

        @Override
        public void writeTo(io.protostuff.Output output, H3TurnResponse instance) throws java.io.IOException {
            for(proto.message.BetCase resCases : instance.resCases) {
                output.writeObject(1, resCases, proto.message.BetCase.getSchema(), true);
            }

            if((instance.__bitField0 & 2) == 2) {
            	output.writeEnum(2, instance.result, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.ticketFree, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.ticketVIP, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.gold, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "resCases";
        		case 2: return "result";
        		case 3: return "ticketFree";
        		case 4: return "ticketVIP";
        		case 5: return "gold";
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

        private java.util.List<proto.message.BetCase> resCases;

        private int result;

        private int ticketFree;

        private int ticketVIP;

        private int gold;

        private int __bitField0;

        private Builder() {
            this.resCases = java.util.Collections.emptyList();
            this.result = proto.message.ProfileResultCode.PROFILE_CLAIM_INBOX_OK.getNumber();
            this.ticketFree = 0;
            this.ticketVIP = 0;
            this.gold = 0;
        }

        public Builder mergeFrom(H3TurnResponse instance) {
            this.addAllResCases(instance.getResCasesList());

            if (instance.hasResult()) {
                this.setResult(instance.getResult());
            }

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

        public java.util.List<proto.message.BetCase> getResCasesList() {
            return resCases;
        }

        public Builder setResCases(int index, proto.message.BetCase value) {
            if (value == null) {
                throw new NullPointerException("Cannot set H3TurnResponse#resCases to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.resCases = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.resCases.set(index, value);
            return this;
        }

        public Builder addResCases(proto.message.BetCase value) {
            if (value == null) {
                throw new NullPointerException("Cannot set H3TurnResponse#resCases to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.resCases = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.resCases.add(value);
            return this;
        }

        public Builder addAllResCases(java.lang.Iterable<proto.message.BetCase> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set H3TurnResponse#resCases to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.resCases = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final proto.message.BetCase value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set H3TurnResponse#resCases to null");
                }
                this.resCases.add(value);
            }
            return this;
        }

        public Builder clearResCases() {
            this.resCases = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getResCasesCount() {
            return resCases.size();
        }

        public proto.message.BetCase getResCases(int index) {
            return resCases.get(index);
        }

        public proto.message.ProfileResultCode getResult() {
            return proto.message.ProfileResultCode.valueOf(result);
        }

        public int getResultValue() {
            return result;
        }

        public Builder setResult(proto.message.ProfileResultCode value) {
            if (value == null) {
                throw new NullPointerException("Cannot set H3TurnResponse#result to null");
            }

            if (value == proto.message.ProfileResultCode.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set H3TurnResponse#result to UNRECOGNIZED");
            }

            this.result = value.getNumber();
            __bitField0 |= 2;
            return this;
        }

        public Builder setResultValue(int value) {
            this.result = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearResult() {
            this.result = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasResult() {
            return (__bitField0 & 2) == 2;
        }

        public int getTicketFree() {
            return ticketFree;
        }

        public Builder setTicketFree(int value) {
            this.ticketFree = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearTicketFree() {
            this.ticketFree = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasTicketFree() {
            return (__bitField0 & 4) == 4;
        }

        public int getTicketVIP() {
            return ticketVIP;
        }

        public Builder setTicketVIP(int value) {
            this.ticketVIP = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearTicketVIP() {
            this.ticketVIP = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasTicketVIP() {
            return (__bitField0 & 8) == 8;
        }

        public int getGold() {
            return gold;
        }

        public Builder setGold(int value) {
            this.gold = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearGold() {
            this.gold = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasGold() {
            return (__bitField0 & 16) == 16;
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
            if (!java.util.Objects.equals(this.resCases, that.resCases)) {
                return false;
            }
            if (!java.util.Objects.equals(this.result, that.result)) {
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
            result = 31 * result + (this.resCases == null ? 0 : this.resCases.hashCode());
            result = 31 * result + Integer.hashCode(this.result);
            result = 31 * result + Integer.hashCode(this.ticketFree);
            result = 31 * result + Integer.hashCode(this.ticketVIP);
            result = 31 * result + Integer.hashCode(this.gold);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!resCases.isEmpty()) {
                parts.add("resCases=" + getResCasesList());
            }
            if (hasResult()) {
                parts.add("result=" + getResult() + '(' + getResultValue() + ')');
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
            return "H3TurnResponse{" + String.join(", ", parts) + "}";
        }

        public H3TurnResponse build() {
            proto.message.H3TurnResponse result = new proto.message.H3TurnResponse();
            result.__bitField0 = __bitField0;
            result.resCases = java.util.Collections.unmodifiableList(this.resCases);
            result.result = this.result;
            result.ticketFree = this.ticketFree;
            result.ticketVIP = this.ticketVIP;
            result.gold = this.gold;
            return result;
        }

    }



}