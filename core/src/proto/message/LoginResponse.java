package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public final class LoginResponse
        implements io.protostuff.Message<LoginResponse> {

    private static final LoginResponse DEFAULT_INSTANCE = newBuilder().build();

    private int result;

    private String content;

    private String userID;

    private String password;

    private String userName;

    private java.util.List<proto.message.LoginResponse.LoginGift> loginGift;

    private int serverTime;

    private boolean paymentChannelOpen;

    private String csEmail;

    private String csPhone;

    private String csWeb;

    private String fbAvatar;

    private int banTo;

    private String banReason;

    private int flag;

    private String notifyMsg;

    private String androidUrl;

    private String iosUrl;

    private String wpUrl;

    private int clientVersion;

    private java.util.List<String> gameHints;

    private int paymentCount;

    private String facebookID;

    private String zaloID;

    private boolean betModeOpen;

    private java.util.List<proto.message.GameFuncResponse> gameFuncs;

    private int betModeMin;

    private boolean isNewRegister;

    private int betModeRoomStep;

    private int snsAuthenRewardAmount;

    private int snsAuthenRewardType;

    private int friendFreeGiftSendAmount;

    private int friendFreeGiftReceiveAmount;

    private int friendAddGiftAmount;

    private java.util.List<Integer> gunBullets;

    private String snsServerToken;

    private java.util.List<proto.message.IngameItem> ingameItems;

    private int ingameRoseId;

    private int ingameRoseTime;

    private int ingameRoseMax;

    private int ingameSoloSendCoolDown;

    private int ingameSoloReceiveCoolDown;

    private String ingameNews;

    private int minSoloMoney;

    private int firstGunChange;

    private int paymentEventNewCount;

    private java.util.List<String> betModeTypes;

    private int dailySupportCnt;

    private int maxPearlAvailable;

    private java.util.List<proto.message.InventoryItem> inventoryItems;

    private int ticketBuffCnt;

    private int bradcastMsgInterval;

    private int defaultPaymentSheet;

    private boolean happyPlayChannelOpen;

    private int happyPlayCount;

    private int happyPlayEventNewCount;

    private int defaultHappyPlaySheet;

    private int bucketGame;

    private int bucketMoney;

    private int maxAdsViewPerDay;

    private int currentAdsViewPerDay;

    private int timeZoneOffset;

    private java.util.List<proto.message.ShareData> shareData;

    private java.util.List<String> newsImageLinks;

    private String onelink;

    private boolean __merge_lock = false;
    private int __bitField0;
    private int __bitField1;
    private int __bitField2;

    private LoginResponse() {
        this.result = proto.message.SystemResultCode.LOGIN_SUCCESS.getNumber();
        this.content = "";
        this.userID = "";
        this.password = "";
        this.userName = "";
        this.loginGift = java.util.Collections.emptyList();
        this.serverTime = 0;
        this.paymentChannelOpen = false;
        this.csEmail = "";
        this.csPhone = "";
        this.csWeb = "";
        this.fbAvatar = "";
        this.banTo = 0;
        this.banReason = "";
        this.flag = 0;
        this.notifyMsg = "";
        this.androidUrl = "";
        this.iosUrl = "";
        this.wpUrl = "";
        this.clientVersion = 0;
        this.gameHints = java.util.Collections.emptyList();
        this.paymentCount = 0;
        this.facebookID = "";
        this.zaloID = "";
        this.betModeOpen = false;
        this.gameFuncs = java.util.Collections.emptyList();
        this.betModeMin = 0;
        this.isNewRegister = false;
        this.betModeRoomStep = 0;
        this.snsAuthenRewardAmount = 0;
        this.snsAuthenRewardType = 0;
        this.friendFreeGiftSendAmount = 0;
        this.friendFreeGiftReceiveAmount = 0;
        this.friendAddGiftAmount = 0;
        this.gunBullets = java.util.Collections.emptyList();
        this.snsServerToken = "";
        this.ingameItems = java.util.Collections.emptyList();
        this.ingameRoseId = 0;
        this.ingameRoseTime = 0;
        this.ingameRoseMax = 0;
        this.ingameSoloSendCoolDown = 0;
        this.ingameSoloReceiveCoolDown = 0;
        this.ingameNews = "";
        this.minSoloMoney = 0;
        this.firstGunChange = 0;
        this.paymentEventNewCount = 0;
        this.betModeTypes = java.util.Collections.emptyList();
        this.dailySupportCnt = 0;
        this.maxPearlAvailable = 0;
        this.inventoryItems = java.util.Collections.emptyList();
        this.ticketBuffCnt = 0;
        this.bradcastMsgInterval = 0;
        this.defaultPaymentSheet = 0;
        this.happyPlayChannelOpen = false;
        this.happyPlayCount = 0;
        this.happyPlayEventNewCount = 0;
        this.defaultHappyPlaySheet = 0;
        this.bucketGame = 0;
        this.bucketMoney = 0;
        this.maxAdsViewPerDay = 0;
        this.currentAdsViewPerDay = 0;
        this.timeZoneOffset = 0;
        this.shareData = java.util.Collections.emptyList();
        this.newsImageLinks = java.util.Collections.emptyList();
        this.onelink = "";
    }

    private LoginResponse(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static LoginResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<LoginResponse> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public proto.message.SystemResultCode getResult() {
        return proto.message.SystemResultCode.valueOf(result);
    }

    public int getResultValue() {
        return result;
    }

    public boolean hasResult() {
        return (__bitField0 & 1) == 1;
    }

    public LoginResponse withResult(proto.message.SystemResultCode value) {
        return LoginResponse.newBuilder()
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

    public LoginResponse withContent(String value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setContent(value)
            .build();
    }

    public String getUserID() {
        return userID;
    }

    public boolean hasUserID() {
        return (__bitField0 & 4) == 4;
    }

    public LoginResponse withUserID(String value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setUserID(value)
            .build();
    }

    public String getPassword() {
        return password;
    }

    public boolean hasPassword() {
        return (__bitField0 & 8) == 8;
    }

    public LoginResponse withPassword(String value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setPassword(value)
            .build();
    }

    public String getUserName() {
        return userName;
    }

    public boolean hasUserName() {
        return (__bitField0 & 16) == 16;
    }

    public LoginResponse withUserName(String value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setUserName(value)
            .build();
    }

    public java.util.List<proto.message.LoginResponse.LoginGift> getLoginGiftList() {
        return loginGift;
    }

    public int getLoginGiftCount() {
        return loginGift.size();
    }

    public proto.message.LoginResponse.LoginGift getLoginGift(int index) {
        return loginGift.get(index);
    }

    public LoginResponse withLoginGift(java.util.List<proto.message.LoginResponse.LoginGift> value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .clearLoginGift()
            .addAllLoginGift(value)
            .build();
    }

    public int getServerTime() {
        return serverTime;
    }

    public boolean hasServerTime() {
        return (__bitField0 & 64) == 64;
    }

    public LoginResponse withServerTime(int value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setServerTime(value)
            .build();
    }

    public boolean getPaymentChannelOpen() {
        return paymentChannelOpen;
    }

    public boolean hasPaymentChannelOpen() {
        return (__bitField0 & 128) == 128;
    }

    public LoginResponse withPaymentChannelOpen(boolean value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setPaymentChannelOpen(value)
            .build();
    }

    public String getCsEmail() {
        return csEmail;
    }

    public boolean hasCsEmail() {
        return (__bitField0 & 256) == 256;
    }

    public LoginResponse withCsEmail(String value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setCsEmail(value)
            .build();
    }

    public String getCsPhone() {
        return csPhone;
    }

    public boolean hasCsPhone() {
        return (__bitField0 & 512) == 512;
    }

    public LoginResponse withCsPhone(String value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setCsPhone(value)
            .build();
    }

    public String getCsWeb() {
        return csWeb;
    }

    public boolean hasCsWeb() {
        return (__bitField0 & 1024) == 1024;
    }

    public LoginResponse withCsWeb(String value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setCsWeb(value)
            .build();
    }

    public String getFbAvatar() {
        return fbAvatar;
    }

    public boolean hasFbAvatar() {
        return (__bitField0 & 2048) == 2048;
    }

    public LoginResponse withFbAvatar(String value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setFbAvatar(value)
            .build();
    }

    public int getBanTo() {
        return banTo;
    }

    public boolean hasBanTo() {
        return (__bitField0 & 4096) == 4096;
    }

    public LoginResponse withBanTo(int value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setBanTo(value)
            .build();
    }

    public String getBanReason() {
        return banReason;
    }

    public boolean hasBanReason() {
        return (__bitField0 & 8192) == 8192;
    }

    public LoginResponse withBanReason(String value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setBanReason(value)
            .build();
    }

    public int getFlag() {
        return flag;
    }

    public boolean hasFlag() {
        return (__bitField0 & 16384) == 16384;
    }

    public LoginResponse withFlag(int value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setFlag(value)
            .build();
    }

    public String getNotifyMsg() {
        return notifyMsg;
    }

    public boolean hasNotifyMsg() {
        return (__bitField0 & 32768) == 32768;
    }

    public LoginResponse withNotifyMsg(String value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setNotifyMsg(value)
            .build();
    }

    public String getAndroidUrl() {
        return androidUrl;
    }

    public boolean hasAndroidUrl() {
        return (__bitField0 & 65536) == 65536;
    }

    public LoginResponse withAndroidUrl(String value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setAndroidUrl(value)
            .build();
    }

    public String getIosUrl() {
        return iosUrl;
    }

    public boolean hasIosUrl() {
        return (__bitField0 & 131072) == 131072;
    }

    public LoginResponse withIosUrl(String value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setIosUrl(value)
            .build();
    }

    public String getWpUrl() {
        return wpUrl;
    }

    public boolean hasWpUrl() {
        return (__bitField0 & 262144) == 262144;
    }

    public LoginResponse withWpUrl(String value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setWpUrl(value)
            .build();
    }

    public int getClientVersion() {
        return clientVersion;
    }

    public boolean hasClientVersion() {
        return (__bitField0 & 524288) == 524288;
    }

    public LoginResponse withClientVersion(int value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setClientVersion(value)
            .build();
    }

    public java.util.List<String> getGameHintsList() {
        return gameHints;
    }

    public int getGameHintsCount() {
        return gameHints.size();
    }

    public String getGameHints(int index) {
        return gameHints.get(index);
    }

    public LoginResponse withGameHints(java.util.List<String> value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .clearGameHints()
            .addAllGameHints(value)
            .build();
    }

    public int getPaymentCount() {
        return paymentCount;
    }

    public boolean hasPaymentCount() {
        return (__bitField0 & 2097152) == 2097152;
    }

    public LoginResponse withPaymentCount(int value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setPaymentCount(value)
            .build();
    }

    public String getFacebookID() {
        return facebookID;
    }

    public boolean hasFacebookID() {
        return (__bitField0 & 4194304) == 4194304;
    }

    public LoginResponse withFacebookID(String value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setFacebookID(value)
            .build();
    }

    public String getZaloID() {
        return zaloID;
    }

    public boolean hasZaloID() {
        return (__bitField0 & 8388608) == 8388608;
    }

    public LoginResponse withZaloID(String value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setZaloID(value)
            .build();
    }

    public boolean getBetModeOpen() {
        return betModeOpen;
    }

    public boolean hasBetModeOpen() {
        return (__bitField0 & 16777216) == 16777216;
    }

    public LoginResponse withBetModeOpen(boolean value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setBetModeOpen(value)
            .build();
    }

    public java.util.List<proto.message.GameFuncResponse> getGameFuncsList() {
        return gameFuncs;
    }

    public int getGameFuncsCount() {
        return gameFuncs.size();
    }

    public proto.message.GameFuncResponse getGameFuncs(int index) {
        return gameFuncs.get(index);
    }

    public LoginResponse withGameFuncs(java.util.List<proto.message.GameFuncResponse> value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .clearGameFuncs()
            .addAllGameFuncs(value)
            .build();
    }

    public int getBetModeMin() {
        return betModeMin;
    }

    public boolean hasBetModeMin() {
        return (__bitField0 & 67108864) == 67108864;
    }

    public LoginResponse withBetModeMin(int value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setBetModeMin(value)
            .build();
    }

    public boolean getIsNewRegister() {
        return isNewRegister;
    }

    public boolean hasIsNewRegister() {
        return (__bitField0 & 134217728) == 134217728;
    }

    public LoginResponse withIsNewRegister(boolean value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setIsNewRegister(value)
            .build();
    }

    public int getBetModeRoomStep() {
        return betModeRoomStep;
    }

    public boolean hasBetModeRoomStep() {
        return (__bitField0 & 268435456) == 268435456;
    }

    public LoginResponse withBetModeRoomStep(int value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setBetModeRoomStep(value)
            .build();
    }

    public int getSnsAuthenRewardAmount() {
        return snsAuthenRewardAmount;
    }

    public boolean hasSnsAuthenRewardAmount() {
        return (__bitField0 & 536870912) == 536870912;
    }

    public LoginResponse withSnsAuthenRewardAmount(int value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setSnsAuthenRewardAmount(value)
            .build();
    }

    public int getSnsAuthenRewardType() {
        return snsAuthenRewardType;
    }

    public boolean hasSnsAuthenRewardType() {
        return (__bitField0 & 1073741824) == 1073741824;
    }

    public LoginResponse withSnsAuthenRewardType(int value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setSnsAuthenRewardType(value)
            .build();
    }

    public int getFriendFreeGiftSendAmount() {
        return friendFreeGiftSendAmount;
    }

    public boolean hasFriendFreeGiftSendAmount() {
        return (__bitField0 & -2147483648) == -2147483648;
    }

    public LoginResponse withFriendFreeGiftSendAmount(int value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setFriendFreeGiftSendAmount(value)
            .build();
    }

    public int getFriendFreeGiftReceiveAmount() {
        return friendFreeGiftReceiveAmount;
    }

    public boolean hasFriendFreeGiftReceiveAmount() {
        return (__bitField1 & 1) == 1;
    }

    public LoginResponse withFriendFreeGiftReceiveAmount(int value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setFriendFreeGiftReceiveAmount(value)
            .build();
    }

    public int getFriendAddGiftAmount() {
        return friendAddGiftAmount;
    }

    public boolean hasFriendAddGiftAmount() {
        return (__bitField1 & 2) == 2;
    }

    public LoginResponse withFriendAddGiftAmount(int value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setFriendAddGiftAmount(value)
            .build();
    }

    public java.util.List<Integer> getGunBulletsList() {
        return gunBullets;
    }

    public int getGunBulletsCount() {
        return gunBullets.size();
    }

    public int getGunBullets(int index) {
        return gunBullets.get(index);
    }

    public LoginResponse withGunBullets(java.util.List<Integer> value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .clearGunBullets()
            .addAllGunBullets(value)
            .build();
    }

    public String getSnsServerToken() {
        return snsServerToken;
    }

    public boolean hasSnsServerToken() {
        return (__bitField1 & 8) == 8;
    }

    public LoginResponse withSnsServerToken(String value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setSnsServerToken(value)
            .build();
    }

    public java.util.List<proto.message.IngameItem> getIngameItemsList() {
        return ingameItems;
    }

    public int getIngameItemsCount() {
        return ingameItems.size();
    }

    public proto.message.IngameItem getIngameItems(int index) {
        return ingameItems.get(index);
    }

    public LoginResponse withIngameItems(java.util.List<proto.message.IngameItem> value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .clearIngameItems()
            .addAllIngameItems(value)
            .build();
    }

    public int getIngameRoseId() {
        return ingameRoseId;
    }

    public boolean hasIngameRoseId() {
        return (__bitField1 & 32) == 32;
    }

    public LoginResponse withIngameRoseId(int value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setIngameRoseId(value)
            .build();
    }

    public int getIngameRoseTime() {
        return ingameRoseTime;
    }

    public boolean hasIngameRoseTime() {
        return (__bitField1 & 64) == 64;
    }

    public LoginResponse withIngameRoseTime(int value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setIngameRoseTime(value)
            .build();
    }

    public int getIngameRoseMax() {
        return ingameRoseMax;
    }

    public boolean hasIngameRoseMax() {
        return (__bitField1 & 128) == 128;
    }

    public LoginResponse withIngameRoseMax(int value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setIngameRoseMax(value)
            .build();
    }

    public int getIngameSoloSendCoolDown() {
        return ingameSoloSendCoolDown;
    }

    public boolean hasIngameSoloSendCoolDown() {
        return (__bitField1 & 256) == 256;
    }

    public LoginResponse withIngameSoloSendCoolDown(int value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setIngameSoloSendCoolDown(value)
            .build();
    }

    public int getIngameSoloReceiveCoolDown() {
        return ingameSoloReceiveCoolDown;
    }

    public boolean hasIngameSoloReceiveCoolDown() {
        return (__bitField1 & 512) == 512;
    }

    public LoginResponse withIngameSoloReceiveCoolDown(int value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setIngameSoloReceiveCoolDown(value)
            .build();
    }

    public String getIngameNews() {
        return ingameNews;
    }

    public boolean hasIngameNews() {
        return (__bitField1 & 1024) == 1024;
    }

    public LoginResponse withIngameNews(String value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setIngameNews(value)
            .build();
    }

    public int getMinSoloMoney() {
        return minSoloMoney;
    }

    public boolean hasMinSoloMoney() {
        return (__bitField1 & 2048) == 2048;
    }

    public LoginResponse withMinSoloMoney(int value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setMinSoloMoney(value)
            .build();
    }

    public int getFirstGunChange() {
        return firstGunChange;
    }

    public boolean hasFirstGunChange() {
        return (__bitField1 & 4096) == 4096;
    }

    public LoginResponse withFirstGunChange(int value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setFirstGunChange(value)
            .build();
    }

    public int getPaymentEventNewCount() {
        return paymentEventNewCount;
    }

    public boolean hasPaymentEventNewCount() {
        return (__bitField1 & 8192) == 8192;
    }

    public LoginResponse withPaymentEventNewCount(int value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setPaymentEventNewCount(value)
            .build();
    }

    public java.util.List<String> getBetModeTypesList() {
        return betModeTypes;
    }

    public int getBetModeTypesCount() {
        return betModeTypes.size();
    }

    public String getBetModeTypes(int index) {
        return betModeTypes.get(index);
    }

    public LoginResponse withBetModeTypes(java.util.List<String> value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .clearBetModeTypes()
            .addAllBetModeTypes(value)
            .build();
    }

    public int getDailySupportCnt() {
        return dailySupportCnt;
    }

    public boolean hasDailySupportCnt() {
        return (__bitField1 & 32768) == 32768;
    }

    public LoginResponse withDailySupportCnt(int value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setDailySupportCnt(value)
            .build();
    }

    public int getMaxPearlAvailable() {
        return maxPearlAvailable;
    }

    public boolean hasMaxPearlAvailable() {
        return (__bitField1 & 65536) == 65536;
    }

    public LoginResponse withMaxPearlAvailable(int value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setMaxPearlAvailable(value)
            .build();
    }

    public java.util.List<proto.message.InventoryItem> getInventoryItemsList() {
        return inventoryItems;
    }

    public int getInventoryItemsCount() {
        return inventoryItems.size();
    }

    public proto.message.InventoryItem getInventoryItems(int index) {
        return inventoryItems.get(index);
    }

    public LoginResponse withInventoryItems(java.util.List<proto.message.InventoryItem> value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .clearInventoryItems()
            .addAllInventoryItems(value)
            .build();
    }

    public int getTicketBuffCnt() {
        return ticketBuffCnt;
    }

    public boolean hasTicketBuffCnt() {
        return (__bitField1 & 262144) == 262144;
    }

    public LoginResponse withTicketBuffCnt(int value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setTicketBuffCnt(value)
            .build();
    }

    public int getBradcastMsgInterval() {
        return bradcastMsgInterval;
    }

    public boolean hasBradcastMsgInterval() {
        return (__bitField1 & 524288) == 524288;
    }

    public LoginResponse withBradcastMsgInterval(int value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setBradcastMsgInterval(value)
            .build();
    }

    public int getDefaultPaymentSheet() {
        return defaultPaymentSheet;
    }

    public boolean hasDefaultPaymentSheet() {
        return (__bitField1 & 1048576) == 1048576;
    }

    public LoginResponse withDefaultPaymentSheet(int value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setDefaultPaymentSheet(value)
            .build();
    }

    public boolean getHappyPlayChannelOpen() {
        return happyPlayChannelOpen;
    }

    public boolean hasHappyPlayChannelOpen() {
        return (__bitField1 & 2097152) == 2097152;
    }

    public LoginResponse withHappyPlayChannelOpen(boolean value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setHappyPlayChannelOpen(value)
            .build();
    }

    public int getHappyPlayCount() {
        return happyPlayCount;
    }

    public boolean hasHappyPlayCount() {
        return (__bitField1 & 4194304) == 4194304;
    }

    public LoginResponse withHappyPlayCount(int value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setHappyPlayCount(value)
            .build();
    }

    public int getHappyPlayEventNewCount() {
        return happyPlayEventNewCount;
    }

    public boolean hasHappyPlayEventNewCount() {
        return (__bitField1 & 8388608) == 8388608;
    }

    public LoginResponse withHappyPlayEventNewCount(int value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setHappyPlayEventNewCount(value)
            .build();
    }

    public int getDefaultHappyPlaySheet() {
        return defaultHappyPlaySheet;
    }

    public boolean hasDefaultHappyPlaySheet() {
        return (__bitField1 & 16777216) == 16777216;
    }

    public LoginResponse withDefaultHappyPlaySheet(int value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setDefaultHappyPlaySheet(value)
            .build();
    }

    public int getBucketGame() {
        return bucketGame;
    }

    public boolean hasBucketGame() {
        return (__bitField1 & 33554432) == 33554432;
    }

    public LoginResponse withBucketGame(int value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setBucketGame(value)
            .build();
    }

    public int getBucketMoney() {
        return bucketMoney;
    }

    public boolean hasBucketMoney() {
        return (__bitField1 & 67108864) == 67108864;
    }

    public LoginResponse withBucketMoney(int value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setBucketMoney(value)
            .build();
    }

    public int getMaxAdsViewPerDay() {
        return maxAdsViewPerDay;
    }

    public boolean hasMaxAdsViewPerDay() {
        return (__bitField1 & 134217728) == 134217728;
    }

    public LoginResponse withMaxAdsViewPerDay(int value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setMaxAdsViewPerDay(value)
            .build();
    }

    public int getCurrentAdsViewPerDay() {
        return currentAdsViewPerDay;
    }

    public boolean hasCurrentAdsViewPerDay() {
        return (__bitField1 & 268435456) == 268435456;
    }

    public LoginResponse withCurrentAdsViewPerDay(int value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setCurrentAdsViewPerDay(value)
            .build();
    }

    public int getTimeZoneOffset() {
        return timeZoneOffset;
    }

    public boolean hasTimeZoneOffset() {
        return (__bitField1 & 536870912) == 536870912;
    }

    public LoginResponse withTimeZoneOffset(int value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setTimeZoneOffset(value)
            .build();
    }

    public java.util.List<proto.message.ShareData> getShareDataList() {
        return shareData;
    }

    public int getShareDataCount() {
        return shareData.size();
    }

    public proto.message.ShareData getShareData(int index) {
        return shareData.get(index);
    }

    public LoginResponse withShareData(java.util.List<proto.message.ShareData> value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .clearShareData()
            .addAllShareData(value)
            .build();
    }

    public java.util.List<String> getNewsImageLinksList() {
        return newsImageLinks;
    }

    public int getNewsImageLinksCount() {
        return newsImageLinks.size();
    }

    public String getNewsImageLinks(int index) {
        return newsImageLinks.get(index);
    }

    public LoginResponse withNewsImageLinks(java.util.List<String> value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .clearNewsImageLinks()
            .addAllNewsImageLinks(value)
            .build();
    }

    public String getOnelink() {
        return onelink;
    }

    public boolean hasOnelink() {
        return (__bitField2 & 1) == 1;
    }

    public LoginResponse withOnelink(String value) {
        return LoginResponse.newBuilder()
            .mergeFrom(this)
            .setOnelink(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<LoginResponse> cachedSchema() {
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
        LoginResponse that = (LoginResponse) obj;
        if (!java.util.Objects.equals(this.result, that.result)) {
            return false;
        }
        if (!java.util.Objects.equals(this.content, that.content)) {
            return false;
        }
        if (!java.util.Objects.equals(this.userID, that.userID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.password, that.password)) {
            return false;
        }
        if (!java.util.Objects.equals(this.userName, that.userName)) {
            return false;
        }
        if (!java.util.Objects.equals(this.loginGift, that.loginGift)) {
            return false;
        }
        if (!java.util.Objects.equals(this.serverTime, that.serverTime)) {
            return false;
        }
        if (!java.util.Objects.equals(this.paymentChannelOpen, that.paymentChannelOpen)) {
            return false;
        }
        if (!java.util.Objects.equals(this.csEmail, that.csEmail)) {
            return false;
        }
        if (!java.util.Objects.equals(this.csPhone, that.csPhone)) {
            return false;
        }
        if (!java.util.Objects.equals(this.csWeb, that.csWeb)) {
            return false;
        }
        if (!java.util.Objects.equals(this.fbAvatar, that.fbAvatar)) {
            return false;
        }
        if (!java.util.Objects.equals(this.banTo, that.banTo)) {
            return false;
        }
        if (!java.util.Objects.equals(this.banReason, that.banReason)) {
            return false;
        }
        if (!java.util.Objects.equals(this.flag, that.flag)) {
            return false;
        }
        if (!java.util.Objects.equals(this.notifyMsg, that.notifyMsg)) {
            return false;
        }
        if (!java.util.Objects.equals(this.androidUrl, that.androidUrl)) {
            return false;
        }
        if (!java.util.Objects.equals(this.iosUrl, that.iosUrl)) {
            return false;
        }
        if (!java.util.Objects.equals(this.wpUrl, that.wpUrl)) {
            return false;
        }
        if (!java.util.Objects.equals(this.clientVersion, that.clientVersion)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gameHints, that.gameHints)) {
            return false;
        }
        if (!java.util.Objects.equals(this.paymentCount, that.paymentCount)) {
            return false;
        }
        if (!java.util.Objects.equals(this.facebookID, that.facebookID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.zaloID, that.zaloID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.betModeOpen, that.betModeOpen)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gameFuncs, that.gameFuncs)) {
            return false;
        }
        if (!java.util.Objects.equals(this.betModeMin, that.betModeMin)) {
            return false;
        }
        if (!java.util.Objects.equals(this.isNewRegister, that.isNewRegister)) {
            return false;
        }
        if (!java.util.Objects.equals(this.betModeRoomStep, that.betModeRoomStep)) {
            return false;
        }
        if (!java.util.Objects.equals(this.snsAuthenRewardAmount, that.snsAuthenRewardAmount)) {
            return false;
        }
        if (!java.util.Objects.equals(this.snsAuthenRewardType, that.snsAuthenRewardType)) {
            return false;
        }
        if (!java.util.Objects.equals(this.friendFreeGiftSendAmount, that.friendFreeGiftSendAmount)) {
            return false;
        }
        if (!java.util.Objects.equals(this.friendFreeGiftReceiveAmount, that.friendFreeGiftReceiveAmount)) {
            return false;
        }
        if (!java.util.Objects.equals(this.friendAddGiftAmount, that.friendAddGiftAmount)) {
            return false;
        }
        if (!java.util.Objects.equals(this.gunBullets, that.gunBullets)) {
            return false;
        }
        if (!java.util.Objects.equals(this.snsServerToken, that.snsServerToken)) {
            return false;
        }
        if (!java.util.Objects.equals(this.ingameItems, that.ingameItems)) {
            return false;
        }
        if (!java.util.Objects.equals(this.ingameRoseId, that.ingameRoseId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.ingameRoseTime, that.ingameRoseTime)) {
            return false;
        }
        if (!java.util.Objects.equals(this.ingameRoseMax, that.ingameRoseMax)) {
            return false;
        }
        if (!java.util.Objects.equals(this.ingameSoloSendCoolDown, that.ingameSoloSendCoolDown)) {
            return false;
        }
        if (!java.util.Objects.equals(this.ingameSoloReceiveCoolDown, that.ingameSoloReceiveCoolDown)) {
            return false;
        }
        if (!java.util.Objects.equals(this.ingameNews, that.ingameNews)) {
            return false;
        }
        if (!java.util.Objects.equals(this.minSoloMoney, that.minSoloMoney)) {
            return false;
        }
        if (!java.util.Objects.equals(this.firstGunChange, that.firstGunChange)) {
            return false;
        }
        if (!java.util.Objects.equals(this.paymentEventNewCount, that.paymentEventNewCount)) {
            return false;
        }
        if (!java.util.Objects.equals(this.betModeTypes, that.betModeTypes)) {
            return false;
        }
        if (!java.util.Objects.equals(this.dailySupportCnt, that.dailySupportCnt)) {
            return false;
        }
        if (!java.util.Objects.equals(this.maxPearlAvailable, that.maxPearlAvailable)) {
            return false;
        }
        if (!java.util.Objects.equals(this.inventoryItems, that.inventoryItems)) {
            return false;
        }
        if (!java.util.Objects.equals(this.ticketBuffCnt, that.ticketBuffCnt)) {
            return false;
        }
        if (!java.util.Objects.equals(this.bradcastMsgInterval, that.bradcastMsgInterval)) {
            return false;
        }
        if (!java.util.Objects.equals(this.defaultPaymentSheet, that.defaultPaymentSheet)) {
            return false;
        }
        if (!java.util.Objects.equals(this.happyPlayChannelOpen, that.happyPlayChannelOpen)) {
            return false;
        }
        if (!java.util.Objects.equals(this.happyPlayCount, that.happyPlayCount)) {
            return false;
        }
        if (!java.util.Objects.equals(this.happyPlayEventNewCount, that.happyPlayEventNewCount)) {
            return false;
        }
        if (!java.util.Objects.equals(this.defaultHappyPlaySheet, that.defaultHappyPlaySheet)) {
            return false;
        }
        if (!java.util.Objects.equals(this.bucketGame, that.bucketGame)) {
            return false;
        }
        if (!java.util.Objects.equals(this.bucketMoney, that.bucketMoney)) {
            return false;
        }
        if (!java.util.Objects.equals(this.maxAdsViewPerDay, that.maxAdsViewPerDay)) {
            return false;
        }
        if (!java.util.Objects.equals(this.currentAdsViewPerDay, that.currentAdsViewPerDay)) {
            return false;
        }
        if (!java.util.Objects.equals(this.timeZoneOffset, that.timeZoneOffset)) {
            return false;
        }
        if (!java.util.Objects.equals(this.shareData, that.shareData)) {
            return false;
        }
        if (!java.util.Objects.equals(this.newsImageLinks, that.newsImageLinks)) {
            return false;
        }
        if (!java.util.Objects.equals(this.onelink, that.onelink)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.result);
        result = 31 * result + (this.content == null ? 0 : this.content.hashCode());
        result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
        result = 31 * result + (this.password == null ? 0 : this.password.hashCode());
        result = 31 * result + (this.userName == null ? 0 : this.userName.hashCode());
        result = 31 * result + (this.loginGift == null ? 0 : this.loginGift.hashCode());
        result = 31 * result + Integer.hashCode(this.serverTime);
        result = 31 * result + Boolean.hashCode(this.paymentChannelOpen);
        result = 31 * result + (this.csEmail == null ? 0 : this.csEmail.hashCode());
        result = 31 * result + (this.csPhone == null ? 0 : this.csPhone.hashCode());
        result = 31 * result + (this.csWeb == null ? 0 : this.csWeb.hashCode());
        result = 31 * result + (this.fbAvatar == null ? 0 : this.fbAvatar.hashCode());
        result = 31 * result + Integer.hashCode(this.banTo);
        result = 31 * result + (this.banReason == null ? 0 : this.banReason.hashCode());
        result = 31 * result + Integer.hashCode(this.flag);
        result = 31 * result + (this.notifyMsg == null ? 0 : this.notifyMsg.hashCode());
        result = 31 * result + (this.androidUrl == null ? 0 : this.androidUrl.hashCode());
        result = 31 * result + (this.iosUrl == null ? 0 : this.iosUrl.hashCode());
        result = 31 * result + (this.wpUrl == null ? 0 : this.wpUrl.hashCode());
        result = 31 * result + Integer.hashCode(this.clientVersion);
        result = 31 * result + (this.gameHints == null ? 0 : this.gameHints.hashCode());
        result = 31 * result + Integer.hashCode(this.paymentCount);
        result = 31 * result + (this.facebookID == null ? 0 : this.facebookID.hashCode());
        result = 31 * result + (this.zaloID == null ? 0 : this.zaloID.hashCode());
        result = 31 * result + Boolean.hashCode(this.betModeOpen);
        result = 31 * result + (this.gameFuncs == null ? 0 : this.gameFuncs.hashCode());
        result = 31 * result + Integer.hashCode(this.betModeMin);
        result = 31 * result + Boolean.hashCode(this.isNewRegister);
        result = 31 * result + Integer.hashCode(this.betModeRoomStep);
        result = 31 * result + Integer.hashCode(this.snsAuthenRewardAmount);
        result = 31 * result + Integer.hashCode(this.snsAuthenRewardType);
        result = 31 * result + Integer.hashCode(this.friendFreeGiftSendAmount);
        result = 31 * result + Integer.hashCode(this.friendFreeGiftReceiveAmount);
        result = 31 * result + Integer.hashCode(this.friendAddGiftAmount);
        result = 31 * result + (this.gunBullets == null ? 0 : this.gunBullets.hashCode());
        result = 31 * result + (this.snsServerToken == null ? 0 : this.snsServerToken.hashCode());
        result = 31 * result + (this.ingameItems == null ? 0 : this.ingameItems.hashCode());
        result = 31 * result + Integer.hashCode(this.ingameRoseId);
        result = 31 * result + Integer.hashCode(this.ingameRoseTime);
        result = 31 * result + Integer.hashCode(this.ingameRoseMax);
        result = 31 * result + Integer.hashCode(this.ingameSoloSendCoolDown);
        result = 31 * result + Integer.hashCode(this.ingameSoloReceiveCoolDown);
        result = 31 * result + (this.ingameNews == null ? 0 : this.ingameNews.hashCode());
        result = 31 * result + Integer.hashCode(this.minSoloMoney);
        result = 31 * result + Integer.hashCode(this.firstGunChange);
        result = 31 * result + Integer.hashCode(this.paymentEventNewCount);
        result = 31 * result + (this.betModeTypes == null ? 0 : this.betModeTypes.hashCode());
        result = 31 * result + Integer.hashCode(this.dailySupportCnt);
        result = 31 * result + Integer.hashCode(this.maxPearlAvailable);
        result = 31 * result + (this.inventoryItems == null ? 0 : this.inventoryItems.hashCode());
        result = 31 * result + Integer.hashCode(this.ticketBuffCnt);
        result = 31 * result + Integer.hashCode(this.bradcastMsgInterval);
        result = 31 * result + Integer.hashCode(this.defaultPaymentSheet);
        result = 31 * result + Boolean.hashCode(this.happyPlayChannelOpen);
        result = 31 * result + Integer.hashCode(this.happyPlayCount);
        result = 31 * result + Integer.hashCode(this.happyPlayEventNewCount);
        result = 31 * result + Integer.hashCode(this.defaultHappyPlaySheet);
        result = 31 * result + Integer.hashCode(this.bucketGame);
        result = 31 * result + Integer.hashCode(this.bucketMoney);
        result = 31 * result + Integer.hashCode(this.maxAdsViewPerDay);
        result = 31 * result + Integer.hashCode(this.currentAdsViewPerDay);
        result = 31 * result + Integer.hashCode(this.timeZoneOffset);
        result = 31 * result + (this.shareData == null ? 0 : this.shareData.hashCode());
        result = 31 * result + (this.newsImageLinks == null ? 0 : this.newsImageLinks.hashCode());
        result = 31 * result + (this.onelink == null ? 0 : this.onelink.hashCode());

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
        if (hasUserID()) {
            parts.add("userID=" + getUserID());
        }
        if (hasPassword()) {
            parts.add("password=" + getPassword());
        }
        if (hasUserName()) {
            parts.add("userName=" + getUserName());
        }
        if (!loginGift.isEmpty()) {
            parts.add("loginGift=" + getLoginGiftList());
        }
        if (hasServerTime()) {
            parts.add("serverTime=" + getServerTime());
        }
        if (hasPaymentChannelOpen()) {
            parts.add("paymentChannelOpen=" + getPaymentChannelOpen());
        }
        if (hasCsEmail()) {
            parts.add("csEmail=" + getCsEmail());
        }
        if (hasCsPhone()) {
            parts.add("csPhone=" + getCsPhone());
        }
        if (hasCsWeb()) {
            parts.add("csWeb=" + getCsWeb());
        }
        if (hasFbAvatar()) {
            parts.add("fbAvatar=" + getFbAvatar());
        }
        if (hasBanTo()) {
            parts.add("banTo=" + getBanTo());
        }
        if (hasBanReason()) {
            parts.add("banReason=" + getBanReason());
        }
        if (hasFlag()) {
            parts.add("flag=" + getFlag());
        }
        if (hasNotifyMsg()) {
            parts.add("notifyMsg=" + getNotifyMsg());
        }
        if (hasAndroidUrl()) {
            parts.add("androidUrl=" + getAndroidUrl());
        }
        if (hasIosUrl()) {
            parts.add("iosUrl=" + getIosUrl());
        }
        if (hasWpUrl()) {
            parts.add("wpUrl=" + getWpUrl());
        }
        if (hasClientVersion()) {
            parts.add("clientVersion=" + getClientVersion());
        }
        if (!gameHints.isEmpty()) {
            parts.add("gameHints=" + getGameHintsList());
        }
        if (hasPaymentCount()) {
            parts.add("paymentCount=" + getPaymentCount());
        }
        if (hasFacebookID()) {
            parts.add("facebookID=" + getFacebookID());
        }
        if (hasZaloID()) {
            parts.add("zaloID=" + getZaloID());
        }
        if (hasBetModeOpen()) {
            parts.add("betModeOpen=" + getBetModeOpen());
        }
        if (!gameFuncs.isEmpty()) {
            parts.add("gameFuncs=" + getGameFuncsList());
        }
        if (hasBetModeMin()) {
            parts.add("betModeMin=" + getBetModeMin());
        }
        if (hasIsNewRegister()) {
            parts.add("isNewRegister=" + getIsNewRegister());
        }
        if (hasBetModeRoomStep()) {
            parts.add("betModeRoomStep=" + getBetModeRoomStep());
        }
        if (hasSnsAuthenRewardAmount()) {
            parts.add("snsAuthenRewardAmount=" + getSnsAuthenRewardAmount());
        }
        if (hasSnsAuthenRewardType()) {
            parts.add("snsAuthenRewardType=" + getSnsAuthenRewardType());
        }
        if (hasFriendFreeGiftSendAmount()) {
            parts.add("friendFreeGiftSendAmount=" + getFriendFreeGiftSendAmount());
        }
        if (hasFriendFreeGiftReceiveAmount()) {
            parts.add("friendFreeGiftReceiveAmount=" + getFriendFreeGiftReceiveAmount());
        }
        if (hasFriendAddGiftAmount()) {
            parts.add("friendAddGiftAmount=" + getFriendAddGiftAmount());
        }
        if (!gunBullets.isEmpty()) {
            parts.add("gunBullets=" + getGunBulletsList());
        }
        if (hasSnsServerToken()) {
            parts.add("snsServerToken=" + getSnsServerToken());
        }
        if (!ingameItems.isEmpty()) {
            parts.add("ingameItems=" + getIngameItemsList());
        }
        if (hasIngameRoseId()) {
            parts.add("ingameRoseId=" + getIngameRoseId());
        }
        if (hasIngameRoseTime()) {
            parts.add("ingameRoseTime=" + getIngameRoseTime());
        }
        if (hasIngameRoseMax()) {
            parts.add("ingameRoseMax=" + getIngameRoseMax());
        }
        if (hasIngameSoloSendCoolDown()) {
            parts.add("ingameSoloSendCoolDown=" + getIngameSoloSendCoolDown());
        }
        if (hasIngameSoloReceiveCoolDown()) {
            parts.add("ingameSoloReceiveCoolDown=" + getIngameSoloReceiveCoolDown());
        }
        if (hasIngameNews()) {
            parts.add("ingameNews=" + getIngameNews());
        }
        if (hasMinSoloMoney()) {
            parts.add("minSoloMoney=" + getMinSoloMoney());
        }
        if (hasFirstGunChange()) {
            parts.add("firstGunChange=" + getFirstGunChange());
        }
        if (hasPaymentEventNewCount()) {
            parts.add("paymentEventNewCount=" + getPaymentEventNewCount());
        }
        if (!betModeTypes.isEmpty()) {
            parts.add("betModeTypes=" + getBetModeTypesList());
        }
        if (hasDailySupportCnt()) {
            parts.add("dailySupportCnt=" + getDailySupportCnt());
        }
        if (hasMaxPearlAvailable()) {
            parts.add("maxPearlAvailable=" + getMaxPearlAvailable());
        }
        if (!inventoryItems.isEmpty()) {
            parts.add("inventoryItems=" + getInventoryItemsList());
        }
        if (hasTicketBuffCnt()) {
            parts.add("ticketBuffCnt=" + getTicketBuffCnt());
        }
        if (hasBradcastMsgInterval()) {
            parts.add("bradcastMsgInterval=" + getBradcastMsgInterval());
        }
        if (hasDefaultPaymentSheet()) {
            parts.add("defaultPaymentSheet=" + getDefaultPaymentSheet());
        }
        if (hasHappyPlayChannelOpen()) {
            parts.add("happyPlayChannelOpen=" + getHappyPlayChannelOpen());
        }
        if (hasHappyPlayCount()) {
            parts.add("happyPlayCount=" + getHappyPlayCount());
        }
        if (hasHappyPlayEventNewCount()) {
            parts.add("happyPlayEventNewCount=" + getHappyPlayEventNewCount());
        }
        if (hasDefaultHappyPlaySheet()) {
            parts.add("defaultHappyPlaySheet=" + getDefaultHappyPlaySheet());
        }
        if (hasBucketGame()) {
            parts.add("bucketGame=" + getBucketGame());
        }
        if (hasBucketMoney()) {
            parts.add("bucketMoney=" + getBucketMoney());
        }
        if (hasMaxAdsViewPerDay()) {
            parts.add("maxAdsViewPerDay=" + getMaxAdsViewPerDay());
        }
        if (hasCurrentAdsViewPerDay()) {
            parts.add("currentAdsViewPerDay=" + getCurrentAdsViewPerDay());
        }
        if (hasTimeZoneOffset()) {
            parts.add("timeZoneOffset=" + getTimeZoneOffset());
        }
        if (!shareData.isEmpty()) {
            parts.add("shareData=" + getShareDataList());
        }
        if (!newsImageLinks.isEmpty()) {
            parts.add("newsImageLinks=" + getNewsImageLinksList());
        }
        if (hasOnelink()) {
            parts.add("onelink=" + getOnelink());
        }
        return "LoginResponse{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<LoginResponse>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("result", 1);
        	__fieldMap.put("content", 2);
        	__fieldMap.put("userID", 3);
        	__fieldMap.put("password", 4);
        	__fieldMap.put("userName", 5);
        	__fieldMap.put("loginGift", 6);
        	__fieldMap.put("serverTime", 7);
        	__fieldMap.put("paymentChannelOpen", 8);
        	__fieldMap.put("csEmail", 9);
        	__fieldMap.put("csPhone", 10);
        	__fieldMap.put("csWeb", 12);
        	__fieldMap.put("fbAvatar", 13);
        	__fieldMap.put("banTo", 14);
        	__fieldMap.put("banReason", 15);
        	__fieldMap.put("flag", 16);
        	__fieldMap.put("notifyMsg", 18);
        	__fieldMap.put("androidUrl", 19);
        	__fieldMap.put("iosUrl", 20);
        	__fieldMap.put("wpUrl", 21);
        	__fieldMap.put("clientVersion", 22);
        	__fieldMap.put("gameHints", 23);
        	__fieldMap.put("paymentCount", 24);
        	__fieldMap.put("facebookID", 25);
        	__fieldMap.put("zaloID", 26);
        	__fieldMap.put("betModeOpen", 27);
        	__fieldMap.put("gameFuncs", 28);
        	__fieldMap.put("betModeMin", 29);
        	__fieldMap.put("isNewRegister", 30);
        	__fieldMap.put("betModeRoomStep", 31);
        	__fieldMap.put("snsAuthenRewardAmount", 32);
        	__fieldMap.put("snsAuthenRewardType", 33);
        	__fieldMap.put("friendFreeGiftSendAmount", 34);
        	__fieldMap.put("friendFreeGiftReceiveAmount", 35);
        	__fieldMap.put("friendAddGiftAmount", 36);
        	__fieldMap.put("gunBullets", 37);
        	__fieldMap.put("snsServerToken", 38);
        	__fieldMap.put("ingameItems", 39);
        	__fieldMap.put("ingameRoseId", 40);
        	__fieldMap.put("ingameRoseTime", 41);
        	__fieldMap.put("ingameRoseMax", 42);
        	__fieldMap.put("ingameSoloSendCoolDown", 43);
        	__fieldMap.put("ingameSoloReceiveCoolDown", 44);
        	__fieldMap.put("ingameNews", 45);
        	__fieldMap.put("minSoloMoney", 46);
        	__fieldMap.put("firstGunChange", 47);
        	__fieldMap.put("paymentEventNewCount", 48);
        	__fieldMap.put("betModeTypes", 49);
        	__fieldMap.put("dailySupportCnt", 50);
        	__fieldMap.put("maxPearlAvailable", 51);
        	__fieldMap.put("inventoryItems", 52);
        	__fieldMap.put("ticketBuffCnt", 53);
        	__fieldMap.put("bradcastMsgInterval", 54);
        	__fieldMap.put("defaultPaymentSheet", 55);
        	__fieldMap.put("happyPlayChannelOpen", 56);
        	__fieldMap.put("happyPlayCount", 57);
        	__fieldMap.put("happyPlayEventNewCount", 58);
        	__fieldMap.put("defaultHappyPlaySheet", 59);
        	__fieldMap.put("bucketGame", 60);
        	__fieldMap.put("bucketMoney", 61);
        	__fieldMap.put("maxAdsViewPerDay", 62);
        	__fieldMap.put("currentAdsViewPerDay", 63);
        	__fieldMap.put("timeZoneOffset", 64);
        	__fieldMap.put("shareData", 65);
        	__fieldMap.put("newsImageLinks", 66);
        	__fieldMap.put("onelink", 67);
        }

        @Override
        public LoginResponse newMessage() {
            return new LoginResponse();
        }

        @Override
        public Class<LoginResponse> typeClass() {
            return LoginResponse.class;
        }

        @Override
        public String messageName() {
            return LoginResponse.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return LoginResponse.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(LoginResponse message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, LoginResponse instance) throws java.io.IOException {
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
                    	instance.userID = input.readString();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.password = input.readString();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.userName = input.readString();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	if(!((instance.__bitField0 & 32) == 32)) {
                    	    instance.loginGift = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 32;
                    	}
                    	instance.loginGift.add(input.mergeObject(null, proto.message.LoginResponse.LoginGift.getSchema()));

                    	break;
                    case 7:
                    	instance.serverTime = input.readInt32();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.paymentChannelOpen = input.readBool();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 9:
                    	instance.csEmail = input.readString();
                    	instance.__bitField0 |= 256;
                    	break;
                    case 10:
                    	instance.csPhone = input.readString();
                    	instance.__bitField0 |= 512;
                    	break;
                    case 12:
                    	instance.csWeb = input.readString();
                    	instance.__bitField0 |= 1024;
                    	break;
                    case 13:
                    	instance.fbAvatar = input.readString();
                    	instance.__bitField0 |= 2048;
                    	break;
                    case 14:
                    	instance.banTo = input.readInt32();
                    	instance.__bitField0 |= 4096;
                    	break;
                    case 15:
                    	instance.banReason = input.readString();
                    	instance.__bitField0 |= 8192;
                    	break;
                    case 16:
                    	instance.flag = input.readInt32();
                    	instance.__bitField0 |= 16384;
                    	break;
                    case 18:
                    	instance.notifyMsg = input.readString();
                    	instance.__bitField0 |= 32768;
                    	break;
                    case 19:
                    	instance.androidUrl = input.readString();
                    	instance.__bitField0 |= 65536;
                    	break;
                    case 20:
                    	instance.iosUrl = input.readString();
                    	instance.__bitField0 |= 131072;
                    	break;
                    case 21:
                    	instance.wpUrl = input.readString();
                    	instance.__bitField0 |= 262144;
                    	break;
                    case 22:
                    	instance.clientVersion = input.readInt32();
                    	instance.__bitField0 |= 524288;
                    	break;
                    case 23:
                    	if(!((instance.__bitField0 & 1048576) == 1048576)) {
                    	    instance.gameHints = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 1048576;
                    	}
                    	instance.gameHints.add(input.readString());

                    	break;
                    case 24:
                    	instance.paymentCount = input.readInt32();
                    	instance.__bitField0 |= 2097152;
                    	break;
                    case 25:
                    	instance.facebookID = input.readString();
                    	instance.__bitField0 |= 4194304;
                    	break;
                    case 26:
                    	instance.zaloID = input.readString();
                    	instance.__bitField0 |= 8388608;
                    	break;
                    case 27:
                    	instance.betModeOpen = input.readBool();
                    	instance.__bitField0 |= 16777216;
                    	break;
                    case 28:
                    	if(!((instance.__bitField0 & 33554432) == 33554432)) {
                    	    instance.gameFuncs = new java.util.ArrayList<>();
                    	    instance.__bitField0 |= 33554432;
                    	}
                    	instance.gameFuncs.add(input.mergeObject(null, proto.message.GameFuncResponse.getSchema()));

                    	break;
                    case 29:
                    	instance.betModeMin = input.readInt32();
                    	instance.__bitField0 |= 67108864;
                    	break;
                    case 30:
                    	instance.isNewRegister = input.readBool();
                    	instance.__bitField0 |= 134217728;
                    	break;
                    case 31:
                    	instance.betModeRoomStep = input.readInt32();
                    	instance.__bitField0 |= 268435456;
                    	break;
                    case 32:
                    	instance.snsAuthenRewardAmount = input.readInt32();
                    	instance.__bitField0 |= 536870912;
                    	break;
                    case 33:
                    	instance.snsAuthenRewardType = input.readInt32();
                    	instance.__bitField0 |= 1073741824;
                    	break;
                    case 34:
                    	instance.friendFreeGiftSendAmount = input.readInt32();
                    	instance.__bitField0 |= -2147483648;
                    	break;
                    case 35:
                    	instance.friendFreeGiftReceiveAmount = input.readInt32();
                    	instance.__bitField1 |= 1;
                    	break;
                    case 36:
                    	instance.friendAddGiftAmount = input.readInt32();
                    	instance.__bitField1 |= 2;
                    	break;
                    case 37:
                    	if(!((instance.__bitField1 & 4) == 4)) {
                    	    instance.gunBullets = new java.util.ArrayList<>();
                    	    instance.__bitField1 |= 4;
                    	}
                    	instance.gunBullets.add(input.readInt32());

                    	break;
                    case 38:
                    	instance.snsServerToken = input.readString();
                    	instance.__bitField1 |= 8;
                    	break;
                    case 39:
                    	if(!((instance.__bitField1 & 16) == 16)) {
                    	    instance.ingameItems = new java.util.ArrayList<>();
                    	    instance.__bitField1 |= 16;
                    	}
                    	instance.ingameItems.add(input.mergeObject(null, proto.message.IngameItem.getSchema()));

                    	break;
                    case 40:
                    	instance.ingameRoseId = input.readInt32();
                    	instance.__bitField1 |= 32;
                    	break;
                    case 41:
                    	instance.ingameRoseTime = input.readInt32();
                    	instance.__bitField1 |= 64;
                    	break;
                    case 42:
                    	instance.ingameRoseMax = input.readInt32();
                    	instance.__bitField1 |= 128;
                    	break;
                    case 43:
                    	instance.ingameSoloSendCoolDown = input.readInt32();
                    	instance.__bitField1 |= 256;
                    	break;
                    case 44:
                    	instance.ingameSoloReceiveCoolDown = input.readInt32();
                    	instance.__bitField1 |= 512;
                    	break;
                    case 45:
                    	instance.ingameNews = input.readString();
                    	instance.__bitField1 |= 1024;
                    	break;
                    case 46:
                    	instance.minSoloMoney = input.readInt32();
                    	instance.__bitField1 |= 2048;
                    	break;
                    case 47:
                    	instance.firstGunChange = input.readInt32();
                    	instance.__bitField1 |= 4096;
                    	break;
                    case 48:
                    	instance.paymentEventNewCount = input.readInt32();
                    	instance.__bitField1 |= 8192;
                    	break;
                    case 49:
                    	if(!((instance.__bitField1 & 16384) == 16384)) {
                    	    instance.betModeTypes = new java.util.ArrayList<>();
                    	    instance.__bitField1 |= 16384;
                    	}
                    	instance.betModeTypes.add(input.readString());

                    	break;
                    case 50:
                    	instance.dailySupportCnt = input.readInt32();
                    	instance.__bitField1 |= 32768;
                    	break;
                    case 51:
                    	instance.maxPearlAvailable = input.readInt32();
                    	instance.__bitField1 |= 65536;
                    	break;
                    case 52:
                    	if(!((instance.__bitField1 & 131072) == 131072)) {
                    	    instance.inventoryItems = new java.util.ArrayList<>();
                    	    instance.__bitField1 |= 131072;
                    	}
                    	instance.inventoryItems.add(input.mergeObject(null, proto.message.InventoryItem.getSchema()));

                    	break;
                    case 53:
                    	instance.ticketBuffCnt = input.readInt32();
                    	instance.__bitField1 |= 262144;
                    	break;
                    case 54:
                    	instance.bradcastMsgInterval = input.readInt32();
                    	instance.__bitField1 |= 524288;
                    	break;
                    case 55:
                    	instance.defaultPaymentSheet = input.readInt32();
                    	instance.__bitField1 |= 1048576;
                    	break;
                    case 56:
                    	instance.happyPlayChannelOpen = input.readBool();
                    	instance.__bitField1 |= 2097152;
                    	break;
                    case 57:
                    	instance.happyPlayCount = input.readInt32();
                    	instance.__bitField1 |= 4194304;
                    	break;
                    case 58:
                    	instance.happyPlayEventNewCount = input.readInt32();
                    	instance.__bitField1 |= 8388608;
                    	break;
                    case 59:
                    	instance.defaultHappyPlaySheet = input.readInt32();
                    	instance.__bitField1 |= 16777216;
                    	break;
                    case 60:
                    	instance.bucketGame = input.readInt32();
                    	instance.__bitField1 |= 33554432;
                    	break;
                    case 61:
                    	instance.bucketMoney = input.readInt32();
                    	instance.__bitField1 |= 67108864;
                    	break;
                    case 62:
                    	instance.maxAdsViewPerDay = input.readInt32();
                    	instance.__bitField1 |= 134217728;
                    	break;
                    case 63:
                    	instance.currentAdsViewPerDay = input.readInt32();
                    	instance.__bitField1 |= 268435456;
                    	break;
                    case 64:
                    	instance.timeZoneOffset = input.readInt32();
                    	instance.__bitField1 |= 536870912;
                    	break;
                    case 65:
                    	if(!((instance.__bitField1 & 1073741824) == 1073741824)) {
                    	    instance.shareData = new java.util.ArrayList<>();
                    	    instance.__bitField1 |= 1073741824;
                    	}
                    	instance.shareData.add(input.mergeObject(null, proto.message.ShareData.getSchema()));

                    	break;
                    case 66:
                    	if(!((instance.__bitField1 & -2147483648) == -2147483648)) {
                    	    instance.newsImageLinks = new java.util.ArrayList<>();
                    	    instance.__bitField1 |= -2147483648;
                    	}
                    	instance.newsImageLinks.add(input.readString());

                    	break;
                    case 67:
                    	instance.onelink = input.readString();
                    	instance.__bitField2 |= 1;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField0 & 32) == 32) {
                instance.loginGift = java.util.Collections.unmodifiableList(instance.loginGift);
            }















            if((instance.__bitField0 & 1048576) == 1048576) {
                instance.gameHints = java.util.Collections.unmodifiableList(instance.gameHints);
            }





            if((instance.__bitField0 & 33554432) == 33554432) {
                instance.gameFuncs = java.util.Collections.unmodifiableList(instance.gameFuncs);
            }









            if((instance.__bitField1 & 4) == 4) {
                instance.gunBullets = java.util.Collections.unmodifiableList(instance.gunBullets);
            }


            if((instance.__bitField1 & 16) == 16) {
                instance.ingameItems = java.util.Collections.unmodifiableList(instance.ingameItems);
            }










            if((instance.__bitField1 & 16384) == 16384) {
                instance.betModeTypes = java.util.Collections.unmodifiableList(instance.betModeTypes);
            }



            if((instance.__bitField1 & 131072) == 131072) {
                instance.inventoryItems = java.util.Collections.unmodifiableList(instance.inventoryItems);
            }













            if((instance.__bitField1 & 1073741824) == 1073741824) {
                instance.shareData = java.util.Collections.unmodifiableList(instance.shareData);
            }

            if((instance.__bitField1 & -2147483648) == -2147483648) {
                instance.newsImageLinks = java.util.Collections.unmodifiableList(instance.newsImageLinks);
            }


        }

        @Override
        public void writeTo(io.protostuff.Output output, LoginResponse instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.result, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.content, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeString(3, instance.userID, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeString(4, instance.password, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeString(5, instance.userName, false);
            }

            for(proto.message.LoginResponse.LoginGift loginGift : instance.loginGift) {
                output.writeObject(6, loginGift, proto.message.LoginResponse.LoginGift.getSchema(), true);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeInt32(7, instance.serverTime, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeBool(8, instance.paymentChannelOpen, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeString(9, instance.csEmail, false);
            }

            if((instance.__bitField0 & 512) == 512) {
                output.writeString(10, instance.csPhone, false);
            }

            if((instance.__bitField0 & 1024) == 1024) {
                output.writeString(12, instance.csWeb, false);
            }

            if((instance.__bitField0 & 2048) == 2048) {
                output.writeString(13, instance.fbAvatar, false);
            }

            if((instance.__bitField0 & 4096) == 4096) {
                output.writeInt32(14, instance.banTo, false);
            }

            if((instance.__bitField0 & 8192) == 8192) {
                output.writeString(15, instance.banReason, false);
            }

            if((instance.__bitField0 & 16384) == 16384) {
                output.writeInt32(16, instance.flag, false);
            }

            if((instance.__bitField0 & 32768) == 32768) {
                output.writeString(18, instance.notifyMsg, false);
            }

            if((instance.__bitField0 & 65536) == 65536) {
                output.writeString(19, instance.androidUrl, false);
            }

            if((instance.__bitField0 & 131072) == 131072) {
                output.writeString(20, instance.iosUrl, false);
            }

            if((instance.__bitField0 & 262144) == 262144) {
                output.writeString(21, instance.wpUrl, false);
            }

            if((instance.__bitField0 & 524288) == 524288) {
                output.writeInt32(22, instance.clientVersion, false);
            }

            for(String gameHints : instance.gameHints) {
                output.writeString(23, gameHints, true);
            }

            if((instance.__bitField0 & 2097152) == 2097152) {
                output.writeInt32(24, instance.paymentCount, false);
            }

            if((instance.__bitField0 & 4194304) == 4194304) {
                output.writeString(25, instance.facebookID, false);
            }

            if((instance.__bitField0 & 8388608) == 8388608) {
                output.writeString(26, instance.zaloID, false);
            }

            if((instance.__bitField0 & 16777216) == 16777216) {
                output.writeBool(27, instance.betModeOpen, false);
            }

            for(proto.message.GameFuncResponse gameFuncs : instance.gameFuncs) {
                output.writeObject(28, gameFuncs, proto.message.GameFuncResponse.getSchema(), true);
            }

            if((instance.__bitField0 & 67108864) == 67108864) {
                output.writeInt32(29, instance.betModeMin, false);
            }

            if((instance.__bitField0 & 134217728) == 134217728) {
                output.writeBool(30, instance.isNewRegister, false);
            }

            if((instance.__bitField0 & 268435456) == 268435456) {
                output.writeInt32(31, instance.betModeRoomStep, false);
            }

            if((instance.__bitField0 & 536870912) == 536870912) {
                output.writeInt32(32, instance.snsAuthenRewardAmount, false);
            }

            if((instance.__bitField0 & 1073741824) == 1073741824) {
                output.writeInt32(33, instance.snsAuthenRewardType, false);
            }

            if((instance.__bitField0 & -2147483648) == -2147483648) {
                output.writeInt32(34, instance.friendFreeGiftSendAmount, false);
            }

            if((instance.__bitField1 & 1) == 1) {
                output.writeInt32(35, instance.friendFreeGiftReceiveAmount, false);
            }

            if((instance.__bitField1 & 2) == 2) {
                output.writeInt32(36, instance.friendAddGiftAmount, false);
            }

            for(int gunBullets : instance.gunBullets) {
                output.writeInt32(37, gunBullets, true);
            }

            if((instance.__bitField1 & 8) == 8) {
                output.writeString(38, instance.snsServerToken, false);
            }

            for(proto.message.IngameItem ingameItems : instance.ingameItems) {
                output.writeObject(39, ingameItems, proto.message.IngameItem.getSchema(), true);
            }

            if((instance.__bitField1 & 32) == 32) {
                output.writeInt32(40, instance.ingameRoseId, false);
            }

            if((instance.__bitField1 & 64) == 64) {
                output.writeInt32(41, instance.ingameRoseTime, false);
            }

            if((instance.__bitField1 & 128) == 128) {
                output.writeInt32(42, instance.ingameRoseMax, false);
            }

            if((instance.__bitField1 & 256) == 256) {
                output.writeInt32(43, instance.ingameSoloSendCoolDown, false);
            }

            if((instance.__bitField1 & 512) == 512) {
                output.writeInt32(44, instance.ingameSoloReceiveCoolDown, false);
            }

            if((instance.__bitField1 & 1024) == 1024) {
                output.writeString(45, instance.ingameNews, false);
            }

            if((instance.__bitField1 & 2048) == 2048) {
                output.writeInt32(46, instance.minSoloMoney, false);
            }

            if((instance.__bitField1 & 4096) == 4096) {
                output.writeInt32(47, instance.firstGunChange, false);
            }

            if((instance.__bitField1 & 8192) == 8192) {
                output.writeInt32(48, instance.paymentEventNewCount, false);
            }

            for(String betModeTypes : instance.betModeTypes) {
                output.writeString(49, betModeTypes, true);
            }

            if((instance.__bitField1 & 32768) == 32768) {
                output.writeInt32(50, instance.dailySupportCnt, false);
            }

            if((instance.__bitField1 & 65536) == 65536) {
                output.writeInt32(51, instance.maxPearlAvailable, false);
            }

            for(proto.message.InventoryItem inventoryItems : instance.inventoryItems) {
                output.writeObject(52, inventoryItems, proto.message.InventoryItem.getSchema(), true);
            }

            if((instance.__bitField1 & 262144) == 262144) {
                output.writeInt32(53, instance.ticketBuffCnt, false);
            }

            if((instance.__bitField1 & 524288) == 524288) {
                output.writeInt32(54, instance.bradcastMsgInterval, false);
            }

            if((instance.__bitField1 & 1048576) == 1048576) {
                output.writeInt32(55, instance.defaultPaymentSheet, false);
            }

            if((instance.__bitField1 & 2097152) == 2097152) {
                output.writeBool(56, instance.happyPlayChannelOpen, false);
            }

            if((instance.__bitField1 & 4194304) == 4194304) {
                output.writeInt32(57, instance.happyPlayCount, false);
            }

            if((instance.__bitField1 & 8388608) == 8388608) {
                output.writeInt32(58, instance.happyPlayEventNewCount, false);
            }

            if((instance.__bitField1 & 16777216) == 16777216) {
                output.writeInt32(59, instance.defaultHappyPlaySheet, false);
            }

            if((instance.__bitField1 & 33554432) == 33554432) {
                output.writeInt32(60, instance.bucketGame, false);
            }

            if((instance.__bitField1 & 67108864) == 67108864) {
                output.writeInt32(61, instance.bucketMoney, false);
            }

            if((instance.__bitField1 & 134217728) == 134217728) {
                output.writeInt32(62, instance.maxAdsViewPerDay, false);
            }

            if((instance.__bitField1 & 268435456) == 268435456) {
                output.writeInt32(63, instance.currentAdsViewPerDay, false);
            }

            if((instance.__bitField1 & 536870912) == 536870912) {
                output.writeInt32(64, instance.timeZoneOffset, false);
            }

            for(proto.message.ShareData shareData : instance.shareData) {
                output.writeObject(65, shareData, proto.message.ShareData.getSchema(), true);
            }

            for(String newsImageLinks : instance.newsImageLinks) {
                output.writeString(66, newsImageLinks, true);
            }

            if((instance.__bitField2 & 1) == 1) {
                output.writeString(67, instance.onelink, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "result";
        		case 2: return "content";
        		case 3: return "userID";
        		case 4: return "password";
        		case 5: return "userName";
        		case 6: return "loginGift";
        		case 7: return "serverTime";
        		case 8: return "paymentChannelOpen";
        		case 9: return "csEmail";
        		case 10: return "csPhone";
        		case 12: return "csWeb";
        		case 13: return "fbAvatar";
        		case 14: return "banTo";
        		case 15: return "banReason";
        		case 16: return "flag";
        		case 18: return "notifyMsg";
        		case 19: return "androidUrl";
        		case 20: return "iosUrl";
        		case 21: return "wpUrl";
        		case 22: return "clientVersion";
        		case 23: return "gameHints";
        		case 24: return "paymentCount";
        		case 25: return "facebookID";
        		case 26: return "zaloID";
        		case 27: return "betModeOpen";
        		case 28: return "gameFuncs";
        		case 29: return "betModeMin";
        		case 30: return "isNewRegister";
        		case 31: return "betModeRoomStep";
        		case 32: return "snsAuthenRewardAmount";
        		case 33: return "snsAuthenRewardType";
        		case 34: return "friendFreeGiftSendAmount";
        		case 35: return "friendFreeGiftReceiveAmount";
        		case 36: return "friendAddGiftAmount";
        		case 37: return "gunBullets";
        		case 38: return "snsServerToken";
        		case 39: return "ingameItems";
        		case 40: return "ingameRoseId";
        		case 41: return "ingameRoseTime";
        		case 42: return "ingameRoseMax";
        		case 43: return "ingameSoloSendCoolDown";
        		case 44: return "ingameSoloReceiveCoolDown";
        		case 45: return "ingameNews";
        		case 46: return "minSoloMoney";
        		case 47: return "firstGunChange";
        		case 48: return "paymentEventNewCount";
        		case 49: return "betModeTypes";
        		case 50: return "dailySupportCnt";
        		case 51: return "maxPearlAvailable";
        		case 52: return "inventoryItems";
        		case 53: return "ticketBuffCnt";
        		case 54: return "bradcastMsgInterval";
        		case 55: return "defaultPaymentSheet";
        		case 56: return "happyPlayChannelOpen";
        		case 57: return "happyPlayCount";
        		case 58: return "happyPlayEventNewCount";
        		case 59: return "defaultHappyPlaySheet";
        		case 60: return "bucketGame";
        		case 61: return "bucketMoney";
        		case 62: return "maxAdsViewPerDay";
        		case 63: return "currentAdsViewPerDay";
        		case 64: return "timeZoneOffset";
        		case 65: return "shareData";
        		case 66: return "newsImageLinks";
        		case 67: return "onelink";
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

        private String userID;

        private String password;

        private String userName;

        private java.util.List<proto.message.LoginResponse.LoginGift> loginGift;

        private int serverTime;

        private boolean paymentChannelOpen;

        private String csEmail;

        private String csPhone;

        private String csWeb;

        private String fbAvatar;

        private int banTo;

        private String banReason;

        private int flag;

        private String notifyMsg;

        private String androidUrl;

        private String iosUrl;

        private String wpUrl;

        private int clientVersion;

        private java.util.List<String> gameHints;

        private int paymentCount;

        private String facebookID;

        private String zaloID;

        private boolean betModeOpen;

        private java.util.List<proto.message.GameFuncResponse> gameFuncs;

        private int betModeMin;

        private boolean isNewRegister;

        private int betModeRoomStep;

        private int snsAuthenRewardAmount;

        private int snsAuthenRewardType;

        private int friendFreeGiftSendAmount;

        private int friendFreeGiftReceiveAmount;

        private int friendAddGiftAmount;

        private java.util.List<Integer> gunBullets;

        private String snsServerToken;

        private java.util.List<proto.message.IngameItem> ingameItems;

        private int ingameRoseId;

        private int ingameRoseTime;

        private int ingameRoseMax;

        private int ingameSoloSendCoolDown;

        private int ingameSoloReceiveCoolDown;

        private String ingameNews;

        private int minSoloMoney;

        private int firstGunChange;

        private int paymentEventNewCount;

        private java.util.List<String> betModeTypes;

        private int dailySupportCnt;

        private int maxPearlAvailable;

        private java.util.List<proto.message.InventoryItem> inventoryItems;

        private int ticketBuffCnt;

        private int bradcastMsgInterval;

        private int defaultPaymentSheet;

        private boolean happyPlayChannelOpen;

        private int happyPlayCount;

        private int happyPlayEventNewCount;

        private int defaultHappyPlaySheet;

        private int bucketGame;

        private int bucketMoney;

        private int maxAdsViewPerDay;

        private int currentAdsViewPerDay;

        private int timeZoneOffset;

        private java.util.List<proto.message.ShareData> shareData;

        private java.util.List<String> newsImageLinks;

        private String onelink;

        private int __bitField0;
        private int __bitField1;
        private int __bitField2;

        private Builder() {
            this.result = proto.message.SystemResultCode.LOGIN_SUCCESS.getNumber();
            this.content = "";
            this.userID = "";
            this.password = "";
            this.userName = "";
            this.loginGift = java.util.Collections.emptyList();
            this.serverTime = 0;
            this.paymentChannelOpen = false;
            this.csEmail = "";
            this.csPhone = "";
            this.csWeb = "";
            this.fbAvatar = "";
            this.banTo = 0;
            this.banReason = "";
            this.flag = 0;
            this.notifyMsg = "";
            this.androidUrl = "";
            this.iosUrl = "";
            this.wpUrl = "";
            this.clientVersion = 0;
            this.gameHints = java.util.Collections.emptyList();
            this.paymentCount = 0;
            this.facebookID = "";
            this.zaloID = "";
            this.betModeOpen = false;
            this.gameFuncs = java.util.Collections.emptyList();
            this.betModeMin = 0;
            this.isNewRegister = false;
            this.betModeRoomStep = 0;
            this.snsAuthenRewardAmount = 0;
            this.snsAuthenRewardType = 0;
            this.friendFreeGiftSendAmount = 0;
            this.friendFreeGiftReceiveAmount = 0;
            this.friendAddGiftAmount = 0;
            this.gunBullets = java.util.Collections.emptyList();
            this.snsServerToken = "";
            this.ingameItems = java.util.Collections.emptyList();
            this.ingameRoseId = 0;
            this.ingameRoseTime = 0;
            this.ingameRoseMax = 0;
            this.ingameSoloSendCoolDown = 0;
            this.ingameSoloReceiveCoolDown = 0;
            this.ingameNews = "";
            this.minSoloMoney = 0;
            this.firstGunChange = 0;
            this.paymentEventNewCount = 0;
            this.betModeTypes = java.util.Collections.emptyList();
            this.dailySupportCnt = 0;
            this.maxPearlAvailable = 0;
            this.inventoryItems = java.util.Collections.emptyList();
            this.ticketBuffCnt = 0;
            this.bradcastMsgInterval = 0;
            this.defaultPaymentSheet = 0;
            this.happyPlayChannelOpen = false;
            this.happyPlayCount = 0;
            this.happyPlayEventNewCount = 0;
            this.defaultHappyPlaySheet = 0;
            this.bucketGame = 0;
            this.bucketMoney = 0;
            this.maxAdsViewPerDay = 0;
            this.currentAdsViewPerDay = 0;
            this.timeZoneOffset = 0;
            this.shareData = java.util.Collections.emptyList();
            this.newsImageLinks = java.util.Collections.emptyList();
            this.onelink = "";
        }

        public Builder mergeFrom(LoginResponse instance) {
            if (instance.hasResult()) {
                this.setResult(instance.getResult());
            }

            if (instance.hasContent()) {
                this.setContent(instance.getContent());
            }

            if (instance.hasUserID()) {
                this.setUserID(instance.getUserID());
            }

            if (instance.hasPassword()) {
                this.setPassword(instance.getPassword());
            }

            if (instance.hasUserName()) {
                this.setUserName(instance.getUserName());
            }

            this.addAllLoginGift(instance.getLoginGiftList());

            if (instance.hasServerTime()) {
                this.setServerTime(instance.getServerTime());
            }

            if (instance.hasPaymentChannelOpen()) {
                this.setPaymentChannelOpen(instance.getPaymentChannelOpen());
            }

            if (instance.hasCsEmail()) {
                this.setCsEmail(instance.getCsEmail());
            }

            if (instance.hasCsPhone()) {
                this.setCsPhone(instance.getCsPhone());
            }

            if (instance.hasCsWeb()) {
                this.setCsWeb(instance.getCsWeb());
            }

            if (instance.hasFbAvatar()) {
                this.setFbAvatar(instance.getFbAvatar());
            }

            if (instance.hasBanTo()) {
                this.setBanTo(instance.getBanTo());
            }

            if (instance.hasBanReason()) {
                this.setBanReason(instance.getBanReason());
            }

            if (instance.hasFlag()) {
                this.setFlag(instance.getFlag());
            }

            if (instance.hasNotifyMsg()) {
                this.setNotifyMsg(instance.getNotifyMsg());
            }

            if (instance.hasAndroidUrl()) {
                this.setAndroidUrl(instance.getAndroidUrl());
            }

            if (instance.hasIosUrl()) {
                this.setIosUrl(instance.getIosUrl());
            }

            if (instance.hasWpUrl()) {
                this.setWpUrl(instance.getWpUrl());
            }

            if (instance.hasClientVersion()) {
                this.setClientVersion(instance.getClientVersion());
            }

            this.addAllGameHints(instance.getGameHintsList());

            if (instance.hasPaymentCount()) {
                this.setPaymentCount(instance.getPaymentCount());
            }

            if (instance.hasFacebookID()) {
                this.setFacebookID(instance.getFacebookID());
            }

            if (instance.hasZaloID()) {
                this.setZaloID(instance.getZaloID());
            }

            if (instance.hasBetModeOpen()) {
                this.setBetModeOpen(instance.getBetModeOpen());
            }

            this.addAllGameFuncs(instance.getGameFuncsList());

            if (instance.hasBetModeMin()) {
                this.setBetModeMin(instance.getBetModeMin());
            }

            if (instance.hasIsNewRegister()) {
                this.setIsNewRegister(instance.getIsNewRegister());
            }

            if (instance.hasBetModeRoomStep()) {
                this.setBetModeRoomStep(instance.getBetModeRoomStep());
            }

            if (instance.hasSnsAuthenRewardAmount()) {
                this.setSnsAuthenRewardAmount(instance.getSnsAuthenRewardAmount());
            }

            if (instance.hasSnsAuthenRewardType()) {
                this.setSnsAuthenRewardType(instance.getSnsAuthenRewardType());
            }

            if (instance.hasFriendFreeGiftSendAmount()) {
                this.setFriendFreeGiftSendAmount(instance.getFriendFreeGiftSendAmount());
            }

            if (instance.hasFriendFreeGiftReceiveAmount()) {
                this.setFriendFreeGiftReceiveAmount(instance.getFriendFreeGiftReceiveAmount());
            }

            if (instance.hasFriendAddGiftAmount()) {
                this.setFriendAddGiftAmount(instance.getFriendAddGiftAmount());
            }

            this.addAllGunBullets(instance.getGunBulletsList());

            if (instance.hasSnsServerToken()) {
                this.setSnsServerToken(instance.getSnsServerToken());
            }

            this.addAllIngameItems(instance.getIngameItemsList());

            if (instance.hasIngameRoseId()) {
                this.setIngameRoseId(instance.getIngameRoseId());
            }

            if (instance.hasIngameRoseTime()) {
                this.setIngameRoseTime(instance.getIngameRoseTime());
            }

            if (instance.hasIngameRoseMax()) {
                this.setIngameRoseMax(instance.getIngameRoseMax());
            }

            if (instance.hasIngameSoloSendCoolDown()) {
                this.setIngameSoloSendCoolDown(instance.getIngameSoloSendCoolDown());
            }

            if (instance.hasIngameSoloReceiveCoolDown()) {
                this.setIngameSoloReceiveCoolDown(instance.getIngameSoloReceiveCoolDown());
            }

            if (instance.hasIngameNews()) {
                this.setIngameNews(instance.getIngameNews());
            }

            if (instance.hasMinSoloMoney()) {
                this.setMinSoloMoney(instance.getMinSoloMoney());
            }

            if (instance.hasFirstGunChange()) {
                this.setFirstGunChange(instance.getFirstGunChange());
            }

            if (instance.hasPaymentEventNewCount()) {
                this.setPaymentEventNewCount(instance.getPaymentEventNewCount());
            }

            this.addAllBetModeTypes(instance.getBetModeTypesList());

            if (instance.hasDailySupportCnt()) {
                this.setDailySupportCnt(instance.getDailySupportCnt());
            }

            if (instance.hasMaxPearlAvailable()) {
                this.setMaxPearlAvailable(instance.getMaxPearlAvailable());
            }

            this.addAllInventoryItems(instance.getInventoryItemsList());

            if (instance.hasTicketBuffCnt()) {
                this.setTicketBuffCnt(instance.getTicketBuffCnt());
            }

            if (instance.hasBradcastMsgInterval()) {
                this.setBradcastMsgInterval(instance.getBradcastMsgInterval());
            }

            if (instance.hasDefaultPaymentSheet()) {
                this.setDefaultPaymentSheet(instance.getDefaultPaymentSheet());
            }

            if (instance.hasHappyPlayChannelOpen()) {
                this.setHappyPlayChannelOpen(instance.getHappyPlayChannelOpen());
            }

            if (instance.hasHappyPlayCount()) {
                this.setHappyPlayCount(instance.getHappyPlayCount());
            }

            if (instance.hasHappyPlayEventNewCount()) {
                this.setHappyPlayEventNewCount(instance.getHappyPlayEventNewCount());
            }

            if (instance.hasDefaultHappyPlaySheet()) {
                this.setDefaultHappyPlaySheet(instance.getDefaultHappyPlaySheet());
            }

            if (instance.hasBucketGame()) {
                this.setBucketGame(instance.getBucketGame());
            }

            if (instance.hasBucketMoney()) {
                this.setBucketMoney(instance.getBucketMoney());
            }

            if (instance.hasMaxAdsViewPerDay()) {
                this.setMaxAdsViewPerDay(instance.getMaxAdsViewPerDay());
            }

            if (instance.hasCurrentAdsViewPerDay()) {
                this.setCurrentAdsViewPerDay(instance.getCurrentAdsViewPerDay());
            }

            if (instance.hasTimeZoneOffset()) {
                this.setTimeZoneOffset(instance.getTimeZoneOffset());
            }

            this.addAllShareData(instance.getShareDataList());

            this.addAllNewsImageLinks(instance.getNewsImageLinksList());

            if (instance.hasOnelink()) {
                this.setOnelink(instance.getOnelink());
            }

            return this;
        }

        public proto.message.SystemResultCode getResult() {
            return proto.message.SystemResultCode.valueOf(result);
        }

        public int getResultValue() {
            return result;
        }

        public Builder setResult(proto.message.SystemResultCode value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#result to null");
            }

            if (value == proto.message.SystemResultCode.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set LoginResponse#result to UNRECOGNIZED");
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
                throw new NullPointerException("Cannot set LoginResponse#content to null");
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

        public String getUserID() {
            return userID;
        }

        public Builder setUserID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#userID to null");
            }

            this.userID = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearUserID() {
            this.userID = "";
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasUserID() {
            return (__bitField0 & 4) == 4;
        }

        public String getPassword() {
            return password;
        }

        public Builder setPassword(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#password to null");
            }

            this.password = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearPassword() {
            this.password = "";
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasPassword() {
            return (__bitField0 & 8) == 8;
        }

        public String getUserName() {
            return userName;
        }

        public Builder setUserName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#userName to null");
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

        public java.util.List<proto.message.LoginResponse.LoginGift> getLoginGiftList() {
            return loginGift;
        }

        public Builder setLoginGift(int index, proto.message.LoginResponse.LoginGift value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#loginGift to null");
            }

            if(!((__bitField0 & 32) == 32)) {
                this.loginGift = new java.util.ArrayList<>();
                __bitField0 |= 32;
            }
            this.loginGift.set(index, value);
            return this;
        }

        public Builder addLoginGift(proto.message.LoginResponse.LoginGift value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#loginGift to null");
            }

            if(!((__bitField0 & 32) == 32)) {
                this.loginGift = new java.util.ArrayList<>();
                __bitField0 |= 32;
            }
            this.loginGift.add(value);
            return this;
        }

        public Builder addAllLoginGift(java.lang.Iterable<proto.message.LoginResponse.LoginGift> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set LoginResponse#loginGift to null");
            }
            if(!((__bitField0 & 32) == 32)) {
                this.loginGift = new java.util.ArrayList<>();
                __bitField0 |= 32;
            }
            for (final proto.message.LoginResponse.LoginGift value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set LoginResponse#loginGift to null");
                }
                this.loginGift.add(value);
            }
            return this;
        }

        public Builder clearLoginGift() {
            this.loginGift = java.util.Collections.emptyList();
            __bitField0 &= ~32;
            return this;
        }

        public int getLoginGiftCount() {
            return loginGift.size();
        }

        public proto.message.LoginResponse.LoginGift getLoginGift(int index) {
            return loginGift.get(index);
        }

        public int getServerTime() {
            return serverTime;
        }

        public Builder setServerTime(int value) {
            this.serverTime = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearServerTime() {
            this.serverTime = 0;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasServerTime() {
            return (__bitField0 & 64) == 64;
        }

        public boolean getPaymentChannelOpen() {
            return paymentChannelOpen;
        }

        public Builder setPaymentChannelOpen(boolean value) {
            this.paymentChannelOpen = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearPaymentChannelOpen() {
            this.paymentChannelOpen = false;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasPaymentChannelOpen() {
            return (__bitField0 & 128) == 128;
        }

        public String getCsEmail() {
            return csEmail;
        }

        public Builder setCsEmail(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#csEmail to null");
            }

            this.csEmail = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearCsEmail() {
            this.csEmail = "";
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasCsEmail() {
            return (__bitField0 & 256) == 256;
        }

        public String getCsPhone() {
            return csPhone;
        }

        public Builder setCsPhone(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#csPhone to null");
            }

            this.csPhone = value;
            __bitField0 |= 512;
            return this;
        }

        public Builder clearCsPhone() {
            this.csPhone = "";
            __bitField0 &= ~512;
            return this;
        }

        public boolean hasCsPhone() {
            return (__bitField0 & 512) == 512;
        }

        public String getCsWeb() {
            return csWeb;
        }

        public Builder setCsWeb(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#csWeb to null");
            }

            this.csWeb = value;
            __bitField0 |= 1024;
            return this;
        }

        public Builder clearCsWeb() {
            this.csWeb = "";
            __bitField0 &= ~1024;
            return this;
        }

        public boolean hasCsWeb() {
            return (__bitField0 & 1024) == 1024;
        }

        public String getFbAvatar() {
            return fbAvatar;
        }

        public Builder setFbAvatar(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#fbAvatar to null");
            }

            this.fbAvatar = value;
            __bitField0 |= 2048;
            return this;
        }

        public Builder clearFbAvatar() {
            this.fbAvatar = "";
            __bitField0 &= ~2048;
            return this;
        }

        public boolean hasFbAvatar() {
            return (__bitField0 & 2048) == 2048;
        }

        public int getBanTo() {
            return banTo;
        }

        public Builder setBanTo(int value) {
            this.banTo = value;
            __bitField0 |= 4096;
            return this;
        }

        public Builder clearBanTo() {
            this.banTo = 0;
            __bitField0 &= ~4096;
            return this;
        }

        public boolean hasBanTo() {
            return (__bitField0 & 4096) == 4096;
        }

        public String getBanReason() {
            return banReason;
        }

        public Builder setBanReason(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#banReason to null");
            }

            this.banReason = value;
            __bitField0 |= 8192;
            return this;
        }

        public Builder clearBanReason() {
            this.banReason = "";
            __bitField0 &= ~8192;
            return this;
        }

        public boolean hasBanReason() {
            return (__bitField0 & 8192) == 8192;
        }

        public int getFlag() {
            return flag;
        }

        public Builder setFlag(int value) {
            this.flag = value;
            __bitField0 |= 16384;
            return this;
        }

        public Builder clearFlag() {
            this.flag = 0;
            __bitField0 &= ~16384;
            return this;
        }

        public boolean hasFlag() {
            return (__bitField0 & 16384) == 16384;
        }

        public String getNotifyMsg() {
            return notifyMsg;
        }

        public Builder setNotifyMsg(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#notifyMsg to null");
            }

            this.notifyMsg = value;
            __bitField0 |= 32768;
            return this;
        }

        public Builder clearNotifyMsg() {
            this.notifyMsg = "";
            __bitField0 &= ~32768;
            return this;
        }

        public boolean hasNotifyMsg() {
            return (__bitField0 & 32768) == 32768;
        }

        public String getAndroidUrl() {
            return androidUrl;
        }

        public Builder setAndroidUrl(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#androidUrl to null");
            }

            this.androidUrl = value;
            __bitField0 |= 65536;
            return this;
        }

        public Builder clearAndroidUrl() {
            this.androidUrl = "";
            __bitField0 &= ~65536;
            return this;
        }

        public boolean hasAndroidUrl() {
            return (__bitField0 & 65536) == 65536;
        }

        public String getIosUrl() {
            return iosUrl;
        }

        public Builder setIosUrl(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#iosUrl to null");
            }

            this.iosUrl = value;
            __bitField0 |= 131072;
            return this;
        }

        public Builder clearIosUrl() {
            this.iosUrl = "";
            __bitField0 &= ~131072;
            return this;
        }

        public boolean hasIosUrl() {
            return (__bitField0 & 131072) == 131072;
        }

        public String getWpUrl() {
            return wpUrl;
        }

        public Builder setWpUrl(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#wpUrl to null");
            }

            this.wpUrl = value;
            __bitField0 |= 262144;
            return this;
        }

        public Builder clearWpUrl() {
            this.wpUrl = "";
            __bitField0 &= ~262144;
            return this;
        }

        public boolean hasWpUrl() {
            return (__bitField0 & 262144) == 262144;
        }

        public int getClientVersion() {
            return clientVersion;
        }

        public Builder setClientVersion(int value) {
            this.clientVersion = value;
            __bitField0 |= 524288;
            return this;
        }

        public Builder clearClientVersion() {
            this.clientVersion = 0;
            __bitField0 &= ~524288;
            return this;
        }

        public boolean hasClientVersion() {
            return (__bitField0 & 524288) == 524288;
        }

        public java.util.List<String> getGameHintsList() {
            return gameHints;
        }

        public Builder setGameHints(int index, String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#gameHints to null");
            }

            if(!((__bitField0 & 1048576) == 1048576)) {
                this.gameHints = new java.util.ArrayList<>();
                __bitField0 |= 1048576;
            }
            this.gameHints.set(index, value);
            return this;
        }

        public Builder addGameHints(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#gameHints to null");
            }

            if(!((__bitField0 & 1048576) == 1048576)) {
                this.gameHints = new java.util.ArrayList<>();
                __bitField0 |= 1048576;
            }
            this.gameHints.add(value);
            return this;
        }

        public Builder addAllGameHints(java.lang.Iterable<String> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set LoginResponse#gameHints to null");
            }
            if(!((__bitField0 & 1048576) == 1048576)) {
                this.gameHints = new java.util.ArrayList<>();
                __bitField0 |= 1048576;
            }
            for (final String value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set LoginResponse#gameHints to null");
                }
                this.gameHints.add(value);
            }
            return this;
        }

        public Builder clearGameHints() {
            this.gameHints = java.util.Collections.emptyList();
            __bitField0 &= ~1048576;
            return this;
        }

        public int getGameHintsCount() {
            return gameHints.size();
        }

        public String getGameHints(int index) {
            return gameHints.get(index);
        }

        public int getPaymentCount() {
            return paymentCount;
        }

        public Builder setPaymentCount(int value) {
            this.paymentCount = value;
            __bitField0 |= 2097152;
            return this;
        }

        public Builder clearPaymentCount() {
            this.paymentCount = 0;
            __bitField0 &= ~2097152;
            return this;
        }

        public boolean hasPaymentCount() {
            return (__bitField0 & 2097152) == 2097152;
        }

        public String getFacebookID() {
            return facebookID;
        }

        public Builder setFacebookID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#facebookID to null");
            }

            this.facebookID = value;
            __bitField0 |= 4194304;
            return this;
        }

        public Builder clearFacebookID() {
            this.facebookID = "";
            __bitField0 &= ~4194304;
            return this;
        }

        public boolean hasFacebookID() {
            return (__bitField0 & 4194304) == 4194304;
        }

        public String getZaloID() {
            return zaloID;
        }

        public Builder setZaloID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#zaloID to null");
            }

            this.zaloID = value;
            __bitField0 |= 8388608;
            return this;
        }

        public Builder clearZaloID() {
            this.zaloID = "";
            __bitField0 &= ~8388608;
            return this;
        }

        public boolean hasZaloID() {
            return (__bitField0 & 8388608) == 8388608;
        }

        public boolean getBetModeOpen() {
            return betModeOpen;
        }

        public Builder setBetModeOpen(boolean value) {
            this.betModeOpen = value;
            __bitField0 |= 16777216;
            return this;
        }

        public Builder clearBetModeOpen() {
            this.betModeOpen = false;
            __bitField0 &= ~16777216;
            return this;
        }

        public boolean hasBetModeOpen() {
            return (__bitField0 & 16777216) == 16777216;
        }

        public java.util.List<proto.message.GameFuncResponse> getGameFuncsList() {
            return gameFuncs;
        }

        public Builder setGameFuncs(int index, proto.message.GameFuncResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#gameFuncs to null");
            }

            if(!((__bitField0 & 33554432) == 33554432)) {
                this.gameFuncs = new java.util.ArrayList<>();
                __bitField0 |= 33554432;
            }
            this.gameFuncs.set(index, value);
            return this;
        }

        public Builder addGameFuncs(proto.message.GameFuncResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#gameFuncs to null");
            }

            if(!((__bitField0 & 33554432) == 33554432)) {
                this.gameFuncs = new java.util.ArrayList<>();
                __bitField0 |= 33554432;
            }
            this.gameFuncs.add(value);
            return this;
        }

        public Builder addAllGameFuncs(java.lang.Iterable<proto.message.GameFuncResponse> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set LoginResponse#gameFuncs to null");
            }
            if(!((__bitField0 & 33554432) == 33554432)) {
                this.gameFuncs = new java.util.ArrayList<>();
                __bitField0 |= 33554432;
            }
            for (final proto.message.GameFuncResponse value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set LoginResponse#gameFuncs to null");
                }
                this.gameFuncs.add(value);
            }
            return this;
        }

        public Builder clearGameFuncs() {
            this.gameFuncs = java.util.Collections.emptyList();
            __bitField0 &= ~33554432;
            return this;
        }

        public int getGameFuncsCount() {
            return gameFuncs.size();
        }

        public proto.message.GameFuncResponse getGameFuncs(int index) {
            return gameFuncs.get(index);
        }

        public int getBetModeMin() {
            return betModeMin;
        }

        public Builder setBetModeMin(int value) {
            this.betModeMin = value;
            __bitField0 |= 67108864;
            return this;
        }

        public Builder clearBetModeMin() {
            this.betModeMin = 0;
            __bitField0 &= ~67108864;
            return this;
        }

        public boolean hasBetModeMin() {
            return (__bitField0 & 67108864) == 67108864;
        }

        public boolean getIsNewRegister() {
            return isNewRegister;
        }

        public Builder setIsNewRegister(boolean value) {
            this.isNewRegister = value;
            __bitField0 |= 134217728;
            return this;
        }

        public Builder clearIsNewRegister() {
            this.isNewRegister = false;
            __bitField0 &= ~134217728;
            return this;
        }

        public boolean hasIsNewRegister() {
            return (__bitField0 & 134217728) == 134217728;
        }

        public int getBetModeRoomStep() {
            return betModeRoomStep;
        }

        public Builder setBetModeRoomStep(int value) {
            this.betModeRoomStep = value;
            __bitField0 |= 268435456;
            return this;
        }

        public Builder clearBetModeRoomStep() {
            this.betModeRoomStep = 0;
            __bitField0 &= ~268435456;
            return this;
        }

        public boolean hasBetModeRoomStep() {
            return (__bitField0 & 268435456) == 268435456;
        }

        public int getSnsAuthenRewardAmount() {
            return snsAuthenRewardAmount;
        }

        public Builder setSnsAuthenRewardAmount(int value) {
            this.snsAuthenRewardAmount = value;
            __bitField0 |= 536870912;
            return this;
        }

        public Builder clearSnsAuthenRewardAmount() {
            this.snsAuthenRewardAmount = 0;
            __bitField0 &= ~536870912;
            return this;
        }

        public boolean hasSnsAuthenRewardAmount() {
            return (__bitField0 & 536870912) == 536870912;
        }

        public int getSnsAuthenRewardType() {
            return snsAuthenRewardType;
        }

        public Builder setSnsAuthenRewardType(int value) {
            this.snsAuthenRewardType = value;
            __bitField0 |= 1073741824;
            return this;
        }

        public Builder clearSnsAuthenRewardType() {
            this.snsAuthenRewardType = 0;
            __bitField0 &= ~1073741824;
            return this;
        }

        public boolean hasSnsAuthenRewardType() {
            return (__bitField0 & 1073741824) == 1073741824;
        }

        public int getFriendFreeGiftSendAmount() {
            return friendFreeGiftSendAmount;
        }

        public Builder setFriendFreeGiftSendAmount(int value) {
            this.friendFreeGiftSendAmount = value;
            __bitField0 |= -2147483648;
            return this;
        }

        public Builder clearFriendFreeGiftSendAmount() {
            this.friendFreeGiftSendAmount = 0;
            __bitField0 &= ~-2147483648;
            return this;
        }

        public boolean hasFriendFreeGiftSendAmount() {
            return (__bitField0 & -2147483648) == -2147483648;
        }

        public int getFriendFreeGiftReceiveAmount() {
            return friendFreeGiftReceiveAmount;
        }

        public Builder setFriendFreeGiftReceiveAmount(int value) {
            this.friendFreeGiftReceiveAmount = value;
            __bitField1 |= 1;
            return this;
        }

        public Builder clearFriendFreeGiftReceiveAmount() {
            this.friendFreeGiftReceiveAmount = 0;
            __bitField1 &= ~1;
            return this;
        }

        public boolean hasFriendFreeGiftReceiveAmount() {
            return (__bitField1 & 1) == 1;
        }

        public int getFriendAddGiftAmount() {
            return friendAddGiftAmount;
        }

        public Builder setFriendAddGiftAmount(int value) {
            this.friendAddGiftAmount = value;
            __bitField1 |= 2;
            return this;
        }

        public Builder clearFriendAddGiftAmount() {
            this.friendAddGiftAmount = 0;
            __bitField1 &= ~2;
            return this;
        }

        public boolean hasFriendAddGiftAmount() {
            return (__bitField1 & 2) == 2;
        }

        public java.util.List<Integer> getGunBulletsList() {
            return gunBullets;
        }

        public Builder setGunBullets(int index, int value) {
            if(!((__bitField1 & 4) == 4)) {
                this.gunBullets = new java.util.ArrayList<>();
                __bitField1 |= 4;
            }
            this.gunBullets.set(index, value);
            return this;
        }

        public Builder addGunBullets(int value) {
            if(!((__bitField1 & 4) == 4)) {
                this.gunBullets = new java.util.ArrayList<>();
                __bitField1 |= 4;
            }
            this.gunBullets.add(value);
            return this;
        }

        public Builder addAllGunBullets(java.lang.Iterable<Integer> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set LoginResponse#gunBullets to null");
            }
            if(!((__bitField1 & 4) == 4)) {
                this.gunBullets = new java.util.ArrayList<>();
                __bitField1 |= 4;
            }
            for (final Integer value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set LoginResponse#gunBullets to null");
                }
                this.gunBullets.add(value);
            }
            return this;
        }

        public Builder clearGunBullets() {
            this.gunBullets = java.util.Collections.emptyList();
            __bitField1 &= ~4;
            return this;
        }

        public int getGunBulletsCount() {
            return gunBullets.size();
        }

        public int getGunBullets(int index) {
            return gunBullets.get(index);
        }

        public String getSnsServerToken() {
            return snsServerToken;
        }

        public Builder setSnsServerToken(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#snsServerToken to null");
            }

            this.snsServerToken = value;
            __bitField1 |= 8;
            return this;
        }

        public Builder clearSnsServerToken() {
            this.snsServerToken = "";
            __bitField1 &= ~8;
            return this;
        }

        public boolean hasSnsServerToken() {
            return (__bitField1 & 8) == 8;
        }

        public java.util.List<proto.message.IngameItem> getIngameItemsList() {
            return ingameItems;
        }

        public Builder setIngameItems(int index, proto.message.IngameItem value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#ingameItems to null");
            }

            if(!((__bitField1 & 16) == 16)) {
                this.ingameItems = new java.util.ArrayList<>();
                __bitField1 |= 16;
            }
            this.ingameItems.set(index, value);
            return this;
        }

        public Builder addIngameItems(proto.message.IngameItem value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#ingameItems to null");
            }

            if(!((__bitField1 & 16) == 16)) {
                this.ingameItems = new java.util.ArrayList<>();
                __bitField1 |= 16;
            }
            this.ingameItems.add(value);
            return this;
        }

        public Builder addAllIngameItems(java.lang.Iterable<proto.message.IngameItem> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set LoginResponse#ingameItems to null");
            }
            if(!((__bitField1 & 16) == 16)) {
                this.ingameItems = new java.util.ArrayList<>();
                __bitField1 |= 16;
            }
            for (final proto.message.IngameItem value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set LoginResponse#ingameItems to null");
                }
                this.ingameItems.add(value);
            }
            return this;
        }

        public Builder clearIngameItems() {
            this.ingameItems = java.util.Collections.emptyList();
            __bitField1 &= ~16;
            return this;
        }

        public int getIngameItemsCount() {
            return ingameItems.size();
        }

        public proto.message.IngameItem getIngameItems(int index) {
            return ingameItems.get(index);
        }

        public int getIngameRoseId() {
            return ingameRoseId;
        }

        public Builder setIngameRoseId(int value) {
            this.ingameRoseId = value;
            __bitField1 |= 32;
            return this;
        }

        public Builder clearIngameRoseId() {
            this.ingameRoseId = 0;
            __bitField1 &= ~32;
            return this;
        }

        public boolean hasIngameRoseId() {
            return (__bitField1 & 32) == 32;
        }

        public int getIngameRoseTime() {
            return ingameRoseTime;
        }

        public Builder setIngameRoseTime(int value) {
            this.ingameRoseTime = value;
            __bitField1 |= 64;
            return this;
        }

        public Builder clearIngameRoseTime() {
            this.ingameRoseTime = 0;
            __bitField1 &= ~64;
            return this;
        }

        public boolean hasIngameRoseTime() {
            return (__bitField1 & 64) == 64;
        }

        public int getIngameRoseMax() {
            return ingameRoseMax;
        }

        public Builder setIngameRoseMax(int value) {
            this.ingameRoseMax = value;
            __bitField1 |= 128;
            return this;
        }

        public Builder clearIngameRoseMax() {
            this.ingameRoseMax = 0;
            __bitField1 &= ~128;
            return this;
        }

        public boolean hasIngameRoseMax() {
            return (__bitField1 & 128) == 128;
        }

        public int getIngameSoloSendCoolDown() {
            return ingameSoloSendCoolDown;
        }

        public Builder setIngameSoloSendCoolDown(int value) {
            this.ingameSoloSendCoolDown = value;
            __bitField1 |= 256;
            return this;
        }

        public Builder clearIngameSoloSendCoolDown() {
            this.ingameSoloSendCoolDown = 0;
            __bitField1 &= ~256;
            return this;
        }

        public boolean hasIngameSoloSendCoolDown() {
            return (__bitField1 & 256) == 256;
        }

        public int getIngameSoloReceiveCoolDown() {
            return ingameSoloReceiveCoolDown;
        }

        public Builder setIngameSoloReceiveCoolDown(int value) {
            this.ingameSoloReceiveCoolDown = value;
            __bitField1 |= 512;
            return this;
        }

        public Builder clearIngameSoloReceiveCoolDown() {
            this.ingameSoloReceiveCoolDown = 0;
            __bitField1 &= ~512;
            return this;
        }

        public boolean hasIngameSoloReceiveCoolDown() {
            return (__bitField1 & 512) == 512;
        }

        public String getIngameNews() {
            return ingameNews;
        }

        public Builder setIngameNews(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#ingameNews to null");
            }

            this.ingameNews = value;
            __bitField1 |= 1024;
            return this;
        }

        public Builder clearIngameNews() {
            this.ingameNews = "";
            __bitField1 &= ~1024;
            return this;
        }

        public boolean hasIngameNews() {
            return (__bitField1 & 1024) == 1024;
        }

        public int getMinSoloMoney() {
            return minSoloMoney;
        }

        public Builder setMinSoloMoney(int value) {
            this.minSoloMoney = value;
            __bitField1 |= 2048;
            return this;
        }

        public Builder clearMinSoloMoney() {
            this.minSoloMoney = 0;
            __bitField1 &= ~2048;
            return this;
        }

        public boolean hasMinSoloMoney() {
            return (__bitField1 & 2048) == 2048;
        }

        public int getFirstGunChange() {
            return firstGunChange;
        }

        public Builder setFirstGunChange(int value) {
            this.firstGunChange = value;
            __bitField1 |= 4096;
            return this;
        }

        public Builder clearFirstGunChange() {
            this.firstGunChange = 0;
            __bitField1 &= ~4096;
            return this;
        }

        public boolean hasFirstGunChange() {
            return (__bitField1 & 4096) == 4096;
        }

        public int getPaymentEventNewCount() {
            return paymentEventNewCount;
        }

        public Builder setPaymentEventNewCount(int value) {
            this.paymentEventNewCount = value;
            __bitField1 |= 8192;
            return this;
        }

        public Builder clearPaymentEventNewCount() {
            this.paymentEventNewCount = 0;
            __bitField1 &= ~8192;
            return this;
        }

        public boolean hasPaymentEventNewCount() {
            return (__bitField1 & 8192) == 8192;
        }

        public java.util.List<String> getBetModeTypesList() {
            return betModeTypes;
        }

        public Builder setBetModeTypes(int index, String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#betModeTypes to null");
            }

            if(!((__bitField1 & 16384) == 16384)) {
                this.betModeTypes = new java.util.ArrayList<>();
                __bitField1 |= 16384;
            }
            this.betModeTypes.set(index, value);
            return this;
        }

        public Builder addBetModeTypes(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#betModeTypes to null");
            }

            if(!((__bitField1 & 16384) == 16384)) {
                this.betModeTypes = new java.util.ArrayList<>();
                __bitField1 |= 16384;
            }
            this.betModeTypes.add(value);
            return this;
        }

        public Builder addAllBetModeTypes(java.lang.Iterable<String> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set LoginResponse#betModeTypes to null");
            }
            if(!((__bitField1 & 16384) == 16384)) {
                this.betModeTypes = new java.util.ArrayList<>();
                __bitField1 |= 16384;
            }
            for (final String value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set LoginResponse#betModeTypes to null");
                }
                this.betModeTypes.add(value);
            }
            return this;
        }

        public Builder clearBetModeTypes() {
            this.betModeTypes = java.util.Collections.emptyList();
            __bitField1 &= ~16384;
            return this;
        }

        public int getBetModeTypesCount() {
            return betModeTypes.size();
        }

        public String getBetModeTypes(int index) {
            return betModeTypes.get(index);
        }

        public int getDailySupportCnt() {
            return dailySupportCnt;
        }

        public Builder setDailySupportCnt(int value) {
            this.dailySupportCnt = value;
            __bitField1 |= 32768;
            return this;
        }

        public Builder clearDailySupportCnt() {
            this.dailySupportCnt = 0;
            __bitField1 &= ~32768;
            return this;
        }

        public boolean hasDailySupportCnt() {
            return (__bitField1 & 32768) == 32768;
        }

        public int getMaxPearlAvailable() {
            return maxPearlAvailable;
        }

        public Builder setMaxPearlAvailable(int value) {
            this.maxPearlAvailable = value;
            __bitField1 |= 65536;
            return this;
        }

        public Builder clearMaxPearlAvailable() {
            this.maxPearlAvailable = 0;
            __bitField1 &= ~65536;
            return this;
        }

        public boolean hasMaxPearlAvailable() {
            return (__bitField1 & 65536) == 65536;
        }

        public java.util.List<proto.message.InventoryItem> getInventoryItemsList() {
            return inventoryItems;
        }

        public Builder setInventoryItems(int index, proto.message.InventoryItem value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#inventoryItems to null");
            }

            if(!((__bitField1 & 131072) == 131072)) {
                this.inventoryItems = new java.util.ArrayList<>();
                __bitField1 |= 131072;
            }
            this.inventoryItems.set(index, value);
            return this;
        }

        public Builder addInventoryItems(proto.message.InventoryItem value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#inventoryItems to null");
            }

            if(!((__bitField1 & 131072) == 131072)) {
                this.inventoryItems = new java.util.ArrayList<>();
                __bitField1 |= 131072;
            }
            this.inventoryItems.add(value);
            return this;
        }

        public Builder addAllInventoryItems(java.lang.Iterable<proto.message.InventoryItem> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set LoginResponse#inventoryItems to null");
            }
            if(!((__bitField1 & 131072) == 131072)) {
                this.inventoryItems = new java.util.ArrayList<>();
                __bitField1 |= 131072;
            }
            for (final proto.message.InventoryItem value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set LoginResponse#inventoryItems to null");
                }
                this.inventoryItems.add(value);
            }
            return this;
        }

        public Builder clearInventoryItems() {
            this.inventoryItems = java.util.Collections.emptyList();
            __bitField1 &= ~131072;
            return this;
        }

        public int getInventoryItemsCount() {
            return inventoryItems.size();
        }

        public proto.message.InventoryItem getInventoryItems(int index) {
            return inventoryItems.get(index);
        }

        public int getTicketBuffCnt() {
            return ticketBuffCnt;
        }

        public Builder setTicketBuffCnt(int value) {
            this.ticketBuffCnt = value;
            __bitField1 |= 262144;
            return this;
        }

        public Builder clearTicketBuffCnt() {
            this.ticketBuffCnt = 0;
            __bitField1 &= ~262144;
            return this;
        }

        public boolean hasTicketBuffCnt() {
            return (__bitField1 & 262144) == 262144;
        }

        public int getBradcastMsgInterval() {
            return bradcastMsgInterval;
        }

        public Builder setBradcastMsgInterval(int value) {
            this.bradcastMsgInterval = value;
            __bitField1 |= 524288;
            return this;
        }

        public Builder clearBradcastMsgInterval() {
            this.bradcastMsgInterval = 0;
            __bitField1 &= ~524288;
            return this;
        }

        public boolean hasBradcastMsgInterval() {
            return (__bitField1 & 524288) == 524288;
        }

        public int getDefaultPaymentSheet() {
            return defaultPaymentSheet;
        }

        public Builder setDefaultPaymentSheet(int value) {
            this.defaultPaymentSheet = value;
            __bitField1 |= 1048576;
            return this;
        }

        public Builder clearDefaultPaymentSheet() {
            this.defaultPaymentSheet = 0;
            __bitField1 &= ~1048576;
            return this;
        }

        public boolean hasDefaultPaymentSheet() {
            return (__bitField1 & 1048576) == 1048576;
        }

        public boolean getHappyPlayChannelOpen() {
            return happyPlayChannelOpen;
        }

        public Builder setHappyPlayChannelOpen(boolean value) {
            this.happyPlayChannelOpen = value;
            __bitField1 |= 2097152;
            return this;
        }

        public Builder clearHappyPlayChannelOpen() {
            this.happyPlayChannelOpen = false;
            __bitField1 &= ~2097152;
            return this;
        }

        public boolean hasHappyPlayChannelOpen() {
            return (__bitField1 & 2097152) == 2097152;
        }

        public int getHappyPlayCount() {
            return happyPlayCount;
        }

        public Builder setHappyPlayCount(int value) {
            this.happyPlayCount = value;
            __bitField1 |= 4194304;
            return this;
        }

        public Builder clearHappyPlayCount() {
            this.happyPlayCount = 0;
            __bitField1 &= ~4194304;
            return this;
        }

        public boolean hasHappyPlayCount() {
            return (__bitField1 & 4194304) == 4194304;
        }

        public int getHappyPlayEventNewCount() {
            return happyPlayEventNewCount;
        }

        public Builder setHappyPlayEventNewCount(int value) {
            this.happyPlayEventNewCount = value;
            __bitField1 |= 8388608;
            return this;
        }

        public Builder clearHappyPlayEventNewCount() {
            this.happyPlayEventNewCount = 0;
            __bitField1 &= ~8388608;
            return this;
        }

        public boolean hasHappyPlayEventNewCount() {
            return (__bitField1 & 8388608) == 8388608;
        }

        public int getDefaultHappyPlaySheet() {
            return defaultHappyPlaySheet;
        }

        public Builder setDefaultHappyPlaySheet(int value) {
            this.defaultHappyPlaySheet = value;
            __bitField1 |= 16777216;
            return this;
        }

        public Builder clearDefaultHappyPlaySheet() {
            this.defaultHappyPlaySheet = 0;
            __bitField1 &= ~16777216;
            return this;
        }

        public boolean hasDefaultHappyPlaySheet() {
            return (__bitField1 & 16777216) == 16777216;
        }

        public int getBucketGame() {
            return bucketGame;
        }

        public Builder setBucketGame(int value) {
            this.bucketGame = value;
            __bitField1 |= 33554432;
            return this;
        }

        public Builder clearBucketGame() {
            this.bucketGame = 0;
            __bitField1 &= ~33554432;
            return this;
        }

        public boolean hasBucketGame() {
            return (__bitField1 & 33554432) == 33554432;
        }

        public int getBucketMoney() {
            return bucketMoney;
        }

        public Builder setBucketMoney(int value) {
            this.bucketMoney = value;
            __bitField1 |= 67108864;
            return this;
        }

        public Builder clearBucketMoney() {
            this.bucketMoney = 0;
            __bitField1 &= ~67108864;
            return this;
        }

        public boolean hasBucketMoney() {
            return (__bitField1 & 67108864) == 67108864;
        }

        public int getMaxAdsViewPerDay() {
            return maxAdsViewPerDay;
        }

        public Builder setMaxAdsViewPerDay(int value) {
            this.maxAdsViewPerDay = value;
            __bitField1 |= 134217728;
            return this;
        }

        public Builder clearMaxAdsViewPerDay() {
            this.maxAdsViewPerDay = 0;
            __bitField1 &= ~134217728;
            return this;
        }

        public boolean hasMaxAdsViewPerDay() {
            return (__bitField1 & 134217728) == 134217728;
        }

        public int getCurrentAdsViewPerDay() {
            return currentAdsViewPerDay;
        }

        public Builder setCurrentAdsViewPerDay(int value) {
            this.currentAdsViewPerDay = value;
            __bitField1 |= 268435456;
            return this;
        }

        public Builder clearCurrentAdsViewPerDay() {
            this.currentAdsViewPerDay = 0;
            __bitField1 &= ~268435456;
            return this;
        }

        public boolean hasCurrentAdsViewPerDay() {
            return (__bitField1 & 268435456) == 268435456;
        }

        public int getTimeZoneOffset() {
            return timeZoneOffset;
        }

        public Builder setTimeZoneOffset(int value) {
            this.timeZoneOffset = value;
            __bitField1 |= 536870912;
            return this;
        }

        public Builder clearTimeZoneOffset() {
            this.timeZoneOffset = 0;
            __bitField1 &= ~536870912;
            return this;
        }

        public boolean hasTimeZoneOffset() {
            return (__bitField1 & 536870912) == 536870912;
        }

        public java.util.List<proto.message.ShareData> getShareDataList() {
            return shareData;
        }

        public Builder setShareData(int index, proto.message.ShareData value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#shareData to null");
            }

            if(!((__bitField1 & 1073741824) == 1073741824)) {
                this.shareData = new java.util.ArrayList<>();
                __bitField1 |= 1073741824;
            }
            this.shareData.set(index, value);
            return this;
        }

        public Builder addShareData(proto.message.ShareData value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#shareData to null");
            }

            if(!((__bitField1 & 1073741824) == 1073741824)) {
                this.shareData = new java.util.ArrayList<>();
                __bitField1 |= 1073741824;
            }
            this.shareData.add(value);
            return this;
        }

        public Builder addAllShareData(java.lang.Iterable<proto.message.ShareData> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set LoginResponse#shareData to null");
            }
            if(!((__bitField1 & 1073741824) == 1073741824)) {
                this.shareData = new java.util.ArrayList<>();
                __bitField1 |= 1073741824;
            }
            for (final proto.message.ShareData value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set LoginResponse#shareData to null");
                }
                this.shareData.add(value);
            }
            return this;
        }

        public Builder clearShareData() {
            this.shareData = java.util.Collections.emptyList();
            __bitField1 &= ~1073741824;
            return this;
        }

        public int getShareDataCount() {
            return shareData.size();
        }

        public proto.message.ShareData getShareData(int index) {
            return shareData.get(index);
        }

        public java.util.List<String> getNewsImageLinksList() {
            return newsImageLinks;
        }

        public Builder setNewsImageLinks(int index, String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#newsImageLinks to null");
            }

            if(!((__bitField1 & -2147483648) == -2147483648)) {
                this.newsImageLinks = new java.util.ArrayList<>();
                __bitField1 |= -2147483648;
            }
            this.newsImageLinks.set(index, value);
            return this;
        }

        public Builder addNewsImageLinks(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#newsImageLinks to null");
            }

            if(!((__bitField1 & -2147483648) == -2147483648)) {
                this.newsImageLinks = new java.util.ArrayList<>();
                __bitField1 |= -2147483648;
            }
            this.newsImageLinks.add(value);
            return this;
        }

        public Builder addAllNewsImageLinks(java.lang.Iterable<String> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set LoginResponse#newsImageLinks to null");
            }
            if(!((__bitField1 & -2147483648) == -2147483648)) {
                this.newsImageLinks = new java.util.ArrayList<>();
                __bitField1 |= -2147483648;
            }
            for (final String value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set LoginResponse#newsImageLinks to null");
                }
                this.newsImageLinks.add(value);
            }
            return this;
        }

        public Builder clearNewsImageLinks() {
            this.newsImageLinks = java.util.Collections.emptyList();
            __bitField1 &= ~-2147483648;
            return this;
        }

        public int getNewsImageLinksCount() {
            return newsImageLinks.size();
        }

        public String getNewsImageLinks(int index) {
            return newsImageLinks.get(index);
        }

        public String getOnelink() {
            return onelink;
        }

        public Builder setOnelink(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set LoginResponse#onelink to null");
            }

            this.onelink = value;
            __bitField2 |= 1;
            return this;
        }

        public Builder clearOnelink() {
            this.onelink = "";
            __bitField2 &= ~1;
            return this;
        }

        public boolean hasOnelink() {
            return (__bitField2 & 1) == 1;
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
            if (!java.util.Objects.equals(this.userID, that.userID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.password, that.password)) {
                return false;
            }
            if (!java.util.Objects.equals(this.userName, that.userName)) {
                return false;
            }
            if (!java.util.Objects.equals(this.loginGift, that.loginGift)) {
                return false;
            }
            if (!java.util.Objects.equals(this.serverTime, that.serverTime)) {
                return false;
            }
            if (!java.util.Objects.equals(this.paymentChannelOpen, that.paymentChannelOpen)) {
                return false;
            }
            if (!java.util.Objects.equals(this.csEmail, that.csEmail)) {
                return false;
            }
            if (!java.util.Objects.equals(this.csPhone, that.csPhone)) {
                return false;
            }
            if (!java.util.Objects.equals(this.csWeb, that.csWeb)) {
                return false;
            }
            if (!java.util.Objects.equals(this.fbAvatar, that.fbAvatar)) {
                return false;
            }
            if (!java.util.Objects.equals(this.banTo, that.banTo)) {
                return false;
            }
            if (!java.util.Objects.equals(this.banReason, that.banReason)) {
                return false;
            }
            if (!java.util.Objects.equals(this.flag, that.flag)) {
                return false;
            }
            if (!java.util.Objects.equals(this.notifyMsg, that.notifyMsg)) {
                return false;
            }
            if (!java.util.Objects.equals(this.androidUrl, that.androidUrl)) {
                return false;
            }
            if (!java.util.Objects.equals(this.iosUrl, that.iosUrl)) {
                return false;
            }
            if (!java.util.Objects.equals(this.wpUrl, that.wpUrl)) {
                return false;
            }
            if (!java.util.Objects.equals(this.clientVersion, that.clientVersion)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gameHints, that.gameHints)) {
                return false;
            }
            if (!java.util.Objects.equals(this.paymentCount, that.paymentCount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.facebookID, that.facebookID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.zaloID, that.zaloID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.betModeOpen, that.betModeOpen)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gameFuncs, that.gameFuncs)) {
                return false;
            }
            if (!java.util.Objects.equals(this.betModeMin, that.betModeMin)) {
                return false;
            }
            if (!java.util.Objects.equals(this.isNewRegister, that.isNewRegister)) {
                return false;
            }
            if (!java.util.Objects.equals(this.betModeRoomStep, that.betModeRoomStep)) {
                return false;
            }
            if (!java.util.Objects.equals(this.snsAuthenRewardAmount, that.snsAuthenRewardAmount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.snsAuthenRewardType, that.snsAuthenRewardType)) {
                return false;
            }
            if (!java.util.Objects.equals(this.friendFreeGiftSendAmount, that.friendFreeGiftSendAmount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.friendFreeGiftReceiveAmount, that.friendFreeGiftReceiveAmount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.friendAddGiftAmount, that.friendAddGiftAmount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.gunBullets, that.gunBullets)) {
                return false;
            }
            if (!java.util.Objects.equals(this.snsServerToken, that.snsServerToken)) {
                return false;
            }
            if (!java.util.Objects.equals(this.ingameItems, that.ingameItems)) {
                return false;
            }
            if (!java.util.Objects.equals(this.ingameRoseId, that.ingameRoseId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.ingameRoseTime, that.ingameRoseTime)) {
                return false;
            }
            if (!java.util.Objects.equals(this.ingameRoseMax, that.ingameRoseMax)) {
                return false;
            }
            if (!java.util.Objects.equals(this.ingameSoloSendCoolDown, that.ingameSoloSendCoolDown)) {
                return false;
            }
            if (!java.util.Objects.equals(this.ingameSoloReceiveCoolDown, that.ingameSoloReceiveCoolDown)) {
                return false;
            }
            if (!java.util.Objects.equals(this.ingameNews, that.ingameNews)) {
                return false;
            }
            if (!java.util.Objects.equals(this.minSoloMoney, that.minSoloMoney)) {
                return false;
            }
            if (!java.util.Objects.equals(this.firstGunChange, that.firstGunChange)) {
                return false;
            }
            if (!java.util.Objects.equals(this.paymentEventNewCount, that.paymentEventNewCount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.betModeTypes, that.betModeTypes)) {
                return false;
            }
            if (!java.util.Objects.equals(this.dailySupportCnt, that.dailySupportCnt)) {
                return false;
            }
            if (!java.util.Objects.equals(this.maxPearlAvailable, that.maxPearlAvailable)) {
                return false;
            }
            if (!java.util.Objects.equals(this.inventoryItems, that.inventoryItems)) {
                return false;
            }
            if (!java.util.Objects.equals(this.ticketBuffCnt, that.ticketBuffCnt)) {
                return false;
            }
            if (!java.util.Objects.equals(this.bradcastMsgInterval, that.bradcastMsgInterval)) {
                return false;
            }
            if (!java.util.Objects.equals(this.defaultPaymentSheet, that.defaultPaymentSheet)) {
                return false;
            }
            if (!java.util.Objects.equals(this.happyPlayChannelOpen, that.happyPlayChannelOpen)) {
                return false;
            }
            if (!java.util.Objects.equals(this.happyPlayCount, that.happyPlayCount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.happyPlayEventNewCount, that.happyPlayEventNewCount)) {
                return false;
            }
            if (!java.util.Objects.equals(this.defaultHappyPlaySheet, that.defaultHappyPlaySheet)) {
                return false;
            }
            if (!java.util.Objects.equals(this.bucketGame, that.bucketGame)) {
                return false;
            }
            if (!java.util.Objects.equals(this.bucketMoney, that.bucketMoney)) {
                return false;
            }
            if (!java.util.Objects.equals(this.maxAdsViewPerDay, that.maxAdsViewPerDay)) {
                return false;
            }
            if (!java.util.Objects.equals(this.currentAdsViewPerDay, that.currentAdsViewPerDay)) {
                return false;
            }
            if (!java.util.Objects.equals(this.timeZoneOffset, that.timeZoneOffset)) {
                return false;
            }
            if (!java.util.Objects.equals(this.shareData, that.shareData)) {
                return false;
            }
            if (!java.util.Objects.equals(this.newsImageLinks, that.newsImageLinks)) {
                return false;
            }
            if (!java.util.Objects.equals(this.onelink, that.onelink)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.result);
            result = 31 * result + (this.content == null ? 0 : this.content.hashCode());
            result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
            result = 31 * result + (this.password == null ? 0 : this.password.hashCode());
            result = 31 * result + (this.userName == null ? 0 : this.userName.hashCode());
            result = 31 * result + (this.loginGift == null ? 0 : this.loginGift.hashCode());
            result = 31 * result + Integer.hashCode(this.serverTime);
            result = 31 * result + Boolean.hashCode(this.paymentChannelOpen);
            result = 31 * result + (this.csEmail == null ? 0 : this.csEmail.hashCode());
            result = 31 * result + (this.csPhone == null ? 0 : this.csPhone.hashCode());
            result = 31 * result + (this.csWeb == null ? 0 : this.csWeb.hashCode());
            result = 31 * result + (this.fbAvatar == null ? 0 : this.fbAvatar.hashCode());
            result = 31 * result + Integer.hashCode(this.banTo);
            result = 31 * result + (this.banReason == null ? 0 : this.banReason.hashCode());
            result = 31 * result + Integer.hashCode(this.flag);
            result = 31 * result + (this.notifyMsg == null ? 0 : this.notifyMsg.hashCode());
            result = 31 * result + (this.androidUrl == null ? 0 : this.androidUrl.hashCode());
            result = 31 * result + (this.iosUrl == null ? 0 : this.iosUrl.hashCode());
            result = 31 * result + (this.wpUrl == null ? 0 : this.wpUrl.hashCode());
            result = 31 * result + Integer.hashCode(this.clientVersion);
            result = 31 * result + (this.gameHints == null ? 0 : this.gameHints.hashCode());
            result = 31 * result + Integer.hashCode(this.paymentCount);
            result = 31 * result + (this.facebookID == null ? 0 : this.facebookID.hashCode());
            result = 31 * result + (this.zaloID == null ? 0 : this.zaloID.hashCode());
            result = 31 * result + Boolean.hashCode(this.betModeOpen);
            result = 31 * result + (this.gameFuncs == null ? 0 : this.gameFuncs.hashCode());
            result = 31 * result + Integer.hashCode(this.betModeMin);
            result = 31 * result + Boolean.hashCode(this.isNewRegister);
            result = 31 * result + Integer.hashCode(this.betModeRoomStep);
            result = 31 * result + Integer.hashCode(this.snsAuthenRewardAmount);
            result = 31 * result + Integer.hashCode(this.snsAuthenRewardType);
            result = 31 * result + Integer.hashCode(this.friendFreeGiftSendAmount);
            result = 31 * result + Integer.hashCode(this.friendFreeGiftReceiveAmount);
            result = 31 * result + Integer.hashCode(this.friendAddGiftAmount);
            result = 31 * result + (this.gunBullets == null ? 0 : this.gunBullets.hashCode());
            result = 31 * result + (this.snsServerToken == null ? 0 : this.snsServerToken.hashCode());
            result = 31 * result + (this.ingameItems == null ? 0 : this.ingameItems.hashCode());
            result = 31 * result + Integer.hashCode(this.ingameRoseId);
            result = 31 * result + Integer.hashCode(this.ingameRoseTime);
            result = 31 * result + Integer.hashCode(this.ingameRoseMax);
            result = 31 * result + Integer.hashCode(this.ingameSoloSendCoolDown);
            result = 31 * result + Integer.hashCode(this.ingameSoloReceiveCoolDown);
            result = 31 * result + (this.ingameNews == null ? 0 : this.ingameNews.hashCode());
            result = 31 * result + Integer.hashCode(this.minSoloMoney);
            result = 31 * result + Integer.hashCode(this.firstGunChange);
            result = 31 * result + Integer.hashCode(this.paymentEventNewCount);
            result = 31 * result + (this.betModeTypes == null ? 0 : this.betModeTypes.hashCode());
            result = 31 * result + Integer.hashCode(this.dailySupportCnt);
            result = 31 * result + Integer.hashCode(this.maxPearlAvailable);
            result = 31 * result + (this.inventoryItems == null ? 0 : this.inventoryItems.hashCode());
            result = 31 * result + Integer.hashCode(this.ticketBuffCnt);
            result = 31 * result + Integer.hashCode(this.bradcastMsgInterval);
            result = 31 * result + Integer.hashCode(this.defaultPaymentSheet);
            result = 31 * result + Boolean.hashCode(this.happyPlayChannelOpen);
            result = 31 * result + Integer.hashCode(this.happyPlayCount);
            result = 31 * result + Integer.hashCode(this.happyPlayEventNewCount);
            result = 31 * result + Integer.hashCode(this.defaultHappyPlaySheet);
            result = 31 * result + Integer.hashCode(this.bucketGame);
            result = 31 * result + Integer.hashCode(this.bucketMoney);
            result = 31 * result + Integer.hashCode(this.maxAdsViewPerDay);
            result = 31 * result + Integer.hashCode(this.currentAdsViewPerDay);
            result = 31 * result + Integer.hashCode(this.timeZoneOffset);
            result = 31 * result + (this.shareData == null ? 0 : this.shareData.hashCode());
            result = 31 * result + (this.newsImageLinks == null ? 0 : this.newsImageLinks.hashCode());
            result = 31 * result + (this.onelink == null ? 0 : this.onelink.hashCode());

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
            if (hasUserID()) {
                parts.add("userID=" + getUserID());
            }
            if (hasPassword()) {
                parts.add("password=" + getPassword());
            }
            if (hasUserName()) {
                parts.add("userName=" + getUserName());
            }
            if (!loginGift.isEmpty()) {
                parts.add("loginGift=" + getLoginGiftList());
            }
            if (hasServerTime()) {
                parts.add("serverTime=" + getServerTime());
            }
            if (hasPaymentChannelOpen()) {
                parts.add("paymentChannelOpen=" + getPaymentChannelOpen());
            }
            if (hasCsEmail()) {
                parts.add("csEmail=" + getCsEmail());
            }
            if (hasCsPhone()) {
                parts.add("csPhone=" + getCsPhone());
            }
            if (hasCsWeb()) {
                parts.add("csWeb=" + getCsWeb());
            }
            if (hasFbAvatar()) {
                parts.add("fbAvatar=" + getFbAvatar());
            }
            if (hasBanTo()) {
                parts.add("banTo=" + getBanTo());
            }
            if (hasBanReason()) {
                parts.add("banReason=" + getBanReason());
            }
            if (hasFlag()) {
                parts.add("flag=" + getFlag());
            }
            if (hasNotifyMsg()) {
                parts.add("notifyMsg=" + getNotifyMsg());
            }
            if (hasAndroidUrl()) {
                parts.add("androidUrl=" + getAndroidUrl());
            }
            if (hasIosUrl()) {
                parts.add("iosUrl=" + getIosUrl());
            }
            if (hasWpUrl()) {
                parts.add("wpUrl=" + getWpUrl());
            }
            if (hasClientVersion()) {
                parts.add("clientVersion=" + getClientVersion());
            }
            if (!gameHints.isEmpty()) {
                parts.add("gameHints=" + getGameHintsList());
            }
            if (hasPaymentCount()) {
                parts.add("paymentCount=" + getPaymentCount());
            }
            if (hasFacebookID()) {
                parts.add("facebookID=" + getFacebookID());
            }
            if (hasZaloID()) {
                parts.add("zaloID=" + getZaloID());
            }
            if (hasBetModeOpen()) {
                parts.add("betModeOpen=" + getBetModeOpen());
            }
            if (!gameFuncs.isEmpty()) {
                parts.add("gameFuncs=" + getGameFuncsList());
            }
            if (hasBetModeMin()) {
                parts.add("betModeMin=" + getBetModeMin());
            }
            if (hasIsNewRegister()) {
                parts.add("isNewRegister=" + getIsNewRegister());
            }
            if (hasBetModeRoomStep()) {
                parts.add("betModeRoomStep=" + getBetModeRoomStep());
            }
            if (hasSnsAuthenRewardAmount()) {
                parts.add("snsAuthenRewardAmount=" + getSnsAuthenRewardAmount());
            }
            if (hasSnsAuthenRewardType()) {
                parts.add("snsAuthenRewardType=" + getSnsAuthenRewardType());
            }
            if (hasFriendFreeGiftSendAmount()) {
                parts.add("friendFreeGiftSendAmount=" + getFriendFreeGiftSendAmount());
            }
            if (hasFriendFreeGiftReceiveAmount()) {
                parts.add("friendFreeGiftReceiveAmount=" + getFriendFreeGiftReceiveAmount());
            }
            if (hasFriendAddGiftAmount()) {
                parts.add("friendAddGiftAmount=" + getFriendAddGiftAmount());
            }
            if (!gunBullets.isEmpty()) {
                parts.add("gunBullets=" + getGunBulletsList());
            }
            if (hasSnsServerToken()) {
                parts.add("snsServerToken=" + getSnsServerToken());
            }
            if (!ingameItems.isEmpty()) {
                parts.add("ingameItems=" + getIngameItemsList());
            }
            if (hasIngameRoseId()) {
                parts.add("ingameRoseId=" + getIngameRoseId());
            }
            if (hasIngameRoseTime()) {
                parts.add("ingameRoseTime=" + getIngameRoseTime());
            }
            if (hasIngameRoseMax()) {
                parts.add("ingameRoseMax=" + getIngameRoseMax());
            }
            if (hasIngameSoloSendCoolDown()) {
                parts.add("ingameSoloSendCoolDown=" + getIngameSoloSendCoolDown());
            }
            if (hasIngameSoloReceiveCoolDown()) {
                parts.add("ingameSoloReceiveCoolDown=" + getIngameSoloReceiveCoolDown());
            }
            if (hasIngameNews()) {
                parts.add("ingameNews=" + getIngameNews());
            }
            if (hasMinSoloMoney()) {
                parts.add("minSoloMoney=" + getMinSoloMoney());
            }
            if (hasFirstGunChange()) {
                parts.add("firstGunChange=" + getFirstGunChange());
            }
            if (hasPaymentEventNewCount()) {
                parts.add("paymentEventNewCount=" + getPaymentEventNewCount());
            }
            if (!betModeTypes.isEmpty()) {
                parts.add("betModeTypes=" + getBetModeTypesList());
            }
            if (hasDailySupportCnt()) {
                parts.add("dailySupportCnt=" + getDailySupportCnt());
            }
            if (hasMaxPearlAvailable()) {
                parts.add("maxPearlAvailable=" + getMaxPearlAvailable());
            }
            if (!inventoryItems.isEmpty()) {
                parts.add("inventoryItems=" + getInventoryItemsList());
            }
            if (hasTicketBuffCnt()) {
                parts.add("ticketBuffCnt=" + getTicketBuffCnt());
            }
            if (hasBradcastMsgInterval()) {
                parts.add("bradcastMsgInterval=" + getBradcastMsgInterval());
            }
            if (hasDefaultPaymentSheet()) {
                parts.add("defaultPaymentSheet=" + getDefaultPaymentSheet());
            }
            if (hasHappyPlayChannelOpen()) {
                parts.add("happyPlayChannelOpen=" + getHappyPlayChannelOpen());
            }
            if (hasHappyPlayCount()) {
                parts.add("happyPlayCount=" + getHappyPlayCount());
            }
            if (hasHappyPlayEventNewCount()) {
                parts.add("happyPlayEventNewCount=" + getHappyPlayEventNewCount());
            }
            if (hasDefaultHappyPlaySheet()) {
                parts.add("defaultHappyPlaySheet=" + getDefaultHappyPlaySheet());
            }
            if (hasBucketGame()) {
                parts.add("bucketGame=" + getBucketGame());
            }
            if (hasBucketMoney()) {
                parts.add("bucketMoney=" + getBucketMoney());
            }
            if (hasMaxAdsViewPerDay()) {
                parts.add("maxAdsViewPerDay=" + getMaxAdsViewPerDay());
            }
            if (hasCurrentAdsViewPerDay()) {
                parts.add("currentAdsViewPerDay=" + getCurrentAdsViewPerDay());
            }
            if (hasTimeZoneOffset()) {
                parts.add("timeZoneOffset=" + getTimeZoneOffset());
            }
            if (!shareData.isEmpty()) {
                parts.add("shareData=" + getShareDataList());
            }
            if (!newsImageLinks.isEmpty()) {
                parts.add("newsImageLinks=" + getNewsImageLinksList());
            }
            if (hasOnelink()) {
                parts.add("onelink=" + getOnelink());
            }
            return "LoginResponse{" + String.join(", ", parts) + "}";
        }

        public LoginResponse build() {
            proto.message.LoginResponse result = new proto.message.LoginResponse();
            result.__bitField0 = __bitField0;
            result.__bitField1 = __bitField1;
            result.__bitField2 = __bitField2;
            result.result = this.result;
            result.content = this.content;
            result.userID = this.userID;
            result.password = this.password;
            result.userName = this.userName;
            result.loginGift = java.util.Collections.unmodifiableList(this.loginGift);
            result.serverTime = this.serverTime;
            result.paymentChannelOpen = this.paymentChannelOpen;
            result.csEmail = this.csEmail;
            result.csPhone = this.csPhone;
            result.csWeb = this.csWeb;
            result.fbAvatar = this.fbAvatar;
            result.banTo = this.banTo;
            result.banReason = this.banReason;
            result.flag = this.flag;
            result.notifyMsg = this.notifyMsg;
            result.androidUrl = this.androidUrl;
            result.iosUrl = this.iosUrl;
            result.wpUrl = this.wpUrl;
            result.clientVersion = this.clientVersion;
            result.gameHints = java.util.Collections.unmodifiableList(this.gameHints);
            result.paymentCount = this.paymentCount;
            result.facebookID = this.facebookID;
            result.zaloID = this.zaloID;
            result.betModeOpen = this.betModeOpen;
            result.gameFuncs = java.util.Collections.unmodifiableList(this.gameFuncs);
            result.betModeMin = this.betModeMin;
            result.isNewRegister = this.isNewRegister;
            result.betModeRoomStep = this.betModeRoomStep;
            result.snsAuthenRewardAmount = this.snsAuthenRewardAmount;
            result.snsAuthenRewardType = this.snsAuthenRewardType;
            result.friendFreeGiftSendAmount = this.friendFreeGiftSendAmount;
            result.friendFreeGiftReceiveAmount = this.friendFreeGiftReceiveAmount;
            result.friendAddGiftAmount = this.friendAddGiftAmount;
            result.gunBullets = java.util.Collections.unmodifiableList(this.gunBullets);
            result.snsServerToken = this.snsServerToken;
            result.ingameItems = java.util.Collections.unmodifiableList(this.ingameItems);
            result.ingameRoseId = this.ingameRoseId;
            result.ingameRoseTime = this.ingameRoseTime;
            result.ingameRoseMax = this.ingameRoseMax;
            result.ingameSoloSendCoolDown = this.ingameSoloSendCoolDown;
            result.ingameSoloReceiveCoolDown = this.ingameSoloReceiveCoolDown;
            result.ingameNews = this.ingameNews;
            result.minSoloMoney = this.minSoloMoney;
            result.firstGunChange = this.firstGunChange;
            result.paymentEventNewCount = this.paymentEventNewCount;
            result.betModeTypes = java.util.Collections.unmodifiableList(this.betModeTypes);
            result.dailySupportCnt = this.dailySupportCnt;
            result.maxPearlAvailable = this.maxPearlAvailable;
            result.inventoryItems = java.util.Collections.unmodifiableList(this.inventoryItems);
            result.ticketBuffCnt = this.ticketBuffCnt;
            result.bradcastMsgInterval = this.bradcastMsgInterval;
            result.defaultPaymentSheet = this.defaultPaymentSheet;
            result.happyPlayChannelOpen = this.happyPlayChannelOpen;
            result.happyPlayCount = this.happyPlayCount;
            result.happyPlayEventNewCount = this.happyPlayEventNewCount;
            result.defaultHappyPlaySheet = this.defaultHappyPlaySheet;
            result.bucketGame = this.bucketGame;
            result.bucketMoney = this.bucketMoney;
            result.maxAdsViewPerDay = this.maxAdsViewPerDay;
            result.currentAdsViewPerDay = this.currentAdsViewPerDay;
            result.timeZoneOffset = this.timeZoneOffset;
            result.shareData = java.util.Collections.unmodifiableList(this.shareData);
            result.newsImageLinks = java.util.Collections.unmodifiableList(this.newsImageLinks);
            result.onelink = this.onelink;
            return result;
        }

    }

    public static final class LoginGift
            implements io.protostuff.Message<LoginGift> {

        private static final LoginGift DEFAULT_INSTANCE = newBuilder().build();

        private int itemType;

        private int itemAmount;

        private boolean __merge_lock = false;
        private int __bitField0;

        private LoginGift() {
            this.itemType = 0;
            this.itemAmount = 0;
        }

        private LoginGift(Builder builder) {
            __merge_lock = true;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public static LoginGift getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static io.protostuff.Schema<LoginGift> getSchema()
        {
        	return Schema.INSTANCE;
        }

        public int getItemType() {
            return itemType;
        }

        public boolean hasItemType() {
            return (__bitField0 & 1) == 1;
        }

        public LoginGift withItemType(int value) {
            return LoginGift.newBuilder()
                .mergeFrom(this)
                .setItemType(value)
                .build();
        }

        public int getItemAmount() {
            return itemAmount;
        }

        public boolean hasItemAmount() {
            return (__bitField0 & 2) == 2;
        }

        public LoginGift withItemAmount(int value) {
            return LoginGift.newBuilder()
                .mergeFrom(this)
                .setItemAmount(value)
                .build();
        }



        @Override
        public io.protostuff.Schema<LoginGift> cachedSchema() {
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
            LoginGift that = (LoginGift) obj;
            if (!java.util.Objects.equals(this.itemType, that.itemType)) {
                return false;
            }
            if (!java.util.Objects.equals(this.itemAmount, that.itemAmount)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.itemType);
            result = 31 * result + Integer.hashCode(this.itemAmount);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasItemType()) {
                parts.add("itemType=" + getItemType());
            }
            if (hasItemAmount()) {
                parts.add("itemAmount=" + getItemAmount());
            }
            return "LoginGift{" + String.join(", ", parts) + "}";
        }

        public static final class Schema implements io.protostuff.Schema<LoginGift>{

            private static final Schema INSTANCE = new Schema();

            private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

            static {
            	__fieldMap.put("itemType", 1);
            	__fieldMap.put("itemAmount", 2);
            }

            @Override
            public LoginGift newMessage() {
                return new LoginGift();
            }

            @Override
            public Class<LoginGift> typeClass() {
                return LoginGift.class;
            }

            @Override
            public String messageName() {
                return LoginGift.class.getSimpleName();
            }

            @Override
            public String messageFullName() {
                return LoginGift.class.getName();
            }

            @Override
            @Deprecated
            public boolean isInitialized(LoginGift message) {
                return true;
            }

            @Override
            public void mergeFrom(io.protostuff.Input input, LoginGift instance) throws java.io.IOException {
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
                        	instance.itemType = input.readInt32();
                        	instance.__bitField0 |= 1;
                        	break;
                        case 2:
                        	instance.itemAmount = input.readInt32();
                        	instance.__bitField0 |= 2;
                        	break;
                        default:
                            input.handleUnknownField(number, this);
                    }
            	}
            }

            @Override
            public void writeTo(io.protostuff.Output output, LoginGift instance) throws java.io.IOException {
                if((instance.__bitField0 & 1) == 1) {
                    output.writeInt32(1, instance.itemType, false);
                }

                if((instance.__bitField0 & 2) == 2) {
                    output.writeInt32(2, instance.itemAmount, false);
                }

            }

            @Override
            public String getFieldName(int number) {
            	switch(number) {
            		case 1: return "itemType";
            		case 2: return "itemAmount";
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

            private int itemType;

            private int itemAmount;

            private int __bitField0;

            private Builder() {
                this.itemType = 0;
                this.itemAmount = 0;
            }

            public Builder mergeFrom(LoginGift instance) {
                if (instance.hasItemType()) {
                    this.setItemType(instance.getItemType());
                }

                if (instance.hasItemAmount()) {
                    this.setItemAmount(instance.getItemAmount());
                }

                return this;
            }

            public int getItemType() {
                return itemType;
            }

            public Builder setItemType(int value) {
                this.itemType = value;
                __bitField0 |= 1;
                return this;
            }

            public Builder clearItemType() {
                this.itemType = 0;
                __bitField0 &= ~1;
                return this;
            }

            public boolean hasItemType() {
                return (__bitField0 & 1) == 1;
            }

            public int getItemAmount() {
                return itemAmount;
            }

            public Builder setItemAmount(int value) {
                this.itemAmount = value;
                __bitField0 |= 2;
                return this;
            }

            public Builder clearItemAmount() {
                this.itemAmount = 0;
                __bitField0 &= ~2;
                return this;
            }

            public boolean hasItemAmount() {
                return (__bitField0 & 2) == 2;
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
                if (!java.util.Objects.equals(this.itemType, that.itemType)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.itemAmount, that.itemAmount)) {
                    return false;
                }

                return true;
            }

            @Override
            public int hashCode() {
                int result = 1;
                result = 31 * result + Integer.hashCode(this.itemType);
                result = 31 * result + Integer.hashCode(this.itemAmount);

                return result;
            }

            @Override
            public String toString() {
                java.util.List<String> parts = new java.util.ArrayList<>();
                if (hasItemType()) {
                    parts.add("itemType=" + getItemType());
                }
                if (hasItemAmount()) {
                    parts.add("itemAmount=" + getItemAmount());
                }
                return "LoginGift{" + String.join(", ", parts) + "}";
            }

            public LoginGift build() {
                proto.message.LoginResponse.LoginGift result = new proto.message.LoginResponse.LoginGift();
                result.__bitField0 = __bitField0;
                result.itemType = this.itemType;
                result.itemAmount = this.itemAmount;
                return result;
            }

        }



    }


}