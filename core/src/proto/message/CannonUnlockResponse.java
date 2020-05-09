package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class CannonUnlockResponse
        implements io.protostuff.Message<CannonUnlockResponse> {

    private static final CannonUnlockResponse DEFAULT_INSTANCE = newBuilder().build();

    private int baseId;

    private int result;

    private int userLevel;

    private int userExp;

    private int gold1;

    private int gold2;

    private int gold3;

    private int pearl;

    private boolean __merge_lock = false;
    private int __bitField0;

    private CannonUnlockResponse() {
        this.baseId = 0;
        this.result = proto.message.ProfileResultCode.PROFILE_CLAIM_INBOX_OK.getNumber();
        this.userLevel = 0;
        this.userExp = 0;
        this.gold1 = 0;
        this.gold2 = 0;
        this.gold3 = 0;
        this.pearl = 0;
    }

    private CannonUnlockResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static CannonUnlockResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<CannonUnlockResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getBaseId() {
        return baseId;
    }

    public boolean hasBaseId() {
        return (__bitField0 & 1) == 1;
    }

    public CannonUnlockResponse withBaseId(int value) {
        return CannonUnlockResponse.newBuilder()
            .mergeFrom(this)
            .setBaseId(value)
            .build();
    }

    public proto.message.ProfileResultCode getResult() {
        return proto.message.ProfileResultCode.valueOf(result);
    }

    public int getResultValue() {
        return result;
    }

    public boolean hasResult() {
        return (__bitField0 & 2) == 2;
    }

    public CannonUnlockResponse withResult(proto.message.ProfileResultCode value) {
        return CannonUnlockResponse.newBuilder()
            .mergeFrom(this)
            .setResult(value)
            .build();
    }

    public int getUserLevel() {
        return userLevel;
    }

    public boolean hasUserLevel() {
        return (__bitField0 & 4) == 4;
    }

    public CannonUnlockResponse withUserLevel(int value) {
        return CannonUnlockResponse.newBuilder()
            .mergeFrom(this)
            .setUserLevel(value)
            .build();
    }

    public int getUserExp() {
        return userExp;
    }

    public boolean hasUserExp() {
        return (__bitField0 & 8) == 8;
    }

    public CannonUnlockResponse withUserExp(int value) {
        return CannonUnlockResponse.newBuilder()
            .mergeFrom(this)
            .setUserExp(value)
            .build();
    }

    public int getGold1() {
        return gold1;
    }

    public boolean hasGold1() {
        return (__bitField0 & 16) == 16;
    }

    public CannonUnlockResponse withGold1(int value) {
        return CannonUnlockResponse.newBuilder()
            .mergeFrom(this)
            .setGold1(value)
            .build();
    }

    public int getGold2() {
        return gold2;
    }

    public boolean hasGold2() {
        return (__bitField0 & 32) == 32;
    }

    public CannonUnlockResponse withGold2(int value) {
        return CannonUnlockResponse.newBuilder()
            .mergeFrom(this)
            .setGold2(value)
            .build();
    }

    public int getGold3() {
        return gold3;
    }

    public boolean hasGold3() {
        return (__bitField0 & 64) == 64;
    }

    public CannonUnlockResponse withGold3(int value) {
        return CannonUnlockResponse.newBuilder()
            .mergeFrom(this)
            .setGold3(value)
            .build();
    }

    public int getPearl() {
        return pearl;
    }

    public boolean hasPearl() {
        return (__bitField0 & 128) == 128;
    }

    public CannonUnlockResponse withPearl(int value) {
        return CannonUnlockResponse.newBuilder()
            .mergeFrom(this)
            .setPearl(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<CannonUnlockResponse> cachedSchema() {
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
        CannonUnlockResponse that = (CannonUnlockResponse) obj;
        if (!java.util.Objects.equals(this.baseId, that.baseId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.result, that.result)) {
            return false;
        }
        if (!java.util.Objects.equals(this.userLevel, that.userLevel)) {
            return false;
        }
        if (!java.util.Objects.equals(this.userExp, that.userExp)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gold1, that.gold1)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gold2, that.gold2)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gold3, that.gold3)) {
            return false;
        }
        if (!java.util.Objects.equals(this.pearl, that.pearl)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.baseId);
        result = 31 * result + Integer.hashCode(this.result);
        result = 31 * result + Integer.hashCode(this.userLevel);
        result = 31 * result + Integer.hashCode(this.userExp);
        result = 31 * result + Integer.hashCode(this.gold1);
        result = 31 * result + Integer.hashCode(this.gold2);
        result = 31 * result + Integer.hashCode(this.gold3);
        result = 31 * result + Integer.hashCode(this.pearl);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasBaseId()) {
            parts.add("baseId=" + getBaseId());
        }
        if (hasResult()) {
            parts.add("result=" + getResult() + '(' + getResultValue() + ')');
        }
        if (hasUserLevel()) {
            parts.add("userLevel=" + getUserLevel());
        }
        if (hasUserExp()) {
            parts.add("userExp=" + getUserExp());
        }
        if (hasGold1()) {
            parts.add("gold1=" + getGold1());
        }
        if (hasGold2()) {
            parts.add("gold2=" + getGold2());
        }
        if (hasGold3()) {
            parts.add("gold3=" + getGold3());
        }
        if (hasPearl()) {
            parts.add("pearl=" + getPearl());
        }
        return "CannonUnlockResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<CannonUnlockResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("baseId", 1);
        	__fieldMap.put("result", 2);
        	__fieldMap.put("userLevel", 3);
        	__fieldMap.put("userExp", 4);
        	__fieldMap.put("gold1", 5);
        	__fieldMap.put("gold2", 6);
        	__fieldMap.put("gold3", 7);
        	__fieldMap.put("pearl", 8);
        }

        @Override
        public CannonUnlockResponse newMessage() {
            return new CannonUnlockResponse();
        }

        @Override
        public Class<CannonUnlockResponse> typeClass() {
            return CannonUnlockResponse.class;
        }

        @Override
        public String messageName() {
            return CannonUnlockResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return CannonUnlockResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(CannonUnlockResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, CannonUnlockResponse instance) throws java.io.IOException {
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
                    	instance.baseId = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.result = input.readEnum();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.userLevel = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.userExp = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.gold1 = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.gold2 = input.readInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.gold3 = input.readInt32();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.pearl = input.readInt32();
                    	instance.__bitField0 |= 128;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, CannonUnlockResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.baseId, false);
            }

            if((instance.__bitField0 & 2) == 2) {
            	output.writeEnum(2, instance.result, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.userLevel, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.userExp, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.gold1, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeInt32(6, instance.gold2, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeInt32(7, instance.gold3, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeInt32(8, instance.pearl, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "baseId";
        		case 2: return "result";
        		case 3: return "userLevel";
        		case 4: return "userExp";
        		case 5: return "gold1";
        		case 6: return "gold2";
        		case 7: return "gold3";
        		case 8: return "pearl";
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

        private int baseId;

        private int result;

        private int userLevel;

        private int userExp;

        private int gold1;

        private int gold2;

        private int gold3;

        private int pearl;

        private int __bitField0;

        private Builder() {
            this.baseId = 0;
            this.result = proto.message.ProfileResultCode.PROFILE_CLAIM_INBOX_OK.getNumber();
            this.userLevel = 0;
            this.userExp = 0;
            this.gold1 = 0;
            this.gold2 = 0;
            this.gold3 = 0;
            this.pearl = 0;
        }

        public Builder mergeFrom(CannonUnlockResponse instance) {
            if (instance.hasBaseId()) {
                this.setBaseId(instance.getBaseId());
            }

            if (instance.hasResult()) {
                this.setResult(instance.getResult());
            }

            if (instance.hasUserLevel()) {
                this.setUserLevel(instance.getUserLevel());
            }

            if (instance.hasUserExp()) {
                this.setUserExp(instance.getUserExp());
            }

            if (instance.hasGold1()) {
                this.setGold1(instance.getGold1());
            }

            if (instance.hasGold2()) {
                this.setGold2(instance.getGold2());
            }

            if (instance.hasGold3()) {
                this.setGold3(instance.getGold3());
            }

            if (instance.hasPearl()) {
                this.setPearl(instance.getPearl());
            }

            return this;
        }

        public int getBaseId() {
            return baseId;
        }

        public Builder setBaseId(int value) {
            this.baseId = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearBaseId() {
            this.baseId = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasBaseId() {
            return (__bitField0 & 1) == 1;
        }

        public proto.message.ProfileResultCode getResult() {
            return proto.message.ProfileResultCode.valueOf(result);
        }

        public int getResultValue() {
            return result;
        }

        public Builder setResult(proto.message.ProfileResultCode value) {
            if (value == null) {
                throw new NullPointerException("Cannot set CannonUnlockResponse#result to null");
            }

            if (value == proto.message.ProfileResultCode.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set CannonUnlockResponse#result to UNRECOGNIZED");
            }

            this.result = value.getNumber();
            __bitField0 |= 2;
            return this;
        }

        public Builder setResultValue(int value) {
            this.result = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearResult() {
            this.result = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasResult() {
            return (__bitField0 & 2) == 2;
        }

        public int getUserLevel() {
            return userLevel;
        }

        public Builder setUserLevel(int value) {
            this.userLevel = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearUserLevel() {
            this.userLevel = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasUserLevel() {
            return (__bitField0 & 4) == 4;
        }

        public int getUserExp() {
            return userExp;
        }

        public Builder setUserExp(int value) {
            this.userExp = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearUserExp() {
            this.userExp = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasUserExp() {
            return (__bitField0 & 8) == 8;
        }

        public int getGold1() {
            return gold1;
        }

        public Builder setGold1(int value) {
            this.gold1 = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearGold1() {
            this.gold1 = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasGold1() {
            return (__bitField0 & 16) == 16;
        }

        public int getGold2() {
            return gold2;
        }

        public Builder setGold2(int value) {
            this.gold2 = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearGold2() {
            this.gold2 = 0;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasGold2() {
            return (__bitField0 & 32) == 32;
        }

        public int getGold3() {
            return gold3;
        }

        public Builder setGold3(int value) {
            this.gold3 = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearGold3() {
            this.gold3 = 0;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasGold3() {
            return (__bitField0 & 64) == 64;
        }

        public int getPearl() {
            return pearl;
        }

        public Builder setPearl(int value) {
            this.pearl = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearPearl() {
            this.pearl = 0;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasPearl() {
            return (__bitField0 & 128) == 128;
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
            if (!java.util.Objects.equals(this.baseId, that.baseId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.result, that.result)) {
                return false;
            }
            if (!java.util.Objects.equals(this.userLevel, that.userLevel)) {
                return false;
            }
            if (!java.util.Objects.equals(this.userExp, that.userExp)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gold1, that.gold1)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gold2, that.gold2)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gold3, that.gold3)) {
                return false;
            }
            if (!java.util.Objects.equals(this.pearl, that.pearl)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.baseId);
            result = 31 * result + Integer.hashCode(this.result);
            result = 31 * result + Integer.hashCode(this.userLevel);
            result = 31 * result + Integer.hashCode(this.userExp);
            result = 31 * result + Integer.hashCode(this.gold1);
            result = 31 * result + Integer.hashCode(this.gold2);
            result = 31 * result + Integer.hashCode(this.gold3);
            result = 31 * result + Integer.hashCode(this.pearl);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasBaseId()) {
                parts.add("baseId=" + getBaseId());
            }
            if (hasResult()) {
                parts.add("result=" + getResult() + '(' + getResultValue() + ')');
            }
            if (hasUserLevel()) {
                parts.add("userLevel=" + getUserLevel());
            }
            if (hasUserExp()) {
                parts.add("userExp=" + getUserExp());
            }
            if (hasGold1()) {
                parts.add("gold1=" + getGold1());
            }
            if (hasGold2()) {
                parts.add("gold2=" + getGold2());
            }
            if (hasGold3()) {
                parts.add("gold3=" + getGold3());
            }
            if (hasPearl()) {
                parts.add("pearl=" + getPearl());
            }
            return "CannonUnlockResponse{" + String.join(", ", parts) + "}";
        }

        public CannonUnlockResponse build() {
            proto.message.CannonUnlockResponse result = new proto.message.CannonUnlockResponse();
            result.__bitField0 = __bitField0;
            result.baseId = this.baseId;
            result.result = this.result;
            result.userLevel = this.userLevel;
            result.userExp = this.userExp;
            result.gold1 = this.gold1;
            result.gold2 = this.gold2;
            result.gold3 = this.gold3;
            result.pearl = this.pearl;
            return result;
        }

    }



}