package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class DonateMoneyResponse
        implements io.protostuff.Message<DonateMoneyResponse> {

    private static final DonateMoneyResponse DEFAULT_INSTANCE = newBuilder().build();

    private int money;

    private boolean __merge_lock = false;
    private int __bitField0;

    private DonateMoneyResponse() {
        this.money = 0;
    }

    private DonateMoneyResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static DonateMoneyResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<DonateMoneyResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getMoney() {
        return money;
    }

    public boolean hasMoney() {
        return (__bitField0 & 1) == 1;
    }

    public DonateMoneyResponse withMoney(int value) {
        return DonateMoneyResponse.newBuilder()
            .mergeFrom(this)
            .setMoney(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<DonateMoneyResponse> cachedSchema() {
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
        DonateMoneyResponse that = (DonateMoneyResponse) obj;
        if (!java.util.Objects.equals(this.money, that.money)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.money);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasMoney()) {
            parts.add("money=" + getMoney());
        }
        return "DonateMoneyResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<DonateMoneyResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("money", 1);
        }

        @Override
        public DonateMoneyResponse newMessage() {
            return new DonateMoneyResponse();
        }

        @Override
        public Class<DonateMoneyResponse> typeClass() {
            return DonateMoneyResponse.class;
        }

        @Override
        public String messageName() {
            return DonateMoneyResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return DonateMoneyResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(DonateMoneyResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, DonateMoneyResponse instance) throws java.io.IOException {
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
                    	instance.money = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, DonateMoneyResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.money, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "money";
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

        private int money;

        private int __bitField0;

        private Builder() {
            this.money = 0;
        }

        public Builder mergeFrom(DonateMoneyResponse instance) {
            if (instance.hasMoney()) {
                this.setMoney(instance.getMoney());
            }

            return this;
        }

        public int getMoney() {
            return money;
        }

        public Builder setMoney(int value) {
            this.money = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearMoney() {
            this.money = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasMoney() {
            return (__bitField0 & 1) == 1;
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
            if (!java.util.Objects.equals(this.money, that.money)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.money);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasMoney()) {
                parts.add("money=" + getMoney());
            }
            return "DonateMoneyResponse{" + String.join(", ", parts) + "}";
        }

        public DonateMoneyResponse build() {
            proto.message.DonateMoneyResponse result = new proto.message.DonateMoneyResponse();
            result.__bitField0 = __bitField0;
            result.money = this.money;
            return result;
        }

    }



}