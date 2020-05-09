package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class ClaimCollectionPrizeResponse
        implements io.protostuff.Message<ClaimCollectionPrizeResponse> {

    private static final ClaimCollectionPrizeResponse DEFAULT_INSTANCE = newBuilder().build();

    private int result;

    private int gold;

    private java.util.List<proto.message.CollectionPrizeResponse> listPrize;

    private boolean __merge_lock = false;
    private int __bitField0;

    private ClaimCollectionPrizeResponse() {
        this.result = 0;
        this.gold = 0;
        this.listPrize = java.util.Collections.emptyList();
    }

    private ClaimCollectionPrizeResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ClaimCollectionPrizeResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<ClaimCollectionPrizeResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getResult() {
        return result;
    }

    public boolean hasResult() {
        return (__bitField0 & 1) == 1;
    }

    public ClaimCollectionPrizeResponse withResult(int value) {
        return ClaimCollectionPrizeResponse.newBuilder()
            .mergeFrom(this)
            .setResult(value)
            .build();
    }

    public int getGold() {
        return gold;
    }

    public boolean hasGold() {
        return (__bitField0 & 2) == 2;
    }

    public ClaimCollectionPrizeResponse withGold(int value) {
        return ClaimCollectionPrizeResponse.newBuilder()
            .mergeFrom(this)
            .setGold(value)
            .build();
    }

    public java.util.List<proto.message.CollectionPrizeResponse> getListPrizeList() {
        return listPrize;
    }

    public int getListPrizeCount() {
        return listPrize.size();
    }

    public proto.message.CollectionPrizeResponse getListPrize(int index) {
        return listPrize.get(index);
    }

    public ClaimCollectionPrizeResponse withListPrize(java.util.List<proto.message.CollectionPrizeResponse> value) {
        return ClaimCollectionPrizeResponse.newBuilder()
            .mergeFrom(this)
            .clearListPrize()
            .addAllListPrize(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<ClaimCollectionPrizeResponse> cachedSchema() {
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
        ClaimCollectionPrizeResponse that = (ClaimCollectionPrizeResponse) obj;
        if (!java.util.Objects.equals(this.result, that.result)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gold, that.gold)) {
            return false;
        }
        if (!java.util.Objects.equals(this.listPrize, that.listPrize)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.result);
        result = 31 * result + Integer.hashCode(this.gold);
        result = 31 * result + (this.listPrize == null ? 0 : this.listPrize.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasResult()) {
            parts.add("result=" + getResult());
        }
        if (hasGold()) {
            parts.add("gold=" + getGold());
        }
        if (!listPrize.isEmpty()) {
            parts.add("listPrize=" + getListPrizeList());
        }
        return "ClaimCollectionPrizeResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<ClaimCollectionPrizeResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("result", 1);
        	__fieldMap.put("gold", 2);
        	__fieldMap.put("listPrize", 3);
        }

        @Override
        public ClaimCollectionPrizeResponse newMessage() {
            return new ClaimCollectionPrizeResponse();
        }

        @Override
        public Class<ClaimCollectionPrizeResponse> typeClass() {
            return ClaimCollectionPrizeResponse.class;
        }

        @Override
        public String messageName() {
            return ClaimCollectionPrizeResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return ClaimCollectionPrizeResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(ClaimCollectionPrizeResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, ClaimCollectionPrizeResponse instance) throws java.io.IOException {
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
                    	instance.result = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.gold = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	if(!((instance.__bitField0 & 4) == 4)) {
                    	    instance.listPrize = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 4;
                    	}
                    	instance.listPrize.add(input.mergeObject(null, proto.message.CollectionPrizeResponse.getSchema()));

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 4) == 4) {
                instance.listPrize = java.util.Collections.unmodifiableList(instance.listPrize);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, ClaimCollectionPrizeResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.result, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.gold, false);
            }

            for(proto.message.CollectionPrizeResponse listPrize : instance.listPrize) {
                output.writeObject(3, listPrize, proto.message.CollectionPrizeResponse.getSchema(), true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "result";
        		case 2: return "gold";
        		case 3: return "listPrize";
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

        private int result;

        private int gold;

        private java.util.List<proto.message.CollectionPrizeResponse> listPrize;

        private int __bitField0;

        private Builder() {
            this.result = 0;
            this.gold = 0;
            this.listPrize = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(ClaimCollectionPrizeResponse instance) {
            if (instance.hasResult()) {
                this.setResult(instance.getResult());
            }

            if (instance.hasGold()) {
                this.setGold(instance.getGold());
            }

            this.addAllListPrize(instance.getListPrizeList());

            return this;
        }

        public int getResult() {
            return result;
        }

        public Builder setResult(int value) {
            this.result = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearResult() {
            this.result = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasResult() {
            return (__bitField0 & 1) == 1;
        }

        public int getGold() {
            return gold;
        }

        public Builder setGold(int value) {
            this.gold = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearGold() {
            this.gold = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasGold() {
            return (__bitField0 & 2) == 2;
        }

        public java.util.List<proto.message.CollectionPrizeResponse> getListPrizeList() {
            return listPrize;
        }

        public Builder setListPrize(int index, proto.message.CollectionPrizeResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ClaimCollectionPrizeResponse#listPrize to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.listPrize = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.listPrize.set(index, value);
            return this;
        }

        public Builder addListPrize(proto.message.CollectionPrizeResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ClaimCollectionPrizeResponse#listPrize to null");
            }

            if(!((__bitField0 & 4) == 4)) {
                this.listPrize = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            this.listPrize.add(value);
            return this;
        }

        public Builder addAllListPrize(java.lang.Iterable<proto.message.CollectionPrizeResponse> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set ClaimCollectionPrizeResponse#listPrize to null");
            }
            if(!((__bitField0 & 4) == 4)) {
                this.listPrize = new java.util.ArrayList<>();
                __bitField0 |= 4;
            }
            for (final proto.message.CollectionPrizeResponse value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set ClaimCollectionPrizeResponse#listPrize to null");
                }
                this.listPrize.add(value);
            }
            return this;
        }

        public Builder clearListPrize() {
            this.listPrize = java.util.Collections.emptyList();
            __bitField0 &= ~4;
            return this;
        }

        public int getListPrizeCount() {
            return listPrize.size();
        }

        public proto.message.CollectionPrizeResponse getListPrize(int index) {
            return listPrize.get(index);
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
            if (!java.util.Objects.equals(this.result, that.result)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gold, that.gold)) {
                return false;
            }
            if (!java.util.Objects.equals(this.listPrize, that.listPrize)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.result);
            result = 31 * result + Integer.hashCode(this.gold);
            result = 31 * result + (this.listPrize == null ? 0 : this.listPrize.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasResult()) {
                parts.add("result=" + getResult());
            }
            if (hasGold()) {
                parts.add("gold=" + getGold());
            }
            if (!listPrize.isEmpty()) {
                parts.add("listPrize=" + getListPrizeList());
            }
            return "ClaimCollectionPrizeResponse{" + String.join(", ", parts) + "}";
        }

        public ClaimCollectionPrizeResponse build() {
            proto.message.ClaimCollectionPrizeResponse result = new proto.message.ClaimCollectionPrizeResponse();
            result.__bitField0 = __bitField0;
            result.result = this.result;
            result.gold = this.gold;
            result.listPrize = java.util.Collections.unmodifiableList(this.listPrize);
            return result;
        }

    }



}