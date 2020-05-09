package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class ClaimInboxResponse
        implements io.protostuff.Message<ClaimInboxResponse> {

    private static final ClaimInboxResponse DEFAULT_INSTANCE = newBuilder().build();

    private int code;

    private int inboxID;

    private proto.message.InboxObject inboxObj;

    private boolean __merge_lock = false;
    private int __bitField0;

    private ClaimInboxResponse() {
        this.code = proto.message.ProfileResultCode.PROFILE_CLAIM_INBOX_OK.getNumber();
        this.inboxID = 0;
        this.inboxObj = proto.message.InboxObject.getDefaultInstance();
    }

    private ClaimInboxResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ClaimInboxResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<ClaimInboxResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public proto.message.ProfileResultCode getCode() {
        return proto.message.ProfileResultCode.valueOf(code);
    }

    public int getCodeValue() {
        return code;
    }

    public boolean hasCode() {
        return (__bitField0 & 1) == 1;
    }

    public ClaimInboxResponse withCode(proto.message.ProfileResultCode value) {
        return ClaimInboxResponse.newBuilder()
            .mergeFrom(this)
            .setCode(value)
            .build();
    }

    public int getInboxID() {
        return inboxID;
    }

    public boolean hasInboxID() {
        return (__bitField0 & 2) == 2;
    }

    public ClaimInboxResponse withInboxID(int value) {
        return ClaimInboxResponse.newBuilder()
            .mergeFrom(this)
            .setInboxID(value)
            .build();
    }

    public proto.message.InboxObject getInboxObj() {
        return inboxObj;
    }

    public boolean hasInboxObj() {
        return (__bitField0 & 4) == 4;
    }

    public ClaimInboxResponse withInboxObj(proto.message.InboxObject value) {
        return ClaimInboxResponse.newBuilder()
            .mergeFrom(this)
            .setInboxObj(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<ClaimInboxResponse> cachedSchema() {
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
        ClaimInboxResponse that = (ClaimInboxResponse) obj;
        if (!java.util.Objects.equals(this.code, that.code)) {
            return false;
        }
        if (!java.util.Objects.equals(this.inboxID, that.inboxID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.inboxObj, that.inboxObj)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.code);
        result = 31 * result + Integer.hashCode(this.inboxID);
        result = 31 * result + (this.inboxObj == null ? 0 : this.inboxObj.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasCode()) {
            parts.add("code=" + getCode() + '(' + getCodeValue() + ')');
        }
        if (hasInboxID()) {
            parts.add("inboxID=" + getInboxID());
        }
        if (hasInboxObj()) {
            parts.add("inboxObj=" + getInboxObj());
        }
        return "ClaimInboxResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<ClaimInboxResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("code", 1);
        	__fieldMap.put("inboxID", 2);
        	__fieldMap.put("inboxObj", 3);
        }

        @Override
        public ClaimInboxResponse newMessage() {
            return new ClaimInboxResponse();
        }

        @Override
        public Class<ClaimInboxResponse> typeClass() {
            return ClaimInboxResponse.class;
        }

        @Override
        public String messageName() {
            return ClaimInboxResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return ClaimInboxResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(ClaimInboxResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, ClaimInboxResponse instance) throws java.io.IOException {
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
                    	instance.code = input.readEnum();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.inboxID = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.inboxObj = input.mergeObject(null, proto.message.InboxObject.getSchema());
                    	instance.__bitField0 |= 4;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, ClaimInboxResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.code, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.inboxID, false);
            }

            if((instance.__bitField0 & 4) == 4) {
            	output.writeObject(3, instance.inboxObj, proto.message.InboxObject.getSchema(), false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "code";
        		case 2: return "inboxID";
        		case 3: return "inboxObj";
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

        private int code;

        private int inboxID;

        private proto.message.InboxObject inboxObj;

        private int __bitField0;

        private Builder() {
            this.code = proto.message.ProfileResultCode.PROFILE_CLAIM_INBOX_OK.getNumber();
            this.inboxID = 0;
            this.inboxObj = proto.message.InboxObject.getDefaultInstance();
        }

        public Builder mergeFrom(ClaimInboxResponse instance) {
            if (instance.hasCode()) {
                this.setCode(instance.getCode());
            }

            if (instance.hasInboxID()) {
                this.setInboxID(instance.getInboxID());
            }

            if (instance.hasInboxObj()) {
                this.setInboxObj(instance.getInboxObj());
            }

            return this;
        }

        public proto.message.ProfileResultCode getCode() {
            return proto.message.ProfileResultCode.valueOf(code);
        }

        public int getCodeValue() {
            return code;
        }

        public Builder setCode(proto.message.ProfileResultCode value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ClaimInboxResponse#code to null");
            }

            if (value == proto.message.ProfileResultCode.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set ClaimInboxResponse#code to UNRECOGNIZED");
            }

            this.code = value.getNumber();
            __bitField0 |= 1;
            return this;
        }

        public Builder setCodeValue(int value) {
            this.code = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearCode() {
            this.code = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasCode() {
            return (__bitField0 & 1) == 1;
        }

        public int getInboxID() {
            return inboxID;
        }

        public Builder setInboxID(int value) {
            this.inboxID = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearInboxID() {
            this.inboxID = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasInboxID() {
            return (__bitField0 & 2) == 2;
        }

        public proto.message.InboxObject getInboxObj() {
            return inboxObj;
        }

        public Builder setInboxObj(proto.message.InboxObject value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ClaimInboxResponse#inboxObj to null");
            }

            this.inboxObj = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearInboxObj() {
            this.inboxObj = proto.message.InboxObject.getDefaultInstance();
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasInboxObj() {
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
            if (!java.util.Objects.equals(this.code, that.code)) {
                return false;
            }
            if (!java.util.Objects.equals(this.inboxID, that.inboxID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.inboxObj, that.inboxObj)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.code);
            result = 31 * result + Integer.hashCode(this.inboxID);
            result = 31 * result + (this.inboxObj == null ? 0 : this.inboxObj.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasCode()) {
                parts.add("code=" + getCode() + '(' + getCodeValue() + ')');
            }
            if (hasInboxID()) {
                parts.add("inboxID=" + getInboxID());
            }
            if (hasInboxObj()) {
                parts.add("inboxObj=" + getInboxObj());
            }
            return "ClaimInboxResponse{" + String.join(", ", parts) + "}";
        }

        public ClaimInboxResponse build() {
            proto.message.ClaimInboxResponse result = new proto.message.ClaimInboxResponse();
            result.__bitField0 = __bitField0;
            result.code = this.code;
            result.inboxID = this.inboxID;
            result.inboxObj = this.inboxObj;
            return result;
        }

    }



}