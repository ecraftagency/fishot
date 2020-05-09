package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class OpenBombRequest
        implements io.protostuff.Message<OpenBombRequest> {

    private static final OpenBombRequest DEFAULT_INSTANCE = newBuilder().build();

    private String userid;

    private int itemId;

    private boolean __merge_lock = false;
    private int __bitField0;

    private OpenBombRequest() {
        this.userid = "";
        this.itemId = 0;
    }

    private OpenBombRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static OpenBombRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<OpenBombRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getUserid() {
        return userid;
    }

    public boolean hasUserid() {
        return (__bitField0 & 1) == 1;
    }

    public OpenBombRequest withUserid(String value) {
        return OpenBombRequest.newBuilder()
            .mergeFrom(this)
            .setUserid(value)
            .build();
    }

    public int getItemId() {
        return itemId;
    }

    public boolean hasItemId() {
        return (__bitField0 & 2) == 2;
    }

    public OpenBombRequest withItemId(int value) {
        return OpenBombRequest.newBuilder()
            .mergeFrom(this)
            .setItemId(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<OpenBombRequest> cachedSchema() {
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
        OpenBombRequest that = (OpenBombRequest) obj;
        if (!java.util.Objects.equals(this.userid, that.userid)) {
            return false;
        }
        if (!java.util.Objects.equals(this.itemId, that.itemId)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.userid == null ? 0 : this.userid.hashCode());
        result = 31 * result + Integer.hashCode(this.itemId);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasUserid()) {
            parts.add("userid=" + getUserid());
        }
        if (hasItemId()) {
            parts.add("itemId=" + getItemId());
        }
        return "OpenBombRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<OpenBombRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("userid", 1);
        	__fieldMap.put("itemId", 2);
        }

        @Override
        public OpenBombRequest newMessage() {
            return new OpenBombRequest();
        }

        @Override
        public Class<OpenBombRequest> typeClass() {
            return OpenBombRequest.class;
        }

        @Override
        public String messageName() {
            return OpenBombRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return OpenBombRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(OpenBombRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, OpenBombRequest instance) throws java.io.IOException {
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
                    	instance.userid = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.itemId = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, OpenBombRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.userid, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.itemId, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "userid";
        		case 2: return "itemId";
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

        private String userid;

        private int itemId;

        private int __bitField0;

        private Builder() {
            this.userid = "";
            this.itemId = 0;
        }

        public Builder mergeFrom(OpenBombRequest instance) {
            if (instance.hasUserid()) {
                this.setUserid(instance.getUserid());
            }

            if (instance.hasItemId()) {
                this.setItemId(instance.getItemId());
            }

            return this;
        }

        public String getUserid() {
            return userid;
        }

        public Builder setUserid(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set OpenBombRequest#userid to null");
            }

            this.userid = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearUserid() {
            this.userid = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasUserid() {
            return (__bitField0 & 1) == 1;
        }

        public int getItemId() {
            return itemId;
        }

        public Builder setItemId(int value) {
            this.itemId = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearItemId() {
            this.itemId = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasItemId() {
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
            if (!java.util.Objects.equals(this.userid, that.userid)) {
                return false;
            }
            if (!java.util.Objects.equals(this.itemId, that.itemId)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.userid == null ? 0 : this.userid.hashCode());
            result = 31 * result + Integer.hashCode(this.itemId);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasUserid()) {
                parts.add("userid=" + getUserid());
            }
            if (hasItemId()) {
                parts.add("itemId=" + getItemId());
            }
            return "OpenBombRequest{" + String.join(", ", parts) + "}";
        }

        public OpenBombRequest build() {
            proto.message.OpenBombRequest result = new proto.message.OpenBombRequest();
            result.__bitField0 = __bitField0;
            result.userid = this.userid;
            result.itemId = this.itemId;
            return result;
        }

    }



}