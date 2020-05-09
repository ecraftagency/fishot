package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class FriendDetail
        implements io.protostuff.Message<FriendDetail> {

    private static final FriendDetail DEFAULT_INSTANCE = newBuilder().build();

    private String userID;

    private String userName;

    private String userAvatar;

    private int userLevel;

    private int userExp;

    private int userGold;

    private boolean hasGift;

    private boolean sentGift;

    private int unlockGold;

    private String userFacebookId;

    private String userZaloId;

    private boolean canChallenge;

    private boolean canTag;

    private boolean __merge_lock = false;
    private int __bitField0;

    private FriendDetail() {
        this.userID = "";
        this.userName = "";
        this.userAvatar = "";
        this.userLevel = 0;
        this.userExp = 0;
        this.userGold = 0;
        this.hasGift = false;
        this.sentGift = false;
        this.unlockGold = 0;
        this.userFacebookId = "";
        this.userZaloId = "";
        this.canChallenge = false;
        this.canTag = false;
    }

    private FriendDetail(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static FriendDetail getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<FriendDetail> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getUserID() {
        return userID;
    }

    public boolean hasUserID() {
        return (__bitField0 & 1) == 1;
    }

    public FriendDetail withUserID(String value) {
        return FriendDetail.newBuilder()
            .mergeFrom(this)
            .setUserID(value)
            .build();
    }

    public String getUserName() {
        return userName;
    }

    public boolean hasUserName() {
        return (__bitField0 & 2) == 2;
    }

    public FriendDetail withUserName(String value) {
        return FriendDetail.newBuilder()
            .mergeFrom(this)
            .setUserName(value)
            .build();
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public boolean hasUserAvatar() {
        return (__bitField0 & 4) == 4;
    }

    public FriendDetail withUserAvatar(String value) {
        return FriendDetail.newBuilder()
            .mergeFrom(this)
            .setUserAvatar(value)
            .build();
    }

    public int getUserLevel() {
        return userLevel;
    }

    public boolean hasUserLevel() {
        return (__bitField0 & 8) == 8;
    }

    public FriendDetail withUserLevel(int value) {
        return FriendDetail.newBuilder()
            .mergeFrom(this)
            .setUserLevel(value)
            .build();
    }

    public int getUserExp() {
        return userExp;
    }

    public boolean hasUserExp() {
        return (__bitField0 & 16) == 16;
    }

    public FriendDetail withUserExp(int value) {
        return FriendDetail.newBuilder()
            .mergeFrom(this)
            .setUserExp(value)
            .build();
    }

    public int getUserGold() {
        return userGold;
    }

    public boolean hasUserGold() {
        return (__bitField0 & 32) == 32;
    }

    public FriendDetail withUserGold(int value) {
        return FriendDetail.newBuilder()
            .mergeFrom(this)
            .setUserGold(value)
            .build();
    }

    public boolean getHasGift() {
        return hasGift;
    }

    public boolean hasHasGift() {
        return (__bitField0 & 64) == 64;
    }

    public FriendDetail withHasGift(boolean value) {
        return FriendDetail.newBuilder()
            .mergeFrom(this)
            .setHasGift(value)
            .build();
    }

    public boolean getSentGift() {
        return sentGift;
    }

    public boolean hasSentGift() {
        return (__bitField0 & 128) == 128;
    }

    public FriendDetail withSentGift(boolean value) {
        return FriendDetail.newBuilder()
            .mergeFrom(this)
            .setSentGift(value)
            .build();
    }

    public int getUnlockGold() {
        return unlockGold;
    }

    public boolean hasUnlockGold() {
        return (__bitField0 & 256) == 256;
    }

    public FriendDetail withUnlockGold(int value) {
        return FriendDetail.newBuilder()
            .mergeFrom(this)
            .setUnlockGold(value)
            .build();
    }

    public String getUserFacebookId() {
        return userFacebookId;
    }

    public boolean hasUserFacebookId() {
        return (__bitField0 & 512) == 512;
    }

    public FriendDetail withUserFacebookId(String value) {
        return FriendDetail.newBuilder()
            .mergeFrom(this)
            .setUserFacebookId(value)
            .build();
    }

    public String getUserZaloId() {
        return userZaloId;
    }

    public boolean hasUserZaloId() {
        return (__bitField0 & 1024) == 1024;
    }

    public FriendDetail withUserZaloId(String value) {
        return FriendDetail.newBuilder()
            .mergeFrom(this)
            .setUserZaloId(value)
            .build();
    }

    public boolean getCanChallenge() {
        return canChallenge;
    }

    public boolean hasCanChallenge() {
        return (__bitField0 & 2048) == 2048;
    }

    public FriendDetail withCanChallenge(boolean value) {
        return FriendDetail.newBuilder()
            .mergeFrom(this)
            .setCanChallenge(value)
            .build();
    }

    public boolean getCanTag() {
        return canTag;
    }

    public boolean hasCanTag() {
        return (__bitField0 & 4096) == 4096;
    }

    public FriendDetail withCanTag(boolean value) {
        return FriendDetail.newBuilder()
            .mergeFrom(this)
            .setCanTag(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<FriendDetail> cachedSchema() {
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
        FriendDetail that = (FriendDetail) obj;
        if (!java.util.Objects.equals(this.userID, that.userID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.userName, that.userName)) {
            return false;
        }
        if (!java.util.Objects.equals(this.userAvatar, that.userAvatar)) {
            return false;
        }
        if (!java.util.Objects.equals(this.userLevel, that.userLevel)) {
            return false;
        }
        if (!java.util.Objects.equals(this.userExp, that.userExp)) {
            return false;
        }
        if (!java.util.Objects.equals(this.userGold, that.userGold)) {
            return false;
        }
        if (!java.util.Objects.equals(this.hasGift, that.hasGift)) {
            return false;
        }
        if (!java.util.Objects.equals(this.sentGift, that.sentGift)) {
            return false;
        }
        if (!java.util.Objects.equals(this.unlockGold, that.unlockGold)) {
            return false;
        }
        if (!java.util.Objects.equals(this.userFacebookId, that.userFacebookId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.userZaloId, that.userZaloId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.canChallenge, that.canChallenge)) {
            return false;
        }
        if (!java.util.Objects.equals(this.canTag, that.canTag)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
        result = 31 * result + (this.userName == null ? 0 : this.userName.hashCode());
        result = 31 * result + (this.userAvatar == null ? 0 : this.userAvatar.hashCode());
        result = 31 * result + Integer.hashCode(this.userLevel);
        result = 31 * result + Integer.hashCode(this.userExp);
        result = 31 * result + Integer.hashCode(this.userGold);
        result = 31 * result + Boolean.hashCode(this.hasGift);
        result = 31 * result + Boolean.hashCode(this.sentGift);
        result = 31 * result + Integer.hashCode(this.unlockGold);
        result = 31 * result + (this.userFacebookId == null ? 0 : this.userFacebookId.hashCode());
        result = 31 * result + (this.userZaloId == null ? 0 : this.userZaloId.hashCode());
        result = 31 * result + Boolean.hashCode(this.canChallenge);
        result = 31 * result + Boolean.hashCode(this.canTag);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasUserID()) {
            parts.add("userID=" + getUserID());
        }
        if (hasUserName()) {
            parts.add("userName=" + getUserName());
        }
        if (hasUserAvatar()) {
            parts.add("userAvatar=" + getUserAvatar());
        }
        if (hasUserLevel()) {
            parts.add("userLevel=" + getUserLevel());
        }
        if (hasUserExp()) {
            parts.add("userExp=" + getUserExp());
        }
        if (hasUserGold()) {
            parts.add("userGold=" + getUserGold());
        }
        if (hasHasGift()) {
            parts.add("hasGift=" + getHasGift());
        }
        if (hasSentGift()) {
            parts.add("sentGift=" + getSentGift());
        }
        if (hasUnlockGold()) {
            parts.add("unlockGold=" + getUnlockGold());
        }
        if (hasUserFacebookId()) {
            parts.add("userFacebookId=" + getUserFacebookId());
        }
        if (hasUserZaloId()) {
            parts.add("userZaloId=" + getUserZaloId());
        }
        if (hasCanChallenge()) {
            parts.add("canChallenge=" + getCanChallenge());
        }
        if (hasCanTag()) {
            parts.add("canTag=" + getCanTag());
        }
        return "FriendDetail{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<FriendDetail>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("userID", 1);
        	__fieldMap.put("userName", 2);
        	__fieldMap.put("userAvatar", 3);
        	__fieldMap.put("userLevel", 4);
        	__fieldMap.put("userExp", 5);
        	__fieldMap.put("userGold", 6);
        	__fieldMap.put("hasGift", 7);
        	__fieldMap.put("sentGift", 8);
        	__fieldMap.put("unlockGold", 9);
        	__fieldMap.put("userFacebookId", 10);
        	__fieldMap.put("userZaloId", 11);
        	__fieldMap.put("canChallenge", 12);
        	__fieldMap.put("canTag", 13);
        }

        @Override
        public FriendDetail newMessage() {
            return new FriendDetail();
        }

        @Override
        public Class<FriendDetail> typeClass() {
            return FriendDetail.class;
        }

        @Override
        public String messageName() {
            return FriendDetail.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return FriendDetail.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(FriendDetail message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, FriendDetail instance) throws java.io.IOException {
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
                    	instance.userName = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.userAvatar = input.readString();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.userLevel = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.userExp = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.userGold = input.readInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.hasGift = input.readBool();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.sentGift = input.readBool();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 9:
                    	instance.unlockGold = input.readInt32();
                    	instance.__bitField0 |= 256;
                    	break;
                    case 10:
                    	instance.userFacebookId = input.readString();
                    	instance.__bitField0 |= 512;
                    	break;
                    case 11:
                    	instance.userZaloId = input.readString();
                    	instance.__bitField0 |= 1024;
                    	break;
                    case 12:
                    	instance.canChallenge = input.readBool();
                    	instance.__bitField0 |= 2048;
                    	break;
                    case 13:
                    	instance.canTag = input.readBool();
                    	instance.__bitField0 |= 4096;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, FriendDetail instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.userID, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.userName, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeString(3, instance.userAvatar, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.userLevel, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.userExp, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeInt32(6, instance.userGold, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeBool(7, instance.hasGift, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeBool(8, instance.sentGift, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeInt32(9, instance.unlockGold, false);
            }

            if((instance.__bitField0 & 512) == 512) {
                output.writeString(10, instance.userFacebookId, false);
            }

            if((instance.__bitField0 & 1024) == 1024) {
                output.writeString(11, instance.userZaloId, false);
            }

            if((instance.__bitField0 & 2048) == 2048) {
                output.writeBool(12, instance.canChallenge, false);
            }

            if((instance.__bitField0 & 4096) == 4096) {
                output.writeBool(13, instance.canTag, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "userID";
        		case 2: return "userName";
        		case 3: return "userAvatar";
        		case 4: return "userLevel";
        		case 5: return "userExp";
        		case 6: return "userGold";
        		case 7: return "hasGift";
        		case 8: return "sentGift";
        		case 9: return "unlockGold";
        		case 10: return "userFacebookId";
        		case 11: return "userZaloId";
        		case 12: return "canChallenge";
        		case 13: return "canTag";
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

        private String userName;

        private String userAvatar;

        private int userLevel;

        private int userExp;

        private int userGold;

        private boolean hasGift;

        private boolean sentGift;

        private int unlockGold;

        private String userFacebookId;

        private String userZaloId;

        private boolean canChallenge;

        private boolean canTag;

        private int __bitField0;

        private Builder() {
            this.userID = "";
            this.userName = "";
            this.userAvatar = "";
            this.userLevel = 0;
            this.userExp = 0;
            this.userGold = 0;
            this.hasGift = false;
            this.sentGift = false;
            this.unlockGold = 0;
            this.userFacebookId = "";
            this.userZaloId = "";
            this.canChallenge = false;
            this.canTag = false;
        }

        public Builder mergeFrom(FriendDetail instance) {
            if (instance.hasUserID()) {
                this.setUserID(instance.getUserID());
            }

            if (instance.hasUserName()) {
                this.setUserName(instance.getUserName());
            }

            if (instance.hasUserAvatar()) {
                this.setUserAvatar(instance.getUserAvatar());
            }

            if (instance.hasUserLevel()) {
                this.setUserLevel(instance.getUserLevel());
            }

            if (instance.hasUserExp()) {
                this.setUserExp(instance.getUserExp());
            }

            if (instance.hasUserGold()) {
                this.setUserGold(instance.getUserGold());
            }

            if (instance.hasHasGift()) {
                this.setHasGift(instance.getHasGift());
            }

            if (instance.hasSentGift()) {
                this.setSentGift(instance.getSentGift());
            }

            if (instance.hasUnlockGold()) {
                this.setUnlockGold(instance.getUnlockGold());
            }

            if (instance.hasUserFacebookId()) {
                this.setUserFacebookId(instance.getUserFacebookId());
            }

            if (instance.hasUserZaloId()) {
                this.setUserZaloId(instance.getUserZaloId());
            }

            if (instance.hasCanChallenge()) {
                this.setCanChallenge(instance.getCanChallenge());
            }

            if (instance.hasCanTag()) {
                this.setCanTag(instance.getCanTag());
            }

            return this;
        }

        public String getUserID() {
            return userID;
        }

        public Builder setUserID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendDetail#userID to null");
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

        public String getUserName() {
            return userName;
        }

        public Builder setUserName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendDetail#userName to null");
            }

            this.userName = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearUserName() {
            this.userName = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasUserName() {
            return (__bitField0 & 2) == 2;
        }

        public String getUserAvatar() {
            return userAvatar;
        }

        public Builder setUserAvatar(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendDetail#userAvatar to null");
            }

            this.userAvatar = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearUserAvatar() {
            this.userAvatar = "";
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasUserAvatar() {
            return (__bitField0 & 4) == 4;
        }

        public int getUserLevel() {
            return userLevel;
        }

        public Builder setUserLevel(int value) {
            this.userLevel = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearUserLevel() {
            this.userLevel = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasUserLevel() {
            return (__bitField0 & 8) == 8;
        }

        public int getUserExp() {
            return userExp;
        }

        public Builder setUserExp(int value) {
            this.userExp = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearUserExp() {
            this.userExp = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasUserExp() {
            return (__bitField0 & 16) == 16;
        }

        public int getUserGold() {
            return userGold;
        }

        public Builder setUserGold(int value) {
            this.userGold = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearUserGold() {
            this.userGold = 0;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasUserGold() {
            return (__bitField0 & 32) == 32;
        }

        public boolean getHasGift() {
            return hasGift;
        }

        public Builder setHasGift(boolean value) {
            this.hasGift = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearHasGift() {
            this.hasGift = false;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasHasGift() {
            return (__bitField0 & 64) == 64;
        }

        public boolean getSentGift() {
            return sentGift;
        }

        public Builder setSentGift(boolean value) {
            this.sentGift = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearSentGift() {
            this.sentGift = false;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasSentGift() {
            return (__bitField0 & 128) == 128;
        }

        public int getUnlockGold() {
            return unlockGold;
        }

        public Builder setUnlockGold(int value) {
            this.unlockGold = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearUnlockGold() {
            this.unlockGold = 0;
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasUnlockGold() {
            return (__bitField0 & 256) == 256;
        }

        public String getUserFacebookId() {
            return userFacebookId;
        }

        public Builder setUserFacebookId(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendDetail#userFacebookId to null");
            }

            this.userFacebookId = value;
            __bitField0 |= 512;
            return this;
        }

        public Builder clearUserFacebookId() {
            this.userFacebookId = "";
            __bitField0 &= ~512;
            return this;
        }

        public boolean hasUserFacebookId() {
            return (__bitField0 & 512) == 512;
        }

        public String getUserZaloId() {
            return userZaloId;
        }

        public Builder setUserZaloId(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendDetail#userZaloId to null");
            }

            this.userZaloId = value;
            __bitField0 |= 1024;
            return this;
        }

        public Builder clearUserZaloId() {
            this.userZaloId = "";
            __bitField0 &= ~1024;
            return this;
        }

        public boolean hasUserZaloId() {
            return (__bitField0 & 1024) == 1024;
        }

        public boolean getCanChallenge() {
            return canChallenge;
        }

        public Builder setCanChallenge(boolean value) {
            this.canChallenge = value;
            __bitField0 |= 2048;
            return this;
        }

        public Builder clearCanChallenge() {
            this.canChallenge = false;
            __bitField0 &= ~2048;
            return this;
        }

        public boolean hasCanChallenge() {
            return (__bitField0 & 2048) == 2048;
        }

        public boolean getCanTag() {
            return canTag;
        }

        public Builder setCanTag(boolean value) {
            this.canTag = value;
            __bitField0 |= 4096;
            return this;
        }

        public Builder clearCanTag() {
            this.canTag = false;
            __bitField0 &= ~4096;
            return this;
        }

        public boolean hasCanTag() {
            return (__bitField0 & 4096) == 4096;
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
            if (!java.util.Objects.equals(this.userName, that.userName)) {
                return false;
            }
            if (!java.util.Objects.equals(this.userAvatar, that.userAvatar)) {
                return false;
            }
            if (!java.util.Objects.equals(this.userLevel, that.userLevel)) {
                return false;
            }
            if (!java.util.Objects.equals(this.userExp, that.userExp)) {
                return false;
            }
            if (!java.util.Objects.equals(this.userGold, that.userGold)) {
                return false;
            }
            if (!java.util.Objects.equals(this.hasGift, that.hasGift)) {
                return false;
            }
            if (!java.util.Objects.equals(this.sentGift, that.sentGift)) {
                return false;
            }
            if (!java.util.Objects.equals(this.unlockGold, that.unlockGold)) {
                return false;
            }
            if (!java.util.Objects.equals(this.userFacebookId, that.userFacebookId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.userZaloId, that.userZaloId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.canChallenge, that.canChallenge)) {
                return false;
            }
            if (!java.util.Objects.equals(this.canTag, that.canTag)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
            result = 31 * result + (this.userName == null ? 0 : this.userName.hashCode());
            result = 31 * result + (this.userAvatar == null ? 0 : this.userAvatar.hashCode());
            result = 31 * result + Integer.hashCode(this.userLevel);
            result = 31 * result + Integer.hashCode(this.userExp);
            result = 31 * result + Integer.hashCode(this.userGold);
            result = 31 * result + Boolean.hashCode(this.hasGift);
            result = 31 * result + Boolean.hashCode(this.sentGift);
            result = 31 * result + Integer.hashCode(this.unlockGold);
            result = 31 * result + (this.userFacebookId == null ? 0 : this.userFacebookId.hashCode());
            result = 31 * result + (this.userZaloId == null ? 0 : this.userZaloId.hashCode());
            result = 31 * result + Boolean.hashCode(this.canChallenge);
            result = 31 * result + Boolean.hashCode(this.canTag);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasUserID()) {
                parts.add("userID=" + getUserID());
            }
            if (hasUserName()) {
                parts.add("userName=" + getUserName());
            }
            if (hasUserAvatar()) {
                parts.add("userAvatar=" + getUserAvatar());
            }
            if (hasUserLevel()) {
                parts.add("userLevel=" + getUserLevel());
            }
            if (hasUserExp()) {
                parts.add("userExp=" + getUserExp());
            }
            if (hasUserGold()) {
                parts.add("userGold=" + getUserGold());
            }
            if (hasHasGift()) {
                parts.add("hasGift=" + getHasGift());
            }
            if (hasSentGift()) {
                parts.add("sentGift=" + getSentGift());
            }
            if (hasUnlockGold()) {
                parts.add("unlockGold=" + getUnlockGold());
            }
            if (hasUserFacebookId()) {
                parts.add("userFacebookId=" + getUserFacebookId());
            }
            if (hasUserZaloId()) {
                parts.add("userZaloId=" + getUserZaloId());
            }
            if (hasCanChallenge()) {
                parts.add("canChallenge=" + getCanChallenge());
            }
            if (hasCanTag()) {
                parts.add("canTag=" + getCanTag());
            }
            return "FriendDetail{" + String.join(", ", parts) + "}";
        }

        public FriendDetail build() {
            proto.message.FriendDetail result = new proto.message.FriendDetail();
            result.__bitField0 = __bitField0;
            result.userID = this.userID;
            result.userName = this.userName;
            result.userAvatar = this.userAvatar;
            result.userLevel = this.userLevel;
            result.userExp = this.userExp;
            result.userGold = this.userGold;
            result.hasGift = this.hasGift;
            result.sentGift = this.sentGift;
            result.unlockGold = this.unlockGold;
            result.userFacebookId = this.userFacebookId;
            result.userZaloId = this.userZaloId;
            result.canChallenge = this.canChallenge;
            result.canTag = this.canTag;
            return result;
        }

    }



}