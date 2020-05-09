package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class WheelGift
        implements io.protostuff.Message<WheelGift> {

    private static final WheelGift DEFAULT_INSTANCE = newBuilder().build();

    private int id;

    private String name;

    private int quantityType;

    private int quantity;

    private int itemid;

    private String filename;

    private String extraDescription;

    private boolean __merge_lock = false;
    private int __bitField0;

    private WheelGift() {
        this.id = 0;
        this.name = "";
        this.quantityType = 0;
        this.quantity = 0;
        this.itemid = 0;
        this.filename = "";
        this.extraDescription = "";
    }

    private WheelGift(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static WheelGift getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<WheelGift> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 1) == 1;
    }

    public WheelGift withId(int value) {
        return WheelGift.newBuilder()
            .mergeFrom(this)
            .setId(value)
            .build();
    }

    public String getName() {
        return name;
    }

    public boolean hasName() {
        return (__bitField0 & 2) == 2;
    }

    public WheelGift withName(String value) {
        return WheelGift.newBuilder()
            .mergeFrom(this)
            .setName(value)
            .build();
    }

    public int getQuantityType() {
        return quantityType;
    }

    public boolean hasQuantityType() {
        return (__bitField0 & 4) == 4;
    }

    public WheelGift withQuantityType(int value) {
        return WheelGift.newBuilder()
            .mergeFrom(this)
            .setQuantityType(value)
            .build();
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean hasQuantity() {
        return (__bitField0 & 8) == 8;
    }

    public WheelGift withQuantity(int value) {
        return WheelGift.newBuilder()
            .mergeFrom(this)
            .setQuantity(value)
            .build();
    }

    public int getItemid() {
        return itemid;
    }

    public boolean hasItemid() {
        return (__bitField0 & 16) == 16;
    }

    public WheelGift withItemid(int value) {
        return WheelGift.newBuilder()
            .mergeFrom(this)
            .setItemid(value)
            .build();
    }

    public String getFilename() {
        return filename;
    }

    public boolean hasFilename() {
        return (__bitField0 & 32) == 32;
    }

    public WheelGift withFilename(String value) {
        return WheelGift.newBuilder()
            .mergeFrom(this)
            .setFilename(value)
            .build();
    }

    public String getExtraDescription() {
        return extraDescription;
    }

    public boolean hasExtraDescription() {
        return (__bitField0 & 64) == 64;
    }

    public WheelGift withExtraDescription(String value) {
        return WheelGift.newBuilder()
            .mergeFrom(this)
            .setExtraDescription(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<WheelGift> cachedSchema() {
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
        WheelGift that = (WheelGift) obj;
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.name, that.name)) {
            return false;
        }
        if (!java.util.Objects.equals(this.quantityType, that.quantityType)) {
            return false;
        }
        if (!java.util.Objects.equals(this.quantity, that.quantity)) {
            return false;
        }
        if (!java.util.Objects.equals(this.itemid, that.itemid)) {
            return false;
        }
        if (!java.util.Objects.equals(this.filename, that.filename)) {
            return false;
        }
        if (!java.util.Objects.equals(this.extraDescription, that.extraDescription)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.id);
        result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
        result = 31 * result + Integer.hashCode(this.quantityType);
        result = 31 * result + Integer.hashCode(this.quantity);
        result = 31 * result + Integer.hashCode(this.itemid);
        result = 31 * result + (this.filename == null ? 0 : this.filename.hashCode());
        result = 31 * result + (this.extraDescription == null ? 0 : this.extraDescription.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasId()) {
            parts.add("id=" + getId());
        }
        if (hasName()) {
            parts.add("name=" + getName());
        }
        if (hasQuantityType()) {
            parts.add("quantityType=" + getQuantityType());
        }
        if (hasQuantity()) {
            parts.add("quantity=" + getQuantity());
        }
        if (hasItemid()) {
            parts.add("itemid=" + getItemid());
        }
        if (hasFilename()) {
            parts.add("filename=" + getFilename());
        }
        if (hasExtraDescription()) {
            parts.add("extraDescription=" + getExtraDescription());
        }
        return "WheelGift{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<WheelGift>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("id", 1);
        	__fieldMap.put("name", 2);
        	__fieldMap.put("quantityType", 3);
        	__fieldMap.put("quantity", 4);
        	__fieldMap.put("itemid", 5);
        	__fieldMap.put("filename", 6);
        	__fieldMap.put("extraDescription", 7);
        }

        @Override
        public WheelGift newMessage() {
            return new WheelGift();
        }

        @Override
        public Class<WheelGift> typeClass() {
            return WheelGift.class;
        }

        @Override
        public String messageName() {
            return WheelGift.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return WheelGift.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(WheelGift message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, WheelGift instance) throws java.io.IOException {
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
                    	instance.name = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.quantityType = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.quantity = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.itemid = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.filename = input.readString();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.extraDescription = input.readString();
                    	instance.__bitField0 |= 64;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, WheelGift instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.id, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.name, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.quantityType, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.quantity, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.itemid, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeString(6, instance.filename, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeString(7, instance.extraDescription, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "id";
        		case 2: return "name";
        		case 3: return "quantityType";
        		case 4: return "quantity";
        		case 5: return "itemid";
        		case 6: return "filename";
        		case 7: return "extraDescription";
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

        private String name;

        private int quantityType;

        private int quantity;

        private int itemid;

        private String filename;

        private String extraDescription;

        private int __bitField0;

        private Builder() {
            this.id = 0;
            this.name = "";
            this.quantityType = 0;
            this.quantity = 0;
            this.itemid = 0;
            this.filename = "";
            this.extraDescription = "";
        }

        public Builder mergeFrom(WheelGift instance) {
            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            if (instance.hasName()) {
                this.setName(instance.getName());
            }

            if (instance.hasQuantityType()) {
                this.setQuantityType(instance.getQuantityType());
            }

            if (instance.hasQuantity()) {
                this.setQuantity(instance.getQuantity());
            }

            if (instance.hasItemid()) {
                this.setItemid(instance.getItemid());
            }

            if (instance.hasFilename()) {
                this.setFilename(instance.getFilename());
            }

            if (instance.hasExtraDescription()) {
                this.setExtraDescription(instance.getExtraDescription());
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

        public String getName() {
            return name;
        }

        public Builder setName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set WheelGift#name to null");
            }

            this.name = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearName() {
            this.name = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasName() {
            return (__bitField0 & 2) == 2;
        }

        public int getQuantityType() {
            return quantityType;
        }

        public Builder setQuantityType(int value) {
            this.quantityType = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearQuantityType() {
            this.quantityType = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasQuantityType() {
            return (__bitField0 & 4) == 4;
        }

        public int getQuantity() {
            return quantity;
        }

        public Builder setQuantity(int value) {
            this.quantity = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearQuantity() {
            this.quantity = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasQuantity() {
            return (__bitField0 & 8) == 8;
        }

        public int getItemid() {
            return itemid;
        }

        public Builder setItemid(int value) {
            this.itemid = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearItemid() {
            this.itemid = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasItemid() {
            return (__bitField0 & 16) == 16;
        }

        public String getFilename() {
            return filename;
        }

        public Builder setFilename(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set WheelGift#filename to null");
            }

            this.filename = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearFilename() {
            this.filename = "";
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasFilename() {
            return (__bitField0 & 32) == 32;
        }

        public String getExtraDescription() {
            return extraDescription;
        }

        public Builder setExtraDescription(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set WheelGift#extraDescription to null");
            }

            this.extraDescription = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearExtraDescription() {
            this.extraDescription = "";
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasExtraDescription() {
            return (__bitField0 & 64) == 64;
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
            if (!java.util.Objects.equals(this.name, that.name)) {
                return false;
            }
            if (!java.util.Objects.equals(this.quantityType, that.quantityType)) {
                return false;
            }
            if (!java.util.Objects.equals(this.quantity, that.quantity)) {
                return false;
            }
            if (!java.util.Objects.equals(this.itemid, that.itemid)) {
                return false;
            }
            if (!java.util.Objects.equals(this.filename, that.filename)) {
                return false;
            }
            if (!java.util.Objects.equals(this.extraDescription, that.extraDescription)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.id);
            result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
            result = 31 * result + Integer.hashCode(this.quantityType);
            result = 31 * result + Integer.hashCode(this.quantity);
            result = 31 * result + Integer.hashCode(this.itemid);
            result = 31 * result + (this.filename == null ? 0 : this.filename.hashCode());
            result = 31 * result + (this.extraDescription == null ? 0 : this.extraDescription.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasId()) {
                parts.add("id=" + getId());
            }
            if (hasName()) {
                parts.add("name=" + getName());
            }
            if (hasQuantityType()) {
                parts.add("quantityType=" + getQuantityType());
            }
            if (hasQuantity()) {
                parts.add("quantity=" + getQuantity());
            }
            if (hasItemid()) {
                parts.add("itemid=" + getItemid());
            }
            if (hasFilename()) {
                parts.add("filename=" + getFilename());
            }
            if (hasExtraDescription()) {
                parts.add("extraDescription=" + getExtraDescription());
            }
            return "WheelGift{" + String.join(", ", parts) + "}";
        }

        public WheelGift build() {
            proto.message.WheelGift result = new proto.message.WheelGift();
            result.__bitField0 = __bitField0;
            result.id = this.id;
            result.name = this.name;
            result.quantityType = this.quantityType;
            result.quantity = this.quantity;
            result.itemid = this.itemid;
            result.filename = this.filename;
            result.extraDescription = this.extraDescription;
            return result;
        }

    }



}