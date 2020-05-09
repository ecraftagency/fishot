package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class DailyQuestReceiveRequest
        implements io.protostuff.Message<DailyQuestReceiveRequest> {

    private static final DailyQuestReceiveRequest DEFAULT_INSTANCE = newBuilder().build();

    private int questId;

    private boolean __merge_lock = false;
    private int __bitField0;

    private DailyQuestReceiveRequest() {
        this.questId = 0;
    }

    private DailyQuestReceiveRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static DailyQuestReceiveRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<DailyQuestReceiveRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getQuestId() {
        return questId;
    }

    public boolean hasQuestId() {
        return (__bitField0 & 1) == 1;
    }

    public DailyQuestReceiveRequest withQuestId(int value) {
        return DailyQuestReceiveRequest.newBuilder()
            .mergeFrom(this)
            .setQuestId(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<DailyQuestReceiveRequest> cachedSchema() {
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
        DailyQuestReceiveRequest that = (DailyQuestReceiveRequest) obj;
        if (!java.util.Objects.equals(this.questId, that.questId)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.questId);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasQuestId()) {
            parts.add("questId=" + getQuestId());
        }
        return "DailyQuestReceiveRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<DailyQuestReceiveRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("questId", 1);
        }

        @Override
        public DailyQuestReceiveRequest newMessage() {
            return new DailyQuestReceiveRequest();
        }

        @Override
        public Class<DailyQuestReceiveRequest> typeClass() {
            return DailyQuestReceiveRequest.class;
        }

        @Override
        public String messageName() {
            return DailyQuestReceiveRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return DailyQuestReceiveRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(DailyQuestReceiveRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, DailyQuestReceiveRequest instance) throws java.io.IOException {
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
                    	instance.questId = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, DailyQuestReceiveRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.questId, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "questId";
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

        private int questId;

        private int __bitField0;

        private Builder() {
            this.questId = 0;
        }

        public Builder mergeFrom(DailyQuestReceiveRequest instance) {
            if (instance.hasQuestId()) {
                this.setQuestId(instance.getQuestId());
            }

            return this;
        }

        public int getQuestId() {
            return questId;
        }

        public Builder setQuestId(int value) {
            this.questId = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearQuestId() {
            this.questId = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasQuestId() {
            return (__bitField0 & 1) == 1;
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
            if (!java.util.Objects.equals(this.questId, that.questId)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.questId);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasQuestId()) {
                parts.add("questId=" + getQuestId());
            }
            return "DailyQuestReceiveRequest{" + String.join(", ", parts) + "}";
        }

        public DailyQuestReceiveRequest build() {
            proto.message.DailyQuestReceiveRequest result = new proto.message.DailyQuestReceiveRequest();
            result.__bitField0 = __bitField0;
            result.questId = this.questId;
            return result;
        }

    }



}