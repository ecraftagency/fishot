package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class JoinGameResponse
        implements io.protostuff.Message<JoinGameResponse> {

    private static final JoinGameResponse DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<proto.message.RoomInfor> roomInfor;

    private int result;

    private String msg;

    private boolean __merge_lock = false;
    private int __bitField0;

    private JoinGameResponse() {
        this.roomInfor = java.util.Collections.emptyList();
        this.result = proto.message.InGameResultCode.JOIN_BOARD_SUCCESS_PLAY.getNumber();
        this.msg = "";
    }

    private JoinGameResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static JoinGameResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<JoinGameResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<proto.message.RoomInfor> getRoomInforList() {
        return roomInfor;
    }

    public int getRoomInforCount() {
        return roomInfor.size();
    }

    public proto.message.RoomInfor getRoomInfor(int index) {
        return roomInfor.get(index);
    }

    public JoinGameResponse withRoomInfor(java.util.List<proto.message.RoomInfor> value) {
        return JoinGameResponse.newBuilder()
            .mergeFrom(this)
            .clearRoomInfor()
            .addAllRoomInfor(value)
            .build();
    }

    public proto.message.InGameResultCode getResult() {
        return proto.message.InGameResultCode.valueOf(result);
    }

    public int getResultValue() {
        return result;
    }

    public boolean hasResult() {
        return (__bitField0 & 2) == 2;
    }

    public JoinGameResponse withResult(proto.message.InGameResultCode value) {
        return JoinGameResponse.newBuilder()
            .mergeFrom(this)
            .setResult(value)
            .build();
    }

    public String getMsg() {
        return msg;
    }

    public boolean hasMsg() {
        return (__bitField0 & 4) == 4;
    }

    public JoinGameResponse withMsg(String value) {
        return JoinGameResponse.newBuilder()
            .mergeFrom(this)
            .setMsg(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<JoinGameResponse> cachedSchema() {
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
        JoinGameResponse that = (JoinGameResponse) obj;
        if (!java.util.Objects.equals(this.roomInfor, that.roomInfor)) {
            return false;
        }
        if (!java.util.Objects.equals(this.result, that.result)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msg, that.msg)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.roomInfor == null ? 0 : this.roomInfor.hashCode());
        result = 31 * result + Integer.hashCode(this.result);
        result = 31 * result + (this.msg == null ? 0 : this.msg.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!roomInfor.isEmpty()) {
            parts.add("roomInfor=" + getRoomInforList());
        }
        if (hasResult()) {
            parts.add("result=" + getResult() + '(' + getResultValue() + ')');
        }
        if (hasMsg()) {
            parts.add("msg=" + getMsg());
        }
        return "JoinGameResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<JoinGameResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("roomInfor", 1);
        	__fieldMap.put("result", 2);
        	__fieldMap.put("msg", 3);
        }

        @Override
        public JoinGameResponse newMessage() {
            return new JoinGameResponse();
        }

        @Override
        public Class<JoinGameResponse> typeClass() {
            return JoinGameResponse.class;
        }

        @Override
        public String messageName() {
            return JoinGameResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return JoinGameResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(JoinGameResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, JoinGameResponse instance) throws java.io.IOException {
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
                    	if(!((instance.__bitField0 & 1) == 1)) {
                    	    instance.roomInfor = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.roomInfor.add(input.mergeObject(null, proto.message.RoomInfor.getSchema()));

                    	break;
                    case 2:
                    	instance.result = input.readEnum();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.msg = input.readString();
                    	instance.__bitField0 |= 4;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.roomInfor = java.util.Collections.unmodifiableList(instance.roomInfor);
            }



        }

        @Override
        public void writeTo(io.protostuff.Output output, JoinGameResponse instance) throws java.io.IOException {
            for(proto.message.RoomInfor roomInfor : instance.roomInfor) {
                output.writeObject(1, roomInfor, proto.message.RoomInfor.getSchema(), true);
            }

            if((instance.__bitField0 & 2) == 2) {
            	output.writeEnum(2, instance.result, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeString(3, instance.msg, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "roomInfor";
        		case 2: return "result";
        		case 3: return "msg";
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

        private java.util.List<proto.message.RoomInfor> roomInfor;

        private int result;

        private String msg;

        private int __bitField0;

        private Builder() {
            this.roomInfor = java.util.Collections.emptyList();
            this.result = proto.message.InGameResultCode.JOIN_BOARD_SUCCESS_PLAY.getNumber();
            this.msg = "";
        }

        public Builder mergeFrom(JoinGameResponse instance) {
            this.addAllRoomInfor(instance.getRoomInforList());

            if (instance.hasResult()) {
                this.setResult(instance.getResult());
            }

            if (instance.hasMsg()) {
                this.setMsg(instance.getMsg());
            }

            return this;
        }

        public java.util.List<proto.message.RoomInfor> getRoomInforList() {
            return roomInfor;
        }

        public Builder setRoomInfor(int index, proto.message.RoomInfor value) {
            if (value == null) {
                throw new NullPointerException("Cannot set JoinGameResponse#roomInfor to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.roomInfor = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.roomInfor.set(index, value);
            return this;
        }

        public Builder addRoomInfor(proto.message.RoomInfor value) {
            if (value == null) {
                throw new NullPointerException("Cannot set JoinGameResponse#roomInfor to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.roomInfor = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.roomInfor.add(value);
            return this;
        }

        public Builder addAllRoomInfor(java.lang.Iterable<proto.message.RoomInfor> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set JoinGameResponse#roomInfor to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.roomInfor = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final proto.message.RoomInfor value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set JoinGameResponse#roomInfor to null");
                }
                this.roomInfor.add(value);
            }
            return this;
        }

        public Builder clearRoomInfor() {
            this.roomInfor = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getRoomInforCount() {
            return roomInfor.size();
        }

        public proto.message.RoomInfor getRoomInfor(int index) {
            return roomInfor.get(index);
        }

        public proto.message.InGameResultCode getResult() {
            return proto.message.InGameResultCode.valueOf(result);
        }

        public int getResultValue() {
            return result;
        }

        public Builder setResult(proto.message.InGameResultCode value) {
            if (value == null) {
                throw new NullPointerException("Cannot set JoinGameResponse#result to null");
            }

            if (value == proto.message.InGameResultCode.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set JoinGameResponse#result to UNRECOGNIZED");
            }

            this.result = value.getNumber();
            __bitField0 |= 2;
            return this;
        }

        public Builder setResultValue(int value) {
            this.result = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearResult() {
            this.result = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasResult() {
            return (__bitField0 & 2) == 2;
        }

        public String getMsg() {
            return msg;
        }

        public Builder setMsg(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set JoinGameResponse#msg to null");
            }

            this.msg = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearMsg() {
            this.msg = "";
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasMsg() {
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
            if (!java.util.Objects.equals(this.roomInfor, that.roomInfor)) {
                return false;
            }
            if (!java.util.Objects.equals(this.result, that.result)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msg, that.msg)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.roomInfor == null ? 0 : this.roomInfor.hashCode());
            result = 31 * result + Integer.hashCode(this.result);
            result = 31 * result + (this.msg == null ? 0 : this.msg.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!roomInfor.isEmpty()) {
                parts.add("roomInfor=" + getRoomInforList());
            }
            if (hasResult()) {
                parts.add("result=" + getResult() + '(' + getResultValue() + ')');
            }
            if (hasMsg()) {
                parts.add("msg=" + getMsg());
            }
            return "JoinGameResponse{" + String.join(", ", parts) + "}";
        }

        public JoinGameResponse build() {
            proto.message.JoinGameResponse result = new proto.message.JoinGameResponse();
            result.__bitField0 = __bitField0;
            result.roomInfor = java.util.Collections.unmodifiableList(this.roomInfor);
            result.result = this.result;
            result.msg = this.msg;
            return result;
        }

    }



}