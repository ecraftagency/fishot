package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class InventorySimpleItem
        implements io.protostuff.Message<InventorySimpleItem> {

    private static final InventorySimpleItem DEFAULT_INSTANCE = newBuilder().build();

    private int id;

    private int amount;

    private boolean __merge_lock = false;
    private int __bitField0;

    private InventorySimpleItem() {
        this.id = 0;
        this.amount = 0;
    }

    private InventorySimpleItem(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static InventorySimpleItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<InventorySimpleItem> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 1) == 1;
    }

    public InventorySimpleItem withId(int value) {
        return InventorySimpleItem.newBuilder()
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

    public InventorySimpleItem withAmount(int value) {
        return InventorySimpleItem.newBuilder()
            .mergeFrom(this)
            .setAmount(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<InventorySimpleItem> cachedSchema() {
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
        InventorySimpleItem that = (InventorySimpleItem) obj;
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.amount, that.amount)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.id);
        result = 31 * result + Integer.hashCode(this.amount);

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
        return "InventorySimpleItem{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<InventorySimpleItem>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("id", 1);
        	__fieldMap.put("amount", 2);
        }

        @Override
        public InventorySimpleItem newMessage() {
            return new InventorySimpleItem();
        }

        @Override
        public Class<InventorySimpleItem> typeClass() {
            return InventorySimpleItem.class;
        }

        @Override
        public String messageName() {
            return InventorySimpleItem.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return InventorySimpleItem.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(InventorySimpleItem message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, InventorySimpleItem instance) throws java.io.IOException {
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
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, InventorySimpleItem instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.id, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.amount, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "id";
        		case 2: return "amount";
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

        private int __bitField0;

        private Builder() {
            this.id = 0;
            this.amount = 0;
        }

        public Builder mergeFrom(InventorySimpleItem instance) {
            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            if (instance.hasAmount()) {
                this.setAmount(instance.getAmount());
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

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.id);
            result = 31 * result + Integer.hashCode(this.amount);

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
            return "InventorySimpleItem{" + String.join(", ", parts) + "}";
        }

        public InventorySimpleItem build() {
            proto.message.InventorySimpleItem result = new proto.message.InventorySimpleItem();
            result.__bitField0 = __bitField0;
            result.id = this.id;
            result.amount = this.amount;
            return result;
        }

    }



}