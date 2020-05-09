package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class UdpEstablishRequest
        implements io.protostuff.Message<UdpEstablishRequest> {

    private static final UdpEstablishRequest DEFAULT_INSTANCE = newBuilder().build();

    private int boardId;

    private int boardUdpCode;

    private boolean __merge_lock = false;
    private int __bitField0;

    private UdpEstablishRequest() {
        this.boardId = 0;
        this.boardUdpCode = 0;
    }

    private UdpEstablishRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static UdpEstablishRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<UdpEstablishRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getBoardId() {
        return boardId;
    }

    public boolean hasBoardId() {
        return (__bitField0 & 1) == 1;
    }

    public UdpEstablishRequest withBoardId(int value) {
        return UdpEstablishRequest.newBuilder()
            .mergeFrom(this)
            .setBoardId(value)
            .build();
    }

    public int getBoardUdpCode() {
        return boardUdpCode;
    }

    public boolean hasBoardUdpCode() {
        return (__bitField0 & 2) == 2;
    }

    public UdpEstablishRequest withBoardUdpCode(int value) {
        return UdpEstablishRequest.newBuilder()
            .mergeFrom(this)
            .setBoardUdpCode(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<UdpEstablishRequest> cachedSchema() {
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
        UdpEstablishRequest that = (UdpEstablishRequest) obj;
        if (!java.util.Objects.equals(this.boardId, that.boardId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.boardUdpCode, that.boardUdpCode)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.boardId);
        result = 31 * result + Integer.hashCode(this.boardUdpCode);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasBoardId()) {
            parts.add("boardId=" + getBoardId());
        }
        if (hasBoardUdpCode()) {
            parts.add("boardUdpCode=" + getBoardUdpCode());
        }
        return "UdpEstablishRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<UdpEstablishRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("boardId", 1);
        	__fieldMap.put("boardUdpCode", 2);
        }

        @Override
        public UdpEstablishRequest newMessage() {
            return new UdpEstablishRequest();
        }

        @Override
        public Class<UdpEstablishRequest> typeClass() {
            return UdpEstablishRequest.class;
        }

        @Override
        public String messageName() {
            return UdpEstablishRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return UdpEstablishRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(UdpEstablishRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, UdpEstablishRequest instance) throws java.io.IOException {
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
                    	instance.boardId = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.boardUdpCode = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, UdpEstablishRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.boardId, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.boardUdpCode, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "boardId";
        		case 2: return "boardUdpCode";
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

        private int boardId;

        private int boardUdpCode;

        private int __bitField0;

        private Builder() {
            this.boardId = 0;
            this.boardUdpCode = 0;
        }

        public Builder mergeFrom(UdpEstablishRequest instance) {
            if (instance.hasBoardId()) {
                this.setBoardId(instance.getBoardId());
            }

            if (instance.hasBoardUdpCode()) {
                this.setBoardUdpCode(instance.getBoardUdpCode());
            }

            return this;
        }

        public int getBoardId() {
            return boardId;
        }

        public Builder setBoardId(int value) {
            this.boardId = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearBoardId() {
            this.boardId = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasBoardId() {
            return (__bitField0 & 1) == 1;
        }

        public int getBoardUdpCode() {
            return boardUdpCode;
        }

        public Builder setBoardUdpCode(int value) {
            this.boardUdpCode = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearBoardUdpCode() {
            this.boardUdpCode = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasBoardUdpCode() {
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
            if (!java.util.Objects.equals(this.boardId, that.boardId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.boardUdpCode, that.boardUdpCode)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.boardId);
            result = 31 * result + Integer.hashCode(this.boardUdpCode);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasBoardId()) {
                parts.add("boardId=" + getBoardId());
            }
            if (hasBoardUdpCode()) {
                parts.add("boardUdpCode=" + getBoardUdpCode());
            }
            return "UdpEstablishRequest{" + String.join(", ", parts) + "}";
        }

        public UdpEstablishRequest build() {
            proto.message.UdpEstablishRequest result = new proto.message.UdpEstablishRequest();
            result.__bitField0 = __bitField0;
            result.boardId = this.boardId;
            result.boardUdpCode = this.boardUdpCode;
            return result;
        }

    }



}