package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class CollectionPrizeResponse
        implements io.protostuff.Message<CollectionPrizeResponse> {

    private static final CollectionPrizeResponse DEFAULT_INSTANCE = newBuilder().build();

    private int id;

    private int collectionId;

    private int itemID;

    private int itemType;

    private int quantity;

    private String description;

    private boolean __merge_lock = false;
    private int __bitField0;

    private CollectionPrizeResponse() {
        this.id = 0;
        this.collectionId = 0;
        this.itemID = 0;
        this.itemType = 0;
        this.quantity = 0;
        this.description = "";
    }

    private CollectionPrizeResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static CollectionPrizeResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<CollectionPrizeResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 1) == 1;
    }

    public CollectionPrizeResponse withId(int value) {
        return CollectionPrizeResponse.newBuilder()
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

    public CollectionPrizeResponse withCollectionId(int value) {
        return CollectionPrizeResponse.newBuilder()
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

    public CollectionPrizeResponse withItemID(int value) {
        return CollectionPrizeResponse.newBuilder()
            .mergeFrom(this)
            .setItemID(value)
            .build();
    }

    public int getItemType() {
        return itemType;
    }

    public boolean hasItemType() {
        return (__bitField0 & 8) == 8;
    }

    public CollectionPrizeResponse withItemType(int value) {
        return CollectionPrizeResponse.newBuilder()
            .mergeFrom(this)
            .setItemType(value)
            .build();
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean hasQuantity() {
        return (__bitField0 & 16) == 16;
    }

    public CollectionPrizeResponse withQuantity(int value) {
        return CollectionPrizeResponse.newBuilder()
            .mergeFrom(this)
            .setQuantity(value)
            .build();
    }

    public String getDescription() {
        return description;
    }

    public boolean hasDescription() {
        return (__bitField0 & 32) == 32;
    }

    public CollectionPrizeResponse withDescription(String value) {
        return CollectionPrizeResponse.newBuilder()
            .mergeFrom(this)
            .setDescription(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<CollectionPrizeResponse> cachedSchema() {
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
        CollectionPrizeResponse that = (CollectionPrizeResponse) obj;
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.collectionId, that.collectionId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.itemID, that.itemID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.itemType, that.itemType)) {
            return false;
        }
        if (!java.util.Objects.equals(this.quantity, that.quantity)) {
            return false;
        }
        if (!java.util.Objects.equals(this.description, that.description)) {
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
        result = 31 * result + Integer.hashCode(this.itemType);
        result = 31 * result + Integer.hashCode(this.quantity);
        result = 31 * result + (this.description == null ? 0 : this.description.hashCode());

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
        if (hasItemType()) {
            parts.add("itemType=" + getItemType());
        }
        if (hasQuantity()) {
            parts.add("quantity=" + getQuantity());
        }
        if (hasDescription()) {
            parts.add("description=" + getDescription());
        }
        return "CollectionPrizeResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<CollectionPrizeResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("id", 1);
        	__fieldMap.put("collectionId", 2);
        	__fieldMap.put("itemID", 3);
        	__fieldMap.put("itemType", 4);
        	__fieldMap.put("quantity", 5);
        	__fieldMap.put("description", 6);
        }

        @Override
        public CollectionPrizeResponse newMessage() {
            return new CollectionPrizeResponse();
        }

        @Override
        public Class<CollectionPrizeResponse> typeClass() {
            return CollectionPrizeResponse.class;
        }

        @Override
        public String messageName() {
            return CollectionPrizeResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return CollectionPrizeResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(CollectionPrizeResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, CollectionPrizeResponse instance) throws java.io.IOException {
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
                    	instance.itemType = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.quantity = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.description = input.readString();
                    	instance.__bitField0 |= 32;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, CollectionPrizeResponse instance) throws java.io.IOException {
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
                output.writeInt32(4, instance.itemType, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.quantity, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeString(6, instance.description, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "id";
        		case 2: return "collectionId";
        		case 3: return "itemID";
        		case 4: return "itemType";
        		case 5: return "quantity";
        		case 6: return "description";
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

        private int itemType;

        private int quantity;

        private String description;

        private int __bitField0;

        private Builder() {
            this.id = 0;
            this.collectionId = 0;
            this.itemID = 0;
            this.itemType = 0;
            this.quantity = 0;
            this.description = "";
        }

        public Builder mergeFrom(CollectionPrizeResponse instance) {
            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            if (instance.hasCollectionId()) {
                this.setCollectionId(instance.getCollectionId());
            }

            if (instance.hasItemID()) {
                this.setItemID(instance.getItemID());
            }

            if (instance.hasItemType()) {
                this.setItemType(instance.getItemType());
            }

            if (instance.hasQuantity()) {
                this.setQuantity(instance.getQuantity());
            }

            if (instance.hasDescription()) {
                this.setDescription(instance.getDescription());
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

        public int getItemType() {
            return itemType;
        }

        public Builder setItemType(int value) {
            this.itemType = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearItemType() {
            this.itemType = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasItemType() {
            return (__bitField0 & 8) == 8;
        }

        public int getQuantity() {
            return quantity;
        }

        public Builder setQuantity(int value) {
            this.quantity = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearQuantity() {
            this.quantity = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasQuantity() {
            return (__bitField0 & 16) == 16;
        }

        public String getDescription() {
            return description;
        }

        public Builder setDescription(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set CollectionPrizeResponse#description to null");
            }

            this.description = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearDescription() {
            this.description = "";
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasDescription() {
            return (__bitField0 & 32) == 32;
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
            if (!java.util.Objects.equals(this.itemType, that.itemType)) {
                return false;
            }
            if (!java.util.Objects.equals(this.quantity, that.quantity)) {
                return false;
            }
            if (!java.util.Objects.equals(this.description, that.description)) {
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
            result = 31 * result + Integer.hashCode(this.itemType);
            result = 31 * result + Integer.hashCode(this.quantity);
            result = 31 * result + (this.description == null ? 0 : this.description.hashCode());

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
            if (hasItemType()) {
                parts.add("itemType=" + getItemType());
            }
            if (hasQuantity()) {
                parts.add("quantity=" + getQuantity());
            }
            if (hasDescription()) {
                parts.add("description=" + getDescription());
            }
            return "CollectionPrizeResponse{" + String.join(", ", parts) + "}";
        }

        public CollectionPrizeResponse build() {
            proto.message.CollectionPrizeResponse result = new proto.message.CollectionPrizeResponse();
            result.__bitField0 = __bitField0;
            result.id = this.id;
            result.collectionId = this.collectionId;
            result.itemID = this.itemID;
            result.itemType = this.itemType;
            result.quantity = this.quantity;
            result.description = this.description;
            return result;
        }

    }



}