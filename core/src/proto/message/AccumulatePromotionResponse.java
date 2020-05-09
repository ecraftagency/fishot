package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class AccumulatePromotionResponse
        implements io.protostuff.Message<AccumulatePromotionResponse> {

    private static final AccumulatePromotionResponse DEFAULT_INSTANCE = newBuilder().build();

    private boolean available;

    private String startDate;

    private String endDate;

    private int accAmount;

    private java.util.List<proto.message.AccumulateMilestones> milestones;

    private boolean __merge_lock = false;
    private int __bitField0;

    private AccumulatePromotionResponse() {
        this.available = false;
        this.startDate = "";
        this.endDate = "";
        this.accAmount = 0;
        this.milestones = java.util.Collections.emptyList();
    }

    private AccumulatePromotionResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static AccumulatePromotionResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<AccumulatePromotionResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public boolean getAvailable() {
        return available;
    }

    public boolean hasAvailable() {
        return (__bitField0 & 1) == 1;
    }

    public AccumulatePromotionResponse withAvailable(boolean value) {
        return AccumulatePromotionResponse.newBuilder()
            .mergeFrom(this)
            .setAvailable(value)
            .build();
    }

    public String getStartDate() {
        return startDate;
    }

    public boolean hasStartDate() {
        return (__bitField0 & 2) == 2;
    }

    public AccumulatePromotionResponse withStartDate(String value) {
        return AccumulatePromotionResponse.newBuilder()
            .mergeFrom(this)
            .setStartDate(value)
            .build();
    }

    public String getEndDate() {
        return endDate;
    }

    public boolean hasEndDate() {
        return (__bitField0 & 4) == 4;
    }

    public AccumulatePromotionResponse withEndDate(String value) {
        return AccumulatePromotionResponse.newBuilder()
            .mergeFrom(this)
            .setEndDate(value)
            .build();
    }

    public int getAccAmount() {
        return accAmount;
    }

    public boolean hasAccAmount() {
        return (__bitField0 & 8) == 8;
    }

    public AccumulatePromotionResponse withAccAmount(int value) {
        return AccumulatePromotionResponse.newBuilder()
            .mergeFrom(this)
            .setAccAmount(value)
            .build();
    }

    public java.util.List<proto.message.AccumulateMilestones> getMilestonesList() {
        return milestones;
    }

    public int getMilestonesCount() {
        return milestones.size();
    }

    public proto.message.AccumulateMilestones getMilestones(int index) {
        return milestones.get(index);
    }

    public AccumulatePromotionResponse withMilestones(java.util.List<proto.message.AccumulateMilestones> value) {
        return AccumulatePromotionResponse.newBuilder()
            .mergeFrom(this)
            .clearMilestones()
            .addAllMilestones(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<AccumulatePromotionResponse> cachedSchema() {
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
        AccumulatePromotionResponse that = (AccumulatePromotionResponse) obj;
        if (!java.util.Objects.equals(this.available, that.available)) {
            return false;
        }
        if (!java.util.Objects.equals(this.startDate, that.startDate)) {
            return false;
        }
        if (!java.util.Objects.equals(this.endDate, that.endDate)) {
            return false;
        }
        if (!java.util.Objects.equals(this.accAmount, that.accAmount)) {
            return false;
        }
        if (!java.util.Objects.equals(this.milestones, that.milestones)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Boolean.hashCode(this.available);
        result = 31 * result + (this.startDate == null ? 0 : this.startDate.hashCode());
        result = 31 * result + (this.endDate == null ? 0 : this.endDate.hashCode());
        result = 31 * result + Integer.hashCode(this.accAmount);
        result = 31 * result + (this.milestones == null ? 0 : this.milestones.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasAvailable()) {
            parts.add("available=" + getAvailable());
        }
        if (hasStartDate()) {
            parts.add("startDate=" + getStartDate());
        }
        if (hasEndDate()) {
            parts.add("endDate=" + getEndDate());
        }
        if (hasAccAmount()) {
            parts.add("accAmount=" + getAccAmount());
        }
        if (!milestones.isEmpty()) {
            parts.add("milestones=" + getMilestonesList());
        }
        return "AccumulatePromotionResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<AccumulatePromotionResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("available", 1);
        	__fieldMap.put("startDate", 2);
        	__fieldMap.put("endDate", 3);
        	__fieldMap.put("accAmount", 4);
        	__fieldMap.put("milestones", 5);
        }

        @Override
        public AccumulatePromotionResponse newMessage() {
            return new AccumulatePromotionResponse();
        }

        @Override
        public Class<AccumulatePromotionResponse> typeClass() {
            return AccumulatePromotionResponse.class;
        }

        @Override
        public String messageName() {
            return AccumulatePromotionResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return AccumulatePromotionResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(AccumulatePromotionResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, AccumulatePromotionResponse instance) throws java.io.IOException {
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
                    	instance.available = input.readBool();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.startDate = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.endDate = input.readString();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.accAmount = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	if(!((instance.__bitField0 & 16) == 16)) {
                    	    instance.milestones = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 16;
                    	}
                    	instance.milestones.add(input.mergeObject(null, proto.message.AccumulateMilestones.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 16) == 16) {
                instance.milestones = java.util.Collections.unmodifiableList(instance.milestones);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, AccumulatePromotionResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeBool(1, instance.available, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.startDate, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeString(3, instance.endDate, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.accAmount, false);
            }

            for(proto.message.AccumulateMilestones milestones : instance.milestones) {
                output.writeObject(5, milestones, proto.message.AccumulateMilestones.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "available";
        		case 2: return "startDate";
        		case 3: return "endDate";
        		case 4: return "accAmount";
        		case 5: return "milestones";
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

        private boolean available;

        private String startDate;

        private String endDate;

        private int accAmount;

        private java.util.List<proto.message.AccumulateMilestones> milestones;

        private int __bitField0;

        private Builder() {
            this.available = false;
            this.startDate = "";
            this.endDate = "";
            this.accAmount = 0;
            this.milestones = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(AccumulatePromotionResponse instance) {
            if (instance.hasAvailable()) {
                this.setAvailable(instance.getAvailable());
            }

            if (instance.hasStartDate()) {
                this.setStartDate(instance.getStartDate());
            }

            if (instance.hasEndDate()) {
                this.setEndDate(instance.getEndDate());
            }

            if (instance.hasAccAmount()) {
                this.setAccAmount(instance.getAccAmount());
            }

            this.addAllMilestones(instance.getMilestonesList());

            return this;
        }

        public boolean getAvailable() {
            return available;
        }

        public Builder setAvailable(boolean value) {
            this.available = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearAvailable() {
            this.available = false;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasAvailable() {
            return (__bitField0 & 1) == 1;
        }

        public String getStartDate() {
            return startDate;
        }

        public Builder setStartDate(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set AccumulatePromotionResponse#startDate to null");
            }

            this.startDate = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearStartDate() {
            this.startDate = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasStartDate() {
            return (__bitField0 & 2) == 2;
        }

        public String getEndDate() {
            return endDate;
        }

        public Builder setEndDate(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set AccumulatePromotionResponse#endDate to null");
            }

            this.endDate = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearEndDate() {
            this.endDate = "";
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasEndDate() {
            return (__bitField0 & 4) == 4;
        }

        public int getAccAmount() {
            return accAmount;
        }

        public Builder setAccAmount(int value) {
            this.accAmount = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearAccAmount() {
            this.accAmount = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasAccAmount() {
            return (__bitField0 & 8) == 8;
        }

        public java.util.List<proto.message.AccumulateMilestones> getMilestonesList() {
            return milestones;
        }

        public Builder setMilestones(int index, proto.message.AccumulateMilestones value) {
            if (value == null) {
                throw new NullPointerException("Cannot set AccumulatePromotionResponse#milestones to null");
            }

            if(!((__bitField0 & 16) == 16)) {
                this.milestones = new java.util.ArrayList<>();
                __bitField0 |= 16;
            }
            this.milestones.set(index, value);
            return this;
        }

        public Builder addMilestones(proto.message.AccumulateMilestones value) {
            if (value == null) {
                throw new NullPointerException("Cannot set AccumulatePromotionResponse#milestones to null");
            }

            if(!((__bitField0 & 16) == 16)) {
                this.milestones = new java.util.ArrayList<>();
                __bitField0 |= 16;
            }
            this.milestones.add(value);
            return this;
        }

        public Builder addAllMilestones(java.lang.Iterable<proto.message.AccumulateMilestones> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set AccumulatePromotionResponse#milestones to null");
            }
            if(!((__bitField0 & 16) == 16)) {
                this.milestones = new java.util.ArrayList<>();
                __bitField0 |= 16;
            }
            for (final proto.message.AccumulateMilestones value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set AccumulatePromotionResponse#milestones to null");
                }
                this.milestones.add(value);
            }
            return this;
        }

        public Builder clearMilestones() {
            this.milestones = java.util.Collections.emptyList();
            __bitField0 &= ~16;
            return this;
        }

        public int getMilestonesCount() {
            return milestones.size();
        }

        public proto.message.AccumulateMilestones getMilestones(int index) {
            return milestones.get(index);
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
            if (!java.util.Objects.equals(this.available, that.available)) {
                return false;
            }
            if (!java.util.Objects.equals(this.startDate, that.startDate)) {
                return false;
            }
            if (!java.util.Objects.equals(this.endDate, that.endDate)) {
                return false;
            }
            if (!java.util.Objects.equals(this.accAmount, that.accAmount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.milestones, that.milestones)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Boolean.hashCode(this.available);
            result = 31 * result + (this.startDate == null ? 0 : this.startDate.hashCode());
            result = 31 * result + (this.endDate == null ? 0 : this.endDate.hashCode());
            result = 31 * result + Integer.hashCode(this.accAmount);
            result = 31 * result + (this.milestones == null ? 0 : this.milestones.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasAvailable()) {
                parts.add("available=" + getAvailable());
            }
            if (hasStartDate()) {
                parts.add("startDate=" + getStartDate());
            }
            if (hasEndDate()) {
                parts.add("endDate=" + getEndDate());
            }
            if (hasAccAmount()) {
                parts.add("accAmount=" + getAccAmount());
            }
            if (!milestones.isEmpty()) {
                parts.add("milestones=" + getMilestonesList());
            }
            return "AccumulatePromotionResponse{" + String.join(", ", parts) + "}";
        }

        public AccumulatePromotionResponse build() {
            proto.message.AccumulatePromotionResponse result = new proto.message.AccumulatePromotionResponse();
            result.__bitField0 = __bitField0;
            result.available = this.available;
            result.startDate = this.startDate;
            result.endDate = this.endDate;
            result.accAmount = this.accAmount;
            result.milestones = java.util.Collections.unmodifiableList(this.milestones);
            return result;
        }

    }



}