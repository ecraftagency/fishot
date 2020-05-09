package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_happy_play.proto")
public final class HPBoosterPackItem
        implements io.protostuff.Message<HPBoosterPackItem> {

    private static final HPBoosterPackItem DEFAULT_INSTANCE = newBuilder().build();

    private int id;

    private int itemID;

    private int itemType;

    private int amount;

    private String fileName;

    private String description;

    private int level;

    private int daycount;

    private int iapcount;

    private int happyplaychannel;

    private boolean __merge_lock = false;
    private int __bitField0;

    private HPBoosterPackItem() {
        this.id = 0;
        this.itemID = 0;
        this.itemType = 0;
        this.amount = 0;
        this.fileName = "";
        this.description = "";
        this.level = 0;
        this.daycount = 0;
        this.iapcount = 0;
        this.happyplaychannel = 0;
    }

    private HPBoosterPackItem(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static HPBoosterPackItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<HPBoosterPackItem> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 1) == 1;
    }

    public HPBoosterPackItem withId(int value) {
        return HPBoosterPackItem.newBuilder()
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

    public HPBoosterPackItem withItemID(int value) {
        return HPBoosterPackItem.newBuilder()
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

    public HPBoosterPackItem withItemType(int value) {
        return HPBoosterPackItem.newBuilder()
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

    public HPBoosterPackItem withAmount(int value) {
        return HPBoosterPackItem.newBuilder()
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

    public HPBoosterPackItem withFileName(String value) {
        return HPBoosterPackItem.newBuilder()
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

    public HPBoosterPackItem withDescription(String value) {
        return HPBoosterPackItem.newBuilder()
            .mergeFrom(this)
            .setDescription(value)
            .build();
    }

    public int getLevel() {
        return level;
    }

    public boolean hasLevel() {
        return (__bitField0 & 64) == 64;
    }

    public HPBoosterPackItem withLevel(int value) {
        return HPBoosterPackItem.newBuilder()
            .mergeFrom(this)
            .setLevel(value)
            .build();
    }

    public int getDaycount() {
        return daycount;
    }

    public boolean hasDaycount() {
        return (__bitField0 & 128) == 128;
    }

    public HPBoosterPackItem withDaycount(int value) {
        return HPBoosterPackItem.newBuilder()
            .mergeFrom(this)
            .setDaycount(value)
            .build();
    }

    public int getIapcount() {
        return iapcount;
    }

    public boolean hasIapcount() {
        return (__bitField0 & 256) == 256;
    }

    public HPBoosterPackItem withIapcount(int value) {
        return HPBoosterPackItem.newBuilder()
            .mergeFrom(this)
            .setIapcount(value)
            .build();
    }

    public int getHappyplaychannel() {
        return happyplaychannel;
    }

    public boolean hasHappyplaychannel() {
        return (__bitField0 & 512) == 512;
    }

    public HPBoosterPackItem withHappyplaychannel(int value) {
        return HPBoosterPackItem.newBuilder()
            .mergeFrom(this)
            .setHappyplaychannel(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<HPBoosterPackItem> cachedSchema() {
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
        HPBoosterPackItem that = (HPBoosterPackItem) obj;
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
        if (!java.util.Objects.equals(this.level, that.level)) {
            return false;
        }
        if (!java.util.Objects.equals(this.daycount, that.daycount)) {
            return false;
        }
        if (!java.util.Objects.equals(this.iapcount, that.iapcount)) {
            return false;
        }
        if (!java.util.Objects.equals(this.happyplaychannel, that.happyplaychannel)) {
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
        result = 31 * result + Integer.hashCode(this.level);
        result = 31 * result + Integer.hashCode(this.daycount);
        result = 31 * result + Integer.hashCode(this.iapcount);
        result = 31 * result + Integer.hashCode(this.happyplaychannel);

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
        if (hasLevel()) {
            parts.add("level=" + getLevel());
        }
        if (hasDaycount()) {
            parts.add("daycount=" + getDaycount());
        }
        if (hasIapcount()) {
            parts.add("iapcount=" + getIapcount());
        }
        if (hasHappyplaychannel()) {
            parts.add("happyplaychannel=" + getHappyplaychannel());
        }
        return "HPBoosterPackItem{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<HPBoosterPackItem>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("id", 1);
        	__fieldMap.put("itemID", 2);
        	__fieldMap.put("itemType", 3);
        	__fieldMap.put("amount", 4);
        	__fieldMap.put("fileName", 5);
        	__fieldMap.put("description", 6);
        	__fieldMap.put("level", 7);
        	__fieldMap.put("daycount", 8);
        	__fieldMap.put("iapcount", 9);
        	__fieldMap.put("happyplaychannel", 10);
        }

        @Override
        public HPBoosterPackItem newMessage() {
            return new HPBoosterPackItem();
        }

        @Override
        public Class<HPBoosterPackItem> typeClass() {
            return HPBoosterPackItem.class;
        }

        @Override
        public String messageName() {
            return HPBoosterPackItem.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return HPBoosterPackItem.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(HPBoosterPackItem message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, HPBoosterPackItem instance) throws java.io.IOException {
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
                    case 7:
                    	instance.level = input.readInt32();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.daycount = input.readInt32();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 9:
                    	instance.iapcount = input.readInt32();
                    	instance.__bitField0 |= 256;
                    	break;
                    case 10:
                    	instance.happyplaychannel = input.readInt32();
                    	instance.__bitField0 |= 512;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, HPBoosterPackItem instance) throws java.io.IOException {
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

            if((instance.__bitField0 & 64) == 64) {
                output.writeInt32(7, instance.level, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeInt32(8, instance.daycount, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeInt32(9, instance.iapcount, false);
            }

            if((instance.__bitField0 & 512) == 512) {
                output.writeInt32(10, instance.happyplaychannel, false);
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
        		case 7: return "level";
        		case 8: return "daycount";
        		case 9: return "iapcount";
        		case 10: return "happyplaychannel";
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

        private int level;

        private int daycount;

        private int iapcount;

        private int happyplaychannel;

        private int __bitField0;

        private Builder() {
            this.id = 0;
            this.itemID = 0;
            this.itemType = 0;
            this.amount = 0;
            this.fileName = "";
            this.description = "";
            this.level = 0;
            this.daycount = 0;
            this.iapcount = 0;
            this.happyplaychannel = 0;
        }

        public Builder mergeFrom(HPBoosterPackItem instance) {
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

            if (instance.hasLevel()) {
                this.setLevel(instance.getLevel());
            }

            if (instance.hasDaycount()) {
                this.setDaycount(instance.getDaycount());
            }

            if (instance.hasIapcount()) {
                this.setIapcount(instance.getIapcount());
            }

            if (instance.hasHappyplaychannel()) {
                this.setHappyplaychannel(instance.getHappyplaychannel());
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
                throw new NullPointerException("Cannot set HPBoosterPackItem#fileName to null");
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
                throw new NullPointerException("Cannot set HPBoosterPackItem#description to null");
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

        public int getLevel() {
            return level;
        }

        public Builder setLevel(int value) {
            this.level = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearLevel() {
            this.level = 0;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasLevel() {
            return (__bitField0 & 64) == 64;
        }

        public int getDaycount() {
            return daycount;
        }

        public Builder setDaycount(int value) {
            this.daycount = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearDaycount() {
            this.daycount = 0;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasDaycount() {
            return (__bitField0 & 128) == 128;
        }

        public int getIapcount() {
            return iapcount;
        }

        public Builder setIapcount(int value) {
            this.iapcount = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearIapcount() {
            this.iapcount = 0;
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasIapcount() {
            return (__bitField0 & 256) == 256;
        }

        public int getHappyplaychannel() {
            return happyplaychannel;
        }

        public Builder setHappyplaychannel(int value) {
            this.happyplaychannel = value;
            __bitField0 |= 512;
            return this;
        }

        public Builder clearHappyplaychannel() {
            this.happyplaychannel = 0;
            __bitField0 &= ~512;
            return this;
        }

        public boolean hasHappyplaychannel() {
            return (__bitField0 & 512) == 512;
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
            if (!java.util.Objects.equals(this.level, that.level)) {
                return false;
            }
            if (!java.util.Objects.equals(this.daycount, that.daycount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.iapcount, that.iapcount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.happyplaychannel, that.happyplaychannel)) {
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
            result = 31 * result + Integer.hashCode(this.level);
            result = 31 * result + Integer.hashCode(this.daycount);
            result = 31 * result + Integer.hashCode(this.iapcount);
            result = 31 * result + Integer.hashCode(this.happyplaychannel);

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
            if (hasLevel()) {
                parts.add("level=" + getLevel());
            }
            if (hasDaycount()) {
                parts.add("daycount=" + getDaycount());
            }
            if (hasIapcount()) {
                parts.add("iapcount=" + getIapcount());
            }
            if (hasHappyplaychannel()) {
                parts.add("happyplaychannel=" + getHappyplaychannel());
            }
            return "HPBoosterPackItem{" + String.join(", ", parts) + "}";
        }

        public HPBoosterPackItem build() {
            proto.message.HPBoosterPackItem result = new proto.message.HPBoosterPackItem();
            result.__bitField0 = __bitField0;
            result.id = this.id;
            result.itemID = this.itemID;
            result.itemType = this.itemType;
            result.amount = this.amount;
            result.fileName = this.fileName;
            result.description = this.description;
            result.level = this.level;
            result.daycount = this.daycount;
            result.iapcount = this.iapcount;
            result.happyplaychannel = this.happyplaychannel;
            return result;
        }

    }



}