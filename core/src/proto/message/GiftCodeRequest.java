package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class GiftCodeRequest
        implements io.protostuff.Message<GiftCodeRequest> {

    private static final GiftCodeRequest DEFAULT_INSTANCE = newBuilder().build();

    private String code;

    private boolean __merge_lock = false;
    private int __bitField0;

    private GiftCodeRequest() {
        this.code = "";
    }

    private GiftCodeRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static GiftCodeRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<GiftCodeRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getCode() {
        return code;
    }

    public boolean hasCode() {
        return (__bitField0 & 1) == 1;
    }

    public GiftCodeRequest withCode(String value) {
        return GiftCodeRequest.newBuilder()
            .mergeFrom(this)
            .setCode(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<GiftCodeRequest> cachedSchema() {
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
        GiftCodeRequest that = (GiftCodeRequest) obj;
        if (!java.util.Objects.equals(this.code, that.code)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.code == null ? 0 : this.code.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasCode()) {
            parts.add("code=" + getCode());
        }
        return "GiftCodeRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<GiftCodeRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("code", 1);
        }

        @Override
        public GiftCodeRequest newMessage() {
            return new GiftCodeRequest();
        }

        @Override
        public Class<GiftCodeRequest> typeClass() {
            return GiftCodeRequest.class;
        }

        @Override
        public String messageName() {
            return GiftCodeRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return GiftCodeRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(GiftCodeRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, GiftCodeRequest instance) throws java.io.IOException {
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
                    	instance.code = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, GiftCodeRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.code, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "code";
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

        private String code;

        private int __bitField0;

        private Builder() {
            this.code = "";
        }

        public Builder mergeFrom(GiftCodeRequest instance) {
            if (instance.hasCode()) {
                this.setCode(instance.getCode());
            }

            return this;
        }

        public String getCode() {
            return code;
        }

        public Builder setCode(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GiftCodeRequest#code to null");
            }

            this.code = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearCode() {
            this.code = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasCode() {
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
            if (!java.util.Objects.equals(this.code, that.code)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.code == null ? 0 : this.code.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasCode()) {
                parts.add("code=" + getCode());
            }
            return "GiftCodeRequest{" + String.join(", ", parts) + "}";
        }

        public GiftCodeRequest build() {
            proto.message.GiftCodeRequest result = new proto.message.GiftCodeRequest();
            result.__bitField0 = __bitField0;
            result.code = this.code;
            return result;
        }

    }



}