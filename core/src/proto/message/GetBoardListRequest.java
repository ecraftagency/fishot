package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class GetBoardListRequest
        implements io.protostuff.Message<GetBoardListRequest> {

    private static final GetBoardListRequest DEFAULT_INSTANCE = newBuilder().build();

    private int gameID;

    private int roomID;

    private int pageID;

    private int pageSize;

    private boolean __merge_lock = false;
    private int __bitField0;

    private GetBoardListRequest() {
        this.gameID = 0;
        this.roomID = 0;
        this.pageID = 0;
        this.pageSize = 0;
    }

    private GetBoardListRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static GetBoardListRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<GetBoardListRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getGameID() {
        return gameID;
    }

    public boolean hasGameID() {
        return (__bitField0 & 1) == 1;
    }

    public GetBoardListRequest withGameID(int value) {
        return GetBoardListRequest.newBuilder()
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

    public GetBoardListRequest withRoomID(int value) {
        return GetBoardListRequest.newBuilder()
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

    public GetBoardListRequest withPageID(int value) {
        return GetBoardListRequest.newBuilder()
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

    public GetBoardListRequest withPageSize(int value) {
        return GetBoardListRequest.newBuilder()
            .mergeFrom(this)
            .setPageSize(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<GetBoardListRequest> cachedSchema() {
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
        GetBoardListRequest that = (GetBoardListRequest) obj;
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

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.gameID);
        result = 31 * result + Integer.hashCode(this.roomID);
        result = 31 * result + Integer.hashCode(this.pageID);
        result = 31 * result + Integer.hashCode(this.pageSize);

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
        return "GetBoardListRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<GetBoardListRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("gameID", 1);
        	__fieldMap.put("roomID", 2);
        	__fieldMap.put("pageID", 3);
        	__fieldMap.put("pageSize", 4);
        }

        @Override
        public GetBoardListRequest newMessage() {
            return new GetBoardListRequest();
        }

        @Override
        public Class<GetBoardListRequest> typeClass() {
            return GetBoardListRequest.class;
        }

        @Override
        public String messageName() {
            return GetBoardListRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return GetBoardListRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(GetBoardListRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, GetBoardListRequest instance) throws java.io.IOException {
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
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, GetBoardListRequest instance) throws java.io.IOException {
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

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "gameID";
        		case 2: return "roomID";
        		case 3: return "pageID";
        		case 4: return "pageSize";
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

        private int __bitField0;

        private Builder() {
            this.gameID = 0;
            this.roomID = 0;
            this.pageID = 0;
            this.pageSize = 0;
        }

        public Builder mergeFrom(GetBoardListRequest instance) {
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

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.gameID);
            result = 31 * result + Integer.hashCode(this.roomID);
            result = 31 * result + Integer.hashCode(this.pageID);
            result = 31 * result + Integer.hashCode(this.pageSize);

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
            return "GetBoardListRequest{" + String.join(", ", parts) + "}";
        }

        public GetBoardListRequest build() {
            proto.message.GetBoardListRequest result = new proto.message.GetBoardListRequest();
            result.__bitField0 = __bitField0;
            result.gameID = this.gameID;
            result.roomID = this.roomID;
            result.pageID = this.pageID;
            result.pageSize = this.pageSize;
            return result;
        }

    }



}