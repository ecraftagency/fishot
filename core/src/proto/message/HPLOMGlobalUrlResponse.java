package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_happy_play.proto")
public final class HPLOMGlobalUrlResponse
        implements io.protostuff.Message<HPLOMGlobalUrlResponse> {

    private static final HPLOMGlobalUrlResponse DEFAULT_INSTANCE = newBuilder().build();

    private String url;

    private String orderId;

    private String parameters;

    private boolean __merge_lock = false;
    private int __bitField0;

    private HPLOMGlobalUrlResponse() {
        this.url = "";
        this.orderId = "";
        this.parameters = "";
    }

    private HPLOMGlobalUrlResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static HPLOMGlobalUrlResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<HPLOMGlobalUrlResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getUrl() {
        return url;
    }

    public boolean hasUrl() {
        return (__bitField0 & 1) == 1;
    }

    public HPLOMGlobalUrlResponse withUrl(String value) {
        return HPLOMGlobalUrlResponse.newBuilder()
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

    public HPLOMGlobalUrlResponse withOrderId(String value) {
        return HPLOMGlobalUrlResponse.newBuilder()
            .mergeFrom(this)
            .setOrderId(value)
            .build();
    }

    public String getParameters() {
        return parameters;
    }

    public boolean hasParameters() {
        return (__bitField0 & 4) == 4;
    }

    public HPLOMGlobalUrlResponse withParameters(String value) {
        return HPLOMGlobalUrlResponse.newBuilder()
            .mergeFrom(this)
            .setParameters(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<HPLOMGlobalUrlResponse> cachedSchema() {
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
        HPLOMGlobalUrlResponse that = (HPLOMGlobalUrlResponse) obj;
        if (!java.util.Objects.equals(this.url, that.url)) {
            return false;
        }
        if (!java.util.Objects.equals(this.orderId, that.orderId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.parameters, that.parameters)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.url == null ? 0 : this.url.hashCode());
        result = 31 * result + (this.orderId == null ? 0 : this.orderId.hashCode());
        result = 31 * result + (this.parameters == null ? 0 : this.parameters.hashCode());

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
        if (hasParameters()) {
            parts.add("parameters=" + getParameters());
        }
        return "HPLOMGlobalUrlResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<HPLOMGlobalUrlResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("url", 1);
        	__fieldMap.put("orderId", 2);
        	__fieldMap.put("parameters", 3);
        }

        @Override
        public HPLOMGlobalUrlResponse newMessage() {
            return new HPLOMGlobalUrlResponse();
        }

        @Override
        public Class<HPLOMGlobalUrlResponse> typeClass() {
            return HPLOMGlobalUrlResponse.class;
        }

        @Override
        public String messageName() {
            return HPLOMGlobalUrlResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return HPLOMGlobalUrlResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(HPLOMGlobalUrlResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, HPLOMGlobalUrlResponse instance) throws java.io.IOException {
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
                    	instance.parameters = input.readString();
                    	instance.__bitField0 |= 4;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, HPLOMGlobalUrlResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.url, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.orderId, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeString(3, instance.parameters, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "url";
        		case 2: return "orderId";
        		case 3: return "parameters";
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

        private String parameters;

        private int __bitField0;

        private Builder() {
            this.url = "";
            this.orderId = "";
            this.parameters = "";
        }

        public Builder mergeFrom(HPLOMGlobalUrlResponse instance) {
            if (instance.hasUrl()) {
                this.setUrl(instance.getUrl());
            }

            if (instance.hasOrderId()) {
                this.setOrderId(instance.getOrderId());
            }

            if (instance.hasParameters()) {
                this.setParameters(instance.getParameters());
            }

            return this;
        }

        public String getUrl() {
            return url;
        }

        public Builder setUrl(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HPLOMGlobalUrlResponse#url to null");
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
                throw new NullPointerException("Cannot set HPLOMGlobalUrlResponse#orderId to null");
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

        public String getParameters() {
            return parameters;
        }

        public Builder setParameters(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HPLOMGlobalUrlResponse#parameters to null");
            }

            this.parameters = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearParameters() {
            this.parameters = "";
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasParameters() {
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
            if (!java.util.Objects.equals(this.parameters, that.parameters)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.url == null ? 0 : this.url.hashCode());
            result = 31 * result + (this.orderId == null ? 0 : this.orderId.hashCode());
            result = 31 * result + (this.parameters == null ? 0 : this.parameters.hashCode());

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
            if (hasParameters()) {
                parts.add("parameters=" + getParameters());
            }
            return "HPLOMGlobalUrlResponse{" + String.join(", ", parts) + "}";
        }

        public HPLOMGlobalUrlResponse build() {
            proto.message.HPLOMGlobalUrlResponse result = new proto.message.HPLOMGlobalUrlResponse();
            result.__bitField0 = __bitField0;
            result.url = this.url;
            result.orderId = this.orderId;
            result.parameters = this.parameters;
            return result;
        }

    }



}