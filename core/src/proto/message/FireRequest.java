package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class FireRequest
        implements io.protostuff.Message<FireRequest> {

    private static final FireRequest DEFAULT_INSTANCE = newBuilder().build();

    private long hordeID;

    private int fishAmount;

    private long bulletID;

    private long time;

    private boolean __merge_lock = false;
    private int __bitField0;

    private FireRequest() {
        this.hordeID = 0L;
        this.fishAmount = 0;
        this.bulletID = 0L;
        this.time = 0L;
    }

    private FireRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static FireRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<FireRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public long getHordeID() {
        return hordeID;
    }

    public boolean hasHordeID() {
        return (__bitField0 & 1) == 1;
    }

    public FireRequest withHordeID(long value) {
        return FireRequest.newBuilder()
            .mergeFrom(this)
            .setHordeID(value)
            .build();
    }

    public int getFishAmount() {
        return fishAmount;
    }

    public boolean hasFishAmount() {
        return (__bitField0 & 2) == 2;
    }

    public FireRequest withFishAmount(int value) {
        return FireRequest.newBuilder()
            .mergeFrom(this)
            .setFishAmount(value)
            .build();
    }

    public long getBulletID() {
        return bulletID;
    }

    public boolean hasBulletID() {
        return (__bitField0 & 4) == 4;
    }

    public FireRequest withBulletID(long value) {
        return FireRequest.newBuilder()
            .mergeFrom(this)
            .setBulletID(value)
            .build();
    }

    public long getTime() {
        return time;
    }

    public boolean hasTime() {
        return (__bitField0 & 8) == 8;
    }

    public FireRequest withTime(long value) {
        return FireRequest.newBuilder()
            .mergeFrom(this)
            .setTime(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<FireRequest> cachedSchema() {
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
        FireRequest that = (FireRequest) obj;
        if (!java.util.Objects.equals(this.hordeID, that.hordeID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.fishAmount, that.fishAmount)) {
            return false;
        }
        if (!java.util.Objects.equals(this.bulletID, that.bulletID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.time, that.time)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Long.hashCode(this.hordeID);
        result = 31 * result + Integer.hashCode(this.fishAmount);
        result = 31 * result + Long.hashCode(this.bulletID);
        result = 31 * result + Long.hashCode(this.time);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasHordeID()) {
            parts.add("hordeID=" + getHordeID());
        }
        if (hasFishAmount()) {
            parts.add("fishAmount=" + getFishAmount());
        }
        if (hasBulletID()) {
            parts.add("bulletID=" + getBulletID());
        }
        if (hasTime()) {
            parts.add("time=" + getTime());
        }
        return "FireRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<FireRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("hordeID", 1);
        	__fieldMap.put("fishAmount", 2);
        	__fieldMap.put("bulletID", 3);
        	__fieldMap.put("time", 4);
        }

        @Override
        public FireRequest newMessage() {
            return new FireRequest();
        }

        @Override
        public Class<FireRequest> typeClass() {
            return FireRequest.class;
        }

        @Override
        public String messageName() {
            return FireRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return FireRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(FireRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, FireRequest instance) throws java.io.IOException {
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
                    	instance.hordeID = input.readInt64();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.fishAmount = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.bulletID = input.readInt64();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.time = input.readInt64();
                    	instance.__bitField0 |= 8;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, FireRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt64(1, instance.hordeID, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.fishAmount, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt64(3, instance.bulletID, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt64(4, instance.time, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "hordeID";
        		case 2: return "fishAmount";
        		case 3: return "bulletID";
        		case 4: return "time";
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

        private long hordeID;

        private int fishAmount;

        private long bulletID;

        private long time;

        private int __bitField0;

        private Builder() {
            this.hordeID = 0L;
            this.fishAmount = 0;
            this.bulletID = 0L;
            this.time = 0L;
        }

        public Builder mergeFrom(FireRequest instance) {
            if (instance.hasHordeID()) {
                this.setHordeID(instance.getHordeID());
            }

            if (instance.hasFishAmount()) {
                this.setFishAmount(instance.getFishAmount());
            }

            if (instance.hasBulletID()) {
                this.setBulletID(instance.getBulletID());
            }

            if (instance.hasTime()) {
                this.setTime(instance.getTime());
            }

            return this;
        }

        public long getHordeID() {
            return hordeID;
        }

        public Builder setHordeID(long value) {
            this.hordeID = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearHordeID() {
            this.hordeID = 0L;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasHordeID() {
            return (__bitField0 & 1) == 1;
        }

        public int getFishAmount() {
            return fishAmount;
        }

        public Builder setFishAmount(int value) {
            this.fishAmount = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearFishAmount() {
            this.fishAmount = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasFishAmount() {
            return (__bitField0 & 2) == 2;
        }

        public long getBulletID() {
            return bulletID;
        }

        public Builder setBulletID(long value) {
            this.bulletID = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearBulletID() {
            this.bulletID = 0L;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasBulletID() {
            return (__bitField0 & 4) == 4;
        }

        public long getTime() {
            return time;
        }

        public Builder setTime(long value) {
            this.time = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearTime() {
            this.time = 0L;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasTime() {
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
            if (!java.util.Objects.equals(this.hordeID, that.hordeID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.fishAmount, that.fishAmount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.bulletID, that.bulletID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.time, that.time)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Long.hashCode(this.hordeID);
            result = 31 * result + Integer.hashCode(this.fishAmount);
            result = 31 * result + Long.hashCode(this.bulletID);
            result = 31 * result + Long.hashCode(this.time);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasHordeID()) {
                parts.add("hordeID=" + getHordeID());
            }
            if (hasFishAmount()) {
                parts.add("fishAmount=" + getFishAmount());
            }
            if (hasBulletID()) {
                parts.add("bulletID=" + getBulletID());
            }
            if (hasTime()) {
                parts.add("time=" + getTime());
            }
            return "FireRequest{" + String.join(", ", parts) + "}";
        }

        public FireRequest build() {
            proto.message.FireRequest result = new proto.message.FireRequest();
            result.__bitField0 = __bitField0;
            result.hordeID = this.hordeID;
            result.fishAmount = this.fishAmount;
            result.bulletID = this.bulletID;
            result.time = this.time;
            return result;
        }

    }



}