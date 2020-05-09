package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class GetBoardInforResponse
        implements io.protostuff.Message<GetBoardInforResponse> {

    private static final GetBoardInforResponse DEFAULT_INSTANCE = newBuilder().build();

    private int boardID;

    private String ownerID;

    private int betMoney;

    private int currentTime;

    private java.util.List<proto.message.GetBoardInforResponse.BoardPlayerInfor> boardPlayerInfor;

    private int boardStatus;

    private int changeAt;

    private int duration;

    private String typeName;

    private int typeVal;

    private boolean canJoin;

    private int roomID;

    private boolean __merge_lock = false;
    private int __bitField0;

    private GetBoardInforResponse() {
        this.boardID = 0;
        this.ownerID = "";
        this.betMoney = 0;
        this.currentTime = 0;
        this.boardPlayerInfor = java.util.Collections.emptyList();
        this.boardStatus = 0;
        this.changeAt = 0;
        this.duration = 0;
        this.typeName = "";
        this.typeVal = proto.message.BetmodeType.TYPE_NORMAL.getNumber();
        this.canJoin = false;
        this.roomID = 0;
    }

    private GetBoardInforResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static GetBoardInforResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<GetBoardInforResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getBoardID() {
        return boardID;
    }

    public boolean hasBoardID() {
        return (__bitField0 & 1) == 1;
    }

    public GetBoardInforResponse withBoardID(int value) {
        return GetBoardInforResponse.newBuilder()
            .mergeFrom(this)
            .setBoardID(value)
            .build();
    }

    public String getOwnerID() {
        return ownerID;
    }

    public boolean hasOwnerID() {
        return (__bitField0 & 2) == 2;
    }

    public GetBoardInforResponse withOwnerID(String value) {
        return GetBoardInforResponse.newBuilder()
            .mergeFrom(this)
            .setOwnerID(value)
            .build();
    }

    public int getBetMoney() {
        return betMoney;
    }

    public boolean hasBetMoney() {
        return (__bitField0 & 4) == 4;
    }

    public GetBoardInforResponse withBetMoney(int value) {
        return GetBoardInforResponse.newBuilder()
            .mergeFrom(this)
            .setBetMoney(value)
            .build();
    }

    public int getCurrentTime() {
        return currentTime;
    }

    public boolean hasCurrentTime() {
        return (__bitField0 & 8) == 8;
    }

    public GetBoardInforResponse withCurrentTime(int value) {
        return GetBoardInforResponse.newBuilder()
            .mergeFrom(this)
            .setCurrentTime(value)
            .build();
    }

    public java.util.List<proto.message.GetBoardInforResponse.BoardPlayerInfor> getBoardPlayerInforList() {
        return boardPlayerInfor;
    }

    public int getBoardPlayerInforCount() {
        return boardPlayerInfor.size();
    }

    public proto.message.GetBoardInforResponse.BoardPlayerInfor getBoardPlayerInfor(int index) {
        return boardPlayerInfor.get(index);
    }

    public GetBoardInforResponse withBoardPlayerInfor(java.util.List<proto.message.GetBoardInforResponse.BoardPlayerInfor> value) {
        return GetBoardInforResponse.newBuilder()
            .mergeFrom(this)
            .clearBoardPlayerInfor()
            .addAllBoardPlayerInfor(value)
            .build();
    }

    public int getBoardStatus() {
        return boardStatus;
    }

    public boolean hasBoardStatus() {
        return (__bitField0 & 32) == 32;
    }

    public GetBoardInforResponse withBoardStatus(int value) {
        return GetBoardInforResponse.newBuilder()
            .mergeFrom(this)
            .setBoardStatus(value)
            .build();
    }

    public int getChangeAt() {
        return changeAt;
    }

    public boolean hasChangeAt() {
        return (__bitField0 & 64) == 64;
    }

    public GetBoardInforResponse withChangeAt(int value) {
        return GetBoardInforResponse.newBuilder()
            .mergeFrom(this)
            .setChangeAt(value)
            .build();
    }

    public int getDuration() {
        return duration;
    }

    public boolean hasDuration() {
        return (__bitField0 & 128) == 128;
    }

    public GetBoardInforResponse withDuration(int value) {
        return GetBoardInforResponse.newBuilder()
            .mergeFrom(this)
            .setDuration(value)
            .build();
    }

    public String getTypeName() {
        return typeName;
    }

    public boolean hasTypeName() {
        return (__bitField0 & 256) == 256;
    }

    public GetBoardInforResponse withTypeName(String value) {
        return GetBoardInforResponse.newBuilder()
            .mergeFrom(this)
            .setTypeName(value)
            .build();
    }

    public proto.message.BetmodeType getTypeVal() {
        return proto.message.BetmodeType.valueOf(typeVal);
    }

    public int getTypeValValue() {
        return typeVal;
    }

    public boolean hasTypeVal() {
        return (__bitField0 & 512) == 512;
    }

    public GetBoardInforResponse withTypeVal(proto.message.BetmodeType value) {
        return GetBoardInforResponse.newBuilder()
            .mergeFrom(this)
            .setTypeVal(value)
            .build();
    }

    public boolean getCanJoin() {
        return canJoin;
    }

    public boolean hasCanJoin() {
        return (__bitField0 & 1024) == 1024;
    }

    public GetBoardInforResponse withCanJoin(boolean value) {
        return GetBoardInforResponse.newBuilder()
            .mergeFrom(this)
            .setCanJoin(value)
            .build();
    }

    public int getRoomID() {
        return roomID;
    }

    public boolean hasRoomID() {
        return (__bitField0 & 2048) == 2048;
    }

    public GetBoardInforResponse withRoomID(int value) {
        return GetBoardInforResponse.newBuilder()
            .mergeFrom(this)
            .setRoomID(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<GetBoardInforResponse> cachedSchema() {
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
        GetBoardInforResponse that = (GetBoardInforResponse) obj;
        if (!java.util.Objects.equals(this.boardID, that.boardID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.ownerID, that.ownerID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.betMoney, that.betMoney)) {
            return false;
        }
        if (!java.util.Objects.equals(this.currentTime, that.currentTime)) {
            return false;
        }
        if (!java.util.Objects.equals(this.boardPlayerInfor, that.boardPlayerInfor)) {
            return false;
        }
        if (!java.util.Objects.equals(this.boardStatus, that.boardStatus)) {
            return false;
        }
        if (!java.util.Objects.equals(this.changeAt, that.changeAt)) {
            return false;
        }
        if (!java.util.Objects.equals(this.duration, that.duration)) {
            return false;
        }
        if (!java.util.Objects.equals(this.typeName, that.typeName)) {
            return false;
        }
        if (!java.util.Objects.equals(this.typeVal, that.typeVal)) {
            return false;
        }
        if (!java.util.Objects.equals(this.canJoin, that.canJoin)) {
            return false;
        }
        if (!java.util.Objects.equals(this.roomID, that.roomID)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.boardID);
        result = 31 * result + (this.ownerID == null ? 0 : this.ownerID.hashCode());
        result = 31 * result + Integer.hashCode(this.betMoney);
        result = 31 * result + Integer.hashCode(this.currentTime);
        result = 31 * result + (this.boardPlayerInfor == null ? 0 : this.boardPlayerInfor.hashCode());
        result = 31 * result + Integer.hashCode(this.boardStatus);
        result = 31 * result + Integer.hashCode(this.changeAt);
        result = 31 * result + Integer.hashCode(this.duration);
        result = 31 * result + (this.typeName == null ? 0 : this.typeName.hashCode());
        result = 31 * result + Integer.hashCode(this.typeVal);
        result = 31 * result + Boolean.hashCode(this.canJoin);
        result = 31 * result + Integer.hashCode(this.roomID);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasBoardID()) {
            parts.add("boardID=" + getBoardID());
        }
        if (hasOwnerID()) {
            parts.add("ownerID=" + getOwnerID());
        }
        if (hasBetMoney()) {
            parts.add("betMoney=" + getBetMoney());
        }
        if (hasCurrentTime()) {
            parts.add("currentTime=" + getCurrentTime());
        }
        if (!boardPlayerInfor.isEmpty()) {
            parts.add("boardPlayerInfor=" + getBoardPlayerInforList());
        }
        if (hasBoardStatus()) {
            parts.add("boardStatus=" + getBoardStatus());
        }
        if (hasChangeAt()) {
            parts.add("changeAt=" + getChangeAt());
        }
        if (hasDuration()) {
            parts.add("duration=" + getDuration());
        }
        if (hasTypeName()) {
            parts.add("typeName=" + getTypeName());
        }
        if (hasTypeVal()) {
            parts.add("typeVal=" + getTypeVal() + '(' + getTypeValValue() + ')');
        }
        if (hasCanJoin()) {
            parts.add("canJoin=" + getCanJoin());
        }
        if (hasRoomID()) {
            parts.add("roomID=" + getRoomID());
        }
        return "GetBoardInforResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<GetBoardInforResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("boardID", 3);
        	__fieldMap.put("ownerID", 4);
        	__fieldMap.put("betMoney", 5);
        	__fieldMap.put("currentTime", 6);
        	__fieldMap.put("boardPlayerInfor", 7);
        	__fieldMap.put("boardStatus", 8);
        	__fieldMap.put("changeAt", 9);
        	__fieldMap.put("duration", 10);
        	__fieldMap.put("typeName", 11);
        	__fieldMap.put("typeVal", 12);
        	__fieldMap.put("canJoin", 13);
        	__fieldMap.put("roomID", 14);
        }

        @Override
        public GetBoardInforResponse newMessage() {
            return new GetBoardInforResponse();
        }

        @Override
        public Class<GetBoardInforResponse> typeClass() {
            return GetBoardInforResponse.class;
        }

        @Override
        public String messageName() {
            return GetBoardInforResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return GetBoardInforResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(GetBoardInforResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, GetBoardInforResponse instance) throws java.io.IOException {
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
                    case 3:
                    	instance.boardID = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 4:
                    	instance.ownerID = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 5:
                    	instance.betMoney = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 6:
                    	instance.currentTime = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 7:
                    	if(!((instance.__bitField0 & 16) == 16)) {
                    	    instance.boardPlayerInfor = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 16;
                    	}
                    	instance.boardPlayerInfor.add(input.mergeObject(null, proto.message.GetBoardInforResponse.BoardPlayerInfor.getSchema()));

                    	break;
                    case 8:
                    	instance.boardStatus = input.readInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 9:
                    	instance.changeAt = input.readInt32();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 10:
                    	instance.duration = input.readInt32();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 11:
                    	instance.typeName = input.readString();
                    	instance.__bitField0 |= 256;
                    	break;
                    case 12:
                    	instance.typeVal = input.readEnum();
                    	instance.__bitField0 |= 512;
                    	break;
                    case 13:
                    	instance.canJoin = input.readBool();
                    	instance.__bitField0 |= 1024;
                    	break;
                    case 14:
                    	instance.roomID = input.readInt32();
                    	instance.__bitField0 |= 2048;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 16) == 16) {
                instance.boardPlayerInfor = java.util.Collections.unmodifiableList(instance.boardPlayerInfor);
            }








        }

        @Override
        public void writeTo(io.protostuff.Output output, GetBoardInforResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(3, instance.boardID, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(4, instance.ownerID, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(5, instance.betMoney, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(6, instance.currentTime, false);
            }

            for(proto.message.GetBoardInforResponse.BoardPlayerInfor boardPlayerInfor : instance.boardPlayerInfor) {
                output.writeObject(7, boardPlayerInfor, proto.message.GetBoardInforResponse.BoardPlayerInfor.getSchema(), true);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeInt32(8, instance.boardStatus, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeInt32(9, instance.changeAt, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeInt32(10, instance.duration, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeString(11, instance.typeName, false);
            }

            if((instance.__bitField0 & 512) == 512) {
            	output.writeEnum(12, instance.typeVal, false);
            }

            if((instance.__bitField0 & 1024) == 1024) {
                output.writeBool(13, instance.canJoin, false);
            }

            if((instance.__bitField0 & 2048) == 2048) {
                output.writeInt32(14, instance.roomID, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 3: return "boardID";
        		case 4: return "ownerID";
        		case 5: return "betMoney";
        		case 6: return "currentTime";
        		case 7: return "boardPlayerInfor";
        		case 8: return "boardStatus";
        		case 9: return "changeAt";
        		case 10: return "duration";
        		case 11: return "typeName";
        		case 12: return "typeVal";
        		case 13: return "canJoin";
        		case 14: return "roomID";
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

        private String ownerID;

        private int betMoney;

        private int currentTime;

        private java.util.List<proto.message.GetBoardInforResponse.BoardPlayerInfor> boardPlayerInfor;

        private int boardStatus;

        private int changeAt;

        private int duration;

        private String typeName;

        private int typeVal;

        private boolean canJoin;

        private int roomID;

        private int __bitField0;

        private Builder() {
            this.boardID = 0;
            this.ownerID = "";
            this.betMoney = 0;
            this.currentTime = 0;
            this.boardPlayerInfor = java.util.Collections.emptyList();
            this.boardStatus = 0;
            this.changeAt = 0;
            this.duration = 0;
            this.typeName = "";
            this.typeVal = proto.message.BetmodeType.TYPE_NORMAL.getNumber();
            this.canJoin = false;
            this.roomID = 0;
        }

        public Builder mergeFrom(GetBoardInforResponse instance) {
            if (instance.hasBoardID()) {
                this.setBoardID(instance.getBoardID());
            }

            if (instance.hasOwnerID()) {
                this.setOwnerID(instance.getOwnerID());
            }

            if (instance.hasBetMoney()) {
                this.setBetMoney(instance.getBetMoney());
            }

            if (instance.hasCurrentTime()) {
                this.setCurrentTime(instance.getCurrentTime());
            }

            this.addAllBoardPlayerInfor(instance.getBoardPlayerInforList());

            if (instance.hasBoardStatus()) {
                this.setBoardStatus(instance.getBoardStatus());
            }

            if (instance.hasChangeAt()) {
                this.setChangeAt(instance.getChangeAt());
            }

            if (instance.hasDuration()) {
                this.setDuration(instance.getDuration());
            }

            if (instance.hasTypeName()) {
                this.setTypeName(instance.getTypeName());
            }

            if (instance.hasTypeVal()) {
                this.setTypeVal(instance.getTypeVal());
            }

            if (instance.hasCanJoin()) {
                this.setCanJoin(instance.getCanJoin());
            }

            if (instance.hasRoomID()) {
                this.setRoomID(instance.getRoomID());
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

        public String getOwnerID() {
            return ownerID;
        }

        public Builder setOwnerID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GetBoardInforResponse#ownerID to null");
            }

            this.ownerID = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearOwnerID() {
            this.ownerID = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasOwnerID() {
            return (__bitField0 & 2) == 2;
        }

        public int getBetMoney() {
            return betMoney;
        }

        public Builder setBetMoney(int value) {
            this.betMoney = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearBetMoney() {
            this.betMoney = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasBetMoney() {
            return (__bitField0 & 4) == 4;
        }

        public int getCurrentTime() {
            return currentTime;
        }

        public Builder setCurrentTime(int value) {
            this.currentTime = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearCurrentTime() {
            this.currentTime = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasCurrentTime() {
            return (__bitField0 & 8) == 8;
        }

        public java.util.List<proto.message.GetBoardInforResponse.BoardPlayerInfor> getBoardPlayerInforList() {
            return boardPlayerInfor;
        }

        public Builder setBoardPlayerInfor(int index, proto.message.GetBoardInforResponse.BoardPlayerInfor value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GetBoardInforResponse#boardPlayerInfor to null");
            }

            if(!((__bitField0 & 16) == 16)) {
                this.boardPlayerInfor = new java.util.ArrayList<>();
                __bitField0 |= 16;
            }
            this.boardPlayerInfor.set(index, value);
            return this;
        }

        public Builder addBoardPlayerInfor(proto.message.GetBoardInforResponse.BoardPlayerInfor value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GetBoardInforResponse#boardPlayerInfor to null");
            }

            if(!((__bitField0 & 16) == 16)) {
                this.boardPlayerInfor = new java.util.ArrayList<>();
                __bitField0 |= 16;
            }
            this.boardPlayerInfor.add(value);
            return this;
        }

        public Builder addAllBoardPlayerInfor(java.lang.Iterable<proto.message.GetBoardInforResponse.BoardPlayerInfor> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set GetBoardInforResponse#boardPlayerInfor to null");
            }
            if(!((__bitField0 & 16) == 16)) {
                this.boardPlayerInfor = new java.util.ArrayList<>();
                __bitField0 |= 16;
            }
            for (final proto.message.GetBoardInforResponse.BoardPlayerInfor value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set GetBoardInforResponse#boardPlayerInfor to null");
                }
                this.boardPlayerInfor.add(value);
            }
            return this;
        }

        public Builder clearBoardPlayerInfor() {
            this.boardPlayerInfor = java.util.Collections.emptyList();
            __bitField0 &= ~16;
            return this;
        }

        public int getBoardPlayerInforCount() {
            return boardPlayerInfor.size();
        }

        public proto.message.GetBoardInforResponse.BoardPlayerInfor getBoardPlayerInfor(int index) {
            return boardPlayerInfor.get(index);
        }

        public int getBoardStatus() {
            return boardStatus;
        }

        public Builder setBoardStatus(int value) {
            this.boardStatus = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearBoardStatus() {
            this.boardStatus = 0;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasBoardStatus() {
            return (__bitField0 & 32) == 32;
        }

        public int getChangeAt() {
            return changeAt;
        }

        public Builder setChangeAt(int value) {
            this.changeAt = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearChangeAt() {
            this.changeAt = 0;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasChangeAt() {
            return (__bitField0 & 64) == 64;
        }

        public int getDuration() {
            return duration;
        }

        public Builder setDuration(int value) {
            this.duration = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearDuration() {
            this.duration = 0;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasDuration() {
            return (__bitField0 & 128) == 128;
        }

        public String getTypeName() {
            return typeName;
        }

        public Builder setTypeName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GetBoardInforResponse#typeName to null");
            }

            this.typeName = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearTypeName() {
            this.typeName = "";
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasTypeName() {
            return (__bitField0 & 256) == 256;
        }

        public proto.message.BetmodeType getTypeVal() {
            return proto.message.BetmodeType.valueOf(typeVal);
        }

        public int getTypeValValue() {
            return typeVal;
        }

        public Builder setTypeVal(proto.message.BetmodeType value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GetBoardInforResponse#typeVal to null");
            }

            if (value == proto.message.BetmodeType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set GetBoardInforResponse#typeVal to UNRECOGNIZED");
            }

            this.typeVal = value.getNumber();
            __bitField0 |= 512;
            return this;
        }

        public Builder setTypeValValue(int value) {
            this.typeVal = value;
            __bitField0 |= 512;
            return this;
        }

        public Builder clearTypeVal() {
            this.typeVal = 0;
            __bitField0 &= ~512;
            return this;
        }

        public boolean hasTypeVal() {
            return (__bitField0 & 512) == 512;
        }

        public boolean getCanJoin() {
            return canJoin;
        }

        public Builder setCanJoin(boolean value) {
            this.canJoin = value;
            __bitField0 |= 1024;
            return this;
        }

        public Builder clearCanJoin() {
            this.canJoin = false;
            __bitField0 &= ~1024;
            return this;
        }

        public boolean hasCanJoin() {
            return (__bitField0 & 1024) == 1024;
        }

        public int getRoomID() {
            return roomID;
        }

        public Builder setRoomID(int value) {
            this.roomID = value;
            __bitField0 |= 2048;
            return this;
        }

        public Builder clearRoomID() {
            this.roomID = 0;
            __bitField0 &= ~2048;
            return this;
        }

        public boolean hasRoomID() {
            return (__bitField0 & 2048) == 2048;
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
            if (!java.util.Objects.equals(this.ownerID, that.ownerID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.betMoney, that.betMoney)) {
                return false;
            }
            if (!java.util.Objects.equals(this.currentTime, that.currentTime)) {
                return false;
            }
            if (!java.util.Objects.equals(this.boardPlayerInfor, that.boardPlayerInfor)) {
                return false;
            }
            if (!java.util.Objects.equals(this.boardStatus, that.boardStatus)) {
                return false;
            }
            if (!java.util.Objects.equals(this.changeAt, that.changeAt)) {
                return false;
            }
            if (!java.util.Objects.equals(this.duration, that.duration)) {
                return false;
            }
            if (!java.util.Objects.equals(this.typeName, that.typeName)) {
                return false;
            }
            if (!java.util.Objects.equals(this.typeVal, that.typeVal)) {
                return false;
            }
            if (!java.util.Objects.equals(this.canJoin, that.canJoin)) {
                return false;
            }
            if (!java.util.Objects.equals(this.roomID, that.roomID)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.boardID);
            result = 31 * result + (this.ownerID == null ? 0 : this.ownerID.hashCode());
            result = 31 * result + Integer.hashCode(this.betMoney);
            result = 31 * result + Integer.hashCode(this.currentTime);
            result = 31 * result + (this.boardPlayerInfor == null ? 0 : this.boardPlayerInfor.hashCode());
            result = 31 * result + Integer.hashCode(this.boardStatus);
            result = 31 * result + Integer.hashCode(this.changeAt);
            result = 31 * result + Integer.hashCode(this.duration);
            result = 31 * result + (this.typeName == null ? 0 : this.typeName.hashCode());
            result = 31 * result + Integer.hashCode(this.typeVal);
            result = 31 * result + Boolean.hashCode(this.canJoin);
            result = 31 * result + Integer.hashCode(this.roomID);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasBoardID()) {
                parts.add("boardID=" + getBoardID());
            }
            if (hasOwnerID()) {
                parts.add("ownerID=" + getOwnerID());
            }
            if (hasBetMoney()) {
                parts.add("betMoney=" + getBetMoney());
            }
            if (hasCurrentTime()) {
                parts.add("currentTime=" + getCurrentTime());
            }
            if (!boardPlayerInfor.isEmpty()) {
                parts.add("boardPlayerInfor=" + getBoardPlayerInforList());
            }
            if (hasBoardStatus()) {
                parts.add("boardStatus=" + getBoardStatus());
            }
            if (hasChangeAt()) {
                parts.add("changeAt=" + getChangeAt());
            }
            if (hasDuration()) {
                parts.add("duration=" + getDuration());
            }
            if (hasTypeName()) {
                parts.add("typeName=" + getTypeName());
            }
            if (hasTypeVal()) {
                parts.add("typeVal=" + getTypeVal() + '(' + getTypeValValue() + ')');
            }
            if (hasCanJoin()) {
                parts.add("canJoin=" + getCanJoin());
            }
            if (hasRoomID()) {
                parts.add("roomID=" + getRoomID());
            }
            return "GetBoardInforResponse{" + String.join(", ", parts) + "}";
        }

        public GetBoardInforResponse build() {
            proto.message.GetBoardInforResponse result = new proto.message.GetBoardInforResponse();
            result.__bitField0 = __bitField0;
            result.boardID = this.boardID;
            result.ownerID = this.ownerID;
            result.betMoney = this.betMoney;
            result.currentTime = this.currentTime;
            result.boardPlayerInfor = java.util.Collections.unmodifiableList(this.boardPlayerInfor);
            result.boardStatus = this.boardStatus;
            result.changeAt = this.changeAt;
            result.duration = this.duration;
            result.typeName = this.typeName;
            result.typeVal = this.typeVal;
            result.canJoin = this.canJoin;
            result.roomID = this.roomID;
            return result;
        }

    }

    public static final class BoardPlayerInfor
            implements io.protostuff.Message<BoardPlayerInfor> {

        private static final BoardPlayerInfor DEFAULT_INSTANCE = newBuilder().build();

        private String userID;

        private String username;

        private int seatNumber;

        private int gunID;

        private int ammoID;

        private int gold1;

        private int gold2;

        private int gold3;

        private int level;

        private String avatar;

        private int status;

        private int bmRank;

        private int bmReward;

        private int roseAmount;

        private int roseBonusAt;

        private int stunToSecond;

        private int soloSendAt;

        private int soloReceiveAt;

        private String snsName;

        private boolean hasPet;

        private int skillType;

        private int skillGold;

        private int skillAccumulation;

        private int skillAccumulationMax;

        private long skillTimeCurrent;

        private long skillTimeMax;

        private int skillDuration;

        private int skillCannonId;

        private int petLevel;

        private float skillAccBuff;

        private java.util.List<Long> skillTargetFish;

        private boolean __merge_lock = false;
        private int __bitField0;

        private BoardPlayerInfor() {
            this.userID = "";
            this.username = "";
            this.seatNumber = 0;
            this.gunID = 0;
            this.ammoID = 0;
            this.gold1 = 0;
            this.gold2 = 0;
            this.gold3 = 0;
            this.level = 0;
            this.avatar = "";
            this.status = 0;
            this.bmRank = 0;
            this.bmReward = 0;
            this.roseAmount = 0;
            this.roseBonusAt = 0;
            this.stunToSecond = 0;
            this.soloSendAt = 0;
            this.soloReceiveAt = 0;
            this.snsName = "";
            this.hasPet = false;
            this.skillType = 0;
            this.skillGold = 0;
            this.skillAccumulation = 0;
            this.skillAccumulationMax = 0;
            this.skillTimeCurrent = 0L;
            this.skillTimeMax = 0L;
            this.skillDuration = 0;
            this.skillCannonId = 0;
            this.petLevel = 0;
            this.skillAccBuff = 0f;
            this.skillTargetFish = java.util.Collections.emptyList();
        }

        private BoardPlayerInfor(Builder builder) {
            __merge_lock = true;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public static BoardPlayerInfor getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static io.protostuff.Schema<BoardPlayerInfor> getSchema()
        {
        	return Schema.INSTANCE;
        }

        public String getUserID() {
            return userID;
        }

        public boolean hasUserID() {
            return (__bitField0 & 1) == 1;
        }

        public BoardPlayerInfor withUserID(String value) {
            return BoardPlayerInfor.newBuilder()
                .mergeFrom(this)
                .setUserID(value)
                .build();
        }

        public String getUsername() {
            return username;
        }

        public boolean hasUsername() {
            return (__bitField0 & 2) == 2;
        }

        public BoardPlayerInfor withUsername(String value) {
            return BoardPlayerInfor.newBuilder()
                .mergeFrom(this)
                .setUsername(value)
                .build();
        }

        public int getSeatNumber() {
            return seatNumber;
        }

        public boolean hasSeatNumber() {
            return (__bitField0 & 4) == 4;
        }

        public BoardPlayerInfor withSeatNumber(int value) {
            return BoardPlayerInfor.newBuilder()
                .mergeFrom(this)
                .setSeatNumber(value)
                .build();
        }

        public int getGunID() {
            return gunID;
        }

        public boolean hasGunID() {
            return (__bitField0 & 8) == 8;
        }

        public BoardPlayerInfor withGunID(int value) {
            return BoardPlayerInfor.newBuilder()
                .mergeFrom(this)
                .setGunID(value)
                .build();
        }

        public int getAmmoID() {
            return ammoID;
        }

        public boolean hasAmmoID() {
            return (__bitField0 & 16) == 16;
        }

        public BoardPlayerInfor withAmmoID(int value) {
            return BoardPlayerInfor.newBuilder()
                .mergeFrom(this)
                .setAmmoID(value)
                .build();
        }

        public int getGold1() {
            return gold1;
        }

        public boolean hasGold1() {
            return (__bitField0 & 32) == 32;
        }

        public BoardPlayerInfor withGold1(int value) {
            return BoardPlayerInfor.newBuilder()
                .mergeFrom(this)
                .setGold1(value)
                .build();
        }

        public int getGold2() {
            return gold2;
        }

        public boolean hasGold2() {
            return (__bitField0 & 64) == 64;
        }

        public BoardPlayerInfor withGold2(int value) {
            return BoardPlayerInfor.newBuilder()
                .mergeFrom(this)
                .setGold2(value)
                .build();
        }

        public int getGold3() {
            return gold3;
        }

        public boolean hasGold3() {
            return (__bitField0 & 128) == 128;
        }

        public BoardPlayerInfor withGold3(int value) {
            return BoardPlayerInfor.newBuilder()
                .mergeFrom(this)
                .setGold3(value)
                .build();
        }

        public int getLevel() {
            return level;
        }

        public boolean hasLevel() {
            return (__bitField0 & 256) == 256;
        }

        public BoardPlayerInfor withLevel(int value) {
            return BoardPlayerInfor.newBuilder()
                .mergeFrom(this)
                .setLevel(value)
                .build();
        }

        public String getAvatar() {
            return avatar;
        }

        public boolean hasAvatar() {
            return (__bitField0 & 512) == 512;
        }

        public BoardPlayerInfor withAvatar(String value) {
            return BoardPlayerInfor.newBuilder()
                .mergeFrom(this)
                .setAvatar(value)
                .build();
        }

        public int getStatus() {
            return status;
        }

        public boolean hasStatus() {
            return (__bitField0 & 1024) == 1024;
        }

        public BoardPlayerInfor withStatus(int value) {
            return BoardPlayerInfor.newBuilder()
                .mergeFrom(this)
                .setStatus(value)
                .build();
        }

        public int getBmRank() {
            return bmRank;
        }

        public boolean hasBmRank() {
            return (__bitField0 & 2048) == 2048;
        }

        public BoardPlayerInfor withBmRank(int value) {
            return BoardPlayerInfor.newBuilder()
                .mergeFrom(this)
                .setBmRank(value)
                .build();
        }

        public int getBmReward() {
            return bmReward;
        }

        public boolean hasBmReward() {
            return (__bitField0 & 4096) == 4096;
        }

        public BoardPlayerInfor withBmReward(int value) {
            return BoardPlayerInfor.newBuilder()
                .mergeFrom(this)
                .setBmReward(value)
                .build();
        }

        public int getRoseAmount() {
            return roseAmount;
        }

        public boolean hasRoseAmount() {
            return (__bitField0 & 8192) == 8192;
        }

        public BoardPlayerInfor withRoseAmount(int value) {
            return BoardPlayerInfor.newBuilder()
                .mergeFrom(this)
                .setRoseAmount(value)
                .build();
        }

        public int getRoseBonusAt() {
            return roseBonusAt;
        }

        public boolean hasRoseBonusAt() {
            return (__bitField0 & 16384) == 16384;
        }

        public BoardPlayerInfor withRoseBonusAt(int value) {
            return BoardPlayerInfor.newBuilder()
                .mergeFrom(this)
                .setRoseBonusAt(value)
                .build();
        }

        public int getStunToSecond() {
            return stunToSecond;
        }

        public boolean hasStunToSecond() {
            return (__bitField0 & 32768) == 32768;
        }

        public BoardPlayerInfor withStunToSecond(int value) {
            return BoardPlayerInfor.newBuilder()
                .mergeFrom(this)
                .setStunToSecond(value)
                .build();
        }

        public int getSoloSendAt() {
            return soloSendAt;
        }

        public boolean hasSoloSendAt() {
            return (__bitField0 & 65536) == 65536;
        }

        public BoardPlayerInfor withSoloSendAt(int value) {
            return BoardPlayerInfor.newBuilder()
                .mergeFrom(this)
                .setSoloSendAt(value)
                .build();
        }

        public int getSoloReceiveAt() {
            return soloReceiveAt;
        }

        public boolean hasSoloReceiveAt() {
            return (__bitField0 & 131072) == 131072;
        }

        public BoardPlayerInfor withSoloReceiveAt(int value) {
            return BoardPlayerInfor.newBuilder()
                .mergeFrom(this)
                .setSoloReceiveAt(value)
                .build();
        }

        public String getSnsName() {
            return snsName;
        }

        public boolean hasSnsName() {
            return (__bitField0 & 262144) == 262144;
        }

        public BoardPlayerInfor withSnsName(String value) {
            return BoardPlayerInfor.newBuilder()
                .mergeFrom(this)
                .setSnsName(value)
                .build();
        }

        public boolean getHasPet() {
            return hasPet;
        }

        public boolean hasHasPet() {
            return (__bitField0 & 524288) == 524288;
        }

        public BoardPlayerInfor withHasPet(boolean value) {
            return BoardPlayerInfor.newBuilder()
                .mergeFrom(this)
                .setHasPet(value)
                .build();
        }

        public int getSkillType() {
            return skillType;
        }

        public boolean hasSkillType() {
            return (__bitField0 & 1048576) == 1048576;
        }

        public BoardPlayerInfor withSkillType(int value) {
            return BoardPlayerInfor.newBuilder()
                .mergeFrom(this)
                .setSkillType(value)
                .build();
        }

        public int getSkillGold() {
            return skillGold;
        }

        public boolean hasSkillGold() {
            return (__bitField0 & 2097152) == 2097152;
        }

        public BoardPlayerInfor withSkillGold(int value) {
            return BoardPlayerInfor.newBuilder()
                .mergeFrom(this)
                .setSkillGold(value)
                .build();
        }

        public int getSkillAccumulation() {
            return skillAccumulation;
        }

        public boolean hasSkillAccumulation() {
            return (__bitField0 & 4194304) == 4194304;
        }

        public BoardPlayerInfor withSkillAccumulation(int value) {
            return BoardPlayerInfor.newBuilder()
                .mergeFrom(this)
                .setSkillAccumulation(value)
                .build();
        }

        public int getSkillAccumulationMax() {
            return skillAccumulationMax;
        }

        public boolean hasSkillAccumulationMax() {
            return (__bitField0 & 8388608) == 8388608;
        }

        public BoardPlayerInfor withSkillAccumulationMax(int value) {
            return BoardPlayerInfor.newBuilder()
                .mergeFrom(this)
                .setSkillAccumulationMax(value)
                .build();
        }

        public long getSkillTimeCurrent() {
            return skillTimeCurrent;
        }

        public boolean hasSkillTimeCurrent() {
            return (__bitField0 & 16777216) == 16777216;
        }

        public BoardPlayerInfor withSkillTimeCurrent(long value) {
            return BoardPlayerInfor.newBuilder()
                .mergeFrom(this)
                .setSkillTimeCurrent(value)
                .build();
        }

        public long getSkillTimeMax() {
            return skillTimeMax;
        }

        public boolean hasSkillTimeMax() {
            return (__bitField0 & 33554432) == 33554432;
        }

        public BoardPlayerInfor withSkillTimeMax(long value) {
            return BoardPlayerInfor.newBuilder()
                .mergeFrom(this)
                .setSkillTimeMax(value)
                .build();
        }

        public int getSkillDuration() {
            return skillDuration;
        }

        public boolean hasSkillDuration() {
            return (__bitField0 & 67108864) == 67108864;
        }

        public BoardPlayerInfor withSkillDuration(int value) {
            return BoardPlayerInfor.newBuilder()
                .mergeFrom(this)
                .setSkillDuration(value)
                .build();
        }

        public int getSkillCannonId() {
            return skillCannonId;
        }

        public boolean hasSkillCannonId() {
            return (__bitField0 & 134217728) == 134217728;
        }

        public BoardPlayerInfor withSkillCannonId(int value) {
            return BoardPlayerInfor.newBuilder()
                .mergeFrom(this)
                .setSkillCannonId(value)
                .build();
        }

        public int getPetLevel() {
            return petLevel;
        }

        public boolean hasPetLevel() {
            return (__bitField0 & 268435456) == 268435456;
        }

        public BoardPlayerInfor withPetLevel(int value) {
            return BoardPlayerInfor.newBuilder()
                .mergeFrom(this)
                .setPetLevel(value)
                .build();
        }

        public float getSkillAccBuff() {
            return skillAccBuff;
        }

        public boolean hasSkillAccBuff() {
            return (__bitField0 & 536870912) == 536870912;
        }

        public BoardPlayerInfor withSkillAccBuff(float value) {
            return BoardPlayerInfor.newBuilder()
                .mergeFrom(this)
                .setSkillAccBuff(value)
                .build();
        }

        public java.util.List<Long> getSkillTargetFishList() {
            return skillTargetFish;
        }

        public int getSkillTargetFishCount() {
            return skillTargetFish.size();
        }

        public long getSkillTargetFish(int index) {
            return skillTargetFish.get(index);
        }

        public BoardPlayerInfor withSkillTargetFish(java.util.List<Long> value) {
            return BoardPlayerInfor.newBuilder()
                .mergeFrom(this)
                .clearSkillTargetFish()
                .addAllSkillTargetFish(value)
                .build();
        }



        @Override
        public io.protostuff.Schema<BoardPlayerInfor> cachedSchema() {
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
            BoardPlayerInfor that = (BoardPlayerInfor) obj;
            if (!java.util.Objects.equals(this.userID, that.userID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.username, that.username)) {
                return false;
            }
            if (!java.util.Objects.equals(this.seatNumber, that.seatNumber)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gunID, that.gunID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.ammoID, that.ammoID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gold1, that.gold1)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gold2, that.gold2)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gold3, that.gold3)) {
                return false;
            }
            if (!java.util.Objects.equals(this.level, that.level)) {
                return false;
            }
            if (!java.util.Objects.equals(this.avatar, that.avatar)) {
                return false;
            }
            if (!java.util.Objects.equals(this.status, that.status)) {
                return false;
            }
            if (!java.util.Objects.equals(this.bmRank, that.bmRank)) {
                return false;
            }
            if (!java.util.Objects.equals(this.bmReward, that.bmReward)) {
                return false;
            }
            if (!java.util.Objects.equals(this.roseAmount, that.roseAmount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.roseBonusAt, that.roseBonusAt)) {
                return false;
            }
            if (!java.util.Objects.equals(this.stunToSecond, that.stunToSecond)) {
                return false;
            }
            if (!java.util.Objects.equals(this.soloSendAt, that.soloSendAt)) {
                return false;
            }
            if (!java.util.Objects.equals(this.soloReceiveAt, that.soloReceiveAt)) {
                return false;
            }
            if (!java.util.Objects.equals(this.snsName, that.snsName)) {
                return false;
            }
            if (!java.util.Objects.equals(this.hasPet, that.hasPet)) {
                return false;
            }
            if (!java.util.Objects.equals(this.skillType, that.skillType)) {
                return false;
            }
            if (!java.util.Objects.equals(this.skillGold, that.skillGold)) {
                return false;
            }
            if (!java.util.Objects.equals(this.skillAccumulation, that.skillAccumulation)) {
                return false;
            }
            if (!java.util.Objects.equals(this.skillAccumulationMax, that.skillAccumulationMax)) {
                return false;
            }
            if (!java.util.Objects.equals(this.skillTimeCurrent, that.skillTimeCurrent)) {
                return false;
            }
            if (!java.util.Objects.equals(this.skillTimeMax, that.skillTimeMax)) {
                return false;
            }
            if (!java.util.Objects.equals(this.skillDuration, that.skillDuration)) {
                return false;
            }
            if (!java.util.Objects.equals(this.skillCannonId, that.skillCannonId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.petLevel, that.petLevel)) {
                return false;
            }
            if (!java.util.Objects.equals(this.skillAccBuff, that.skillAccBuff)) {
                return false;
            }
            if (!java.util.Objects.equals(this.skillTargetFish, that.skillTargetFish)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
            result = 31 * result + (this.username == null ? 0 : this.username.hashCode());
            result = 31 * result + Integer.hashCode(this.seatNumber);
            result = 31 * result + Integer.hashCode(this.gunID);
            result = 31 * result + Integer.hashCode(this.ammoID);
            result = 31 * result + Integer.hashCode(this.gold1);
            result = 31 * result + Integer.hashCode(this.gold2);
            result = 31 * result + Integer.hashCode(this.gold3);
            result = 31 * result + Integer.hashCode(this.level);
            result = 31 * result + (this.avatar == null ? 0 : this.avatar.hashCode());
            result = 31 * result + Integer.hashCode(this.status);
            result = 31 * result + Integer.hashCode(this.bmRank);
            result = 31 * result + Integer.hashCode(this.bmReward);
            result = 31 * result + Integer.hashCode(this.roseAmount);
            result = 31 * result + Integer.hashCode(this.roseBonusAt);
            result = 31 * result + Integer.hashCode(this.stunToSecond);
            result = 31 * result + Integer.hashCode(this.soloSendAt);
            result = 31 * result + Integer.hashCode(this.soloReceiveAt);
            result = 31 * result + (this.snsName == null ? 0 : this.snsName.hashCode());
            result = 31 * result + Boolean.hashCode(this.hasPet);
            result = 31 * result + Integer.hashCode(this.skillType);
            result = 31 * result + Integer.hashCode(this.skillGold);
            result = 31 * result + Integer.hashCode(this.skillAccumulation);
            result = 31 * result + Integer.hashCode(this.skillAccumulationMax);
            result = 31 * result + Long.hashCode(this.skillTimeCurrent);
            result = 31 * result + Long.hashCode(this.skillTimeMax);
            result = 31 * result + Integer.hashCode(this.skillDuration);
            result = 31 * result + Integer.hashCode(this.skillCannonId);
            result = 31 * result + Integer.hashCode(this.petLevel);
            result = 31 * result + Float.hashCode(this.skillAccBuff);
            result = 31 * result + (this.skillTargetFish == null ? 0 : this.skillTargetFish.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasUserID()) {
                parts.add("userID=" + getUserID());
            }
            if (hasUsername()) {
                parts.add("username=" + getUsername());
            }
            if (hasSeatNumber()) {
                parts.add("seatNumber=" + getSeatNumber());
            }
            if (hasGunID()) {
                parts.add("gunID=" + getGunID());
            }
            if (hasAmmoID()) {
                parts.add("ammoID=" + getAmmoID());
            }
            if (hasGold1()) {
                parts.add("gold1=" + getGold1());
            }
            if (hasGold2()) {
                parts.add("gold2=" + getGold2());
            }
            if (hasGold3()) {
                parts.add("gold3=" + getGold3());
            }
            if (hasLevel()) {
                parts.add("level=" + getLevel());
            }
            if (hasAvatar()) {
                parts.add("avatar=" + getAvatar());
            }
            if (hasStatus()) {
                parts.add("status=" + getStatus());
            }
            if (hasBmRank()) {
                parts.add("bmRank=" + getBmRank());
            }
            if (hasBmReward()) {
                parts.add("bmReward=" + getBmReward());
            }
            if (hasRoseAmount()) {
                parts.add("roseAmount=" + getRoseAmount());
            }
            if (hasRoseBonusAt()) {
                parts.add("roseBonusAt=" + getRoseBonusAt());
            }
            if (hasStunToSecond()) {
                parts.add("stunToSecond=" + getStunToSecond());
            }
            if (hasSoloSendAt()) {
                parts.add("soloSendAt=" + getSoloSendAt());
            }
            if (hasSoloReceiveAt()) {
                parts.add("soloReceiveAt=" + getSoloReceiveAt());
            }
            if (hasSnsName()) {
                parts.add("snsName=" + getSnsName());
            }
            if (hasHasPet()) {
                parts.add("hasPet=" + getHasPet());
            }
            if (hasSkillType()) {
                parts.add("skillType=" + getSkillType());
            }
            if (hasSkillGold()) {
                parts.add("skillGold=" + getSkillGold());
            }
            if (hasSkillAccumulation()) {
                parts.add("skillAccumulation=" + getSkillAccumulation());
            }
            if (hasSkillAccumulationMax()) {
                parts.add("skillAccumulationMax=" + getSkillAccumulationMax());
            }
            if (hasSkillTimeCurrent()) {
                parts.add("skillTimeCurrent=" + getSkillTimeCurrent());
            }
            if (hasSkillTimeMax()) {
                parts.add("skillTimeMax=" + getSkillTimeMax());
            }
            if (hasSkillDuration()) {
                parts.add("skillDuration=" + getSkillDuration());
            }
            if (hasSkillCannonId()) {
                parts.add("skillCannonId=" + getSkillCannonId());
            }
            if (hasPetLevel()) {
                parts.add("petLevel=" + getPetLevel());
            }
            if (hasSkillAccBuff()) {
                parts.add("skillAccBuff=" + getSkillAccBuff());
            }
            if (!skillTargetFish.isEmpty()) {
                parts.add("skillTargetFish=" + getSkillTargetFishList());
            }
            return "BoardPlayerInfor{" + String.join(", ", parts) + "}";
        }

        public static final class Schema implements io.protostuff.Schema<BoardPlayerInfor>{

            private static final Schema INSTANCE = new Schema();

            private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

            static {
            	__fieldMap.put("userID", 1);
            	__fieldMap.put("username", 2);
            	__fieldMap.put("seatNumber", 3);
            	__fieldMap.put("gunID", 4);
            	__fieldMap.put("ammoID", 5);
            	__fieldMap.put("gold1", 6);
            	__fieldMap.put("gold2", 7);
            	__fieldMap.put("gold3", 8);
            	__fieldMap.put("level", 9);
            	__fieldMap.put("avatar", 10);
            	__fieldMap.put("status", 11);
            	__fieldMap.put("bmRank", 12);
            	__fieldMap.put("bmReward", 13);
            	__fieldMap.put("roseAmount", 14);
            	__fieldMap.put("roseBonusAt", 15);
            	__fieldMap.put("stunToSecond", 16);
            	__fieldMap.put("soloSendAt", 17);
            	__fieldMap.put("soloReceiveAt", 18);
            	__fieldMap.put("snsName", 19);
            	__fieldMap.put("hasPet", 20);
            	__fieldMap.put("skillType", 21);
            	__fieldMap.put("skillGold", 22);
            	__fieldMap.put("skillAccumulation", 23);
            	__fieldMap.put("skillAccumulationMax", 24);
            	__fieldMap.put("skillTimeCurrent", 25);
            	__fieldMap.put("skillTimeMax", 26);
            	__fieldMap.put("skillDuration", 27);
            	__fieldMap.put("skillCannonId", 28);
            	__fieldMap.put("petLevel", 29);
            	__fieldMap.put("skillAccBuff", 30);
            	__fieldMap.put("skillTargetFish", 31);
            }

            @Override
            public BoardPlayerInfor newMessage() {
                return new BoardPlayerInfor();
            }

            @Override
            public Class<BoardPlayerInfor> typeClass() {
                return BoardPlayerInfor.class;
            }

            @Override
            public String messageName() {
                return BoardPlayerInfor.class.getSimpleName();
            }

            @Override
            public String messageFullName() {
                return BoardPlayerInfor.class.getName();
            }

            @Override
            @Deprecated
            public boolean isInitialized(BoardPlayerInfor message) {
                return true;
            }

            @Override
            public void mergeFrom(io.protostuff.Input input, BoardPlayerInfor instance) throws java.io.IOException {
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
                        	instance.userID = input.readString();
                        	instance.__bitField0 |= 1;
                        	break;
                        case 2:
                        	instance.username = input.readString();
                        	instance.__bitField0 |= 2;
                        	break;
                        case 3:
                        	instance.seatNumber = input.readInt32();
                        	instance.__bitField0 |= 4;
                        	break;
                        case 4:
                        	instance.gunID = input.readInt32();
                        	instance.__bitField0 |= 8;
                        	break;
                        case 5:
                        	instance.ammoID = input.readInt32();
                        	instance.__bitField0 |= 16;
                        	break;
                        case 6:
                        	instance.gold1 = input.readInt32();
                        	instance.__bitField0 |= 32;
                        	break;
                        case 7:
                        	instance.gold2 = input.readInt32();
                        	instance.__bitField0 |= 64;
                        	break;
                        case 8:
                        	instance.gold3 = input.readInt32();
                        	instance.__bitField0 |= 128;
                        	break;
                        case 9:
                        	instance.level = input.readInt32();
                        	instance.__bitField0 |= 256;
                        	break;
                        case 10:
                        	instance.avatar = input.readString();
                        	instance.__bitField0 |= 512;
                        	break;
                        case 11:
                        	instance.status = input.readInt32();
                        	instance.__bitField0 |= 1024;
                        	break;
                        case 12:
                        	instance.bmRank = input.readInt32();
                        	instance.__bitField0 |= 2048;
                        	break;
                        case 13:
                        	instance.bmReward = input.readInt32();
                        	instance.__bitField0 |= 4096;
                        	break;
                        case 14:
                        	instance.roseAmount = input.readInt32();
                        	instance.__bitField0 |= 8192;
                        	break;
                        case 15:
                        	instance.roseBonusAt = input.readInt32();
                        	instance.__bitField0 |= 16384;
                        	break;
                        case 16:
                        	instance.stunToSecond = input.readInt32();
                        	instance.__bitField0 |= 32768;
                        	break;
                        case 17:
                        	instance.soloSendAt = input.readInt32();
                        	instance.__bitField0 |= 65536;
                        	break;
                        case 18:
                        	instance.soloReceiveAt = input.readInt32();
                        	instance.__bitField0 |= 131072;
                        	break;
                        case 19:
                        	instance.snsName = input.readString();
                        	instance.__bitField0 |= 262144;
                        	break;
                        case 20:
                        	instance.hasPet = input.readBool();
                        	instance.__bitField0 |= 524288;
                        	break;
                        case 21:
                        	instance.skillType = input.readInt32();
                        	instance.__bitField0 |= 1048576;
                        	break;
                        case 22:
                        	instance.skillGold = input.readInt32();
                        	instance.__bitField0 |= 2097152;
                        	break;
                        case 23:
                        	instance.skillAccumulation = input.readInt32();
                        	instance.__bitField0 |= 4194304;
                        	break;
                        case 24:
                        	instance.skillAccumulationMax = input.readInt32();
                        	instance.__bitField0 |= 8388608;
                        	break;
                        case 25:
                        	instance.skillTimeCurrent = input.readInt64();
                        	instance.__bitField0 |= 16777216;
                        	break;
                        case 26:
                        	instance.skillTimeMax = input.readInt64();
                        	instance.__bitField0 |= 33554432;
                        	break;
                        case 27:
                        	instance.skillDuration = input.readInt32();
                        	instance.__bitField0 |= 67108864;
                        	break;
                        case 28:
                        	instance.skillCannonId = input.readInt32();
                        	instance.__bitField0 |= 134217728;
                        	break;
                        case 29:
                        	instance.petLevel = input.readInt32();
                        	instance.__bitField0 |= 268435456;
                        	break;
                        case 30:
                        	instance.skillAccBuff = input.readFloat();
                        	instance.__bitField0 |= 536870912;
                        	break;
                        case 31:
                        	if(!((instance.__bitField0 & 1073741824) == 1073741824)) {
                        	    instance.skillTargetFish = new java.util.ArrayList<>();
                        	    instance.__bitField0 |= 1073741824;
                        	}
                        	instance.skillTargetFish.add(input.readInt64());

                        	break;
                        default:
                            input.handleUnknownField(number, this);
                    }
            	}
                if((instance.__bitField0 & 1073741824) == 1073741824) {
                    instance.skillTargetFish = java.util.Collections.unmodifiableList(instance.skillTargetFish);
                }

            }

            @Override
            public void writeTo(io.protostuff.Output output, BoardPlayerInfor instance) throws java.io.IOException {
                if((instance.__bitField0 & 1) == 1) {
                    output.writeString(1, instance.userID, false);
                }

                if((instance.__bitField0 & 2) == 2) {
                    output.writeString(2, instance.username, false);
                }

                if((instance.__bitField0 & 4) == 4) {
                    output.writeInt32(3, instance.seatNumber, false);
                }

                if((instance.__bitField0 & 8) == 8) {
                    output.writeInt32(4, instance.gunID, false);
                }

                if((instance.__bitField0 & 16) == 16) {
                    output.writeInt32(5, instance.ammoID, false);
                }

                if((instance.__bitField0 & 32) == 32) {
                    output.writeInt32(6, instance.gold1, false);
                }

                if((instance.__bitField0 & 64) == 64) {
                    output.writeInt32(7, instance.gold2, false);
                }

                if((instance.__bitField0 & 128) == 128) {
                    output.writeInt32(8, instance.gold3, false);
                }

                if((instance.__bitField0 & 256) == 256) {
                    output.writeInt32(9, instance.level, false);
                }

                if((instance.__bitField0 & 512) == 512) {
                    output.writeString(10, instance.avatar, false);
                }

                if((instance.__bitField0 & 1024) == 1024) {
                    output.writeInt32(11, instance.status, false);
                }

                if((instance.__bitField0 & 2048) == 2048) {
                    output.writeInt32(12, instance.bmRank, false);
                }

                if((instance.__bitField0 & 4096) == 4096) {
                    output.writeInt32(13, instance.bmReward, false);
                }

                if((instance.__bitField0 & 8192) == 8192) {
                    output.writeInt32(14, instance.roseAmount, false);
                }

                if((instance.__bitField0 & 16384) == 16384) {
                    output.writeInt32(15, instance.roseBonusAt, false);
                }

                if((instance.__bitField0 & 32768) == 32768) {
                    output.writeInt32(16, instance.stunToSecond, false);
                }

                if((instance.__bitField0 & 65536) == 65536) {
                    output.writeInt32(17, instance.soloSendAt, false);
                }

                if((instance.__bitField0 & 131072) == 131072) {
                    output.writeInt32(18, instance.soloReceiveAt, false);
                }

                if((instance.__bitField0 & 262144) == 262144) {
                    output.writeString(19, instance.snsName, false);
                }

                if((instance.__bitField0 & 524288) == 524288) {
                    output.writeBool(20, instance.hasPet, false);
                }

                if((instance.__bitField0 & 1048576) == 1048576) {
                    output.writeInt32(21, instance.skillType, false);
                }

                if((instance.__bitField0 & 2097152) == 2097152) {
                    output.writeInt32(22, instance.skillGold, false);
                }

                if((instance.__bitField0 & 4194304) == 4194304) {
                    output.writeInt32(23, instance.skillAccumulation, false);
                }

                if((instance.__bitField0 & 8388608) == 8388608) {
                    output.writeInt32(24, instance.skillAccumulationMax, false);
                }

                if((instance.__bitField0 & 16777216) == 16777216) {
                    output.writeInt64(25, instance.skillTimeCurrent, false);
                }

                if((instance.__bitField0 & 33554432) == 33554432) {
                    output.writeInt64(26, instance.skillTimeMax, false);
                }

                if((instance.__bitField0 & 67108864) == 67108864) {
                    output.writeInt32(27, instance.skillDuration, false);
                }

                if((instance.__bitField0 & 134217728) == 134217728) {
                    output.writeInt32(28, instance.skillCannonId, false);
                }

                if((instance.__bitField0 & 268435456) == 268435456) {
                    output.writeInt32(29, instance.petLevel, false);
                }

                if((instance.__bitField0 & 536870912) == 536870912) {
                    output.writeFloat(30, instance.skillAccBuff, false);
                }

                for(long skillTargetFish : instance.skillTargetFish) {
                    output.writeInt64(31, skillTargetFish, true);
                }

            }

            @Override
            public String getFieldName(int number) {
            	switch(number) {
            		case 1: return "userID";
            		case 2: return "username";
            		case 3: return "seatNumber";
            		case 4: return "gunID";
            		case 5: return "ammoID";
            		case 6: return "gold1";
            		case 7: return "gold2";
            		case 8: return "gold3";
            		case 9: return "level";
            		case 10: return "avatar";
            		case 11: return "status";
            		case 12: return "bmRank";
            		case 13: return "bmReward";
            		case 14: return "roseAmount";
            		case 15: return "roseBonusAt";
            		case 16: return "stunToSecond";
            		case 17: return "soloSendAt";
            		case 18: return "soloReceiveAt";
            		case 19: return "snsName";
            		case 20: return "hasPet";
            		case 21: return "skillType";
            		case 22: return "skillGold";
            		case 23: return "skillAccumulation";
            		case 24: return "skillAccumulationMax";
            		case 25: return "skillTimeCurrent";
            		case 26: return "skillTimeMax";
            		case 27: return "skillDuration";
            		case 28: return "skillCannonId";
            		case 29: return "petLevel";
            		case 30: return "skillAccBuff";
            		case 31: return "skillTargetFish";
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

            private String userID;

            private String username;

            private int seatNumber;

            private int gunID;

            private int ammoID;

            private int gold1;

            private int gold2;

            private int gold3;

            private int level;

            private String avatar;

            private int status;

            private int bmRank;

            private int bmReward;

            private int roseAmount;

            private int roseBonusAt;

            private int stunToSecond;

            private int soloSendAt;

            private int soloReceiveAt;

            private String snsName;

            private boolean hasPet;

            private int skillType;

            private int skillGold;

            private int skillAccumulation;

            private int skillAccumulationMax;

            private long skillTimeCurrent;

            private long skillTimeMax;

            private int skillDuration;

            private int skillCannonId;

            private int petLevel;

            private float skillAccBuff;

            private java.util.List<Long> skillTargetFish;

            private int __bitField0;

            private Builder() {
                this.userID = "";
                this.username = "";
                this.seatNumber = 0;
                this.gunID = 0;
                this.ammoID = 0;
                this.gold1 = 0;
                this.gold2 = 0;
                this.gold3 = 0;
                this.level = 0;
                this.avatar = "";
                this.status = 0;
                this.bmRank = 0;
                this.bmReward = 0;
                this.roseAmount = 0;
                this.roseBonusAt = 0;
                this.stunToSecond = 0;
                this.soloSendAt = 0;
                this.soloReceiveAt = 0;
                this.snsName = "";
                this.hasPet = false;
                this.skillType = 0;
                this.skillGold = 0;
                this.skillAccumulation = 0;
                this.skillAccumulationMax = 0;
                this.skillTimeCurrent = 0L;
                this.skillTimeMax = 0L;
                this.skillDuration = 0;
                this.skillCannonId = 0;
                this.petLevel = 0;
                this.skillAccBuff = 0f;
                this.skillTargetFish = java.util.Collections.emptyList();
            }

            public Builder mergeFrom(BoardPlayerInfor instance) {
                if (instance.hasUserID()) {
                    this.setUserID(instance.getUserID());
                }

                if (instance.hasUsername()) {
                    this.setUsername(instance.getUsername());
                }

                if (instance.hasSeatNumber()) {
                    this.setSeatNumber(instance.getSeatNumber());
                }

                if (instance.hasGunID()) {
                    this.setGunID(instance.getGunID());
                }

                if (instance.hasAmmoID()) {
                    this.setAmmoID(instance.getAmmoID());
                }

                if (instance.hasGold1()) {
                    this.setGold1(instance.getGold1());
                }

                if (instance.hasGold2()) {
                    this.setGold2(instance.getGold2());
                }

                if (instance.hasGold3()) {
                    this.setGold3(instance.getGold3());
                }

                if (instance.hasLevel()) {
                    this.setLevel(instance.getLevel());
                }

                if (instance.hasAvatar()) {
                    this.setAvatar(instance.getAvatar());
                }

                if (instance.hasStatus()) {
                    this.setStatus(instance.getStatus());
                }

                if (instance.hasBmRank()) {
                    this.setBmRank(instance.getBmRank());
                }

                if (instance.hasBmReward()) {
                    this.setBmReward(instance.getBmReward());
                }

                if (instance.hasRoseAmount()) {
                    this.setRoseAmount(instance.getRoseAmount());
                }

                if (instance.hasRoseBonusAt()) {
                    this.setRoseBonusAt(instance.getRoseBonusAt());
                }

                if (instance.hasStunToSecond()) {
                    this.setStunToSecond(instance.getStunToSecond());
                }

                if (instance.hasSoloSendAt()) {
                    this.setSoloSendAt(instance.getSoloSendAt());
                }

                if (instance.hasSoloReceiveAt()) {
                    this.setSoloReceiveAt(instance.getSoloReceiveAt());
                }

                if (instance.hasSnsName()) {
                    this.setSnsName(instance.getSnsName());
                }

                if (instance.hasHasPet()) {
                    this.setHasPet(instance.getHasPet());
                }

                if (instance.hasSkillType()) {
                    this.setSkillType(instance.getSkillType());
                }

                if (instance.hasSkillGold()) {
                    this.setSkillGold(instance.getSkillGold());
                }

                if (instance.hasSkillAccumulation()) {
                    this.setSkillAccumulation(instance.getSkillAccumulation());
                }

                if (instance.hasSkillAccumulationMax()) {
                    this.setSkillAccumulationMax(instance.getSkillAccumulationMax());
                }

                if (instance.hasSkillTimeCurrent()) {
                    this.setSkillTimeCurrent(instance.getSkillTimeCurrent());
                }

                if (instance.hasSkillTimeMax()) {
                    this.setSkillTimeMax(instance.getSkillTimeMax());
                }

                if (instance.hasSkillDuration()) {
                    this.setSkillDuration(instance.getSkillDuration());
                }

                if (instance.hasSkillCannonId()) {
                    this.setSkillCannonId(instance.getSkillCannonId());
                }

                if (instance.hasPetLevel()) {
                    this.setPetLevel(instance.getPetLevel());
                }

                if (instance.hasSkillAccBuff()) {
                    this.setSkillAccBuff(instance.getSkillAccBuff());
                }

                this.addAllSkillTargetFish(instance.getSkillTargetFishList());

                return this;
            }

            public String getUserID() {
                return userID;
            }

            public Builder setUserID(String value) {
                if (value == null) {
                    throw new NullPointerException("Cannot set BoardPlayerInfor#userID to null");
                }

                this.userID = value;
                __bitField0 |= 1;
                return this;
            }

            public Builder clearUserID() {
                this.userID = "";
                __bitField0 &= ~1;
                return this;
            }

            public boolean hasUserID() {
                return (__bitField0 & 1) == 1;
            }

            public String getUsername() {
                return username;
            }

            public Builder setUsername(String value) {
                if (value == null) {
                    throw new NullPointerException("Cannot set BoardPlayerInfor#username to null");
                }

                this.username = value;
                __bitField0 |= 2;
                return this;
            }

            public Builder clearUsername() {
                this.username = "";
                __bitField0 &= ~2;
                return this;
            }

            public boolean hasUsername() {
                return (__bitField0 & 2) == 2;
            }

            public int getSeatNumber() {
                return seatNumber;
            }

            public Builder setSeatNumber(int value) {
                this.seatNumber = value;
                __bitField0 |= 4;
                return this;
            }

            public Builder clearSeatNumber() {
                this.seatNumber = 0;
                __bitField0 &= ~4;
                return this;
            }

            public boolean hasSeatNumber() {
                return (__bitField0 & 4) == 4;
            }

            public int getGunID() {
                return gunID;
            }

            public Builder setGunID(int value) {
                this.gunID = value;
                __bitField0 |= 8;
                return this;
            }

            public Builder clearGunID() {
                this.gunID = 0;
                __bitField0 &= ~8;
                return this;
            }

            public boolean hasGunID() {
                return (__bitField0 & 8) == 8;
            }

            public int getAmmoID() {
                return ammoID;
            }

            public Builder setAmmoID(int value) {
                this.ammoID = value;
                __bitField0 |= 16;
                return this;
            }

            public Builder clearAmmoID() {
                this.ammoID = 0;
                __bitField0 &= ~16;
                return this;
            }

            public boolean hasAmmoID() {
                return (__bitField0 & 16) == 16;
            }

            public int getGold1() {
                return gold1;
            }

            public Builder setGold1(int value) {
                this.gold1 = value;
                __bitField0 |= 32;
                return this;
            }

            public Builder clearGold1() {
                this.gold1 = 0;
                __bitField0 &= ~32;
                return this;
            }

            public boolean hasGold1() {
                return (__bitField0 & 32) == 32;
            }

            public int getGold2() {
                return gold2;
            }

            public Builder setGold2(int value) {
                this.gold2 = value;
                __bitField0 |= 64;
                return this;
            }

            public Builder clearGold2() {
                this.gold2 = 0;
                __bitField0 &= ~64;
                return this;
            }

            public boolean hasGold2() {
                return (__bitField0 & 64) == 64;
            }

            public int getGold3() {
                return gold3;
            }

            public Builder setGold3(int value) {
                this.gold3 = value;
                __bitField0 |= 128;
                return this;
            }

            public Builder clearGold3() {
                this.gold3 = 0;
                __bitField0 &= ~128;
                return this;
            }

            public boolean hasGold3() {
                return (__bitField0 & 128) == 128;
            }

            public int getLevel() {
                return level;
            }

            public Builder setLevel(int value) {
                this.level = value;
                __bitField0 |= 256;
                return this;
            }

            public Builder clearLevel() {
                this.level = 0;
                __bitField0 &= ~256;
                return this;
            }

            public boolean hasLevel() {
                return (__bitField0 & 256) == 256;
            }

            public String getAvatar() {
                return avatar;
            }

            public Builder setAvatar(String value) {
                if (value == null) {
                    throw new NullPointerException("Cannot set BoardPlayerInfor#avatar to null");
                }

                this.avatar = value;
                __bitField0 |= 512;
                return this;
            }

            public Builder clearAvatar() {
                this.avatar = "";
                __bitField0 &= ~512;
                return this;
            }

            public boolean hasAvatar() {
                return (__bitField0 & 512) == 512;
            }

            public int getStatus() {
                return status;
            }

            public Builder setStatus(int value) {
                this.status = value;
                __bitField0 |= 1024;
                return this;
            }

            public Builder clearStatus() {
                this.status = 0;
                __bitField0 &= ~1024;
                return this;
            }

            public boolean hasStatus() {
                return (__bitField0 & 1024) == 1024;
            }

            public int getBmRank() {
                return bmRank;
            }

            public Builder setBmRank(int value) {
                this.bmRank = value;
                __bitField0 |= 2048;
                return this;
            }

            public Builder clearBmRank() {
                this.bmRank = 0;
                __bitField0 &= ~2048;
                return this;
            }

            public boolean hasBmRank() {
                return (__bitField0 & 2048) == 2048;
            }

            public int getBmReward() {
                return bmReward;
            }

            public Builder setBmReward(int value) {
                this.bmReward = value;
                __bitField0 |= 4096;
                return this;
            }

            public Builder clearBmReward() {
                this.bmReward = 0;
                __bitField0 &= ~4096;
                return this;
            }

            public boolean hasBmReward() {
                return (__bitField0 & 4096) == 4096;
            }

            public int getRoseAmount() {
                return roseAmount;
            }

            public Builder setRoseAmount(int value) {
                this.roseAmount = value;
                __bitField0 |= 8192;
                return this;
            }

            public Builder clearRoseAmount() {
                this.roseAmount = 0;
                __bitField0 &= ~8192;
                return this;
            }

            public boolean hasRoseAmount() {
                return (__bitField0 & 8192) == 8192;
            }

            public int getRoseBonusAt() {
                return roseBonusAt;
            }

            public Builder setRoseBonusAt(int value) {
                this.roseBonusAt = value;
                __bitField0 |= 16384;
                return this;
            }

            public Builder clearRoseBonusAt() {
                this.roseBonusAt = 0;
                __bitField0 &= ~16384;
                return this;
            }

            public boolean hasRoseBonusAt() {
                return (__bitField0 & 16384) == 16384;
            }

            public int getStunToSecond() {
                return stunToSecond;
            }

            public Builder setStunToSecond(int value) {
                this.stunToSecond = value;
                __bitField0 |= 32768;
                return this;
            }

            public Builder clearStunToSecond() {
                this.stunToSecond = 0;
                __bitField0 &= ~32768;
                return this;
            }

            public boolean hasStunToSecond() {
                return (__bitField0 & 32768) == 32768;
            }

            public int getSoloSendAt() {
                return soloSendAt;
            }

            public Builder setSoloSendAt(int value) {
                this.soloSendAt = value;
                __bitField0 |= 65536;
                return this;
            }

            public Builder clearSoloSendAt() {
                this.soloSendAt = 0;
                __bitField0 &= ~65536;
                return this;
            }

            public boolean hasSoloSendAt() {
                return (__bitField0 & 65536) == 65536;
            }

            public int getSoloReceiveAt() {
                return soloReceiveAt;
            }

            public Builder setSoloReceiveAt(int value) {
                this.soloReceiveAt = value;
                __bitField0 |= 131072;
                return this;
            }

            public Builder clearSoloReceiveAt() {
                this.soloReceiveAt = 0;
                __bitField0 &= ~131072;
                return this;
            }

            public boolean hasSoloReceiveAt() {
                return (__bitField0 & 131072) == 131072;
            }

            public String getSnsName() {
                return snsName;
            }

            public Builder setSnsName(String value) {
                if (value == null) {
                    throw new NullPointerException("Cannot set BoardPlayerInfor#snsName to null");
                }

                this.snsName = value;
                __bitField0 |= 262144;
                return this;
            }

            public Builder clearSnsName() {
                this.snsName = "";
                __bitField0 &= ~262144;
                return this;
            }

            public boolean hasSnsName() {
                return (__bitField0 & 262144) == 262144;
            }

            public boolean getHasPet() {
                return hasPet;
            }

            public Builder setHasPet(boolean value) {
                this.hasPet = value;
                __bitField0 |= 524288;
                return this;
            }

            public Builder clearHasPet() {
                this.hasPet = false;
                __bitField0 &= ~524288;
                return this;
            }

            public boolean hasHasPet() {
                return (__bitField0 & 524288) == 524288;
            }

            public int getSkillType() {
                return skillType;
            }

            public Builder setSkillType(int value) {
                this.skillType = value;
                __bitField0 |= 1048576;
                return this;
            }

            public Builder clearSkillType() {
                this.skillType = 0;
                __bitField0 &= ~1048576;
                return this;
            }

            public boolean hasSkillType() {
                return (__bitField0 & 1048576) == 1048576;
            }

            public int getSkillGold() {
                return skillGold;
            }

            public Builder setSkillGold(int value) {
                this.skillGold = value;
                __bitField0 |= 2097152;
                return this;
            }

            public Builder clearSkillGold() {
                this.skillGold = 0;
                __bitField0 &= ~2097152;
                return this;
            }

            public boolean hasSkillGold() {
                return (__bitField0 & 2097152) == 2097152;
            }

            public int getSkillAccumulation() {
                return skillAccumulation;
            }

            public Builder setSkillAccumulation(int value) {
                this.skillAccumulation = value;
                __bitField0 |= 4194304;
                return this;
            }

            public Builder clearSkillAccumulation() {
                this.skillAccumulation = 0;
                __bitField0 &= ~4194304;
                return this;
            }

            public boolean hasSkillAccumulation() {
                return (__bitField0 & 4194304) == 4194304;
            }

            public int getSkillAccumulationMax() {
                return skillAccumulationMax;
            }

            public Builder setSkillAccumulationMax(int value) {
                this.skillAccumulationMax = value;
                __bitField0 |= 8388608;
                return this;
            }

            public Builder clearSkillAccumulationMax() {
                this.skillAccumulationMax = 0;
                __bitField0 &= ~8388608;
                return this;
            }

            public boolean hasSkillAccumulationMax() {
                return (__bitField0 & 8388608) == 8388608;
            }

            public long getSkillTimeCurrent() {
                return skillTimeCurrent;
            }

            public Builder setSkillTimeCurrent(long value) {
                this.skillTimeCurrent = value;
                __bitField0 |= 16777216;
                return this;
            }

            public Builder clearSkillTimeCurrent() {
                this.skillTimeCurrent = 0L;
                __bitField0 &= ~16777216;
                return this;
            }

            public boolean hasSkillTimeCurrent() {
                return (__bitField0 & 16777216) == 16777216;
            }

            public long getSkillTimeMax() {
                return skillTimeMax;
            }

            public Builder setSkillTimeMax(long value) {
                this.skillTimeMax = value;
                __bitField0 |= 33554432;
                return this;
            }

            public Builder clearSkillTimeMax() {
                this.skillTimeMax = 0L;
                __bitField0 &= ~33554432;
                return this;
            }

            public boolean hasSkillTimeMax() {
                return (__bitField0 & 33554432) == 33554432;
            }

            public int getSkillDuration() {
                return skillDuration;
            }

            public Builder setSkillDuration(int value) {
                this.skillDuration = value;
                __bitField0 |= 67108864;
                return this;
            }

            public Builder clearSkillDuration() {
                this.skillDuration = 0;
                __bitField0 &= ~67108864;
                return this;
            }

            public boolean hasSkillDuration() {
                return (__bitField0 & 67108864) == 67108864;
            }

            public int getSkillCannonId() {
                return skillCannonId;
            }

            public Builder setSkillCannonId(int value) {
                this.skillCannonId = value;
                __bitField0 |= 134217728;
                return this;
            }

            public Builder clearSkillCannonId() {
                this.skillCannonId = 0;
                __bitField0 &= ~134217728;
                return this;
            }

            public boolean hasSkillCannonId() {
                return (__bitField0 & 134217728) == 134217728;
            }

            public int getPetLevel() {
                return petLevel;
            }

            public Builder setPetLevel(int value) {
                this.petLevel = value;
                __bitField0 |= 268435456;
                return this;
            }

            public Builder clearPetLevel() {
                this.petLevel = 0;
                __bitField0 &= ~268435456;
                return this;
            }

            public boolean hasPetLevel() {
                return (__bitField0 & 268435456) == 268435456;
            }

            public float getSkillAccBuff() {
                return skillAccBuff;
            }

            public Builder setSkillAccBuff(float value) {
                this.skillAccBuff = value;
                __bitField0 |= 536870912;
                return this;
            }

            public Builder clearSkillAccBuff() {
                this.skillAccBuff = 0f;
                __bitField0 &= ~536870912;
                return this;
            }

            public boolean hasSkillAccBuff() {
                return (__bitField0 & 536870912) == 536870912;
            }

            public java.util.List<Long> getSkillTargetFishList() {
                return skillTargetFish;
            }

            public Builder setSkillTargetFish(int index, long value) {
                if(!((__bitField0 & 1073741824) == 1073741824)) {
                    this.skillTargetFish = new java.util.ArrayList<>();
                    __bitField0 |= 1073741824;
                }
                this.skillTargetFish.set(index, value);
                return this;
            }

            public Builder addSkillTargetFish(long value) {
                if(!((__bitField0 & 1073741824) == 1073741824)) {
                    this.skillTargetFish = new java.util.ArrayList<>();
                    __bitField0 |= 1073741824;
                }
                this.skillTargetFish.add(value);
                return this;
            }

            public Builder addAllSkillTargetFish(java.lang.Iterable<Long> values) {
                if (values == null) {
                    throw new NullPointerException("Cannot set BoardPlayerInfor#skillTargetFish to null");
                }
                if(!((__bitField0 & 1073741824) == 1073741824)) {
                    this.skillTargetFish = new java.util.ArrayList<>();
                    __bitField0 |= 1073741824;
                }
                for (final Long value : values) {
                    if (value == null) {
                       throw new NullPointerException("Cannot set BoardPlayerInfor#skillTargetFish to null");
                    }
                    this.skillTargetFish.add(value);
                }
                return this;
            }

            public Builder clearSkillTargetFish() {
                this.skillTargetFish = java.util.Collections.emptyList();
                __bitField0 &= ~1073741824;
                return this;
            }

            public int getSkillTargetFishCount() {
                return skillTargetFish.size();
            }

            public long getSkillTargetFish(int index) {
                return skillTargetFish.get(index);
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
                if (!java.util.Objects.equals(this.userID, that.userID)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.username, that.username)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.seatNumber, that.seatNumber)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.gunID, that.gunID)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.ammoID, that.ammoID)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.gold1, that.gold1)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.gold2, that.gold2)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.gold3, that.gold3)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.level, that.level)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.avatar, that.avatar)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.status, that.status)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.bmRank, that.bmRank)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.bmReward, that.bmReward)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.roseAmount, that.roseAmount)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.roseBonusAt, that.roseBonusAt)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.stunToSecond, that.stunToSecond)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.soloSendAt, that.soloSendAt)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.soloReceiveAt, that.soloReceiveAt)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.snsName, that.snsName)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.hasPet, that.hasPet)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.skillType, that.skillType)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.skillGold, that.skillGold)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.skillAccumulation, that.skillAccumulation)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.skillAccumulationMax, that.skillAccumulationMax)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.skillTimeCurrent, that.skillTimeCurrent)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.skillTimeMax, that.skillTimeMax)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.skillDuration, that.skillDuration)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.skillCannonId, that.skillCannonId)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.petLevel, that.petLevel)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.skillAccBuff, that.skillAccBuff)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.skillTargetFish, that.skillTargetFish)) {
                    return false;
                }

                return true;
            }

            @Override
            public int hashCode() {
                int result = 1;
                result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
                result = 31 * result + (this.username == null ? 0 : this.username.hashCode());
                result = 31 * result + Integer.hashCode(this.seatNumber);
                result = 31 * result + Integer.hashCode(this.gunID);
                result = 31 * result + Integer.hashCode(this.ammoID);
                result = 31 * result + Integer.hashCode(this.gold1);
                result = 31 * result + Integer.hashCode(this.gold2);
                result = 31 * result + Integer.hashCode(this.gold3);
                result = 31 * result + Integer.hashCode(this.level);
                result = 31 * result + (this.avatar == null ? 0 : this.avatar.hashCode());
                result = 31 * result + Integer.hashCode(this.status);
                result = 31 * result + Integer.hashCode(this.bmRank);
                result = 31 * result + Integer.hashCode(this.bmReward);
                result = 31 * result + Integer.hashCode(this.roseAmount);
                result = 31 * result + Integer.hashCode(this.roseBonusAt);
                result = 31 * result + Integer.hashCode(this.stunToSecond);
                result = 31 * result + Integer.hashCode(this.soloSendAt);
                result = 31 * result + Integer.hashCode(this.soloReceiveAt);
                result = 31 * result + (this.snsName == null ? 0 : this.snsName.hashCode());
                result = 31 * result + Boolean.hashCode(this.hasPet);
                result = 31 * result + Integer.hashCode(this.skillType);
                result = 31 * result + Integer.hashCode(this.skillGold);
                result = 31 * result + Integer.hashCode(this.skillAccumulation);
                result = 31 * result + Integer.hashCode(this.skillAccumulationMax);
                result = 31 * result + Long.hashCode(this.skillTimeCurrent);
                result = 31 * result + Long.hashCode(this.skillTimeMax);
                result = 31 * result + Integer.hashCode(this.skillDuration);
                result = 31 * result + Integer.hashCode(this.skillCannonId);
                result = 31 * result + Integer.hashCode(this.petLevel);
                result = 31 * result + Float.hashCode(this.skillAccBuff);
                result = 31 * result + (this.skillTargetFish == null ? 0 : this.skillTargetFish.hashCode());

                return result;
            }

            @Override
            public String toString() {
                java.util.List<String> parts = new java.util.ArrayList<>();
                if (hasUserID()) {
                    parts.add("userID=" + getUserID());
                }
                if (hasUsername()) {
                    parts.add("username=" + getUsername());
                }
                if (hasSeatNumber()) {
                    parts.add("seatNumber=" + getSeatNumber());
                }
                if (hasGunID()) {
                    parts.add("gunID=" + getGunID());
                }
                if (hasAmmoID()) {
                    parts.add("ammoID=" + getAmmoID());
                }
                if (hasGold1()) {
                    parts.add("gold1=" + getGold1());
                }
                if (hasGold2()) {
                    parts.add("gold2=" + getGold2());
                }
                if (hasGold3()) {
                    parts.add("gold3=" + getGold3());
                }
                if (hasLevel()) {
                    parts.add("level=" + getLevel());
                }
                if (hasAvatar()) {
                    parts.add("avatar=" + getAvatar());
                }
                if (hasStatus()) {
                    parts.add("status=" + getStatus());
                }
                if (hasBmRank()) {
                    parts.add("bmRank=" + getBmRank());
                }
                if (hasBmReward()) {
                    parts.add("bmReward=" + getBmReward());
                }
                if (hasRoseAmount()) {
                    parts.add("roseAmount=" + getRoseAmount());
                }
                if (hasRoseBonusAt()) {
                    parts.add("roseBonusAt=" + getRoseBonusAt());
                }
                if (hasStunToSecond()) {
                    parts.add("stunToSecond=" + getStunToSecond());
                }
                if (hasSoloSendAt()) {
                    parts.add("soloSendAt=" + getSoloSendAt());
                }
                if (hasSoloReceiveAt()) {
                    parts.add("soloReceiveAt=" + getSoloReceiveAt());
                }
                if (hasSnsName()) {
                    parts.add("snsName=" + getSnsName());
                }
                if (hasHasPet()) {
                    parts.add("hasPet=" + getHasPet());
                }
                if (hasSkillType()) {
                    parts.add("skillType=" + getSkillType());
                }
                if (hasSkillGold()) {
                    parts.add("skillGold=" + getSkillGold());
                }
                if (hasSkillAccumulation()) {
                    parts.add("skillAccumulation=" + getSkillAccumulation());
                }
                if (hasSkillAccumulationMax()) {
                    parts.add("skillAccumulationMax=" + getSkillAccumulationMax());
                }
                if (hasSkillTimeCurrent()) {
                    parts.add("skillTimeCurrent=" + getSkillTimeCurrent());
                }
                if (hasSkillTimeMax()) {
                    parts.add("skillTimeMax=" + getSkillTimeMax());
                }
                if (hasSkillDuration()) {
                    parts.add("skillDuration=" + getSkillDuration());
                }
                if (hasSkillCannonId()) {
                    parts.add("skillCannonId=" + getSkillCannonId());
                }
                if (hasPetLevel()) {
                    parts.add("petLevel=" + getPetLevel());
                }
                if (hasSkillAccBuff()) {
                    parts.add("skillAccBuff=" + getSkillAccBuff());
                }
                if (!skillTargetFish.isEmpty()) {
                    parts.add("skillTargetFish=" + getSkillTargetFishList());
                }
                return "BoardPlayerInfor{" + String.join(", ", parts) + "}";
            }

            public BoardPlayerInfor build() {
                proto.message.GetBoardInforResponse.BoardPlayerInfor result = new proto.message.GetBoardInforResponse.BoardPlayerInfor();
                result.__bitField0 = __bitField0;
                result.userID = this.userID;
                result.username = this.username;
                result.seatNumber = this.seatNumber;
                result.gunID = this.gunID;
                result.ammoID = this.ammoID;
                result.gold1 = this.gold1;
                result.gold2 = this.gold2;
                result.gold3 = this.gold3;
                result.level = this.level;
                result.avatar = this.avatar;
                result.status = this.status;
                result.bmRank = this.bmRank;
                result.bmReward = this.bmReward;
                result.roseAmount = this.roseAmount;
                result.roseBonusAt = this.roseBonusAt;
                result.stunToSecond = this.stunToSecond;
                result.soloSendAt = this.soloSendAt;
                result.soloReceiveAt = this.soloReceiveAt;
                result.snsName = this.snsName;
                result.hasPet = this.hasPet;
                result.skillType = this.skillType;
                result.skillGold = this.skillGold;
                result.skillAccumulation = this.skillAccumulation;
                result.skillAccumulationMax = this.skillAccumulationMax;
                result.skillTimeCurrent = this.skillTimeCurrent;
                result.skillTimeMax = this.skillTimeMax;
                result.skillDuration = this.skillDuration;
                result.skillCannonId = this.skillCannonId;
                result.petLevel = this.petLevel;
                result.skillAccBuff = this.skillAccBuff;
                result.skillTargetFish = java.util.Collections.unmodifiableList(this.skillTargetFish);
                return result;
            }

        }



    }


}