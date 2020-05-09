package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class SoccerBetResponse
        implements io.protostuff.Message<SoccerBetResponse> {

    private static final SoccerBetResponse DEFAULT_INSTANCE = newBuilder().build();

    private int result;

    private int id;

    private int type;

    private int goldTotalBet;

    private int goldCur;

    private proto.message.SoccerBetCount counters;

    private boolean __merge_lock = false;
    private int __bitField0;

    private SoccerBetResponse() {
        this.result = proto.message.SoccerResult.RESULT_SUCCESS.getNumber();
        this.id = 0;
        this.type = proto.message.SoccerPredictedType.PREDICTION_SCORE.getNumber();
        this.goldTotalBet = 0;
        this.goldCur = 0;
        this.counters = proto.message.SoccerBetCount.getDefaultInstance();
    }

    private SoccerBetResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static SoccerBetResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<SoccerBetResponse> getSchema()
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

    public SoccerBetResponse withResult(proto.message.SoccerResult value) {
        return SoccerBetResponse.newBuilder()
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

    public SoccerBetResponse withId(int value) {
        return SoccerBetResponse.newBuilder()
            .mergeFrom(this)
            .setId(value)
            .build();
    }

    public proto.message.SoccerPredictedType getType() {
        return proto.message.SoccerPredictedType.valueOf(type);
    }

    public int getTypeValue() {
        return type;
    }

    public boolean hasType() {
        return (__bitField0 & 4) == 4;
    }

    public SoccerBetResponse withType(proto.message.SoccerPredictedType value) {
        return SoccerBetResponse.newBuilder()
            .mergeFrom(this)
            .setType(value)
            .build();
    }

    public int getGoldTotalBet() {
        return goldTotalBet;
    }

    public boolean hasGoldTotalBet() {
        return (__bitField0 & 8) == 8;
    }

    public SoccerBetResponse withGoldTotalBet(int value) {
        return SoccerBetResponse.newBuilder()
            .mergeFrom(this)
            .setGoldTotalBet(value)
            .build();
    }

    public int getGoldCur() {
        return goldCur;
    }

    public boolean hasGoldCur() {
        return (__bitField0 & 16) == 16;
    }

    public SoccerBetResponse withGoldCur(int value) {
        return SoccerBetResponse.newBuilder()
            .mergeFrom(this)
            .setGoldCur(value)
            .build();
    }

    public proto.message.SoccerBetCount getCounters() {
        return counters;
    }

    public boolean hasCounters() {
        return (__bitField0 & 32) == 32;
    }

    public SoccerBetResponse withCounters(proto.message.SoccerBetCount value) {
        return SoccerBetResponse.newBuilder()
            .mergeFrom(this)
            .setCounters(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<SoccerBetResponse> cachedSchema() {
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
        SoccerBetResponse that = (SoccerBetResponse) obj;
        if (!java.util.Objects.equals(this.result, that.result)) {
            return false;
        }
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.type, that.type)) {
            return false;
        }
        if (!java.util.Objects.equals(this.goldTotalBet, that.goldTotalBet)) {
            return false;
        }
        if (!java.util.Objects.equals(this.goldCur, that.goldCur)) {
            return false;
        }
        if (!java.util.Objects.equals(this.counters, that.counters)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.result);
        result = 31 * result + Integer.hashCode(this.id);
        result = 31 * result + Integer.hashCode(this.type);
        result = 31 * result + Integer.hashCode(this.goldTotalBet);
        result = 31 * result + Integer.hashCode(this.goldCur);
        result = 31 * result + (this.counters == null ? 0 : this.counters.hashCode());

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
        if (hasType()) {
            parts.add("type=" + getType() + '(' + getTypeValue() + ')');
        }
        if (hasGoldTotalBet()) {
            parts.add("goldTotalBet=" + getGoldTotalBet());
        }
        if (hasGoldCur()) {
            parts.add("goldCur=" + getGoldCur());
        }
        if (hasCounters()) {
            parts.add("counters=" + getCounters());
        }
        return "SoccerBetResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<SoccerBetResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("result", 1);
        	__fieldMap.put("id", 2);
        	__fieldMap.put("type", 3);
        	__fieldMap.put("goldTotalBet", 4);
        	__fieldMap.put("goldCur", 5);
        	__fieldMap.put("counters", 6);
        }

        @Override
        public SoccerBetResponse newMessage() {
            return new SoccerBetResponse();
        }

        @Override
        public Class<SoccerBetResponse> typeClass() {
            return SoccerBetResponse.class;
        }

        @Override
        public String messageName() {
            return SoccerBetResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return SoccerBetResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(SoccerBetResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, SoccerBetResponse instance) throws java.io.IOException {
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
                    	instance.type = input.readEnum();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.goldTotalBet = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.goldCur = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.counters = input.mergeObject(null, proto.message.SoccerBetCount.getSchema());
                    	instance.__bitField0 |= 32;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, SoccerBetResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.result, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.id, false);
            }

            if((instance.__bitField0 & 4) == 4) {
            	output.writeEnum(3, instance.type, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.goldTotalBet, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.goldCur, false);
            }

            if((instance.__bitField0 & 32) == 32) {
            	output.writeObject(6, instance.counters, proto.message.SoccerBetCount.getSchema(), false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "result";
        		case 2: return "id";
        		case 3: return "type";
        		case 4: return "goldTotalBet";
        		case 5: return "goldCur";
        		case 6: return "counters";
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

        private int type;

        private int goldTotalBet;

        private int goldCur;

        private proto.message.SoccerBetCount counters;

        private int __bitField0;

        private Builder() {
            this.result = proto.message.SoccerResult.RESULT_SUCCESS.getNumber();
            this.id = 0;
            this.type = proto.message.SoccerPredictedType.PREDICTION_SCORE.getNumber();
            this.goldTotalBet = 0;
            this.goldCur = 0;
            this.counters = proto.message.SoccerBetCount.getDefaultInstance();
        }

        public Builder mergeFrom(SoccerBetResponse instance) {
            if (instance.hasResult()) {
                this.setResult(instance.getResult());
            }

            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            if (instance.hasType()) {
                this.setType(instance.getType());
            }

            if (instance.hasGoldTotalBet()) {
                this.setGoldTotalBet(instance.getGoldTotalBet());
            }

            if (instance.hasGoldCur()) {
                this.setGoldCur(instance.getGoldCur());
            }

            if (instance.hasCounters()) {
                this.setCounters(instance.getCounters());
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
                throw new NullPointerException("Cannot set SoccerBetResponse#result to null");
            }

            if (value == proto.message.SoccerResult.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set SoccerBetResponse#result to UNRECOGNIZED");
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

        public proto.message.SoccerPredictedType getType() {
            return proto.message.SoccerPredictedType.valueOf(type);
        }

        public int getTypeValue() {
            return type;
        }

        public Builder setType(proto.message.SoccerPredictedType value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SoccerBetResponse#type to null");
            }

            if (value == proto.message.SoccerPredictedType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set SoccerBetResponse#type to UNRECOGNIZED");
            }

            this.type = value.getNumber();
            __bitField0 |= 4;
            return this;
        }

        public Builder setTypeValue(int value) {
            this.type = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearType() {
            this.type = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasType() {
            return (__bitField0 & 4) == 4;
        }

        public int getGoldTotalBet() {
            return goldTotalBet;
        }

        public Builder setGoldTotalBet(int value) {
            this.goldTotalBet = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearGoldTotalBet() {
            this.goldTotalBet = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasGoldTotalBet() {
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

        public proto.message.SoccerBetCount getCounters() {
            return counters;
        }

        public Builder setCounters(proto.message.SoccerBetCount value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SoccerBetResponse#counters to null");
            }

            this.counters = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearCounters() {
            this.counters = proto.message.SoccerBetCount.getDefaultInstance();
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasCounters() {
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
            if (!java.util.Objects.equals(this.id, that.id)) {
                return false;
            }
            if (!java.util.Objects.equals(this.type, that.type)) {
                return false;
            }
            if (!java.util.Objects.equals(this.goldTotalBet, that.goldTotalBet)) {
                return false;
            }
            if (!java.util.Objects.equals(this.goldCur, that.goldCur)) {
                return false;
            }
            if (!java.util.Objects.equals(this.counters, that.counters)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.result);
            result = 31 * result + Integer.hashCode(this.id);
            result = 31 * result + Integer.hashCode(this.type);
            result = 31 * result + Integer.hashCode(this.goldTotalBet);
            result = 31 * result + Integer.hashCode(this.goldCur);
            result = 31 * result + (this.counters == null ? 0 : this.counters.hashCode());

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
            if (hasType()) {
                parts.add("type=" + getType() + '(' + getTypeValue() + ')');
            }
            if (hasGoldTotalBet()) {
                parts.add("goldTotalBet=" + getGoldTotalBet());
            }
            if (hasGoldCur()) {
                parts.add("goldCur=" + getGoldCur());
            }
            if (hasCounters()) {
                parts.add("counters=" + getCounters());
            }
            return "SoccerBetResponse{" + String.join(", ", parts) + "}";
        }

        public SoccerBetResponse build() {
            proto.message.SoccerBetResponse result = new proto.message.SoccerBetResponse();
            result.__bitField0 = __bitField0;
            result.result = this.result;
            result.id = this.id;
            result.type = this.type;
            result.goldTotalBet = this.goldTotalBet;
            result.goldCur = this.goldCur;
            result.counters = this.counters;
            return result;
        }

    }



}