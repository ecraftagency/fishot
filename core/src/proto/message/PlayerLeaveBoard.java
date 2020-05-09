package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class PlayerLeaveBoard
        implements io.protostuff.Message<PlayerLeaveBoard> {

    private static final PlayerLeaveBoard DEFAULT_INSTANCE = newBuilder().build();

    private String userID;

    private String content;

    private String userName;

    private String userAvatar;

    private int bethost;

    private String snsName;

    private boolean __merge_lock = false;
    private int __bitField0;

    private PlayerLeaveBoard() {
        this.userID = "";
        this.content = "";
        this.userName = "";
        this.userAvatar = "";
        this.bethost = 0;
        this.snsName = "";
    }

    private PlayerLeaveBoard(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static PlayerLeaveBoard getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<PlayerLeaveBoard> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getUserID() {
        return userID;
    }

    public boolean hasUserID() {
        return (__bitField0 & 1) == 1;
    }

    public PlayerLeaveBoard withUserID(String value) {
        return PlayerLeaveBoard.newBuilder()
            .mergeFrom(this)
            .setUserID(value)
            .build();
    }

    public String getContent() {
        return content;
    }

    public boolean hasContent() {
        return (__bitField0 & 2) == 2;
    }

    public PlayerLeaveBoard withContent(String value) {
        return PlayerLeaveBoard.newBuilder()
            .mergeFrom(this)
            .setContent(value)
            .build();
    }

    public String getUserName() {
        return userName;
    }

    public boolean hasUserName() {
        return (__bitField0 & 4) == 4;
    }

    public PlayerLeaveBoard withUserName(String value) {
        return PlayerLeaveBoard.newBuilder()
            .mergeFrom(this)
            .setUserName(value)
            .build();
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public boolean hasUserAvatar() {
        return (__bitField0 & 8) == 8;
    }

    public PlayerLeaveBoard withUserAvatar(String value) {
        return PlayerLeaveBoard.newBuilder()
            .mergeFrom(this)
            .setUserAvatar(value)
            .build();
    }

    public int getBethost() {
        return bethost;
    }

    public boolean hasBethost() {
        return (__bitField0 & 16) == 16;
    }

    public PlayerLeaveBoard withBethost(int value) {
        return PlayerLeaveBoard.newBuilder()
            .mergeFrom(this)
            .setBethost(value)
            .build();
    }

    public String getSnsName() {
        return snsName;
    }

    public boolean hasSnsName() {
        return (__bitField0 & 32) == 32;
    }

    public PlayerLeaveBoard withSnsName(String value) {
        return PlayerLeaveBoard.newBuilder()
            .mergeFrom(this)
            .setSnsName(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<PlayerLeaveBoard> cachedSchema() {
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
        PlayerLeaveBoard that = (PlayerLeaveBoard) obj;
        if (!java.util.Objects.equals(this.userID, that.userID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.content, that.content)) {
            return false;
        }
        if (!java.util.Objects.equals(this.userName, that.userName)) {
            return false;
        }
        if (!java.util.Objects.equals(this.userAvatar, that.userAvatar)) {
            return false;
        }
        if (!java.util.Objects.equals(this.bethost, that.bethost)) {
            return false;
        }
        if (!java.util.Objects.equals(this.snsName, that.snsName)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
        result = 31 * result + (this.content == null ? 0 : this.content.hashCode());
        result = 31 * result + (this.userName == null ? 0 : this.userName.hashCode());
        result = 31 * result + (this.userAvatar == null ? 0 : this.userAvatar.hashCode());
        result = 31 * result + Integer.hashCode(this.bethost);
        result = 31 * result + (this.snsName == null ? 0 : this.snsName.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasUserID()) {
            parts.add("userID=" + getUserID());
        }
        if (hasContent()) {
            parts.add("content=" + getContent());
        }
        if (hasUserName()) {
            parts.add("userName=" + getUserName());
        }
        if (hasUserAvatar()) {
            parts.add("userAvatar=" + getUserAvatar());
        }
        if (hasBethost()) {
            parts.add("bethost=" + getBethost());
        }
        if (hasSnsName()) {
            parts.add("snsName=" + getSnsName());
        }
        return "PlayerLeaveBoard{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<PlayerLeaveBoard>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("userID", 1);
        	__fieldMap.put("content", 2);
        	__fieldMap.put("userName", 3);
        	__fieldMap.put("userAvatar", 4);
        	__fieldMap.put("bethost", 5);
        	__fieldMap.put("snsName", 6);
        }

        @Override
        public PlayerLeaveBoard newMessage() {
            return new PlayerLeaveBoard();
        }

        @Override
        public Class<PlayerLeaveBoard> typeClass() {
            return PlayerLeaveBoard.class;
        }

        @Override
        public String messageName() {
            return PlayerLeaveBoard.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return PlayerLeaveBoard.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(PlayerLeaveBoard message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, PlayerLeaveBoard instance) throws java.io.IOException {
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
                    	instance.content = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.userName = input.readString();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.userAvatar = input.readString();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.bethost = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.snsName = input.readString();
                    	instance.__bitField0 |= 32;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, PlayerLeaveBoard instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.userID, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.content, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeString(3, instance.userName, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeString(4, instance.userAvatar, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.bethost, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeString(6, instance.snsName, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "userID";
        		case 2: return "content";
        		case 3: return "userName";
        		case 4: return "userAvatar";
        		case 5: return "bethost";
        		case 6: return "snsName";
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

        private String content;

        private String userName;

        private String userAvatar;

        private int bethost;

        private String snsName;

        private int __bitField0;

        private Builder() {
            this.userID = "";
            this.content = "";
            this.userName = "";
            this.userAvatar = "";
            this.bethost = 0;
            this.snsName = "";
        }

        public Builder mergeFrom(PlayerLeaveBoard instance) {
            if (instance.hasUserID()) {
                this.setUserID(instance.getUserID());
            }

            if (instance.hasContent()) {
                this.setContent(instance.getContent());
            }

            if (instance.hasUserName()) {
                this.setUserName(instance.getUserName());
            }

            if (instance.hasUserAvatar()) {
                this.setUserAvatar(instance.getUserAvatar());
            }

            if (instance.hasBethost()) {
                this.setBethost(instance.getBethost());
            }

            if (instance.hasSnsName()) {
                this.setSnsName(instance.getSnsName());
            }

            return this;
        }

        public String getUserID() {
            return userID;
        }

        public Builder setUserID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set PlayerLeaveBoard#userID to null");
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

        public String getContent() {
            return content;
        }

        public Builder setContent(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set PlayerLeaveBoard#content to null");
            }

            this.content = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearContent() {
            this.content = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasContent() {
            return (__bitField0 & 2) == 2;
        }

        public String getUserName() {
            return userName;
        }

        public Builder setUserName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set PlayerLeaveBoard#userName to null");
            }

            this.userName = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearUserName() {
            this.userName = "";
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasUserName() {
            return (__bitField0 & 4) == 4;
        }

        public String getUserAvatar() {
            return userAvatar;
        }

        public Builder setUserAvatar(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set PlayerLeaveBoard#userAvatar to null");
            }

            this.userAvatar = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearUserAvatar() {
            this.userAvatar = "";
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasUserAvatar() {
            return (__bitField0 & 8) == 8;
        }

        public int getBethost() {
            return bethost;
        }

        public Builder setBethost(int value) {
            this.bethost = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearBethost() {
            this.bethost = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasBethost() {
            return (__bitField0 & 16) == 16;
        }

        public String getSnsName() {
            return snsName;
        }

        public Builder setSnsName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set PlayerLeaveBoard#snsName to null");
            }

            this.snsName = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearSnsName() {
            this.snsName = "";
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasSnsName() {
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
            if (!java.util.Objects.equals(this.content, that.content)) {
                return false;
            }
            if (!java.util.Objects.equals(this.userName, that.userName)) {
                return false;
            }
            if (!java.util.Objects.equals(this.userAvatar, that.userAvatar)) {
                return false;
            }
            if (!java.util.Objects.equals(this.bethost, that.bethost)) {
                return false;
            }
            if (!java.util.Objects.equals(this.snsName, that.snsName)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
            result = 31 * result + (this.content == null ? 0 : this.content.hashCode());
            result = 31 * result + (this.userName == null ? 0 : this.userName.hashCode());
            result = 31 * result + (this.userAvatar == null ? 0 : this.userAvatar.hashCode());
            result = 31 * result + Integer.hashCode(this.bethost);
            result = 31 * result + (this.snsName == null ? 0 : this.snsName.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasUserID()) {
                parts.add("userID=" + getUserID());
            }
            if (hasContent()) {
                parts.add("content=" + getContent());
            }
            if (hasUserName()) {
                parts.add("userName=" + getUserName());
            }
            if (hasUserAvatar()) {
                parts.add("userAvatar=" + getUserAvatar());
            }
            if (hasBethost()) {
                parts.add("bethost=" + getBethost());
            }
            if (hasSnsName()) {
                parts.add("snsName=" + getSnsName());
            }
            return "PlayerLeaveBoard{" + String.join(", ", parts) + "}";
        }

        public PlayerLeaveBoard build() {
            proto.message.PlayerLeaveBoard result = new proto.message.PlayerLeaveBoard();
            result.__bitField0 = __bitField0;
            result.userID = this.userID;
            result.content = this.content;
            result.userName = this.userName;
            result.userAvatar = this.userAvatar;
            result.bethost = this.bethost;
            result.snsName = this.snsName;
            return result;
        }

    }



}