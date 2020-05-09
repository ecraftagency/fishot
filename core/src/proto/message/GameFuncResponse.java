package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public final class GameFuncResponse
        implements io.protostuff.Message<GameFuncResponse> {

    private static final GameFuncResponse DEFAULT_INSTANCE = newBuilder().build();

    private String funcName;

    private boolean value;

    private boolean __merge_lock = false;
    private int __bitField0;

    private GameFuncResponse() {
        this.funcName = "";
        this.value = false;
    }

    private GameFuncResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static GameFuncResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<GameFuncResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getFuncName() {
        return funcName;
    }

    public boolean hasFuncName() {
        return (__bitField0 & 1) == 1;
    }

    public GameFuncResponse withFuncName(String value) {
        return GameFuncResponse.newBuilder()
            .mergeFrom(this)
            .setFuncName(value)
            .build();
    }

    public boolean getValue() {
        return value;
    }

    public boolean hasValue() {
        return (__bitField0 & 2) == 2;
    }

    public GameFuncResponse withValue(boolean value) {
        return GameFuncResponse.newBuilder()
            .mergeFrom(this)
            .setValue(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<GameFuncResponse> cachedSchema() {
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
        GameFuncResponse that = (GameFuncResponse) obj;
        if (!java.util.Objects.equals(this.funcName, that.funcName)) {
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
        result = 31 * result + (this.funcName == null ? 0 : this.funcName.hashCode());
        result = 31 * result + Boolean.hashCode(this.value);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasFuncName()) {
            parts.add("funcName=" + getFuncName());
        }
        if (hasValue()) {
            parts.add("value=" + getValue());
        }
        return "GameFuncResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<GameFuncResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("funcName", 1);
        	__fieldMap.put("value", 2);
        }

        @Override
        public GameFuncResponse newMessage() {
            return new GameFuncResponse();
        }

        @Override
        public Class<GameFuncResponse> typeClass() {
            return GameFuncResponse.class;
        }

        @Override
        public String messageName() {
            return GameFuncResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return GameFuncResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(GameFuncResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, GameFuncResponse instance) throws java.io.IOException {
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
                    	instance.funcName = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.value = input.readBool();
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, GameFuncResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.funcName, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeBool(2, instance.value, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "funcName";
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

        private String funcName;

        private boolean value;

        private int __bitField0;

        private Builder() {
            this.funcName = "";
            this.value = false;
        }

        public Builder mergeFrom(GameFuncResponse instance) {
            if (instance.hasFuncName()) {
                this.setFuncName(instance.getFuncName());
            }

            if (instance.hasValue()) {
                this.setValue(instance.getValue());
            }

            return this;
        }

        public String getFuncName() {
            return funcName;
        }

        public Builder setFuncName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GameFuncResponse#funcName to null");
            }

            this.funcName = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearFuncName() {
            this.funcName = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasFuncName() {
            return (__bitField0 & 1) == 1;
        }

        public boolean getValue() {
            return value;
        }

        public Builder setValue(boolean value) {
            this.value = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearValue() {
            this.value = false;
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
            if (!java.util.Objects.equals(this.funcName, that.funcName)) {
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
            result = 31 * result + (this.funcName == null ? 0 : this.funcName.hashCode());
            result = 31 * result + Boolean.hashCode(this.value);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasFuncName()) {
                parts.add("funcName=" + getFuncName());
            }
            if (hasValue()) {
                parts.add("value=" + getValue());
            }
            return "GameFuncResponse{" + String.join(", ", parts) + "}";
        }

        public GameFuncResponse build() {
            proto.message.GameFuncResponse result = new proto.message.GameFuncResponse();
            result.__bitField0 = __bitField0;
            result.funcName = this.funcName;
            result.value = this.value;
            return result;
        }

    }



}