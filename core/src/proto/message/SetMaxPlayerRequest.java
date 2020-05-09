package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class SetMaxPlayerRequest
        implements io.protostuff.Message<SetMaxPlayerRequest> {

    private static final SetMaxPlayerRequest DEFAULT_INSTANCE = newBuilder().build();

    private int maxPlayer;

    private boolean __merge_lock = false;
    private int __bitField0;

    private SetMaxPlayerRequest() {
        this.maxPlayer = 0;
    }

    private SetMaxPlayerRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static SetMaxPlayerRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<SetMaxPlayerRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getMaxPlayer() {
        return maxPlayer;
    }

    public boolean hasMaxPlayer() {
        return (__bitField0 & 1) == 1;
    }

    public SetMaxPlayerRequest withMaxPlayer(int value) {
        return SetMaxPlayerRequest.newBuilder()
            .mergeFrom(this)
            .setMaxPlayer(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<SetMaxPlayerRequest> cachedSchema() {
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
        SetMaxPlayerRequest that = (SetMaxPlayerRequest) obj;
        if (!java.util.Objects.equals(this.maxPlayer, that.maxPlayer)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.maxPlayer);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasMaxPlayer()) {
            parts.add("maxPlayer=" + getMaxPlayer());
        }
        return "SetMaxPlayerRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<SetMaxPlayerRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("maxPlayer", 1);
        }

        @Override
        public SetMaxPlayerRequest newMessage() {
            return new SetMaxPlayerRequest();
        }

        @Override
        public Class<SetMaxPlayerRequest> typeClass() {
            return SetMaxPlayerRequest.class;
        }

        @Override
        public String messageName() {
            return SetMaxPlayerRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return SetMaxPlayerRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(SetMaxPlayerRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, SetMaxPlayerRequest instance) throws java.io.IOException {
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
                    	instance.maxPlayer = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, SetMaxPlayerRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.maxPlayer, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "maxPlayer";
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

        private int maxPlayer;

        private int __bitField0;

        private Builder() {
            this.maxPlayer = 0;
        }

        public Builder mergeFrom(SetMaxPlayerRequest instance) {
            if (instance.hasMaxPlayer()) {
                this.setMaxPlayer(instance.getMaxPlayer());
            }

            return this;
        }

        public int getMaxPlayer() {
            return maxPlayer;
        }

        public Builder setMaxPlayer(int value) {
            this.maxPlayer = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearMaxPlayer() {
            this.maxPlayer = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasMaxPlayer() {
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
            if (!java.util.Objects.equals(this.maxPlayer, that.maxPlayer)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.maxPlayer);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasMaxPlayer()) {
                parts.add("maxPlayer=" + getMaxPlayer());
            }
            return "SetMaxPlayerRequest{" + String.join(", ", parts) + "}";
        }

        public SetMaxPlayerRequest build() {
            proto.message.SetMaxPlayerRequest result = new proto.message.SetMaxPlayerRequest();
            result.__bitField0 = __bitField0;
            result.maxPlayer = this.maxPlayer;
            return result;
        }

    }



}