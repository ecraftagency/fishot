package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class PlayerReadyRequest
        implements io.protostuff.Message<PlayerReadyRequest> {

    private static final PlayerReadyRequest DEFAULT_INSTANCE = newBuilder().build();

    private boolean readyStatus;

    private boolean __merge_lock = false;
    private int __bitField0;

    private PlayerReadyRequest() {
        this.readyStatus = false;
    }

    private PlayerReadyRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static PlayerReadyRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<PlayerReadyRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public boolean getReadyStatus() {
        return readyStatus;
    }

    public boolean hasReadyStatus() {
        return (__bitField0 & 1) == 1;
    }

    public PlayerReadyRequest withReadyStatus(boolean value) {
        return PlayerReadyRequest.newBuilder()
            .mergeFrom(this)
            .setReadyStatus(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<PlayerReadyRequest> cachedSchema() {
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
        PlayerReadyRequest that = (PlayerReadyRequest) obj;
        if (!java.util.Objects.equals(this.readyStatus, that.readyStatus)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Boolean.hashCode(this.readyStatus);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasReadyStatus()) {
            parts.add("readyStatus=" + getReadyStatus());
        }
        return "PlayerReadyRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<PlayerReadyRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("readyStatus", 1);
        }

        @Override
        public PlayerReadyRequest newMessage() {
            return new PlayerReadyRequest();
        }

        @Override
        public Class<PlayerReadyRequest> typeClass() {
            return PlayerReadyRequest.class;
        }

        @Override
        public String messageName() {
            return PlayerReadyRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return PlayerReadyRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(PlayerReadyRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, PlayerReadyRequest instance) throws java.io.IOException {
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
                    	instance.readyStatus = input.readBool();
                    	instance.__bitField0 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, PlayerReadyRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeBool(1, instance.readyStatus, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "readyStatus";
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

        private boolean readyStatus;

        private int __bitField0;

        private Builder() {
            this.readyStatus = false;
        }

        public Builder mergeFrom(PlayerReadyRequest instance) {
            if (instance.hasReadyStatus()) {
                this.setReadyStatus(instance.getReadyStatus());
            }

            return this;
        }

        public boolean getReadyStatus() {
            return readyStatus;
        }

        public Builder setReadyStatus(boolean value) {
            this.readyStatus = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearReadyStatus() {
            this.readyStatus = false;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasReadyStatus() {
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
            if (!java.util.Objects.equals(this.readyStatus, that.readyStatus)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Boolean.hashCode(this.readyStatus);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasReadyStatus()) {
                parts.add("readyStatus=" + getReadyStatus());
            }
            return "PlayerReadyRequest{" + String.join(", ", parts) + "}";
        }

        public PlayerReadyRequest build() {
            proto.message.PlayerReadyRequest result = new proto.message.PlayerReadyRequest();
            result.__bitField0 = __bitField0;
            result.readyStatus = this.readyStatus;
            return result;
        }

    }



}