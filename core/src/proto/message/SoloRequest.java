package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class SoloRequest
        implements io.protostuff.Message<SoloRequest> {

    private static final SoloRequest DEFAULT_INSTANCE = newBuilder().build();

    private String fromUserId;

    private String toUserId;

    private int betPrice;

    private int betRule;

    private boolean __merge_lock = false;
    private int __bitField0;

    private SoloRequest() {
        this.fromUserId = "";
        this.toUserId = "";
        this.betPrice = 0;
        this.betRule = 0;
    }

    private SoloRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static SoloRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<SoloRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getFromUserId() {
        return fromUserId;
    }

    public boolean hasFromUserId() {
        return (__bitField0 & 1) == 1;
    }

    public SoloRequest withFromUserId(String value) {
        return SoloRequest.newBuilder()
            .mergeFrom(this)
            .setFromUserId(value)
            .build();
    }

    public String getToUserId() {
        return toUserId;
    }

    public boolean hasToUserId() {
        return (__bitField0 & 2) == 2;
    }

    public SoloRequest withToUserId(String value) {
        return SoloRequest.newBuilder()
            .mergeFrom(this)
            .setToUserId(value)
            .build();
    }

    public int getBetPrice() {
        return betPrice;
    }

    public boolean hasBetPrice() {
        return (__bitField0 & 4) == 4;
    }

    public SoloRequest withBetPrice(int value) {
        return SoloRequest.newBuilder()
            .mergeFrom(this)
            .setBetPrice(value)
            .build();
    }

    public int getBetRule() {
        return betRule;
    }

    public boolean hasBetRule() {
        return (__bitField0 & 8) == 8;
    }

    public SoloRequest withBetRule(int value) {
        return SoloRequest.newBuilder()
            .mergeFrom(this)
            .setBetRule(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<SoloRequest> cachedSchema() {
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
        SoloRequest that = (SoloRequest) obj;
        if (!java.util.Objects.equals(this.fromUserId, that.fromUserId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.toUserId, that.toUserId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.betPrice, that.betPrice)) {
            return false;
        }
        if (!java.util.Objects.equals(this.betRule, that.betRule)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.fromUserId == null ? 0 : this.fromUserId.hashCode());
        result = 31 * result + (this.toUserId == null ? 0 : this.toUserId.hashCode());
        result = 31 * result + Integer.hashCode(this.betPrice);
        result = 31 * result + Integer.hashCode(this.betRule);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasFromUserId()) {
            parts.add("fromUserId=" + getFromUserId());
        }
        if (hasToUserId()) {
            parts.add("toUserId=" + getToUserId());
        }
        if (hasBetPrice()) {
            parts.add("betPrice=" + getBetPrice());
        }
        if (hasBetRule()) {
            parts.add("betRule=" + getBetRule());
        }
        return "SoloRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<SoloRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("fromUserId", 1);
        	__fieldMap.put("toUserId", 2);
        	__fieldMap.put("betPrice", 3);
        	__fieldMap.put("betRule", 4);
        }

        @Override
        public SoloRequest newMessage() {
            return new SoloRequest();
        }

        @Override
        public Class<SoloRequest> typeClass() {
            return SoloRequest.class;
        }

        @Override
        public String messageName() {
            return SoloRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return SoloRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(SoloRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, SoloRequest instance) throws java.io.IOException {
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
                    	instance.fromUserId = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.toUserId = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.betPrice = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.betRule = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, SoloRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.fromUserId, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.toUserId, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.betPrice, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.betRule, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "fromUserId";
        		case 2: return "toUserId";
        		case 3: return "betPrice";
        		case 4: return "betRule";
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

        private String fromUserId;

        private String toUserId;

        private int betPrice;

        private int betRule;

        private int __bitField0;

        private Builder() {
            this.fromUserId = "";
            this.toUserId = "";
            this.betPrice = 0;
            this.betRule = 0;
        }

        public Builder mergeFrom(SoloRequest instance) {
            if (instance.hasFromUserId()) {
                this.setFromUserId(instance.getFromUserId());
            }

            if (instance.hasToUserId()) {
                this.setToUserId(instance.getToUserId());
            }

            if (instance.hasBetPrice()) {
                this.setBetPrice(instance.getBetPrice());
            }

            if (instance.hasBetRule()) {
                this.setBetRule(instance.getBetRule());
            }

            return this;
        }

        public String getFromUserId() {
            return fromUserId;
        }

        public Builder setFromUserId(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SoloRequest#fromUserId to null");
            }

            this.fromUserId = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearFromUserId() {
            this.fromUserId = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasFromUserId() {
            return (__bitField0 & 1) == 1;
        }

        public String getToUserId() {
            return toUserId;
        }

        public Builder setToUserId(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SoloRequest#toUserId to null");
            }

            this.toUserId = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearToUserId() {
            this.toUserId = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasToUserId() {
            return (__bitField0 & 2) == 2;
        }

        public int getBetPrice() {
            return betPrice;
        }

        public Builder setBetPrice(int value) {
            this.betPrice = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearBetPrice() {
            this.betPrice = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasBetPrice() {
            return (__bitField0 & 4) == 4;
        }

        public int getBetRule() {
            return betRule;
        }

        public Builder setBetRule(int value) {
            this.betRule = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearBetRule() {
            this.betRule = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasBetRule() {
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
            if (!java.util.Objects.equals(this.fromUserId, that.fromUserId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.toUserId, that.toUserId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.betPrice, that.betPrice)) {
                return false;
            }
            if (!java.util.Objects.equals(this.betRule, that.betRule)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.fromUserId == null ? 0 : this.fromUserId.hashCode());
            result = 31 * result + (this.toUserId == null ? 0 : this.toUserId.hashCode());
            result = 31 * result + Integer.hashCode(this.betPrice);
            result = 31 * result + Integer.hashCode(this.betRule);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasFromUserId()) {
                parts.add("fromUserId=" + getFromUserId());
            }
            if (hasToUserId()) {
                parts.add("toUserId=" + getToUserId());
            }
            if (hasBetPrice()) {
                parts.add("betPrice=" + getBetPrice());
            }
            if (hasBetRule()) {
                parts.add("betRule=" + getBetRule());
            }
            return "SoloRequest{" + String.join(", ", parts) + "}";
        }

        public SoloRequest build() {
            proto.message.SoloRequest result = new proto.message.SoloRequest();
            result.__bitField0 = __bitField0;
            result.fromUserId = this.fromUserId;
            result.toUserId = this.toUserId;
            result.betPrice = this.betPrice;
            result.betRule = this.betRule;
            return result;
        }

    }



}