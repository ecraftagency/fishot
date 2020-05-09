package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class SoccerBetCount
        implements io.protostuff.Message<SoccerBetCount> {

    private static final SoccerBetCount DEFAULT_INSTANCE = newBuilder().build();

    private int id;

    private int countScore;

    private int countWinLose;

    private int countTotalScore;

    private boolean __merge_lock = false;
    private int __bitField0;

    private SoccerBetCount() {
        this.id = 0;
        this.countScore = 0;
        this.countWinLose = 0;
        this.countTotalScore = 0;
    }

    private SoccerBetCount(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static SoccerBetCount getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<SoccerBetCount> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 1) == 1;
    }

    public SoccerBetCount withId(int value) {
        return SoccerBetCount.newBuilder()
            .mergeFrom(this)
            .setId(value)
            .build();
    }

    public int getCountScore() {
        return countScore;
    }

    public boolean hasCountScore() {
        return (__bitField0 & 2) == 2;
    }

    public SoccerBetCount withCountScore(int value) {
        return SoccerBetCount.newBuilder()
            .mergeFrom(this)
            .setCountScore(value)
            .build();
    }

    public int getCountWinLose() {
        return countWinLose;
    }

    public boolean hasCountWinLose() {
        return (__bitField0 & 4) == 4;
    }

    public SoccerBetCount withCountWinLose(int value) {
        return SoccerBetCount.newBuilder()
            .mergeFrom(this)
            .setCountWinLose(value)
            .build();
    }

    public int getCountTotalScore() {
        return countTotalScore;
    }

    public boolean hasCountTotalScore() {
        return (__bitField0 & 8) == 8;
    }

    public SoccerBetCount withCountTotalScore(int value) {
        return SoccerBetCount.newBuilder()
            .mergeFrom(this)
            .setCountTotalScore(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<SoccerBetCount> cachedSchema() {
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
        SoccerBetCount that = (SoccerBetCount) obj;
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.countScore, that.countScore)) {
            return false;
        }
        if (!java.util.Objects.equals(this.countWinLose, that.countWinLose)) {
            return false;
        }
        if (!java.util.Objects.equals(this.countTotalScore, that.countTotalScore)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.id);
        result = 31 * result + Integer.hashCode(this.countScore);
        result = 31 * result + Integer.hashCode(this.countWinLose);
        result = 31 * result + Integer.hashCode(this.countTotalScore);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasId()) {
            parts.add("id=" + getId());
        }
        if (hasCountScore()) {
            parts.add("countScore=" + getCountScore());
        }
        if (hasCountWinLose()) {
            parts.add("countWinLose=" + getCountWinLose());
        }
        if (hasCountTotalScore()) {
            parts.add("countTotalScore=" + getCountTotalScore());
        }
        return "SoccerBetCount{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<SoccerBetCount>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("id", 1);
        	__fieldMap.put("countScore", 2);
        	__fieldMap.put("countWinLose", 3);
        	__fieldMap.put("countTotalScore", 4);
        }

        @Override
        public SoccerBetCount newMessage() {
            return new SoccerBetCount();
        }

        @Override
        public Class<SoccerBetCount> typeClass() {
            return SoccerBetCount.class;
        }

        @Override
        public String messageName() {
            return SoccerBetCount.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return SoccerBetCount.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(SoccerBetCount message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, SoccerBetCount instance) throws java.io.IOException {
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
                    	instance.countScore = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.countWinLose = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.countTotalScore = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, SoccerBetCount instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.id, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.countScore, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.countWinLose, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.countTotalScore, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "id";
        		case 2: return "countScore";
        		case 3: return "countWinLose";
        		case 4: return "countTotalScore";
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

        private int countScore;

        private int countWinLose;

        private int countTotalScore;

        private int __bitField0;

        private Builder() {
            this.id = 0;
            this.countScore = 0;
            this.countWinLose = 0;
            this.countTotalScore = 0;
        }

        public Builder mergeFrom(SoccerBetCount instance) {
            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            if (instance.hasCountScore()) {
                this.setCountScore(instance.getCountScore());
            }

            if (instance.hasCountWinLose()) {
                this.setCountWinLose(instance.getCountWinLose());
            }

            if (instance.hasCountTotalScore()) {
                this.setCountTotalScore(instance.getCountTotalScore());
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

        public int getCountScore() {
            return countScore;
        }

        public Builder setCountScore(int value) {
            this.countScore = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearCountScore() {
            this.countScore = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasCountScore() {
            return (__bitField0 & 2) == 2;
        }

        public int getCountWinLose() {
            return countWinLose;
        }

        public Builder setCountWinLose(int value) {
            this.countWinLose = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearCountWinLose() {
            this.countWinLose = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasCountWinLose() {
            return (__bitField0 & 4) == 4;
        }

        public int getCountTotalScore() {
            return countTotalScore;
        }

        public Builder setCountTotalScore(int value) {
            this.countTotalScore = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearCountTotalScore() {
            this.countTotalScore = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasCountTotalScore() {
            return (__bitField0 & 8) == 8;
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
            if (!java.util.Objects.equals(this.countScore, that.countScore)) {
                return false;
            }
            if (!java.util.Objects.equals(this.countWinLose, that.countWinLose)) {
                return false;
            }
            if (!java.util.Objects.equals(this.countTotalScore, that.countTotalScore)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.id);
            result = 31 * result + Integer.hashCode(this.countScore);
            result = 31 * result + Integer.hashCode(this.countWinLose);
            result = 31 * result + Integer.hashCode(this.countTotalScore);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasId()) {
                parts.add("id=" + getId());
            }
            if (hasCountScore()) {
                parts.add("countScore=" + getCountScore());
            }
            if (hasCountWinLose()) {
                parts.add("countWinLose=" + getCountWinLose());
            }
            if (hasCountTotalScore()) {
                parts.add("countTotalScore=" + getCountTotalScore());
            }
            return "SoccerBetCount{" + String.join(", ", parts) + "}";
        }

        public SoccerBetCount build() {
            proto.message.SoccerBetCount result = new proto.message.SoccerBetCount();
            result.__bitField0 = __bitField0;
            result.id = this.id;
            result.countScore = this.countScore;
            result.countWinLose = this.countWinLose;
            result.countTotalScore = this.countTotalScore;
            return result;
        }

    }



}