package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_happy_play.proto")
public final class HPBPUrlRequest
        implements io.protostuff.Message<HPBPUrlRequest> {

    private static final HPBPUrlRequest DEFAULT_INSTANCE = newBuilder().build();

    private String itemId;

    private String cardNo;

    private String serialNo;

    private boolean __merge_lock = false;
    private int __bitField0;

    private HPBPUrlRequest() {
        this.itemId = "";
        this.cardNo = "";
        this.serialNo = "";
    }

    private HPBPUrlRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static HPBPUrlRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<HPBPUrlRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getItemId() {
        return itemId;
    }

    public boolean hasItemId() {
        return (__bitField0 & 1) == 1;
    }

    public HPBPUrlRequest withItemId(String value) {
        return HPBPUrlRequest.newBuilder()
            .mergeFrom(this)
            .setItemId(value)
            .build();
    }

    public String getCardNo() {
        return cardNo;
    }

    public boolean hasCardNo() {
        return (__bitField0 & 2) == 2;
    }

    public HPBPUrlRequest withCardNo(String value) {
        return HPBPUrlRequest.newBuilder()
            .mergeFrom(this)
            .setCardNo(value)
            .build();
    }

    public String getSerialNo() {
        return serialNo;
    }

    public boolean hasSerialNo() {
        return (__bitField0 & 4) == 4;
    }

    public HPBPUrlRequest withSerialNo(String value) {
        return HPBPUrlRequest.newBuilder()
            .mergeFrom(this)
            .setSerialNo(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<HPBPUrlRequest> cachedSchema() {
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
        HPBPUrlRequest that = (HPBPUrlRequest) obj;
        if (!java.util.Objects.equals(this.itemId, that.itemId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.cardNo, that.cardNo)) {
            return false;
        }
        if (!java.util.Objects.equals(this.serialNo, that.serialNo)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.itemId == null ? 0 : this.itemId.hashCode());
        result = 31 * result + (this.cardNo == null ? 0 : this.cardNo.hashCode());
        result = 31 * result + (this.serialNo == null ? 0 : this.serialNo.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasItemId()) {
            parts.add("itemId=" + getItemId());
        }
        if (hasCardNo()) {
            parts.add("cardNo=" + getCardNo());
        }
        if (hasSerialNo()) {
            parts.add("serialNo=" + getSerialNo());
        }
        return "HPBPUrlRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<HPBPUrlRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("itemId", 1);
        	__fieldMap.put("cardNo", 2);
        	__fieldMap.put("serialNo", 3);
        }

        @Override
        public HPBPUrlRequest newMessage() {
            return new HPBPUrlRequest();
        }

        @Override
        public Class<HPBPUrlRequest> typeClass() {
            return HPBPUrlRequest.class;
        }

        @Override
        public String messageName() {
            return HPBPUrlRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return HPBPUrlRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(HPBPUrlRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, HPBPUrlRequest instance) throws java.io.IOException {
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
                    	instance.itemId = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.cardNo = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.serialNo = input.readString();
                    	instance.__bitField0 |= 4;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, HPBPUrlRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.itemId, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.cardNo, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeString(3, instance.serialNo, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "itemId";
        		case 2: return "cardNo";
        		case 3: return "serialNo";
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

        private String itemId;

        private String cardNo;

        private String serialNo;

        private int __bitField0;

        private Builder() {
            this.itemId = "";
            this.cardNo = "";
            this.serialNo = "";
        }

        public Builder mergeFrom(HPBPUrlRequest instance) {
            if (instance.hasItemId()) {
                this.setItemId(instance.getItemId());
            }

            if (instance.hasCardNo()) {
                this.setCardNo(instance.getCardNo());
            }

            if (instance.hasSerialNo()) {
                this.setSerialNo(instance.getSerialNo());
            }

            return this;
        }

        public String getItemId() {
            return itemId;
        }

        public Builder setItemId(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HPBPUrlRequest#itemId to null");
            }

            this.itemId = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearItemId() {
            this.itemId = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasItemId() {
            return (__bitField0 & 1) == 1;
        }

        public String getCardNo() {
            return cardNo;
        }

        public Builder setCardNo(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HPBPUrlRequest#cardNo to null");
            }

            this.cardNo = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearCardNo() {
            this.cardNo = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasCardNo() {
            return (__bitField0 & 2) == 2;
        }

        public String getSerialNo() {
            return serialNo;
        }

        public Builder setSerialNo(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HPBPUrlRequest#serialNo to null");
            }

            this.serialNo = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearSerialNo() {
            this.serialNo = "";
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasSerialNo() {
            return (__bitField0 & 4) == 4;
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
            if (!java.util.Objects.equals(this.itemId, that.itemId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.cardNo, that.cardNo)) {
                return false;
            }
            if (!java.util.Objects.equals(this.serialNo, that.serialNo)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.itemId == null ? 0 : this.itemId.hashCode());
            result = 31 * result + (this.cardNo == null ? 0 : this.cardNo.hashCode());
            result = 31 * result + (this.serialNo == null ? 0 : this.serialNo.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasItemId()) {
                parts.add("itemId=" + getItemId());
            }
            if (hasCardNo()) {
                parts.add("cardNo=" + getCardNo());
            }
            if (hasSerialNo()) {
                parts.add("serialNo=" + getSerialNo());
            }
            return "HPBPUrlRequest{" + String.join(", ", parts) + "}";
        }

        public HPBPUrlRequest build() {
            proto.message.HPBPUrlRequest result = new proto.message.HPBPUrlRequest();
            result.__bitField0 = __bitField0;
            result.itemId = this.itemId;
            result.cardNo = this.cardNo;
            result.serialNo = this.serialNo;
            return result;
        }

    }



}