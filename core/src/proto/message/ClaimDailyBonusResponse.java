package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class ClaimDailyBonusResponse
        implements io.protostuff.Message<ClaimDailyBonusResponse> {

    private static final ClaimDailyBonusResponse DEFAULT_INSTANCE = newBuilder().build();

    private int result;

    private int gold;

    private java.util.List<proto.message.DailyBonusItem> listBonusItem;

    private boolean __merge_lock = false;
    private int __bitField0;

    private ClaimDailyBonusResponse() {
        this.result = 0;
        this.gold = 0;
        this.listBonusItem = java.util.Collections.emptyList();
    }

    private ClaimDailyBonusResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ClaimDailyBonusResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<ClaimDailyBonusResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getResult() {
        return result;
    }

    public boolean hasResult() {
        return (__bitField0 & 1) == 1;
    }

    public ClaimDailyBonusResponse withResult(int value) {
        return ClaimDailyBonusResponse.newBuilder()
            .mergeFrom(this)
            .setResult(value)
            .build();
    }

    public int getGold() {
        return gold;
    }

    public boolean hasGold() {
        return (__bitField0 & 2) == 2;
    }

    public ClaimDailyBonusResponse withGold(int value) {
        return ClaimDailyBonusResponse.newBuilder()
            .mergeFrom(this)
            .setGold(value)
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

    public ClaimDailyBonusResponse withListBonusItem(java.util.List<proto.message.DailyBonusItem> value) {
        return ClaimDailyBonusResponse.newBuilder()
            .mergeFrom(this)
            .clearListBonusItem()
            .addAllListBonusItem(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<ClaimDailyBonusResponse> cachedSchema() {
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
        ClaimDailyBonusResponse that = (ClaimDailyBonusResponse) obj;
        if (!java.util.Objects.equals(this.result, that.result)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gold, that.gold)) {
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
        result = 31 * result + Integer.hashCode(this.result);
        result = 31 * result + Integer.hashCode(this.gold);
        result = 31 * result + (this.listBonusItem == null ? 0 : this.listBonusItem.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasResult()) {
            parts.add("result=" + getResult());
        }
        if (hasGold()) {
            parts.add("gold=" + getGold());
        }
        if (!listBonusItem.isEmpty()) {
            parts.add("listBonusItem=" + getListBonusItemList());
        }
        return "ClaimDailyBonusResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<ClaimDailyBonusResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("result", 1);
        	__fieldMap.put("gold", 2);
        	__fieldMap.put("listBonusItem", 3);
        }

        @Override
        public ClaimDailyBonusResponse newMessage() {
            return new ClaimDailyBonusResponse();
        }

        @Override
        public Class<ClaimDailyBonusResponse> typeClass() {
            return ClaimDailyBonusResponse.class;
        }

        @Override
        public String messageName() {
            return ClaimDailyBonusResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return ClaimDailyBonusResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(ClaimDailyBonusResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, ClaimDailyBonusResponse instance) throws java.io.IOException {
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
                    	instance.result = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.gold = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	if(!((instance.__bitField0 & 4) == 4)) {
                    	    instance.listBonusItem = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 4;
                    	}
                    	instance.listBonusItem.add(input.mergeObject(null, proto.message.DailyBonusItem.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 4) == 4) {
                instance.listBonusItem = java.util.Collections.unmodifiableList(instance.listBonusItem);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, ClaimDailyBonusResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.result, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.gold, false);
            }

            for(proto.message.DailyBonusItem listBonusItem : instance.listBonusItem) {
                output.writeObject(3, listBonusItem, proto.message.DailyBonusItem.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "result";
        		case 2: return "gold";
        		case 3: return "listBonusItem";
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

        private int result;

        private int gold;

        private java.util.List<proto.message.DailyBonusItem> listBonusItem;

        private int __bitField0;

        private Builder() {
            this.result = 0;
            this.gold = 0;
            this.listBonusItem = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(ClaimDailyBonusResponse instance) {
            if (instance.hasResult()) {
                this.setResult(instance.getResult());
            }

            if (instance.hasGold()) {
                this.setGold(instance.getGold());
            }

            this.addAllListBonusItem(instance.getListBonusItemList());

            return this;
        }

        public int getResult() {
            return result;
        }

        public Builder setResult(int value) {
            this.result = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearResult() {
            this.result = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasResult() {
            return (__bitField0 & 1) == 1;
        }

        public int getGold() {
            return gold;
        }

        public Builder setGold(int value) {
            this.gold = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearGold() {
            this.gold = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasGold() {
            return (__bitField0 & 2) == 2;
        }

        public java.util.List<proto.message.DailyBonusItem> getListBonusItemList() {
            return listBonusItem;
        }

        public Builder setListBonusItem(int index, proto.message.DailyBonusItem value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ClaimDailyBonusResponse#listBonusItem to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.listBonusItem = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.listBonusItem.set(index, value);
            return this;
        }

        public Builder addListBonusItem(proto.message.DailyBonusItem value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ClaimDailyBonusResponse#listBonusItem to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.listBonusItem = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.listBonusItem.add(value);
            return this;
        }

        public Builder addAllListBonusItem(java.lang.Iterable<proto.message.DailyBonusItem> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set ClaimDailyBonusResponse#listBonusItem to null");
            }
            if(!((__bitField0 & 4) == 4)) {
                this.listBonusItem = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            for (final proto.message.DailyBonusItem value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set ClaimDailyBonusResponse#listBonusItem to null");
                }
                this.listBonusItem.add(value);
            }
            return this;
        }

        public Builder clearListBonusItem() {
            this.listBonusItem = java.util.Collections.emptyList();
            __bitField0 &= ~4;
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
            if (!java.util.Objects.equals(this.result, that.result)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gold, that.gold)) {
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
            result = 31 * result + Integer.hashCode(this.result);
            result = 31 * result + Integer.hashCode(this.gold);
            result = 31 * result + (this.listBonusItem == null ? 0 : this.listBonusItem.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasResult()) {
                parts.add("result=" + getResult());
            }
            if (hasGold()) {
                parts.add("gold=" + getGold());
            }
            if (!listBonusItem.isEmpty()) {
                parts.add("listBonusItem=" + getListBonusItemList());
            }
            return "ClaimDailyBonusResponse{" + String.join(", ", parts) + "}";
        }

        public ClaimDailyBonusResponse build() {
            proto.message.ClaimDailyBonusResponse result = new proto.message.ClaimDailyBonusResponse();
            result.__bitField0 = __bitField0;
            result.result = this.result;
            result.gold = this.gold;
            result.listBonusItem = java.util.Collections.unmodifiableList(this.listBonusItem);
            return result;
        }

    }



}