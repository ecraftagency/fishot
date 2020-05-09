package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class ClientActionLogRequest
        implements io.protostuff.Message<ClientActionLogRequest> {

    private static final ClientActionLogRequest DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<String> action;

    private boolean __merge_lock = false;
    private int __bitField0;

    private ClientActionLogRequest() {
        this.action = java.util.Collections.emptyList();
    }

    private ClientActionLogRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ClientActionLogRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<ClientActionLogRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<String> getActionList() {
        return action;
    }

    public int getActionCount() {
        return action.size();
    }

    public String getAction(int index) {
        return action.get(index);
    }

    public ClientActionLogRequest withAction(java.util.List<String> value) {
        return ClientActionLogRequest.newBuilder()
            .mergeFrom(this)
            .clearAction()
            .addAllAction(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<ClientActionLogRequest> cachedSchema() {
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
        ClientActionLogRequest that = (ClientActionLogRequest) obj;
        if (!java.util.Objects.equals(this.action, that.action)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.action == null ? 0 : this.action.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!action.isEmpty()) {
            parts.add("action=" + getActionList());
        }
        return "ClientActionLogRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<ClientActionLogRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("action", 1);
        }

        @Override
        public ClientActionLogRequest newMessage() {
            return new ClientActionLogRequest();
        }

        @Override
        public Class<ClientActionLogRequest> typeClass() {
            return ClientActionLogRequest.class;
        }

        @Override
        public String messageName() {
            return ClientActionLogRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return ClientActionLogRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(ClientActionLogRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, ClientActionLogRequest instance) throws java.io.IOException {
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
                    	    instance.action = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.action.add(input.readString());

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.action = java.util.Collections.unmodifiableList(instance.action);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, ClientActionLogRequest instance) throws java.io.IOException {
            for(String action : instance.action) {
                output.writeString(1, action, true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "action";
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

        private java.util.List<String> action;

        private int __bitField0;

        private Builder() {
            this.action = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(ClientActionLogRequest instance) {
            this.addAllAction(instance.getActionList());

            return this;
        }

        public java.util.List<String> getActionList() {
            return action;
        }

        public Builder setAction(int index, String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ClientActionLogRequest#action to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.action = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.action.set(index, value);
            return this;
        }

        public Builder addAction(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ClientActionLogRequest#action to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.action = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.action.add(value);
            return this;
        }

        public Builder addAllAction(java.lang.Iterable<String> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set ClientActionLogRequest#action to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.action = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final String value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set ClientActionLogRequest#action to null");
                }
                this.action.add(value);
            }
            return this;
        }

        public Builder clearAction() {
            this.action = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getActionCount() {
            return action.size();
        }

        public String getAction(int index) {
            return action.get(index);
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
            if (!java.util.Objects.equals(this.action, that.action)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.action == null ? 0 : this.action.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!action.isEmpty()) {
                parts.add("action=" + getActionList());
            }
            return "ClientActionLogRequest{" + String.join(", ", parts) + "}";
        }

        public ClientActionLogRequest build() {
            proto.message.ClientActionLogRequest result = new proto.message.ClientActionLogRequest();
            result.__bitField0 = __bitField0;
            result.action = java.util.Collections.unmodifiableList(this.action);
            return result;
        }

    }



}