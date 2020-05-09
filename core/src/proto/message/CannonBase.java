package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class CannonBase
        implements io.protostuff.Message<CannonBase> {

    private static final CannonBase DEFAULT_INSTANCE = newBuilder().build();

    private int baseId;

    private int power;

    private int unlockLevel;

    private int unlockGold;

    private int unlockPearl;

    private int unlockBase;

    private int goldBonus;

    private boolean __merge_lock = false;
    private int __bitField0;

    private CannonBase() {
        this.baseId = 0;
        this.power = 0;
        this.unlockLevel = 0;
        this.unlockGold = 0;
        this.unlockPearl = 0;
        this.unlockBase = 0;
        this.goldBonus = 0;
    }

    private CannonBase(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static CannonBase getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<CannonBase> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getBaseId() {
        return baseId;
    }

    public boolean hasBaseId() {
        return (__bitField0 & 1) == 1;
    }

    public CannonBase withBaseId(int value) {
        return CannonBase.newBuilder()
            .mergeFrom(this)
            .setBaseId(value)
            .build();
    }

    public int getPower() {
        return power;
    }

    public boolean hasPower() {
        return (__bitField0 & 2) == 2;
    }

    public CannonBase withPower(int value) {
        return CannonBase.newBuilder()
            .mergeFrom(this)
            .setPower(value)
            .build();
    }

    public int getUnlockLevel() {
        return unlockLevel;
    }

    public boolean hasUnlockLevel() {
        return (__bitField0 & 4) == 4;
    }

    public CannonBase withUnlockLevel(int value) {
        return CannonBase.newBuilder()
            .mergeFrom(this)
            .setUnlockLevel(value)
            .build();
    }

    public int getUnlockGold() {
        return unlockGold;
    }

    public boolean hasUnlockGold() {
        return (__bitField0 & 8) == 8;
    }

    public CannonBase withUnlockGold(int value) {
        return CannonBase.newBuilder()
            .mergeFrom(this)
            .setUnlockGold(value)
            .build();
    }

    public int getUnlockPearl() {
        return unlockPearl;
    }

    public boolean hasUnlockPearl() {
        return (__bitField0 & 16) == 16;
    }

    public CannonBase withUnlockPearl(int value) {
        return CannonBase.newBuilder()
            .mergeFrom(this)
            .setUnlockPearl(value)
            .build();
    }

    public int getUnlockBase() {
        return unlockBase;
    }

    public boolean hasUnlockBase() {
        return (__bitField0 & 32) == 32;
    }

    public CannonBase withUnlockBase(int value) {
        return CannonBase.newBuilder()
            .mergeFrom(this)
            .setUnlockBase(value)
            .build();
    }

    public int getGoldBonus() {
        return goldBonus;
    }

    public boolean hasGoldBonus() {
        return (__bitField0 & 64) == 64;
    }

    public CannonBase withGoldBonus(int value) {
        return CannonBase.newBuilder()
            .mergeFrom(this)
            .setGoldBonus(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<CannonBase> cachedSchema() {
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
        CannonBase that = (CannonBase) obj;
        if (!java.util.Objects.equals(this.baseId, that.baseId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.power, that.power)) {
            return false;
        }
        if (!java.util.Objects.equals(this.unlockLevel, that.unlockLevel)) {
            return false;
        }
        if (!java.util.Objects.equals(this.unlockGold, that.unlockGold)) {
            return false;
        }
        if (!java.util.Objects.equals(this.unlockPearl, that.unlockPearl)) {
            return false;
        }
        if (!java.util.Objects.equals(this.unlockBase, that.unlockBase)) {
            return false;
        }
        if (!java.util.Objects.equals(this.goldBonus, that.goldBonus)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.baseId);
        result = 31 * result + Integer.hashCode(this.power);
        result = 31 * result + Integer.hashCode(this.unlockLevel);
        result = 31 * result + Integer.hashCode(this.unlockGold);
        result = 31 * result + Integer.hashCode(this.unlockPearl);
        result = 31 * result + Integer.hashCode(this.unlockBase);
        result = 31 * result + Integer.hashCode(this.goldBonus);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasBaseId()) {
            parts.add("baseId=" + getBaseId());
        }
        if (hasPower()) {
            parts.add("power=" + getPower());
        }
        if (hasUnlockLevel()) {
            parts.add("unlockLevel=" + getUnlockLevel());
        }
        if (hasUnlockGold()) {
            parts.add("unlockGold=" + getUnlockGold());
        }
        if (hasUnlockPearl()) {
            parts.add("unlockPearl=" + getUnlockPearl());
        }
        if (hasUnlockBase()) {
            parts.add("unlockBase=" + getUnlockBase());
        }
        if (hasGoldBonus()) {
            parts.add("goldBonus=" + getGoldBonus());
        }
        return "CannonBase{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<CannonBase>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("baseId", 1);
        	__fieldMap.put("power", 2);
        	__fieldMap.put("unlockLevel", 3);
        	__fieldMap.put("unlockGold", 4);
        	__fieldMap.put("unlockPearl", 5);
        	__fieldMap.put("unlockBase", 6);
        	__fieldMap.put("goldBonus", 7);
        }

        @Override
        public CannonBase newMessage() {
            return new CannonBase();
        }

        @Override
        public Class<CannonBase> typeClass() {
            return CannonBase.class;
        }

        @Override
        public String messageName() {
            return CannonBase.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return CannonBase.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(CannonBase message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, CannonBase instance) throws java.io.IOException {
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
                    	instance.power = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.unlockLevel = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.unlockGold = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.unlockPearl = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.unlockBase = input.readInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.goldBonus = input.readInt32();
                    	instance.__bitField0 |= 64;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, CannonBase instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.baseId, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.power, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.unlockLevel, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.unlockGold, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.unlockPearl, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeInt32(6, instance.unlockBase, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeInt32(7, instance.goldBonus, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "baseId";
        		case 2: return "power";
        		case 3: return "unlockLevel";
        		case 4: return "unlockGold";
        		case 5: return "unlockPearl";
        		case 6: return "unlockBase";
        		case 7: return "goldBonus";
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

        private int power;

        private int unlockLevel;

        private int unlockGold;

        private int unlockPearl;

        private int unlockBase;

        private int goldBonus;

        private int __bitField0;

        private Builder() {
            this.baseId = 0;
            this.power = 0;
            this.unlockLevel = 0;
            this.unlockGold = 0;
            this.unlockPearl = 0;
            this.unlockBase = 0;
            this.goldBonus = 0;
        }

        public Builder mergeFrom(CannonBase instance) {
            if (instance.hasBaseId()) {
                this.setBaseId(instance.getBaseId());
            }

            if (instance.hasPower()) {
                this.setPower(instance.getPower());
            }

            if (instance.hasUnlockLevel()) {
                this.setUnlockLevel(instance.getUnlockLevel());
            }

            if (instance.hasUnlockGold()) {
                this.setUnlockGold(instance.getUnlockGold());
            }

            if (instance.hasUnlockPearl()) {
                this.setUnlockPearl(instance.getUnlockPearl());
            }

            if (instance.hasUnlockBase()) {
                this.setUnlockBase(instance.getUnlockBase());
            }

            if (instance.hasGoldBonus()) {
                this.setGoldBonus(instance.getGoldBonus());
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

        public int getPower() {
            return power;
        }

        public Builder setPower(int value) {
            this.power = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearPower() {
            this.power = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasPower() {
            return (__bitField0 & 2) == 2;
        }

        public int getUnlockLevel() {
            return unlockLevel;
        }

        public Builder setUnlockLevel(int value) {
            this.unlockLevel = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearUnlockLevel() {
            this.unlockLevel = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasUnlockLevel() {
            return (__bitField0 & 4) == 4;
        }

        public int getUnlockGold() {
            return unlockGold;
        }

        public Builder setUnlockGold(int value) {
            this.unlockGold = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearUnlockGold() {
            this.unlockGold = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasUnlockGold() {
            return (__bitField0 & 8) == 8;
        }

        public int getUnlockPearl() {
            return unlockPearl;
        }

        public Builder setUnlockPearl(int value) {
            this.unlockPearl = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearUnlockPearl() {
            this.unlockPearl = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasUnlockPearl() {
            return (__bitField0 & 16) == 16;
        }

        public int getUnlockBase() {
            return unlockBase;
        }

        public Builder setUnlockBase(int value) {
            this.unlockBase = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearUnlockBase() {
            this.unlockBase = 0;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasUnlockBase() {
            return (__bitField0 & 32) == 32;
        }

        public int getGoldBonus() {
            return goldBonus;
        }

        public Builder setGoldBonus(int value) {
            this.goldBonus = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearGoldBonus() {
            this.goldBonus = 0;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasGoldBonus() {
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
            if (!java.util.Objects.equals(this.baseId, that.baseId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.power, that.power)) {
                return false;
            }
            if (!java.util.Objects.equals(this.unlockLevel, that.unlockLevel)) {
                return false;
            }
            if (!java.util.Objects.equals(this.unlockGold, that.unlockGold)) {
                return false;
            }
            if (!java.util.Objects.equals(this.unlockPearl, that.unlockPearl)) {
                return false;
            }
            if (!java.util.Objects.equals(this.unlockBase, that.unlockBase)) {
                return false;
            }
            if (!java.util.Objects.equals(this.goldBonus, that.goldBonus)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.baseId);
            result = 31 * result + Integer.hashCode(this.power);
            result = 31 * result + Integer.hashCode(this.unlockLevel);
            result = 31 * result + Integer.hashCode(this.unlockGold);
            result = 31 * result + Integer.hashCode(this.unlockPearl);
            result = 31 * result + Integer.hashCode(this.unlockBase);
            result = 31 * result + Integer.hashCode(this.goldBonus);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasBaseId()) {
                parts.add("baseId=" + getBaseId());
            }
            if (hasPower()) {
                parts.add("power=" + getPower());
            }
            if (hasUnlockLevel()) {
                parts.add("unlockLevel=" + getUnlockLevel());
            }
            if (hasUnlockGold()) {
                parts.add("unlockGold=" + getUnlockGold());
            }
            if (hasUnlockPearl()) {
                parts.add("unlockPearl=" + getUnlockPearl());
            }
            if (hasUnlockBase()) {
                parts.add("unlockBase=" + getUnlockBase());
            }
            if (hasGoldBonus()) {
                parts.add("goldBonus=" + getGoldBonus());
            }
            return "CannonBase{" + String.join(", ", parts) + "}";
        }

        public CannonBase build() {
            proto.message.CannonBase result = new proto.message.CannonBase();
            result.__bitField0 = __bitField0;
            result.baseId = this.baseId;
            result.power = this.power;
            result.unlockLevel = this.unlockLevel;
            result.unlockGold = this.unlockGold;
            result.unlockPearl = this.unlockPearl;
            result.unlockBase = this.unlockBase;
            result.goldBonus = this.goldBonus;
            return result;
        }

    }



}