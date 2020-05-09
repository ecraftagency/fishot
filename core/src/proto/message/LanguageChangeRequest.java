package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public final class LanguageChangeRequest
        implements io.protostuff.Message<LanguageChangeRequest> {

    private static final LanguageChangeRequest DEFAULT_INSTANCE = newBuilder().build();

    private int languageCode;

    private boolean __merge_lock = false;
    private int __bitField0;

    private LanguageChangeRequest() {
        this.languageCode = 0;
    }

    private LanguageChangeRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static LanguageChangeRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<LanguageChangeRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getLanguageCode() {
        return languageCode;
    }

    public boolean hasLanguageCode() {
        return (__bitField0 & 1) == 1;
    }

    public LanguageChangeRequest withLanguageCode(int value) {
        return LanguageChangeRequest.newBuilder()
            .mergeFrom(this)
            .setLanguageCode(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<LanguageChangeRequest> cachedSchema() {
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
        LanguageChangeRequest that = (LanguageChangeRequest) obj;
        if (!java.util.Objects.equals(this.languageCode, that.languageCode)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.languageCode);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasLanguageCode()) {
            parts.add("languageCode=" + getLanguageCode());
        }
        return "LanguageChangeRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<LanguageChangeRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("languageCode", 1);
        }

        @Override
        public LanguageChangeRequest newMessage() {
            return new LanguageChangeRequest();
        }

        @Override
        public Class<LanguageChangeRequest> typeClass() {
            return LanguageChangeRequest.class;
        }

        @Override
        public String messageName() {
            return LanguageChangeRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return LanguageChangeRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(LanguageChangeRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, LanguageChangeRequest instance) throws java.io.IOException {
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
                    	instance.languageCode = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, LanguageChangeRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.languageCode, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "languageCode";
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

        private int languageCode;

        private int __bitField0;

        private Builder() {
            this.languageCode = 0;
        }

        public Builder mergeFrom(LanguageChangeRequest instance) {
            if (instance.hasLanguageCode()) {
                this.setLanguageCode(instance.getLanguageCode());
            }

            return this;
        }

        public int getLanguageCode() {
            return languageCode;
        }

        public Builder setLanguageCode(int value) {
            this.languageCode = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearLanguageCode() {
            this.languageCode = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasLanguageCode() {
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
            if (!java.util.Objects.equals(this.languageCode, that.languageCode)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.languageCode);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasLanguageCode()) {
                parts.add("languageCode=" + getLanguageCode());
            }
            return "LanguageChangeRequest{" + String.join(", ", parts) + "}";
        }

        public LanguageChangeRequest build() {
            proto.message.LanguageChangeRequest result = new proto.message.LanguageChangeRequest();
            result.__bitField0 = __bitField0;
            result.languageCode = this.languageCode;
            return result;
        }

    }



}