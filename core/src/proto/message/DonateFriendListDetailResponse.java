package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class DonateFriendListDetailResponse
        implements io.protostuff.Message<DonateFriendListDetailResponse> {

    private static final DonateFriendListDetailResponse DEFAULT_INSTANCE = newBuilder().build();

    private int result;

    private java.util.List<proto.message.DonateFriendDetail> friendDonateDetail;

    private int numberSendDonate;

    private int numberReceiveDonate;

    private int numberMaxSendDonate;

    private int numberMaxReceiveDonate;

    private int numberMaxFriendsSent;

    private boolean __merge_lock = false;
    private int __bitField0;

    private DonateFriendListDetailResponse() {
        this.result = proto.message.ProfileResultCode.PROFILE_CLAIM_INBOX_OK.getNumber();
        this.friendDonateDetail = java.util.Collections.emptyList();
        this.numberSendDonate = 0;
        this.numberReceiveDonate = 0;
        this.numberMaxSendDonate = 0;
        this.numberMaxReceiveDonate = 0;
        this.numberMaxFriendsSent = 0;
    }

    private DonateFriendListDetailResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static DonateFriendListDetailResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<DonateFriendListDetailResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public proto.message.ProfileResultCode getResult() {
        return proto.message.ProfileResultCode.valueOf(result);
    }

    public int getResultValue() {
        return result;
    }

    public boolean hasResult() {
        return (__bitField0 & 1) == 1;
    }

    public DonateFriendListDetailResponse withResult(proto.message.ProfileResultCode value) {
        return DonateFriendListDetailResponse.newBuilder()
            .mergeFrom(this)
            .setResult(value)
            .build();
    }

    public java.util.List<proto.message.DonateFriendDetail> getFriendDonateDetailList() {
        return friendDonateDetail;
    }

    public int getFriendDonateDetailCount() {
        return friendDonateDetail.size();
    }

    public proto.message.DonateFriendDetail getFriendDonateDetail(int index) {
        return friendDonateDetail.get(index);
    }

    public DonateFriendListDetailResponse withFriendDonateDetail(java.util.List<proto.message.DonateFriendDetail> value) {
        return DonateFriendListDetailResponse.newBuilder()
            .mergeFrom(this)
            .clearFriendDonateDetail()
            .addAllFriendDonateDetail(value)
            .build();
    }

    public int getNumberSendDonate() {
        return numberSendDonate;
    }

    public boolean hasNumberSendDonate() {
        return (__bitField0 & 4) == 4;
    }

    public DonateFriendListDetailResponse withNumberSendDonate(int value) {
        return DonateFriendListDetailResponse.newBuilder()
            .mergeFrom(this)
            .setNumberSendDonate(value)
            .build();
    }

    public int getNumberReceiveDonate() {
        return numberReceiveDonate;
    }

    public boolean hasNumberReceiveDonate() {
        return (__bitField0 & 8) == 8;
    }

    public DonateFriendListDetailResponse withNumberReceiveDonate(int value) {
        return DonateFriendListDetailResponse.newBuilder()
            .mergeFrom(this)
            .setNumberReceiveDonate(value)
            .build();
    }

    public int getNumberMaxSendDonate() {
        return numberMaxSendDonate;
    }

    public boolean hasNumberMaxSendDonate() {
        return (__bitField0 & 16) == 16;
    }

    public DonateFriendListDetailResponse withNumberMaxSendDonate(int value) {
        return DonateFriendListDetailResponse.newBuilder()
            .mergeFrom(this)
            .setNumberMaxSendDonate(value)
            .build();
    }

    public int getNumberMaxReceiveDonate() {
        return numberMaxReceiveDonate;
    }

    public boolean hasNumberMaxReceiveDonate() {
        return (__bitField0 & 32) == 32;
    }

    public DonateFriendListDetailResponse withNumberMaxReceiveDonate(int value) {
        return DonateFriendListDetailResponse.newBuilder()
            .mergeFrom(this)
            .setNumberMaxReceiveDonate(value)
            .build();
    }

    public int getNumberMaxFriendsSent() {
        return numberMaxFriendsSent;
    }

    public boolean hasNumberMaxFriendsSent() {
        return (__bitField0 & 64) == 64;
    }

    public DonateFriendListDetailResponse withNumberMaxFriendsSent(int value) {
        return DonateFriendListDetailResponse.newBuilder()
            .mergeFrom(this)
            .setNumberMaxFriendsSent(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<DonateFriendListDetailResponse> cachedSchema() {
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
        DonateFriendListDetailResponse that = (DonateFriendListDetailResponse) obj;
        if (!java.util.Objects.equals(this.result, that.result)) {
            return false;
        }
        if (!java.util.Objects.equals(this.friendDonateDetail, that.friendDonateDetail)) {
            return false;
        }
        if (!java.util.Objects.equals(this.numberSendDonate, that.numberSendDonate)) {
            return false;
        }
        if (!java.util.Objects.equals(this.numberReceiveDonate, that.numberReceiveDonate)) {
            return false;
        }
        if (!java.util.Objects.equals(this.numberMaxSendDonate, that.numberMaxSendDonate)) {
            return false;
        }
        if (!java.util.Objects.equals(this.numberMaxReceiveDonate, that.numberMaxReceiveDonate)) {
            return false;
        }
        if (!java.util.Objects.equals(this.numberMaxFriendsSent, that.numberMaxFriendsSent)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.result);
        result = 31 * result + (this.friendDonateDetail == null ? 0 : this.friendDonateDetail.hashCode());
        result = 31 * result + Integer.hashCode(this.numberSendDonate);
        result = 31 * result + Integer.hashCode(this.numberReceiveDonate);
        result = 31 * result + Integer.hashCode(this.numberMaxSendDonate);
        result = 31 * result + Integer.hashCode(this.numberMaxReceiveDonate);
        result = 31 * result + Integer.hashCode(this.numberMaxFriendsSent);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasResult()) {
            parts.add("result=" + getResult() + '(' + getResultValue() + ')');
        }
        if (!friendDonateDetail.isEmpty()) {
            parts.add("friendDonateDetail=" + getFriendDonateDetailList());
        }
        if (hasNumberSendDonate()) {
            parts.add("numberSendDonate=" + getNumberSendDonate());
        }
        if (hasNumberReceiveDonate()) {
            parts.add("numberReceiveDonate=" + getNumberReceiveDonate());
        }
        if (hasNumberMaxSendDonate()) {
            parts.add("numberMaxSendDonate=" + getNumberMaxSendDonate());
        }
        if (hasNumberMaxReceiveDonate()) {
            parts.add("numberMaxReceiveDonate=" + getNumberMaxReceiveDonate());
        }
        if (hasNumberMaxFriendsSent()) {
            parts.add("numberMaxFriendsSent=" + getNumberMaxFriendsSent());
        }
        return "DonateFriendListDetailResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<DonateFriendListDetailResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("result", 1);
        	__fieldMap.put("friendDonateDetail", 2);
        	__fieldMap.put("numberSendDonate", 3);
        	__fieldMap.put("numberReceiveDonate", 4);
        	__fieldMap.put("numberMaxSendDonate", 5);
        	__fieldMap.put("numberMaxReceiveDonate", 6);
        	__fieldMap.put("numberMaxFriendsSent", 7);
        }

        @Override
        public DonateFriendListDetailResponse newMessage() {
            return new DonateFriendListDetailResponse();
        }

        @Override
        public Class<DonateFriendListDetailResponse> typeClass() {
            return DonateFriendListDetailResponse.class;
        }

        @Override
        public String messageName() {
            return DonateFriendListDetailResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return DonateFriendListDetailResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(DonateFriendListDetailResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, DonateFriendListDetailResponse instance) throws java.io.IOException {
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
                    	    instance.friendDonateDetail = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 2;
                    	}
                    	instance.friendDonateDetail.add(input.mergeObject(null, proto.message.DonateFriendDetail.getSchema()));

                    	break;
                    case 3:
                    	instance.numberSendDonate = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.numberReceiveDonate = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.numberMaxSendDonate = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.numberMaxReceiveDonate = input.readInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.numberMaxFriendsSent = input.readInt32();
                    	instance.__bitField0 |= 64;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 2) == 2) {
                instance.friendDonateDetail = java.util.Collections.unmodifiableList(instance.friendDonateDetail);
            }






        }

        @Override
        public void writeTo(io.protostuff.Output output, DonateFriendListDetailResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.result, false);
            }

            for(proto.message.DonateFriendDetail friendDonateDetail : instance.friendDonateDetail) {
                output.writeObject(2, friendDonateDetail, proto.message.DonateFriendDetail.getSchema(), true);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.numberSendDonate, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.numberReceiveDonate, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.numberMaxSendDonate, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeInt32(6, instance.numberMaxReceiveDonate, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeInt32(7, instance.numberMaxFriendsSent, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "result";
        		case 2: return "friendDonateDetail";
        		case 3: return "numberSendDonate";
        		case 4: return "numberReceiveDonate";
        		case 5: return "numberMaxSendDonate";
        		case 6: return "numberMaxReceiveDonate";
        		case 7: return "numberMaxFriendsSent";
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

        private java.util.List<proto.message.DonateFriendDetail> friendDonateDetail;

        private int numberSendDonate;

        private int numberReceiveDonate;

        private int numberMaxSendDonate;

        private int numberMaxReceiveDonate;

        private int numberMaxFriendsSent;

        private int __bitField0;

        private Builder() {
            this.result = proto.message.ProfileResultCode.PROFILE_CLAIM_INBOX_OK.getNumber();
            this.friendDonateDetail = java.util.Collections.emptyList();
            this.numberSendDonate = 0;
            this.numberReceiveDonate = 0;
            this.numberMaxSendDonate = 0;
            this.numberMaxReceiveDonate = 0;
            this.numberMaxFriendsSent = 0;
        }

        public Builder mergeFrom(DonateFriendListDetailResponse instance) {
            if (instance.hasResult()) {
                this.setResult(instance.getResult());
            }

            this.addAllFriendDonateDetail(instance.getFriendDonateDetailList());

            if (instance.hasNumberSendDonate()) {
                this.setNumberSendDonate(instance.getNumberSendDonate());
            }

            if (instance.hasNumberReceiveDonate()) {
                this.setNumberReceiveDonate(instance.getNumberReceiveDonate());
            }

            if (instance.hasNumberMaxSendDonate()) {
                this.setNumberMaxSendDonate(instance.getNumberMaxSendDonate());
            }

            if (instance.hasNumberMaxReceiveDonate()) {
                this.setNumberMaxReceiveDonate(instance.getNumberMaxReceiveDonate());
            }

            if (instance.hasNumberMaxFriendsSent()) {
                this.setNumberMaxFriendsSent(instance.getNumberMaxFriendsSent());
            }

            return this;
        }

        public proto.message.ProfileResultCode getResult() {
            return proto.message.ProfileResultCode.valueOf(result);
        }

        public int getResultValue() {
            return result;
        }

        public Builder setResult(proto.message.ProfileResultCode value) {
            if (value == null) {
                throw new NullPointerException("Cannot set DonateFriendListDetailResponse#result to null");
            }

            if (value == proto.message.ProfileResultCode.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set DonateFriendListDetailResponse#result to UNRECOGNIZED");
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

        public java.util.List<proto.message.DonateFriendDetail> getFriendDonateDetailList() {
            return friendDonateDetail;
        }

        public Builder setFriendDonateDetail(int index, proto.message.DonateFriendDetail value) {
            if (value == null) {
                throw new NullPointerException("Cannot set DonateFriendListDetailResponse#friendDonateDetail to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.friendDonateDetail = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.friendDonateDetail.set(index, value);
            return this;
        }

        public Builder addFriendDonateDetail(proto.message.DonateFriendDetail value) {
            if (value == null) {
                throw new NullPointerException("Cannot set DonateFriendListDetailResponse#friendDonateDetail to null");
            }

            if(!((__bitField0 & 2) == 2)) {
                this.friendDonateDetail = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            this.friendDonateDetail.add(value);
            return this;
        }

        public Builder addAllFriendDonateDetail(java.lang.Iterable<proto.message.DonateFriendDetail> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set DonateFriendListDetailResponse#friendDonateDetail to null");
            }
            if(!((__bitField0 & 2) == 2)) {
                this.friendDonateDetail = new java.util.ArrayList<>();
                __bitField0 |= 2;
            }
            for (final proto.message.DonateFriendDetail value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set DonateFriendListDetailResponse#friendDonateDetail to null");
                }
                this.friendDonateDetail.add(value);
            }
            return this;
        }

        public Builder clearFriendDonateDetail() {
            this.friendDonateDetail = java.util.Collections.emptyList();
            __bitField0 &= ~2;
            return this;
        }

        public int getFriendDonateDetailCount() {
            return friendDonateDetail.size();
        }

        public proto.message.DonateFriendDetail getFriendDonateDetail(int index) {
            return friendDonateDetail.get(index);
        }

        public int getNumberSendDonate() {
            return numberSendDonate;
        }

        public Builder setNumberSendDonate(int value) {
            this.numberSendDonate = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearNumberSendDonate() {
            this.numberSendDonate = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasNumberSendDonate() {
            return (__bitField0 & 4) == 4;
        }

        public int getNumberReceiveDonate() {
            return numberReceiveDonate;
        }

        public Builder setNumberReceiveDonate(int value) {
            this.numberReceiveDonate = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearNumberReceiveDonate() {
            this.numberReceiveDonate = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasNumberReceiveDonate() {
            return (__bitField0 & 8) == 8;
        }

        public int getNumberMaxSendDonate() {
            return numberMaxSendDonate;
        }

        public Builder setNumberMaxSendDonate(int value) {
            this.numberMaxSendDonate = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearNumberMaxSendDonate() {
            this.numberMaxSendDonate = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasNumberMaxSendDonate() {
            return (__bitField0 & 16) == 16;
        }

        public int getNumberMaxReceiveDonate() {
            return numberMaxReceiveDonate;
        }

        public Builder setNumberMaxReceiveDonate(int value) {
            this.numberMaxReceiveDonate = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearNumberMaxReceiveDonate() {
            this.numberMaxReceiveDonate = 0;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasNumberMaxReceiveDonate() {
            return (__bitField0 & 32) == 32;
        }

        public int getNumberMaxFriendsSent() {
            return numberMaxFriendsSent;
        }

        public Builder setNumberMaxFriendsSent(int value) {
            this.numberMaxFriendsSent = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearNumberMaxFriendsSent() {
            this.numberMaxFriendsSent = 0;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasNumberMaxFriendsSent() {
            return (__bitField0 & 64) == 64;
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
            if (!java.util.Objects.equals(this.friendDonateDetail, that.friendDonateDetail)) {
                return false;
            }
            if (!java.util.Objects.equals(this.numberSendDonate, that.numberSendDonate)) {
                return false;
            }
            if (!java.util.Objects.equals(this.numberReceiveDonate, that.numberReceiveDonate)) {
                return false;
            }
            if (!java.util.Objects.equals(this.numberMaxSendDonate, that.numberMaxSendDonate)) {
                return false;
            }
            if (!java.util.Objects.equals(this.numberMaxReceiveDonate, that.numberMaxReceiveDonate)) {
                return false;
            }
            if (!java.util.Objects.equals(this.numberMaxFriendsSent, that.numberMaxFriendsSent)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.result);
            result = 31 * result + (this.friendDonateDetail == null ? 0 : this.friendDonateDetail.hashCode());
            result = 31 * result + Integer.hashCode(this.numberSendDonate);
            result = 31 * result + Integer.hashCode(this.numberReceiveDonate);
            result = 31 * result + Integer.hashCode(this.numberMaxSendDonate);
            result = 31 * result + Integer.hashCode(this.numberMaxReceiveDonate);
            result = 31 * result + Integer.hashCode(this.numberMaxFriendsSent);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasResult()) {
                parts.add("result=" + getResult() + '(' + getResultValue() + ')');
            }
            if (!friendDonateDetail.isEmpty()) {
                parts.add("friendDonateDetail=" + getFriendDonateDetailList());
            }
            if (hasNumberSendDonate()) {
                parts.add("numberSendDonate=" + getNumberSendDonate());
            }
            if (hasNumberReceiveDonate()) {
                parts.add("numberReceiveDonate=" + getNumberReceiveDonate());
            }
            if (hasNumberMaxSendDonate()) {
                parts.add("numberMaxSendDonate=" + getNumberMaxSendDonate());
            }
            if (hasNumberMaxReceiveDonate()) {
                parts.add("numberMaxReceiveDonate=" + getNumberMaxReceiveDonate());
            }
            if (hasNumberMaxFriendsSent()) {
                parts.add("numberMaxFriendsSent=" + getNumberMaxFriendsSent());
            }
            return "DonateFriendListDetailResponse{" + String.join(", ", parts) + "}";
        }

        public DonateFriendListDetailResponse build() {
            proto.message.DonateFriendListDetailResponse result = new proto.message.DonateFriendListDetailResponse();
            result.__bitField0 = __bitField0;
            result.result = this.result;
            result.friendDonateDetail = java.util.Collections.unmodifiableList(this.friendDonateDetail);
            result.numberSendDonate = this.numberSendDonate;
            result.numberReceiveDonate = this.numberReceiveDonate;
            result.numberMaxSendDonate = this.numberMaxSendDonate;
            result.numberMaxReceiveDonate = this.numberMaxReceiveDonate;
            result.numberMaxFriendsSent = this.numberMaxFriendsSent;
            return result;
        }

    }



}