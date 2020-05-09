package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class OpenFireRequest
        implements io.protostuff.Message<OpenFireRequest> {

    private static final OpenFireRequest DEFAULT_INSTANCE = newBuilder().build();

    private String userID;

    private int x;

    private int y;

    private int value;

    private long bulletID;

    private int bulletType;

    private int bulletSkill;

    private boolean __merge_lock = false;
    private int __bitField0;

    private OpenFireRequest() {
        this.userID = "";
        this.x = 0;
        this.y = 0;
        this.value = 0;
        this.bulletID = 0L;
        this.bulletType = 0;
        this.bulletSkill = 0;
    }

    private OpenFireRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static OpenFireRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<OpenFireRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getUserID() {
        return userID;
    }

    public boolean hasUserID() {
        return (__bitField0 & 1) == 1;
    }

    public OpenFireRequest withUserID(String value) {
        return OpenFireRequest.newBuilder()
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

    public OpenFireRequest withX(int value) {
        return OpenFireRequest.newBuilder()
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

    public OpenFireRequest withY(int value) {
        return OpenFireRequest.newBuilder()
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

    public OpenFireRequest withValue(int value) {
        return OpenFireRequest.newBuilder()
            .mergeFrom(this)
            .setValue(value)
            .build();
    }

    public long getBulletID() {
        return bulletID;
    }

    public boolean hasBulletID() {
        return (__bitField0 & 16) == 16;
    }

    public OpenFireRequest withBulletID(long value) {
        return OpenFireRequest.newBuilder()
            .mergeFrom(this)
            .setBulletID(value)
            .build();
    }

    public int getBulletType() {
        return bulletType;
    }

    public boolean hasBulletType() {
        return (__bitField0 & 32) == 32;
    }

    public OpenFireRequest withBulletType(int value) {
        return OpenFireRequest.newBuilder()
            .mergeFrom(this)
            .setBulletType(value)
            .build();
    }

    public int getBulletSkill() {
        return bulletSkill;
    }

    public boolean hasBulletSkill() {
        return (__bitField0 & 64) == 64;
    }

    public OpenFireRequest withBulletSkill(int value) {
        return OpenFireRequest.newBuilder()
            .mergeFrom(this)
            .setBulletSkill(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<OpenFireRequest> cachedSchema() {
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
        OpenFireRequest that = (OpenFireRequest) obj;
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
        if (!java.util.Objects.equals(this.bulletID, that.bulletID)) {
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
        result = 31 * result + Long.hashCode(this.bulletID);
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
        if (hasBulletID()) {
            parts.add("bulletID=" + getBulletID());
        }
        if (hasBulletType()) {
            parts.add("bulletType=" + getBulletType());
        }
        if (hasBulletSkill()) {
            parts.add("bulletSkill=" + getBulletSkill());
        }
        return "OpenFireRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<OpenFireRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("userID", 1);
        	__fieldMap.put("x", 2);
        	__fieldMap.put("y", 3);
        	__fieldMap.put("value", 4);
        	__fieldMap.put("bulletID", 5);
        	__fieldMap.put("bulletType", 6);
        	__fieldMap.put("bulletSkill", 7);
        }

        @Override
        public OpenFireRequest newMessage() {
            return new OpenFireRequest();
        }

        @Override
        public Class<OpenFireRequest> typeClass() {
            return OpenFireRequest.class;
        }

        @Override
        public String messageName() {
            return OpenFireRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return OpenFireRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(OpenFireRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, OpenFireRequest instance) throws java.io.IOException {
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
                    	instance.bulletID = input.readInt64();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.bulletType = input.readInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.bulletSkill = input.readInt32();
                    	instance.__bitField0 |= 64;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, OpenFireRequest instance) throws java.io.IOException {
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
                output.writeInt64(5, instance.bulletID, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeInt32(6, instance.bulletType, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeInt32(7, instance.bulletSkill, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "userID";
        		case 2: return "x";
        		case 3: return "y";
        		case 4: return "value";
        		case 5: return "bulletID";
        		case 6: return "bulletType";
        		case 7: return "bulletSkill";
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

        private long bulletID;

        private int bulletType;

        private int bulletSkill;

        private int __bitField0;

        private Builder() {
            this.userID = "";
            this.x = 0;
            this.y = 0;
            this.value = 0;
            this.bulletID = 0L;
            this.bulletType = 0;
            this.bulletSkill = 0;
        }

        public Builder mergeFrom(OpenFireRequest instance) {
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

            if (instance.hasBulletID()) {
                this.setBulletID(instance.getBulletID());
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
                throw new NullPointerException("Cannot set OpenFireRequest#userID to null");
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

        public long getBulletID() {
            return bulletID;
        }

        public Builder setBulletID(long value) {
            this.bulletID = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearBulletID() {
            this.bulletID = 0L;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasBulletID() {
            return (__bitField0 & 16) == 16;
        }

        public int getBulletType() {
            return bulletType;
        }

        public Builder setBulletType(int value) {
            this.bulletType = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearBulletType() {
            this.bulletType = 0;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasBulletType() {
            return (__bitField0 & 32) == 32;
        }

        public int getBulletSkill() {
            return bulletSkill;
        }

        public Builder setBulletSkill(int value) {
            this.bulletSkill = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearBulletSkill() {
            this.bulletSkill = 0;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasBulletSkill() {
            return (__bitField0 & 64) == 64;
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
            if (!java.util.Objects.equals(this.bulletID, that.bulletID)) {
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
            result = 31 * result + Long.hashCode(this.bulletID);
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
            if (hasBulletID()) {
                parts.add("bulletID=" + getBulletID());
            }
            if (hasBulletType()) {
                parts.add("bulletType=" + getBulletType());
            }
            if (hasBulletSkill()) {
                parts.add("bulletSkill=" + getBulletSkill());
            }
            return "OpenFireRequest{" + String.join(", ", parts) + "}";
        }

        public OpenFireRequest build() {
            proto.message.OpenFireRequest result = new proto.message.OpenFireRequest();
            result.__bitField0 = __bitField0;
            result.userID = this.userID;
            result.x = this.x;
            result.y = this.y;
            result.value = this.value;
            result.bulletID = this.bulletID;
            result.bulletType = this.bulletType;
            result.bulletSkill = this.bulletSkill;
            return result;
        }

    }



}