package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class OpenFireResponse
        implements io.protostuff.Message<OpenFireResponse> {

    private static final OpenFireResponse DEFAULT_INSTANCE = newBuilder().build();

    private String userID;

    private int x;

    private int y;

    private int value;

    private int currentExp;

    private long bulletID;

    private int currentGold;

    private int unlockGold;

    private int bulletType;

    private int bulletSkill;

    private boolean __merge_lock = false;
    private int __bitField0;

    private OpenFireResponse() {
        this.userID = "";
        this.x = 0;
        this.y = 0;
        this.value = 0;
        this.currentExp = 0;
        this.bulletID = 0L;
        this.currentGold = 0;
        this.unlockGold = 0;
        this.bulletType = 0;
        this.bulletSkill = 0;
    }

    private OpenFireResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static OpenFireResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<OpenFireResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getUserID() {
        return userID;
    }

    public boolean hasUserID() {
        return (__bitField0 & 1) == 1;
    }

    public OpenFireResponse withUserID(String value) {
        return OpenFireResponse.newBuilder()
            .mergeFrom(this)
            .setUserID(value)
            .build();
    }

    public int getX() {
        return x;
    }

    public boolean hasX() {
        return (__bitField0 & 2) == 2;
    }

    public OpenFireResponse withX(int value) {
        return OpenFireResponse.newBuilder()
            .mergeFrom(this)
            .setX(value)
            .build();
    }

    public int getY() {
        return y;
    }

    public boolean hasY() {
        return (__bitField0 & 4) == 4;
    }

    public OpenFireResponse withY(int value) {
        return OpenFireResponse.newBuilder()
            .mergeFrom(this)
            .setY(value)
            .build();
    }

    public int getValue() {
        return value;
    }

    public boolean hasValue() {
        return (__bitField0 & 8) == 8;
    }

    public OpenFireResponse withValue(int value) {
        return OpenFireResponse.newBuilder()
            .mergeFrom(this)
            .setValue(value)
            .build();
    }

    public int getCurrentExp() {
        return currentExp;
    }

    public boolean hasCurrentExp() {
        return (__bitField0 & 16) == 16;
    }

    public OpenFireResponse withCurrentExp(int value) {
        return OpenFireResponse.newBuilder()
            .mergeFrom(this)
            .setCurrentExp(value)
            .build();
    }

    public long getBulletID() {
        return bulletID;
    }

    public boolean hasBulletID() {
        return (__bitField0 & 32) == 32;
    }

    public OpenFireResponse withBulletID(long value) {
        return OpenFireResponse.newBuilder()
            .mergeFrom(this)
            .setBulletID(value)
            .build();
    }

    public int getCurrentGold() {
        return currentGold;
    }

    public boolean hasCurrentGold() {
        return (__bitField0 & 64) == 64;
    }

    public OpenFireResponse withCurrentGold(int value) {
        return OpenFireResponse.newBuilder()
            .mergeFrom(this)
            .setCurrentGold(value)
            .build();
    }

    public int getUnlockGold() {
        return unlockGold;
    }

    public boolean hasUnlockGold() {
        return (__bitField0 & 128) == 128;
    }

    public OpenFireResponse withUnlockGold(int value) {
        return OpenFireResponse.newBuilder()
            .mergeFrom(this)
            .setUnlockGold(value)
            .build();
    }

    public int getBulletType() {
        return bulletType;
    }

    public boolean hasBulletType() {
        return (__bitField0 & 256) == 256;
    }

    public OpenFireResponse withBulletType(int value) {
        return OpenFireResponse.newBuilder()
            .mergeFrom(this)
            .setBulletType(value)
            .build();
    }

    public int getBulletSkill() {
        return bulletSkill;
    }

    public boolean hasBulletSkill() {
        return (__bitField0 & 512) == 512;
    }

    public OpenFireResponse withBulletSkill(int value) {
        return OpenFireResponse.newBuilder()
            .mergeFrom(this)
            .setBulletSkill(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<OpenFireResponse> cachedSchema() {
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
        OpenFireResponse that = (OpenFireResponse) obj;
        if (!java.util.Objects.equals(this.userID, that.userID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.x, that.x)) {
            return false;
        }
        if (!java.util.Objects.equals(this.y, that.y)) {
            return false;
        }
        if (!java.util.Objects.equals(this.value, that.value)) {
            return false;
        }
        if (!java.util.Objects.equals(this.currentExp, that.currentExp)) {
            return false;
        }
        if (!java.util.Objects.equals(this.bulletID, that.bulletID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.currentGold, that.currentGold)) {
            return false;
        }
        if (!java.util.Objects.equals(this.unlockGold, that.unlockGold)) {
            return false;
        }
        if (!java.util.Objects.equals(this.bulletType, that.bulletType)) {
            return false;
        }
        if (!java.util.Objects.equals(this.bulletSkill, that.bulletSkill)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
        result = 31 * result + Integer.hashCode(this.x);
        result = 31 * result + Integer.hashCode(this.y);
        result = 31 * result + Integer.hashCode(this.value);
        result = 31 * result + Integer.hashCode(this.currentExp);
        result = 31 * result + Long.hashCode(this.bulletID);
        result = 31 * result + Integer.hashCode(this.currentGold);
        result = 31 * result + Integer.hashCode(this.unlockGold);
        result = 31 * result + Integer.hashCode(this.bulletType);
        result = 31 * result + Integer.hashCode(this.bulletSkill);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasUserID()) {
            parts.add("userID=" + getUserID());
        }
        if (hasX()) {
            parts.add("x=" + getX());
        }
        if (hasY()) {
            parts.add("y=" + getY());
        }
        if (hasValue()) {
            parts.add("value=" + getValue());
        }
        if (hasCurrentExp()) {
            parts.add("currentExp=" + getCurrentExp());
        }
        if (hasBulletID()) {
            parts.add("bulletID=" + getBulletID());
        }
        if (hasCurrentGold()) {
            parts.add("currentGold=" + getCurrentGold());
        }
        if (hasUnlockGold()) {
            parts.add("unlockGold=" + getUnlockGold());
        }
        if (hasBulletType()) {
            parts.add("bulletType=" + getBulletType());
        }
        if (hasBulletSkill()) {
            parts.add("bulletSkill=" + getBulletSkill());
        }
        return "OpenFireResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<OpenFireResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("userID", 1);
        	__fieldMap.put("x", 2);
        	__fieldMap.put("y", 3);
        	__fieldMap.put("value", 4);
        	__fieldMap.put("currentExp", 5);
        	__fieldMap.put("bulletID", 6);
        	__fieldMap.put("currentGold", 7);
        	__fieldMap.put("unlockGold", 8);
        	__fieldMap.put("bulletType", 9);
        	__fieldMap.put("bulletSkill", 10);
        }

        @Override
        public OpenFireResponse newMessage() {
            return new OpenFireResponse();
        }

        @Override
        public Class<OpenFireResponse> typeClass() {
            return OpenFireResponse.class;
        }

        @Override
        public String messageName() {
            return OpenFireResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return OpenFireResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(OpenFireResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, OpenFireResponse instance) throws java.io.IOException {
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
                    	instance.x = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.y = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.value = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.currentExp = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.bulletID = input.readInt64();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.currentGold = input.readInt32();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.unlockGold = input.readInt32();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 9:
                    	instance.bulletType = input.readInt32();
                    	instance.__bitField0 |= 256;
                    	break;
                    case 10:
                    	instance.bulletSkill = input.readInt32();
                    	instance.__bitField0 |= 512;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, OpenFireResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.userID, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.x, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.y, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.value, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.currentExp, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeInt64(6, instance.bulletID, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeInt32(7, instance.currentGold, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeInt32(8, instance.unlockGold, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeInt32(9, instance.bulletType, false);
            }

            if((instance.__bitField0 & 512) == 512) {
                output.writeInt32(10, instance.bulletSkill, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "userID";
        		case 2: return "x";
        		case 3: return "y";
        		case 4: return "value";
        		case 5: return "currentExp";
        		case 6: return "bulletID";
        		case 7: return "currentGold";
        		case 8: return "unlockGold";
        		case 9: return "bulletType";
        		case 10: return "bulletSkill";
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

        private int x;

        private int y;

        private int value;

        private int currentExp;

        private long bulletID;

        private int currentGold;

        private int unlockGold;

        private int bulletType;

        private int bulletSkill;

        private int __bitField0;

        private Builder() {
            this.userID = "";
            this.x = 0;
            this.y = 0;
            this.value = 0;
            this.currentExp = 0;
            this.bulletID = 0L;
            this.currentGold = 0;
            this.unlockGold = 0;
            this.bulletType = 0;
            this.bulletSkill = 0;
        }

        public Builder mergeFrom(OpenFireResponse instance) {
            if (instance.hasUserID()) {
                this.setUserID(instance.getUserID());
            }

            if (instance.hasX()) {
                this.setX(instance.getX());
            }

            if (instance.hasY()) {
                this.setY(instance.getY());
            }

            if (instance.hasValue()) {
                this.setValue(instance.getValue());
            }

            if (instance.hasCurrentExp()) {
                this.setCurrentExp(instance.getCurrentExp());
            }

            if (instance.hasBulletID()) {
                this.setBulletID(instance.getBulletID());
            }

            if (instance.hasCurrentGold()) {
                this.setCurrentGold(instance.getCurrentGold());
            }

            if (instance.hasUnlockGold()) {
                this.setUnlockGold(instance.getUnlockGold());
            }

            if (instance.hasBulletType()) {
                this.setBulletType(instance.getBulletType());
            }

            if (instance.hasBulletSkill()) {
                this.setBulletSkill(instance.getBulletSkill());
            }

            return this;
        }

        public String getUserID() {
            return userID;
        }

        public Builder setUserID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set OpenFireResponse#userID to null");
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

        public int getX() {
            return x;
        }

        public Builder setX(int value) {
            this.x = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearX() {
            this.x = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasX() {
            return (__bitField0 & 2) == 2;
        }

        public int getY() {
            return y;
        }

        public Builder setY(int value) {
            this.y = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearY() {
            this.y = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasY() {
            return (__bitField0 & 4) == 4;
        }

        public int getValue() {
            return value;
        }

        public Builder setValue(int value) {
            this.value = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearValue() {
            this.value = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasValue() {
            return (__bitField0 & 8) == 8;
        }

        public int getCurrentExp() {
            return currentExp;
        }

        public Builder setCurrentExp(int value) {
            this.currentExp = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearCurrentExp() {
            this.currentExp = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasCurrentExp() {
            return (__bitField0 & 16) == 16;
        }

        public long getBulletID() {
            return bulletID;
        }

        public Builder setBulletID(long value) {
            this.bulletID = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearBulletID() {
            this.bulletID = 0L;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasBulletID() {
            return (__bitField0 & 32) == 32;
        }

        public int getCurrentGold() {
            return currentGold;
        }

        public Builder setCurrentGold(int value) {
            this.currentGold = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearCurrentGold() {
            this.currentGold = 0;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasCurrentGold() {
            return (__bitField0 & 64) == 64;
        }

        public int getUnlockGold() {
            return unlockGold;
        }

        public Builder setUnlockGold(int value) {
            this.unlockGold = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearUnlockGold() {
            this.unlockGold = 0;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasUnlockGold() {
            return (__bitField0 & 128) == 128;
        }

        public int getBulletType() {
            return bulletType;
        }

        public Builder setBulletType(int value) {
            this.bulletType = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearBulletType() {
            this.bulletType = 0;
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasBulletType() {
            return (__bitField0 & 256) == 256;
        }

        public int getBulletSkill() {
            return bulletSkill;
        }

        public Builder setBulletSkill(int value) {
            this.bulletSkill = value;
            __bitField0 |= 512;
            return this;
        }

        public Builder clearBulletSkill() {
            this.bulletSkill = 0;
            __bitField0 &= ~512;
            return this;
        }

        public boolean hasBulletSkill() {
            return (__bitField0 & 512) == 512;
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
            if (!java.util.Objects.equals(this.x, that.x)) {
                return false;
            }
            if (!java.util.Objects.equals(this.y, that.y)) {
                return false;
            }
            if (!java.util.Objects.equals(this.value, that.value)) {
                return false;
            }
            if (!java.util.Objects.equals(this.currentExp, that.currentExp)) {
                return false;
            }
            if (!java.util.Objects.equals(this.bulletID, that.bulletID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.currentGold, that.currentGold)) {
                return false;
            }
            if (!java.util.Objects.equals(this.unlockGold, that.unlockGold)) {
                return false;
            }
            if (!java.util.Objects.equals(this.bulletType, that.bulletType)) {
                return false;
            }
            if (!java.util.Objects.equals(this.bulletSkill, that.bulletSkill)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
            result = 31 * result + Integer.hashCode(this.x);
            result = 31 * result + Integer.hashCode(this.y);
            result = 31 * result + Integer.hashCode(this.value);
            result = 31 * result + Integer.hashCode(this.currentExp);
            result = 31 * result + Long.hashCode(this.bulletID);
            result = 31 * result + Integer.hashCode(this.currentGold);
            result = 31 * result + Integer.hashCode(this.unlockGold);
            result = 31 * result + Integer.hashCode(this.bulletType);
            result = 31 * result + Integer.hashCode(this.bulletSkill);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasUserID()) {
                parts.add("userID=" + getUserID());
            }
            if (hasX()) {
                parts.add("x=" + getX());
            }
            if (hasY()) {
                parts.add("y=" + getY());
            }
            if (hasValue()) {
                parts.add("value=" + getValue());
            }
            if (hasCurrentExp()) {
                parts.add("currentExp=" + getCurrentExp());
            }
            if (hasBulletID()) {
                parts.add("bulletID=" + getBulletID());
            }
            if (hasCurrentGold()) {
                parts.add("currentGold=" + getCurrentGold());
            }
            if (hasUnlockGold()) {
                parts.add("unlockGold=" + getUnlockGold());
            }
            if (hasBulletType()) {
                parts.add("bulletType=" + getBulletType());
            }
            if (hasBulletSkill()) {
                parts.add("bulletSkill=" + getBulletSkill());
            }
            return "OpenFireResponse{" + String.join(", ", parts) + "}";
        }

        public OpenFireResponse build() {
            proto.message.OpenFireResponse result = new proto.message.OpenFireResponse();
            result.__bitField0 = __bitField0;
            result.userID = this.userID;
            result.x = this.x;
            result.y = this.y;
            result.value = this.value;
            result.currentExp = this.currentExp;
            result.bulletID = this.bulletID;
            result.currentGold = this.currentGold;
            result.unlockGold = this.unlockGold;
            result.bulletType = this.bulletType;
            result.bulletSkill = this.bulletSkill;
            return result;
        }

    }



}