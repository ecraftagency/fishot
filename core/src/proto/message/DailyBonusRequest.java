package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class DailyBonusRequest
        implements io.protostuff.Message<DailyBonusRequest> {

    private static final DailyBonusRequest DEFAULT_INSTANCE = newBuilder().build();

    private boolean __merge_lock = false;

    private DailyBonusRequest() {
    }

    private DailyBonusRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static DailyBonusRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<DailyBonusRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }



    @Override
    public io.protostuff.Schema<DailyBonusRequest> cachedSchema() {
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
        DailyBonusRequest that = (DailyBonusRequest) obj;
        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        return "DailyBonusRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<DailyBonusRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        }

        @Override
        public DailyBonusRequest newMessage() {
            return new DailyBonusRequest();
        }

        @Override
        public Class<DailyBonusRequest> typeClass() {
            return DailyBonusRequest.class;
        }

        @Override
        public String messageName() {
            return DailyBonusRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return DailyBonusRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(DailyBonusRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, DailyBonusRequest instance) throws java.io.IOException {
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
        public void writeTo(io.protostuff.Output output, DailyBonusRequest instance) throws java.io.IOException {
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

        public Builder mergeFrom(DailyBonusRequest instance) {
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
            return "DailyBonusRequest{" + String.join(", ", parts) + "}";
        }

        public DailyBonusRequest build() {
            proto.message.DailyBonusRequest result = new proto.message.DailyBonusRequest();
            return result;
        }

    }



}