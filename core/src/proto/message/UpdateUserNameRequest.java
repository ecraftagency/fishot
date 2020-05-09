package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class UpdateUserNameRequest
        implements io.protostuff.Message<UpdateUserNameRequest> {

    private static final UpdateUserNameRequest DEFAULT_INSTANCE = newBuilder().build();

    private String userName;

    private boolean __merge_lock = false;
    private int __bitField0;

    private UpdateUserNameRequest() {
        this.userName = "";
    }

    private UpdateUserNameRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static UpdateUserNameRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<UpdateUserNameRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getUserName() {
        return userName;
    }

    public boolean hasUserName() {
        return (__bitField0 & 1) == 1;
    }

    public UpdateUserNameRequest withUserName(String value) {
        return UpdateUserNameRequest.newBuilder()
            .mergeFrom(this)
            .setUserName(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<UpdateUserNameRequest> cachedSchema() {
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
        UpdateUserNameRequest that = (UpdateUserNameRequest) obj;
        if (!java.util.Objects.equals(this.userName, that.userName)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.userName == null ? 0 : this.userName.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasUserName()) {
            parts.add("userName=" + getUserName());
        }
        return "UpdateUserNameRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<UpdateUserNameRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("userName", 1);
        }

        @Override
        public UpdateUserNameRequest newMessage() {
            return new UpdateUserNameRequest();
        }

        @Override
        public Class<UpdateUserNameRequest> typeClass() {
            return UpdateUserNameRequest.class;
        }

        @Override
        public String messageName() {
            return UpdateUserNameRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return UpdateUserNameRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(UpdateUserNameRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, UpdateUserNameRequest instance) throws java.io.IOException {
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
                    	instance.userName = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, UpdateUserNameRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.userName, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "userName";
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

        private String userName;

        private int __bitField0;

        private Builder() {
            this.userName = "";
        }

        public Builder mergeFrom(UpdateUserNameRequest instance) {
            if (instance.hasUserName()) {
                this.setUserName(instance.getUserName());
            }

            return this;
        }

        public String getUserName() {
            return userName;
        }

        public Builder setUserName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set UpdateUserNameRequest#userName to null");
            }

            this.userName = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearUserName() {
            this.userName = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasUserName() {
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
            if (!java.util.Objects.equals(this.userName, that.userName)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.userName == null ? 0 : this.userName.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasUserName()) {
                parts.add("userName=" + getUserName());
            }
            return "UpdateUserNameRequest{" + String.join(", ", parts) + "}";
        }

        public UpdateUserNameRequest build() {
            proto.message.UpdateUserNameRequest result = new proto.message.UpdateUserNameRequest();
            result.__bitField0 = __bitField0;
            result.userName = this.userName;
            return result;
        }

    }



}