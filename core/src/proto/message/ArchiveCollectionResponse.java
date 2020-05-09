package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class ArchiveCollectionResponse
        implements io.protostuff.Message<ArchiveCollectionResponse> {

    private static final ArchiveCollectionResponse DEFAULT_INSTANCE = newBuilder().build();

    private boolean available;

    private String startDate;

    private String endDate;

    private java.util.List<proto.message.ArchiveMilestone> milestones;

    private boolean __merge_lock = false;
    private int __bitField0;

    private ArchiveCollectionResponse() {
        this.available = false;
        this.startDate = "";
        this.endDate = "";
        this.milestones = java.util.Collections.emptyList();
    }

    private ArchiveCollectionResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ArchiveCollectionResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<ArchiveCollectionResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public boolean getAvailable() {
        return available;
    }

    public boolean hasAvailable() {
        return (__bitField0 & 1) == 1;
    }

    public ArchiveCollectionResponse withAvailable(boolean value) {
        return ArchiveCollectionResponse.newBuilder()
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

    public ArchiveCollectionResponse withStartDate(String value) {
        return ArchiveCollectionResponse.newBuilder()
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

    public ArchiveCollectionResponse withEndDate(String value) {
        return ArchiveCollectionResponse.newBuilder()
            .mergeFrom(this)
            .setEndDate(value)
            .build();
    }

    public java.util.List<proto.message.ArchiveMilestone> getMilestonesList() {
        return milestones;
    }

    public int getMilestonesCount() {
        return milestones.size();
    }

    public proto.message.ArchiveMilestone getMilestones(int index) {
        return milestones.get(index);
    }

    public ArchiveCollectionResponse withMilestones(java.util.List<proto.message.ArchiveMilestone> value) {
        return ArchiveCollectionResponse.newBuilder()
            .mergeFrom(this)
            .clearMilestones()
            .addAllMilestones(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<ArchiveCollectionResponse> cachedSchema() {
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
        ArchiveCollectionResponse that = (ArchiveCollectionResponse) obj;
        if (!java.util.Objects.equals(this.available, that.available)) {
            return false;
        }
        if (!java.util.Objects.equals(this.startDate, that.startDate)) {
            return false;
        }
        if (!java.util.Objects.equals(this.endDate, that.endDate)) {
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
        if (!milestones.isEmpty()) {
            parts.add("milestones=" + getMilestonesList());
        }
        return "ArchiveCollectionResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<ArchiveCollectionResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("available", 1);
        	__fieldMap.put("startDate", 2);
        	__fieldMap.put("endDate", 3);
        	__fieldMap.put("milestones", 4);
        }

        @Override
        public ArchiveCollectionResponse newMessage() {
            return new ArchiveCollectionResponse();
        }

        @Override
        public Class<ArchiveCollectionResponse> typeClass() {
            return ArchiveCollectionResponse.class;
        }

        @Override
        public String messageName() {
            return ArchiveCollectionResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return ArchiveCollectionResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(ArchiveCollectionResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, ArchiveCollectionResponse instance) throws java.io.IOException {
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
                    	if(!((instance.__bitField0 & 8) == 8)) {
                    	    instance.milestones = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 8;
                    	}
                    	instance.milestones.add(input.mergeObject(null, proto.message.ArchiveMilestone.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 8) == 8) {
                instance.milestones = java.util.Collections.unmodifiableList(instance.milestones);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, ArchiveCollectionResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeBool(1, instance.available, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.startDate, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeString(3, instance.endDate, false);
            }

            for(proto.message.ArchiveMilestone milestones : instance.milestones) {
                output.writeObject(4, milestones, proto.message.ArchiveMilestone.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "available";
        		case 2: return "startDate";
        		case 3: return "endDate";
        		case 4: return "milestones";
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

        private java.util.List<proto.message.ArchiveMilestone> milestones;

        private int __bitField0;

        private Builder() {
            this.available = false;
            this.startDate = "";
            this.endDate = "";
            this.milestones = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(ArchiveCollectionResponse instance) {
            if (instance.hasAvailable()) {
                this.setAvailable(instance.getAvailable());
            }

            if (instance.hasStartDate()) {
                this.setStartDate(instance.getStartDate());
            }

            if (instance.hasEndDate()) {
                this.setEndDate(instance.getEndDate());
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
                throw new NullPointerException("Cannot set ArchiveCollectionResponse#startDate to null");
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
                throw new NullPointerException("Cannot set ArchiveCollectionResponse#endDate to null");
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

        public java.util.List<proto.message.ArchiveMilestone> getMilestonesList() {
            return milestones;
        }

        public Builder setMilestones(int index, proto.message.ArchiveMilestone value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ArchiveCollectionResponse#milestones to null");
            }

            if(!((__bitField0 & 8) == 8)) {
                this.milestones = new java.util.ArrayList<>();
                __bitField0 |= 8;
            }
            this.milestones.set(index, value);
            return this;
        }

        public Builder addMilestones(proto.message.ArchiveMilestone value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ArchiveCollectionResponse#milestones to null");
            }

            if(!((__bitField0 & 8) == 8)) {
                this.milestones = new java.util.ArrayList<>();
                __bitField0 |= 8;
            }
            this.milestones.add(value);
            return this;
        }

        public Builder addAllMilestones(java.lang.Iterable<proto.message.ArchiveMilestone> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set ArchiveCollectionResponse#milestones to null");
            }
            if(!((__bitField0 & 8) == 8)) {
                this.milestones = new java.util.ArrayList<>();
                __bitField0 |= 8;
            }
            for (final proto.message.ArchiveMilestone value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set ArchiveCollectionResponse#milestones to null");
                }
                this.milestones.add(value);
            }
            return this;
        }

        public Builder clearMilestones() {
            this.milestones = java.util.Collections.emptyList();
            __bitField0 &= ~8;
            return this;
        }

        public int getMilestonesCount() {
            return milestones.size();
        }

        public proto.message.ArchiveMilestone getMilestones(int index) {
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
            if (!milestones.isEmpty()) {
                parts.add("milestones=" + getMilestonesList());
            }
            return "ArchiveCollectionResponse{" + String.join(", ", parts) + "}";
        }

        public ArchiveCollectionResponse build() {
            proto.message.ArchiveCollectionResponse result = new proto.message.ArchiveCollectionResponse();
            result.__bitField0 = __bitField0;
            result.available = this.available;
            result.startDate = this.startDate;
            result.endDate = this.endDate;
            result.milestones = java.util.Collections.unmodifiableList(this.milestones);
            return result;
        }

    }



}