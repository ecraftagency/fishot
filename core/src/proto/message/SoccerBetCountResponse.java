package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class SoccerBetCountResponse
        implements io.protostuff.Message<SoccerBetCountResponse> {

    private static final SoccerBetCountResponse DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<proto.message.SoccerBetCount> counters;

    private boolean __merge_lock = false;
    private int __bitField0;

    private SoccerBetCountResponse() {
        this.counters = java.util.Collections.emptyList();
    }

    private SoccerBetCountResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static SoccerBetCountResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<SoccerBetCountResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<proto.message.SoccerBetCount> getCountersList() {
        return counters;
    }

    public int getCountersCount() {
        return counters.size();
    }

    public proto.message.SoccerBetCount getCounters(int index) {
        return counters.get(index);
    }

    public SoccerBetCountResponse withCounters(java.util.List<proto.message.SoccerBetCount> value) {
        return SoccerBetCountResponse.newBuilder()
            .mergeFrom(this)
            .clearCounters()
            .addAllCounters(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<SoccerBetCountResponse> cachedSchema() {
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
        SoccerBetCountResponse that = (SoccerBetCountResponse) obj;
        if (!java.util.Objects.equals(this.counters, that.counters)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.counters == null ? 0 : this.counters.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!counters.isEmpty()) {
            parts.add("counters=" + getCountersList());
        }
        return "SoccerBetCountResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<SoccerBetCountResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("counters", 1);
        }

        @Override
        public SoccerBetCountResponse newMessage() {
            return new SoccerBetCountResponse();
        }

        @Override
        public Class<SoccerBetCountResponse> typeClass() {
            return SoccerBetCountResponse.class;
        }

        @Override
        public String messageName() {
            return SoccerBetCountResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return SoccerBetCountResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(SoccerBetCountResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, SoccerBetCountResponse instance) throws java.io.IOException {
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
                    	    instance.counters = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.counters.add(input.mergeObject(null, proto.message.SoccerBetCount.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.counters = java.util.Collections.unmodifiableList(instance.counters);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, SoccerBetCountResponse instance) throws java.io.IOException {
            for(proto.message.SoccerBetCount counters : instance.counters) {
                output.writeObject(1, counters, proto.message.SoccerBetCount.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "counters";
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

        private java.util.List<proto.message.SoccerBetCount> counters;

        private int __bitField0;

        private Builder() {
            this.counters = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(SoccerBetCountResponse instance) {
            this.addAllCounters(instance.getCountersList());

            return this;
        }

        public java.util.List<proto.message.SoccerBetCount> getCountersList() {
            return counters;
        }

        public Builder setCounters(int index, proto.message.SoccerBetCount value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SoccerBetCountResponse#counters to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.counters = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.counters.set(index, value);
            return this;
        }

        public Builder addCounters(proto.message.SoccerBetCount value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SoccerBetCountResponse#counters to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.counters = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.counters.add(value);
            return this;
        }

        public Builder addAllCounters(java.lang.Iterable<proto.message.SoccerBetCount> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set SoccerBetCountResponse#counters to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.counters = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final proto.message.SoccerBetCount value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set SoccerBetCountResponse#counters to null");
                }
                this.counters.add(value);
            }
            return this;
        }

        public Builder clearCounters() {
            this.counters = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getCountersCount() {
            return counters.size();
        }

        public proto.message.SoccerBetCount getCounters(int index) {
            return counters.get(index);
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
            if (!java.util.Objects.equals(this.counters, that.counters)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.counters == null ? 0 : this.counters.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!counters.isEmpty()) {
                parts.add("counters=" + getCountersList());
            }
            return "SoccerBetCountResponse{" + String.join(", ", parts) + "}";
        }

        public SoccerBetCountResponse build() {
            proto.message.SoccerBetCountResponse result = new proto.message.SoccerBetCountResponse();
            result.__bitField0 = __bitField0;
            result.counters = java.util.Collections.unmodifiableList(this.counters);
            return result;
        }

    }



}