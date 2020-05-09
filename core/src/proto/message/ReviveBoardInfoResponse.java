package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class ReviveBoardInfoResponse
        implements io.protostuff.Message<ReviveBoardInfoResponse> {

    private static final ReviveBoardInfoResponse DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<proto.message.ReviveBoardInfoResponse.ReviveBoardInfo> infor;

    private boolean __merge_lock = false;
    private int __bitField0;

    private ReviveBoardInfoResponse() {
        this.infor = java.util.Collections.emptyList();
    }

    private ReviveBoardInfoResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ReviveBoardInfoResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<ReviveBoardInfoResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<proto.message.ReviveBoardInfoResponse.ReviveBoardInfo> getInforList() {
        return infor;
    }

    public int getInforCount() {
        return infor.size();
    }

    public proto.message.ReviveBoardInfoResponse.ReviveBoardInfo getInfor(int index) {
        return infor.get(index);
    }

    public ReviveBoardInfoResponse withInfor(java.util.List<proto.message.ReviveBoardInfoResponse.ReviveBoardInfo> value) {
        return ReviveBoardInfoResponse.newBuilder()
            .mergeFrom(this)
            .clearInfor()
            .addAllInfor(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<ReviveBoardInfoResponse> cachedSchema() {
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
        ReviveBoardInfoResponse that = (ReviveBoardInfoResponse) obj;
        if (!java.util.Objects.equals(this.infor, that.infor)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.infor == null ? 0 : this.infor.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!infor.isEmpty()) {
            parts.add("infor=" + getInforList());
        }
        return "ReviveBoardInfoResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<ReviveBoardInfoResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("infor", 1);
        }

        @Override
        public ReviveBoardInfoResponse newMessage() {
            return new ReviveBoardInfoResponse();
        }

        @Override
        public Class<ReviveBoardInfoResponse> typeClass() {
            return ReviveBoardInfoResponse.class;
        }

        @Override
        public String messageName() {
            return ReviveBoardInfoResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return ReviveBoardInfoResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(ReviveBoardInfoResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, ReviveBoardInfoResponse instance) throws java.io.IOException {
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
                    	    instance.infor = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.infor.add(input.mergeObject(null, proto.message.ReviveBoardInfoResponse.ReviveBoardInfo.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.infor = java.util.Collections.unmodifiableList(instance.infor);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, ReviveBoardInfoResponse instance) throws java.io.IOException {
            for(proto.message.ReviveBoardInfoResponse.ReviveBoardInfo infor : instance.infor) {
                output.writeObject(1, infor, proto.message.ReviveBoardInfoResponse.ReviveBoardInfo.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "infor";
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

        private java.util.List<proto.message.ReviveBoardInfoResponse.ReviveBoardInfo> infor;

        private int __bitField0;

        private Builder() {
            this.infor = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(ReviveBoardInfoResponse instance) {
            this.addAllInfor(instance.getInforList());

            return this;
        }

        public java.util.List<proto.message.ReviveBoardInfoResponse.ReviveBoardInfo> getInforList() {
            return infor;
        }

        public Builder setInfor(int index, proto.message.ReviveBoardInfoResponse.ReviveBoardInfo value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ReviveBoardInfoResponse#infor to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.infor = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.infor.set(index, value);
            return this;
        }

        public Builder addInfor(proto.message.ReviveBoardInfoResponse.ReviveBoardInfo value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ReviveBoardInfoResponse#infor to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.infor = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.infor.add(value);
            return this;
        }

        public Builder addAllInfor(java.lang.Iterable<proto.message.ReviveBoardInfoResponse.ReviveBoardInfo> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set ReviveBoardInfoResponse#infor to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.infor = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final proto.message.ReviveBoardInfoResponse.ReviveBoardInfo value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set ReviveBoardInfoResponse#infor to null");
                }
                this.infor.add(value);
            }
            return this;
        }

        public Builder clearInfor() {
            this.infor = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getInforCount() {
            return infor.size();
        }

        public proto.message.ReviveBoardInfoResponse.ReviveBoardInfo getInfor(int index) {
            return infor.get(index);
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
            if (!java.util.Objects.equals(this.infor, that.infor)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.infor == null ? 0 : this.infor.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!infor.isEmpty()) {
                parts.add("infor=" + getInforList());
            }
            return "ReviveBoardInfoResponse{" + String.join(", ", parts) + "}";
        }

        public ReviveBoardInfoResponse build() {
            proto.message.ReviveBoardInfoResponse result = new proto.message.ReviveBoardInfoResponse();
            result.__bitField0 = __bitField0;
            result.infor = java.util.Collections.unmodifiableList(this.infor);
            return result;
        }

    }

    public static final class ReviveBoardInfo
            implements io.protostuff.Message<ReviveBoardInfo> {

        private static final ReviveBoardInfo DEFAULT_INSTANCE = newBuilder().build();

        private String userid;

        private int point;

        private int bullet;

        private boolean __merge_lock = false;
        private int __bitField0;

        private ReviveBoardInfo() {
            this.userid = "";
            this.point = 0;
            this.bullet = 0;
        }

        private ReviveBoardInfo(Builder builder) {
            __merge_lock = true;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public static ReviveBoardInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static io.protostuff.Schema<ReviveBoardInfo> getSchema()
        {
        	return Schema.INSTANCE;
        }

        public String getUserid() {
            return userid;
        }

        public boolean hasUserid() {
            return (__bitField0 & 1) == 1;
        }

        public ReviveBoardInfo withUserid(String value) {
            return ReviveBoardInfo.newBuilder()
                .mergeFrom(this)
                .setUserid(value)
                .build();
        }

        public int getPoint() {
            return point;
        }

        public boolean hasPoint() {
            return (__bitField0 & 2) == 2;
        }

        public ReviveBoardInfo withPoint(int value) {
            return ReviveBoardInfo.newBuilder()
                .mergeFrom(this)
                .setPoint(value)
                .build();
        }

        public int getBullet() {
            return bullet;
        }

        public boolean hasBullet() {
            return (__bitField0 & 4) == 4;
        }

        public ReviveBoardInfo withBullet(int value) {
            return ReviveBoardInfo.newBuilder()
                .mergeFrom(this)
                .setBullet(value)
                .build();
        }



        @Override
        public io.protostuff.Schema<ReviveBoardInfo> cachedSchema() {
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
            ReviveBoardInfo that = (ReviveBoardInfo) obj;
            if (!java.util.Objects.equals(this.userid, that.userid)) {
                return false;
            }
            if (!java.util.Objects.equals(this.point, that.point)) {
                return false;
            }
            if (!java.util.Objects.equals(this.bullet, that.bullet)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.userid == null ? 0 : this.userid.hashCode());
            result = 31 * result + Integer.hashCode(this.point);
            result = 31 * result + Integer.hashCode(this.bullet);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasUserid()) {
                parts.add("userid=" + getUserid());
            }
            if (hasPoint()) {
                parts.add("point=" + getPoint());
            }
            if (hasBullet()) {
                parts.add("bullet=" + getBullet());
            }
            return "ReviveBoardInfo{" + String.join(", ", parts) + "}";
        }

        public static final class Schema implements io.protostuff.Schema<ReviveBoardInfo>{

            private static final Schema INSTANCE = new Schema();

            private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

            static {
            	__fieldMap.put("userid", 1);
            	__fieldMap.put("point", 2);
            	__fieldMap.put("bullet", 3);
            }

            @Override
            public ReviveBoardInfo newMessage() {
                return new ReviveBoardInfo();
            }

            @Override
            public Class<ReviveBoardInfo> typeClass() {
                return ReviveBoardInfo.class;
            }

            @Override
            public String messageName() {
                return ReviveBoardInfo.class.getSimpleName();
            }

            @Override
            public String messageFullName() {
                return ReviveBoardInfo.class.getName();
            }

            @Override
            @Deprecated
            public boolean isInitialized(ReviveBoardInfo message) {
                return true;
            }

            @Override
            public void mergeFrom(io.protostuff.Input input, ReviveBoardInfo instance) throws java.io.IOException {
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
                        	instance.point = input.readInt32();
                        	instance.__bitField0 |= 2;
                        	break;
                        case 3:
                        	instance.bullet = input.readInt32();
                        	instance.__bitField0 |= 4;
                        	break;
                        default:
                            input.handleUnknownField(number, this);
                    }
            	}
            }

            @Override
            public void writeTo(io.protostuff.Output output, ReviveBoardInfo instance) throws java.io.IOException {
                if((instance.__bitField0 & 1) == 1) {
                    output.writeString(1, instance.userid, false);
                }

                if((instance.__bitField0 & 2) == 2) {
                    output.writeInt32(2, instance.point, false);
                }

                if((instance.__bitField0 & 4) == 4) {
                    output.writeInt32(3, instance.bullet, false);
                }

            }

            @Override
            public String getFieldName(int number) {
            	switch(number) {
            		case 1: return "userid";
            		case 2: return "point";
            		case 3: return "bullet";
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

            private int point;

            private int bullet;

            private int __bitField0;

            private Builder() {
                this.userid = "";
                this.point = 0;
                this.bullet = 0;
            }

            public Builder mergeFrom(ReviveBoardInfo instance) {
                if (instance.hasUserid()) {
                    this.setUserid(instance.getUserid());
                }

                if (instance.hasPoint()) {
                    this.setPoint(instance.getPoint());
                }

                if (instance.hasBullet()) {
                    this.setBullet(instance.getBullet());
                }

                return this;
            }

            public String getUserid() {
                return userid;
            }

            public Builder setUserid(String value) {
                if (value == null) {
                    throw new NullPointerException("Cannot set ReviveBoardInfo#userid to null");
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

            public int getPoint() {
                return point;
            }

            public Builder setPoint(int value) {
                this.point = value;
                __bitField0 |= 2;
                return this;
            }

            public Builder clearPoint() {
                this.point = 0;
                __bitField0 &= ~2;
                return this;
            }

            public boolean hasPoint() {
                return (__bitField0 & 2) == 2;
            }

            public int getBullet() {
                return bullet;
            }

            public Builder setBullet(int value) {
                this.bullet = value;
                __bitField0 |= 4;
                return this;
            }

            public Builder clearBullet() {
                this.bullet = 0;
                __bitField0 &= ~4;
                return this;
            }

            public boolean hasBullet() {
                return (__bitField0 & 4) == 4;
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
                if (!java.util.Objects.equals(this.point, that.point)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.bullet, that.bullet)) {
                    return false;
                }

                return true;
            }

            @Override
            public int hashCode() {
                int result = 1;
                result = 31 * result + (this.userid == null ? 0 : this.userid.hashCode());
                result = 31 * result + Integer.hashCode(this.point);
                result = 31 * result + Integer.hashCode(this.bullet);

                return result;
            }

            @Override
            public String toString() {
                java.util.List<String> parts = new java.util.ArrayList<>();
                if (hasUserid()) {
                    parts.add("userid=" + getUserid());
                }
                if (hasPoint()) {
                    parts.add("point=" + getPoint());
                }
                if (hasBullet()) {
                    parts.add("bullet=" + getBullet());
                }
                return "ReviveBoardInfo{" + String.join(", ", parts) + "}";
            }

            public ReviveBoardInfo build() {
                proto.message.ReviveBoardInfoResponse.ReviveBoardInfo result = new proto.message.ReviveBoardInfoResponse.ReviveBoardInfo();
                result.__bitField0 = __bitField0;
                result.userid = this.userid;
                result.point = this.point;
                result.bullet = this.bullet;
                return result;
            }

        }



    }


}