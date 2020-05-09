package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class JoinGameRequest
        implements io.protostuff.Message<JoinGameRequest> {

    private static final JoinGameRequest DEFAULT_INSTANCE = newBuilder().build();

    private int gameID;

    private boolean __merge_lock = false;
    private int __bitField0;

    private JoinGameRequest() {
        this.gameID = 0;
    }

    private JoinGameRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static JoinGameRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<JoinGameRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getGameID() {
        return gameID;
    }

    public boolean hasGameID() {
        return (__bitField0 & 1) == 1;
    }

    public JoinGameRequest withGameID(int value) {
        return JoinGameRequest.newBuilder()
            .mergeFrom(this)
            .setGameID(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<JoinGameRequest> cachedSchema() {
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
        JoinGameRequest that = (JoinGameRequest) obj;
        if (!java.util.Objects.equals(this.gameID, that.gameID)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.gameID);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasGameID()) {
            parts.add("gameID=" + getGameID());
        }
        return "JoinGameRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<JoinGameRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("gameID", 1);
        }

        @Override
        public JoinGameRequest newMessage() {
            return new JoinGameRequest();
        }

        @Override
        public Class<JoinGameRequest> typeClass() {
            return JoinGameRequest.class;
        }

        @Override
        public String messageName() {
            return JoinGameRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return JoinGameRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(JoinGameRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, JoinGameRequest instance) throws java.io.IOException {
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
                    	instance.gameID = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, JoinGameRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.gameID, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "gameID";
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

        private int gameID;

        private int __bitField0;

        private Builder() {
            this.gameID = 0;
        }

        public Builder mergeFrom(JoinGameRequest instance) {
            if (instance.hasGameID()) {
                this.setGameID(instance.getGameID());
            }

            return this;
        }

        public int getGameID() {
            return gameID;
        }

        public Builder setGameID(int value) {
            this.gameID = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearGameID() {
            this.gameID = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasGameID() {
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
            if (!java.util.Objects.equals(this.gameID, that.gameID)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.gameID);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasGameID()) {
                parts.add("gameID=" + getGameID());
            }
            return "JoinGameRequest{" + String.join(", ", parts) + "}";
        }

        public JoinGameRequest build() {
            proto.message.JoinGameRequest result = new proto.message.JoinGameRequest();
            result.__bitField0 = __bitField0;
            result.gameID = this.gameID;
            return result;
        }

    }



}