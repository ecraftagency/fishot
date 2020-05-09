package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class DailyQuestReceiveResponse
        implements io.protostuff.Message<DailyQuestReceiveResponse> {

    private static final DailyQuestReceiveResponse DEFAULT_INSTANCE = newBuilder().build();

    private int result;

    private proto.message.DailyQuestObject questObject;

    private boolean __merge_lock = false;
    private int __bitField0;

    private DailyQuestReceiveResponse() {
        this.result = proto.message.ProfileResultCode.PROFILE_CLAIM_INBOX_OK.getNumber();
        this.questObject = proto.message.DailyQuestObject.getDefaultInstance();
    }

    private DailyQuestReceiveResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static DailyQuestReceiveResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<DailyQuestReceiveResponse> getSchema()
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

    public DailyQuestReceiveResponse withResult(proto.message.ProfileResultCode value) {
        return DailyQuestReceiveResponse.newBuilder()
            .mergeFrom(this)
            .setResult(value)
            .build();
    }

    public proto.message.DailyQuestObject getQuestObject() {
        return questObject;
    }

    public boolean hasQuestObject() {
        return (__bitField0 & 2) == 2;
    }

    public DailyQuestReceiveResponse withQuestObject(proto.message.DailyQuestObject value) {
        return DailyQuestReceiveResponse.newBuilder()
            .mergeFrom(this)
            .setQuestObject(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<DailyQuestReceiveResponse> cachedSchema() {
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
        DailyQuestReceiveResponse that = (DailyQuestReceiveResponse) obj;
        if (!java.util.Objects.equals(this.result, that.result)) {
            return false;
        }
        if (!java.util.Objects.equals(this.questObject, that.questObject)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.result);
        result = 31 * result + (this.questObject == null ? 0 : this.questObject.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasResult()) {
            parts.add("result=" + getResult() + '(' + getResultValue() + ')');
        }
        if (hasQuestObject()) {
            parts.add("questObject=" + getQuestObject());
        }
        return "DailyQuestReceiveResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<DailyQuestReceiveResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("result", 1);
        	__fieldMap.put("questObject", 2);
        }

        @Override
        public DailyQuestReceiveResponse newMessage() {
            return new DailyQuestReceiveResponse();
        }

        @Override
        public Class<DailyQuestReceiveResponse> typeClass() {
            return DailyQuestReceiveResponse.class;
        }

        @Override
        public String messageName() {
            return DailyQuestReceiveResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return DailyQuestReceiveResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(DailyQuestReceiveResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, DailyQuestReceiveResponse instance) throws java.io.IOException {
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
                    	instance.questObject = input.mergeObject(null, proto.message.DailyQuestObject.getSchema());
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, DailyQuestReceiveResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.result, false);
            }

            if((instance.__bitField0 & 2) == 2) {
            	output.writeObject(2, instance.questObject, proto.message.DailyQuestObject.getSchema(), false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "result";
        		case 2: return "questObject";
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

        private proto.message.DailyQuestObject questObject;

        private int __bitField0;

        private Builder() {
            this.result = proto.message.ProfileResultCode.PROFILE_CLAIM_INBOX_OK.getNumber();
            this.questObject = proto.message.DailyQuestObject.getDefaultInstance();
        }

        public Builder mergeFrom(DailyQuestReceiveResponse instance) {
            if (instance.hasResult()) {
                this.setResult(instance.getResult());
            }

            if (instance.hasQuestObject()) {
                this.setQuestObject(instance.getQuestObject());
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
                throw new NullPointerException("Cannot set DailyQuestReceiveResponse#result to null");
            }

            if (value == proto.message.ProfileResultCode.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set DailyQuestReceiveResponse#result to UNRECOGNIZED");
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

        public proto.message.DailyQuestObject getQuestObject() {
            return questObject;
        }

        public Builder setQuestObject(proto.message.DailyQuestObject value) {
            if (value == null) {
                throw new NullPointerException("Cannot set DailyQuestReceiveResponse#questObject to null");
            }

            this.questObject = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearQuestObject() {
            this.questObject = proto.message.DailyQuestObject.getDefaultInstance();
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasQuestObject() {
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
            if (!java.util.Objects.equals(this.questObject, that.questObject)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.result);
            result = 31 * result + (this.questObject == null ? 0 : this.questObject.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasResult()) {
                parts.add("result=" + getResult() + '(' + getResultValue() + ')');
            }
            if (hasQuestObject()) {
                parts.add("questObject=" + getQuestObject());
            }
            return "DailyQuestReceiveResponse{" + String.join(", ", parts) + "}";
        }

        public DailyQuestReceiveResponse build() {
            proto.message.DailyQuestReceiveResponse result = new proto.message.DailyQuestReceiveResponse();
            result.__bitField0 = __bitField0;
            result.result = this.result;
            result.questObject = this.questObject;
            return result;
        }

    }



}