package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class UserLevelUpResponse
        implements io.protostuff.Message<UserLevelUpResponse> {

    private static final UserLevelUpResponse DEFAULT_INSTANCE = newBuilder().build();

    private String userID;

    private int newLevel;

    private int currentExp;

    private int nextLevelExp;

    private boolean __merge_lock = false;
    private int __bitField0;

    private UserLevelUpResponse() {
        this.userID = "";
        this.newLevel = 0;
        this.currentExp = 0;
        this.nextLevelExp = 0;
    }

    private UserLevelUpResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static UserLevelUpResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<UserLevelUpResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getUserID() {
        return userID;
    }

    public boolean hasUserID() {
        return (__bitField0 & 1) == 1;
    }

    public UserLevelUpResponse withUserID(String value) {
        return UserLevelUpResponse.newBuilder()
            .mergeFrom(this)
            .setUserID(value)
            .build();
    }

    public int getNewLevel() {
        return newLevel;
    }

    public boolean hasNewLevel() {
        return (__bitField0 & 2) == 2;
    }

    public UserLevelUpResponse withNewLevel(int value) {
        return UserLevelUpResponse.newBuilder()
            .mergeFrom(this)
            .setNewLevel(value)
            .build();
    }

    public int getCurrentExp() {
        return currentExp;
    }

    public boolean hasCurrentExp() {
        return (__bitField0 & 4) == 4;
    }

    public UserLevelUpResponse withCurrentExp(int value) {
        return UserLevelUpResponse.newBuilder()
            .mergeFrom(this)
            .setCurrentExp(value)
            .build();
    }

    public int getNextLevelExp() {
        return nextLevelExp;
    }

    public boolean hasNextLevelExp() {
        return (__bitField0 & 8) == 8;
    }

    public UserLevelUpResponse withNextLevelExp(int value) {
        return UserLevelUpResponse.newBuilder()
            .mergeFrom(this)
            .setNextLevelExp(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<UserLevelUpResponse> cachedSchema() {
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
        UserLevelUpResponse that = (UserLevelUpResponse) obj;
        if (!java.util.Objects.equals(this.userID, that.userID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.newLevel, that.newLevel)) {
            return false;
        }
        if (!java.util.Objects.equals(this.currentExp, that.currentExp)) {
            return false;
        }
        if (!java.util.Objects.equals(this.nextLevelExp, that.nextLevelExp)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
        result = 31 * result + Integer.hashCode(this.newLevel);
        result = 31 * result + Integer.hashCode(this.currentExp);
        result = 31 * result + Integer.hashCode(this.nextLevelExp);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasUserID()) {
            parts.add("userID=" + getUserID());
        }
        if (hasNewLevel()) {
            parts.add("newLevel=" + getNewLevel());
        }
        if (hasCurrentExp()) {
            parts.add("currentExp=" + getCurrentExp());
        }
        if (hasNextLevelExp()) {
            parts.add("nextLevelExp=" + getNextLevelExp());
        }
        return "UserLevelUpResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<UserLevelUpResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("userID", 1);
        	__fieldMap.put("newLevel", 2);
        	__fieldMap.put("currentExp", 3);
        	__fieldMap.put("nextLevelExp", 4);
        }

        @Override
        public UserLevelUpResponse newMessage() {
            return new UserLevelUpResponse();
        }

        @Override
        public Class<UserLevelUpResponse> typeClass() {
            return UserLevelUpResponse.class;
        }

        @Override
        public String messageName() {
            return UserLevelUpResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return UserLevelUpResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(UserLevelUpResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, UserLevelUpResponse instance) throws java.io.IOException {
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
                    	instance.newLevel = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.currentExp = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.nextLevelExp = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, UserLevelUpResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.userID, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.newLevel, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.currentExp, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.nextLevelExp, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "userID";
        		case 2: return "newLevel";
        		case 3: return "currentExp";
        		case 4: return "nextLevelExp";
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

        private int newLevel;

        private int currentExp;

        private int nextLevelExp;

        private int __bitField0;

        private Builder() {
            this.userID = "";
            this.newLevel = 0;
            this.currentExp = 0;
            this.nextLevelExp = 0;
        }

        public Builder mergeFrom(UserLevelUpResponse instance) {
            if (instance.hasUserID()) {
                this.setUserID(instance.getUserID());
            }

            if (instance.hasNewLevel()) {
                this.setNewLevel(instance.getNewLevel());
            }

            if (instance.hasCurrentExp()) {
                this.setCurrentExp(instance.getCurrentExp());
            }

            if (instance.hasNextLevelExp()) {
                this.setNextLevelExp(instance.getNextLevelExp());
            }

            return this;
        }

        public String getUserID() {
            return userID;
        }

        public Builder setUserID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set UserLevelUpResponse#userID to null");
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

        public int getNewLevel() {
            return newLevel;
        }

        public Builder setNewLevel(int value) {
            this.newLevel = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearNewLevel() {
            this.newLevel = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasNewLevel() {
            return (__bitField0 & 2) == 2;
        }

        public int getCurrentExp() {
            return currentExp;
        }

        public Builder setCurrentExp(int value) {
            this.currentExp = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearCurrentExp() {
            this.currentExp = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasCurrentExp() {
            return (__bitField0 & 4) == 4;
        }

        public int getNextLevelExp() {
            return nextLevelExp;
        }

        public Builder setNextLevelExp(int value) {
            this.nextLevelExp = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearNextLevelExp() {
            this.nextLevelExp = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasNextLevelExp() {
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
            if (!java.util.Objects.equals(this.userID, that.userID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.newLevel, that.newLevel)) {
                return false;
            }
            if (!java.util.Objects.equals(this.currentExp, that.currentExp)) {
                return false;
            }
            if (!java.util.Objects.equals(this.nextLevelExp, that.nextLevelExp)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
            result = 31 * result + Integer.hashCode(this.newLevel);
            result = 31 * result + Integer.hashCode(this.currentExp);
            result = 31 * result + Integer.hashCode(this.nextLevelExp);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasUserID()) {
                parts.add("userID=" + getUserID());
            }
            if (hasNewLevel()) {
                parts.add("newLevel=" + getNewLevel());
            }
            if (hasCurrentExp()) {
                parts.add("currentExp=" + getCurrentExp());
            }
            if (hasNextLevelExp()) {
                parts.add("nextLevelExp=" + getNextLevelExp());
            }
            return "UserLevelUpResponse{" + String.join(", ", parts) + "}";
        }

        public UserLevelUpResponse build() {
            proto.message.UserLevelUpResponse result = new proto.message.UserLevelUpResponse();
            result.__bitField0 = __bitField0;
            result.userID = this.userID;
            result.newLevel = this.newLevel;
            result.currentExp = this.currentExp;
            result.nextLevelExp = this.nextLevelExp;
            return result;
        }

    }



}