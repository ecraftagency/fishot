package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class RoomMoneyListResponse
        implements io.protostuff.Message<RoomMoneyListResponse> {

    private static final RoomMoneyListResponse DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<Integer> roomMoneys;

    private java.util.List<Integer> roomMoneys1;

    private boolean __merge_lock = false;
    private int __bitField0;

    private RoomMoneyListResponse() {
        this.roomMoneys = java.util.Collections.emptyList();
        this.roomMoneys1 = java.util.Collections.emptyList();
    }

    private RoomMoneyListResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static RoomMoneyListResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<RoomMoneyListResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<Integer> getRoomMoneysList() {
        return roomMoneys;
    }

    public int getRoomMoneysCount() {
        return roomMoneys.size();
    }

    public int getRoomMoneys(int index) {
        return roomMoneys.get(index);
    }

    public RoomMoneyListResponse withRoomMoneys(java.util.List<Integer> value) {
        return RoomMoneyListResponse.newBuilder()
            .mergeFrom(this)
            .clearRoomMoneys()
            .addAllRoomMoneys(value)
            .build();
    }

    public java.util.List<Integer> getRoomMoneys1List() {
        return roomMoneys1;
    }

    public int getRoomMoneys1Count() {
        return roomMoneys1.size();
    }

    public int getRoomMoneys1(int index) {
        return roomMoneys1.get(index);
    }

    public RoomMoneyListResponse withRoomMoneys1(java.util.List<Integer> value) {
        return RoomMoneyListResponse.newBuilder()
            .mergeFrom(this)
            .clearRoomMoneys1()
            .addAllRoomMoneys1(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<RoomMoneyListResponse> cachedSchema() {
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
        RoomMoneyListResponse that = (RoomMoneyListResponse) obj;
        if (!java.util.Objects.equals(this.roomMoneys, that.roomMoneys)) {
            return false;
        }
        if (!java.util.Objects.equals(this.roomMoneys1, that.roomMoneys1)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.roomMoneys == null ? 0 : this.roomMoneys.hashCode());
        result = 31 * result + (this.roomMoneys1 == null ? 0 : this.roomMoneys1.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!roomMoneys.isEmpty()) {
            parts.add("roomMoneys=" + getRoomMoneysList());
        }
        if (!roomMoneys1.isEmpty()) {
            parts.add("roomMoneys1=" + getRoomMoneys1List());
        }
        return "RoomMoneyListResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<RoomMoneyListResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("roomMoneys", 1);
        	__fieldMap.put("roomMoneys1", 2);
        }

        @Override
        public RoomMoneyListResponse newMessage() {
            return new RoomMoneyListResponse();
        }

        @Override
        public Class<RoomMoneyListResponse> typeClass() {
            return RoomMoneyListResponse.class;
        }

        @Override
        public String messageName() {
            return RoomMoneyListResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return RoomMoneyListResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(RoomMoneyListResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, RoomMoneyListResponse instance) throws java.io.IOException {
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
                    	    instance.roomMoneys = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.roomMoneys.add(input.readInt32());

                    	break;
                    case 2:
                    	if(!((instance.__bitField0 & 2) == 2)) {
                    	    instance.roomMoneys1 = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 2;
                    	}
                    	instance.roomMoneys1.add(input.readInt32());

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.roomMoneys = java.util.Collections.unmodifiableList(instance.roomMoneys);
            }

            if((instance.__bitField0 & 2) == 2) {
                instance.roomMoneys1 = java.util.Collections.unmodifiableList(instance.roomMoneys1);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, RoomMoneyListResponse instance) throws java.io.IOException {
            for(int roomMoneys : instance.roomMoneys) {
                output.writeInt32(1, roomMoneys, true);
            }

            for(int roomMoneys1 : instance.roomMoneys1) {
                output.writeInt32(2, roomMoneys1, true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "roomMoneys";
        		case 2: return "roomMoneys1";
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

        private java.util.List<Integer> roomMoneys;

        private java.util.List<Integer> roomMoneys1;

        private int __bitField0;

        private Builder() {
            this.roomMoneys = java.util.Collections.emptyList();
            this.roomMoneys1 = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(RoomMoneyListResponse instance) {
            this.addAllRoomMoneys(instance.getRoomMoneysList());

            this.addAllRoomMoneys1(instance.getRoomMoneys1List());

            return this;
        }

        public java.util.List<Integer> getRoomMoneysList() {
            return roomMoneys;
        }

        public Builder setRoomMoneys(int index, int value) {
            if(!((__bitField0 & 1) == 1)) {
                this.roomMoneys = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.roomMoneys.set(index, value);
            return this;
        }

        public Builder addRoomMoneys(int value) {
            if(!((__bitField0 & 1) == 1)) {
                this.roomMoneys = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.roomMoneys.add(value);
            return this;
        }

        public Builder addAllRoomMoneys(java.lang.Iterable<Integer> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set RoomMoneyListResponse#roomMoneys to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.roomMoneys = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final Integer value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set RoomMoneyListResponse#roomMoneys to null");
                }
                this.roomMoneys.add(value);
            }
            return this;
        }

        public Builder clearRoomMoneys() {
            this.roomMoneys = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getRoomMoneysCount() {
            return roomMoneys.size();
        }

        public int getRoomMoneys(int index) {
            return roomMoneys.get(index);
        }

        public java.util.List<Integer> getRoomMoneys1List() {
            return roomMoneys1;
        }

        public Builder setRoomMoneys1(int index, int value) {
            if(!((__bitField0 & 2) == 2)) {
                this.roomMoneys1 = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.roomMoneys1.set(index, value);
            return this;
        }

        public Builder addRoomMoneys1(int value) {
            if(!((__bitField0 & 2) == 2)) {
                this.roomMoneys1 = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.roomMoneys1.add(value);
            return this;
        }

        public Builder addAllRoomMoneys1(java.lang.Iterable<Integer> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set RoomMoneyListResponse#roomMoneys1 to null");
            }
            if(!((__bitField0 & 2) == 2)) {
                this.roomMoneys1 = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            for (final Integer value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set RoomMoneyListResponse#roomMoneys1 to null");
                }
                this.roomMoneys1.add(value);
            }
            return this;
        }

        public Builder clearRoomMoneys1() {
            this.roomMoneys1 = java.util.Collections.emptyList();
            __bitField0 &= ~2;
            return this;
        }

        public int getRoomMoneys1Count() {
            return roomMoneys1.size();
        }

        public int getRoomMoneys1(int index) {
            return roomMoneys1.get(index);
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
            if (!java.util.Objects.equals(this.roomMoneys, that.roomMoneys)) {
                return false;
            }
            if (!java.util.Objects.equals(this.roomMoneys1, that.roomMoneys1)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.roomMoneys == null ? 0 : this.roomMoneys.hashCode());
            result = 31 * result + (this.roomMoneys1 == null ? 0 : this.roomMoneys1.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!roomMoneys.isEmpty()) {
                parts.add("roomMoneys=" + getRoomMoneysList());
            }
            if (!roomMoneys1.isEmpty()) {
                parts.add("roomMoneys1=" + getRoomMoneys1List());
            }
            return "RoomMoneyListResponse{" + String.join(", ", parts) + "}";
        }

        public RoomMoneyListResponse build() {
            proto.message.RoomMoneyListResponse result = new proto.message.RoomMoneyListResponse();
            result.__bitField0 = __bitField0;
            result.roomMoneys = java.util.Collections.unmodifiableList(this.roomMoneys);
            result.roomMoneys1 = java.util.Collections.unmodifiableList(this.roomMoneys1);
            return result;
        }

    }



}