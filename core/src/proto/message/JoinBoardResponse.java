package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class JoinBoardResponse
        implements io.protostuff.Message<JoinBoardResponse> {

    private static final JoinBoardResponse DEFAULT_INSTANCE = newBuilder().build();

    private int result;

    private String content;

    private int boardID;

    private String userID;

    private String userName;

    private int seatNumber;

    private int gunID;

    private int ammoID;

    private int gold1;

    private int gold2;

    private int gold3;

    private int level;

    private String avatar;

    private int bethost;

    private String snsName;

    private int betBullet;

    private int pearl;

    private int udpCode;

    private String udpHost;

    private int udpPort;

    private boolean hasPet;

    private int skillType;

    private int skillGold;

    private int skillAccumulation;

    private int skillAccumulationMax;

    private long skillTimeCurrent;

    private long skillTimeMax;

    private int skillDuration;

    private int skillCannonId;

    private int petLevel;

    private float skillAccBuff;

    private java.util.List<Long> skillTargetFish;

    private boolean __merge_lock = false;
    private int __bitField0;

    private JoinBoardResponse() {
        this.result = proto.message.InGameResultCode.JOIN_BOARD_SUCCESS_PLAY.getNumber();
        this.content = "";
        this.boardID = 0;
        this.userID = "";
        this.userName = "";
        this.seatNumber = 0;
        this.gunID = 0;
        this.ammoID = 0;
        this.gold1 = 0;
        this.gold2 = 0;
        this.gold3 = 0;
        this.level = 0;
        this.avatar = "";
        this.bethost = 0;
        this.snsName = "";
        this.betBullet = 0;
        this.pearl = 0;
        this.udpCode = 0;
        this.udpHost = "";
        this.udpPort = 0;
        this.hasPet = false;
        this.skillType = 0;
        this.skillGold = 0;
        this.skillAccumulation = 0;
        this.skillAccumulationMax = 0;
        this.skillTimeCurrent = 0L;
        this.skillTimeMax = 0L;
        this.skillDuration = 0;
        this.skillCannonId = 0;
        this.petLevel = 0;
        this.skillAccBuff = 0f;
        this.skillTargetFish = java.util.Collections.emptyList();
    }

    private JoinBoardResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static JoinBoardResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<JoinBoardResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public proto.message.InGameResultCode getResult() {
        return proto.message.InGameResultCode.valueOf(result);
    }

    public int getResultValue() {
        return result;
    }

    public boolean hasResult() {
        return (__bitField0 & 1) == 1;
    }

    public JoinBoardResponse withResult(proto.message.InGameResultCode value) {
        return JoinBoardResponse.newBuilder()
            .mergeFrom(this)
            .setResult(value)
            .build();
    }

    public String getContent() {
        return content;
    }

    public boolean hasContent() {
        return (__bitField0 & 2) == 2;
    }

    public JoinBoardResponse withContent(String value) {
        return JoinBoardResponse.newBuilder()
            .mergeFrom(this)
            .setContent(value)
            .build();
    }

    public int getBoardID() {
        return boardID;
    }

    public boolean hasBoardID() {
        return (__bitField0 & 4) == 4;
    }

    public JoinBoardResponse withBoardID(int value) {
        return JoinBoardResponse.newBuilder()
            .mergeFrom(this)
            .setBoardID(value)
            .build();
    }

    public String getUserID() {
        return userID;
    }

    public boolean hasUserID() {
        return (__bitField0 & 8) == 8;
    }

    public JoinBoardResponse withUserID(String value) {
        return JoinBoardResponse.newBuilder()
            .mergeFrom(this)
            .setUserID(value)
            .build();
    }

    public String getUserName() {
        return userName;
    }

    public boolean hasUserName() {
        return (__bitField0 & 16) == 16;
    }

    public JoinBoardResponse withUserName(String value) {
        return JoinBoardResponse.newBuilder()
            .mergeFrom(this)
            .setUserName(value)
            .build();
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public boolean hasSeatNumber() {
        return (__bitField0 & 32) == 32;
    }

    public JoinBoardResponse withSeatNumber(int value) {
        return JoinBoardResponse.newBuilder()
            .mergeFrom(this)
            .setSeatNumber(value)
            .build();
    }

    public int getGunID() {
        return gunID;
    }

    public boolean hasGunID() {
        return (__bitField0 & 64) == 64;
    }

    public JoinBoardResponse withGunID(int value) {
        return JoinBoardResponse.newBuilder()
            .mergeFrom(this)
            .setGunID(value)
            .build();
    }

    public int getAmmoID() {
        return ammoID;
    }

    public boolean hasAmmoID() {
        return (__bitField0 & 128) == 128;
    }

    public JoinBoardResponse withAmmoID(int value) {
        return JoinBoardResponse.newBuilder()
            .mergeFrom(this)
            .setAmmoID(value)
            .build();
    }

    public int getGold1() {
        return gold1;
    }

    public boolean hasGold1() {
        return (__bitField0 & 256) == 256;
    }

    public JoinBoardResponse withGold1(int value) {
        return JoinBoardResponse.newBuilder()
            .mergeFrom(this)
            .setGold1(value)
            .build();
    }

    public int getGold2() {
        return gold2;
    }

    public boolean hasGold2() {
        return (__bitField0 & 512) == 512;
    }

    public JoinBoardResponse withGold2(int value) {
        return JoinBoardResponse.newBuilder()
            .mergeFrom(this)
            .setGold2(value)
            .build();
    }

    public int getGold3() {
        return gold3;
    }

    public boolean hasGold3() {
        return (__bitField0 & 1024) == 1024;
    }

    public JoinBoardResponse withGold3(int value) {
        return JoinBoardResponse.newBuilder()
            .mergeFrom(this)
            .setGold3(value)
            .build();
    }

    public int getLevel() {
        return level;
    }

    public boolean hasLevel() {
        return (__bitField0 & 2048) == 2048;
    }

    public JoinBoardResponse withLevel(int value) {
        return JoinBoardResponse.newBuilder()
            .mergeFrom(this)
            .setLevel(value)
            .build();
    }

    public String getAvatar() {
        return avatar;
    }

    public boolean hasAvatar() {
        return (__bitField0 & 4096) == 4096;
    }

    public JoinBoardResponse withAvatar(String value) {
        return JoinBoardResponse.newBuilder()
            .mergeFrom(this)
            .setAvatar(value)
            .build();
    }

    public int getBethost() {
        return bethost;
    }

    public boolean hasBethost() {
        return (__bitField0 & 8192) == 8192;
    }

    public JoinBoardResponse withBethost(int value) {
        return JoinBoardResponse.newBuilder()
            .mergeFrom(this)
            .setBethost(value)
            .build();
    }

    public String getSnsName() {
        return snsName;
    }

    public boolean hasSnsName() {
        return (__bitField0 & 16384) == 16384;
    }

    public JoinBoardResponse withSnsName(String value) {
        return JoinBoardResponse.newBuilder()
            .mergeFrom(this)
            .setSnsName(value)
            .build();
    }

    public int getBetBullet() {
        return betBullet;
    }

    public boolean hasBetBullet() {
        return (__bitField0 & 32768) == 32768;
    }

    public JoinBoardResponse withBetBullet(int value) {
        return JoinBoardResponse.newBuilder()
            .mergeFrom(this)
            .setBetBullet(value)
            .build();
    }

    public int getPearl() {
        return pearl;
    }

    public boolean hasPearl() {
        return (__bitField0 & 65536) == 65536;
    }

    public JoinBoardResponse withPearl(int value) {
        return JoinBoardResponse.newBuilder()
            .mergeFrom(this)
            .setPearl(value)
            .build();
    }

    public int getUdpCode() {
        return udpCode;
    }

    public boolean hasUdpCode() {
        return (__bitField0 & 131072) == 131072;
    }

    public JoinBoardResponse withUdpCode(int value) {
        return JoinBoardResponse.newBuilder()
            .mergeFrom(this)
            .setUdpCode(value)
            .build();
    }

    public String getUdpHost() {
        return udpHost;
    }

    public boolean hasUdpHost() {
        return (__bitField0 & 262144) == 262144;
    }

    public JoinBoardResponse withUdpHost(String value) {
        return JoinBoardResponse.newBuilder()
            .mergeFrom(this)
            .setUdpHost(value)
            .build();
    }

    public int getUdpPort() {
        return udpPort;
    }

    public boolean hasUdpPort() {
        return (__bitField0 & 524288) == 524288;
    }

    public JoinBoardResponse withUdpPort(int value) {
        return JoinBoardResponse.newBuilder()
            .mergeFrom(this)
            .setUdpPort(value)
            .build();
    }

    public boolean getHasPet() {
        return hasPet;
    }

    public boolean hasHasPet() {
        return (__bitField0 & 1048576) == 1048576;
    }

    public JoinBoardResponse withHasPet(boolean value) {
        return JoinBoardResponse.newBuilder()
            .mergeFrom(this)
            .setHasPet(value)
            .build();
    }

    public int getSkillType() {
        return skillType;
    }

    public boolean hasSkillType() {
        return (__bitField0 & 2097152) == 2097152;
    }

    public JoinBoardResponse withSkillType(int value) {
        return JoinBoardResponse.newBuilder()
            .mergeFrom(this)
            .setSkillType(value)
            .build();
    }

    public int getSkillGold() {
        return skillGold;
    }

    public boolean hasSkillGold() {
        return (__bitField0 & 4194304) == 4194304;
    }

    public JoinBoardResponse withSkillGold(int value) {
        return JoinBoardResponse.newBuilder()
            .mergeFrom(this)
            .setSkillGold(value)
            .build();
    }

    public int getSkillAccumulation() {
        return skillAccumulation;
    }

    public boolean hasSkillAccumulation() {
        return (__bitField0 & 8388608) == 8388608;
    }

    public JoinBoardResponse withSkillAccumulation(int value) {
        return JoinBoardResponse.newBuilder()
            .mergeFrom(this)
            .setSkillAccumulation(value)
            .build();
    }

    public int getSkillAccumulationMax() {
        return skillAccumulationMax;
    }

    public boolean hasSkillAccumulationMax() {
        return (__bitField0 & 16777216) == 16777216;
    }

    public JoinBoardResponse withSkillAccumulationMax(int value) {
        return JoinBoardResponse.newBuilder()
            .mergeFrom(this)
            .setSkillAccumulationMax(value)
            .build();
    }

    public long getSkillTimeCurrent() {
        return skillTimeCurrent;
    }

    public boolean hasSkillTimeCurrent() {
        return (__bitField0 & 33554432) == 33554432;
    }

    public JoinBoardResponse withSkillTimeCurrent(long value) {
        return JoinBoardResponse.newBuilder()
            .mergeFrom(this)
            .setSkillTimeCurrent(value)
            .build();
    }

    public long getSkillTimeMax() {
        return skillTimeMax;
    }

    public boolean hasSkillTimeMax() {
        return (__bitField0 & 67108864) == 67108864;
    }

    public JoinBoardResponse withSkillTimeMax(long value) {
        return JoinBoardResponse.newBuilder()
            .mergeFrom(this)
            .setSkillTimeMax(value)
            .build();
    }

    public int getSkillDuration() {
        return skillDuration;
    }

    public boolean hasSkillDuration() {
        return (__bitField0 & 134217728) == 134217728;
    }

    public JoinBoardResponse withSkillDuration(int value) {
        return JoinBoardResponse.newBuilder()
            .mergeFrom(this)
            .setSkillDuration(value)
            .build();
    }

    public int getSkillCannonId() {
        return skillCannonId;
    }

    public boolean hasSkillCannonId() {
        return (__bitField0 & 268435456) == 268435456;
    }

    public JoinBoardResponse withSkillCannonId(int value) {
        return JoinBoardResponse.newBuilder()
            .mergeFrom(this)
            .setSkillCannonId(value)
            .build();
    }

    public int getPetLevel() {
        return petLevel;
    }

    public boolean hasPetLevel() {
        return (__bitField0 & 536870912) == 536870912;
    }

    public JoinBoardResponse withPetLevel(int value) {
        return JoinBoardResponse.newBuilder()
            .mergeFrom(this)
            .setPetLevel(value)
            .build();
    }

    public float getSkillAccBuff() {
        return skillAccBuff;
    }

    public boolean hasSkillAccBuff() {
        return (__bitField0 & 1073741824) == 1073741824;
    }

    public JoinBoardResponse withSkillAccBuff(float value) {
        return JoinBoardResponse.newBuilder()
            .mergeFrom(this)
            .setSkillAccBuff(value)
            .build();
    }

    public java.util.List<Long> getSkillTargetFishList() {
        return skillTargetFish;
    }

    public int getSkillTargetFishCount() {
        return skillTargetFish.size();
    }

    public long getSkillTargetFish(int index) {
        return skillTargetFish.get(index);
    }

    public JoinBoardResponse withSkillTargetFish(java.util.List<Long> value) {
        return JoinBoardResponse.newBuilder()
            .mergeFrom(this)
            .clearSkillTargetFish()
            .addAllSkillTargetFish(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<JoinBoardResponse> cachedSchema() {
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
        JoinBoardResponse that = (JoinBoardResponse) obj;
        if (!java.util.Objects.equals(this.result, that.result)) {
            return false;
        }
        if (!java.util.Objects.equals(this.content, that.content)) {
            return false;
        }
        if (!java.util.Objects.equals(this.boardID, that.boardID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.userID, that.userID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.userName, that.userName)) {
            return false;
        }
        if (!java.util.Objects.equals(this.seatNumber, that.seatNumber)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gunID, that.gunID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.ammoID, that.ammoID)) {
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
        if (!java.util.Objects.equals(this.level, that.level)) {
            return false;
        }
        if (!java.util.Objects.equals(this.avatar, that.avatar)) {
            return false;
        }
        if (!java.util.Objects.equals(this.bethost, that.bethost)) {
            return false;
        }
        if (!java.util.Objects.equals(this.snsName, that.snsName)) {
            return false;
        }
        if (!java.util.Objects.equals(this.betBullet, that.betBullet)) {
            return false;
        }
        if (!java.util.Objects.equals(this.pearl, that.pearl)) {
            return false;
        }
        if (!java.util.Objects.equals(this.udpCode, that.udpCode)) {
            return false;
        }
        if (!java.util.Objects.equals(this.udpHost, that.udpHost)) {
            return false;
        }
        if (!java.util.Objects.equals(this.udpPort, that.udpPort)) {
            return false;
        }
        if (!java.util.Objects.equals(this.hasPet, that.hasPet)) {
            return false;
        }
        if (!java.util.Objects.equals(this.skillType, that.skillType)) {
            return false;
        }
        if (!java.util.Objects.equals(this.skillGold, that.skillGold)) {
            return false;
        }
        if (!java.util.Objects.equals(this.skillAccumulation, that.skillAccumulation)) {
            return false;
        }
        if (!java.util.Objects.equals(this.skillAccumulationMax, that.skillAccumulationMax)) {
            return false;
        }
        if (!java.util.Objects.equals(this.skillTimeCurrent, that.skillTimeCurrent)) {
            return false;
        }
        if (!java.util.Objects.equals(this.skillTimeMax, that.skillTimeMax)) {
            return false;
        }
        if (!java.util.Objects.equals(this.skillDuration, that.skillDuration)) {
            return false;
        }
        if (!java.util.Objects.equals(this.skillCannonId, that.skillCannonId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.petLevel, that.petLevel)) {
            return false;
        }
        if (!java.util.Objects.equals(this.skillAccBuff, that.skillAccBuff)) {
            return false;
        }
        if (!java.util.Objects.equals(this.skillTargetFish, that.skillTargetFish)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.result);
        result = 31 * result + (this.content == null ? 0 : this.content.hashCode());
        result = 31 * result + Integer.hashCode(this.boardID);
        result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
        result = 31 * result + (this.userName == null ? 0 : this.userName.hashCode());
        result = 31 * result + Integer.hashCode(this.seatNumber);
        result = 31 * result + Integer.hashCode(this.gunID);
        result = 31 * result + Integer.hashCode(this.ammoID);
        result = 31 * result + Integer.hashCode(this.gold1);
        result = 31 * result + Integer.hashCode(this.gold2);
        result = 31 * result + Integer.hashCode(this.gold3);
        result = 31 * result + Integer.hashCode(this.level);
        result = 31 * result + (this.avatar == null ? 0 : this.avatar.hashCode());
        result = 31 * result + Integer.hashCode(this.bethost);
        result = 31 * result + (this.snsName == null ? 0 : this.snsName.hashCode());
        result = 31 * result + Integer.hashCode(this.betBullet);
        result = 31 * result + Integer.hashCode(this.pearl);
        result = 31 * result + Integer.hashCode(this.udpCode);
        result = 31 * result + (this.udpHost == null ? 0 : this.udpHost.hashCode());
        result = 31 * result + Integer.hashCode(this.udpPort);
        result = 31 * result + Boolean.hashCode(this.hasPet);
        result = 31 * result + Integer.hashCode(this.skillType);
        result = 31 * result + Integer.hashCode(this.skillGold);
        result = 31 * result + Integer.hashCode(this.skillAccumulation);
        result = 31 * result + Integer.hashCode(this.skillAccumulationMax);
        result = 31 * result + Long.hashCode(this.skillTimeCurrent);
        result = 31 * result + Long.hashCode(this.skillTimeMax);
        result = 31 * result + Integer.hashCode(this.skillDuration);
        result = 31 * result + Integer.hashCode(this.skillCannonId);
        result = 31 * result + Integer.hashCode(this.petLevel);
        result = 31 * result + Float.hashCode(this.skillAccBuff);
        result = 31 * result + (this.skillTargetFish == null ? 0 : this.skillTargetFish.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasResult()) {
            parts.add("result=" + getResult() + '(' + getResultValue() + ')');
        }
        if (hasContent()) {
            parts.add("content=" + getContent());
        }
        if (hasBoardID()) {
            parts.add("boardID=" + getBoardID());
        }
        if (hasUserID()) {
            parts.add("userID=" + getUserID());
        }
        if (hasUserName()) {
            parts.add("userName=" + getUserName());
        }
        if (hasSeatNumber()) {
            parts.add("seatNumber=" + getSeatNumber());
        }
        if (hasGunID()) {
            parts.add("gunID=" + getGunID());
        }
        if (hasAmmoID()) {
            parts.add("ammoID=" + getAmmoID());
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
        if (hasLevel()) {
            parts.add("level=" + getLevel());
        }
        if (hasAvatar()) {
            parts.add("avatar=" + getAvatar());
        }
        if (hasBethost()) {
            parts.add("bethost=" + getBethost());
        }
        if (hasSnsName()) {
            parts.add("snsName=" + getSnsName());
        }
        if (hasBetBullet()) {
            parts.add("betBullet=" + getBetBullet());
        }
        if (hasPearl()) {
            parts.add("pearl=" + getPearl());
        }
        if (hasUdpCode()) {
            parts.add("udpCode=" + getUdpCode());
        }
        if (hasUdpHost()) {
            parts.add("udpHost=" + getUdpHost());
        }
        if (hasUdpPort()) {
            parts.add("udpPort=" + getUdpPort());
        }
        if (hasHasPet()) {
            parts.add("hasPet=" + getHasPet());
        }
        if (hasSkillType()) {
            parts.add("skillType=" + getSkillType());
        }
        if (hasSkillGold()) {
            parts.add("skillGold=" + getSkillGold());
        }
        if (hasSkillAccumulation()) {
            parts.add("skillAccumulation=" + getSkillAccumulation());
        }
        if (hasSkillAccumulationMax()) {
            parts.add("skillAccumulationMax=" + getSkillAccumulationMax());
        }
        if (hasSkillTimeCurrent()) {
            parts.add("skillTimeCurrent=" + getSkillTimeCurrent());
        }
        if (hasSkillTimeMax()) {
            parts.add("skillTimeMax=" + getSkillTimeMax());
        }
        if (hasSkillDuration()) {
            parts.add("skillDuration=" + getSkillDuration());
        }
        if (hasSkillCannonId()) {
            parts.add("skillCannonId=" + getSkillCannonId());
        }
        if (hasPetLevel()) {
            parts.add("petLevel=" + getPetLevel());
        }
        if (hasSkillAccBuff()) {
            parts.add("skillAccBuff=" + getSkillAccBuff());
        }
        if (!skillTargetFish.isEmpty()) {
            parts.add("skillTargetFish=" + getSkillTargetFishList());
        }
        return "JoinBoardResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<JoinBoardResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("result", 1);
        	__fieldMap.put("content", 2);
        	__fieldMap.put("boardID", 3);
        	__fieldMap.put("userID", 4);
        	__fieldMap.put("userName", 5);
        	__fieldMap.put("seatNumber", 6);
        	__fieldMap.put("gunID", 7);
        	__fieldMap.put("ammoID", 8);
        	__fieldMap.put("gold1", 9);
        	__fieldMap.put("gold2", 10);
        	__fieldMap.put("gold3", 11);
        	__fieldMap.put("level", 12);
        	__fieldMap.put("avatar", 13);
        	__fieldMap.put("bethost", 14);
        	__fieldMap.put("snsName", 15);
        	__fieldMap.put("betBullet", 16);
        	__fieldMap.put("pearl", 17);
        	__fieldMap.put("udpCode", 20);
        	__fieldMap.put("udpHost", 18);
        	__fieldMap.put("udpPort", 19);
        	__fieldMap.put("hasPet", 21);
        	__fieldMap.put("skillType", 22);
        	__fieldMap.put("skillGold", 23);
        	__fieldMap.put("skillAccumulation", 24);
        	__fieldMap.put("skillAccumulationMax", 25);
        	__fieldMap.put("skillTimeCurrent", 26);
        	__fieldMap.put("skillTimeMax", 27);
        	__fieldMap.put("skillDuration", 28);
        	__fieldMap.put("skillCannonId", 29);
        	__fieldMap.put("petLevel", 30);
        	__fieldMap.put("skillAccBuff", 31);
        	__fieldMap.put("skillTargetFish", 32);
        }

        @Override
        public JoinBoardResponse newMessage() {
            return new JoinBoardResponse();
        }

        @Override
        public Class<JoinBoardResponse> typeClass() {
            return JoinBoardResponse.class;
        }

        @Override
        public String messageName() {
            return JoinBoardResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return JoinBoardResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(JoinBoardResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, JoinBoardResponse instance) throws java.io.IOException {
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
                    	instance.content = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.boardID = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.userID = input.readString();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.userName = input.readString();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.seatNumber = input.readInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.gunID = input.readInt32();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.ammoID = input.readInt32();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 9:
                    	instance.gold1 = input.readInt32();
                    	instance.__bitField0 |= 256;
                    	break;
                    case 10:
                    	instance.gold2 = input.readInt32();
                    	instance.__bitField0 |= 512;
                    	break;
                    case 11:
                    	instance.gold3 = input.readInt32();
                    	instance.__bitField0 |= 1024;
                    	break;
                    case 12:
                    	instance.level = input.readInt32();
                    	instance.__bitField0 |= 2048;
                    	break;
                    case 13:
                    	instance.avatar = input.readString();
                    	instance.__bitField0 |= 4096;
                    	break;
                    case 14:
                    	instance.bethost = input.readInt32();
                    	instance.__bitField0 |= 8192;
                    	break;
                    case 15:
                    	instance.snsName = input.readString();
                    	instance.__bitField0 |= 16384;
                    	break;
                    case 16:
                    	instance.betBullet = input.readInt32();
                    	instance.__bitField0 |= 32768;
                    	break;
                    case 17:
                    	instance.pearl = input.readInt32();
                    	instance.__bitField0 |= 65536;
                    	break;
                    case 20:
                    	instance.udpCode = input.readInt32();
                    	instance.__bitField0 |= 131072;
                    	break;
                    case 18:
                    	instance.udpHost = input.readString();
                    	instance.__bitField0 |= 262144;
                    	break;
                    case 19:
                    	instance.udpPort = input.readInt32();
                    	instance.__bitField0 |= 524288;
                    	break;
                    case 21:
                    	instance.hasPet = input.readBool();
                    	instance.__bitField0 |= 1048576;
                    	break;
                    case 22:
                    	instance.skillType = input.readInt32();
                    	instance.__bitField0 |= 2097152;
                    	break;
                    case 23:
                    	instance.skillGold = input.readInt32();
                    	instance.__bitField0 |= 4194304;
                    	break;
                    case 24:
                    	instance.skillAccumulation = input.readInt32();
                    	instance.__bitField0 |= 8388608;
                    	break;
                    case 25:
                    	instance.skillAccumulationMax = input.readInt32();
                    	instance.__bitField0 |= 16777216;
                    	break;
                    case 26:
                    	instance.skillTimeCurrent = input.readInt64();
                    	instance.__bitField0 |= 33554432;
                    	break;
                    case 27:
                    	instance.skillTimeMax = input.readInt64();
                    	instance.__bitField0 |= 67108864;
                    	break;
                    case 28:
                    	instance.skillDuration = input.readInt32();
                    	instance.__bitField0 |= 134217728;
                    	break;
                    case 29:
                    	instance.skillCannonId = input.readInt32();
                    	instance.__bitField0 |= 268435456;
                    	break;
                    case 30:
                    	instance.petLevel = input.readInt32();
                    	instance.__bitField0 |= 536870912;
                    	break;
                    case 31:
                    	instance.skillAccBuff = input.readFloat();
                    	instance.__bitField0 |= 1073741824;
                    	break;
                    case 32:
                    	if(!((instance.__bitField0 & -2147483648) == -2147483648)) {
                    	    instance.skillTargetFish = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= -2147483648;
                    	}
                    	instance.skillTargetFish.add(input.readInt64());

                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & -2147483648) == -2147483648) {
                instance.skillTargetFish = java.util.Collections.unmodifiableList(instance.skillTargetFish);
            }

        }

        @Override
        public void writeTo(io.protostuff.Output output, JoinBoardResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.result, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.content, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.boardID, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeString(4, instance.userID, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeString(5, instance.userName, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeInt32(6, instance.seatNumber, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeInt32(7, instance.gunID, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeInt32(8, instance.ammoID, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeInt32(9, instance.gold1, false);
            }

            if((instance.__bitField0 & 512) == 512) {
                output.writeInt32(10, instance.gold2, false);
            }

            if((instance.__bitField0 & 1024) == 1024) {
                output.writeInt32(11, instance.gold3, false);
            }

            if((instance.__bitField0 & 2048) == 2048) {
                output.writeInt32(12, instance.level, false);
            }

            if((instance.__bitField0 & 4096) == 4096) {
                output.writeString(13, instance.avatar, false);
            }

            if((instance.__bitField0 & 8192) == 8192) {
                output.writeInt32(14, instance.bethost, false);
            }

            if((instance.__bitField0 & 16384) == 16384) {
                output.writeString(15, instance.snsName, false);
            }

            if((instance.__bitField0 & 32768) == 32768) {
                output.writeInt32(16, instance.betBullet, false);
            }

            if((instance.__bitField0 & 65536) == 65536) {
                output.writeInt32(17, instance.pearl, false);
            }

            if((instance.__bitField0 & 131072) == 131072) {
                output.writeInt32(20, instance.udpCode, false);
            }

            if((instance.__bitField0 & 262144) == 262144) {
                output.writeString(18, instance.udpHost, false);
            }

            if((instance.__bitField0 & 524288) == 524288) {
                output.writeInt32(19, instance.udpPort, false);
            }

            if((instance.__bitField0 & 1048576) == 1048576) {
                output.writeBool(21, instance.hasPet, false);
            }

            if((instance.__bitField0 & 2097152) == 2097152) {
                output.writeInt32(22, instance.skillType, false);
            }

            if((instance.__bitField0 & 4194304) == 4194304) {
                output.writeInt32(23, instance.skillGold, false);
            }

            if((instance.__bitField0 & 8388608) == 8388608) {
                output.writeInt32(24, instance.skillAccumulation, false);
            }

            if((instance.__bitField0 & 16777216) == 16777216) {
                output.writeInt32(25, instance.skillAccumulationMax, false);
            }

            if((instance.__bitField0 & 33554432) == 33554432) {
                output.writeInt64(26, instance.skillTimeCurrent, false);
            }

            if((instance.__bitField0 & 67108864) == 67108864) {
                output.writeInt64(27, instance.skillTimeMax, false);
            }

            if((instance.__bitField0 & 134217728) == 134217728) {
                output.writeInt32(28, instance.skillDuration, false);
            }

            if((instance.__bitField0 & 268435456) == 268435456) {
                output.writeInt32(29, instance.skillCannonId, false);
            }

            if((instance.__bitField0 & 536870912) == 536870912) {
                output.writeInt32(30, instance.petLevel, false);
            }

            if((instance.__bitField0 & 1073741824) == 1073741824) {
                output.writeFloat(31, instance.skillAccBuff, false);
            }

            for(long skillTargetFish : instance.skillTargetFish) {
                output.writeInt64(32, skillTargetFish, true);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "result";
        		case 2: return "content";
        		case 3: return "boardID";
        		case 4: return "userID";
        		case 5: return "userName";
        		case 6: return "seatNumber";
        		case 7: return "gunID";
        		case 8: return "ammoID";
        		case 9: return "gold1";
        		case 10: return "gold2";
        		case 11: return "gold3";
        		case 12: return "level";
        		case 13: return "avatar";
        		case 14: return "bethost";
        		case 15: return "snsName";
        		case 16: return "betBullet";
        		case 17: return "pearl";
        		case 20: return "udpCode";
        		case 18: return "udpHost";
        		case 19: return "udpPort";
        		case 21: return "hasPet";
        		case 22: return "skillType";
        		case 23: return "skillGold";
        		case 24: return "skillAccumulation";
        		case 25: return "skillAccumulationMax";
        		case 26: return "skillTimeCurrent";
        		case 27: return "skillTimeMax";
        		case 28: return "skillDuration";
        		case 29: return "skillCannonId";
        		case 30: return "petLevel";
        		case 31: return "skillAccBuff";
        		case 32: return "skillTargetFish";
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

        private String content;

        private int boardID;

        private String userID;

        private String userName;

        private int seatNumber;

        private int gunID;

        private int ammoID;

        private int gold1;

        private int gold2;

        private int gold3;

        private int level;

        private String avatar;

        private int bethost;

        private String snsName;

        private int betBullet;

        private int pearl;

        private int udpCode;

        private String udpHost;

        private int udpPort;

        private boolean hasPet;

        private int skillType;

        private int skillGold;

        private int skillAccumulation;

        private int skillAccumulationMax;

        private long skillTimeCurrent;

        private long skillTimeMax;

        private int skillDuration;

        private int skillCannonId;

        private int petLevel;

        private float skillAccBuff;

        private java.util.List<Long> skillTargetFish;

        private int __bitField0;

        private Builder() {
            this.result = proto.message.InGameResultCode.JOIN_BOARD_SUCCESS_PLAY.getNumber();
            this.content = "";
            this.boardID = 0;
            this.userID = "";
            this.userName = "";
            this.seatNumber = 0;
            this.gunID = 0;
            this.ammoID = 0;
            this.gold1 = 0;
            this.gold2 = 0;
            this.gold3 = 0;
            this.level = 0;
            this.avatar = "";
            this.bethost = 0;
            this.snsName = "";
            this.betBullet = 0;
            this.pearl = 0;
            this.udpCode = 0;
            this.udpHost = "";
            this.udpPort = 0;
            this.hasPet = false;
            this.skillType = 0;
            this.skillGold = 0;
            this.skillAccumulation = 0;
            this.skillAccumulationMax = 0;
            this.skillTimeCurrent = 0L;
            this.skillTimeMax = 0L;
            this.skillDuration = 0;
            this.skillCannonId = 0;
            this.petLevel = 0;
            this.skillAccBuff = 0f;
            this.skillTargetFish = java.util.Collections.emptyList();
        }

        public Builder mergeFrom(JoinBoardResponse instance) {
            if (instance.hasResult()) {
                this.setResult(instance.getResult());
            }

            if (instance.hasContent()) {
                this.setContent(instance.getContent());
            }

            if (instance.hasBoardID()) {
                this.setBoardID(instance.getBoardID());
            }

            if (instance.hasUserID()) {
                this.setUserID(instance.getUserID());
            }

            if (instance.hasUserName()) {
                this.setUserName(instance.getUserName());
            }

            if (instance.hasSeatNumber()) {
                this.setSeatNumber(instance.getSeatNumber());
            }

            if (instance.hasGunID()) {
                this.setGunID(instance.getGunID());
            }

            if (instance.hasAmmoID()) {
                this.setAmmoID(instance.getAmmoID());
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

            if (instance.hasLevel()) {
                this.setLevel(instance.getLevel());
            }

            if (instance.hasAvatar()) {
                this.setAvatar(instance.getAvatar());
            }

            if (instance.hasBethost()) {
                this.setBethost(instance.getBethost());
            }

            if (instance.hasSnsName()) {
                this.setSnsName(instance.getSnsName());
            }

            if (instance.hasBetBullet()) {
                this.setBetBullet(instance.getBetBullet());
            }

            if (instance.hasPearl()) {
                this.setPearl(instance.getPearl());
            }

            if (instance.hasUdpCode()) {
                this.setUdpCode(instance.getUdpCode());
            }

            if (instance.hasUdpHost()) {
                this.setUdpHost(instance.getUdpHost());
            }

            if (instance.hasUdpPort()) {
                this.setUdpPort(instance.getUdpPort());
            }

            if (instance.hasHasPet()) {
                this.setHasPet(instance.getHasPet());
            }

            if (instance.hasSkillType()) {
                this.setSkillType(instance.getSkillType());
            }

            if (instance.hasSkillGold()) {
                this.setSkillGold(instance.getSkillGold());
            }

            if (instance.hasSkillAccumulation()) {
                this.setSkillAccumulation(instance.getSkillAccumulation());
            }

            if (instance.hasSkillAccumulationMax()) {
                this.setSkillAccumulationMax(instance.getSkillAccumulationMax());
            }

            if (instance.hasSkillTimeCurrent()) {
                this.setSkillTimeCurrent(instance.getSkillTimeCurrent());
            }

            if (instance.hasSkillTimeMax()) {
                this.setSkillTimeMax(instance.getSkillTimeMax());
            }

            if (instance.hasSkillDuration()) {
                this.setSkillDuration(instance.getSkillDuration());
            }

            if (instance.hasSkillCannonId()) {
                this.setSkillCannonId(instance.getSkillCannonId());
            }

            if (instance.hasPetLevel()) {
                this.setPetLevel(instance.getPetLevel());
            }

            if (instance.hasSkillAccBuff()) {
                this.setSkillAccBuff(instance.getSkillAccBuff());
            }

            this.addAllSkillTargetFish(instance.getSkillTargetFishList());

            return this;
        }

        public proto.message.InGameResultCode getResult() {
            return proto.message.InGameResultCode.valueOf(result);
        }

        public int getResultValue() {
            return result;
        }

        public Builder setResult(proto.message.InGameResultCode value) {
            if (value == null) {
                throw new NullPointerException("Cannot set JoinBoardResponse#result to null");
            }

            if (value == proto.message.InGameResultCode.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set JoinBoardResponse#result to UNRECOGNIZED");
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

        public String getContent() {
            return content;
        }

        public Builder setContent(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set JoinBoardResponse#content to null");
            }

            this.content = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearContent() {
            this.content = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasContent() {
            return (__bitField0 & 2) == 2;
        }

        public int getBoardID() {
            return boardID;
        }

        public Builder setBoardID(int value) {
            this.boardID = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearBoardID() {
            this.boardID = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasBoardID() {
            return (__bitField0 & 4) == 4;
        }

        public String getUserID() {
            return userID;
        }

        public Builder setUserID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set JoinBoardResponse#userID to null");
            }

            this.userID = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearUserID() {
            this.userID = "";
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasUserID() {
            return (__bitField0 & 8) == 8;
        }

        public String getUserName() {
            return userName;
        }

        public Builder setUserName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set JoinBoardResponse#userName to null");
            }

            this.userName = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearUserName() {
            this.userName = "";
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasUserName() {
            return (__bitField0 & 16) == 16;
        }

        public int getSeatNumber() {
            return seatNumber;
        }

        public Builder setSeatNumber(int value) {
            this.seatNumber = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearSeatNumber() {
            this.seatNumber = 0;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasSeatNumber() {
            return (__bitField0 & 32) == 32;
        }

        public int getGunID() {
            return gunID;
        }

        public Builder setGunID(int value) {
            this.gunID = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearGunID() {
            this.gunID = 0;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasGunID() {
            return (__bitField0 & 64) == 64;
        }

        public int getAmmoID() {
            return ammoID;
        }

        public Builder setAmmoID(int value) {
            this.ammoID = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearAmmoID() {
            this.ammoID = 0;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasAmmoID() {
            return (__bitField0 & 128) == 128;
        }

        public int getGold1() {
            return gold1;
        }

        public Builder setGold1(int value) {
            this.gold1 = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearGold1() {
            this.gold1 = 0;
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasGold1() {
            return (__bitField0 & 256) == 256;
        }

        public int getGold2() {
            return gold2;
        }

        public Builder setGold2(int value) {
            this.gold2 = value;
            __bitField0 |= 512;
            return this;
        }

        public Builder clearGold2() {
            this.gold2 = 0;
            __bitField0 &= ~512;
            return this;
        }

        public boolean hasGold2() {
            return (__bitField0 & 512) == 512;
        }

        public int getGold3() {
            return gold3;
        }

        public Builder setGold3(int value) {
            this.gold3 = value;
            __bitField0 |= 1024;
            return this;
        }

        public Builder clearGold3() {
            this.gold3 = 0;
            __bitField0 &= ~1024;
            return this;
        }

        public boolean hasGold3() {
            return (__bitField0 & 1024) == 1024;
        }

        public int getLevel() {
            return level;
        }

        public Builder setLevel(int value) {
            this.level = value;
            __bitField0 |= 2048;
            return this;
        }

        public Builder clearLevel() {
            this.level = 0;
            __bitField0 &= ~2048;
            return this;
        }

        public boolean hasLevel() {
            return (__bitField0 & 2048) == 2048;
        }

        public String getAvatar() {
            return avatar;
        }

        public Builder setAvatar(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set JoinBoardResponse#avatar to null");
            }

            this.avatar = value;
            __bitField0 |= 4096;
            return this;
        }

        public Builder clearAvatar() {
            this.avatar = "";
            __bitField0 &= ~4096;
            return this;
        }

        public boolean hasAvatar() {
            return (__bitField0 & 4096) == 4096;
        }

        public int getBethost() {
            return bethost;
        }

        public Builder setBethost(int value) {
            this.bethost = value;
            __bitField0 |= 8192;
            return this;
        }

        public Builder clearBethost() {
            this.bethost = 0;
            __bitField0 &= ~8192;
            return this;
        }

        public boolean hasBethost() {
            return (__bitField0 & 8192) == 8192;
        }

        public String getSnsName() {
            return snsName;
        }

        public Builder setSnsName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set JoinBoardResponse#snsName to null");
            }

            this.snsName = value;
            __bitField0 |= 16384;
            return this;
        }

        public Builder clearSnsName() {
            this.snsName = "";
            __bitField0 &= ~16384;
            return this;
        }

        public boolean hasSnsName() {
            return (__bitField0 & 16384) == 16384;
        }

        public int getBetBullet() {
            return betBullet;
        }

        public Builder setBetBullet(int value) {
            this.betBullet = value;
            __bitField0 |= 32768;
            return this;
        }

        public Builder clearBetBullet() {
            this.betBullet = 0;
            __bitField0 &= ~32768;
            return this;
        }

        public boolean hasBetBullet() {
            return (__bitField0 & 32768) == 32768;
        }

        public int getPearl() {
            return pearl;
        }

        public Builder setPearl(int value) {
            this.pearl = value;
            __bitField0 |= 65536;
            return this;
        }

        public Builder clearPearl() {
            this.pearl = 0;
            __bitField0 &= ~65536;
            return this;
        }

        public boolean hasPearl() {
            return (__bitField0 & 65536) == 65536;
        }

        public int getUdpCode() {
            return udpCode;
        }

        public Builder setUdpCode(int value) {
            this.udpCode = value;
            __bitField0 |= 131072;
            return this;
        }

        public Builder clearUdpCode() {
            this.udpCode = 0;
            __bitField0 &= ~131072;
            return this;
        }

        public boolean hasUdpCode() {
            return (__bitField0 & 131072) == 131072;
        }

        public String getUdpHost() {
            return udpHost;
        }

        public Builder setUdpHost(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set JoinBoardResponse#udpHost to null");
            }

            this.udpHost = value;
            __bitField0 |= 262144;
            return this;
        }

        public Builder clearUdpHost() {
            this.udpHost = "";
            __bitField0 &= ~262144;
            return this;
        }

        public boolean hasUdpHost() {
            return (__bitField0 & 262144) == 262144;
        }

        public int getUdpPort() {
            return udpPort;
        }

        public Builder setUdpPort(int value) {
            this.udpPort = value;
            __bitField0 |= 524288;
            return this;
        }

        public Builder clearUdpPort() {
            this.udpPort = 0;
            __bitField0 &= ~524288;
            return this;
        }

        public boolean hasUdpPort() {
            return (__bitField0 & 524288) == 524288;
        }

        public boolean getHasPet() {
            return hasPet;
        }

        public Builder setHasPet(boolean value) {
            this.hasPet = value;
            __bitField0 |= 1048576;
            return this;
        }

        public Builder clearHasPet() {
            this.hasPet = false;
            __bitField0 &= ~1048576;
            return this;
        }

        public boolean hasHasPet() {
            return (__bitField0 & 1048576) == 1048576;
        }

        public int getSkillType() {
            return skillType;
        }

        public Builder setSkillType(int value) {
            this.skillType = value;
            __bitField0 |= 2097152;
            return this;
        }

        public Builder clearSkillType() {
            this.skillType = 0;
            __bitField0 &= ~2097152;
            return this;
        }

        public boolean hasSkillType() {
            return (__bitField0 & 2097152) == 2097152;
        }

        public int getSkillGold() {
            return skillGold;
        }

        public Builder setSkillGold(int value) {
            this.skillGold = value;
            __bitField0 |= 4194304;
            return this;
        }

        public Builder clearSkillGold() {
            this.skillGold = 0;
            __bitField0 &= ~4194304;
            return this;
        }

        public boolean hasSkillGold() {
            return (__bitField0 & 4194304) == 4194304;
        }

        public int getSkillAccumulation() {
            return skillAccumulation;
        }

        public Builder setSkillAccumulation(int value) {
            this.skillAccumulation = value;
            __bitField0 |= 8388608;
            return this;
        }

        public Builder clearSkillAccumulation() {
            this.skillAccumulation = 0;
            __bitField0 &= ~8388608;
            return this;
        }

        public boolean hasSkillAccumulation() {
            return (__bitField0 & 8388608) == 8388608;
        }

        public int getSkillAccumulationMax() {
            return skillAccumulationMax;
        }

        public Builder setSkillAccumulationMax(int value) {
            this.skillAccumulationMax = value;
            __bitField0 |= 16777216;
            return this;
        }

        public Builder clearSkillAccumulationMax() {
            this.skillAccumulationMax = 0;
            __bitField0 &= ~16777216;
            return this;
        }

        public boolean hasSkillAccumulationMax() {
            return (__bitField0 & 16777216) == 16777216;
        }

        public long getSkillTimeCurrent() {
            return skillTimeCurrent;
        }

        public Builder setSkillTimeCurrent(long value) {
            this.skillTimeCurrent = value;
            __bitField0 |= 33554432;
            return this;
        }

        public Builder clearSkillTimeCurrent() {
            this.skillTimeCurrent = 0L;
            __bitField0 &= ~33554432;
            return this;
        }

        public boolean hasSkillTimeCurrent() {
            return (__bitField0 & 33554432) == 33554432;
        }

        public long getSkillTimeMax() {
            return skillTimeMax;
        }

        public Builder setSkillTimeMax(long value) {
            this.skillTimeMax = value;
            __bitField0 |= 67108864;
            return this;
        }

        public Builder clearSkillTimeMax() {
            this.skillTimeMax = 0L;
            __bitField0 &= ~67108864;
            return this;
        }

        public boolean hasSkillTimeMax() {
            return (__bitField0 & 67108864) == 67108864;
        }

        public int getSkillDuration() {
            return skillDuration;
        }

        public Builder setSkillDuration(int value) {
            this.skillDuration = value;
            __bitField0 |= 134217728;
            return this;
        }

        public Builder clearSkillDuration() {
            this.skillDuration = 0;
            __bitField0 &= ~134217728;
            return this;
        }

        public boolean hasSkillDuration() {
            return (__bitField0 & 134217728) == 134217728;
        }

        public int getSkillCannonId() {
            return skillCannonId;
        }

        public Builder setSkillCannonId(int value) {
            this.skillCannonId = value;
            __bitField0 |= 268435456;
            return this;
        }

        public Builder clearSkillCannonId() {
            this.skillCannonId = 0;
            __bitField0 &= ~268435456;
            return this;
        }

        public boolean hasSkillCannonId() {
            return (__bitField0 & 268435456) == 268435456;
        }

        public int getPetLevel() {
            return petLevel;
        }

        public Builder setPetLevel(int value) {
            this.petLevel = value;
            __bitField0 |= 536870912;
            return this;
        }

        public Builder clearPetLevel() {
            this.petLevel = 0;
            __bitField0 &= ~536870912;
            return this;
        }

        public boolean hasPetLevel() {
            return (__bitField0 & 536870912) == 536870912;
        }

        public float getSkillAccBuff() {
            return skillAccBuff;
        }

        public Builder setSkillAccBuff(float value) {
            this.skillAccBuff = value;
            __bitField0 |= 1073741824;
            return this;
        }

        public Builder clearSkillAccBuff() {
            this.skillAccBuff = 0f;
            __bitField0 &= ~1073741824;
            return this;
        }

        public boolean hasSkillAccBuff() {
            return (__bitField0 & 1073741824) == 1073741824;
        }

        public java.util.List<Long> getSkillTargetFishList() {
            return skillTargetFish;
        }

        public Builder setSkillTargetFish(int index, long value) {
            if(!((__bitField0 & -2147483648) == -2147483648)) {
                this.skillTargetFish = new java.util.ArrayList<>();
                __bitField0 |= -2147483648;
            }
            this.skillTargetFish.set(index, value);
            return this;
        }

        public Builder addSkillTargetFish(long value) {
            if(!((__bitField0 & -2147483648) == -2147483648)) {
                this.skillTargetFish = new java.util.ArrayList<>();
                __bitField0 |= -2147483648;
            }
            this.skillTargetFish.add(value);
            return this;
        }

        public Builder addAllSkillTargetFish(java.lang.Iterable<Long> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set JoinBoardResponse#skillTargetFish to null");
            }
            if(!((__bitField0 & -2147483648) == -2147483648)) {
                this.skillTargetFish = new java.util.ArrayList<>();
                __bitField0 |= -2147483648;
            }
            for (final Long value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set JoinBoardResponse#skillTargetFish to null");
                }
                this.skillTargetFish.add(value);
            }
            return this;
        }

        public Builder clearSkillTargetFish() {
            this.skillTargetFish = java.util.Collections.emptyList();
            __bitField0 &= ~-2147483648;
            return this;
        }

        public int getSkillTargetFishCount() {
            return skillTargetFish.size();
        }

        public long getSkillTargetFish(int index) {
            return skillTargetFish.get(index);
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
            if (!java.util.Objects.equals(this.content, that.content)) {
                return false;
            }
            if (!java.util.Objects.equals(this.boardID, that.boardID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.userID, that.userID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.userName, that.userName)) {
                return false;
            }
            if (!java.util.Objects.equals(this.seatNumber, that.seatNumber)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gunID, that.gunID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.ammoID, that.ammoID)) {
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
            if (!java.util.Objects.equals(this.level, that.level)) {
                return false;
            }
            if (!java.util.Objects.equals(this.avatar, that.avatar)) {
                return false;
            }
            if (!java.util.Objects.equals(this.bethost, that.bethost)) {
                return false;
            }
            if (!java.util.Objects.equals(this.snsName, that.snsName)) {
                return false;
            }
            if (!java.util.Objects.equals(this.betBullet, that.betBullet)) {
                return false;
            }
            if (!java.util.Objects.equals(this.pearl, that.pearl)) {
                return false;
            }
            if (!java.util.Objects.equals(this.udpCode, that.udpCode)) {
                return false;
            }
            if (!java.util.Objects.equals(this.udpHost, that.udpHost)) {
                return false;
            }
            if (!java.util.Objects.equals(this.udpPort, that.udpPort)) {
                return false;
            }
            if (!java.util.Objects.equals(this.hasPet, that.hasPet)) {
                return false;
            }
            if (!java.util.Objects.equals(this.skillType, that.skillType)) {
                return false;
            }
            if (!java.util.Objects.equals(this.skillGold, that.skillGold)) {
                return false;
            }
            if (!java.util.Objects.equals(this.skillAccumulation, that.skillAccumulation)) {
                return false;
            }
            if (!java.util.Objects.equals(this.skillAccumulationMax, that.skillAccumulationMax)) {
                return false;
            }
            if (!java.util.Objects.equals(this.skillTimeCurrent, that.skillTimeCurrent)) {
                return false;
            }
            if (!java.util.Objects.equals(this.skillTimeMax, that.skillTimeMax)) {
                return false;
            }
            if (!java.util.Objects.equals(this.skillDuration, that.skillDuration)) {
                return false;
            }
            if (!java.util.Objects.equals(this.skillCannonId, that.skillCannonId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.petLevel, that.petLevel)) {
                return false;
            }
            if (!java.util.Objects.equals(this.skillAccBuff, that.skillAccBuff)) {
                return false;
            }
            if (!java.util.Objects.equals(this.skillTargetFish, that.skillTargetFish)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.result);
            result = 31 * result + (this.content == null ? 0 : this.content.hashCode());
            result = 31 * result + Integer.hashCode(this.boardID);
            result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
            result = 31 * result + (this.userName == null ? 0 : this.userName.hashCode());
            result = 31 * result + Integer.hashCode(this.seatNumber);
            result = 31 * result + Integer.hashCode(this.gunID);
            result = 31 * result + Integer.hashCode(this.ammoID);
            result = 31 * result + Integer.hashCode(this.gold1);
            result = 31 * result + Integer.hashCode(this.gold2);
            result = 31 * result + Integer.hashCode(this.gold3);
            result = 31 * result + Integer.hashCode(this.level);
            result = 31 * result + (this.avatar == null ? 0 : this.avatar.hashCode());
            result = 31 * result + Integer.hashCode(this.bethost);
            result = 31 * result + (this.snsName == null ? 0 : this.snsName.hashCode());
            result = 31 * result + Integer.hashCode(this.betBullet);
            result = 31 * result + Integer.hashCode(this.pearl);
            result = 31 * result + Integer.hashCode(this.udpCode);
            result = 31 * result + (this.udpHost == null ? 0 : this.udpHost.hashCode());
            result = 31 * result + Integer.hashCode(this.udpPort);
            result = 31 * result + Boolean.hashCode(this.hasPet);
            result = 31 * result + Integer.hashCode(this.skillType);
            result = 31 * result + Integer.hashCode(this.skillGold);
            result = 31 * result + Integer.hashCode(this.skillAccumulation);
            result = 31 * result + Integer.hashCode(this.skillAccumulationMax);
            result = 31 * result + Long.hashCode(this.skillTimeCurrent);
            result = 31 * result + Long.hashCode(this.skillTimeMax);
            result = 31 * result + Integer.hashCode(this.skillDuration);
            result = 31 * result + Integer.hashCode(this.skillCannonId);
            result = 31 * result + Integer.hashCode(this.petLevel);
            result = 31 * result + Float.hashCode(this.skillAccBuff);
            result = 31 * result + (this.skillTargetFish == null ? 0 : this.skillTargetFish.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasResult()) {
                parts.add("result=" + getResult() + '(' + getResultValue() + ')');
            }
            if (hasContent()) {
                parts.add("content=" + getContent());
            }
            if (hasBoardID()) {
                parts.add("boardID=" + getBoardID());
            }
            if (hasUserID()) {
                parts.add("userID=" + getUserID());
            }
            if (hasUserName()) {
                parts.add("userName=" + getUserName());
            }
            if (hasSeatNumber()) {
                parts.add("seatNumber=" + getSeatNumber());
            }
            if (hasGunID()) {
                parts.add("gunID=" + getGunID());
            }
            if (hasAmmoID()) {
                parts.add("ammoID=" + getAmmoID());
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
            if (hasLevel()) {
                parts.add("level=" + getLevel());
            }
            if (hasAvatar()) {
                parts.add("avatar=" + getAvatar());
            }
            if (hasBethost()) {
                parts.add("bethost=" + getBethost());
            }
            if (hasSnsName()) {
                parts.add("snsName=" + getSnsName());
            }
            if (hasBetBullet()) {
                parts.add("betBullet=" + getBetBullet());
            }
            if (hasPearl()) {
                parts.add("pearl=" + getPearl());
            }
            if (hasUdpCode()) {
                parts.add("udpCode=" + getUdpCode());
            }
            if (hasUdpHost()) {
                parts.add("udpHost=" + getUdpHost());
            }
            if (hasUdpPort()) {
                parts.add("udpPort=" + getUdpPort());
            }
            if (hasHasPet()) {
                parts.add("hasPet=" + getHasPet());
            }
            if (hasSkillType()) {
                parts.add("skillType=" + getSkillType());
            }
            if (hasSkillGold()) {
                parts.add("skillGold=" + getSkillGold());
            }
            if (hasSkillAccumulation()) {
                parts.add("skillAccumulation=" + getSkillAccumulation());
            }
            if (hasSkillAccumulationMax()) {
                parts.add("skillAccumulationMax=" + getSkillAccumulationMax());
            }
            if (hasSkillTimeCurrent()) {
                parts.add("skillTimeCurrent=" + getSkillTimeCurrent());
            }
            if (hasSkillTimeMax()) {
                parts.add("skillTimeMax=" + getSkillTimeMax());
            }
            if (hasSkillDuration()) {
                parts.add("skillDuration=" + getSkillDuration());
            }
            if (hasSkillCannonId()) {
                parts.add("skillCannonId=" + getSkillCannonId());
            }
            if (hasPetLevel()) {
                parts.add("petLevel=" + getPetLevel());
            }
            if (hasSkillAccBuff()) {
                parts.add("skillAccBuff=" + getSkillAccBuff());
            }
            if (!skillTargetFish.isEmpty()) {
                parts.add("skillTargetFish=" + getSkillTargetFishList());
            }
            return "JoinBoardResponse{" + String.join(", ", parts) + "}";
        }

        public JoinBoardResponse build() {
            proto.message.JoinBoardResponse result = new proto.message.JoinBoardResponse();
            result.__bitField0 = __bitField0;
            result.result = this.result;
            result.content = this.content;
            result.boardID = this.boardID;
            result.userID = this.userID;
            result.userName = this.userName;
            result.seatNumber = this.seatNumber;
            result.gunID = this.gunID;
            result.ammoID = this.ammoID;
            result.gold1 = this.gold1;
            result.gold2 = this.gold2;
            result.gold3 = this.gold3;
            result.level = this.level;
            result.avatar = this.avatar;
            result.bethost = this.bethost;
            result.snsName = this.snsName;
            result.betBullet = this.betBullet;
            result.pearl = this.pearl;
            result.udpCode = this.udpCode;
            result.udpHost = this.udpHost;
            result.udpPort = this.udpPort;
            result.hasPet = this.hasPet;
            result.skillType = this.skillType;
            result.skillGold = this.skillGold;
            result.skillAccumulation = this.skillAccumulation;
            result.skillAccumulationMax = this.skillAccumulationMax;
            result.skillTimeCurrent = this.skillTimeCurrent;
            result.skillTimeMax = this.skillTimeMax;
            result.skillDuration = this.skillDuration;
            result.skillCannonId = this.skillCannonId;
            result.petLevel = this.petLevel;
            result.skillAccBuff = this.skillAccBuff;
            result.skillTargetFish = java.util.Collections.unmodifiableList(this.skillTargetFish);
            return result;
        }

    }



}