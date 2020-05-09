package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class DonateFriendDetail
        implements io.protostuff.Message<DonateFriendDetail> {

    private static final DonateFriendDetail DEFAULT_INSTANCE = newBuilder().build();

    private String userID;

    private String userName;

    private String userAvatar;

    private int userLevel;

    private int userExp;

    private int userGold;

    private java.util.List<proto.message.DailyBonusItem> listDonateGift;

    private boolean canSentGift;

    private String userFacebookId;

    private boolean __merge_lock = false;
    private int __bitField0;

    private DonateFriendDetail() {
        this.userID = "";
        this.userName = "";
        this.userAvatar = "";
        this.userLevel = 0;
        this.userExp = 0;
        this.userGold = 0;
        this.listDonateGift = java.util.Collections.emptyList();
        this.canSentGift = false;
        this.userFacebookId = "";
    }

    private DonateFriendDetail(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static DonateFriendDetail getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<DonateFriendDetail> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getUserID() {
        return userID;
    }

    public boolean hasUserID() {
        return (__bitField0 & 1) == 1;
    }

    public DonateFriendDetail withUserID(String value) {
        return DonateFriendDetail.newBuilder()
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

    public DonateFriendDetail withUserName(String value) {
        return DonateFriendDetail.newBuilder()
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

    public DonateFriendDetail withUserAvatar(String value) {
        return DonateFriendDetail.newBuilder()
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

    public DonateFriendDetail withUserLevel(int value) {
        return DonateFriendDetail.newBuilder()
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

    public DonateFriendDetail withUserExp(int value) {
        return DonateFriendDetail.newBuilder()
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

    public DonateFriendDetail withUserGold(int value) {
        return DonateFriendDetail.newBuilder()
            .mergeFrom(this)
            .setUserGold(value)
            .build();
    }

    public java.util.List<proto.message.DailyBonusItem> getListDonateGiftList() {
        return listDonateGift;
    }

    public int getListDonateGiftCount() {
        return listDonateGift.size();
    }

    public proto.message.DailyBonusItem getListDonateGift(int index) {
        return listDonateGift.get(index);
    }

    public DonateFriendDetail withListDonateGift(java.util.List<proto.message.DailyBonusItem> value) {
        return DonateFriendDetail.newBuilder()
            .mergeFrom(this)
            .clearListDonateGift()
            .addAllListDonateGift(value)
            .build();
    }

    public boolean getCanSentGift() {
        return canSentGift;
    }

    public boolean hasCanSentGift() {
        return (__bitField0 & 128) == 128;
    }

    public DonateFriendDetail withCanSentGift(boolean value) {
        return DonateFriendDetail.newBuilder()
            .mergeFrom(this)
            .setCanSentGift(value)
            .build();
    }

    public String getUserFacebookId() {
        return userFacebookId;
    }

    public boolean hasUserFacebookId() {
        return (__bitField0 & 256) == 256;
    }

    public DonateFriendDetail withUserFacebookId(String value) {
        return DonateFriendDetail.newBuilder()
            .mergeFrom(this)
            .setUserFacebookId(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<DonateFriendDetail> cachedSchema() {
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
        DonateFriendDetail that = (DonateFriendDetail) obj;
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
        if (!java.util.Objects.equals(this.listDonateGift, that.listDonateGift)) {
            return false;
        }
        if (!java.util.Objects.equals(this.canSentGift, that.canSentGift)) {
            return false;
        }
        if (!java.util.Objects.equals(this.userFacebookId, that.userFacebookId)) {
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
        result = 31 * result + (this.listDonateGift == null ? 0 : this.listDonateGift.hashCode());
        result = 31 * result + Boolean.hashCode(this.canSentGift);
        result = 31 * result + (this.userFacebookId == null ? 0 : this.userFacebookId.hashCode());

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
        if (!listDonateGift.isEmpty()) {
            parts.add("listDonateGift=" + getListDonateGiftList());
        }
        if (hasCanSentGift()) {
            parts.add("canSentGift=" + getCanSentGift());
        }
        if (hasUserFacebookId()) {
            parts.add("userFacebookId=" + getUserFacebookId());
        }
        return "DonateFriendDetail{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<DonateFriendDetail>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("userID", 1);
        	__fieldMap.put("userName", 2);
        	__fieldMap.put("userAvatar", 3);
        	__fieldMap.put("userLevel", 4);
        	__fieldMap.put("userExp", 5);
        	__fieldMap.put("userGold", 6);
        	__fieldMap.put("listDonateGift", 7);
        	__fieldMap.put("canSentGift", 8);
        	__fieldMap.put("userFacebookId", 9);
        }

        @Override
        public DonateFriendDetail newMessage() {
            return new DonateFriendDetail();
        }

        @Override
        public Class<DonateFriendDetail> typeClass() {
            return DonateFriendDetail.class;
        }

        @Override
        public String messageName() {
            return DonateFriendDetail.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return DonateFriendDetail.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(DonateFriendDetail message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, DonateFriendDetail instance) throws java.io.IOException {
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
                    	if(!((instance.__bitField0 & 64) == 64)) {
                    	    instance.listDonateGift = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 64;
                    	}
                    	instance.listDonateGift.add(input.mergeObject(null, proto.message.DailyBonusItem.getSchema()));

                    	break;
                    case 8:
                    	instance.canSentGift = input.readBool();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 9:
                    	instance.userFacebookId = input.readString();
                    	instance.__bitField0 |= 256;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 64) == 64) {
                instance.listDonateGift = java.util.Collections.unmodifiableList(instance.listDonateGift);
            }



        }

        @Override
        public void writeTo(io.protostuff.Output output, DonateFriendDetail instance) throws java.io.IOException {
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

            for(proto.message.DailyBonusItem listDonateGift : instance.listDonateGift) {
                output.writeObject(7, listDonateGift, proto.message.DailyBonusItem.getSchema(), true);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeBool(8, instance.canSentGift, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeString(9, instance.userFacebookId, false);
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
        		case 7: return "listDonateGift";
        		case 8: return "canSentGift";
        		case 9: return "userFacebookId";
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

        private java.util.List<proto.message.DailyBonusItem> listDonateGift;

        private boolean canSentGift;

        private String userFacebookId;

        private int __bitField0;

        private Builder() {
            this.userID = "";
            this.userName = "";
            this.userAvatar = "";
            this.userLevel = 0;
            this.userExp = 0;
            this.userGold = 0;
            this.listDonateGift = java.util.Collections.emptyList();
            this.canSentGift = false;
            this.userFacebookId = "";
        }

        public Builder mergeFrom(DonateFriendDetail instance) {
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

            this.addAllListDonateGift(instance.getListDonateGiftList());

            if (instance.hasCanSentGift()) {
                this.setCanSentGift(instance.getCanSentGift());
            }

            if (instance.hasUserFacebookId()) {
                this.setUserFacebookId(instance.getUserFacebookId());
            }

            return this;
        }

        public String getUserID() {
            return userID;
        }

        public Builder setUserID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set DonateFriendDetail#userID to null");
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
                throw new NullPointerException("Cannot set DonateFriendDetail#userName to null");
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
                throw new NullPointerException("Cannot set DonateFriendDetail#userAvatar to null");
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

        public java.util.List<proto.message.DailyBonusItem> getListDonateGiftList() {
            return listDonateGift;
        }

        public Builder setListDonateGift(int index, proto.message.DailyBonusItem value) {
            if (value == null) {
                throw new NullPointerException("Cannot set DonateFriendDetail#listDonateGift to null");
            }

            if(!((__bitField0 & 64) == 64)) {
                this.listDonateGift = new java.util.ArrayList<>();
                __bitField0 |= 64;
            }
            this.listDonateGift.set(index, value);
            return this;
        }

        public Builder addListDonateGift(proto.message.DailyBonusItem value) {
            if (value == null) {
                throw new NullPointerException("Cannot set DonateFriendDetail#listDonateGift to null");
            }

            if(!((__bitField0 & 64) == 64)) {
                this.listDonateGift = new java.util.ArrayList<>();
                __bitField0 |= 64;
            }
            this.listDonateGift.add(value);
            return this;
        }

        public Builder addAllListDonateGift(java.lang.Iterable<proto.message.DailyBonusItem> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set DonateFriendDetail#listDonateGift to null");
            }
            if(!((__bitField0 & 64) == 64)) {
                this.listDonateGift = new java.util.ArrayList<>();
                __bitField0 |= 64;
            }
            for (final proto.message.DailyBonusItem value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set DonateFriendDetail#listDonateGift to null");
                }
                this.listDonateGift.add(value);
            }
            return this;
        }

        public Builder clearListDonateGift() {
            this.listDonateGift = java.util.Collections.emptyList();
            __bitField0 &= ~64;
            return this;
        }

        public int getListDonateGiftCount() {
            return listDonateGift.size();
        }

        public proto.message.DailyBonusItem getListDonateGift(int index) {
            return listDonateGift.get(index);
        }

        public boolean getCanSentGift() {
            return canSentGift;
        }

        public Builder setCanSentGift(boolean value) {
            this.canSentGift = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearCanSentGift() {
            this.canSentGift = false;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasCanSentGift() {
            return (__bitField0 & 128) == 128;
        }

        public String getUserFacebookId() {
            return userFacebookId;
        }

        public Builder setUserFacebookId(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set DonateFriendDetail#userFacebookId to null");
            }

            this.userFacebookId = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearUserFacebookId() {
            this.userFacebookId = "";
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasUserFacebookId() {
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
            if (!java.util.Objects.equals(this.listDonateGift, that.listDonateGift)) {
                return false;
            }
            if (!java.util.Objects.equals(this.canSentGift, that.canSentGift)) {
                return false;
            }
            if (!java.util.Objects.equals(this.userFacebookId, that.userFacebookId)) {
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
            result = 31 * result + (this.listDonateGift == null ? 0 : this.listDonateGift.hashCode());
            result = 31 * result + Boolean.hashCode(this.canSentGift);
            result = 31 * result + (this.userFacebookId == null ? 0 : this.userFacebookId.hashCode());

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
            if (!listDonateGift.isEmpty()) {
                parts.add("listDonateGift=" + getListDonateGiftList());
            }
            if (hasCanSentGift()) {
                parts.add("canSentGift=" + getCanSentGift());
            }
            if (hasUserFacebookId()) {
                parts.add("userFacebookId=" + getUserFacebookId());
            }
            return "DonateFriendDetail{" + String.join(", ", parts) + "}";
        }

        public DonateFriendDetail build() {
            proto.message.DonateFriendDetail result = new proto.message.DonateFriendDetail();
            result.__bitField0 = __bitField0;
            result.userID = this.userID;
            result.userName = this.userName;
            result.userAvatar = this.userAvatar;
            result.userLevel = this.userLevel;
            result.userExp = this.userExp;
            result.userGold = this.userGold;
            result.listDonateGift = java.util.Collections.unmodifiableList(this.listDonateGift);
            result.canSentGift = this.canSentGift;
            result.userFacebookId = this.userFacebookId;
            return result;
        }

    }



}