package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_happy_play.proto")
public final class HPIAPInfo
        implements io.protostuff.Message<HPIAPInfo> {

    private static final HPIAPInfo DEFAULT_INSTANCE = newBuilder().build();

    private String itemId;

    private String description;

    private int goldAmount;

    private int goldBonus;

    private int vndGross;

    private boolean __merge_lock = false;
    private int __bitField0;

    private HPIAPInfo() {
        this.itemId = "";
        this.description = "";
        this.goldAmount = 0;
        this.goldBonus = 0;
        this.vndGross = 0;
    }

    private HPIAPInfo(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static HPIAPInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<HPIAPInfo> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getItemId() {
        return itemId;
    }

    public boolean hasItemId() {
        return (__bitField0 & 1) == 1;
    }

    public HPIAPInfo withItemId(String value) {
        return HPIAPInfo.newBuilder()
            .mergeFrom(this)
            .setItemId(value)
            .build();
    }

    public String getDescription() {
        return description;
    }

    public boolean hasDescription() {
        return (__bitField0 & 2) == 2;
    }

    public HPIAPInfo withDescription(String value) {
        return HPIAPInfo.newBuilder()
            .mergeFrom(this)
            .setDescription(value)
            .build();
    }

    public int getGoldAmount() {
        return goldAmount;
    }

    public boolean hasGoldAmount() {
        return (__bitField0 & 4) == 4;
    }

    public HPIAPInfo withGoldAmount(int value) {
        return HPIAPInfo.newBuilder()
            .mergeFrom(this)
            .setGoldAmount(value)
            .build();
    }

    public int getGoldBonus() {
        return goldBonus;
    }

    public boolean hasGoldBonus() {
        return (__bitField0 & 8) == 8;
    }

    public HPIAPInfo withGoldBonus(int value) {
        return HPIAPInfo.newBuilder()
            .mergeFrom(this)
            .setGoldBonus(value)
            .build();
    }

    public int getVndGross() {
        return vndGross;
    }

    public boolean hasVndGross() {
        return (__bitField0 & 16) == 16;
    }

    public HPIAPInfo withVndGross(int value) {
        return HPIAPInfo.newBuilder()
            .mergeFrom(this)
            .setVndGross(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<HPIAPInfo> cachedSchema() {
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
        HPIAPInfo that = (HPIAPInfo) obj;
        if (!java.util.Objects.equals(this.itemId, that.itemId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.description, that.description)) {
            return false;
        }
        if (!java.util.Objects.equals(this.goldAmount, that.goldAmount)) {
            return false;
        }
        if (!java.util.Objects.equals(this.goldBonus, that.goldBonus)) {
            return false;
        }
        if (!java.util.Objects.equals(this.vndGross, that.vndGross)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.itemId == null ? 0 : this.itemId.hashCode());
        result = 31 * result + (this.description == null ? 0 : this.description.hashCode());
        result = 31 * result + Integer.hashCode(this.goldAmount);
        result = 31 * result + Integer.hashCode(this.goldBonus);
        result = 31 * result + Integer.hashCode(this.vndGross);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasItemId()) {
            parts.add("itemId=" + getItemId());
        }
        if (hasDescription()) {
            parts.add("description=" + getDescription());
        }
        if (hasGoldAmount()) {
            parts.add("goldAmount=" + getGoldAmount());
        }
        if (hasGoldBonus()) {
            parts.add("goldBonus=" + getGoldBonus());
        }
        if (hasVndGross()) {
            parts.add("vndGross=" + getVndGross());
        }
        return "HPIAPInfo{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<HPIAPInfo>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("itemId", 1);
        	__fieldMap.put("description", 2);
        	__fieldMap.put("goldAmount", 3);
        	__fieldMap.put("goldBonus", 4);
        	__fieldMap.put("vndGross", 5);
        }

        @Override
        public HPIAPInfo newMessage() {
            return new HPIAPInfo();
        }

        @Override
        public Class<HPIAPInfo> typeClass() {
            return HPIAPInfo.class;
        }

        @Override
        public String messageName() {
            return HPIAPInfo.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return HPIAPInfo.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(HPIAPInfo message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, HPIAPInfo instance) throws java.io.IOException {
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
                    	instance.itemId = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.description = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.goldAmount = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.goldBonus = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.vndGross = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, HPIAPInfo instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.itemId, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.description, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.goldAmount, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.goldBonus, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.vndGross, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "itemId";
        		case 2: return "description";
        		case 3: return "goldAmount";
        		case 4: return "goldBonus";
        		case 5: return "vndGross";
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

        private String itemId;

        private String description;

        private int goldAmount;

        private int goldBonus;

        private int vndGross;

        private int __bitField0;

        private Builder() {
            this.itemId = "";
            this.description = "";
            this.goldAmount = 0;
            this.goldBonus = 0;
            this.vndGross = 0;
        }

        public Builder mergeFrom(HPIAPInfo instance) {
            if (instance.hasItemId()) {
                this.setItemId(instance.getItemId());
            }

            if (instance.hasDescription()) {
                this.setDescription(instance.getDescription());
            }

            if (instance.hasGoldAmount()) {
                this.setGoldAmount(instance.getGoldAmount());
            }

            if (instance.hasGoldBonus()) {
                this.setGoldBonus(instance.getGoldBonus());
            }

            if (instance.hasVndGross()) {
                this.setVndGross(instance.getVndGross());
            }

            return this;
        }

        public String getItemId() {
            return itemId;
        }

        public Builder setItemId(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HPIAPInfo#itemId to null");
            }

            this.itemId = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearItemId() {
            this.itemId = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasItemId() {
            return (__bitField0 & 1) == 1;
        }

        public String getDescription() {
            return description;
        }

        public Builder setDescription(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HPIAPInfo#description to null");
            }

            this.description = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearDescription() {
            this.description = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasDescription() {
            return (__bitField0 & 2) == 2;
        }

        public int getGoldAmount() {
            return goldAmount;
        }

        public Builder setGoldAmount(int value) {
            this.goldAmount = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearGoldAmount() {
            this.goldAmount = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasGoldAmount() {
            return (__bitField0 & 4) == 4;
        }

        public int getGoldBonus() {
            return goldBonus;
        }

        public Builder setGoldBonus(int value) {
            this.goldBonus = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearGoldBonus() {
            this.goldBonus = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasGoldBonus() {
            return (__bitField0 & 8) == 8;
        }

        public int getVndGross() {
            return vndGross;
        }

        public Builder setVndGross(int value) {
            this.vndGross = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearVndGross() {
            this.vndGross = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasVndGross() {
            return (__bitField0 & 16) == 16;
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
            if (!java.util.Objects.equals(this.itemId, that.itemId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.description, that.description)) {
                return false;
            }
            if (!java.util.Objects.equals(this.goldAmount, that.goldAmount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.goldBonus, that.goldBonus)) {
                return false;
            }
            if (!java.util.Objects.equals(this.vndGross, that.vndGross)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.itemId == null ? 0 : this.itemId.hashCode());
            result = 31 * result + (this.description == null ? 0 : this.description.hashCode());
            result = 31 * result + Integer.hashCode(this.goldAmount);
            result = 31 * result + Integer.hashCode(this.goldBonus);
            result = 31 * result + Integer.hashCode(this.vndGross);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasItemId()) {
                parts.add("itemId=" + getItemId());
            }
            if (hasDescription()) {
                parts.add("description=" + getDescription());
            }
            if (hasGoldAmount()) {
                parts.add("goldAmount=" + getGoldAmount());
            }
            if (hasGoldBonus()) {
                parts.add("goldBonus=" + getGoldBonus());
            }
            if (hasVndGross()) {
                parts.add("vndGross=" + getVndGross());
            }
            return "HPIAPInfo{" + String.join(", ", parts) + "}";
        }

        public HPIAPInfo build() {
            proto.message.HPIAPInfo result = new proto.message.HPIAPInfo();
            result.__bitField0 = __bitField0;
            result.itemId = this.itemId;
            result.description = this.description;
            result.goldAmount = this.goldAmount;
            result.goldBonus = this.goldBonus;
            result.vndGross = this.vndGross;
            return result;
        }

    }



}