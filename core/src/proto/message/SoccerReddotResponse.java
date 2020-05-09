package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class SoccerReddotResponse
        implements io.protostuff.Message<SoccerReddotResponse> {

    private static final SoccerReddotResponse DEFAULT_INSTANCE = newBuilder().build();

    private int reddot;

    private boolean __merge_lock = false;
    private int __bitField0;

    private SoccerReddotResponse() {
        this.reddot = 0;
    }

    private SoccerReddotResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static SoccerReddotResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<SoccerReddotResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getReddot() {
        return reddot;
    }

    public boolean hasReddot() {
        return (__bitField0 & 1) == 1;
    }

    public SoccerReddotResponse withReddot(int value) {
        return SoccerReddotResponse.newBuilder()
            .mergeFrom(this)
            .setReddot(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<SoccerReddotResponse> cachedSchema() {
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
        SoccerReddotResponse that = (SoccerReddotResponse) obj;
        if (!java.util.Objects.equals(this.reddot, that.reddot)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.reddot);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasReddot()) {
            parts.add("reddot=" + getReddot());
        }
        return "SoccerReddotResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<SoccerReddotResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("reddot", 1);
        }

        @Override
        public SoccerReddotResponse newMessage() {
            return new SoccerReddotResponse();
        }

        @Override
        public Class<SoccerReddotResponse> typeClass() {
            return SoccerReddotResponse.class;
        }

        @Override
        public String messageName() {
            return SoccerReddotResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return SoccerReddotResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(SoccerReddotResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, SoccerReddotResponse instance) throws java.io.IOException {
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
                    	instance.reddot = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, SoccerReddotResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.reddot, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "reddot";
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

        private int reddot;

        private int __bitField0;

        private Builder() {
            this.reddot = 0;
        }

        public Builder mergeFrom(SoccerReddotResponse instance) {
            if (instance.hasReddot()) {
                this.setReddot(instance.getReddot());
            }

            return this;
        }

        public int getReddot() {
            return reddot;
        }

        public Builder setReddot(int value) {
            this.reddot = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearReddot() {
            this.reddot = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasReddot() {
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
            if (!java.util.Objects.equals(this.reddot, that.reddot)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.reddot);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasReddot()) {
                parts.add("reddot=" + getReddot());
            }
            return "SoccerReddotResponse{" + String.join(", ", parts) + "}";
        }

        public SoccerReddotResponse build() {
            proto.message.SoccerReddotResponse result = new proto.message.SoccerReddotResponse();
            result.__bitField0 = __bitField0;
            result.reddot = this.reddot;
            return result;
        }

    }



}