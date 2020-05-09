package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class LeaderBoardResponse
        implements io.protostuff.Message<LeaderBoardResponse> {

    private static final LeaderBoardResponse DEFAULT_INSTANCE = newBuilder().build();

    private String openHour;

    private String closeHour;

    private java.util.List<proto.message.LdbRecord> records;

    private String rule;

    private boolean __merge_lock = false;
    private int __bitField0;

    private LeaderBoardResponse() {
        this.openHour = "";
        this.closeHour = "";
        this.records = java.util.Collections.emptyList();
        this.rule = "";
    }

    private LeaderBoardResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static LeaderBoardResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<LeaderBoardResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getOpenHour() {
        return openHour;
    }

    public boolean hasOpenHour() {
        return (__bitField0 & 1) == 1;
    }

    public LeaderBoardResponse withOpenHour(String value) {
        return LeaderBoardResponse.newBuilder()
            .mergeFrom(this)
            .setOpenHour(value)
            .build();
    }

    public String getCloseHour() {
        return closeHour;
    }

    public boolean hasCloseHour() {
        return (__bitField0 & 2) == 2;
    }

    public LeaderBoardResponse withCloseHour(String value) {
        return LeaderBoardResponse.newBuilder()
            .mergeFrom(this)
            .setCloseHour(value)
            .build();
    }

    public java.util.List<proto.message.LdbRecord> getRecordsList() {
        return records;
    }

    public int getRecordsCount() {
        return records.size();
    }

    public proto.message.LdbRecord getRecords(int index) {
        return records.get(index);
    }

    public LeaderBoardResponse withRecords(java.util.List<proto.message.LdbRecord> value) {
        return LeaderBoardResponse.newBuilder()
            .mergeFrom(this)
            .clearRecords()
            .addAllRecords(value)
            .build();
    }

    public String getRule() {
        return rule;
    }

    public boolean hasRule() {
        return (__bitField0 & 8) == 8;
    }

    public LeaderBoardResponse withRule(String value) {
        return LeaderBoardResponse.newBuilder()
            .mergeFrom(this)
            .setRule(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<LeaderBoardResponse> cachedSchema() {
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
        LeaderBoardResponse that = (LeaderBoardResponse) obj;
        if (!java.util.Objects.equals(this.openHour, that.openHour)) {
            return false;
        }
        if (!java.util.Objects.equals(this.closeHour, that.closeHour)) {
            return false;
        }
        if (!java.util.Objects.equals(this.records, that.records)) {
            return false;
        }
        if (!java.util.Objects.equals(this.rule, that.rule)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.openHour == null ? 0 : this.openHour.hashCode());
        result = 31 * result + (this.closeHour == null ? 0 : this.closeHour.hashCode());
        result = 31 * result + (this.records == null ? 0 : this.records.hashCode());
        result = 31 * result + (this.rule == null ? 0 : this.rule.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasOpenHour()) {
            parts.add("openHour=" + getOpenHour());
        }
        if (hasCloseHour()) {
            parts.add("closeHour=" + getCloseHour());
        }
        if (!records.isEmpty()) {
            parts.add("records=" + getRecordsList());
        }
        if (hasRule()) {
            parts.add("rule=" + getRule());
        }
        return "LeaderBoardResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<LeaderBoardResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("openHour", 1);
        	__fieldMap.put("closeHour", 2);
        	__fieldMap.put("records", 3);
        	__fieldMap.put("rule", 4);
        }

        @Override
        public LeaderBoardResponse newMessage() {
            return new LeaderBoardResponse();
        }

        @Override
        public Class<LeaderBoardResponse> typeClass() {
            return LeaderBoardResponse.class;
        }

        @Override
        public String messageName() {
            return LeaderBoardResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return LeaderBoardResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(LeaderBoardResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, LeaderBoardResponse instance) throws java.io.IOException {
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
                    	instance.openHour = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.closeHour = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	if(!((instance.__bitField0 & 4) == 4)) {
                    	    instance.records = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 4;
                    	}
                    	instance.records.add(input.mergeObject(null, proto.message.LdbRecord.getSchema()));

                    	break;
                    case 4:
                    	instance.rule = input.readString();
                    	instance.__bitField0 |= 8;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 4) == 4) {
                instance.records = java.util.Collections.unmodifiableList(instance.records);
            }


        }

        @Override
        public void writeTo(io.protostuff.Output output, LeaderBoardResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.openHour, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.closeHour, false);
            }

            for(proto.message.LdbRecord records : instance.records) {
                output.writeObject(3, records, proto.message.LdbRecord.getSchema(), true);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeString(4, instance.rule, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "openHour";
        		case 2: return "closeHour";
        		case 3: return "records";
        		case 4: return "rule";
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

        private String openHour;

        private String closeHour;

        private java.util.List<proto.message.LdbRecord> records;

        private String rule;

        private int __bitField0;

        private Builder() {
            this.openHour = "";
            this.closeHour = "";
            this.records = java.util.Collections.emptyList();
            this.rule = "";
        }

        public Builder mergeFrom(LeaderBoardResponse instance) {
            if (instance.hasOpenHour()) {
                this.setOpenHour(instance.getOpenHour());
            }

            if (instance.hasCloseHour()) {
                this.setCloseHour(instance.getCloseHour());
            }

            this.addAllRecords(instance.getRecordsList());

            if (instance.hasRule()) {
                this.setRule(instance.getRule());
            }

            return this;
        }

        public String getOpenHour() {
            return openHour;
        }

        public Builder setOpenHour(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LeaderBoardResponse#openHour to null");
            }

            this.openHour = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearOpenHour() {
            this.openHour = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasOpenHour() {
            return (__bitField0 & 1) == 1;
        }

        public String getCloseHour() {
            return closeHour;
        }

        public Builder setCloseHour(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LeaderBoardResponse#closeHour to null");
            }

            this.closeHour = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearCloseHour() {
            this.closeHour = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasCloseHour() {
            return (__bitField0 & 2) == 2;
        }

        public java.util.List<proto.message.LdbRecord> getRecordsList() {
            return records;
        }

        public Builder setRecords(int index, proto.message.LdbRecord value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LeaderBoardResponse#records to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.records = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.records.set(index, value);
            return this;
        }

        public Builder addRecords(proto.message.LdbRecord value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LeaderBoardResponse#records to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.records = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.records.add(value);
            return this;
        }

        public Builder addAllRecords(java.lang.Iterable<proto.message.LdbRecord> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set LeaderBoardResponse#records to null");
            }
            if(!((__bitField0 & 4) == 4)) {
                this.records = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            for (final proto.message.LdbRecord value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set LeaderBoardResponse#records to null");
                }
                this.records.add(value);
            }
            return this;
        }

        public Builder clearRecords() {
            this.records = java.util.Collections.emptyList();
            __bitField0 &= ~4;
            return this;
        }

        public int getRecordsCount() {
            return records.size();
        }

        public proto.message.LdbRecord getRecords(int index) {
            return records.get(index);
        }

        public String getRule() {
            return rule;
        }

        public Builder setRule(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LeaderBoardResponse#rule to null");
            }

            this.rule = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearRule() {
            this.rule = "";
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasRule() {
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
            if (!java.util.Objects.equals(this.openHour, that.openHour)) {
                return false;
            }
            if (!java.util.Objects.equals(this.closeHour, that.closeHour)) {
                return false;
            }
            if (!java.util.Objects.equals(this.records, that.records)) {
                return false;
            }
            if (!java.util.Objects.equals(this.rule, that.rule)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.openHour == null ? 0 : this.openHour.hashCode());
            result = 31 * result + (this.closeHour == null ? 0 : this.closeHour.hashCode());
            result = 31 * result + (this.records == null ? 0 : this.records.hashCode());
            result = 31 * result + (this.rule == null ? 0 : this.rule.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasOpenHour()) {
                parts.add("openHour=" + getOpenHour());
            }
            if (hasCloseHour()) {
                parts.add("closeHour=" + getCloseHour());
            }
            if (!records.isEmpty()) {
                parts.add("records=" + getRecordsList());
            }
            if (hasRule()) {
                parts.add("rule=" + getRule());
            }
            return "LeaderBoardResponse{" + String.join(", ", parts) + "}";
        }

        public LeaderBoardResponse build() {
            proto.message.LeaderBoardResponse result = new proto.message.LeaderBoardResponse();
            result.__bitField0 = __bitField0;
            result.openHour = this.openHour;
            result.closeHour = this.closeHour;
            result.records = java.util.Collections.unmodifiableList(this.records);
            result.rule = this.rule;
            return result;
        }

    }



}