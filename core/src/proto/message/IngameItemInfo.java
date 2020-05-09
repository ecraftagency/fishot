package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class IngameItemInfo
        implements io.protostuff.Message<IngameItemInfo> {

    private static final IngameItemInfo DEFAULT_INSTANCE = newBuilder().build();

    private String userID;

    private int roseAmount;

    private int roseBonusAt;

    private int stunToSecond;

    private int soloSendAt;

    private int soloReceiveAt;

    private boolean __merge_lock = false;
    private int __bitField0;

    private IngameItemInfo() {
        this.userID = "";
        this.roseAmount = 0;
        this.roseBonusAt = 0;
        this.stunToSecond = 0;
        this.soloSendAt = 0;
        this.soloReceiveAt = 0;
    }

    private IngameItemInfo(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static IngameItemInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<IngameItemInfo> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getUserID() {
        return userID;
    }

    public boolean hasUserID() {
        return (__bitField0 & 1) == 1;
    }

    public IngameItemInfo withUserID(String value) {
        return IngameItemInfo.newBuilder()
            .mergeFrom(this)
            .setUserID(value)
            .build();
    }

    public int getRoseAmount() {
        return roseAmount;
    }

    public boolean hasRoseAmount() {
        return (__bitField0 & 2) == 2;
    }

    public IngameItemInfo withRoseAmount(int value) {
        return IngameItemInfo.newBuilder()
            .mergeFrom(this)
            .setRoseAmount(value)
            .build();
    }

    public int getRoseBonusAt() {
        return roseBonusAt;
    }

    public boolean hasRoseBonusAt() {
        return (__bitField0 & 4) == 4;
    }

    public IngameItemInfo withRoseBonusAt(int value) {
        return IngameItemInfo.newBuilder()
            .mergeFrom(this)
            .setRoseBonusAt(value)
            .build();
    }

    public int getStunToSecond() {
        return stunToSecond;
    }

    public boolean hasStunToSecond() {
        return (__bitField0 & 8) == 8;
    }

    public IngameItemInfo withStunToSecond(int value) {
        return IngameItemInfo.newBuilder()
            .mergeFrom(this)
            .setStunToSecond(value)
            .build();
    }

    public int getSoloSendAt() {
        return soloSendAt;
    }

    public boolean hasSoloSendAt() {
        return (__bitField0 & 16) == 16;
    }

    public IngameItemInfo withSoloSendAt(int value) {
        return IngameItemInfo.newBuilder()
            .mergeFrom(this)
            .setSoloSendAt(value)
            .build();
    }

    public int getSoloReceiveAt() {
        return soloReceiveAt;
    }

    public boolean hasSoloReceiveAt() {
        return (__bitField0 & 32) == 32;
    }

    public IngameItemInfo withSoloReceiveAt(int value) {
        return IngameItemInfo.newBuilder()
            .mergeFrom(this)
            .setSoloReceiveAt(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<IngameItemInfo> cachedSchema() {
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
        IngameItemInfo that = (IngameItemInfo) obj;
        if (!java.util.Objects.equals(this.userID, that.userID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.roseAmount, that.roseAmount)) {
            return false;
        }
        if (!java.util.Objects.equals(this.roseBonusAt, that.roseBonusAt)) {
            return false;
        }
        if (!java.util.Objects.equals(this.stunToSecond, that.stunToSecond)) {
            return false;
        }
        if (!java.util.Objects.equals(this.soloSendAt, that.soloSendAt)) {
            return false;
        }
        if (!java.util.Objects.equals(this.soloReceiveAt, that.soloReceiveAt)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
        result = 31 * result + Integer.hashCode(this.roseAmount);
        result = 31 * result + Integer.hashCode(this.roseBonusAt);
        result = 31 * result + Integer.hashCode(this.stunToSecond);
        result = 31 * result + Integer.hashCode(this.soloSendAt);
        result = 31 * result + Integer.hashCode(this.soloReceiveAt);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasUserID()) {
            parts.add("userID=" + getUserID());
        }
        if (hasRoseAmount()) {
            parts.add("roseAmount=" + getRoseAmount());
        }
        if (hasRoseBonusAt()) {
            parts.add("roseBonusAt=" + getRoseBonusAt());
        }
        if (hasStunToSecond()) {
            parts.add("stunToSecond=" + getStunToSecond());
        }
        if (hasSoloSendAt()) {
            parts.add("soloSendAt=" + getSoloSendAt());
        }
        if (hasSoloReceiveAt()) {
            parts.add("soloReceiveAt=" + getSoloReceiveAt());
        }
        return "IngameItemInfo{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<IngameItemInfo>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("userID", 1);
        	__fieldMap.put("roseAmount", 2);
        	__fieldMap.put("roseBonusAt", 3);
        	__fieldMap.put("stunToSecond", 4);
        	__fieldMap.put("soloSendAt", 5);
        	__fieldMap.put("soloReceiveAt", 6);
        }

        @Override
        public IngameItemInfo newMessage() {
            return new IngameItemInfo();
        }

        @Override
        public Class<IngameItemInfo> typeClass() {
            return IngameItemInfo.class;
        }

        @Override
        public String messageName() {
            return IngameItemInfo.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return IngameItemInfo.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(IngameItemInfo message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, IngameItemInfo instance) throws java.io.IOException {
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
                    	instance.roseAmount = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.roseBonusAt = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.stunToSecond = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.soloSendAt = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.soloReceiveAt = input.readInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, IngameItemInfo instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.userID, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.roseAmount, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.roseBonusAt, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.stunToSecond, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.soloSendAt, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeInt32(6, instance.soloReceiveAt, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "userID";
        		case 2: return "roseAmount";
        		case 3: return "roseBonusAt";
        		case 4: return "stunToSecond";
        		case 5: return "soloSendAt";
        		case 6: return "soloReceiveAt";
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

        private int roseAmount;

        private int roseBonusAt;

        private int stunToSecond;

        private int soloSendAt;

        private int soloReceiveAt;

        private int __bitField0;

        private Builder() {
            this.userID = "";
            this.roseAmount = 0;
            this.roseBonusAt = 0;
            this.stunToSecond = 0;
            this.soloSendAt = 0;
            this.soloReceiveAt = 0;
        }

        public Builder mergeFrom(IngameItemInfo instance) {
            if (instance.hasUserID()) {
                this.setUserID(instance.getUserID());
            }

            if (instance.hasRoseAmount()) {
                this.setRoseAmount(instance.getRoseAmount());
            }

            if (instance.hasRoseBonusAt()) {
                this.setRoseBonusAt(instance.getRoseBonusAt());
            }

            if (instance.hasStunToSecond()) {
                this.setStunToSecond(instance.getStunToSecond());
            }

            if (instance.hasSoloSendAt()) {
                this.setSoloSendAt(instance.getSoloSendAt());
            }

            if (instance.hasSoloReceiveAt()) {
                this.setSoloReceiveAt(instance.getSoloReceiveAt());
            }

            return this;
        }

        public String getUserID() {
            return userID;
        }

        public Builder setUserID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set IngameItemInfo#userID to null");
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

        public int getRoseAmount() {
            return roseAmount;
        }

        public Builder setRoseAmount(int value) {
            this.roseAmount = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearRoseAmount() {
            this.roseAmount = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasRoseAmount() {
            return (__bitField0 & 2) == 2;
        }

        public int getRoseBonusAt() {
            return roseBonusAt;
        }

        public Builder setRoseBonusAt(int value) {
            this.roseBonusAt = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearRoseBonusAt() {
            this.roseBonusAt = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasRoseBonusAt() {
            return (__bitField0 & 4) == 4;
        }

        public int getStunToSecond() {
            return stunToSecond;
        }

        public Builder setStunToSecond(int value) {
            this.stunToSecond = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearStunToSecond() {
            this.stunToSecond = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasStunToSecond() {
            return (__bitField0 & 8) == 8;
        }

        public int getSoloSendAt() {
            return soloSendAt;
        }

        public Builder setSoloSendAt(int value) {
            this.soloSendAt = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearSoloSendAt() {
            this.soloSendAt = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasSoloSendAt() {
            return (__bitField0 & 16) == 16;
        }

        public int getSoloReceiveAt() {
            return soloReceiveAt;
        }

        public Builder setSoloReceiveAt(int value) {
            this.soloReceiveAt = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearSoloReceiveAt() {
            this.soloReceiveAt = 0;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasSoloReceiveAt() {
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
            if (!java.util.Objects.equals(this.userID, that.userID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.roseAmount, that.roseAmount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.roseBonusAt, that.roseBonusAt)) {
                return false;
            }
            if (!java.util.Objects.equals(this.stunToSecond, that.stunToSecond)) {
                return false;
            }
            if (!java.util.Objects.equals(this.soloSendAt, that.soloSendAt)) {
                return false;
            }
            if (!java.util.Objects.equals(this.soloReceiveAt, that.soloReceiveAt)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
            result = 31 * result + Integer.hashCode(this.roseAmount);
            result = 31 * result + Integer.hashCode(this.roseBonusAt);
            result = 31 * result + Integer.hashCode(this.stunToSecond);
            result = 31 * result + Integer.hashCode(this.soloSendAt);
            result = 31 * result + Integer.hashCode(this.soloReceiveAt);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasUserID()) {
                parts.add("userID=" + getUserID());
            }
            if (hasRoseAmount()) {
                parts.add("roseAmount=" + getRoseAmount());
            }
            if (hasRoseBonusAt()) {
                parts.add("roseBonusAt=" + getRoseBonusAt());
            }
            if (hasStunToSecond()) {
                parts.add("stunToSecond=" + getStunToSecond());
            }
            if (hasSoloSendAt()) {
                parts.add("soloSendAt=" + getSoloSendAt());
            }
            if (hasSoloReceiveAt()) {
                parts.add("soloReceiveAt=" + getSoloReceiveAt());
            }
            return "IngameItemInfo{" + String.join(", ", parts) + "}";
        }

        public IngameItemInfo build() {
            proto.message.IngameItemInfo result = new proto.message.IngameItemInfo();
            result.__bitField0 = __bitField0;
            result.userID = this.userID;
            result.roseAmount = this.roseAmount;
            result.roseBonusAt = this.roseBonusAt;
            result.stunToSecond = this.stunToSecond;
            result.soloSendAt = this.soloSendAt;
            result.soloReceiveAt = this.soloReceiveAt;
            return result;
        }

    }



}