package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class ClaimDailyBonusRequest
        implements io.protostuff.Message<ClaimDailyBonusRequest> {

    private static final ClaimDailyBonusRequest DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<Integer> claimdays;

    private boolean __merge_lock = false;
    private int __bitField0;

    private ClaimDailyBonusRequest() {
        this.claimdays = java.util.Collections.emptyList();
    }

    private ClaimDailyBonusRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ClaimDailyBonusRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<ClaimDailyBonusRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<Integer> getClaimdaysList() {
        return claimdays;
    }

    public int getClaimdaysCount() {
        return claimdays.size();
    }

    public int getClaimdays(int index) {
        return claimdays.get(index);
    }

    public ClaimDailyBonusRequest withClaimdays(java.util.List<Integer> value) {
        return ClaimDailyBonusRequest.newBuilder()
            .mergeFrom(this)
            .clearClaimdays()
            .addAllClaimdays(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<ClaimDailyBonusRequest> cachedSchema() {
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
        ClaimDailyBonusRequest that = (ClaimDailyBonusRequest) obj;
        if (!java.util.Objects.equals(this.claimdays, that.claimdays)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.claimdays == null ? 0 : this.claimdays.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!claimdays.isEmpty()) {
            parts.add("claimdays=" + getClaimdaysList());
        }
        return "ClaimDailyBonusRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<ClaimDailyBonusRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("claimdays", 1);
        }

        @Override
        public ClaimDailyBonusRequest newMessage() {
            return new ClaimDailyBonusRequest();
        }

        @Override
        public Class<ClaimDailyBonusRequest> typeClass() {
            return ClaimDailyBonusRequest.class;
        }

        @Override
        public String messageName() {
            return ClaimDailyBonusRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return ClaimDailyBonusRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(ClaimDailyBonusRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, ClaimDailyBonusRequest instance) throws java.io.IOException {
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
                    	    instance.claimdays = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.claimdays.add(input.readInt32());

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.claimdays = java.util.Collections.unmodifiableList(instance.claimdays);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, ClaimDailyBonusRequest instance) throws java.io.IOException {
            for(int claimdays : instance.claimdays) {
                output.writeInt32(1, claimdays, true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "claimdays";
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

        private java.util.List<Integer> claimdays;

        private int __bitField0;

        private Builder() {
            this.claimdays = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(ClaimDailyBonusRequest instance) {
            this.addAllClaimdays(instance.getClaimdaysList());

            return this;
        }

        public java.util.List<Integer> getClaimdaysList() {
            return claimdays;
        }

        public Builder setClaimdays(int index, int value) {
            if(!((__bitField0 & 1) == 1)) {
                this.claimdays = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.claimdays.set(index, value);
            return this;
        }

        public Builder addClaimdays(int value) {
            if(!((__bitField0 & 1) == 1)) {
                this.claimdays = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.claimdays.add(value);
            return this;
        }

        public Builder addAllClaimdays(java.lang.Iterable<Integer> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set ClaimDailyBonusRequest#claimdays to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.claimdays = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final Integer value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set ClaimDailyBonusRequest#claimdays to null");
                }
                this.claimdays.add(value);
            }
            return this;
        }

        public Builder clearClaimdays() {
            this.claimdays = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getClaimdaysCount() {
            return claimdays.size();
        }

        public int getClaimdays(int index) {
            return claimdays.get(index);
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
            if (!java.util.Objects.equals(this.claimdays, that.claimdays)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.claimdays == null ? 0 : this.claimdays.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!claimdays.isEmpty()) {
                parts.add("claimdays=" + getClaimdaysList());
            }
            return "ClaimDailyBonusRequest{" + String.join(", ", parts) + "}";
        }

        public ClaimDailyBonusRequest build() {
            proto.message.ClaimDailyBonusRequest result = new proto.message.ClaimDailyBonusRequest();
            result.__bitField0 = __bitField0;
            result.claimdays = java.util.Collections.unmodifiableList(this.claimdays);
            return result;
        }

    }



}