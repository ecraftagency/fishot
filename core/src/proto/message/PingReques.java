package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public final class PingReques
        implements io.protostuff.Message<PingReques> {

    private static final PingReques DEFAULT_INSTANCE = newBuilder().build();

    private boolean __merge_lock = false;

    private PingReques() {
    }

    private PingReques(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static PingReques getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<PingReques> getSchema()
    {
    	return Schema.INSTANCE;
    }



    @Override
    public io.protostuff.Schema<PingReques> cachedSchema() {
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
        PingReques that = (PingReques) obj;
        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        return "PingReques{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<PingReques>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        }

        @Override
        public PingReques newMessage() {
            return new PingReques();
        }

        @Override
        public Class<PingReques> typeClass() {
            return PingReques.class;
        }

        @Override
        public String messageName() {
            return PingReques.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return PingReques.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(PingReques message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, PingReques instance) throws java.io.IOException {
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
        public void writeTo(io.protostuff.Output output, PingReques instance) throws java.io.IOException {
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

        public Builder mergeFrom(PingReques instance) {
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
            return "PingReques{" + String.join(", ", parts) + "}";
        }

        public PingReques build() {
            proto.message.PingReques result = new proto.message.PingReques();
            return result;
        }

    }



}