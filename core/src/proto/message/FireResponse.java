package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class FireResponse
        implements io.protostuff.Message<FireResponse> {

    private static final FireResponse DEFAULT_INSTANCE = newBuilder().build();

    private String userID;

    private long hordeID;

    private int amountDead;

    private int reward;

    private int currentExp;

    private int accumulateType;

    private float originalValue;

    private float currentValue;

    private int currentGold;

    private int unlockGold;

    private boolean isUnlockGold;

    private long bulletID;

    private int accumulateGoldLock;

    private int accumulateGoldUnlock;

    private int roseAmount;

    private int roseBonusAt;

    private int stunToSecond;

    private int soloSendAt;

    private int soloReceiveAt;

    private int pearl;

    private int pearlTotal;

    private long reqTime;

    private int accumulateGoldForTiket;

    private int goldBuff;

    private boolean resetAccumulateGoldForTiket;

    private java.util.List<proto.message.FireResponse.DeadFish> fishes;

    private int goldSkillBuff;

    private boolean __merge_lock = false;
    private int __bitField0;

    private FireResponse() {
        this.userID = "";
        this.hordeID = 0L;
        this.amountDead = 0;
        this.reward = 0;
        this.currentExp = 0;
        this.accumulateType = 0;
        this.originalValue = 0f;
        this.currentValue = 0f;
        this.currentGold = 0;
        this.unlockGold = 0;
        this.isUnlockGold = false;
        this.bulletID = 0L;
        this.accumulateGoldLock = 0;
        this.accumulateGoldUnlock = 0;
        this.roseAmount = 0;
        this.roseBonusAt = 0;
        this.stunToSecond = 0;
        this.soloSendAt = 0;
        this.soloReceiveAt = 0;
        this.pearl = 0;
        this.pearlTotal = 0;
        this.reqTime = 0L;
        this.accumulateGoldForTiket = 0;
        this.goldBuff = 0;
        this.resetAccumulateGoldForTiket = false;
        this.fishes = java.util.Collections.emptyList();
        this.goldSkillBuff = 0;
    }

    private FireResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static FireResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<FireResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getUserID() {
        return userID;
    }

    public boolean hasUserID() {
        return (__bitField0 & 1) == 1;
    }

    public FireResponse withUserID(String value) {
        return FireResponse.newBuilder()
            .mergeFrom(this)
            .setUserID(value)
            .build();
    }

    public long getHordeID() {
        return hordeID;
    }

    public boolean hasHordeID() {
        return (__bitField0 & 2) == 2;
    }

    public FireResponse withHordeID(long value) {
        return FireResponse.newBuilder()
            .mergeFrom(this)
            .setHordeID(value)
            .build();
    }

    public int getAmountDead() {
        return amountDead;
    }

    public boolean hasAmountDead() {
        return (__bitField0 & 4) == 4;
    }

    public FireResponse withAmountDead(int value) {
        return FireResponse.newBuilder()
            .mergeFrom(this)
            .setAmountDead(value)
            .build();
    }

    public int getReward() {
        return reward;
    }

    public boolean hasReward() {
        return (__bitField0 & 8) == 8;
    }

    public FireResponse withReward(int value) {
        return FireResponse.newBuilder()
            .mergeFrom(this)
            .setReward(value)
            .build();
    }

    public int getCurrentExp() {
        return currentExp;
    }

    public boolean hasCurrentExp() {
        return (__bitField0 & 16) == 16;
    }

    public FireResponse withCurrentExp(int value) {
        return FireResponse.newBuilder()
            .mergeFrom(this)
            .setCurrentExp(value)
            .build();
    }

    public int getAccumulateType() {
        return accumulateType;
    }

    public boolean hasAccumulateType() {
        return (__bitField0 & 32) == 32;
    }

    public FireResponse withAccumulateType(int value) {
        return FireResponse.newBuilder()
            .mergeFrom(this)
            .setAccumulateType(value)
            .build();
    }

    public float getOriginalValue() {
        return originalValue;
    }

    public boolean hasOriginalValue() {
        return (__bitField0 & 64) == 64;
    }

    public FireResponse withOriginalValue(float value) {
        return FireResponse.newBuilder()
            .mergeFrom(this)
            .setOriginalValue(value)
            .build();
    }

    public float getCurrentValue() {
        return currentValue;
    }

    public boolean hasCurrentValue() {
        return (__bitField0 & 128) == 128;
    }

    public FireResponse withCurrentValue(float value) {
        return FireResponse.newBuilder()
            .mergeFrom(this)
            .setCurrentValue(value)
            .build();
    }

    public int getCurrentGold() {
        return currentGold;
    }

    public boolean hasCurrentGold() {
        return (__bitField0 & 256) == 256;
    }

    public FireResponse withCurrentGold(int value) {
        return FireResponse.newBuilder()
            .mergeFrom(this)
            .setCurrentGold(value)
            .build();
    }

    public int getUnlockGold() {
        return unlockGold;
    }

    public boolean hasUnlockGold() {
        return (__bitField0 & 512) == 512;
    }

    public FireResponse withUnlockGold(int value) {
        return FireResponse.newBuilder()
            .mergeFrom(this)
            .setUnlockGold(value)
            .build();
    }

    public boolean getIsUnlockGold() {
        return isUnlockGold;
    }

    public boolean hasIsUnlockGold() {
        return (__bitField0 & 1024) == 1024;
    }

    public FireResponse withIsUnlockGold(boolean value) {
        return FireResponse.newBuilder()
            .mergeFrom(this)
            .setIsUnlockGold(value)
            .build();
    }

    public long getBulletID() {
        return bulletID;
    }

    public boolean hasBulletID() {
        return (__bitField0 & 2048) == 2048;
    }

    public FireResponse withBulletID(long value) {
        return FireResponse.newBuilder()
            .mergeFrom(this)
            .setBulletID(value)
            .build();
    }

    public int getAccumulateGoldLock() {
        return accumulateGoldLock;
    }

    public boolean hasAccumulateGoldLock() {
        return (__bitField0 & 4096) == 4096;
    }

    public FireResponse withAccumulateGoldLock(int value) {
        return FireResponse.newBuilder()
            .mergeFrom(this)
            .setAccumulateGoldLock(value)
            .build();
    }

    public int getAccumulateGoldUnlock() {
        return accumulateGoldUnlock;
    }

    public boolean hasAccumulateGoldUnlock() {
        return (__bitField0 & 8192) == 8192;
    }

    public FireResponse withAccumulateGoldUnlock(int value) {
        return FireResponse.newBuilder()
            .mergeFrom(this)
            .setAccumulateGoldUnlock(value)
            .build();
    }

    public int getRoseAmount() {
        return roseAmount;
    }

    public boolean hasRoseAmount() {
        return (__bitField0 & 16384) == 16384;
    }

    public FireResponse withRoseAmount(int value) {
        return FireResponse.newBuilder()
            .mergeFrom(this)
            .setRoseAmount(value)
            .build();
    }

    public int getRoseBonusAt() {
        return roseBonusAt;
    }

    public boolean hasRoseBonusAt() {
        return (__bitField0 & 32768) == 32768;
    }

    public FireResponse withRoseBonusAt(int value) {
        return FireResponse.newBuilder()
            .mergeFrom(this)
            .setRoseBonusAt(value)
            .build();
    }

    public int getStunToSecond() {
        return stunToSecond;
    }

    public boolean hasStunToSecond() {
        return (__bitField0 & 65536) == 65536;
    }

    public FireResponse withStunToSecond(int value) {
        return FireResponse.newBuilder()
            .mergeFrom(this)
            .setStunToSecond(value)
            .build();
    }

    public int getSoloSendAt() {
        return soloSendAt;
    }

    public boolean hasSoloSendAt() {
        return (__bitField0 & 131072) == 131072;
    }

    public FireResponse withSoloSendAt(int value) {
        return FireResponse.newBuilder()
            .mergeFrom(this)
            .setSoloSendAt(value)
            .build();
    }

    public int getSoloReceiveAt() {
        return soloReceiveAt;
    }

    public boolean hasSoloReceiveAt() {
        return (__bitField0 & 262144) == 262144;
    }

    public FireResponse withSoloReceiveAt(int value) {
        return FireResponse.newBuilder()
            .mergeFrom(this)
            .setSoloReceiveAt(value)
            .build();
    }

    public int getPearl() {
        return pearl;
    }

    public boolean hasPearl() {
        return (__bitField0 & 524288) == 524288;
    }

    public FireResponse withPearl(int value) {
        return FireResponse.newBuilder()
            .mergeFrom(this)
            .setPearl(value)
            .build();
    }

    public int getPearlTotal() {
        return pearlTotal;
    }

    public boolean hasPearlTotal() {
        return (__bitField0 & 1048576) == 1048576;
    }

    public FireResponse withPearlTotal(int value) {
        return FireResponse.newBuilder()
            .mergeFrom(this)
            .setPearlTotal(value)
            .build();
    }

    public long getReqTime() {
        return reqTime;
    }

    public boolean hasReqTime() {
        return (__bitField0 & 2097152) == 2097152;
    }

    public FireResponse withReqTime(long value) {
        return FireResponse.newBuilder()
            .mergeFrom(this)
            .setReqTime(value)
            .build();
    }

    public int getAccumulateGoldForTiket() {
        return accumulateGoldForTiket;
    }

    public boolean hasAccumulateGoldForTiket() {
        return (__bitField0 & 4194304) == 4194304;
    }

    public FireResponse withAccumulateGoldForTiket(int value) {
        return FireResponse.newBuilder()
            .mergeFrom(this)
            .setAccumulateGoldForTiket(value)
            .build();
    }

    public int getGoldBuff() {
        return goldBuff;
    }

    public boolean hasGoldBuff() {
        return (__bitField0 & 8388608) == 8388608;
    }

    public FireResponse withGoldBuff(int value) {
        return FireResponse.newBuilder()
            .mergeFrom(this)
            .setGoldBuff(value)
            .build();
    }

    public boolean getResetAccumulateGoldForTiket() {
        return resetAccumulateGoldForTiket;
    }

    public boolean hasResetAccumulateGoldForTiket() {
        return (__bitField0 & 16777216) == 16777216;
    }

    public FireResponse withResetAccumulateGoldForTiket(boolean value) {
        return FireResponse.newBuilder()
            .mergeFrom(this)
            .setResetAccumulateGoldForTiket(value)
            .build();
    }

    public java.util.List<proto.message.FireResponse.DeadFish> getFishesList() {
        return fishes;
    }

    public int getFishesCount() {
        return fishes.size();
    }

    public proto.message.FireResponse.DeadFish getFishes(int index) {
        return fishes.get(index);
    }

    public FireResponse withFishes(java.util.List<proto.message.FireResponse.DeadFish> value) {
        return FireResponse.newBuilder()
            .mergeFrom(this)
            .clearFishes()
            .addAllFishes(value)
            .build();
    }

    public int getGoldSkillBuff() {
        return goldSkillBuff;
    }

    public boolean hasGoldSkillBuff() {
        return (__bitField0 & 67108864) == 67108864;
    }

    public FireResponse withGoldSkillBuff(int value) {
        return FireResponse.newBuilder()
            .mergeFrom(this)
            .setGoldSkillBuff(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<FireResponse> cachedSchema() {
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
        FireResponse that = (FireResponse) obj;
        if (!java.util.Objects.equals(this.userID, that.userID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.hordeID, that.hordeID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.amountDead, that.amountDead)) {
            return false;
        }
        if (!java.util.Objects.equals(this.reward, that.reward)) {
            return false;
        }
        if (!java.util.Objects.equals(this.currentExp, that.currentExp)) {
            return false;
        }
        if (!java.util.Objects.equals(this.accumulateType, that.accumulateType)) {
            return false;
        }
        if (!java.util.Objects.equals(this.originalValue, that.originalValue)) {
            return false;
        }
        if (!java.util.Objects.equals(this.currentValue, that.currentValue)) {
            return false;
        }
        if (!java.util.Objects.equals(this.currentGold, that.currentGold)) {
            return false;
        }
        if (!java.util.Objects.equals(this.unlockGold, that.unlockGold)) {
            return false;
        }
        if (!java.util.Objects.equals(this.isUnlockGold, that.isUnlockGold)) {
            return false;
        }
        if (!java.util.Objects.equals(this.bulletID, that.bulletID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.accumulateGoldLock, that.accumulateGoldLock)) {
            return false;
        }
        if (!java.util.Objects.equals(this.accumulateGoldUnlock, that.accumulateGoldUnlock)) {
            return false;
        }
        if (!java.util.Objects.equals(this.roseAmount, that.roseAmount)) {
            return false;
        }
        if (!java.util.Objects.equals(this.roseBonusAt, that.roseBonusAt)) {
            return false;
        }
        if (!java.util.Objects.equals(this.stunToSecond, that.stunToSecond)) {
            return false;
        }
        if (!java.util.Objects.equals(this.soloSendAt, that.soloSendAt)) {
            return false;
        }
        if (!java.util.Objects.equals(this.soloReceiveAt, that.soloReceiveAt)) {
            return false;
        }
        if (!java.util.Objects.equals(this.pearl, that.pearl)) {
            return false;
        }
        if (!java.util.Objects.equals(this.pearlTotal, that.pearlTotal)) {
            return false;
        }
        if (!java.util.Objects.equals(this.reqTime, that.reqTime)) {
            return false;
        }
        if (!java.util.Objects.equals(this.accumulateGoldForTiket, that.accumulateGoldForTiket)) {
            return false;
        }
        if (!java.util.Objects.equals(this.goldBuff, that.goldBuff)) {
            return false;
        }
        if (!java.util.Objects.equals(this.resetAccumulateGoldForTiket, that.resetAccumulateGoldForTiket)) {
            return false;
        }
        if (!java.util.Objects.equals(this.fishes, that.fishes)) {
            return false;
        }
        if (!java.util.Objects.equals(this.goldSkillBuff, that.goldSkillBuff)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
        result = 31 * result + Long.hashCode(this.hordeID);
        result = 31 * result + Integer.hashCode(this.amountDead);
        result = 31 * result + Integer.hashCode(this.reward);
        result = 31 * result + Integer.hashCode(this.currentExp);
        result = 31 * result + Integer.hashCode(this.accumulateType);
        result = 31 * result + Float.hashCode(this.originalValue);
        result = 31 * result + Float.hashCode(this.currentValue);
        result = 31 * result + Integer.hashCode(this.currentGold);
        result = 31 * result + Integer.hashCode(this.unlockGold);
        result = 31 * result + Boolean.hashCode(this.isUnlockGold);
        result = 31 * result + Long.hashCode(this.bulletID);
        result = 31 * result + Integer.hashCode(this.accumulateGoldLock);
        result = 31 * result + Integer.hashCode(this.accumulateGoldUnlock);
        result = 31 * result + Integer.hashCode(this.roseAmount);
        result = 31 * result + Integer.hashCode(this.roseBonusAt);
        result = 31 * result + Integer.hashCode(this.stunToSecond);
        result = 31 * result + Integer.hashCode(this.soloSendAt);
        result = 31 * result + Integer.hashCode(this.soloReceiveAt);
        result = 31 * result + Integer.hashCode(this.pearl);
        result = 31 * result + Integer.hashCode(this.pearlTotal);
        result = 31 * result + Long.hashCode(this.reqTime);
        result = 31 * result + Integer.hashCode(this.accumulateGoldForTiket);
        result = 31 * result + Integer.hashCode(this.goldBuff);
        result = 31 * result + Boolean.hashCode(this.resetAccumulateGoldForTiket);
        result = 31 * result + (this.fishes == null ? 0 : this.fishes.hashCode());
        result = 31 * result + Integer.hashCode(this.goldSkillBuff);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasUserID()) {
            parts.add("userID=" + getUserID());
        }
        if (hasHordeID()) {
            parts.add("hordeID=" + getHordeID());
        }
        if (hasAmountDead()) {
            parts.add("amountDead=" + getAmountDead());
        }
        if (hasReward()) {
            parts.add("reward=" + getReward());
        }
        if (hasCurrentExp()) {
            parts.add("currentExp=" + getCurrentExp());
        }
        if (hasAccumulateType()) {
            parts.add("accumulateType=" + getAccumulateType());
        }
        if (hasOriginalValue()) {
            parts.add("originalValue=" + getOriginalValue());
        }
        if (hasCurrentValue()) {
            parts.add("currentValue=" + getCurrentValue());
        }
        if (hasCurrentGold()) {
            parts.add("currentGold=" + getCurrentGold());
        }
        if (hasUnlockGold()) {
            parts.add("unlockGold=" + getUnlockGold());
        }
        if (hasIsUnlockGold()) {
            parts.add("isUnlockGold=" + getIsUnlockGold());
        }
        if (hasBulletID()) {
            parts.add("bulletID=" + getBulletID());
        }
        if (hasAccumulateGoldLock()) {
            parts.add("accumulateGoldLock=" + getAccumulateGoldLock());
        }
        if (hasAccumulateGoldUnlock()) {
            parts.add("accumulateGoldUnlock=" + getAccumulateGoldUnlock());
        }
        if (hasRoseAmount()) {
            parts.add("roseAmount=" + getRoseAmount());
        }
        if (hasRoseBonusAt()) {
            parts.add("roseBonusAt=" + getRoseBonusAt());
        }
        if (hasStunToSecond()) {
            parts.add("stunToSecond=" + getStunToSecond());
        }
        if (hasSoloSendAt()) {
            parts.add("soloSendAt=" + getSoloSendAt());
        }
        if (hasSoloReceiveAt()) {
            parts.add("soloReceiveAt=" + getSoloReceiveAt());
        }
        if (hasPearl()) {
            parts.add("pearl=" + getPearl());
        }
        if (hasPearlTotal()) {
            parts.add("pearlTotal=" + getPearlTotal());
        }
        if (hasReqTime()) {
            parts.add("reqTime=" + getReqTime());
        }
        if (hasAccumulateGoldForTiket()) {
            parts.add("accumulateGoldForTiket=" + getAccumulateGoldForTiket());
        }
        if (hasGoldBuff()) {
            parts.add("goldBuff=" + getGoldBuff());
        }
        if (hasResetAccumulateGoldForTiket()) {
            parts.add("resetAccumulateGoldForTiket=" + getResetAccumulateGoldForTiket());
        }
        if (!fishes.isEmpty()) {
            parts.add("fishes=" + getFishesList());
        }
        if (hasGoldSkillBuff()) {
            parts.add("goldSkillBuff=" + getGoldSkillBuff());
        }
        return "FireResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<FireResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("userID", 2);
        	__fieldMap.put("hordeID", 3);
        	__fieldMap.put("amountDead", 4);
        	__fieldMap.put("reward", 5);
        	__fieldMap.put("currentExp", 6);
        	__fieldMap.put("accumulateType", 7);
        	__fieldMap.put("originalValue", 8);
        	__fieldMap.put("currentValue", 9);
        	__fieldMap.put("currentGold", 10);
        	__fieldMap.put("unlockGold", 11);
        	__fieldMap.put("isUnlockGold", 12);
        	__fieldMap.put("bulletID", 13);
        	__fieldMap.put("accumulateGoldLock", 14);
        	__fieldMap.put("accumulateGoldUnlock", 15);
        	__fieldMap.put("roseAmount", 16);
        	__fieldMap.put("roseBonusAt", 17);
        	__fieldMap.put("stunToSecond", 18);
        	__fieldMap.put("soloSendAt", 19);
        	__fieldMap.put("soloReceiveAt", 20);
        	__fieldMap.put("pearl", 21);
        	__fieldMap.put("pearlTotal", 22);
        	__fieldMap.put("reqTime", 23);
        	__fieldMap.put("accumulateGoldForTiket", 24);
        	__fieldMap.put("goldBuff", 25);
        	__fieldMap.put("resetAccumulateGoldForTiket", 26);
        	__fieldMap.put("fishes", 27);
        	__fieldMap.put("goldSkillBuff", 28);
        }

        @Override
        public FireResponse newMessage() {
            return new FireResponse();
        }

        @Override
        public Class<FireResponse> typeClass() {
            return FireResponse.class;
        }

        @Override
        public String messageName() {
            return FireResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return FireResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(FireResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, FireResponse instance) throws java.io.IOException {
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
                    case 2:
                    	instance.userID = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 3:
                    	instance.hordeID = input.readInt64();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 4:
                    	instance.amountDead = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 5:
                    	instance.reward = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 6:
                    	instance.currentExp = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 7:
                    	instance.accumulateType = input.readInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 8:
                    	instance.originalValue = input.readFloat();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 9:
                    	instance.currentValue = input.readFloat();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 10:
                    	instance.currentGold = input.readInt32();
                    	instance.__bitField0 |= 256;
                    	break;
                    case 11:
                    	instance.unlockGold = input.readInt32();
                    	instance.__bitField0 |= 512;
                    	break;
                    case 12:
                    	instance.isUnlockGold = input.readBool();
                    	instance.__bitField0 |= 1024;
                    	break;
                    case 13:
                    	instance.bulletID = input.readInt64();
                    	instance.__bitField0 |= 2048;
                    	break;
                    case 14:
                    	instance.accumulateGoldLock = input.readInt32();
                    	instance.__bitField0 |= 4096;
                    	break;
                    case 15:
                    	instance.accumulateGoldUnlock = input.readInt32();
                    	instance.__bitField0 |= 8192;
                    	break;
                    case 16:
                    	instance.roseAmount = input.readInt32();
                    	instance.__bitField0 |= 16384;
                    	break;
                    case 17:
                    	instance.roseBonusAt = input.readInt32();
                    	instance.__bitField0 |= 32768;
                    	break;
                    case 18:
                    	instance.stunToSecond = input.readInt32();
                    	instance.__bitField0 |= 65536;
                    	break;
                    case 19:
                    	instance.soloSendAt = input.readInt32();
                    	instance.__bitField0 |= 131072;
                    	break;
                    case 20:
                    	instance.soloReceiveAt = input.readInt32();
                    	instance.__bitField0 |= 262144;
                    	break;
                    case 21:
                    	instance.pearl = input.readInt32();
                    	instance.__bitField0 |= 524288;
                    	break;
                    case 22:
                    	instance.pearlTotal = input.readInt32();
                    	instance.__bitField0 |= 1048576;
                    	break;
                    case 23:
                    	instance.reqTime = input.readInt64();
                    	instance.__bitField0 |= 2097152;
                    	break;
                    case 24:
                    	instance.accumulateGoldForTiket = input.readInt32();
                    	instance.__bitField0 |= 4194304;
                    	break;
                    case 25:
                    	instance.goldBuff = input.readInt32();
                    	instance.__bitField0 |= 8388608;
                    	break;
                    case 26:
                    	instance.resetAccumulateGoldForTiket = input.readBool();
                    	instance.__bitField0 |= 16777216;
                    	break;
                    case 27:
                    	if(!((instance.__bitField0 & 33554432) == 33554432)) {
                    	    instance.fishes = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 33554432;
                    	}
                    	instance.fishes.add(input.mergeObject(null, proto.message.FireResponse.DeadFish.getSchema()));

                    	break;
                    case 28:
                    	instance.goldSkillBuff = input.readInt32();
                    	instance.__bitField0 |= 67108864;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 33554432) == 33554432) {
                instance.fishes = java.util.Collections.unmodifiableList(instance.fishes);
            }


        }

        @Override
        public void writeTo(io.protostuff.Output output, FireResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(2, instance.userID, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt64(3, instance.hordeID, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(4, instance.amountDead, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(5, instance.reward, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(6, instance.currentExp, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeInt32(7, instance.accumulateType, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeFloat(8, instance.originalValue, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeFloat(9, instance.currentValue, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeInt32(10, instance.currentGold, false);
            }

            if((instance.__bitField0 & 512) == 512) {
                output.writeInt32(11, instance.unlockGold, false);
            }

            if((instance.__bitField0 & 1024) == 1024) {
                output.writeBool(12, instance.isUnlockGold, false);
            }

            if((instance.__bitField0 & 2048) == 2048) {
                output.writeInt64(13, instance.bulletID, false);
            }

            if((instance.__bitField0 & 4096) == 4096) {
                output.writeInt32(14, instance.accumulateGoldLock, false);
            }

            if((instance.__bitField0 & 8192) == 8192) {
                output.writeInt32(15, instance.accumulateGoldUnlock, false);
            }

            if((instance.__bitField0 & 16384) == 16384) {
                output.writeInt32(16, instance.roseAmount, false);
            }

            if((instance.__bitField0 & 32768) == 32768) {
                output.writeInt32(17, instance.roseBonusAt, false);
            }

            if((instance.__bitField0 & 65536) == 65536) {
                output.writeInt32(18, instance.stunToSecond, false);
            }

            if((instance.__bitField0 & 131072) == 131072) {
                output.writeInt32(19, instance.soloSendAt, false);
            }

            if((instance.__bitField0 & 262144) == 262144) {
                output.writeInt32(20, instance.soloReceiveAt, false);
            }

            if((instance.__bitField0 & 524288) == 524288) {
                output.writeInt32(21, instance.pearl, false);
            }

            if((instance.__bitField0 & 1048576) == 1048576) {
                output.writeInt32(22, instance.pearlTotal, false);
            }

            if((instance.__bitField0 & 2097152) == 2097152) {
                output.writeInt64(23, instance.reqTime, false);
            }

            if((instance.__bitField0 & 4194304) == 4194304) {
                output.writeInt32(24, instance.accumulateGoldForTiket, false);
            }

            if((instance.__bitField0 & 8388608) == 8388608) {
                output.writeInt32(25, instance.goldBuff, false);
            }

            if((instance.__bitField0 & 16777216) == 16777216) {
                output.writeBool(26, instance.resetAccumulateGoldForTiket, false);
            }

            for(proto.message.FireResponse.DeadFish fishes : instance.fishes) {
                output.writeObject(27, fishes, proto.message.FireResponse.DeadFish.getSchema(), true);
            }

            if((instance.__bitField0 & 67108864) == 67108864) {
                output.writeInt32(28, instance.goldSkillBuff, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 2: return "userID";
        		case 3: return "hordeID";
        		case 4: return "amountDead";
        		case 5: return "reward";
        		case 6: return "currentExp";
        		case 7: return "accumulateType";
        		case 8: return "originalValue";
        		case 9: return "currentValue";
        		case 10: return "currentGold";
        		case 11: return "unlockGold";
        		case 12: return "isUnlockGold";
        		case 13: return "bulletID";
        		case 14: return "accumulateGoldLock";
        		case 15: return "accumulateGoldUnlock";
        		case 16: return "roseAmount";
        		case 17: return "roseBonusAt";
        		case 18: return "stunToSecond";
        		case 19: return "soloSendAt";
        		case 20: return "soloReceiveAt";
        		case 21: return "pearl";
        		case 22: return "pearlTotal";
        		case 23: return "reqTime";
        		case 24: return "accumulateGoldForTiket";
        		case 25: return "goldBuff";
        		case 26: return "resetAccumulateGoldForTiket";
        		case 27: return "fishes";
        		case 28: return "goldSkillBuff";
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

        private String userID;

        private long hordeID;

        private int amountDead;

        private int reward;

        private int currentExp;

        private int accumulateType;

        private float originalValue;

        private float currentValue;

        private int currentGold;

        private int unlockGold;

        private boolean isUnlockGold;

        private long bulletID;

        private int accumulateGoldLock;

        private int accumulateGoldUnlock;

        private int roseAmount;

        private int roseBonusAt;

        private int stunToSecond;

        private int soloSendAt;

        private int soloReceiveAt;

        private int pearl;

        private int pearlTotal;

        private long reqTime;

        private int accumulateGoldForTiket;

        private int goldBuff;

        private boolean resetAccumulateGoldForTiket;

        private java.util.List<proto.message.FireResponse.DeadFish> fishes;

        private int goldSkillBuff;

        private int __bitField0;

        private Builder() {
            this.userID = "";
            this.hordeID = 0L;
            this.amountDead = 0;
            this.reward = 0;
            this.currentExp = 0;
            this.accumulateType = 0;
            this.originalValue = 0f;
            this.currentValue = 0f;
            this.currentGold = 0;
            this.unlockGold = 0;
            this.isUnlockGold = false;
            this.bulletID = 0L;
            this.accumulateGoldLock = 0;
            this.accumulateGoldUnlock = 0;
            this.roseAmount = 0;
            this.roseBonusAt = 0;
            this.stunToSecond = 0;
            this.soloSendAt = 0;
            this.soloReceiveAt = 0;
            this.pearl = 0;
            this.pearlTotal = 0;
            this.reqTime = 0L;
            this.accumulateGoldForTiket = 0;
            this.goldBuff = 0;
            this.resetAccumulateGoldForTiket = false;
            this.fishes = java.util.Collections.emptyList();
            this.goldSkillBuff = 0;
        }

        public Builder mergeFrom(FireResponse instance) {
            if (instance.hasUserID()) {
                this.setUserID(instance.getUserID());
            }

            if (instance.hasHordeID()) {
                this.setHordeID(instance.getHordeID());
            }

            if (instance.hasAmountDead()) {
                this.setAmountDead(instance.getAmountDead());
            }

            if (instance.hasReward()) {
                this.setReward(instance.getReward());
            }

            if (instance.hasCurrentExp()) {
                this.setCurrentExp(instance.getCurrentExp());
            }

            if (instance.hasAccumulateType()) {
                this.setAccumulateType(instance.getAccumulateType());
            }

            if (instance.hasOriginalValue()) {
                this.setOriginalValue(instance.getOriginalValue());
            }

            if (instance.hasCurrentValue()) {
                this.setCurrentValue(instance.getCurrentValue());
            }

            if (instance.hasCurrentGold()) {
                this.setCurrentGold(instance.getCurrentGold());
            }

            if (instance.hasUnlockGold()) {
                this.setUnlockGold(instance.getUnlockGold());
            }

            if (instance.hasIsUnlockGold()) {
                this.setIsUnlockGold(instance.getIsUnlockGold());
            }

            if (instance.hasBulletID()) {
                this.setBulletID(instance.getBulletID());
            }

            if (instance.hasAccumulateGoldLock()) {
                this.setAccumulateGoldLock(instance.getAccumulateGoldLock());
            }

            if (instance.hasAccumulateGoldUnlock()) {
                this.setAccumulateGoldUnlock(instance.getAccumulateGoldUnlock());
            }

            if (instance.hasRoseAmount()) {
                this.setRoseAmount(instance.getRoseAmount());
            }

            if (instance.hasRoseBonusAt()) {
                this.setRoseBonusAt(instance.getRoseBonusAt());
            }

            if (instance.hasStunToSecond()) {
                this.setStunToSecond(instance.getStunToSecond());
            }

            if (instance.hasSoloSendAt()) {
                this.setSoloSendAt(instance.getSoloSendAt());
            }

            if (instance.hasSoloReceiveAt()) {
                this.setSoloReceiveAt(instance.getSoloReceiveAt());
            }

            if (instance.hasPearl()) {
                this.setPearl(instance.getPearl());
            }

            if (instance.hasPearlTotal()) {
                this.setPearlTotal(instance.getPearlTotal());
            }

            if (instance.hasReqTime()) {
                this.setReqTime(instance.getReqTime());
            }

            if (instance.hasAccumulateGoldForTiket()) {
                this.setAccumulateGoldForTiket(instance.getAccumulateGoldForTiket());
            }

            if (instance.hasGoldBuff()) {
                this.setGoldBuff(instance.getGoldBuff());
            }

            if (instance.hasResetAccumulateGoldForTiket()) {
                this.setResetAccumulateGoldForTiket(instance.getResetAccumulateGoldForTiket());
            }

            this.addAllFishes(instance.getFishesList());

            if (instance.hasGoldSkillBuff()) {
                this.setGoldSkillBuff(instance.getGoldSkillBuff());
            }

            return this;
        }

        public String getUserID() {
            return userID;
        }

        public Builder setUserID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FireResponse#userID to null");
            }

            this.userID = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearUserID() {
            this.userID = "";
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasUserID() {
            return (__bitField0 & 1) == 1;
        }

        public long getHordeID() {
            return hordeID;
        }

        public Builder setHordeID(long value) {
            this.hordeID = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearHordeID() {
            this.hordeID = 0L;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasHordeID() {
            return (__bitField0 & 2) == 2;
        }

        public int getAmountDead() {
            return amountDead;
        }

        public Builder setAmountDead(int value) {
            this.amountDead = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearAmountDead() {
            this.amountDead = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasAmountDead() {
            return (__bitField0 & 4) == 4;
        }

        public int getReward() {
            return reward;
        }

        public Builder setReward(int value) {
            this.reward = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearReward() {
            this.reward = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasReward() {
            return (__bitField0 & 8) == 8;
        }

        public int getCurrentExp() {
            return currentExp;
        }

        public Builder setCurrentExp(int value) {
            this.currentExp = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearCurrentExp() {
            this.currentExp = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasCurrentExp() {
            return (__bitField0 & 16) == 16;
        }

        public int getAccumulateType() {
            return accumulateType;
        }

        public Builder setAccumulateType(int value) {
            this.accumulateType = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearAccumulateType() {
            this.accumulateType = 0;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasAccumulateType() {
            return (__bitField0 & 32) == 32;
        }

        public float getOriginalValue() {
            return originalValue;
        }

        public Builder setOriginalValue(float value) {
            this.originalValue = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearOriginalValue() {
            this.originalValue = 0f;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasOriginalValue() {
            return (__bitField0 & 64) == 64;
        }

        public float getCurrentValue() {
            return currentValue;
        }

        public Builder setCurrentValue(float value) {
            this.currentValue = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearCurrentValue() {
            this.currentValue = 0f;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasCurrentValue() {
            return (__bitField0 & 128) == 128;
        }

        public int getCurrentGold() {
            return currentGold;
        }

        public Builder setCurrentGold(int value) {
            this.currentGold = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearCurrentGold() {
            this.currentGold = 0;
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasCurrentGold() {
            return (__bitField0 & 256) == 256;
        }

        public int getUnlockGold() {
            return unlockGold;
        }

        public Builder setUnlockGold(int value) {
            this.unlockGold = value;
            __bitField0 |= 512;
            return this;
        }

        public Builder clearUnlockGold() {
            this.unlockGold = 0;
            __bitField0 &= ~512;
            return this;
        }

        public boolean hasUnlockGold() {
            return (__bitField0 & 512) == 512;
        }

        public boolean getIsUnlockGold() {
            return isUnlockGold;
        }

        public Builder setIsUnlockGold(boolean value) {
            this.isUnlockGold = value;
            __bitField0 |= 1024;
            return this;
        }

        public Builder clearIsUnlockGold() {
            this.isUnlockGold = false;
            __bitField0 &= ~1024;
            return this;
        }

        public boolean hasIsUnlockGold() {
            return (__bitField0 & 1024) == 1024;
        }

        public long getBulletID() {
            return bulletID;
        }

        public Builder setBulletID(long value) {
            this.bulletID = value;
            __bitField0 |= 2048;
            return this;
        }

        public Builder clearBulletID() {
            this.bulletID = 0L;
            __bitField0 &= ~2048;
            return this;
        }

        public boolean hasBulletID() {
            return (__bitField0 & 2048) == 2048;
        }

        public int getAccumulateGoldLock() {
            return accumulateGoldLock;
        }

        public Builder setAccumulateGoldLock(int value) {
            this.accumulateGoldLock = value;
            __bitField0 |= 4096;
            return this;
        }

        public Builder clearAccumulateGoldLock() {
            this.accumulateGoldLock = 0;
            __bitField0 &= ~4096;
            return this;
        }

        public boolean hasAccumulateGoldLock() {
            return (__bitField0 & 4096) == 4096;
        }

        public int getAccumulateGoldUnlock() {
            return accumulateGoldUnlock;
        }

        public Builder setAccumulateGoldUnlock(int value) {
            this.accumulateGoldUnlock = value;
            __bitField0 |= 8192;
            return this;
        }

        public Builder clearAccumulateGoldUnlock() {
            this.accumulateGoldUnlock = 0;
            __bitField0 &= ~8192;
            return this;
        }

        public boolean hasAccumulateGoldUnlock() {
            return (__bitField0 & 8192) == 8192;
        }

        public int getRoseAmount() {
            return roseAmount;
        }

        public Builder setRoseAmount(int value) {
            this.roseAmount = value;
            __bitField0 |= 16384;
            return this;
        }

        public Builder clearRoseAmount() {
            this.roseAmount = 0;
            __bitField0 &= ~16384;
            return this;
        }

        public boolean hasRoseAmount() {
            return (__bitField0 & 16384) == 16384;
        }

        public int getRoseBonusAt() {
            return roseBonusAt;
        }

        public Builder setRoseBonusAt(int value) {
            this.roseBonusAt = value;
            __bitField0 |= 32768;
            return this;
        }

        public Builder clearRoseBonusAt() {
            this.roseBonusAt = 0;
            __bitField0 &= ~32768;
            return this;
        }

        public boolean hasRoseBonusAt() {
            return (__bitField0 & 32768) == 32768;
        }

        public int getStunToSecond() {
            return stunToSecond;
        }

        public Builder setStunToSecond(int value) {
            this.stunToSecond = value;
            __bitField0 |= 65536;
            return this;
        }

        public Builder clearStunToSecond() {
            this.stunToSecond = 0;
            __bitField0 &= ~65536;
            return this;
        }

        public boolean hasStunToSecond() {
            return (__bitField0 & 65536) == 65536;
        }

        public int getSoloSendAt() {
            return soloSendAt;
        }

        public Builder setSoloSendAt(int value) {
            this.soloSendAt = value;
            __bitField0 |= 131072;
            return this;
        }

        public Builder clearSoloSendAt() {
            this.soloSendAt = 0;
            __bitField0 &= ~131072;
            return this;
        }

        public boolean hasSoloSendAt() {
            return (__bitField0 & 131072) == 131072;
        }

        public int getSoloReceiveAt() {
            return soloReceiveAt;
        }

        public Builder setSoloReceiveAt(int value) {
            this.soloReceiveAt = value;
            __bitField0 |= 262144;
            return this;
        }

        public Builder clearSoloReceiveAt() {
            this.soloReceiveAt = 0;
            __bitField0 &= ~262144;
            return this;
        }

        public boolean hasSoloReceiveAt() {
            return (__bitField0 & 262144) == 262144;
        }

        public int getPearl() {
            return pearl;
        }

        public Builder setPearl(int value) {
            this.pearl = value;
            __bitField0 |= 524288;
            return this;
        }

        public Builder clearPearl() {
            this.pearl = 0;
            __bitField0 &= ~524288;
            return this;
        }

        public boolean hasPearl() {
            return (__bitField0 & 524288) == 524288;
        }

        public int getPearlTotal() {
            return pearlTotal;
        }

        public Builder setPearlTotal(int value) {
            this.pearlTotal = value;
            __bitField0 |= 1048576;
            return this;
        }

        public Builder clearPearlTotal() {
            this.pearlTotal = 0;
            __bitField0 &= ~1048576;
            return this;
        }

        public boolean hasPearlTotal() {
            return (__bitField0 & 1048576) == 1048576;
        }

        public long getReqTime() {
            return reqTime;
        }

        public Builder setReqTime(long value) {
            this.reqTime = value;
            __bitField0 |= 2097152;
            return this;
        }

        public Builder clearReqTime() {
            this.reqTime = 0L;
            __bitField0 &= ~2097152;
            return this;
        }

        public boolean hasReqTime() {
            return (__bitField0 & 2097152) == 2097152;
        }

        public int getAccumulateGoldForTiket() {
            return accumulateGoldForTiket;
        }

        public Builder setAccumulateGoldForTiket(int value) {
            this.accumulateGoldForTiket = value;
            __bitField0 |= 4194304;
            return this;
        }

        public Builder clearAccumulateGoldForTiket() {
            this.accumulateGoldForTiket = 0;
            __bitField0 &= ~4194304;
            return this;
        }

        public boolean hasAccumulateGoldForTiket() {
            return (__bitField0 & 4194304) == 4194304;
        }

        public int getGoldBuff() {
            return goldBuff;
        }

        public Builder setGoldBuff(int value) {
            this.goldBuff = value;
            __bitField0 |= 8388608;
            return this;
        }

        public Builder clearGoldBuff() {
            this.goldBuff = 0;
            __bitField0 &= ~8388608;
            return this;
        }

        public boolean hasGoldBuff() {
            return (__bitField0 & 8388608) == 8388608;
        }

        public boolean getResetAccumulateGoldForTiket() {
            return resetAccumulateGoldForTiket;
        }

        public Builder setResetAccumulateGoldForTiket(boolean value) {
            this.resetAccumulateGoldForTiket = value;
            __bitField0 |= 16777216;
            return this;
        }

        public Builder clearResetAccumulateGoldForTiket() {
            this.resetAccumulateGoldForTiket = false;
            __bitField0 &= ~16777216;
            return this;
        }

        public boolean hasResetAccumulateGoldForTiket() {
            return (__bitField0 & 16777216) == 16777216;
        }

        public java.util.List<proto.message.FireResponse.DeadFish> getFishesList() {
            return fishes;
        }

        public Builder setFishes(int index, proto.message.FireResponse.DeadFish value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FireResponse#fishes to null");
            }

            if(!((__bitField0 & 33554432) == 33554432)) {
                this.fishes = new java.util.ArrayList<>();
                __bitField0 |= 33554432;
            }
            this.fishes.set(index, value);
            return this;
        }

        public Builder addFishes(proto.message.FireResponse.DeadFish value) {
            if (value == null) {
                throw new NullPointerException("Cannot set FireResponse#fishes to null");
            }

            if(!((__bitField0 & 33554432) == 33554432)) {
                this.fishes = new java.util.ArrayList<>();
                __bitField0 |= 33554432;
            }
            this.fishes.add(value);
            return this;
        }

        public Builder addAllFishes(java.lang.Iterable<proto.message.FireResponse.DeadFish> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set FireResponse#fishes to null");
            }
            if(!((__bitField0 & 33554432) == 33554432)) {
                this.fishes = new java.util.ArrayList<>();
                __bitField0 |= 33554432;
            }
            for (final proto.message.FireResponse.DeadFish value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set FireResponse#fishes to null");
                }
                this.fishes.add(value);
            }
            return this;
        }

        public Builder clearFishes() {
            this.fishes = java.util.Collections.emptyList();
            __bitField0 &= ~33554432;
            return this;
        }

        public int getFishesCount() {
            return fishes.size();
        }

        public proto.message.FireResponse.DeadFish getFishes(int index) {
            return fishes.get(index);
        }

        public int getGoldSkillBuff() {
            return goldSkillBuff;
        }

        public Builder setGoldSkillBuff(int value) {
            this.goldSkillBuff = value;
            __bitField0 |= 67108864;
            return this;
        }

        public Builder clearGoldSkillBuff() {
            this.goldSkillBuff = 0;
            __bitField0 &= ~67108864;
            return this;
        }

        public boolean hasGoldSkillBuff() {
            return (__bitField0 & 67108864) == 67108864;
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
            if (!java.util.Objects.equals(this.userID, that.userID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.hordeID, that.hordeID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.amountDead, that.amountDead)) {
                return false;
            }
            if (!java.util.Objects.equals(this.reward, that.reward)) {
                return false;
            }
            if (!java.util.Objects.equals(this.currentExp, that.currentExp)) {
                return false;
            }
            if (!java.util.Objects.equals(this.accumulateType, that.accumulateType)) {
                return false;
            }
            if (!java.util.Objects.equals(this.originalValue, that.originalValue)) {
                return false;
            }
            if (!java.util.Objects.equals(this.currentValue, that.currentValue)) {
                return false;
            }
            if (!java.util.Objects.equals(this.currentGold, that.currentGold)) {
                return false;
            }
            if (!java.util.Objects.equals(this.unlockGold, that.unlockGold)) {
                return false;
            }
            if (!java.util.Objects.equals(this.isUnlockGold, that.isUnlockGold)) {
                return false;
            }
            if (!java.util.Objects.equals(this.bulletID, that.bulletID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.accumulateGoldLock, that.accumulateGoldLock)) {
                return false;
            }
            if (!java.util.Objects.equals(this.accumulateGoldUnlock, that.accumulateGoldUnlock)) {
                return false;
            }
            if (!java.util.Objects.equals(this.roseAmount, that.roseAmount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.roseBonusAt, that.roseBonusAt)) {
                return false;
            }
            if (!java.util.Objects.equals(this.stunToSecond, that.stunToSecond)) {
                return false;
            }
            if (!java.util.Objects.equals(this.soloSendAt, that.soloSendAt)) {
                return false;
            }
            if (!java.util.Objects.equals(this.soloReceiveAt, that.soloReceiveAt)) {
                return false;
            }
            if (!java.util.Objects.equals(this.pearl, that.pearl)) {
                return false;
            }
            if (!java.util.Objects.equals(this.pearlTotal, that.pearlTotal)) {
                return false;
            }
            if (!java.util.Objects.equals(this.reqTime, that.reqTime)) {
                return false;
            }
            if (!java.util.Objects.equals(this.accumulateGoldForTiket, that.accumulateGoldForTiket)) {
                return false;
            }
            if (!java.util.Objects.equals(this.goldBuff, that.goldBuff)) {
                return false;
            }
            if (!java.util.Objects.equals(this.resetAccumulateGoldForTiket, that.resetAccumulateGoldForTiket)) {
                return false;
            }
            if (!java.util.Objects.equals(this.fishes, that.fishes)) {
                return false;
            }
            if (!java.util.Objects.equals(this.goldSkillBuff, that.goldSkillBuff)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
            result = 31 * result + Long.hashCode(this.hordeID);
            result = 31 * result + Integer.hashCode(this.amountDead);
            result = 31 * result + Integer.hashCode(this.reward);
            result = 31 * result + Integer.hashCode(this.currentExp);
            result = 31 * result + Integer.hashCode(this.accumulateType);
            result = 31 * result + Float.hashCode(this.originalValue);
            result = 31 * result + Float.hashCode(this.currentValue);
            result = 31 * result + Integer.hashCode(this.currentGold);
            result = 31 * result + Integer.hashCode(this.unlockGold);
            result = 31 * result + Boolean.hashCode(this.isUnlockGold);
            result = 31 * result + Long.hashCode(this.bulletID);
            result = 31 * result + Integer.hashCode(this.accumulateGoldLock);
            result = 31 * result + Integer.hashCode(this.accumulateGoldUnlock);
            result = 31 * result + Integer.hashCode(this.roseAmount);
            result = 31 * result + Integer.hashCode(this.roseBonusAt);
            result = 31 * result + Integer.hashCode(this.stunToSecond);
            result = 31 * result + Integer.hashCode(this.soloSendAt);
            result = 31 * result + Integer.hashCode(this.soloReceiveAt);
            result = 31 * result + Integer.hashCode(this.pearl);
            result = 31 * result + Integer.hashCode(this.pearlTotal);
            result = 31 * result + Long.hashCode(this.reqTime);
            result = 31 * result + Integer.hashCode(this.accumulateGoldForTiket);
            result = 31 * result + Integer.hashCode(this.goldBuff);
            result = 31 * result + Boolean.hashCode(this.resetAccumulateGoldForTiket);
            result = 31 * result + (this.fishes == null ? 0 : this.fishes.hashCode());
            result = 31 * result + Integer.hashCode(this.goldSkillBuff);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasUserID()) {
                parts.add("userID=" + getUserID());
            }
            if (hasHordeID()) {
                parts.add("hordeID=" + getHordeID());
            }
            if (hasAmountDead()) {
                parts.add("amountDead=" + getAmountDead());
            }
            if (hasReward()) {
                parts.add("reward=" + getReward());
            }
            if (hasCurrentExp()) {
                parts.add("currentExp=" + getCurrentExp());
            }
            if (hasAccumulateType()) {
                parts.add("accumulateType=" + getAccumulateType());
            }
            if (hasOriginalValue()) {
                parts.add("originalValue=" + getOriginalValue());
            }
            if (hasCurrentValue()) {
                parts.add("currentValue=" + getCurrentValue());
            }
            if (hasCurrentGold()) {
                parts.add("currentGold=" + getCurrentGold());
            }
            if (hasUnlockGold()) {
                parts.add("unlockGold=" + getUnlockGold());
            }
            if (hasIsUnlockGold()) {
                parts.add("isUnlockGold=" + getIsUnlockGold());
            }
            if (hasBulletID()) {
                parts.add("bulletID=" + getBulletID());
            }
            if (hasAccumulateGoldLock()) {
                parts.add("accumulateGoldLock=" + getAccumulateGoldLock());
            }
            if (hasAccumulateGoldUnlock()) {
                parts.add("accumulateGoldUnlock=" + getAccumulateGoldUnlock());
            }
            if (hasRoseAmount()) {
                parts.add("roseAmount=" + getRoseAmount());
            }
            if (hasRoseBonusAt()) {
                parts.add("roseBonusAt=" + getRoseBonusAt());
            }
            if (hasStunToSecond()) {
                parts.add("stunToSecond=" + getStunToSecond());
            }
            if (hasSoloSendAt()) {
                parts.add("soloSendAt=" + getSoloSendAt());
            }
            if (hasSoloReceiveAt()) {
                parts.add("soloReceiveAt=" + getSoloReceiveAt());
            }
            if (hasPearl()) {
                parts.add("pearl=" + getPearl());
            }
            if (hasPearlTotal()) {
                parts.add("pearlTotal=" + getPearlTotal());
            }
            if (hasReqTime()) {
                parts.add("reqTime=" + getReqTime());
            }
            if (hasAccumulateGoldForTiket()) {
                parts.add("accumulateGoldForTiket=" + getAccumulateGoldForTiket());
            }
            if (hasGoldBuff()) {
                parts.add("goldBuff=" + getGoldBuff());
            }
            if (hasResetAccumulateGoldForTiket()) {
                parts.add("resetAccumulateGoldForTiket=" + getResetAccumulateGoldForTiket());
            }
            if (!fishes.isEmpty()) {
                parts.add("fishes=" + getFishesList());
            }
            if (hasGoldSkillBuff()) {
                parts.add("goldSkillBuff=" + getGoldSkillBuff());
            }
            return "FireResponse{" + String.join(", ", parts) + "}";
        }

        public FireResponse build() {
            proto.message.FireResponse result = new proto.message.FireResponse();
            result.__bitField0 = __bitField0;
            result.userID = this.userID;
            result.hordeID = this.hordeID;
            result.amountDead = this.amountDead;
            result.reward = this.reward;
            result.currentExp = this.currentExp;
            result.accumulateType = this.accumulateType;
            result.originalValue = this.originalValue;
            result.currentValue = this.currentValue;
            result.currentGold = this.currentGold;
            result.unlockGold = this.unlockGold;
            result.isUnlockGold = this.isUnlockGold;
            result.bulletID = this.bulletID;
            result.accumulateGoldLock = this.accumulateGoldLock;
            result.accumulateGoldUnlock = this.accumulateGoldUnlock;
            result.roseAmount = this.roseAmount;
            result.roseBonusAt = this.roseBonusAt;
            result.stunToSecond = this.stunToSecond;
            result.soloSendAt = this.soloSendAt;
            result.soloReceiveAt = this.soloReceiveAt;
            result.pearl = this.pearl;
            result.pearlTotal = this.pearlTotal;
            result.reqTime = this.reqTime;
            result.accumulateGoldForTiket = this.accumulateGoldForTiket;
            result.goldBuff = this.goldBuff;
            result.resetAccumulateGoldForTiket = this.resetAccumulateGoldForTiket;
            result.fishes = java.util.Collections.unmodifiableList(this.fishes);
            result.goldSkillBuff = this.goldSkillBuff;
            return result;
        }

    }

    public static final class DeadFish
            implements io.protostuff.Message<DeadFish> {

        private static final DeadFish DEFAULT_INSTANCE = newBuilder().build();

        private long hordeID;

        private int amountDead;

        private int reward;

        private int goldBuff;

        private boolean __merge_lock = false;
        private int __bitField0;

        private DeadFish() {
            this.hordeID = 0L;
            this.amountDead = 0;
            this.reward = 0;
            this.goldBuff = 0;
        }

        private DeadFish(Builder builder) {
            __merge_lock = true;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public static DeadFish getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static io.protostuff.Schema<DeadFish> getSchema()
        {
        	return Schema.INSTANCE;
        }

        public long getHordeID() {
            return hordeID;
        }

        public boolean hasHordeID() {
            return (__bitField0 & 1) == 1;
        }

        public DeadFish withHordeID(long value) {
            return DeadFish.newBuilder()
                .mergeFrom(this)
                .setHordeID(value)
                .build();
        }

        public int getAmountDead() {
            return amountDead;
        }

        public boolean hasAmountDead() {
            return (__bitField0 & 2) == 2;
        }

        public DeadFish withAmountDead(int value) {
            return DeadFish.newBuilder()
                .mergeFrom(this)
                .setAmountDead(value)
                .build();
        }

        public int getReward() {
            return reward;
        }

        public boolean hasReward() {
            return (__bitField0 & 4) == 4;
        }

        public DeadFish withReward(int value) {
            return DeadFish.newBuilder()
                .mergeFrom(this)
                .setReward(value)
                .build();
        }

        public int getGoldBuff() {
            return goldBuff;
        }

        public boolean hasGoldBuff() {
            return (__bitField0 & 8) == 8;
        }

        public DeadFish withGoldBuff(int value) {
            return DeadFish.newBuilder()
                .mergeFrom(this)
                .setGoldBuff(value)
                .build();
        }



        @Override
        public io.protostuff.Schema<DeadFish> cachedSchema() {
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
            DeadFish that = (DeadFish) obj;
            if (!java.util.Objects.equals(this.hordeID, that.hordeID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.amountDead, that.amountDead)) {
                return false;
            }
            if (!java.util.Objects.equals(this.reward, that.reward)) {
                return false;
            }
            if (!java.util.Objects.equals(this.goldBuff, that.goldBuff)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Long.hashCode(this.hordeID);
            result = 31 * result + Integer.hashCode(this.amountDead);
            result = 31 * result + Integer.hashCode(this.reward);
            result = 31 * result + Integer.hashCode(this.goldBuff);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasHordeID()) {
                parts.add("hordeID=" + getHordeID());
            }
            if (hasAmountDead()) {
                parts.add("amountDead=" + getAmountDead());
            }
            if (hasReward()) {
                parts.add("reward=" + getReward());
            }
            if (hasGoldBuff()) {
                parts.add("goldBuff=" + getGoldBuff());
            }
            return "DeadFish{" + String.join(", ", parts) + "}";
        }

        public static final class Schema implements io.protostuff.Schema<DeadFish>{

            private static final Schema INSTANCE = new Schema();

            private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

            static {
            	__fieldMap.put("hordeID", 1);
            	__fieldMap.put("amountDead", 2);
            	__fieldMap.put("reward", 3);
            	__fieldMap.put("goldBuff", 4);
            }

            @Override
            public DeadFish newMessage() {
                return new DeadFish();
            }

            @Override
            public Class<DeadFish> typeClass() {
                return DeadFish.class;
            }

            @Override
            public String messageName() {
                return DeadFish.class.getSimpleName();
            }

            @Override
            public String messageFullName() {
                return DeadFish.class.getName();
            }

            @Override
            @Deprecated
            public boolean isInitialized(DeadFish message) {
                return true;
            }

            @Override
            public void mergeFrom(io.protostuff.Input input, DeadFish instance) throws java.io.IOException {
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
                        	instance.hordeID = input.readInt64();
                        	instance.__bitField0 |= 1;
                        	break;
                        case 2:
                        	instance.amountDead = input.readInt32();
                        	instance.__bitField0 |= 2;
                        	break;
                        case 3:
                        	instance.reward = input.readInt32();
                        	instance.__bitField0 |= 4;
                        	break;
                        case 4:
                        	instance.goldBuff = input.readInt32();
                        	instance.__bitField0 |= 8;
                        	break;
                        default:
                            input.handleUnknownField(number, this);
                    }
            	}
            }

            @Override
            public void writeTo(io.protostuff.Output output, DeadFish instance) throws java.io.IOException {
                if((instance.__bitField0 & 1) == 1) {
                    output.writeInt64(1, instance.hordeID, false);
                }

                if((instance.__bitField0 & 2) == 2) {
                    output.writeInt32(2, instance.amountDead, false);
                }

                if((instance.__bitField0 & 4) == 4) {
                    output.writeInt32(3, instance.reward, false);
                }

                if((instance.__bitField0 & 8) == 8) {
                    output.writeInt32(4, instance.goldBuff, false);
                }

            }

            @Override
            public String getFieldName(int number) {
            	switch(number) {
            		case 1: return "hordeID";
            		case 2: return "amountDead";
            		case 3: return "reward";
            		case 4: return "goldBuff";
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

            private long hordeID;

            private int amountDead;

            private int reward;

            private int goldBuff;

            private int __bitField0;

            private Builder() {
                this.hordeID = 0L;
                this.amountDead = 0;
                this.reward = 0;
                this.goldBuff = 0;
            }

            public Builder mergeFrom(DeadFish instance) {
                if (instance.hasHordeID()) {
                    this.setHordeID(instance.getHordeID());
                }

                if (instance.hasAmountDead()) {
                    this.setAmountDead(instance.getAmountDead());
                }

                if (instance.hasReward()) {
                    this.setReward(instance.getReward());
                }

                if (instance.hasGoldBuff()) {
                    this.setGoldBuff(instance.getGoldBuff());
                }

                return this;
            }

            public long getHordeID() {
                return hordeID;
            }

            public Builder setHordeID(long value) {
                this.hordeID = value;
                __bitField0 |= 1;
                return this;
            }

            public Builder clearHordeID() {
                this.hordeID = 0L;
                __bitField0 &= ~1;
                return this;
            }

            public boolean hasHordeID() {
                return (__bitField0 & 1) == 1;
            }

            public int getAmountDead() {
                return amountDead;
            }

            public Builder setAmountDead(int value) {
                this.amountDead = value;
                __bitField0 |= 2;
                return this;
            }

            public Builder clearAmountDead() {
                this.amountDead = 0;
                __bitField0 &= ~2;
                return this;
            }

            public boolean hasAmountDead() {
                return (__bitField0 & 2) == 2;
            }

            public int getReward() {
                return reward;
            }

            public Builder setReward(int value) {
                this.reward = value;
                __bitField0 |= 4;
                return this;
            }

            public Builder clearReward() {
                this.reward = 0;
                __bitField0 &= ~4;
                return this;
            }

            public boolean hasReward() {
                return (__bitField0 & 4) == 4;
            }

            public int getGoldBuff() {
                return goldBuff;
            }

            public Builder setGoldBuff(int value) {
                this.goldBuff = value;
                __bitField0 |= 8;
                return this;
            }

            public Builder clearGoldBuff() {
                this.goldBuff = 0;
                __bitField0 &= ~8;
                return this;
            }

            public boolean hasGoldBuff() {
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
                if (!java.util.Objects.equals(this.hordeID, that.hordeID)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.amountDead, that.amountDead)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.reward, that.reward)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.goldBuff, that.goldBuff)) {
                    return false;
                }

                return true;
            }

            @Override
            public int hashCode() {
                int result = 1;
                result = 31 * result + Long.hashCode(this.hordeID);
                result = 31 * result + Integer.hashCode(this.amountDead);
                result = 31 * result + Integer.hashCode(this.reward);
                result = 31 * result + Integer.hashCode(this.goldBuff);

                return result;
            }

            @Override
            public String toString() {
                java.util.List<String> parts = new java.util.ArrayList<>();
                if (hasHordeID()) {
                    parts.add("hordeID=" + getHordeID());
                }
                if (hasAmountDead()) {
                    parts.add("amountDead=" + getAmountDead());
                }
                if (hasReward()) {
                    parts.add("reward=" + getReward());
                }
                if (hasGoldBuff()) {
                    parts.add("goldBuff=" + getGoldBuff());
                }
                return "DeadFish{" + String.join(", ", parts) + "}";
            }

            public DeadFish build() {
                proto.message.FireResponse.DeadFish result = new proto.message.FireResponse.DeadFish();
                result.__bitField0 = __bitField0;
                result.hordeID = this.hordeID;
                result.amountDead = this.amountDead;
                result.reward = this.reward;
                result.goldBuff = this.goldBuff;
                return result;
            }

        }



    }


}