package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class AvailableCannon
        implements io.protostuff.Message<AvailableCannon> {

    private static final AvailableCannon DEFAULT_INSTANCE = newBuilder().build();

    private int cannonID;

    private boolean available;

    private int money;

    private boolean __merge_lock = false;
    private int __bitField0;

    private AvailableCannon() {
        this.cannonID = 0;
        this.available = false;
        this.money = 0;
    }

    private AvailableCannon(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static AvailableCannon getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<AvailableCannon> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getCannonID() {
        return cannonID;
    }

    public boolean hasCannonID() {
        return (__bitField0 & 1) == 1;
    }

    public AvailableCannon withCannonID(int value) {
        return AvailableCannon.newBuilder()
            .mergeFrom(this)
            .setCannonID(value)
            .build();
    }

    public boolean getAvailable() {
        return available;
    }

    public boolean hasAvailable() {
        return (__bitField0 & 2) == 2;
    }

    public AvailableCannon withAvailable(boolean value) {
        return AvailableCannon.newBuilder()
            .mergeFrom(this)
            .setAvailable(value)
            .build();
    }

    public int getMoney() {
        return money;
    }

    public boolean hasMoney() {
        return (__bitField0 & 4) == 4;
    }

    public AvailableCannon withMoney(int value) {
        return AvailableCannon.newBuilder()
            .mergeFrom(this)
            .setMoney(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<AvailableCannon> cachedSchema() {
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
        AvailableCannon that = (AvailableCannon) obj;
        if (!java.util.Objects.equals(this.cannonID, that.cannonID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.available, that.available)) {
            return false;
        }
        if (!java.util.Objects.equals(this.money, that.money)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.cannonID);
        result = 31 * result + Boolean.hashCode(this.available);
        result = 31 * result + Integer.hashCode(this.money);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasCannonID()) {
            parts.add("cannonID=" + getCannonID());
        }
        if (hasAvailable()) {
            parts.add("available=" + getAvailable());
        }
        if (hasMoney()) {
            parts.add("money=" + getMoney());
        }
        return "AvailableCannon{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<AvailableCannon>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("cannonID", 1);
        	__fieldMap.put("available", 2);
        	__fieldMap.put("money", 3);
        }

        @Override
        public AvailableCannon newMessage() {
            return new AvailableCannon();
        }

        @Override
        public Class<AvailableCannon> typeClass() {
            return AvailableCannon.class;
        }

        @Override
        public String messageName() {
            return AvailableCannon.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return AvailableCannon.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(AvailableCannon message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, AvailableCannon instance) throws java.io.IOException {
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
                    	instance.cannonID = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.available = input.readBool();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.money = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, AvailableCannon instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.cannonID, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeBool(2, instance.available, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.money, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "cannonID";
        		case 2: return "available";
        		case 3: return "money";
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

        private int cannonID;

        private boolean available;

        private int money;

        private int __bitField0;

        private Builder() {
            this.cannonID = 0;
            this.available = false;
            this.money = 0;
        }

        public Builder mergeFrom(AvailableCannon instance) {
            if (instance.hasCannonID()) {
                this.setCannonID(instance.getCannonID());
            }

            if (instance.hasAvailable()) {
                this.setAvailable(instance.getAvailable());
            }

            if (instance.hasMoney()) {
                this.setMoney(instance.getMoney());
            }

            return this;
        }

        public int getCannonID() {
            return cannonID;
        }

        public Builder setCannonID(int value) {
            this.cannonID = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearCannonID() {
            this.cannonID = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasCannonID() {
            return (__bitField0 & 1) == 1;
        }

        public boolean getAvailable() {
            return available;
        }

        public Builder setAvailable(boolean value) {
            this.available = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearAvailable() {
            this.available = false;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasAvailable() {
            return (__bitField0 & 2) == 2;
        }

        public int getMoney() {
            return money;
        }

        public Builder setMoney(int value) {
            this.money = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearMoney() {
            this.money = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasMoney() {
            return (__bitField0 & 4) == 4;
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
            if (!java.util.Objects.equals(this.cannonID, that.cannonID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.available, that.available)) {
                return false;
            }
            if (!java.util.Objects.equals(this.money, that.money)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.cannonID);
            result = 31 * result + Boolean.hashCode(this.available);
            result = 31 * result + Integer.hashCode(this.money);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasCannonID()) {
                parts.add("cannonID=" + getCannonID());
            }
            if (hasAvailable()) {
                parts.add("available=" + getAvailable());
            }
            if (hasMoney()) {
                parts.add("money=" + getMoney());
            }
            return "AvailableCannon{" + String.join(", ", parts) + "}";
        }

        public AvailableCannon build() {
            proto.message.AvailableCannon result = new proto.message.AvailableCannon();
            result.__bitField0 = __bitField0;
            result.cannonID = this.cannonID;
            result.available = this.available;
            result.money = this.money;
            return result;
        }

    }



}