package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class DailyQuestInfoResponse
        implements io.protostuff.Message<DailyQuestInfoResponse> {

    private static final DailyQuestInfoResponse DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<proto.message.DailyQuestObject> questObject;

    private boolean isNew;

    private java.util.List<Integer> resetDayHour;

    private boolean __merge_lock = false;
    private int __bitField0;

    private DailyQuestInfoResponse() {
        this.questObject = java.util.Collections.emptyList();
        this.isNew = false;
        this.resetDayHour = java.util.Collections.emptyList();
    }

    private DailyQuestInfoResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static DailyQuestInfoResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<DailyQuestInfoResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<proto.message.DailyQuestObject> getQuestObjectList() {
        return questObject;
    }

    public int getQuestObjectCount() {
        return questObject.size();
    }

    public proto.message.DailyQuestObject getQuestObject(int index) {
        return questObject.get(index);
    }

    public DailyQuestInfoResponse withQuestObject(java.util.List<proto.message.DailyQuestObject> value) {
        return DailyQuestInfoResponse.newBuilder()
            .mergeFrom(this)
            .clearQuestObject()
            .addAllQuestObject(value)
            .build();
    }

    public boolean getIsNew() {
        return isNew;
    }

    public boolean hasIsNew() {
        return (__bitField0 & 2) == 2;
    }

    public DailyQuestInfoResponse withIsNew(boolean value) {
        return DailyQuestInfoResponse.newBuilder()
            .mergeFrom(this)
            .setIsNew(value)
            .build();
    }

    public java.util.List<Integer> getResetDayHourList() {
        return resetDayHour;
    }

    public int getResetDayHourCount() {
        return resetDayHour.size();
    }

    public int getResetDayHour(int index) {
        return resetDayHour.get(index);
    }

    public DailyQuestInfoResponse withResetDayHour(java.util.List<Integer> value) {
        return DailyQuestInfoResponse.newBuilder()
            .mergeFrom(this)
            .clearResetDayHour()
            .addAllResetDayHour(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<DailyQuestInfoResponse> cachedSchema() {
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
        DailyQuestInfoResponse that = (DailyQuestInfoResponse) obj;
        if (!java.util.Objects.equals(this.questObject, that.questObject)) {
            return false;
        }
        if (!java.util.Objects.equals(this.isNew, that.isNew)) {
            return false;
        }
        if (!java.util.Objects.equals(this.resetDayHour, that.resetDayHour)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.questObject == null ? 0 : this.questObject.hashCode());
        result = 31 * result + Boolean.hashCode(this.isNew);
        result = 31 * result + (this.resetDayHour == null ? 0 : this.resetDayHour.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!questObject.isEmpty()) {
            parts.add("questObject=" + getQuestObjectList());
        }
        if (hasIsNew()) {
            parts.add("isNew=" + getIsNew());
        }
        if (!resetDayHour.isEmpty()) {
            parts.add("resetDayHour=" + getResetDayHourList());
        }
        return "DailyQuestInfoResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<DailyQuestInfoResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("questObject", 1);
        	__fieldMap.put("isNew", 2);
        	__fieldMap.put("resetDayHour", 3);
        }

        @Override
        public DailyQuestInfoResponse newMessage() {
            return new DailyQuestInfoResponse();
        }

        @Override
        public Class<DailyQuestInfoResponse> typeClass() {
            return DailyQuestInfoResponse.class;
        }

        @Override
        public String messageName() {
            return DailyQuestInfoResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return DailyQuestInfoResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(DailyQuestInfoResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, DailyQuestInfoResponse instance) throws java.io.IOException {
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
                    	    instance.questObject = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.questObject.add(input.mergeObject(null, proto.message.DailyQuestObject.getSchema()));

                    	break;
                    case 2:
                    	instance.isNew = input.readBool();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	if(!((instance.__bitField0 & 4) == 4)) {
                    	    instance.resetDayHour = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 4;
                    	}
                    	instance.resetDayHour.add(input.readInt32());

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.questObject = java.util.Collections.unmodifiableList(instance.questObject);
            }


            if((instance.__bitField0 & 4) == 4) {
                instance.resetDayHour = java.util.Collections.unmodifiableList(instance.resetDayHour);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, DailyQuestInfoResponse instance) throws java.io.IOException {
            for(proto.message.DailyQuestObject questObject : instance.questObject) {
                output.writeObject(1, questObject, proto.message.DailyQuestObject.getSchema(), true);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeBool(2, instance.isNew, false);
            }

            for(int resetDayHour : instance.resetDayHour) {
                output.writeInt32(3, resetDayHour, true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "questObject";
        		case 2: return "isNew";
        		case 3: return "resetDayHour";
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

        private java.util.List<proto.message.DailyQuestObject> questObject;

        private boolean isNew;

        private java.util.List<Integer> resetDayHour;

        private int __bitField0;

        private Builder() {
            this.questObject = java.util.Collections.emptyList();
            this.isNew = false;
            this.resetDayHour = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(DailyQuestInfoResponse instance) {
            this.addAllQuestObject(instance.getQuestObjectList());

            if (instance.hasIsNew()) {
                this.setIsNew(instance.getIsNew());
            }

            this.addAllResetDayHour(instance.getResetDayHourList());

            return this;
        }

        public java.util.List<proto.message.DailyQuestObject> getQuestObjectList() {
            return questObject;
        }

        public Builder setQuestObject(int index, proto.message.DailyQuestObject value) {
            if (value == null) {
                throw new NullPointerException("Cannot set DailyQuestInfoResponse#questObject to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.questObject = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.questObject.set(index, value);
            return this;
        }

        public Builder addQuestObject(proto.message.DailyQuestObject value) {
            if (value == null) {
                throw new NullPointerException("Cannot set DailyQuestInfoResponse#questObject to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.questObject = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.questObject.add(value);
            return this;
        }

        public Builder addAllQuestObject(java.lang.Iterable<proto.message.DailyQuestObject> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set DailyQuestInfoResponse#questObject to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.questObject = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final proto.message.DailyQuestObject value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set DailyQuestInfoResponse#questObject to null");
                }
                this.questObject.add(value);
            }
            return this;
        }

        public Builder clearQuestObject() {
            this.questObject = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getQuestObjectCount() {
            return questObject.size();
        }

        public proto.message.DailyQuestObject getQuestObject(int index) {
            return questObject.get(index);
        }

        public boolean getIsNew() {
            return isNew;
        }

        public Builder setIsNew(boolean value) {
            this.isNew = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearIsNew() {
            this.isNew = false;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasIsNew() {
            return (__bitField0 & 2) == 2;
        }

        public java.util.List<Integer> getResetDayHourList() {
            return resetDayHour;
        }

        public Builder setResetDayHour(int index, int value) {
            if(!((__bitField0 & 4) == 4)) {
                this.resetDayHour = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.resetDayHour.set(index, value);
            return this;
        }

        public Builder addResetDayHour(int value) {
            if(!((__bitField0 & 4) == 4)) {
                this.resetDayHour = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.resetDayHour.add(value);
            return this;
        }

        public Builder addAllResetDayHour(java.lang.Iterable<Integer> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set DailyQuestInfoResponse#resetDayHour to null");
            }
            if(!((__bitField0 & 4) == 4)) {
                this.resetDayHour = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            for (final Integer value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set DailyQuestInfoResponse#resetDayHour to null");
                }
                this.resetDayHour.add(value);
            }
            return this;
        }

        public Builder clearResetDayHour() {
            this.resetDayHour = java.util.Collections.emptyList();
            __bitField0 &= ~4;
            return this;
        }

        public int getResetDayHourCount() {
            return resetDayHour.size();
        }

        public int getResetDayHour(int index) {
            return resetDayHour.get(index);
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
            if (!java.util.Objects.equals(this.questObject, that.questObject)) {
                return false;
            }
            if (!java.util.Objects.equals(this.isNew, that.isNew)) {
                return false;
            }
            if (!java.util.Objects.equals(this.resetDayHour, that.resetDayHour)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.questObject == null ? 0 : this.questObject.hashCode());
            result = 31 * result + Boolean.hashCode(this.isNew);
            result = 31 * result + (this.resetDayHour == null ? 0 : this.resetDayHour.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!questObject.isEmpty()) {
                parts.add("questObject=" + getQuestObjectList());
            }
            if (hasIsNew()) {
                parts.add("isNew=" + getIsNew());
            }
            if (!resetDayHour.isEmpty()) {
                parts.add("resetDayHour=" + getResetDayHourList());
            }
            return "DailyQuestInfoResponse{" + String.join(", ", parts) + "}";
        }

        public DailyQuestInfoResponse build() {
            proto.message.DailyQuestInfoResponse result = new proto.message.DailyQuestInfoResponse();
            result.__bitField0 = __bitField0;
            result.questObject = java.util.Collections.unmodifiableList(this.questObject);
            result.isNew = this.isNew;
            result.resetDayHour = java.util.Collections.unmodifiableList(this.resetDayHour);
            return result;
        }

    }



}