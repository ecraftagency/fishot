package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_happy_play.proto")
public final class HPGoogleIAPBuyRequest
        implements io.protostuff.Message<HPGoogleIAPBuyRequest> {

    private static final HPGoogleIAPBuyRequest DEFAULT_INSTANCE = newBuilder().build();

    private String originalJson;

    private String signatureData;

    private boolean __merge_lock = false;
    private int __bitField0;

    private HPGoogleIAPBuyRequest() {
        this.originalJson = "";
        this.signatureData = "";
    }

    private HPGoogleIAPBuyRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static HPGoogleIAPBuyRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<HPGoogleIAPBuyRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getOriginalJson() {
        return originalJson;
    }

    public boolean hasOriginalJson() {
        return (__bitField0 & 1) == 1;
    }

    public HPGoogleIAPBuyRequest withOriginalJson(String value) {
        return HPGoogleIAPBuyRequest.newBuilder()
            .mergeFrom(this)
            .setOriginalJson(value)
            .build();
    }

    public String getSignatureData() {
        return signatureData;
    }

    public boolean hasSignatureData() {
        return (__bitField0 & 2) == 2;
    }

    public HPGoogleIAPBuyRequest withSignatureData(String value) {
        return HPGoogleIAPBuyRequest.newBuilder()
            .mergeFrom(this)
            .setSignatureData(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<HPGoogleIAPBuyRequest> cachedSchema() {
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
        HPGoogleIAPBuyRequest that = (HPGoogleIAPBuyRequest) obj;
        if (!java.util.Objects.equals(this.originalJson, that.originalJson)) {
            return false;
        }
        if (!java.util.Objects.equals(this.signatureData, that.signatureData)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.originalJson == null ? 0 : this.originalJson.hashCode());
        result = 31 * result + (this.signatureData == null ? 0 : this.signatureData.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasOriginalJson()) {
            parts.add("originalJson=" + getOriginalJson());
        }
        if (hasSignatureData()) {
            parts.add("signatureData=" + getSignatureData());
        }
        return "HPGoogleIAPBuyRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<HPGoogleIAPBuyRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("originalJson", 1);
        	__fieldMap.put("signatureData", 2);
        }

        @Override
        public HPGoogleIAPBuyRequest newMessage() {
            return new HPGoogleIAPBuyRequest();
        }

        @Override
        public Class<HPGoogleIAPBuyRequest> typeClass() {
            return HPGoogleIAPBuyRequest.class;
        }

        @Override
        public String messageName() {
            return HPGoogleIAPBuyRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return HPGoogleIAPBuyRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(HPGoogleIAPBuyRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, HPGoogleIAPBuyRequest instance) throws java.io.IOException {
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
                    	instance.originalJson = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.signatureData = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, HPGoogleIAPBuyRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.originalJson, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.signatureData, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "originalJson";
        		case 2: return "signatureData";
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

        private String originalJson;

        private String signatureData;

        private int __bitField0;

        private Builder() {
            this.originalJson = "";
            this.signatureData = "";
        }

        public Builder mergeFrom(HPGoogleIAPBuyRequest instance) {
            if (instance.hasOriginalJson()) {
                this.setOriginalJson(instance.getOriginalJson());
            }

            if (instance.hasSignatureData()) {
                this.setSignatureData(instance.getSignatureData());
            }

            return this;
        }

        public String getOriginalJson() {
            return originalJson;
        }

        public Builder setOriginalJson(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HPGoogleIAPBuyRequest#originalJson to null");
            }

            this.originalJson = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearOriginalJson() {
            this.originalJson = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasOriginalJson() {
            return (__bitField0 & 1) == 1;
        }

        public String getSignatureData() {
            return signatureData;
        }

        public Builder setSignatureData(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HPGoogleIAPBuyRequest#signatureData to null");
            }

            this.signatureData = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearSignatureData() {
            this.signatureData = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasSignatureData() {
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
            if (!java.util.Objects.equals(this.originalJson, that.originalJson)) {
                return false;
            }
            if (!java.util.Objects.equals(this.signatureData, that.signatureData)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.originalJson == null ? 0 : this.originalJson.hashCode());
            result = 31 * result + (this.signatureData == null ? 0 : this.signatureData.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasOriginalJson()) {
                parts.add("originalJson=" + getOriginalJson());
            }
            if (hasSignatureData()) {
                parts.add("signatureData=" + getSignatureData());
            }
            return "HPGoogleIAPBuyRequest{" + String.join(", ", parts) + "}";
        }

        public HPGoogleIAPBuyRequest build() {
            proto.message.HPGoogleIAPBuyRequest result = new proto.message.HPGoogleIAPBuyRequest();
            result.__bitField0 = __bitField0;
            result.originalJson = this.originalJson;
            result.signatureData = this.signatureData;
            return result;
        }

    }



}