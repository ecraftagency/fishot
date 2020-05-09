package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class GetGameListResponse
        implements io.protostuff.Message<GetGameListResponse> {

    private static final GetGameListResponse DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<proto.message.GetGameListResponse.GameInfor> gameInfor;

    private boolean __merge_lock = false;
    private int __bitField0;

    private GetGameListResponse() {
        this.gameInfor = java.util.Collections.emptyList();
    }

    private GetGameListResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static GetGameListResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<GetGameListResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<proto.message.GetGameListResponse.GameInfor> getGameInforList() {
        return gameInfor;
    }

    public int getGameInforCount() {
        return gameInfor.size();
    }

    public proto.message.GetGameListResponse.GameInfor getGameInfor(int index) {
        return gameInfor.get(index);
    }

    public GetGameListResponse withGameInfor(java.util.List<proto.message.GetGameListResponse.GameInfor> value) {
        return GetGameListResponse.newBuilder()
            .mergeFrom(this)
            .clearGameInfor()
            .addAllGameInfor(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<GetGameListResponse> cachedSchema() {
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
        GetGameListResponse that = (GetGameListResponse) obj;
        if (!java.util.Objects.equals(this.gameInfor, that.gameInfor)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.gameInfor == null ? 0 : this.gameInfor.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!gameInfor.isEmpty()) {
            parts.add("gameInfor=" + getGameInforList());
        }
        return "GetGameListResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<GetGameListResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("gameInfor", 1);
        }

        @Override
        public GetGameListResponse newMessage() {
            return new GetGameListResponse();
        }

        @Override
        public Class<GetGameListResponse> typeClass() {
            return GetGameListResponse.class;
        }

        @Override
        public String messageName() {
            return GetGameListResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return GetGameListResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(GetGameListResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, GetGameListResponse instance) throws java.io.IOException {
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
                    	    instance.gameInfor = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.gameInfor.add(input.mergeObject(null, proto.message.GetGameListResponse.GameInfor.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.gameInfor = java.util.Collections.unmodifiableList(instance.gameInfor);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, GetGameListResponse instance) throws java.io.IOException {
            for(proto.message.GetGameListResponse.GameInfor gameInfor : instance.gameInfor) {
                output.writeObject(1, gameInfor, proto.message.GetGameListResponse.GameInfor.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "gameInfor";
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

        private java.util.List<proto.message.GetGameListResponse.GameInfor> gameInfor;

        private int __bitField0;

        private Builder() {
            this.gameInfor = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(GetGameListResponse instance) {
            this.addAllGameInfor(instance.getGameInforList());

            return this;
        }

        public java.util.List<proto.message.GetGameListResponse.GameInfor> getGameInforList() {
            return gameInfor;
        }

        public Builder setGameInfor(int index, proto.message.GetGameListResponse.GameInfor value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GetGameListResponse#gameInfor to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.gameInfor = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.gameInfor.set(index, value);
            return this;
        }

        public Builder addGameInfor(proto.message.GetGameListResponse.GameInfor value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GetGameListResponse#gameInfor to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.gameInfor = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.gameInfor.add(value);
            return this;
        }

        public Builder addAllGameInfor(java.lang.Iterable<proto.message.GetGameListResponse.GameInfor> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set GetGameListResponse#gameInfor to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.gameInfor = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final proto.message.GetGameListResponse.GameInfor value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set GetGameListResponse#gameInfor to null");
                }
                this.gameInfor.add(value);
            }
            return this;
        }

        public Builder clearGameInfor() {
            this.gameInfor = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getGameInforCount() {
            return gameInfor.size();
        }

        public proto.message.GetGameListResponse.GameInfor getGameInfor(int index) {
            return gameInfor.get(index);
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
            if (!java.util.Objects.equals(this.gameInfor, that.gameInfor)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.gameInfor == null ? 0 : this.gameInfor.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!gameInfor.isEmpty()) {
                parts.add("gameInfor=" + getGameInforList());
            }
            return "GetGameListResponse{" + String.join(", ", parts) + "}";
        }

        public GetGameListResponse build() {
            proto.message.GetGameListResponse result = new proto.message.GetGameListResponse();
            result.__bitField0 = __bitField0;
            result.gameInfor = java.util.Collections.unmodifiableList(this.gameInfor);
            return result;
        }

    }

    public static final class GameInfor
            implements io.protostuff.Message<GameInfor> {

        private static final GameInfor DEFAULT_INSTANCE = newBuilder().build();

        private int gameID;

        private String gameName;

        private boolean __merge_lock = false;
        private int __bitField0;

        private GameInfor() {
            this.gameID = 0;
            this.gameName = "";
        }

        private GameInfor(Builder builder) {
            __merge_lock = true;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public static GameInfor getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static io.protostuff.Schema<GameInfor> getSchema()
        {
        	return Schema.INSTANCE;
        }

        public int getGameID() {
            return gameID;
        }

        public boolean hasGameID() {
            return (__bitField0 & 1) == 1;
        }

        public GameInfor withGameID(int value) {
            return GameInfor.newBuilder()
                .mergeFrom(this)
                .setGameID(value)
                .build();
        }

        public String getGameName() {
            return gameName;
        }

        public boolean hasGameName() {
            return (__bitField0 & 2) == 2;
        }

        public GameInfor withGameName(String value) {
            return GameInfor.newBuilder()
                .mergeFrom(this)
                .setGameName(value)
                .build();
        }



        @Override
        public io.protostuff.Schema<GameInfor> cachedSchema() {
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
            GameInfor that = (GameInfor) obj;
            if (!java.util.Objects.equals(this.gameID, that.gameID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gameName, that.gameName)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.gameID);
            result = 31 * result + (this.gameName == null ? 0 : this.gameName.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasGameID()) {
                parts.add("gameID=" + getGameID());
            }
            if (hasGameName()) {
                parts.add("gameName=" + getGameName());
            }
            return "GameInfor{" + String.join(", ", parts) + "}";
        }

        public static final class Schema implements io.protostuff.Schema<GameInfor>{

            private static final Schema INSTANCE = new Schema();

            private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

            static {
            	__fieldMap.put("gameID", 1);
            	__fieldMap.put("gameName", 2);
            }

            @Override
            public GameInfor newMessage() {
                return new GameInfor();
            }

            @Override
            public Class<GameInfor> typeClass() {
                return GameInfor.class;
            }

            @Override
            public String messageName() {
                return GameInfor.class.getSimpleName();
            }

            @Override
            public String messageFullName() {
                return GameInfor.class.getName();
            }

            @Override
            @Deprecated
            public boolean isInitialized(GameInfor message) {
                return true;
            }

            @Override
            public void mergeFrom(io.protostuff.Input input, GameInfor instance) throws java.io.IOException {
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
                        case 2:
                        	instance.gameName = input.readString();
                        	instance.__bitField0 |= 2;
                        	break;
                        default:
                            input.handleUnknownField(number, this);
                    }
            	}
            }

            @Override
            public void writeTo(io.protostuff.Output output, GameInfor instance) throws java.io.IOException {
                if((instance.__bitField0 & 1) == 1) {
                    output.writeInt32(1, instance.gameID, false);
                }

                if((instance.__bitField0 & 2) == 2) {
                    output.writeString(2, instance.gameName, false);
                }

            }

            @Override
            public String getFieldName(int number) {
            	switch(number) {
            		case 1: return "gameID";
            		case 2: return "gameName";
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

            private String gameName;

            private int __bitField0;

            private Builder() {
                this.gameID = 0;
                this.gameName = "";
            }

            public Builder mergeFrom(GameInfor instance) {
                if (instance.hasGameID()) {
                    this.setGameID(instance.getGameID());
                }

                if (instance.hasGameName()) {
                    this.setGameName(instance.getGameName());
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

            public String getGameName() {
                return gameName;
            }

            public Builder setGameName(String value) {
                if (value == null) {
                    throw new NullPointerException("Cannot set GameInfor#gameName to null");
                }

                this.gameName = value;
                __bitField0 |= 2;
                return this;
            }

            public Builder clearGameName() {
                this.gameName = "";
                __bitField0 &= ~2;
                return this;
            }

            public boolean hasGameName() {
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
                if (!java.util.Objects.equals(this.gameID, that.gameID)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.gameName, that.gameName)) {
                    return false;
                }

                return true;
            }

            @Override
            public int hashCode() {
                int result = 1;
                result = 31 * result + Integer.hashCode(this.gameID);
                result = 31 * result + (this.gameName == null ? 0 : this.gameName.hashCode());

                return result;
            }

            @Override
            public String toString() {
                java.util.List<String> parts = new java.util.ArrayList<>();
                if (hasGameID()) {
                    parts.add("gameID=" + getGameID());
                }
                if (hasGameName()) {
                    parts.add("gameName=" + getGameName());
                }
                return "GameInfor{" + String.join(", ", parts) + "}";
            }

            public GameInfor build() {
                proto.message.GetGameListResponse.GameInfor result = new proto.message.GetGameListResponse.GameInfor();
                result.__bitField0 = __bitField0;
                result.gameID = this.gameID;
                result.gameName = this.gameName;
                return result;
            }

        }



    }


}