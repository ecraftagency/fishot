package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class DailyBonusItem
        implements io.protostuff.Message<DailyBonusItem> {

    private static final DailyBonusItem DEFAULT_INSTANCE = newBuilder().build();

    private int id;

    private int itemID;

    private int itemType;

    private int amount;

    private String fileName;

    private String description;

    private boolean __merge_lock = false;
    private int __bitField0;

    private DailyBonusItem() {
        this.id = 0;
        this.itemID = 0;
        this.itemType = 0;
        this.amount = 0;
        this.fileName = "";
        this.description = "";
    }

    private DailyBonusItem(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static DailyBonusItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<DailyBonusItem> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 1) == 1;
    }

    public DailyBonusItem withId(int value) {
        return DailyBonusItem.newBuilder()
            .mergeFrom(this)
            .setId(value)
            .build();
    }

    public int getItemID() {
        return itemID;
    }

    public boolean hasItemID() {
        return (__bitField0 & 2) == 2;
    }

    public DailyBonusItem withItemID(int value) {
        return DailyBonusItem.newBuilder()
            .mergeFrom(this)
            .setItemID(value)
            .build();
    }

    public int getItemType() {
        return itemType;
    }

    public boolean hasItemType() {
        return (__bitField0 & 4) == 4;
    }

    public DailyBonusItem withItemType(int value) {
        return DailyBonusItem.newBuilder()
            .mergeFrom(this)
            .setItemType(value)
            .build();
    }

    public int getAmount() {
        return amount;
    }

    public boolean hasAmount() {
        return (__bitField0 & 8) == 8;
    }

    public DailyBonusItem withAmount(int value) {
        return DailyBonusItem.newBuilder()
            .mergeFrom(this)
            .setAmount(value)
            .build();
    }

    public String getFileName() {
        return fileName;
    }

    public boolean hasFileName() {
        return (__bitField0 & 16) == 16;
    }

    public DailyBonusItem withFileName(String value) {
        return DailyBonusItem.newBuilder()
            .mergeFrom(this)
            .setFileName(value)
            .build();
    }

    public String getDescription() {
        return description;
    }

    public boolean hasDescription() {
        return (__bitField0 & 32) == 32;
    }

    public DailyBonusItem withDescription(String value) {
        return DailyBonusItem.newBuilder()
            .mergeFrom(this)
            .setDescription(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<DailyBonusItem> cachedSchema() {
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
        DailyBonusItem that = (DailyBonusItem) obj;
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.itemID, that.itemID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.itemType, that.itemType)) {
            return false;
        }
        if (!java.util.Objects.equals(this.amount, that.amount)) {
            return false;
        }
        if (!java.util.Objects.equals(this.fileName, that.fileName)) {
            return false;
        }
        if (!java.util.Objects.equals(this.description, that.description)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.id);
        result = 31 * result + Integer.hashCode(this.itemID);
        result = 31 * result + Integer.hashCode(this.itemType);
        result = 31 * result + Integer.hashCode(this.amount);
        result = 31 * result + (this.fileName == null ? 0 : this.fileName.hashCode());
        result = 31 * result + (this.description == null ? 0 : this.description.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasId()) {
            parts.add("id=" + getId());
        }
        if (hasItemID()) {
            parts.add("itemID=" + getItemID());
        }
        if (hasItemType()) {
            parts.add("itemType=" + getItemType());
        }
        if (hasAmount()) {
            parts.add("amount=" + getAmount());
        }
        if (hasFileName()) {
            parts.add("fileName=" + getFileName());
        }
        if (hasDescription()) {
            parts.add("description=" + getDescription());
        }
        return "DailyBonusItem{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<DailyBonusItem>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("id", 1);
        	__fieldMap.put("itemID", 2);
        	__fieldMap.put("itemType", 3);
        	__fieldMap.put("amount", 4);
        	__fieldMap.put("fileName", 5);
        	__fieldMap.put("description", 6);
        }

        @Override
        public DailyBonusItem newMessage() {
            return new DailyBonusItem();
        }

        @Override
        public Class<DailyBonusItem> typeClass() {
            return DailyBonusItem.class;
        }

        @Override
        public String messageName() {
            return DailyBonusItem.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return DailyBonusItem.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(DailyBonusItem message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, DailyBonusItem instance) throws java.io.IOException {
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
                    	instance.itemID = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.itemType = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.amount = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.fileName = input.readString();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.description = input.readString();
                    	instance.__bitField0 |= 32;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, DailyBonusItem instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.id, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.itemID, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.itemType, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.amount, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeString(5, instance.fileName, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeString(6, instance.description, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "id";
        		case 2: return "itemID";
        		case 3: return "itemType";
        		case 4: return "amount";
        		case 5: return "fileName";
        		case 6: return "description";
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

        private int itemID;

        private int itemType;

        private int amount;

        private String fileName;

        private String description;

        private int __bitField0;

        private Builder() {
            this.id = 0;
            this.itemID = 0;
            this.itemType = 0;
            this.amount = 0;
            this.fileName = "";
            this.description = "";
        }

        public Builder mergeFrom(DailyBonusItem instance) {
            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            if (instance.hasItemID()) {
                this.setItemID(instance.getItemID());
            }

            if (instance.hasItemType()) {
                this.setItemType(instance.getItemType());
            }

            if (instance.hasAmount()) {
                this.setAmount(instance.getAmount());
            }

            if (instance.hasFileName()) {
                this.setFileName(instance.getFileName());
            }

            if (instance.hasDescription()) {
                this.setDescription(instance.getDescription());
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

        public int getItemID() {
            return itemID;
        }

        public Builder setItemID(int value) {
            this.itemID = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearItemID() {
            this.itemID = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasItemID() {
            return (__bitField0 & 2) == 2;
        }

        public int getItemType() {
            return itemType;
        }

        public Builder setItemType(int value) {
            this.itemType = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearItemType() {
            this.itemType = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasItemType() {
            return (__bitField0 & 4) == 4;
        }

        public int getAmount() {
            return amount;
        }

        public Builder setAmount(int value) {
            this.amount = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearAmount() {
            this.amount = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasAmount() {
            return (__bitField0 & 8) == 8;
        }

        public String getFileName() {
            return fileName;
        }

        public Builder setFileName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set DailyBonusItem#fileName to null");
            }

            this.fileName = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearFileName() {
            this.fileName = "";
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasFileName() {
            return (__bitField0 & 16) == 16;
        }

        public String getDescription() {
            return description;
        }

        public Builder setDescription(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set DailyBonusItem#description to null");
            }

            this.description = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearDescription() {
            this.description = "";
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasDescription() {
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
            if (!java.util.Objects.equals(this.id, that.id)) {
                return false;
            }
            if (!java.util.Objects.equals(this.itemID, that.itemID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.itemType, that.itemType)) {
                return false;
            }
            if (!java.util.Objects.equals(this.amount, that.amount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.fileName, that.fileName)) {
                return false;
            }
            if (!java.util.Objects.equals(this.description, that.description)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.id);
            result = 31 * result + Integer.hashCode(this.itemID);
            result = 31 * result + Integer.hashCode(this.itemType);
            result = 31 * result + Integer.hashCode(this.amount);
            result = 31 * result + (this.fileName == null ? 0 : this.fileName.hashCode());
            result = 31 * result + (this.description == null ? 0 : this.description.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasId()) {
                parts.add("id=" + getId());
            }
            if (hasItemID()) {
                parts.add("itemID=" + getItemID());
            }
            if (hasItemType()) {
                parts.add("itemType=" + getItemType());
            }
            if (hasAmount()) {
                parts.add("amount=" + getAmount());
            }
            if (hasFileName()) {
                parts.add("fileName=" + getFileName());
            }
            if (hasDescription()) {
                parts.add("description=" + getDescription());
            }
            return "DailyBonusItem{" + String.join(", ", parts) + "}";
        }

        public DailyBonusItem build() {
            proto.message.DailyBonusItem result = new proto.message.DailyBonusItem();
            result.__bitField0 = __bitField0;
            result.id = this.id;
            result.itemID = this.itemID;
            result.itemType = this.itemType;
            result.amount = this.amount;
            result.fileName = this.fileName;
            result.description = this.description;
            return result;
        }

    }



}