package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class ClaimInboxRequest
        implements io.protostuff.Message<ClaimInboxRequest> {

    private static final ClaimInboxRequest DEFAULT_INSTANCE = newBuilder().build();

    private int inboxID;

    private String optCode;

    private boolean __merge_lock = false;
    private int __bitField0;

    private ClaimInboxRequest() {
        this.inboxID = 0;
        this.optCode = "";
    }

    private ClaimInboxRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ClaimInboxRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<ClaimInboxRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getInboxID() {
        return inboxID;
    }

    public boolean hasInboxID() {
        return (__bitField0 & 1) == 1;
    }

    public ClaimInboxRequest withInboxID(int value) {
        return ClaimInboxRequest.newBuilder()
            .mergeFrom(this)
            .setInboxID(value)
            .build();
    }

    public String getOptCode() {
        return optCode;
    }

    public boolean hasOptCode() {
        return (__bitField0 & 2) == 2;
    }

    public ClaimInboxRequest withOptCode(String value) {
        return ClaimInboxRequest.newBuilder()
            .mergeFrom(this)
            .setOptCode(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<ClaimInboxRequest> cachedSchema() {
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
        ClaimInboxRequest that = (ClaimInboxRequest) obj;
        if (!java.util.Objects.equals(this.inboxID, that.inboxID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.optCode, that.optCode)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.inboxID);
        result = 31 * result + (this.optCode == null ? 0 : this.optCode.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasInboxID()) {
            parts.add("inboxID=" + getInboxID());
        }
        if (hasOptCode()) {
            parts.add("optCode=" + getOptCode());
        }
        return "ClaimInboxRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<ClaimInboxRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("inboxID", 1);
        	__fieldMap.put("optCode", 2);
        }

        @Override
        public ClaimInboxRequest newMessage() {
            return new ClaimInboxRequest();
        }

        @Override
        public Class<ClaimInboxRequest> typeClass() {
            return ClaimInboxRequest.class;
        }

        @Override
        public String messageName() {
            return ClaimInboxRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return ClaimInboxRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(ClaimInboxRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, ClaimInboxRequest instance) throws java.io.IOException {
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
                    	instance.inboxID = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.optCode = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, ClaimInboxRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.inboxID, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.optCode, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "inboxID";
        		case 2: return "optCode";
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

        private int inboxID;

        private String optCode;

        private int __bitField0;

        private Builder() {
            this.inboxID = 0;
            this.optCode = "";
        }

        public Builder mergeFrom(ClaimInboxRequest instance) {
            if (instance.hasInboxID()) {
                this.setInboxID(instance.getInboxID());
            }

            if (instance.hasOptCode()) {
                this.setOptCode(instance.getOptCode());
            }

            return this;
        }

        public int getInboxID() {
            return inboxID;
        }

        public Builder setInboxID(int value) {
            this.inboxID = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearInboxID() {
            this.inboxID = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasInboxID() {
            return (__bitField0 & 1) == 1;
        }

        public String getOptCode() {
            return optCode;
        }

        public Builder setOptCode(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ClaimInboxRequest#optCode to null");
            }

            this.optCode = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearOptCode() {
            this.optCode = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasOptCode() {
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
            if (!java.util.Objects.equals(this.inboxID, that.inboxID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.optCode, that.optCode)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.inboxID);
            result = 31 * result + (this.optCode == null ? 0 : this.optCode.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasInboxID()) {
                parts.add("inboxID=" + getInboxID());
            }
            if (hasOptCode()) {
                parts.add("optCode=" + getOptCode());
            }
            return "ClaimInboxRequest{" + String.join(", ", parts) + "}";
        }

        public ClaimInboxRequest build() {
            proto.message.ClaimInboxRequest result = new proto.message.ClaimInboxRequest();
            result.__bitField0 = __bitField0;
            result.inboxID = this.inboxID;
            result.optCode = this.optCode;
            return result;
        }

    }



}