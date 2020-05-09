package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class BoardInfor
        implements io.protostuff.Message<BoardInfor> {

    private static final BoardInfor DEFAULT_INSTANCE = newBuilder().build();

    private int boardID;

    private int status;

    private int players;

    private String password;

    private int maxPlayer;

    private String typeName;

    private int typeVal;

    private int betMoney;

    private boolean canJoin;

    private int betBuff;

    private boolean __merge_lock = false;
    private int __bitField0;

    private BoardInfor() {
        this.boardID = 0;
        this.status = 0;
        this.players = 0;
        this.password = "";
        this.maxPlayer = 0;
        this.typeName = "";
        this.typeVal = proto.message.BetmodeType.TYPE_NORMAL.getNumber();
        this.betMoney = 0;
        this.canJoin = false;
        this.betBuff = 0;
    }

    private BoardInfor(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static BoardInfor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<BoardInfor> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getBoardID() {
        return boardID;
    }

    public boolean hasBoardID() {
        return (__bitField0 & 1) == 1;
    }

    public BoardInfor withBoardID(int value) {
        return BoardInfor.newBuilder()
            .mergeFrom(this)
            .setBoardID(value)
            .build();
    }

    public int getStatus() {
        return status;
    }

    public boolean hasStatus() {
        return (__bitField0 & 2) == 2;
    }

    public BoardInfor withStatus(int value) {
        return BoardInfor.newBuilder()
            .mergeFrom(this)
            .setStatus(value)
            .build();
    }

    public int getPlayers() {
        return players;
    }

    public boolean hasPlayers() {
        return (__bitField0 & 4) == 4;
    }

    public BoardInfor withPlayers(int value) {
        return BoardInfor.newBuilder()
            .mergeFrom(this)
            .setPlayers(value)
            .build();
    }

    public String getPassword() {
        return password;
    }

    public boolean hasPassword() {
        return (__bitField0 & 8) == 8;
    }

    public BoardInfor withPassword(String value) {
        return BoardInfor.newBuilder()
            .mergeFrom(this)
            .setPassword(value)
            .build();
    }

    public int getMaxPlayer() {
        return maxPlayer;
    }

    public boolean hasMaxPlayer() {
        return (__bitField0 & 16) == 16;
    }

    public BoardInfor withMaxPlayer(int value) {
        return BoardInfor.newBuilder()
            .mergeFrom(this)
            .setMaxPlayer(value)
            .build();
    }

    public String getTypeName() {
        return typeName;
    }

    public boolean hasTypeName() {
        return (__bitField0 & 32) == 32;
    }

    public BoardInfor withTypeName(String value) {
        return BoardInfor.newBuilder()
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
        return (__bitField0 & 64) == 64;
    }

    public BoardInfor withTypeVal(proto.message.BetmodeType value) {
        return BoardInfor.newBuilder()
            .mergeFrom(this)
            .setTypeVal(value)
            .build();
    }

    public int getBetMoney() {
        return betMoney;
    }

    public boolean hasBetMoney() {
        return (__bitField0 & 128) == 128;
    }

    public BoardInfor withBetMoney(int value) {
        return BoardInfor.newBuilder()
            .mergeFrom(this)
            .setBetMoney(value)
            .build();
    }

    public boolean getCanJoin() {
        return canJoin;
    }

    public boolean hasCanJoin() {
        return (__bitField0 & 256) == 256;
    }

    public BoardInfor withCanJoin(boolean value) {
        return BoardInfor.newBuilder()
            .mergeFrom(this)
            .setCanJoin(value)
            .build();
    }

    public int getBetBuff() {
        return betBuff;
    }

    public boolean hasBetBuff() {
        return (__bitField0 & 512) == 512;
    }

    public BoardInfor withBetBuff(int value) {
        return BoardInfor.newBuilder()
            .mergeFrom(this)
            .setBetBuff(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<BoardInfor> cachedSchema() {
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
        BoardInfor that = (BoardInfor) obj;
        if (!java.util.Objects.equals(this.boardID, that.boardID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.status, that.status)) {
            return false;
        }
        if (!java.util.Objects.equals(this.players, that.players)) {
            return false;
        }
        if (!java.util.Objects.equals(this.password, that.password)) {
            return false;
        }
        if (!java.util.Objects.equals(this.maxPlayer, that.maxPlayer)) {
            return false;
        }
        if (!java.util.Objects.equals(this.typeName, that.typeName)) {
            return false;
        }
        if (!java.util.Objects.equals(this.typeVal, that.typeVal)) {
            return false;
        }
        if (!java.util.Objects.equals(this.betMoney, that.betMoney)) {
            return false;
        }
        if (!java.util.Objects.equals(this.canJoin, that.canJoin)) {
            return false;
        }
        if (!java.util.Objects.equals(this.betBuff, that.betBuff)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.boardID);
        result = 31 * result + Integer.hashCode(this.status);
        result = 31 * result + Integer.hashCode(this.players);
        result = 31 * result + (this.password == null ? 0 : this.password.hashCode());
        result = 31 * result + Integer.hashCode(this.maxPlayer);
        result = 31 * result + (this.typeName == null ? 0 : this.typeName.hashCode());
        result = 31 * result + Integer.hashCode(this.typeVal);
        result = 31 * result + Integer.hashCode(this.betMoney);
        result = 31 * result + Boolean.hashCode(this.canJoin);
        result = 31 * result + Integer.hashCode(this.betBuff);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasBoardID()) {
            parts.add("boardID=" + getBoardID());
        }
        if (hasStatus()) {
            parts.add("status=" + getStatus());
        }
        if (hasPlayers()) {
            parts.add("players=" + getPlayers());
        }
        if (hasPassword()) {
            parts.add("password=" + getPassword());
        }
        if (hasMaxPlayer()) {
            parts.add("maxPlayer=" + getMaxPlayer());
        }
        if (hasTypeName()) {
            parts.add("typeName=" + getTypeName());
        }
        if (hasTypeVal()) {
            parts.add("typeVal=" + getTypeVal() + '(' + getTypeValValue() + ')');
        }
        if (hasBetMoney()) {
            parts.add("betMoney=" + getBetMoney());
        }
        if (hasCanJoin()) {
            parts.add("canJoin=" + getCanJoin());
        }
        if (hasBetBuff()) {
            parts.add("betBuff=" + getBetBuff());
        }
        return "BoardInfor{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<BoardInfor>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("boardID", 1);
        	__fieldMap.put("status", 2);
        	__fieldMap.put("players", 3);
        	__fieldMap.put("password", 4);
        	__fieldMap.put("maxPlayer", 5);
        	__fieldMap.put("typeName", 6);
        	__fieldMap.put("typeVal", 7);
        	__fieldMap.put("betMoney", 8);
        	__fieldMap.put("canJoin", 9);
        	__fieldMap.put("betBuff", 10);
        }

        @Override
        public BoardInfor newMessage() {
            return new BoardInfor();
        }

        @Override
        public Class<BoardInfor> typeClass() {
            return BoardInfor.class;
        }

        @Override
        public String messageName() {
            return BoardInfor.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return BoardInfor.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(BoardInfor message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, BoardInfor instance) throws java.io.IOException {
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
                    	instance.status = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.players = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.password = input.readString();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.maxPlayer = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.typeName = input.readString();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.typeVal = input.readEnum();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.betMoney = input.readInt32();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 9:
                    	instance.canJoin = input.readBool();
                    	instance.__bitField0 |= 256;
                    	break;
                    case 10:
                    	instance.betBuff = input.readInt32();
                    	instance.__bitField0 |= 512;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, BoardInfor instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.boardID, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.status, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.players, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeString(4, instance.password, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.maxPlayer, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeString(6, instance.typeName, false);
            }

            if((instance.__bitField0 & 64) == 64) {
            	output.writeEnum(7, instance.typeVal, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeInt32(8, instance.betMoney, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeBool(9, instance.canJoin, false);
            }

            if((instance.__bitField0 & 512) == 512) {
                output.writeInt32(10, instance.betBuff, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "boardID";
        		case 2: return "status";
        		case 3: return "players";
        		case 4: return "password";
        		case 5: return "maxPlayer";
        		case 6: return "typeName";
        		case 7: return "typeVal";
        		case 8: return "betMoney";
        		case 9: return "canJoin";
        		case 10: return "betBuff";
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

        private int status;

        private int players;

        private String password;

        private int maxPlayer;

        private String typeName;

        private int typeVal;

        private int betMoney;

        private boolean canJoin;

        private int betBuff;

        private int __bitField0;

        private Builder() {
            this.boardID = 0;
            this.status = 0;
            this.players = 0;
            this.password = "";
            this.maxPlayer = 0;
            this.typeName = "";
            this.typeVal = proto.message.BetmodeType.TYPE_NORMAL.getNumber();
            this.betMoney = 0;
            this.canJoin = false;
            this.betBuff = 0;
        }

        public Builder mergeFrom(BoardInfor instance) {
            if (instance.hasBoardID()) {
                this.setBoardID(instance.getBoardID());
            }

            if (instance.hasStatus()) {
                this.setStatus(instance.getStatus());
            }

            if (instance.hasPlayers()) {
                this.setPlayers(instance.getPlayers());
            }

            if (instance.hasPassword()) {
                this.setPassword(instance.getPassword());
            }

            if (instance.hasMaxPlayer()) {
                this.setMaxPlayer(instance.getMaxPlayer());
            }

            if (instance.hasTypeName()) {
                this.setTypeName(instance.getTypeName());
            }

            if (instance.hasTypeVal()) {
                this.setTypeVal(instance.getTypeVal());
            }

            if (instance.hasBetMoney()) {
                this.setBetMoney(instance.getBetMoney());
            }

            if (instance.hasCanJoin()) {
                this.setCanJoin(instance.getCanJoin());
            }

            if (instance.hasBetBuff()) {
                this.setBetBuff(instance.getBetBuff());
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

        public int getStatus() {
            return status;
        }

        public Builder setStatus(int value) {
            this.status = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearStatus() {
            this.status = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasStatus() {
            return (__bitField0 & 2) == 2;
        }

        public int getPlayers() {
            return players;
        }

        public Builder setPlayers(int value) {
            this.players = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearPlayers() {
            this.players = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasPlayers() {
            return (__bitField0 & 4) == 4;
        }

        public String getPassword() {
            return password;
        }

        public Builder setPassword(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set BoardInfor#password to null");
            }

            this.password = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearPassword() {
            this.password = "";
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasPassword() {
            return (__bitField0 & 8) == 8;
        }

        public int getMaxPlayer() {
            return maxPlayer;
        }

        public Builder setMaxPlayer(int value) {
            this.maxPlayer = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearMaxPlayer() {
            this.maxPlayer = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasMaxPlayer() {
            return (__bitField0 & 16) == 16;
        }

        public String getTypeName() {
            return typeName;
        }

        public Builder setTypeName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set BoardInfor#typeName to null");
            }

            this.typeName = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearTypeName() {
            this.typeName = "";
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasTypeName() {
            return (__bitField0 & 32) == 32;
        }

        public proto.message.BetmodeType getTypeVal() {
            return proto.message.BetmodeType.valueOf(typeVal);
        }

        public int getTypeValValue() {
            return typeVal;
        }

        public Builder setTypeVal(proto.message.BetmodeType value) {
            if (value == null) {
                throw new NullPointerException("Cannot set BoardInfor#typeVal to null");
            }

            if (value == proto.message.BetmodeType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set BoardInfor#typeVal to UNRECOGNIZED");
            }

            this.typeVal = value.getNumber();
            __bitField0 |= 64;
            return this;
        }

        public Builder setTypeValValue(int value) {
            this.typeVal = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearTypeVal() {
            this.typeVal = 0;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasTypeVal() {
            return (__bitField0 & 64) == 64;
        }

        public int getBetMoney() {
            return betMoney;
        }

        public Builder setBetMoney(int value) {
            this.betMoney = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearBetMoney() {
            this.betMoney = 0;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasBetMoney() {
            return (__bitField0 & 128) == 128;
        }

        public boolean getCanJoin() {
            return canJoin;
        }

        public Builder setCanJoin(boolean value) {
            this.canJoin = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearCanJoin() {
            this.canJoin = false;
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasCanJoin() {
            return (__bitField0 & 256) == 256;
        }

        public int getBetBuff() {
            return betBuff;
        }

        public Builder setBetBuff(int value) {
            this.betBuff = value;
            __bitField0 |= 512;
            return this;
        }

        public Builder clearBetBuff() {
            this.betBuff = 0;
            __bitField0 &= ~512;
            return this;
        }

        public boolean hasBetBuff() {
            return (__bitField0 & 512) == 512;
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
            if (!java.util.Objects.equals(this.status, that.status)) {
                return false;
            }
            if (!java.util.Objects.equals(this.players, that.players)) {
                return false;
            }
            if (!java.util.Objects.equals(this.password, that.password)) {
                return false;
            }
            if (!java.util.Objects.equals(this.maxPlayer, that.maxPlayer)) {
                return false;
            }
            if (!java.util.Objects.equals(this.typeName, that.typeName)) {
                return false;
            }
            if (!java.util.Objects.equals(this.typeVal, that.typeVal)) {
                return false;
            }
            if (!java.util.Objects.equals(this.betMoney, that.betMoney)) {
                return false;
            }
            if (!java.util.Objects.equals(this.canJoin, that.canJoin)) {
                return false;
            }
            if (!java.util.Objects.equals(this.betBuff, that.betBuff)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.boardID);
            result = 31 * result + Integer.hashCode(this.status);
            result = 31 * result + Integer.hashCode(this.players);
            result = 31 * result + (this.password == null ? 0 : this.password.hashCode());
            result = 31 * result + Integer.hashCode(this.maxPlayer);
            result = 31 * result + (this.typeName == null ? 0 : this.typeName.hashCode());
            result = 31 * result + Integer.hashCode(this.typeVal);
            result = 31 * result + Integer.hashCode(this.betMoney);
            result = 31 * result + Boolean.hashCode(this.canJoin);
            result = 31 * result + Integer.hashCode(this.betBuff);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasBoardID()) {
                parts.add("boardID=" + getBoardID());
            }
            if (hasStatus()) {
                parts.add("status=" + getStatus());
            }
            if (hasPlayers()) {
                parts.add("players=" + getPlayers());
            }
            if (hasPassword()) {
                parts.add("password=" + getPassword());
            }
            if (hasMaxPlayer()) {
                parts.add("maxPlayer=" + getMaxPlayer());
            }
            if (hasTypeName()) {
                parts.add("typeName=" + getTypeName());
            }
            if (hasTypeVal()) {
                parts.add("typeVal=" + getTypeVal() + '(' + getTypeValValue() + ')');
            }
            if (hasBetMoney()) {
                parts.add("betMoney=" + getBetMoney());
            }
            if (hasCanJoin()) {
                parts.add("canJoin=" + getCanJoin());
            }
            if (hasBetBuff()) {
                parts.add("betBuff=" + getBetBuff());
            }
            return "BoardInfor{" + String.join(", ", parts) + "}";
        }

        public BoardInfor build() {
            proto.message.BoardInfor result = new proto.message.BoardInfor();
            result.__bitField0 = __bitField0;
            result.boardID = this.boardID;
            result.status = this.status;
            result.players = this.players;
            result.password = this.password;
            result.maxPlayer = this.maxPlayer;
            result.typeName = this.typeName;
            result.typeVal = this.typeVal;
            result.betMoney = this.betMoney;
            result.canJoin = this.canJoin;
            result.betBuff = this.betBuff;
            return result;
        }

    }



}