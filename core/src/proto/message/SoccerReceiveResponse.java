package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class SoccerReceiveResponse
        implements io.protostuff.Message<SoccerReceiveResponse> {

    private static final SoccerReceiveResponse DEFAULT_INSTANCE = newBuilder().build();

    private int result;

    private int id;

    private int betId;

    private int goldWin;

    private int goldCur;

    private int goldRev;

    private int goldBet;

    private int totalBet;

    private int totalWin;

    private boolean __merge_lock = false;
    private int __bitField0;

    private SoccerReceiveResponse() {
        this.result = proto.message.SoccerResult.RESULT_SUCCESS.getNumber();
        this.id = 0;
        this.betId = 0;
        this.goldWin = 0;
        this.goldCur = 0;
        this.goldRev = 0;
        this.goldBet = 0;
        this.totalBet = 0;
        this.totalWin = 0;
    }

    private SoccerReceiveResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static SoccerReceiveResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<SoccerReceiveResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public proto.message.SoccerResult getResult() {
        return proto.message.SoccerResult.valueOf(result);
    }

    public int getResultValue() {
        return result;
    }

    public boolean hasResult() {
        return (__bitField0 & 1) == 1;
    }

    public SoccerReceiveResponse withResult(proto.message.SoccerResult value) {
        return SoccerReceiveResponse.newBuilder()
            .mergeFrom(this)
            .setResult(value)
            .build();
    }

    public int getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 2) == 2;
    }

    public SoccerReceiveResponse withId(int value) {
        return SoccerReceiveResponse.newBuilder()
            .mergeFrom(this)
            .setId(value)
            .build();
    }

    public int getBetId() {
        return betId;
    }

    public boolean hasBetId() {
        return (__bitField0 & 4) == 4;
    }

    public SoccerReceiveResponse withBetId(int value) {
        return SoccerReceiveResponse.newBuilder()
            .mergeFrom(this)
            .setBetId(value)
            .build();
    }

    public int getGoldWin() {
        return goldWin;
    }

    public boolean hasGoldWin() {
        return (__bitField0 & 8) == 8;
    }

    public SoccerReceiveResponse withGoldWin(int value) {
        return SoccerReceiveResponse.newBuilder()
            .mergeFrom(this)
            .setGoldWin(value)
            .build();
    }

    public int getGoldCur() {
        return goldCur;
    }

    public boolean hasGoldCur() {
        return (__bitField0 & 16) == 16;
    }

    public SoccerReceiveResponse withGoldCur(int value) {
        return SoccerReceiveResponse.newBuilder()
            .mergeFrom(this)
            .setGoldCur(value)
            .build();
    }

    public int getGoldRev() {
        return goldRev;
    }

    public boolean hasGoldRev() {
        return (__bitField0 & 32) == 32;
    }

    public SoccerReceiveResponse withGoldRev(int value) {
        return SoccerReceiveResponse.newBuilder()
            .mergeFrom(this)
            .setGoldRev(value)
            .build();
    }

    public int getGoldBet() {
        return goldBet;
    }

    public boolean hasGoldBet() {
        return (__bitField0 & 64) == 64;
    }

    public SoccerReceiveResponse withGoldBet(int value) {
        return SoccerReceiveResponse.newBuilder()
            .mergeFrom(this)
            .setGoldBet(value)
            .build();
    }

    public int getTotalBet() {
        return totalBet;
    }

    public boolean hasTotalBet() {
        return (__bitField0 & 128) == 128;
    }

    public SoccerReceiveResponse withTotalBet(int value) {
        return SoccerReceiveResponse.newBuilder()
            .mergeFrom(this)
            .setTotalBet(value)
            .build();
    }

    public int getTotalWin() {
        return totalWin;
    }

    public boolean hasTotalWin() {
        return (__bitField0 & 256) == 256;
    }

    public SoccerReceiveResponse withTotalWin(int value) {
        return SoccerReceiveResponse.newBuilder()
            .mergeFrom(this)
            .setTotalWin(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<SoccerReceiveResponse> cachedSchema() {
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
        SoccerReceiveResponse that = (SoccerReceiveResponse) obj;
        if (!java.util.Objects.equals(this.result, that.result)) {
            return false;
        }
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.betId, that.betId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.goldWin, that.goldWin)) {
            return false;
        }
        if (!java.util.Objects.equals(this.goldCur, that.goldCur)) {
            return false;
        }
        if (!java.util.Objects.equals(this.goldRev, that.goldRev)) {
            return false;
        }
        if (!java.util.Objects.equals(this.goldBet, that.goldBet)) {
            return false;
        }
        if (!java.util.Objects.equals(this.totalBet, that.totalBet)) {
            return false;
        }
        if (!java.util.Objects.equals(this.totalWin, that.totalWin)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.result);
        result = 31 * result + Integer.hashCode(this.id);
        result = 31 * result + Integer.hashCode(this.betId);
        result = 31 * result + Integer.hashCode(this.goldWin);
        result = 31 * result + Integer.hashCode(this.goldCur);
        result = 31 * result + Integer.hashCode(this.goldRev);
        result = 31 * result + Integer.hashCode(this.goldBet);
        result = 31 * result + Integer.hashCode(this.totalBet);
        result = 31 * result + Integer.hashCode(this.totalWin);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasResult()) {
            parts.add("result=" + getResult() + '(' + getResultValue() + ')');
        }
        if (hasId()) {
            parts.add("id=" + getId());
        }
        if (hasBetId()) {
            parts.add("betId=" + getBetId());
        }
        if (hasGoldWin()) {
            parts.add("goldWin=" + getGoldWin());
        }
        if (hasGoldCur()) {
            parts.add("goldCur=" + getGoldCur());
        }
        if (hasGoldRev()) {
            parts.add("goldRev=" + getGoldRev());
        }
        if (hasGoldBet()) {
            parts.add("goldBet=" + getGoldBet());
        }
        if (hasTotalBet()) {
            parts.add("totalBet=" + getTotalBet());
        }
        if (hasTotalWin()) {
            parts.add("totalWin=" + getTotalWin());
        }
        return "SoccerReceiveResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<SoccerReceiveResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("result", 1);
        	__fieldMap.put("id", 2);
        	__fieldMap.put("betId", 3);
        	__fieldMap.put("goldWin", 4);
        	__fieldMap.put("goldCur", 5);
        	__fieldMap.put("goldRev", 6);
        	__fieldMap.put("goldBet", 7);
        	__fieldMap.put("totalBet", 8);
        	__fieldMap.put("totalWin", 9);
        }

        @Override
        public SoccerReceiveResponse newMessage() {
            return new SoccerReceiveResponse();
        }

        @Override
        public Class<SoccerReceiveResponse> typeClass() {
            return SoccerReceiveResponse.class;
        }

        @Override
        public String messageName() {
            return SoccerReceiveResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return SoccerReceiveResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(SoccerReceiveResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, SoccerReceiveResponse instance) throws java.io.IOException {
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
                    	instance.id = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.betId = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.goldWin = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.goldCur = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.goldRev = input.readInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.goldBet = input.readInt32();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.totalBet = input.readInt32();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 9:
                    	instance.totalWin = input.readInt32();
                    	instance.__bitField0 |= 256;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, SoccerReceiveResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.result, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.id, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.betId, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.goldWin, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.goldCur, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeInt32(6, instance.goldRev, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeInt32(7, instance.goldBet, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeInt32(8, instance.totalBet, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeInt32(9, instance.totalWin, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "result";
        		case 2: return "id";
        		case 3: return "betId";
        		case 4: return "goldWin";
        		case 5: return "goldCur";
        		case 6: return "goldRev";
        		case 7: return "goldBet";
        		case 8: return "totalBet";
        		case 9: return "totalWin";
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

        private int id;

        private int betId;

        private int goldWin;

        private int goldCur;

        private int goldRev;

        private int goldBet;

        private int totalBet;

        private int totalWin;

        private int __bitField0;

        private Builder() {
            this.result = proto.message.SoccerResult.RESULT_SUCCESS.getNumber();
            this.id = 0;
            this.betId = 0;
            this.goldWin = 0;
            this.goldCur = 0;
            this.goldRev = 0;
            this.goldBet = 0;
            this.totalBet = 0;
            this.totalWin = 0;
        }

        public Builder mergeFrom(SoccerReceiveResponse instance) {
            if (instance.hasResult()) {
                this.setResult(instance.getResult());
            }

            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            if (instance.hasBetId()) {
                this.setBetId(instance.getBetId());
            }

            if (instance.hasGoldWin()) {
                this.setGoldWin(instance.getGoldWin());
            }

            if (instance.hasGoldCur()) {
                this.setGoldCur(instance.getGoldCur());
            }

            if (instance.hasGoldRev()) {
                this.setGoldRev(instance.getGoldRev());
            }

            if (instance.hasGoldBet()) {
                this.setGoldBet(instance.getGoldBet());
            }

            if (instance.hasTotalBet()) {
                this.setTotalBet(instance.getTotalBet());
            }

            if (instance.hasTotalWin()) {
                this.setTotalWin(instance.getTotalWin());
            }

            return this;
        }

        public proto.message.SoccerResult getResult() {
            return proto.message.SoccerResult.valueOf(result);
        }

        public int getResultValue() {
            return result;
        }

        public Builder setResult(proto.message.SoccerResult value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SoccerReceiveResponse#result to null");
            }

            if (value == proto.message.SoccerResult.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set SoccerReceiveResponse#result to UNRECOGNIZED");
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

        public int getId() {
            return id;
        }

        public Builder setId(int value) {
            this.id = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearId() {
            this.id = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasId() {
            return (__bitField0 & 2) == 2;
        }

        public int getBetId() {
            return betId;
        }

        public Builder setBetId(int value) {
            this.betId = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearBetId() {
            this.betId = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasBetId() {
            return (__bitField0 & 4) == 4;
        }

        public int getGoldWin() {
            return goldWin;
        }

        public Builder setGoldWin(int value) {
            this.goldWin = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearGoldWin() {
            this.goldWin = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasGoldWin() {
            return (__bitField0 & 8) == 8;
        }

        public int getGoldCur() {
            return goldCur;
        }

        public Builder setGoldCur(int value) {
            this.goldCur = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearGoldCur() {
            this.goldCur = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasGoldCur() {
            return (__bitField0 & 16) == 16;
        }

        public int getGoldRev() {
            return goldRev;
        }

        public Builder setGoldRev(int value) {
            this.goldRev = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearGoldRev() {
            this.goldRev = 0;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasGoldRev() {
            return (__bitField0 & 32) == 32;
        }

        public int getGoldBet() {
            return goldBet;
        }

        public Builder setGoldBet(int value) {
            this.goldBet = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearGoldBet() {
            this.goldBet = 0;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasGoldBet() {
            return (__bitField0 & 64) == 64;
        }

        public int getTotalBet() {
            return totalBet;
        }

        public Builder setTotalBet(int value) {
            this.totalBet = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearTotalBet() {
            this.totalBet = 0;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasTotalBet() {
            return (__bitField0 & 128) == 128;
        }

        public int getTotalWin() {
            return totalWin;
        }

        public Builder setTotalWin(int value) {
            this.totalWin = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearTotalWin() {
            this.totalWin = 0;
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasTotalWin() {
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
            if (!java.util.Objects.equals(this.result, that.result)) {
                return false;
            }
            if (!java.util.Objects.equals(this.id, that.id)) {
                return false;
            }
            if (!java.util.Objects.equals(this.betId, that.betId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.goldWin, that.goldWin)) {
                return false;
            }
            if (!java.util.Objects.equals(this.goldCur, that.goldCur)) {
                return false;
            }
            if (!java.util.Objects.equals(this.goldRev, that.goldRev)) {
                return false;
            }
            if (!java.util.Objects.equals(this.goldBet, that.goldBet)) {
                return false;
            }
            if (!java.util.Objects.equals(this.totalBet, that.totalBet)) {
                return false;
            }
            if (!java.util.Objects.equals(this.totalWin, that.totalWin)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.result);
            result = 31 * result + Integer.hashCode(this.id);
            result = 31 * result + Integer.hashCode(this.betId);
            result = 31 * result + Integer.hashCode(this.goldWin);
            result = 31 * result + Integer.hashCode(this.goldCur);
            result = 31 * result + Integer.hashCode(this.goldRev);
            result = 31 * result + Integer.hashCode(this.goldBet);
            result = 31 * result + Integer.hashCode(this.totalBet);
            result = 31 * result + Integer.hashCode(this.totalWin);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasResult()) {
                parts.add("result=" + getResult() + '(' + getResultValue() + ')');
            }
            if (hasId()) {
                parts.add("id=" + getId());
            }
            if (hasBetId()) {
                parts.add("betId=" + getBetId());
            }
            if (hasGoldWin()) {
                parts.add("goldWin=" + getGoldWin());
            }
            if (hasGoldCur()) {
                parts.add("goldCur=" + getGoldCur());
            }
            if (hasGoldRev()) {
                parts.add("goldRev=" + getGoldRev());
            }
            if (hasGoldBet()) {
                parts.add("goldBet=" + getGoldBet());
            }
            if (hasTotalBet()) {
                parts.add("totalBet=" + getTotalBet());
            }
            if (hasTotalWin()) {
                parts.add("totalWin=" + getTotalWin());
            }
            return "SoccerReceiveResponse{" + String.join(", ", parts) + "}";
        }

        public SoccerReceiveResponse build() {
            proto.message.SoccerReceiveResponse result = new proto.message.SoccerReceiveResponse();
            result.__bitField0 = __bitField0;
            result.result = this.result;
            result.id = this.id;
            result.betId = this.betId;
            result.goldWin = this.goldWin;
            result.goldCur = this.goldCur;
            result.goldRev = this.goldRev;
            result.goldBet = this.goldBet;
            result.totalBet = this.totalBet;
            result.totalWin = this.totalWin;
            return result;
        }

    }



}