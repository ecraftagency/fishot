package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class CannonUnlockRequest
        implements io.protostuff.Message<CannonUnlockRequest> {

    private static final CannonUnlockRequest DEFAULT_INSTANCE = newBuilder().build();

    private int baseId;

    private boolean __merge_lock = false;
    private int __bitField0;

    private CannonUnlockRequest() {
        this.baseId = 0;
    }

    private CannonUnlockRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static CannonUnlockRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<CannonUnlockRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getBaseId() {
        return baseId;
    }

    public boolean hasBaseId() {
        return (__bitField0 & 1) == 1;
    }

    public CannonUnlockRequest withBaseId(int value) {
        return CannonUnlockRequest.newBuilder()
            .mergeFrom(this)
            .setBaseId(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<CannonUnlockRequest> cachedSchema() {
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
        CannonUnlockRequest that = (CannonUnlockRequest) obj;
        if (!java.util.Objects.equals(this.baseId, that.baseId)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.baseId);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasBaseId()) {
            parts.add("baseId=" + getBaseId());
        }
        return "CannonUnlockRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<CannonUnlockRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("baseId", 1);
        }

        @Override
        public CannonUnlockRequest newMessage() {
            return new CannonUnlockRequest();
        }

        @Override
        public Class<CannonUnlockRequest> typeClass() {
            return CannonUnlockRequest.class;
        }

        @Override
        public String messageName() {
            return CannonUnlockRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return CannonUnlockRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(CannonUnlockRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, CannonUnlockRequest instance) throws java.io.IOException {
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
                    	instance.baseId = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, CannonUnlockRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.baseId, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "baseId";
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

        private int baseId;

        private int __bitField0;

        private Builder() {
            this.baseId = 0;
        }

        public Builder mergeFrom(CannonUnlockRequest instance) {
            if (instance.hasBaseId()) {
                this.setBaseId(instance.getBaseId());
            }

            return this;
        }

        public int getBaseId() {
            return baseId;
        }

        public Builder setBaseId(int value) {
            this.baseId = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearBaseId() {
            this.baseId = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasBaseId() {
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
            if (!java.util.Objects.equals(this.baseId, that.baseId)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.baseId);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasBaseId()) {
                parts.add("baseId=" + getBaseId());
            }
            return "CannonUnlockRequest{" + String.join(", ", parts) + "}";
        }

        public CannonUnlockRequest build() {
            proto.message.CannonUnlockRequest result = new proto.message.CannonUnlockRequest();
            result.__bitField0 = __bitField0;
            result.baseId = this.baseId;
            return result;
        }

    }



}