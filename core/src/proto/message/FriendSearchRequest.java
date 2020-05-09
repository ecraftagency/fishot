package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class FriendSearchRequest
        implements io.protostuff.Message<FriendSearchRequest> {

    private static final FriendSearchRequest DEFAULT_INSTANCE = newBuilder().build();

    private String template;

    private boolean __merge_lock = false;
    private int __bitField0;

    private FriendSearchRequest() {
        this.template = "";
    }

    private FriendSearchRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static FriendSearchRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<FriendSearchRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getTemplate() {
        return template;
    }

    public boolean hasTemplate() {
        return (__bitField0 & 1) == 1;
    }

    public FriendSearchRequest withTemplate(String value) {
        return FriendSearchRequest.newBuilder()
            .mergeFrom(this)
            .setTemplate(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<FriendSearchRequest> cachedSchema() {
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
        FriendSearchRequest that = (FriendSearchRequest) obj;
        if (!java.util.Objects.equals(this.template, that.template)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.template == null ? 0 : this.template.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasTemplate()) {
            parts.add("template=" + getTemplate());
        }
        return "FriendSearchRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<FriendSearchRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("template", 1);
        }

        @Override
        public FriendSearchRequest newMessage() {
            return new FriendSearchRequest();
        }

        @Override
        public Class<FriendSearchRequest> typeClass() {
            return FriendSearchRequest.class;
        }

        @Override
        public String messageName() {
            return FriendSearchRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return FriendSearchRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(FriendSearchRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, FriendSearchRequest instance) throws java.io.IOException {
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
                    	instance.template = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, FriendSearchRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.template, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "template";
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

        private String template;

        private int __bitField0;

        private Builder() {
            this.template = "";
        }

        public Builder mergeFrom(FriendSearchRequest instance) {
            if (instance.hasTemplate()) {
                this.setTemplate(instance.getTemplate());
            }

            return this;
        }

        public String getTemplate() {
            return template;
        }

        public Builder setTemplate(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendSearchRequest#template to null");
            }

            this.template = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearTemplate() {
            this.template = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasTemplate() {
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
            if (!java.util.Objects.equals(this.template, that.template)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.template == null ? 0 : this.template.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasTemplate()) {
                parts.add("template=" + getTemplate());
            }
            return "FriendSearchRequest{" + String.join(", ", parts) + "}";
        }

        public FriendSearchRequest build() {
            proto.message.FriendSearchRequest result = new proto.message.FriendSearchRequest();
            result.__bitField0 = __bitField0;
            result.template = this.template;
            return result;
        }

    }



}