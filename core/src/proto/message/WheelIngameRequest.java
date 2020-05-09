package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class WheelIngameRequest
        implements io.protostuff.Message<WheelIngameRequest> {

    private static final WheelIngameRequest DEFAULT_INSTANCE = newBuilder().build();

    private int id;

    private boolean __merge_lock = false;
    private int __bitField0;

    private WheelIngameRequest() {
        this.id = 0;
    }

    private WheelIngameRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static WheelIngameRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<WheelIngameRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 1) == 1;
    }

    public WheelIngameRequest withId(int value) {
        return WheelIngameRequest.newBuilder()
            .mergeFrom(this)
            .setId(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<WheelIngameRequest> cachedSchema() {
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
        WheelIngameRequest that = (WheelIngameRequest) obj;
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.id);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasId()) {
            parts.add("id=" + getId());
        }
        return "WheelIngameRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<WheelIngameRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("id", 1);
        }

        @Override
        public WheelIngameRequest newMessage() {
            return new WheelIngameRequest();
        }

        @Override
        public Class<WheelIngameRequest> typeClass() {
            return WheelIngameRequest.class;
        }

        @Override
        public String messageName() {
            return WheelIngameRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return WheelIngameRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(WheelIngameRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, WheelIngameRequest instance) throws java.io.IOException {
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
                    	instance.id = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, WheelIngameRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.id, false);
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

        private int id;

        private int __bitField0;

        private Builder() {
            this.id = 0;
        }

        public Builder mergeFrom(WheelIngameRequest instance) {
            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            return this;
        }

        public int getId() {
            return id;
        }

        public Builder setId(int value) {
            this.id = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearId() {
            this.id = 0;
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
            result = 31 * result + Integer.hashCode(this.id);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasId()) {
                parts.add("id=" + getId());
            }
            return "WheelIngameRequest{" + String.join(", ", parts) + "}";
        }

        public WheelIngameRequest build() {
            proto.message.WheelIngameRequest result = new proto.message.WheelIngameRequest();
            result.__bitField0 = __bitField0;
            result.id = this.id;
            return result;
        }

    }



}