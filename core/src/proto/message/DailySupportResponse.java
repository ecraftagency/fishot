package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class DailySupportResponse
        implements io.protostuff.Message<DailySupportResponse> {

    private static final DailySupportResponse DEFAULT_INSTANCE = newBuilder().build();

    private boolean isOutOfMoney;

    private boolean isInviteSNSFriend;

    private boolean __merge_lock = false;
    private int __bitField0;

    private DailySupportResponse() {
        this.isOutOfMoney = false;
        this.isInviteSNSFriend = false;
    }

    private DailySupportResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static DailySupportResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<DailySupportResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public boolean getIsOutOfMoney() {
        return isOutOfMoney;
    }

    public boolean hasIsOutOfMoney() {
        return (__bitField0 & 1) == 1;
    }

    public DailySupportResponse withIsOutOfMoney(boolean value) {
        return DailySupportResponse.newBuilder()
            .mergeFrom(this)
            .setIsOutOfMoney(value)
            .build();
    }

    public boolean getIsInviteSNSFriend() {
        return isInviteSNSFriend;
    }

    public boolean hasIsInviteSNSFriend() {
        return (__bitField0 & 2) == 2;
    }

    public DailySupportResponse withIsInviteSNSFriend(boolean value) {
        return DailySupportResponse.newBuilder()
            .mergeFrom(this)
            .setIsInviteSNSFriend(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<DailySupportResponse> cachedSchema() {
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
        DailySupportResponse that = (DailySupportResponse) obj;
        if (!java.util.Objects.equals(this.isOutOfMoney, that.isOutOfMoney)) {
            return false;
        }
        if (!java.util.Objects.equals(this.isInviteSNSFriend, that.isInviteSNSFriend)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Boolean.hashCode(this.isOutOfMoney);
        result = 31 * result + Boolean.hashCode(this.isInviteSNSFriend);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasIsOutOfMoney()) {
            parts.add("isOutOfMoney=" + getIsOutOfMoney());
        }
        if (hasIsInviteSNSFriend()) {
            parts.add("isInviteSNSFriend=" + getIsInviteSNSFriend());
        }
        return "DailySupportResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<DailySupportResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("isOutOfMoney", 1);
        	__fieldMap.put("isInviteSNSFriend", 2);
        }

        @Override
        public DailySupportResponse newMessage() {
            return new DailySupportResponse();
        }

        @Override
        public Class<DailySupportResponse> typeClass() {
            return DailySupportResponse.class;
        }

        @Override
        public String messageName() {
            return DailySupportResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return DailySupportResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(DailySupportResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, DailySupportResponse instance) throws java.io.IOException {
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
                    	instance.isOutOfMoney = input.readBool();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.isInviteSNSFriend = input.readBool();
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, DailySupportResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeBool(1, instance.isOutOfMoney, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeBool(2, instance.isInviteSNSFriend, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "isOutOfMoney";
        		case 2: return "isInviteSNSFriend";
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

        private boolean isOutOfMoney;

        private boolean isInviteSNSFriend;

        private int __bitField0;

        private Builder() {
            this.isOutOfMoney = false;
            this.isInviteSNSFriend = false;
        }

        public Builder mergeFrom(DailySupportResponse instance) {
            if (instance.hasIsOutOfMoney()) {
                this.setIsOutOfMoney(instance.getIsOutOfMoney());
            }

            if (instance.hasIsInviteSNSFriend()) {
                this.setIsInviteSNSFriend(instance.getIsInviteSNSFriend());
            }

            return this;
        }

        public boolean getIsOutOfMoney() {
            return isOutOfMoney;
        }

        public Builder setIsOutOfMoney(boolean value) {
            this.isOutOfMoney = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearIsOutOfMoney() {
            this.isOutOfMoney = false;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasIsOutOfMoney() {
            return (__bitField0 & 1) == 1;
        }

        public boolean getIsInviteSNSFriend() {
            return isInviteSNSFriend;
        }

        public Builder setIsInviteSNSFriend(boolean value) {
            this.isInviteSNSFriend = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearIsInviteSNSFriend() {
            this.isInviteSNSFriend = false;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasIsInviteSNSFriend() {
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
            if (!java.util.Objects.equals(this.isOutOfMoney, that.isOutOfMoney)) {
                return false;
            }
            if (!java.util.Objects.equals(this.isInviteSNSFriend, that.isInviteSNSFriend)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Boolean.hashCode(this.isOutOfMoney);
            result = 31 * result + Boolean.hashCode(this.isInviteSNSFriend);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasIsOutOfMoney()) {
                parts.add("isOutOfMoney=" + getIsOutOfMoney());
            }
            if (hasIsInviteSNSFriend()) {
                parts.add("isInviteSNSFriend=" + getIsInviteSNSFriend());
            }
            return "DailySupportResponse{" + String.join(", ", parts) + "}";
        }

        public DailySupportResponse build() {
            proto.message.DailySupportResponse result = new proto.message.DailySupportResponse();
            result.__bitField0 = __bitField0;
            result.isOutOfMoney = this.isOutOfMoney;
            result.isInviteSNSFriend = this.isInviteSNSFriend;
            return result;
        }

    }



}