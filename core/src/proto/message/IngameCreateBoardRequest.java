package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class IngameCreateBoardRequest
        implements io.protostuff.Message<IngameCreateBoardRequest> {

    private static final IngameCreateBoardRequest DEFAULT_INSTANCE = newBuilder().build();

    private int type;

    private int betMoney;

    private boolean __merge_lock = false;
    private int __bitField0;

    private IngameCreateBoardRequest() {
        this.type = proto.message.BetmodeType.TYPE_NORMAL.getNumber();
        this.betMoney = 0;
    }

    private IngameCreateBoardRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static IngameCreateBoardRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<IngameCreateBoardRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public proto.message.BetmodeType getType() {
        return proto.message.BetmodeType.valueOf(type);
    }

    public int getTypeValue() {
        return type;
    }

    public boolean hasType() {
        return (__bitField0 & 1) == 1;
    }

    public IngameCreateBoardRequest withType(proto.message.BetmodeType value) {
        return IngameCreateBoardRequest.newBuilder()
            .mergeFrom(this)
            .setType(value)
            .build();
    }

    public int getBetMoney() {
        return betMoney;
    }

    public boolean hasBetMoney() {
        return (__bitField0 & 2) == 2;
    }

    public IngameCreateBoardRequest withBetMoney(int value) {
        return IngameCreateBoardRequest.newBuilder()
            .mergeFrom(this)
            .setBetMoney(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<IngameCreateBoardRequest> cachedSchema() {
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
        IngameCreateBoardRequest that = (IngameCreateBoardRequest) obj;
        if (!java.util.Objects.equals(this.type, that.type)) {
            return false;
        }
        if (!java.util.Objects.equals(this.betMoney, that.betMoney)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.type);
        result = 31 * result + Integer.hashCode(this.betMoney);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasType()) {
            parts.add("type=" + getType() + '(' + getTypeValue() + ')');
        }
        if (hasBetMoney()) {
            parts.add("betMoney=" + getBetMoney());
        }
        return "IngameCreateBoardRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<IngameCreateBoardRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("type", 1);
        	__fieldMap.put("betMoney", 2);
        }

        @Override
        public IngameCreateBoardRequest newMessage() {
            return new IngameCreateBoardRequest();
        }

        @Override
        public Class<IngameCreateBoardRequest> typeClass() {
            return IngameCreateBoardRequest.class;
        }

        @Override
        public String messageName() {
            return IngameCreateBoardRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return IngameCreateBoardRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(IngameCreateBoardRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, IngameCreateBoardRequest instance) throws java.io.IOException {
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
                    	instance.type = input.readEnum();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.betMoney = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, IngameCreateBoardRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.type, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.betMoney, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "type";
        		case 2: return "betMoney";
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

        private int type;

        private int betMoney;

        private int __bitField0;

        private Builder() {
            this.type = proto.message.BetmodeType.TYPE_NORMAL.getNumber();
            this.betMoney = 0;
        }

        public Builder mergeFrom(IngameCreateBoardRequest instance) {
            if (instance.hasType()) {
                this.setType(instance.getType());
            }

            if (instance.hasBetMoney()) {
                this.setBetMoney(instance.getBetMoney());
            }

            return this;
        }

        public proto.message.BetmodeType getType() {
            return proto.message.BetmodeType.valueOf(type);
        }

        public int getTypeValue() {
            return type;
        }

        public Builder setType(proto.message.BetmodeType value) {
            if (value == null) {
                throw new NullPointerException("Cannot set IngameCreateBoardRequest#type to null");
            }

            if (value == proto.message.BetmodeType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set IngameCreateBoardRequest#type to UNRECOGNIZED");
            }

            this.type = value.getNumber();
            __bitField0 |= 1;
            return this;
        }

        public Builder setTypeValue(int value) {
            this.type = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearType() {
            this.type = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasType() {
            return (__bitField0 & 1) == 1;
        }

        public int getBetMoney() {
            return betMoney;
        }

        public Builder setBetMoney(int value) {
            this.betMoney = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearBetMoney() {
            this.betMoney = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasBetMoney() {
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
            if (!java.util.Objects.equals(this.type, that.type)) {
                return false;
            }
            if (!java.util.Objects.equals(this.betMoney, that.betMoney)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.type);
            result = 31 * result + Integer.hashCode(this.betMoney);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasType()) {
                parts.add("type=" + getType() + '(' + getTypeValue() + ')');
            }
            if (hasBetMoney()) {
                parts.add("betMoney=" + getBetMoney());
            }
            return "IngameCreateBoardRequest{" + String.join(", ", parts) + "}";
        }

        public IngameCreateBoardRequest build() {
            proto.message.IngameCreateBoardRequest result = new proto.message.IngameCreateBoardRequest();
            result.__bitField0 = __bitField0;
            result.type = this.type;
            result.betMoney = this.betMoney;
            return result;
        }

    }



}