package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public final class SnsServerTokenRequest
        implements io.protostuff.Message<SnsServerTokenRequest> {

    private static final SnsServerTokenRequest DEFAULT_INSTANCE = newBuilder().build();

    private String clientSnsId;

    private int clientSnsFlag;

    private String clientToken;

    private boolean __merge_lock = false;
    private int __bitField0;

    private SnsServerTokenRequest() {
        this.clientSnsId = "";
        this.clientSnsFlag = 0;
        this.clientToken = "";
    }

    private SnsServerTokenRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static SnsServerTokenRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<SnsServerTokenRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getClientSnsId() {
        return clientSnsId;
    }

    public boolean hasClientSnsId() {
        return (__bitField0 & 1) == 1;
    }

    public SnsServerTokenRequest withClientSnsId(String value) {
        return SnsServerTokenRequest.newBuilder()
            .mergeFrom(this)
            .setClientSnsId(value)
            .build();
    }

    public int getClientSnsFlag() {
        return clientSnsFlag;
    }

    public boolean hasClientSnsFlag() {
        return (__bitField0 & 2) == 2;
    }

    public SnsServerTokenRequest withClientSnsFlag(int value) {
        return SnsServerTokenRequest.newBuilder()
            .mergeFrom(this)
            .setClientSnsFlag(value)
            .build();
    }

    public String getClientToken() {
        return clientToken;
    }

    public boolean hasClientToken() {
        return (__bitField0 & 4) == 4;
    }

    public SnsServerTokenRequest withClientToken(String value) {
        return SnsServerTokenRequest.newBuilder()
            .mergeFrom(this)
            .setClientToken(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<SnsServerTokenRequest> cachedSchema() {
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
        SnsServerTokenRequest that = (SnsServerTokenRequest) obj;
        if (!java.util.Objects.equals(this.clientSnsId, that.clientSnsId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.clientSnsFlag, that.clientSnsFlag)) {
            return false;
        }
        if (!java.util.Objects.equals(this.clientToken, that.clientToken)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.clientSnsId == null ? 0 : this.clientSnsId.hashCode());
        result = 31 * result + Integer.hashCode(this.clientSnsFlag);
        result = 31 * result + (this.clientToken == null ? 0 : this.clientToken.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasClientSnsId()) {
            parts.add("clientSnsId=" + getClientSnsId());
        }
        if (hasClientSnsFlag()) {
            parts.add("clientSnsFlag=" + getClientSnsFlag());
        }
        if (hasClientToken()) {
            parts.add("clientToken=" + getClientToken());
        }
        return "SnsServerTokenRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<SnsServerTokenRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("clientSnsId", 1);
        	__fieldMap.put("clientSnsFlag", 2);
        	__fieldMap.put("clientToken", 3);
        }

        @Override
        public SnsServerTokenRequest newMessage() {
            return new SnsServerTokenRequest();
        }

        @Override
        public Class<SnsServerTokenRequest> typeClass() {
            return SnsServerTokenRequest.class;
        }

        @Override
        public String messageName() {
            return SnsServerTokenRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return SnsServerTokenRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(SnsServerTokenRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, SnsServerTokenRequest instance) throws java.io.IOException {
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
                    	instance.clientSnsId = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.clientSnsFlag = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.clientToken = input.readString();
                    	instance.__bitField0 |= 4;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, SnsServerTokenRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.clientSnsId, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.clientSnsFlag, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeString(3, instance.clientToken, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "clientSnsId";
        		case 2: return "clientSnsFlag";
        		case 3: return "clientToken";
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

        private String clientSnsId;

        private int clientSnsFlag;

        private String clientToken;

        private int __bitField0;

        private Builder() {
            this.clientSnsId = "";
            this.clientSnsFlag = 0;
            this.clientToken = "";
        }

        public Builder mergeFrom(SnsServerTokenRequest instance) {
            if (instance.hasClientSnsId()) {
                this.setClientSnsId(instance.getClientSnsId());
            }

            if (instance.hasClientSnsFlag()) {
                this.setClientSnsFlag(instance.getClientSnsFlag());
            }

            if (instance.hasClientToken()) {
                this.setClientToken(instance.getClientToken());
            }

            return this;
        }

        public String getClientSnsId() {
            return clientSnsId;
        }

        public Builder setClientSnsId(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SnsServerTokenRequest#clientSnsId to null");
            }

            this.clientSnsId = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearClientSnsId() {
            this.clientSnsId = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasClientSnsId() {
            return (__bitField0 & 1) == 1;
        }

        public int getClientSnsFlag() {
            return clientSnsFlag;
        }

        public Builder setClientSnsFlag(int value) {
            this.clientSnsFlag = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearClientSnsFlag() {
            this.clientSnsFlag = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasClientSnsFlag() {
            return (__bitField0 & 2) == 2;
        }

        public String getClientToken() {
            return clientToken;
        }

        public Builder setClientToken(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SnsServerTokenRequest#clientToken to null");
            }

            this.clientToken = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearClientToken() {
            this.clientToken = "";
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasClientToken() {
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
            if (!java.util.Objects.equals(this.clientSnsId, that.clientSnsId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.clientSnsFlag, that.clientSnsFlag)) {
                return false;
            }
            if (!java.util.Objects.equals(this.clientToken, that.clientToken)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.clientSnsId == null ? 0 : this.clientSnsId.hashCode());
            result = 31 * result + Integer.hashCode(this.clientSnsFlag);
            result = 31 * result + (this.clientToken == null ? 0 : this.clientToken.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasClientSnsId()) {
                parts.add("clientSnsId=" + getClientSnsId());
            }
            if (hasClientSnsFlag()) {
                parts.add("clientSnsFlag=" + getClientSnsFlag());
            }
            if (hasClientToken()) {
                parts.add("clientToken=" + getClientToken());
            }
            return "SnsServerTokenRequest{" + String.join(", ", parts) + "}";
        }

        public SnsServerTokenRequest build() {
            proto.message.SnsServerTokenRequest result = new proto.message.SnsServerTokenRequest();
            result.__bitField0 = __bitField0;
            result.clientSnsId = this.clientSnsId;
            result.clientSnsFlag = this.clientSnsFlag;
            result.clientToken = this.clientToken;
            return result;
        }

    }



}