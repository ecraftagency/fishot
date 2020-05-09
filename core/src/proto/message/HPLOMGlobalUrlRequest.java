package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_happy_play.proto")
public final class HPLOMGlobalUrlRequest
        implements io.protostuff.Message<HPLOMGlobalUrlRequest> {

    private static final HPLOMGlobalUrlRequest DEFAULT_INSTANCE = newBuilder().build();

    private String itemId;

    private boolean __merge_lock = false;
    private int __bitField0;

    private HPLOMGlobalUrlRequest() {
        this.itemId = "";
    }

    private HPLOMGlobalUrlRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static HPLOMGlobalUrlRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<HPLOMGlobalUrlRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getItemId() {
        return itemId;
    }

    public boolean hasItemId() {
        return (__bitField0 & 1) == 1;
    }

    public HPLOMGlobalUrlRequest withItemId(String value) {
        return HPLOMGlobalUrlRequest.newBuilder()
            .mergeFrom(this)
            .setItemId(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<HPLOMGlobalUrlRequest> cachedSchema() {
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
        HPLOMGlobalUrlRequest that = (HPLOMGlobalUrlRequest) obj;
        if (!java.util.Objects.equals(this.itemId, that.itemId)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.itemId == null ? 0 : this.itemId.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasItemId()) {
            parts.add("itemId=" + getItemId());
        }
        return "HPLOMGlobalUrlRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<HPLOMGlobalUrlRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("itemId", 1);
        }

        @Override
        public HPLOMGlobalUrlRequest newMessage() {
            return new HPLOMGlobalUrlRequest();
        }

        @Override
        public Class<HPLOMGlobalUrlRequest> typeClass() {
            return HPLOMGlobalUrlRequest.class;
        }

        @Override
        public String messageName() {
            return HPLOMGlobalUrlRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return HPLOMGlobalUrlRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(HPLOMGlobalUrlRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, HPLOMGlobalUrlRequest instance) throws java.io.IOException {
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
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, HPLOMGlobalUrlRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.itemId, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "itemId";
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

        private int __bitField0;

        private Builder() {
            this.itemId = "";
        }

        public Builder mergeFrom(HPLOMGlobalUrlRequest instance) {
            if (instance.hasItemId()) {
                this.setItemId(instance.getItemId());
            }

            return this;
        }

        public String getItemId() {
            return itemId;
        }

        public Builder setItemId(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HPLOMGlobalUrlRequest#itemId to null");
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

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.itemId == null ? 0 : this.itemId.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasItemId()) {
                parts.add("itemId=" + getItemId());
            }
            return "HPLOMGlobalUrlRequest{" + String.join(", ", parts) + "}";
        }

        public HPLOMGlobalUrlRequest build() {
            proto.message.HPLOMGlobalUrlRequest result = new proto.message.HPLOMGlobalUrlRequest();
            result.__bitField0 = __bitField0;
            result.itemId = this.itemId;
            return result;
        }

    }



}