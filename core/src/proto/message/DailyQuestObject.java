package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class DailyQuestObject
        implements io.protostuff.Message<DailyQuestObject> {

    private static final DailyQuestObject DEFAULT_INSTANCE = newBuilder().build();

    private int questId;

    private int status;

    private int action;

    private int item;

    private int amount;

    private int finish;

    private int rewardExp;

    private int rewardGold;

    private String description;

    private String description2;

    private String fileName;

    private int rewardPearl;

    private int rewardTicket;

    private boolean __merge_lock = false;
    private int __bitField0;

    private DailyQuestObject() {
        this.questId = 0;
        this.status = 0;
        this.action = 0;
        this.item = 0;
        this.amount = 0;
        this.finish = 0;
        this.rewardExp = 0;
        this.rewardGold = 0;
        this.description = "";
        this.description2 = "";
        this.fileName = "";
        this.rewardPearl = 0;
        this.rewardTicket = 0;
    }

    private DailyQuestObject(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static DailyQuestObject getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<DailyQuestObject> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public int getQuestId() {
        return questId;
    }

    public boolean hasQuestId() {
        return (__bitField0 & 1) == 1;
    }

    public DailyQuestObject withQuestId(int value) {
        return DailyQuestObject.newBuilder()
            .mergeFrom(this)
            .setQuestId(value)
            .build();
    }

    public int getStatus() {
        return status;
    }

    public boolean hasStatus() {
        return (__bitField0 & 2) == 2;
    }

    public DailyQuestObject withStatus(int value) {
        return DailyQuestObject.newBuilder()
            .mergeFrom(this)
            .setStatus(value)
            .build();
    }

    public int getAction() {
        return action;
    }

    public boolean hasAction() {
        return (__bitField0 & 4) == 4;
    }

    public DailyQuestObject withAction(int value) {
        return DailyQuestObject.newBuilder()
            .mergeFrom(this)
            .setAction(value)
            .build();
    }

    public int getItem() {
        return item;
    }

    public boolean hasItem() {
        return (__bitField0 & 8) == 8;
    }

    public DailyQuestObject withItem(int value) {
        return DailyQuestObject.newBuilder()
            .mergeFrom(this)
            .setItem(value)
            .build();
    }

    public int getAmount() {
        return amount;
    }

    public boolean hasAmount() {
        return (__bitField0 & 16) == 16;
    }

    public DailyQuestObject withAmount(int value) {
        return DailyQuestObject.newBuilder()
            .mergeFrom(this)
            .setAmount(value)
            .build();
    }

    public int getFinish() {
        return finish;
    }

    public boolean hasFinish() {
        return (__bitField0 & 32) == 32;
    }

    public DailyQuestObject withFinish(int value) {
        return DailyQuestObject.newBuilder()
            .mergeFrom(this)
            .setFinish(value)
            .build();
    }

    public int getRewardExp() {
        return rewardExp;
    }

    public boolean hasRewardExp() {
        return (__bitField0 & 64) == 64;
    }

    public DailyQuestObject withRewardExp(int value) {
        return DailyQuestObject.newBuilder()
            .mergeFrom(this)
            .setRewardExp(value)
            .build();
    }

    public int getRewardGold() {
        return rewardGold;
    }

    public boolean hasRewardGold() {
        return (__bitField0 & 128) == 128;
    }

    public DailyQuestObject withRewardGold(int value) {
        return DailyQuestObject.newBuilder()
            .mergeFrom(this)
            .setRewardGold(value)
            .build();
    }

    public String getDescription() {
        return description;
    }

    public boolean hasDescription() {
        return (__bitField0 & 256) == 256;
    }

    public DailyQuestObject withDescription(String value) {
        return DailyQuestObject.newBuilder()
            .mergeFrom(this)
            .setDescription(value)
            .build();
    }

    public String getDescription2() {
        return description2;
    }

    public boolean hasDescription2() {
        return (__bitField0 & 512) == 512;
    }

    public DailyQuestObject withDescription2(String value) {
        return DailyQuestObject.newBuilder()
            .mergeFrom(this)
            .setDescription2(value)
            .build();
    }

    public String getFileName() {
        return fileName;
    }

    public boolean hasFileName() {
        return (__bitField0 & 1024) == 1024;
    }

    public DailyQuestObject withFileName(String value) {
        return DailyQuestObject.newBuilder()
            .mergeFrom(this)
            .setFileName(value)
            .build();
    }

    public int getRewardPearl() {
        return rewardPearl;
    }

    public boolean hasRewardPearl() {
        return (__bitField0 & 2048) == 2048;
    }

    public DailyQuestObject withRewardPearl(int value) {
        return DailyQuestObject.newBuilder()
            .mergeFrom(this)
            .setRewardPearl(value)
            .build();
    }

    public int getRewardTicket() {
        return rewardTicket;
    }

    public boolean hasRewardTicket() {
        return (__bitField0 & 4096) == 4096;
    }

    public DailyQuestObject withRewardTicket(int value) {
        return DailyQuestObject.newBuilder()
            .mergeFrom(this)
            .setRewardTicket(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<DailyQuestObject> cachedSchema() {
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
        DailyQuestObject that = (DailyQuestObject) obj;
        if (!java.util.Objects.equals(this.questId, that.questId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.status, that.status)) {
            return false;
        }
        if (!java.util.Objects.equals(this.action, that.action)) {
            return false;
        }
        if (!java.util.Objects.equals(this.item, that.item)) {
            return false;
        }
        if (!java.util.Objects.equals(this.amount, that.amount)) {
            return false;
        }
        if (!java.util.Objects.equals(this.finish, that.finish)) {
            return false;
        }
        if (!java.util.Objects.equals(this.rewardExp, that.rewardExp)) {
            return false;
        }
        if (!java.util.Objects.equals(this.rewardGold, that.rewardGold)) {
            return false;
        }
        if (!java.util.Objects.equals(this.description, that.description)) {
            return false;
        }
        if (!java.util.Objects.equals(this.description2, that.description2)) {
            return false;
        }
        if (!java.util.Objects.equals(this.fileName, that.fileName)) {
            return false;
        }
        if (!java.util.Objects.equals(this.rewardPearl, that.rewardPearl)) {
            return false;
        }
        if (!java.util.Objects.equals(this.rewardTicket, that.rewardTicket)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.questId);
        result = 31 * result + Integer.hashCode(this.status);
        result = 31 * result + Integer.hashCode(this.action);
        result = 31 * result + Integer.hashCode(this.item);
        result = 31 * result + Integer.hashCode(this.amount);
        result = 31 * result + Integer.hashCode(this.finish);
        result = 31 * result + Integer.hashCode(this.rewardExp);
        result = 31 * result + Integer.hashCode(this.rewardGold);
        result = 31 * result + (this.description == null ? 0 : this.description.hashCode());
        result = 31 * result + (this.description2 == null ? 0 : this.description2.hashCode());
        result = 31 * result + (this.fileName == null ? 0 : this.fileName.hashCode());
        result = 31 * result + Integer.hashCode(this.rewardPearl);
        result = 31 * result + Integer.hashCode(this.rewardTicket);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasQuestId()) {
            parts.add("questId=" + getQuestId());
        }
        if (hasStatus()) {
            parts.add("status=" + getStatus());
        }
        if (hasAction()) {
            parts.add("action=" + getAction());
        }
        if (hasItem()) {
            parts.add("item=" + getItem());
        }
        if (hasAmount()) {
            parts.add("amount=" + getAmount());
        }
        if (hasFinish()) {
            parts.add("finish=" + getFinish());
        }
        if (hasRewardExp()) {
            parts.add("rewardExp=" + getRewardExp());
        }
        if (hasRewardGold()) {
            parts.add("rewardGold=" + getRewardGold());
        }
        if (hasDescription()) {
            parts.add("description=" + getDescription());
        }
        if (hasDescription2()) {
            parts.add("description2=" + getDescription2());
        }
        if (hasFileName()) {
            parts.add("fileName=" + getFileName());
        }
        if (hasRewardPearl()) {
            parts.add("rewardPearl=" + getRewardPearl());
        }
        if (hasRewardTicket()) {
            parts.add("rewardTicket=" + getRewardTicket());
        }
        return "DailyQuestObject{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<DailyQuestObject>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("questId", 1);
        	__fieldMap.put("status", 2);
        	__fieldMap.put("action", 3);
        	__fieldMap.put("item", 4);
        	__fieldMap.put("amount", 5);
        	__fieldMap.put("finish", 6);
        	__fieldMap.put("rewardExp", 7);
        	__fieldMap.put("rewardGold", 8);
        	__fieldMap.put("description", 9);
        	__fieldMap.put("description2", 10);
        	__fieldMap.put("fileName", 11);
        	__fieldMap.put("rewardPearl", 12);
        	__fieldMap.put("rewardTicket", 13);
        }

        @Override
        public DailyQuestObject newMessage() {
            return new DailyQuestObject();
        }

        @Override
        public Class<DailyQuestObject> typeClass() {
            return DailyQuestObject.class;
        }

        @Override
        public String messageName() {
            return DailyQuestObject.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return DailyQuestObject.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(DailyQuestObject message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, DailyQuestObject instance) throws java.io.IOException {
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
                    	instance.questId = input.readInt32();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.status = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.action = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.item = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.amount = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.finish = input.readInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.rewardExp = input.readInt32();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.rewardGold = input.readInt32();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 9:
                    	instance.description = input.readString();
                    	instance.__bitField0 |= 256;
                    	break;
                    case 10:
                    	instance.description2 = input.readString();
                    	instance.__bitField0 |= 512;
                    	break;
                    case 11:
                    	instance.fileName = input.readString();
                    	instance.__bitField0 |= 1024;
                    	break;
                    case 12:
                    	instance.rewardPearl = input.readInt32();
                    	instance.__bitField0 |= 2048;
                    	break;
                    case 13:
                    	instance.rewardTicket = input.readInt32();
                    	instance.__bitField0 |= 4096;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, DailyQuestObject instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt32(1, instance.questId, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.status, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.action, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.item, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.amount, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeInt32(6, instance.finish, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeInt32(7, instance.rewardExp, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeInt32(8, instance.rewardGold, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeString(9, instance.description, false);
            }

            if((instance.__bitField0 & 512) == 512) {
                output.writeString(10, instance.description2, false);
            }

            if((instance.__bitField0 & 1024) == 1024) {
                output.writeString(11, instance.fileName, false);
            }

            if((instance.__bitField0 & 2048) == 2048) {
                output.writeInt32(12, instance.rewardPearl, false);
            }

            if((instance.__bitField0 & 4096) == 4096) {
                output.writeInt32(13, instance.rewardTicket, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "questId";
        		case 2: return "status";
        		case 3: return "action";
        		case 4: return "item";
        		case 5: return "amount";
        		case 6: return "finish";
        		case 7: return "rewardExp";
        		case 8: return "rewardGold";
        		case 9: return "description";
        		case 10: return "description2";
        		case 11: return "fileName";
        		case 12: return "rewardPearl";
        		case 13: return "rewardTicket";
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

        private int questId;

        private int status;

        private int action;

        private int item;

        private int amount;

        private int finish;

        private int rewardExp;

        private int rewardGold;

        private String description;

        private String description2;

        private String fileName;

        private int rewardPearl;

        private int rewardTicket;

        private int __bitField0;

        private Builder() {
            this.questId = 0;
            this.status = 0;
            this.action = 0;
            this.item = 0;
            this.amount = 0;
            this.finish = 0;
            this.rewardExp = 0;
            this.rewardGold = 0;
            this.description = "";
            this.description2 = "";
            this.fileName = "";
            this.rewardPearl = 0;
            this.rewardTicket = 0;
        }

        public Builder mergeFrom(DailyQuestObject instance) {
            if (instance.hasQuestId()) {
                this.setQuestId(instance.getQuestId());
            }

            if (instance.hasStatus()) {
                this.setStatus(instance.getStatus());
            }

            if (instance.hasAction()) {
                this.setAction(instance.getAction());
            }

            if (instance.hasItem()) {
                this.setItem(instance.getItem());
            }

            if (instance.hasAmount()) {
                this.setAmount(instance.getAmount());
            }

            if (instance.hasFinish()) {
                this.setFinish(instance.getFinish());
            }

            if (instance.hasRewardExp()) {
                this.setRewardExp(instance.getRewardExp());
            }

            if (instance.hasRewardGold()) {
                this.setRewardGold(instance.getRewardGold());
            }

            if (instance.hasDescription()) {
                this.setDescription(instance.getDescription());
            }

            if (instance.hasDescription2()) {
                this.setDescription2(instance.getDescription2());
            }

            if (instance.hasFileName()) {
                this.setFileName(instance.getFileName());
            }

            if (instance.hasRewardPearl()) {
                this.setRewardPearl(instance.getRewardPearl());
            }

            if (instance.hasRewardTicket()) {
                this.setRewardTicket(instance.getRewardTicket());
            }

            return this;
        }

        public int getQuestId() {
            return questId;
        }

        public Builder setQuestId(int value) {
            this.questId = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearQuestId() {
            this.questId = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasQuestId() {
            return (__bitField0 & 1) == 1;
        }

        public int getStatus() {
            return status;
        }

        public Builder setStatus(int value) {
            this.status = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearStatus() {
            this.status = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasStatus() {
            return (__bitField0 & 2) == 2;
        }

        public int getAction() {
            return action;
        }

        public Builder setAction(int value) {
            this.action = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearAction() {
            this.action = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasAction() {
            return (__bitField0 & 4) == 4;
        }

        public int getItem() {
            return item;
        }

        public Builder setItem(int value) {
            this.item = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearItem() {
            this.item = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasItem() {
            return (__bitField0 & 8) == 8;
        }

        public int getAmount() {
            return amount;
        }

        public Builder setAmount(int value) {
            this.amount = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearAmount() {
            this.amount = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasAmount() {
            return (__bitField0 & 16) == 16;
        }

        public int getFinish() {
            return finish;
        }

        public Builder setFinish(int value) {
            this.finish = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearFinish() {
            this.finish = 0;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasFinish() {
            return (__bitField0 & 32) == 32;
        }

        public int getRewardExp() {
            return rewardExp;
        }

        public Builder setRewardExp(int value) {
            this.rewardExp = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearRewardExp() {
            this.rewardExp = 0;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasRewardExp() {
            return (__bitField0 & 64) == 64;
        }

        public int getRewardGold() {
            return rewardGold;
        }

        public Builder setRewardGold(int value) {
            this.rewardGold = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearRewardGold() {
            this.rewardGold = 0;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasRewardGold() {
            return (__bitField0 & 128) == 128;
        }

        public String getDescription() {
            return description;
        }

        public Builder setDescription(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set DailyQuestObject#description to null");
            }

            this.description = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearDescription() {
            this.description = "";
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasDescription() {
            return (__bitField0 & 256) == 256;
        }

        public String getDescription2() {
            return description2;
        }

        public Builder setDescription2(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set DailyQuestObject#description2 to null");
            }

            this.description2 = value;
            __bitField0 |= 512;
            return this;
        }

        public Builder clearDescription2() {
            this.description2 = "";
            __bitField0 &= ~512;
            return this;
        }

        public boolean hasDescription2() {
            return (__bitField0 & 512) == 512;
        }

        public String getFileName() {
            return fileName;
        }

        public Builder setFileName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set DailyQuestObject#fileName to null");
            }

            this.fileName = value;
            __bitField0 |= 1024;
            return this;
        }

        public Builder clearFileName() {
            this.fileName = "";
            __bitField0 &= ~1024;
            return this;
        }

        public boolean hasFileName() {
            return (__bitField0 & 1024) == 1024;
        }

        public int getRewardPearl() {
            return rewardPearl;
        }

        public Builder setRewardPearl(int value) {
            this.rewardPearl = value;
            __bitField0 |= 2048;
            return this;
        }

        public Builder clearRewardPearl() {
            this.rewardPearl = 0;
            __bitField0 &= ~2048;
            return this;
        }

        public boolean hasRewardPearl() {
            return (__bitField0 & 2048) == 2048;
        }

        public int getRewardTicket() {
            return rewardTicket;
        }

        public Builder setRewardTicket(int value) {
            this.rewardTicket = value;
            __bitField0 |= 4096;
            return this;
        }

        public Builder clearRewardTicket() {
            this.rewardTicket = 0;
            __bitField0 &= ~4096;
            return this;
        }

        public boolean hasRewardTicket() {
            return (__bitField0 & 4096) == 4096;
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
            if (!java.util.Objects.equals(this.questId, that.questId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.status, that.status)) {
                return false;
            }
            if (!java.util.Objects.equals(this.action, that.action)) {
                return false;
            }
            if (!java.util.Objects.equals(this.item, that.item)) {
                return false;
            }
            if (!java.util.Objects.equals(this.amount, that.amount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.finish, that.finish)) {
                return false;
            }
            if (!java.util.Objects.equals(this.rewardExp, that.rewardExp)) {
                return false;
            }
            if (!java.util.Objects.equals(this.rewardGold, that.rewardGold)) {
                return false;
            }
            if (!java.util.Objects.equals(this.description, that.description)) {
                return false;
            }
            if (!java.util.Objects.equals(this.description2, that.description2)) {
                return false;
            }
            if (!java.util.Objects.equals(this.fileName, that.fileName)) {
                return false;
            }
            if (!java.util.Objects.equals(this.rewardPearl, that.rewardPearl)) {
                return false;
            }
            if (!java.util.Objects.equals(this.rewardTicket, that.rewardTicket)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.questId);
            result = 31 * result + Integer.hashCode(this.status);
            result = 31 * result + Integer.hashCode(this.action);
            result = 31 * result + Integer.hashCode(this.item);
            result = 31 * result + Integer.hashCode(this.amount);
            result = 31 * result + Integer.hashCode(this.finish);
            result = 31 * result + Integer.hashCode(this.rewardExp);
            result = 31 * result + Integer.hashCode(this.rewardGold);
            result = 31 * result + (this.description == null ? 0 : this.description.hashCode());
            result = 31 * result + (this.description2 == null ? 0 : this.description2.hashCode());
            result = 31 * result + (this.fileName == null ? 0 : this.fileName.hashCode());
            result = 31 * result + Integer.hashCode(this.rewardPearl);
            result = 31 * result + Integer.hashCode(this.rewardTicket);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasQuestId()) {
                parts.add("questId=" + getQuestId());
            }
            if (hasStatus()) {
                parts.add("status=" + getStatus());
            }
            if (hasAction()) {
                parts.add("action=" + getAction());
            }
            if (hasItem()) {
                parts.add("item=" + getItem());
            }
            if (hasAmount()) {
                parts.add("amount=" + getAmount());
            }
            if (hasFinish()) {
                parts.add("finish=" + getFinish());
            }
            if (hasRewardExp()) {
                parts.add("rewardExp=" + getRewardExp());
            }
            if (hasRewardGold()) {
                parts.add("rewardGold=" + getRewardGold());
            }
            if (hasDescription()) {
                parts.add("description=" + getDescription());
            }
            if (hasDescription2()) {
                parts.add("description2=" + getDescription2());
            }
            if (hasFileName()) {
                parts.add("fileName=" + getFileName());
            }
            if (hasRewardPearl()) {
                parts.add("rewardPearl=" + getRewardPearl());
            }
            if (hasRewardTicket()) {
                parts.add("rewardTicket=" + getRewardTicket());
            }
            return "DailyQuestObject{" + String.join(", ", parts) + "}";
        }

        public DailyQuestObject build() {
            proto.message.DailyQuestObject result = new proto.message.DailyQuestObject();
            result.__bitField0 = __bitField0;
            result.questId = this.questId;
            result.status = this.status;
            result.action = this.action;
            result.item = this.item;
            result.amount = this.amount;
            result.finish = this.finish;
            result.rewardExp = this.rewardExp;
            result.rewardGold = this.rewardGold;
            result.description = this.description;
            result.description2 = this.description2;
            result.fileName = this.fileName;
            result.rewardPearl = this.rewardPearl;
            result.rewardTicket = this.rewardTicket;
            return result;
        }

    }



}