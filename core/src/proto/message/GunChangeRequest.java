package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class GunChangeRequest
        implements io.protostuff.Message<GunChangeRequest> {

    private static final GunChangeRequest DEFAULT_INSTANCE = newBuilder().build();

    private String userID;

    private int gunID;

    private boolean __merge_lock = false;
    private int __bitField0;

    private GunChangeRequest() {
        this.userID = "";
        this.gunID = 0;
    }

    private GunChangeRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static GunChangeRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<GunChangeRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getUserID() {
        return userID;
    }

    public boolean hasUserID() {
        return (__bitField0 & 1) == 1;
    }

    public GunChangeRequest withUserID(String value) {
        return GunChangeRequest.newBuilder()
            .mergeFrom(this)
            .setUserID(value)
            .build();
    }

    public int getGunID() {
        return gunID;
    }

    public boolean hasGunID() {
        return (__bitField0 & 2) == 2;
    }

    public GunChangeRequest withGunID(int value) {
        return GunChangeRequest.newBuilder()
            .mergeFrom(this)
            .setGunID(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<GunChangeRequest> cachedSchema() {
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
        GunChangeRequest that = (GunChangeRequest) obj;
        if (!java.util.Objects.equals(this.userID, that.userID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gunID, that.gunID)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
        result = 31 * result + Integer.hashCode(this.gunID);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasUserID()) {
            parts.add("userID=" + getUserID());
        }
        if (hasGunID()) {
            parts.add("gunID=" + getGunID());
        }
        return "GunChangeRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<GunChangeRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("userID", 1);
        	__fieldMap.put("gunID", 2);
        }

        @Override
        public GunChangeRequest newMessage() {
            return new GunChangeRequest();
        }

        @Override
        public Class<GunChangeRequest> typeClass() {
            return GunChangeRequest.class;
        }

        @Override
        public String messageName() {
            return GunChangeRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return GunChangeRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(GunChangeRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, GunChangeRequest instance) throws java.io.IOException {
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
                    	instance.gunID = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, GunChangeRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.userID, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.gunID, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "userID";
        		case 2: return "gunID";
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

        private int gunID;

        private int __bitField0;

        private Builder() {
            this.userID = "";
            this.gunID = 0;
        }

        public Builder mergeFrom(GunChangeRequest instance) {
            if (instance.hasUserID()) {
                this.setUserID(instance.getUserID());
            }

            if (instance.hasGunID()) {
                this.setGunID(instance.getGunID());
            }

            return this;
        }

        public String getUserID() {
            return userID;
        }

        public Builder setUserID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GunChangeRequest#userID to null");
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

        public int getGunID() {
            return gunID;
        }

        public Builder setGunID(int value) {
            this.gunID = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearGunID() {
            this.gunID = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasGunID() {
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
            if (!java.util.Objects.equals(this.userID, that.userID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gunID, that.gunID)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
            result = 31 * result + Integer.hashCode(this.gunID);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasUserID()) {
                parts.add("userID=" + getUserID());
            }
            if (hasGunID()) {
                parts.add("gunID=" + getGunID());
            }
            return "GunChangeRequest{" + String.join(", ", parts) + "}";
        }

        public GunChangeRequest build() {
            proto.message.GunChangeRequest result = new proto.message.GunChangeRequest();
            result.__bitField0 = __bitField0;
            result.userID = this.userID;
            result.gunID = this.gunID;
            return result;
        }

    }



}