package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class IngameAvailableCannonsList
        implements io.protostuff.Message<IngameAvailableCannonsList> {

    private static final IngameAvailableCannonsList DEFAULT_INSTANCE = newBuilder().build();

    private int gameID;

    private java.util.List<proto.message.AvailableCannon> cannons;

    private boolean __merge_lock = false;
    private int __bitField0;

    private IngameAvailableCannonsList() {
        this.gameID = 0;
        this.cannons = java.util.Collections.emptyList();
    }

    private IngameAvailableCannonsList(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static IngameAvailableCannonsList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<IngameAvailableCannonsList> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getGameID() {
        return gameID;
    }

    public boolean hasGameID() {
        return (__bitField0 & 1) == 1;
    }

    public IngameAvailableCannonsList withGameID(int value) {
        return IngameAvailableCannonsList.newBuilder()
            .mergeFrom(this)
            .setGameID(value)
            .build();
    }

    public java.util.List<proto.message.AvailableCannon> getCannonsList() {
        return cannons;
    }

    public int getCannonsCount() {
        return cannons.size();
    }

    public proto.message.AvailableCannon getCannons(int index) {
        return cannons.get(index);
    }

    public IngameAvailableCannonsList withCannons(java.util.List<proto.message.AvailableCannon> value) {
        return IngameAvailableCannonsList.newBuilder()
            .mergeFrom(this)
            .clearCannons()
            .addAllCannons(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<IngameAvailableCannonsList> cachedSchema() {
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
        IngameAvailableCannonsList that = (IngameAvailableCannonsList) obj;
        if (!java.util.Objects.equals(this.gameID, that.gameID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.cannons, that.cannons)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.gameID);
        result = 31 * result + (this.cannons == null ? 0 : this.cannons.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasGameID()) {
            parts.add("gameID=" + getGameID());
        }
        if (!cannons.isEmpty()) {
            parts.add("cannons=" + getCannonsList());
        }
        return "IngameAvailableCannonsList{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<IngameAvailableCannonsList>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("gameID", 1);
        	__fieldMap.put("cannons", 2);
        }

        @Override
        public IngameAvailableCannonsList newMessage() {
            return new IngameAvailableCannonsList();
        }

        @Override
        public Class<IngameAvailableCannonsList> typeClass() {
            return IngameAvailableCannonsList.class;
        }

        @Override
        public String messageName() {
            return IngameAvailableCannonsList.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return IngameAvailableCannonsList.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(IngameAvailableCannonsList message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, IngameAvailableCannonsList instance) throws java.io.IOException {
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
                    	if(!((instance.__bitField0 & 2) == 2)) {
                    	    instance.cannons = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 2;
                    	}
                    	instance.cannons.add(input.mergeObject(null, proto.message.AvailableCannon.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 2) == 2) {
                instance.cannons = java.util.Collections.unmodifiableList(instance.cannons);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, IngameAvailableCannonsList instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.gameID, false);
            }

            for(proto.message.AvailableCannon cannons : instance.cannons) {
                output.writeObject(2, cannons, proto.message.AvailableCannon.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "gameID";
        		case 2: return "cannons";
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

        private java.util.List<proto.message.AvailableCannon> cannons;

        private int __bitField0;

        private Builder() {
            this.gameID = 0;
            this.cannons = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(IngameAvailableCannonsList instance) {
            if (instance.hasGameID()) {
                this.setGameID(instance.getGameID());
            }

            this.addAllCannons(instance.getCannonsList());

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

        public java.util.List<proto.message.AvailableCannon> getCannonsList() {
            return cannons;
        }

        public Builder setCannons(int index, proto.message.AvailableCannon value) {
            if (value == null) {
                throw new NullPointerException("Cannot set IngameAvailableCannonsList#cannons to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.cannons = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.cannons.set(index, value);
            return this;
        }

        public Builder addCannons(proto.message.AvailableCannon value) {
            if (value == null) {
                throw new NullPointerException("Cannot set IngameAvailableCannonsList#cannons to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.cannons = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.cannons.add(value);
            return this;
        }

        public Builder addAllCannons(java.lang.Iterable<proto.message.AvailableCannon> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set IngameAvailableCannonsList#cannons to null");
            }
            if(!((__bitField0 & 2) == 2)) {
                this.cannons = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            for (final proto.message.AvailableCannon value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set IngameAvailableCannonsList#cannons to null");
                }
                this.cannons.add(value);
            }
            return this;
        }

        public Builder clearCannons() {
            this.cannons = java.util.Collections.emptyList();
            __bitField0 &= ~2;
            return this;
        }

        public int getCannonsCount() {
            return cannons.size();
        }

        public proto.message.AvailableCannon getCannons(int index) {
            return cannons.get(index);
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
            if (!java.util.Objects.equals(this.cannons, that.cannons)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.gameID);
            result = 31 * result + (this.cannons == null ? 0 : this.cannons.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasGameID()) {
                parts.add("gameID=" + getGameID());
            }
            if (!cannons.isEmpty()) {
                parts.add("cannons=" + getCannonsList());
            }
            return "IngameAvailableCannonsList{" + String.join(", ", parts) + "}";
        }

        public IngameAvailableCannonsList build() {
            proto.message.IngameAvailableCannonsList result = new proto.message.IngameAvailableCannonsList();
            result.__bitField0 = __bitField0;
            result.gameID = this.gameID;
            result.cannons = java.util.Collections.unmodifiableList(this.cannons);
            return result;
        }

    }



}