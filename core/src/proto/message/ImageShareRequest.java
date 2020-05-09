package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public final class ImageShareRequest
        implements io.protostuff.Message<ImageShareRequest> {

    private static final ImageShareRequest DEFAULT_INSTANCE = newBuilder().build();

    private boolean success;

    private int type;

    private boolean __merge_lock = false;
    private int __bitField0;

    private ImageShareRequest() {
        this.success = false;
        this.type = proto.message.ImageShareType.SHARE_NORMAL.getNumber();
    }

    private ImageShareRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ImageShareRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<ImageShareRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public boolean getSuccess() {
        return success;
    }

    public boolean hasSuccess() {
        return (__bitField0 & 1) == 1;
    }

    public ImageShareRequest withSuccess(boolean value) {
        return ImageShareRequest.newBuilder()
            .mergeFrom(this)
            .setSuccess(value)
            .build();
    }

    public proto.message.ImageShareType getType() {
        return proto.message.ImageShareType.valueOf(type);
    }

    public int getTypeValue() {
        return type;
    }

    public boolean hasType() {
        return (__bitField0 & 2) == 2;
    }

    public ImageShareRequest withType(proto.message.ImageShareType value) {
        return ImageShareRequest.newBuilder()
            .mergeFrom(this)
            .setType(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<ImageShareRequest> cachedSchema() {
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
        ImageShareRequest that = (ImageShareRequest) obj;
        if (!java.util.Objects.equals(this.success, that.success)) {
            return false;
        }
        if (!java.util.Objects.equals(this.type, that.type)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Boolean.hashCode(this.success);
        result = 31 * result + Integer.hashCode(this.type);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasSuccess()) {
            parts.add("success=" + getSuccess());
        }
        if (hasType()) {
            parts.add("type=" + getType() + '(' + getTypeValue() + ')');
        }
        return "ImageShareRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<ImageShareRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("success", 1);
        	__fieldMap.put("type", 2);
        }

        @Override
        public ImageShareRequest newMessage() {
            return new ImageShareRequest();
        }

        @Override
        public Class<ImageShareRequest> typeClass() {
            return ImageShareRequest.class;
        }

        @Override
        public String messageName() {
            return ImageShareRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return ImageShareRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(ImageShareRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, ImageShareRequest instance) throws java.io.IOException {
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
                    	instance.success = input.readBool();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.type = input.readEnum();
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, ImageShareRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeBool(1, instance.success, false);
            }

            if((instance.__bitField0 & 2) == 2) {
            	output.writeEnum(2, instance.type, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "success";
        		case 2: return "type";
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

        private boolean success;

        private int type;

        private int __bitField0;

        private Builder() {
            this.success = false;
            this.type = proto.message.ImageShareType.SHARE_NORMAL.getNumber();
        }

        public Builder mergeFrom(ImageShareRequest instance) {
            if (instance.hasSuccess()) {
                this.setSuccess(instance.getSuccess());
            }

            if (instance.hasType()) {
                this.setType(instance.getType());
            }

            return this;
        }

        public boolean getSuccess() {
            return success;
        }

        public Builder setSuccess(boolean value) {
            this.success = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearSuccess() {
            this.success = false;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasSuccess() {
            return (__bitField0 & 1) == 1;
        }

        public proto.message.ImageShareType getType() {
            return proto.message.ImageShareType.valueOf(type);
        }

        public int getTypeValue() {
            return type;
        }

        public Builder setType(proto.message.ImageShareType value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ImageShareRequest#type to null");
            }

            if (value == proto.message.ImageShareType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set ImageShareRequest#type to UNRECOGNIZED");
            }

            this.type = value.getNumber();
            __bitField0 |= 2;
            return this;
        }

        public Builder setTypeValue(int value) {
            this.type = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearType() {
            this.type = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasType() {
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
            if (!java.util.Objects.equals(this.success, that.success)) {
                return false;
            }
            if (!java.util.Objects.equals(this.type, that.type)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Boolean.hashCode(this.success);
            result = 31 * result + Integer.hashCode(this.type);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasSuccess()) {
                parts.add("success=" + getSuccess());
            }
            if (hasType()) {
                parts.add("type=" + getType() + '(' + getTypeValue() + ')');
            }
            return "ImageShareRequest{" + String.join(", ", parts) + "}";
        }

        public ImageShareRequest build() {
            proto.message.ImageShareRequest result = new proto.message.ImageShareRequest();
            result.__bitField0 = __bitField0;
            result.success = this.success;
            result.type = this.type;
            return result;
        }

    }



}