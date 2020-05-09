package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class LeaveBoardResponse
        implements io.protostuff.Message<LeaveBoardResponse> {

    private static final LeaveBoardResponse DEFAULT_INSTANCE = newBuilder().build();

    private String content;

    private int freeTiket;

    private boolean __merge_lock = false;
    private int __bitField0;

    private LeaveBoardResponse() {
        this.content = "";
        this.freeTiket = 0;
    }

    private LeaveBoardResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static LeaveBoardResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<LeaveBoardResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getContent() {
        return content;
    }

    public boolean hasContent() {
        return (__bitField0 & 1) == 1;
    }

    public LeaveBoardResponse withContent(String value) {
        return LeaveBoardResponse.newBuilder()
            .mergeFrom(this)
            .setContent(value)
            .build();
    }

    public int getFreeTiket() {
        return freeTiket;
    }

    public boolean hasFreeTiket() {
        return (__bitField0 & 2) == 2;
    }

    public LeaveBoardResponse withFreeTiket(int value) {
        return LeaveBoardResponse.newBuilder()
            .mergeFrom(this)
            .setFreeTiket(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<LeaveBoardResponse> cachedSchema() {
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
        LeaveBoardResponse that = (LeaveBoardResponse) obj;
        if (!java.util.Objects.equals(this.content, that.content)) {
            return false;
        }
        if (!java.util.Objects.equals(this.freeTiket, that.freeTiket)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.content == null ? 0 : this.content.hashCode());
        result = 31 * result + Integer.hashCode(this.freeTiket);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasContent()) {
            parts.add("content=" + getContent());
        }
        if (hasFreeTiket()) {
            parts.add("freeTiket=" + getFreeTiket());
        }
        return "LeaveBoardResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<LeaveBoardResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("content", 1);
        	__fieldMap.put("freeTiket", 2);
        }

        @Override
        public LeaveBoardResponse newMessage() {
            return new LeaveBoardResponse();
        }

        @Override
        public Class<LeaveBoardResponse> typeClass() {
            return LeaveBoardResponse.class;
        }

        @Override
        public String messageName() {
            return LeaveBoardResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return LeaveBoardResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(LeaveBoardResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, LeaveBoardResponse instance) throws java.io.IOException {
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
                    	instance.content = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.freeTiket = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, LeaveBoardResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.content, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.freeTiket, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "content";
        		case 2: return "freeTiket";
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

        private String content;

        private int freeTiket;

        private int __bitField0;

        private Builder() {
            this.content = "";
            this.freeTiket = 0;
        }

        public Builder mergeFrom(LeaveBoardResponse instance) {
            if (instance.hasContent()) {
                this.setContent(instance.getContent());
            }

            if (instance.hasFreeTiket()) {
                this.setFreeTiket(instance.getFreeTiket());
            }

            return this;
        }

        public String getContent() {
            return content;
        }

        public Builder setContent(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LeaveBoardResponse#content to null");
            }

            this.content = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearContent() {
            this.content = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasContent() {
            return (__bitField0 & 1) == 1;
        }

        public int getFreeTiket() {
            return freeTiket;
        }

        public Builder setFreeTiket(int value) {
            this.freeTiket = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearFreeTiket() {
            this.freeTiket = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasFreeTiket() {
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
            if (!java.util.Objects.equals(this.content, that.content)) {
                return false;
            }
            if (!java.util.Objects.equals(this.freeTiket, that.freeTiket)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.content == null ? 0 : this.content.hashCode());
            result = 31 * result + Integer.hashCode(this.freeTiket);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasContent()) {
                parts.add("content=" + getContent());
            }
            if (hasFreeTiket()) {
                parts.add("freeTiket=" + getFreeTiket());
            }
            return "LeaveBoardResponse{" + String.join(", ", parts) + "}";
        }

        public LeaveBoardResponse build() {
            proto.message.LeaveBoardResponse result = new proto.message.LeaveBoardResponse();
            result.__bitField0 = __bitField0;
            result.content = this.content;
            result.freeTiket = this.freeTiket;
            return result;
        }

    }



}