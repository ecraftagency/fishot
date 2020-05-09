package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class FriendUnlockMoneySendRequest
        implements io.protostuff.Message<FriendUnlockMoneySendRequest> {

    private static final FriendUnlockMoneySendRequest DEFAULT_INSTANCE = newBuilder().build();

    private String friendID;

    private int amount;

    private String message;

    private boolean hasOpt;

    private boolean __merge_lock = false;
    private int __bitField0;

    private FriendUnlockMoneySendRequest() {
        this.friendID = "";
        this.amount = 0;
        this.message = "";
        this.hasOpt = false;
    }

    private FriendUnlockMoneySendRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static FriendUnlockMoneySendRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<FriendUnlockMoneySendRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getFriendID() {
        return friendID;
    }

    public boolean hasFriendID() {
        return (__bitField0 & 1) == 1;
    }

    public FriendUnlockMoneySendRequest withFriendID(String value) {
        return FriendUnlockMoneySendRequest.newBuilder()
            .mergeFrom(this)
            .setFriendID(value)
            .build();
    }

    public int getAmount() {
        return amount;
    }

    public boolean hasAmount() {
        return (__bitField0 & 2) == 2;
    }

    public FriendUnlockMoneySendRequest withAmount(int value) {
        return FriendUnlockMoneySendRequest.newBuilder()
            .mergeFrom(this)
            .setAmount(value)
            .build();
    }

    public String getMessage() {
        return message;
    }

    public boolean hasMessage() {
        return (__bitField0 & 4) == 4;
    }

    public FriendUnlockMoneySendRequest withMessage(String value) {
        return FriendUnlockMoneySendRequest.newBuilder()
            .mergeFrom(this)
            .setMessage(value)
            .build();
    }

    public boolean getHasOpt() {
        return hasOpt;
    }

    public boolean hasHasOpt() {
        return (__bitField0 & 8) == 8;
    }

    public FriendUnlockMoneySendRequest withHasOpt(boolean value) {
        return FriendUnlockMoneySendRequest.newBuilder()
            .mergeFrom(this)
            .setHasOpt(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<FriendUnlockMoneySendRequest> cachedSchema() {
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
        FriendUnlockMoneySendRequest that = (FriendUnlockMoneySendRequest) obj;
        if (!java.util.Objects.equals(this.friendID, that.friendID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.amount, that.amount)) {
            return false;
        }
        if (!java.util.Objects.equals(this.message, that.message)) {
            return false;
        }
        if (!java.util.Objects.equals(this.hasOpt, that.hasOpt)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.friendID == null ? 0 : this.friendID.hashCode());
        result = 31 * result + Integer.hashCode(this.amount);
        result = 31 * result + (this.message == null ? 0 : this.message.hashCode());
        result = 31 * result + Boolean.hashCode(this.hasOpt);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasFriendID()) {
            parts.add("friendID=" + getFriendID());
        }
        if (hasAmount()) {
            parts.add("amount=" + getAmount());
        }
        if (hasMessage()) {
            parts.add("message=" + getMessage());
        }
        if (hasHasOpt()) {
            parts.add("hasOpt=" + getHasOpt());
        }
        return "FriendUnlockMoneySendRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<FriendUnlockMoneySendRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("friendID", 1);
        	__fieldMap.put("amount", 2);
        	__fieldMap.put("message", 3);
        	__fieldMap.put("hasOpt", 4);
        }

        @Override
        public FriendUnlockMoneySendRequest newMessage() {
            return new FriendUnlockMoneySendRequest();
        }

        @Override
        public Class<FriendUnlockMoneySendRequest> typeClass() {
            return FriendUnlockMoneySendRequest.class;
        }

        @Override
        public String messageName() {
            return FriendUnlockMoneySendRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return FriendUnlockMoneySendRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(FriendUnlockMoneySendRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, FriendUnlockMoneySendRequest instance) throws java.io.IOException {
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
                    	instance.friendID = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.amount = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.message = input.readString();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.hasOpt = input.readBool();
                    	instance.__bitField0 |= 8;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, FriendUnlockMoneySendRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.friendID, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.amount, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeString(3, instance.message, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeBool(4, instance.hasOpt, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "friendID";
        		case 2: return "amount";
        		case 3: return "message";
        		case 4: return "hasOpt";
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

        private String friendID;

        private int amount;

        private String message;

        private boolean hasOpt;

        private int __bitField0;

        private Builder() {
            this.friendID = "";
            this.amount = 0;
            this.message = "";
            this.hasOpt = false;
        }

        public Builder mergeFrom(FriendUnlockMoneySendRequest instance) {
            if (instance.hasFriendID()) {
                this.setFriendID(instance.getFriendID());
            }

            if (instance.hasAmount()) {
                this.setAmount(instance.getAmount());
            }

            if (instance.hasMessage()) {
                this.setMessage(instance.getMessage());
            }

            if (instance.hasHasOpt()) {
                this.setHasOpt(instance.getHasOpt());
            }

            return this;
        }

        public String getFriendID() {
            return friendID;
        }

        public Builder setFriendID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendUnlockMoneySendRequest#friendID to null");
            }

            this.friendID = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearFriendID() {
            this.friendID = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasFriendID() {
            return (__bitField0 & 1) == 1;
        }

        public int getAmount() {
            return amount;
        }

        public Builder setAmount(int value) {
            this.amount = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearAmount() {
            this.amount = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasAmount() {
            return (__bitField0 & 2) == 2;
        }

        public String getMessage() {
            return message;
        }

        public Builder setMessage(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendUnlockMoneySendRequest#message to null");
            }

            this.message = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearMessage() {
            this.message = "";
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasMessage() {
            return (__bitField0 & 4) == 4;
        }

        public boolean getHasOpt() {
            return hasOpt;
        }

        public Builder setHasOpt(boolean value) {
            this.hasOpt = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearHasOpt() {
            this.hasOpt = false;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasHasOpt() {
            return (__bitField0 & 8) == 8;
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
            if (!java.util.Objects.equals(this.friendID, that.friendID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.amount, that.amount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.message, that.message)) {
                return false;
            }
            if (!java.util.Objects.equals(this.hasOpt, that.hasOpt)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.friendID == null ? 0 : this.friendID.hashCode());
            result = 31 * result + Integer.hashCode(this.amount);
            result = 31 * result + (this.message == null ? 0 : this.message.hashCode());
            result = 31 * result + Boolean.hashCode(this.hasOpt);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasFriendID()) {
                parts.add("friendID=" + getFriendID());
            }
            if (hasAmount()) {
                parts.add("amount=" + getAmount());
            }
            if (hasMessage()) {
                parts.add("message=" + getMessage());
            }
            if (hasHasOpt()) {
                parts.add("hasOpt=" + getHasOpt());
            }
            return "FriendUnlockMoneySendRequest{" + String.join(", ", parts) + "}";
        }

        public FriendUnlockMoneySendRequest build() {
            proto.message.FriendUnlockMoneySendRequest result = new proto.message.FriendUnlockMoneySendRequest();
            result.__bitField0 = __bitField0;
            result.friendID = this.friendID;
            result.amount = this.amount;
            result.message = this.message;
            result.hasOpt = this.hasOpt;
            return result;
        }

    }



}