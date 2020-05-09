package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class InventoryCannon
        implements io.protostuff.Message<InventoryCannon> {

    private static final InventoryCannon DEFAULT_INSTANCE = newBuilder().build();

    private int id;

    private int level;

    private boolean __merge_lock = false;
    private int __bitField0;

    private InventoryCannon() {
        this.id = 0;
        this.level = 0;
    }

    private InventoryCannon(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static InventoryCannon getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<InventoryCannon> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 1) == 1;
    }

    public InventoryCannon withId(int value) {
        return InventoryCannon.newBuilder()
            .mergeFrom(this)
            .setId(value)
            .build();
    }

    public int getLevel() {
        return level;
    }

    public boolean hasLevel() {
        return (__bitField0 & 2) == 2;
    }

    public InventoryCannon withLevel(int value) {
        return InventoryCannon.newBuilder()
            .mergeFrom(this)
            .setLevel(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<InventoryCannon> cachedSchema() {
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
        InventoryCannon that = (InventoryCannon) obj;
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.level, that.level)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.id);
        result = 31 * result + Integer.hashCode(this.level);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasId()) {
            parts.add("id=" + getId());
        }
        if (hasLevel()) {
            parts.add("level=" + getLevel());
        }
        return "InventoryCannon{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<InventoryCannon>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("id", 1);
        	__fieldMap.put("level", 2);
        }

        @Override
        public InventoryCannon newMessage() {
            return new InventoryCannon();
        }

        @Override
        public Class<InventoryCannon> typeClass() {
            return InventoryCannon.class;
        }

        @Override
        public String messageName() {
            return InventoryCannon.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return InventoryCannon.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(InventoryCannon message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, InventoryCannon instance) throws java.io.IOException {
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
                    	instance.level = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, InventoryCannon instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.id, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.level, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "id";
        		case 2: return "level";
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

        private int level;

        private int __bitField0;

        private Builder() {
            this.id = 0;
            this.level = 0;
        }

        public Builder mergeFrom(InventoryCannon instance) {
            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            if (instance.hasLevel()) {
                this.setLevel(instance.getLevel());
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

        public int getLevel() {
            return level;
        }

        public Builder setLevel(int value) {
            this.level = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearLevel() {
            this.level = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasLevel() {
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
            if (!java.util.Objects.equals(this.level, that.level)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.id);
            result = 31 * result + Integer.hashCode(this.level);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasId()) {
                parts.add("id=" + getId());
            }
            if (hasLevel()) {
                parts.add("level=" + getLevel());
            }
            return "InventoryCannon{" + String.join(", ", parts) + "}";
        }

        public InventoryCannon build() {
            proto.message.InventoryCannon result = new proto.message.InventoryCannon();
            result.__bitField0 = __bitField0;
            result.id = this.id;
            result.level = this.level;
            return result;
        }

    }



}