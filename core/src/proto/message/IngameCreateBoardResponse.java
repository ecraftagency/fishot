package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class IngameCreateBoardResponse
        implements io.protostuff.Message<IngameCreateBoardResponse> {

    private static final IngameCreateBoardResponse DEFAULT_INSTANCE = newBuilder().build();

    private int result;

    private int boardID;

    private int betMoney;

    private int type;

    private String ownerID;

    private int roomID;

    private boolean __merge_lock = false;
    private int __bitField0;

    private IngameCreateBoardResponse() {
        this.result = proto.message.InGameResultCode.JOIN_BOARD_SUCCESS_PLAY.getNumber();
        this.boardID = 0;
        this.betMoney = 0;
        this.type = proto.message.BetmodeType.TYPE_NORMAL.getNumber();
        this.ownerID = "";
        this.roomID = 0;
    }

    private IngameCreateBoardResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static IngameCreateBoardResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<IngameCreateBoardResponse> getSchema()
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

    public IngameCreateBoardResponse withResult(proto.message.InGameResultCode value) {
        return IngameCreateBoardResponse.newBuilder()
            .mergeFrom(this)
            .setResult(value)
            .build();
    }

    public int getBoardID() {
        return boardID;
    }

    public boolean hasBoardID() {
        return (__bitField0 & 2) == 2;
    }

    public IngameCreateBoardResponse withBoardID(int value) {
        return IngameCreateBoardResponse.newBuilder()
            .mergeFrom(this)
            .setBoardID(value)
            .build();
    }

    public int getBetMoney() {
        return betMoney;
    }

    public boolean hasBetMoney() {
        return (__bitField0 & 4) == 4;
    }

    public IngameCreateBoardResponse withBetMoney(int value) {
        return IngameCreateBoardResponse.newBuilder()
            .mergeFrom(this)
            .setBetMoney(value)
            .build();
    }

    public proto.message.BetmodeType getType() {
        return proto.message.BetmodeType.valueOf(type);
    }

    public int getTypeValue() {
        return type;
    }

    public boolean hasType() {
        return (__bitField0 & 8) == 8;
    }

    public IngameCreateBoardResponse withType(proto.message.BetmodeType value) {
        return IngameCreateBoardResponse.newBuilder()
            .mergeFrom(this)
            .setType(value)
            .build();
    }

    public String getOwnerID() {
        return ownerID;
    }

    public boolean hasOwnerID() {
        return (__bitField0 & 16) == 16;
    }

    public IngameCreateBoardResponse withOwnerID(String value) {
        return IngameCreateBoardResponse.newBuilder()
            .mergeFrom(this)
            .setOwnerID(value)
            .build();
    }

    public int getRoomID() {
        return roomID;
    }

    public boolean hasRoomID() {
        return (__bitField0 & 32) == 32;
    }

    public IngameCreateBoardResponse withRoomID(int value) {
        return IngameCreateBoardResponse.newBuilder()
            .mergeFrom(this)
            .setRoomID(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<IngameCreateBoardResponse> cachedSchema() {
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
        IngameCreateBoardResponse that = (IngameCreateBoardResponse) obj;
        if (!java.util.Objects.equals(this.result, that.result)) {
            return false;
        }
        if (!java.util.Objects.equals(this.boardID, that.boardID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.betMoney, that.betMoney)) {
            return false;
        }
        if (!java.util.Objects.equals(this.type, that.type)) {
            return false;
        }
        if (!java.util.Objects.equals(this.ownerID, that.ownerID)) {
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
        result = 31 * result + Integer.hashCode(this.result);
        result = 31 * result + Integer.hashCode(this.boardID);
        result = 31 * result + Integer.hashCode(this.betMoney);
        result = 31 * result + Integer.hashCode(this.type);
        result = 31 * result + (this.ownerID == null ? 0 : this.ownerID.hashCode());
        result = 31 * result + Integer.hashCode(this.roomID);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasResult()) {
            parts.add("result=" + getResult() + '(' + getResultValue() + ')');
        }
        if (hasBoardID()) {
            parts.add("boardID=" + getBoardID());
        }
        if (hasBetMoney()) {
            parts.add("betMoney=" + getBetMoney());
        }
        if (hasType()) {
            parts.add("type=" + getType() + '(' + getTypeValue() + ')');
        }
        if (hasOwnerID()) {
            parts.add("ownerID=" + getOwnerID());
        }
        if (hasRoomID()) {
            parts.add("roomID=" + getRoomID());
        }
        return "IngameCreateBoardResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<IngameCreateBoardResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("result", 1);
        	__fieldMap.put("boardID", 2);
        	__fieldMap.put("betMoney", 3);
        	__fieldMap.put("type", 4);
        	__fieldMap.put("ownerID", 5);
        	__fieldMap.put("roomID", 6);
        }

        @Override
        public IngameCreateBoardResponse newMessage() {
            return new IngameCreateBoardResponse();
        }

        @Override
        public Class<IngameCreateBoardResponse> typeClass() {
            return IngameCreateBoardResponse.class;
        }

        @Override
        public String messageName() {
            return IngameCreateBoardResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return IngameCreateBoardResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(IngameCreateBoardResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, IngameCreateBoardResponse instance) throws java.io.IOException {
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
                    	instance.boardID = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.betMoney = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.type = input.readEnum();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.ownerID = input.readString();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.roomID = input.readInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, IngameCreateBoardResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.result, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.boardID, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.betMoney, false);
            }

            if((instance.__bitField0 & 8) == 8) {
            	output.writeEnum(4, instance.type, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeString(5, instance.ownerID, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeInt32(6, instance.roomID, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "result";
        		case 2: return "boardID";
        		case 3: return "betMoney";
        		case 4: return "type";
        		case 5: return "ownerID";
        		case 6: return "roomID";
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

        private int boardID;

        private int betMoney;

        private int type;

        private String ownerID;

        private int roomID;

        private int __bitField0;

        private Builder() {
            this.result = proto.message.InGameResultCode.JOIN_BOARD_SUCCESS_PLAY.getNumber();
            this.boardID = 0;
            this.betMoney = 0;
            this.type = proto.message.BetmodeType.TYPE_NORMAL.getNumber();
            this.ownerID = "";
            this.roomID = 0;
        }

        public Builder mergeFrom(IngameCreateBoardResponse instance) {
            if (instance.hasResult()) {
                this.setResult(instance.getResult());
            }

            if (instance.hasBoardID()) {
                this.setBoardID(instance.getBoardID());
            }

            if (instance.hasBetMoney()) {
                this.setBetMoney(instance.getBetMoney());
            }

            if (instance.hasType()) {
                this.setType(instance.getType());
            }

            if (instance.hasOwnerID()) {
                this.setOwnerID(instance.getOwnerID());
            }

            if (instance.hasRoomID()) {
                this.setRoomID(instance.getRoomID());
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
                throw new NullPointerException("Cannot set IngameCreateBoardResponse#result to null");
            }

            if (value == proto.message.InGameResultCode.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set IngameCreateBoardResponse#result to UNRECOGNIZED");
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

        public int getBoardID() {
            return boardID;
        }

        public Builder setBoardID(int value) {
            this.boardID = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearBoardID() {
            this.boardID = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasBoardID() {
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

        public proto.message.BetmodeType getType() {
            return proto.message.BetmodeType.valueOf(type);
        }

        public int getTypeValue() {
            return type;
        }

        public Builder setType(proto.message.BetmodeType value) {
            if (value == null) {
                throw new NullPointerException("Cannot set IngameCreateBoardResponse#type to null");
            }

            if (value == proto.message.BetmodeType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set IngameCreateBoardResponse#type to UNRECOGNIZED");
            }

            this.type = value.getNumber();
            __bitField0 |= 8;
            return this;
        }

        public Builder setTypeValue(int value) {
            this.type = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearType() {
            this.type = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasType() {
            return (__bitField0 & 8) == 8;
        }

        public String getOwnerID() {
            return ownerID;
        }

        public Builder setOwnerID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set IngameCreateBoardResponse#ownerID to null");
            }

            this.ownerID = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearOwnerID() {
            this.ownerID = "";
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasOwnerID() {
            return (__bitField0 & 16) == 16;
        }

        public int getRoomID() {
            return roomID;
        }

        public Builder setRoomID(int value) {
            this.roomID = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearRoomID() {
            this.roomID = 0;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasRoomID() {
            return (__bitField0 & 32) == 32;
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
            if (!java.util.Objects.equals(this.boardID, that.boardID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.betMoney, that.betMoney)) {
                return false;
            }
            if (!java.util.Objects.equals(this.type, that.type)) {
                return false;
            }
            if (!java.util.Objects.equals(this.ownerID, that.ownerID)) {
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
            result = 31 * result + Integer.hashCode(this.result);
            result = 31 * result + Integer.hashCode(this.boardID);
            result = 31 * result + Integer.hashCode(this.betMoney);
            result = 31 * result + Integer.hashCode(this.type);
            result = 31 * result + (this.ownerID == null ? 0 : this.ownerID.hashCode());
            result = 31 * result + Integer.hashCode(this.roomID);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasResult()) {
                parts.add("result=" + getResult() + '(' + getResultValue() + ')');
            }
            if (hasBoardID()) {
                parts.add("boardID=" + getBoardID());
            }
            if (hasBetMoney()) {
                parts.add("betMoney=" + getBetMoney());
            }
            if (hasType()) {
                parts.add("type=" + getType() + '(' + getTypeValue() + ')');
            }
            if (hasOwnerID()) {
                parts.add("ownerID=" + getOwnerID());
            }
            if (hasRoomID()) {
                parts.add("roomID=" + getRoomID());
            }
            return "IngameCreateBoardResponse{" + String.join(", ", parts) + "}";
        }

        public IngameCreateBoardResponse build() {
            proto.message.IngameCreateBoardResponse result = new proto.message.IngameCreateBoardResponse();
            result.__bitField0 = __bitField0;
            result.result = this.result;
            result.boardID = this.boardID;
            result.betMoney = this.betMoney;
            result.type = this.type;
            result.ownerID = this.ownerID;
            result.roomID = this.roomID;
            return result;
        }

    }



}