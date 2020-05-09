package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class GetUserInventoryResponse
        implements io.protostuff.Message<GetUserInventoryResponse> {

    private static final GetUserInventoryResponse DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<proto.message.InventoryCannon> cannons;

    private java.util.List<proto.message.InventorySimpleItem> simpleItems;

    private boolean __merge_lock = false;
    private int __bitField0;

    private GetUserInventoryResponse() {
        this.cannons = java.util.Collections.emptyList();
        this.simpleItems = java.util.Collections.emptyList();
    }

    private GetUserInventoryResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static GetUserInventoryResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<GetUserInventoryResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<proto.message.InventoryCannon> getCannonsList() {
        return cannons;
    }

    public int getCannonsCount() {
        return cannons.size();
    }

    public proto.message.InventoryCannon getCannons(int index) {
        return cannons.get(index);
    }

    public GetUserInventoryResponse withCannons(java.util.List<proto.message.InventoryCannon> value) {
        return GetUserInventoryResponse.newBuilder()
            .mergeFrom(this)
            .clearCannons()
            .addAllCannons(value)
            .build();
    }

    public java.util.List<proto.message.InventorySimpleItem> getSimpleItemsList() {
        return simpleItems;
    }

    public int getSimpleItemsCount() {
        return simpleItems.size();
    }

    public proto.message.InventorySimpleItem getSimpleItems(int index) {
        return simpleItems.get(index);
    }

    public GetUserInventoryResponse withSimpleItems(java.util.List<proto.message.InventorySimpleItem> value) {
        return GetUserInventoryResponse.newBuilder()
            .mergeFrom(this)
            .clearSimpleItems()
            .addAllSimpleItems(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<GetUserInventoryResponse> cachedSchema() {
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
        GetUserInventoryResponse that = (GetUserInventoryResponse) obj;
        if (!java.util.Objects.equals(this.cannons, that.cannons)) {
            return false;
        }
        if (!java.util.Objects.equals(this.simpleItems, that.simpleItems)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.cannons == null ? 0 : this.cannons.hashCode());
        result = 31 * result + (this.simpleItems == null ? 0 : this.simpleItems.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!cannons.isEmpty()) {
            parts.add("cannons=" + getCannonsList());
        }
        if (!simpleItems.isEmpty()) {
            parts.add("simpleItems=" + getSimpleItemsList());
        }
        return "GetUserInventoryResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<GetUserInventoryResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("cannons", 1);
        	__fieldMap.put("simpleItems", 2);
        }

        @Override
        public GetUserInventoryResponse newMessage() {
            return new GetUserInventoryResponse();
        }

        @Override
        public Class<GetUserInventoryResponse> typeClass() {
            return GetUserInventoryResponse.class;
        }

        @Override
        public String messageName() {
            return GetUserInventoryResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return GetUserInventoryResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(GetUserInventoryResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, GetUserInventoryResponse instance) throws java.io.IOException {
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
                    	    instance.cannons = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.cannons.add(input.mergeObject(null, proto.message.InventoryCannon.getSchema()));

                    	break;
                    case 2:
                    	if(!((instance.__bitField0 & 2) == 2)) {
                    	    instance.simpleItems = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 2;
                    	}
                    	instance.simpleItems.add(input.mergeObject(null, proto.message.InventorySimpleItem.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.cannons = java.util.Collections.unmodifiableList(instance.cannons);
            }

            if((instance.__bitField0 & 2) == 2) {
                instance.simpleItems = java.util.Collections.unmodifiableList(instance.simpleItems);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, GetUserInventoryResponse instance) throws java.io.IOException {
            for(proto.message.InventoryCannon cannons : instance.cannons) {
                output.writeObject(1, cannons, proto.message.InventoryCannon.getSchema(), true);
            }

            for(proto.message.InventorySimpleItem simpleItems : instance.simpleItems) {
                output.writeObject(2, simpleItems, proto.message.InventorySimpleItem.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "cannons";
        		case 2: return "simpleItems";
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

        private java.util.List<proto.message.InventoryCannon> cannons;

        private java.util.List<proto.message.InventorySimpleItem> simpleItems;

        private int __bitField0;

        private Builder() {
            this.cannons = java.util.Collections.emptyList();
            this.simpleItems = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(GetUserInventoryResponse instance) {
            this.addAllCannons(instance.getCannonsList());

            this.addAllSimpleItems(instance.getSimpleItemsList());

            return this;
        }

        public java.util.List<proto.message.InventoryCannon> getCannonsList() {
            return cannons;
        }

        public Builder setCannons(int index, proto.message.InventoryCannon value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GetUserInventoryResponse#cannons to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.cannons = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.cannons.set(index, value);
            return this;
        }

        public Builder addCannons(proto.message.InventoryCannon value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GetUserInventoryResponse#cannons to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.cannons = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.cannons.add(value);
            return this;
        }

        public Builder addAllCannons(java.lang.Iterable<proto.message.InventoryCannon> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set GetUserInventoryResponse#cannons to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.cannons = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final proto.message.InventoryCannon value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set GetUserInventoryResponse#cannons to null");
                }
                this.cannons.add(value);
            }
            return this;
        }

        public Builder clearCannons() {
            this.cannons = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getCannonsCount() {
            return cannons.size();
        }

        public proto.message.InventoryCannon getCannons(int index) {
            return cannons.get(index);
        }

        public java.util.List<proto.message.InventorySimpleItem> getSimpleItemsList() {
            return simpleItems;
        }

        public Builder setSimpleItems(int index, proto.message.InventorySimpleItem value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GetUserInventoryResponse#simpleItems to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.simpleItems = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.simpleItems.set(index, value);
            return this;
        }

        public Builder addSimpleItems(proto.message.InventorySimpleItem value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GetUserInventoryResponse#simpleItems to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.simpleItems = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.simpleItems.add(value);
            return this;
        }

        public Builder addAllSimpleItems(java.lang.Iterable<proto.message.InventorySimpleItem> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set GetUserInventoryResponse#simpleItems to null");
            }
            if(!((__bitField0 & 2) == 2)) {
                this.simpleItems = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            for (final proto.message.InventorySimpleItem value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set GetUserInventoryResponse#simpleItems to null");
                }
                this.simpleItems.add(value);
            }
            return this;
        }

        public Builder clearSimpleItems() {
            this.simpleItems = java.util.Collections.emptyList();
            __bitField0 &= ~2;
            return this;
        }

        public int getSimpleItemsCount() {
            return simpleItems.size();
        }

        public proto.message.InventorySimpleItem getSimpleItems(int index) {
            return simpleItems.get(index);
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
            if (!java.util.Objects.equals(this.cannons, that.cannons)) {
                return false;
            }
            if (!java.util.Objects.equals(this.simpleItems, that.simpleItems)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.cannons == null ? 0 : this.cannons.hashCode());
            result = 31 * result + (this.simpleItems == null ? 0 : this.simpleItems.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!cannons.isEmpty()) {
                parts.add("cannons=" + getCannonsList());
            }
            if (!simpleItems.isEmpty()) {
                parts.add("simpleItems=" + getSimpleItemsList());
            }
            return "GetUserInventoryResponse{" + String.join(", ", parts) + "}";
        }

        public GetUserInventoryResponse build() {
            proto.message.GetUserInventoryResponse result = new proto.message.GetUserInventoryResponse();
            result.__bitField0 = __bitField0;
            result.cannons = java.util.Collections.unmodifiableList(this.cannons);
            result.simpleItems = java.util.Collections.unmodifiableList(this.simpleItems);
            return result;
        }

    }



}