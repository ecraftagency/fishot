package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class BetCase
        implements io.protostuff.Message<BetCase> {

    private static final BetCase DEFAULT_INSTANCE = newBuilder().build();

    private int cases;

    private int betMoney;

    private boolean __merge_lock = false;
    private int __bitField0;

    private BetCase() {
        this.cases = 0;
        this.betMoney = 0;
    }

    private BetCase(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static BetCase getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<BetCase> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getCases() {
        return cases;
    }

    public boolean hasCases() {
        return (__bitField0 & 1) == 1;
    }

    public BetCase withCases(int value) {
        return BetCase.newBuilder()
            .mergeFrom(this)
            .setCases(value)
            .build();
    }

    public int getBetMoney() {
        return betMoney;
    }

    public boolean hasBetMoney() {
        return (__bitField0 & 2) == 2;
    }

    public BetCase withBetMoney(int value) {
        return BetCase.newBuilder()
            .mergeFrom(this)
            .setBetMoney(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<BetCase> cachedSchema() {
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
        BetCase that = (BetCase) obj;
        if (!java.util.Objects.equals(this.cases, that.cases)) {
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
        result = 31 * result + Integer.hashCode(this.cases);
        result = 31 * result + Integer.hashCode(this.betMoney);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasCases()) {
            parts.add("cases=" + getCases());
        }
        if (hasBetMoney()) {
            parts.add("betMoney=" + getBetMoney());
        }
        return "BetCase{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<BetCase>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("cases", 1);
        	__fieldMap.put("betMoney", 2);
        }

        @Override
        public BetCase newMessage() {
            return new BetCase();
        }

        @Override
        public Class<BetCase> typeClass() {
            return BetCase.class;
        }

        @Override
        public String messageName() {
            return BetCase.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return BetCase.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(BetCase message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, BetCase instance) throws java.io.IOException {
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
                    	instance.cases = input.readUInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.betMoney = input.readUInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, BetCase instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeUInt32(1, instance.cases, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeUInt32(2, instance.betMoney, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "cases";
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

        private int cases;

        private int betMoney;

        private int __bitField0;

        private Builder() {
            this.cases = 0;
            this.betMoney = 0;
        }

        public Builder mergeFrom(BetCase instance) {
            if (instance.hasCases()) {
                this.setCases(instance.getCases());
            }

            if (instance.hasBetMoney()) {
                this.setBetMoney(instance.getBetMoney());
            }

            return this;
        }

        public int getCases() {
            return cases;
        }

        public Builder setCases(int value) {
            this.cases = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearCases() {
            this.cases = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasCases() {
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
            if (!java.util.Objects.equals(this.cases, that.cases)) {
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
            result = 31 * result + Integer.hashCode(this.cases);
            result = 31 * result + Integer.hashCode(this.betMoney);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasCases()) {
                parts.add("cases=" + getCases());
            }
            if (hasBetMoney()) {
                parts.add("betMoney=" + getBetMoney());
            }
            return "BetCase{" + String.join(", ", parts) + "}";
        }

        public BetCase build() {
            proto.message.BetCase result = new proto.message.BetCase();
            result.__bitField0 = __bitField0;
            result.cases = this.cases;
            result.betMoney = this.betMoney;
            return result;
        }

    }



}