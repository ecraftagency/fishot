package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class ReviveBoardRequest
        implements io.protostuff.Message<ReviveBoardRequest> {

    private static final ReviveBoardRequest DEFAULT_INSTANCE = newBuilder().build();

    private int gameId;

    private boolean __merge_lock = false;
    private int __bitField0;

    private ReviveBoardRequest() {
        this.gameId = 0;
    }

    private ReviveBoardRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ReviveBoardRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<ReviveBoardRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getGameId() {
        return gameId;
    }

    public boolean hasGameId() {
        return (__bitField0 & 1) == 1;
    }

    public ReviveBoardRequest withGameId(int value) {
        return ReviveBoardRequest.newBuilder()
            .mergeFrom(this)
            .setGameId(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<ReviveBoardRequest> cachedSchema() {
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
        ReviveBoardRequest that = (ReviveBoardRequest) obj;
        if (!java.util.Objects.equals(this.gameId, that.gameId)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.gameId);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasGameId()) {
            parts.add("gameId=" + getGameId());
        }
        return "ReviveBoardRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<ReviveBoardRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("gameId", 1);
        }

        @Override
        public ReviveBoardRequest newMessage() {
            return new ReviveBoardRequest();
        }

        @Override
        public Class<ReviveBoardRequest> typeClass() {
            return ReviveBoardRequest.class;
        }

        @Override
        public String messageName() {
            return ReviveBoardRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return ReviveBoardRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(ReviveBoardRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, ReviveBoardRequest instance) throws java.io.IOException {
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
                    	instance.gameId = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, ReviveBoardRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.gameId, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "gameId";
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

        private int gameId;

        private int __bitField0;

        private Builder() {
            this.gameId = 0;
        }

        public Builder mergeFrom(ReviveBoardRequest instance) {
            if (instance.hasGameId()) {
                this.setGameId(instance.getGameId());
            }

            return this;
        }

        public int getGameId() {
            return gameId;
        }

        public Builder setGameId(int value) {
            this.gameId = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearGameId() {
            this.gameId = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasGameId() {
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
            if (!java.util.Objects.equals(this.gameId, that.gameId)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.gameId);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasGameId()) {
                parts.add("gameId=" + getGameId());
            }
            return "ReviveBoardRequest{" + String.join(", ", parts) + "}";
        }

        public ReviveBoardRequest build() {
            proto.message.ReviveBoardRequest result = new proto.message.ReviveBoardRequest();
            result.__bitField0 = __bitField0;
            result.gameId = this.gameId;
            return result;
        }

    }



}