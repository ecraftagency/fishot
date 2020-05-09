package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_happy_play.proto")
public final class HPLOMUrlRequest
        implements io.protostuff.Message<HPLOMUrlRequest> {

    private static final HPLOMUrlRequest DEFAULT_INSTANCE = newBuilder().build();

    private String itemId;

    private boolean __merge_lock = false;
    private int __bitField0;

    private HPLOMUrlRequest() {
        this.itemId = "";
    }

    private HPLOMUrlRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static HPLOMUrlRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<HPLOMUrlRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getItemId() {
        return itemId;
    }

    public boolean hasItemId() {
        return (__bitField0 & 1) == 1;
    }

    public HPLOMUrlRequest withItemId(String value) {
        return HPLOMUrlRequest.newBuilder()
            .mergeFrom(this)
            .setItemId(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<HPLOMUrlRequest> cachedSchema() {
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
        HPLOMUrlRequest that = (HPLOMUrlRequest) obj;
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
        return "HPLOMUrlRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<HPLOMUrlRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("itemId", 1);
        }

        @Override
        public HPLOMUrlRequest newMessage() {
            return new HPLOMUrlRequest();
        }

        @Override
        public Class<HPLOMUrlRequest> typeClass() {
            return HPLOMUrlRequest.class;
        }

        @Override
        public String messageName() {
            return HPLOMUrlRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return HPLOMUrlRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(HPLOMUrlRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, HPLOMUrlRequest instance) throws java.io.IOException {
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
        public void writeTo(io.protostuff.Output output, HPLOMUrlRequest instance) throws java.io.IOException {
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

        public Builder mergeFrom(HPLOMUrlRequest instance) {
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
                throw new NullPointerException("Cannot set HPLOMUrlRequest#itemId to null");
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
            return "HPLOMUrlRequest{" + String.join(", ", parts) + "}";
        }

        public HPLOMUrlRequest build() {
            proto.message.HPLOMUrlRequest result = new proto.message.HPLOMUrlRequest();
            result.__bitField0 = __bitField0;
            result.itemId = this.itemId;
            return result;
        }

    }



}