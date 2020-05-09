package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class MapDailyBonusItem
        implements io.protostuff.Message<MapDailyBonusItem> {

    private static final MapDailyBonusItem DEFAULT_INSTANCE = newBuilder().build();

    private int id;

    private java.util.List<proto.message.DailyBonusItem> listBonusItem;

    private boolean __merge_lock = false;
    private int __bitField0;

    private MapDailyBonusItem() {
        this.id = 0;
        this.listBonusItem = java.util.Collections.emptyList();
    }

    private MapDailyBonusItem(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static MapDailyBonusItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<MapDailyBonusItem> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 1) == 1;
    }

    public MapDailyBonusItem withId(int value) {
        return MapDailyBonusItem.newBuilder()
            .mergeFrom(this)
            .setId(value)
            .build();
    }

    public java.util.List<proto.message.DailyBonusItem> getListBonusItemList() {
        return listBonusItem;
    }

    public int getListBonusItemCount() {
        return listBonusItem.size();
    }

    public proto.message.DailyBonusItem getListBonusItem(int index) {
        return listBonusItem.get(index);
    }

    public MapDailyBonusItem withListBonusItem(java.util.List<proto.message.DailyBonusItem> value) {
        return MapDailyBonusItem.newBuilder()
            .mergeFrom(this)
            .clearListBonusItem()
            .addAllListBonusItem(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<MapDailyBonusItem> cachedSchema() {
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
        MapDailyBonusItem that = (MapDailyBonusItem) obj;
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.listBonusItem, that.listBonusItem)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.id);
        result = 31 * result + (this.listBonusItem == null ? 0 : this.listBonusItem.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasId()) {
            parts.add("id=" + getId());
        }
        if (!listBonusItem.isEmpty()) {
            parts.add("listBonusItem=" + getListBonusItemList());
        }
        return "MapDailyBonusItem{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<MapDailyBonusItem>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("id", 1);
        	__fieldMap.put("listBonusItem", 2);
        }

        @Override
        public MapDailyBonusItem newMessage() {
            return new MapDailyBonusItem();
        }

        @Override
        public Class<MapDailyBonusItem> typeClass() {
            return MapDailyBonusItem.class;
        }

        @Override
        public String messageName() {
            return MapDailyBonusItem.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return MapDailyBonusItem.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(MapDailyBonusItem message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, MapDailyBonusItem instance) throws java.io.IOException {
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
                    	if(!((instance.__bitField0 & 2) == 2)) {
                    	    instance.listBonusItem = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 2;
                    	}
                    	instance.listBonusItem.add(input.mergeObject(null, proto.message.DailyBonusItem.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 2) == 2) {
                instance.listBonusItem = java.util.Collections.unmodifiableList(instance.listBonusItem);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, MapDailyBonusItem instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.id, false);
            }

            for(proto.message.DailyBonusItem listBonusItem : instance.listBonusItem) {
                output.writeObject(2, listBonusItem, proto.message.DailyBonusItem.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "id";
        		case 2: return "listBonusItem";
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

        private java.util.List<proto.message.DailyBonusItem> listBonusItem;

        private int __bitField0;

        private Builder() {
            this.id = 0;
            this.listBonusItem = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(MapDailyBonusItem instance) {
            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            this.addAllListBonusItem(instance.getListBonusItemList());

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

        public java.util.List<proto.message.DailyBonusItem> getListBonusItemList() {
            return listBonusItem;
        }

        public Builder setListBonusItem(int index, proto.message.DailyBonusItem value) {
            if (value == null) {
                throw new NullPointerException("Cannot set MapDailyBonusItem#listBonusItem to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.listBonusItem = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.listBonusItem.set(index, value);
            return this;
        }

        public Builder addListBonusItem(proto.message.DailyBonusItem value) {
            if (value == null) {
                throw new NullPointerException("Cannot set MapDailyBonusItem#listBonusItem to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.listBonusItem = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.listBonusItem.add(value);
            return this;
        }

        public Builder addAllListBonusItem(java.lang.Iterable<proto.message.DailyBonusItem> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set MapDailyBonusItem#listBonusItem to null");
            }
            if(!((__bitField0 & 2) == 2)) {
                this.listBonusItem = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            for (final proto.message.DailyBonusItem value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set MapDailyBonusItem#listBonusItem to null");
                }
                this.listBonusItem.add(value);
            }
            return this;
        }

        public Builder clearListBonusItem() {
            this.listBonusItem = java.util.Collections.emptyList();
            __bitField0 &= ~2;
            return this;
        }

        public int getListBonusItemCount() {
            return listBonusItem.size();
        }

        public proto.message.DailyBonusItem getListBonusItem(int index) {
            return listBonusItem.get(index);
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
            if (!java.util.Objects.equals(this.listBonusItem, that.listBonusItem)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.id);
            result = 31 * result + (this.listBonusItem == null ? 0 : this.listBonusItem.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasId()) {
                parts.add("id=" + getId());
            }
            if (!listBonusItem.isEmpty()) {
                parts.add("listBonusItem=" + getListBonusItemList());
            }
            return "MapDailyBonusItem{" + String.join(", ", parts) + "}";
        }

        public MapDailyBonusItem build() {
            proto.message.MapDailyBonusItem result = new proto.message.MapDailyBonusItem();
            result.__bitField0 = __bitField0;
            result.id = this.id;
            result.listBonusItem = java.util.Collections.unmodifiableList(this.listBonusItem);
            return result;
        }

    }



}