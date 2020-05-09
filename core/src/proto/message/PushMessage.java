package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public final class PushMessage
        implements io.protostuff.Message<PushMessage> {

    private static final PushMessage DEFAULT_INSTANCE = newBuilder().build();

    private int startAt;

    private int endAt;

    private String reason;

    private int type;

    private String url;

    private boolean __merge_lock = false;
    private int __bitField0;

    private PushMessage() {
        this.startAt = 0;
        this.endAt = 0;
        this.reason = "";
        this.type = proto.message.SystemResultCode.LOGIN_SUCCESS.getNumber();
        this.url = "";
    }

    private PushMessage(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static PushMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<PushMessage> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getStartAt() {
        return startAt;
    }

    public boolean hasStartAt() {
        return (__bitField0 & 1) == 1;
    }

    public PushMessage withStartAt(int value) {
        return PushMessage.newBuilder()
            .mergeFrom(this)
            .setStartAt(value)
            .build();
    }

    public int getEndAt() {
        return endAt;
    }

    public boolean hasEndAt() {
        return (__bitField0 & 2) == 2;
    }

    public PushMessage withEndAt(int value) {
        return PushMessage.newBuilder()
            .mergeFrom(this)
            .setEndAt(value)
            .build();
    }

    public String getReason() {
        return reason;
    }

    public boolean hasReason() {
        return (__bitField0 & 4) == 4;
    }

    public PushMessage withReason(String value) {
        return PushMessage.newBuilder()
            .mergeFrom(this)
            .setReason(value)
            .build();
    }

    public proto.message.SystemResultCode getType() {
        return proto.message.SystemResultCode.valueOf(type);
    }

    public int getTypeValue() {
        return type;
    }

    public boolean hasType() {
        return (__bitField0 & 8) == 8;
    }

    public PushMessage withType(proto.message.SystemResultCode value) {
        return PushMessage.newBuilder()
            .mergeFrom(this)
            .setType(value)
            .build();
    }

    public String getUrl() {
        return url;
    }

    public boolean hasUrl() {
        return (__bitField0 & 16) == 16;
    }

    public PushMessage withUrl(String value) {
        return PushMessage.newBuilder()
            .mergeFrom(this)
            .setUrl(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<PushMessage> cachedSchema() {
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
        PushMessage that = (PushMessage) obj;
        if (!java.util.Objects.equals(this.startAt, that.startAt)) {
            return false;
        }
        if (!java.util.Objects.equals(this.endAt, that.endAt)) {
            return false;
        }
        if (!java.util.Objects.equals(this.reason, that.reason)) {
            return false;
        }
        if (!java.util.Objects.equals(this.type, that.type)) {
            return false;
        }
        if (!java.util.Objects.equals(this.url, that.url)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.startAt);
        result = 31 * result + Integer.hashCode(this.endAt);
        result = 31 * result + (this.reason == null ? 0 : this.reason.hashCode());
        result = 31 * result + Integer.hashCode(this.type);
        result = 31 * result + (this.url == null ? 0 : this.url.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasStartAt()) {
            parts.add("startAt=" + getStartAt());
        }
        if (hasEndAt()) {
            parts.add("endAt=" + getEndAt());
        }
        if (hasReason()) {
            parts.add("reason=" + getReason());
        }
        if (hasType()) {
            parts.add("type=" + getType() + '(' + getTypeValue() + ')');
        }
        if (hasUrl()) {
            parts.add("url=" + getUrl());
        }
        return "PushMessage{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<PushMessage>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("startAt", 1);
        	__fieldMap.put("endAt", 2);
        	__fieldMap.put("reason", 3);
        	__fieldMap.put("type", 4);
        	__fieldMap.put("url", 5);
        }

        @Override
        public PushMessage newMessage() {
            return new PushMessage();
        }

        @Override
        public Class<PushMessage> typeClass() {
            return PushMessage.class;
        }

        @Override
        public String messageName() {
            return PushMessage.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return PushMessage.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(PushMessage message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, PushMessage instance) throws java.io.IOException {
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
                    	instance.startAt = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.endAt = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.reason = input.readString();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.type = input.readEnum();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.url = input.readString();
                    	instance.__bitField0 |= 16;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, PushMessage instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.startAt, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.endAt, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeString(3, instance.reason, false);
            }

            if((instance.__bitField0 & 8) == 8) {
            	output.writeEnum(4, instance.type, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeString(5, instance.url, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "startAt";
        		case 2: return "endAt";
        		case 3: return "reason";
        		case 4: return "type";
        		case 5: return "url";
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

        private int startAt;

        private int endAt;

        private String reason;

        private int type;

        private String url;

        private int __bitField0;

        private Builder() {
            this.startAt = 0;
            this.endAt = 0;
            this.reason = "";
            this.type = proto.message.SystemResultCode.LOGIN_SUCCESS.getNumber();
            this.url = "";
        }

        public Builder mergeFrom(PushMessage instance) {
            if (instance.hasStartAt()) {
                this.setStartAt(instance.getStartAt());
            }

            if (instance.hasEndAt()) {
                this.setEndAt(instance.getEndAt());
            }

            if (instance.hasReason()) {
                this.setReason(instance.getReason());
            }

            if (instance.hasType()) {
                this.setType(instance.getType());
            }

            if (instance.hasUrl()) {
                this.setUrl(instance.getUrl());
            }

            return this;
        }

        public int getStartAt() {
            return startAt;
        }

        public Builder setStartAt(int value) {
            this.startAt = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearStartAt() {
            this.startAt = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasStartAt() {
            return (__bitField0 & 1) == 1;
        }

        public int getEndAt() {
            return endAt;
        }

        public Builder setEndAt(int value) {
            this.endAt = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearEndAt() {
            this.endAt = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasEndAt() {
            return (__bitField0 & 2) == 2;
        }

        public String getReason() {
            return reason;
        }

        public Builder setReason(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set PushMessage#reason to null");
            }

            this.reason = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearReason() {
            this.reason = "";
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasReason() {
            return (__bitField0 & 4) == 4;
        }

        public proto.message.SystemResultCode getType() {
            return proto.message.SystemResultCode.valueOf(type);
        }

        public int getTypeValue() {
            return type;
        }

        public Builder setType(proto.message.SystemResultCode value) {
            if (value == null) {
                throw new NullPointerException("Cannot set PushMessage#type to null");
            }

            if (value == proto.message.SystemResultCode.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set PushMessage#type to UNRECOGNIZED");
            }

            this.type = value.getNumber();
            __bitField0 |= 8;
            return this;
        }

        public Builder setTypeValue(int value) {
            this.type = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearType() {
            this.type = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasType() {
            return (__bitField0 & 8) == 8;
        }

        public String getUrl() {
            return url;
        }

        public Builder setUrl(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set PushMessage#url to null");
            }

            this.url = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearUrl() {
            this.url = "";
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasUrl() {
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
            if (!java.util.Objects.equals(this.startAt, that.startAt)) {
                return false;
            }
            if (!java.util.Objects.equals(this.endAt, that.endAt)) {
                return false;
            }
            if (!java.util.Objects.equals(this.reason, that.reason)) {
                return false;
            }
            if (!java.util.Objects.equals(this.type, that.type)) {
                return false;
            }
            if (!java.util.Objects.equals(this.url, that.url)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.startAt);
            result = 31 * result + Integer.hashCode(this.endAt);
            result = 31 * result + (this.reason == null ? 0 : this.reason.hashCode());
            result = 31 * result + Integer.hashCode(this.type);
            result = 31 * result + (this.url == null ? 0 : this.url.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasStartAt()) {
                parts.add("startAt=" + getStartAt());
            }
            if (hasEndAt()) {
                parts.add("endAt=" + getEndAt());
            }
            if (hasReason()) {
                parts.add("reason=" + getReason());
            }
            if (hasType()) {
                parts.add("type=" + getType() + '(' + getTypeValue() + ')');
            }
            if (hasUrl()) {
                parts.add("url=" + getUrl());
            }
            return "PushMessage{" + String.join(", ", parts) + "}";
        }

        public PushMessage build() {
            proto.message.PushMessage result = new proto.message.PushMessage();
            result.__bitField0 = __bitField0;
            result.startAt = this.startAt;
            result.endAt = this.endAt;
            result.reason = this.reason;
            result.type = this.type;
            result.url = this.url;
            return result;
        }

    }



}