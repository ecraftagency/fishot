package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class AccumulateRewardItem
        implements io.protostuff.Message<AccumulateRewardItem> {

    private static final AccumulateRewardItem DEFAULT_INSTANCE = newBuilder().build();

    private int id;

    private int amount;

    private int type;

    private boolean __merge_lock = false;
    private int __bitField0;

    private AccumulateRewardItem() {
        this.id = 0;
        this.amount = 0;
        this.type = 0;
    }

    private AccumulateRewardItem(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static AccumulateRewardItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<AccumulateRewardItem> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 1) == 1;
    }

    public AccumulateRewardItem withId(int value) {
        return AccumulateRewardItem.newBuilder()
            .mergeFrom(this)
            .setId(value)
            .build();
    }

    public int getAmount() {
        return amount;
    }

    public boolean hasAmount() {
        return (__bitField0 & 2) == 2;
    }

    public AccumulateRewardItem withAmount(int value) {
        return AccumulateRewardItem.newBuilder()
            .mergeFrom(this)
            .setAmount(value)
            .build();
    }

    public int getType() {
        return type;
    }

    public boolean hasType() {
        return (__bitField0 & 4) == 4;
    }

    public AccumulateRewardItem withType(int value) {
        return AccumulateRewardItem.newBuilder()
            .mergeFrom(this)
            .setType(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<AccumulateRewardItem> cachedSchema() {
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
        AccumulateRewardItem that = (AccumulateRewardItem) obj;
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.amount, that.amount)) {
            return false;
        }
        if (!java.util.Objects.equals(this.type, that.type)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.id);
        result = 31 * result + Integer.hashCode(this.amount);
        result = 31 * result + Integer.hashCode(this.type);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasId()) {
            parts.add("id=" + getId());
        }
        if (hasAmount()) {
            parts.add("amount=" + getAmount());
        }
        if (hasType()) {
            parts.add("type=" + getType());
        }
        return "AccumulateRewardItem{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<AccumulateRewardItem>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("id", 1);
        	__fieldMap.put("amount", 2);
        	__fieldMap.put("type", 3);
        }

        @Override
        public AccumulateRewardItem newMessage() {
            return new AccumulateRewardItem();
        }

        @Override
        public Class<AccumulateRewardItem> typeClass() {
            return AccumulateRewardItem.class;
        }

        @Override
        public String messageName() {
            return AccumulateRewardItem.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return AccumulateRewardItem.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(AccumulateRewardItem message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, AccumulateRewardItem instance) throws java.io.IOException {
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
                    	instance.id = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.amount = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.type = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, AccumulateRewardItem instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.id, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.amount, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.type, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "id";
        		case 2: return "amount";
        		case 3: return "type";
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

        private int id;

        private int amount;

        private int type;

        private int __bitField0;

        private Builder() {
            this.id = 0;
            this.amount = 0;
            this.type = 0;
        }

        public Builder mergeFrom(AccumulateRewardItem instance) {
            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            if (instance.hasAmount()) {
                this.setAmount(instance.getAmount());
            }

            if (instance.hasType()) {
                this.setType(instance.getType());
            }

            return this;
        }

        public int getId() {
            return id;
        }

        public Builder setId(int value) {
            this.id = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearId() {
            this.id = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasId() {
            return (__bitField0 & 1) == 1;
        }

        public int getAmount() {
            return amount;
        }

        public Builder setAmount(int value) {
            this.amount = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearAmount() {
            this.amount = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasAmount() {
            return (__bitField0 & 2) == 2;
        }

        public int getType() {
            return type;
        }

        public Builder setType(int value) {
            this.type = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearType() {
            this.type = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasType() {
            return (__bitField0 & 4) == 4;
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
            if (!java.util.Objects.equals(this.id, that.id)) {
                return false;
            }
            if (!java.util.Objects.equals(this.amount, that.amount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.type, that.type)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.id);
            result = 31 * result + Integer.hashCode(this.amount);
            result = 31 * result + Integer.hashCode(this.type);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasId()) {
                parts.add("id=" + getId());
            }
            if (hasAmount()) {
                parts.add("amount=" + getAmount());
            }
            if (hasType()) {
                parts.add("type=" + getType());
            }
            return "AccumulateRewardItem{" + String.join(", ", parts) + "}";
        }

        public AccumulateRewardItem build() {
            proto.message.AccumulateRewardItem result = new proto.message.AccumulateRewardItem();
            result.__bitField0 = __bitField0;
            result.id = this.id;
            result.amount = this.amount;
            result.type = this.type;
            return result;
        }

    }



}