package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class ArchiveItem
        implements io.protostuff.Message<ArchiveItem> {

    private static final ArchiveItem DEFAULT_INSTANCE = newBuilder().build();

    private int id;

    private int type;

    private int amount;

    private boolean __merge_lock = false;
    private int __bitField0;

    private ArchiveItem() {
        this.id = 0;
        this.type = 0;
        this.amount = 0;
    }

    private ArchiveItem(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ArchiveItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<ArchiveItem> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 1) == 1;
    }

    public ArchiveItem withId(int value) {
        return ArchiveItem.newBuilder()
            .mergeFrom(this)
            .setId(value)
            .build();
    }

    public int getType() {
        return type;
    }

    public boolean hasType() {
        return (__bitField0 & 2) == 2;
    }

    public ArchiveItem withType(int value) {
        return ArchiveItem.newBuilder()
            .mergeFrom(this)
            .setType(value)
            .build();
    }

    public int getAmount() {
        return amount;
    }

    public boolean hasAmount() {
        return (__bitField0 & 4) == 4;
    }

    public ArchiveItem withAmount(int value) {
        return ArchiveItem.newBuilder()
            .mergeFrom(this)
            .setAmount(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<ArchiveItem> cachedSchema() {
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
        ArchiveItem that = (ArchiveItem) obj;
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.type, that.type)) {
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
        result = 31 * result + Integer.hashCode(this.type);
        result = 31 * result + Integer.hashCode(this.amount);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasId()) {
            parts.add("id=" + getId());
        }
        if (hasType()) {
            parts.add("type=" + getType());
        }
        if (hasAmount()) {
            parts.add("amount=" + getAmount());
        }
        return "ArchiveItem{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<ArchiveItem>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("id", 1);
        	__fieldMap.put("type", 2);
        	__fieldMap.put("amount", 3);
        }

        @Override
        public ArchiveItem newMessage() {
            return new ArchiveItem();
        }

        @Override
        public Class<ArchiveItem> typeClass() {
            return ArchiveItem.class;
        }

        @Override
        public String messageName() {
            return ArchiveItem.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return ArchiveItem.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(ArchiveItem message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, ArchiveItem instance) throws java.io.IOException {
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
                    	instance.type = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.amount = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, ArchiveItem instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.id, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.type, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.amount, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "id";
        		case 2: return "type";
        		case 3: return "amount";
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

        private int type;

        private int amount;

        private int __bitField0;

        private Builder() {
            this.id = 0;
            this.type = 0;
            this.amount = 0;
        }

        public Builder mergeFrom(ArchiveItem instance) {
            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            if (instance.hasType()) {
                this.setType(instance.getType());
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

        public int getType() {
            return type;
        }

        public Builder setType(int value) {
            this.type = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearType() {
            this.type = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasType() {
            return (__bitField0 & 2) == 2;
        }

        public int getAmount() {
            return amount;
        }

        public Builder setAmount(int value) {
            this.amount = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearAmount() {
            this.amount = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasAmount() {
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
            if (!java.util.Objects.equals(this.type, that.type)) {
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
            result = 31 * result + Integer.hashCode(this.type);
            result = 31 * result + Integer.hashCode(this.amount);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasId()) {
                parts.add("id=" + getId());
            }
            if (hasType()) {
                parts.add("type=" + getType());
            }
            if (hasAmount()) {
                parts.add("amount=" + getAmount());
            }
            return "ArchiveItem{" + String.join(", ", parts) + "}";
        }

        public ArchiveItem build() {
            proto.message.ArchiveItem result = new proto.message.ArchiveItem();
            result.__bitField0 = __bitField0;
            result.id = this.id;
            result.type = this.type;
            result.amount = this.amount;
            return result;
        }

    }



}