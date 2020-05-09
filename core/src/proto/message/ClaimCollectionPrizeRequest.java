package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class ClaimCollectionPrizeRequest
        implements io.protostuff.Message<ClaimCollectionPrizeRequest> {

    private static final ClaimCollectionPrizeRequest DEFAULT_INSTANCE = newBuilder().build();

    private int collectionId;

    private boolean __merge_lock = false;
    private int __bitField0;

    private ClaimCollectionPrizeRequest() {
        this.collectionId = 0;
    }

    private ClaimCollectionPrizeRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ClaimCollectionPrizeRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<ClaimCollectionPrizeRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getCollectionId() {
        return collectionId;
    }

    public boolean hasCollectionId() {
        return (__bitField0 & 1) == 1;
    }

    public ClaimCollectionPrizeRequest withCollectionId(int value) {
        return ClaimCollectionPrizeRequest.newBuilder()
            .mergeFrom(this)
            .setCollectionId(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<ClaimCollectionPrizeRequest> cachedSchema() {
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
        ClaimCollectionPrizeRequest that = (ClaimCollectionPrizeRequest) obj;
        if (!java.util.Objects.equals(this.collectionId, that.collectionId)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.collectionId);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasCollectionId()) {
            parts.add("collectionId=" + getCollectionId());
        }
        return "ClaimCollectionPrizeRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<ClaimCollectionPrizeRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("collectionId", 1);
        }

        @Override
        public ClaimCollectionPrizeRequest newMessage() {
            return new ClaimCollectionPrizeRequest();
        }

        @Override
        public Class<ClaimCollectionPrizeRequest> typeClass() {
            return ClaimCollectionPrizeRequest.class;
        }

        @Override
        public String messageName() {
            return ClaimCollectionPrizeRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return ClaimCollectionPrizeRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(ClaimCollectionPrizeRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, ClaimCollectionPrizeRequest instance) throws java.io.IOException {
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
                    	instance.collectionId = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, ClaimCollectionPrizeRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.collectionId, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "collectionId";
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

        private int collectionId;

        private int __bitField0;

        private Builder() {
            this.collectionId = 0;
        }

        public Builder mergeFrom(ClaimCollectionPrizeRequest instance) {
            if (instance.hasCollectionId()) {
                this.setCollectionId(instance.getCollectionId());
            }

            return this;
        }

        public int getCollectionId() {
            return collectionId;
        }

        public Builder setCollectionId(int value) {
            this.collectionId = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearCollectionId() {
            this.collectionId = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasCollectionId() {
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
            if (!java.util.Objects.equals(this.collectionId, that.collectionId)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.collectionId);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasCollectionId()) {
                parts.add("collectionId=" + getCollectionId());
            }
            return "ClaimCollectionPrizeRequest{" + String.join(", ", parts) + "}";
        }

        public ClaimCollectionPrizeRequest build() {
            proto.message.ClaimCollectionPrizeRequest result = new proto.message.ClaimCollectionPrizeRequest();
            result.__bitField0 = __bitField0;
            result.collectionId = this.collectionId;
            return result;
        }

    }



}