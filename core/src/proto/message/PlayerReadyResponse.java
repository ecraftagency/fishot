package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class PlayerReadyResponse
        implements io.protostuff.Message<PlayerReadyResponse> {

    private static final PlayerReadyResponse DEFAULT_INSTANCE = newBuilder().build();

    private String userID;

    private boolean readyStatus;

    private boolean __merge_lock = false;
    private int __bitField0;

    private PlayerReadyResponse() {
        this.userID = "";
        this.readyStatus = false;
    }

    private PlayerReadyResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static PlayerReadyResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<PlayerReadyResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getUserID() {
        return userID;
    }

    public boolean hasUserID() {
        return (__bitField0 & 1) == 1;
    }

    public PlayerReadyResponse withUserID(String value) {
        return PlayerReadyResponse.newBuilder()
            .mergeFrom(this)
            .setUserID(value)
            .build();
    }

    public boolean getReadyStatus() {
        return readyStatus;
    }

    public boolean hasReadyStatus() {
        return (__bitField0 & 2) == 2;
    }

    public PlayerReadyResponse withReadyStatus(boolean value) {
        return PlayerReadyResponse.newBuilder()
            .mergeFrom(this)
            .setReadyStatus(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<PlayerReadyResponse> cachedSchema() {
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
        PlayerReadyResponse that = (PlayerReadyResponse) obj;
        if (!java.util.Objects.equals(this.userID, that.userID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.readyStatus, that.readyStatus)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
        result = 31 * result + Boolean.hashCode(this.readyStatus);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasUserID()) {
            parts.add("userID=" + getUserID());
        }
        if (hasReadyStatus()) {
            parts.add("readyStatus=" + getReadyStatus());
        }
        return "PlayerReadyResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<PlayerReadyResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("userID", 1);
        	__fieldMap.put("readyStatus", 2);
        }

        @Override
        public PlayerReadyResponse newMessage() {
            return new PlayerReadyResponse();
        }

        @Override
        public Class<PlayerReadyResponse> typeClass() {
            return PlayerReadyResponse.class;
        }

        @Override
        public String messageName() {
            return PlayerReadyResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return PlayerReadyResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(PlayerReadyResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, PlayerReadyResponse instance) throws java.io.IOException {
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
                    	instance.readyStatus = input.readBool();
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, PlayerReadyResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.userID, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeBool(2, instance.readyStatus, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "userID";
        		case 2: return "readyStatus";
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

        private boolean readyStatus;

        private int __bitField0;

        private Builder() {
            this.userID = "";
            this.readyStatus = false;
        }

        public Builder mergeFrom(PlayerReadyResponse instance) {
            if (instance.hasUserID()) {
                this.setUserID(instance.getUserID());
            }

            if (instance.hasReadyStatus()) {
                this.setReadyStatus(instance.getReadyStatus());
            }

            return this;
        }

        public String getUserID() {
            return userID;
        }

        public Builder setUserID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set PlayerReadyResponse#userID to null");
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

        public boolean getReadyStatus() {
            return readyStatus;
        }

        public Builder setReadyStatus(boolean value) {
            this.readyStatus = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearReadyStatus() {
            this.readyStatus = false;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasReadyStatus() {
            return (__bitField0 & 2) == 2;
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
            if (!java.util.Objects.equals(this.readyStatus, that.readyStatus)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
            result = 31 * result + Boolean.hashCode(this.readyStatus);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasUserID()) {
                parts.add("userID=" + getUserID());
            }
            if (hasReadyStatus()) {
                parts.add("readyStatus=" + getReadyStatus());
            }
            return "PlayerReadyResponse{" + String.join(", ", parts) + "}";
        }

        public PlayerReadyResponse build() {
            proto.message.PlayerReadyResponse result = new proto.message.PlayerReadyResponse();
            result.__bitField0 = __bitField0;
            result.userID = this.userID;
            result.readyStatus = this.readyStatus;
            return result;
        }

    }



}