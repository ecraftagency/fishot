package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public final class ImageShareBoardResponse
        implements io.protostuff.Message<ImageShareBoardResponse> {

    private static final ImageShareBoardResponse DEFAULT_INSTANCE = newBuilder().build();

    private int goldBoard;

    private boolean __merge_lock = false;
    private int __bitField0;

    private ImageShareBoardResponse() {
        this.goldBoard = 0;
    }

    private ImageShareBoardResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ImageShareBoardResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<ImageShareBoardResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getGoldBoard() {
        return goldBoard;
    }

    public boolean hasGoldBoard() {
        return (__bitField0 & 1) == 1;
    }

    public ImageShareBoardResponse withGoldBoard(int value) {
        return ImageShareBoardResponse.newBuilder()
            .mergeFrom(this)
            .setGoldBoard(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<ImageShareBoardResponse> cachedSchema() {
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
        ImageShareBoardResponse that = (ImageShareBoardResponse) obj;
        if (!java.util.Objects.equals(this.goldBoard, that.goldBoard)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.goldBoard);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasGoldBoard()) {
            parts.add("goldBoard=" + getGoldBoard());
        }
        return "ImageShareBoardResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<ImageShareBoardResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("goldBoard", 1);
        }

        @Override
        public ImageShareBoardResponse newMessage() {
            return new ImageShareBoardResponse();
        }

        @Override
        public Class<ImageShareBoardResponse> typeClass() {
            return ImageShareBoardResponse.class;
        }

        @Override
        public String messageName() {
            return ImageShareBoardResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return ImageShareBoardResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(ImageShareBoardResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, ImageShareBoardResponse instance) throws java.io.IOException {
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
                    	instance.goldBoard = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, ImageShareBoardResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.goldBoard, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "goldBoard";
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

        private int goldBoard;

        private int __bitField0;

        private Builder() {
            this.goldBoard = 0;
        }

        public Builder mergeFrom(ImageShareBoardResponse instance) {
            if (instance.hasGoldBoard()) {
                this.setGoldBoard(instance.getGoldBoard());
            }

            return this;
        }

        public int getGoldBoard() {
            return goldBoard;
        }

        public Builder setGoldBoard(int value) {
            this.goldBoard = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearGoldBoard() {
            this.goldBoard = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasGoldBoard() {
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
            if (!java.util.Objects.equals(this.goldBoard, that.goldBoard)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.goldBoard);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasGoldBoard()) {
                parts.add("goldBoard=" + getGoldBoard());
            }
            return "ImageShareBoardResponse{" + String.join(", ", parts) + "}";
        }

        public ImageShareBoardResponse build() {
            proto.message.ImageShareBoardResponse result = new proto.message.ImageShareBoardResponse();
            result.__bitField0 = __bitField0;
            result.goldBoard = this.goldBoard;
            return result;
        }

    }



}