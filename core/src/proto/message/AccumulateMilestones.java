package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class AccumulateMilestones
        implements io.protostuff.Message<AccumulateMilestones> {

    private static final AccumulateMilestones DEFAULT_INSTANCE = newBuilder().build();

    private int id;

    private int amount;

    private int status;

    private java.util.List<proto.message.AccumulateRewardItem> rewardItems;

    private boolean __merge_lock = false;
    private int __bitField0;

    private AccumulateMilestones() {
        this.id = 0;
        this.amount = 0;
        this.status = proto.message.MileStoneStatus.LOCK.getNumber();
        this.rewardItems = java.util.Collections.emptyList();
    }

    private AccumulateMilestones(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static AccumulateMilestones getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<AccumulateMilestones> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 1) == 1;
    }

    public AccumulateMilestones withId(int value) {
        return AccumulateMilestones.newBuilder()
            .mergeFrom(this)
            .setId(value)
            .build();
    }

    public int getAmount() {
        return amount;
    }

    public boolean hasAmount() {
        return (__bitField0 & 2) == 2;
    }

    public AccumulateMilestones withAmount(int value) {
        return AccumulateMilestones.newBuilder()
            .mergeFrom(this)
            .setAmount(value)
            .build();
    }

    public proto.message.MileStoneStatus getStatus() {
        return proto.message.MileStoneStatus.valueOf(status);
    }

    public int getStatusValue() {
        return status;
    }

    public boolean hasStatus() {
        return (__bitField0 & 4) == 4;
    }

    public AccumulateMilestones withStatus(proto.message.MileStoneStatus value) {
        return AccumulateMilestones.newBuilder()
            .mergeFrom(this)
            .setStatus(value)
            .build();
    }

    public java.util.List<proto.message.AccumulateRewardItem> getRewardItemsList() {
        return rewardItems;
    }

    public int getRewardItemsCount() {
        return rewardItems.size();
    }

    public proto.message.AccumulateRewardItem getRewardItems(int index) {
        return rewardItems.get(index);
    }

    public AccumulateMilestones withRewardItems(java.util.List<proto.message.AccumulateRewardItem> value) {
        return AccumulateMilestones.newBuilder()
            .mergeFrom(this)
            .clearRewardItems()
            .addAllRewardItems(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<AccumulateMilestones> cachedSchema() {
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
        AccumulateMilestones that = (AccumulateMilestones) obj;
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.amount, that.amount)) {
            return false;
        }
        if (!java.util.Objects.equals(this.status, that.status)) {
            return false;
        }
        if (!java.util.Objects.equals(this.rewardItems, that.rewardItems)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.id);
        result = 31 * result + Integer.hashCode(this.amount);
        result = 31 * result + Integer.hashCode(this.status);
        result = 31 * result + (this.rewardItems == null ? 0 : this.rewardItems.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasId()) {
            parts.add("id=" + getId());
        }
        if (hasAmount()) {
            parts.add("amount=" + getAmount());
        }
        if (hasStatus()) {
            parts.add("status=" + getStatus() + '(' + getStatusValue() + ')');
        }
        if (!rewardItems.isEmpty()) {
            parts.add("rewardItems=" + getRewardItemsList());
        }
        return "AccumulateMilestones{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<AccumulateMilestones>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("id", 1);
        	__fieldMap.put("amount", 2);
        	__fieldMap.put("status", 3);
        	__fieldMap.put("rewardItems", 4);
        }

        @Override
        public AccumulateMilestones newMessage() {
            return new AccumulateMilestones();
        }

        @Override
        public Class<AccumulateMilestones> typeClass() {
            return AccumulateMilestones.class;
        }

        @Override
        public String messageName() {
            return AccumulateMilestones.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return AccumulateMilestones.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(AccumulateMilestones message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, AccumulateMilestones instance) throws java.io.IOException {
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
                    	instance.amount = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.status = input.readEnum();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	if(!((instance.__bitField0 & 8) == 8)) {
                    	    instance.rewardItems = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 8;
                    	}
                    	instance.rewardItems.add(input.mergeObject(null, proto.message.AccumulateRewardItem.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 8) == 8) {
                instance.rewardItems = java.util.Collections.unmodifiableList(instance.rewardItems);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, AccumulateMilestones instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.id, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.amount, false);
            }

            if((instance.__bitField0 & 4) == 4) {
            	output.writeEnum(3, instance.status, false);
            }

            for(proto.message.AccumulateRewardItem rewardItems : instance.rewardItems) {
                output.writeObject(4, rewardItems, proto.message.AccumulateRewardItem.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "id";
        		case 2: return "amount";
        		case 3: return "status";
        		case 4: return "rewardItems";
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

        private int amount;

        private int status;

        private java.util.List<proto.message.AccumulateRewardItem> rewardItems;

        private int __bitField0;

        private Builder() {
            this.id = 0;
            this.amount = 0;
            this.status = proto.message.MileStoneStatus.LOCK.getNumber();
            this.rewardItems = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(AccumulateMilestones instance) {
            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            if (instance.hasAmount()) {
                this.setAmount(instance.getAmount());
            }

            if (instance.hasStatus()) {
                this.setStatus(instance.getStatus());
            }

            this.addAllRewardItems(instance.getRewardItemsList());

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

        public int getAmount() {
            return amount;
        }

        public Builder setAmount(int value) {
            this.amount = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearAmount() {
            this.amount = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasAmount() {
            return (__bitField0 & 2) == 2;
        }

        public proto.message.MileStoneStatus getStatus() {
            return proto.message.MileStoneStatus.valueOf(status);
        }

        public int getStatusValue() {
            return status;
        }

        public Builder setStatus(proto.message.MileStoneStatus value) {
            if (value == null) {
                throw new NullPointerException("Cannot set AccumulateMilestones#status to null");
            }

            if (value == proto.message.MileStoneStatus.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set AccumulateMilestones#status to UNRECOGNIZED");
            }

            this.status = value.getNumber();
            __bitField0 |= 4;
            return this;
        }

        public Builder setStatusValue(int value) {
            this.status = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearStatus() {
            this.status = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasStatus() {
            return (__bitField0 & 4) == 4;
        }

        public java.util.List<proto.message.AccumulateRewardItem> getRewardItemsList() {
            return rewardItems;
        }

        public Builder setRewardItems(int index, proto.message.AccumulateRewardItem value) {
            if (value == null) {
                throw new NullPointerException("Cannot set AccumulateMilestones#rewardItems to null");
            }

            if(!((__bitField0 & 8) == 8)) {
                this.rewardItems = new java.util.ArrayList<>();
                __bitField0 |= 8;
            }
            this.rewardItems.set(index, value);
            return this;
        }

        public Builder addRewardItems(proto.message.AccumulateRewardItem value) {
            if (value == null) {
                throw new NullPointerException("Cannot set AccumulateMilestones#rewardItems to null");
            }

            if(!((__bitField0 & 8) == 8)) {
                this.rewardItems = new java.util.ArrayList<>();
                __bitField0 |= 8;
            }
            this.rewardItems.add(value);
            return this;
        }

        public Builder addAllRewardItems(java.lang.Iterable<proto.message.AccumulateRewardItem> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set AccumulateMilestones#rewardItems to null");
            }
            if(!((__bitField0 & 8) == 8)) {
                this.rewardItems = new java.util.ArrayList<>();
                __bitField0 |= 8;
            }
            for (final proto.message.AccumulateRewardItem value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set AccumulateMilestones#rewardItems to null");
                }
                this.rewardItems.add(value);
            }
            return this;
        }

        public Builder clearRewardItems() {
            this.rewardItems = java.util.Collections.emptyList();
            __bitField0 &= ~8;
            return this;
        }

        public int getRewardItemsCount() {
            return rewardItems.size();
        }

        public proto.message.AccumulateRewardItem getRewardItems(int index) {
            return rewardItems.get(index);
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
            if (!java.util.Objects.equals(this.amount, that.amount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.status, that.status)) {
                return false;
            }
            if (!java.util.Objects.equals(this.rewardItems, that.rewardItems)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.id);
            result = 31 * result + Integer.hashCode(this.amount);
            result = 31 * result + Integer.hashCode(this.status);
            result = 31 * result + (this.rewardItems == null ? 0 : this.rewardItems.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasId()) {
                parts.add("id=" + getId());
            }
            if (hasAmount()) {
                parts.add("amount=" + getAmount());
            }
            if (hasStatus()) {
                parts.add("status=" + getStatus() + '(' + getStatusValue() + ')');
            }
            if (!rewardItems.isEmpty()) {
                parts.add("rewardItems=" + getRewardItemsList());
            }
            return "AccumulateMilestones{" + String.join(", ", parts) + "}";
        }

        public AccumulateMilestones build() {
            proto.message.AccumulateMilestones result = new proto.message.AccumulateMilestones();
            result.__bitField0 = __bitField0;
            result.id = this.id;
            result.amount = this.amount;
            result.status = this.status;
            result.rewardItems = java.util.Collections.unmodifiableList(this.rewardItems);
            return result;
        }

    }



}