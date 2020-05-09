package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class JoinRoomRequest
        implements io.protostuff.Message<JoinRoomRequest> {

    private static final JoinRoomRequest DEFAULT_INSTANCE = newBuilder().build();

    private int roomID;

    private int roomType;

    private boolean __merge_lock = false;
    private int __bitField0;

    private JoinRoomRequest() {
        this.roomID = 0;
        this.roomType = 0;
    }

    private JoinRoomRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static JoinRoomRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<JoinRoomRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getRoomID() {
        return roomID;
    }

    public boolean hasRoomID() {
        return (__bitField0 & 1) == 1;
    }

    public JoinRoomRequest withRoomID(int value) {
        return JoinRoomRequest.newBuilder()
            .mergeFrom(this)
            .setRoomID(value)
            .build();
    }

    public int getRoomType() {
        return roomType;
    }

    public boolean hasRoomType() {
        return (__bitField0 & 2) == 2;
    }

    public JoinRoomRequest withRoomType(int value) {
        return JoinRoomRequest.newBuilder()
            .mergeFrom(this)
            .setRoomType(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<JoinRoomRequest> cachedSchema() {
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
        JoinRoomRequest that = (JoinRoomRequest) obj;
        if (!java.util.Objects.equals(this.roomID, that.roomID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.roomType, that.roomType)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.roomID);
        result = 31 * result + Integer.hashCode(this.roomType);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasRoomID()) {
            parts.add("roomID=" + getRoomID());
        }
        if (hasRoomType()) {
            parts.add("roomType=" + getRoomType());
        }
        return "JoinRoomRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<JoinRoomRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("roomID", 1);
        	__fieldMap.put("roomType", 2);
        }

        @Override
        public JoinRoomRequest newMessage() {
            return new JoinRoomRequest();
        }

        @Override
        public Class<JoinRoomRequest> typeClass() {
            return JoinRoomRequest.class;
        }

        @Override
        public String messageName() {
            return JoinRoomRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return JoinRoomRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(JoinRoomRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, JoinRoomRequest instance) throws java.io.IOException {
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
                    	instance.roomID = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.roomType = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, JoinRoomRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.roomID, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.roomType, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "roomID";
        		case 2: return "roomType";
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

        private int roomID;

        private int roomType;

        private int __bitField0;

        private Builder() {
            this.roomID = 0;
            this.roomType = 0;
        }

        public Builder mergeFrom(JoinRoomRequest instance) {
            if (instance.hasRoomID()) {
                this.setRoomID(instance.getRoomID());
            }

            if (instance.hasRoomType()) {
                this.setRoomType(instance.getRoomType());
            }

            return this;
        }

        public int getRoomID() {
            return roomID;
        }

        public Builder setRoomID(int value) {
            this.roomID = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearRoomID() {
            this.roomID = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasRoomID() {
            return (__bitField0 & 1) == 1;
        }

        public int getRoomType() {
            return roomType;
        }

        public Builder setRoomType(int value) {
            this.roomType = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearRoomType() {
            this.roomType = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasRoomType() {
            return (__bitField0 & 2) == 2;
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
            if (!java.util.Objects.equals(this.roomID, that.roomID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.roomType, that.roomType)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.roomID);
            result = 31 * result + Integer.hashCode(this.roomType);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasRoomID()) {
                parts.add("roomID=" + getRoomID());
            }
            if (hasRoomType()) {
                parts.add("roomType=" + getRoomType());
            }
            return "JoinRoomRequest{" + String.join(", ", parts) + "}";
        }

        public JoinRoomRequest build() {
            proto.message.JoinRoomRequest result = new proto.message.JoinRoomRequest();
            result.__bitField0 = __bitField0;
            result.roomID = this.roomID;
            result.roomType = this.roomType;
            return result;
        }

    }



}