package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_happy_play.proto")
public final class HPBoosterPackInfoResponse
        implements io.protostuff.Message<HPBoosterPackInfoResponse> {

    private static final HPBoosterPackInfoResponse DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<proto.message.HPBoosterPackItem> listItem;

    private boolean __merge_lock = false;
    private int __bitField0;

    private HPBoosterPackInfoResponse() {
        this.listItem = java.util.Collections.emptyList();
    }

    private HPBoosterPackInfoResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static HPBoosterPackInfoResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<HPBoosterPackInfoResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<proto.message.HPBoosterPackItem> getListItemList() {
        return listItem;
    }

    public int getListItemCount() {
        return listItem.size();
    }

    public proto.message.HPBoosterPackItem getListItem(int index) {
        return listItem.get(index);
    }

    public HPBoosterPackInfoResponse withListItem(java.util.List<proto.message.HPBoosterPackItem> value) {
        return HPBoosterPackInfoResponse.newBuilder()
            .mergeFrom(this)
            .clearListItem()
            .addAllListItem(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<HPBoosterPackInfoResponse> cachedSchema() {
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
        HPBoosterPackInfoResponse that = (HPBoosterPackInfoResponse) obj;
        if (!java.util.Objects.equals(this.listItem, that.listItem)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.listItem == null ? 0 : this.listItem.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!listItem.isEmpty()) {
            parts.add("listItem=" + getListItemList());
        }
        return "HPBoosterPackInfoResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<HPBoosterPackInfoResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("listItem", 3);
        }

        @Override
        public HPBoosterPackInfoResponse newMessage() {
            return new HPBoosterPackInfoResponse();
        }

        @Override
        public Class<HPBoosterPackInfoResponse> typeClass() {
            return HPBoosterPackInfoResponse.class;
        }

        @Override
        public String messageName() {
            return HPBoosterPackInfoResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return HPBoosterPackInfoResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(HPBoosterPackInfoResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, HPBoosterPackInfoResponse instance) throws java.io.IOException {
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
                    case 3:
                    	if(!((instance.__bitField0 & 1) == 1)) {
                    	    instance.listItem = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.listItem.add(input.mergeObject(null, proto.message.HPBoosterPackItem.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.listItem = java.util.Collections.unmodifiableList(instance.listItem);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, HPBoosterPackInfoResponse instance) throws java.io.IOException {
            for(proto.message.HPBoosterPackItem listItem : instance.listItem) {
                output.writeObject(3, listItem, proto.message.HPBoosterPackItem.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 3: return "listItem";
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

        private java.util.List<proto.message.HPBoosterPackItem> listItem;

        private int __bitField0;

        private Builder() {
            this.listItem = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(HPBoosterPackInfoResponse instance) {
            this.addAllListItem(instance.getListItemList());

            return this;
        }

        public java.util.List<proto.message.HPBoosterPackItem> getListItemList() {
            return listItem;
        }

        public Builder setListItem(int index, proto.message.HPBoosterPackItem value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HPBoosterPackInfoResponse#listItem to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.listItem = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.listItem.set(index, value);
            return this;
        }

        public Builder addListItem(proto.message.HPBoosterPackItem value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HPBoosterPackInfoResponse#listItem to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.listItem = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.listItem.add(value);
            return this;
        }

        public Builder addAllListItem(java.lang.Iterable<proto.message.HPBoosterPackItem> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set HPBoosterPackInfoResponse#listItem to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.listItem = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final proto.message.HPBoosterPackItem value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set HPBoosterPackInfoResponse#listItem to null");
                }
                this.listItem.add(value);
            }
            return this;
        }

        public Builder clearListItem() {
            this.listItem = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getListItemCount() {
            return listItem.size();
        }

        public proto.message.HPBoosterPackItem getListItem(int index) {
            return listItem.get(index);
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
            if (!java.util.Objects.equals(this.listItem, that.listItem)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.listItem == null ? 0 : this.listItem.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!listItem.isEmpty()) {
                parts.add("listItem=" + getListItemList());
            }
            return "HPBoosterPackInfoResponse{" + String.join(", ", parts) + "}";
        }

        public HPBoosterPackInfoResponse build() {
            proto.message.HPBoosterPackInfoResponse result = new proto.message.HPBoosterPackInfoResponse();
            result.__bitField0 = __bitField0;
            result.listItem = java.util.Collections.unmodifiableList(this.listItem);
            return result;
        }

    }



}