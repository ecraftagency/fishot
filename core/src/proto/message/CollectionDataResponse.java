package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class CollectionDataResponse
        implements io.protostuff.Message<CollectionDataResponse> {

    private static final CollectionDataResponse DEFAULT_INSTANCE = newBuilder().build();

    private int id;

    private String description;

    private java.util.List<proto.message.CollectionItemDataResponse> listItem;

    private java.util.List<Integer> listMilestone;

    private java.util.List<Integer> listCompletedMilestone;

    private boolean hasPrize;

    private boolean __merge_lock = false;
    private int __bitField0;

    private CollectionDataResponse() {
        this.id = 0;
        this.description = "";
        this.listItem = java.util.Collections.emptyList();
        this.listMilestone = java.util.Collections.emptyList();
        this.listCompletedMilestone = java.util.Collections.emptyList();
        this.hasPrize = false;
    }

    private CollectionDataResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static CollectionDataResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<CollectionDataResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 1) == 1;
    }

    public CollectionDataResponse withId(int value) {
        return CollectionDataResponse.newBuilder()
            .mergeFrom(this)
            .setId(value)
            .build();
    }

    public String getDescription() {
        return description;
    }

    public boolean hasDescription() {
        return (__bitField0 & 2) == 2;
    }

    public CollectionDataResponse withDescription(String value) {
        return CollectionDataResponse.newBuilder()
            .mergeFrom(this)
            .setDescription(value)
            .build();
    }

    public java.util.List<proto.message.CollectionItemDataResponse> getListItemList() {
        return listItem;
    }

    public int getListItemCount() {
        return listItem.size();
    }

    public proto.message.CollectionItemDataResponse getListItem(int index) {
        return listItem.get(index);
    }

    public CollectionDataResponse withListItem(java.util.List<proto.message.CollectionItemDataResponse> value) {
        return CollectionDataResponse.newBuilder()
            .mergeFrom(this)
            .clearListItem()
            .addAllListItem(value)
            .build();
    }

    public java.util.List<Integer> getListMilestoneList() {
        return listMilestone;
    }

    public int getListMilestoneCount() {
        return listMilestone.size();
    }

    public int getListMilestone(int index) {
        return listMilestone.get(index);
    }

    public CollectionDataResponse withListMilestone(java.util.List<Integer> value) {
        return CollectionDataResponse.newBuilder()
            .mergeFrom(this)
            .clearListMilestone()
            .addAllListMilestone(value)
            .build();
    }

    public java.util.List<Integer> getListCompletedMilestoneList() {
        return listCompletedMilestone;
    }

    public int getListCompletedMilestoneCount() {
        return listCompletedMilestone.size();
    }

    public int getListCompletedMilestone(int index) {
        return listCompletedMilestone.get(index);
    }

    public CollectionDataResponse withListCompletedMilestone(java.util.List<Integer> value) {
        return CollectionDataResponse.newBuilder()
            .mergeFrom(this)
            .clearListCompletedMilestone()
            .addAllListCompletedMilestone(value)
            .build();
    }

    public boolean getHasPrize() {
        return hasPrize;
    }

    public boolean hasHasPrize() {
        return (__bitField0 & 32) == 32;
    }

    public CollectionDataResponse withHasPrize(boolean value) {
        return CollectionDataResponse.newBuilder()
            .mergeFrom(this)
            .setHasPrize(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<CollectionDataResponse> cachedSchema() {
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
        CollectionDataResponse that = (CollectionDataResponse) obj;
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.description, that.description)) {
            return false;
        }
        if (!java.util.Objects.equals(this.listItem, that.listItem)) {
            return false;
        }
        if (!java.util.Objects.equals(this.listMilestone, that.listMilestone)) {
            return false;
        }
        if (!java.util.Objects.equals(this.listCompletedMilestone, that.listCompletedMilestone)) {
            return false;
        }
        if (!java.util.Objects.equals(this.hasPrize, that.hasPrize)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.id);
        result = 31 * result + (this.description == null ? 0 : this.description.hashCode());
        result = 31 * result + (this.listItem == null ? 0 : this.listItem.hashCode());
        result = 31 * result + (this.listMilestone == null ? 0 : this.listMilestone.hashCode());
        result = 31 * result + (this.listCompletedMilestone == null ? 0 : this.listCompletedMilestone.hashCode());
        result = 31 * result + Boolean.hashCode(this.hasPrize);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasId()) {
            parts.add("id=" + getId());
        }
        if (hasDescription()) {
            parts.add("description=" + getDescription());
        }
        if (!listItem.isEmpty()) {
            parts.add("listItem=" + getListItemList());
        }
        if (!listMilestone.isEmpty()) {
            parts.add("listMilestone=" + getListMilestoneList());
        }
        if (!listCompletedMilestone.isEmpty()) {
            parts.add("listCompletedMilestone=" + getListCompletedMilestoneList());
        }
        if (hasHasPrize()) {
            parts.add("hasPrize=" + getHasPrize());
        }
        return "CollectionDataResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<CollectionDataResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("id", 1);
        	__fieldMap.put("description", 2);
        	__fieldMap.put("listItem", 3);
        	__fieldMap.put("listMilestone", 4);
        	__fieldMap.put("listCompletedMilestone", 5);
        	__fieldMap.put("hasPrize", 6);
        }

        @Override
        public CollectionDataResponse newMessage() {
            return new CollectionDataResponse();
        }

        @Override
        public Class<CollectionDataResponse> typeClass() {
            return CollectionDataResponse.class;
        }

        @Override
        public String messageName() {
            return CollectionDataResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return CollectionDataResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(CollectionDataResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, CollectionDataResponse instance) throws java.io.IOException {
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
                    	instance.description = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	if(!((instance.__bitField0 & 4) == 4)) {
                    	    instance.listItem = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 4;
                    	}
                    	instance.listItem.add(input.mergeObject(null, proto.message.CollectionItemDataResponse.getSchema()));

                    	break;
                    case 4:
                    	if(!((instance.__bitField0 & 8) == 8)) {
                    	    instance.listMilestone = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 8;
                    	}
                    	instance.listMilestone.add(input.readInt32());

                    	break;
                    case 5:
                    	if(!((instance.__bitField0 & 16) == 16)) {
                    	    instance.listCompletedMilestone = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 16;
                    	}
                    	instance.listCompletedMilestone.add(input.readInt32());

                    	break;
                    case 6:
                    	instance.hasPrize = input.readBool();
                    	instance.__bitField0 |= 32;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 4) == 4) {
                instance.listItem = java.util.Collections.unmodifiableList(instance.listItem);
            }

            if((instance.__bitField0 & 8) == 8) {
                instance.listMilestone = java.util.Collections.unmodifiableList(instance.listMilestone);
            }

            if((instance.__bitField0 & 16) == 16) {
                instance.listCompletedMilestone = java.util.Collections.unmodifiableList(instance.listCompletedMilestone);
            }


        }

        @Override
        public void writeTo(io.protostuff.Output output, CollectionDataResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.id, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.description, false);
            }

            for(proto.message.CollectionItemDataResponse listItem : instance.listItem) {
                output.writeObject(3, listItem, proto.message.CollectionItemDataResponse.getSchema(), true);
            }

            for(int listMilestone : instance.listMilestone) {
                output.writeInt32(4, listMilestone, true);
            }

            for(int listCompletedMilestone : instance.listCompletedMilestone) {
                output.writeInt32(5, listCompletedMilestone, true);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeBool(6, instance.hasPrize, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "id";
        		case 2: return "description";
        		case 3: return "listItem";
        		case 4: return "listMilestone";
        		case 5: return "listCompletedMilestone";
        		case 6: return "hasPrize";
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

        private String description;

        private java.util.List<proto.message.CollectionItemDataResponse> listItem;

        private java.util.List<Integer> listMilestone;

        private java.util.List<Integer> listCompletedMilestone;

        private boolean hasPrize;

        private int __bitField0;

        private Builder() {
            this.id = 0;
            this.description = "";
            this.listItem = java.util.Collections.emptyList();
            this.listMilestone = java.util.Collections.emptyList();
            this.listCompletedMilestone = java.util.Collections.emptyList();
            this.hasPrize = false;
        }

        public Builder mergeFrom(CollectionDataResponse instance) {
            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            if (instance.hasDescription()) {
                this.setDescription(instance.getDescription());
            }

            this.addAllListItem(instance.getListItemList());

            this.addAllListMilestone(instance.getListMilestoneList());

            this.addAllListCompletedMilestone(instance.getListCompletedMilestoneList());

            if (instance.hasHasPrize()) {
                this.setHasPrize(instance.getHasPrize());
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

        public String getDescription() {
            return description;
        }

        public Builder setDescription(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set CollectionDataResponse#description to null");
            }

            this.description = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearDescription() {
            this.description = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasDescription() {
            return (__bitField0 & 2) == 2;
        }

        public java.util.List<proto.message.CollectionItemDataResponse> getListItemList() {
            return listItem;
        }

        public Builder setListItem(int index, proto.message.CollectionItemDataResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set CollectionDataResponse#listItem to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.listItem = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.listItem.set(index, value);
            return this;
        }

        public Builder addListItem(proto.message.CollectionItemDataResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set CollectionDataResponse#listItem to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.listItem = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.listItem.add(value);
            return this;
        }

        public Builder addAllListItem(java.lang.Iterable<proto.message.CollectionItemDataResponse> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set CollectionDataResponse#listItem to null");
            }
            if(!((__bitField0 & 4) == 4)) {
                this.listItem = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            for (final proto.message.CollectionItemDataResponse value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set CollectionDataResponse#listItem to null");
                }
                this.listItem.add(value);
            }
            return this;
        }

        public Builder clearListItem() {
            this.listItem = java.util.Collections.emptyList();
            __bitField0 &= ~4;
            return this;
        }

        public int getListItemCount() {
            return listItem.size();
        }

        public proto.message.CollectionItemDataResponse getListItem(int index) {
            return listItem.get(index);
        }

        public java.util.List<Integer> getListMilestoneList() {
            return listMilestone;
        }

        public Builder setListMilestone(int index, int value) {
            if(!((__bitField0 & 8) == 8)) {
                this.listMilestone = new java.util.ArrayList<>();
                __bitField0 |= 8;
            }
            this.listMilestone.set(index, value);
            return this;
        }

        public Builder addListMilestone(int value) {
            if(!((__bitField0 & 8) == 8)) {
                this.listMilestone = new java.util.ArrayList<>();
                __bitField0 |= 8;
            }
            this.listMilestone.add(value);
            return this;
        }

        public Builder addAllListMilestone(java.lang.Iterable<Integer> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set CollectionDataResponse#listMilestone to null");
            }
            if(!((__bitField0 & 8) == 8)) {
                this.listMilestone = new java.util.ArrayList<>();
                __bitField0 |= 8;
            }
            for (final Integer value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set CollectionDataResponse#listMilestone to null");
                }
                this.listMilestone.add(value);
            }
            return this;
        }

        public Builder clearListMilestone() {
            this.listMilestone = java.util.Collections.emptyList();
            __bitField0 &= ~8;
            return this;
        }

        public int getListMilestoneCount() {
            return listMilestone.size();
        }

        public int getListMilestone(int index) {
            return listMilestone.get(index);
        }

        public java.util.List<Integer> getListCompletedMilestoneList() {
            return listCompletedMilestone;
        }

        public Builder setListCompletedMilestone(int index, int value) {
            if(!((__bitField0 & 16) == 16)) {
                this.listCompletedMilestone = new java.util.ArrayList<>();
                __bitField0 |= 16;
            }
            this.listCompletedMilestone.set(index, value);
            return this;
        }

        public Builder addListCompletedMilestone(int value) {
            if(!((__bitField0 & 16) == 16)) {
                this.listCompletedMilestone = new java.util.ArrayList<>();
                __bitField0 |= 16;
            }
            this.listCompletedMilestone.add(value);
            return this;
        }

        public Builder addAllListCompletedMilestone(java.lang.Iterable<Integer> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set CollectionDataResponse#listCompletedMilestone to null");
            }
            if(!((__bitField0 & 16) == 16)) {
                this.listCompletedMilestone = new java.util.ArrayList<>();
                __bitField0 |= 16;
            }
            for (final Integer value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set CollectionDataResponse#listCompletedMilestone to null");
                }
                this.listCompletedMilestone.add(value);
            }
            return this;
        }

        public Builder clearListCompletedMilestone() {
            this.listCompletedMilestone = java.util.Collections.emptyList();
            __bitField0 &= ~16;
            return this;
        }

        public int getListCompletedMilestoneCount() {
            return listCompletedMilestone.size();
        }

        public int getListCompletedMilestone(int index) {
            return listCompletedMilestone.get(index);
        }

        public boolean getHasPrize() {
            return hasPrize;
        }

        public Builder setHasPrize(boolean value) {
            this.hasPrize = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearHasPrize() {
            this.hasPrize = false;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasHasPrize() {
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
            if (!java.util.Objects.equals(this.description, that.description)) {
                return false;
            }
            if (!java.util.Objects.equals(this.listItem, that.listItem)) {
                return false;
            }
            if (!java.util.Objects.equals(this.listMilestone, that.listMilestone)) {
                return false;
            }
            if (!java.util.Objects.equals(this.listCompletedMilestone, that.listCompletedMilestone)) {
                return false;
            }
            if (!java.util.Objects.equals(this.hasPrize, that.hasPrize)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.id);
            result = 31 * result + (this.description == null ? 0 : this.description.hashCode());
            result = 31 * result + (this.listItem == null ? 0 : this.listItem.hashCode());
            result = 31 * result + (this.listMilestone == null ? 0 : this.listMilestone.hashCode());
            result = 31 * result + (this.listCompletedMilestone == null ? 0 : this.listCompletedMilestone.hashCode());
            result = 31 * result + Boolean.hashCode(this.hasPrize);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasId()) {
                parts.add("id=" + getId());
            }
            if (hasDescription()) {
                parts.add("description=" + getDescription());
            }
            if (!listItem.isEmpty()) {
                parts.add("listItem=" + getListItemList());
            }
            if (!listMilestone.isEmpty()) {
                parts.add("listMilestone=" + getListMilestoneList());
            }
            if (!listCompletedMilestone.isEmpty()) {
                parts.add("listCompletedMilestone=" + getListCompletedMilestoneList());
            }
            if (hasHasPrize()) {
                parts.add("hasPrize=" + getHasPrize());
            }
            return "CollectionDataResponse{" + String.join(", ", parts) + "}";
        }

        public CollectionDataResponse build() {
            proto.message.CollectionDataResponse result = new proto.message.CollectionDataResponse();
            result.__bitField0 = __bitField0;
            result.id = this.id;
            result.description = this.description;
            result.listItem = java.util.Collections.unmodifiableList(this.listItem);
            result.listMilestone = java.util.Collections.unmodifiableList(this.listMilestone);
            result.listCompletedMilestone = java.util.Collections.unmodifiableList(this.listCompletedMilestone);
            result.hasPrize = this.hasPrize;
            return result;
        }

    }



}