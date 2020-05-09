package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class DailyBonusResponse
        implements io.protostuff.Message<DailyBonusResponse> {

    private static final DailyBonusResponse DEFAULT_INSTANCE = newBuilder().build();

    private int bonusDayIndex;

    private java.util.List<proto.message.MapDailyBonusItem> listBonusItem;

    private java.util.List<Integer> listClaimedDay;

    private int result;

    private boolean __merge_lock = false;
    private int __bitField0;

    private DailyBonusResponse() {
        this.bonusDayIndex = 0;
        this.listBonusItem = java.util.Collections.emptyList();
        this.listClaimedDay = java.util.Collections.emptyList();
        this.result = 0;
    }

    private DailyBonusResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static DailyBonusResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<DailyBonusResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getBonusDayIndex() {
        return bonusDayIndex;
    }

    public boolean hasBonusDayIndex() {
        return (__bitField0 & 1) == 1;
    }

    public DailyBonusResponse withBonusDayIndex(int value) {
        return DailyBonusResponse.newBuilder()
            .mergeFrom(this)
            .setBonusDayIndex(value)
            .build();
    }

    public java.util.List<proto.message.MapDailyBonusItem> getListBonusItemList() {
        return listBonusItem;
    }

    public int getListBonusItemCount() {
        return listBonusItem.size();
    }

    public proto.message.MapDailyBonusItem getListBonusItem(int index) {
        return listBonusItem.get(index);
    }

    public DailyBonusResponse withListBonusItem(java.util.List<proto.message.MapDailyBonusItem> value) {
        return DailyBonusResponse.newBuilder()
            .mergeFrom(this)
            .clearListBonusItem()
            .addAllListBonusItem(value)
            .build();
    }

    public java.util.List<Integer> getListClaimedDayList() {
        return listClaimedDay;
    }

    public int getListClaimedDayCount() {
        return listClaimedDay.size();
    }

    public int getListClaimedDay(int index) {
        return listClaimedDay.get(index);
    }

    public DailyBonusResponse withListClaimedDay(java.util.List<Integer> value) {
        return DailyBonusResponse.newBuilder()
            .mergeFrom(this)
            .clearListClaimedDay()
            .addAllListClaimedDay(value)
            .build();
    }

    public int getResult() {
        return result;
    }

    public boolean hasResult() {
        return (__bitField0 & 8) == 8;
    }

    public DailyBonusResponse withResult(int value) {
        return DailyBonusResponse.newBuilder()
            .mergeFrom(this)
            .setResult(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<DailyBonusResponse> cachedSchema() {
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
        DailyBonusResponse that = (DailyBonusResponse) obj;
        if (!java.util.Objects.equals(this.bonusDayIndex, that.bonusDayIndex)) {
            return false;
        }
        if (!java.util.Objects.equals(this.listBonusItem, that.listBonusItem)) {
            return false;
        }
        if (!java.util.Objects.equals(this.listClaimedDay, that.listClaimedDay)) {
            return false;
        }
        if (!java.util.Objects.equals(this.result, that.result)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.bonusDayIndex);
        result = 31 * result + (this.listBonusItem == null ? 0 : this.listBonusItem.hashCode());
        result = 31 * result + (this.listClaimedDay == null ? 0 : this.listClaimedDay.hashCode());
        result = 31 * result + Integer.hashCode(this.result);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasBonusDayIndex()) {
            parts.add("bonusDayIndex=" + getBonusDayIndex());
        }
        if (!listBonusItem.isEmpty()) {
            parts.add("listBonusItem=" + getListBonusItemList());
        }
        if (!listClaimedDay.isEmpty()) {
            parts.add("listClaimedDay=" + getListClaimedDayList());
        }
        if (hasResult()) {
            parts.add("result=" + getResult());
        }
        return "DailyBonusResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<DailyBonusResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("bonusDayIndex", 1);
        	__fieldMap.put("listBonusItem", 2);
        	__fieldMap.put("listClaimedDay", 3);
        	__fieldMap.put("result", 4);
        }

        @Override
        public DailyBonusResponse newMessage() {
            return new DailyBonusResponse();
        }

        @Override
        public Class<DailyBonusResponse> typeClass() {
            return DailyBonusResponse.class;
        }

        @Override
        public String messageName() {
            return DailyBonusResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return DailyBonusResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(DailyBonusResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, DailyBonusResponse instance) throws java.io.IOException {
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
                    	instance.bonusDayIndex = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	if(!((instance.__bitField0 & 2) == 2)) {
                    	    instance.listBonusItem = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 2;
                    	}
                    	instance.listBonusItem.add(input.mergeObject(null, proto.message.MapDailyBonusItem.getSchema()));

                    	break;
                    case 3:
                    	if(!((instance.__bitField0 & 4) == 4)) {
                    	    instance.listClaimedDay = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 4;
                    	}
                    	instance.listClaimedDay.add(input.readInt32());

                    	break;
                    case 4:
                    	instance.result = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 2) == 2) {
                instance.listBonusItem = java.util.Collections.unmodifiableList(instance.listBonusItem);
            }

            if((instance.__bitField0 & 4) == 4) {
                instance.listClaimedDay = java.util.Collections.unmodifiableList(instance.listClaimedDay);
            }


        }

        @Override
        public void writeTo(io.protostuff.Output output, DailyBonusResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.bonusDayIndex, false);
            }

            for(proto.message.MapDailyBonusItem listBonusItem : instance.listBonusItem) {
                output.writeObject(2, listBonusItem, proto.message.MapDailyBonusItem.getSchema(), true);
            }

            for(int listClaimedDay : instance.listClaimedDay) {
                output.writeInt32(3, listClaimedDay, true);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.result, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "bonusDayIndex";
        		case 2: return "listBonusItem";
        		case 3: return "listClaimedDay";
        		case 4: return "result";
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

        private int bonusDayIndex;

        private java.util.List<proto.message.MapDailyBonusItem> listBonusItem;

        private java.util.List<Integer> listClaimedDay;

        private int result;

        private int __bitField0;

        private Builder() {
            this.bonusDayIndex = 0;
            this.listBonusItem = java.util.Collections.emptyList();
            this.listClaimedDay = java.util.Collections.emptyList();
            this.result = 0;
        }

        public Builder mergeFrom(DailyBonusResponse instance) {
            if (instance.hasBonusDayIndex()) {
                this.setBonusDayIndex(instance.getBonusDayIndex());
            }

            this.addAllListBonusItem(instance.getListBonusItemList());

            this.addAllListClaimedDay(instance.getListClaimedDayList());

            if (instance.hasResult()) {
                this.setResult(instance.getResult());
            }

            return this;
        }

        public int getBonusDayIndex() {
            return bonusDayIndex;
        }

        public Builder setBonusDayIndex(int value) {
            this.bonusDayIndex = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearBonusDayIndex() {
            this.bonusDayIndex = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasBonusDayIndex() {
            return (__bitField0 & 1) == 1;
        }

        public java.util.List<proto.message.MapDailyBonusItem> getListBonusItemList() {
            return listBonusItem;
        }

        public Builder setListBonusItem(int index, proto.message.MapDailyBonusItem value) {
            if (value == null) {
                throw new NullPointerException("Cannot set DailyBonusResponse#listBonusItem to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.listBonusItem = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.listBonusItem.set(index, value);
            return this;
        }

        public Builder addListBonusItem(proto.message.MapDailyBonusItem value) {
            if (value == null) {
                throw new NullPointerException("Cannot set DailyBonusResponse#listBonusItem to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.listBonusItem = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.listBonusItem.add(value);
            return this;
        }

        public Builder addAllListBonusItem(java.lang.Iterable<proto.message.MapDailyBonusItem> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set DailyBonusResponse#listBonusItem to null");
            }
            if(!((__bitField0 & 2) == 2)) {
                this.listBonusItem = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            for (final proto.message.MapDailyBonusItem value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set DailyBonusResponse#listBonusItem to null");
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

        public proto.message.MapDailyBonusItem getListBonusItem(int index) {
            return listBonusItem.get(index);
        }

        public java.util.List<Integer> getListClaimedDayList() {
            return listClaimedDay;
        }

        public Builder setListClaimedDay(int index, int value) {
            if(!((__bitField0 & 4) == 4)) {
                this.listClaimedDay = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.listClaimedDay.set(index, value);
            return this;
        }

        public Builder addListClaimedDay(int value) {
            if(!((__bitField0 & 4) == 4)) {
                this.listClaimedDay = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.listClaimedDay.add(value);
            return this;
        }

        public Builder addAllListClaimedDay(java.lang.Iterable<Integer> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set DailyBonusResponse#listClaimedDay to null");
            }
            if(!((__bitField0 & 4) == 4)) {
                this.listClaimedDay = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            for (final Integer value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set DailyBonusResponse#listClaimedDay to null");
                }
                this.listClaimedDay.add(value);
            }
            return this;
        }

        public Builder clearListClaimedDay() {
            this.listClaimedDay = java.util.Collections.emptyList();
            __bitField0 &= ~4;
            return this;
        }

        public int getListClaimedDayCount() {
            return listClaimedDay.size();
        }

        public int getListClaimedDay(int index) {
            return listClaimedDay.get(index);
        }

        public int getResult() {
            return result;
        }

        public Builder setResult(int value) {
            this.result = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearResult() {
            this.result = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasResult() {
            return (__bitField0 & 8) == 8;
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
            if (!java.util.Objects.equals(this.bonusDayIndex, that.bonusDayIndex)) {
                return false;
            }
            if (!java.util.Objects.equals(this.listBonusItem, that.listBonusItem)) {
                return false;
            }
            if (!java.util.Objects.equals(this.listClaimedDay, that.listClaimedDay)) {
                return false;
            }
            if (!java.util.Objects.equals(this.result, that.result)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.bonusDayIndex);
            result = 31 * result + (this.listBonusItem == null ? 0 : this.listBonusItem.hashCode());
            result = 31 * result + (this.listClaimedDay == null ? 0 : this.listClaimedDay.hashCode());
            result = 31 * result + Integer.hashCode(this.result);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasBonusDayIndex()) {
                parts.add("bonusDayIndex=" + getBonusDayIndex());
            }
            if (!listBonusItem.isEmpty()) {
                parts.add("listBonusItem=" + getListBonusItemList());
            }
            if (!listClaimedDay.isEmpty()) {
                parts.add("listClaimedDay=" + getListClaimedDayList());
            }
            if (hasResult()) {
                parts.add("result=" + getResult());
            }
            return "DailyBonusResponse{" + String.join(", ", parts) + "}";
        }

        public DailyBonusResponse build() {
            proto.message.DailyBonusResponse result = new proto.message.DailyBonusResponse();
            result.__bitField0 = __bitField0;
            result.bonusDayIndex = this.bonusDayIndex;
            result.listBonusItem = java.util.Collections.unmodifiableList(this.listBonusItem);
            result.listClaimedDay = java.util.Collections.unmodifiableList(this.listClaimedDay);
            result.result = this.result;
            return result;
        }

    }



}