package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class UdpEstablishResponse
        implements io.protostuff.Message<UdpEstablishResponse> {

    private static final UdpEstablishResponse DEFAULT_INSTANCE = newBuilder().build();

    private int result;

    private int boardId;

    private int boardUdpCode;

    private boolean __merge_lock = false;
    private int __bitField0;

    private UdpEstablishResponse() {
        this.result = proto.message.InGameResultCode.JOIN_BOARD_SUCCESS_PLAY.getNumber();
        this.boardId = 0;
        this.boardUdpCode = 0;
    }

    private UdpEstablishResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static UdpEstablishResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<UdpEstablishResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public proto.message.InGameResultCode getResult() {
        return proto.message.InGameResultCode.valueOf(result);
    }

    public int getResultValue() {
        return result;
    }

    public boolean hasResult() {
        return (__bitField0 & 1) == 1;
    }

    public UdpEstablishResponse withResult(proto.message.InGameResultCode value) {
        return UdpEstablishResponse.newBuilder()
            .mergeFrom(this)
            .setResult(value)
            .build();
    }

    public int getBoardId() {
        return boardId;
    }

    public boolean hasBoardId() {
        return (__bitField0 & 2) == 2;
    }

    public UdpEstablishResponse withBoardId(int value) {
        return UdpEstablishResponse.newBuilder()
            .mergeFrom(this)
            .setBoardId(value)
            .build();
    }

    public int getBoardUdpCode() {
        return boardUdpCode;
    }

    public boolean hasBoardUdpCode() {
        return (__bitField0 & 4) == 4;
    }

    public UdpEstablishResponse withBoardUdpCode(int value) {
        return UdpEstablishResponse.newBuilder()
            .mergeFrom(this)
            .setBoardUdpCode(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<UdpEstablishResponse> cachedSchema() {
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
        UdpEstablishResponse that = (UdpEstablishResponse) obj;
        if (!java.util.Objects.equals(this.result, that.result)) {
            return false;
        }
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
        result = 31 * result + Integer.hashCode(this.result);
        result = 31 * result + Integer.hashCode(this.boardId);
        result = 31 * result + Integer.hashCode(this.boardUdpCode);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasResult()) {
            parts.add("result=" + getResult() + '(' + getResultValue() + ')');
        }
        if (hasBoardId()) {
            parts.add("boardId=" + getBoardId());
        }
        if (hasBoardUdpCode()) {
            parts.add("boardUdpCode=" + getBoardUdpCode());
        }
        return "UdpEstablishResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<UdpEstablishResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("result", 1);
        	__fieldMap.put("boardId", 2);
        	__fieldMap.put("boardUdpCode", 3);
        }

        @Override
        public UdpEstablishResponse newMessage() {
            return new UdpEstablishResponse();
        }

        @Override
        public Class<UdpEstablishResponse> typeClass() {
            return UdpEstablishResponse.class;
        }

        @Override
        public String messageName() {
            return UdpEstablishResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return UdpEstablishResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(UdpEstablishResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, UdpEstablishResponse instance) throws java.io.IOException {
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
                    	instance.result = input.readEnum();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.boardId = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.boardUdpCode = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, UdpEstablishResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.result, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.boardId, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.boardUdpCode, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "result";
        		case 2: return "boardId";
        		case 3: return "boardUdpCode";
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

        private int result;

        private int boardId;

        private int boardUdpCode;

        private int __bitField0;

        private Builder() {
            this.result = proto.message.InGameResultCode.JOIN_BOARD_SUCCESS_PLAY.getNumber();
            this.boardId = 0;
            this.boardUdpCode = 0;
        }

        public Builder mergeFrom(UdpEstablishResponse instance) {
            if (instance.hasResult()) {
                this.setResult(instance.getResult());
            }

            if (instance.hasBoardId()) {
                this.setBoardId(instance.getBoardId());
            }

            if (instance.hasBoardUdpCode()) {
                this.setBoardUdpCode(instance.getBoardUdpCode());
            }

            return this;
        }

        public proto.message.InGameResultCode getResult() {
            return proto.message.InGameResultCode.valueOf(result);
        }

        public int getResultValue() {
            return result;
        }

        public Builder setResult(proto.message.InGameResultCode value) {
            if (value == null) {
                throw new NullPointerException("Cannot set UdpEstablishResponse#result to null");
            }

            if (value == proto.message.InGameResultCode.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set UdpEstablishResponse#result to UNRECOGNIZED");
            }

            this.result = value.getNumber();
            __bitField0 |= 1;
            return this;
        }

        public Builder setResultValue(int value) {
            this.result = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearResult() {
            this.result = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasResult() {
            return (__bitField0 & 1) == 1;
        }

        public int getBoardId() {
            return boardId;
        }

        public Builder setBoardId(int value) {
            this.boardId = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearBoardId() {
            this.boardId = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasBoardId() {
            return (__bitField0 & 2) == 2;
        }

        public int getBoardUdpCode() {
            return boardUdpCode;
        }

        public Builder setBoardUdpCode(int value) {
            this.boardUdpCode = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearBoardUdpCode() {
            this.boardUdpCode = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasBoardUdpCode() {
            return (__bitField0 & 4) == 4;
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
            if (!java.util.Objects.equals(this.result, that.result)) {
                return false;
            }
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
            result = 31 * result + Integer.hashCode(this.result);
            result = 31 * result + Integer.hashCode(this.boardId);
            result = 31 * result + Integer.hashCode(this.boardUdpCode);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasResult()) {
                parts.add("result=" + getResult() + '(' + getResultValue() + ')');
            }
            if (hasBoardId()) {
                parts.add("boardId=" + getBoardId());
            }
            if (hasBoardUdpCode()) {
                parts.add("boardUdpCode=" + getBoardUdpCode());
            }
            return "UdpEstablishResponse{" + String.join(", ", parts) + "}";
        }

        public UdpEstablishResponse build() {
            proto.message.UdpEstablishResponse result = new proto.message.UdpEstablishResponse();
            result.__bitField0 = __bitField0;
            result.result = this.result;
            result.boardId = this.boardId;
            result.boardUdpCode = this.boardUdpCode;
            return result;
        }

    }



}