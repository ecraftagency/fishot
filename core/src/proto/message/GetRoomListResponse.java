package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class GetRoomListResponse
        implements io.protostuff.Message<GetRoomListResponse> {

    private static final GetRoomListResponse DEFAULT_INSTANCE = newBuilder().build();

    private int gameID;

    private java.util.List<proto.message.RoomInfor> roomInfor;

    private boolean __merge_lock = false;
    private int __bitField0;

    private GetRoomListResponse() {
        this.gameID = 0;
        this.roomInfor = java.util.Collections.emptyList();
    }

    private GetRoomListResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static GetRoomListResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<GetRoomListResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getGameID() {
        return gameID;
    }

    public boolean hasGameID() {
        return (__bitField0 & 1) == 1;
    }

    public GetRoomListResponse withGameID(int value) {
        return GetRoomListResponse.newBuilder()
            .mergeFrom(this)
            .setGameID(value)
            .build();
    }

    public java.util.List<proto.message.RoomInfor> getRoomInforList() {
        return roomInfor;
    }

    public int getRoomInforCount() {
        return roomInfor.size();
    }

    public proto.message.RoomInfor getRoomInfor(int index) {
        return roomInfor.get(index);
    }

    public GetRoomListResponse withRoomInfor(java.util.List<proto.message.RoomInfor> value) {
        return GetRoomListResponse.newBuilder()
            .mergeFrom(this)
            .clearRoomInfor()
            .addAllRoomInfor(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<GetRoomListResponse> cachedSchema() {
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
        GetRoomListResponse that = (GetRoomListResponse) obj;
        if (!java.util.Objects.equals(this.gameID, that.gameID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.roomInfor, that.roomInfor)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.gameID);
        result = 31 * result + (this.roomInfor == null ? 0 : this.roomInfor.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasGameID()) {
            parts.add("gameID=" + getGameID());
        }
        if (!roomInfor.isEmpty()) {
            parts.add("roomInfor=" + getRoomInforList());
        }
        return "GetRoomListResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<GetRoomListResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("gameID", 1);
        	__fieldMap.put("roomInfor", 2);
        }

        @Override
        public GetRoomListResponse newMessage() {
            return new GetRoomListResponse();
        }

        @Override
        public Class<GetRoomListResponse> typeClass() {
            return GetRoomListResponse.class;
        }

        @Override
        public String messageName() {
            return GetRoomListResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return GetRoomListResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(GetRoomListResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, GetRoomListResponse instance) throws java.io.IOException {
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
                    	if(!((instance.__bitField0 & 2) == 2)) {
                    	    instance.roomInfor = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 2;
                    	}
                    	instance.roomInfor.add(input.mergeObject(null, proto.message.RoomInfor.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 2) == 2) {
                instance.roomInfor = java.util.Collections.unmodifiableList(instance.roomInfor);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, GetRoomListResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.gameID, false);
            }

            for(proto.message.RoomInfor roomInfor : instance.roomInfor) {
                output.writeObject(2, roomInfor, proto.message.RoomInfor.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "gameID";
        		case 2: return "roomInfor";
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

        private java.util.List<proto.message.RoomInfor> roomInfor;

        private int __bitField0;

        private Builder() {
            this.gameID = 0;
            this.roomInfor = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(GetRoomListResponse instance) {
            if (instance.hasGameID()) {
                this.setGameID(instance.getGameID());
            }

            this.addAllRoomInfor(instance.getRoomInforList());

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

        public java.util.List<proto.message.RoomInfor> getRoomInforList() {
            return roomInfor;
        }

        public Builder setRoomInfor(int index, proto.message.RoomInfor value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GetRoomListResponse#roomInfor to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.roomInfor = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.roomInfor.set(index, value);
            return this;
        }

        public Builder addRoomInfor(proto.message.RoomInfor value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GetRoomListResponse#roomInfor to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.roomInfor = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.roomInfor.add(value);
            return this;
        }

        public Builder addAllRoomInfor(java.lang.Iterable<proto.message.RoomInfor> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set GetRoomListResponse#roomInfor to null");
            }
            if(!((__bitField0 & 2) == 2)) {
                this.roomInfor = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            for (final proto.message.RoomInfor value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set GetRoomListResponse#roomInfor to null");
                }
                this.roomInfor.add(value);
            }
            return this;
        }

        public Builder clearRoomInfor() {
            this.roomInfor = java.util.Collections.emptyList();
            __bitField0 &= ~2;
            return this;
        }

        public int getRoomInforCount() {
            return roomInfor.size();
        }

        public proto.message.RoomInfor getRoomInfor(int index) {
            return roomInfor.get(index);
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
            if (!java.util.Objects.equals(this.roomInfor, that.roomInfor)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.gameID);
            result = 31 * result + (this.roomInfor == null ? 0 : this.roomInfor.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasGameID()) {
                parts.add("gameID=" + getGameID());
            }
            if (!roomInfor.isEmpty()) {
                parts.add("roomInfor=" + getRoomInforList());
            }
            return "GetRoomListResponse{" + String.join(", ", parts) + "}";
        }

        public GetRoomListResponse build() {
            proto.message.GetRoomListResponse result = new proto.message.GetRoomListResponse();
            result.__bitField0 = __bitField0;
            result.gameID = this.gameID;
            result.roomInfor = java.util.Collections.unmodifiableList(this.roomInfor);
            return result;
        }

    }



}