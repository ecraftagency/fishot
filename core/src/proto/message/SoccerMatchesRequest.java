package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class SoccerMatchesRequest
        implements io.protostuff.Message<SoccerMatchesRequest> {

    private static final SoccerMatchesRequest DEFAULT_INSTANCE = newBuilder().build();

    private int type;

    private boolean __merge_lock = false;
    private int __bitField0;

    private SoccerMatchesRequest() {
        this.type = proto.message.SoccerMatchType.MATCH_TYPE_NEXT_MATCHES.getNumber();
    }

    private SoccerMatchesRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static SoccerMatchesRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<SoccerMatchesRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public proto.message.SoccerMatchType getType() {
        return proto.message.SoccerMatchType.valueOf(type);
    }

    public int getTypeValue() {
        return type;
    }

    public boolean hasType() {
        return (__bitField0 & 1) == 1;
    }

    public SoccerMatchesRequest withType(proto.message.SoccerMatchType value) {
        return SoccerMatchesRequest.newBuilder()
            .mergeFrom(this)
            .setType(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<SoccerMatchesRequest> cachedSchema() {
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
        SoccerMatchesRequest that = (SoccerMatchesRequest) obj;
        if (!java.util.Objects.equals(this.type, that.type)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.type);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasType()) {
            parts.add("type=" + getType() + '(' + getTypeValue() + ')');
        }
        return "SoccerMatchesRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<SoccerMatchesRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("type", 1);
        }

        @Override
        public SoccerMatchesRequest newMessage() {
            return new SoccerMatchesRequest();
        }

        @Override
        public Class<SoccerMatchesRequest> typeClass() {
            return SoccerMatchesRequest.class;
        }

        @Override
        public String messageName() {
            return SoccerMatchesRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return SoccerMatchesRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(SoccerMatchesRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, SoccerMatchesRequest instance) throws java.io.IOException {
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
                    	instance.type = input.readEnum();
                    	instance.__bitField0 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, SoccerMatchesRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.type, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "type";
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

        private int type;

        private int __bitField0;

        private Builder() {
            this.type = proto.message.SoccerMatchType.MATCH_TYPE_NEXT_MATCHES.getNumber();
        }

        public Builder mergeFrom(SoccerMatchesRequest instance) {
            if (instance.hasType()) {
                this.setType(instance.getType());
            }

            return this;
        }

        public proto.message.SoccerMatchType getType() {
            return proto.message.SoccerMatchType.valueOf(type);
        }

        public int getTypeValue() {
            return type;
        }

        public Builder setType(proto.message.SoccerMatchType value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SoccerMatchesRequest#type to null");
            }

            if (value == proto.message.SoccerMatchType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set SoccerMatchesRequest#type to UNRECOGNIZED");
            }

            this.type = value.getNumber();
            __bitField0 |= 1;
            return this;
        }

        public Builder setTypeValue(int value) {
            this.type = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearType() {
            this.type = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasType() {
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
            if (!java.util.Objects.equals(this.type, that.type)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.type);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasType()) {
                parts.add("type=" + getType() + '(' + getTypeValue() + ')');
            }
            return "SoccerMatchesRequest{" + String.join(", ", parts) + "}";
        }

        public SoccerMatchesRequest build() {
            proto.message.SoccerMatchesRequest result = new proto.message.SoccerMatchesRequest();
            result.__bitField0 = __bitField0;
            result.type = this.type;
            return result;
        }

    }



}