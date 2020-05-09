package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_happy_play.proto")
public final class HPCDInfoRequest
        implements io.protostuff.Message<HPCDInfoRequest> {

    private static final HPCDInfoRequest DEFAULT_INSTANCE = newBuilder().build();

    private boolean __merge_lock = false;

    private HPCDInfoRequest() {
    }

    private HPCDInfoRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static HPCDInfoRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<HPCDInfoRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }



    @Override
    public io.protostuff.Schema<HPCDInfoRequest> cachedSchema() {
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
        HPCDInfoRequest that = (HPCDInfoRequest) obj;
        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        return "HPCDInfoRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<HPCDInfoRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        }

        @Override
        public HPCDInfoRequest newMessage() {
            return new HPCDInfoRequest();
        }

        @Override
        public Class<HPCDInfoRequest> typeClass() {
            return HPCDInfoRequest.class;
        }

        @Override
        public String messageName() {
            return HPCDInfoRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return HPCDInfoRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(HPCDInfoRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, HPCDInfoRequest instance) throws java.io.IOException {
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
        public void writeTo(io.protostuff.Output output, HPCDInfoRequest instance) throws java.io.IOException {
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

        public Builder mergeFrom(HPCDInfoRequest instance) {
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
            return "HPCDInfoRequest{" + String.join(", ", parts) + "}";
        }

        public HPCDInfoRequest build() {
            proto.message.HPCDInfoRequest result = new proto.message.HPCDInfoRequest();
            return result;
        }

    }



}