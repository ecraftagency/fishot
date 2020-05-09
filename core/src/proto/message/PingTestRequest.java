package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public final class PingTestRequest
        implements io.protostuff.Message<PingTestRequest> {

    private static final PingTestRequest DEFAULT_INSTANCE = newBuilder().build();

    private long id;

    private boolean __merge_lock = false;
    private int __bitField0;

    private PingTestRequest() {
        this.id = 0L;
    }

    private PingTestRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static PingTestRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<PingTestRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public long getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 1) == 1;
    }

    public PingTestRequest withId(long value) {
        return PingTestRequest.newBuilder()
            .mergeFrom(this)
            .setId(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<PingTestRequest> cachedSchema() {
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
        PingTestRequest that = (PingTestRequest) obj;
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Long.hashCode(this.id);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasId()) {
            parts.add("id=" + getId());
        }
        return "PingTestRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<PingTestRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("id", 1);
        }

        @Override
        public PingTestRequest newMessage() {
            return new PingTestRequest();
        }

        @Override
        public Class<PingTestRequest> typeClass() {
            return PingTestRequest.class;
        }

        @Override
        public String messageName() {
            return PingTestRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return PingTestRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(PingTestRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, PingTestRequest instance) throws java.io.IOException {
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
                    	instance.id = input.readInt64();
                    	instance.__bitField0 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, PingTestRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt64(1, instance.id, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "id";
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

        private long id;

        private int __bitField0;

        private Builder() {
            this.id = 0L;
        }

        public Builder mergeFrom(PingTestRequest instance) {
            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            return this;
        }

        public long getId() {
            return id;
        }

        public Builder setId(long value) {
            this.id = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearId() {
            this.id = 0L;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasId() {
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
            if (!java.util.Objects.equals(this.id, that.id)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Long.hashCode(this.id);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasId()) {
                parts.add("id=" + getId());
            }
            return "PingTestRequest{" + String.join(", ", parts) + "}";
        }

        public PingTestRequest build() {
            proto.message.PingTestRequest result = new proto.message.PingTestRequest();
            result.__bitField0 = __bitField0;
            result.id = this.id;
            return result;
        }

    }



}