package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class SoccerReceiveRequest
        implements io.protostuff.Message<SoccerReceiveRequest> {

    private static final SoccerReceiveRequest DEFAULT_INSTANCE = newBuilder().build();

    private int id;

    private int betId;

    private boolean __merge_lock = false;
    private int __bitField0;

    private SoccerReceiveRequest() {
        this.id = 0;
        this.betId = 0;
    }

    private SoccerReceiveRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static SoccerReceiveRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<SoccerReceiveRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 1) == 1;
    }

    public SoccerReceiveRequest withId(int value) {
        return SoccerReceiveRequest.newBuilder()
            .mergeFrom(this)
            .setId(value)
            .build();
    }

    public int getBetId() {
        return betId;
    }

    public boolean hasBetId() {
        return (__bitField0 & 2) == 2;
    }

    public SoccerReceiveRequest withBetId(int value) {
        return SoccerReceiveRequest.newBuilder()
            .mergeFrom(this)
            .setBetId(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<SoccerReceiveRequest> cachedSchema() {
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
        SoccerReceiveRequest that = (SoccerReceiveRequest) obj;
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.betId, that.betId)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.id);
        result = 31 * result + Integer.hashCode(this.betId);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasId()) {
            parts.add("id=" + getId());
        }
        if (hasBetId()) {
            parts.add("betId=" + getBetId());
        }
        return "SoccerReceiveRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<SoccerReceiveRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("id", 1);
        	__fieldMap.put("betId", 2);
        }

        @Override
        public SoccerReceiveRequest newMessage() {
            return new SoccerReceiveRequest();
        }

        @Override
        public Class<SoccerReceiveRequest> typeClass() {
            return SoccerReceiveRequest.class;
        }

        @Override
        public String messageName() {
            return SoccerReceiveRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return SoccerReceiveRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(SoccerReceiveRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, SoccerReceiveRequest instance) throws java.io.IOException {
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
                    	instance.betId = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, SoccerReceiveRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.id, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.betId, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "id";
        		case 2: return "betId";
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

        private int betId;

        private int __bitField0;

        private Builder() {
            this.id = 0;
            this.betId = 0;
        }

        public Builder mergeFrom(SoccerReceiveRequest instance) {
            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            if (instance.hasBetId()) {
                this.setBetId(instance.getBetId());
            }

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

        public int getBetId() {
            return betId;
        }

        public Builder setBetId(int value) {
            this.betId = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearBetId() {
            this.betId = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasBetId() {
            return (__bitField0 & 2) == 2;
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
            if (!java.util.Objects.equals(this.betId, that.betId)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.id);
            result = 31 * result + Integer.hashCode(this.betId);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasId()) {
                parts.add("id=" + getId());
            }
            if (hasBetId()) {
                parts.add("betId=" + getBetId());
            }
            return "SoccerReceiveRequest{" + String.join(", ", parts) + "}";
        }

        public SoccerReceiveRequest build() {
            proto.message.SoccerReceiveRequest result = new proto.message.SoccerReceiveRequest();
            result.__bitField0 = __bitField0;
            result.id = this.id;
            result.betId = this.betId;
            return result;
        }

    }



}