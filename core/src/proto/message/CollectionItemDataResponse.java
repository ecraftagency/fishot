package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class CollectionItemDataResponse
        implements io.protostuff.Message<CollectionItemDataResponse> {

    private static final CollectionItemDataResponse DEFAULT_INSTANCE = newBuilder().build();

    private int id;

    private int collectionId;

    private int itemID;

    private int fishID;

    private int state;

    private boolean __merge_lock = false;
    private int __bitField0;

    private CollectionItemDataResponse() {
        this.id = 0;
        this.collectionId = 0;
        this.itemID = 0;
        this.fishID = 0;
        this.state = proto.message.CollectionState.STATE_LOCK.getNumber();
    }

    private CollectionItemDataResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static CollectionItemDataResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<CollectionItemDataResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 1) == 1;
    }

    public CollectionItemDataResponse withId(int value) {
        return CollectionItemDataResponse.newBuilder()
            .mergeFrom(this)
            .setId(value)
            .build();
    }

    public int getCollectionId() {
        return collectionId;
    }

    public boolean hasCollectionId() {
        return (__bitField0 & 2) == 2;
    }

    public CollectionItemDataResponse withCollectionId(int value) {
        return CollectionItemDataResponse.newBuilder()
            .mergeFrom(this)
            .setCollectionId(value)
            .build();
    }

    public int getItemID() {
        return itemID;
    }

    public boolean hasItemID() {
        return (__bitField0 & 4) == 4;
    }

    public CollectionItemDataResponse withItemID(int value) {
        return CollectionItemDataResponse.newBuilder()
            .mergeFrom(this)
            .setItemID(value)
            .build();
    }

    public int getFishID() {
        return fishID;
    }

    public boolean hasFishID() {
        return (__bitField0 & 8) == 8;
    }

    public CollectionItemDataResponse withFishID(int value) {
        return CollectionItemDataResponse.newBuilder()
            .mergeFrom(this)
            .setFishID(value)
            .build();
    }

    public proto.message.CollectionState getState() {
        return proto.message.CollectionState.valueOf(state);
    }

    public int getStateValue() {
        return state;
    }

    public boolean hasState() {
        return (__bitField0 & 16) == 16;
    }

    public CollectionItemDataResponse withState(proto.message.CollectionState value) {
        return CollectionItemDataResponse.newBuilder()
            .mergeFrom(this)
            .setState(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<CollectionItemDataResponse> cachedSchema() {
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
        CollectionItemDataResponse that = (CollectionItemDataResponse) obj;
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.collectionId, that.collectionId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.itemID, that.itemID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.fishID, that.fishID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.state, that.state)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.id);
        result = 31 * result + Integer.hashCode(this.collectionId);
        result = 31 * result + Integer.hashCode(this.itemID);
        result = 31 * result + Integer.hashCode(this.fishID);
        result = 31 * result + Integer.hashCode(this.state);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasId()) {
            parts.add("id=" + getId());
        }
        if (hasCollectionId()) {
            parts.add("collectionId=" + getCollectionId());
        }
        if (hasItemID()) {
            parts.add("itemID=" + getItemID());
        }
        if (hasFishID()) {
            parts.add("fishID=" + getFishID());
        }
        if (hasState()) {
            parts.add("state=" + getState() + '(' + getStateValue() + ')');
        }
        return "CollectionItemDataResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<CollectionItemDataResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("id", 1);
        	__fieldMap.put("collectionId", 2);
        	__fieldMap.put("itemID", 3);
        	__fieldMap.put("fishID", 4);
        	__fieldMap.put("state", 5);
        }

        @Override
        public CollectionItemDataResponse newMessage() {
            return new CollectionItemDataResponse();
        }

        @Override
        public Class<CollectionItemDataResponse> typeClass() {
            return CollectionItemDataResponse.class;
        }

        @Override
        public String messageName() {
            return CollectionItemDataResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return CollectionItemDataResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(CollectionItemDataResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, CollectionItemDataResponse instance) throws java.io.IOException {
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
                    	instance.id = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.collectionId = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.itemID = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.fishID = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.state = input.readEnum();
                    	instance.__bitField0 |= 16;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, CollectionItemDataResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.id, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.collectionId, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.itemID, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.fishID, false);
            }

            if((instance.__bitField0 & 16) == 16) {
            	output.writeEnum(5, instance.state, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "id";
        		case 2: return "collectionId";
        		case 3: return "itemID";
        		case 4: return "fishID";
        		case 5: return "state";
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

        private int id;

        private int collectionId;

        private int itemID;

        private int fishID;

        private int state;

        private int __bitField0;

        private Builder() {
            this.id = 0;
            this.collectionId = 0;
            this.itemID = 0;
            this.fishID = 0;
            this.state = proto.message.CollectionState.STATE_LOCK.getNumber();
        }

        public Builder mergeFrom(CollectionItemDataResponse instance) {
            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            if (instance.hasCollectionId()) {
                this.setCollectionId(instance.getCollectionId());
            }

            if (instance.hasItemID()) {
                this.setItemID(instance.getItemID());
            }

            if (instance.hasFishID()) {
                this.setFishID(instance.getFishID());
            }

            if (instance.hasState()) {
                this.setState(instance.getState());
            }

            return this;
        }

        public int getId() {
            return id;
        }

        public Builder setId(int value) {
            this.id = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearId() {
            this.id = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasId() {
            return (__bitField0 & 1) == 1;
        }

        public int getCollectionId() {
            return collectionId;
        }

        public Builder setCollectionId(int value) {
            this.collectionId = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearCollectionId() {
            this.collectionId = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasCollectionId() {
            return (__bitField0 & 2) == 2;
        }

        public int getItemID() {
            return itemID;
        }

        public Builder setItemID(int value) {
            this.itemID = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearItemID() {
            this.itemID = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasItemID() {
            return (__bitField0 & 4) == 4;
        }

        public int getFishID() {
            return fishID;
        }

        public Builder setFishID(int value) {
            this.fishID = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearFishID() {
            this.fishID = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasFishID() {
            return (__bitField0 & 8) == 8;
        }

        public proto.message.CollectionState getState() {
            return proto.message.CollectionState.valueOf(state);
        }

        public int getStateValue() {
            return state;
        }

        public Builder setState(proto.message.CollectionState value) {
            if (value == null) {
                throw new NullPointerException("Cannot set CollectionItemDataResponse#state to null");
            }

            if (value == proto.message.CollectionState.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set CollectionItemDataResponse#state to UNRECOGNIZED");
            }

            this.state = value.getNumber();
            __bitField0 |= 16;
            return this;
        }

        public Builder setStateValue(int value) {
            this.state = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearState() {
            this.state = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasState() {
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
            if (!java.util.Objects.equals(this.id, that.id)) {
                return false;
            }
            if (!java.util.Objects.equals(this.collectionId, that.collectionId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.itemID, that.itemID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.fishID, that.fishID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.state, that.state)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.id);
            result = 31 * result + Integer.hashCode(this.collectionId);
            result = 31 * result + Integer.hashCode(this.itemID);
            result = 31 * result + Integer.hashCode(this.fishID);
            result = 31 * result + Integer.hashCode(this.state);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasId()) {
                parts.add("id=" + getId());
            }
            if (hasCollectionId()) {
                parts.add("collectionId=" + getCollectionId());
            }
            if (hasItemID()) {
                parts.add("itemID=" + getItemID());
            }
            if (hasFishID()) {
                parts.add("fishID=" + getFishID());
            }
            if (hasState()) {
                parts.add("state=" + getState() + '(' + getStateValue() + ')');
            }
            return "CollectionItemDataResponse{" + String.join(", ", parts) + "}";
        }

        public CollectionItemDataResponse build() {
            proto.message.CollectionItemDataResponse result = new proto.message.CollectionItemDataResponse();
            result.__bitField0 = __bitField0;
            result.id = this.id;
            result.collectionId = this.collectionId;
            result.itemID = this.itemID;
            result.fishID = this.fishID;
            result.state = this.state;
            return result;
        }

    }



}