package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class StartGameResponse
        implements io.protostuff.Message<StartGameResponse> {

    private static final StartGameResponse DEFAULT_INSTANCE = newBuilder().build();

    private int gameStatus;

    private boolean __merge_lock = false;
    private int __bitField0;

    private StartGameResponse() {
        this.gameStatus = 0;
    }

    private StartGameResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static StartGameResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<StartGameResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getGameStatus() {
        return gameStatus;
    }

    public boolean hasGameStatus() {
        return (__bitField0 & 1) == 1;
    }

    public StartGameResponse withGameStatus(int value) {
        return StartGameResponse.newBuilder()
            .mergeFrom(this)
            .setGameStatus(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<StartGameResponse> cachedSchema() {
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
        StartGameResponse that = (StartGameResponse) obj;
        if (!java.util.Objects.equals(this.gameStatus, that.gameStatus)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.gameStatus);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasGameStatus()) {
            parts.add("gameStatus=" + getGameStatus());
        }
        return "StartGameResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<StartGameResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("gameStatus", 1);
        }

        @Override
        public StartGameResponse newMessage() {
            return new StartGameResponse();
        }

        @Override
        public Class<StartGameResponse> typeClass() {
            return StartGameResponse.class;
        }

        @Override
        public String messageName() {
            return StartGameResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return StartGameResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(StartGameResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, StartGameResponse instance) throws java.io.IOException {
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
                    	instance.gameStatus = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, StartGameResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.gameStatus, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "gameStatus";
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

        private int gameStatus;

        private int __bitField0;

        private Builder() {
            this.gameStatus = 0;
        }

        public Builder mergeFrom(StartGameResponse instance) {
            if (instance.hasGameStatus()) {
                this.setGameStatus(instance.getGameStatus());
            }

            return this;
        }

        public int getGameStatus() {
            return gameStatus;
        }

        public Builder setGameStatus(int value) {
            this.gameStatus = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearGameStatus() {
            this.gameStatus = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasGameStatus() {
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
            if (!java.util.Objects.equals(this.gameStatus, that.gameStatus)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.gameStatus);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasGameStatus()) {
                parts.add("gameStatus=" + getGameStatus());
            }
            return "StartGameResponse{" + String.join(", ", parts) + "}";
        }

        public StartGameResponse build() {
            proto.message.StartGameResponse result = new proto.message.StartGameResponse();
            result.__bitField0 = __bitField0;
            result.gameStatus = this.gameStatus;
            return result;
        }

    }



}