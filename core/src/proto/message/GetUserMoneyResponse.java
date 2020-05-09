package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class GetUserMoneyResponse
        implements io.protostuff.Message<GetUserMoneyResponse> {

    private static final GetUserMoneyResponse DEFAULT_INSTANCE = newBuilder().build();

    private String userID;

    private int gold1;

    private int gold2;

    private int gold3;

    private boolean __merge_lock = false;
    private int __bitField0;

    private GetUserMoneyResponse() {
        this.userID = "";
        this.gold1 = 0;
        this.gold2 = 0;
        this.gold3 = 0;
    }

    private GetUserMoneyResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static GetUserMoneyResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<GetUserMoneyResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getUserID() {
        return userID;
    }

    public boolean hasUserID() {
        return (__bitField0 & 1) == 1;
    }

    public GetUserMoneyResponse withUserID(String value) {
        return GetUserMoneyResponse.newBuilder()
            .mergeFrom(this)
            .setUserID(value)
            .build();
    }

    public int getGold1() {
        return gold1;
    }

    public boolean hasGold1() {
        return (__bitField0 & 2) == 2;
    }

    public GetUserMoneyResponse withGold1(int value) {
        return GetUserMoneyResponse.newBuilder()
            .mergeFrom(this)
            .setGold1(value)
            .build();
    }

    public int getGold2() {
        return gold2;
    }

    public boolean hasGold2() {
        return (__bitField0 & 4) == 4;
    }

    public GetUserMoneyResponse withGold2(int value) {
        return GetUserMoneyResponse.newBuilder()
            .mergeFrom(this)
            .setGold2(value)
            .build();
    }

    public int getGold3() {
        return gold3;
    }

    public boolean hasGold3() {
        return (__bitField0 & 8) == 8;
    }

    public GetUserMoneyResponse withGold3(int value) {
        return GetUserMoneyResponse.newBuilder()
            .mergeFrom(this)
            .setGold3(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<GetUserMoneyResponse> cachedSchema() {
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
        GetUserMoneyResponse that = (GetUserMoneyResponse) obj;
        if (!java.util.Objects.equals(this.userID, that.userID)) {
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

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
        result = 31 * result + Integer.hashCode(this.gold1);
        result = 31 * result + Integer.hashCode(this.gold2);
        result = 31 * result + Integer.hashCode(this.gold3);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasUserID()) {
            parts.add("userID=" + getUserID());
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
        return "GetUserMoneyResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<GetUserMoneyResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("userID", 1);
        	__fieldMap.put("gold1", 2);
        	__fieldMap.put("gold2", 3);
        	__fieldMap.put("gold3", 4);
        }

        @Override
        public GetUserMoneyResponse newMessage() {
            return new GetUserMoneyResponse();
        }

        @Override
        public Class<GetUserMoneyResponse> typeClass() {
            return GetUserMoneyResponse.class;
        }

        @Override
        public String messageName() {
            return GetUserMoneyResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return GetUserMoneyResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(GetUserMoneyResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, GetUserMoneyResponse instance) throws java.io.IOException {
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
                    	instance.gold1 = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.gold2 = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.gold3 = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, GetUserMoneyResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.userID, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.gold1, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.gold2, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.gold3, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "userID";
        		case 2: return "gold1";
        		case 3: return "gold2";
        		case 4: return "gold3";
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

        private int gold1;

        private int gold2;

        private int gold3;

        private int __bitField0;

        private Builder() {
            this.userID = "";
            this.gold1 = 0;
            this.gold2 = 0;
            this.gold3 = 0;
        }

        public Builder mergeFrom(GetUserMoneyResponse instance) {
            if (instance.hasUserID()) {
                this.setUserID(instance.getUserID());
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

            return this;
        }

        public String getUserID() {
            return userID;
        }

        public Builder setUserID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GetUserMoneyResponse#userID to null");
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

        public int getGold1() {
            return gold1;
        }

        public Builder setGold1(int value) {
            this.gold1 = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearGold1() {
            this.gold1 = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasGold1() {
            return (__bitField0 & 2) == 2;
        }

        public int getGold2() {
            return gold2;
        }

        public Builder setGold2(int value) {
            this.gold2 = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearGold2() {
            this.gold2 = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasGold2() {
            return (__bitField0 & 4) == 4;
        }

        public int getGold3() {
            return gold3;
        }

        public Builder setGold3(int value) {
            this.gold3 = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearGold3() {
            this.gold3 = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasGold3() {
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
            if (!java.util.Objects.equals(this.gold1, that.gold1)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gold2, that.gold2)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gold3, that.gold3)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
            result = 31 * result + Integer.hashCode(this.gold1);
            result = 31 * result + Integer.hashCode(this.gold2);
            result = 31 * result + Integer.hashCode(this.gold3);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasUserID()) {
                parts.add("userID=" + getUserID());
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
            return "GetUserMoneyResponse{" + String.join(", ", parts) + "}";
        }

        public GetUserMoneyResponse build() {
            proto.message.GetUserMoneyResponse result = new proto.message.GetUserMoneyResponse();
            result.__bitField0 = __bitField0;
            result.userID = this.userID;
            result.gold1 = this.gold1;
            result.gold2 = this.gold2;
            result.gold3 = this.gold3;
            return result;
        }

    }



}