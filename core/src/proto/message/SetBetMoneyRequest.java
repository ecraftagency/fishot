package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class SetBetMoneyRequest
        implements io.protostuff.Message<SetBetMoneyRequest> {

    private static final SetBetMoneyRequest DEFAULT_INSTANCE = newBuilder().build();

    private int value;

    private boolean __merge_lock = false;
    private int __bitField0;

    private SetBetMoneyRequest() {
        this.value = 0;
    }

    private SetBetMoneyRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static SetBetMoneyRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<SetBetMoneyRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getValue() {
        return value;
    }

    public boolean hasValue() {
        return (__bitField0 & 1) == 1;
    }

    public SetBetMoneyRequest withValue(int value) {
        return SetBetMoneyRequest.newBuilder()
            .mergeFrom(this)
            .setValue(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<SetBetMoneyRequest> cachedSchema() {
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
        SetBetMoneyRequest that = (SetBetMoneyRequest) obj;
        if (!java.util.Objects.equals(this.value, that.value)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.value);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasValue()) {
            parts.add("value=" + getValue());
        }
        return "SetBetMoneyRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<SetBetMoneyRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("value", 1);
        }

        @Override
        public SetBetMoneyRequest newMessage() {
            return new SetBetMoneyRequest();
        }

        @Override
        public Class<SetBetMoneyRequest> typeClass() {
            return SetBetMoneyRequest.class;
        }

        @Override
        public String messageName() {
            return SetBetMoneyRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return SetBetMoneyRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(SetBetMoneyRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, SetBetMoneyRequest instance) throws java.io.IOException {
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
                    	instance.value = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, SetBetMoneyRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.value, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "value";
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

        private int value;

        private int __bitField0;

        private Builder() {
            this.value = 0;
        }

        public Builder mergeFrom(SetBetMoneyRequest instance) {
            if (instance.hasValue()) {
                this.setValue(instance.getValue());
            }

            return this;
        }

        public int getValue() {
            return value;
        }

        public Builder setValue(int value) {
            this.value = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearValue() {
            this.value = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasValue() {
            return (__bitField0 & 1) == 1;
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
            if (!java.util.Objects.equals(this.value, that.value)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.value);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasValue()) {
                parts.add("value=" + getValue());
            }
            return "SetBetMoneyRequest{" + String.join(", ", parts) + "}";
        }

        public SetBetMoneyRequest build() {
            proto.message.SetBetMoneyRequest result = new proto.message.SetBetMoneyRequest();
            result.__bitField0 = __bitField0;
            result.value = this.value;
            return result;
        }

    }



}