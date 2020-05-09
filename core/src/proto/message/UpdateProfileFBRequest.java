package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class UpdateProfileFBRequest
        implements io.protostuff.Message<UpdateProfileFBRequest> {

    private static final UpdateProfileFBRequest DEFAULT_INSTANCE = newBuilder().build();

    private String fbID;

    private String fbToken;

    private String fbAvatar;

    private String fbName;

    private int snsflag;

    private boolean __merge_lock = false;
    private int __bitField0;

    private UpdateProfileFBRequest() {
        this.fbID = "";
        this.fbToken = "";
        this.fbAvatar = "";
        this.fbName = "";
        this.snsflag = 0;
    }

    private UpdateProfileFBRequest(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static UpdateProfileFBRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<UpdateProfileFBRequest> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getFbID() {
        return fbID;
    }

    public boolean hasFbID() {
        return (__bitField0 & 1) == 1;
    }

    public UpdateProfileFBRequest withFbID(String value) {
        return UpdateProfileFBRequest.newBuilder()
            .mergeFrom(this)
            .setFbID(value)
            .build();
    }

    public String getFbToken() {
        return fbToken;
    }

    public boolean hasFbToken() {
        return (__bitField0 & 2) == 2;
    }

    public UpdateProfileFBRequest withFbToken(String value) {
        return UpdateProfileFBRequest.newBuilder()
            .mergeFrom(this)
            .setFbToken(value)
            .build();
    }

    public String getFbAvatar() {
        return fbAvatar;
    }

    public boolean hasFbAvatar() {
        return (__bitField0 & 4) == 4;
    }

    public UpdateProfileFBRequest withFbAvatar(String value) {
        return UpdateProfileFBRequest.newBuilder()
            .mergeFrom(this)
            .setFbAvatar(value)
            .build();
    }

    public String getFbName() {
        return fbName;
    }

    public boolean hasFbName() {
        return (__bitField0 & 8) == 8;
    }

    public UpdateProfileFBRequest withFbName(String value) {
        return UpdateProfileFBRequest.newBuilder()
            .mergeFrom(this)
            .setFbName(value)
            .build();
    }

    public int getSnsflag() {
        return snsflag;
    }

    public boolean hasSnsflag() {
        return (__bitField0 & 16) == 16;
    }

    public UpdateProfileFBRequest withSnsflag(int value) {
        return UpdateProfileFBRequest.newBuilder()
            .mergeFrom(this)
            .setSnsflag(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<UpdateProfileFBRequest> cachedSchema() {
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
        UpdateProfileFBRequest that = (UpdateProfileFBRequest) obj;
        if (!java.util.Objects.equals(this.fbID, that.fbID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.fbToken, that.fbToken)) {
            return false;
        }
        if (!java.util.Objects.equals(this.fbAvatar, that.fbAvatar)) {
            return false;
        }
        if (!java.util.Objects.equals(this.fbName, that.fbName)) {
            return false;
        }
        if (!java.util.Objects.equals(this.snsflag, that.snsflag)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.fbID == null ? 0 : this.fbID.hashCode());
        result = 31 * result + (this.fbToken == null ? 0 : this.fbToken.hashCode());
        result = 31 * result + (this.fbAvatar == null ? 0 : this.fbAvatar.hashCode());
        result = 31 * result + (this.fbName == null ? 0 : this.fbName.hashCode());
        result = 31 * result + Integer.hashCode(this.snsflag);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasFbID()) {
            parts.add("fbID=" + getFbID());
        }
        if (hasFbToken()) {
            parts.add("fbToken=" + getFbToken());
        }
        if (hasFbAvatar()) {
            parts.add("fbAvatar=" + getFbAvatar());
        }
        if (hasFbName()) {
            parts.add("fbName=" + getFbName());
        }
        if (hasSnsflag()) {
            parts.add("snsflag=" + getSnsflag());
        }
        return "UpdateProfileFBRequest{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<UpdateProfileFBRequest>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("fbID", 1);
        	__fieldMap.put("fbToken", 2);
        	__fieldMap.put("fbAvatar", 3);
        	__fieldMap.put("fbName", 4);
        	__fieldMap.put("snsflag", 5);
        }

        @Override
        public UpdateProfileFBRequest newMessage() {
            return new UpdateProfileFBRequest();
        }

        @Override
        public Class<UpdateProfileFBRequest> typeClass() {
            return UpdateProfileFBRequest.class;
        }

        @Override
        public String messageName() {
            return UpdateProfileFBRequest.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return UpdateProfileFBRequest.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(UpdateProfileFBRequest message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, UpdateProfileFBRequest instance) throws java.io.IOException {
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
                    	instance.fbID = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.fbToken = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.fbAvatar = input.readString();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.fbName = input.readString();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.snsflag = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, UpdateProfileFBRequest instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.fbID, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.fbToken, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeString(3, instance.fbAvatar, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeString(4, instance.fbName, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.snsflag, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "fbID";
        		case 2: return "fbToken";
        		case 3: return "fbAvatar";
        		case 4: return "fbName";
        		case 5: return "snsflag";
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

        private String fbID;

        private String fbToken;

        private String fbAvatar;

        private String fbName;

        private int snsflag;

        private int __bitField0;

        private Builder() {
            this.fbID = "";
            this.fbToken = "";
            this.fbAvatar = "";
            this.fbName = "";
            this.snsflag = 0;
        }

        public Builder mergeFrom(UpdateProfileFBRequest instance) {
            if (instance.hasFbID()) {
                this.setFbID(instance.getFbID());
            }

            if (instance.hasFbToken()) {
                this.setFbToken(instance.getFbToken());
            }

            if (instance.hasFbAvatar()) {
                this.setFbAvatar(instance.getFbAvatar());
            }

            if (instance.hasFbName()) {
                this.setFbName(instance.getFbName());
            }

            if (instance.hasSnsflag()) {
                this.setSnsflag(instance.getSnsflag());
            }

            return this;
        }

        public String getFbID() {
            return fbID;
        }

        public Builder setFbID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set UpdateProfileFBRequest#fbID to null");
            }

            this.fbID = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearFbID() {
            this.fbID = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasFbID() {
            return (__bitField0 & 1) == 1;
        }

        public String getFbToken() {
            return fbToken;
        }

        public Builder setFbToken(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set UpdateProfileFBRequest#fbToken to null");
            }

            this.fbToken = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearFbToken() {
            this.fbToken = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasFbToken() {
            return (__bitField0 & 2) == 2;
        }

        public String getFbAvatar() {
            return fbAvatar;
        }

        public Builder setFbAvatar(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set UpdateProfileFBRequest#fbAvatar to null");
            }

            this.fbAvatar = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearFbAvatar() {
            this.fbAvatar = "";
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasFbAvatar() {
            return (__bitField0 & 4) == 4;
        }

        public String getFbName() {
            return fbName;
        }

        public Builder setFbName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set UpdateProfileFBRequest#fbName to null");
            }

            this.fbName = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearFbName() {
            this.fbName = "";
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasFbName() {
            return (__bitField0 & 8) == 8;
        }

        public int getSnsflag() {
            return snsflag;
        }

        public Builder setSnsflag(int value) {
            this.snsflag = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearSnsflag() {
            this.snsflag = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasSnsflag() {
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
            if (!java.util.Objects.equals(this.fbID, that.fbID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.fbToken, that.fbToken)) {
                return false;
            }
            if (!java.util.Objects.equals(this.fbAvatar, that.fbAvatar)) {
                return false;
            }
            if (!java.util.Objects.equals(this.fbName, that.fbName)) {
                return false;
            }
            if (!java.util.Objects.equals(this.snsflag, that.snsflag)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.fbID == null ? 0 : this.fbID.hashCode());
            result = 31 * result + (this.fbToken == null ? 0 : this.fbToken.hashCode());
            result = 31 * result + (this.fbAvatar == null ? 0 : this.fbAvatar.hashCode());
            result = 31 * result + (this.fbName == null ? 0 : this.fbName.hashCode());
            result = 31 * result + Integer.hashCode(this.snsflag);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasFbID()) {
                parts.add("fbID=" + getFbID());
            }
            if (hasFbToken()) {
                parts.add("fbToken=" + getFbToken());
            }
            if (hasFbAvatar()) {
                parts.add("fbAvatar=" + getFbAvatar());
            }
            if (hasFbName()) {
                parts.add("fbName=" + getFbName());
            }
            if (hasSnsflag()) {
                parts.add("snsflag=" + getSnsflag());
            }
            return "UpdateProfileFBRequest{" + String.join(", ", parts) + "}";
        }

        public UpdateProfileFBRequest build() {
            proto.message.UpdateProfileFBRequest result = new proto.message.UpdateProfileFBRequest();
            result.__bitField0 = __bitField0;
            result.fbID = this.fbID;
            result.fbToken = this.fbToken;
            result.fbAvatar = this.fbAvatar;
            result.fbName = this.fbName;
            result.snsflag = this.snsflag;
            return result;
        }

    }



}