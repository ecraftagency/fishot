package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public final class ImageShareInfoResponse
        implements io.protostuff.Message<ImageShareInfoResponse> {

    private static final ImageShareInfoResponse DEFAULT_INSTANCE = newBuilder().build();

    private boolean shareNormal;

    private boolean shareBoard;

    private int goldNormal;

    private boolean frameNormal;

    private boolean frameBoard;

    private boolean __merge_lock = false;
    private int __bitField0;

    private ImageShareInfoResponse() {
        this.shareNormal = false;
        this.shareBoard = false;
        this.goldNormal = 0;
        this.frameNormal = false;
        this.frameBoard = false;
    }

    private ImageShareInfoResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ImageShareInfoResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<ImageShareInfoResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public boolean getShareNormal() {
        return shareNormal;
    }

    public boolean hasShareNormal() {
        return (__bitField0 & 1) == 1;
    }

    public ImageShareInfoResponse withShareNormal(boolean value) {
        return ImageShareInfoResponse.newBuilder()
            .mergeFrom(this)
            .setShareNormal(value)
            .build();
    }

    public boolean getShareBoard() {
        return shareBoard;
    }

    public boolean hasShareBoard() {
        return (__bitField0 & 2) == 2;
    }

    public ImageShareInfoResponse withShareBoard(boolean value) {
        return ImageShareInfoResponse.newBuilder()
            .mergeFrom(this)
            .setShareBoard(value)
            .build();
    }

    public int getGoldNormal() {
        return goldNormal;
    }

    public boolean hasGoldNormal() {
        return (__bitField0 & 4) == 4;
    }

    public ImageShareInfoResponse withGoldNormal(int value) {
        return ImageShareInfoResponse.newBuilder()
            .mergeFrom(this)
            .setGoldNormal(value)
            .build();
    }

    public boolean getFrameNormal() {
        return frameNormal;
    }

    public boolean hasFrameNormal() {
        return (__bitField0 & 8) == 8;
    }

    public ImageShareInfoResponse withFrameNormal(boolean value) {
        return ImageShareInfoResponse.newBuilder()
            .mergeFrom(this)
            .setFrameNormal(value)
            .build();
    }

    public boolean getFrameBoard() {
        return frameBoard;
    }

    public boolean hasFrameBoard() {
        return (__bitField0 & 16) == 16;
    }

    public ImageShareInfoResponse withFrameBoard(boolean value) {
        return ImageShareInfoResponse.newBuilder()
            .mergeFrom(this)
            .setFrameBoard(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<ImageShareInfoResponse> cachedSchema() {
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
        ImageShareInfoResponse that = (ImageShareInfoResponse) obj;
        if (!java.util.Objects.equals(this.shareNormal, that.shareNormal)) {
            return false;
        }
        if (!java.util.Objects.equals(this.shareBoard, that.shareBoard)) {
            return false;
        }
        if (!java.util.Objects.equals(this.goldNormal, that.goldNormal)) {
            return false;
        }
        if (!java.util.Objects.equals(this.frameNormal, that.frameNormal)) {
            return false;
        }
        if (!java.util.Objects.equals(this.frameBoard, that.frameBoard)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Boolean.hashCode(this.shareNormal);
        result = 31 * result + Boolean.hashCode(this.shareBoard);
        result = 31 * result + Integer.hashCode(this.goldNormal);
        result = 31 * result + Boolean.hashCode(this.frameNormal);
        result = 31 * result + Boolean.hashCode(this.frameBoard);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasShareNormal()) {
            parts.add("shareNormal=" + getShareNormal());
        }
        if (hasShareBoard()) {
            parts.add("shareBoard=" + getShareBoard());
        }
        if (hasGoldNormal()) {
            parts.add("goldNormal=" + getGoldNormal());
        }
        if (hasFrameNormal()) {
            parts.add("frameNormal=" + getFrameNormal());
        }
        if (hasFrameBoard()) {
            parts.add("frameBoard=" + getFrameBoard());
        }
        return "ImageShareInfoResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<ImageShareInfoResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("shareNormal", 1);
        	__fieldMap.put("shareBoard", 2);
        	__fieldMap.put("goldNormal", 3);
        	__fieldMap.put("frameNormal", 4);
        	__fieldMap.put("frameBoard", 5);
        }

        @Override
        public ImageShareInfoResponse newMessage() {
            return new ImageShareInfoResponse();
        }

        @Override
        public Class<ImageShareInfoResponse> typeClass() {
            return ImageShareInfoResponse.class;
        }

        @Override
        public String messageName() {
            return ImageShareInfoResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return ImageShareInfoResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(ImageShareInfoResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, ImageShareInfoResponse instance) throws java.io.IOException {
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
                    	instance.shareNormal = input.readBool();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.shareBoard = input.readBool();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.goldNormal = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.frameNormal = input.readBool();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.frameBoard = input.readBool();
                    	instance.__bitField0 |= 16;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, ImageShareInfoResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeBool(1, instance.shareNormal, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeBool(2, instance.shareBoard, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.goldNormal, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeBool(4, instance.frameNormal, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeBool(5, instance.frameBoard, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "shareNormal";
        		case 2: return "shareBoard";
        		case 3: return "goldNormal";
        		case 4: return "frameNormal";
        		case 5: return "frameBoard";
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

        private boolean shareNormal;

        private boolean shareBoard;

        private int goldNormal;

        private boolean frameNormal;

        private boolean frameBoard;

        private int __bitField0;

        private Builder() {
            this.shareNormal = false;
            this.shareBoard = false;
            this.goldNormal = 0;
            this.frameNormal = false;
            this.frameBoard = false;
        }

        public Builder mergeFrom(ImageShareInfoResponse instance) {
            if (instance.hasShareNormal()) {
                this.setShareNormal(instance.getShareNormal());
            }

            if (instance.hasShareBoard()) {
                this.setShareBoard(instance.getShareBoard());
            }

            if (instance.hasGoldNormal()) {
                this.setGoldNormal(instance.getGoldNormal());
            }

            if (instance.hasFrameNormal()) {
                this.setFrameNormal(instance.getFrameNormal());
            }

            if (instance.hasFrameBoard()) {
                this.setFrameBoard(instance.getFrameBoard());
            }

            return this;
        }

        public boolean getShareNormal() {
            return shareNormal;
        }

        public Builder setShareNormal(boolean value) {
            this.shareNormal = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearShareNormal() {
            this.shareNormal = false;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasShareNormal() {
            return (__bitField0 & 1) == 1;
        }

        public boolean getShareBoard() {
            return shareBoard;
        }

        public Builder setShareBoard(boolean value) {
            this.shareBoard = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearShareBoard() {
            this.shareBoard = false;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasShareBoard() {
            return (__bitField0 & 2) == 2;
        }

        public int getGoldNormal() {
            return goldNormal;
        }

        public Builder setGoldNormal(int value) {
            this.goldNormal = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearGoldNormal() {
            this.goldNormal = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasGoldNormal() {
            return (__bitField0 & 4) == 4;
        }

        public boolean getFrameNormal() {
            return frameNormal;
        }

        public Builder setFrameNormal(boolean value) {
            this.frameNormal = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearFrameNormal() {
            this.frameNormal = false;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasFrameNormal() {
            return (__bitField0 & 8) == 8;
        }

        public boolean getFrameBoard() {
            return frameBoard;
        }

        public Builder setFrameBoard(boolean value) {
            this.frameBoard = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearFrameBoard() {
            this.frameBoard = false;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasFrameBoard() {
            return (__bitField0 & 16) == 16;
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
            if (!java.util.Objects.equals(this.shareNormal, that.shareNormal)) {
                return false;
            }
            if (!java.util.Objects.equals(this.shareBoard, that.shareBoard)) {
                return false;
            }
            if (!java.util.Objects.equals(this.goldNormal, that.goldNormal)) {
                return false;
            }
            if (!java.util.Objects.equals(this.frameNormal, that.frameNormal)) {
                return false;
            }
            if (!java.util.Objects.equals(this.frameBoard, that.frameBoard)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Boolean.hashCode(this.shareNormal);
            result = 31 * result + Boolean.hashCode(this.shareBoard);
            result = 31 * result + Integer.hashCode(this.goldNormal);
            result = 31 * result + Boolean.hashCode(this.frameNormal);
            result = 31 * result + Boolean.hashCode(this.frameBoard);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasShareNormal()) {
                parts.add("shareNormal=" + getShareNormal());
            }
            if (hasShareBoard()) {
                parts.add("shareBoard=" + getShareBoard());
            }
            if (hasGoldNormal()) {
                parts.add("goldNormal=" + getGoldNormal());
            }
            if (hasFrameNormal()) {
                parts.add("frameNormal=" + getFrameNormal());
            }
            if (hasFrameBoard()) {
                parts.add("frameBoard=" + getFrameBoard());
            }
            return "ImageShareInfoResponse{" + String.join(", ", parts) + "}";
        }

        public ImageShareInfoResponse build() {
            proto.message.ImageShareInfoResponse result = new proto.message.ImageShareInfoResponse();
            result.__bitField0 = __bitField0;
            result.shareNormal = this.shareNormal;
            result.shareBoard = this.shareBoard;
            result.goldNormal = this.goldNormal;
            result.frameNormal = this.frameNormal;
            result.frameBoard = this.frameBoard;
            return result;
        }

    }



}