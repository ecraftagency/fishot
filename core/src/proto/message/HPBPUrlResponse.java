package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_happy_play.proto")
public final class HPBPUrlResponse
        implements io.protostuff.Message<HPBPUrlResponse> {

    private static final HPBPUrlResponse DEFAULT_INSTANCE = newBuilder().build();

    private String url;

    private String orderId;

    private String itemId;

    private boolean __merge_lock = false;
    private int __bitField0;

    private HPBPUrlResponse() {
        this.url = "";
        this.orderId = "";
        this.itemId = "";
    }

    private HPBPUrlResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static HPBPUrlResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<HPBPUrlResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getUrl() {
        return url;
    }

    public boolean hasUrl() {
        return (__bitField0 & 1) == 1;
    }

    public HPBPUrlResponse withUrl(String value) {
        return HPBPUrlResponse.newBuilder()
            .mergeFrom(this)
            .setUrl(value)
            .build();
    }

    public String getOrderId() {
        return orderId;
    }

    public boolean hasOrderId() {
        return (__bitField0 & 2) == 2;
    }

    public HPBPUrlResponse withOrderId(String value) {
        return HPBPUrlResponse.newBuilder()
            .mergeFrom(this)
            .setOrderId(value)
            .build();
    }

    public String getItemId() {
        return itemId;
    }

    public boolean hasItemId() {
        return (__bitField0 & 4) == 4;
    }

    public HPBPUrlResponse withItemId(String value) {
        return HPBPUrlResponse.newBuilder()
            .mergeFrom(this)
            .setItemId(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<HPBPUrlResponse> cachedSchema() {
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
        HPBPUrlResponse that = (HPBPUrlResponse) obj;
        if (!java.util.Objects.equals(this.url, that.url)) {
            return false;
        }
        if (!java.util.Objects.equals(this.orderId, that.orderId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.itemId, that.itemId)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.url == null ? 0 : this.url.hashCode());
        result = 31 * result + (this.orderId == null ? 0 : this.orderId.hashCode());
        result = 31 * result + (this.itemId == null ? 0 : this.itemId.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasUrl()) {
            parts.add("url=" + getUrl());
        }
        if (hasOrderId()) {
            parts.add("orderId=" + getOrderId());
        }
        if (hasItemId()) {
            parts.add("itemId=" + getItemId());
        }
        return "HPBPUrlResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<HPBPUrlResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("url", 1);
        	__fieldMap.put("orderId", 2);
        	__fieldMap.put("itemId", 3);
        }

        @Override
        public HPBPUrlResponse newMessage() {
            return new HPBPUrlResponse();
        }

        @Override
        public Class<HPBPUrlResponse> typeClass() {
            return HPBPUrlResponse.class;
        }

        @Override
        public String messageName() {
            return HPBPUrlResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return HPBPUrlResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(HPBPUrlResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, HPBPUrlResponse instance) throws java.io.IOException {
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
                    	instance.url = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.orderId = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.itemId = input.readString();
                    	instance.__bitField0 |= 4;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, HPBPUrlResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.url, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.orderId, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeString(3, instance.itemId, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "url";
        		case 2: return "orderId";
        		case 3: return "itemId";
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

        private String url;

        private String orderId;

        private String itemId;

        private int __bitField0;

        private Builder() {
            this.url = "";
            this.orderId = "";
            this.itemId = "";
        }

        public Builder mergeFrom(HPBPUrlResponse instance) {
            if (instance.hasUrl()) {
                this.setUrl(instance.getUrl());
            }

            if (instance.hasOrderId()) {
                this.setOrderId(instance.getOrderId());
            }

            if (instance.hasItemId()) {
                this.setItemId(instance.getItemId());
            }

            return this;
        }

        public String getUrl() {
            return url;
        }

        public Builder setUrl(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HPBPUrlResponse#url to null");
            }

            this.url = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearUrl() {
            this.url = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasUrl() {
            return (__bitField0 & 1) == 1;
        }

        public String getOrderId() {
            return orderId;
        }

        public Builder setOrderId(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HPBPUrlResponse#orderId to null");
            }

            this.orderId = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearOrderId() {
            this.orderId = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasOrderId() {
            return (__bitField0 & 2) == 2;
        }

        public String getItemId() {
            return itemId;
        }

        public Builder setItemId(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HPBPUrlResponse#itemId to null");
            }

            this.itemId = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearItemId() {
            this.itemId = "";
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasItemId() {
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
            if (!java.util.Objects.equals(this.url, that.url)) {
                return false;
            }
            if (!java.util.Objects.equals(this.orderId, that.orderId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.itemId, that.itemId)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.url == null ? 0 : this.url.hashCode());
            result = 31 * result + (this.orderId == null ? 0 : this.orderId.hashCode());
            result = 31 * result + (this.itemId == null ? 0 : this.itemId.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasUrl()) {
                parts.add("url=" + getUrl());
            }
            if (hasOrderId()) {
                parts.add("orderId=" + getOrderId());
            }
            if (hasItemId()) {
                parts.add("itemId=" + getItemId());
            }
            return "HPBPUrlResponse{" + String.join(", ", parts) + "}";
        }

        public HPBPUrlResponse build() {
            proto.message.HPBPUrlResponse result = new proto.message.HPBPUrlResponse();
            result.__bitField0 = __bitField0;
            result.url = this.url;
            result.orderId = this.orderId;
            result.itemId = this.itemId;
            return result;
        }

    }



}