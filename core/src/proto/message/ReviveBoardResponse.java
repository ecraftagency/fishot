package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class ReviveBoardResponse
        implements io.protostuff.Message<ReviveBoardResponse> {

    private static final ReviveBoardResponse DEFAULT_INSTANCE = newBuilder().build();

    private int result;

    private int gameID;

    private int roomID;

    private int boardID;

    private int betMoney;

    private boolean __merge_lock = false;
    private int __bitField0;

    private ReviveBoardResponse() {
        this.result = proto.message.ReviveCode.REVIVE_CODE_SUCCESS.getNumber();
        this.gameID = 0;
        this.roomID = 0;
        this.boardID = 0;
        this.betMoney = 0;
    }

    private ReviveBoardResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ReviveBoardResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<ReviveBoardResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public proto.message.ReviveCode getResult() {
        return proto.message.ReviveCode.valueOf(result);
    }

    public int getResultValue() {
        return result;
    }

    public boolean hasResult() {
        return (__bitField0 & 1) == 1;
    }

    public ReviveBoardResponse withResult(proto.message.ReviveCode value) {
        return ReviveBoardResponse.newBuilder()
            .mergeFrom(this)
            .setResult(value)
            .build();
    }

    public int getGameID() {
        return gameID;
    }

    public boolean hasGameID() {
        return (__bitField0 & 2) == 2;
    }

    public ReviveBoardResponse withGameID(int value) {
        return ReviveBoardResponse.newBuilder()
            .mergeFrom(this)
            .setGameID(value)
            .build();
    }

    public int getRoomID() {
        return roomID;
    }

    public boolean hasRoomID() {
        return (__bitField0 & 4) == 4;
    }

    public ReviveBoardResponse withRoomID(int value) {
        return ReviveBoardResponse.newBuilder()
            .mergeFrom(this)
            .setRoomID(value)
            .build();
    }

    public int getBoardID() {
        return boardID;
    }

    public boolean hasBoardID() {
        return (__bitField0 & 8) == 8;
    }

    public ReviveBoardResponse withBoardID(int value) {
        return ReviveBoardResponse.newBuilder()
            .mergeFrom(this)
            .setBoardID(value)
            .build();
    }

    public int getBetMoney() {
        return betMoney;
    }

    public boolean hasBetMoney() {
        return (__bitField0 & 16) == 16;
    }

    public ReviveBoardResponse withBetMoney(int value) {
        return ReviveBoardResponse.newBuilder()
            .mergeFrom(this)
            .setBetMoney(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<ReviveBoardResponse> cachedSchema() {
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
        ReviveBoardResponse that = (ReviveBoardResponse) obj;
        if (!java.util.Objects.equals(this.result, that.result)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gameID, that.gameID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.roomID, that.roomID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.boardID, that.boardID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.betMoney, that.betMoney)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.result);
        result = 31 * result + Integer.hashCode(this.gameID);
        result = 31 * result + Integer.hashCode(this.roomID);
        result = 31 * result + Integer.hashCode(this.boardID);
        result = 31 * result + Integer.hashCode(this.betMoney);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasResult()) {
            parts.add("result=" + getResult() + '(' + getResultValue() + ')');
        }
        if (hasGameID()) {
            parts.add("gameID=" + getGameID());
        }
        if (hasRoomID()) {
            parts.add("roomID=" + getRoomID());
        }
        if (hasBoardID()) {
            parts.add("boardID=" + getBoardID());
        }
        if (hasBetMoney()) {
            parts.add("betMoney=" + getBetMoney());
        }
        return "ReviveBoardResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<ReviveBoardResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("result", 1);
        	__fieldMap.put("gameID", 2);
        	__fieldMap.put("roomID", 3);
        	__fieldMap.put("boardID", 4);
        	__fieldMap.put("betMoney", 5);
        }

        @Override
        public ReviveBoardResponse newMessage() {
            return new ReviveBoardResponse();
        }

        @Override
        public Class<ReviveBoardResponse> typeClass() {
            return ReviveBoardResponse.class;
        }

        @Override
        public String messageName() {
            return ReviveBoardResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return ReviveBoardResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(ReviveBoardResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, ReviveBoardResponse instance) throws java.io.IOException {
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
                    	instance.gameID = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.roomID = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.boardID = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.betMoney = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, ReviveBoardResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.result, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.gameID, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.roomID, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.boardID, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.betMoney, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "result";
        		case 2: return "gameID";
        		case 3: return "roomID";
        		case 4: return "boardID";
        		case 5: return "betMoney";
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

        private int gameID;

        private int roomID;

        private int boardID;

        private int betMoney;

        private int __bitField0;

        private Builder() {
            this.result = proto.message.ReviveCode.REVIVE_CODE_SUCCESS.getNumber();
            this.gameID = 0;
            this.roomID = 0;
            this.boardID = 0;
            this.betMoney = 0;
        }

        public Builder mergeFrom(ReviveBoardResponse instance) {
            if (instance.hasResult()) {
                this.setResult(instance.getResult());
            }

            if (instance.hasGameID()) {
                this.setGameID(instance.getGameID());
            }

            if (instance.hasRoomID()) {
                this.setRoomID(instance.getRoomID());
            }

            if (instance.hasBoardID()) {
                this.setBoardID(instance.getBoardID());
            }

            if (instance.hasBetMoney()) {
                this.setBetMoney(instance.getBetMoney());
            }

            return this;
        }

        public proto.message.ReviveCode getResult() {
            return proto.message.ReviveCode.valueOf(result);
        }

        public int getResultValue() {
            return result;
        }

        public Builder setResult(proto.message.ReviveCode value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ReviveBoardResponse#result to null");
            }

            if (value == proto.message.ReviveCode.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set ReviveBoardResponse#result to UNRECOGNIZED");
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

        public int getGameID() {
            return gameID;
        }

        public Builder setGameID(int value) {
            this.gameID = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearGameID() {
            this.gameID = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasGameID() {
            return (__bitField0 & 2) == 2;
        }

        public int getRoomID() {
            return roomID;
        }

        public Builder setRoomID(int value) {
            this.roomID = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearRoomID() {
            this.roomID = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasRoomID() {
            return (__bitField0 & 4) == 4;
        }

        public int getBoardID() {
            return boardID;
        }

        public Builder setBoardID(int value) {
            this.boardID = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearBoardID() {
            this.boardID = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasBoardID() {
            return (__bitField0 & 8) == 8;
        }

        public int getBetMoney() {
            return betMoney;
        }

        public Builder setBetMoney(int value) {
            this.betMoney = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearBetMoney() {
            this.betMoney = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasBetMoney() {
            return (__bitField0 & 16) == 16;
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
            if (!java.util.Objects.equals(this.gameID, that.gameID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.roomID, that.roomID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.boardID, that.boardID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.betMoney, that.betMoney)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.result);
            result = 31 * result + Integer.hashCode(this.gameID);
            result = 31 * result + Integer.hashCode(this.roomID);
            result = 31 * result + Integer.hashCode(this.boardID);
            result = 31 * result + Integer.hashCode(this.betMoney);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasResult()) {
                parts.add("result=" + getResult() + '(' + getResultValue() + ')');
            }
            if (hasGameID()) {
                parts.add("gameID=" + getGameID());
            }
            if (hasRoomID()) {
                parts.add("roomID=" + getRoomID());
            }
            if (hasBoardID()) {
                parts.add("boardID=" + getBoardID());
            }
            if (hasBetMoney()) {
                parts.add("betMoney=" + getBetMoney());
            }
            return "ReviveBoardResponse{" + String.join(", ", parts) + "}";
        }

        public ReviveBoardResponse build() {
            proto.message.ReviveBoardResponse result = new proto.message.ReviveBoardResponse();
            result.__bitField0 = __bitField0;
            result.result = this.result;
            result.gameID = this.gameID;
            result.roomID = this.roomID;
            result.boardID = this.boardID;
            result.betMoney = this.betMoney;
            return result;
        }

    }



}