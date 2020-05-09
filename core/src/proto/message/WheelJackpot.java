package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class WheelJackpot
        implements io.protostuff.Message<WheelJackpot> {

    private static final WheelJackpot DEFAULT_INSTANCE = newBuilder().build();

    private int type;

    private int value;

    private boolean __merge_lock = false;
    private int __bitField0;

    private WheelJackpot() {
        this.type = 0;
        this.value = 0;
    }

    private WheelJackpot(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static WheelJackpot getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<WheelJackpot> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getType() {
        return type;
    }

    public boolean hasType() {
        return (__bitField0 & 1) == 1;
    }

    public WheelJackpot withType(int value) {
        return WheelJackpot.newBuilder()
            .mergeFrom(this)
            .setType(value)
            .build();
    }

    public int getValue() {
        return value;
    }

    public boolean hasValue() {
        return (__bitField0 & 2) == 2;
    }

    public WheelJackpot withValue(int value) {
        return WheelJackpot.newBuilder()
            .mergeFrom(this)
            .setValue(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<WheelJackpot> cachedSchema() {
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
        WheelJackpot that = (WheelJackpot) obj;
        if (!java.util.Objects.equals(this.type, that.type)) {
            return false;
        }
        if (!java.util.Objects.equals(this.value, that.value)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.type);
        result = 31 * result + Integer.hashCode(this.value);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasType()) {
            parts.add("type=" + getType());
        }
        if (hasValue()) {
            parts.add("value=" + getValue());
        }
        return "WheelJackpot{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<WheelJackpot>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("type", 1);
        	__fieldMap.put("value", 2);
        }

        @Override
        public WheelJackpot newMessage() {
            return new WheelJackpot();
        }

        @Override
        public Class<WheelJackpot> typeClass() {
            return WheelJackpot.class;
        }

        @Override
        public String messageName() {
            return WheelJackpot.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return WheelJackpot.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(WheelJackpot message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, WheelJackpot instance) throws java.io.IOException {
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
                    	instance.type = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.value = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, WheelJackpot instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.type, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.value, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "type";
        		case 2: return "value";
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

        private int type;

        private int value;

        private int __bitField0;

        private Builder() {
            this.type = 0;
            this.value = 0;
        }

        public Builder mergeFrom(WheelJackpot instance) {
            if (instance.hasType()) {
                this.setType(instance.getType());
            }

            if (instance.hasValue()) {
                this.setValue(instance.getValue());
            }

            return this;
        }

        public int getType() {
            return type;
        }

        public Builder setType(int value) {
            this.type = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearType() {
            this.type = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasType() {
            return (__bitField0 & 1) == 1;
        }

        public int getValue() {
            return value;
        }

        public Builder setValue(int value) {
            this.value = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearValue() {
            this.value = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasValue() {
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
            if (!java.util.Objects.equals(this.type, that.type)) {
                return false;
            }
            if (!java.util.Objects.equals(this.value, that.value)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.type);
            result = 31 * result + Integer.hashCode(this.value);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasType()) {
                parts.add("type=" + getType());
            }
            if (hasValue()) {
                parts.add("value=" + getValue());
            }
            return "WheelJackpot{" + String.join(", ", parts) + "}";
        }

        public WheelJackpot build() {
            proto.message.WheelJackpot result = new proto.message.WheelJackpot();
            result.__bitField0 = __bitField0;
            result.type = this.type;
            result.value = this.value;
            return result;
        }

    }



}