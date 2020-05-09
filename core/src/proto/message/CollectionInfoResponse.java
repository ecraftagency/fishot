package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class CollectionInfoResponse
        implements io.protostuff.Message<CollectionInfoResponse> {

    private static final CollectionInfoResponse DEFAULT_INSTANCE = newBuilder().build();

    private java.util.List<proto.message.CollectionDataResponse> listCollectionData;

    private boolean __merge_lock = false;
    private int __bitField0;

    private CollectionInfoResponse() {
        this.listCollectionData = java.util.Collections.emptyList();
    }

    private CollectionInfoResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static CollectionInfoResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<CollectionInfoResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public java.util.List<proto.message.CollectionDataResponse> getListCollectionDataList() {
        return listCollectionData;
    }

    public int getListCollectionDataCount() {
        return listCollectionData.size();
    }

    public proto.message.CollectionDataResponse getListCollectionData(int index) {
        return listCollectionData.get(index);
    }

    public CollectionInfoResponse withListCollectionData(java.util.List<proto.message.CollectionDataResponse> value) {
        return CollectionInfoResponse.newBuilder()
            .mergeFrom(this)
            .clearListCollectionData()
            .addAllListCollectionData(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<CollectionInfoResponse> cachedSchema() {
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
        CollectionInfoResponse that = (CollectionInfoResponse) obj;
        if (!java.util.Objects.equals(this.listCollectionData, that.listCollectionData)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.listCollectionData == null ? 0 : this.listCollectionData.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (!listCollectionData.isEmpty()) {
            parts.add("listCollectionData=" + getListCollectionDataList());
        }
        return "CollectionInfoResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<CollectionInfoResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("listCollectionData", 1);
        }

        @Override
        public CollectionInfoResponse newMessage() {
            return new CollectionInfoResponse();
        }

        @Override
        public Class<CollectionInfoResponse> typeClass() {
            return CollectionInfoResponse.class;
        }

        @Override
        public String messageName() {
            return CollectionInfoResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return CollectionInfoResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(CollectionInfoResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, CollectionInfoResponse instance) throws java.io.IOException {
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
                    	    instance.listCollectionData = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1;
                    	}
                    	instance.listCollectionData.add(input.mergeObject(null, proto.message.CollectionDataResponse.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 1) == 1) {
                instance.listCollectionData = java.util.Collections.unmodifiableList(instance.listCollectionData);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, CollectionInfoResponse instance) throws java.io.IOException {
            for(proto.message.CollectionDataResponse listCollectionData : instance.listCollectionData) {
                output.writeObject(1, listCollectionData, proto.message.CollectionDataResponse.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "listCollectionData";
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

        private java.util.List<proto.message.CollectionDataResponse> listCollectionData;

        private int __bitField0;

        private Builder() {
            this.listCollectionData = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(CollectionInfoResponse instance) {
            this.addAllListCollectionData(instance.getListCollectionDataList());

            return this;
        }

        public java.util.List<proto.message.CollectionDataResponse> getListCollectionDataList() {
            return listCollectionData;
        }

        public Builder setListCollectionData(int index, proto.message.CollectionDataResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set CollectionInfoResponse#listCollectionData to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.listCollectionData = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.listCollectionData.set(index, value);
            return this;
        }

        public Builder addListCollectionData(proto.message.CollectionDataResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set CollectionInfoResponse#listCollectionData to null");
            }

            if(!((__bitField0 & 1) == 1)) {
                this.listCollectionData = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            this.listCollectionData.add(value);
            return this;
        }

        public Builder addAllListCollectionData(java.lang.Iterable<proto.message.CollectionDataResponse> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set CollectionInfoResponse#listCollectionData to null");
            }
            if(!((__bitField0 & 1) == 1)) {
                this.listCollectionData = new java.util.ArrayList<>();
                __bitField0 |= 1;
            }
            for (final proto.message.CollectionDataResponse value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set CollectionInfoResponse#listCollectionData to null");
                }
                this.listCollectionData.add(value);
            }
            return this;
        }

        public Builder clearListCollectionData() {
            this.listCollectionData = java.util.Collections.emptyList();
            __bitField0 &= ~1;
            return this;
        }

        public int getListCollectionDataCount() {
            return listCollectionData.size();
        }

        public proto.message.CollectionDataResponse getListCollectionData(int index) {
            return listCollectionData.get(index);
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
            if (!java.util.Objects.equals(this.listCollectionData, that.listCollectionData)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.listCollectionData == null ? 0 : this.listCollectionData.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (!listCollectionData.isEmpty()) {
                parts.add("listCollectionData=" + getListCollectionDataList());
            }
            return "CollectionInfoResponse{" + String.join(", ", parts) + "}";
        }

        public CollectionInfoResponse build() {
            proto.message.CollectionInfoResponse result = new proto.message.CollectionInfoResponse();
            result.__bitField0 = __bitField0;
            result.listCollectionData = java.util.Collections.unmodifiableList(this.listCollectionData);
            return result;
        }

    }



}