package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class PetInfoResponse
        implements io.protostuff.Message<PetInfoResponse> {

    private static final PetInfoResponse DEFAULT_INSTANCE = newBuilder().build();

    private int acc;

    private int accMax;

    private boolean unlock;

    private int unlockMoney;

    private java.util.List<proto.message.PetGift> gifts;

    private int paymentBuff;

    private int giftCount;

    private int level;

    private int nextLevel;

    private proto.message.PetRampageSkillResponse petRampageSkillResponse;

    private proto.message.PetRampageSkillResponse nextPetRampageSkillResponse;

    private int bonusGold;

    private boolean __merge_lock = false;
    private int __bitField0;

    private PetInfoResponse() {
        this.acc = 0;
        this.accMax = 0;
        this.unlock = false;
        this.unlockMoney = 0;
        this.gifts = java.util.Collections.emptyList();
        this.paymentBuff = 0;
        this.giftCount = 0;
        this.level = 0;
        this.nextLevel = 0;
        this.petRampageSkillResponse = proto.message.PetRampageSkillResponse.getDefaultInstance();
        this.nextPetRampageSkillResponse = proto.message.PetRampageSkillResponse.getDefaultInstance();
        this.bonusGold = 0;
    }

    private PetInfoResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static PetInfoResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<PetInfoResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getAcc() {
        return acc;
    }

    public boolean hasAcc() {
        return (__bitField0 & 1) == 1;
    }

    public PetInfoResponse withAcc(int value) {
        return PetInfoResponse.newBuilder()
            .mergeFrom(this)
            .setAcc(value)
            .build();
    }

    public int getAccMax() {
        return accMax;
    }

    public boolean hasAccMax() {
        return (__bitField0 & 2) == 2;
    }

    public PetInfoResponse withAccMax(int value) {
        return PetInfoResponse.newBuilder()
            .mergeFrom(this)
            .setAccMax(value)
            .build();
    }

    public boolean getUnlock() {
        return unlock;
    }

    public boolean hasUnlock() {
        return (__bitField0 & 4) == 4;
    }

    public PetInfoResponse withUnlock(boolean value) {
        return PetInfoResponse.newBuilder()
            .mergeFrom(this)
            .setUnlock(value)
            .build();
    }

    public int getUnlockMoney() {
        return unlockMoney;
    }

    public boolean hasUnlockMoney() {
        return (__bitField0 & 8) == 8;
    }

    public PetInfoResponse withUnlockMoney(int value) {
        return PetInfoResponse.newBuilder()
            .mergeFrom(this)
            .setUnlockMoney(value)
            .build();
    }

    public java.util.List<proto.message.PetGift> getGiftsList() {
        return gifts;
    }

    public int getGiftsCount() {
        return gifts.size();
    }

    public proto.message.PetGift getGifts(int index) {
        return gifts.get(index);
    }

    public PetInfoResponse withGifts(java.util.List<proto.message.PetGift> value) {
        return PetInfoResponse.newBuilder()
            .mergeFrom(this)
            .clearGifts()
            .addAllGifts(value)
            .build();
    }

    public int getPaymentBuff() {
        return paymentBuff;
    }

    public boolean hasPaymentBuff() {
        return (__bitField0 & 32) == 32;
    }

    public PetInfoResponse withPaymentBuff(int value) {
        return PetInfoResponse.newBuilder()
            .mergeFrom(this)
            .setPaymentBuff(value)
            .build();
    }

    public int getGiftCount() {
        return giftCount;
    }

    public boolean hasGiftCount() {
        return (__bitField0 & 64) == 64;
    }

    public PetInfoResponse withGiftCount(int value) {
        return PetInfoResponse.newBuilder()
            .mergeFrom(this)
            .setGiftCount(value)
            .build();
    }

    public int getLevel() {
        return level;
    }

    public boolean hasLevel() {
        return (__bitField0 & 128) == 128;
    }

    public PetInfoResponse withLevel(int value) {
        return PetInfoResponse.newBuilder()
            .mergeFrom(this)
            .setLevel(value)
            .build();
    }

    public int getNextLevel() {
        return nextLevel;
    }

    public boolean hasNextLevel() {
        return (__bitField0 & 256) == 256;
    }

    public PetInfoResponse withNextLevel(int value) {
        return PetInfoResponse.newBuilder()
            .mergeFrom(this)
            .setNextLevel(value)
            .build();
    }

    public proto.message.PetRampageSkillResponse getPetRampageSkillResponse() {
        return petRampageSkillResponse;
    }

    public boolean hasPetRampageSkillResponse() {
        return (__bitField0 & 512) == 512;
    }

    public PetInfoResponse withPetRampageSkillResponse(proto.message.PetRampageSkillResponse value) {
        return PetInfoResponse.newBuilder()
            .mergeFrom(this)
            .setPetRampageSkillResponse(value)
            .build();
    }

    public proto.message.PetRampageSkillResponse getNextPetRampageSkillResponse() {
        return nextPetRampageSkillResponse;
    }

    public boolean hasNextPetRampageSkillResponse() {
        return (__bitField0 & 1024) == 1024;
    }

    public PetInfoResponse withNextPetRampageSkillResponse(proto.message.PetRampageSkillResponse value) {
        return PetInfoResponse.newBuilder()
            .mergeFrom(this)
            .setNextPetRampageSkillResponse(value)
            .build();
    }

    public int getBonusGold() {
        return bonusGold;
    }

    public boolean hasBonusGold() {
        return (__bitField0 & 2048) == 2048;
    }

    public PetInfoResponse withBonusGold(int value) {
        return PetInfoResponse.newBuilder()
            .mergeFrom(this)
            .setBonusGold(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<PetInfoResponse> cachedSchema() {
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
        PetInfoResponse that = (PetInfoResponse) obj;
        if (!java.util.Objects.equals(this.acc, that.acc)) {
            return false;
        }
        if (!java.util.Objects.equals(this.accMax, that.accMax)) {
            return false;
        }
        if (!java.util.Objects.equals(this.unlock, that.unlock)) {
            return false;
        }
        if (!java.util.Objects.equals(this.unlockMoney, that.unlockMoney)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gifts, that.gifts)) {
            return false;
        }
        if (!java.util.Objects.equals(this.paymentBuff, that.paymentBuff)) {
            return false;
        }
        if (!java.util.Objects.equals(this.giftCount, that.giftCount)) {
            return false;
        }
        if (!java.util.Objects.equals(this.level, that.level)) {
            return false;
        }
        if (!java.util.Objects.equals(this.nextLevel, that.nextLevel)) {
            return false;
        }
        if (!java.util.Objects.equals(this.petRampageSkillResponse, that.petRampageSkillResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.nextPetRampageSkillResponse, that.nextPetRampageSkillResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.bonusGold, that.bonusGold)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.acc);
        result = 31 * result + Integer.hashCode(this.accMax);
        result = 31 * result + Boolean.hashCode(this.unlock);
        result = 31 * result + Integer.hashCode(this.unlockMoney);
        result = 31 * result + (this.gifts == null ? 0 : this.gifts.hashCode());
        result = 31 * result + Integer.hashCode(this.paymentBuff);
        result = 31 * result + Integer.hashCode(this.giftCount);
        result = 31 * result + Integer.hashCode(this.level);
        result = 31 * result + Integer.hashCode(this.nextLevel);
        result = 31 * result + (this.petRampageSkillResponse == null ? 0 : this.petRampageSkillResponse.hashCode());
        result = 31 * result + (this.nextPetRampageSkillResponse == null ? 0 : this.nextPetRampageSkillResponse.hashCode());
        result = 31 * result + Integer.hashCode(this.bonusGold);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasAcc()) {
            parts.add("acc=" + getAcc());
        }
        if (hasAccMax()) {
            parts.add("accMax=" + getAccMax());
        }
        if (hasUnlock()) {
            parts.add("unlock=" + getUnlock());
        }
        if (hasUnlockMoney()) {
            parts.add("unlockMoney=" + getUnlockMoney());
        }
        if (!gifts.isEmpty()) {
            parts.add("gifts=" + getGiftsList());
        }
        if (hasPaymentBuff()) {
            parts.add("paymentBuff=" + getPaymentBuff());
        }
        if (hasGiftCount()) {
            parts.add("giftCount=" + getGiftCount());
        }
        if (hasLevel()) {
            parts.add("level=" + getLevel());
        }
        if (hasNextLevel()) {
            parts.add("nextLevel=" + getNextLevel());
        }
        if (hasPetRampageSkillResponse()) {
            parts.add("petRampageSkillResponse=" + getPetRampageSkillResponse());
        }
        if (hasNextPetRampageSkillResponse()) {
            parts.add("nextPetRampageSkillResponse=" + getNextPetRampageSkillResponse());
        }
        if (hasBonusGold()) {
            parts.add("bonusGold=" + getBonusGold());
        }
        return "PetInfoResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<PetInfoResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("acc", 1);
        	__fieldMap.put("accMax", 2);
        	__fieldMap.put("unlock", 3);
        	__fieldMap.put("unlockMoney", 4);
        	__fieldMap.put("gifts", 5);
        	__fieldMap.put("paymentBuff", 6);
        	__fieldMap.put("giftCount", 7);
        	__fieldMap.put("level", 8);
        	__fieldMap.put("nextLevel", 9);
        	__fieldMap.put("petRampageSkillResponse", 10);
        	__fieldMap.put("nextPetRampageSkillResponse", 11);
        	__fieldMap.put("bonusGold", 12);
        }

        @Override
        public PetInfoResponse newMessage() {
            return new PetInfoResponse();
        }

        @Override
        public Class<PetInfoResponse> typeClass() {
            return PetInfoResponse.class;
        }

        @Override
        public String messageName() {
            return PetInfoResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return PetInfoResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(PetInfoResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, PetInfoResponse instance) throws java.io.IOException {
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
                    	instance.acc = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.accMax = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.unlock = input.readBool();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.unlockMoney = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	if(!((instance.__bitField0 & 16) == 16)) {
                    	    instance.gifts = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 16;
                    	}
                    	instance.gifts.add(input.mergeObject(null, proto.message.PetGift.getSchema()));

                    	break;
                    case 6:
                    	instance.paymentBuff = input.readInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.giftCount = input.readInt32();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.level = input.readInt32();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 9:
                    	instance.nextLevel = input.readInt32();
                    	instance.__bitField0 |= 256;
                    	break;
                    case 10:
                    	instance.petRampageSkillResponse = input.mergeObject(null, proto.message.PetRampageSkillResponse.getSchema());
                    	instance.__bitField0 |= 512;
                    	break;
                    case 11:
                    	instance.nextPetRampageSkillResponse = input.mergeObject(null, proto.message.PetRampageSkillResponse.getSchema());
                    	instance.__bitField0 |= 1024;
                    	break;
                    case 12:
                    	instance.bonusGold = input.readInt32();
                    	instance.__bitField0 |= 2048;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 16) == 16) {
                instance.gifts = java.util.Collections.unmodifiableList(instance.gifts);
            }








        }

        @Override
        public void writeTo(io.protostuff.Output output, PetInfoResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.acc, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.accMax, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeBool(3, instance.unlock, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.unlockMoney, false);
            }

            for(proto.message.PetGift gifts : instance.gifts) {
                output.writeObject(5, gifts, proto.message.PetGift.getSchema(), true);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeInt32(6, instance.paymentBuff, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeInt32(7, instance.giftCount, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeInt32(8, instance.level, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeInt32(9, instance.nextLevel, false);
            }

            if((instance.__bitField0 & 512) == 512) {
            	output.writeObject(10, instance.petRampageSkillResponse, proto.message.PetRampageSkillResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 1024) == 1024) {
            	output.writeObject(11, instance.nextPetRampageSkillResponse, proto.message.PetRampageSkillResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 2048) == 2048) {
                output.writeInt32(12, instance.bonusGold, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "acc";
        		case 2: return "accMax";
        		case 3: return "unlock";
        		case 4: return "unlockMoney";
        		case 5: return "gifts";
        		case 6: return "paymentBuff";
        		case 7: return "giftCount";
        		case 8: return "level";
        		case 9: return "nextLevel";
        		case 10: return "petRampageSkillResponse";
        		case 11: return "nextPetRampageSkillResponse";
        		case 12: return "bonusGold";
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

        private int acc;

        private int accMax;

        private boolean unlock;

        private int unlockMoney;

        private java.util.List<proto.message.PetGift> gifts;

        private int paymentBuff;

        private int giftCount;

        private int level;

        private int nextLevel;

        private proto.message.PetRampageSkillResponse petRampageSkillResponse;

        private proto.message.PetRampageSkillResponse nextPetRampageSkillResponse;

        private int bonusGold;

        private int __bitField0;

        private Builder() {
            this.acc = 0;
            this.accMax = 0;
            this.unlock = false;
            this.unlockMoney = 0;
            this.gifts = java.util.Collections.emptyList();
            this.paymentBuff = 0;
            this.giftCount = 0;
            this.level = 0;
            this.nextLevel = 0;
            this.petRampageSkillResponse = proto.message.PetRampageSkillResponse.getDefaultInstance();
            this.nextPetRampageSkillResponse = proto.message.PetRampageSkillResponse.getDefaultInstance();
            this.bonusGold = 0;
        }

        public Builder mergeFrom(PetInfoResponse instance) {
            if (instance.hasAcc()) {
                this.setAcc(instance.getAcc());
            }

            if (instance.hasAccMax()) {
                this.setAccMax(instance.getAccMax());
            }

            if (instance.hasUnlock()) {
                this.setUnlock(instance.getUnlock());
            }

            if (instance.hasUnlockMoney()) {
                this.setUnlockMoney(instance.getUnlockMoney());
            }

            this.addAllGifts(instance.getGiftsList());

            if (instance.hasPaymentBuff()) {
                this.setPaymentBuff(instance.getPaymentBuff());
            }

            if (instance.hasGiftCount()) {
                this.setGiftCount(instance.getGiftCount());
            }

            if (instance.hasLevel()) {
                this.setLevel(instance.getLevel());
            }

            if (instance.hasNextLevel()) {
                this.setNextLevel(instance.getNextLevel());
            }

            if (instance.hasPetRampageSkillResponse()) {
                this.setPetRampageSkillResponse(instance.getPetRampageSkillResponse());
            }

            if (instance.hasNextPetRampageSkillResponse()) {
                this.setNextPetRampageSkillResponse(instance.getNextPetRampageSkillResponse());
            }

            if (instance.hasBonusGold()) {
                this.setBonusGold(instance.getBonusGold());
            }

            return this;
        }

        public int getAcc() {
            return acc;
        }

        public Builder setAcc(int value) {
            this.acc = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearAcc() {
            this.acc = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasAcc() {
            return (__bitField0 & 1) == 1;
        }

        public int getAccMax() {
            return accMax;
        }

        public Builder setAccMax(int value) {
            this.accMax = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearAccMax() {
            this.accMax = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasAccMax() {
            return (__bitField0 & 2) == 2;
        }

        public boolean getUnlock() {
            return unlock;
        }

        public Builder setUnlock(boolean value) {
            this.unlock = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearUnlock() {
            this.unlock = false;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasUnlock() {
            return (__bitField0 & 4) == 4;
        }

        public int getUnlockMoney() {
            return unlockMoney;
        }

        public Builder setUnlockMoney(int value) {
            this.unlockMoney = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearUnlockMoney() {
            this.unlockMoney = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasUnlockMoney() {
            return (__bitField0 & 8) == 8;
        }

        public java.util.List<proto.message.PetGift> getGiftsList() {
            return gifts;
        }

        public Builder setGifts(int index, proto.message.PetGift value) {
            if (value == null) {
                throw new NullPointerException("Cannot set PetInfoResponse#gifts to null");
            }

            if(!((__bitField0 & 16) == 16)) {
                this.gifts = new java.util.ArrayList<>();
                __bitField0 |= 16;
            }
            this.gifts.set(index, value);
            return this;
        }

        public Builder addGifts(proto.message.PetGift value) {
            if (value == null) {
                throw new NullPointerException("Cannot set PetInfoResponse#gifts to null");
            }

            if(!((__bitField0 & 16) == 16)) {
                this.gifts = new java.util.ArrayList<>();
                __bitField0 |= 16;
            }
            this.gifts.add(value);
            return this;
        }

        public Builder addAllGifts(java.lang.Iterable<proto.message.PetGift> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set PetInfoResponse#gifts to null");
            }
            if(!((__bitField0 & 16) == 16)) {
                this.gifts = new java.util.ArrayList<>();
                __bitField0 |= 16;
            }
            for (final proto.message.PetGift value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set PetInfoResponse#gifts to null");
                }
                this.gifts.add(value);
            }
            return this;
        }

        public Builder clearGifts() {
            this.gifts = java.util.Collections.emptyList();
            __bitField0 &= ~16;
            return this;
        }

        public int getGiftsCount() {
            return gifts.size();
        }

        public proto.message.PetGift getGifts(int index) {
            return gifts.get(index);
        }

        public int getPaymentBuff() {
            return paymentBuff;
        }

        public Builder setPaymentBuff(int value) {
            this.paymentBuff = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearPaymentBuff() {
            this.paymentBuff = 0;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasPaymentBuff() {
            return (__bitField0 & 32) == 32;
        }

        public int getGiftCount() {
            return giftCount;
        }

        public Builder setGiftCount(int value) {
            this.giftCount = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearGiftCount() {
            this.giftCount = 0;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasGiftCount() {
            return (__bitField0 & 64) == 64;
        }

        public int getLevel() {
            return level;
        }

        public Builder setLevel(int value) {
            this.level = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearLevel() {
            this.level = 0;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasLevel() {
            return (__bitField0 & 128) == 128;
        }

        public int getNextLevel() {
            return nextLevel;
        }

        public Builder setNextLevel(int value) {
            this.nextLevel = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearNextLevel() {
            this.nextLevel = 0;
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasNextLevel() {
            return (__bitField0 & 256) == 256;
        }

        public proto.message.PetRampageSkillResponse getPetRampageSkillResponse() {
            return petRampageSkillResponse;
        }

        public Builder setPetRampageSkillResponse(proto.message.PetRampageSkillResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set PetInfoResponse#petRampageSkillResponse to null");
            }

            this.petRampageSkillResponse = value;
            __bitField0 |= 512;
            return this;
        }

        public Builder clearPetRampageSkillResponse() {
            this.petRampageSkillResponse = proto.message.PetRampageSkillResponse.getDefaultInstance();
            __bitField0 &= ~512;
            return this;
        }

        public boolean hasPetRampageSkillResponse() {
            return (__bitField0 & 512) == 512;
        }

        public proto.message.PetRampageSkillResponse getNextPetRampageSkillResponse() {
            return nextPetRampageSkillResponse;
        }

        public Builder setNextPetRampageSkillResponse(proto.message.PetRampageSkillResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set PetInfoResponse#nextPetRampageSkillResponse to null");
            }

            this.nextPetRampageSkillResponse = value;
            __bitField0 |= 1024;
            return this;
        }

        public Builder clearNextPetRampageSkillResponse() {
            this.nextPetRampageSkillResponse = proto.message.PetRampageSkillResponse.getDefaultInstance();
            __bitField0 &= ~1024;
            return this;
        }

        public boolean hasNextPetRampageSkillResponse() {
            return (__bitField0 & 1024) == 1024;
        }

        public int getBonusGold() {
            return bonusGold;
        }

        public Builder setBonusGold(int value) {
            this.bonusGold = value;
            __bitField0 |= 2048;
            return this;
        }

        public Builder clearBonusGold() {
            this.bonusGold = 0;
            __bitField0 &= ~2048;
            return this;
        }

        public boolean hasBonusGold() {
            return (__bitField0 & 2048) == 2048;
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
            if (!java.util.Objects.equals(this.acc, that.acc)) {
                return false;
            }
            if (!java.util.Objects.equals(this.accMax, that.accMax)) {
                return false;
            }
            if (!java.util.Objects.equals(this.unlock, that.unlock)) {
                return false;
            }
            if (!java.util.Objects.equals(this.unlockMoney, that.unlockMoney)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gifts, that.gifts)) {
                return false;
            }
            if (!java.util.Objects.equals(this.paymentBuff, that.paymentBuff)) {
                return false;
            }
            if (!java.util.Objects.equals(this.giftCount, that.giftCount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.level, that.level)) {
                return false;
            }
            if (!java.util.Objects.equals(this.nextLevel, that.nextLevel)) {
                return false;
            }
            if (!java.util.Objects.equals(this.petRampageSkillResponse, that.petRampageSkillResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.nextPetRampageSkillResponse, that.nextPetRampageSkillResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.bonusGold, that.bonusGold)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.acc);
            result = 31 * result + Integer.hashCode(this.accMax);
            result = 31 * result + Boolean.hashCode(this.unlock);
            result = 31 * result + Integer.hashCode(this.unlockMoney);
            result = 31 * result + (this.gifts == null ? 0 : this.gifts.hashCode());
            result = 31 * result + Integer.hashCode(this.paymentBuff);
            result = 31 * result + Integer.hashCode(this.giftCount);
            result = 31 * result + Integer.hashCode(this.level);
            result = 31 * result + Integer.hashCode(this.nextLevel);
            result = 31 * result + (this.petRampageSkillResponse == null ? 0 : this.petRampageSkillResponse.hashCode());
            result = 31 * result + (this.nextPetRampageSkillResponse == null ? 0 : this.nextPetRampageSkillResponse.hashCode());
            result = 31 * result + Integer.hashCode(this.bonusGold);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasAcc()) {
                parts.add("acc=" + getAcc());
            }
            if (hasAccMax()) {
                parts.add("accMax=" + getAccMax());
            }
            if (hasUnlock()) {
                parts.add("unlock=" + getUnlock());
            }
            if (hasUnlockMoney()) {
                parts.add("unlockMoney=" + getUnlockMoney());
            }
            if (!gifts.isEmpty()) {
                parts.add("gifts=" + getGiftsList());
            }
            if (hasPaymentBuff()) {
                parts.add("paymentBuff=" + getPaymentBuff());
            }
            if (hasGiftCount()) {
                parts.add("giftCount=" + getGiftCount());
            }
            if (hasLevel()) {
                parts.add("level=" + getLevel());
            }
            if (hasNextLevel()) {
                parts.add("nextLevel=" + getNextLevel());
            }
            if (hasPetRampageSkillResponse()) {
                parts.add("petRampageSkillResponse=" + getPetRampageSkillResponse());
            }
            if (hasNextPetRampageSkillResponse()) {
                parts.add("nextPetRampageSkillResponse=" + getNextPetRampageSkillResponse());
            }
            if (hasBonusGold()) {
                parts.add("bonusGold=" + getBonusGold());
            }
            return "PetInfoResponse{" + String.join(", ", parts) + "}";
        }

        public PetInfoResponse build() {
            proto.message.PetInfoResponse result = new proto.message.PetInfoResponse();
            result.__bitField0 = __bitField0;
            result.acc = this.acc;
            result.accMax = this.accMax;
            result.unlock = this.unlock;
            result.unlockMoney = this.unlockMoney;
            result.gifts = java.util.Collections.unmodifiableList(this.gifts);
            result.paymentBuff = this.paymentBuff;
            result.giftCount = this.giftCount;
            result.level = this.level;
            result.nextLevel = this.nextLevel;
            result.petRampageSkillResponse = this.petRampageSkillResponse;
            result.nextPetRampageSkillResponse = this.nextPetRampageSkillResponse;
            result.bonusGold = this.bonusGold;
            return result;
        }

    }



}