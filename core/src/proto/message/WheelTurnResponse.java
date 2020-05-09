package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class WheelTurnResponse
        implements io.protostuff.Message<WheelTurnResponse> {

    private static final WheelTurnResponse DEFAULT_INSTANCE = newBuilder().build();

    private int result;

    private int ticketFree;

    private int ticketVIP;

    private int gold;

    private int gift;

    private int jackpot;

    private boolean __merge_lock = false;
    private int __bitField0;

    private WheelTurnResponse() {
        this.result = proto.message.ProfileResultCode.PROFILE_CLAIM_INBOX_OK.getNumber();
        this.ticketFree = 0;
        this.ticketVIP = 0;
        this.gold = 0;
        this.gift = 0;
        this.jackpot = 0;
    }

    private WheelTurnResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static WheelTurnResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<WheelTurnResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public proto.message.ProfileResultCode getResult() {
        return proto.message.ProfileResultCode.valueOf(result);
    }

    public int getResultValue() {
        return result;
    }

    public boolean hasResult() {
        return (__bitField0 & 1) == 1;
    }

    public WheelTurnResponse withResult(proto.message.ProfileResultCode value) {
        return WheelTurnResponse.newBuilder()
            .mergeFrom(this)
            .setResult(value)
            .build();
    }

    public int getTicketFree() {
        return ticketFree;
    }

    public boolean hasTicketFree() {
        return (__bitField0 & 2) == 2;
    }

    public WheelTurnResponse withTicketFree(int value) {
        return WheelTurnResponse.newBuilder()
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

    public WheelTurnResponse withTicketVIP(int value) {
        return WheelTurnResponse.newBuilder()
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

    public WheelTurnResponse withGold(int value) {
        return WheelTurnResponse.newBuilder()
            .mergeFrom(this)
            .setGold(value)
            .build();
    }

    public int getGift() {
        return gift;
    }

    public boolean hasGift() {
        return (__bitField0 & 16) == 16;
    }

    public WheelTurnResponse withGift(int value) {
        return WheelTurnResponse.newBuilder()
            .mergeFrom(this)
            .setGift(value)
            .build();
    }

    public int getJackpot() {
        return jackpot;
    }

    public boolean hasJackpot() {
        return (__bitField0 & 32) == 32;
    }

    public WheelTurnResponse withJackpot(int value) {
        return WheelTurnResponse.newBuilder()
            .mergeFrom(this)
            .setJackpot(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<WheelTurnResponse> cachedSchema() {
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
        WheelTurnResponse that = (WheelTurnResponse) obj;
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
        if (!java.util.Objects.equals(this.gift, that.gift)) {
            return false;
        }
        if (!java.util.Objects.equals(this.jackpot, that.jackpot)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.result);
        result = 31 * result + Integer.hashCode(this.ticketFree);
        result = 31 * result + Integer.hashCode(this.ticketVIP);
        result = 31 * result + Integer.hashCode(this.gold);
        result = 31 * result + Integer.hashCode(this.gift);
        result = 31 * result + Integer.hashCode(this.jackpot);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
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
        if (hasGift()) {
            parts.add("gift=" + getGift());
        }
        if (hasJackpot()) {
            parts.add("jackpot=" + getJackpot());
        }
        return "WheelTurnResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<WheelTurnResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("result", 1);
        	__fieldMap.put("ticketFree", 2);
        	__fieldMap.put("ticketVIP", 3);
        	__fieldMap.put("gold", 4);
        	__fieldMap.put("gift", 5);
        	__fieldMap.put("jackpot", 6);
        }

        @Override
        public WheelTurnResponse newMessage() {
            return new WheelTurnResponse();
        }

        @Override
        public Class<WheelTurnResponse> typeClass() {
            return WheelTurnResponse.class;
        }

        @Override
        public String messageName() {
            return WheelTurnResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return WheelTurnResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(WheelTurnResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, WheelTurnResponse instance) throws java.io.IOException {
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
                    	instance.result = input.readEnum();
                    	instance.__bitField0 |= 1;
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
                    case 5:
                    	instance.gift = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.jackpot = input.readInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, WheelTurnResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.result, false);
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

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.gift, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeInt32(6, instance.jackpot, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "result";
        		case 2: return "ticketFree";
        		case 3: return "ticketVIP";
        		case 4: return "gold";
        		case 5: return "gift";
        		case 6: return "jackpot";
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

        private int result;

        private int ticketFree;

        private int ticketVIP;

        private int gold;

        private int gift;

        private int jackpot;

        private int __bitField0;

        private Builder() {
            this.result = proto.message.ProfileResultCode.PROFILE_CLAIM_INBOX_OK.getNumber();
            this.ticketFree = 0;
            this.ticketVIP = 0;
            this.gold = 0;
            this.gift = 0;
            this.jackpot = 0;
        }

        public Builder mergeFrom(WheelTurnResponse instance) {
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

            if (instance.hasGift()) {
                this.setGift(instance.getGift());
            }

            if (instance.hasJackpot()) {
                this.setJackpot(instance.getJackpot());
            }

            return this;
        }

        public proto.message.ProfileResultCode getResult() {
            return proto.message.ProfileResultCode.valueOf(result);
        }

        public int getResultValue() {
            return result;
        }

        public Builder setResult(proto.message.ProfileResultCode value) {
            if (value == null) {
                throw new NullPointerException("Cannot set WheelTurnResponse#result to null");
            }

            if (value == proto.message.ProfileResultCode.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set WheelTurnResponse#result to UNRECOGNIZED");
            }

            this.result = value.getNumber();
            __bitField0 |= 1;
            return this;
        }

        public Builder setResultValue(int value) {
            this.result = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearResult() {
            this.result = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasResult() {
            return (__bitField0 & 1) == 1;
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

        public int getGift() {
            return gift;
        }

        public Builder setGift(int value) {
            this.gift = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearGift() {
            this.gift = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasGift() {
            return (__bitField0 & 16) == 16;
        }

        public int getJackpot() {
            return jackpot;
        }

        public Builder setJackpot(int value) {
            this.jackpot = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearJackpot() {
            this.jackpot = 0;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasJackpot() {
            return (__bitField0 & 32) == 32;
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
            if (!java.util.Objects.equals(this.gift, that.gift)) {
                return false;
            }
            if (!java.util.Objects.equals(this.jackpot, that.jackpot)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.result);
            result = 31 * result + Integer.hashCode(this.ticketFree);
            result = 31 * result + Integer.hashCode(this.ticketVIP);
            result = 31 * result + Integer.hashCode(this.gold);
            result = 31 * result + Integer.hashCode(this.gift);
            result = 31 * result + Integer.hashCode(this.jackpot);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
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
            if (hasGift()) {
                parts.add("gift=" + getGift());
            }
            if (hasJackpot()) {
                parts.add("jackpot=" + getJackpot());
            }
            return "WheelTurnResponse{" + String.join(", ", parts) + "}";
        }

        public WheelTurnResponse build() {
            proto.message.WheelTurnResponse result = new proto.message.WheelTurnResponse();
            result.__bitField0 = __bitField0;
            result.result = this.result;
            result.ticketFree = this.ticketFree;
            result.ticketVIP = this.ticketVIP;
            result.gold = this.gold;
            result.gift = this.gift;
            result.jackpot = this.jackpot;
            return result;
        }

    }



}