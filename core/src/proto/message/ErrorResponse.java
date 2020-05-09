package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public final class ErrorResponse
        implements io.protostuff.Message<ErrorResponse> {

    private static final ErrorResponse DEFAULT_INSTANCE = newBuilder().build();

    private String content;

    private boolean __merge_lock = false;
    private int __bitField0;

    private ErrorResponse() {
        this.content = "";
    }

    private ErrorResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ErrorResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<ErrorResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getContent() {
        return content;
    }

    public boolean hasContent() {
        return (__bitField0 & 1) == 1;
    }

    public ErrorResponse withContent(String value) {
        return ErrorResponse.newBuilder()
            .mergeFrom(this)
            .setContent(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<ErrorResponse> cachedSchema() {
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
        ErrorResponse that = (ErrorResponse) obj;
        if (!java.util.Objects.equals(this.content, that.content)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.content == null ? 0 : this.content.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasContent()) {
            parts.add("content=" + getContent());
        }
        return "ErrorResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<ErrorResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("content", 1);
        }

        @Override
        public ErrorResponse newMessage() {
            return new ErrorResponse();
        }

        @Override
        public Class<ErrorResponse> typeClass() {
            return ErrorResponse.class;
        }

        @Override
        public String messageName() {
            return ErrorResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return ErrorResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(ErrorResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, ErrorResponse instance) throws java.io.IOException {
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
                    	instance.content = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, ErrorResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.content, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "content";
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

        private String content;

        private int __bitField0;

        private Builder() {
            this.content = "";
        }

        public Builder mergeFrom(ErrorResponse instance) {
            if (instance.hasContent()) {
                this.setContent(instance.getContent());
            }

            return this;
        }

        public String getContent() {
            return content;
        }

        public Builder setContent(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ErrorResponse#content to null");
            }

            this.content = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearContent() {
            this.content = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasContent() {
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
            if (!java.util.Objects.equals(this.content, that.content)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.content == null ? 0 : this.content.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasContent()) {
                parts.add("content=" + getContent());
            }
            return "ErrorResponse{" + String.join(", ", parts) + "}";
        }

        public ErrorResponse build() {
            proto.message.ErrorResponse result = new proto.message.ErrorResponse();
            result.__bitField0 = __bitField0;
            result.content = this.content;
            return result;
        }

    }



}