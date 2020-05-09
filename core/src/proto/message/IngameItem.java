package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public final class IngameItem
        implements io.protostuff.Message<IngameItem> {

    private static final IngameItem DEFAULT_INSTANCE = newBuilder().build();

    private int itemId;

    private String description;

    private int goldBuy;

    private int goldSend;

    private int category;

    private boolean freeMode;

    private boolean betMode;

    private int stunSecond;

    private int kickAmount;

    private int charmPoint;

    private boolean __merge_lock = false;
    private int __bitField0;

    private IngameItem() {
        this.itemId = 0;
        this.description = "";
        this.goldBuy = 0;
        this.goldSend = 0;
        this.category = 0;
        this.freeMode = false;
        this.betMode = false;
        this.stunSecond = 0;
        this.kickAmount = 0;
        this.charmPoint = 0;
    }

    private IngameItem(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static IngameItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<IngameItem> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getItemId() {
        return itemId;
    }

    public boolean hasItemId() {
        return (__bitField0 & 1) == 1;
    }

    public IngameItem withItemId(int value) {
        return IngameItem.newBuilder()
            .mergeFrom(this)
            .setItemId(value)
            .build();
    }

    public String getDescription() {
        return description;
    }

    public boolean hasDescription() {
        return (__bitField0 & 2) == 2;
    }

    public IngameItem withDescription(String value) {
        return IngameItem.newBuilder()
            .mergeFrom(this)
            .setDescription(value)
            .build();
    }

    public int getGoldBuy() {
        return goldBuy;
    }

    public boolean hasGoldBuy() {
        return (__bitField0 & 4) == 4;
    }

    public IngameItem withGoldBuy(int value) {
        return IngameItem.newBuilder()
            .mergeFrom(this)
            .setGoldBuy(value)
            .build();
    }

    public int getGoldSend() {
        return goldSend;
    }

    public boolean hasGoldSend() {
        return (__bitField0 & 8) == 8;
    }

    public IngameItem withGoldSend(int value) {
        return IngameItem.newBuilder()
            .mergeFrom(this)
            .setGoldSend(value)
            .build();
    }

    public int getCategory() {
        return category;
    }

    public boolean hasCategory() {
        return (__bitField0 & 16) == 16;
    }

    public IngameItem withCategory(int value) {
        return IngameItem.newBuilder()
            .mergeFrom(this)
            .setCategory(value)
            .build();
    }

    public boolean getFreeMode() {
        return freeMode;
    }

    public boolean hasFreeMode() {
        return (__bitField0 & 32) == 32;
    }

    public IngameItem withFreeMode(boolean value) {
        return IngameItem.newBuilder()
            .mergeFrom(this)
            .setFreeMode(value)
            .build();
    }

    public boolean getBetMode() {
        return betMode;
    }

    public boolean hasBetMode() {
        return (__bitField0 & 64) == 64;
    }

    public IngameItem withBetMode(boolean value) {
        return IngameItem.newBuilder()
            .mergeFrom(this)
            .setBetMode(value)
            .build();
    }

    public int getStunSecond() {
        return stunSecond;
    }

    public boolean hasStunSecond() {
        return (__bitField0 & 128) == 128;
    }

    public IngameItem withStunSecond(int value) {
        return IngameItem.newBuilder()
            .mergeFrom(this)
            .setStunSecond(value)
            .build();
    }

    public int getKickAmount() {
        return kickAmount;
    }

    public boolean hasKickAmount() {
        return (__bitField0 & 256) == 256;
    }

    public IngameItem withKickAmount(int value) {
        return IngameItem.newBuilder()
            .mergeFrom(this)
            .setKickAmount(value)
            .build();
    }

    public int getCharmPoint() {
        return charmPoint;
    }

    public boolean hasCharmPoint() {
        return (__bitField0 & 512) == 512;
    }

    public IngameItem withCharmPoint(int value) {
        return IngameItem.newBuilder()
            .mergeFrom(this)
            .setCharmPoint(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<IngameItem> cachedSchema() {
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
        IngameItem that = (IngameItem) obj;
        if (!java.util.Objects.equals(this.itemId, that.itemId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.description, that.description)) {
            return false;
        }
        if (!java.util.Objects.equals(this.goldBuy, that.goldBuy)) {
            return false;
        }
        if (!java.util.Objects.equals(this.goldSend, that.goldSend)) {
            return false;
        }
        if (!java.util.Objects.equals(this.category, that.category)) {
            return false;
        }
        if (!java.util.Objects.equals(this.freeMode, that.freeMode)) {
            return false;
        }
        if (!java.util.Objects.equals(this.betMode, that.betMode)) {
            return false;
        }
        if (!java.util.Objects.equals(this.stunSecond, that.stunSecond)) {
            return false;
        }
        if (!java.util.Objects.equals(this.kickAmount, that.kickAmount)) {
            return false;
        }
        if (!java.util.Objects.equals(this.charmPoint, that.charmPoint)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.itemId);
        result = 31 * result + (this.description == null ? 0 : this.description.hashCode());
        result = 31 * result + Integer.hashCode(this.goldBuy);
        result = 31 * result + Integer.hashCode(this.goldSend);
        result = 31 * result + Integer.hashCode(this.category);
        result = 31 * result + Boolean.hashCode(this.freeMode);
        result = 31 * result + Boolean.hashCode(this.betMode);
        result = 31 * result + Integer.hashCode(this.stunSecond);
        result = 31 * result + Integer.hashCode(this.kickAmount);
        result = 31 * result + Integer.hashCode(this.charmPoint);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasItemId()) {
            parts.add("itemId=" + getItemId());
        }
        if (hasDescription()) {
            parts.add("description=" + getDescription());
        }
        if (hasGoldBuy()) {
            parts.add("goldBuy=" + getGoldBuy());
        }
        if (hasGoldSend()) {
            parts.add("goldSend=" + getGoldSend());
        }
        if (hasCategory()) {
            parts.add("category=" + getCategory());
        }
        if (hasFreeMode()) {
            parts.add("freeMode=" + getFreeMode());
        }
        if (hasBetMode()) {
            parts.add("betMode=" + getBetMode());
        }
        if (hasStunSecond()) {
            parts.add("stunSecond=" + getStunSecond());
        }
        if (hasKickAmount()) {
            parts.add("kickAmount=" + getKickAmount());
        }
        if (hasCharmPoint()) {
            parts.add("charmPoint=" + getCharmPoint());
        }
        return "IngameItem{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<IngameItem>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("itemId", 1);
        	__fieldMap.put("description", 2);
        	__fieldMap.put("goldBuy", 3);
        	__fieldMap.put("goldSend", 4);
        	__fieldMap.put("category", 5);
        	__fieldMap.put("freeMode", 6);
        	__fieldMap.put("betMode", 7);
        	__fieldMap.put("stunSecond", 8);
        	__fieldMap.put("kickAmount", 9);
        	__fieldMap.put("charmPoint", 10);
        }

        @Override
        public IngameItem newMessage() {
            return new IngameItem();
        }

        @Override
        public Class<IngameItem> typeClass() {
            return IngameItem.class;
        }

        @Override
        public String messageName() {
            return IngameItem.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return IngameItem.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(IngameItem message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, IngameItem instance) throws java.io.IOException {
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
                    	instance.itemId = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.description = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.goldBuy = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.goldSend = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.category = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.freeMode = input.readBool();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.betMode = input.readBool();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.stunSecond = input.readInt32();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 9:
                    	instance.kickAmount = input.readInt32();
                    	instance.__bitField0 |= 256;
                    	break;
                    case 10:
                    	instance.charmPoint = input.readInt32();
                    	instance.__bitField0 |= 512;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, IngameItem instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.itemId, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.description, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.goldBuy, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.goldSend, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.category, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeBool(6, instance.freeMode, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeBool(7, instance.betMode, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeInt32(8, instance.stunSecond, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeInt32(9, instance.kickAmount, false);
            }

            if((instance.__bitField0 & 512) == 512) {
                output.writeInt32(10, instance.charmPoint, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "itemId";
        		case 2: return "description";
        		case 3: return "goldBuy";
        		case 4: return "goldSend";
        		case 5: return "category";
        		case 6: return "freeMode";
        		case 7: return "betMode";
        		case 8: return "stunSecond";
        		case 9: return "kickAmount";
        		case 10: return "charmPoint";
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

        private int itemId;

        private String description;

        private int goldBuy;

        private int goldSend;

        private int category;

        private boolean freeMode;

        private boolean betMode;

        private int stunSecond;

        private int kickAmount;

        private int charmPoint;

        private int __bitField0;

        private Builder() {
            this.itemId = 0;
            this.description = "";
            this.goldBuy = 0;
            this.goldSend = 0;
            this.category = 0;
            this.freeMode = false;
            this.betMode = false;
            this.stunSecond = 0;
            this.kickAmount = 0;
            this.charmPoint = 0;
        }

        public Builder mergeFrom(IngameItem instance) {
            if (instance.hasItemId()) {
                this.setItemId(instance.getItemId());
            }

            if (instance.hasDescription()) {
                this.setDescription(instance.getDescription());
            }

            if (instance.hasGoldBuy()) {
                this.setGoldBuy(instance.getGoldBuy());
            }

            if (instance.hasGoldSend()) {
                this.setGoldSend(instance.getGoldSend());
            }

            if (instance.hasCategory()) {
                this.setCategory(instance.getCategory());
            }

            if (instance.hasFreeMode()) {
                this.setFreeMode(instance.getFreeMode());
            }

            if (instance.hasBetMode()) {
                this.setBetMode(instance.getBetMode());
            }

            if (instance.hasStunSecond()) {
                this.setStunSecond(instance.getStunSecond());
            }

            if (instance.hasKickAmount()) {
                this.setKickAmount(instance.getKickAmount());
            }

            if (instance.hasCharmPoint()) {
                this.setCharmPoint(instance.getCharmPoint());
            }

            return this;
        }

        public int getItemId() {
            return itemId;
        }

        public Builder setItemId(int value) {
            this.itemId = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearItemId() {
            this.itemId = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasItemId() {
            return (__bitField0 & 1) == 1;
        }

        public String getDescription() {
            return description;
        }

        public Builder setDescription(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set IngameItem#description to null");
            }

            this.description = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearDescription() {
            this.description = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasDescription() {
            return (__bitField0 & 2) == 2;
        }

        public int getGoldBuy() {
            return goldBuy;
        }

        public Builder setGoldBuy(int value) {
            this.goldBuy = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearGoldBuy() {
            this.goldBuy = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasGoldBuy() {
            return (__bitField0 & 4) == 4;
        }

        public int getGoldSend() {
            return goldSend;
        }

        public Builder setGoldSend(int value) {
            this.goldSend = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearGoldSend() {
            this.goldSend = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasGoldSend() {
            return (__bitField0 & 8) == 8;
        }

        public int getCategory() {
            return category;
        }

        public Builder setCategory(int value) {
            this.category = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearCategory() {
            this.category = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasCategory() {
            return (__bitField0 & 16) == 16;
        }

        public boolean getFreeMode() {
            return freeMode;
        }

        public Builder setFreeMode(boolean value) {
            this.freeMode = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearFreeMode() {
            this.freeMode = false;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasFreeMode() {
            return (__bitField0 & 32) == 32;
        }

        public boolean getBetMode() {
            return betMode;
        }

        public Builder setBetMode(boolean value) {
            this.betMode = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearBetMode() {
            this.betMode = false;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasBetMode() {
            return (__bitField0 & 64) == 64;
        }

        public int getStunSecond() {
            return stunSecond;
        }

        public Builder setStunSecond(int value) {
            this.stunSecond = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearStunSecond() {
            this.stunSecond = 0;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasStunSecond() {
            return (__bitField0 & 128) == 128;
        }

        public int getKickAmount() {
            return kickAmount;
        }

        public Builder setKickAmount(int value) {
            this.kickAmount = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearKickAmount() {
            this.kickAmount = 0;
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasKickAmount() {
            return (__bitField0 & 256) == 256;
        }

        public int getCharmPoint() {
            return charmPoint;
        }

        public Builder setCharmPoint(int value) {
            this.charmPoint = value;
            __bitField0 |= 512;
            return this;
        }

        public Builder clearCharmPoint() {
            this.charmPoint = 0;
            __bitField0 &= ~512;
            return this;
        }

        public boolean hasCharmPoint() {
            return (__bitField0 & 512) == 512;
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
            if (!java.util.Objects.equals(this.itemId, that.itemId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.description, that.description)) {
                return false;
            }
            if (!java.util.Objects.equals(this.goldBuy, that.goldBuy)) {
                return false;
            }
            if (!java.util.Objects.equals(this.goldSend, that.goldSend)) {
                return false;
            }
            if (!java.util.Objects.equals(this.category, that.category)) {
                return false;
            }
            if (!java.util.Objects.equals(this.freeMode, that.freeMode)) {
                return false;
            }
            if (!java.util.Objects.equals(this.betMode, that.betMode)) {
                return false;
            }
            if (!java.util.Objects.equals(this.stunSecond, that.stunSecond)) {
                return false;
            }
            if (!java.util.Objects.equals(this.kickAmount, that.kickAmount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.charmPoint, that.charmPoint)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.itemId);
            result = 31 * result + (this.description == null ? 0 : this.description.hashCode());
            result = 31 * result + Integer.hashCode(this.goldBuy);
            result = 31 * result + Integer.hashCode(this.goldSend);
            result = 31 * result + Integer.hashCode(this.category);
            result = 31 * result + Boolean.hashCode(this.freeMode);
            result = 31 * result + Boolean.hashCode(this.betMode);
            result = 31 * result + Integer.hashCode(this.stunSecond);
            result = 31 * result + Integer.hashCode(this.kickAmount);
            result = 31 * result + Integer.hashCode(this.charmPoint);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasItemId()) {
                parts.add("itemId=" + getItemId());
            }
            if (hasDescription()) {
                parts.add("description=" + getDescription());
            }
            if (hasGoldBuy()) {
                parts.add("goldBuy=" + getGoldBuy());
            }
            if (hasGoldSend()) {
                parts.add("goldSend=" + getGoldSend());
            }
            if (hasCategory()) {
                parts.add("category=" + getCategory());
            }
            if (hasFreeMode()) {
                parts.add("freeMode=" + getFreeMode());
            }
            if (hasBetMode()) {
                parts.add("betMode=" + getBetMode());
            }
            if (hasStunSecond()) {
                parts.add("stunSecond=" + getStunSecond());
            }
            if (hasKickAmount()) {
                parts.add("kickAmount=" + getKickAmount());
            }
            if (hasCharmPoint()) {
                parts.add("charmPoint=" + getCharmPoint());
            }
            return "IngameItem{" + String.join(", ", parts) + "}";
        }

        public IngameItem build() {
            proto.message.IngameItem result = new proto.message.IngameItem();
            result.__bitField0 = __bitField0;
            result.itemId = this.itemId;
            result.description = this.description;
            result.goldBuy = this.goldBuy;
            result.goldSend = this.goldSend;
            result.category = this.category;
            result.freeMode = this.freeMode;
            result.betMode = this.betMode;
            result.stunSecond = this.stunSecond;
            result.kickAmount = this.kickAmount;
            result.charmPoint = this.charmPoint;
            return result;
        }

    }



}