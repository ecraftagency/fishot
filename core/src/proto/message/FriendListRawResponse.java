package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class FriendListRawResponse
        implements io.protostuff.Message<FriendListRawResponse> {

    private static final FriendListRawResponse DEFAULT_INSTANCE = newBuilder().build();

    private String userID;

    private java.util.List<String> friendIDs;

    private java.util.List<String> invitations;

    private boolean __merge_lock = false;
    private int __bitField0;

    private FriendListRawResponse() {
        this.userID = "";
        this.friendIDs = java.util.Collections.emptyList();
        this.invitations = java.util.Collections.emptyList();
    }

    private FriendListRawResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static FriendListRawResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<FriendListRawResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getUserID() {
        return userID;
    }

    public boolean hasUserID() {
        return (__bitField0 & 1) == 1;
    }

    public FriendListRawResponse withUserID(String value) {
        return FriendListRawResponse.newBuilder()
            .mergeFrom(this)
            .setUserID(value)
            .build();
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

    public FriendListRawResponse withFriendIDs(java.util.List<String> value) {
        return FriendListRawResponse.newBuilder()
            .mergeFrom(this)
            .clearFriendIDs()
            .addAllFriendIDs(value)
            .build();
    }

    public java.util.List<String> getInvitationsList() {
        return invitations;
    }

    public int getInvitationsCount() {
        return invitations.size();
    }

    public String getInvitations(int index) {
        return invitations.get(index);
    }

    public FriendListRawResponse withInvitations(java.util.List<String> value) {
        return FriendListRawResponse.newBuilder()
            .mergeFrom(this)
            .clearInvitations()
            .addAllInvitations(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<FriendListRawResponse> cachedSchema() {
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
        FriendListRawResponse that = (FriendListRawResponse) obj;
        if (!java.util.Objects.equals(this.userID, that.userID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.friendIDs, that.friendIDs)) {
            return false;
        }
        if (!java.util.Objects.equals(this.invitations, that.invitations)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
        result = 31 * result + (this.friendIDs == null ? 0 : this.friendIDs.hashCode());
        result = 31 * result + (this.invitations == null ? 0 : this.invitations.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasUserID()) {
            parts.add("userID=" + getUserID());
        }
        if (!friendIDs.isEmpty()) {
            parts.add("friendIDs=" + getFriendIDsList());
        }
        if (!invitations.isEmpty()) {
            parts.add("invitations=" + getInvitationsList());
        }
        return "FriendListRawResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<FriendListRawResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("userID", 1);
        	__fieldMap.put("friendIDs", 2);
        	__fieldMap.put("invitations", 3);
        }

        @Override
        public FriendListRawResponse newMessage() {
            return new FriendListRawResponse();
        }

        @Override
        public Class<FriendListRawResponse> typeClass() {
            return FriendListRawResponse.class;
        }

        @Override
        public String messageName() {
            return FriendListRawResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return FriendListRawResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(FriendListRawResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, FriendListRawResponse instance) throws java.io.IOException {
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
                    	instance.userID = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	if(!((instance.__bitField0 & 2) == 2)) {
                    	    instance.friendIDs = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 2;
                    	}
                    	instance.friendIDs.add(input.readString());

                    	break;
                    case 3:
                    	if(!((instance.__bitField0 & 4) == 4)) {
                    	    instance.invitations = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 4;
                    	}
                    	instance.invitations.add(input.readString());

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 2) == 2) {
                instance.friendIDs = java.util.Collections.unmodifiableList(instance.friendIDs);
            }

            if((instance.__bitField0 & 4) == 4) {
                instance.invitations = java.util.Collections.unmodifiableList(instance.invitations);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, FriendListRawResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.userID, false);
            }

            for(String friendIDs : instance.friendIDs) {
                output.writeString(2, friendIDs, true);
            }

            for(String invitations : instance.invitations) {
                output.writeString(3, invitations, true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "userID";
        		case 2: return "friendIDs";
        		case 3: return "invitations";
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

        private String userID;

        private java.util.List<String> friendIDs;

        private java.util.List<String> invitations;

        private int __bitField0;

        private Builder() {
            this.userID = "";
            this.friendIDs = java.util.Collections.emptyList();
            this.invitations = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(FriendListRawResponse instance) {
            if (instance.hasUserID()) {
                this.setUserID(instance.getUserID());
            }

            this.addAllFriendIDs(instance.getFriendIDsList());

            this.addAllInvitations(instance.getInvitationsList());

            return this;
        }

        public String getUserID() {
            return userID;
        }

        public Builder setUserID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendListRawResponse#userID to null");
            }

            this.userID = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearUserID() {
            this.userID = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasUserID() {
            return (__bitField0 & 1) == 1;
        }

        public java.util.List<String> getFriendIDsList() {
            return friendIDs;
        }

        public Builder setFriendIDs(int index, String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendListRawResponse#friendIDs to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.friendIDs = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.friendIDs.set(index, value);
            return this;
        }

        public Builder addFriendIDs(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendListRawResponse#friendIDs to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.friendIDs = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.friendIDs.add(value);
            return this;
        }

        public Builder addAllFriendIDs(java.lang.Iterable<String> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set FriendListRawResponse#friendIDs to null");
            }
            if(!((__bitField0 & 2) == 2)) {
                this.friendIDs = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            for (final String value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set FriendListRawResponse#friendIDs to null");
                }
                this.friendIDs.add(value);
            }
            return this;
        }

        public Builder clearFriendIDs() {
            this.friendIDs = java.util.Collections.emptyList();
            __bitField0 &= ~2;
            return this;
        }

        public int getFriendIDsCount() {
            return friendIDs.size();
        }

        public String getFriendIDs(int index) {
            return friendIDs.get(index);
        }

        public java.util.List<String> getInvitationsList() {
            return invitations;
        }

        public Builder setInvitations(int index, String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendListRawResponse#invitations to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.invitations = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.invitations.set(index, value);
            return this;
        }

        public Builder addInvitations(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FriendListRawResponse#invitations to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.invitations = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.invitations.add(value);
            return this;
        }

        public Builder addAllInvitations(java.lang.Iterable<String> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set FriendListRawResponse#invitations to null");
            }
            if(!((__bitField0 & 4) == 4)) {
                this.invitations = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            for (final String value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set FriendListRawResponse#invitations to null");
                }
                this.invitations.add(value);
            }
            return this;
        }

        public Builder clearInvitations() {
            this.invitations = java.util.Collections.emptyList();
            __bitField0 &= ~4;
            return this;
        }

        public int getInvitationsCount() {
            return invitations.size();
        }

        public String getInvitations(int index) {
            return invitations.get(index);
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
            if (!java.util.Objects.equals(this.userID, that.userID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.friendIDs, that.friendIDs)) {
                return false;
            }
            if (!java.util.Objects.equals(this.invitations, that.invitations)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
            result = 31 * result + (this.friendIDs == null ? 0 : this.friendIDs.hashCode());
            result = 31 * result + (this.invitations == null ? 0 : this.invitations.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasUserID()) {
                parts.add("userID=" + getUserID());
            }
            if (!friendIDs.isEmpty()) {
                parts.add("friendIDs=" + getFriendIDsList());
            }
            if (!invitations.isEmpty()) {
                parts.add("invitations=" + getInvitationsList());
            }
            return "FriendListRawResponse{" + String.join(", ", parts) + "}";
        }

        public FriendListRawResponse build() {
            proto.message.FriendListRawResponse result = new proto.message.FriendListRawResponse();
            result.__bitField0 = __bitField0;
            result.userID = this.userID;
            result.friendIDs = java.util.Collections.unmodifiableList(this.friendIDs);
            result.invitations = java.util.Collections.unmodifiableList(this.invitations);
            return result;
        }

    }



}