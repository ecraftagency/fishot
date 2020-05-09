package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class IngameCollectionItemDropResponse
        implements io.protostuff.Message<IngameCollectionItemDropResponse> {

    private static final IngameCollectionItemDropResponse DEFAULT_INSTANCE = newBuilder().build();

    private String userId;

    private int id;

    private int collectionId;

    private int itemId;

    private long hordeID;

    private boolean __merge_lock = false;
    private int __bitField0;

    private IngameCollectionItemDropResponse() {
        this.userId = "";
        this.id = 0;
        this.collectionId = 0;
        this.itemId = 0;
        this.hordeID = 0L;
    }

    private IngameCollectionItemDropResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static IngameCollectionItemDropResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<IngameCollectionItemDropResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getUserId() {
        return userId;
    }

    public boolean hasUserId() {
        return (__bitField0 & 1) == 1;
    }

    public IngameCollectionItemDropResponse withUserId(String value) {
        return IngameCollectionItemDropResponse.newBuilder()
            .mergeFrom(this)
            .setUserId(value)
            .build();
    }

    public int getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 2) == 2;
    }

    public IngameCollectionItemDropResponse withId(int value) {
        return IngameCollectionItemDropResponse.newBuilder()
            .mergeFrom(this)
            .setId(value)
            .build();
    }

    public int getCollectionId() {
        return collectionId;
    }

    public boolean hasCollectionId() {
        return (__bitField0 & 4) == 4;
    }

    public IngameCollectionItemDropResponse withCollectionId(int value) {
        return IngameCollectionItemDropResponse.newBuilder()
            .mergeFrom(this)
            .setCollectionId(value)
            .build();
    }

    public int getItemId() {
        return itemId;
    }

    public boolean hasItemId() {
        return (__bitField0 & 8) == 8;
    }

    public IngameCollectionItemDropResponse withItemId(int value) {
        return IngameCollectionItemDropResponse.newBuilder()
            .mergeFrom(this)
            .setItemId(value)
            .build();
    }

    public long getHordeID() {
        return hordeID;
    }

    public boolean hasHordeID() {
        return (__bitField0 & 16) == 16;
    }

    public IngameCollectionItemDropResponse withHordeID(long value) {
        return IngameCollectionItemDropResponse.newBuilder()
            .mergeFrom(this)
            .setHordeID(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<IngameCollectionItemDropResponse> cachedSchema() {
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
        IngameCollectionItemDropResponse that = (IngameCollectionItemDropResponse) obj;
        if (!java.util.Objects.equals(this.userId, that.userId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.collectionId, that.collectionId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.itemId, that.itemId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.hordeID, that.hordeID)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.userId == null ? 0 : this.userId.hashCode());
        result = 31 * result + Integer.hashCode(this.id);
        result = 31 * result + Integer.hashCode(this.collectionId);
        result = 31 * result + Integer.hashCode(this.itemId);
        result = 31 * result + Long.hashCode(this.hordeID);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasUserId()) {
            parts.add("userId=" + getUserId());
        }
        if (hasId()) {
            parts.add("id=" + getId());
        }
        if (hasCollectionId()) {
            parts.add("collectionId=" + getCollectionId());
        }
        if (hasItemId()) {
            parts.add("itemId=" + getItemId());
        }
        if (hasHordeID()) {
            parts.add("hordeID=" + getHordeID());
        }
        return "IngameCollectionItemDropResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<IngameCollectionItemDropResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("userId", 1);
        	__fieldMap.put("id", 2);
        	__fieldMap.put("collectionId", 3);
        	__fieldMap.put("itemId", 4);
        	__fieldMap.put("hordeID", 5);
        }

        @Override
        public IngameCollectionItemDropResponse newMessage() {
            return new IngameCollectionItemDropResponse();
        }

        @Override
        public Class<IngameCollectionItemDropResponse> typeClass() {
            return IngameCollectionItemDropResponse.class;
        }

        @Override
        public String messageName() {
            return IngameCollectionItemDropResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return IngameCollectionItemDropResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(IngameCollectionItemDropResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, IngameCollectionItemDropResponse instance) throws java.io.IOException {
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
                    	instance.userId = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.id = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.collectionId = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.itemId = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.hordeID = input.readInt64();
                    	instance.__bitField0 |= 16;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, IngameCollectionItemDropResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.userId, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.id, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.collectionId, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.itemId, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt64(5, instance.hordeID, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "userId";
        		case 2: return "id";
        		case 3: return "collectionId";
        		case 4: return "itemId";
        		case 5: return "hordeID";
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

        private String userId;

        private int id;

        private int collectionId;

        private int itemId;

        private long hordeID;

        private int __bitField0;

        private Builder() {
            this.userId = "";
            this.id = 0;
            this.collectionId = 0;
            this.itemId = 0;
            this.hordeID = 0L;
        }

        public Builder mergeFrom(IngameCollectionItemDropResponse instance) {
            if (instance.hasUserId()) {
                this.setUserId(instance.getUserId());
            }

            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            if (instance.hasCollectionId()) {
                this.setCollectionId(instance.getCollectionId());
            }

            if (instance.hasItemId()) {
                this.setItemId(instance.getItemId());
            }

            if (instance.hasHordeID()) {
                this.setHordeID(instance.getHordeID());
            }

            return this;
        }

        public String getUserId() {
            return userId;
        }

        public Builder setUserId(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set IngameCollectionItemDropResponse#userId to null");
            }

            this.userId = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearUserId() {
            this.userId = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasUserId() {
            return (__bitField0 & 1) == 1;
        }

        public int getId() {
            return id;
        }

        public Builder setId(int value) {
            this.id = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearId() {
            this.id = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasId() {
            return (__bitField0 & 2) == 2;
        }

        public int getCollectionId() {
            return collectionId;
        }

        public Builder setCollectionId(int value) {
            this.collectionId = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearCollectionId() {
            this.collectionId = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasCollectionId() {
            return (__bitField0 & 4) == 4;
        }

        public int getItemId() {
            return itemId;
        }

        public Builder setItemId(int value) {
            this.itemId = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearItemId() {
            this.itemId = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasItemId() {
            return (__bitField0 & 8) == 8;
        }

        public long getHordeID() {
            return hordeID;
        }

        public Builder setHordeID(long value) {
            this.hordeID = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearHordeID() {
            this.hordeID = 0L;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasHordeID() {
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
            if (!java.util.Objects.equals(this.userId, that.userId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.id, that.id)) {
                return false;
            }
            if (!java.util.Objects.equals(this.collectionId, that.collectionId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.itemId, that.itemId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.hordeID, that.hordeID)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.userId == null ? 0 : this.userId.hashCode());
            result = 31 * result + Integer.hashCode(this.id);
            result = 31 * result + Integer.hashCode(this.collectionId);
            result = 31 * result + Integer.hashCode(this.itemId);
            result = 31 * result + Long.hashCode(this.hordeID);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasUserId()) {
                parts.add("userId=" + getUserId());
            }
            if (hasId()) {
                parts.add("id=" + getId());
            }
            if (hasCollectionId()) {
                parts.add("collectionId=" + getCollectionId());
            }
            if (hasItemId()) {
                parts.add("itemId=" + getItemId());
            }
            if (hasHordeID()) {
                parts.add("hordeID=" + getHordeID());
            }
            return "IngameCollectionItemDropResponse{" + String.join(", ", parts) + "}";
        }

        public IngameCollectionItemDropResponse build() {
            proto.message.IngameCollectionItemDropResponse result = new proto.message.IngameCollectionItemDropResponse();
            result.__bitField0 = __bitField0;
            result.userId = this.userId;
            result.id = this.id;
            result.collectionId = this.collectionId;
            result.itemId = this.itemId;
            result.hordeID = this.hordeID;
            return result;
        }

    }



}