package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class FriendListDetailRequest
        implements io.protostuff.Message<FriendListDetailRequest> {

    private static final FriendListDetailRequest DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<String> friendIDs;

    private java.util.List<String> zaloIDs;

    private java.util.List<String> facebookIDs;

    private boolean __merge_lock = false;
    private int __bitField0;

    private FriendListDetailRequest() {
        this.friendIDs = java.util.Collections.emptyList();
        this.zaloIDs = java.util.Collections.emptyList();
        this.facebookIDs = java.util.Collections.emptyList();
    }

    private FriendListDetailRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static FriendListDetailRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<FriendListDetailRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<String> getFriendIDsList() {
        return friendIDs;
    }

    public int getFriendIDsCount() {
        return friendIDs.size();
    }

    public String getFriendIDs(int index) {
        return friendIDs.get(index);
    }

    public FriendListDetailRequest withFriendIDs(java.util.List<String> value) {
        return FriendListDetailRequest.newBuilder()
            .mergeFrom(this)
            .clearFriendIDs()
            .addAllFriendIDs(value)
            .build();
    }

    public java.util.List<String> getZaloIDsList() {
        return zaloIDs;
    }

    public int getZaloIDsCount() {
        return zaloIDs.size();
    }

    public String getZaloIDs(int index) {
        return zaloIDs.get(index);
    }

    public FriendListDetailRequest withZaloIDs(java.util.List<String> value) {
        return FriendListDetailRequest.newBuilder()
            .mergeFrom(this)
            .clearZaloIDs()
            .addAllZaloIDs(value)
            .build();
    }

    public java.util.List<String> getFacebookIDsList() {
        return facebookIDs;
    }

    public int getFacebookIDsCount() {
        return facebookIDs.size();
    }

    public String getFacebookIDs(int index) {
        return facebookIDs.get(index);
    }

    public FriendListDetailRequest withFacebookIDs(java.util.List<String> value) {
        return FriendListDetailRequest.newBuilder()
            .mergeFrom(this)
            .clearFacebookIDs()
            .addAllFacebookIDs(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<FriendListDetailRequest> cachedSchema() {
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
        FriendListDetailRequest that = (FriendListDetailRequest) obj;
        if (!java.util.Objects.equals(this.friendIDs, that.friendIDs)) {
            return false;
        }
        if (!java.util.Objects.equals(this.zaloIDs, that.zaloIDs)) {
            return false;
        }
        if (!java.util.Objects.equals(this.facebookIDs, that.facebookIDs)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.friendIDs == null ? 0 : this.friendIDs.hashCode());
        result = 31 * result + (this.zaloIDs == null ? 0 : this.zaloIDs.hashCode());
        result = 31 * result + (this.facebookIDs == null ? 0 : this.facebookIDs.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!friendIDs.isEmpty()) {
            parts.add("friendIDs=" + getFriendIDsList());
        }
        if (!zaloIDs.isEmpty()) {
            parts.add("zaloIDs=" + getZaloIDsList());
        }
        if (!facebookIDs.isEmpty()) {
            parts.add("facebookIDs=" + getFacebookIDsList());
        }
        return "FriendListDetailRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<FriendListDetailRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("friendIDs", 1);
        	__fieldMap.put("zaloIDs", 2);
        	__fieldMap.put("facebookIDs", 3);
        }

        @Override
        public FriendListDetailRequest newMessage() {
            return new FriendListDetailRequest();
        }

        @Override
        public Class<FriendListDetailRequest> typeClass() {
            return FriendListDetailRequest.class;
        }

        @Override
        public String messageName() {
            return FriendListDetailRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return FriendListDetailRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(FriendListDetailRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, FriendListDetailRequest instance) throws java.io.IOException {
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
                    	    instance.friendIDs = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.friendIDs.add(input.readString());

                    	break;
                    case 2:
                    	if(!((instance.__bitField0 & 2) == 2)) {
                    	    instance.zaloIDs = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 2;
                    	}
                    	instance.zaloIDs.add(input.readString());

                    	break;
                    case 3:
                    	if(!((instance.__bitField0 & 4) == 4)) {
                    	    instance.facebookIDs = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 4;
                    	}
                    	instance.facebookIDs.add(input.readString());

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.friendIDs = java.util.Collections.unmodifiableList(instance.friendIDs);
            }

            if((instance.__bitField0 & 2) == 2) {
                instance.zaloIDs = java.util.Collections.unmodifiableList(instance.zaloIDs);
            }

            if((instance.__bitField0 & 4) == 4) {
                instance.facebookIDs = java.util.Collections.unmodifiableList(instance.facebookIDs);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, FriendListDetailRequest instance) throws java.io.IOException {
            for(String friendIDs : instance.friendIDs) {
                output.writeString(1, friendIDs, true);
            }

            for(String zaloIDs : instance.zaloIDs) {
                output.writeString(2, zaloIDs, true);
            }

            for(String facebookIDs : instance.facebookIDs) {
                output.writeString(3, facebookIDs, true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "friendIDs";
        		case 2: return "zaloIDs";
        		case 3: return "facebookIDs";
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

        private java.util.List<String> friendIDs;

        private java.util.List<String> zaloIDs;

        private java.util.List<String> facebookIDs;

        private int __bitField0;

        private Builder() {
            this.friendIDs = java.util.Collections.emptyList();
            this.zaloIDs = java.util.Collections.emptyList();
            this.facebookIDs = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(FriendListDetailRequest instance) {
            this.addAllFriendIDs(instance.getFriendIDsList());

            this.addAllZaloIDs(instance.getZaloIDsList());

            this.addAllFacebookIDs(instance.getFacebookIDsList());

            return this;
        }

        public java.util.List<String> getFriendIDsList() {
            return friendIDs;
        }

        public Builder setFriendIDs(int index, String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendListDetailRequest#friendIDs to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.friendIDs = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.friendIDs.set(index, value);
            return this;
        }

        public Builder addFriendIDs(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendListDetailRequest#friendIDs to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.friendIDs = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.friendIDs.add(value);
            return this;
        }

        public Builder addAllFriendIDs(java.lang.Iterable<String> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set FriendListDetailRequest#friendIDs to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.friendIDs = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final String value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set FriendListDetailRequest#friendIDs to null");
                }
                this.friendIDs.add(value);
            }
            return this;
        }

        public Builder clearFriendIDs() {
            this.friendIDs = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getFriendIDsCount() {
            return friendIDs.size();
        }

        public String getFriendIDs(int index) {
            return friendIDs.get(index);
        }

        public java.util.List<String> getZaloIDsList() {
            return zaloIDs;
        }

        public Builder setZaloIDs(int index, String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendListDetailRequest#zaloIDs to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.zaloIDs = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.zaloIDs.set(index, value);
            return this;
        }

        public Builder addZaloIDs(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendListDetailRequest#zaloIDs to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.zaloIDs = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.zaloIDs.add(value);
            return this;
        }

        public Builder addAllZaloIDs(java.lang.Iterable<String> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set FriendListDetailRequest#zaloIDs to null");
            }
            if(!((__bitField0 & 2) == 2)) {
                this.zaloIDs = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            for (final String value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set FriendListDetailRequest#zaloIDs to null");
                }
                this.zaloIDs.add(value);
            }
            return this;
        }

        public Builder clearZaloIDs() {
            this.zaloIDs = java.util.Collections.emptyList();
            __bitField0 &= ~2;
            return this;
        }

        public int getZaloIDsCount() {
            return zaloIDs.size();
        }

        public String getZaloIDs(int index) {
            return zaloIDs.get(index);
        }

        public java.util.List<String> getFacebookIDsList() {
            return facebookIDs;
        }

        public Builder setFacebookIDs(int index, String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendListDetailRequest#facebookIDs to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.facebookIDs = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.facebookIDs.set(index, value);
            return this;
        }

        public Builder addFacebookIDs(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendListDetailRequest#facebookIDs to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.facebookIDs = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.facebookIDs.add(value);
            return this;
        }

        public Builder addAllFacebookIDs(java.lang.Iterable<String> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set FriendListDetailRequest#facebookIDs to null");
            }
            if(!((__bitField0 & 4) == 4)) {
                this.facebookIDs = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            for (final String value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set FriendListDetailRequest#facebookIDs to null");
                }
                this.facebookIDs.add(value);
            }
            return this;
        }

        public Builder clearFacebookIDs() {
            this.facebookIDs = java.util.Collections.emptyList();
            __bitField0 &= ~4;
            return this;
        }

        public int getFacebookIDsCount() {
            return facebookIDs.size();
        }

        public String getFacebookIDs(int index) {
            return facebookIDs.get(index);
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
            if (!java.util.Objects.equals(this.friendIDs, that.friendIDs)) {
                return false;
            }
            if (!java.util.Objects.equals(this.zaloIDs, that.zaloIDs)) {
                return false;
            }
            if (!java.util.Objects.equals(this.facebookIDs, that.facebookIDs)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.friendIDs == null ? 0 : this.friendIDs.hashCode());
            result = 31 * result + (this.zaloIDs == null ? 0 : this.zaloIDs.hashCode());
            result = 31 * result + (this.facebookIDs == null ? 0 : this.facebookIDs.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!friendIDs.isEmpty()) {
                parts.add("friendIDs=" + getFriendIDsList());
            }
            if (!zaloIDs.isEmpty()) {
                parts.add("zaloIDs=" + getZaloIDsList());
            }
            if (!facebookIDs.isEmpty()) {
                parts.add("facebookIDs=" + getFacebookIDsList());
            }
            return "FriendListDetailRequest{" + String.join(", ", parts) + "}";
        }

        public FriendListDetailRequest build() {
            proto.message.FriendListDetailRequest result = new proto.message.FriendListDetailRequest();
            result.__bitField0 = __bitField0;
            result.friendIDs = java.util.Collections.unmodifiableList(this.friendIDs);
            result.zaloIDs = java.util.Collections.unmodifiableList(this.zaloIDs);
            result.facebookIDs = java.util.Collections.unmodifiableList(this.facebookIDs);
            return result;
        }

    }



}