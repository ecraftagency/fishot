package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public final class SnsServerTokenResponse
        implements io.protostuff.Message<SnsServerTokenResponse> {

    private static final SnsServerTokenResponse DEFAULT_INSTANCE = newBuilder().build();

    private String serverToken;

    private boolean __merge_lock = false;
    private int __bitField0;

    private SnsServerTokenResponse() {
        this.serverToken = "";
    }

    private SnsServerTokenResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static SnsServerTokenResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<SnsServerTokenResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getServerToken() {
        return serverToken;
    }

    public boolean hasServerToken() {
        return (__bitField0 & 1) == 1;
    }

    public SnsServerTokenResponse withServerToken(String value) {
        return SnsServerTokenResponse.newBuilder()
            .mergeFrom(this)
            .setServerToken(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<SnsServerTokenResponse> cachedSchema() {
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
        SnsServerTokenResponse that = (SnsServerTokenResponse) obj;
        if (!java.util.Objects.equals(this.serverToken, that.serverToken)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.serverToken == null ? 0 : this.serverToken.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasServerToken()) {
            parts.add("serverToken=" + getServerToken());
        }
        return "SnsServerTokenResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<SnsServerTokenResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("serverToken", 1);
        }

        @Override
        public SnsServerTokenResponse newMessage() {
            return new SnsServerTokenResponse();
        }

        @Override
        public Class<SnsServerTokenResponse> typeClass() {
            return SnsServerTokenResponse.class;
        }

        @Override
        public String messageName() {
            return SnsServerTokenResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return SnsServerTokenResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(SnsServerTokenResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, SnsServerTokenResponse instance) throws java.io.IOException {
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
                    	instance.serverToken = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, SnsServerTokenResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.serverToken, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "serverToken";
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

        private String serverToken;

        private int __bitField0;

        private Builder() {
            this.serverToken = "";
        }

        public Builder mergeFrom(SnsServerTokenResponse instance) {
            if (instance.hasServerToken()) {
                this.setServerToken(instance.getServerToken());
            }

            return this;
        }

        public String getServerToken() {
            return serverToken;
        }

        public Builder setServerToken(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SnsServerTokenResponse#serverToken to null");
            }

            this.serverToken = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearServerToken() {
            this.serverToken = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasServerToken() {
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
            if (!java.util.Objects.equals(this.serverToken, that.serverToken)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.serverToken == null ? 0 : this.serverToken.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasServerToken()) {
                parts.add("serverToken=" + getServerToken());
            }
            return "SnsServerTokenResponse{" + String.join(", ", parts) + "}";
        }

        public SnsServerTokenResponse build() {
            proto.message.SnsServerTokenResponse result = new proto.message.SnsServerTokenResponse();
            result.__bitField0 = __bitField0;
            result.serverToken = this.serverToken;
            return result;
        }

    }



}