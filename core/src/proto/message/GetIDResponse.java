package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public final class GetIDResponse
        implements io.protostuff.Message<GetIDResponse> {

    private static final GetIDResponse DEFAULT_INSTANCE = newBuilder().build();

    private String userID;

    private boolean __merge_lock = false;
    private int __bitField0;

    private GetIDResponse() {
        this.userID = "";
    }

    private GetIDResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static GetIDResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<GetIDResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getUserID() {
        return userID;
    }

    public boolean hasUserID() {
        return (__bitField0 & 1) == 1;
    }

    public GetIDResponse withUserID(String value) {
        return GetIDResponse.newBuilder()
            .mergeFrom(this)
            .setUserID(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<GetIDResponse> cachedSchema() {
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
        GetIDResponse that = (GetIDResponse) obj;
        if (!java.util.Objects.equals(this.userID, that.userID)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasUserID()) {
            parts.add("userID=" + getUserID());
        }
        return "GetIDResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<GetIDResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("userID", 1);
        }

        @Override
        public GetIDResponse newMessage() {
            return new GetIDResponse();
        }

        @Override
        public Class<GetIDResponse> typeClass() {
            return GetIDResponse.class;
        }

        @Override
        public String messageName() {
            return GetIDResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return GetIDResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(GetIDResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, GetIDResponse instance) throws java.io.IOException {
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
                    	instance.userID = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, GetIDResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.userID, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "userID";
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

        private String userID;

        private int __bitField0;

        private Builder() {
            this.userID = "";
        }

        public Builder mergeFrom(GetIDResponse instance) {
            if (instance.hasUserID()) {
                this.setUserID(instance.getUserID());
            }

            return this;
        }

        public String getUserID() {
            return userID;
        }

        public Builder setUserID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GetIDResponse#userID to null");
            }

            this.userID = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearUserID() {
            this.userID = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasUserID() {
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
            if (!java.util.Objects.equals(this.userID, that.userID)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasUserID()) {
                parts.add("userID=" + getUserID());
            }
            return "GetIDResponse{" + String.join(", ", parts) + "}";
        }

        public GetIDResponse build() {
            proto.message.GetIDResponse result = new proto.message.GetIDResponse();
            result.__bitField0 = __bitField0;
            result.userID = this.userID;
            return result;
        }

    }



}