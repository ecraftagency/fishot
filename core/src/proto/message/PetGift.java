package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class PetGift
        implements io.protostuff.Message<PetGift> {

    private static final PetGift DEFAULT_INSTANCE = newBuilder().build();

    private int id;

    private int quantity;

    private String name;

    private String filename;

    private boolean __merge_lock = false;
    private int __bitField0;

    private PetGift() {
        this.id = 0;
        this.quantity = 0;
        this.name = "";
        this.filename = "";
    }

    private PetGift(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static PetGift getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<PetGift> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 1) == 1;
    }

    public PetGift withId(int value) {
        return PetGift.newBuilder()
            .mergeFrom(this)
            .setId(value)
            .build();
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean hasQuantity() {
        return (__bitField0 & 2) == 2;
    }

    public PetGift withQuantity(int value) {
        return PetGift.newBuilder()
            .mergeFrom(this)
            .setQuantity(value)
            .build();
    }

    public String getName() {
        return name;
    }

    public boolean hasName() {
        return (__bitField0 & 4) == 4;
    }

    public PetGift withName(String value) {
        return PetGift.newBuilder()
            .mergeFrom(this)
            .setName(value)
            .build();
    }

    public String getFilename() {
        return filename;
    }

    public boolean hasFilename() {
        return (__bitField0 & 8) == 8;
    }

    public PetGift withFilename(String value) {
        return PetGift.newBuilder()
            .mergeFrom(this)
            .setFilename(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<PetGift> cachedSchema() {
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
        PetGift that = (PetGift) obj;
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.quantity, that.quantity)) {
            return false;
        }
        if (!java.util.Objects.equals(this.name, that.name)) {
            return false;
        }
        if (!java.util.Objects.equals(this.filename, that.filename)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.id);
        result = 31 * result + Integer.hashCode(this.quantity);
        result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
        result = 31 * result + (this.filename == null ? 0 : this.filename.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasId()) {
            parts.add("id=" + getId());
        }
        if (hasQuantity()) {
            parts.add("quantity=" + getQuantity());
        }
        if (hasName()) {
            parts.add("name=" + getName());
        }
        if (hasFilename()) {
            parts.add("filename=" + getFilename());
        }
        return "PetGift{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<PetGift>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("id", 1);
        	__fieldMap.put("quantity", 2);
        	__fieldMap.put("name", 3);
        	__fieldMap.put("filename", 4);
        }

        @Override
        public PetGift newMessage() {
            return new PetGift();
        }

        @Override
        public Class<PetGift> typeClass() {
            return PetGift.class;
        }

        @Override
        public String messageName() {
            return PetGift.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return PetGift.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(PetGift message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, PetGift instance) throws java.io.IOException {
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
                    	instance.quantity = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.name = input.readString();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.filename = input.readString();
                    	instance.__bitField0 |= 8;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, PetGift instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.id, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.quantity, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeString(3, instance.name, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeString(4, instance.filename, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "id";
        		case 2: return "quantity";
        		case 3: return "name";
        		case 4: return "filename";
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

        private int quantity;

        private String name;

        private String filename;

        private int __bitField0;

        private Builder() {
            this.id = 0;
            this.quantity = 0;
            this.name = "";
            this.filename = "";
        }

        public Builder mergeFrom(PetGift instance) {
            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            if (instance.hasQuantity()) {
                this.setQuantity(instance.getQuantity());
            }

            if (instance.hasName()) {
                this.setName(instance.getName());
            }

            if (instance.hasFilename()) {
                this.setFilename(instance.getFilename());
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

        public int getQuantity() {
            return quantity;
        }

        public Builder setQuantity(int value) {
            this.quantity = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearQuantity() {
            this.quantity = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasQuantity() {
            return (__bitField0 & 2) == 2;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set PetGift#name to null");
            }

            this.name = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearName() {
            this.name = "";
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasName() {
            return (__bitField0 & 4) == 4;
        }

        public String getFilename() {
            return filename;
        }

        public Builder setFilename(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set PetGift#filename to null");
            }

            this.filename = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearFilename() {
            this.filename = "";
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasFilename() {
            return (__bitField0 & 8) == 8;
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
            if (!java.util.Objects.equals(this.quantity, that.quantity)) {
                return false;
            }
            if (!java.util.Objects.equals(this.name, that.name)) {
                return false;
            }
            if (!java.util.Objects.equals(this.filename, that.filename)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.id);
            result = 31 * result + Integer.hashCode(this.quantity);
            result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
            result = 31 * result + (this.filename == null ? 0 : this.filename.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasId()) {
                parts.add("id=" + getId());
            }
            if (hasQuantity()) {
                parts.add("quantity=" + getQuantity());
            }
            if (hasName()) {
                parts.add("name=" + getName());
            }
            if (hasFilename()) {
                parts.add("filename=" + getFilename());
            }
            return "PetGift{" + String.join(", ", parts) + "}";
        }

        public PetGift build() {
            proto.message.PetGift result = new proto.message.PetGift();
            result.__bitField0 = __bitField0;
            result.id = this.id;
            result.quantity = this.quantity;
            result.name = this.name;
            result.filename = this.filename;
            return result;
        }

    }



}