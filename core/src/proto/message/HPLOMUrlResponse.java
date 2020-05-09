package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_happy_play.proto")
public final class HPLOMUrlResponse
        implements io.protostuff.Message<HPLOMUrlResponse> {

    private static final HPLOMUrlResponse DEFAULT_INSTANCE = newBuilder().build();

    private String url;

    private String orderId;

    private boolean __merge_lock = false;
    private int __bitField0;

    private HPLOMUrlResponse() {
        this.url = "";
        this.orderId = "";
    }

    private HPLOMUrlResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static HPLOMUrlResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<HPLOMUrlResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getUrl() {
        return url;
    }

    public boolean hasUrl() {
        return (__bitField0 & 1) == 1;
    }

    public HPLOMUrlResponse withUrl(String value) {
        return HPLOMUrlResponse.newBuilder()
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

    public HPLOMUrlResponse withOrderId(String value) {
        return HPLOMUrlResponse.newBuilder()
            .mergeFrom(this)
            .setOrderId(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<HPLOMUrlResponse> cachedSchema() {
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
        HPLOMUrlResponse that = (HPLOMUrlResponse) obj;
        if (!java.util.Objects.equals(this.url, that.url)) {
            return false;
        }
        if (!java.util.Objects.equals(this.orderId, that.orderId)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.url == null ? 0 : this.url.hashCode());
        result = 31 * result + (this.orderId == null ? 0 : this.orderId.hashCode());

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
        return "HPLOMUrlResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<HPLOMUrlResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("url", 1);
        	__fieldMap.put("orderId", 2);
        }

        @Override
        public HPLOMUrlResponse newMessage() {
            return new HPLOMUrlResponse();
        }

        @Override
        public Class<HPLOMUrlResponse> typeClass() {
            return HPLOMUrlResponse.class;
        }

        @Override
        public String messageName() {
            return HPLOMUrlResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return HPLOMUrlResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(HPLOMUrlResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, HPLOMUrlResponse instance) throws java.io.IOException {
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
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, HPLOMUrlResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.url, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.orderId, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "url";
        		case 2: return "orderId";
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

        private int __bitField0;

        private Builder() {
            this.url = "";
            this.orderId = "";
        }

        public Builder mergeFrom(HPLOMUrlResponse instance) {
            if (instance.hasUrl()) {
                this.setUrl(instance.getUrl());
            }

            if (instance.hasOrderId()) {
                this.setOrderId(instance.getOrderId());
            }

            return this;
        }

        public String getUrl() {
            return url;
        }

        public Builder setUrl(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HPLOMUrlResponse#url to null");
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
                throw new NullPointerException("Cannot set HPLOMUrlResponse#orderId to null");
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

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.url == null ? 0 : this.url.hashCode());
            result = 31 * result + (this.orderId == null ? 0 : this.orderId.hashCode());

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
            return "HPLOMUrlResponse{" + String.join(", ", parts) + "}";
        }

        public HPLOMUrlResponse build() {
            proto.message.HPLOMUrlResponse result = new proto.message.HPLOMUrlResponse();
            result.__bitField0 = __bitField0;
            result.url = this.url;
            result.orderId = this.orderId;
            return result;
        }

    }



}