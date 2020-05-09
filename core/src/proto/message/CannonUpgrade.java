package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class CannonUpgrade
        implements io.protostuff.Message<CannonUpgrade> {

    private static final CannonUpgrade DEFAULT_INSTANCE = newBuilder().build();

    private int baseId;

    private int level;

    private float hitBuff;

    private float goldBuff;

    private int upgradeNext;

    private int upgradeLevel;

    private int upgradeGold;

    private int upgradePearl;

    private boolean __merge_lock = false;
    private int __bitField0;

    private CannonUpgrade() {
        this.baseId = 0;
        this.level = 0;
        this.hitBuff = 0f;
        this.goldBuff = 0f;
        this.upgradeNext = 0;
        this.upgradeLevel = 0;
        this.upgradeGold = 0;
        this.upgradePearl = 0;
    }

    private CannonUpgrade(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static CannonUpgrade getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<CannonUpgrade> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getBaseId() {
        return baseId;
    }

    public boolean hasBaseId() {
        return (__bitField0 & 1) == 1;
    }

    public CannonUpgrade withBaseId(int value) {
        return CannonUpgrade.newBuilder()
            .mergeFrom(this)
            .setBaseId(value)
            .build();
    }

    public int getLevel() {
        return level;
    }

    public boolean hasLevel() {
        return (__bitField0 & 2) == 2;
    }

    public CannonUpgrade withLevel(int value) {
        return CannonUpgrade.newBuilder()
            .mergeFrom(this)
            .setLevel(value)
            .build();
    }

    public float getHitBuff() {
        return hitBuff;
    }

    public boolean hasHitBuff() {
        return (__bitField0 & 4) == 4;
    }

    public CannonUpgrade withHitBuff(float value) {
        return CannonUpgrade.newBuilder()
            .mergeFrom(this)
            .setHitBuff(value)
            .build();
    }

    public float getGoldBuff() {
        return goldBuff;
    }

    public boolean hasGoldBuff() {
        return (__bitField0 & 8) == 8;
    }

    public CannonUpgrade withGoldBuff(float value) {
        return CannonUpgrade.newBuilder()
            .mergeFrom(this)
            .setGoldBuff(value)
            .build();
    }

    public int getUpgradeNext() {
        return upgradeNext;
    }

    public boolean hasUpgradeNext() {
        return (__bitField0 & 16) == 16;
    }

    public CannonUpgrade withUpgradeNext(int value) {
        return CannonUpgrade.newBuilder()
            .mergeFrom(this)
            .setUpgradeNext(value)
            .build();
    }

    public int getUpgradeLevel() {
        return upgradeLevel;
    }

    public boolean hasUpgradeLevel() {
        return (__bitField0 & 32) == 32;
    }

    public CannonUpgrade withUpgradeLevel(int value) {
        return CannonUpgrade.newBuilder()
            .mergeFrom(this)
            .setUpgradeLevel(value)
            .build();
    }

    public int getUpgradeGold() {
        return upgradeGold;
    }

    public boolean hasUpgradeGold() {
        return (__bitField0 & 64) == 64;
    }

    public CannonUpgrade withUpgradeGold(int value) {
        return CannonUpgrade.newBuilder()
            .mergeFrom(this)
            .setUpgradeGold(value)
            .build();
    }

    public int getUpgradePearl() {
        return upgradePearl;
    }

    public boolean hasUpgradePearl() {
        return (__bitField0 & 128) == 128;
    }

    public CannonUpgrade withUpgradePearl(int value) {
        return CannonUpgrade.newBuilder()
            .mergeFrom(this)
            .setUpgradePearl(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<CannonUpgrade> cachedSchema() {
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
        CannonUpgrade that = (CannonUpgrade) obj;
        if (!java.util.Objects.equals(this.baseId, that.baseId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.level, that.level)) {
            return false;
        }
        if (!java.util.Objects.equals(this.hitBuff, that.hitBuff)) {
            return false;
        }
        if (!java.util.Objects.equals(this.goldBuff, that.goldBuff)) {
            return false;
        }
        if (!java.util.Objects.equals(this.upgradeNext, that.upgradeNext)) {
            return false;
        }
        if (!java.util.Objects.equals(this.upgradeLevel, that.upgradeLevel)) {
            return false;
        }
        if (!java.util.Objects.equals(this.upgradeGold, that.upgradeGold)) {
            return false;
        }
        if (!java.util.Objects.equals(this.upgradePearl, that.upgradePearl)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.baseId);
        result = 31 * result + Integer.hashCode(this.level);
        result = 31 * result + Float.hashCode(this.hitBuff);
        result = 31 * result + Float.hashCode(this.goldBuff);
        result = 31 * result + Integer.hashCode(this.upgradeNext);
        result = 31 * result + Integer.hashCode(this.upgradeLevel);
        result = 31 * result + Integer.hashCode(this.upgradeGold);
        result = 31 * result + Integer.hashCode(this.upgradePearl);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasBaseId()) {
            parts.add("baseId=" + getBaseId());
        }
        if (hasLevel()) {
            parts.add("level=" + getLevel());
        }
        if (hasHitBuff()) {
            parts.add("hitBuff=" + getHitBuff());
        }
        if (hasGoldBuff()) {
            parts.add("goldBuff=" + getGoldBuff());
        }
        if (hasUpgradeNext()) {
            parts.add("upgradeNext=" + getUpgradeNext());
        }
        if (hasUpgradeLevel()) {
            parts.add("upgradeLevel=" + getUpgradeLevel());
        }
        if (hasUpgradeGold()) {
            parts.add("upgradeGold=" + getUpgradeGold());
        }
        if (hasUpgradePearl()) {
            parts.add("upgradePearl=" + getUpgradePearl());
        }
        return "CannonUpgrade{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<CannonUpgrade>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("baseId", 1);
        	__fieldMap.put("level", 2);
        	__fieldMap.put("hitBuff", 3);
        	__fieldMap.put("goldBuff", 4);
        	__fieldMap.put("upgradeNext", 5);
        	__fieldMap.put("upgradeLevel", 6);
        	__fieldMap.put("upgradeGold", 7);
        	__fieldMap.put("upgradePearl", 8);
        }

        @Override
        public CannonUpgrade newMessage() {
            return new CannonUpgrade();
        }

        @Override
        public Class<CannonUpgrade> typeClass() {
            return CannonUpgrade.class;
        }

        @Override
        public String messageName() {
            return CannonUpgrade.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return CannonUpgrade.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(CannonUpgrade message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, CannonUpgrade instance) throws java.io.IOException {
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
                    	instance.level = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.hitBuff = input.readFloat();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.goldBuff = input.readFloat();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.upgradeNext = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.upgradeLevel = input.readInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.upgradeGold = input.readInt32();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.upgradePearl = input.readInt32();
                    	instance.__bitField0 |= 128;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, CannonUpgrade instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.baseId, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.level, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeFloat(3, instance.hitBuff, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeFloat(4, instance.goldBuff, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.upgradeNext, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeInt32(6, instance.upgradeLevel, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeInt32(7, instance.upgradeGold, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeInt32(8, instance.upgradePearl, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "baseId";
        		case 2: return "level";
        		case 3: return "hitBuff";
        		case 4: return "goldBuff";
        		case 5: return "upgradeNext";
        		case 6: return "upgradeLevel";
        		case 7: return "upgradeGold";
        		case 8: return "upgradePearl";
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

        private int level;

        private float hitBuff;

        private float goldBuff;

        private int upgradeNext;

        private int upgradeLevel;

        private int upgradeGold;

        private int upgradePearl;

        private int __bitField0;

        private Builder() {
            this.baseId = 0;
            this.level = 0;
            this.hitBuff = 0f;
            this.goldBuff = 0f;
            this.upgradeNext = 0;
            this.upgradeLevel = 0;
            this.upgradeGold = 0;
            this.upgradePearl = 0;
        }

        public Builder mergeFrom(CannonUpgrade instance) {
            if (instance.hasBaseId()) {
                this.setBaseId(instance.getBaseId());
            }

            if (instance.hasLevel()) {
                this.setLevel(instance.getLevel());
            }

            if (instance.hasHitBuff()) {
                this.setHitBuff(instance.getHitBuff());
            }

            if (instance.hasGoldBuff()) {
                this.setGoldBuff(instance.getGoldBuff());
            }

            if (instance.hasUpgradeNext()) {
                this.setUpgradeNext(instance.getUpgradeNext());
            }

            if (instance.hasUpgradeLevel()) {
                this.setUpgradeLevel(instance.getUpgradeLevel());
            }

            if (instance.hasUpgradeGold()) {
                this.setUpgradeGold(instance.getUpgradeGold());
            }

            if (instance.hasUpgradePearl()) {
                this.setUpgradePearl(instance.getUpgradePearl());
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

        public int getLevel() {
            return level;
        }

        public Builder setLevel(int value) {
            this.level = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearLevel() {
            this.level = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasLevel() {
            return (__bitField0 & 2) == 2;
        }

        public float getHitBuff() {
            return hitBuff;
        }

        public Builder setHitBuff(float value) {
            this.hitBuff = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearHitBuff() {
            this.hitBuff = 0f;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasHitBuff() {
            return (__bitField0 & 4) == 4;
        }

        public float getGoldBuff() {
            return goldBuff;
        }

        public Builder setGoldBuff(float value) {
            this.goldBuff = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearGoldBuff() {
            this.goldBuff = 0f;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasGoldBuff() {
            return (__bitField0 & 8) == 8;
        }

        public int getUpgradeNext() {
            return upgradeNext;
        }

        public Builder setUpgradeNext(int value) {
            this.upgradeNext = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearUpgradeNext() {
            this.upgradeNext = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasUpgradeNext() {
            return (__bitField0 & 16) == 16;
        }

        public int getUpgradeLevel() {
            return upgradeLevel;
        }

        public Builder setUpgradeLevel(int value) {
            this.upgradeLevel = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearUpgradeLevel() {
            this.upgradeLevel = 0;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasUpgradeLevel() {
            return (__bitField0 & 32) == 32;
        }

        public int getUpgradeGold() {
            return upgradeGold;
        }

        public Builder setUpgradeGold(int value) {
            this.upgradeGold = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearUpgradeGold() {
            this.upgradeGold = 0;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasUpgradeGold() {
            return (__bitField0 & 64) == 64;
        }

        public int getUpgradePearl() {
            return upgradePearl;
        }

        public Builder setUpgradePearl(int value) {
            this.upgradePearl = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearUpgradePearl() {
            this.upgradePearl = 0;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasUpgradePearl() {
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
            if (!java.util.Objects.equals(this.level, that.level)) {
                return false;
            }
            if (!java.util.Objects.equals(this.hitBuff, that.hitBuff)) {
                return false;
            }
            if (!java.util.Objects.equals(this.goldBuff, that.goldBuff)) {
                return false;
            }
            if (!java.util.Objects.equals(this.upgradeNext, that.upgradeNext)) {
                return false;
            }
            if (!java.util.Objects.equals(this.upgradeLevel, that.upgradeLevel)) {
                return false;
            }
            if (!java.util.Objects.equals(this.upgradeGold, that.upgradeGold)) {
                return false;
            }
            if (!java.util.Objects.equals(this.upgradePearl, that.upgradePearl)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.baseId);
            result = 31 * result + Integer.hashCode(this.level);
            result = 31 * result + Float.hashCode(this.hitBuff);
            result = 31 * result + Float.hashCode(this.goldBuff);
            result = 31 * result + Integer.hashCode(this.upgradeNext);
            result = 31 * result + Integer.hashCode(this.upgradeLevel);
            result = 31 * result + Integer.hashCode(this.upgradeGold);
            result = 31 * result + Integer.hashCode(this.upgradePearl);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasBaseId()) {
                parts.add("baseId=" + getBaseId());
            }
            if (hasLevel()) {
                parts.add("level=" + getLevel());
            }
            if (hasHitBuff()) {
                parts.add("hitBuff=" + getHitBuff());
            }
            if (hasGoldBuff()) {
                parts.add("goldBuff=" + getGoldBuff());
            }
            if (hasUpgradeNext()) {
                parts.add("upgradeNext=" + getUpgradeNext());
            }
            if (hasUpgradeLevel()) {
                parts.add("upgradeLevel=" + getUpgradeLevel());
            }
            if (hasUpgradeGold()) {
                parts.add("upgradeGold=" + getUpgradeGold());
            }
            if (hasUpgradePearl()) {
                parts.add("upgradePearl=" + getUpgradePearl());
            }
            return "CannonUpgrade{" + String.join(", ", parts) + "}";
        }

        public CannonUpgrade build() {
            proto.message.CannonUpgrade result = new proto.message.CannonUpgrade();
            result.__bitField0 = __bitField0;
            result.baseId = this.baseId;
            result.level = this.level;
            result.hitBuff = this.hitBuff;
            result.goldBuff = this.goldBuff;
            result.upgradeNext = this.upgradeNext;
            result.upgradeLevel = this.upgradeLevel;
            result.upgradeGold = this.upgradeGold;
            result.upgradePearl = this.upgradePearl;
            return result;
        }

    }



}