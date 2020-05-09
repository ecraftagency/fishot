package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class SoccerEnterResponse
        implements io.protostuff.Message<SoccerEnterResponse> {

    private static final SoccerEnterResponse DEFAULT_INSTANCE = newBuilder().build();

    private int goldTotalBet;

    private int goldTotalWin;

    private int goldCur;

    private int maxByScore;

    private int maxByWinLose;

    private int maxByTotalScore;

    private int goldBetMin;

    private int goldBetMax;

    private boolean __merge_lock = false;
    private int __bitField0;

    private SoccerEnterResponse() {
        this.goldTotalBet = 0;
        this.goldTotalWin = 0;
        this.goldCur = 0;
        this.maxByScore = 0;
        this.maxByWinLose = 0;
        this.maxByTotalScore = 0;
        this.goldBetMin = 0;
        this.goldBetMax = 0;
    }

    private SoccerEnterResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static SoccerEnterResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<SoccerEnterResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getGoldTotalBet() {
        return goldTotalBet;
    }

    public boolean hasGoldTotalBet() {
        return (__bitField0 & 1) == 1;
    }

    public SoccerEnterResponse withGoldTotalBet(int value) {
        return SoccerEnterResponse.newBuilder()
            .mergeFrom(this)
            .setGoldTotalBet(value)
            .build();
    }

    public int getGoldTotalWin() {
        return goldTotalWin;
    }

    public boolean hasGoldTotalWin() {
        return (__bitField0 & 2) == 2;
    }

    public SoccerEnterResponse withGoldTotalWin(int value) {
        return SoccerEnterResponse.newBuilder()
            .mergeFrom(this)
            .setGoldTotalWin(value)
            .build();
    }

    public int getGoldCur() {
        return goldCur;
    }

    public boolean hasGoldCur() {
        return (__bitField0 & 4) == 4;
    }

    public SoccerEnterResponse withGoldCur(int value) {
        return SoccerEnterResponse.newBuilder()
            .mergeFrom(this)
            .setGoldCur(value)
            .build();
    }

    public int getMaxByScore() {
        return maxByScore;
    }

    public boolean hasMaxByScore() {
        return (__bitField0 & 8) == 8;
    }

    public SoccerEnterResponse withMaxByScore(int value) {
        return SoccerEnterResponse.newBuilder()
            .mergeFrom(this)
            .setMaxByScore(value)
            .build();
    }

    public int getMaxByWinLose() {
        return maxByWinLose;
    }

    public boolean hasMaxByWinLose() {
        return (__bitField0 & 16) == 16;
    }

    public SoccerEnterResponse withMaxByWinLose(int value) {
        return SoccerEnterResponse.newBuilder()
            .mergeFrom(this)
            .setMaxByWinLose(value)
            .build();
    }

    public int getMaxByTotalScore() {
        return maxByTotalScore;
    }

    public boolean hasMaxByTotalScore() {
        return (__bitField0 & 32) == 32;
    }

    public SoccerEnterResponse withMaxByTotalScore(int value) {
        return SoccerEnterResponse.newBuilder()
            .mergeFrom(this)
            .setMaxByTotalScore(value)
            .build();
    }

    public int getGoldBetMin() {
        return goldBetMin;
    }

    public boolean hasGoldBetMin() {
        return (__bitField0 & 64) == 64;
    }

    public SoccerEnterResponse withGoldBetMin(int value) {
        return SoccerEnterResponse.newBuilder()
            .mergeFrom(this)
            .setGoldBetMin(value)
            .build();
    }

    public int getGoldBetMax() {
        return goldBetMax;
    }

    public boolean hasGoldBetMax() {
        return (__bitField0 & 128) == 128;
    }

    public SoccerEnterResponse withGoldBetMax(int value) {
        return SoccerEnterResponse.newBuilder()
            .mergeFrom(this)
            .setGoldBetMax(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<SoccerEnterResponse> cachedSchema() {
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
        SoccerEnterResponse that = (SoccerEnterResponse) obj;
        if (!java.util.Objects.equals(this.goldTotalBet, that.goldTotalBet)) {
            return false;
        }
        if (!java.util.Objects.equals(this.goldTotalWin, that.goldTotalWin)) {
            return false;
        }
        if (!java.util.Objects.equals(this.goldCur, that.goldCur)) {
            return false;
        }
        if (!java.util.Objects.equals(this.maxByScore, that.maxByScore)) {
            return false;
        }
        if (!java.util.Objects.equals(this.maxByWinLose, that.maxByWinLose)) {
            return false;
        }
        if (!java.util.Objects.equals(this.maxByTotalScore, that.maxByTotalScore)) {
            return false;
        }
        if (!java.util.Objects.equals(this.goldBetMin, that.goldBetMin)) {
            return false;
        }
        if (!java.util.Objects.equals(this.goldBetMax, that.goldBetMax)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.goldTotalBet);
        result = 31 * result + Integer.hashCode(this.goldTotalWin);
        result = 31 * result + Integer.hashCode(this.goldCur);
        result = 31 * result + Integer.hashCode(this.maxByScore);
        result = 31 * result + Integer.hashCode(this.maxByWinLose);
        result = 31 * result + Integer.hashCode(this.maxByTotalScore);
        result = 31 * result + Integer.hashCode(this.goldBetMin);
        result = 31 * result + Integer.hashCode(this.goldBetMax);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasGoldTotalBet()) {
            parts.add("goldTotalBet=" + getGoldTotalBet());
        }
        if (hasGoldTotalWin()) {
            parts.add("goldTotalWin=" + getGoldTotalWin());
        }
        if (hasGoldCur()) {
            parts.add("goldCur=" + getGoldCur());
        }
        if (hasMaxByScore()) {
            parts.add("maxByScore=" + getMaxByScore());
        }
        if (hasMaxByWinLose()) {
            parts.add("maxByWinLose=" + getMaxByWinLose());
        }
        if (hasMaxByTotalScore()) {
            parts.add("maxByTotalScore=" + getMaxByTotalScore());
        }
        if (hasGoldBetMin()) {
            parts.add("goldBetMin=" + getGoldBetMin());
        }
        if (hasGoldBetMax()) {
            parts.add("goldBetMax=" + getGoldBetMax());
        }
        return "SoccerEnterResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<SoccerEnterResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("goldTotalBet", 1);
        	__fieldMap.put("goldTotalWin", 2);
        	__fieldMap.put("goldCur", 3);
        	__fieldMap.put("maxByScore", 4);
        	__fieldMap.put("maxByWinLose", 5);
        	__fieldMap.put("maxByTotalScore", 6);
        	__fieldMap.put("goldBetMin", 7);
        	__fieldMap.put("goldBetMax", 8);
        }

        @Override
        public SoccerEnterResponse newMessage() {
            return new SoccerEnterResponse();
        }

        @Override
        public Class<SoccerEnterResponse> typeClass() {
            return SoccerEnterResponse.class;
        }

        @Override
        public String messageName() {
            return SoccerEnterResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return SoccerEnterResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(SoccerEnterResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, SoccerEnterResponse instance) throws java.io.IOException {
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
                    	instance.goldTotalBet = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.goldTotalWin = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.goldCur = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.maxByScore = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.maxByWinLose = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.maxByTotalScore = input.readInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.goldBetMin = input.readInt32();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.goldBetMax = input.readInt32();
                    	instance.__bitField0 |= 128;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, SoccerEnterResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.goldTotalBet, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.goldTotalWin, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.goldCur, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.maxByScore, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.maxByWinLose, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeInt32(6, instance.maxByTotalScore, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeInt32(7, instance.goldBetMin, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeInt32(8, instance.goldBetMax, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "goldTotalBet";
        		case 2: return "goldTotalWin";
        		case 3: return "goldCur";
        		case 4: return "maxByScore";
        		case 5: return "maxByWinLose";
        		case 6: return "maxByTotalScore";
        		case 7: return "goldBetMin";
        		case 8: return "goldBetMax";
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

        private int goldTotalBet;

        private int goldTotalWin;

        private int goldCur;

        private int maxByScore;

        private int maxByWinLose;

        private int maxByTotalScore;

        private int goldBetMin;

        private int goldBetMax;

        private int __bitField0;

        private Builder() {
            this.goldTotalBet = 0;
            this.goldTotalWin = 0;
            this.goldCur = 0;
            this.maxByScore = 0;
            this.maxByWinLose = 0;
            this.maxByTotalScore = 0;
            this.goldBetMin = 0;
            this.goldBetMax = 0;
        }

        public Builder mergeFrom(SoccerEnterResponse instance) {
            if (instance.hasGoldTotalBet()) {
                this.setGoldTotalBet(instance.getGoldTotalBet());
            }

            if (instance.hasGoldTotalWin()) {
                this.setGoldTotalWin(instance.getGoldTotalWin());
            }

            if (instance.hasGoldCur()) {
                this.setGoldCur(instance.getGoldCur());
            }

            if (instance.hasMaxByScore()) {
                this.setMaxByScore(instance.getMaxByScore());
            }

            if (instance.hasMaxByWinLose()) {
                this.setMaxByWinLose(instance.getMaxByWinLose());
            }

            if (instance.hasMaxByTotalScore()) {
                this.setMaxByTotalScore(instance.getMaxByTotalScore());
            }

            if (instance.hasGoldBetMin()) {
                this.setGoldBetMin(instance.getGoldBetMin());
            }

            if (instance.hasGoldBetMax()) {
                this.setGoldBetMax(instance.getGoldBetMax());
            }

            return this;
        }

        public int getGoldTotalBet() {
            return goldTotalBet;
        }

        public Builder setGoldTotalBet(int value) {
            this.goldTotalBet = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearGoldTotalBet() {
            this.goldTotalBet = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasGoldTotalBet() {
            return (__bitField0 & 1) == 1;
        }

        public int getGoldTotalWin() {
            return goldTotalWin;
        }

        public Builder setGoldTotalWin(int value) {
            this.goldTotalWin = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearGoldTotalWin() {
            this.goldTotalWin = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasGoldTotalWin() {
            return (__bitField0 & 2) == 2;
        }

        public int getGoldCur() {
            return goldCur;
        }

        public Builder setGoldCur(int value) {
            this.goldCur = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearGoldCur() {
            this.goldCur = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasGoldCur() {
            return (__bitField0 & 4) == 4;
        }

        public int getMaxByScore() {
            return maxByScore;
        }

        public Builder setMaxByScore(int value) {
            this.maxByScore = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearMaxByScore() {
            this.maxByScore = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasMaxByScore() {
            return (__bitField0 & 8) == 8;
        }

        public int getMaxByWinLose() {
            return maxByWinLose;
        }

        public Builder setMaxByWinLose(int value) {
            this.maxByWinLose = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearMaxByWinLose() {
            this.maxByWinLose = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasMaxByWinLose() {
            return (__bitField0 & 16) == 16;
        }

        public int getMaxByTotalScore() {
            return maxByTotalScore;
        }

        public Builder setMaxByTotalScore(int value) {
            this.maxByTotalScore = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearMaxByTotalScore() {
            this.maxByTotalScore = 0;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasMaxByTotalScore() {
            return (__bitField0 & 32) == 32;
        }

        public int getGoldBetMin() {
            return goldBetMin;
        }

        public Builder setGoldBetMin(int value) {
            this.goldBetMin = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearGoldBetMin() {
            this.goldBetMin = 0;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasGoldBetMin() {
            return (__bitField0 & 64) == 64;
        }

        public int getGoldBetMax() {
            return goldBetMax;
        }

        public Builder setGoldBetMax(int value) {
            this.goldBetMax = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearGoldBetMax() {
            this.goldBetMax = 0;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasGoldBetMax() {
            return (__bitField0 & 128) == 128;
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
            if (!java.util.Objects.equals(this.goldTotalBet, that.goldTotalBet)) {
                return false;
            }
            if (!java.util.Objects.equals(this.goldTotalWin, that.goldTotalWin)) {
                return false;
            }
            if (!java.util.Objects.equals(this.goldCur, that.goldCur)) {
                return false;
            }
            if (!java.util.Objects.equals(this.maxByScore, that.maxByScore)) {
                return false;
            }
            if (!java.util.Objects.equals(this.maxByWinLose, that.maxByWinLose)) {
                return false;
            }
            if (!java.util.Objects.equals(this.maxByTotalScore, that.maxByTotalScore)) {
                return false;
            }
            if (!java.util.Objects.equals(this.goldBetMin, that.goldBetMin)) {
                return false;
            }
            if (!java.util.Objects.equals(this.goldBetMax, that.goldBetMax)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.goldTotalBet);
            result = 31 * result + Integer.hashCode(this.goldTotalWin);
            result = 31 * result + Integer.hashCode(this.goldCur);
            result = 31 * result + Integer.hashCode(this.maxByScore);
            result = 31 * result + Integer.hashCode(this.maxByWinLose);
            result = 31 * result + Integer.hashCode(this.maxByTotalScore);
            result = 31 * result + Integer.hashCode(this.goldBetMin);
            result = 31 * result + Integer.hashCode(this.goldBetMax);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasGoldTotalBet()) {
                parts.add("goldTotalBet=" + getGoldTotalBet());
            }
            if (hasGoldTotalWin()) {
                parts.add("goldTotalWin=" + getGoldTotalWin());
            }
            if (hasGoldCur()) {
                parts.add("goldCur=" + getGoldCur());
            }
            if (hasMaxByScore()) {
                parts.add("maxByScore=" + getMaxByScore());
            }
            if (hasMaxByWinLose()) {
                parts.add("maxByWinLose=" + getMaxByWinLose());
            }
            if (hasMaxByTotalScore()) {
                parts.add("maxByTotalScore=" + getMaxByTotalScore());
            }
            if (hasGoldBetMin()) {
                parts.add("goldBetMin=" + getGoldBetMin());
            }
            if (hasGoldBetMax()) {
                parts.add("goldBetMax=" + getGoldBetMax());
            }
            return "SoccerEnterResponse{" + String.join(", ", parts) + "}";
        }

        public SoccerEnterResponse build() {
            proto.message.SoccerEnterResponse result = new proto.message.SoccerEnterResponse();
            result.__bitField0 = __bitField0;
            result.goldTotalBet = this.goldTotalBet;
            result.goldTotalWin = this.goldTotalWin;
            result.goldCur = this.goldCur;
            result.maxByScore = this.maxByScore;
            result.maxByWinLose = this.maxByWinLose;
            result.maxByTotalScore = this.maxByTotalScore;
            result.goldBetMin = this.goldBetMin;
            result.goldBetMax = this.goldBetMax;
            return result;
        }

    }



}