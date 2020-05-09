package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class JoinRoomResponse
        implements io.protostuff.Message<JoinRoomResponse> {

    private static final JoinRoomResponse DEFAULT_INSTANCE = newBuilder().build();

    private int result;

    private String content;

    private java.util.List<proto.message.BoardInfor> boardInfor;

    private int roomID;

    private boolean __merge_lock = false;
    private int __bitField0;

    private JoinRoomResponse() {
        this.result = proto.message.InGameResultCode.JOIN_BOARD_SUCCESS_PLAY.getNumber();
        this.content = "";
        this.boardInfor = java.util.Collections.emptyList();
        this.roomID = 0;
    }

    private JoinRoomResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static JoinRoomResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<JoinRoomResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public proto.message.InGameResultCode getResult() {
        return proto.message.InGameResultCode.valueOf(result);
    }

    public int getResultValue() {
        return result;
    }

    public boolean hasResult() {
        return (__bitField0 & 1) == 1;
    }

    public JoinRoomResponse withResult(proto.message.InGameResultCode value) {
        return JoinRoomResponse.newBuilder()
            .mergeFrom(this)
            .setResult(value)
            .build();
    }

    public String getContent() {
        return content;
    }

    public boolean hasContent() {
        return (__bitField0 & 2) == 2;
    }

    public JoinRoomResponse withContent(String value) {
        return JoinRoomResponse.newBuilder()
            .mergeFrom(this)
            .setContent(value)
            .build();
    }

    public java.util.List<proto.message.BoardInfor> getBoardInforList() {
        return boardInfor;
    }

    public int getBoardInforCount() {
        return boardInfor.size();
    }

    public proto.message.BoardInfor getBoardInfor(int index) {
        return boardInfor.get(index);
    }

    public JoinRoomResponse withBoardInfor(java.util.List<proto.message.BoardInfor> value) {
        return JoinRoomResponse.newBuilder()
            .mergeFrom(this)
            .clearBoardInfor()
            .addAllBoardInfor(value)
            .build();
    }

    public int getRoomID() {
        return roomID;
    }

    public boolean hasRoomID() {
        return (__bitField0 & 8) == 8;
    }

    public JoinRoomResponse withRoomID(int value) {
        return JoinRoomResponse.newBuilder()
            .mergeFrom(this)
            .setRoomID(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<JoinRoomResponse> cachedSchema() {
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
        JoinRoomResponse that = (JoinRoomResponse) obj;
        if (!java.util.Objects.equals(this.result, that.result)) {
            return false;
        }
        if (!java.util.Objects.equals(this.content, that.content)) {
            return false;
        }
        if (!java.util.Objects.equals(this.boardInfor, that.boardInfor)) {
            return false;
        }
        if (!java.util.Objects.equals(this.roomID, that.roomID)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.result);
        result = 31 * result + (this.content == null ? 0 : this.content.hashCode());
        result = 31 * result + (this.boardInfor == null ? 0 : this.boardInfor.hashCode());
        result = 31 * result + Integer.hashCode(this.roomID);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasResult()) {
            parts.add("result=" + getResult() + '(' + getResultValue() + ')');
        }
        if (hasContent()) {
            parts.add("content=" + getContent());
        }
        if (!boardInfor.isEmpty()) {
            parts.add("boardInfor=" + getBoardInforList());
        }
        if (hasRoomID()) {
            parts.add("roomID=" + getRoomID());
        }
        return "JoinRoomResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<JoinRoomResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("result", 1);
        	__fieldMap.put("content", 2);
        	__fieldMap.put("boardInfor", 3);
        	__fieldMap.put("roomID", 4);
        }

        @Override
        public JoinRoomResponse newMessage() {
            return new JoinRoomResponse();
        }

        @Override
        public Class<JoinRoomResponse> typeClass() {
            return JoinRoomResponse.class;
        }

        @Override
        public String messageName() {
            return JoinRoomResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return JoinRoomResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(JoinRoomResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, JoinRoomResponse instance) throws java.io.IOException {
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
                    	instance.result = input.readEnum();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.content = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	if(!((instance.__bitField0 & 4) == 4)) {
                    	    instance.boardInfor = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 4;
                    	}
                    	instance.boardInfor.add(input.mergeObject(null, proto.message.BoardInfor.getSchema()));

                    	break;
                    case 4:
                    	instance.roomID = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 4) == 4) {
                instance.boardInfor = java.util.Collections.unmodifiableList(instance.boardInfor);
            }


        }

        @Override
        public void writeTo(io.protostuff.Output output, JoinRoomResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.result, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.content, false);
            }

            for(proto.message.BoardInfor boardInfor : instance.boardInfor) {
                output.writeObject(3, boardInfor, proto.message.BoardInfor.getSchema(), true);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.roomID, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "result";
        		case 2: return "content";
        		case 3: return "boardInfor";
        		case 4: return "roomID";
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

        private int result;

        private String content;

        private java.util.List<proto.message.BoardInfor> boardInfor;

        private int roomID;

        private int __bitField0;

        private Builder() {
            this.result = proto.message.InGameResultCode.JOIN_BOARD_SUCCESS_PLAY.getNumber();
            this.content = "";
            this.boardInfor = java.util.Collections.emptyList();
            this.roomID = 0;
        }

        public Builder mergeFrom(JoinRoomResponse instance) {
            if (instance.hasResult()) {
                this.setResult(instance.getResult());
            }

            if (instance.hasContent()) {
                this.setContent(instance.getContent());
            }

            this.addAllBoardInfor(instance.getBoardInforList());

            if (instance.hasRoomID()) {
                this.setRoomID(instance.getRoomID());
            }

            return this;
        }

        public proto.message.InGameResultCode getResult() {
            return proto.message.InGameResultCode.valueOf(result);
        }

        public int getResultValue() {
            return result;
        }

        public Builder setResult(proto.message.InGameResultCode value) {
            if (value == null) {
                throw new NullPointerException("Cannot set JoinRoomResponse#result to null");
            }

            if (value == proto.message.InGameResultCode.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set JoinRoomResponse#result to UNRECOGNIZED");
            }

            this.result = value.getNumber();
            __bitField0 |= 1;
            return this;
        }

        public Builder setResultValue(int value) {
            this.result = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearResult() {
            this.result = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasResult() {
            return (__bitField0 & 1) == 1;
        }

        public String getContent() {
            return content;
        }

        public Builder setContent(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set JoinRoomResponse#content to null");
            }

            this.content = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearContent() {
            this.content = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasContent() {
            return (__bitField0 & 2) == 2;
        }

        public java.util.List<proto.message.BoardInfor> getBoardInforList() {
            return boardInfor;
        }

        public Builder setBoardInfor(int index, proto.message.BoardInfor value) {
            if (value == null) {
                throw new NullPointerException("Cannot set JoinRoomResponse#boardInfor to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.boardInfor = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.boardInfor.set(index, value);
            return this;
        }

        public Builder addBoardInfor(proto.message.BoardInfor value) {
            if (value == null) {
                throw new NullPointerException("Cannot set JoinRoomResponse#boardInfor to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.boardInfor = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.boardInfor.add(value);
            return this;
        }

        public Builder addAllBoardInfor(java.lang.Iterable<proto.message.BoardInfor> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set JoinRoomResponse#boardInfor to null");
            }
            if(!((__bitField0 & 4) == 4)) {
                this.boardInfor = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            for (final proto.message.BoardInfor value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set JoinRoomResponse#boardInfor to null");
                }
                this.boardInfor.add(value);
            }
            return this;
        }

        public Builder clearBoardInfor() {
            this.boardInfor = java.util.Collections.emptyList();
            __bitField0 &= ~4;
            return this;
        }

        public int getBoardInforCount() {
            return boardInfor.size();
        }

        public proto.message.BoardInfor getBoardInfor(int index) {
            return boardInfor.get(index);
        }

        public int getRoomID() {
            return roomID;
        }

        public Builder setRoomID(int value) {
            this.roomID = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearRoomID() {
            this.roomID = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasRoomID() {
            return (__bitField0 & 8) == 8;
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
            if (!java.util.Objects.equals(this.result, that.result)) {
                return false;
            }
            if (!java.util.Objects.equals(this.content, that.content)) {
                return false;
            }
            if (!java.util.Objects.equals(this.boardInfor, that.boardInfor)) {
                return false;
            }
            if (!java.util.Objects.equals(this.roomID, that.roomID)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.result);
            result = 31 * result + (this.content == null ? 0 : this.content.hashCode());
            result = 31 * result + (this.boardInfor == null ? 0 : this.boardInfor.hashCode());
            result = 31 * result + Integer.hashCode(this.roomID);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasResult()) {
                parts.add("result=" + getResult() + '(' + getResultValue() + ')');
            }
            if (hasContent()) {
                parts.add("content=" + getContent());
            }
            if (!boardInfor.isEmpty()) {
                parts.add("boardInfor=" + getBoardInforList());
            }
            if (hasRoomID()) {
                parts.add("roomID=" + getRoomID());
            }
            return "JoinRoomResponse{" + String.join(", ", parts) + "}";
        }

        public JoinRoomResponse build() {
            proto.message.JoinRoomResponse result = new proto.message.JoinRoomResponse();
            result.__bitField0 = __bitField0;
            result.result = this.result;
            result.content = this.content;
            result.boardInfor = java.util.Collections.unmodifiableList(this.boardInfor);
            result.roomID = this.roomID;
            return result;
        }

    }



}