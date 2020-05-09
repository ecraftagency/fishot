package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class SoccerMatchesResponse
        implements io.protostuff.Message<SoccerMatchesResponse> {

    private static final SoccerMatchesResponse DEFAULT_INSTANCE = newBuilder().build();

    private int result;

    private java.util.List<proto.message.SoccerInfo> infos;

    private int type;

    private int hisReddot;

    private boolean __merge_lock = false;
    private int __bitField0;

    private SoccerMatchesResponse() {
        this.result = proto.message.SoccerResult.RESULT_SUCCESS.getNumber();
        this.infos = java.util.Collections.emptyList();
        this.type = proto.message.SoccerMatchType.MATCH_TYPE_NEXT_MATCHES.getNumber();
        this.hisReddot = 0;
    }

    private SoccerMatchesResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static SoccerMatchesResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<SoccerMatchesResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public proto.message.SoccerResult getResult() {
        return proto.message.SoccerResult.valueOf(result);
    }

    public int getResultValue() {
        return result;
    }

    public boolean hasResult() {
        return (__bitField0 & 1) == 1;
    }

    public SoccerMatchesResponse withResult(proto.message.SoccerResult value) {
        return SoccerMatchesResponse.newBuilder()
            .mergeFrom(this)
            .setResult(value)
            .build();
    }

    public java.util.List<proto.message.SoccerInfo> getInfosList() {
        return infos;
    }

    public int getInfosCount() {
        return infos.size();
    }

    public proto.message.SoccerInfo getInfos(int index) {
        return infos.get(index);
    }

    public SoccerMatchesResponse withInfos(java.util.List<proto.message.SoccerInfo> value) {
        return SoccerMatchesResponse.newBuilder()
            .mergeFrom(this)
            .clearInfos()
            .addAllInfos(value)
            .build();
    }

    public proto.message.SoccerMatchType getType() {
        return proto.message.SoccerMatchType.valueOf(type);
    }

    public int getTypeValue() {
        return type;
    }

    public boolean hasType() {
        return (__bitField0 & 4) == 4;
    }

    public SoccerMatchesResponse withType(proto.message.SoccerMatchType value) {
        return SoccerMatchesResponse.newBuilder()
            .mergeFrom(this)
            .setType(value)
            .build();
    }

    public int getHisReddot() {
        return hisReddot;
    }

    public boolean hasHisReddot() {
        return (__bitField0 & 8) == 8;
    }

    public SoccerMatchesResponse withHisReddot(int value) {
        return SoccerMatchesResponse.newBuilder()
            .mergeFrom(this)
            .setHisReddot(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<SoccerMatchesResponse> cachedSchema() {
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
        SoccerMatchesResponse that = (SoccerMatchesResponse) obj;
        if (!java.util.Objects.equals(this.result, that.result)) {
            return false;
        }
        if (!java.util.Objects.equals(this.infos, that.infos)) {
            return false;
        }
        if (!java.util.Objects.equals(this.type, that.type)) {
            return false;
        }
        if (!java.util.Objects.equals(this.hisReddot, that.hisReddot)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.result);
        result = 31 * result + (this.infos == null ? 0 : this.infos.hashCode());
        result = 31 * result + Integer.hashCode(this.type);
        result = 31 * result + Integer.hashCode(this.hisReddot);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasResult()) {
            parts.add("result=" + getResult() + '(' + getResultValue() + ')');
        }
        if (!infos.isEmpty()) {
            parts.add("infos=" + getInfosList());
        }
        if (hasType()) {
            parts.add("type=" + getType() + '(' + getTypeValue() + ')');
        }
        if (hasHisReddot()) {
            parts.add("hisReddot=" + getHisReddot());
        }
        return "SoccerMatchesResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<SoccerMatchesResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("result", 1);
        	__fieldMap.put("infos", 2);
        	__fieldMap.put("type", 3);
        	__fieldMap.put("hisReddot", 4);
        }

        @Override
        public SoccerMatchesResponse newMessage() {
            return new SoccerMatchesResponse();
        }

        @Override
        public Class<SoccerMatchesResponse> typeClass() {
            return SoccerMatchesResponse.class;
        }

        @Override
        public String messageName() {
            return SoccerMatchesResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return SoccerMatchesResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(SoccerMatchesResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, SoccerMatchesResponse instance) throws java.io.IOException {
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
                    	instance.result = input.readEnum();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	if(!((instance.__bitField0 & 2) == 2)) {
                    	    instance.infos = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 2;
                    	}
                    	instance.infos.add(input.mergeObject(null, proto.message.SoccerInfo.getSchema()));

                    	break;
                    case 3:
                    	instance.type = input.readEnum();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.hisReddot = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 2) == 2) {
                instance.infos = java.util.Collections.unmodifiableList(instance.infos);
            }



        }

        @Override
        public void writeTo(io.protostuff.Output output, SoccerMatchesResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.result, false);
            }

            for(proto.message.SoccerInfo infos : instance.infos) {
                output.writeObject(2, infos, proto.message.SoccerInfo.getSchema(), true);
            }

            if((instance.__bitField0 & 4) == 4) {
            	output.writeEnum(3, instance.type, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.hisReddot, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "result";
        		case 2: return "infos";
        		case 3: return "type";
        		case 4: return "hisReddot";
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

        private java.util.List<proto.message.SoccerInfo> infos;

        private int type;

        private int hisReddot;

        private int __bitField0;

        private Builder() {
            this.result = proto.message.SoccerResult.RESULT_SUCCESS.getNumber();
            this.infos = java.util.Collections.emptyList();
            this.type = proto.message.SoccerMatchType.MATCH_TYPE_NEXT_MATCHES.getNumber();
            this.hisReddot = 0;
        }

        public Builder mergeFrom(SoccerMatchesResponse instance) {
            if (instance.hasResult()) {
                this.setResult(instance.getResult());
            }

            this.addAllInfos(instance.getInfosList());

            if (instance.hasType()) {
                this.setType(instance.getType());
            }

            if (instance.hasHisReddot()) {
                this.setHisReddot(instance.getHisReddot());
            }

            return this;
        }

        public proto.message.SoccerResult getResult() {
            return proto.message.SoccerResult.valueOf(result);
        }

        public int getResultValue() {
            return result;
        }

        public Builder setResult(proto.message.SoccerResult value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SoccerMatchesResponse#result to null");
            }

            if (value == proto.message.SoccerResult.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set SoccerMatchesResponse#result to UNRECOGNIZED");
            }

            this.result = value.getNumber();
            __bitField0 |= 1;
            return this;
        }

        public Builder setResultValue(int value) {
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

        public java.util.List<proto.message.SoccerInfo> getInfosList() {
            return infos;
        }

        public Builder setInfos(int index, proto.message.SoccerInfo value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SoccerMatchesResponse#infos to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.infos = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.infos.set(index, value);
            return this;
        }

        public Builder addInfos(proto.message.SoccerInfo value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SoccerMatchesResponse#infos to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.infos = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.infos.add(value);
            return this;
        }

        public Builder addAllInfos(java.lang.Iterable<proto.message.SoccerInfo> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set SoccerMatchesResponse#infos to null");
            }
            if(!((__bitField0 & 2) == 2)) {
                this.infos = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            for (final proto.message.SoccerInfo value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set SoccerMatchesResponse#infos to null");
                }
                this.infos.add(value);
            }
            return this;
        }

        public Builder clearInfos() {
            this.infos = java.util.Collections.emptyList();
            __bitField0 &= ~2;
            return this;
        }

        public int getInfosCount() {
            return infos.size();
        }

        public proto.message.SoccerInfo getInfos(int index) {
            return infos.get(index);
        }

        public proto.message.SoccerMatchType getType() {
            return proto.message.SoccerMatchType.valueOf(type);
        }

        public int getTypeValue() {
            return type;
        }

        public Builder setType(proto.message.SoccerMatchType value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SoccerMatchesResponse#type to null");
            }

            if (value == proto.message.SoccerMatchType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set SoccerMatchesResponse#type to UNRECOGNIZED");
            }

            this.type = value.getNumber();
            __bitField0 |= 4;
            return this;
        }

        public Builder setTypeValue(int value) {
            this.type = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearType() {
            this.type = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasType() {
            return (__bitField0 & 4) == 4;
        }

        public int getHisReddot() {
            return hisReddot;
        }

        public Builder setHisReddot(int value) {
            this.hisReddot = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearHisReddot() {
            this.hisReddot = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasHisReddot() {
            return (__bitField0 & 8) == 8;
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
            if (!java.util.Objects.equals(this.infos, that.infos)) {
                return false;
            }
            if (!java.util.Objects.equals(this.type, that.type)) {
                return false;
            }
            if (!java.util.Objects.equals(this.hisReddot, that.hisReddot)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.result);
            result = 31 * result + (this.infos == null ? 0 : this.infos.hashCode());
            result = 31 * result + Integer.hashCode(this.type);
            result = 31 * result + Integer.hashCode(this.hisReddot);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasResult()) {
                parts.add("result=" + getResult() + '(' + getResultValue() + ')');
            }
            if (!infos.isEmpty()) {
                parts.add("infos=" + getInfosList());
            }
            if (hasType()) {
                parts.add("type=" + getType() + '(' + getTypeValue() + ')');
            }
            if (hasHisReddot()) {
                parts.add("hisReddot=" + getHisReddot());
            }
            return "SoccerMatchesResponse{" + String.join(", ", parts) + "}";
        }

        public SoccerMatchesResponse build() {
            proto.message.SoccerMatchesResponse result = new proto.message.SoccerMatchesResponse();
            result.__bitField0 = __bitField0;
            result.result = this.result;
            result.infos = java.util.Collections.unmodifiableList(this.infos);
            result.type = this.type;
            result.hisReddot = this.hisReddot;
            return result;
        }

    }



}