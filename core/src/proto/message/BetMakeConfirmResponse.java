package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class BetMakeConfirmResponse
        implements io.protostuff.Message<BetMakeConfirmResponse> {

    private static final BetMakeConfirmResponse DEFAULT_INSTANCE = newBuilder().build();

    private boolean __merge_lock = false;

    private BetMakeConfirmResponse() {
    }

    private BetMakeConfirmResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static BetMakeConfirmResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<BetMakeConfirmResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }



    @Override
    public io.protostuff.Schema<BetMakeConfirmResponse> cachedSchema() {
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
        BetMakeConfirmResponse that = (BetMakeConfirmResponse) obj;
        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        return "BetMakeConfirmResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<BetMakeConfirmResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        }

        @Override
        public BetMakeConfirmResponse newMessage() {
            return new BetMakeConfirmResponse();
        }

        @Override
        public Class<BetMakeConfirmResponse> typeClass() {
            return BetMakeConfirmResponse.class;
        }

        @Override
        public String messageName() {
            return BetMakeConfirmResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return BetMakeConfirmResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(BetMakeConfirmResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, BetMakeConfirmResponse instance) throws java.io.IOException {
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
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, BetMakeConfirmResponse instance) throws java.io.IOException {
        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
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


        private Builder() {
        }

        public Builder mergeFrom(BetMakeConfirmResponse instance) {
            return this;
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
            return true;
        }

        @Override
        public int hashCode() {
            return 0;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            return "BetMakeConfirmResponse{" + String.join(", ", parts) + "}";
        }

        public BetMakeConfirmResponse build() {
            proto.message.BetMakeConfirmResponse result = new proto.message.BetMakeConfirmResponse();
            return result;
        }

    }



}