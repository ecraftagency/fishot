package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_happy_play.proto")
public final class HPAppleIAPBuyRequest
        implements io.protostuff.Message<HPAppleIAPBuyRequest> {

    private static final HPAppleIAPBuyRequest DEFAULT_INSTANCE = newBuilder().build();

    private String receiptData;

    private boolean __merge_lock = false;
    private int __bitField0;

    private HPAppleIAPBuyRequest() {
        this.receiptData = "";
    }

    private HPAppleIAPBuyRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static HPAppleIAPBuyRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<HPAppleIAPBuyRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getReceiptData() {
        return receiptData;
    }

    public boolean hasReceiptData() {
        return (__bitField0 & 1) == 1;
    }

    public HPAppleIAPBuyRequest withReceiptData(String value) {
        return HPAppleIAPBuyRequest.newBuilder()
            .mergeFrom(this)
            .setReceiptData(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<HPAppleIAPBuyRequest> cachedSchema() {
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
        HPAppleIAPBuyRequest that = (HPAppleIAPBuyRequest) obj;
        if (!java.util.Objects.equals(this.receiptData, that.receiptData)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.receiptData == null ? 0 : this.receiptData.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasReceiptData()) {
            parts.add("receiptData=" + getReceiptData());
        }
        return "HPAppleIAPBuyRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<HPAppleIAPBuyRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("receiptData", 1);
        }

        @Override
        public HPAppleIAPBuyRequest newMessage() {
            return new HPAppleIAPBuyRequest();
        }

        @Override
        public Class<HPAppleIAPBuyRequest> typeClass() {
            return HPAppleIAPBuyRequest.class;
        }

        @Override
        public String messageName() {
            return HPAppleIAPBuyRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return HPAppleIAPBuyRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(HPAppleIAPBuyRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, HPAppleIAPBuyRequest instance) throws java.io.IOException {
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
                    	instance.receiptData = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, HPAppleIAPBuyRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.receiptData, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "receiptData";
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

        private String receiptData;

        private int __bitField0;

        private Builder() {
            this.receiptData = "";
        }

        public Builder mergeFrom(HPAppleIAPBuyRequest instance) {
            if (instance.hasReceiptData()) {
                this.setReceiptData(instance.getReceiptData());
            }

            return this;
        }

        public String getReceiptData() {
            return receiptData;
        }

        public Builder setReceiptData(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HPAppleIAPBuyRequest#receiptData to null");
            }

            this.receiptData = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearReceiptData() {
            this.receiptData = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasReceiptData() {
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
            if (!java.util.Objects.equals(this.receiptData, that.receiptData)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.receiptData == null ? 0 : this.receiptData.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasReceiptData()) {
                parts.add("receiptData=" + getReceiptData());
            }
            return "HPAppleIAPBuyRequest{" + String.join(", ", parts) + "}";
        }

        public HPAppleIAPBuyRequest build() {
            proto.message.HPAppleIAPBuyRequest result = new proto.message.HPAppleIAPBuyRequest();
            result.__bitField0 = __bitField0;
            result.receiptData = this.receiptData;
            return result;
        }

    }



}