package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class RoomInfor
        implements io.protostuff.Message<RoomInfor> {

    private static final RoomInfor DEFAULT_INSTANCE = newBuilder().build();

    private int roomID;

    private String roomName;

    private int roomType;

    private int minLevel;

    private int maxLevel;

    private boolean canJoin;

    private int roomBullet;

    private int minChannel;

    private int maxChannel;

    private boolean __merge_lock = false;
    private int __bitField0;

    private RoomInfor() {
        this.roomID = 0;
        this.roomName = "";
        this.roomType = 0;
        this.minLevel = 0;
        this.maxLevel = 0;
        this.canJoin = false;
        this.roomBullet = 0;
        this.minChannel = 0;
        this.maxChannel = 0;
    }

    private RoomInfor(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static RoomInfor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<RoomInfor> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getRoomID() {
        return roomID;
    }

    public boolean hasRoomID() {
        return (__bitField0 & 1) == 1;
    }

    public RoomInfor withRoomID(int value) {
        return RoomInfor.newBuilder()
            .mergeFrom(this)
            .setRoomID(value)
            .build();
    }

    public String getRoomName() {
        return roomName;
    }

    public boolean hasRoomName() {
        return (__bitField0 & 2) == 2;
    }

    public RoomInfor withRoomName(String value) {
        return RoomInfor.newBuilder()
            .mergeFrom(this)
            .setRoomName(value)
            .build();
    }

    public int getRoomType() {
        return roomType;
    }

    public boolean hasRoomType() {
        return (__bitField0 & 4) == 4;
    }

    public RoomInfor withRoomType(int value) {
        return RoomInfor.newBuilder()
            .mergeFrom(this)
            .setRoomType(value)
            .build();
    }

    public int getMinLevel() {
        return minLevel;
    }

    public boolean hasMinLevel() {
        return (__bitField0 & 8) == 8;
    }

    public RoomInfor withMinLevel(int value) {
        return RoomInfor.newBuilder()
            .mergeFrom(this)
            .setMinLevel(value)
            .build();
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public boolean hasMaxLevel() {
        return (__bitField0 & 16) == 16;
    }

    public RoomInfor withMaxLevel(int value) {
        return RoomInfor.newBuilder()
            .mergeFrom(this)
            .setMaxLevel(value)
            .build();
    }

    public boolean getCanJoin() {
        return canJoin;
    }

    public boolean hasCanJoin() {
        return (__bitField0 & 32) == 32;
    }

    public RoomInfor withCanJoin(boolean value) {
        return RoomInfor.newBuilder()
            .mergeFrom(this)
            .setCanJoin(value)
            .build();
    }

    public int getRoomBullet() {
        return roomBullet;
    }

    public boolean hasRoomBullet() {
        return (__bitField0 & 64) == 64;
    }

    public RoomInfor withRoomBullet(int value) {
        return RoomInfor.newBuilder()
            .mergeFrom(this)
            .setRoomBullet(value)
            .build();
    }

    public int getMinChannel() {
        return minChannel;
    }

    public boolean hasMinChannel() {
        return (__bitField0 & 128) == 128;
    }

    public RoomInfor withMinChannel(int value) {
        return RoomInfor.newBuilder()
            .mergeFrom(this)
            .setMinChannel(value)
            .build();
    }

    public int getMaxChannel() {
        return maxChannel;
    }

    public boolean hasMaxChannel() {
        return (__bitField0 & 256) == 256;
    }

    public RoomInfor withMaxChannel(int value) {
        return RoomInfor.newBuilder()
            .mergeFrom(this)
            .setMaxChannel(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<RoomInfor> cachedSchema() {
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
        RoomInfor that = (RoomInfor) obj;
        if (!java.util.Objects.equals(this.roomID, that.roomID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.roomName, that.roomName)) {
            return false;
        }
        if (!java.util.Objects.equals(this.roomType, that.roomType)) {
            return false;
        }
        if (!java.util.Objects.equals(this.minLevel, that.minLevel)) {
            return false;
        }
        if (!java.util.Objects.equals(this.maxLevel, that.maxLevel)) {
            return false;
        }
        if (!java.util.Objects.equals(this.canJoin, that.canJoin)) {
            return false;
        }
        if (!java.util.Objects.equals(this.roomBullet, that.roomBullet)) {
            return false;
        }
        if (!java.util.Objects.equals(this.minChannel, that.minChannel)) {
            return false;
        }
        if (!java.util.Objects.equals(this.maxChannel, that.maxChannel)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.roomID);
        result = 31 * result + (this.roomName == null ? 0 : this.roomName.hashCode());
        result = 31 * result + Integer.hashCode(this.roomType);
        result = 31 * result + Integer.hashCode(this.minLevel);
        result = 31 * result + Integer.hashCode(this.maxLevel);
        result = 31 * result + Boolean.hashCode(this.canJoin);
        result = 31 * result + Integer.hashCode(this.roomBullet);
        result = 31 * result + Integer.hashCode(this.minChannel);
        result = 31 * result + Integer.hashCode(this.maxChannel);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasRoomID()) {
            parts.add("roomID=" + getRoomID());
        }
        if (hasRoomName()) {
            parts.add("roomName=" + getRoomName());
        }
        if (hasRoomType()) {
            parts.add("roomType=" + getRoomType());
        }
        if (hasMinLevel()) {
            parts.add("minLevel=" + getMinLevel());
        }
        if (hasMaxLevel()) {
            parts.add("maxLevel=" + getMaxLevel());
        }
        if (hasCanJoin()) {
            parts.add("canJoin=" + getCanJoin());
        }
        if (hasRoomBullet()) {
            parts.add("roomBullet=" + getRoomBullet());
        }
        if (hasMinChannel()) {
            parts.add("minChannel=" + getMinChannel());
        }
        if (hasMaxChannel()) {
            parts.add("maxChannel=" + getMaxChannel());
        }
        return "RoomInfor{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<RoomInfor>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("roomID", 1);
        	__fieldMap.put("roomName", 2);
        	__fieldMap.put("roomType", 3);
        	__fieldMap.put("minLevel", 4);
        	__fieldMap.put("maxLevel", 5);
        	__fieldMap.put("canJoin", 6);
        	__fieldMap.put("roomBullet", 7);
        	__fieldMap.put("minChannel", 8);
        	__fieldMap.put("maxChannel", 9);
        }

        @Override
        public RoomInfor newMessage() {
            return new RoomInfor();
        }

        @Override
        public Class<RoomInfor> typeClass() {
            return RoomInfor.class;
        }

        @Override
        public String messageName() {
            return RoomInfor.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return RoomInfor.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(RoomInfor message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, RoomInfor instance) throws java.io.IOException {
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
                    	instance.roomID = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.roomName = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.roomType = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.minLevel = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.maxLevel = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.canJoin = input.readBool();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.roomBullet = input.readInt32();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.minChannel = input.readInt32();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 9:
                    	instance.maxChannel = input.readInt32();
                    	instance.__bitField0 |= 256;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, RoomInfor instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.roomID, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.roomName, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.roomType, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.minLevel, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.maxLevel, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeBool(6, instance.canJoin, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeInt32(7, instance.roomBullet, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeInt32(8, instance.minChannel, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeInt32(9, instance.maxChannel, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "roomID";
        		case 2: return "roomName";
        		case 3: return "roomType";
        		case 4: return "minLevel";
        		case 5: return "maxLevel";
        		case 6: return "canJoin";
        		case 7: return "roomBullet";
        		case 8: return "minChannel";
        		case 9: return "maxChannel";
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

        private int roomID;

        private String roomName;

        private int roomType;

        private int minLevel;

        private int maxLevel;

        private boolean canJoin;

        private int roomBullet;

        private int minChannel;

        private int maxChannel;

        private int __bitField0;

        private Builder() {
            this.roomID = 0;
            this.roomName = "";
            this.roomType = 0;
            this.minLevel = 0;
            this.maxLevel = 0;
            this.canJoin = false;
            this.roomBullet = 0;
            this.minChannel = 0;
            this.maxChannel = 0;
        }

        public Builder mergeFrom(RoomInfor instance) {
            if (instance.hasRoomID()) {
                this.setRoomID(instance.getRoomID());
            }

            if (instance.hasRoomName()) {
                this.setRoomName(instance.getRoomName());
            }

            if (instance.hasRoomType()) {
                this.setRoomType(instance.getRoomType());
            }

            if (instance.hasMinLevel()) {
                this.setMinLevel(instance.getMinLevel());
            }

            if (instance.hasMaxLevel()) {
                this.setMaxLevel(instance.getMaxLevel());
            }

            if (instance.hasCanJoin()) {
                this.setCanJoin(instance.getCanJoin());
            }

            if (instance.hasRoomBullet()) {
                this.setRoomBullet(instance.getRoomBullet());
            }

            if (instance.hasMinChannel()) {
                this.setMinChannel(instance.getMinChannel());
            }

            if (instance.hasMaxChannel()) {
                this.setMaxChannel(instance.getMaxChannel());
            }

            return this;
        }

        public int getRoomID() {
            return roomID;
        }

        public Builder setRoomID(int value) {
            this.roomID = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearRoomID() {
            this.roomID = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasRoomID() {
            return (__bitField0 & 1) == 1;
        }

        public String getRoomName() {
            return roomName;
        }

        public Builder setRoomName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set RoomInfor#roomName to null");
            }

            this.roomName = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearRoomName() {
            this.roomName = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasRoomName() {
            return (__bitField0 & 2) == 2;
        }

        public int getRoomType() {
            return roomType;
        }

        public Builder setRoomType(int value) {
            this.roomType = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearRoomType() {
            this.roomType = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasRoomType() {
            return (__bitField0 & 4) == 4;
        }

        public int getMinLevel() {
            return minLevel;
        }

        public Builder setMinLevel(int value) {
            this.minLevel = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearMinLevel() {
            this.minLevel = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasMinLevel() {
            return (__bitField0 & 8) == 8;
        }

        public int getMaxLevel() {
            return maxLevel;
        }

        public Builder setMaxLevel(int value) {
            this.maxLevel = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearMaxLevel() {
            this.maxLevel = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasMaxLevel() {
            return (__bitField0 & 16) == 16;
        }

        public boolean getCanJoin() {
            return canJoin;
        }

        public Builder setCanJoin(boolean value) {
            this.canJoin = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearCanJoin() {
            this.canJoin = false;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasCanJoin() {
            return (__bitField0 & 32) == 32;
        }

        public int getRoomBullet() {
            return roomBullet;
        }

        public Builder setRoomBullet(int value) {
            this.roomBullet = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearRoomBullet() {
            this.roomBullet = 0;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasRoomBullet() {
            return (__bitField0 & 64) == 64;
        }

        public int getMinChannel() {
            return minChannel;
        }

        public Builder setMinChannel(int value) {
            this.minChannel = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearMinChannel() {
            this.minChannel = 0;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasMinChannel() {
            return (__bitField0 & 128) == 128;
        }

        public int getMaxChannel() {
            return maxChannel;
        }

        public Builder setMaxChannel(int value) {
            this.maxChannel = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearMaxChannel() {
            this.maxChannel = 0;
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasMaxChannel() {
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
            if (!java.util.Objects.equals(this.roomID, that.roomID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.roomName, that.roomName)) {
                return false;
            }
            if (!java.util.Objects.equals(this.roomType, that.roomType)) {
                return false;
            }
            if (!java.util.Objects.equals(this.minLevel, that.minLevel)) {
                return false;
            }
            if (!java.util.Objects.equals(this.maxLevel, that.maxLevel)) {
                return false;
            }
            if (!java.util.Objects.equals(this.canJoin, that.canJoin)) {
                return false;
            }
            if (!java.util.Objects.equals(this.roomBullet, that.roomBullet)) {
                return false;
            }
            if (!java.util.Objects.equals(this.minChannel, that.minChannel)) {
                return false;
            }
            if (!java.util.Objects.equals(this.maxChannel, that.maxChannel)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.roomID);
            result = 31 * result + (this.roomName == null ? 0 : this.roomName.hashCode());
            result = 31 * result + Integer.hashCode(this.roomType);
            result = 31 * result + Integer.hashCode(this.minLevel);
            result = 31 * result + Integer.hashCode(this.maxLevel);
            result = 31 * result + Boolean.hashCode(this.canJoin);
            result = 31 * result + Integer.hashCode(this.roomBullet);
            result = 31 * result + Integer.hashCode(this.minChannel);
            result = 31 * result + Integer.hashCode(this.maxChannel);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasRoomID()) {
                parts.add("roomID=" + getRoomID());
            }
            if (hasRoomName()) {
                parts.add("roomName=" + getRoomName());
            }
            if (hasRoomType()) {
                parts.add("roomType=" + getRoomType());
            }
            if (hasMinLevel()) {
                parts.add("minLevel=" + getMinLevel());
            }
            if (hasMaxLevel()) {
                parts.add("maxLevel=" + getMaxLevel());
            }
            if (hasCanJoin()) {
                parts.add("canJoin=" + getCanJoin());
            }
            if (hasRoomBullet()) {
                parts.add("roomBullet=" + getRoomBullet());
            }
            if (hasMinChannel()) {
                parts.add("minChannel=" + getMinChannel());
            }
            if (hasMaxChannel()) {
                parts.add("maxChannel=" + getMaxChannel());
            }
            return "RoomInfor{" + String.join(", ", parts) + "}";
        }

        public RoomInfor build() {
            proto.message.RoomInfor result = new proto.message.RoomInfor();
            result.__bitField0 = __bitField0;
            result.roomID = this.roomID;
            result.roomName = this.roomName;
            result.roomType = this.roomType;
            result.minLevel = this.minLevel;
            result.maxLevel = this.maxLevel;
            result.canJoin = this.canJoin;
            result.roomBullet = this.roomBullet;
            result.minChannel = this.minChannel;
            result.maxChannel = this.maxChannel;
            return result;
        }

    }



}