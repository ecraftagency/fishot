package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class GetUserInboxResponse
        implements io.protostuff.Message<GetUserInboxResponse> {

    private static final GetUserInboxResponse DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<proto.message.InboxObject> inboxObj;

    private boolean isNew;

    private boolean __merge_lock = false;
    private int __bitField0;

    private GetUserInboxResponse() {
        this.inboxObj = java.util.Collections.emptyList();
        this.isNew = false;
    }

    private GetUserInboxResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static GetUserInboxResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<GetUserInboxResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<proto.message.InboxObject> getInboxObjList() {
        return inboxObj;
    }

    public int getInboxObjCount() {
        return inboxObj.size();
    }

    public proto.message.InboxObject getInboxObj(int index) {
        return inboxObj.get(index);
    }

    public GetUserInboxResponse withInboxObj(java.util.List<proto.message.InboxObject> value) {
        return GetUserInboxResponse.newBuilder()
            .mergeFrom(this)
            .clearInboxObj()
            .addAllInboxObj(value)
            .build();
    }

    public boolean getIsNew() {
        return isNew;
    }

    public boolean hasIsNew() {
        return (__bitField0 & 2) == 2;
    }

    public GetUserInboxResponse withIsNew(boolean value) {
        return GetUserInboxResponse.newBuilder()
            .mergeFrom(this)
            .setIsNew(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<GetUserInboxResponse> cachedSchema() {
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
        GetUserInboxResponse that = (GetUserInboxResponse) obj;
        if (!java.util.Objects.equals(this.inboxObj, that.inboxObj)) {
            return false;
        }
        if (!java.util.Objects.equals(this.isNew, that.isNew)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.inboxObj == null ? 0 : this.inboxObj.hashCode());
        result = 31 * result + Boolean.hashCode(this.isNew);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!inboxObj.isEmpty()) {
            parts.add("inboxObj=" + getInboxObjList());
        }
        if (hasIsNew()) {
            parts.add("isNew=" + getIsNew());
        }
        return "GetUserInboxResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<GetUserInboxResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("inboxObj", 1);
        	__fieldMap.put("isNew", 2);
        }

        @Override
        public GetUserInboxResponse newMessage() {
            return new GetUserInboxResponse();
        }

        @Override
        public Class<GetUserInboxResponse> typeClass() {
            return GetUserInboxResponse.class;
        }

        @Override
        public String messageName() {
            return GetUserInboxResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return GetUserInboxResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(GetUserInboxResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, GetUserInboxResponse instance) throws java.io.IOException {
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
                    	    instance.inboxObj = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.inboxObj.add(input.mergeObject(null, proto.message.InboxObject.getSchema()));

                    	break;
                    case 2:
                    	instance.isNew = input.readBool();
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.inboxObj = java.util.Collections.unmodifiableList(instance.inboxObj);
            }


        }

        @Override
        public void writeTo(io.protostuff.Output output, GetUserInboxResponse instance) throws java.io.IOException {
            for(proto.message.InboxObject inboxObj : instance.inboxObj) {
                output.writeObject(1, inboxObj, proto.message.InboxObject.getSchema(), true);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeBool(2, instance.isNew, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "inboxObj";
        		case 2: return "isNew";
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

        private java.util.List<proto.message.InboxObject> inboxObj;

        private boolean isNew;

        private int __bitField0;

        private Builder() {
            this.inboxObj = java.util.Collections.emptyList();
            this.isNew = false;
        }

        public Builder mergeFrom(GetUserInboxResponse instance) {
            this.addAllInboxObj(instance.getInboxObjList());

            if (instance.hasIsNew()) {
                this.setIsNew(instance.getIsNew());
            }

            return this;
        }

        public java.util.List<proto.message.InboxObject> getInboxObjList() {
            return inboxObj;
        }

        public Builder setInboxObj(int index, proto.message.InboxObject value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GetUserInboxResponse#inboxObj to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.inboxObj = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.inboxObj.set(index, value);
            return this;
        }

        public Builder addInboxObj(proto.message.InboxObject value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GetUserInboxResponse#inboxObj to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.inboxObj = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.inboxObj.add(value);
            return this;
        }

        public Builder addAllInboxObj(java.lang.Iterable<proto.message.InboxObject> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set GetUserInboxResponse#inboxObj to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.inboxObj = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final proto.message.InboxObject value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set GetUserInboxResponse#inboxObj to null");
                }
                this.inboxObj.add(value);
            }
            return this;
        }

        public Builder clearInboxObj() {
            this.inboxObj = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getInboxObjCount() {
            return inboxObj.size();
        }

        public proto.message.InboxObject getInboxObj(int index) {
            return inboxObj.get(index);
        }

        public boolean getIsNew() {
            return isNew;
        }

        public Builder setIsNew(boolean value) {
            this.isNew = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearIsNew() {
            this.isNew = false;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasIsNew() {
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
            if (!java.util.Objects.equals(this.inboxObj, that.inboxObj)) {
                return false;
            }
            if (!java.util.Objects.equals(this.isNew, that.isNew)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.inboxObj == null ? 0 : this.inboxObj.hashCode());
            result = 31 * result + Boolean.hashCode(this.isNew);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!inboxObj.isEmpty()) {
                parts.add("inboxObj=" + getInboxObjList());
            }
            if (hasIsNew()) {
                parts.add("isNew=" + getIsNew());
            }
            return "GetUserInboxResponse{" + String.join(", ", parts) + "}";
        }

        public GetUserInboxResponse build() {
            proto.message.GetUserInboxResponse result = new proto.message.GetUserInboxResponse();
            result.__bitField0 = __bitField0;
            result.inboxObj = java.util.Collections.unmodifiableList(this.inboxObj);
            result.isNew = this.isNew;
            return result;
        }

    }



}