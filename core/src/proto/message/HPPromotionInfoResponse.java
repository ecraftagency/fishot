package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_happy_play.proto")
public final class HPPromotionInfoResponse
        implements io.protostuff.Message<HPPromotionInfoResponse> {

    private static final HPPromotionInfoResponse DEFAULT_INSTANCE = newBuilder().build();

    private long timeleft;

    private boolean __merge_lock = false;
    private int __bitField0;

    private HPPromotionInfoResponse() {
        this.timeleft = 0L;
    }

    private HPPromotionInfoResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static HPPromotionInfoResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<HPPromotionInfoResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public long getTimeleft() {
        return timeleft;
    }

    public boolean hasTimeleft() {
        return (__bitField0 & 1) == 1;
    }

    public HPPromotionInfoResponse withTimeleft(long value) {
        return HPPromotionInfoResponse.newBuilder()
            .mergeFrom(this)
            .setTimeleft(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<HPPromotionInfoResponse> cachedSchema() {
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
        HPPromotionInfoResponse that = (HPPromotionInfoResponse) obj;
        if (!java.util.Objects.equals(this.timeleft, that.timeleft)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Long.hashCode(this.timeleft);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasTimeleft()) {
            parts.add("timeleft=" + getTimeleft());
        }
        return "HPPromotionInfoResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<HPPromotionInfoResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("timeleft", 1);
        }

        @Override
        public HPPromotionInfoResponse newMessage() {
            return new HPPromotionInfoResponse();
        }

        @Override
        public Class<HPPromotionInfoResponse> typeClass() {
            return HPPromotionInfoResponse.class;
        }

        @Override
        public String messageName() {
            return HPPromotionInfoResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return HPPromotionInfoResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(HPPromotionInfoResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, HPPromotionInfoResponse instance) throws java.io.IOException {
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
                    	instance.timeleft = input.readInt64();
                    	instance.__bitField0 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, HPPromotionInfoResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt64(1, instance.timeleft, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "timeleft";
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

        private long timeleft;

        private int __bitField0;

        private Builder() {
            this.timeleft = 0L;
        }

        public Builder mergeFrom(HPPromotionInfoResponse instance) {
            if (instance.hasTimeleft()) {
                this.setTimeleft(instance.getTimeleft());
            }

            return this;
        }

        public long getTimeleft() {
            return timeleft;
        }

        public Builder setTimeleft(long value) {
            this.timeleft = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearTimeleft() {
            this.timeleft = 0L;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasTimeleft() {
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
            if (!java.util.Objects.equals(this.timeleft, that.timeleft)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Long.hashCode(this.timeleft);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasTimeleft()) {
                parts.add("timeleft=" + getTimeleft());
            }
            return "HPPromotionInfoResponse{" + String.join(", ", parts) + "}";
        }

        public HPPromotionInfoResponse build() {
            proto.message.HPPromotionInfoResponse result = new proto.message.HPPromotionInfoResponse();
            result.__bitField0 = __bitField0;
            result.timeleft = this.timeleft;
            return result;
        }

    }



}