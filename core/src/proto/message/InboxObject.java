package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class InboxObject
        implements io.protostuff.Message<InboxObject> {

    private static final InboxObject DEFAULT_INSTANCE = newBuilder().build();

    private int inboxID;

    private String senderID;

    private String senderName;

    private int sendTime;

    private int itemType;

    private int itemAmount;

    private String itemMessage;

    private String senderAvatar;

    private boolean hasOpt;

    private String url;

    private int flag;

    private int rewardType;

    private int hour;

    private boolean __merge_lock = false;
    private int __bitField0;

    private InboxObject() {
        this.inboxID = 0;
        this.senderID = "";
        this.senderName = "";
        this.sendTime = 0;
        this.itemType = 0;
        this.itemAmount = 0;
        this.itemMessage = "";
        this.senderAvatar = "";
        this.hasOpt = false;
        this.url = "";
        this.flag = 0;
        this.rewardType = 0;
        this.hour = 0;
    }

    private InboxObject(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static InboxObject getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<InboxObject> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getInboxID() {
        return inboxID;
    }

    public boolean hasInboxID() {
        return (__bitField0 & 1) == 1;
    }

    public InboxObject withInboxID(int value) {
        return InboxObject.newBuilder()
            .mergeFrom(this)
            .setInboxID(value)
            .build();
    }

    public String getSenderID() {
        return senderID;
    }

    public boolean hasSenderID() {
        return (__bitField0 & 2) == 2;
    }

    public InboxObject withSenderID(String value) {
        return InboxObject.newBuilder()
            .mergeFrom(this)
            .setSenderID(value)
            .build();
    }

    public String getSenderName() {
        return senderName;
    }

    public boolean hasSenderName() {
        return (__bitField0 & 4) == 4;
    }

    public InboxObject withSenderName(String value) {
        return InboxObject.newBuilder()
            .mergeFrom(this)
            .setSenderName(value)
            .build();
    }

    public int getSendTime() {
        return sendTime;
    }

    public boolean hasSendTime() {
        return (__bitField0 & 8) == 8;
    }

    public InboxObject withSendTime(int value) {
        return InboxObject.newBuilder()
            .mergeFrom(this)
            .setSendTime(value)
            .build();
    }

    public int getItemType() {
        return itemType;
    }

    public boolean hasItemType() {
        return (__bitField0 & 16) == 16;
    }

    public InboxObject withItemType(int value) {
        return InboxObject.newBuilder()
            .mergeFrom(this)
            .setItemType(value)
            .build();
    }

    public int getItemAmount() {
        return itemAmount;
    }

    public boolean hasItemAmount() {
        return (__bitField0 & 32) == 32;
    }

    public InboxObject withItemAmount(int value) {
        return InboxObject.newBuilder()
            .mergeFrom(this)
            .setItemAmount(value)
            .build();
    }

    public String getItemMessage() {
        return itemMessage;
    }

    public boolean hasItemMessage() {
        return (__bitField0 & 64) == 64;
    }

    public InboxObject withItemMessage(String value) {
        return InboxObject.newBuilder()
            .mergeFrom(this)
            .setItemMessage(value)
            .build();
    }

    public String getSenderAvatar() {
        return senderAvatar;
    }

    public boolean hasSenderAvatar() {
        return (__bitField0 & 128) == 128;
    }

    public InboxObject withSenderAvatar(String value) {
        return InboxObject.newBuilder()
            .mergeFrom(this)
            .setSenderAvatar(value)
            .build();
    }

    public boolean getHasOpt() {
        return hasOpt;
    }

    public boolean hasHasOpt() {
        return (__bitField0 & 256) == 256;
    }

    public InboxObject withHasOpt(boolean value) {
        return InboxObject.newBuilder()
            .mergeFrom(this)
            .setHasOpt(value)
            .build();
    }

    public String getUrl() {
        return url;
    }

    public boolean hasUrl() {
        return (__bitField0 & 512) == 512;
    }

    public InboxObject withUrl(String value) {
        return InboxObject.newBuilder()
            .mergeFrom(this)
            .setUrl(value)
            .build();
    }

    public int getFlag() {
        return flag;
    }

    public boolean hasFlag() {
        return (__bitField0 & 1024) == 1024;
    }

    public InboxObject withFlag(int value) {
        return InboxObject.newBuilder()
            .mergeFrom(this)
            .setFlag(value)
            .build();
    }

    public int getRewardType() {
        return rewardType;
    }

    public boolean hasRewardType() {
        return (__bitField0 & 2048) == 2048;
    }

    public InboxObject withRewardType(int value) {
        return InboxObject.newBuilder()
            .mergeFrom(this)
            .setRewardType(value)
            .build();
    }

    public int getHour() {
        return hour;
    }

    public boolean hasHour() {
        return (__bitField0 & 4096) == 4096;
    }

    public InboxObject withHour(int value) {
        return InboxObject.newBuilder()
            .mergeFrom(this)
            .setHour(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<InboxObject> cachedSchema() {
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
        InboxObject that = (InboxObject) obj;
        if (!java.util.Objects.equals(this.inboxID, that.inboxID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.senderID, that.senderID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.senderName, that.senderName)) {
            return false;
        }
        if (!java.util.Objects.equals(this.sendTime, that.sendTime)) {
            return false;
        }
        if (!java.util.Objects.equals(this.itemType, that.itemType)) {
            return false;
        }
        if (!java.util.Objects.equals(this.itemAmount, that.itemAmount)) {
            return false;
        }
        if (!java.util.Objects.equals(this.itemMessage, that.itemMessage)) {
            return false;
        }
        if (!java.util.Objects.equals(this.senderAvatar, that.senderAvatar)) {
            return false;
        }
        if (!java.util.Objects.equals(this.hasOpt, that.hasOpt)) {
            return false;
        }
        if (!java.util.Objects.equals(this.url, that.url)) {
            return false;
        }
        if (!java.util.Objects.equals(this.flag, that.flag)) {
            return false;
        }
        if (!java.util.Objects.equals(this.rewardType, that.rewardType)) {
            return false;
        }
        if (!java.util.Objects.equals(this.hour, that.hour)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.inboxID);
        result = 31 * result + (this.senderID == null ? 0 : this.senderID.hashCode());
        result = 31 * result + (this.senderName == null ? 0 : this.senderName.hashCode());
        result = 31 * result + Integer.hashCode(this.sendTime);
        result = 31 * result + Integer.hashCode(this.itemType);
        result = 31 * result + Integer.hashCode(this.itemAmount);
        result = 31 * result + (this.itemMessage == null ? 0 : this.itemMessage.hashCode());
        result = 31 * result + (this.senderAvatar == null ? 0 : this.senderAvatar.hashCode());
        result = 31 * result + Boolean.hashCode(this.hasOpt);
        result = 31 * result + (this.url == null ? 0 : this.url.hashCode());
        result = 31 * result + Integer.hashCode(this.flag);
        result = 31 * result + Integer.hashCode(this.rewardType);
        result = 31 * result + Integer.hashCode(this.hour);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasInboxID()) {
            parts.add("inboxID=" + getInboxID());
        }
        if (hasSenderID()) {
            parts.add("senderID=" + getSenderID());
        }
        if (hasSenderName()) {
            parts.add("senderName=" + getSenderName());
        }
        if (hasSendTime()) {
            parts.add("sendTime=" + getSendTime());
        }
        if (hasItemType()) {
            parts.add("itemType=" + getItemType());
        }
        if (hasItemAmount()) {
            parts.add("itemAmount=" + getItemAmount());
        }
        if (hasItemMessage()) {
            parts.add("itemMessage=" + getItemMessage());
        }
        if (hasSenderAvatar()) {
            parts.add("senderAvatar=" + getSenderAvatar());
        }
        if (hasHasOpt()) {
            parts.add("hasOpt=" + getHasOpt());
        }
        if (hasUrl()) {
            parts.add("url=" + getUrl());
        }
        if (hasFlag()) {
            parts.add("flag=" + getFlag());
        }
        if (hasRewardType()) {
            parts.add("rewardType=" + getRewardType());
        }
        if (hasHour()) {
            parts.add("hour=" + getHour());
        }
        return "InboxObject{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<InboxObject>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("inboxID", 1);
        	__fieldMap.put("senderID", 2);
        	__fieldMap.put("senderName", 3);
        	__fieldMap.put("sendTime", 4);
        	__fieldMap.put("itemType", 5);
        	__fieldMap.put("itemAmount", 6);
        	__fieldMap.put("itemMessage", 7);
        	__fieldMap.put("senderAvatar", 8);
        	__fieldMap.put("hasOpt", 9);
        	__fieldMap.put("url", 10);
        	__fieldMap.put("flag", 11);
        	__fieldMap.put("rewardType", 12);
        	__fieldMap.put("hour", 13);
        }

        @Override
        public InboxObject newMessage() {
            return new InboxObject();
        }

        @Override
        public Class<InboxObject> typeClass() {
            return InboxObject.class;
        }

        @Override
        public String messageName() {
            return InboxObject.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return InboxObject.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(InboxObject message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, InboxObject instance) throws java.io.IOException {
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
                    	instance.inboxID = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.senderID = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.senderName = input.readString();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.sendTime = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.itemType = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.itemAmount = input.readInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.itemMessage = input.readString();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.senderAvatar = input.readString();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 9:
                    	instance.hasOpt = input.readBool();
                    	instance.__bitField0 |= 256;
                    	break;
                    case 10:
                    	instance.url = input.readString();
                    	instance.__bitField0 |= 512;
                    	break;
                    case 11:
                    	instance.flag = input.readInt32();
                    	instance.__bitField0 |= 1024;
                    	break;
                    case 12:
                    	instance.rewardType = input.readInt32();
                    	instance.__bitField0 |= 2048;
                    	break;
                    case 13:
                    	instance.hour = input.readInt32();
                    	instance.__bitField0 |= 4096;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, InboxObject instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.inboxID, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.senderID, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeString(3, instance.senderName, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.sendTime, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.itemType, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeInt32(6, instance.itemAmount, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeString(7, instance.itemMessage, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeString(8, instance.senderAvatar, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeBool(9, instance.hasOpt, false);
            }

            if((instance.__bitField0 & 512) == 512) {
                output.writeString(10, instance.url, false);
            }

            if((instance.__bitField0 & 1024) == 1024) {
                output.writeInt32(11, instance.flag, false);
            }

            if((instance.__bitField0 & 2048) == 2048) {
                output.writeInt32(12, instance.rewardType, false);
            }

            if((instance.__bitField0 & 4096) == 4096) {
                output.writeInt32(13, instance.hour, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "inboxID";
        		case 2: return "senderID";
        		case 3: return "senderName";
        		case 4: return "sendTime";
        		case 5: return "itemType";
        		case 6: return "itemAmount";
        		case 7: return "itemMessage";
        		case 8: return "senderAvatar";
        		case 9: return "hasOpt";
        		case 10: return "url";
        		case 11: return "flag";
        		case 12: return "rewardType";
        		case 13: return "hour";
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

        private int inboxID;

        private String senderID;

        private String senderName;

        private int sendTime;

        private int itemType;

        private int itemAmount;

        private String itemMessage;

        private String senderAvatar;

        private boolean hasOpt;

        private String url;

        private int flag;

        private int rewardType;

        private int hour;

        private int __bitField0;

        private Builder() {
            this.inboxID = 0;
            this.senderID = "";
            this.senderName = "";
            this.sendTime = 0;
            this.itemType = 0;
            this.itemAmount = 0;
            this.itemMessage = "";
            this.senderAvatar = "";
            this.hasOpt = false;
            this.url = "";
            this.flag = 0;
            this.rewardType = 0;
            this.hour = 0;
        }

        public Builder mergeFrom(InboxObject instance) {
            if (instance.hasInboxID()) {
                this.setInboxID(instance.getInboxID());
            }

            if (instance.hasSenderID()) {
                this.setSenderID(instance.getSenderID());
            }

            if (instance.hasSenderName()) {
                this.setSenderName(instance.getSenderName());
            }

            if (instance.hasSendTime()) {
                this.setSendTime(instance.getSendTime());
            }

            if (instance.hasItemType()) {
                this.setItemType(instance.getItemType());
            }

            if (instance.hasItemAmount()) {
                this.setItemAmount(instance.getItemAmount());
            }

            if (instance.hasItemMessage()) {
                this.setItemMessage(instance.getItemMessage());
            }

            if (instance.hasSenderAvatar()) {
                this.setSenderAvatar(instance.getSenderAvatar());
            }

            if (instance.hasHasOpt()) {
                this.setHasOpt(instance.getHasOpt());
            }

            if (instance.hasUrl()) {
                this.setUrl(instance.getUrl());
            }

            if (instance.hasFlag()) {
                this.setFlag(instance.getFlag());
            }

            if (instance.hasRewardType()) {
                this.setRewardType(instance.getRewardType());
            }

            if (instance.hasHour()) {
                this.setHour(instance.getHour());
            }

            return this;
        }

        public int getInboxID() {
            return inboxID;
        }

        public Builder setInboxID(int value) {
            this.inboxID = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearInboxID() {
            this.inboxID = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasInboxID() {
            return (__bitField0 & 1) == 1;
        }

        public String getSenderID() {
            return senderID;
        }

        public Builder setSenderID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InboxObject#senderID to null");
            }

            this.senderID = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearSenderID() {
            this.senderID = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasSenderID() {
            return (__bitField0 & 2) == 2;
        }

        public String getSenderName() {
            return senderName;
        }

        public Builder setSenderName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InboxObject#senderName to null");
            }

            this.senderName = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearSenderName() {
            this.senderName = "";
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasSenderName() {
            return (__bitField0 & 4) == 4;
        }

        public int getSendTime() {
            return sendTime;
        }

        public Builder setSendTime(int value) {
            this.sendTime = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearSendTime() {
            this.sendTime = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasSendTime() {
            return (__bitField0 & 8) == 8;
        }

        public int getItemType() {
            return itemType;
        }

        public Builder setItemType(int value) {
            this.itemType = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearItemType() {
            this.itemType = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasItemType() {
            return (__bitField0 & 16) == 16;
        }

        public int getItemAmount() {
            return itemAmount;
        }

        public Builder setItemAmount(int value) {
            this.itemAmount = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearItemAmount() {
            this.itemAmount = 0;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasItemAmount() {
            return (__bitField0 & 32) == 32;
        }

        public String getItemMessage() {
            return itemMessage;
        }

        public Builder setItemMessage(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InboxObject#itemMessage to null");
            }

            this.itemMessage = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearItemMessage() {
            this.itemMessage = "";
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasItemMessage() {
            return (__bitField0 & 64) == 64;
        }

        public String getSenderAvatar() {
            return senderAvatar;
        }

        public Builder setSenderAvatar(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InboxObject#senderAvatar to null");
            }

            this.senderAvatar = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearSenderAvatar() {
            this.senderAvatar = "";
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasSenderAvatar() {
            return (__bitField0 & 128) == 128;
        }

        public boolean getHasOpt() {
            return hasOpt;
        }

        public Builder setHasOpt(boolean value) {
            this.hasOpt = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearHasOpt() {
            this.hasOpt = false;
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasHasOpt() {
            return (__bitField0 & 256) == 256;
        }

        public String getUrl() {
            return url;
        }

        public Builder setUrl(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InboxObject#url to null");
            }

            this.url = value;
            __bitField0 |= 512;
            return this;
        }

        public Builder clearUrl() {
            this.url = "";
            __bitField0 &= ~512;
            return this;
        }

        public boolean hasUrl() {
            return (__bitField0 & 512) == 512;
        }

        public int getFlag() {
            return flag;
        }

        public Builder setFlag(int value) {
            this.flag = value;
            __bitField0 |= 1024;
            return this;
        }

        public Builder clearFlag() {
            this.flag = 0;
            __bitField0 &= ~1024;
            return this;
        }

        public boolean hasFlag() {
            return (__bitField0 & 1024) == 1024;
        }

        public int getRewardType() {
            return rewardType;
        }

        public Builder setRewardType(int value) {
            this.rewardType = value;
            __bitField0 |= 2048;
            return this;
        }

        public Builder clearRewardType() {
            this.rewardType = 0;
            __bitField0 &= ~2048;
            return this;
        }

        public boolean hasRewardType() {
            return (__bitField0 & 2048) == 2048;
        }

        public int getHour() {
            return hour;
        }

        public Builder setHour(int value) {
            this.hour = value;
            __bitField0 |= 4096;
            return this;
        }

        public Builder clearHour() {
            this.hour = 0;
            __bitField0 &= ~4096;
            return this;
        }

        public boolean hasHour() {
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
            if (!java.util.Objects.equals(this.inboxID, that.inboxID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.senderID, that.senderID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.senderName, that.senderName)) {
                return false;
            }
            if (!java.util.Objects.equals(this.sendTime, that.sendTime)) {
                return false;
            }
            if (!java.util.Objects.equals(this.itemType, that.itemType)) {
                return false;
            }
            if (!java.util.Objects.equals(this.itemAmount, that.itemAmount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.itemMessage, that.itemMessage)) {
                return false;
            }
            if (!java.util.Objects.equals(this.senderAvatar, that.senderAvatar)) {
                return false;
            }
            if (!java.util.Objects.equals(this.hasOpt, that.hasOpt)) {
                return false;
            }
            if (!java.util.Objects.equals(this.url, that.url)) {
                return false;
            }
            if (!java.util.Objects.equals(this.flag, that.flag)) {
                return false;
            }
            if (!java.util.Objects.equals(this.rewardType, that.rewardType)) {
                return false;
            }
            if (!java.util.Objects.equals(this.hour, that.hour)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.inboxID);
            result = 31 * result + (this.senderID == null ? 0 : this.senderID.hashCode());
            result = 31 * result + (this.senderName == null ? 0 : this.senderName.hashCode());
            result = 31 * result + Integer.hashCode(this.sendTime);
            result = 31 * result + Integer.hashCode(this.itemType);
            result = 31 * result + Integer.hashCode(this.itemAmount);
            result = 31 * result + (this.itemMessage == null ? 0 : this.itemMessage.hashCode());
            result = 31 * result + (this.senderAvatar == null ? 0 : this.senderAvatar.hashCode());
            result = 31 * result + Boolean.hashCode(this.hasOpt);
            result = 31 * result + (this.url == null ? 0 : this.url.hashCode());
            result = 31 * result + Integer.hashCode(this.flag);
            result = 31 * result + Integer.hashCode(this.rewardType);
            result = 31 * result + Integer.hashCode(this.hour);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasInboxID()) {
                parts.add("inboxID=" + getInboxID());
            }
            if (hasSenderID()) {
                parts.add("senderID=" + getSenderID());
            }
            if (hasSenderName()) {
                parts.add("senderName=" + getSenderName());
            }
            if (hasSendTime()) {
                parts.add("sendTime=" + getSendTime());
            }
            if (hasItemType()) {
                parts.add("itemType=" + getItemType());
            }
            if (hasItemAmount()) {
                parts.add("itemAmount=" + getItemAmount());
            }
            if (hasItemMessage()) {
                parts.add("itemMessage=" + getItemMessage());
            }
            if (hasSenderAvatar()) {
                parts.add("senderAvatar=" + getSenderAvatar());
            }
            if (hasHasOpt()) {
                parts.add("hasOpt=" + getHasOpt());
            }
            if (hasUrl()) {
                parts.add("url=" + getUrl());
            }
            if (hasFlag()) {
                parts.add("flag=" + getFlag());
            }
            if (hasRewardType()) {
                parts.add("rewardType=" + getRewardType());
            }
            if (hasHour()) {
                parts.add("hour=" + getHour());
            }
            return "InboxObject{" + String.join(", ", parts) + "}";
        }

        public InboxObject build() {
            proto.message.InboxObject result = new proto.message.InboxObject();
            result.__bitField0 = __bitField0;
            result.inboxID = this.inboxID;
            result.senderID = this.senderID;
            result.senderName = this.senderName;
            result.sendTime = this.sendTime;
            result.itemType = this.itemType;
            result.itemAmount = this.itemAmount;
            result.itemMessage = this.itemMessage;
            result.senderAvatar = this.senderAvatar;
            result.hasOpt = this.hasOpt;
            result.url = this.url;
            result.flag = this.flag;
            result.rewardType = this.rewardType;
            result.hour = this.hour;
            return result;
        }

    }



}