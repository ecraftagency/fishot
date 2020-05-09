package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public final class ImageShareResponse
        implements io.protostuff.Message<ImageShareResponse> {

    private static final ImageShareResponse DEFAULT_INSTANCE = newBuilder().build();

    private boolean shareNormal;

    private boolean shareBoard;

    private int totalGold;

    private int unlockGold;

    private int result;

    private boolean frameNormal;

    private boolean frameBoard;

    private boolean __merge_lock = false;
    private int __bitField0;

    private ImageShareResponse() {
        this.shareNormal = false;
        this.shareBoard = false;
        this.totalGold = 0;
        this.unlockGold = 0;
        this.result = proto.message.ImageShareResult.SHARE_SUCCESS.getNumber();
        this.frameNormal = false;
        this.frameBoard = false;
    }

    private ImageShareResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ImageShareResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<ImageShareResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public boolean getShareNormal() {
        return shareNormal;
    }

    public boolean hasShareNormal() {
        return (__bitField0 & 1) == 1;
    }

    public ImageShareResponse withShareNormal(boolean value) {
        return ImageShareResponse.newBuilder()
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

    public ImageShareResponse withShareBoard(boolean value) {
        return ImageShareResponse.newBuilder()
            .mergeFrom(this)
            .setShareBoard(value)
            .build();
    }

    public int getTotalGold() {
        return totalGold;
    }

    public boolean hasTotalGold() {
        return (__bitField0 & 4) == 4;
    }

    public ImageShareResponse withTotalGold(int value) {
        return ImageShareResponse.newBuilder()
            .mergeFrom(this)
            .setTotalGold(value)
            .build();
    }

    public int getUnlockGold() {
        return unlockGold;
    }

    public boolean hasUnlockGold() {
        return (__bitField0 & 8) == 8;
    }

    public ImageShareResponse withUnlockGold(int value) {
        return ImageShareResponse.newBuilder()
            .mergeFrom(this)
            .setUnlockGold(value)
            .build();
    }

    public proto.message.ImageShareResult getResult() {
        return proto.message.ImageShareResult.valueOf(result);
    }

    public int getResultValue() {
        return result;
    }

    public boolean hasResult() {
        return (__bitField0 & 16) == 16;
    }

    public ImageShareResponse withResult(proto.message.ImageShareResult value) {
        return ImageShareResponse.newBuilder()
            .mergeFrom(this)
            .setResult(value)
            .build();
    }

    public boolean getFrameNormal() {
        return frameNormal;
    }

    public boolean hasFrameNormal() {
        return (__bitField0 & 32) == 32;
    }

    public ImageShareResponse withFrameNormal(boolean value) {
        return ImageShareResponse.newBuilder()
            .mergeFrom(this)
            .setFrameNormal(value)
            .build();
    }

    public boolean getFrameBoard() {
        return frameBoard;
    }

    public boolean hasFrameBoard() {
        return (__bitField0 & 64) == 64;
    }

    public ImageShareResponse withFrameBoard(boolean value) {
        return ImageShareResponse.newBuilder()
            .mergeFrom(this)
            .setFrameBoard(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<ImageShareResponse> cachedSchema() {
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
        ImageShareResponse that = (ImageShareResponse) obj;
        if (!java.util.Objects.equals(this.shareNormal, that.shareNormal)) {
            return false;
        }
        if (!java.util.Objects.equals(this.shareBoard, that.shareBoard)) {
            return false;
        }
        if (!java.util.Objects.equals(this.totalGold, that.totalGold)) {
            return false;
        }
        if (!java.util.Objects.equals(this.unlockGold, that.unlockGold)) {
            return false;
        }
        if (!java.util.Objects.equals(this.result, that.result)) {
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
        result = 31 * result + Integer.hashCode(this.totalGold);
        result = 31 * result + Integer.hashCode(this.unlockGold);
        result = 31 * result + Integer.hashCode(this.result);
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
        if (hasTotalGold()) {
            parts.add("totalGold=" + getTotalGold());
        }
        if (hasUnlockGold()) {
            parts.add("unlockGold=" + getUnlockGold());
        }
        if (hasResult()) {
            parts.add("result=" + getResult() + '(' + getResultValue() + ')');
        }
        if (hasFrameNormal()) {
            parts.add("frameNormal=" + getFrameNormal());
        }
        if (hasFrameBoard()) {
            parts.add("frameBoard=" + getFrameBoard());
        }
        return "ImageShareResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<ImageShareResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("shareNormal", 1);
        	__fieldMap.put("shareBoard", 2);
        	__fieldMap.put("totalGold", 3);
        	__fieldMap.put("unlockGold", 4);
        	__fieldMap.put("result", 5);
        	__fieldMap.put("frameNormal", 6);
        	__fieldMap.put("frameBoard", 7);
        }

        @Override
        public ImageShareResponse newMessage() {
            return new ImageShareResponse();
        }

        @Override
        public Class<ImageShareResponse> typeClass() {
            return ImageShareResponse.class;
        }

        @Override
        public String messageName() {
            return ImageShareResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return ImageShareResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(ImageShareResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, ImageShareResponse instance) throws java.io.IOException {
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
                    	instance.totalGold = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.unlockGold = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.result = input.readEnum();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.frameNormal = input.readBool();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.frameBoard = input.readBool();
                    	instance.__bitField0 |= 64;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, ImageShareResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeBool(1, instance.shareNormal, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeBool(2, instance.shareBoard, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.totalGold, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.unlockGold, false);
            }

            if((instance.__bitField0 & 16) == 16) {
            	output.writeEnum(5, instance.result, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeBool(6, instance.frameNormal, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeBool(7, instance.frameBoard, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "shareNormal";
        		case 2: return "shareBoard";
        		case 3: return "totalGold";
        		case 4: return "unlockGold";
        		case 5: return "result";
        		case 6: return "frameNormal";
        		case 7: return "frameBoard";
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

        private int totalGold;

        private int unlockGold;

        private int result;

        private boolean frameNormal;

        private boolean frameBoard;

        private int __bitField0;

        private Builder() {
            this.shareNormal = false;
            this.shareBoard = false;
            this.totalGold = 0;
            this.unlockGold = 0;
            this.result = proto.message.ImageShareResult.SHARE_SUCCESS.getNumber();
            this.frameNormal = false;
            this.frameBoard = false;
        }

        public Builder mergeFrom(ImageShareResponse instance) {
            if (instance.hasShareNormal()) {
                this.setShareNormal(instance.getShareNormal());
            }

            if (instance.hasShareBoard()) {
                this.setShareBoard(instance.getShareBoard());
            }

            if (instance.hasTotalGold()) {
                this.setTotalGold(instance.getTotalGold());
            }

            if (instance.hasUnlockGold()) {
                this.setUnlockGold(instance.getUnlockGold());
            }

            if (instance.hasResult()) {
                this.setResult(instance.getResult());
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

        public int getTotalGold() {
            return totalGold;
        }

        public Builder setTotalGold(int value) {
            this.totalGold = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearTotalGold() {
            this.totalGold = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasTotalGold() {
            return (__bitField0 & 4) == 4;
        }

        public int getUnlockGold() {
            return unlockGold;
        }

        public Builder setUnlockGold(int value) {
            this.unlockGold = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearUnlockGold() {
            this.unlockGold = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasUnlockGold() {
            return (__bitField0 & 8) == 8;
        }

        public proto.message.ImageShareResult getResult() {
            return proto.message.ImageShareResult.valueOf(result);
        }

        public int getResultValue() {
            return result;
        }

        public Builder setResult(proto.message.ImageShareResult value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ImageShareResponse#result to null");
            }

            if (value == proto.message.ImageShareResult.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set ImageShareResponse#result to UNRECOGNIZED");
            }

            this.result = value.getNumber();
            __bitField0 |= 16;
            return this;
        }

        public Builder setResultValue(int value) {
            this.result = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearResult() {
            this.result = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasResult() {
            return (__bitField0 & 16) == 16;
        }

        public boolean getFrameNormal() {
            return frameNormal;
        }

        public Builder setFrameNormal(boolean value) {
            this.frameNormal = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearFrameNormal() {
            this.frameNormal = false;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasFrameNormal() {
            return (__bitField0 & 32) == 32;
        }

        public boolean getFrameBoard() {
            return frameBoard;
        }

        public Builder setFrameBoard(boolean value) {
            this.frameBoard = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearFrameBoard() {
            this.frameBoard = false;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasFrameBoard() {
            return (__bitField0 & 64) == 64;
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
            if (!java.util.Objects.equals(this.totalGold, that.totalGold)) {
                return false;
            }
            if (!java.util.Objects.equals(this.unlockGold, that.unlockGold)) {
                return false;
            }
            if (!java.util.Objects.equals(this.result, that.result)) {
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
            result = 31 * result + Integer.hashCode(this.totalGold);
            result = 31 * result + Integer.hashCode(this.unlockGold);
            result = 31 * result + Integer.hashCode(this.result);
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
            if (hasTotalGold()) {
                parts.add("totalGold=" + getTotalGold());
            }
            if (hasUnlockGold()) {
                parts.add("unlockGold=" + getUnlockGold());
            }
            if (hasResult()) {
                parts.add("result=" + getResult() + '(' + getResultValue() + ')');
            }
            if (hasFrameNormal()) {
                parts.add("frameNormal=" + getFrameNormal());
            }
            if (hasFrameBoard()) {
                parts.add("frameBoard=" + getFrameBoard());
            }
            return "ImageShareResponse{" + String.join(", ", parts) + "}";
        }

        public ImageShareResponse build() {
            proto.message.ImageShareResponse result = new proto.message.ImageShareResponse();
            result.__bitField0 = __bitField0;
            result.shareNormal = this.shareNormal;
            result.shareBoard = this.shareBoard;
            result.totalGold = this.totalGold;
            result.unlockGold = this.unlockGold;
            result.result = this.result;
            result.frameNormal = this.frameNormal;
            result.frameBoard = this.frameBoard;
            return result;
        }

    }



}