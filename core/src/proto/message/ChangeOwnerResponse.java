package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class ChangeOwnerResponse
        implements io.protostuff.Message<ChangeOwnerResponse> {

    private static final ChangeOwnerResponse DEFAULT_INSTANCE = newBuilder().build();

    private String newOwnerID;

    private String content;

    private boolean __merge_lock = false;
    private int __bitField0;

    private ChangeOwnerResponse() {
        this.newOwnerID = "";
        this.content = "";
    }

    private ChangeOwnerResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ChangeOwnerResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<ChangeOwnerResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getNewOwnerID() {
        return newOwnerID;
    }

    public boolean hasNewOwnerID() {
        return (__bitField0 & 1) == 1;
    }

    public ChangeOwnerResponse withNewOwnerID(String value) {
        return ChangeOwnerResponse.newBuilder()
            .mergeFrom(this)
            .setNewOwnerID(value)
            .build();
    }

    public String getContent() {
        return content;
    }

    public boolean hasContent() {
        return (__bitField0 & 2) == 2;
    }

    public ChangeOwnerResponse withContent(String value) {
        return ChangeOwnerResponse.newBuilder()
            .mergeFrom(this)
            .setContent(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<ChangeOwnerResponse> cachedSchema() {
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
        ChangeOwnerResponse that = (ChangeOwnerResponse) obj;
        if (!java.util.Objects.equals(this.newOwnerID, that.newOwnerID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.content, that.content)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.newOwnerID == null ? 0 : this.newOwnerID.hashCode());
        result = 31 * result + (this.content == null ? 0 : this.content.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasNewOwnerID()) {
            parts.add("newOwnerID=" + getNewOwnerID());
        }
        if (hasContent()) {
            parts.add("content=" + getContent());
        }
        return "ChangeOwnerResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<ChangeOwnerResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("newOwnerID", 1);
        	__fieldMap.put("content", 2);
        }

        @Override
        public ChangeOwnerResponse newMessage() {
            return new ChangeOwnerResponse();
        }

        @Override
        public Class<ChangeOwnerResponse> typeClass() {
            return ChangeOwnerResponse.class;
        }

        @Override
        public String messageName() {
            return ChangeOwnerResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return ChangeOwnerResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(ChangeOwnerResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, ChangeOwnerResponse instance) throws java.io.IOException {
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
                    	instance.newOwnerID = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.content = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, ChangeOwnerResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.newOwnerID, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.content, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "newOwnerID";
        		case 2: return "content";
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

        private String newOwnerID;

        private String content;

        private int __bitField0;

        private Builder() {
            this.newOwnerID = "";
            this.content = "";
        }

        public Builder mergeFrom(ChangeOwnerResponse instance) {
            if (instance.hasNewOwnerID()) {
                this.setNewOwnerID(instance.getNewOwnerID());
            }

            if (instance.hasContent()) {
                this.setContent(instance.getContent());
            }

            return this;
        }

        public String getNewOwnerID() {
            return newOwnerID;
        }

        public Builder setNewOwnerID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ChangeOwnerResponse#newOwnerID to null");
            }

            this.newOwnerID = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearNewOwnerID() {
            this.newOwnerID = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasNewOwnerID() {
            return (__bitField0 & 1) == 1;
        }

        public String getContent() {
            return content;
        }

        public Builder setContent(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ChangeOwnerResponse#content to null");
            }

            this.content = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearContent() {
            this.content = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasContent() {
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
            if (!java.util.Objects.equals(this.newOwnerID, that.newOwnerID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.content, that.content)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.newOwnerID == null ? 0 : this.newOwnerID.hashCode());
            result = 31 * result + (this.content == null ? 0 : this.content.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasNewOwnerID()) {
                parts.add("newOwnerID=" + getNewOwnerID());
            }
            if (hasContent()) {
                parts.add("content=" + getContent());
            }
            return "ChangeOwnerResponse{" + String.join(", ", parts) + "}";
        }

        public ChangeOwnerResponse build() {
            proto.message.ChangeOwnerResponse result = new proto.message.ChangeOwnerResponse();
            result.__bitField0 = __bitField0;
            result.newOwnerID = this.newOwnerID;
            result.content = this.content;
            return result;
        }

    }



}