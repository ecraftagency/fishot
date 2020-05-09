package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class GetBoardInforRequest
        implements io.protostuff.Message<GetBoardInforRequest> {

    private static final GetBoardInforRequest DEFAULT_INSTANCE = newBuilder().build();

    private int boardID;

    private int gameId;

    private boolean __merge_lock = false;
    private int __bitField0;

    private GetBoardInforRequest() {
        this.boardID = 0;
        this.gameId = 0;
    }

    private GetBoardInforRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static GetBoardInforRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<GetBoardInforRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getBoardID() {
        return boardID;
    }

    public boolean hasBoardID() {
        return (__bitField0 & 1) == 1;
    }

    public GetBoardInforRequest withBoardID(int value) {
        return GetBoardInforRequest.newBuilder()
            .mergeFrom(this)
            .setBoardID(value)
            .build();
    }

    public int getGameId() {
        return gameId;
    }

    public boolean hasGameId() {
        return (__bitField0 & 2) == 2;
    }

    public GetBoardInforRequest withGameId(int value) {
        return GetBoardInforRequest.newBuilder()
            .mergeFrom(this)
            .setGameId(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<GetBoardInforRequest> cachedSchema() {
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
        GetBoardInforRequest that = (GetBoardInforRequest) obj;
        if (!java.util.Objects.equals(this.boardID, that.boardID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gameId, that.gameId)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.boardID);
        result = 31 * result + Integer.hashCode(this.gameId);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasBoardID()) {
            parts.add("boardID=" + getBoardID());
        }
        if (hasGameId()) {
            parts.add("gameId=" + getGameId());
        }
        return "GetBoardInforRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<GetBoardInforRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("boardID", 1);
        	__fieldMap.put("gameId", 2);
        }

        @Override
        public GetBoardInforRequest newMessage() {
            return new GetBoardInforRequest();
        }

        @Override
        public Class<GetBoardInforRequest> typeClass() {
            return GetBoardInforRequest.class;
        }

        @Override
        public String messageName() {
            return GetBoardInforRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return GetBoardInforRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(GetBoardInforRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, GetBoardInforRequest instance) throws java.io.IOException {
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
                    	instance.boardID = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.gameId = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, GetBoardInforRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.boardID, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.gameId, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "boardID";
        		case 2: return "gameId";
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

        private int boardID;

        private int gameId;

        private int __bitField0;

        private Builder() {
            this.boardID = 0;
            this.gameId = 0;
        }

        public Builder mergeFrom(GetBoardInforRequest instance) {
            if (instance.hasBoardID()) {
                this.setBoardID(instance.getBoardID());
            }

            if (instance.hasGameId()) {
                this.setGameId(instance.getGameId());
            }

            return this;
        }

        public int getBoardID() {
            return boardID;
        }

        public Builder setBoardID(int value) {
            this.boardID = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearBoardID() {
            this.boardID = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasBoardID() {
            return (__bitField0 & 1) == 1;
        }

        public int getGameId() {
            return gameId;
        }

        public Builder setGameId(int value) {
            this.gameId = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearGameId() {
            this.gameId = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasGameId() {
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
            if (!java.util.Objects.equals(this.boardID, that.boardID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gameId, that.gameId)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.boardID);
            result = 31 * result + Integer.hashCode(this.gameId);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasBoardID()) {
                parts.add("boardID=" + getBoardID());
            }
            if (hasGameId()) {
                parts.add("gameId=" + getGameId());
            }
            return "GetBoardInforRequest{" + String.join(", ", parts) + "}";
        }

        public GetBoardInforRequest build() {
            proto.message.GetBoardInforRequest result = new proto.message.GetBoardInforRequest();
            result.__bitField0 = __bitField0;
            result.boardID = this.boardID;
            result.gameId = this.gameId;
            return result;
        }

    }



}