package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class FriendActionResponse
        implements io.protostuff.Message<FriendActionResponse> {

    private static final FriendActionResponse DEFAULT_INSTANCE = newBuilder().build();

    private String userID;

    private String friendID;

    private int result;

    private int amount;

    private String friendName;

    private String friendAvatar;

    private int friendLevel;

    private boolean __merge_lock = false;
    private int __bitField0;

    private FriendActionResponse() {
        this.userID = "";
        this.friendID = "";
        this.result = proto.message.ProfileResultCode.PROFILE_CLAIM_INBOX_OK.getNumber();
        this.amount = 0;
        this.friendName = "";
        this.friendAvatar = "";
        this.friendLevel = 0;
    }

    private FriendActionResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static FriendActionResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<FriendActionResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getUserID() {
        return userID;
    }

    public boolean hasUserID() {
        return (__bitField0 & 1) == 1;
    }

    public FriendActionResponse withUserID(String value) {
        return FriendActionResponse.newBuilder()
            .mergeFrom(this)
            .setUserID(value)
            .build();
    }

    public String getFriendID() {
        return friendID;
    }

    public boolean hasFriendID() {
        return (__bitField0 & 2) == 2;
    }

    public FriendActionResponse withFriendID(String value) {
        return FriendActionResponse.newBuilder()
            .mergeFrom(this)
            .setFriendID(value)
            .build();
    }

    public proto.message.ProfileResultCode getResult() {
        return proto.message.ProfileResultCode.valueOf(result);
    }

    public int getResultValue() {
        return result;
    }

    public boolean hasResult() {
        return (__bitField0 & 4) == 4;
    }

    public FriendActionResponse withResult(proto.message.ProfileResultCode value) {
        return FriendActionResponse.newBuilder()
            .mergeFrom(this)
            .setResult(value)
            .build();
    }

    public int getAmount() {
        return amount;
    }

    public boolean hasAmount() {
        return (__bitField0 & 8) == 8;
    }

    public FriendActionResponse withAmount(int value) {
        return FriendActionResponse.newBuilder()
            .mergeFrom(this)
            .setAmount(value)
            .build();
    }

    public String getFriendName() {
        return friendName;
    }

    public boolean hasFriendName() {
        return (__bitField0 & 16) == 16;
    }

    public FriendActionResponse withFriendName(String value) {
        return FriendActionResponse.newBuilder()
            .mergeFrom(this)
            .setFriendName(value)
            .build();
    }

    public String getFriendAvatar() {
        return friendAvatar;
    }

    public boolean hasFriendAvatar() {
        return (__bitField0 & 32) == 32;
    }

    public FriendActionResponse withFriendAvatar(String value) {
        return FriendActionResponse.newBuilder()
            .mergeFrom(this)
            .setFriendAvatar(value)
            .build();
    }

    public int getFriendLevel() {
        return friendLevel;
    }

    public boolean hasFriendLevel() {
        return (__bitField0 & 64) == 64;
    }

    public FriendActionResponse withFriendLevel(int value) {
        return FriendActionResponse.newBuilder()
            .mergeFrom(this)
            .setFriendLevel(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<FriendActionResponse> cachedSchema() {
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
        FriendActionResponse that = (FriendActionResponse) obj;
        if (!java.util.Objects.equals(this.userID, that.userID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.friendID, that.friendID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.result, that.result)) {
            return false;
        }
        if (!java.util.Objects.equals(this.amount, that.amount)) {
            return false;
        }
        if (!java.util.Objects.equals(this.friendName, that.friendName)) {
            return false;
        }
        if (!java.util.Objects.equals(this.friendAvatar, that.friendAvatar)) {
            return false;
        }
        if (!java.util.Objects.equals(this.friendLevel, that.friendLevel)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
        result = 31 * result + (this.friendID == null ? 0 : this.friendID.hashCode());
        result = 31 * result + Integer.hashCode(this.result);
        result = 31 * result + Integer.hashCode(this.amount);
        result = 31 * result + (this.friendName == null ? 0 : this.friendName.hashCode());
        result = 31 * result + (this.friendAvatar == null ? 0 : this.friendAvatar.hashCode());
        result = 31 * result + Integer.hashCode(this.friendLevel);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasUserID()) {
            parts.add("userID=" + getUserID());
        }
        if (hasFriendID()) {
            parts.add("friendID=" + getFriendID());
        }
        if (hasResult()) {
            parts.add("result=" + getResult() + '(' + getResultValue() + ')');
        }
        if (hasAmount()) {
            parts.add("amount=" + getAmount());
        }
        if (hasFriendName()) {
            parts.add("friendName=" + getFriendName());
        }
        if (hasFriendAvatar()) {
            parts.add("friendAvatar=" + getFriendAvatar());
        }
        if (hasFriendLevel()) {
            parts.add("friendLevel=" + getFriendLevel());
        }
        return "FriendActionResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<FriendActionResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("userID", 1);
        	__fieldMap.put("friendID", 2);
        	__fieldMap.put("result", 3);
        	__fieldMap.put("amount", 4);
        	__fieldMap.put("friendName", 5);
        	__fieldMap.put("friendAvatar", 6);
        	__fieldMap.put("friendLevel", 7);
        }

        @Override
        public FriendActionResponse newMessage() {
            return new FriendActionResponse();
        }

        @Override
        public Class<FriendActionResponse> typeClass() {
            return FriendActionResponse.class;
        }

        @Override
        public String messageName() {
            return FriendActionResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return FriendActionResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(FriendActionResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, FriendActionResponse instance) throws java.io.IOException {
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
                    	instance.friendID = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.result = input.readEnum();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.amount = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.friendName = input.readString();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.friendAvatar = input.readString();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.friendLevel = input.readInt32();
                    	instance.__bitField0 |= 64;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, FriendActionResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.userID, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.friendID, false);
            }

            if((instance.__bitField0 & 4) == 4) {
            	output.writeEnum(3, instance.result, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.amount, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeString(5, instance.friendName, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeString(6, instance.friendAvatar, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeInt32(7, instance.friendLevel, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "userID";
        		case 2: return "friendID";
        		case 3: return "result";
        		case 4: return "amount";
        		case 5: return "friendName";
        		case 6: return "friendAvatar";
        		case 7: return "friendLevel";
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

        private String friendID;

        private int result;

        private int amount;

        private String friendName;

        private String friendAvatar;

        private int friendLevel;

        private int __bitField0;

        private Builder() {
            this.userID = "";
            this.friendID = "";
            this.result = proto.message.ProfileResultCode.PROFILE_CLAIM_INBOX_OK.getNumber();
            this.amount = 0;
            this.friendName = "";
            this.friendAvatar = "";
            this.friendLevel = 0;
        }

        public Builder mergeFrom(FriendActionResponse instance) {
            if (instance.hasUserID()) {
                this.setUserID(instance.getUserID());
            }

            if (instance.hasFriendID()) {
                this.setFriendID(instance.getFriendID());
            }

            if (instance.hasResult()) {
                this.setResult(instance.getResult());
            }

            if (instance.hasAmount()) {
                this.setAmount(instance.getAmount());
            }

            if (instance.hasFriendName()) {
                this.setFriendName(instance.getFriendName());
            }

            if (instance.hasFriendAvatar()) {
                this.setFriendAvatar(instance.getFriendAvatar());
            }

            if (instance.hasFriendLevel()) {
                this.setFriendLevel(instance.getFriendLevel());
            }

            return this;
        }

        public String getUserID() {
            return userID;
        }

        public Builder setUserID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendActionResponse#userID to null");
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

        public String getFriendID() {
            return friendID;
        }

        public Builder setFriendID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendActionResponse#friendID to null");
            }

            this.friendID = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearFriendID() {
            this.friendID = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasFriendID() {
            return (__bitField0 & 2) == 2;
        }

        public proto.message.ProfileResultCode getResult() {
            return proto.message.ProfileResultCode.valueOf(result);
        }

        public int getResultValue() {
            return result;
        }

        public Builder setResult(proto.message.ProfileResultCode value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendActionResponse#result to null");
            }

            if (value == proto.message.ProfileResultCode.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set FriendActionResponse#result to UNRECOGNIZED");
            }

            this.result = value.getNumber();
            __bitField0 |= 4;
            return this;
        }

        public Builder setResultValue(int value) {
            this.result = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearResult() {
            this.result = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasResult() {
            return (__bitField0 & 4) == 4;
        }

        public int getAmount() {
            return amount;
        }

        public Builder setAmount(int value) {
            this.amount = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearAmount() {
            this.amount = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasAmount() {
            return (__bitField0 & 8) == 8;
        }

        public String getFriendName() {
            return friendName;
        }

        public Builder setFriendName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendActionResponse#friendName to null");
            }

            this.friendName = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearFriendName() {
            this.friendName = "";
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasFriendName() {
            return (__bitField0 & 16) == 16;
        }

        public String getFriendAvatar() {
            return friendAvatar;
        }

        public Builder setFriendAvatar(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendActionResponse#friendAvatar to null");
            }

            this.friendAvatar = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearFriendAvatar() {
            this.friendAvatar = "";
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasFriendAvatar() {
            return (__bitField0 & 32) == 32;
        }

        public int getFriendLevel() {
            return friendLevel;
        }

        public Builder setFriendLevel(int value) {
            this.friendLevel = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearFriendLevel() {
            this.friendLevel = 0;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasFriendLevel() {
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
            if (!java.util.Objects.equals(this.friendID, that.friendID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.result, that.result)) {
                return false;
            }
            if (!java.util.Objects.equals(this.amount, that.amount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.friendName, that.friendName)) {
                return false;
            }
            if (!java.util.Objects.equals(this.friendAvatar, that.friendAvatar)) {
                return false;
            }
            if (!java.util.Objects.equals(this.friendLevel, that.friendLevel)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
            result = 31 * result + (this.friendID == null ? 0 : this.friendID.hashCode());
            result = 31 * result + Integer.hashCode(this.result);
            result = 31 * result + Integer.hashCode(this.amount);
            result = 31 * result + (this.friendName == null ? 0 : this.friendName.hashCode());
            result = 31 * result + (this.friendAvatar == null ? 0 : this.friendAvatar.hashCode());
            result = 31 * result + Integer.hashCode(this.friendLevel);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasUserID()) {
                parts.add("userID=" + getUserID());
            }
            if (hasFriendID()) {
                parts.add("friendID=" + getFriendID());
            }
            if (hasResult()) {
                parts.add("result=" + getResult() + '(' + getResultValue() + ')');
            }
            if (hasAmount()) {
                parts.add("amount=" + getAmount());
            }
            if (hasFriendName()) {
                parts.add("friendName=" + getFriendName());
            }
            if (hasFriendAvatar()) {
                parts.add("friendAvatar=" + getFriendAvatar());
            }
            if (hasFriendLevel()) {
                parts.add("friendLevel=" + getFriendLevel());
            }
            return "FriendActionResponse{" + String.join(", ", parts) + "}";
        }

        public FriendActionResponse build() {
            proto.message.FriendActionResponse result = new proto.message.FriendActionResponse();
            result.__bitField0 = __bitField0;
            result.userID = this.userID;
            result.friendID = this.friendID;
            result.result = this.result;
            result.amount = this.amount;
            result.friendName = this.friendName;
            result.friendAvatar = this.friendAvatar;
            result.friendLevel = this.friendLevel;
            return result;
        }

    }



}