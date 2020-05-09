package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class GetUserProfileResponse
        implements io.protostuff.Message<GetUserProfileResponse> {

    private static final GetUserProfileResponse DEFAULT_INSTANCE = newBuilder().build();

    private String userID;

    private String userName;

    private int currentLevel;

    private int currentExp;

    private int expToNextLevel;

    private int gold1;

    private int gold2;

    private int gold3;

    private int paymentCount;

    private int freeBestDaily;

    private int freeBestWeekly;

    private int freeBestScore;

    private int betBestDaily;

    private int betBestWeekly;

    private int betBestScore;

    private int charmPointDaily;

    private int charmPointWeekly;

    private int charmPointScore;

    private int ticketCount;

    private int currentTicketAccumulation;

    private int maxTicketAccumulation;

    private boolean __merge_lock = false;
    private int __bitField0;

    private GetUserProfileResponse() {
        this.userID = "";
        this.userName = "";
        this.currentLevel = 0;
        this.currentExp = 0;
        this.expToNextLevel = 0;
        this.gold1 = 0;
        this.gold2 = 0;
        this.gold3 = 0;
        this.paymentCount = 0;
        this.freeBestDaily = 0;
        this.freeBestWeekly = 0;
        this.freeBestScore = 0;
        this.betBestDaily = 0;
        this.betBestWeekly = 0;
        this.betBestScore = 0;
        this.charmPointDaily = 0;
        this.charmPointWeekly = 0;
        this.charmPointScore = 0;
        this.ticketCount = 0;
        this.currentTicketAccumulation = 0;
        this.maxTicketAccumulation = 0;
    }

    private GetUserProfileResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static GetUserProfileResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<GetUserProfileResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public String getUserID() {
        return userID;
    }

    public boolean hasUserID() {
        return (__bitField0 & 1) == 1;
    }

    public GetUserProfileResponse withUserID(String value) {
        return GetUserProfileResponse.newBuilder()
            .mergeFrom(this)
            .setUserID(value)
            .build();
    }

    public String getUserName() {
        return userName;
    }

    public boolean hasUserName() {
        return (__bitField0 & 2) == 2;
    }

    public GetUserProfileResponse withUserName(String value) {
        return GetUserProfileResponse.newBuilder()
            .mergeFrom(this)
            .setUserName(value)
            .build();
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public boolean hasCurrentLevel() {
        return (__bitField0 & 4) == 4;
    }

    public GetUserProfileResponse withCurrentLevel(int value) {
        return GetUserProfileResponse.newBuilder()
            .mergeFrom(this)
            .setCurrentLevel(value)
            .build();
    }

    public int getCurrentExp() {
        return currentExp;
    }

    public boolean hasCurrentExp() {
        return (__bitField0 & 8) == 8;
    }

    public GetUserProfileResponse withCurrentExp(int value) {
        return GetUserProfileResponse.newBuilder()
            .mergeFrom(this)
            .setCurrentExp(value)
            .build();
    }

    public int getExpToNextLevel() {
        return expToNextLevel;
    }

    public boolean hasExpToNextLevel() {
        return (__bitField0 & 16) == 16;
    }

    public GetUserProfileResponse withExpToNextLevel(int value) {
        return GetUserProfileResponse.newBuilder()
            .mergeFrom(this)
            .setExpToNextLevel(value)
            .build();
    }

    public int getGold1() {
        return gold1;
    }

    public boolean hasGold1() {
        return (__bitField0 & 32) == 32;
    }

    public GetUserProfileResponse withGold1(int value) {
        return GetUserProfileResponse.newBuilder()
            .mergeFrom(this)
            .setGold1(value)
            .build();
    }

    public int getGold2() {
        return gold2;
    }

    public boolean hasGold2() {
        return (__bitField0 & 64) == 64;
    }

    public GetUserProfileResponse withGold2(int value) {
        return GetUserProfileResponse.newBuilder()
            .mergeFrom(this)
            .setGold2(value)
            .build();
    }

    public int getGold3() {
        return gold3;
    }

    public boolean hasGold3() {
        return (__bitField0 & 128) == 128;
    }

    public GetUserProfileResponse withGold3(int value) {
        return GetUserProfileResponse.newBuilder()
            .mergeFrom(this)
            .setGold3(value)
            .build();
    }

    public int getPaymentCount() {
        return paymentCount;
    }

    public boolean hasPaymentCount() {
        return (__bitField0 & 256) == 256;
    }

    public GetUserProfileResponse withPaymentCount(int value) {
        return GetUserProfileResponse.newBuilder()
            .mergeFrom(this)
            .setPaymentCount(value)
            .build();
    }

    public int getFreeBestDaily() {
        return freeBestDaily;
    }

    public boolean hasFreeBestDaily() {
        return (__bitField0 & 512) == 512;
    }

    public GetUserProfileResponse withFreeBestDaily(int value) {
        return GetUserProfileResponse.newBuilder()
            .mergeFrom(this)
            .setFreeBestDaily(value)
            .build();
    }

    public int getFreeBestWeekly() {
        return freeBestWeekly;
    }

    public boolean hasFreeBestWeekly() {
        return (__bitField0 & 1024) == 1024;
    }

    public GetUserProfileResponse withFreeBestWeekly(int value) {
        return GetUserProfileResponse.newBuilder()
            .mergeFrom(this)
            .setFreeBestWeekly(value)
            .build();
    }

    public int getFreeBestScore() {
        return freeBestScore;
    }

    public boolean hasFreeBestScore() {
        return (__bitField0 & 2048) == 2048;
    }

    public GetUserProfileResponse withFreeBestScore(int value) {
        return GetUserProfileResponse.newBuilder()
            .mergeFrom(this)
            .setFreeBestScore(value)
            .build();
    }

    public int getBetBestDaily() {
        return betBestDaily;
    }

    public boolean hasBetBestDaily() {
        return (__bitField0 & 4096) == 4096;
    }

    public GetUserProfileResponse withBetBestDaily(int value) {
        return GetUserProfileResponse.newBuilder()
            .mergeFrom(this)
            .setBetBestDaily(value)
            .build();
    }

    public int getBetBestWeekly() {
        return betBestWeekly;
    }

    public boolean hasBetBestWeekly() {
        return (__bitField0 & 8192) == 8192;
    }

    public GetUserProfileResponse withBetBestWeekly(int value) {
        return GetUserProfileResponse.newBuilder()
            .mergeFrom(this)
            .setBetBestWeekly(value)
            .build();
    }

    public int getBetBestScore() {
        return betBestScore;
    }

    public boolean hasBetBestScore() {
        return (__bitField0 & 16384) == 16384;
    }

    public GetUserProfileResponse withBetBestScore(int value) {
        return GetUserProfileResponse.newBuilder()
            .mergeFrom(this)
            .setBetBestScore(value)
            .build();
    }

    public int getCharmPointDaily() {
        return charmPointDaily;
    }

    public boolean hasCharmPointDaily() {
        return (__bitField0 & 32768) == 32768;
    }

    public GetUserProfileResponse withCharmPointDaily(int value) {
        return GetUserProfileResponse.newBuilder()
            .mergeFrom(this)
            .setCharmPointDaily(value)
            .build();
    }

    public int getCharmPointWeekly() {
        return charmPointWeekly;
    }

    public boolean hasCharmPointWeekly() {
        return (__bitField0 & 65536) == 65536;
    }

    public GetUserProfileResponse withCharmPointWeekly(int value) {
        return GetUserProfileResponse.newBuilder()
            .mergeFrom(this)
            .setCharmPointWeekly(value)
            .build();
    }

    public int getCharmPointScore() {
        return charmPointScore;
    }

    public boolean hasCharmPointScore() {
        return (__bitField0 & 131072) == 131072;
    }

    public GetUserProfileResponse withCharmPointScore(int value) {
        return GetUserProfileResponse.newBuilder()
            .mergeFrom(this)
            .setCharmPointScore(value)
            .build();
    }

    public int getTicketCount() {
        return ticketCount;
    }

    public boolean hasTicketCount() {
        return (__bitField0 & 262144) == 262144;
    }

    public GetUserProfileResponse withTicketCount(int value) {
        return GetUserProfileResponse.newBuilder()
            .mergeFrom(this)
            .setTicketCount(value)
            .build();
    }

    public int getCurrentTicketAccumulation() {
        return currentTicketAccumulation;
    }

    public boolean hasCurrentTicketAccumulation() {
        return (__bitField0 & 524288) == 524288;
    }

    public GetUserProfileResponse withCurrentTicketAccumulation(int value) {
        return GetUserProfileResponse.newBuilder()
            .mergeFrom(this)
            .setCurrentTicketAccumulation(value)
            .build();
    }

    public int getMaxTicketAccumulation() {
        return maxTicketAccumulation;
    }

    public boolean hasMaxTicketAccumulation() {
        return (__bitField0 & 1048576) == 1048576;
    }

    public GetUserProfileResponse withMaxTicketAccumulation(int value) {
        return GetUserProfileResponse.newBuilder()
            .mergeFrom(this)
            .setMaxTicketAccumulation(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<GetUserProfileResponse> cachedSchema() {
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
        GetUserProfileResponse that = (GetUserProfileResponse) obj;
        if (!java.util.Objects.equals(this.userID, that.userID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.userName, that.userName)) {
            return false;
        }
        if (!java.util.Objects.equals(this.currentLevel, that.currentLevel)) {
            return false;
        }
        if (!java.util.Objects.equals(this.currentExp, that.currentExp)) {
            return false;
        }
        if (!java.util.Objects.equals(this.expToNextLevel, that.expToNextLevel)) {
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
        if (!java.util.Objects.equals(this.paymentCount, that.paymentCount)) {
            return false;
        }
        if (!java.util.Objects.equals(this.freeBestDaily, that.freeBestDaily)) {
            return false;
        }
        if (!java.util.Objects.equals(this.freeBestWeekly, that.freeBestWeekly)) {
            return false;
        }
        if (!java.util.Objects.equals(this.freeBestScore, that.freeBestScore)) {
            return false;
        }
        if (!java.util.Objects.equals(this.betBestDaily, that.betBestDaily)) {
            return false;
        }
        if (!java.util.Objects.equals(this.betBestWeekly, that.betBestWeekly)) {
            return false;
        }
        if (!java.util.Objects.equals(this.betBestScore, that.betBestScore)) {
            return false;
        }
        if (!java.util.Objects.equals(this.charmPointDaily, that.charmPointDaily)) {
            return false;
        }
        if (!java.util.Objects.equals(this.charmPointWeekly, that.charmPointWeekly)) {
            return false;
        }
        if (!java.util.Objects.equals(this.charmPointScore, that.charmPointScore)) {
            return false;
        }
        if (!java.util.Objects.equals(this.ticketCount, that.ticketCount)) {
            return false;
        }
        if (!java.util.Objects.equals(this.currentTicketAccumulation, that.currentTicketAccumulation)) {
            return false;
        }
        if (!java.util.Objects.equals(this.maxTicketAccumulation, that.maxTicketAccumulation)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
        result = 31 * result + (this.userName == null ? 0 : this.userName.hashCode());
        result = 31 * result + Integer.hashCode(this.currentLevel);
        result = 31 * result + Integer.hashCode(this.currentExp);
        result = 31 * result + Integer.hashCode(this.expToNextLevel);
        result = 31 * result + Integer.hashCode(this.gold1);
        result = 31 * result + Integer.hashCode(this.gold2);
        result = 31 * result + Integer.hashCode(this.gold3);
        result = 31 * result + Integer.hashCode(this.paymentCount);
        result = 31 * result + Integer.hashCode(this.freeBestDaily);
        result = 31 * result + Integer.hashCode(this.freeBestWeekly);
        result = 31 * result + Integer.hashCode(this.freeBestScore);
        result = 31 * result + Integer.hashCode(this.betBestDaily);
        result = 31 * result + Integer.hashCode(this.betBestWeekly);
        result = 31 * result + Integer.hashCode(this.betBestScore);
        result = 31 * result + Integer.hashCode(this.charmPointDaily);
        result = 31 * result + Integer.hashCode(this.charmPointWeekly);
        result = 31 * result + Integer.hashCode(this.charmPointScore);
        result = 31 * result + Integer.hashCode(this.ticketCount);
        result = 31 * result + Integer.hashCode(this.currentTicketAccumulation);
        result = 31 * result + Integer.hashCode(this.maxTicketAccumulation);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasUserID()) {
            parts.add("userID=" + getUserID());
        }
        if (hasUserName()) {
            parts.add("userName=" + getUserName());
        }
        if (hasCurrentLevel()) {
            parts.add("currentLevel=" + getCurrentLevel());
        }
        if (hasCurrentExp()) {
            parts.add("currentExp=" + getCurrentExp());
        }
        if (hasExpToNextLevel()) {
            parts.add("expToNextLevel=" + getExpToNextLevel());
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
        if (hasPaymentCount()) {
            parts.add("paymentCount=" + getPaymentCount());
        }
        if (hasFreeBestDaily()) {
            parts.add("freeBestDaily=" + getFreeBestDaily());
        }
        if (hasFreeBestWeekly()) {
            parts.add("freeBestWeekly=" + getFreeBestWeekly());
        }
        if (hasFreeBestScore()) {
            parts.add("freeBestScore=" + getFreeBestScore());
        }
        if (hasBetBestDaily()) {
            parts.add("betBestDaily=" + getBetBestDaily());
        }
        if (hasBetBestWeekly()) {
            parts.add("betBestWeekly=" + getBetBestWeekly());
        }
        if (hasBetBestScore()) {
            parts.add("betBestScore=" + getBetBestScore());
        }
        if (hasCharmPointDaily()) {
            parts.add("charmPointDaily=" + getCharmPointDaily());
        }
        if (hasCharmPointWeekly()) {
            parts.add("charmPointWeekly=" + getCharmPointWeekly());
        }
        if (hasCharmPointScore()) {
            parts.add("charmPointScore=" + getCharmPointScore());
        }
        if (hasTicketCount()) {
            parts.add("ticketCount=" + getTicketCount());
        }
        if (hasCurrentTicketAccumulation()) {
            parts.add("currentTicketAccumulation=" + getCurrentTicketAccumulation());
        }
        if (hasMaxTicketAccumulation()) {
            parts.add("maxTicketAccumulation=" + getMaxTicketAccumulation());
        }
        return "GetUserProfileResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<GetUserProfileResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("userID", 1);
        	__fieldMap.put("userName", 2);
        	__fieldMap.put("currentLevel", 3);
        	__fieldMap.put("currentExp", 4);
        	__fieldMap.put("expToNextLevel", 5);
        	__fieldMap.put("gold1", 6);
        	__fieldMap.put("gold2", 7);
        	__fieldMap.put("gold3", 8);
        	__fieldMap.put("paymentCount", 9);
        	__fieldMap.put("freeBestDaily", 10);
        	__fieldMap.put("freeBestWeekly", 11);
        	__fieldMap.put("freeBestScore", 12);
        	__fieldMap.put("betBestDaily", 13);
        	__fieldMap.put("betBestWeekly", 14);
        	__fieldMap.put("betBestScore", 15);
        	__fieldMap.put("charmPointDaily", 16);
        	__fieldMap.put("charmPointWeekly", 17);
        	__fieldMap.put("charmPointScore", 18);
        	__fieldMap.put("ticketCount", 19);
        	__fieldMap.put("currentTicketAccumulation", 20);
        	__fieldMap.put("maxTicketAccumulation", 21);
        }

        @Override
        public GetUserProfileResponse newMessage() {
            return new GetUserProfileResponse();
        }

        @Override
        public Class<GetUserProfileResponse> typeClass() {
            return GetUserProfileResponse.class;
        }

        @Override
        public String messageName() {
            return GetUserProfileResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return GetUserProfileResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(GetUserProfileResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, GetUserProfileResponse instance) throws java.io.IOException {
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
                    	instance.userID = input.readString();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.userName = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.currentLevel = input.readInt32();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.currentExp = input.readInt32();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.expToNextLevel = input.readInt32();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.gold1 = input.readInt32();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.gold2 = input.readInt32();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.gold3 = input.readInt32();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 9:
                    	instance.paymentCount = input.readInt32();
                    	instance.__bitField0 |= 256;
                    	break;
                    case 10:
                    	instance.freeBestDaily = input.readInt32();
                    	instance.__bitField0 |= 512;
                    	break;
                    case 11:
                    	instance.freeBestWeekly = input.readInt32();
                    	instance.__bitField0 |= 1024;
                    	break;
                    case 12:
                    	instance.freeBestScore = input.readInt32();
                    	instance.__bitField0 |= 2048;
                    	break;
                    case 13:
                    	instance.betBestDaily = input.readInt32();
                    	instance.__bitField0 |= 4096;
                    	break;
                    case 14:
                    	instance.betBestWeekly = input.readInt32();
                    	instance.__bitField0 |= 8192;
                    	break;
                    case 15:
                    	instance.betBestScore = input.readInt32();
                    	instance.__bitField0 |= 16384;
                    	break;
                    case 16:
                    	instance.charmPointDaily = input.readInt32();
                    	instance.__bitField0 |= 32768;
                    	break;
                    case 17:
                    	instance.charmPointWeekly = input.readInt32();
                    	instance.__bitField0 |= 65536;
                    	break;
                    case 18:
                    	instance.charmPointScore = input.readInt32();
                    	instance.__bitField0 |= 131072;
                    	break;
                    case 19:
                    	instance.ticketCount = input.readInt32();
                    	instance.__bitField0 |= 262144;
                    	break;
                    case 20:
                    	instance.currentTicketAccumulation = input.readInt32();
                    	instance.__bitField0 |= 524288;
                    	break;
                    case 21:
                    	instance.maxTicketAccumulation = input.readInt32();
                    	instance.__bitField0 |= 1048576;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, GetUserProfileResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeString(1, instance.userID, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.userName, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeInt32(3, instance.currentLevel, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeInt32(4, instance.currentExp, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeInt32(5, instance.expToNextLevel, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeInt32(6, instance.gold1, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeInt32(7, instance.gold2, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeInt32(8, instance.gold3, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeInt32(9, instance.paymentCount, false);
            }

            if((instance.__bitField0 & 512) == 512) {
                output.writeInt32(10, instance.freeBestDaily, false);
            }

            if((instance.__bitField0 & 1024) == 1024) {
                output.writeInt32(11, instance.freeBestWeekly, false);
            }

            if((instance.__bitField0 & 2048) == 2048) {
                output.writeInt32(12, instance.freeBestScore, false);
            }

            if((instance.__bitField0 & 4096) == 4096) {
                output.writeInt32(13, instance.betBestDaily, false);
            }

            if((instance.__bitField0 & 8192) == 8192) {
                output.writeInt32(14, instance.betBestWeekly, false);
            }

            if((instance.__bitField0 & 16384) == 16384) {
                output.writeInt32(15, instance.betBestScore, false);
            }

            if((instance.__bitField0 & 32768) == 32768) {
                output.writeInt32(16, instance.charmPointDaily, false);
            }

            if((instance.__bitField0 & 65536) == 65536) {
                output.writeInt32(17, instance.charmPointWeekly, false);
            }

            if((instance.__bitField0 & 131072) == 131072) {
                output.writeInt32(18, instance.charmPointScore, false);
            }

            if((instance.__bitField0 & 262144) == 262144) {
                output.writeInt32(19, instance.ticketCount, false);
            }

            if((instance.__bitField0 & 524288) == 524288) {
                output.writeInt32(20, instance.currentTicketAccumulation, false);
            }

            if((instance.__bitField0 & 1048576) == 1048576) {
                output.writeInt32(21, instance.maxTicketAccumulation, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "userID";
        		case 2: return "userName";
        		case 3: return "currentLevel";
        		case 4: return "currentExp";
        		case 5: return "expToNextLevel";
        		case 6: return "gold1";
        		case 7: return "gold2";
        		case 8: return "gold3";
        		case 9: return "paymentCount";
        		case 10: return "freeBestDaily";
        		case 11: return "freeBestWeekly";
        		case 12: return "freeBestScore";
        		case 13: return "betBestDaily";
        		case 14: return "betBestWeekly";
        		case 15: return "betBestScore";
        		case 16: return "charmPointDaily";
        		case 17: return "charmPointWeekly";
        		case 18: return "charmPointScore";
        		case 19: return "ticketCount";
        		case 20: return "currentTicketAccumulation";
        		case 21: return "maxTicketAccumulation";
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

        private String userName;

        private int currentLevel;

        private int currentExp;

        private int expToNextLevel;

        private int gold1;

        private int gold2;

        private int gold3;

        private int paymentCount;

        private int freeBestDaily;

        private int freeBestWeekly;

        private int freeBestScore;

        private int betBestDaily;

        private int betBestWeekly;

        private int betBestScore;

        private int charmPointDaily;

        private int charmPointWeekly;

        private int charmPointScore;

        private int ticketCount;

        private int currentTicketAccumulation;

        private int maxTicketAccumulation;

        private int __bitField0;

        private Builder() {
            this.userID = "";
            this.userName = "";
            this.currentLevel = 0;
            this.currentExp = 0;
            this.expToNextLevel = 0;
            this.gold1 = 0;
            this.gold2 = 0;
            this.gold3 = 0;
            this.paymentCount = 0;
            this.freeBestDaily = 0;
            this.freeBestWeekly = 0;
            this.freeBestScore = 0;
            this.betBestDaily = 0;
            this.betBestWeekly = 0;
            this.betBestScore = 0;
            this.charmPointDaily = 0;
            this.charmPointWeekly = 0;
            this.charmPointScore = 0;
            this.ticketCount = 0;
            this.currentTicketAccumulation = 0;
            this.maxTicketAccumulation = 0;
        }

        public Builder mergeFrom(GetUserProfileResponse instance) {
            if (instance.hasUserID()) {
                this.setUserID(instance.getUserID());
            }

            if (instance.hasUserName()) {
                this.setUserName(instance.getUserName());
            }

            if (instance.hasCurrentLevel()) {
                this.setCurrentLevel(instance.getCurrentLevel());
            }

            if (instance.hasCurrentExp()) {
                this.setCurrentExp(instance.getCurrentExp());
            }

            if (instance.hasExpToNextLevel()) {
                this.setExpToNextLevel(instance.getExpToNextLevel());
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

            if (instance.hasPaymentCount()) {
                this.setPaymentCount(instance.getPaymentCount());
            }

            if (instance.hasFreeBestDaily()) {
                this.setFreeBestDaily(instance.getFreeBestDaily());
            }

            if (instance.hasFreeBestWeekly()) {
                this.setFreeBestWeekly(instance.getFreeBestWeekly());
            }

            if (instance.hasFreeBestScore()) {
                this.setFreeBestScore(instance.getFreeBestScore());
            }

            if (instance.hasBetBestDaily()) {
                this.setBetBestDaily(instance.getBetBestDaily());
            }

            if (instance.hasBetBestWeekly()) {
                this.setBetBestWeekly(instance.getBetBestWeekly());
            }

            if (instance.hasBetBestScore()) {
                this.setBetBestScore(instance.getBetBestScore());
            }

            if (instance.hasCharmPointDaily()) {
                this.setCharmPointDaily(instance.getCharmPointDaily());
            }

            if (instance.hasCharmPointWeekly()) {
                this.setCharmPointWeekly(instance.getCharmPointWeekly());
            }

            if (instance.hasCharmPointScore()) {
                this.setCharmPointScore(instance.getCharmPointScore());
            }

            if (instance.hasTicketCount()) {
                this.setTicketCount(instance.getTicketCount());
            }

            if (instance.hasCurrentTicketAccumulation()) {
                this.setCurrentTicketAccumulation(instance.getCurrentTicketAccumulation());
            }

            if (instance.hasMaxTicketAccumulation()) {
                this.setMaxTicketAccumulation(instance.getMaxTicketAccumulation());
            }

            return this;
        }

        public String getUserID() {
            return userID;
        }

        public Builder setUserID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GetUserProfileResponse#userID to null");
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

        public String getUserName() {
            return userName;
        }

        public Builder setUserName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set GetUserProfileResponse#userName to null");
            }

            this.userName = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearUserName() {
            this.userName = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasUserName() {
            return (__bitField0 & 2) == 2;
        }

        public int getCurrentLevel() {
            return currentLevel;
        }

        public Builder setCurrentLevel(int value) {
            this.currentLevel = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearCurrentLevel() {
            this.currentLevel = 0;
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasCurrentLevel() {
            return (__bitField0 & 4) == 4;
        }

        public int getCurrentExp() {
            return currentExp;
        }

        public Builder setCurrentExp(int value) {
            this.currentExp = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearCurrentExp() {
            this.currentExp = 0;
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasCurrentExp() {
            return (__bitField0 & 8) == 8;
        }

        public int getExpToNextLevel() {
            return expToNextLevel;
        }

        public Builder setExpToNextLevel(int value) {
            this.expToNextLevel = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearExpToNextLevel() {
            this.expToNextLevel = 0;
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasExpToNextLevel() {
            return (__bitField0 & 16) == 16;
        }

        public int getGold1() {
            return gold1;
        }

        public Builder setGold1(int value) {
            this.gold1 = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearGold1() {
            this.gold1 = 0;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasGold1() {
            return (__bitField0 & 32) == 32;
        }

        public int getGold2() {
            return gold2;
        }

        public Builder setGold2(int value) {
            this.gold2 = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearGold2() {
            this.gold2 = 0;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasGold2() {
            return (__bitField0 & 64) == 64;
        }

        public int getGold3() {
            return gold3;
        }

        public Builder setGold3(int value) {
            this.gold3 = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearGold3() {
            this.gold3 = 0;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasGold3() {
            return (__bitField0 & 128) == 128;
        }

        public int getPaymentCount() {
            return paymentCount;
        }

        public Builder setPaymentCount(int value) {
            this.paymentCount = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearPaymentCount() {
            this.paymentCount = 0;
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasPaymentCount() {
            return (__bitField0 & 256) == 256;
        }

        public int getFreeBestDaily() {
            return freeBestDaily;
        }

        public Builder setFreeBestDaily(int value) {
            this.freeBestDaily = value;
            __bitField0 |= 512;
            return this;
        }

        public Builder clearFreeBestDaily() {
            this.freeBestDaily = 0;
            __bitField0 &= ~512;
            return this;
        }

        public boolean hasFreeBestDaily() {
            return (__bitField0 & 512) == 512;
        }

        public int getFreeBestWeekly() {
            return freeBestWeekly;
        }

        public Builder setFreeBestWeekly(int value) {
            this.freeBestWeekly = value;
            __bitField0 |= 1024;
            return this;
        }

        public Builder clearFreeBestWeekly() {
            this.freeBestWeekly = 0;
            __bitField0 &= ~1024;
            return this;
        }

        public boolean hasFreeBestWeekly() {
            return (__bitField0 & 1024) == 1024;
        }

        public int getFreeBestScore() {
            return freeBestScore;
        }

        public Builder setFreeBestScore(int value) {
            this.freeBestScore = value;
            __bitField0 |= 2048;
            return this;
        }

        public Builder clearFreeBestScore() {
            this.freeBestScore = 0;
            __bitField0 &= ~2048;
            return this;
        }

        public boolean hasFreeBestScore() {
            return (__bitField0 & 2048) == 2048;
        }

        public int getBetBestDaily() {
            return betBestDaily;
        }

        public Builder setBetBestDaily(int value) {
            this.betBestDaily = value;
            __bitField0 |= 4096;
            return this;
        }

        public Builder clearBetBestDaily() {
            this.betBestDaily = 0;
            __bitField0 &= ~4096;
            return this;
        }

        public boolean hasBetBestDaily() {
            return (__bitField0 & 4096) == 4096;
        }

        public int getBetBestWeekly() {
            return betBestWeekly;
        }

        public Builder setBetBestWeekly(int value) {
            this.betBestWeekly = value;
            __bitField0 |= 8192;
            return this;
        }

        public Builder clearBetBestWeekly() {
            this.betBestWeekly = 0;
            __bitField0 &= ~8192;
            return this;
        }

        public boolean hasBetBestWeekly() {
            return (__bitField0 & 8192) == 8192;
        }

        public int getBetBestScore() {
            return betBestScore;
        }

        public Builder setBetBestScore(int value) {
            this.betBestScore = value;
            __bitField0 |= 16384;
            return this;
        }

        public Builder clearBetBestScore() {
            this.betBestScore = 0;
            __bitField0 &= ~16384;
            return this;
        }

        public boolean hasBetBestScore() {
            return (__bitField0 & 16384) == 16384;
        }

        public int getCharmPointDaily() {
            return charmPointDaily;
        }

        public Builder setCharmPointDaily(int value) {
            this.charmPointDaily = value;
            __bitField0 |= 32768;
            return this;
        }

        public Builder clearCharmPointDaily() {
            this.charmPointDaily = 0;
            __bitField0 &= ~32768;
            return this;
        }

        public boolean hasCharmPointDaily() {
            return (__bitField0 & 32768) == 32768;
        }

        public int getCharmPointWeekly() {
            return charmPointWeekly;
        }

        public Builder setCharmPointWeekly(int value) {
            this.charmPointWeekly = value;
            __bitField0 |= 65536;
            return this;
        }

        public Builder clearCharmPointWeekly() {
            this.charmPointWeekly = 0;
            __bitField0 &= ~65536;
            return this;
        }

        public boolean hasCharmPointWeekly() {
            return (__bitField0 & 65536) == 65536;
        }

        public int getCharmPointScore() {
            return charmPointScore;
        }

        public Builder setCharmPointScore(int value) {
            this.charmPointScore = value;
            __bitField0 |= 131072;
            return this;
        }

        public Builder clearCharmPointScore() {
            this.charmPointScore = 0;
            __bitField0 &= ~131072;
            return this;
        }

        public boolean hasCharmPointScore() {
            return (__bitField0 & 131072) == 131072;
        }

        public int getTicketCount() {
            return ticketCount;
        }

        public Builder setTicketCount(int value) {
            this.ticketCount = value;
            __bitField0 |= 262144;
            return this;
        }

        public Builder clearTicketCount() {
            this.ticketCount = 0;
            __bitField0 &= ~262144;
            return this;
        }

        public boolean hasTicketCount() {
            return (__bitField0 & 262144) == 262144;
        }

        public int getCurrentTicketAccumulation() {
            return currentTicketAccumulation;
        }

        public Builder setCurrentTicketAccumulation(int value) {
            this.currentTicketAccumulation = value;
            __bitField0 |= 524288;
            return this;
        }

        public Builder clearCurrentTicketAccumulation() {
            this.currentTicketAccumulation = 0;
            __bitField0 &= ~524288;
            return this;
        }

        public boolean hasCurrentTicketAccumulation() {
            return (__bitField0 & 524288) == 524288;
        }

        public int getMaxTicketAccumulation() {
            return maxTicketAccumulation;
        }

        public Builder setMaxTicketAccumulation(int value) {
            this.maxTicketAccumulation = value;
            __bitField0 |= 1048576;
            return this;
        }

        public Builder clearMaxTicketAccumulation() {
            this.maxTicketAccumulation = 0;
            __bitField0 &= ~1048576;
            return this;
        }

        public boolean hasMaxTicketAccumulation() {
            return (__bitField0 & 1048576) == 1048576;
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
            if (!java.util.Objects.equals(this.userName, that.userName)) {
                return false;
            }
            if (!java.util.Objects.equals(this.currentLevel, that.currentLevel)) {
                return false;
            }
            if (!java.util.Objects.equals(this.currentExp, that.currentExp)) {
                return false;
            }
            if (!java.util.Objects.equals(this.expToNextLevel, that.expToNextLevel)) {
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
            if (!java.util.Objects.equals(this.paymentCount, that.paymentCount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.freeBestDaily, that.freeBestDaily)) {
                return false;
            }
            if (!java.util.Objects.equals(this.freeBestWeekly, that.freeBestWeekly)) {
                return false;
            }
            if (!java.util.Objects.equals(this.freeBestScore, that.freeBestScore)) {
                return false;
            }
            if (!java.util.Objects.equals(this.betBestDaily, that.betBestDaily)) {
                return false;
            }
            if (!java.util.Objects.equals(this.betBestWeekly, that.betBestWeekly)) {
                return false;
            }
            if (!java.util.Objects.equals(this.betBestScore, that.betBestScore)) {
                return false;
            }
            if (!java.util.Objects.equals(this.charmPointDaily, that.charmPointDaily)) {
                return false;
            }
            if (!java.util.Objects.equals(this.charmPointWeekly, that.charmPointWeekly)) {
                return false;
            }
            if (!java.util.Objects.equals(this.charmPointScore, that.charmPointScore)) {
                return false;
            }
            if (!java.util.Objects.equals(this.ticketCount, that.ticketCount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.currentTicketAccumulation, that.currentTicketAccumulation)) {
                return false;
            }
            if (!java.util.Objects.equals(this.maxTicketAccumulation, that.maxTicketAccumulation)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
            result = 31 * result + (this.userName == null ? 0 : this.userName.hashCode());
            result = 31 * result + Integer.hashCode(this.currentLevel);
            result = 31 * result + Integer.hashCode(this.currentExp);
            result = 31 * result + Integer.hashCode(this.expToNextLevel);
            result = 31 * result + Integer.hashCode(this.gold1);
            result = 31 * result + Integer.hashCode(this.gold2);
            result = 31 * result + Integer.hashCode(this.gold3);
            result = 31 * result + Integer.hashCode(this.paymentCount);
            result = 31 * result + Integer.hashCode(this.freeBestDaily);
            result = 31 * result + Integer.hashCode(this.freeBestWeekly);
            result = 31 * result + Integer.hashCode(this.freeBestScore);
            result = 31 * result + Integer.hashCode(this.betBestDaily);
            result = 31 * result + Integer.hashCode(this.betBestWeekly);
            result = 31 * result + Integer.hashCode(this.betBestScore);
            result = 31 * result + Integer.hashCode(this.charmPointDaily);
            result = 31 * result + Integer.hashCode(this.charmPointWeekly);
            result = 31 * result + Integer.hashCode(this.charmPointScore);
            result = 31 * result + Integer.hashCode(this.ticketCount);
            result = 31 * result + Integer.hashCode(this.currentTicketAccumulation);
            result = 31 * result + Integer.hashCode(this.maxTicketAccumulation);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasUserID()) {
                parts.add("userID=" + getUserID());
            }
            if (hasUserName()) {
                parts.add("userName=" + getUserName());
            }
            if (hasCurrentLevel()) {
                parts.add("currentLevel=" + getCurrentLevel());
            }
            if (hasCurrentExp()) {
                parts.add("currentExp=" + getCurrentExp());
            }
            if (hasExpToNextLevel()) {
                parts.add("expToNextLevel=" + getExpToNextLevel());
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
            if (hasPaymentCount()) {
                parts.add("paymentCount=" + getPaymentCount());
            }
            if (hasFreeBestDaily()) {
                parts.add("freeBestDaily=" + getFreeBestDaily());
            }
            if (hasFreeBestWeekly()) {
                parts.add("freeBestWeekly=" + getFreeBestWeekly());
            }
            if (hasFreeBestScore()) {
                parts.add("freeBestScore=" + getFreeBestScore());
            }
            if (hasBetBestDaily()) {
                parts.add("betBestDaily=" + getBetBestDaily());
            }
            if (hasBetBestWeekly()) {
                parts.add("betBestWeekly=" + getBetBestWeekly());
            }
            if (hasBetBestScore()) {
                parts.add("betBestScore=" + getBetBestScore());
            }
            if (hasCharmPointDaily()) {
                parts.add("charmPointDaily=" + getCharmPointDaily());
            }
            if (hasCharmPointWeekly()) {
                parts.add("charmPointWeekly=" + getCharmPointWeekly());
            }
            if (hasCharmPointScore()) {
                parts.add("charmPointScore=" + getCharmPointScore());
            }
            if (hasTicketCount()) {
                parts.add("ticketCount=" + getTicketCount());
            }
            if (hasCurrentTicketAccumulation()) {
                parts.add("currentTicketAccumulation=" + getCurrentTicketAccumulation());
            }
            if (hasMaxTicketAccumulation()) {
                parts.add("maxTicketAccumulation=" + getMaxTicketAccumulation());
            }
            return "GetUserProfileResponse{" + String.join(", ", parts) + "}";
        }

        public GetUserProfileResponse build() {
            proto.message.GetUserProfileResponse result = new proto.message.GetUserProfileResponse();
            result.__bitField0 = __bitField0;
            result.userID = this.userID;
            result.userName = this.userName;
            result.currentLevel = this.currentLevel;
            result.currentExp = this.currentExp;
            result.expToNextLevel = this.expToNextLevel;
            result.gold1 = this.gold1;
            result.gold2 = this.gold2;
            result.gold3 = this.gold3;
            result.paymentCount = this.paymentCount;
            result.freeBestDaily = this.freeBestDaily;
            result.freeBestWeekly = this.freeBestWeekly;
            result.freeBestScore = this.freeBestScore;
            result.betBestDaily = this.betBestDaily;
            result.betBestWeekly = this.betBestWeekly;
            result.betBestScore = this.betBestScore;
            result.charmPointDaily = this.charmPointDaily;
            result.charmPointWeekly = this.charmPointWeekly;
            result.charmPointScore = this.charmPointScore;
            result.ticketCount = this.ticketCount;
            result.currentTicketAccumulation = this.currentTicketAccumulation;
            result.maxTicketAccumulation = this.maxTicketAccumulation;
            return result;
        }

    }



}