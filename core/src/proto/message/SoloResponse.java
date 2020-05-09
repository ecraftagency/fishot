package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class SoloResponse
        implements io.protostuff.Message<SoloResponse> {

    private static final SoloResponse DEFAULT_INSTANCE = newBuilder().build();

    private String fromUserId;

    private String toUserId;

    private int betPrice;

    private int betRule;

    private int result;

    private int gameId;

    private int roomId;

    private int boardId;

    private int boardBullet;

    private boolean __merge_lock = false;
    private int __bitField0;

    private SoloResponse() {
        this.fromUserId = "";
        this.toUserId = "";
        this.betPrice = 0;
        this.betRule = 0;
        this.result = proto.message.InGameResultCode.JOIN_BOARD_SUCCESS_PLAY.getNumber();
        this.gameId = 0;
        this.roomId = 0;
        this.boardId = 0;
        this.boardBullet = 0;
    }

    private SoloResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static SoloResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<SoloResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getFromUserId() {
        return fromUserId;
    }

    public boolean hasFromUserId() {
        return (__bitField0 & 1) == 1;
    }

    public SoloResponse withFromUserId(String value) {
        return SoloResponse.newBuilder()
            .mergeFrom(this)
            .setFromUserId(value)
            .build();
    }

    public String getToUserId() {
        return toUserId;
    }

    public boolean hasToUserId() {
        return (__bitField0 & 2) == 2;
    }

    public SoloResponse withToUserId(String value) {
        return SoloResponse.newBuilder()
            .mergeFrom(this)
            .setToUserId(value)
            .build();
    }

    public int getBetPrice() {
        return betPrice;
    }

    public boolean hasBetPrice() {
        return (__bitField0 & 4) == 4;
    }

    public SoloResponse withBetPrice(int value) {
        return SoloResponse.newBuilder()
            .mergeFrom(this)
            .setBetPrice(value)
            .build();
    }

    public int getBetRule() {
        return betRule;
    }

    public boolean hasBetRule() {
        return (__bitField0 & 8) == 8;
    }

    public SoloResponse withBetRule(int value) {
        return SoloResponse.newBuilder()
            .mergeFrom(this)
            .setBetRule(value)
            .build();
    }

    public proto.message.InGameResultCode getResult() {
        return proto.message.InGameResultCode.valueOf(result);
    }

    public int getResultValue() {
        return result;
    }

    public boolean hasResult() {
        return (__bitField0 & 16) == 16;
    }

    public SoloResponse withResult(proto.message.InGameResultCode value) {
        return SoloResponse.newBuilder()
            .mergeFrom(this)
            .setResult(value)
            .build();
    }

    public int getGameId() {
        return gameId;
    }

    public boolean hasGameId() {
        return (__bitField0 & 32) == 32;
    }

    public SoloResponse withGameId(int value) {
        return SoloResponse.newBuilder()
            .mergeFrom(this)
            .setGameId(value)
            .build();
    }

    public int getRoomId() {
        return roomId;
    }

    public boolean hasRoomId() {
        return (__bitField0 & 64) == 64;
    }

    public SoloResponse withRoomId(int value) {
        return SoloResponse.newBuilder()
            .mergeFrom(this)
            .setRoomId(value)
            .build();
    }

    public int getBoardId() {
        return boardId;
    }

    public boolean hasBoardId() {
        return (__bitField0 & 128) == 128;
    }

    public SoloResponse withBoardId(int value) {
        return SoloResponse.newBuilder()
            .mergeFrom(this)
            .setBoardId(value)
            .build();
    }

    public int getBoardBullet() {
        return boardBullet;
    }

    public boolean hasBoardBullet() {
        return (__bitField0 & 256) == 256;
    }

    public SoloResponse withBoardBullet(int value) {
        return SoloResponse.newBuilder()
            .mergeFrom(this)
            .setBoardBullet(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<SoloResponse> cachedSchema() {
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
        SoloResponse that = (SoloResponse) obj;
        if (!java.util.Objects.equals(this.fromUserId, that.fromUserId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.toUserId, that.toUserId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.betPrice, that.betPrice)) {
            return false;
        }
        if (!java.util.Objects.equals(this.betRule, that.betRule)) {
            return false;
        }
        if (!java.util.Objects.equals(this.result, that.result)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gameId, that.gameId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.roomId, that.roomId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.boardId, that.boardId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.boardBullet, that.boardBullet)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.fromUserId == null ? 0 : this.fromUserId.hashCode());
        result = 31 * result + (this.toUserId == null ? 0 : this.toUserId.hashCode());
        result = 31 * result + Integer.hashCode(this.betPrice);
        result = 31 * result + Integer.hashCode(this.betRule);
        result = 31 * result + Integer.hashCode(this.result);
        result = 31 * result + Integer.hashCode(this.gameId);
        result = 31 * result + Integer.hashCode(this.roomId);
        result = 31 * result + Integer.hashCode(this.boardId);
        result = 31 * result + Integer.hashCode(this.boardBullet);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasFromUserId()) {
            parts.add("fromUserId=" + getFromUserId());
        }
        if (hasToUserId()) {
            parts.add("toUserId=" + getToUserId());
        }
        if (hasBetPrice()) {
            parts.add("betPrice=" + getBetPrice());
        }
        if (hasBetRule()) {
            parts.add("betRule=" + getBetRule());
        }
        if (hasResult()) {
            parts.add("result=" + getResult() + '(' + getResultValue() + ')');
        }
        if (hasGameId()) {
            parts.add("gameId=" + getGameId());
        }
        if (hasRoomId()) {
            parts.add("roomId=" + getRoomId());
        }
        if (hasBoardId()) {
            parts.add("boardId=" + getBoardId());
        }
        if (hasBoardBullet()) {
            parts.add("boardBullet=" + getBoardBullet());
        }
        return "SoloResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<SoloResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("fromUserId", 1);
        	__fieldMap.put("toUserId", 2);
        	__fieldMap.put("betPrice", 3);
        	__fieldMap.put("betRule", 4);
        	__fieldMap.put("result", 5);
        	__fieldMap.put("gameId", 6);
        	__fieldMap.put("roomId", 7);
        	__fieldMap.put("boardId", 8);
        	__fieldMap.put("boardBullet", 9);
        }

        @Override
        public SoloResponse newMessage() {
            return new SoloResponse();
        }

        @Override
        public Class<SoloResponse> typeClass() {
            return SoloResponse.class;
        }

        @Override
        public String messageName() {
            return SoloResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return SoloResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(SoloResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, SoloResponse instance) throws java.io.IOException {
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
                    	instance.fromUserId = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.toUserId = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.betPrice = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.betRule = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.result = input.readEnum();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.gameId = input.readInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.roomId = input.readInt32();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.boardId = input.readInt32();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 9:
                    	instance.boardBullet = input.readInt32();
                    	instance.__bitField0 |= 256;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, SoloResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.fromUserId, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.toUserId, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.betPrice, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.betRule, false);
            }

            if((instance.__bitField0 & 16) == 16) {
            	output.writeEnum(5, instance.result, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeInt32(6, instance.gameId, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeInt32(7, instance.roomId, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeInt32(8, instance.boardId, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeInt32(9, instance.boardBullet, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "fromUserId";
        		case 2: return "toUserId";
        		case 3: return "betPrice";
        		case 4: return "betRule";
        		case 5: return "result";
        		case 6: return "gameId";
        		case 7: return "roomId";
        		case 8: return "boardId";
        		case 9: return "boardBullet";
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

        private String fromUserId;

        private String toUserId;

        private int betPrice;

        private int betRule;

        private int result;

        private int gameId;

        private int roomId;

        private int boardId;

        private int boardBullet;

        private int __bitField0;

        private Builder() {
            this.fromUserId = "";
            this.toUserId = "";
            this.betPrice = 0;
            this.betRule = 0;
            this.result = proto.message.InGameResultCode.JOIN_BOARD_SUCCESS_PLAY.getNumber();
            this.gameId = 0;
            this.roomId = 0;
            this.boardId = 0;
            this.boardBullet = 0;
        }

        public Builder mergeFrom(SoloResponse instance) {
            if (instance.hasFromUserId()) {
                this.setFromUserId(instance.getFromUserId());
            }

            if (instance.hasToUserId()) {
                this.setToUserId(instance.getToUserId());
            }

            if (instance.hasBetPrice()) {
                this.setBetPrice(instance.getBetPrice());
            }

            if (instance.hasBetRule()) {
                this.setBetRule(instance.getBetRule());
            }

            if (instance.hasResult()) {
                this.setResult(instance.getResult());
            }

            if (instance.hasGameId()) {
                this.setGameId(instance.getGameId());
            }

            if (instance.hasRoomId()) {
                this.setRoomId(instance.getRoomId());
            }

            if (instance.hasBoardId()) {
                this.setBoardId(instance.getBoardId());
            }

            if (instance.hasBoardBullet()) {
                this.setBoardBullet(instance.getBoardBullet());
            }

            return this;
        }

        public String getFromUserId() {
            return fromUserId;
        }

        public Builder setFromUserId(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SoloResponse#fromUserId to null");
            }

            this.fromUserId = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearFromUserId() {
            this.fromUserId = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasFromUserId() {
            return (__bitField0 & 1) == 1;
        }

        public String getToUserId() {
            return toUserId;
        }

        public Builder setToUserId(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SoloResponse#toUserId to null");
            }

            this.toUserId = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearToUserId() {
            this.toUserId = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasToUserId() {
            return (__bitField0 & 2) == 2;
        }

        public int getBetPrice() {
            return betPrice;
        }

        public Builder setBetPrice(int value) {
            this.betPrice = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearBetPrice() {
            this.betPrice = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasBetPrice() {
            return (__bitField0 & 4) == 4;
        }

        public int getBetRule() {
            return betRule;
        }

        public Builder setBetRule(int value) {
            this.betRule = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearBetRule() {
            this.betRule = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasBetRule() {
            return (__bitField0 & 8) == 8;
        }

        public proto.message.InGameResultCode getResult() {
            return proto.message.InGameResultCode.valueOf(result);
        }

        public int getResultValue() {
            return result;
        }

        public Builder setResult(proto.message.InGameResultCode value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SoloResponse#result to null");
            }

            if (value == proto.message.InGameResultCode.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set SoloResponse#result to UNRECOGNIZED");
            }

            this.result = value.getNumber();
            __bitField0 |= 16;
            return this;
        }

        public Builder setResultValue(int value) {
            this.result = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearResult() {
            this.result = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasResult() {
            return (__bitField0 & 16) == 16;
        }

        public int getGameId() {
            return gameId;
        }

        public Builder setGameId(int value) {
            this.gameId = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearGameId() {
            this.gameId = 0;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasGameId() {
            return (__bitField0 & 32) == 32;
        }

        public int getRoomId() {
            return roomId;
        }

        public Builder setRoomId(int value) {
            this.roomId = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearRoomId() {
            this.roomId = 0;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasRoomId() {
            return (__bitField0 & 64) == 64;
        }

        public int getBoardId() {
            return boardId;
        }

        public Builder setBoardId(int value) {
            this.boardId = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearBoardId() {
            this.boardId = 0;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasBoardId() {
            return (__bitField0 & 128) == 128;
        }

        public int getBoardBullet() {
            return boardBullet;
        }

        public Builder setBoardBullet(int value) {
            this.boardBullet = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearBoardBullet() {
            this.boardBullet = 0;
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasBoardBullet() {
            return (__bitField0 & 256) == 256;
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
            if (!java.util.Objects.equals(this.fromUserId, that.fromUserId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.toUserId, that.toUserId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.betPrice, that.betPrice)) {
                return false;
            }
            if (!java.util.Objects.equals(this.betRule, that.betRule)) {
                return false;
            }
            if (!java.util.Objects.equals(this.result, that.result)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gameId, that.gameId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.roomId, that.roomId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.boardId, that.boardId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.boardBullet, that.boardBullet)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.fromUserId == null ? 0 : this.fromUserId.hashCode());
            result = 31 * result + (this.toUserId == null ? 0 : this.toUserId.hashCode());
            result = 31 * result + Integer.hashCode(this.betPrice);
            result = 31 * result + Integer.hashCode(this.betRule);
            result = 31 * result + Integer.hashCode(this.result);
            result = 31 * result + Integer.hashCode(this.gameId);
            result = 31 * result + Integer.hashCode(this.roomId);
            result = 31 * result + Integer.hashCode(this.boardId);
            result = 31 * result + Integer.hashCode(this.boardBullet);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasFromUserId()) {
                parts.add("fromUserId=" + getFromUserId());
            }
            if (hasToUserId()) {
                parts.add("toUserId=" + getToUserId());
            }
            if (hasBetPrice()) {
                parts.add("betPrice=" + getBetPrice());
            }
            if (hasBetRule()) {
                parts.add("betRule=" + getBetRule());
            }
            if (hasResult()) {
                parts.add("result=" + getResult() + '(' + getResultValue() + ')');
            }
            if (hasGameId()) {
                parts.add("gameId=" + getGameId());
            }
            if (hasRoomId()) {
                parts.add("roomId=" + getRoomId());
            }
            if (hasBoardId()) {
                parts.add("boardId=" + getBoardId());
            }
            if (hasBoardBullet()) {
                parts.add("boardBullet=" + getBoardBullet());
            }
            return "SoloResponse{" + String.join(", ", parts) + "}";
        }

        public SoloResponse build() {
            proto.message.SoloResponse result = new proto.message.SoloResponse();
            result.__bitField0 = __bitField0;
            result.fromUserId = this.fromUserId;
            result.toUserId = this.toUserId;
            result.betPrice = this.betPrice;
            result.betRule = this.betRule;
            result.result = this.result;
            result.gameId = this.gameId;
            result.roomId = this.roomId;
            result.boardId = this.boardId;
            result.boardBullet = this.boardBullet;
            return result;
        }

    }



}