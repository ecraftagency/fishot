package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class SoloConfirm
        implements io.protostuff.Message<SoloConfirm> {

    private static final SoloConfirm DEFAULT_INSTANCE = newBuilder().build();

    private String fromUserId;

    private String toUserId;

    private int gameId;

    private int roomId;

    private int boardId;

    private boolean __merge_lock = false;
    private int __bitField0;

    private SoloConfirm() {
        this.fromUserId = "";
        this.toUserId = "";
        this.gameId = 0;
        this.roomId = 0;
        this.boardId = 0;
    }

    private SoloConfirm(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static SoloConfirm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<SoloConfirm> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getFromUserId() {
        return fromUserId;
    }

    public boolean hasFromUserId() {
        return (__bitField0 & 1) == 1;
    }

    public SoloConfirm withFromUserId(String value) {
        return SoloConfirm.newBuilder()
            .mergeFrom(this)
            .setFromUserId(value)
            .build();
    }

    public String getToUserId() {
        return toUserId;
    }

    public boolean hasToUserId() {
        return (__bitField0 & 2) == 2;
    }

    public SoloConfirm withToUserId(String value) {
        return SoloConfirm.newBuilder()
            .mergeFrom(this)
            .setToUserId(value)
            .build();
    }

    public int getGameId() {
        return gameId;
    }

    public boolean hasGameId() {
        return (__bitField0 & 4) == 4;
    }

    public SoloConfirm withGameId(int value) {
        return SoloConfirm.newBuilder()
            .mergeFrom(this)
            .setGameId(value)
            .build();
    }

    public int getRoomId() {
        return roomId;
    }

    public boolean hasRoomId() {
        return (__bitField0 & 8) == 8;
    }

    public SoloConfirm withRoomId(int value) {
        return SoloConfirm.newBuilder()
            .mergeFrom(this)
            .setRoomId(value)
            .build();
    }

    public int getBoardId() {
        return boardId;
    }

    public boolean hasBoardId() {
        return (__bitField0 & 16) == 16;
    }

    public SoloConfirm withBoardId(int value) {
        return SoloConfirm.newBuilder()
            .mergeFrom(this)
            .setBoardId(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<SoloConfirm> cachedSchema() {
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
        SoloConfirm that = (SoloConfirm) obj;
        if (!java.util.Objects.equals(this.fromUserId, that.fromUserId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.toUserId, that.toUserId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gameId, that.gameId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.roomId, that.roomId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.boardId, that.boardId)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.fromUserId == null ? 0 : this.fromUserId.hashCode());
        result = 31 * result + (this.toUserId == null ? 0 : this.toUserId.hashCode());
        result = 31 * result + Integer.hashCode(this.gameId);
        result = 31 * result + Integer.hashCode(this.roomId);
        result = 31 * result + Integer.hashCode(this.boardId);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasFromUserId()) {
            parts.add("fromUserId=" + getFromUserId());
        }
        if (hasToUserId()) {
            parts.add("toUserId=" + getToUserId());
        }
        if (hasGameId()) {
            parts.add("gameId=" + getGameId());
        }
        if (hasRoomId()) {
            parts.add("roomId=" + getRoomId());
        }
        if (hasBoardId()) {
            parts.add("boardId=" + getBoardId());
        }
        return "SoloConfirm{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<SoloConfirm>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("fromUserId", 1);
        	__fieldMap.put("toUserId", 2);
        	__fieldMap.put("gameId", 3);
        	__fieldMap.put("roomId", 4);
        	__fieldMap.put("boardId", 5);
        }

        @Override
        public SoloConfirm newMessage() {
            return new SoloConfirm();
        }

        @Override
        public Class<SoloConfirm> typeClass() {
            return SoloConfirm.class;
        }

        @Override
        public String messageName() {
            return SoloConfirm.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return SoloConfirm.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(SoloConfirm message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, SoloConfirm instance) throws java.io.IOException {
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
                    	instance.fromUserId = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.toUserId = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.gameId = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.roomId = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.boardId = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, SoloConfirm instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.fromUserId, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.toUserId, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.gameId, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.roomId, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.boardId, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "fromUserId";
        		case 2: return "toUserId";
        		case 3: return "gameId";
        		case 4: return "roomId";
        		case 5: return "boardId";
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

        private String fromUserId;

        private String toUserId;

        private int gameId;

        private int roomId;

        private int boardId;

        private int __bitField0;

        private Builder() {
            this.fromUserId = "";
            this.toUserId = "";
            this.gameId = 0;
            this.roomId = 0;
            this.boardId = 0;
        }

        public Builder mergeFrom(SoloConfirm instance) {
            if (instance.hasFromUserId()) {
                this.setFromUserId(instance.getFromUserId());
            }

            if (instance.hasToUserId()) {
                this.setToUserId(instance.getToUserId());
            }

            if (instance.hasGameId()) {
                this.setGameId(instance.getGameId());
            }

            if (instance.hasRoomId()) {
                this.setRoomId(instance.getRoomId());
            }

            if (instance.hasBoardId()) {
                this.setBoardId(instance.getBoardId());
            }

            return this;
        }

        public String getFromUserId() {
            return fromUserId;
        }

        public Builder setFromUserId(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SoloConfirm#fromUserId to null");
            }

            this.fromUserId = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearFromUserId() {
            this.fromUserId = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasFromUserId() {
            return (__bitField0 & 1) == 1;
        }

        public String getToUserId() {
            return toUserId;
        }

        public Builder setToUserId(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SoloConfirm#toUserId to null");
            }

            this.toUserId = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearToUserId() {
            this.toUserId = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasToUserId() {
            return (__bitField0 & 2) == 2;
        }

        public int getGameId() {
            return gameId;
        }

        public Builder setGameId(int value) {
            this.gameId = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearGameId() {
            this.gameId = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasGameId() {
            return (__bitField0 & 4) == 4;
        }

        public int getRoomId() {
            return roomId;
        }

        public Builder setRoomId(int value) {
            this.roomId = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearRoomId() {
            this.roomId = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasRoomId() {
            return (__bitField0 & 8) == 8;
        }

        public int getBoardId() {
            return boardId;
        }

        public Builder setBoardId(int value) {
            this.boardId = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearBoardId() {
            this.boardId = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasBoardId() {
            return (__bitField0 & 16) == 16;
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
            if (!java.util.Objects.equals(this.fromUserId, that.fromUserId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.toUserId, that.toUserId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gameId, that.gameId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.roomId, that.roomId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.boardId, that.boardId)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.fromUserId == null ? 0 : this.fromUserId.hashCode());
            result = 31 * result + (this.toUserId == null ? 0 : this.toUserId.hashCode());
            result = 31 * result + Integer.hashCode(this.gameId);
            result = 31 * result + Integer.hashCode(this.roomId);
            result = 31 * result + Integer.hashCode(this.boardId);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasFromUserId()) {
                parts.add("fromUserId=" + getFromUserId());
            }
            if (hasToUserId()) {
                parts.add("toUserId=" + getToUserId());
            }
            if (hasGameId()) {
                parts.add("gameId=" + getGameId());
            }
            if (hasRoomId()) {
                parts.add("roomId=" + getRoomId());
            }
            if (hasBoardId()) {
                parts.add("boardId=" + getBoardId());
            }
            return "SoloConfirm{" + String.join(", ", parts) + "}";
        }

        public SoloConfirm build() {
            proto.message.SoloConfirm result = new proto.message.SoloConfirm();
            result.__bitField0 = __bitField0;
            result.fromUserId = this.fromUserId;
            result.toUserId = this.toUserId;
            result.gameId = this.gameId;
            result.roomId = this.roomId;
            result.boardId = this.boardId;
            return result;
        }

    }



}