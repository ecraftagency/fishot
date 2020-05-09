package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public final class ShareData
        implements io.protostuff.Message<ShareData> {

    private static final ShareData DEFAULT_INSTANCE = newBuilder().build();

    private String shareLink;

    private String shareImage;

    private int shareId;

    private String shareTitle;

    private String shareDescription;

    private String buildSource;

    private boolean __merge_lock = false;
    private int __bitField0;

    private ShareData() {
        this.shareLink = "";
        this.shareImage = "";
        this.shareId = 0;
        this.shareTitle = "";
        this.shareDescription = "";
        this.buildSource = "";
    }

    private ShareData(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ShareData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<ShareData> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getShareLink() {
        return shareLink;
    }

    public boolean hasShareLink() {
        return (__bitField0 & 1) == 1;
    }

    public ShareData withShareLink(String value) {
        return ShareData.newBuilder()
            .mergeFrom(this)
            .setShareLink(value)
            .build();
    }

    public String getShareImage() {
        return shareImage;
    }

    public boolean hasShareImage() {
        return (__bitField0 & 2) == 2;
    }

    public ShareData withShareImage(String value) {
        return ShareData.newBuilder()
            .mergeFrom(this)
            .setShareImage(value)
            .build();
    }

    public int getShareId() {
        return shareId;
    }

    public boolean hasShareId() {
        return (__bitField0 & 4) == 4;
    }

    public ShareData withShareId(int value) {
        return ShareData.newBuilder()
            .mergeFrom(this)
            .setShareId(value)
            .build();
    }

    public String getShareTitle() {
        return shareTitle;
    }

    public boolean hasShareTitle() {
        return (__bitField0 & 8) == 8;
    }

    public ShareData withShareTitle(String value) {
        return ShareData.newBuilder()
            .mergeFrom(this)
            .setShareTitle(value)
            .build();
    }

    public String getShareDescription() {
        return shareDescription;
    }

    public boolean hasShareDescription() {
        return (__bitField0 & 16) == 16;
    }

    public ShareData withShareDescription(String value) {
        return ShareData.newBuilder()
            .mergeFrom(this)
            .setShareDescription(value)
            .build();
    }

    public String getBuildSource() {
        return buildSource;
    }

    public boolean hasBuildSource() {
        return (__bitField0 & 32) == 32;
    }

    public ShareData withBuildSource(String value) {
        return ShareData.newBuilder()
            .mergeFrom(this)
            .setBuildSource(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<ShareData> cachedSchema() {
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
        ShareData that = (ShareData) obj;
        if (!java.util.Objects.equals(this.shareLink, that.shareLink)) {
            return false;
        }
        if (!java.util.Objects.equals(this.shareImage, that.shareImage)) {
            return false;
        }
        if (!java.util.Objects.equals(this.shareId, that.shareId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.shareTitle, that.shareTitle)) {
            return false;
        }
        if (!java.util.Objects.equals(this.shareDescription, that.shareDescription)) {
            return false;
        }
        if (!java.util.Objects.equals(this.buildSource, that.buildSource)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.shareLink == null ? 0 : this.shareLink.hashCode());
        result = 31 * result + (this.shareImage == null ? 0 : this.shareImage.hashCode());
        result = 31 * result + Integer.hashCode(this.shareId);
        result = 31 * result + (this.shareTitle == null ? 0 : this.shareTitle.hashCode());
        result = 31 * result + (this.shareDescription == null ? 0 : this.shareDescription.hashCode());
        result = 31 * result + (this.buildSource == null ? 0 : this.buildSource.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasShareLink()) {
            parts.add("shareLink=" + getShareLink());
        }
        if (hasShareImage()) {
            parts.add("shareImage=" + getShareImage());
        }
        if (hasShareId()) {
            parts.add("shareId=" + getShareId());
        }
        if (hasShareTitle()) {
            parts.add("shareTitle=" + getShareTitle());
        }
        if (hasShareDescription()) {
            parts.add("shareDescription=" + getShareDescription());
        }
        if (hasBuildSource()) {
            parts.add("buildSource=" + getBuildSource());
        }
        return "ShareData{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<ShareData>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("shareLink", 1);
        	__fieldMap.put("shareImage", 2);
        	__fieldMap.put("shareId", 3);
        	__fieldMap.put("shareTitle", 4);
        	__fieldMap.put("shareDescription", 5);
        	__fieldMap.put("buildSource", 6);
        }

        @Override
        public ShareData newMessage() {
            return new ShareData();
        }

        @Override
        public Class<ShareData> typeClass() {
            return ShareData.class;
        }

        @Override
        public String messageName() {
            return ShareData.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return ShareData.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(ShareData message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, ShareData instance) throws java.io.IOException {
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
                    	instance.shareLink = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.shareImage = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.shareId = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.shareTitle = input.readString();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.shareDescription = input.readString();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.buildSource = input.readString();
                    	instance.__bitField0 |= 32;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, ShareData instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.shareLink, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.shareImage, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.shareId, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeString(4, instance.shareTitle, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeString(5, instance.shareDescription, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeString(6, instance.buildSource, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "shareLink";
        		case 2: return "shareImage";
        		case 3: return "shareId";
        		case 4: return "shareTitle";
        		case 5: return "shareDescription";
        		case 6: return "buildSource";
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

        private String shareLink;

        private String shareImage;

        private int shareId;

        private String shareTitle;

        private String shareDescription;

        private String buildSource;

        private int __bitField0;

        private Builder() {
            this.shareLink = "";
            this.shareImage = "";
            this.shareId = 0;
            this.shareTitle = "";
            this.shareDescription = "";
            this.buildSource = "";
        }

        public Builder mergeFrom(ShareData instance) {
            if (instance.hasShareLink()) {
                this.setShareLink(instance.getShareLink());
            }

            if (instance.hasShareImage()) {
                this.setShareImage(instance.getShareImage());
            }

            if (instance.hasShareId()) {
                this.setShareId(instance.getShareId());
            }

            if (instance.hasShareTitle()) {
                this.setShareTitle(instance.getShareTitle());
            }

            if (instance.hasShareDescription()) {
                this.setShareDescription(instance.getShareDescription());
            }

            if (instance.hasBuildSource()) {
                this.setBuildSource(instance.getBuildSource());
            }

            return this;
        }

        public String getShareLink() {
            return shareLink;
        }

        public Builder setShareLink(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ShareData#shareLink to null");
            }

            this.shareLink = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearShareLink() {
            this.shareLink = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasShareLink() {
            return (__bitField0 & 1) == 1;
        }

        public String getShareImage() {
            return shareImage;
        }

        public Builder setShareImage(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ShareData#shareImage to null");
            }

            this.shareImage = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearShareImage() {
            this.shareImage = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasShareImage() {
            return (__bitField0 & 2) == 2;
        }

        public int getShareId() {
            return shareId;
        }

        public Builder setShareId(int value) {
            this.shareId = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearShareId() {
            this.shareId = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasShareId() {
            return (__bitField0 & 4) == 4;
        }

        public String getShareTitle() {
            return shareTitle;
        }

        public Builder setShareTitle(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ShareData#shareTitle to null");
            }

            this.shareTitle = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearShareTitle() {
            this.shareTitle = "";
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasShareTitle() {
            return (__bitField0 & 8) == 8;
        }

        public String getShareDescription() {
            return shareDescription;
        }

        public Builder setShareDescription(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ShareData#shareDescription to null");
            }

            this.shareDescription = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearShareDescription() {
            this.shareDescription = "";
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasShareDescription() {
            return (__bitField0 & 16) == 16;
        }

        public String getBuildSource() {
            return buildSource;
        }

        public Builder setBuildSource(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ShareData#buildSource to null");
            }

            this.buildSource = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearBuildSource() {
            this.buildSource = "";
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasBuildSource() {
            return (__bitField0 & 32) == 32;
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
            if (!java.util.Objects.equals(this.shareLink, that.shareLink)) {
                return false;
            }
            if (!java.util.Objects.equals(this.shareImage, that.shareImage)) {
                return false;
            }
            if (!java.util.Objects.equals(this.shareId, that.shareId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.shareTitle, that.shareTitle)) {
                return false;
            }
            if (!java.util.Objects.equals(this.shareDescription, that.shareDescription)) {
                return false;
            }
            if (!java.util.Objects.equals(this.buildSource, that.buildSource)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.shareLink == null ? 0 : this.shareLink.hashCode());
            result = 31 * result + (this.shareImage == null ? 0 : this.shareImage.hashCode());
            result = 31 * result + Integer.hashCode(this.shareId);
            result = 31 * result + (this.shareTitle == null ? 0 : this.shareTitle.hashCode());
            result = 31 * result + (this.shareDescription == null ? 0 : this.shareDescription.hashCode());
            result = 31 * result + (this.buildSource == null ? 0 : this.buildSource.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasShareLink()) {
                parts.add("shareLink=" + getShareLink());
            }
            if (hasShareImage()) {
                parts.add("shareImage=" + getShareImage());
            }
            if (hasShareId()) {
                parts.add("shareId=" + getShareId());
            }
            if (hasShareTitle()) {
                parts.add("shareTitle=" + getShareTitle());
            }
            if (hasShareDescription()) {
                parts.add("shareDescription=" + getShareDescription());
            }
            if (hasBuildSource()) {
                parts.add("buildSource=" + getBuildSource());
            }
            return "ShareData{" + String.join(", ", parts) + "}";
        }

        public ShareData build() {
            proto.message.ShareData result = new proto.message.ShareData();
            result.__bitField0 = __bitField0;
            result.shareLink = this.shareLink;
            result.shareImage = this.shareImage;
            result.shareId = this.shareId;
            result.shareTitle = this.shareTitle;
            result.shareDescription = this.shareDescription;
            result.buildSource = this.buildSource;
            return result;
        }

    }



}