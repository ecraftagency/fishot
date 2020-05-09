package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class GetBoardListResponse
        implements io.protostuff.Message<GetBoardListResponse> {

    private static final GetBoardListResponse DEFAULT_INSTANCE = newBuilder().build();

    private int gameID;

    private int roomID;

    private int pageID;

    private int pageSize;

    private int maxBoard;

    private java.util.List<proto.message.BoardInfor> boardInfor;

    private boolean __merge_lock = false;
    private int __bitField0;

    private GetBoardListResponse() {
        this.gameID = 0;
        this.roomID = 0;
        this.pageID = 0;
        this.pageSize = 0;
        this.maxBoard = 0;
        this.boardInfor = java.util.Collections.emptyList();
    }

    private GetBoardListResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static GetBoardListResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<GetBoardListResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getGameID() {
        return gameID;
    }

    public boolean hasGameID() {
        return (__bitField0 & 1) == 1;
    }

    public GetBoardListResponse withGameID(int value) {
        return GetBoardListResponse.newBuilder()
            .mergeFrom(this)
            .setGameID(value)
            .build();
    }

    public int getRoomID() {
        return roomID;
    }

    public boolean hasRoomID() {
        return (__bitField0 & 2) == 2;
    }

    public GetBoardListResponse withRoomID(int value) {
        return GetBoardListResponse.newBuilder()
            .mergeFrom(this)
            .setRoomID(value)
            .build();
    }

    public int getPageID() {
        return pageID;
    }

    public boolean hasPageID() {
        return (__bitField0 & 4) == 4;
    }

    public GetBoardListResponse withPageID(int value) {
        return GetBoardListResponse.newBuilder()
            .mergeFrom(this)
            .setPageID(value)
            .build();
    }

    public int getPageSize() {
        return pageSize;
    }

    public boolean hasPageSize() {
        return (__bitField0 & 8) == 8;
    }

    public GetBoardListResponse withPageSize(int value) {
        return GetBoardListResponse.newBuilder()
            .mergeFrom(this)
            .setPageSize(value)
            .build();
    }

    public int getMaxBoard() {
        return maxBoard;
    }

    public boolean hasMaxBoard() {
        return (__bitField0 & 16) == 16;
    }

    public GetBoardListResponse withMaxBoard(int value) {
        return GetBoardListResponse.newBuilder()
            .mergeFrom(this)
            .setMaxBoard(value)
            .build();
    }

    public java.util.List<proto.message.BoardInfor> getBoardInforList() {
        return boardInfor;
    }

    public int getBoardInforCount() {
        return boardInfor.size();
    }

    public proto.message.BoardInfor getBoardInfor(int index) {
        return boardInfor.get(index);
    }

    public GetBoardListResponse withBoardInfor(java.util.List<proto.message.BoardInfor> value) {
        return GetBoardListResponse.newBuilder()
            .mergeFrom(this)
            .clearBoardInfor()
            .addAllBoardInfor(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<GetBoardListResponse> cachedSchema() {
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
        GetBoardListResponse that = (GetBoardListResponse) obj;
        if (!java.util.Objects.equals(this.gameID, that.gameID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.roomID, that.roomID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.pageID, that.pageID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.pageSize, that.pageSize)) {
            return false;
        }
        if (!java.util.Objects.equals(this.maxBoard, that.maxBoard)) {
            return false;
        }
        if (!java.util.Objects.equals(this.boardInfor, that.boardInfor)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.gameID);
        result = 31 * result + Integer.hashCode(this.roomID);
        result = 31 * result + Integer.hashCode(this.pageID);
        result = 31 * result + Integer.hashCode(this.pageSize);
        result = 31 * result + Integer.hashCode(this.maxBoard);
        result = 31 * result + (this.boardInfor == null ? 0 : this.boardInfor.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasGameID()) {
            parts.add("gameID=" + getGameID());
        }
        if (hasRoomID()) {
            parts.add("roomID=" + getRoomID());
        }
        if (hasPageID()) {
            parts.add("pageID=" + getPageID());
        }
        if (hasPageSize()) {
            parts.add("pageSize=" + getPageSize());
        }
        if (hasMaxBoard()) {
            parts.add("maxBoard=" + getMaxBoard());
        }
        if (!boardInfor.isEmpty()) {
            parts.add("boardInfor=" + getBoardInforList());
        }
        return "GetBoardListResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<GetBoardListResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("gameID", 1);
        	__fieldMap.put("roomID", 2);
        	__fieldMap.put("pageID", 3);
        	__fieldMap.put("pageSize", 4);
        	__fieldMap.put("maxBoard", 5);
        	__fieldMap.put("boardInfor", 6);
        }

        @Override
        public GetBoardListResponse newMessage() {
            return new GetBoardListResponse();
        }

        @Override
        public Class<GetBoardListResponse> typeClass() {
            return GetBoardListResponse.class;
        }

        @Override
        public String messageName() {
            return GetBoardListResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return GetBoardListResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(GetBoardListResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, GetBoardListResponse instance) throws java.io.IOException {
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
                    	instance.gameID = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.roomID = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.pageID = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.pageSize = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.maxBoard = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	if(!((instance.__bitField0 & 32) == 32)) {
                    	    instance.boardInfor = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 32;
                    	}
                    	instance.boardInfor.add(input.mergeObject(null, proto.message.BoardInfor.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 32) == 32) {
                instance.boardInfor = java.util.Collections.unmodifiableList(instance.boardInfor);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, GetBoardListResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.gameID, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.roomID, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.pageID, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.pageSize, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.maxBoard, false);
            }

            for(proto.message.BoardInfor boardInfor : instance.boardInfor) {
                output.writeObject(6, boardInfor, proto.message.BoardInfor.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "gameID";
        		case 2: return "roomID";
        		case 3: return "pageID";
        		case 4: return "pageSize";
        		case 5: return "maxBoard";
        		case 6: return "boardInfor";
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

        private int gameID;

        private int roomID;

        private int pageID;

        private int pageSize;

        private int maxBoard;

        private java.util.List<proto.message.BoardInfor> boardInfor;

        private int __bitField0;

        private Builder() {
            this.gameID = 0;
            this.roomID = 0;
            this.pageID = 0;
            this.pageSize = 0;
            this.maxBoard = 0;
            this.boardInfor = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(GetBoardListResponse instance) {
            if (instance.hasGameID()) {
                this.setGameID(instance.getGameID());
            }

            if (instance.hasRoomID()) {
                this.setRoomID(instance.getRoomID());
            }

            if (instance.hasPageID()) {
                this.setPageID(instance.getPageID());
            }

            if (instance.hasPageSize()) {
                this.setPageSize(instance.getPageSize());
            }

            if (instance.hasMaxBoard()) {
                this.setMaxBoard(instance.getMaxBoard());
            }

            this.addAllBoardInfor(instance.getBoardInforList());

            return this;
        }

        public int getGameID() {
            return gameID;
        }

        public Builder setGameID(int value) {
            this.gameID = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearGameID() {
            this.gameID = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasGameID() {
            return (__bitField0 & 1) == 1;
        }

        public int getRoomID() {
            return roomID;
        }

        public Builder setRoomID(int value) {
            this.roomID = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearRoomID() {
            this.roomID = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasRoomID() {
            return (__bitField0 & 2) == 2;
        }

        public int getPageID() {
            return pageID;
        }

        public Builder setPageID(int value) {
            this.pageID = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearPageID() {
            this.pageID = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasPageID() {
            return (__bitField0 & 4) == 4;
        }

        public int getPageSize() {
            return pageSize;
        }

        public Builder setPageSize(int value) {
            this.pageSize = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearPageSize() {
            this.pageSize = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasPageSize() {
            return (__bitField0 & 8) == 8;
        }

        public int getMaxBoard() {
            return maxBoard;
        }

        public Builder setMaxBoard(int value) {
            this.maxBoard = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearMaxBoard() {
            this.maxBoard = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasMaxBoard() {
            return (__bitField0 & 16) == 16;
        }

        public java.util.List<proto.message.BoardInfor> getBoardInforList() {
            return boardInfor;
        }

        public Builder setBoardInfor(int index, proto.message.BoardInfor value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GetBoardListResponse#boardInfor to null");
            }

            if(!((__bitField0 & 32) == 32)) {
                this.boardInfor = new java.util.ArrayList<>();
                __bitField0 |= 32;
            }
            this.boardInfor.set(index, value);
            return this;
        }

        public Builder addBoardInfor(proto.message.BoardInfor value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GetBoardListResponse#boardInfor to null");
            }

            if(!((__bitField0 & 32) == 32)) {
                this.boardInfor = new java.util.ArrayList<>();
                __bitField0 |= 32;
            }
            this.boardInfor.add(value);
            return this;
        }

        public Builder addAllBoardInfor(java.lang.Iterable<proto.message.BoardInfor> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set GetBoardListResponse#boardInfor to null");
            }
            if(!((__bitField0 & 32) == 32)) {
                this.boardInfor = new java.util.ArrayList<>();
                __bitField0 |= 32;
            }
            for (final proto.message.BoardInfor value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set GetBoardListResponse#boardInfor to null");
                }
                this.boardInfor.add(value);
            }
            return this;
        }

        public Builder clearBoardInfor() {
            this.boardInfor = java.util.Collections.emptyList();
            __bitField0 &= ~32;
            return this;
        }

        public int getBoardInforCount() {
            return boardInfor.size();
        }

        public proto.message.BoardInfor getBoardInfor(int index) {
            return boardInfor.get(index);
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
            if (!java.util.Objects.equals(this.gameID, that.gameID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.roomID, that.roomID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.pageID, that.pageID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.pageSize, that.pageSize)) {
                return false;
            }
            if (!java.util.Objects.equals(this.maxBoard, that.maxBoard)) {
                return false;
            }
            if (!java.util.Objects.equals(this.boardInfor, that.boardInfor)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.gameID);
            result = 31 * result + Integer.hashCode(this.roomID);
            result = 31 * result + Integer.hashCode(this.pageID);
            result = 31 * result + Integer.hashCode(this.pageSize);
            result = 31 * result + Integer.hashCode(this.maxBoard);
            result = 31 * result + (this.boardInfor == null ? 0 : this.boardInfor.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasGameID()) {
                parts.add("gameID=" + getGameID());
            }
            if (hasRoomID()) {
                parts.add("roomID=" + getRoomID());
            }
            if (hasPageID()) {
                parts.add("pageID=" + getPageID());
            }
            if (hasPageSize()) {
                parts.add("pageSize=" + getPageSize());
            }
            if (hasMaxBoard()) {
                parts.add("maxBoard=" + getMaxBoard());
            }
            if (!boardInfor.isEmpty()) {
                parts.add("boardInfor=" + getBoardInforList());
            }
            return "GetBoardListResponse{" + String.join(", ", parts) + "}";
        }

        public GetBoardListResponse build() {
            proto.message.GetBoardListResponse result = new proto.message.GetBoardListResponse();
            result.__bitField0 = __bitField0;
            result.gameID = this.gameID;
            result.roomID = this.roomID;
            result.pageID = this.pageID;
            result.pageSize = this.pageSize;
            result.maxBoard = this.maxBoard;
            result.boardInfor = java.util.Collections.unmodifiableList(this.boardInfor);
            return result;
        }

    }



}