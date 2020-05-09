package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public final class NotificationResponse
        implements io.protostuff.Message<NotificationResponse> {

    private static final NotificationResponse DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<proto.message.NotifyMessage> dailyQuestHours;

    private java.util.List<proto.message.NotifyMessage> onlineBonusHours;

    private java.util.List<proto.message.NotifyMessage> callbackDays;

    private java.util.List<Integer> callbackHours;

    private int callbackGoldRev;

    private boolean __merge_lock = false;
    private int __bitField0;

    private NotificationResponse() {
        this.dailyQuestHours = java.util.Collections.emptyList();
        this.onlineBonusHours = java.util.Collections.emptyList();
        this.callbackDays = java.util.Collections.emptyList();
        this.callbackHours = java.util.Collections.emptyList();
        this.callbackGoldRev = 0;
    }

    private NotificationResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static NotificationResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<NotificationResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<proto.message.NotifyMessage> getDailyQuestHoursList() {
        return dailyQuestHours;
    }

    public int getDailyQuestHoursCount() {
        return dailyQuestHours.size();
    }

    public proto.message.NotifyMessage getDailyQuestHours(int index) {
        return dailyQuestHours.get(index);
    }

    public NotificationResponse withDailyQuestHours(java.util.List<proto.message.NotifyMessage> value) {
        return NotificationResponse.newBuilder()
            .mergeFrom(this)
            .clearDailyQuestHours()
            .addAllDailyQuestHours(value)
            .build();
    }

    public java.util.List<proto.message.NotifyMessage> getOnlineBonusHoursList() {
        return onlineBonusHours;
    }

    public int getOnlineBonusHoursCount() {
        return onlineBonusHours.size();
    }

    public proto.message.NotifyMessage getOnlineBonusHours(int index) {
        return onlineBonusHours.get(index);
    }

    public NotificationResponse withOnlineBonusHours(java.util.List<proto.message.NotifyMessage> value) {
        return NotificationResponse.newBuilder()
            .mergeFrom(this)
            .clearOnlineBonusHours()
            .addAllOnlineBonusHours(value)
            .build();
    }

    public java.util.List<proto.message.NotifyMessage> getCallbackDaysList() {
        return callbackDays;
    }

    public int getCallbackDaysCount() {
        return callbackDays.size();
    }

    public proto.message.NotifyMessage getCallbackDays(int index) {
        return callbackDays.get(index);
    }

    public NotificationResponse withCallbackDays(java.util.List<proto.message.NotifyMessage> value) {
        return NotificationResponse.newBuilder()
            .mergeFrom(this)
            .clearCallbackDays()
            .addAllCallbackDays(value)
            .build();
    }

    public java.util.List<Integer> getCallbackHoursList() {
        return callbackHours;
    }

    public int getCallbackHoursCount() {
        return callbackHours.size();
    }

    public int getCallbackHours(int index) {
        return callbackHours.get(index);
    }

    public NotificationResponse withCallbackHours(java.util.List<Integer> value) {
        return NotificationResponse.newBuilder()
            .mergeFrom(this)
            .clearCallbackHours()
            .addAllCallbackHours(value)
            .build();
    }

    public int getCallbackGoldRev() {
        return callbackGoldRev;
    }

    public boolean hasCallbackGoldRev() {
        return (__bitField0 & 16) == 16;
    }

    public NotificationResponse withCallbackGoldRev(int value) {
        return NotificationResponse.newBuilder()
            .mergeFrom(this)
            .setCallbackGoldRev(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<NotificationResponse> cachedSchema() {
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
        NotificationResponse that = (NotificationResponse) obj;
        if (!java.util.Objects.equals(this.dailyQuestHours, that.dailyQuestHours)) {
            return false;
        }
        if (!java.util.Objects.equals(this.onlineBonusHours, that.onlineBonusHours)) {
            return false;
        }
        if (!java.util.Objects.equals(this.callbackDays, that.callbackDays)) {
            return false;
        }
        if (!java.util.Objects.equals(this.callbackHours, that.callbackHours)) {
            return false;
        }
        if (!java.util.Objects.equals(this.callbackGoldRev, that.callbackGoldRev)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.dailyQuestHours == null ? 0 : this.dailyQuestHours.hashCode());
        result = 31 * result + (this.onlineBonusHours == null ? 0 : this.onlineBonusHours.hashCode());
        result = 31 * result + (this.callbackDays == null ? 0 : this.callbackDays.hashCode());
        result = 31 * result + (this.callbackHours == null ? 0 : this.callbackHours.hashCode());
        result = 31 * result + Integer.hashCode(this.callbackGoldRev);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!dailyQuestHours.isEmpty()) {
            parts.add("dailyQuestHours=" + getDailyQuestHoursList());
        }
        if (!onlineBonusHours.isEmpty()) {
            parts.add("onlineBonusHours=" + getOnlineBonusHoursList());
        }
        if (!callbackDays.isEmpty()) {
            parts.add("callbackDays=" + getCallbackDaysList());
        }
        if (!callbackHours.isEmpty()) {
            parts.add("callbackHours=" + getCallbackHoursList());
        }
        if (hasCallbackGoldRev()) {
            parts.add("callbackGoldRev=" + getCallbackGoldRev());
        }
        return "NotificationResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<NotificationResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("dailyQuestHours", 1);
        	__fieldMap.put("onlineBonusHours", 2);
        	__fieldMap.put("callbackDays", 3);
        	__fieldMap.put("callbackHours", 4);
        	__fieldMap.put("callbackGoldRev", 5);
        }

        @Override
        public NotificationResponse newMessage() {
            return new NotificationResponse();
        }

        @Override
        public Class<NotificationResponse> typeClass() {
            return NotificationResponse.class;
        }

        @Override
        public String messageName() {
            return NotificationResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return NotificationResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(NotificationResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, NotificationResponse instance) throws java.io.IOException {
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
                    	    instance.dailyQuestHours = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.dailyQuestHours.add(input.mergeObject(null, proto.message.NotifyMessage.getSchema()));

                    	break;
                    case 2:
                    	if(!((instance.__bitField0 & 2) == 2)) {
                    	    instance.onlineBonusHours = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 2;
                    	}
                    	instance.onlineBonusHours.add(input.mergeObject(null, proto.message.NotifyMessage.getSchema()));

                    	break;
                    case 3:
                    	if(!((instance.__bitField0 & 4) == 4)) {
                    	    instance.callbackDays = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 4;
                    	}
                    	instance.callbackDays.add(input.mergeObject(null, proto.message.NotifyMessage.getSchema()));

                    	break;
                    case 4:
                    	if(!((instance.__bitField0 & 8) == 8)) {
                    	    instance.callbackHours = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 8;
                    	}
                    	instance.callbackHours.add(input.readInt32());

                    	break;
                    case 5:
                    	instance.callbackGoldRev = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.dailyQuestHours = java.util.Collections.unmodifiableList(instance.dailyQuestHours);
            }

            if((instance.__bitField0 & 2) == 2) {
                instance.onlineBonusHours = java.util.Collections.unmodifiableList(instance.onlineBonusHours);
            }

            if((instance.__bitField0 & 4) == 4) {
                instance.callbackDays = java.util.Collections.unmodifiableList(instance.callbackDays);
            }

            if((instance.__bitField0 & 8) == 8) {
                instance.callbackHours = java.util.Collections.unmodifiableList(instance.callbackHours);
            }


        }

        @Override
        public void writeTo(io.protostuff.Output output, NotificationResponse instance) throws java.io.IOException {
            for(proto.message.NotifyMessage dailyQuestHours : instance.dailyQuestHours) {
                output.writeObject(1, dailyQuestHours, proto.message.NotifyMessage.getSchema(), true);
            }

            for(proto.message.NotifyMessage onlineBonusHours : instance.onlineBonusHours) {
                output.writeObject(2, onlineBonusHours, proto.message.NotifyMessage.getSchema(), true);
            }

            for(proto.message.NotifyMessage callbackDays : instance.callbackDays) {
                output.writeObject(3, callbackDays, proto.message.NotifyMessage.getSchema(), true);
            }

            for(int callbackHours : instance.callbackHours) {
                output.writeInt32(4, callbackHours, true);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.callbackGoldRev, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "dailyQuestHours";
        		case 2: return "onlineBonusHours";
        		case 3: return "callbackDays";
        		case 4: return "callbackHours";
        		case 5: return "callbackGoldRev";
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

        private java.util.List<proto.message.NotifyMessage> dailyQuestHours;

        private java.util.List<proto.message.NotifyMessage> onlineBonusHours;

        private java.util.List<proto.message.NotifyMessage> callbackDays;

        private java.util.List<Integer> callbackHours;

        private int callbackGoldRev;

        private int __bitField0;

        private Builder() {
            this.dailyQuestHours = java.util.Collections.emptyList();
            this.onlineBonusHours = java.util.Collections.emptyList();
            this.callbackDays = java.util.Collections.emptyList();
            this.callbackHours = java.util.Collections.emptyList();
            this.callbackGoldRev = 0;
        }

        public Builder mergeFrom(NotificationResponse instance) {
            this.addAllDailyQuestHours(instance.getDailyQuestHoursList());

            this.addAllOnlineBonusHours(instance.getOnlineBonusHoursList());

            this.addAllCallbackDays(instance.getCallbackDaysList());

            this.addAllCallbackHours(instance.getCallbackHoursList());

            if (instance.hasCallbackGoldRev()) {
                this.setCallbackGoldRev(instance.getCallbackGoldRev());
            }

            return this;
        }

        public java.util.List<proto.message.NotifyMessage> getDailyQuestHoursList() {
            return dailyQuestHours;
        }

        public Builder setDailyQuestHours(int index, proto.message.NotifyMessage value) {
            if (value == null) {
                throw new NullPointerException("Cannot set NotificationResponse#dailyQuestHours to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.dailyQuestHours = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.dailyQuestHours.set(index, value);
            return this;
        }

        public Builder addDailyQuestHours(proto.message.NotifyMessage value) {
            if (value == null) {
                throw new NullPointerException("Cannot set NotificationResponse#dailyQuestHours to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.dailyQuestHours = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.dailyQuestHours.add(value);
            return this;
        }

        public Builder addAllDailyQuestHours(java.lang.Iterable<proto.message.NotifyMessage> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set NotificationResponse#dailyQuestHours to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.dailyQuestHours = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final proto.message.NotifyMessage value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set NotificationResponse#dailyQuestHours to null");
                }
                this.dailyQuestHours.add(value);
            }
            return this;
        }

        public Builder clearDailyQuestHours() {
            this.dailyQuestHours = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getDailyQuestHoursCount() {
            return dailyQuestHours.size();
        }

        public proto.message.NotifyMessage getDailyQuestHours(int index) {
            return dailyQuestHours.get(index);
        }

        public java.util.List<proto.message.NotifyMessage> getOnlineBonusHoursList() {
            return onlineBonusHours;
        }

        public Builder setOnlineBonusHours(int index, proto.message.NotifyMessage value) {
            if (value == null) {
                throw new NullPointerException("Cannot set NotificationResponse#onlineBonusHours to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.onlineBonusHours = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.onlineBonusHours.set(index, value);
            return this;
        }

        public Builder addOnlineBonusHours(proto.message.NotifyMessage value) {
            if (value == null) {
                throw new NullPointerException("Cannot set NotificationResponse#onlineBonusHours to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.onlineBonusHours = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.onlineBonusHours.add(value);
            return this;
        }

        public Builder addAllOnlineBonusHours(java.lang.Iterable<proto.message.NotifyMessage> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set NotificationResponse#onlineBonusHours to null");
            }
            if(!((__bitField0 & 2) == 2)) {
                this.onlineBonusHours = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            for (final proto.message.NotifyMessage value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set NotificationResponse#onlineBonusHours to null");
                }
                this.onlineBonusHours.add(value);
            }
            return this;
        }

        public Builder clearOnlineBonusHours() {
            this.onlineBonusHours = java.util.Collections.emptyList();
            __bitField0 &= ~2;
            return this;
        }

        public int getOnlineBonusHoursCount() {
            return onlineBonusHours.size();
        }

        public proto.message.NotifyMessage getOnlineBonusHours(int index) {
            return onlineBonusHours.get(index);
        }

        public java.util.List<proto.message.NotifyMessage> getCallbackDaysList() {
            return callbackDays;
        }

        public Builder setCallbackDays(int index, proto.message.NotifyMessage value) {
            if (value == null) {
                throw new NullPointerException("Cannot set NotificationResponse#callbackDays to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.callbackDays = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.callbackDays.set(index, value);
            return this;
        }

        public Builder addCallbackDays(proto.message.NotifyMessage value) {
            if (value == null) {
                throw new NullPointerException("Cannot set NotificationResponse#callbackDays to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.callbackDays = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.callbackDays.add(value);
            return this;
        }

        public Builder addAllCallbackDays(java.lang.Iterable<proto.message.NotifyMessage> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set NotificationResponse#callbackDays to null");
            }
            if(!((__bitField0 & 4) == 4)) {
                this.callbackDays = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            for (final proto.message.NotifyMessage value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set NotificationResponse#callbackDays to null");
                }
                this.callbackDays.add(value);
            }
            return this;
        }

        public Builder clearCallbackDays() {
            this.callbackDays = java.util.Collections.emptyList();
            __bitField0 &= ~4;
            return this;
        }

        public int getCallbackDaysCount() {
            return callbackDays.size();
        }

        public proto.message.NotifyMessage getCallbackDays(int index) {
            return callbackDays.get(index);
        }

        public java.util.List<Integer> getCallbackHoursList() {
            return callbackHours;
        }

        public Builder setCallbackHours(int index, int value) {
            if(!((__bitField0 & 8) == 8)) {
                this.callbackHours = new java.util.ArrayList<>();
                __bitField0 |= 8;
            }
            this.callbackHours.set(index, value);
            return this;
        }

        public Builder addCallbackHours(int value) {
            if(!((__bitField0 & 8) == 8)) {
                this.callbackHours = new java.util.ArrayList<>();
                __bitField0 |= 8;
            }
            this.callbackHours.add(value);
            return this;
        }

        public Builder addAllCallbackHours(java.lang.Iterable<Integer> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set NotificationResponse#callbackHours to null");
            }
            if(!((__bitField0 & 8) == 8)) {
                this.callbackHours = new java.util.ArrayList<>();
                __bitField0 |= 8;
            }
            for (final Integer value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set NotificationResponse#callbackHours to null");
                }
                this.callbackHours.add(value);
            }
            return this;
        }

        public Builder clearCallbackHours() {
            this.callbackHours = java.util.Collections.emptyList();
            __bitField0 &= ~8;
            return this;
        }

        public int getCallbackHoursCount() {
            return callbackHours.size();
        }

        public int getCallbackHours(int index) {
            return callbackHours.get(index);
        }

        public int getCallbackGoldRev() {
            return callbackGoldRev;
        }

        public Builder setCallbackGoldRev(int value) {
            this.callbackGoldRev = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearCallbackGoldRev() {
            this.callbackGoldRev = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasCallbackGoldRev() {
            return (__bitField0 & 16) == 16;
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
            if (!java.util.Objects.equals(this.dailyQuestHours, that.dailyQuestHours)) {
                return false;
            }
            if (!java.util.Objects.equals(this.onlineBonusHours, that.onlineBonusHours)) {
                return false;
            }
            if (!java.util.Objects.equals(this.callbackDays, that.callbackDays)) {
                return false;
            }
            if (!java.util.Objects.equals(this.callbackHours, that.callbackHours)) {
                return false;
            }
            if (!java.util.Objects.equals(this.callbackGoldRev, that.callbackGoldRev)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.dailyQuestHours == null ? 0 : this.dailyQuestHours.hashCode());
            result = 31 * result + (this.onlineBonusHours == null ? 0 : this.onlineBonusHours.hashCode());
            result = 31 * result + (this.callbackDays == null ? 0 : this.callbackDays.hashCode());
            result = 31 * result + (this.callbackHours == null ? 0 : this.callbackHours.hashCode());
            result = 31 * result + Integer.hashCode(this.callbackGoldRev);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!dailyQuestHours.isEmpty()) {
                parts.add("dailyQuestHours=" + getDailyQuestHoursList());
            }
            if (!onlineBonusHours.isEmpty()) {
                parts.add("onlineBonusHours=" + getOnlineBonusHoursList());
            }
            if (!callbackDays.isEmpty()) {
                parts.add("callbackDays=" + getCallbackDaysList());
            }
            if (!callbackHours.isEmpty()) {
                parts.add("callbackHours=" + getCallbackHoursList());
            }
            if (hasCallbackGoldRev()) {
                parts.add("callbackGoldRev=" + getCallbackGoldRev());
            }
            return "NotificationResponse{" + String.join(", ", parts) + "}";
        }

        public NotificationResponse build() {
            proto.message.NotificationResponse result = new proto.message.NotificationResponse();
            result.__bitField0 = __bitField0;
            result.dailyQuestHours = java.util.Collections.unmodifiableList(this.dailyQuestHours);
            result.onlineBonusHours = java.util.Collections.unmodifiableList(this.onlineBonusHours);
            result.callbackDays = java.util.Collections.unmodifiableList(this.callbackDays);
            result.callbackHours = java.util.Collections.unmodifiableList(this.callbackHours);
            result.callbackGoldRev = this.callbackGoldRev;
            return result;
        }

    }



}