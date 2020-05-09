package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class DonateFriendCheckGiftResponse
        implements io.protostuff.Message<DonateFriendCheckGiftResponse> {

    private static final DonateFriendCheckGiftResponse DEFAULT_INSTANCE = newBuilder().build();

    private boolean haveGift;

    private boolean __merge_lock = false;
    private int __bitField0;

    private DonateFriendCheckGiftResponse() {
        this.haveGift = false;
    }

    private DonateFriendCheckGiftResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static DonateFriendCheckGiftResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<DonateFriendCheckGiftResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public boolean getHaveGift() {
        return haveGift;
    }

    public boolean hasHaveGift() {
        return (__bitField0 & 1) == 1;
    }

    public DonateFriendCheckGiftResponse withHaveGift(boolean value) {
        return DonateFriendCheckGiftResponse.newBuilder()
            .mergeFrom(this)
            .setHaveGift(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<DonateFriendCheckGiftResponse> cachedSchema() {
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
        DonateFriendCheckGiftResponse that = (DonateFriendCheckGiftResponse) obj;
        if (!java.util.Objects.equals(this.haveGift, that.haveGift)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Boolean.hashCode(this.haveGift);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasHaveGift()) {
            parts.add("haveGift=" + getHaveGift());
        }
        return "DonateFriendCheckGiftResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<DonateFriendCheckGiftResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("haveGift", 1);
        }

        @Override
        public DonateFriendCheckGiftResponse newMessage() {
            return new DonateFriendCheckGiftResponse();
        }

        @Override
        public Class<DonateFriendCheckGiftResponse> typeClass() {
            return DonateFriendCheckGiftResponse.class;
        }

        @Override
        public String messageName() {
            return DonateFriendCheckGiftResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return DonateFriendCheckGiftResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(DonateFriendCheckGiftResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, DonateFriendCheckGiftResponse instance) throws java.io.IOException {
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
                    	instance.haveGift = input.readBool();
                    	instance.__bitField0 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, DonateFriendCheckGiftResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeBool(1, instance.haveGift, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "haveGift";
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

        private boolean haveGift;

        private int __bitField0;

        private Builder() {
            this.haveGift = false;
        }

        public Builder mergeFrom(DonateFriendCheckGiftResponse instance) {
            if (instance.hasHaveGift()) {
                this.setHaveGift(instance.getHaveGift());
            }

            return this;
        }

        public boolean getHaveGift() {
            return haveGift;
        }

        public Builder setHaveGift(boolean value) {
            this.haveGift = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearHaveGift() {
            this.haveGift = false;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasHaveGift() {
            return (__bitField0 & 1) == 1;
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
            if (!java.util.Objects.equals(this.haveGift, that.haveGift)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Boolean.hashCode(this.haveGift);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasHaveGift()) {
                parts.add("haveGift=" + getHaveGift());
            }
            return "DonateFriendCheckGiftResponse{" + String.join(", ", parts) + "}";
        }

        public DonateFriendCheckGiftResponse build() {
            proto.message.DonateFriendCheckGiftResponse result = new proto.message.DonateFriendCheckGiftResponse();
            result.__bitField0 = __bitField0;
            result.haveGift = this.haveGift;
            return result;
        }

    }



}