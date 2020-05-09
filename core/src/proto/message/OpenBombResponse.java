package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class OpenBombResponse
        implements io.protostuff.Message<OpenBombResponse> {

    private static final OpenBombResponse DEFAULT_INSTANCE = newBuilder().build();

    private String userid;

    private int itemId;

    private int result;

    private boolean __merge_lock = false;
    private int __bitField0;

    private OpenBombResponse() {
        this.userid = "";
        this.itemId = 0;
        this.result = proto.message.InGameResultCode.JOIN_BOARD_SUCCESS_PLAY.getNumber();
    }

    private OpenBombResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static OpenBombResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<OpenBombResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getUserid() {
        return userid;
    }

    public boolean hasUserid() {
        return (__bitField0 & 1) == 1;
    }

    public OpenBombResponse withUserid(String value) {
        return OpenBombResponse.newBuilder()
            .mergeFrom(this)
            .setUserid(value)
            .build();
    }

    public int getItemId() {
        return itemId;
    }

    public boolean hasItemId() {
        return (__bitField0 & 2) == 2;
    }

    public OpenBombResponse withItemId(int value) {
        return OpenBombResponse.newBuilder()
            .mergeFrom(this)
            .setItemId(value)
            .build();
    }

    public proto.message.InGameResultCode getResult() {
        return proto.message.InGameResultCode.valueOf(result);
    }

    public int getResultValue() {
        return result;
    }

    public boolean hasResult() {
        return (__bitField0 & 4) == 4;
    }

    public OpenBombResponse withResult(proto.message.InGameResultCode value) {
        return OpenBombResponse.newBuilder()
            .mergeFrom(this)
            .setResult(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<OpenBombResponse> cachedSchema() {
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
        OpenBombResponse that = (OpenBombResponse) obj;
        if (!java.util.Objects.equals(this.userid, that.userid)) {
            return false;
        }
        if (!java.util.Objects.equals(this.itemId, that.itemId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.result, that.result)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.userid == null ? 0 : this.userid.hashCode());
        result = 31 * result + Integer.hashCode(this.itemId);
        result = 31 * result + Integer.hashCode(this.result);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasUserid()) {
            parts.add("userid=" + getUserid());
        }
        if (hasItemId()) {
            parts.add("itemId=" + getItemId());
        }
        if (hasResult()) {
            parts.add("result=" + getResult() + '(' + getResultValue() + ')');
        }
        return "OpenBombResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<OpenBombResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("userid", 1);
        	__fieldMap.put("itemId", 2);
        	__fieldMap.put("result", 3);
        }

        @Override
        public OpenBombResponse newMessage() {
            return new OpenBombResponse();
        }

        @Override
        public Class<OpenBombResponse> typeClass() {
            return OpenBombResponse.class;
        }

        @Override
        public String messageName() {
            return OpenBombResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return OpenBombResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(OpenBombResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, OpenBombResponse instance) throws java.io.IOException {
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
                    	instance.userid = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.itemId = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.result = input.readEnum();
                    	instance.__bitField0 |= 4;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, OpenBombResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.userid, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.itemId, false);
            }

            if((instance.__bitField0 & 4) == 4) {
            	output.writeEnum(3, instance.result, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "userid";
        		case 2: return "itemId";
        		case 3: return "result";
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

        private String userid;

        private int itemId;

        private int result;

        private int __bitField0;

        private Builder() {
            this.userid = "";
            this.itemId = 0;
            this.result = proto.message.InGameResultCode.JOIN_BOARD_SUCCESS_PLAY.getNumber();
        }

        public Builder mergeFrom(OpenBombResponse instance) {
            if (instance.hasUserid()) {
                this.setUserid(instance.getUserid());
            }

            if (instance.hasItemId()) {
                this.setItemId(instance.getItemId());
            }

            if (instance.hasResult()) {
                this.setResult(instance.getResult());
            }

            return this;
        }

        public String getUserid() {
            return userid;
        }

        public Builder setUserid(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set OpenBombResponse#userid to null");
            }

            this.userid = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearUserid() {
            this.userid = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasUserid() {
            return (__bitField0 & 1) == 1;
        }

        public int getItemId() {
            return itemId;
        }

        public Builder setItemId(int value) {
            this.itemId = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearItemId() {
            this.itemId = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasItemId() {
            return (__bitField0 & 2) == 2;
        }

        public proto.message.InGameResultCode getResult() {
            return proto.message.InGameResultCode.valueOf(result);
        }

        public int getResultValue() {
            return result;
        }

        public Builder setResult(proto.message.InGameResultCode value) {
            if (value == null) {
                throw new NullPointerException("Cannot set OpenBombResponse#result to null");
            }

            if (value == proto.message.InGameResultCode.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set OpenBombResponse#result to UNRECOGNIZED");
            }

            this.result = value.getNumber();
            __bitField0 |= 4;
            return this;
        }

        public Builder setResultValue(int value) {
            this.result = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearResult() {
            this.result = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasResult() {
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
            if (!java.util.Objects.equals(this.userid, that.userid)) {
                return false;
            }
            if (!java.util.Objects.equals(this.itemId, that.itemId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.result, that.result)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.userid == null ? 0 : this.userid.hashCode());
            result = 31 * result + Integer.hashCode(this.itemId);
            result = 31 * result + Integer.hashCode(this.result);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasUserid()) {
                parts.add("userid=" + getUserid());
            }
            if (hasItemId()) {
                parts.add("itemId=" + getItemId());
            }
            if (hasResult()) {
                parts.add("result=" + getResult() + '(' + getResultValue() + ')');
            }
            return "OpenBombResponse{" + String.join(", ", parts) + "}";
        }

        public OpenBombResponse build() {
            proto.message.OpenBombResponse result = new proto.message.OpenBombResponse();
            result.__bitField0 = __bitField0;
            result.userid = this.userid;
            result.itemId = this.itemId;
            result.result = this.result;
            return result;
        }

    }



}