package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public final class NotifyMessage
        implements io.protostuff.Message<NotifyMessage> {

    private static final NotifyMessage DEFAULT_INSTANCE = newBuilder().build();

    private int time;

    private String msg;

    private boolean __merge_lock = false;
    private int __bitField0;

    private NotifyMessage() {
        this.time = 0;
        this.msg = "";
    }

    private NotifyMessage(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static NotifyMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<NotifyMessage> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getTime() {
        return time;
    }

    public boolean hasTime() {
        return (__bitField0 & 1) == 1;
    }

    public NotifyMessage withTime(int value) {
        return NotifyMessage.newBuilder()
            .mergeFrom(this)
            .setTime(value)
            .build();
    }

    public String getMsg() {
        return msg;
    }

    public boolean hasMsg() {
        return (__bitField0 & 2) == 2;
    }

    public NotifyMessage withMsg(String value) {
        return NotifyMessage.newBuilder()
            .mergeFrom(this)
            .setMsg(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<NotifyMessage> cachedSchema() {
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
        NotifyMessage that = (NotifyMessage) obj;
        if (!java.util.Objects.equals(this.time, that.time)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msg, that.msg)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.time);
        result = 31 * result + (this.msg == null ? 0 : this.msg.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasTime()) {
            parts.add("time=" + getTime());
        }
        if (hasMsg()) {
            parts.add("msg=" + getMsg());
        }
        return "NotifyMessage{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<NotifyMessage>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("time", 1);
        	__fieldMap.put("msg", 2);
        }

        @Override
        public NotifyMessage newMessage() {
            return new NotifyMessage();
        }

        @Override
        public Class<NotifyMessage> typeClass() {
            return NotifyMessage.class;
        }

        @Override
        public String messageName() {
            return NotifyMessage.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return NotifyMessage.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(NotifyMessage message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, NotifyMessage instance) throws java.io.IOException {
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
                    	instance.time = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.msg = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, NotifyMessage instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.time, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.msg, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "time";
        		case 2: return "msg";
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

        private int time;

        private String msg;

        private int __bitField0;

        private Builder() {
            this.time = 0;
            this.msg = "";
        }

        public Builder mergeFrom(NotifyMessage instance) {
            if (instance.hasTime()) {
                this.setTime(instance.getTime());
            }

            if (instance.hasMsg()) {
                this.setMsg(instance.getMsg());
            }

            return this;
        }

        public int getTime() {
            return time;
        }

        public Builder setTime(int value) {
            this.time = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearTime() {
            this.time = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasTime() {
            return (__bitField0 & 1) == 1;
        }

        public String getMsg() {
            return msg;
        }

        public Builder setMsg(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set NotifyMessage#msg to null");
            }

            this.msg = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearMsg() {
            this.msg = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasMsg() {
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
            if (!java.util.Objects.equals(this.time, that.time)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msg, that.msg)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.time);
            result = 31 * result + (this.msg == null ? 0 : this.msg.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasTime()) {
                parts.add("time=" + getTime());
            }
            if (hasMsg()) {
                parts.add("msg=" + getMsg());
            }
            return "NotifyMessage{" + String.join(", ", parts) + "}";
        }

        public NotifyMessage build() {
            proto.message.NotifyMessage result = new proto.message.NotifyMessage();
            result.__bitField0 = __bitField0;
            result.time = this.time;
            result.msg = this.msg;
            return result;
        }

    }



}