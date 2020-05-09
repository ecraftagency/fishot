package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public final class InventoryItem
        implements io.protostuff.Message<InventoryItem> {

    private static final InventoryItem DEFAULT_INSTANCE = newBuilder().build();

    private int id;

    private String name;

    private String desc1;

    private String desc2;

    private int action;

    private int val1;

    private int val2;

    private int val3;

    private boolean __merge_lock = false;
    private int __bitField0;

    private InventoryItem() {
        this.id = 0;
        this.name = "";
        this.desc1 = "";
        this.desc2 = "";
        this.action = 0;
        this.val1 = 0;
        this.val2 = 0;
        this.val3 = 0;
    }

    private InventoryItem(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static InventoryItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<InventoryItem> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 1) == 1;
    }

    public InventoryItem withId(int value) {
        return InventoryItem.newBuilder()
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

    public InventoryItem withName(String value) {
        return InventoryItem.newBuilder()
            .mergeFrom(this)
            .setName(value)
            .build();
    }

    public String getDesc1() {
        return desc1;
    }

    public boolean hasDesc1() {
        return (__bitField0 & 4) == 4;
    }

    public InventoryItem withDesc1(String value) {
        return InventoryItem.newBuilder()
            .mergeFrom(this)
            .setDesc1(value)
            .build();
    }

    public String getDesc2() {
        return desc2;
    }

    public boolean hasDesc2() {
        return (__bitField0 & 8) == 8;
    }

    public InventoryItem withDesc2(String value) {
        return InventoryItem.newBuilder()
            .mergeFrom(this)
            .setDesc2(value)
            .build();
    }

    public int getAction() {
        return action;
    }

    public boolean hasAction() {
        return (__bitField0 & 16) == 16;
    }

    public InventoryItem withAction(int value) {
        return InventoryItem.newBuilder()
            .mergeFrom(this)
            .setAction(value)
            .build();
    }

    public int getVal1() {
        return val1;
    }

    public boolean hasVal1() {
        return (__bitField0 & 32) == 32;
    }

    public InventoryItem withVal1(int value) {
        return InventoryItem.newBuilder()
            .mergeFrom(this)
            .setVal1(value)
            .build();
    }

    public int getVal2() {
        return val2;
    }

    public boolean hasVal2() {
        return (__bitField0 & 64) == 64;
    }

    public InventoryItem withVal2(int value) {
        return InventoryItem.newBuilder()
            .mergeFrom(this)
            .setVal2(value)
            .build();
    }

    public int getVal3() {
        return val3;
    }

    public boolean hasVal3() {
        return (__bitField0 & 128) == 128;
    }

    public InventoryItem withVal3(int value) {
        return InventoryItem.newBuilder()
            .mergeFrom(this)
            .setVal3(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<InventoryItem> cachedSchema() {
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
        InventoryItem that = (InventoryItem) obj;
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.name, that.name)) {
            return false;
        }
        if (!java.util.Objects.equals(this.desc1, that.desc1)) {
            return false;
        }
        if (!java.util.Objects.equals(this.desc2, that.desc2)) {
            return false;
        }
        if (!java.util.Objects.equals(this.action, that.action)) {
            return false;
        }
        if (!java.util.Objects.equals(this.val1, that.val1)) {
            return false;
        }
        if (!java.util.Objects.equals(this.val2, that.val2)) {
            return false;
        }
        if (!java.util.Objects.equals(this.val3, that.val3)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.id);
        result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
        result = 31 * result + (this.desc1 == null ? 0 : this.desc1.hashCode());
        result = 31 * result + (this.desc2 == null ? 0 : this.desc2.hashCode());
        result = 31 * result + Integer.hashCode(this.action);
        result = 31 * result + Integer.hashCode(this.val1);
        result = 31 * result + Integer.hashCode(this.val2);
        result = 31 * result + Integer.hashCode(this.val3);

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
        if (hasDesc1()) {
            parts.add("desc1=" + getDesc1());
        }
        if (hasDesc2()) {
            parts.add("desc2=" + getDesc2());
        }
        if (hasAction()) {
            parts.add("action=" + getAction());
        }
        if (hasVal1()) {
            parts.add("val1=" + getVal1());
        }
        if (hasVal2()) {
            parts.add("val2=" + getVal2());
        }
        if (hasVal3()) {
            parts.add("val3=" + getVal3());
        }
        return "InventoryItem{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<InventoryItem>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("id", 1);
        	__fieldMap.put("name", 2);
        	__fieldMap.put("desc1", 3);
        	__fieldMap.put("desc2", 4);
        	__fieldMap.put("action", 5);
        	__fieldMap.put("val1", 6);
        	__fieldMap.put("val2", 7);
        	__fieldMap.put("val3", 8);
        }

        @Override
        public InventoryItem newMessage() {
            return new InventoryItem();
        }

        @Override
        public Class<InventoryItem> typeClass() {
            return InventoryItem.class;
        }

        @Override
        public String messageName() {
            return InventoryItem.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return InventoryItem.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(InventoryItem message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, InventoryItem instance) throws java.io.IOException {
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
                    	instance.desc1 = input.readString();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.desc2 = input.readString();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.action = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.val1 = input.readInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.val2 = input.readInt32();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.val3 = input.readInt32();
                    	instance.__bitField0 |= 128;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, InventoryItem instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.id, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.name, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeString(3, instance.desc1, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeString(4, instance.desc2, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.action, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeInt32(6, instance.val1, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeInt32(7, instance.val2, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeInt32(8, instance.val3, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "id";
        		case 2: return "name";
        		case 3: return "desc1";
        		case 4: return "desc2";
        		case 5: return "action";
        		case 6: return "val1";
        		case 7: return "val2";
        		case 8: return "val3";
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

        private String desc1;

        private String desc2;

        private int action;

        private int val1;

        private int val2;

        private int val3;

        private int __bitField0;

        private Builder() {
            this.id = 0;
            this.name = "";
            this.desc1 = "";
            this.desc2 = "";
            this.action = 0;
            this.val1 = 0;
            this.val2 = 0;
            this.val3 = 0;
        }

        public Builder mergeFrom(InventoryItem instance) {
            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            if (instance.hasName()) {
                this.setName(instance.getName());
            }

            if (instance.hasDesc1()) {
                this.setDesc1(instance.getDesc1());
            }

            if (instance.hasDesc2()) {
                this.setDesc2(instance.getDesc2());
            }

            if (instance.hasAction()) {
                this.setAction(instance.getAction());
            }

            if (instance.hasVal1()) {
                this.setVal1(instance.getVal1());
            }

            if (instance.hasVal2()) {
                this.setVal2(instance.getVal2());
            }

            if (instance.hasVal3()) {
                this.setVal3(instance.getVal3());
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
                throw new NullPointerException("Cannot set InventoryItem#name to null");
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

        public String getDesc1() {
            return desc1;
        }

        public Builder setDesc1(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InventoryItem#desc1 to null");
            }

            this.desc1 = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearDesc1() {
            this.desc1 = "";
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasDesc1() {
            return (__bitField0 & 4) == 4;
        }

        public String getDesc2() {
            return desc2;
        }

        public Builder setDesc2(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InventoryItem#desc2 to null");
            }

            this.desc2 = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearDesc2() {
            this.desc2 = "";
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasDesc2() {
            return (__bitField0 & 8) == 8;
        }

        public int getAction() {
            return action;
        }

        public Builder setAction(int value) {
            this.action = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearAction() {
            this.action = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasAction() {
            return (__bitField0 & 16) == 16;
        }

        public int getVal1() {
            return val1;
        }

        public Builder setVal1(int value) {
            this.val1 = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearVal1() {
            this.val1 = 0;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasVal1() {
            return (__bitField0 & 32) == 32;
        }

        public int getVal2() {
            return val2;
        }

        public Builder setVal2(int value) {
            this.val2 = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearVal2() {
            this.val2 = 0;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasVal2() {
            return (__bitField0 & 64) == 64;
        }

        public int getVal3() {
            return val3;
        }

        public Builder setVal3(int value) {
            this.val3 = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearVal3() {
            this.val3 = 0;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasVal3() {
            return (__bitField0 & 128) == 128;
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
            if (!java.util.Objects.equals(this.desc1, that.desc1)) {
                return false;
            }
            if (!java.util.Objects.equals(this.desc2, that.desc2)) {
                return false;
            }
            if (!java.util.Objects.equals(this.action, that.action)) {
                return false;
            }
            if (!java.util.Objects.equals(this.val1, that.val1)) {
                return false;
            }
            if (!java.util.Objects.equals(this.val2, that.val2)) {
                return false;
            }
            if (!java.util.Objects.equals(this.val3, that.val3)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.id);
            result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
            result = 31 * result + (this.desc1 == null ? 0 : this.desc1.hashCode());
            result = 31 * result + (this.desc2 == null ? 0 : this.desc2.hashCode());
            result = 31 * result + Integer.hashCode(this.action);
            result = 31 * result + Integer.hashCode(this.val1);
            result = 31 * result + Integer.hashCode(this.val2);
            result = 31 * result + Integer.hashCode(this.val3);

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
            if (hasDesc1()) {
                parts.add("desc1=" + getDesc1());
            }
            if (hasDesc2()) {
                parts.add("desc2=" + getDesc2());
            }
            if (hasAction()) {
                parts.add("action=" + getAction());
            }
            if (hasVal1()) {
                parts.add("val1=" + getVal1());
            }
            if (hasVal2()) {
                parts.add("val2=" + getVal2());
            }
            if (hasVal3()) {
                parts.add("val3=" + getVal3());
            }
            return "InventoryItem{" + String.join(", ", parts) + "}";
        }

        public InventoryItem build() {
            proto.message.InventoryItem result = new proto.message.InventoryItem();
            result.__bitField0 = __bitField0;
            result.id = this.id;
            result.name = this.name;
            result.desc1 = this.desc1;
            result.desc2 = this.desc2;
            result.action = this.action;
            result.val1 = this.val1;
            result.val2 = this.val2;
            result.val3 = this.val3;
            return result;
        }

    }



}