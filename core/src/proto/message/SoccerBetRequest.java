package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class SoccerBetRequest
        implements io.protostuff.Message<SoccerBetRequest> {

    private static final SoccerBetRequest DEFAULT_INSTANCE = newBuilder().build();

    private int type;

    private int id;

    private int goldBet;

    private int score1;

    private int score2;

    private boolean home;

    private boolean __merge_lock = false;
    private int __bitField0;

    private SoccerBetRequest() {
        this.type = proto.message.SoccerPredictedType.PREDICTION_SCORE.getNumber();
        this.id = 0;
        this.goldBet = 0;
        this.score1 = 0;
        this.score2 = 0;
        this.home = false;
    }

    private SoccerBetRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static SoccerBetRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<SoccerBetRequest> getSchema()
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

    public SoccerBetRequest withType(proto.message.SoccerPredictedType value) {
        return SoccerBetRequest.newBuilder()
            .mergeFrom(this)
            .setType(value)
            .build();
    }

    public int getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 2) == 2;
    }

    public SoccerBetRequest withId(int value) {
        return SoccerBetRequest.newBuilder()
            .mergeFrom(this)
            .setId(value)
            .build();
    }

    public int getGoldBet() {
        return goldBet;
    }

    public boolean hasGoldBet() {
        return (__bitField0 & 4) == 4;
    }

    public SoccerBetRequest withGoldBet(int value) {
        return SoccerBetRequest.newBuilder()
            .mergeFrom(this)
            .setGoldBet(value)
            .build();
    }

    public int getScore1() {
        return score1;
    }

    public boolean hasScore1() {
        return (__bitField0 & 8) == 8;
    }

    public SoccerBetRequest withScore1(int value) {
        return SoccerBetRequest.newBuilder()
            .mergeFrom(this)
            .setScore1(value)
            .build();
    }

    public int getScore2() {
        return score2;
    }

    public boolean hasScore2() {
        return (__bitField0 & 16) == 16;
    }

    public SoccerBetRequest withScore2(int value) {
        return SoccerBetRequest.newBuilder()
            .mergeFrom(this)
            .setScore2(value)
            .build();
    }

    public boolean getHome() {
        return home;
    }

    public boolean hasHome() {
        return (__bitField0 & 32) == 32;
    }

    public SoccerBetRequest withHome(boolean value) {
        return SoccerBetRequest.newBuilder()
            .mergeFrom(this)
            .setHome(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<SoccerBetRequest> cachedSchema() {
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
        SoccerBetRequest that = (SoccerBetRequest) obj;
        if (!java.util.Objects.equals(this.type, that.type)) {
            return false;
        }
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.goldBet, that.goldBet)) {
            return false;
        }
        if (!java.util.Objects.equals(this.score1, that.score1)) {
            return false;
        }
        if (!java.util.Objects.equals(this.score2, that.score2)) {
            return false;
        }
        if (!java.util.Objects.equals(this.home, that.home)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.type);
        result = 31 * result + Integer.hashCode(this.id);
        result = 31 * result + Integer.hashCode(this.goldBet);
        result = 31 * result + Integer.hashCode(this.score1);
        result = 31 * result + Integer.hashCode(this.score2);
        result = 31 * result + Boolean.hashCode(this.home);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasType()) {
            parts.add("type=" + getType() + '(' + getTypeValue() + ')');
        }
        if (hasId()) {
            parts.add("id=" + getId());
        }
        if (hasGoldBet()) {
            parts.add("goldBet=" + getGoldBet());
        }
        if (hasScore1()) {
            parts.add("score1=" + getScore1());
        }
        if (hasScore2()) {
            parts.add("score2=" + getScore2());
        }
        if (hasHome()) {
            parts.add("home=" + getHome());
        }
        return "SoccerBetRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<SoccerBetRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("type", 1);
        	__fieldMap.put("id", 2);
        	__fieldMap.put("goldBet", 3);
        	__fieldMap.put("score1", 4);
        	__fieldMap.put("score2", 5);
        	__fieldMap.put("home", 6);
        }

        @Override
        public SoccerBetRequest newMessage() {
            return new SoccerBetRequest();
        }

        @Override
        public Class<SoccerBetRequest> typeClass() {
            return SoccerBetRequest.class;
        }

        @Override
        public String messageName() {
            return SoccerBetRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return SoccerBetRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(SoccerBetRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, SoccerBetRequest instance) throws java.io.IOException {
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
                    	instance.id = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.goldBet = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.score1 = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.score2 = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.home = input.readBool();
                    	instance.__bitField0 |= 32;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, SoccerBetRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.type, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.id, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.goldBet, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.score1, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.score2, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeBool(6, instance.home, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "type";
        		case 2: return "id";
        		case 3: return "goldBet";
        		case 4: return "score1";
        		case 5: return "score2";
        		case 6: return "home";
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

        private int id;

        private int goldBet;

        private int score1;

        private int score2;

        private boolean home;

        private int __bitField0;

        private Builder() {
            this.type = proto.message.SoccerPredictedType.PREDICTION_SCORE.getNumber();
            this.id = 0;
            this.goldBet = 0;
            this.score1 = 0;
            this.score2 = 0;
            this.home = false;
        }

        public Builder mergeFrom(SoccerBetRequest instance) {
            if (instance.hasType()) {
                this.setType(instance.getType());
            }

            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            if (instance.hasGoldBet()) {
                this.setGoldBet(instance.getGoldBet());
            }

            if (instance.hasScore1()) {
                this.setScore1(instance.getScore1());
            }

            if (instance.hasScore2()) {
                this.setScore2(instance.getScore2());
            }

            if (instance.hasHome()) {
                this.setHome(instance.getHome());
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
                throw new NullPointerException("Cannot set SoccerBetRequest#type to null");
            }

            if (value == proto.message.SoccerPredictedType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set SoccerBetRequest#type to UNRECOGNIZED");
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

        public int getGoldBet() {
            return goldBet;
        }

        public Builder setGoldBet(int value) {
            this.goldBet = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearGoldBet() {
            this.goldBet = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasGoldBet() {
            return (__bitField0 & 4) == 4;
        }

        public int getScore1() {
            return score1;
        }

        public Builder setScore1(int value) {
            this.score1 = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearScore1() {
            this.score1 = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasScore1() {
            return (__bitField0 & 8) == 8;
        }

        public int getScore2() {
            return score2;
        }

        public Builder setScore2(int value) {
            this.score2 = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearScore2() {
            this.score2 = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasScore2() {
            return (__bitField0 & 16) == 16;
        }

        public boolean getHome() {
            return home;
        }

        public Builder setHome(boolean value) {
            this.home = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearHome() {
            this.home = false;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasHome() {
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
            if (!java.util.Objects.equals(this.type, that.type)) {
                return false;
            }
            if (!java.util.Objects.equals(this.id, that.id)) {
                return false;
            }
            if (!java.util.Objects.equals(this.goldBet, that.goldBet)) {
                return false;
            }
            if (!java.util.Objects.equals(this.score1, that.score1)) {
                return false;
            }
            if (!java.util.Objects.equals(this.score2, that.score2)) {
                return false;
            }
            if (!java.util.Objects.equals(this.home, that.home)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.type);
            result = 31 * result + Integer.hashCode(this.id);
            result = 31 * result + Integer.hashCode(this.goldBet);
            result = 31 * result + Integer.hashCode(this.score1);
            result = 31 * result + Integer.hashCode(this.score2);
            result = 31 * result + Boolean.hashCode(this.home);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasType()) {
                parts.add("type=" + getType() + '(' + getTypeValue() + ')');
            }
            if (hasId()) {
                parts.add("id=" + getId());
            }
            if (hasGoldBet()) {
                parts.add("goldBet=" + getGoldBet());
            }
            if (hasScore1()) {
                parts.add("score1=" + getScore1());
            }
            if (hasScore2()) {
                parts.add("score2=" + getScore2());
            }
            if (hasHome()) {
                parts.add("home=" + getHome());
            }
            return "SoccerBetRequest{" + String.join(", ", parts) + "}";
        }

        public SoccerBetRequest build() {
            proto.message.SoccerBetRequest result = new proto.message.SoccerBetRequest();
            result.__bitField0 = __bitField0;
            result.type = this.type;
            result.id = this.id;
            result.goldBet = this.goldBet;
            result.score1 = this.score1;
            result.score2 = this.score2;
            result.home = this.home;
            return result;
        }

    }



}