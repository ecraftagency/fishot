package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class FinishGameResponse
        implements io.protostuff.Message<FinishGameResponse> {

    private static final FinishGameResponse DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<proto.message.FinishGameResponse.BoardPlayerLog> boardPlayerLog;

    private boolean __merge_lock = false;
    private int __bitField0;

    private FinishGameResponse() {
        this.boardPlayerLog = java.util.Collections.emptyList();
    }

    private FinishGameResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static FinishGameResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<FinishGameResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<proto.message.FinishGameResponse.BoardPlayerLog> getBoardPlayerLogList() {
        return boardPlayerLog;
    }

    public int getBoardPlayerLogCount() {
        return boardPlayerLog.size();
    }

    public proto.message.FinishGameResponse.BoardPlayerLog getBoardPlayerLog(int index) {
        return boardPlayerLog.get(index);
    }

    public FinishGameResponse withBoardPlayerLog(java.util.List<proto.message.FinishGameResponse.BoardPlayerLog> value) {
        return FinishGameResponse.newBuilder()
            .mergeFrom(this)
            .clearBoardPlayerLog()
            .addAllBoardPlayerLog(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<FinishGameResponse> cachedSchema() {
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
        FinishGameResponse that = (FinishGameResponse) obj;
        if (!java.util.Objects.equals(this.boardPlayerLog, that.boardPlayerLog)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.boardPlayerLog == null ? 0 : this.boardPlayerLog.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!boardPlayerLog.isEmpty()) {
            parts.add("boardPlayerLog=" + getBoardPlayerLogList());
        }
        return "FinishGameResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<FinishGameResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("boardPlayerLog", 1);
        }

        @Override
        public FinishGameResponse newMessage() {
            return new FinishGameResponse();
        }

        @Override
        public Class<FinishGameResponse> typeClass() {
            return FinishGameResponse.class;
        }

        @Override
        public String messageName() {
            return FinishGameResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return FinishGameResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(FinishGameResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, FinishGameResponse instance) throws java.io.IOException {
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
                    	if(!((instance.__bitField0 & 1) == 1)) {
                    	    instance.boardPlayerLog = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.boardPlayerLog.add(input.mergeObject(null, proto.message.FinishGameResponse.BoardPlayerLog.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.boardPlayerLog = java.util.Collections.unmodifiableList(instance.boardPlayerLog);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, FinishGameResponse instance) throws java.io.IOException {
            for(proto.message.FinishGameResponse.BoardPlayerLog boardPlayerLog : instance.boardPlayerLog) {
                output.writeObject(1, boardPlayerLog, proto.message.FinishGameResponse.BoardPlayerLog.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "boardPlayerLog";
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

        private java.util.List<proto.message.FinishGameResponse.BoardPlayerLog> boardPlayerLog;

        private int __bitField0;

        private Builder() {
            this.boardPlayerLog = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(FinishGameResponse instance) {
            this.addAllBoardPlayerLog(instance.getBoardPlayerLogList());

            return this;
        }

        public java.util.List<proto.message.FinishGameResponse.BoardPlayerLog> getBoardPlayerLogList() {
            return boardPlayerLog;
        }

        public Builder setBoardPlayerLog(int index, proto.message.FinishGameResponse.BoardPlayerLog value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FinishGameResponse#boardPlayerLog to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.boardPlayerLog = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.boardPlayerLog.set(index, value);
            return this;
        }

        public Builder addBoardPlayerLog(proto.message.FinishGameResponse.BoardPlayerLog value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FinishGameResponse#boardPlayerLog to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.boardPlayerLog = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.boardPlayerLog.add(value);
            return this;
        }

        public Builder addAllBoardPlayerLog(java.lang.Iterable<proto.message.FinishGameResponse.BoardPlayerLog> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set FinishGameResponse#boardPlayerLog to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.boardPlayerLog = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final proto.message.FinishGameResponse.BoardPlayerLog value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set FinishGameResponse#boardPlayerLog to null");
                }
                this.boardPlayerLog.add(value);
            }
            return this;
        }

        public Builder clearBoardPlayerLog() {
            this.boardPlayerLog = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getBoardPlayerLogCount() {
            return boardPlayerLog.size();
        }

        public proto.message.FinishGameResponse.BoardPlayerLog getBoardPlayerLog(int index) {
            return boardPlayerLog.get(index);
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
            if (!java.util.Objects.equals(this.boardPlayerLog, that.boardPlayerLog)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.boardPlayerLog == null ? 0 : this.boardPlayerLog.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!boardPlayerLog.isEmpty()) {
                parts.add("boardPlayerLog=" + getBoardPlayerLogList());
            }
            return "FinishGameResponse{" + String.join(", ", parts) + "}";
        }

        public FinishGameResponse build() {
            proto.message.FinishGameResponse result = new proto.message.FinishGameResponse();
            result.__bitField0 = __bitField0;
            result.boardPlayerLog = java.util.Collections.unmodifiableList(this.boardPlayerLog);
            return result;
        }

    }

    public static final class BoardPlayerLog
            implements io.protostuff.Message<BoardPlayerLog> {

        private static final BoardPlayerLog DEFAULT_INSTANCE = newBuilder().build();

        private String userID;

        private String userName;

        private String userAvatar;

        private int startExp;

        private int endExp;

        private int moneyGain;

        private int endMoney;

        private java.util.List<Integer> fishID;

        private int expGain;

        private boolean isFriend;

        private int betScore;

        private int freeBestDaily;

        private int freeBestWeekly;

        private int freeBestScore;

        private int betBestDaily;

        private int betBestWeekly;

        private int betBestScore;

        private String snsName;

        private boolean __merge_lock = false;
        private int __bitField0;

        private BoardPlayerLog() {
            this.userID = "";
            this.userName = "";
            this.userAvatar = "";
            this.startExp = 0;
            this.endExp = 0;
            this.moneyGain = 0;
            this.endMoney = 0;
            this.fishID = java.util.Collections.emptyList();
            this.expGain = 0;
            this.isFriend = false;
            this.betScore = 0;
            this.freeBestDaily = 0;
            this.freeBestWeekly = 0;
            this.freeBestScore = 0;
            this.betBestDaily = 0;
            this.betBestWeekly = 0;
            this.betBestScore = 0;
            this.snsName = "";
        }

        private BoardPlayerLog(Builder builder) {
            __merge_lock = true;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public static BoardPlayerLog getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static io.protostuff.Schema<BoardPlayerLog> getSchema()
        {
        	return Schema.INSTANCE;
        }

        public String getUserID() {
            return userID;
        }

        public boolean hasUserID() {
            return (__bitField0 & 1) == 1;
        }

        public BoardPlayerLog withUserID(String value) {
            return BoardPlayerLog.newBuilder()
                .mergeFrom(this)
                .setUserID(value)
                .build();
        }

        public String getUserName() {
            return userName;
        }

        public boolean hasUserName() {
            return (__bitField0 & 2) == 2;
        }

        public BoardPlayerLog withUserName(String value) {
            return BoardPlayerLog.newBuilder()
                .mergeFrom(this)
                .setUserName(value)
                .build();
        }

        public String getUserAvatar() {
            return userAvatar;
        }

        public boolean hasUserAvatar() {
            return (__bitField0 & 4) == 4;
        }

        public BoardPlayerLog withUserAvatar(String value) {
            return BoardPlayerLog.newBuilder()
                .mergeFrom(this)
                .setUserAvatar(value)
                .build();
        }

        public int getStartExp() {
            return startExp;
        }

        public boolean hasStartExp() {
            return (__bitField0 & 8) == 8;
        }

        public BoardPlayerLog withStartExp(int value) {
            return BoardPlayerLog.newBuilder()
                .mergeFrom(this)
                .setStartExp(value)
                .build();
        }

        public int getEndExp() {
            return endExp;
        }

        public boolean hasEndExp() {
            return (__bitField0 & 16) == 16;
        }

        public BoardPlayerLog withEndExp(int value) {
            return BoardPlayerLog.newBuilder()
                .mergeFrom(this)
                .setEndExp(value)
                .build();
        }

        public int getMoneyGain() {
            return moneyGain;
        }

        public boolean hasMoneyGain() {
            return (__bitField0 & 32) == 32;
        }

        public BoardPlayerLog withMoneyGain(int value) {
            return BoardPlayerLog.newBuilder()
                .mergeFrom(this)
                .setMoneyGain(value)
                .build();
        }

        public int getEndMoney() {
            return endMoney;
        }

        public boolean hasEndMoney() {
            return (__bitField0 & 64) == 64;
        }

        public BoardPlayerLog withEndMoney(int value) {
            return BoardPlayerLog.newBuilder()
                .mergeFrom(this)
                .setEndMoney(value)
                .build();
        }

        public java.util.List<Integer> getFishIDList() {
            return fishID;
        }

        public int getFishIDCount() {
            return fishID.size();
        }

        public int getFishID(int index) {
            return fishID.get(index);
        }

        public BoardPlayerLog withFishID(java.util.List<Integer> value) {
            return BoardPlayerLog.newBuilder()
                .mergeFrom(this)
                .clearFishID()
                .addAllFishID(value)
                .build();
        }

        public int getExpGain() {
            return expGain;
        }

        public boolean hasExpGain() {
            return (__bitField0 & 256) == 256;
        }

        public BoardPlayerLog withExpGain(int value) {
            return BoardPlayerLog.newBuilder()
                .mergeFrom(this)
                .setExpGain(value)
                .build();
        }

        public boolean getIsFriend() {
            return isFriend;
        }

        public boolean hasIsFriend() {
            return (__bitField0 & 512) == 512;
        }

        public BoardPlayerLog withIsFriend(boolean value) {
            return BoardPlayerLog.newBuilder()
                .mergeFrom(this)
                .setIsFriend(value)
                .build();
        }

        public int getBetScore() {
            return betScore;
        }

        public boolean hasBetScore() {
            return (__bitField0 & 1024) == 1024;
        }

        public BoardPlayerLog withBetScore(int value) {
            return BoardPlayerLog.newBuilder()
                .mergeFrom(this)
                .setBetScore(value)
                .build();
        }

        public int getFreeBestDaily() {
            return freeBestDaily;
        }

        public boolean hasFreeBestDaily() {
            return (__bitField0 & 2048) == 2048;
        }

        public BoardPlayerLog withFreeBestDaily(int value) {
            return BoardPlayerLog.newBuilder()
                .mergeFrom(this)
                .setFreeBestDaily(value)
                .build();
        }

        public int getFreeBestWeekly() {
            return freeBestWeekly;
        }

        public boolean hasFreeBestWeekly() {
            return (__bitField0 & 4096) == 4096;
        }

        public BoardPlayerLog withFreeBestWeekly(int value) {
            return BoardPlayerLog.newBuilder()
                .mergeFrom(this)
                .setFreeBestWeekly(value)
                .build();
        }

        public int getFreeBestScore() {
            return freeBestScore;
        }

        public boolean hasFreeBestScore() {
            return (__bitField0 & 8192) == 8192;
        }

        public BoardPlayerLog withFreeBestScore(int value) {
            return BoardPlayerLog.newBuilder()
                .mergeFrom(this)
                .setFreeBestScore(value)
                .build();
        }

        public int getBetBestDaily() {
            return betBestDaily;
        }

        public boolean hasBetBestDaily() {
            return (__bitField0 & 16384) == 16384;
        }

        public BoardPlayerLog withBetBestDaily(int value) {
            return BoardPlayerLog.newBuilder()
                .mergeFrom(this)
                .setBetBestDaily(value)
                .build();
        }

        public int getBetBestWeekly() {
            return betBestWeekly;
        }

        public boolean hasBetBestWeekly() {
            return (__bitField0 & 32768) == 32768;
        }

        public BoardPlayerLog withBetBestWeekly(int value) {
            return BoardPlayerLog.newBuilder()
                .mergeFrom(this)
                .setBetBestWeekly(value)
                .build();
        }

        public int getBetBestScore() {
            return betBestScore;
        }

        public boolean hasBetBestScore() {
            return (__bitField0 & 65536) == 65536;
        }

        public BoardPlayerLog withBetBestScore(int value) {
            return BoardPlayerLog.newBuilder()
                .mergeFrom(this)
                .setBetBestScore(value)
                .build();
        }

        public String getSnsName() {
            return snsName;
        }

        public boolean hasSnsName() {
            return (__bitField0 & 131072) == 131072;
        }

        public BoardPlayerLog withSnsName(String value) {
            return BoardPlayerLog.newBuilder()
                .mergeFrom(this)
                .setSnsName(value)
                .build();
        }



        @Override
        public io.protostuff.Schema<BoardPlayerLog> cachedSchema() {
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
            BoardPlayerLog that = (BoardPlayerLog) obj;
            if (!java.util.Objects.equals(this.userID, that.userID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.userName, that.userName)) {
                return false;
            }
            if (!java.util.Objects.equals(this.userAvatar, that.userAvatar)) {
                return false;
            }
            if (!java.util.Objects.equals(this.startExp, that.startExp)) {
                return false;
            }
            if (!java.util.Objects.equals(this.endExp, that.endExp)) {
                return false;
            }
            if (!java.util.Objects.equals(this.moneyGain, that.moneyGain)) {
                return false;
            }
            if (!java.util.Objects.equals(this.endMoney, that.endMoney)) {
                return false;
            }
            if (!java.util.Objects.equals(this.fishID, that.fishID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.expGain, that.expGain)) {
                return false;
            }
            if (!java.util.Objects.equals(this.isFriend, that.isFriend)) {
                return false;
            }
            if (!java.util.Objects.equals(this.betScore, that.betScore)) {
                return false;
            }
            if (!java.util.Objects.equals(this.freeBestDaily, that.freeBestDaily)) {
                return false;
            }
            if (!java.util.Objects.equals(this.freeBestWeekly, that.freeBestWeekly)) {
                return false;
            }
            if (!java.util.Objects.equals(this.freeBestScore, that.freeBestScore)) {
                return false;
            }
            if (!java.util.Objects.equals(this.betBestDaily, that.betBestDaily)) {
                return false;
            }
            if (!java.util.Objects.equals(this.betBestWeekly, that.betBestWeekly)) {
                return false;
            }
            if (!java.util.Objects.equals(this.betBestScore, that.betBestScore)) {
                return false;
            }
            if (!java.util.Objects.equals(this.snsName, that.snsName)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
            result = 31 * result + (this.userName == null ? 0 : this.userName.hashCode());
            result = 31 * result + (this.userAvatar == null ? 0 : this.userAvatar.hashCode());
            result = 31 * result + Integer.hashCode(this.startExp);
            result = 31 * result + Integer.hashCode(this.endExp);
            result = 31 * result + Integer.hashCode(this.moneyGain);
            result = 31 * result + Integer.hashCode(this.endMoney);
            result = 31 * result + (this.fishID == null ? 0 : this.fishID.hashCode());
            result = 31 * result + Integer.hashCode(this.expGain);
            result = 31 * result + Boolean.hashCode(this.isFriend);
            result = 31 * result + Integer.hashCode(this.betScore);
            result = 31 * result + Integer.hashCode(this.freeBestDaily);
            result = 31 * result + Integer.hashCode(this.freeBestWeekly);
            result = 31 * result + Integer.hashCode(this.freeBestScore);
            result = 31 * result + Integer.hashCode(this.betBestDaily);
            result = 31 * result + Integer.hashCode(this.betBestWeekly);
            result = 31 * result + Integer.hashCode(this.betBestScore);
            result = 31 * result + (this.snsName == null ? 0 : this.snsName.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasUserID()) {
                parts.add("userID=" + getUserID());
            }
            if (hasUserName()) {
                parts.add("userName=" + getUserName());
            }
            if (hasUserAvatar()) {
                parts.add("userAvatar=" + getUserAvatar());
            }
            if (hasStartExp()) {
                parts.add("startExp=" + getStartExp());
            }
            if (hasEndExp()) {
                parts.add("endExp=" + getEndExp());
            }
            if (hasMoneyGain()) {
                parts.add("moneyGain=" + getMoneyGain());
            }
            if (hasEndMoney()) {
                parts.add("endMoney=" + getEndMoney());
            }
            if (!fishID.isEmpty()) {
                parts.add("fishID=" + getFishIDList());
            }
            if (hasExpGain()) {
                parts.add("expGain=" + getExpGain());
            }
            if (hasIsFriend()) {
                parts.add("isFriend=" + getIsFriend());
            }
            if (hasBetScore()) {
                parts.add("betScore=" + getBetScore());
            }
            if (hasFreeBestDaily()) {
                parts.add("freeBestDaily=" + getFreeBestDaily());
            }
            if (hasFreeBestWeekly()) {
                parts.add("freeBestWeekly=" + getFreeBestWeekly());
            }
            if (hasFreeBestScore()) {
                parts.add("freeBestScore=" + getFreeBestScore());
            }
            if (hasBetBestDaily()) {
                parts.add("betBestDaily=" + getBetBestDaily());
            }
            if (hasBetBestWeekly()) {
                parts.add("betBestWeekly=" + getBetBestWeekly());
            }
            if (hasBetBestScore()) {
                parts.add("betBestScore=" + getBetBestScore());
            }
            if (hasSnsName()) {
                parts.add("snsName=" + getSnsName());
            }
            return "BoardPlayerLog{" + String.join(", ", parts) + "}";
        }

        public static final class Schema implements io.protostuff.Schema<BoardPlayerLog>{

            private static final Schema INSTANCE = new Schema();

            private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

            static {
            	__fieldMap.put("userID", 1);
            	__fieldMap.put("userName", 2);
            	__fieldMap.put("userAvatar", 3);
            	__fieldMap.put("startExp", 4);
            	__fieldMap.put("endExp", 5);
            	__fieldMap.put("moneyGain", 6);
            	__fieldMap.put("endMoney", 7);
            	__fieldMap.put("fishID", 8);
            	__fieldMap.put("expGain", 9);
            	__fieldMap.put("isFriend", 10);
            	__fieldMap.put("betScore", 11);
            	__fieldMap.put("freeBestDaily", 12);
            	__fieldMap.put("freeBestWeekly", 13);
            	__fieldMap.put("freeBestScore", 14);
            	__fieldMap.put("betBestDaily", 15);
            	__fieldMap.put("betBestWeekly", 16);
            	__fieldMap.put("betBestScore", 17);
            	__fieldMap.put("snsName", 18);
            }

            @Override
            public BoardPlayerLog newMessage() {
                return new BoardPlayerLog();
            }

            @Override
            public Class<BoardPlayerLog> typeClass() {
                return BoardPlayerLog.class;
            }

            @Override
            public String messageName() {
                return BoardPlayerLog.class.getSimpleName();
            }

            @Override
            public String messageFullName() {
                return BoardPlayerLog.class.getName();
            }

            @Override
            @Deprecated
            public boolean isInitialized(BoardPlayerLog message) {
                return true;
            }

            @Override
            public void mergeFrom(io.protostuff.Input input, BoardPlayerLog instance) throws java.io.IOException {
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
                        	instance.userName = input.readString();
                        	instance.__bitField0 |= 2;
                        	break;
                        case 3:
                        	instance.userAvatar = input.readString();
                        	instance.__bitField0 |= 4;
                        	break;
                        case 4:
                        	instance.startExp = input.readInt32();
                        	instance.__bitField0 |= 8;
                        	break;
                        case 5:
                        	instance.endExp = input.readInt32();
                        	instance.__bitField0 |= 16;
                        	break;
                        case 6:
                        	instance.moneyGain = input.readInt32();
                        	instance.__bitField0 |= 32;
                        	break;
                        case 7:
                        	instance.endMoney = input.readInt32();
                        	instance.__bitField0 |= 64;
                        	break;
                        case 8:
                        	if(!((instance.__bitField0 & 128) == 128)) {
                        	    instance.fishID = new java.util.ArrayList<>();
                        	    instance.__bitField0 |= 128;
                        	}
                        	instance.fishID.add(input.readInt32());

                        	break;
                        case 9:
                        	instance.expGain = input.readInt32();
                        	instance.__bitField0 |= 256;
                        	break;
                        case 10:
                        	instance.isFriend = input.readBool();
                        	instance.__bitField0 |= 512;
                        	break;
                        case 11:
                        	instance.betScore = input.readInt32();
                        	instance.__bitField0 |= 1024;
                        	break;
                        case 12:
                        	instance.freeBestDaily = input.readInt32();
                        	instance.__bitField0 |= 2048;
                        	break;
                        case 13:
                        	instance.freeBestWeekly = input.readInt32();
                        	instance.__bitField0 |= 4096;
                        	break;
                        case 14:
                        	instance.freeBestScore = input.readInt32();
                        	instance.__bitField0 |= 8192;
                        	break;
                        case 15:
                        	instance.betBestDaily = input.readInt32();
                        	instance.__bitField0 |= 16384;
                        	break;
                        case 16:
                        	instance.betBestWeekly = input.readInt32();
                        	instance.__bitField0 |= 32768;
                        	break;
                        case 17:
                        	instance.betBestScore = input.readInt32();
                        	instance.__bitField0 |= 65536;
                        	break;
                        case 18:
                        	instance.snsName = input.readString();
                        	instance.__bitField0 |= 131072;
                        	break;
                        default:
                            input.handleUnknownField(number, this);
                    }
            	}
                if((instance.__bitField0 & 128) == 128) {
                    instance.fishID = java.util.Collections.unmodifiableList(instance.fishID);
                }











            }

            @Override
            public void writeTo(io.protostuff.Output output, BoardPlayerLog instance) throws java.io.IOException {
                if((instance.__bitField0 & 1) == 1) {
                    output.writeString(1, instance.userID, false);
                }

                if((instance.__bitField0 & 2) == 2) {
                    output.writeString(2, instance.userName, false);
                }

                if((instance.__bitField0 & 4) == 4) {
                    output.writeString(3, instance.userAvatar, false);
                }

                if((instance.__bitField0 & 8) == 8) {
                    output.writeInt32(4, instance.startExp, false);
                }

                if((instance.__bitField0 & 16) == 16) {
                    output.writeInt32(5, instance.endExp, false);
                }

                if((instance.__bitField0 & 32) == 32) {
                    output.writeInt32(6, instance.moneyGain, false);
                }

                if((instance.__bitField0 & 64) == 64) {
                    output.writeInt32(7, instance.endMoney, false);
                }

                for(int fishID : instance.fishID) {
                    output.writeInt32(8, fishID, true);
                }

                if((instance.__bitField0 & 256) == 256) {
                    output.writeInt32(9, instance.expGain, false);
                }

                if((instance.__bitField0 & 512) == 512) {
                    output.writeBool(10, instance.isFriend, false);
                }

                if((instance.__bitField0 & 1024) == 1024) {
                    output.writeInt32(11, instance.betScore, false);
                }

                if((instance.__bitField0 & 2048) == 2048) {
                    output.writeInt32(12, instance.freeBestDaily, false);
                }

                if((instance.__bitField0 & 4096) == 4096) {
                    output.writeInt32(13, instance.freeBestWeekly, false);
                }

                if((instance.__bitField0 & 8192) == 8192) {
                    output.writeInt32(14, instance.freeBestScore, false);
                }

                if((instance.__bitField0 & 16384) == 16384) {
                    output.writeInt32(15, instance.betBestDaily, false);
                }

                if((instance.__bitField0 & 32768) == 32768) {
                    output.writeInt32(16, instance.betBestWeekly, false);
                }

                if((instance.__bitField0 & 65536) == 65536) {
                    output.writeInt32(17, instance.betBestScore, false);
                }

                if((instance.__bitField0 & 131072) == 131072) {
                    output.writeString(18, instance.snsName, false);
                }

            }

            @Override
            public String getFieldName(int number) {
            	switch(number) {
            		case 1: return "userID";
            		case 2: return "userName";
            		case 3: return "userAvatar";
            		case 4: return "startExp";
            		case 5: return "endExp";
            		case 6: return "moneyGain";
            		case 7: return "endMoney";
            		case 8: return "fishID";
            		case 9: return "expGain";
            		case 10: return "isFriend";
            		case 11: return "betScore";
            		case 12: return "freeBestDaily";
            		case 13: return "freeBestWeekly";
            		case 14: return "freeBestScore";
            		case 15: return "betBestDaily";
            		case 16: return "betBestWeekly";
            		case 17: return "betBestScore";
            		case 18: return "snsName";
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

            private String userName;

            private String userAvatar;

            private int startExp;

            private int endExp;

            private int moneyGain;

            private int endMoney;

            private java.util.List<Integer> fishID;

            private int expGain;

            private boolean isFriend;

            private int betScore;

            private int freeBestDaily;

            private int freeBestWeekly;

            private int freeBestScore;

            private int betBestDaily;

            private int betBestWeekly;

            private int betBestScore;

            private String snsName;

            private int __bitField0;

            private Builder() {
                this.userID = "";
                this.userName = "";
                this.userAvatar = "";
                this.startExp = 0;
                this.endExp = 0;
                this.moneyGain = 0;
                this.endMoney = 0;
                this.fishID = java.util.Collections.emptyList();
                this.expGain = 0;
                this.isFriend = false;
                this.betScore = 0;
                this.freeBestDaily = 0;
                this.freeBestWeekly = 0;
                this.freeBestScore = 0;
                this.betBestDaily = 0;
                this.betBestWeekly = 0;
                this.betBestScore = 0;
                this.snsName = "";
            }

            public Builder mergeFrom(BoardPlayerLog instance) {
                if (instance.hasUserID()) {
                    this.setUserID(instance.getUserID());
                }

                if (instance.hasUserName()) {
                    this.setUserName(instance.getUserName());
                }

                if (instance.hasUserAvatar()) {
                    this.setUserAvatar(instance.getUserAvatar());
                }

                if (instance.hasStartExp()) {
                    this.setStartExp(instance.getStartExp());
                }

                if (instance.hasEndExp()) {
                    this.setEndExp(instance.getEndExp());
                }

                if (instance.hasMoneyGain()) {
                    this.setMoneyGain(instance.getMoneyGain());
                }

                if (instance.hasEndMoney()) {
                    this.setEndMoney(instance.getEndMoney());
                }

                this.addAllFishID(instance.getFishIDList());

                if (instance.hasExpGain()) {
                    this.setExpGain(instance.getExpGain());
                }

                if (instance.hasIsFriend()) {
                    this.setIsFriend(instance.getIsFriend());
                }

                if (instance.hasBetScore()) {
                    this.setBetScore(instance.getBetScore());
                }

                if (instance.hasFreeBestDaily()) {
                    this.setFreeBestDaily(instance.getFreeBestDaily());
                }

                if (instance.hasFreeBestWeekly()) {
                    this.setFreeBestWeekly(instance.getFreeBestWeekly());
                }

                if (instance.hasFreeBestScore()) {
                    this.setFreeBestScore(instance.getFreeBestScore());
                }

                if (instance.hasBetBestDaily()) {
                    this.setBetBestDaily(instance.getBetBestDaily());
                }

                if (instance.hasBetBestWeekly()) {
                    this.setBetBestWeekly(instance.getBetBestWeekly());
                }

                if (instance.hasBetBestScore()) {
                    this.setBetBestScore(instance.getBetBestScore());
                }

                if (instance.hasSnsName()) {
                    this.setSnsName(instance.getSnsName());
                }

                return this;
            }

            public String getUserID() {
                return userID;
            }

            public Builder setUserID(String value) {
                if (value == null) {
                    throw new NullPointerException("Cannot set BoardPlayerLog#userID to null");
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

            public String getUserName() {
                return userName;
            }

            public Builder setUserName(String value) {
                if (value == null) {
                    throw new NullPointerException("Cannot set BoardPlayerLog#userName to null");
                }

                this.userName = value;
                __bitField0 |= 2;
                return this;
            }

            public Builder clearUserName() {
                this.userName = "";
                __bitField0 &= ~2;
                return this;
            }

            public boolean hasUserName() {
                return (__bitField0 & 2) == 2;
            }

            public String getUserAvatar() {
                return userAvatar;
            }

            public Builder setUserAvatar(String value) {
                if (value == null) {
                    throw new NullPointerException("Cannot set BoardPlayerLog#userAvatar to null");
                }

                this.userAvatar = value;
                __bitField0 |= 4;
                return this;
            }

            public Builder clearUserAvatar() {
                this.userAvatar = "";
                __bitField0 &= ~4;
                return this;
            }

            public boolean hasUserAvatar() {
                return (__bitField0 & 4) == 4;
            }

            public int getStartExp() {
                return startExp;
            }

            public Builder setStartExp(int value) {
                this.startExp = value;
                __bitField0 |= 8;
                return this;
            }

            public Builder clearStartExp() {
                this.startExp = 0;
                __bitField0 &= ~8;
                return this;
            }

            public boolean hasStartExp() {
                return (__bitField0 & 8) == 8;
            }

            public int getEndExp() {
                return endExp;
            }

            public Builder setEndExp(int value) {
                this.endExp = value;
                __bitField0 |= 16;
                return this;
            }

            public Builder clearEndExp() {
                this.endExp = 0;
                __bitField0 &= ~16;
                return this;
            }

            public boolean hasEndExp() {
                return (__bitField0 & 16) == 16;
            }

            public int getMoneyGain() {
                return moneyGain;
            }

            public Builder setMoneyGain(int value) {
                this.moneyGain = value;
                __bitField0 |= 32;
                return this;
            }

            public Builder clearMoneyGain() {
                this.moneyGain = 0;
                __bitField0 &= ~32;
                return this;
            }

            public boolean hasMoneyGain() {
                return (__bitField0 & 32) == 32;
            }

            public int getEndMoney() {
                return endMoney;
            }

            public Builder setEndMoney(int value) {
                this.endMoney = value;
                __bitField0 |= 64;
                return this;
            }

            public Builder clearEndMoney() {
                this.endMoney = 0;
                __bitField0 &= ~64;
                return this;
            }

            public boolean hasEndMoney() {
                return (__bitField0 & 64) == 64;
            }

            public java.util.List<Integer> getFishIDList() {
                return fishID;
            }

            public Builder setFishID(int index, int value) {
                if(!((__bitField0 & 128) == 128)) {
                    this.fishID = new java.util.ArrayList<>();
                    __bitField0 |= 128;
                }
                this.fishID.set(index, value);
                return this;
            }

            public Builder addFishID(int value) {
                if(!((__bitField0 & 128) == 128)) {
                    this.fishID = new java.util.ArrayList<>();
                    __bitField0 |= 128;
                }
                this.fishID.add(value);
                return this;
            }

            public Builder addAllFishID(java.lang.Iterable<Integer> values) {
                if (values == null) {
                    throw new NullPointerException("Cannot set BoardPlayerLog#fishID to null");
                }
                if(!((__bitField0 & 128) == 128)) {
                    this.fishID = new java.util.ArrayList<>();
                    __bitField0 |= 128;
                }
                for (final Integer value : values) {
                    if (value == null) {
                       throw new NullPointerException("Cannot set BoardPlayerLog#fishID to null");
                    }
                    this.fishID.add(value);
                }
                return this;
            }

            public Builder clearFishID() {
                this.fishID = java.util.Collections.emptyList();
                __bitField0 &= ~128;
                return this;
            }

            public int getFishIDCount() {
                return fishID.size();
            }

            public int getFishID(int index) {
                return fishID.get(index);
            }

            public int getExpGain() {
                return expGain;
            }

            public Builder setExpGain(int value) {
                this.expGain = value;
                __bitField0 |= 256;
                return this;
            }

            public Builder clearExpGain() {
                this.expGain = 0;
                __bitField0 &= ~256;
                return this;
            }

            public boolean hasExpGain() {
                return (__bitField0 & 256) == 256;
            }

            public boolean getIsFriend() {
                return isFriend;
            }

            public Builder setIsFriend(boolean value) {
                this.isFriend = value;
                __bitField0 |= 512;
                return this;
            }

            public Builder clearIsFriend() {
                this.isFriend = false;
                __bitField0 &= ~512;
                return this;
            }

            public boolean hasIsFriend() {
                return (__bitField0 & 512) == 512;
            }

            public int getBetScore() {
                return betScore;
            }

            public Builder setBetScore(int value) {
                this.betScore = value;
                __bitField0 |= 1024;
                return this;
            }

            public Builder clearBetScore() {
                this.betScore = 0;
                __bitField0 &= ~1024;
                return this;
            }

            public boolean hasBetScore() {
                return (__bitField0 & 1024) == 1024;
            }

            public int getFreeBestDaily() {
                return freeBestDaily;
            }

            public Builder setFreeBestDaily(int value) {
                this.freeBestDaily = value;
                __bitField0 |= 2048;
                return this;
            }

            public Builder clearFreeBestDaily() {
                this.freeBestDaily = 0;
                __bitField0 &= ~2048;
                return this;
            }

            public boolean hasFreeBestDaily() {
                return (__bitField0 & 2048) == 2048;
            }

            public int getFreeBestWeekly() {
                return freeBestWeekly;
            }

            public Builder setFreeBestWeekly(int value) {
                this.freeBestWeekly = value;
                __bitField0 |= 4096;
                return this;
            }

            public Builder clearFreeBestWeekly() {
                this.freeBestWeekly = 0;
                __bitField0 &= ~4096;
                return this;
            }

            public boolean hasFreeBestWeekly() {
                return (__bitField0 & 4096) == 4096;
            }

            public int getFreeBestScore() {
                return freeBestScore;
            }

            public Builder setFreeBestScore(int value) {
                this.freeBestScore = value;
                __bitField0 |= 8192;
                return this;
            }

            public Builder clearFreeBestScore() {
                this.freeBestScore = 0;
                __bitField0 &= ~8192;
                return this;
            }

            public boolean hasFreeBestScore() {
                return (__bitField0 & 8192) == 8192;
            }

            public int getBetBestDaily() {
                return betBestDaily;
            }

            public Builder setBetBestDaily(int value) {
                this.betBestDaily = value;
                __bitField0 |= 16384;
                return this;
            }

            public Builder clearBetBestDaily() {
                this.betBestDaily = 0;
                __bitField0 &= ~16384;
                return this;
            }

            public boolean hasBetBestDaily() {
                return (__bitField0 & 16384) == 16384;
            }

            public int getBetBestWeekly() {
                return betBestWeekly;
            }

            public Builder setBetBestWeekly(int value) {
                this.betBestWeekly = value;
                __bitField0 |= 32768;
                return this;
            }

            public Builder clearBetBestWeekly() {
                this.betBestWeekly = 0;
                __bitField0 &= ~32768;
                return this;
            }

            public boolean hasBetBestWeekly() {
                return (__bitField0 & 32768) == 32768;
            }

            public int getBetBestScore() {
                return betBestScore;
            }

            public Builder setBetBestScore(int value) {
                this.betBestScore = value;
                __bitField0 |= 65536;
                return this;
            }

            public Builder clearBetBestScore() {
                this.betBestScore = 0;
                __bitField0 &= ~65536;
                return this;
            }

            public boolean hasBetBestScore() {
                return (__bitField0 & 65536) == 65536;
            }

            public String getSnsName() {
                return snsName;
            }

            public Builder setSnsName(String value) {
                if (value == null) {
                    throw new NullPointerException("Cannot set BoardPlayerLog#snsName to null");
                }

                this.snsName = value;
                __bitField0 |= 131072;
                return this;
            }

            public Builder clearSnsName() {
                this.snsName = "";
                __bitField0 &= ~131072;
                return this;
            }

            public boolean hasSnsName() {
                return (__bitField0 & 131072) == 131072;
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
                if (!java.util.Objects.equals(this.userName, that.userName)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.userAvatar, that.userAvatar)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.startExp, that.startExp)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.endExp, that.endExp)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.moneyGain, that.moneyGain)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.endMoney, that.endMoney)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.fishID, that.fishID)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.expGain, that.expGain)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.isFriend, that.isFriend)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.betScore, that.betScore)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.freeBestDaily, that.freeBestDaily)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.freeBestWeekly, that.freeBestWeekly)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.freeBestScore, that.freeBestScore)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.betBestDaily, that.betBestDaily)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.betBestWeekly, that.betBestWeekly)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.betBestScore, that.betBestScore)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.snsName, that.snsName)) {
                    return false;
                }

                return true;
            }

            @Override
            public int hashCode() {
                int result = 1;
                result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
                result = 31 * result + (this.userName == null ? 0 : this.userName.hashCode());
                result = 31 * result + (this.userAvatar == null ? 0 : this.userAvatar.hashCode());
                result = 31 * result + Integer.hashCode(this.startExp);
                result = 31 * result + Integer.hashCode(this.endExp);
                result = 31 * result + Integer.hashCode(this.moneyGain);
                result = 31 * result + Integer.hashCode(this.endMoney);
                result = 31 * result + (this.fishID == null ? 0 : this.fishID.hashCode());
                result = 31 * result + Integer.hashCode(this.expGain);
                result = 31 * result + Boolean.hashCode(this.isFriend);
                result = 31 * result + Integer.hashCode(this.betScore);
                result = 31 * result + Integer.hashCode(this.freeBestDaily);
                result = 31 * result + Integer.hashCode(this.freeBestWeekly);
                result = 31 * result + Integer.hashCode(this.freeBestScore);
                result = 31 * result + Integer.hashCode(this.betBestDaily);
                result = 31 * result + Integer.hashCode(this.betBestWeekly);
                result = 31 * result + Integer.hashCode(this.betBestScore);
                result = 31 * result + (this.snsName == null ? 0 : this.snsName.hashCode());

                return result;
            }

            @Override
            public String toString() {
                java.util.List<String> parts = new java.util.ArrayList<>();
                if (hasUserID()) {
                    parts.add("userID=" + getUserID());
                }
                if (hasUserName()) {
                    parts.add("userName=" + getUserName());
                }
                if (hasUserAvatar()) {
                    parts.add("userAvatar=" + getUserAvatar());
                }
                if (hasStartExp()) {
                    parts.add("startExp=" + getStartExp());
                }
                if (hasEndExp()) {
                    parts.add("endExp=" + getEndExp());
                }
                if (hasMoneyGain()) {
                    parts.add("moneyGain=" + getMoneyGain());
                }
                if (hasEndMoney()) {
                    parts.add("endMoney=" + getEndMoney());
                }
                if (!fishID.isEmpty()) {
                    parts.add("fishID=" + getFishIDList());
                }
                if (hasExpGain()) {
                    parts.add("expGain=" + getExpGain());
                }
                if (hasIsFriend()) {
                    parts.add("isFriend=" + getIsFriend());
                }
                if (hasBetScore()) {
                    parts.add("betScore=" + getBetScore());
                }
                if (hasFreeBestDaily()) {
                    parts.add("freeBestDaily=" + getFreeBestDaily());
                }
                if (hasFreeBestWeekly()) {
                    parts.add("freeBestWeekly=" + getFreeBestWeekly());
                }
                if (hasFreeBestScore()) {
                    parts.add("freeBestScore=" + getFreeBestScore());
                }
                if (hasBetBestDaily()) {
                    parts.add("betBestDaily=" + getBetBestDaily());
                }
                if (hasBetBestWeekly()) {
                    parts.add("betBestWeekly=" + getBetBestWeekly());
                }
                if (hasBetBestScore()) {
                    parts.add("betBestScore=" + getBetBestScore());
                }
                if (hasSnsName()) {
                    parts.add("snsName=" + getSnsName());
                }
                return "BoardPlayerLog{" + String.join(", ", parts) + "}";
            }

            public BoardPlayerLog build() {
                proto.message.FinishGameResponse.BoardPlayerLog result = new proto.message.FinishGameResponse.BoardPlayerLog();
                result.__bitField0 = __bitField0;
                result.userID = this.userID;
                result.userName = this.userName;
                result.userAvatar = this.userAvatar;
                result.startExp = this.startExp;
                result.endExp = this.endExp;
                result.moneyGain = this.moneyGain;
                result.endMoney = this.endMoney;
                result.fishID = java.util.Collections.unmodifiableList(this.fishID);
                result.expGain = this.expGain;
                result.isFriend = this.isFriend;
                result.betScore = this.betScore;
                result.freeBestDaily = this.freeBestDaily;
                result.freeBestWeekly = this.freeBestWeekly;
                result.freeBestScore = this.freeBestScore;
                result.betBestDaily = this.betBestDaily;
                result.betBestWeekly = this.betBestWeekly;
                result.betBestScore = this.betBestScore;
                result.snsName = this.snsName;
                return result;
            }

        }



    }


}