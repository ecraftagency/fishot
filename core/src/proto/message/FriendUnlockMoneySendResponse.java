package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class FriendUnlockMoneySendResponse
        implements io.protostuff.Message<FriendUnlockMoneySendResponse> {

    private static final FriendUnlockMoneySendResponse DEFAULT_INSTANCE = newBuilder().build();

    private String userID;

    private String friendID;

    private int amount;

    private int result;

    private String optCode;

    private int gold1;

    private int gold2;

    private int gold3;

    private String friendName;

    private boolean __merge_lock = false;
    private int __bitField0;

    private FriendUnlockMoneySendResponse() {
        this.userID = "";
        this.friendID = "";
        this.amount = 0;
        this.result = proto.message.ProfileResultCode.PROFILE_CLAIM_INBOX_OK.getNumber();
        this.optCode = "";
        this.gold1 = 0;
        this.gold2 = 0;
        this.gold3 = 0;
        this.friendName = "";
    }

    private FriendUnlockMoneySendResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static FriendUnlockMoneySendResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<FriendUnlockMoneySendResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getUserID() {
        return userID;
    }

    public boolean hasUserID() {
        return (__bitField0 & 1) == 1;
    }

    public FriendUnlockMoneySendResponse withUserID(String value) {
        return FriendUnlockMoneySendResponse.newBuilder()
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

    public FriendUnlockMoneySendResponse withFriendID(String value) {
        return FriendUnlockMoneySendResponse.newBuilder()
            .mergeFrom(this)
            .setFriendID(value)
            .build();
    }

    public int getAmount() {
        return amount;
    }

    public boolean hasAmount() {
        return (__bitField0 & 4) == 4;
    }

    public FriendUnlockMoneySendResponse withAmount(int value) {
        return FriendUnlockMoneySendResponse.newBuilder()
            .mergeFrom(this)
            .setAmount(value)
            .build();
    }

    public proto.message.ProfileResultCode getResult() {
        return proto.message.ProfileResultCode.valueOf(result);
    }

    public int getResultValue() {
        return result;
    }

    public boolean hasResult() {
        return (__bitField0 & 8) == 8;
    }

    public FriendUnlockMoneySendResponse withResult(proto.message.ProfileResultCode value) {
        return FriendUnlockMoneySendResponse.newBuilder()
            .mergeFrom(this)
            .setResult(value)
            .build();
    }

    public String getOptCode() {
        return optCode;
    }

    public boolean hasOptCode() {
        return (__bitField0 & 16) == 16;
    }

    public FriendUnlockMoneySendResponse withOptCode(String value) {
        return FriendUnlockMoneySendResponse.newBuilder()
            .mergeFrom(this)
            .setOptCode(value)
            .build();
    }

    public int getGold1() {
        return gold1;
    }

    public boolean hasGold1() {
        return (__bitField0 & 32) == 32;
    }

    public FriendUnlockMoneySendResponse withGold1(int value) {
        return FriendUnlockMoneySendResponse.newBuilder()
            .mergeFrom(this)
            .setGold1(value)
            .build();
    }

    public int getGold2() {
        return gold2;
    }

    public boolean hasGold2() {
        return (__bitField0 & 64) == 64;
    }

    public FriendUnlockMoneySendResponse withGold2(int value) {
        return FriendUnlockMoneySendResponse.newBuilder()
            .mergeFrom(this)
            .setGold2(value)
            .build();
    }

    public int getGold3() {
        return gold3;
    }

    public boolean hasGold3() {
        return (__bitField0 & 128) == 128;
    }

    public FriendUnlockMoneySendResponse withGold3(int value) {
        return FriendUnlockMoneySendResponse.newBuilder()
            .mergeFrom(this)
            .setGold3(value)
            .build();
    }

    public String getFriendName() {
        return friendName;
    }

    public boolean hasFriendName() {
        return (__bitField0 & 256) == 256;
    }

    public FriendUnlockMoneySendResponse withFriendName(String value) {
        return FriendUnlockMoneySendResponse.newBuilder()
            .mergeFrom(this)
            .setFriendName(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<FriendUnlockMoneySendResponse> cachedSchema() {
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
        FriendUnlockMoneySendResponse that = (FriendUnlockMoneySendResponse) obj;
        if (!java.util.Objects.equals(this.userID, that.userID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.friendID, that.friendID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.amount, that.amount)) {
            return false;
        }
        if (!java.util.Objects.equals(this.result, that.result)) {
            return false;
        }
        if (!java.util.Objects.equals(this.optCode, that.optCode)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gold1, that.gold1)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gold2, that.gold2)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gold3, that.gold3)) {
            return false;
        }
        if (!java.util.Objects.equals(this.friendName, that.friendName)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
        result = 31 * result + (this.friendID == null ? 0 : this.friendID.hashCode());
        result = 31 * result + Integer.hashCode(this.amount);
        result = 31 * result + Integer.hashCode(this.result);
        result = 31 * result + (this.optCode == null ? 0 : this.optCode.hashCode());
        result = 31 * result + Integer.hashCode(this.gold1);
        result = 31 * result + Integer.hashCode(this.gold2);
        result = 31 * result + Integer.hashCode(this.gold3);
        result = 31 * result + (this.friendName == null ? 0 : this.friendName.hashCode());

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
        if (hasAmount()) {
            parts.add("amount=" + getAmount());
        }
        if (hasResult()) {
            parts.add("result=" + getResult() + '(' + getResultValue() + ')');
        }
        if (hasOptCode()) {
            parts.add("optCode=" + getOptCode());
        }
        if (hasGold1()) {
            parts.add("gold1=" + getGold1());
        }
        if (hasGold2()) {
            parts.add("gold2=" + getGold2());
        }
        if (hasGold3()) {
            parts.add("gold3=" + getGold3());
        }
        if (hasFriendName()) {
            parts.add("friendName=" + getFriendName());
        }
        return "FriendUnlockMoneySendResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<FriendUnlockMoneySendResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("userID", 1);
        	__fieldMap.put("friendID", 2);
        	__fieldMap.put("amount", 3);
        	__fieldMap.put("result", 4);
        	__fieldMap.put("optCode", 5);
        	__fieldMap.put("gold1", 6);
        	__fieldMap.put("gold2", 7);
        	__fieldMap.put("gold3", 8);
        	__fieldMap.put("friendName", 9);
        }

        @Override
        public FriendUnlockMoneySendResponse newMessage() {
            return new FriendUnlockMoneySendResponse();
        }

        @Override
        public Class<FriendUnlockMoneySendResponse> typeClass() {
            return FriendUnlockMoneySendResponse.class;
        }

        @Override
        public String messageName() {
            return FriendUnlockMoneySendResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return FriendUnlockMoneySendResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(FriendUnlockMoneySendResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, FriendUnlockMoneySendResponse instance) throws java.io.IOException {
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
                    	instance.amount = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.result = input.readEnum();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.optCode = input.readString();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.gold1 = input.readInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.gold2 = input.readInt32();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.gold3 = input.readInt32();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 9:
                    	instance.friendName = input.readString();
                    	instance.__bitField0 |= 256;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, FriendUnlockMoneySendResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.userID, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.friendID, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.amount, false);
            }

            if((instance.__bitField0 & 8) == 8) {
            	output.writeEnum(4, instance.result, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeString(5, instance.optCode, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeInt32(6, instance.gold1, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeInt32(7, instance.gold2, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeInt32(8, instance.gold3, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeString(9, instance.friendName, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "userID";
        		case 2: return "friendID";
        		case 3: return "amount";
        		case 4: return "result";
        		case 5: return "optCode";
        		case 6: return "gold1";
        		case 7: return "gold2";
        		case 8: return "gold3";
        		case 9: return "friendName";
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

        private int amount;

        private int result;

        private String optCode;

        private int gold1;

        private int gold2;

        private int gold3;

        private String friendName;

        private int __bitField0;

        private Builder() {
            this.userID = "";
            this.friendID = "";
            this.amount = 0;
            this.result = proto.message.ProfileResultCode.PROFILE_CLAIM_INBOX_OK.getNumber();
            this.optCode = "";
            this.gold1 = 0;
            this.gold2 = 0;
            this.gold3 = 0;
            this.friendName = "";
        }

        public Builder mergeFrom(FriendUnlockMoneySendResponse instance) {
            if (instance.hasUserID()) {
                this.setUserID(instance.getUserID());
            }

            if (instance.hasFriendID()) {
                this.setFriendID(instance.getFriendID());
            }

            if (instance.hasAmount()) {
                this.setAmount(instance.getAmount());
            }

            if (instance.hasResult()) {
                this.setResult(instance.getResult());
            }

            if (instance.hasOptCode()) {
                this.setOptCode(instance.getOptCode());
            }

            if (instance.hasGold1()) {
                this.setGold1(instance.getGold1());
            }

            if (instance.hasGold2()) {
                this.setGold2(instance.getGold2());
            }

            if (instance.hasGold3()) {
                this.setGold3(instance.getGold3());
            }

            if (instance.hasFriendName()) {
                this.setFriendName(instance.getFriendName());
            }

            return this;
        }

        public String getUserID() {
            return userID;
        }

        public Builder setUserID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendUnlockMoneySendResponse#userID to null");
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
                throw new NullPointerException("Cannot set FriendUnlockMoneySendResponse#friendID to null");
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

        public int getAmount() {
            return amount;
        }

        public Builder setAmount(int value) {
            this.amount = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearAmount() {
            this.amount = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasAmount() {
            return (__bitField0 & 4) == 4;
        }

        public proto.message.ProfileResultCode getResult() {
            return proto.message.ProfileResultCode.valueOf(result);
        }

        public int getResultValue() {
            return result;
        }

        public Builder setResult(proto.message.ProfileResultCode value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendUnlockMoneySendResponse#result to null");
            }

            if (value == proto.message.ProfileResultCode.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set FriendUnlockMoneySendResponse#result to UNRECOGNIZED");
            }

            this.result = value.getNumber();
            __bitField0 |= 8;
            return this;
        }

        public Builder setResultValue(int value) {
            this.result = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearResult() {
            this.result = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasResult() {
            return (__bitField0 & 8) == 8;
        }

        public String getOptCode() {
            return optCode;
        }

        public Builder setOptCode(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendUnlockMoneySendResponse#optCode to null");
            }

            this.optCode = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearOptCode() {
            this.optCode = "";
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasOptCode() {
            return (__bitField0 & 16) == 16;
        }

        public int getGold1() {
            return gold1;
        }

        public Builder setGold1(int value) {
            this.gold1 = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearGold1() {
            this.gold1 = 0;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasGold1() {
            return (__bitField0 & 32) == 32;
        }

        public int getGold2() {
            return gold2;
        }

        public Builder setGold2(int value) {
            this.gold2 = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearGold2() {
            this.gold2 = 0;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasGold2() {
            return (__bitField0 & 64) == 64;
        }

        public int getGold3() {
            return gold3;
        }

        public Builder setGold3(int value) {
            this.gold3 = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearGold3() {
            this.gold3 = 0;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasGold3() {
            return (__bitField0 & 128) == 128;
        }

        public String getFriendName() {
            return friendName;
        }

        public Builder setFriendName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendUnlockMoneySendResponse#friendName to null");
            }

            this.friendName = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearFriendName() {
            this.friendName = "";
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasFriendName() {
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
            if (!java.util.Objects.equals(this.friendID, that.friendID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.amount, that.amount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.result, that.result)) {
                return false;
            }
            if (!java.util.Objects.equals(this.optCode, that.optCode)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gold1, that.gold1)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gold2, that.gold2)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gold3, that.gold3)) {
                return false;
            }
            if (!java.util.Objects.equals(this.friendName, that.friendName)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
            result = 31 * result + (this.friendID == null ? 0 : this.friendID.hashCode());
            result = 31 * result + Integer.hashCode(this.amount);
            result = 31 * result + Integer.hashCode(this.result);
            result = 31 * result + (this.optCode == null ? 0 : this.optCode.hashCode());
            result = 31 * result + Integer.hashCode(this.gold1);
            result = 31 * result + Integer.hashCode(this.gold2);
            result = 31 * result + Integer.hashCode(this.gold3);
            result = 31 * result + (this.friendName == null ? 0 : this.friendName.hashCode());

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
            if (hasAmount()) {
                parts.add("amount=" + getAmount());
            }
            if (hasResult()) {
                parts.add("result=" + getResult() + '(' + getResultValue() + ')');
            }
            if (hasOptCode()) {
                parts.add("optCode=" + getOptCode());
            }
            if (hasGold1()) {
                parts.add("gold1=" + getGold1());
            }
            if (hasGold2()) {
                parts.add("gold2=" + getGold2());
            }
            if (hasGold3()) {
                parts.add("gold3=" + getGold3());
            }
            if (hasFriendName()) {
                parts.add("friendName=" + getFriendName());
            }
            return "FriendUnlockMoneySendResponse{" + String.join(", ", parts) + "}";
        }

        public FriendUnlockMoneySendResponse build() {
            proto.message.FriendUnlockMoneySendResponse result = new proto.message.FriendUnlockMoneySendResponse();
            result.__bitField0 = __bitField0;
            result.userID = this.userID;
            result.friendID = this.friendID;
            result.amount = this.amount;
            result.result = this.result;
            result.optCode = this.optCode;
            result.gold1 = this.gold1;
            result.gold2 = this.gold2;
            result.gold3 = this.gold3;
            result.friendName = this.friendName;
            return result;
        }

    }



}