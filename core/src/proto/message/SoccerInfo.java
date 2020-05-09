package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class SoccerInfo
        implements io.protostuff.Message<SoccerInfo> {

    private static final SoccerInfo DEFAULT_INSTANCE = newBuilder().build();

    private int id;

    private int time;

    private int teamId1;

    private int teamId2;

    private proto.message.SoccerPrediction byScore;

    private proto.message.SoccerPrediction byWinLose;

    private proto.message.SoccerPrediction byTotalScore;

    private int finalScore1;

    private int finalScore2;

    private int finalRate;

    private int goldBet;

    private int goldWin;

    private int betId;

    private boolean isRev;

    private int status;

    private boolean __merge_lock = false;
    private int __bitField0;

    private SoccerInfo() {
        this.id = 0;
        this.time = 0;
        this.teamId1 = 0;
        this.teamId2 = 0;
        this.byScore = proto.message.SoccerPrediction.getDefaultInstance();
        this.byWinLose = proto.message.SoccerPrediction.getDefaultInstance();
        this.byTotalScore = proto.message.SoccerPrediction.getDefaultInstance();
        this.finalScore1 = 0;
        this.finalScore2 = 0;
        this.finalRate = 0;
        this.goldBet = 0;
        this.goldWin = 0;
        this.betId = 0;
        this.isRev = false;
        this.status = proto.message.SoccerStatus.STATUS_LIVE.getNumber();
    }

    private SoccerInfo(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static SoccerInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<SoccerInfo> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 1) == 1;
    }

    public SoccerInfo withId(int value) {
        return SoccerInfo.newBuilder()
            .mergeFrom(this)
            .setId(value)
            .build();
    }

    public int getTime() {
        return time;
    }

    public boolean hasTime() {
        return (__bitField0 & 2) == 2;
    }

    public SoccerInfo withTime(int value) {
        return SoccerInfo.newBuilder()
            .mergeFrom(this)
            .setTime(value)
            .build();
    }

    public int getTeamId1() {
        return teamId1;
    }

    public boolean hasTeamId1() {
        return (__bitField0 & 4) == 4;
    }

    public SoccerInfo withTeamId1(int value) {
        return SoccerInfo.newBuilder()
            .mergeFrom(this)
            .setTeamId1(value)
            .build();
    }

    public int getTeamId2() {
        return teamId2;
    }

    public boolean hasTeamId2() {
        return (__bitField0 & 8) == 8;
    }

    public SoccerInfo withTeamId2(int value) {
        return SoccerInfo.newBuilder()
            .mergeFrom(this)
            .setTeamId2(value)
            .build();
    }

    public proto.message.SoccerPrediction getByScore() {
        return byScore;
    }

    public boolean hasByScore() {
        return (__bitField0 & 16) == 16;
    }

    public SoccerInfo withByScore(proto.message.SoccerPrediction value) {
        return SoccerInfo.newBuilder()
            .mergeFrom(this)
            .setByScore(value)
            .build();
    }

    public proto.message.SoccerPrediction getByWinLose() {
        return byWinLose;
    }

    public boolean hasByWinLose() {
        return (__bitField0 & 32) == 32;
    }

    public SoccerInfo withByWinLose(proto.message.SoccerPrediction value) {
        return SoccerInfo.newBuilder()
            .mergeFrom(this)
            .setByWinLose(value)
            .build();
    }

    public proto.message.SoccerPrediction getByTotalScore() {
        return byTotalScore;
    }

    public boolean hasByTotalScore() {
        return (__bitField0 & 64) == 64;
    }

    public SoccerInfo withByTotalScore(proto.message.SoccerPrediction value) {
        return SoccerInfo.newBuilder()
            .mergeFrom(this)
            .setByTotalScore(value)
            .build();
    }

    public int getFinalScore1() {
        return finalScore1;
    }

    public boolean hasFinalScore1() {
        return (__bitField0 & 128) == 128;
    }

    public SoccerInfo withFinalScore1(int value) {
        return SoccerInfo.newBuilder()
            .mergeFrom(this)
            .setFinalScore1(value)
            .build();
    }

    public int getFinalScore2() {
        return finalScore2;
    }

    public boolean hasFinalScore2() {
        return (__bitField0 & 256) == 256;
    }

    public SoccerInfo withFinalScore2(int value) {
        return SoccerInfo.newBuilder()
            .mergeFrom(this)
            .setFinalScore2(value)
            .build();
    }

    public int getFinalRate() {
        return finalRate;
    }

    public boolean hasFinalRate() {
        return (__bitField0 & 512) == 512;
    }

    public SoccerInfo withFinalRate(int value) {
        return SoccerInfo.newBuilder()
            .mergeFrom(this)
            .setFinalRate(value)
            .build();
    }

    public int getGoldBet() {
        return goldBet;
    }

    public boolean hasGoldBet() {
        return (__bitField0 & 1024) == 1024;
    }

    public SoccerInfo withGoldBet(int value) {
        return SoccerInfo.newBuilder()
            .mergeFrom(this)
            .setGoldBet(value)
            .build();
    }

    public int getGoldWin() {
        return goldWin;
    }

    public boolean hasGoldWin() {
        return (__bitField0 & 2048) == 2048;
    }

    public SoccerInfo withGoldWin(int value) {
        return SoccerInfo.newBuilder()
            .mergeFrom(this)
            .setGoldWin(value)
            .build();
    }

    public int getBetId() {
        return betId;
    }

    public boolean hasBetId() {
        return (__bitField0 & 4096) == 4096;
    }

    public SoccerInfo withBetId(int value) {
        return SoccerInfo.newBuilder()
            .mergeFrom(this)
            .setBetId(value)
            .build();
    }

    public boolean getIsRev() {
        return isRev;
    }

    public boolean hasIsRev() {
        return (__bitField0 & 8192) == 8192;
    }

    public SoccerInfo withIsRev(boolean value) {
        return SoccerInfo.newBuilder()
            .mergeFrom(this)
            .setIsRev(value)
            .build();
    }

    public proto.message.SoccerStatus getStatus() {
        return proto.message.SoccerStatus.valueOf(status);
    }

    public int getStatusValue() {
        return status;
    }

    public boolean hasStatus() {
        return (__bitField0 & 16384) == 16384;
    }

    public SoccerInfo withStatus(proto.message.SoccerStatus value) {
        return SoccerInfo.newBuilder()
            .mergeFrom(this)
            .setStatus(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<SoccerInfo> cachedSchema() {
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
        SoccerInfo that = (SoccerInfo) obj;
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.time, that.time)) {
            return false;
        }
        if (!java.util.Objects.equals(this.teamId1, that.teamId1)) {
            return false;
        }
        if (!java.util.Objects.equals(this.teamId2, that.teamId2)) {
            return false;
        }
        if (!java.util.Objects.equals(this.byScore, that.byScore)) {
            return false;
        }
        if (!java.util.Objects.equals(this.byWinLose, that.byWinLose)) {
            return false;
        }
        if (!java.util.Objects.equals(this.byTotalScore, that.byTotalScore)) {
            return false;
        }
        if (!java.util.Objects.equals(this.finalScore1, that.finalScore1)) {
            return false;
        }
        if (!java.util.Objects.equals(this.finalScore2, that.finalScore2)) {
            return false;
        }
        if (!java.util.Objects.equals(this.finalRate, that.finalRate)) {
            return false;
        }
        if (!java.util.Objects.equals(this.goldBet, that.goldBet)) {
            return false;
        }
        if (!java.util.Objects.equals(this.goldWin, that.goldWin)) {
            return false;
        }
        if (!java.util.Objects.equals(this.betId, that.betId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.isRev, that.isRev)) {
            return false;
        }
        if (!java.util.Objects.equals(this.status, that.status)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.id);
        result = 31 * result + Integer.hashCode(this.time);
        result = 31 * result + Integer.hashCode(this.teamId1);
        result = 31 * result + Integer.hashCode(this.teamId2);
        result = 31 * result + (this.byScore == null ? 0 : this.byScore.hashCode());
        result = 31 * result + (this.byWinLose == null ? 0 : this.byWinLose.hashCode());
        result = 31 * result + (this.byTotalScore == null ? 0 : this.byTotalScore.hashCode());
        result = 31 * result + Integer.hashCode(this.finalScore1);
        result = 31 * result + Integer.hashCode(this.finalScore2);
        result = 31 * result + Integer.hashCode(this.finalRate);
        result = 31 * result + Integer.hashCode(this.goldBet);
        result = 31 * result + Integer.hashCode(this.goldWin);
        result = 31 * result + Integer.hashCode(this.betId);
        result = 31 * result + Boolean.hashCode(this.isRev);
        result = 31 * result + Integer.hashCode(this.status);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasId()) {
            parts.add("id=" + getId());
        }
        if (hasTime()) {
            parts.add("time=" + getTime());
        }
        if (hasTeamId1()) {
            parts.add("teamId1=" + getTeamId1());
        }
        if (hasTeamId2()) {
            parts.add("teamId2=" + getTeamId2());
        }
        if (hasByScore()) {
            parts.add("byScore=" + getByScore());
        }
        if (hasByWinLose()) {
            parts.add("byWinLose=" + getByWinLose());
        }
        if (hasByTotalScore()) {
            parts.add("byTotalScore=" + getByTotalScore());
        }
        if (hasFinalScore1()) {
            parts.add("finalScore1=" + getFinalScore1());
        }
        if (hasFinalScore2()) {
            parts.add("finalScore2=" + getFinalScore2());
        }
        if (hasFinalRate()) {
            parts.add("finalRate=" + getFinalRate());
        }
        if (hasGoldBet()) {
            parts.add("goldBet=" + getGoldBet());
        }
        if (hasGoldWin()) {
            parts.add("goldWin=" + getGoldWin());
        }
        if (hasBetId()) {
            parts.add("betId=" + getBetId());
        }
        if (hasIsRev()) {
            parts.add("isRev=" + getIsRev());
        }
        if (hasStatus()) {
            parts.add("status=" + getStatus() + '(' + getStatusValue() + ')');
        }
        return "SoccerInfo{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<SoccerInfo>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("id", 1);
        	__fieldMap.put("time", 2);
        	__fieldMap.put("teamId1", 3);
        	__fieldMap.put("teamId2", 4);
        	__fieldMap.put("byScore", 5);
        	__fieldMap.put("byWinLose", 6);
        	__fieldMap.put("byTotalScore", 7);
        	__fieldMap.put("finalScore1", 8);
        	__fieldMap.put("finalScore2", 9);
        	__fieldMap.put("finalRate", 10);
        	__fieldMap.put("goldBet", 11);
        	__fieldMap.put("goldWin", 12);
        	__fieldMap.put("betId", 13);
        	__fieldMap.put("isRev", 14);
        	__fieldMap.put("status", 15);
        }

        @Override
        public SoccerInfo newMessage() {
            return new SoccerInfo();
        }

        @Override
        public Class<SoccerInfo> typeClass() {
            return SoccerInfo.class;
        }

        @Override
        public String messageName() {
            return SoccerInfo.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return SoccerInfo.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(SoccerInfo message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, SoccerInfo instance) throws java.io.IOException {
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
                    	instance.id = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.time = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.teamId1 = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.teamId2 = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.byScore = input.mergeObject(null, proto.message.SoccerPrediction.getSchema());
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.byWinLose = input.mergeObject(null, proto.message.SoccerPrediction.getSchema());
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.byTotalScore = input.mergeObject(null, proto.message.SoccerPrediction.getSchema());
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.finalScore1 = input.readInt32();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 9:
                    	instance.finalScore2 = input.readInt32();
                    	instance.__bitField0 |= 256;
                    	break;
                    case 10:
                    	instance.finalRate = input.readInt32();
                    	instance.__bitField0 |= 512;
                    	break;
                    case 11:
                    	instance.goldBet = input.readInt32();
                    	instance.__bitField0 |= 1024;
                    	break;
                    case 12:
                    	instance.goldWin = input.readInt32();
                    	instance.__bitField0 |= 2048;
                    	break;
                    case 13:
                    	instance.betId = input.readInt32();
                    	instance.__bitField0 |= 4096;
                    	break;
                    case 14:
                    	instance.isRev = input.readBool();
                    	instance.__bitField0 |= 8192;
                    	break;
                    case 15:
                    	instance.status = input.readEnum();
                    	instance.__bitField0 |= 16384;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, SoccerInfo instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.id, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.time, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.teamId1, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.teamId2, false);
            }

            if((instance.__bitField0 & 16) == 16) {
            	output.writeObject(5, instance.byScore, proto.message.SoccerPrediction.getSchema(), false);
            }

            if((instance.__bitField0 & 32) == 32) {
            	output.writeObject(6, instance.byWinLose, proto.message.SoccerPrediction.getSchema(), false);
            }

            if((instance.__bitField0 & 64) == 64) {
            	output.writeObject(7, instance.byTotalScore, proto.message.SoccerPrediction.getSchema(), false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeInt32(8, instance.finalScore1, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeInt32(9, instance.finalScore2, false);
            }

            if((instance.__bitField0 & 512) == 512) {
                output.writeInt32(10, instance.finalRate, false);
            }

            if((instance.__bitField0 & 1024) == 1024) {
                output.writeInt32(11, instance.goldBet, false);
            }

            if((instance.__bitField0 & 2048) == 2048) {
                output.writeInt32(12, instance.goldWin, false);
            }

            if((instance.__bitField0 & 4096) == 4096) {
                output.writeInt32(13, instance.betId, false);
            }

            if((instance.__bitField0 & 8192) == 8192) {
                output.writeBool(14, instance.isRev, false);
            }

            if((instance.__bitField0 & 16384) == 16384) {
            	output.writeEnum(15, instance.status, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "id";
        		case 2: return "time";
        		case 3: return "teamId1";
        		case 4: return "teamId2";
        		case 5: return "byScore";
        		case 6: return "byWinLose";
        		case 7: return "byTotalScore";
        		case 8: return "finalScore1";
        		case 9: return "finalScore2";
        		case 10: return "finalRate";
        		case 11: return "goldBet";
        		case 12: return "goldWin";
        		case 13: return "betId";
        		case 14: return "isRev";
        		case 15: return "status";
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

        private int id;

        private int time;

        private int teamId1;

        private int teamId2;

        private proto.message.SoccerPrediction byScore;

        private proto.message.SoccerPrediction byWinLose;

        private proto.message.SoccerPrediction byTotalScore;

        private int finalScore1;

        private int finalScore2;

        private int finalRate;

        private int goldBet;

        private int goldWin;

        private int betId;

        private boolean isRev;

        private int status;

        private int __bitField0;

        private Builder() {
            this.id = 0;
            this.time = 0;
            this.teamId1 = 0;
            this.teamId2 = 0;
            this.byScore = proto.message.SoccerPrediction.getDefaultInstance();
            this.byWinLose = proto.message.SoccerPrediction.getDefaultInstance();
            this.byTotalScore = proto.message.SoccerPrediction.getDefaultInstance();
            this.finalScore1 = 0;
            this.finalScore2 = 0;
            this.finalRate = 0;
            this.goldBet = 0;
            this.goldWin = 0;
            this.betId = 0;
            this.isRev = false;
            this.status = proto.message.SoccerStatus.STATUS_LIVE.getNumber();
        }

        public Builder mergeFrom(SoccerInfo instance) {
            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            if (instance.hasTime()) {
                this.setTime(instance.getTime());
            }

            if (instance.hasTeamId1()) {
                this.setTeamId1(instance.getTeamId1());
            }

            if (instance.hasTeamId2()) {
                this.setTeamId2(instance.getTeamId2());
            }

            if (instance.hasByScore()) {
                this.setByScore(instance.getByScore());
            }

            if (instance.hasByWinLose()) {
                this.setByWinLose(instance.getByWinLose());
            }

            if (instance.hasByTotalScore()) {
                this.setByTotalScore(instance.getByTotalScore());
            }

            if (instance.hasFinalScore1()) {
                this.setFinalScore1(instance.getFinalScore1());
            }

            if (instance.hasFinalScore2()) {
                this.setFinalScore2(instance.getFinalScore2());
            }

            if (instance.hasFinalRate()) {
                this.setFinalRate(instance.getFinalRate());
            }

            if (instance.hasGoldBet()) {
                this.setGoldBet(instance.getGoldBet());
            }

            if (instance.hasGoldWin()) {
                this.setGoldWin(instance.getGoldWin());
            }

            if (instance.hasBetId()) {
                this.setBetId(instance.getBetId());
            }

            if (instance.hasIsRev()) {
                this.setIsRev(instance.getIsRev());
            }

            if (instance.hasStatus()) {
                this.setStatus(instance.getStatus());
            }

            return this;
        }

        public int getId() {
            return id;
        }

        public Builder setId(int value) {
            this.id = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearId() {
            this.id = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasId() {
            return (__bitField0 & 1) == 1;
        }

        public int getTime() {
            return time;
        }

        public Builder setTime(int value) {
            this.time = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearTime() {
            this.time = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasTime() {
            return (__bitField0 & 2) == 2;
        }

        public int getTeamId1() {
            return teamId1;
        }

        public Builder setTeamId1(int value) {
            this.teamId1 = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearTeamId1() {
            this.teamId1 = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasTeamId1() {
            return (__bitField0 & 4) == 4;
        }

        public int getTeamId2() {
            return teamId2;
        }

        public Builder setTeamId2(int value) {
            this.teamId2 = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearTeamId2() {
            this.teamId2 = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasTeamId2() {
            return (__bitField0 & 8) == 8;
        }

        public proto.message.SoccerPrediction getByScore() {
            return byScore;
        }

        public Builder setByScore(proto.message.SoccerPrediction value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SoccerInfo#byScore to null");
            }

            this.byScore = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearByScore() {
            this.byScore = proto.message.SoccerPrediction.getDefaultInstance();
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasByScore() {
            return (__bitField0 & 16) == 16;
        }

        public proto.message.SoccerPrediction getByWinLose() {
            return byWinLose;
        }

        public Builder setByWinLose(proto.message.SoccerPrediction value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SoccerInfo#byWinLose to null");
            }

            this.byWinLose = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearByWinLose() {
            this.byWinLose = proto.message.SoccerPrediction.getDefaultInstance();
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasByWinLose() {
            return (__bitField0 & 32) == 32;
        }

        public proto.message.SoccerPrediction getByTotalScore() {
            return byTotalScore;
        }

        public Builder setByTotalScore(proto.message.SoccerPrediction value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SoccerInfo#byTotalScore to null");
            }

            this.byTotalScore = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearByTotalScore() {
            this.byTotalScore = proto.message.SoccerPrediction.getDefaultInstance();
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasByTotalScore() {
            return (__bitField0 & 64) == 64;
        }

        public int getFinalScore1() {
            return finalScore1;
        }

        public Builder setFinalScore1(int value) {
            this.finalScore1 = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearFinalScore1() {
            this.finalScore1 = 0;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasFinalScore1() {
            return (__bitField0 & 128) == 128;
        }

        public int getFinalScore2() {
            return finalScore2;
        }

        public Builder setFinalScore2(int value) {
            this.finalScore2 = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearFinalScore2() {
            this.finalScore2 = 0;
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasFinalScore2() {
            return (__bitField0 & 256) == 256;
        }

        public int getFinalRate() {
            return finalRate;
        }

        public Builder setFinalRate(int value) {
            this.finalRate = value;
            __bitField0 |= 512;
            return this;
        }

        public Builder clearFinalRate() {
            this.finalRate = 0;
            __bitField0 &= ~512;
            return this;
        }

        public boolean hasFinalRate() {
            return (__bitField0 & 512) == 512;
        }

        public int getGoldBet() {
            return goldBet;
        }

        public Builder setGoldBet(int value) {
            this.goldBet = value;
            __bitField0 |= 1024;
            return this;
        }

        public Builder clearGoldBet() {
            this.goldBet = 0;
            __bitField0 &= ~1024;
            return this;
        }

        public boolean hasGoldBet() {
            return (__bitField0 & 1024) == 1024;
        }

        public int getGoldWin() {
            return goldWin;
        }

        public Builder setGoldWin(int value) {
            this.goldWin = value;
            __bitField0 |= 2048;
            return this;
        }

        public Builder clearGoldWin() {
            this.goldWin = 0;
            __bitField0 &= ~2048;
            return this;
        }

        public boolean hasGoldWin() {
            return (__bitField0 & 2048) == 2048;
        }

        public int getBetId() {
            return betId;
        }

        public Builder setBetId(int value) {
            this.betId = value;
            __bitField0 |= 4096;
            return this;
        }

        public Builder clearBetId() {
            this.betId = 0;
            __bitField0 &= ~4096;
            return this;
        }

        public boolean hasBetId() {
            return (__bitField0 & 4096) == 4096;
        }

        public boolean getIsRev() {
            return isRev;
        }

        public Builder setIsRev(boolean value) {
            this.isRev = value;
            __bitField0 |= 8192;
            return this;
        }

        public Builder clearIsRev() {
            this.isRev = false;
            __bitField0 &= ~8192;
            return this;
        }

        public boolean hasIsRev() {
            return (__bitField0 & 8192) == 8192;
        }

        public proto.message.SoccerStatus getStatus() {
            return proto.message.SoccerStatus.valueOf(status);
        }

        public int getStatusValue() {
            return status;
        }

        public Builder setStatus(proto.message.SoccerStatus value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SoccerInfo#status to null");
            }

            if (value == proto.message.SoccerStatus.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set SoccerInfo#status to UNRECOGNIZED");
            }

            this.status = value.getNumber();
            __bitField0 |= 16384;
            return this;
        }

        public Builder setStatusValue(int value) {
            this.status = value;
            __bitField0 |= 16384;
            return this;
        }

        public Builder clearStatus() {
            this.status = 0;
            __bitField0 &= ~16384;
            return this;
        }

        public boolean hasStatus() {
            return (__bitField0 & 16384) == 16384;
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
            if (!java.util.Objects.equals(this.id, that.id)) {
                return false;
            }
            if (!java.util.Objects.equals(this.time, that.time)) {
                return false;
            }
            if (!java.util.Objects.equals(this.teamId1, that.teamId1)) {
                return false;
            }
            if (!java.util.Objects.equals(this.teamId2, that.teamId2)) {
                return false;
            }
            if (!java.util.Objects.equals(this.byScore, that.byScore)) {
                return false;
            }
            if (!java.util.Objects.equals(this.byWinLose, that.byWinLose)) {
                return false;
            }
            if (!java.util.Objects.equals(this.byTotalScore, that.byTotalScore)) {
                return false;
            }
            if (!java.util.Objects.equals(this.finalScore1, that.finalScore1)) {
                return false;
            }
            if (!java.util.Objects.equals(this.finalScore2, that.finalScore2)) {
                return false;
            }
            if (!java.util.Objects.equals(this.finalRate, that.finalRate)) {
                return false;
            }
            if (!java.util.Objects.equals(this.goldBet, that.goldBet)) {
                return false;
            }
            if (!java.util.Objects.equals(this.goldWin, that.goldWin)) {
                return false;
            }
            if (!java.util.Objects.equals(this.betId, that.betId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.isRev, that.isRev)) {
                return false;
            }
            if (!java.util.Objects.equals(this.status, that.status)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.id);
            result = 31 * result + Integer.hashCode(this.time);
            result = 31 * result + Integer.hashCode(this.teamId1);
            result = 31 * result + Integer.hashCode(this.teamId2);
            result = 31 * result + (this.byScore == null ? 0 : this.byScore.hashCode());
            result = 31 * result + (this.byWinLose == null ? 0 : this.byWinLose.hashCode());
            result = 31 * result + (this.byTotalScore == null ? 0 : this.byTotalScore.hashCode());
            result = 31 * result + Integer.hashCode(this.finalScore1);
            result = 31 * result + Integer.hashCode(this.finalScore2);
            result = 31 * result + Integer.hashCode(this.finalRate);
            result = 31 * result + Integer.hashCode(this.goldBet);
            result = 31 * result + Integer.hashCode(this.goldWin);
            result = 31 * result + Integer.hashCode(this.betId);
            result = 31 * result + Boolean.hashCode(this.isRev);
            result = 31 * result + Integer.hashCode(this.status);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasId()) {
                parts.add("id=" + getId());
            }
            if (hasTime()) {
                parts.add("time=" + getTime());
            }
            if (hasTeamId1()) {
                parts.add("teamId1=" + getTeamId1());
            }
            if (hasTeamId2()) {
                parts.add("teamId2=" + getTeamId2());
            }
            if (hasByScore()) {
                parts.add("byScore=" + getByScore());
            }
            if (hasByWinLose()) {
                parts.add("byWinLose=" + getByWinLose());
            }
            if (hasByTotalScore()) {
                parts.add("byTotalScore=" + getByTotalScore());
            }
            if (hasFinalScore1()) {
                parts.add("finalScore1=" + getFinalScore1());
            }
            if (hasFinalScore2()) {
                parts.add("finalScore2=" + getFinalScore2());
            }
            if (hasFinalRate()) {
                parts.add("finalRate=" + getFinalRate());
            }
            if (hasGoldBet()) {
                parts.add("goldBet=" + getGoldBet());
            }
            if (hasGoldWin()) {
                parts.add("goldWin=" + getGoldWin());
            }
            if (hasBetId()) {
                parts.add("betId=" + getBetId());
            }
            if (hasIsRev()) {
                parts.add("isRev=" + getIsRev());
            }
            if (hasStatus()) {
                parts.add("status=" + getStatus() + '(' + getStatusValue() + ')');
            }
            return "SoccerInfo{" + String.join(", ", parts) + "}";
        }

        public SoccerInfo build() {
            proto.message.SoccerInfo result = new proto.message.SoccerInfo();
            result.__bitField0 = __bitField0;
            result.id = this.id;
            result.time = this.time;
            result.teamId1 = this.teamId1;
            result.teamId2 = this.teamId2;
            result.byScore = this.byScore;
            result.byWinLose = this.byWinLose;
            result.byTotalScore = this.byTotalScore;
            result.finalScore1 = this.finalScore1;
            result.finalScore2 = this.finalScore2;
            result.finalRate = this.finalRate;
            result.goldBet = this.goldBet;
            result.goldWin = this.goldWin;
            result.betId = this.betId;
            result.isRev = this.isRev;
            result.status = this.status;
            return result;
        }

    }



}