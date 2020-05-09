package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class JoinBoardRequest
        implements io.protostuff.Message<JoinBoardRequest> {

    private static final JoinBoardRequest DEFAULT_INSTANCE = newBuilder().build();

    private int boardID;

    private String password;

    private boolean hasUdp;

    private boolean __merge_lock = false;
    private int __bitField0;

    private JoinBoardRequest() {
        this.boardID = 0;
        this.password = "";
        this.hasUdp = false;
    }

    private JoinBoardRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static JoinBoardRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<JoinBoardRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getBoardID() {
        return boardID;
    }

    public boolean hasBoardID() {
        return (__bitField0 & 1) == 1;
    }

    public JoinBoardRequest withBoardID(int value) {
        return JoinBoardRequest.newBuilder()
            .mergeFrom(this)
            .setBoardID(value)
            .build();
    }

    public String getPassword() {
        return password;
    }

    public boolean hasPassword() {
        return (__bitField0 & 2) == 2;
    }

    public JoinBoardRequest withPassword(String value) {
        return JoinBoardRequest.newBuilder()
            .mergeFrom(this)
            .setPassword(value)
            .build();
    }

    public boolean getHasUdp() {
        return hasUdp;
    }

    public boolean hasHasUdp() {
        return (__bitField0 & 4) == 4;
    }

    public JoinBoardRequest withHasUdp(boolean value) {
        return JoinBoardRequest.newBuilder()
            .mergeFrom(this)
            .setHasUdp(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<JoinBoardRequest> cachedSchema() {
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
        JoinBoardRequest that = (JoinBoardRequest) obj;
        if (!java.util.Objects.equals(this.boardID, that.boardID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.password, that.password)) {
            return false;
        }
        if (!java.util.Objects.equals(this.hasUdp, that.hasUdp)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.boardID);
        result = 31 * result + (this.password == null ? 0 : this.password.hashCode());
        result = 31 * result + Boolean.hashCode(this.hasUdp);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasBoardID()) {
            parts.add("boardID=" + getBoardID());
        }
        if (hasPassword()) {
            parts.add("password=" + getPassword());
        }
        if (hasHasUdp()) {
            parts.add("hasUdp=" + getHasUdp());
        }
        return "JoinBoardRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<JoinBoardRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("boardID", 1);
        	__fieldMap.put("password", 2);
        	__fieldMap.put("hasUdp", 3);
        }

        @Override
        public JoinBoardRequest newMessage() {
            return new JoinBoardRequest();
        }

        @Override
        public Class<JoinBoardRequest> typeClass() {
            return JoinBoardRequest.class;
        }

        @Override
        public String messageName() {
            return JoinBoardRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return JoinBoardRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(JoinBoardRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, JoinBoardRequest instance) throws java.io.IOException {
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
                    	instance.boardID = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.password = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.hasUdp = input.readBool();
                    	instance.__bitField0 |= 4;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, JoinBoardRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.boardID, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.password, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeBool(3, instance.hasUdp, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "boardID";
        		case 2: return "password";
        		case 3: return "hasUdp";
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

        private int boardID;

        private String password;

        private boolean hasUdp;

        private int __bitField0;

        private Builder() {
            this.boardID = 0;
            this.password = "";
            this.hasUdp = false;
        }

        public Builder mergeFrom(JoinBoardRequest instance) {
            if (instance.hasBoardID()) {
                this.setBoardID(instance.getBoardID());
            }

            if (instance.hasPassword()) {
                this.setPassword(instance.getPassword());
            }

            if (instance.hasHasUdp()) {
                this.setHasUdp(instance.getHasUdp());
            }

            return this;
        }

        public int getBoardID() {
            return boardID;
        }

        public Builder setBoardID(int value) {
            this.boardID = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearBoardID() {
            this.boardID = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasBoardID() {
            return (__bitField0 & 1) == 1;
        }

        public String getPassword() {
            return password;
        }

        public Builder setPassword(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set JoinBoardRequest#password to null");
            }

            this.password = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearPassword() {
            this.password = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasPassword() {
            return (__bitField0 & 2) == 2;
        }

        public boolean getHasUdp() {
            return hasUdp;
        }

        public Builder setHasUdp(boolean value) {
            this.hasUdp = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearHasUdp() {
            this.hasUdp = false;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasHasUdp() {
            return (__bitField0 & 4) == 4;
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
            if (!java.util.Objects.equals(this.boardID, that.boardID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.password, that.password)) {
                return false;
            }
            if (!java.util.Objects.equals(this.hasUdp, that.hasUdp)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.boardID);
            result = 31 * result + (this.password == null ? 0 : this.password.hashCode());
            result = 31 * result + Boolean.hashCode(this.hasUdp);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasBoardID()) {
                parts.add("boardID=" + getBoardID());
            }
            if (hasPassword()) {
                parts.add("password=" + getPassword());
            }
            if (hasHasUdp()) {
                parts.add("hasUdp=" + getHasUdp());
            }
            return "JoinBoardRequest{" + String.join(", ", parts) + "}";
        }

        public JoinBoardRequest build() {
            proto.message.JoinBoardRequest result = new proto.message.JoinBoardRequest();
            result.__bitField0 = __bitField0;
            result.boardID = this.boardID;
            result.password = this.password;
            result.hasUdp = this.hasUdp;
            return result;
        }

    }



}