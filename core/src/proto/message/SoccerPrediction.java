package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class SoccerPrediction
        implements io.protostuff.Message<SoccerPrediction> {

    private static final SoccerPrediction DEFAULT_INSTANCE = newBuilder().build();

    private int type;

    private int predictGoal1;

    private int predictGoal2;

    private int predictGoalBuff;

    private int rate1;

    private int rate2;

    private int rate3;

    private int winRate1;

    private int winRate2;

    private boolean isHome;

    private boolean isChoose;

    private boolean __merge_lock = false;
    private int __bitField0;

    private SoccerPrediction() {
        this.type = proto.message.SoccerPredictedType.PREDICTION_SCORE.getNumber();
        this.predictGoal1 = 0;
        this.predictGoal2 = 0;
        this.predictGoalBuff = 0;
        this.rate1 = 0;
        this.rate2 = 0;
        this.rate3 = 0;
        this.winRate1 = 0;
        this.winRate2 = 0;
        this.isHome = false;
        this.isChoose = false;
    }

    private SoccerPrediction(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static SoccerPrediction getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<SoccerPrediction> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public proto.message.SoccerPredictedType getType() {
        return proto.message.SoccerPredictedType.valueOf(type);
    }

    public int getTypeValue() {
        return type;
    }

    public boolean hasType() {
        return (__bitField0 & 1) == 1;
    }

    public SoccerPrediction withType(proto.message.SoccerPredictedType value) {
        return SoccerPrediction.newBuilder()
            .mergeFrom(this)
            .setType(value)
            .build();
    }

    public int getPredictGoal1() {
        return predictGoal1;
    }

    public boolean hasPredictGoal1() {
        return (__bitField0 & 2) == 2;
    }

    public SoccerPrediction withPredictGoal1(int value) {
        return SoccerPrediction.newBuilder()
            .mergeFrom(this)
            .setPredictGoal1(value)
            .build();
    }

    public int getPredictGoal2() {
        return predictGoal2;
    }

    public boolean hasPredictGoal2() {
        return (__bitField0 & 4) == 4;
    }

    public SoccerPrediction withPredictGoal2(int value) {
        return SoccerPrediction.newBuilder()
            .mergeFrom(this)
            .setPredictGoal2(value)
            .build();
    }

    public int getPredictGoalBuff() {
        return predictGoalBuff;
    }

    public boolean hasPredictGoalBuff() {
        return (__bitField0 & 8) == 8;
    }

    public SoccerPrediction withPredictGoalBuff(int value) {
        return SoccerPrediction.newBuilder()
            .mergeFrom(this)
            .setPredictGoalBuff(value)
            .build();
    }

    public int getRate1() {
        return rate1;
    }

    public boolean hasRate1() {
        return (__bitField0 & 16) == 16;
    }

    public SoccerPrediction withRate1(int value) {
        return SoccerPrediction.newBuilder()
            .mergeFrom(this)
            .setRate1(value)
            .build();
    }

    public int getRate2() {
        return rate2;
    }

    public boolean hasRate2() {
        return (__bitField0 & 32) == 32;
    }

    public SoccerPrediction withRate2(int value) {
        return SoccerPrediction.newBuilder()
            .mergeFrom(this)
            .setRate2(value)
            .build();
    }

    public int getRate3() {
        return rate3;
    }

    public boolean hasRate3() {
        return (__bitField0 & 64) == 64;
    }

    public SoccerPrediction withRate3(int value) {
        return SoccerPrediction.newBuilder()
            .mergeFrom(this)
            .setRate3(value)
            .build();
    }

    public int getWinRate1() {
        return winRate1;
    }

    public boolean hasWinRate1() {
        return (__bitField0 & 128) == 128;
    }

    public SoccerPrediction withWinRate1(int value) {
        return SoccerPrediction.newBuilder()
            .mergeFrom(this)
            .setWinRate1(value)
            .build();
    }

    public int getWinRate2() {
        return winRate2;
    }

    public boolean hasWinRate2() {
        return (__bitField0 & 256) == 256;
    }

    public SoccerPrediction withWinRate2(int value) {
        return SoccerPrediction.newBuilder()
            .mergeFrom(this)
            .setWinRate2(value)
            .build();
    }

    public boolean getIsHome() {
        return isHome;
    }

    public boolean hasIsHome() {
        return (__bitField0 & 512) == 512;
    }

    public SoccerPrediction withIsHome(boolean value) {
        return SoccerPrediction.newBuilder()
            .mergeFrom(this)
            .setIsHome(value)
            .build();
    }

    public boolean getIsChoose() {
        return isChoose;
    }

    public boolean hasIsChoose() {
        return (__bitField0 & 1024) == 1024;
    }

    public SoccerPrediction withIsChoose(boolean value) {
        return SoccerPrediction.newBuilder()
            .mergeFrom(this)
            .setIsChoose(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<SoccerPrediction> cachedSchema() {
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
        SoccerPrediction that = (SoccerPrediction) obj;
        if (!java.util.Objects.equals(this.type, that.type)) {
            return false;
        }
        if (!java.util.Objects.equals(this.predictGoal1, that.predictGoal1)) {
            return false;
        }
        if (!java.util.Objects.equals(this.predictGoal2, that.predictGoal2)) {
            return false;
        }
        if (!java.util.Objects.equals(this.predictGoalBuff, that.predictGoalBuff)) {
            return false;
        }
        if (!java.util.Objects.equals(this.rate1, that.rate1)) {
            return false;
        }
        if (!java.util.Objects.equals(this.rate2, that.rate2)) {
            return false;
        }
        if (!java.util.Objects.equals(this.rate3, that.rate3)) {
            return false;
        }
        if (!java.util.Objects.equals(this.winRate1, that.winRate1)) {
            return false;
        }
        if (!java.util.Objects.equals(this.winRate2, that.winRate2)) {
            return false;
        }
        if (!java.util.Objects.equals(this.isHome, that.isHome)) {
            return false;
        }
        if (!java.util.Objects.equals(this.isChoose, that.isChoose)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.type);
        result = 31 * result + Integer.hashCode(this.predictGoal1);
        result = 31 * result + Integer.hashCode(this.predictGoal2);
        result = 31 * result + Integer.hashCode(this.predictGoalBuff);
        result = 31 * result + Integer.hashCode(this.rate1);
        result = 31 * result + Integer.hashCode(this.rate2);
        result = 31 * result + Integer.hashCode(this.rate3);
        result = 31 * result + Integer.hashCode(this.winRate1);
        result = 31 * result + Integer.hashCode(this.winRate2);
        result = 31 * result + Boolean.hashCode(this.isHome);
        result = 31 * result + Boolean.hashCode(this.isChoose);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasType()) {
            parts.add("type=" + getType() + '(' + getTypeValue() + ')');
        }
        if (hasPredictGoal1()) {
            parts.add("predictGoal1=" + getPredictGoal1());
        }
        if (hasPredictGoal2()) {
            parts.add("predictGoal2=" + getPredictGoal2());
        }
        if (hasPredictGoalBuff()) {
            parts.add("predictGoalBuff=" + getPredictGoalBuff());
        }
        if (hasRate1()) {
            parts.add("rate1=" + getRate1());
        }
        if (hasRate2()) {
            parts.add("rate2=" + getRate2());
        }
        if (hasRate3()) {
            parts.add("rate3=" + getRate3());
        }
        if (hasWinRate1()) {
            parts.add("winRate1=" + getWinRate1());
        }
        if (hasWinRate2()) {
            parts.add("winRate2=" + getWinRate2());
        }
        if (hasIsHome()) {
            parts.add("isHome=" + getIsHome());
        }
        if (hasIsChoose()) {
            parts.add("isChoose=" + getIsChoose());
        }
        return "SoccerPrediction{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<SoccerPrediction>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("type", 1);
        	__fieldMap.put("predictGoal1", 2);
        	__fieldMap.put("predictGoal2", 3);
        	__fieldMap.put("predictGoalBuff", 4);
        	__fieldMap.put("rate1", 5);
        	__fieldMap.put("rate2", 6);
        	__fieldMap.put("rate3", 7);
        	__fieldMap.put("winRate1", 8);
        	__fieldMap.put("winRate2", 9);
        	__fieldMap.put("isHome", 10);
        	__fieldMap.put("isChoose", 11);
        }

        @Override
        public SoccerPrediction newMessage() {
            return new SoccerPrediction();
        }

        @Override
        public Class<SoccerPrediction> typeClass() {
            return SoccerPrediction.class;
        }

        @Override
        public String messageName() {
            return SoccerPrediction.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return SoccerPrediction.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(SoccerPrediction message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, SoccerPrediction instance) throws java.io.IOException {
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
                    	instance.type = input.readEnum();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.predictGoal1 = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.predictGoal2 = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.predictGoalBuff = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.rate1 = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.rate2 = input.readInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.rate3 = input.readInt32();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.winRate1 = input.readInt32();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 9:
                    	instance.winRate2 = input.readInt32();
                    	instance.__bitField0 |= 256;
                    	break;
                    case 10:
                    	instance.isHome = input.readBool();
                    	instance.__bitField0 |= 512;
                    	break;
                    case 11:
                    	instance.isChoose = input.readBool();
                    	instance.__bitField0 |= 1024;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, SoccerPrediction instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.type, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.predictGoal1, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.predictGoal2, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.predictGoalBuff, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.rate1, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeInt32(6, instance.rate2, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeInt32(7, instance.rate3, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeInt32(8, instance.winRate1, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeInt32(9, instance.winRate2, false);
            }

            if((instance.__bitField0 & 512) == 512) {
                output.writeBool(10, instance.isHome, false);
            }

            if((instance.__bitField0 & 1024) == 1024) {
                output.writeBool(11, instance.isChoose, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "type";
        		case 2: return "predictGoal1";
        		case 3: return "predictGoal2";
        		case 4: return "predictGoalBuff";
        		case 5: return "rate1";
        		case 6: return "rate2";
        		case 7: return "rate3";
        		case 8: return "winRate1";
        		case 9: return "winRate2";
        		case 10: return "isHome";
        		case 11: return "isChoose";
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

        private int type;

        private int predictGoal1;

        private int predictGoal2;

        private int predictGoalBuff;

        private int rate1;

        private int rate2;

        private int rate3;

        private int winRate1;

        private int winRate2;

        private boolean isHome;

        private boolean isChoose;

        private int __bitField0;

        private Builder() {
            this.type = proto.message.SoccerPredictedType.PREDICTION_SCORE.getNumber();
            this.predictGoal1 = 0;
            this.predictGoal2 = 0;
            this.predictGoalBuff = 0;
            this.rate1 = 0;
            this.rate2 = 0;
            this.rate3 = 0;
            this.winRate1 = 0;
            this.winRate2 = 0;
            this.isHome = false;
            this.isChoose = false;
        }

        public Builder mergeFrom(SoccerPrediction instance) {
            if (instance.hasType()) {
                this.setType(instance.getType());
            }

            if (instance.hasPredictGoal1()) {
                this.setPredictGoal1(instance.getPredictGoal1());
            }

            if (instance.hasPredictGoal2()) {
                this.setPredictGoal2(instance.getPredictGoal2());
            }

            if (instance.hasPredictGoalBuff()) {
                this.setPredictGoalBuff(instance.getPredictGoalBuff());
            }

            if (instance.hasRate1()) {
                this.setRate1(instance.getRate1());
            }

            if (instance.hasRate2()) {
                this.setRate2(instance.getRate2());
            }

            if (instance.hasRate3()) {
                this.setRate3(instance.getRate3());
            }

            if (instance.hasWinRate1()) {
                this.setWinRate1(instance.getWinRate1());
            }

            if (instance.hasWinRate2()) {
                this.setWinRate2(instance.getWinRate2());
            }

            if (instance.hasIsHome()) {
                this.setIsHome(instance.getIsHome());
            }

            if (instance.hasIsChoose()) {
                this.setIsChoose(instance.getIsChoose());
            }

            return this;
        }

        public proto.message.SoccerPredictedType getType() {
            return proto.message.SoccerPredictedType.valueOf(type);
        }

        public int getTypeValue() {
            return type;
        }

        public Builder setType(proto.message.SoccerPredictedType value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SoccerPrediction#type to null");
            }

            if (value == proto.message.SoccerPredictedType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set SoccerPrediction#type to UNRECOGNIZED");
            }

            this.type = value.getNumber();
            __bitField0 |= 1;
            return this;
        }

        public Builder setTypeValue(int value) {
            this.type = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearType() {
            this.type = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasType() {
            return (__bitField0 & 1) == 1;
        }

        public int getPredictGoal1() {
            return predictGoal1;
        }

        public Builder setPredictGoal1(int value) {
            this.predictGoal1 = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearPredictGoal1() {
            this.predictGoal1 = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasPredictGoal1() {
            return (__bitField0 & 2) == 2;
        }

        public int getPredictGoal2() {
            return predictGoal2;
        }

        public Builder setPredictGoal2(int value) {
            this.predictGoal2 = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearPredictGoal2() {
            this.predictGoal2 = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasPredictGoal2() {
            return (__bitField0 & 4) == 4;
        }

        public int getPredictGoalBuff() {
            return predictGoalBuff;
        }

        public Builder setPredictGoalBuff(int value) {
            this.predictGoalBuff = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearPredictGoalBuff() {
            this.predictGoalBuff = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasPredictGoalBuff() {
            return (__bitField0 & 8) == 8;
        }

        public int getRate1() {
            return rate1;
        }

        public Builder setRate1(int value) {
            this.rate1 = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearRate1() {
            this.rate1 = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasRate1() {
            return (__bitField0 & 16) == 16;
        }

        public int getRate2() {
            return rate2;
        }

        public Builder setRate2(int value) {
            this.rate2 = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearRate2() {
            this.rate2 = 0;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasRate2() {
            return (__bitField0 & 32) == 32;
        }

        public int getRate3() {
            return rate3;
        }

        public Builder setRate3(int value) {
            this.rate3 = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearRate3() {
            this.rate3 = 0;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasRate3() {
            return (__bitField0 & 64) == 64;
        }

        public int getWinRate1() {
            return winRate1;
        }

        public Builder setWinRate1(int value) {
            this.winRate1 = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearWinRate1() {
            this.winRate1 = 0;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasWinRate1() {
            return (__bitField0 & 128) == 128;
        }

        public int getWinRate2() {
            return winRate2;
        }

        public Builder setWinRate2(int value) {
            this.winRate2 = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearWinRate2() {
            this.winRate2 = 0;
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasWinRate2() {
            return (__bitField0 & 256) == 256;
        }

        public boolean getIsHome() {
            return isHome;
        }

        public Builder setIsHome(boolean value) {
            this.isHome = value;
            __bitField0 |= 512;
            return this;
        }

        public Builder clearIsHome() {
            this.isHome = false;
            __bitField0 &= ~512;
            return this;
        }

        public boolean hasIsHome() {
            return (__bitField0 & 512) == 512;
        }

        public boolean getIsChoose() {
            return isChoose;
        }

        public Builder setIsChoose(boolean value) {
            this.isChoose = value;
            __bitField0 |= 1024;
            return this;
        }

        public Builder clearIsChoose() {
            this.isChoose = false;
            __bitField0 &= ~1024;
            return this;
        }

        public boolean hasIsChoose() {
            return (__bitField0 & 1024) == 1024;
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
            if (!java.util.Objects.equals(this.type, that.type)) {
                return false;
            }
            if (!java.util.Objects.equals(this.predictGoal1, that.predictGoal1)) {
                return false;
            }
            if (!java.util.Objects.equals(this.predictGoal2, that.predictGoal2)) {
                return false;
            }
            if (!java.util.Objects.equals(this.predictGoalBuff, that.predictGoalBuff)) {
                return false;
            }
            if (!java.util.Objects.equals(this.rate1, that.rate1)) {
                return false;
            }
            if (!java.util.Objects.equals(this.rate2, that.rate2)) {
                return false;
            }
            if (!java.util.Objects.equals(this.rate3, that.rate3)) {
                return false;
            }
            if (!java.util.Objects.equals(this.winRate1, that.winRate1)) {
                return false;
            }
            if (!java.util.Objects.equals(this.winRate2, that.winRate2)) {
                return false;
            }
            if (!java.util.Objects.equals(this.isHome, that.isHome)) {
                return false;
            }
            if (!java.util.Objects.equals(this.isChoose, that.isChoose)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.type);
            result = 31 * result + Integer.hashCode(this.predictGoal1);
            result = 31 * result + Integer.hashCode(this.predictGoal2);
            result = 31 * result + Integer.hashCode(this.predictGoalBuff);
            result = 31 * result + Integer.hashCode(this.rate1);
            result = 31 * result + Integer.hashCode(this.rate2);
            result = 31 * result + Integer.hashCode(this.rate3);
            result = 31 * result + Integer.hashCode(this.winRate1);
            result = 31 * result + Integer.hashCode(this.winRate2);
            result = 31 * result + Boolean.hashCode(this.isHome);
            result = 31 * result + Boolean.hashCode(this.isChoose);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasType()) {
                parts.add("type=" + getType() + '(' + getTypeValue() + ')');
            }
            if (hasPredictGoal1()) {
                parts.add("predictGoal1=" + getPredictGoal1());
            }
            if (hasPredictGoal2()) {
                parts.add("predictGoal2=" + getPredictGoal2());
            }
            if (hasPredictGoalBuff()) {
                parts.add("predictGoalBuff=" + getPredictGoalBuff());
            }
            if (hasRate1()) {
                parts.add("rate1=" + getRate1());
            }
            if (hasRate2()) {
                parts.add("rate2=" + getRate2());
            }
            if (hasRate3()) {
                parts.add("rate3=" + getRate3());
            }
            if (hasWinRate1()) {
                parts.add("winRate1=" + getWinRate1());
            }
            if (hasWinRate2()) {
                parts.add("winRate2=" + getWinRate2());
            }
            if (hasIsHome()) {
                parts.add("isHome=" + getIsHome());
            }
            if (hasIsChoose()) {
                parts.add("isChoose=" + getIsChoose());
            }
            return "SoccerPrediction{" + String.join(", ", parts) + "}";
        }

        public SoccerPrediction build() {
            proto.message.SoccerPrediction result = new proto.message.SoccerPrediction();
            result.__bitField0 = __bitField0;
            result.type = this.type;
            result.predictGoal1 = this.predictGoal1;
            result.predictGoal2 = this.predictGoal2;
            result.predictGoalBuff = this.predictGoalBuff;
            result.rate1 = this.rate1;
            result.rate2 = this.rate2;
            result.rate3 = this.rate3;
            result.winRate1 = this.winRate1;
            result.winRate2 = this.winRate2;
            result.isHome = this.isHome;
            result.isChoose = this.isChoose;
            return result;
        }

    }



}