package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_happy_play.proto")
public final class HPCDBuyRequest
        implements io.protostuff.Message<HPCDBuyRequest> {

    private static final HPCDBuyRequest DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<String> orderId;

    private boolean __merge_lock = false;
    private int __bitField0;

    private HPCDBuyRequest() {
        this.orderId = java.util.Collections.emptyList();
    }

    private HPCDBuyRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static HPCDBuyRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<HPCDBuyRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<String> getOrderIdList() {
        return orderId;
    }

    public int getOrderIdCount() {
        return orderId.size();
    }

    public String getOrderId(int index) {
        return orderId.get(index);
    }

    public HPCDBuyRequest withOrderId(java.util.List<String> value) {
        return HPCDBuyRequest.newBuilder()
            .mergeFrom(this)
            .clearOrderId()
            .addAllOrderId(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<HPCDBuyRequest> cachedSchema() {
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
        HPCDBuyRequest that = (HPCDBuyRequest) obj;
        if (!java.util.Objects.equals(this.orderId, that.orderId)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.orderId == null ? 0 : this.orderId.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!orderId.isEmpty()) {
            parts.add("orderId=" + getOrderIdList());
        }
        return "HPCDBuyRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<HPCDBuyRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("orderId", 1);
        }

        @Override
        public HPCDBuyRequest newMessage() {
            return new HPCDBuyRequest();
        }

        @Override
        public Class<HPCDBuyRequest> typeClass() {
            return HPCDBuyRequest.class;
        }

        @Override
        public String messageName() {
            return HPCDBuyRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return HPCDBuyRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(HPCDBuyRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, HPCDBuyRequest instance) throws java.io.IOException {
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
                    	if(!((instance.__bitField0 & 1) == 1)) {
                    	    instance.orderId = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.orderId.add(input.readString());

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.orderId = java.util.Collections.unmodifiableList(instance.orderId);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, HPCDBuyRequest instance) throws java.io.IOException {
            for(String orderId : instance.orderId) {
                output.writeString(1, orderId, true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "orderId";
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

        private java.util.List<String> orderId;

        private int __bitField0;

        private Builder() {
            this.orderId = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(HPCDBuyRequest instance) {
            this.addAllOrderId(instance.getOrderIdList());

            return this;
        }

        public java.util.List<String> getOrderIdList() {
            return orderId;
        }

        public Builder setOrderId(int index, String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HPCDBuyRequest#orderId to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.orderId = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.orderId.set(index, value);
            return this;
        }

        public Builder addOrderId(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HPCDBuyRequest#orderId to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.orderId = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.orderId.add(value);
            return this;
        }

        public Builder addAllOrderId(java.lang.Iterable<String> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set HPCDBuyRequest#orderId to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.orderId = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final String value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set HPCDBuyRequest#orderId to null");
                }
                this.orderId.add(value);
            }
            return this;
        }

        public Builder clearOrderId() {
            this.orderId = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getOrderIdCount() {
            return orderId.size();
        }

        public String getOrderId(int index) {
            return orderId.get(index);
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
            if (!java.util.Objects.equals(this.orderId, that.orderId)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.orderId == null ? 0 : this.orderId.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!orderId.isEmpty()) {
                parts.add("orderId=" + getOrderIdList());
            }
            return "HPCDBuyRequest{" + String.join(", ", parts) + "}";
        }

        public HPCDBuyRequest build() {
            proto.message.HPCDBuyRequest result = new proto.message.HPCDBuyRequest();
            result.__bitField0 = __bitField0;
            result.orderId = java.util.Collections.unmodifiableList(this.orderId);
            return result;
        }

    }



}