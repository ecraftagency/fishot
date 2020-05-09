package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class UpdateProfileFBResponse
        implements io.protostuff.Message<UpdateProfileFBResponse> {

    private static final UpdateProfileFBResponse DEFAULT_INSTANCE = newBuilder().build();

    private int result;

    private String snsServerToken;

    private boolean __merge_lock = false;
    private int __bitField0;

    private UpdateProfileFBResponse() {
        this.result = proto.message.ProfileResultCode.PROFILE_CLAIM_INBOX_OK.getNumber();
        this.snsServerToken = "";
    }

    private UpdateProfileFBResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static UpdateProfileFBResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<UpdateProfileFBResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public proto.message.ProfileResultCode getResult() {
        return proto.message.ProfileResultCode.valueOf(result);
    }

    public int getResultValue() {
        return result;
    }

    public boolean hasResult() {
        return (__bitField0 & 1) == 1;
    }

    public UpdateProfileFBResponse withResult(proto.message.ProfileResultCode value) {
        return UpdateProfileFBResponse.newBuilder()
            .mergeFrom(this)
            .setResult(value)
            .build();
    }

    public String getSnsServerToken() {
        return snsServerToken;
    }

    public boolean hasSnsServerToken() {
        return (__bitField0 & 2) == 2;
    }

    public UpdateProfileFBResponse withSnsServerToken(String value) {
        return UpdateProfileFBResponse.newBuilder()
            .mergeFrom(this)
            .setSnsServerToken(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<UpdateProfileFBResponse> cachedSchema() {
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
        UpdateProfileFBResponse that = (UpdateProfileFBResponse) obj;
        if (!java.util.Objects.equals(this.result, that.result)) {
            return false;
        }
        if (!java.util.Objects.equals(this.snsServerToken, that.snsServerToken)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.result);
        result = 31 * result + (this.snsServerToken == null ? 0 : this.snsServerToken.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasResult()) {
            parts.add("result=" + getResult() + '(' + getResultValue() + ')');
        }
        if (hasSnsServerToken()) {
            parts.add("snsServerToken=" + getSnsServerToken());
        }
        return "UpdateProfileFBResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<UpdateProfileFBResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("result", 1);
        	__fieldMap.put("snsServerToken", 2);
        }

        @Override
        public UpdateProfileFBResponse newMessage() {
            return new UpdateProfileFBResponse();
        }

        @Override
        public Class<UpdateProfileFBResponse> typeClass() {
            return UpdateProfileFBResponse.class;
        }

        @Override
        public String messageName() {
            return UpdateProfileFBResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return UpdateProfileFBResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(UpdateProfileFBResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, UpdateProfileFBResponse instance) throws java.io.IOException {
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
                    	instance.result = input.readEnum();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.snsServerToken = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, UpdateProfileFBResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.result, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.snsServerToken, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "result";
        		case 2: return "snsServerToken";
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

        private int result;

        private String snsServerToken;

        private int __bitField0;

        private Builder() {
            this.result = proto.message.ProfileResultCode.PROFILE_CLAIM_INBOX_OK.getNumber();
            this.snsServerToken = "";
        }

        public Builder mergeFrom(UpdateProfileFBResponse instance) {
            if (instance.hasResult()) {
                this.setResult(instance.getResult());
            }

            if (instance.hasSnsServerToken()) {
                this.setSnsServerToken(instance.getSnsServerToken());
            }

            return this;
        }

        public proto.message.ProfileResultCode getResult() {
            return proto.message.ProfileResultCode.valueOf(result);
        }

        public int getResultValue() {
            return result;
        }

        public Builder setResult(proto.message.ProfileResultCode value) {
            if (value == null) {
                throw new NullPointerException("Cannot set UpdateProfileFBResponse#result to null");
            }

            if (value == proto.message.ProfileResultCode.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set UpdateProfileFBResponse#result to UNRECOGNIZED");
            }

            this.result = value.getNumber();
            __bitField0 |= 1;
            return this;
        }

        public Builder setResultValue(int value) {
            this.result = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearResult() {
            this.result = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasResult() {
            return (__bitField0 & 1) == 1;
        }

        public String getSnsServerToken() {
            return snsServerToken;
        }

        public Builder setSnsServerToken(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set UpdateProfileFBResponse#snsServerToken to null");
            }

            this.snsServerToken = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearSnsServerToken() {
            this.snsServerToken = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasSnsServerToken() {
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
            if (!java.util.Objects.equals(this.result, that.result)) {
                return false;
            }
            if (!java.util.Objects.equals(this.snsServerToken, that.snsServerToken)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.result);
            result = 31 * result + (this.snsServerToken == null ? 0 : this.snsServerToken.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasResult()) {
                parts.add("result=" + getResult() + '(' + getResultValue() + ')');
            }
            if (hasSnsServerToken()) {
                parts.add("snsServerToken=" + getSnsServerToken());
            }
            return "UpdateProfileFBResponse{" + String.join(", ", parts) + "}";
        }

        public UpdateProfileFBResponse build() {
            proto.message.UpdateProfileFBResponse result = new proto.message.UpdateProfileFBResponse();
            result.__bitField0 = __bitField0;
            result.result = this.result;
            result.snsServerToken = this.snsServerToken;
            return result;
        }

    }



}