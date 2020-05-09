package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_happy_play.proto")
public final class HappyPlayMessage
        implements io.protostuff.Message<HappyPlayMessage> {

    private static final HappyPlayMessage DEFAULT_INSTANCE = newBuilder().build();

    private int command;

    private proto.message.HPAppleHPIAPInfoRequest msgHPAppleHPIAPInfoRequest;

    private proto.message.HPAppleHPIAPInfoResponse msgHPAppleHPIAPInfoResponse;

    private proto.message.HPAppleIAPBuyRequest msgHPAppleIAPBuyRequest;

    private proto.message.HPAppleIAPBuyResponse msgHPAppleIAPBuyResponse;

    private proto.message.HPGoogleHPIAPInfoRequest msgHPGoogleHPIAPInfoRequest;

    private proto.message.HPGoogleHPIAPInfoResponse msgHPGoogleHPIAPInfoResponse;

    private proto.message.HPGoogleIAPBuyRequest msgHPGoogleIAPBuyRequest;

    private proto.message.HPGoogleIAPBuyResponse msgHPGoogleIAPBuyResponse;

    private long clienttime;

    private proto.message.HPLOMInfoRequest msgHPLOMInfoRequest;

    private proto.message.HPLOMInfoResponse msgHPLOMInfoResponse;

    private proto.message.HPLOMUrlRequest msgHPLOMUrlRequest;

    private proto.message.HPLOMUrlResponse msgHPLOMUrlResponse;

    private proto.message.HPLOMBuyRequest msgHPLOMBuyRequest;

    private proto.message.HPLOMBuyResponse msgHPLOMBuyResponse;

    private proto.message.HPBPInfoRequest msgHPBPInfoRequest;

    private proto.message.HPBPInfoResponse msgHPBPInfoResponse;

    private proto.message.HPBPUrlRequest msgHPBPUrlRequest;

    private proto.message.HPBPUrlResponse msgHPBPUrlResponse;

    private proto.message.HPBPBuyRequest msgHPBPBuyRequest;

    private proto.message.HPBPBuyResponse msgHPBPBuyResponse;

    private proto.message.HPLOMGlobalInfoRequest msgHPLOMGlobalInfoRequest;

    private proto.message.HPLOMGlobalInfoResponse msgHPLOMGlobalInfoResponse;

    private proto.message.HPLOMGlobalUrlRequest msgHPLOMGlobalUrlRequest;

    private proto.message.HPLOMGlobalUrlResponse msgHPLOMGlobalUrlResponse;

    private proto.message.HPLOMGlobalBuyRequest msgHPLOMGlobalBuyRequest;

    private proto.message.HPLOMGlobalBuyResponse msgHPLOMGlobalBuyResponse;

    private proto.message.HPPromotionInfoRequest msgHPPromotionInfoRequest;

    private proto.message.HPPromotionInfoResponse msgHPPromotionInfoResponse;

    private proto.message.HPBoosterPackInfoRequest msgHPBoosterPackInfoRequest;

    private proto.message.HPBoosterPackInfoResponse msgHPBoosterPackInforResponse;

    private proto.message.HPCDInfoRequest msgHPCDInfoRequest;

    private proto.message.HPCDInfoResponse msgHPCDInfoResponse;

    private proto.message.HPCDBuyRequest msgHPCDBuyRequest;

    private proto.message.HPCDBuyResponse msgHPCDBuyResponse;

    private proto.message.HPSpecialOfferPackInfoRequest msgHPSpecialOfferPackInfoRequest;

    private proto.message.HPSpecialOfferPackInfoResponse msgHPSpecialOfferPackInforResponse;

    private boolean __merge_lock = false;
    private int __bitField0;
    private int __bitField1;

    private HappyPlayMessage() {
        this.command = proto.message.HPHappyPlayCommand.HAPPY_PLAY_REFUND_EVENT_REQUEST.getNumber();
        this.msgHPAppleHPIAPInfoRequest = proto.message.HPAppleHPIAPInfoRequest.getDefaultInstance();
        this.msgHPAppleHPIAPInfoResponse = proto.message.HPAppleHPIAPInfoResponse.getDefaultInstance();
        this.msgHPAppleIAPBuyRequest = proto.message.HPAppleIAPBuyRequest.getDefaultInstance();
        this.msgHPAppleIAPBuyResponse = proto.message.HPAppleIAPBuyResponse.getDefaultInstance();
        this.msgHPGoogleHPIAPInfoRequest = proto.message.HPGoogleHPIAPInfoRequest.getDefaultInstance();
        this.msgHPGoogleHPIAPInfoResponse = proto.message.HPGoogleHPIAPInfoResponse.getDefaultInstance();
        this.msgHPGoogleIAPBuyRequest = proto.message.HPGoogleIAPBuyRequest.getDefaultInstance();
        this.msgHPGoogleIAPBuyResponse = proto.message.HPGoogleIAPBuyResponse.getDefaultInstance();
        this.clienttime = 0L;
        this.msgHPLOMInfoRequest = proto.message.HPLOMInfoRequest.getDefaultInstance();
        this.msgHPLOMInfoResponse = proto.message.HPLOMInfoResponse.getDefaultInstance();
        this.msgHPLOMUrlRequest = proto.message.HPLOMUrlRequest.getDefaultInstance();
        this.msgHPLOMUrlResponse = proto.message.HPLOMUrlResponse.getDefaultInstance();
        this.msgHPLOMBuyRequest = proto.message.HPLOMBuyRequest.getDefaultInstance();
        this.msgHPLOMBuyResponse = proto.message.HPLOMBuyResponse.getDefaultInstance();
        this.msgHPBPInfoRequest = proto.message.HPBPInfoRequest.getDefaultInstance();
        this.msgHPBPInfoResponse = proto.message.HPBPInfoResponse.getDefaultInstance();
        this.msgHPBPUrlRequest = proto.message.HPBPUrlRequest.getDefaultInstance();
        this.msgHPBPUrlResponse = proto.message.HPBPUrlResponse.getDefaultInstance();
        this.msgHPBPBuyRequest = proto.message.HPBPBuyRequest.getDefaultInstance();
        this.msgHPBPBuyResponse = proto.message.HPBPBuyResponse.getDefaultInstance();
        this.msgHPLOMGlobalInfoRequest = proto.message.HPLOMGlobalInfoRequest.getDefaultInstance();
        this.msgHPLOMGlobalInfoResponse = proto.message.HPLOMGlobalInfoResponse.getDefaultInstance();
        this.msgHPLOMGlobalUrlRequest = proto.message.HPLOMGlobalUrlRequest.getDefaultInstance();
        this.msgHPLOMGlobalUrlResponse = proto.message.HPLOMGlobalUrlResponse.getDefaultInstance();
        this.msgHPLOMGlobalBuyRequest = proto.message.HPLOMGlobalBuyRequest.getDefaultInstance();
        this.msgHPLOMGlobalBuyResponse = proto.message.HPLOMGlobalBuyResponse.getDefaultInstance();
        this.msgHPPromotionInfoRequest = proto.message.HPPromotionInfoRequest.getDefaultInstance();
        this.msgHPPromotionInfoResponse = proto.message.HPPromotionInfoResponse.getDefaultInstance();
        this.msgHPBoosterPackInfoRequest = proto.message.HPBoosterPackInfoRequest.getDefaultInstance();
        this.msgHPBoosterPackInforResponse = proto.message.HPBoosterPackInfoResponse.getDefaultInstance();
        this.msgHPCDInfoRequest = proto.message.HPCDInfoRequest.getDefaultInstance();
        this.msgHPCDInfoResponse = proto.message.HPCDInfoResponse.getDefaultInstance();
        this.msgHPCDBuyRequest = proto.message.HPCDBuyRequest.getDefaultInstance();
        this.msgHPCDBuyResponse = proto.message.HPCDBuyResponse.getDefaultInstance();
        this.msgHPSpecialOfferPackInfoRequest = proto.message.HPSpecialOfferPackInfoRequest.getDefaultInstance();
        this.msgHPSpecialOfferPackInforResponse = proto.message.HPSpecialOfferPackInfoResponse.getDefaultInstance();
    }

    private HappyPlayMessage(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static HappyPlayMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<HappyPlayMessage> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public proto.message.HPHappyPlayCommand getCommand() {
        return proto.message.HPHappyPlayCommand.valueOf(command);
    }

    public int getCommandValue() {
        return command;
    }

    public boolean hasCommand() {
        return (__bitField0 & 1) == 1;
    }

    public HappyPlayMessage withCommand(proto.message.HPHappyPlayCommand value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setCommand(value)
            .build();
    }

    public proto.message.HPAppleHPIAPInfoRequest getMsgHPAppleHPIAPInfoRequest() {
        return msgHPAppleHPIAPInfoRequest;
    }

    public boolean hasMsgHPAppleHPIAPInfoRequest() {
        return (__bitField0 & 2) == 2;
    }

    public HappyPlayMessage withMsgHPAppleHPIAPInfoRequest(proto.message.HPAppleHPIAPInfoRequest value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPAppleHPIAPInfoRequest(value)
            .build();
    }

    public proto.message.HPAppleHPIAPInfoResponse getMsgHPAppleHPIAPInfoResponse() {
        return msgHPAppleHPIAPInfoResponse;
    }

    public boolean hasMsgHPAppleHPIAPInfoResponse() {
        return (__bitField0 & 4) == 4;
    }

    public HappyPlayMessage withMsgHPAppleHPIAPInfoResponse(proto.message.HPAppleHPIAPInfoResponse value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPAppleHPIAPInfoResponse(value)
            .build();
    }

    public proto.message.HPAppleIAPBuyRequest getMsgHPAppleIAPBuyRequest() {
        return msgHPAppleIAPBuyRequest;
    }

    public boolean hasMsgHPAppleIAPBuyRequest() {
        return (__bitField0 & 8) == 8;
    }

    public HappyPlayMessage withMsgHPAppleIAPBuyRequest(proto.message.HPAppleIAPBuyRequest value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPAppleIAPBuyRequest(value)
            .build();
    }

    public proto.message.HPAppleIAPBuyResponse getMsgHPAppleIAPBuyResponse() {
        return msgHPAppleIAPBuyResponse;
    }

    public boolean hasMsgHPAppleIAPBuyResponse() {
        return (__bitField0 & 16) == 16;
    }

    public HappyPlayMessage withMsgHPAppleIAPBuyResponse(proto.message.HPAppleIAPBuyResponse value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPAppleIAPBuyResponse(value)
            .build();
    }

    public proto.message.HPGoogleHPIAPInfoRequest getMsgHPGoogleHPIAPInfoRequest() {
        return msgHPGoogleHPIAPInfoRequest;
    }

    public boolean hasMsgHPGoogleHPIAPInfoRequest() {
        return (__bitField0 & 32) == 32;
    }

    public HappyPlayMessage withMsgHPGoogleHPIAPInfoRequest(proto.message.HPGoogleHPIAPInfoRequest value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPGoogleHPIAPInfoRequest(value)
            .build();
    }

    public proto.message.HPGoogleHPIAPInfoResponse getMsgHPGoogleHPIAPInfoResponse() {
        return msgHPGoogleHPIAPInfoResponse;
    }

    public boolean hasMsgHPGoogleHPIAPInfoResponse() {
        return (__bitField0 & 64) == 64;
    }

    public HappyPlayMessage withMsgHPGoogleHPIAPInfoResponse(proto.message.HPGoogleHPIAPInfoResponse value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPGoogleHPIAPInfoResponse(value)
            .build();
    }

    public proto.message.HPGoogleIAPBuyRequest getMsgHPGoogleIAPBuyRequest() {
        return msgHPGoogleIAPBuyRequest;
    }

    public boolean hasMsgHPGoogleIAPBuyRequest() {
        return (__bitField0 & 128) == 128;
    }

    public HappyPlayMessage withMsgHPGoogleIAPBuyRequest(proto.message.HPGoogleIAPBuyRequest value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPGoogleIAPBuyRequest(value)
            .build();
    }

    public proto.message.HPGoogleIAPBuyResponse getMsgHPGoogleIAPBuyResponse() {
        return msgHPGoogleIAPBuyResponse;
    }

    public boolean hasMsgHPGoogleIAPBuyResponse() {
        return (__bitField0 & 256) == 256;
    }

    public HappyPlayMessage withMsgHPGoogleIAPBuyResponse(proto.message.HPGoogleIAPBuyResponse value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPGoogleIAPBuyResponse(value)
            .build();
    }

    public long getClienttime() {
        return clienttime;
    }

    public boolean hasClienttime() {
        return (__bitField0 & 512) == 512;
    }

    public HappyPlayMessage withClienttime(long value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setClienttime(value)
            .build();
    }

    public proto.message.HPLOMInfoRequest getMsgHPLOMInfoRequest() {
        return msgHPLOMInfoRequest;
    }

    public boolean hasMsgHPLOMInfoRequest() {
        return (__bitField0 & 1024) == 1024;
    }

    public HappyPlayMessage withMsgHPLOMInfoRequest(proto.message.HPLOMInfoRequest value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPLOMInfoRequest(value)
            .build();
    }

    public proto.message.HPLOMInfoResponse getMsgHPLOMInfoResponse() {
        return msgHPLOMInfoResponse;
    }

    public boolean hasMsgHPLOMInfoResponse() {
        return (__bitField0 & 2048) == 2048;
    }

    public HappyPlayMessage withMsgHPLOMInfoResponse(proto.message.HPLOMInfoResponse value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPLOMInfoResponse(value)
            .build();
    }

    public proto.message.HPLOMUrlRequest getMsgHPLOMUrlRequest() {
        return msgHPLOMUrlRequest;
    }

    public boolean hasMsgHPLOMUrlRequest() {
        return (__bitField0 & 4096) == 4096;
    }

    public HappyPlayMessage withMsgHPLOMUrlRequest(proto.message.HPLOMUrlRequest value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPLOMUrlRequest(value)
            .build();
    }

    public proto.message.HPLOMUrlResponse getMsgHPLOMUrlResponse() {
        return msgHPLOMUrlResponse;
    }

    public boolean hasMsgHPLOMUrlResponse() {
        return (__bitField0 & 8192) == 8192;
    }

    public HappyPlayMessage withMsgHPLOMUrlResponse(proto.message.HPLOMUrlResponse value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPLOMUrlResponse(value)
            .build();
    }

    public proto.message.HPLOMBuyRequest getMsgHPLOMBuyRequest() {
        return msgHPLOMBuyRequest;
    }

    public boolean hasMsgHPLOMBuyRequest() {
        return (__bitField0 & 16384) == 16384;
    }

    public HappyPlayMessage withMsgHPLOMBuyRequest(proto.message.HPLOMBuyRequest value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPLOMBuyRequest(value)
            .build();
    }

    public proto.message.HPLOMBuyResponse getMsgHPLOMBuyResponse() {
        return msgHPLOMBuyResponse;
    }

    public boolean hasMsgHPLOMBuyResponse() {
        return (__bitField0 & 32768) == 32768;
    }

    public HappyPlayMessage withMsgHPLOMBuyResponse(proto.message.HPLOMBuyResponse value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPLOMBuyResponse(value)
            .build();
    }

    public proto.message.HPBPInfoRequest getMsgHPBPInfoRequest() {
        return msgHPBPInfoRequest;
    }

    public boolean hasMsgHPBPInfoRequest() {
        return (__bitField0 & 65536) == 65536;
    }

    public HappyPlayMessage withMsgHPBPInfoRequest(proto.message.HPBPInfoRequest value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPBPInfoRequest(value)
            .build();
    }

    public proto.message.HPBPInfoResponse getMsgHPBPInfoResponse() {
        return msgHPBPInfoResponse;
    }

    public boolean hasMsgHPBPInfoResponse() {
        return (__bitField0 & 131072) == 131072;
    }

    public HappyPlayMessage withMsgHPBPInfoResponse(proto.message.HPBPInfoResponse value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPBPInfoResponse(value)
            .build();
    }

    public proto.message.HPBPUrlRequest getMsgHPBPUrlRequest() {
        return msgHPBPUrlRequest;
    }

    public boolean hasMsgHPBPUrlRequest() {
        return (__bitField0 & 262144) == 262144;
    }

    public HappyPlayMessage withMsgHPBPUrlRequest(proto.message.HPBPUrlRequest value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPBPUrlRequest(value)
            .build();
    }

    public proto.message.HPBPUrlResponse getMsgHPBPUrlResponse() {
        return msgHPBPUrlResponse;
    }

    public boolean hasMsgHPBPUrlResponse() {
        return (__bitField0 & 524288) == 524288;
    }

    public HappyPlayMessage withMsgHPBPUrlResponse(proto.message.HPBPUrlResponse value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPBPUrlResponse(value)
            .build();
    }

    public proto.message.HPBPBuyRequest getMsgHPBPBuyRequest() {
        return msgHPBPBuyRequest;
    }

    public boolean hasMsgHPBPBuyRequest() {
        return (__bitField0 & 1048576) == 1048576;
    }

    public HappyPlayMessage withMsgHPBPBuyRequest(proto.message.HPBPBuyRequest value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPBPBuyRequest(value)
            .build();
    }

    public proto.message.HPBPBuyResponse getMsgHPBPBuyResponse() {
        return msgHPBPBuyResponse;
    }

    public boolean hasMsgHPBPBuyResponse() {
        return (__bitField0 & 2097152) == 2097152;
    }

    public HappyPlayMessage withMsgHPBPBuyResponse(proto.message.HPBPBuyResponse value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPBPBuyResponse(value)
            .build();
    }

    public proto.message.HPLOMGlobalInfoRequest getMsgHPLOMGlobalInfoRequest() {
        return msgHPLOMGlobalInfoRequest;
    }

    public boolean hasMsgHPLOMGlobalInfoRequest() {
        return (__bitField0 & 4194304) == 4194304;
    }

    public HappyPlayMessage withMsgHPLOMGlobalInfoRequest(proto.message.HPLOMGlobalInfoRequest value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPLOMGlobalInfoRequest(value)
            .build();
    }

    public proto.message.HPLOMGlobalInfoResponse getMsgHPLOMGlobalInfoResponse() {
        return msgHPLOMGlobalInfoResponse;
    }

    public boolean hasMsgHPLOMGlobalInfoResponse() {
        return (__bitField0 & 8388608) == 8388608;
    }

    public HappyPlayMessage withMsgHPLOMGlobalInfoResponse(proto.message.HPLOMGlobalInfoResponse value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPLOMGlobalInfoResponse(value)
            .build();
    }

    public proto.message.HPLOMGlobalUrlRequest getMsgHPLOMGlobalUrlRequest() {
        return msgHPLOMGlobalUrlRequest;
    }

    public boolean hasMsgHPLOMGlobalUrlRequest() {
        return (__bitField0 & 16777216) == 16777216;
    }

    public HappyPlayMessage withMsgHPLOMGlobalUrlRequest(proto.message.HPLOMGlobalUrlRequest value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPLOMGlobalUrlRequest(value)
            .build();
    }

    public proto.message.HPLOMGlobalUrlResponse getMsgHPLOMGlobalUrlResponse() {
        return msgHPLOMGlobalUrlResponse;
    }

    public boolean hasMsgHPLOMGlobalUrlResponse() {
        return (__bitField0 & 33554432) == 33554432;
    }

    public HappyPlayMessage withMsgHPLOMGlobalUrlResponse(proto.message.HPLOMGlobalUrlResponse value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPLOMGlobalUrlResponse(value)
            .build();
    }

    public proto.message.HPLOMGlobalBuyRequest getMsgHPLOMGlobalBuyRequest() {
        return msgHPLOMGlobalBuyRequest;
    }

    public boolean hasMsgHPLOMGlobalBuyRequest() {
        return (__bitField0 & 67108864) == 67108864;
    }

    public HappyPlayMessage withMsgHPLOMGlobalBuyRequest(proto.message.HPLOMGlobalBuyRequest value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPLOMGlobalBuyRequest(value)
            .build();
    }

    public proto.message.HPLOMGlobalBuyResponse getMsgHPLOMGlobalBuyResponse() {
        return msgHPLOMGlobalBuyResponse;
    }

    public boolean hasMsgHPLOMGlobalBuyResponse() {
        return (__bitField0 & 134217728) == 134217728;
    }

    public HappyPlayMessage withMsgHPLOMGlobalBuyResponse(proto.message.HPLOMGlobalBuyResponse value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPLOMGlobalBuyResponse(value)
            .build();
    }

    public proto.message.HPPromotionInfoRequest getMsgHPPromotionInfoRequest() {
        return msgHPPromotionInfoRequest;
    }

    public boolean hasMsgHPPromotionInfoRequest() {
        return (__bitField0 & 268435456) == 268435456;
    }

    public HappyPlayMessage withMsgHPPromotionInfoRequest(proto.message.HPPromotionInfoRequest value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPPromotionInfoRequest(value)
            .build();
    }

    public proto.message.HPPromotionInfoResponse getMsgHPPromotionInfoResponse() {
        return msgHPPromotionInfoResponse;
    }

    public boolean hasMsgHPPromotionInfoResponse() {
        return (__bitField0 & 536870912) == 536870912;
    }

    public HappyPlayMessage withMsgHPPromotionInfoResponse(proto.message.HPPromotionInfoResponse value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPPromotionInfoResponse(value)
            .build();
    }

    public proto.message.HPBoosterPackInfoRequest getMsgHPBoosterPackInfoRequest() {
        return msgHPBoosterPackInfoRequest;
    }

    public boolean hasMsgHPBoosterPackInfoRequest() {
        return (__bitField0 & 1073741824) == 1073741824;
    }

    public HappyPlayMessage withMsgHPBoosterPackInfoRequest(proto.message.HPBoosterPackInfoRequest value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPBoosterPackInfoRequest(value)
            .build();
    }

    public proto.message.HPBoosterPackInfoResponse getMsgHPBoosterPackInforResponse() {
        return msgHPBoosterPackInforResponse;
    }

    public boolean hasMsgHPBoosterPackInforResponse() {
        return (__bitField0 & -2147483648) == -2147483648;
    }

    public HappyPlayMessage withMsgHPBoosterPackInforResponse(proto.message.HPBoosterPackInfoResponse value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPBoosterPackInforResponse(value)
            .build();
    }

    public proto.message.HPCDInfoRequest getMsgHPCDInfoRequest() {
        return msgHPCDInfoRequest;
    }

    public boolean hasMsgHPCDInfoRequest() {
        return (__bitField1 & 1) == 1;
    }

    public HappyPlayMessage withMsgHPCDInfoRequest(proto.message.HPCDInfoRequest value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPCDInfoRequest(value)
            .build();
    }

    public proto.message.HPCDInfoResponse getMsgHPCDInfoResponse() {
        return msgHPCDInfoResponse;
    }

    public boolean hasMsgHPCDInfoResponse() {
        return (__bitField1 & 2) == 2;
    }

    public HappyPlayMessage withMsgHPCDInfoResponse(proto.message.HPCDInfoResponse value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPCDInfoResponse(value)
            .build();
    }

    public proto.message.HPCDBuyRequest getMsgHPCDBuyRequest() {
        return msgHPCDBuyRequest;
    }

    public boolean hasMsgHPCDBuyRequest() {
        return (__bitField1 & 4) == 4;
    }

    public HappyPlayMessage withMsgHPCDBuyRequest(proto.message.HPCDBuyRequest value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPCDBuyRequest(value)
            .build();
    }

    public proto.message.HPCDBuyResponse getMsgHPCDBuyResponse() {
        return msgHPCDBuyResponse;
    }

    public boolean hasMsgHPCDBuyResponse() {
        return (__bitField1 & 8) == 8;
    }

    public HappyPlayMessage withMsgHPCDBuyResponse(proto.message.HPCDBuyResponse value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPCDBuyResponse(value)
            .build();
    }

    public proto.message.HPSpecialOfferPackInfoRequest getMsgHPSpecialOfferPackInfoRequest() {
        return msgHPSpecialOfferPackInfoRequest;
    }

    public boolean hasMsgHPSpecialOfferPackInfoRequest() {
        return (__bitField1 & 16) == 16;
    }

    public HappyPlayMessage withMsgHPSpecialOfferPackInfoRequest(proto.message.HPSpecialOfferPackInfoRequest value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPSpecialOfferPackInfoRequest(value)
            .build();
    }

    public proto.message.HPSpecialOfferPackInfoResponse getMsgHPSpecialOfferPackInforResponse() {
        return msgHPSpecialOfferPackInforResponse;
    }

    public boolean hasMsgHPSpecialOfferPackInforResponse() {
        return (__bitField1 & 32) == 32;
    }

    public HappyPlayMessage withMsgHPSpecialOfferPackInforResponse(proto.message.HPSpecialOfferPackInfoResponse value) {
        return HappyPlayMessage.newBuilder()
            .mergeFrom(this)
            .setMsgHPSpecialOfferPackInforResponse(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<HappyPlayMessage> cachedSchema() {
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
        HappyPlayMessage that = (HappyPlayMessage) obj;
        if (!java.util.Objects.equals(this.command, that.command)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPAppleHPIAPInfoRequest, that.msgHPAppleHPIAPInfoRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPAppleHPIAPInfoResponse, that.msgHPAppleHPIAPInfoResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPAppleIAPBuyRequest, that.msgHPAppleIAPBuyRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPAppleIAPBuyResponse, that.msgHPAppleIAPBuyResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPGoogleHPIAPInfoRequest, that.msgHPGoogleHPIAPInfoRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPGoogleHPIAPInfoResponse, that.msgHPGoogleHPIAPInfoResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPGoogleIAPBuyRequest, that.msgHPGoogleIAPBuyRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPGoogleIAPBuyResponse, that.msgHPGoogleIAPBuyResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.clienttime, that.clienttime)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPLOMInfoRequest, that.msgHPLOMInfoRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPLOMInfoResponse, that.msgHPLOMInfoResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPLOMUrlRequest, that.msgHPLOMUrlRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPLOMUrlResponse, that.msgHPLOMUrlResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPLOMBuyRequest, that.msgHPLOMBuyRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPLOMBuyResponse, that.msgHPLOMBuyResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPBPInfoRequest, that.msgHPBPInfoRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPBPInfoResponse, that.msgHPBPInfoResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPBPUrlRequest, that.msgHPBPUrlRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPBPUrlResponse, that.msgHPBPUrlResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPBPBuyRequest, that.msgHPBPBuyRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPBPBuyResponse, that.msgHPBPBuyResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPLOMGlobalInfoRequest, that.msgHPLOMGlobalInfoRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPLOMGlobalInfoResponse, that.msgHPLOMGlobalInfoResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPLOMGlobalUrlRequest, that.msgHPLOMGlobalUrlRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPLOMGlobalUrlResponse, that.msgHPLOMGlobalUrlResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPLOMGlobalBuyRequest, that.msgHPLOMGlobalBuyRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPLOMGlobalBuyResponse, that.msgHPLOMGlobalBuyResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPPromotionInfoRequest, that.msgHPPromotionInfoRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPPromotionInfoResponse, that.msgHPPromotionInfoResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPBoosterPackInfoRequest, that.msgHPBoosterPackInfoRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPBoosterPackInforResponse, that.msgHPBoosterPackInforResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPCDInfoRequest, that.msgHPCDInfoRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPCDInfoResponse, that.msgHPCDInfoResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPCDBuyRequest, that.msgHPCDBuyRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPCDBuyResponse, that.msgHPCDBuyResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPSpecialOfferPackInfoRequest, that.msgHPSpecialOfferPackInfoRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgHPSpecialOfferPackInforResponse, that.msgHPSpecialOfferPackInforResponse)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.command);
        result = 31 * result + (this.msgHPAppleHPIAPInfoRequest == null ? 0 : this.msgHPAppleHPIAPInfoRequest.hashCode());
        result = 31 * result + (this.msgHPAppleHPIAPInfoResponse == null ? 0 : this.msgHPAppleHPIAPInfoResponse.hashCode());
        result = 31 * result + (this.msgHPAppleIAPBuyRequest == null ? 0 : this.msgHPAppleIAPBuyRequest.hashCode());
        result = 31 * result + (this.msgHPAppleIAPBuyResponse == null ? 0 : this.msgHPAppleIAPBuyResponse.hashCode());
        result = 31 * result + (this.msgHPGoogleHPIAPInfoRequest == null ? 0 : this.msgHPGoogleHPIAPInfoRequest.hashCode());
        result = 31 * result + (this.msgHPGoogleHPIAPInfoResponse == null ? 0 : this.msgHPGoogleHPIAPInfoResponse.hashCode());
        result = 31 * result + (this.msgHPGoogleIAPBuyRequest == null ? 0 : this.msgHPGoogleIAPBuyRequest.hashCode());
        result = 31 * result + (this.msgHPGoogleIAPBuyResponse == null ? 0 : this.msgHPGoogleIAPBuyResponse.hashCode());
        result = 31 * result + Long.hashCode(this.clienttime);
        result = 31 * result + (this.msgHPLOMInfoRequest == null ? 0 : this.msgHPLOMInfoRequest.hashCode());
        result = 31 * result + (this.msgHPLOMInfoResponse == null ? 0 : this.msgHPLOMInfoResponse.hashCode());
        result = 31 * result + (this.msgHPLOMUrlRequest == null ? 0 : this.msgHPLOMUrlRequest.hashCode());
        result = 31 * result + (this.msgHPLOMUrlResponse == null ? 0 : this.msgHPLOMUrlResponse.hashCode());
        result = 31 * result + (this.msgHPLOMBuyRequest == null ? 0 : this.msgHPLOMBuyRequest.hashCode());
        result = 31 * result + (this.msgHPLOMBuyResponse == null ? 0 : this.msgHPLOMBuyResponse.hashCode());
        result = 31 * result + (this.msgHPBPInfoRequest == null ? 0 : this.msgHPBPInfoRequest.hashCode());
        result = 31 * result + (this.msgHPBPInfoResponse == null ? 0 : this.msgHPBPInfoResponse.hashCode());
        result = 31 * result + (this.msgHPBPUrlRequest == null ? 0 : this.msgHPBPUrlRequest.hashCode());
        result = 31 * result + (this.msgHPBPUrlResponse == null ? 0 : this.msgHPBPUrlResponse.hashCode());
        result = 31 * result + (this.msgHPBPBuyRequest == null ? 0 : this.msgHPBPBuyRequest.hashCode());
        result = 31 * result + (this.msgHPBPBuyResponse == null ? 0 : this.msgHPBPBuyResponse.hashCode());
        result = 31 * result + (this.msgHPLOMGlobalInfoRequest == null ? 0 : this.msgHPLOMGlobalInfoRequest.hashCode());
        result = 31 * result + (this.msgHPLOMGlobalInfoResponse == null ? 0 : this.msgHPLOMGlobalInfoResponse.hashCode());
        result = 31 * result + (this.msgHPLOMGlobalUrlRequest == null ? 0 : this.msgHPLOMGlobalUrlRequest.hashCode());
        result = 31 * result + (this.msgHPLOMGlobalUrlResponse == null ? 0 : this.msgHPLOMGlobalUrlResponse.hashCode());
        result = 31 * result + (this.msgHPLOMGlobalBuyRequest == null ? 0 : this.msgHPLOMGlobalBuyRequest.hashCode());
        result = 31 * result + (this.msgHPLOMGlobalBuyResponse == null ? 0 : this.msgHPLOMGlobalBuyResponse.hashCode());
        result = 31 * result + (this.msgHPPromotionInfoRequest == null ? 0 : this.msgHPPromotionInfoRequest.hashCode());
        result = 31 * result + (this.msgHPPromotionInfoResponse == null ? 0 : this.msgHPPromotionInfoResponse.hashCode());
        result = 31 * result + (this.msgHPBoosterPackInfoRequest == null ? 0 : this.msgHPBoosterPackInfoRequest.hashCode());
        result = 31 * result + (this.msgHPBoosterPackInforResponse == null ? 0 : this.msgHPBoosterPackInforResponse.hashCode());
        result = 31 * result + (this.msgHPCDInfoRequest == null ? 0 : this.msgHPCDInfoRequest.hashCode());
        result = 31 * result + (this.msgHPCDInfoResponse == null ? 0 : this.msgHPCDInfoResponse.hashCode());
        result = 31 * result + (this.msgHPCDBuyRequest == null ? 0 : this.msgHPCDBuyRequest.hashCode());
        result = 31 * result + (this.msgHPCDBuyResponse == null ? 0 : this.msgHPCDBuyResponse.hashCode());
        result = 31 * result + (this.msgHPSpecialOfferPackInfoRequest == null ? 0 : this.msgHPSpecialOfferPackInfoRequest.hashCode());
        result = 31 * result + (this.msgHPSpecialOfferPackInforResponse == null ? 0 : this.msgHPSpecialOfferPackInforResponse.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasCommand()) {
            parts.add("command=" + getCommand() + '(' + getCommandValue() + ')');
        }
        if (hasMsgHPAppleHPIAPInfoRequest()) {
            parts.add("msgHPAppleHPIAPInfoRequest=" + getMsgHPAppleHPIAPInfoRequest());
        }
        if (hasMsgHPAppleHPIAPInfoResponse()) {
            parts.add("msgHPAppleHPIAPInfoResponse=" + getMsgHPAppleHPIAPInfoResponse());
        }
        if (hasMsgHPAppleIAPBuyRequest()) {
            parts.add("msgHPAppleIAPBuyRequest=" + getMsgHPAppleIAPBuyRequest());
        }
        if (hasMsgHPAppleIAPBuyResponse()) {
            parts.add("msgHPAppleIAPBuyResponse=" + getMsgHPAppleIAPBuyResponse());
        }
        if (hasMsgHPGoogleHPIAPInfoRequest()) {
            parts.add("msgHPGoogleHPIAPInfoRequest=" + getMsgHPGoogleHPIAPInfoRequest());
        }
        if (hasMsgHPGoogleHPIAPInfoResponse()) {
            parts.add("msgHPGoogleHPIAPInfoResponse=" + getMsgHPGoogleHPIAPInfoResponse());
        }
        if (hasMsgHPGoogleIAPBuyRequest()) {
            parts.add("msgHPGoogleIAPBuyRequest=" + getMsgHPGoogleIAPBuyRequest());
        }
        if (hasMsgHPGoogleIAPBuyResponse()) {
            parts.add("msgHPGoogleIAPBuyResponse=" + getMsgHPGoogleIAPBuyResponse());
        }
        if (hasClienttime()) {
            parts.add("clienttime=" + getClienttime());
        }
        if (hasMsgHPLOMInfoRequest()) {
            parts.add("msgHPLOMInfoRequest=" + getMsgHPLOMInfoRequest());
        }
        if (hasMsgHPLOMInfoResponse()) {
            parts.add("msgHPLOMInfoResponse=" + getMsgHPLOMInfoResponse());
        }
        if (hasMsgHPLOMUrlRequest()) {
            parts.add("msgHPLOMUrlRequest=" + getMsgHPLOMUrlRequest());
        }
        if (hasMsgHPLOMUrlResponse()) {
            parts.add("msgHPLOMUrlResponse=" + getMsgHPLOMUrlResponse());
        }
        if (hasMsgHPLOMBuyRequest()) {
            parts.add("msgHPLOMBuyRequest=" + getMsgHPLOMBuyRequest());
        }
        if (hasMsgHPLOMBuyResponse()) {
            parts.add("msgHPLOMBuyResponse=" + getMsgHPLOMBuyResponse());
        }
        if (hasMsgHPBPInfoRequest()) {
            parts.add("msgHPBPInfoRequest=" + getMsgHPBPInfoRequest());
        }
        if (hasMsgHPBPInfoResponse()) {
            parts.add("msgHPBPInfoResponse=" + getMsgHPBPInfoResponse());
        }
        if (hasMsgHPBPUrlRequest()) {
            parts.add("msgHPBPUrlRequest=" + getMsgHPBPUrlRequest());
        }
        if (hasMsgHPBPUrlResponse()) {
            parts.add("msgHPBPUrlResponse=" + getMsgHPBPUrlResponse());
        }
        if (hasMsgHPBPBuyRequest()) {
            parts.add("msgHPBPBuyRequest=" + getMsgHPBPBuyRequest());
        }
        if (hasMsgHPBPBuyResponse()) {
            parts.add("msgHPBPBuyResponse=" + getMsgHPBPBuyResponse());
        }
        if (hasMsgHPLOMGlobalInfoRequest()) {
            parts.add("msgHPLOMGlobalInfoRequest=" + getMsgHPLOMGlobalInfoRequest());
        }
        if (hasMsgHPLOMGlobalInfoResponse()) {
            parts.add("msgHPLOMGlobalInfoResponse=" + getMsgHPLOMGlobalInfoResponse());
        }
        if (hasMsgHPLOMGlobalUrlRequest()) {
            parts.add("msgHPLOMGlobalUrlRequest=" + getMsgHPLOMGlobalUrlRequest());
        }
        if (hasMsgHPLOMGlobalUrlResponse()) {
            parts.add("msgHPLOMGlobalUrlResponse=" + getMsgHPLOMGlobalUrlResponse());
        }
        if (hasMsgHPLOMGlobalBuyRequest()) {
            parts.add("msgHPLOMGlobalBuyRequest=" + getMsgHPLOMGlobalBuyRequest());
        }
        if (hasMsgHPLOMGlobalBuyResponse()) {
            parts.add("msgHPLOMGlobalBuyResponse=" + getMsgHPLOMGlobalBuyResponse());
        }
        if (hasMsgHPPromotionInfoRequest()) {
            parts.add("msgHPPromotionInfoRequest=" + getMsgHPPromotionInfoRequest());
        }
        if (hasMsgHPPromotionInfoResponse()) {
            parts.add("msgHPPromotionInfoResponse=" + getMsgHPPromotionInfoResponse());
        }
        if (hasMsgHPBoosterPackInfoRequest()) {
            parts.add("msgHPBoosterPackInfoRequest=" + getMsgHPBoosterPackInfoRequest());
        }
        if (hasMsgHPBoosterPackInforResponse()) {
            parts.add("msgHPBoosterPackInforResponse=" + getMsgHPBoosterPackInforResponse());
        }
        if (hasMsgHPCDInfoRequest()) {
            parts.add("msgHPCDInfoRequest=" + getMsgHPCDInfoRequest());
        }
        if (hasMsgHPCDInfoResponse()) {
            parts.add("msgHPCDInfoResponse=" + getMsgHPCDInfoResponse());
        }
        if (hasMsgHPCDBuyRequest()) {
            parts.add("msgHPCDBuyRequest=" + getMsgHPCDBuyRequest());
        }
        if (hasMsgHPCDBuyResponse()) {
            parts.add("msgHPCDBuyResponse=" + getMsgHPCDBuyResponse());
        }
        if (hasMsgHPSpecialOfferPackInfoRequest()) {
            parts.add("msgHPSpecialOfferPackInfoRequest=" + getMsgHPSpecialOfferPackInfoRequest());
        }
        if (hasMsgHPSpecialOfferPackInforResponse()) {
            parts.add("msgHPSpecialOfferPackInforResponse=" + getMsgHPSpecialOfferPackInforResponse());
        }
        return "HappyPlayMessage{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<HappyPlayMessage>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("command", 1);
        	__fieldMap.put("msgHPAppleHPIAPInfoRequest", 9);
        	__fieldMap.put("msgHPAppleHPIAPInfoResponse", 10);
        	__fieldMap.put("msgHPAppleIAPBuyRequest", 11);
        	__fieldMap.put("msgHPAppleIAPBuyResponse", 12);
        	__fieldMap.put("msgHPGoogleHPIAPInfoRequest", 13);
        	__fieldMap.put("msgHPGoogleHPIAPInfoResponse", 14);
        	__fieldMap.put("msgHPGoogleIAPBuyRequest", 15);
        	__fieldMap.put("msgHPGoogleIAPBuyResponse", 16);
        	__fieldMap.put("clienttime", 17);
        	__fieldMap.put("msgHPLOMInfoRequest", 23);
        	__fieldMap.put("msgHPLOMInfoResponse", 24);
        	__fieldMap.put("msgHPLOMUrlRequest", 25);
        	__fieldMap.put("msgHPLOMUrlResponse", 26);
        	__fieldMap.put("msgHPLOMBuyRequest", 27);
        	__fieldMap.put("msgHPLOMBuyResponse", 28);
        	__fieldMap.put("msgHPBPInfoRequest", 29);
        	__fieldMap.put("msgHPBPInfoResponse", 30);
        	__fieldMap.put("msgHPBPUrlRequest", 31);
        	__fieldMap.put("msgHPBPUrlResponse", 32);
        	__fieldMap.put("msgHPBPBuyRequest", 33);
        	__fieldMap.put("msgHPBPBuyResponse", 34);
        	__fieldMap.put("msgHPLOMGlobalInfoRequest", 35);
        	__fieldMap.put("msgHPLOMGlobalInfoResponse", 36);
        	__fieldMap.put("msgHPLOMGlobalUrlRequest", 37);
        	__fieldMap.put("msgHPLOMGlobalUrlResponse", 38);
        	__fieldMap.put("msgHPLOMGlobalBuyRequest", 39);
        	__fieldMap.put("msgHPLOMGlobalBuyResponse", 40);
        	__fieldMap.put("msgHPPromotionInfoRequest", 41);
        	__fieldMap.put("msgHPPromotionInfoResponse", 42);
        	__fieldMap.put("msgHPBoosterPackInfoRequest", 43);
        	__fieldMap.put("msgHPBoosterPackInforResponse", 44);
        	__fieldMap.put("msgHPCDInfoRequest", 45);
        	__fieldMap.put("msgHPCDInfoResponse", 46);
        	__fieldMap.put("msgHPCDBuyRequest", 47);
        	__fieldMap.put("msgHPCDBuyResponse", 48);
        	__fieldMap.put("msgHPSpecialOfferPackInfoRequest", 49);
        	__fieldMap.put("msgHPSpecialOfferPackInforResponse", 50);
        }

        @Override
        public HappyPlayMessage newMessage() {
            return new HappyPlayMessage();
        }

        @Override
        public Class<HappyPlayMessage> typeClass() {
            return HappyPlayMessage.class;
        }

        @Override
        public String messageName() {
            return HappyPlayMessage.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return HappyPlayMessage.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(HappyPlayMessage message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, HappyPlayMessage instance) throws java.io.IOException {
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
                    	instance.command = input.readEnum();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 9:
                    	instance.msgHPAppleHPIAPInfoRequest = input.mergeObject(null, proto.message.HPAppleHPIAPInfoRequest.getSchema());
                    	instance.__bitField0 |= 2;
                    	break;
                    case 10:
                    	instance.msgHPAppleHPIAPInfoResponse = input.mergeObject(null, proto.message.HPAppleHPIAPInfoResponse.getSchema());
                    	instance.__bitField0 |= 4;
                    	break;
                    case 11:
                    	instance.msgHPAppleIAPBuyRequest = input.mergeObject(null, proto.message.HPAppleIAPBuyRequest.getSchema());
                    	instance.__bitField0 |= 8;
                    	break;
                    case 12:
                    	instance.msgHPAppleIAPBuyResponse = input.mergeObject(null, proto.message.HPAppleIAPBuyResponse.getSchema());
                    	instance.__bitField0 |= 16;
                    	break;
                    case 13:
                    	instance.msgHPGoogleHPIAPInfoRequest = input.mergeObject(null, proto.message.HPGoogleHPIAPInfoRequest.getSchema());
                    	instance.__bitField0 |= 32;
                    	break;
                    case 14:
                    	instance.msgHPGoogleHPIAPInfoResponse = input.mergeObject(null, proto.message.HPGoogleHPIAPInfoResponse.getSchema());
                    	instance.__bitField0 |= 64;
                    	break;
                    case 15:
                    	instance.msgHPGoogleIAPBuyRequest = input.mergeObject(null, proto.message.HPGoogleIAPBuyRequest.getSchema());
                    	instance.__bitField0 |= 128;
                    	break;
                    case 16:
                    	instance.msgHPGoogleIAPBuyResponse = input.mergeObject(null, proto.message.HPGoogleIAPBuyResponse.getSchema());
                    	instance.__bitField0 |= 256;
                    	break;
                    case 17:
                    	instance.clienttime = input.readInt64();
                    	instance.__bitField0 |= 512;
                    	break;
                    case 23:
                    	instance.msgHPLOMInfoRequest = input.mergeObject(null, proto.message.HPLOMInfoRequest.getSchema());
                    	instance.__bitField0 |= 1024;
                    	break;
                    case 24:
                    	instance.msgHPLOMInfoResponse = input.mergeObject(null, proto.message.HPLOMInfoResponse.getSchema());
                    	instance.__bitField0 |= 2048;
                    	break;
                    case 25:
                    	instance.msgHPLOMUrlRequest = input.mergeObject(null, proto.message.HPLOMUrlRequest.getSchema());
                    	instance.__bitField0 |= 4096;
                    	break;
                    case 26:
                    	instance.msgHPLOMUrlResponse = input.mergeObject(null, proto.message.HPLOMUrlResponse.getSchema());
                    	instance.__bitField0 |= 8192;
                    	break;
                    case 27:
                    	instance.msgHPLOMBuyRequest = input.mergeObject(null, proto.message.HPLOMBuyRequest.getSchema());
                    	instance.__bitField0 |= 16384;
                    	break;
                    case 28:
                    	instance.msgHPLOMBuyResponse = input.mergeObject(null, proto.message.HPLOMBuyResponse.getSchema());
                    	instance.__bitField0 |= 32768;
                    	break;
                    case 29:
                    	instance.msgHPBPInfoRequest = input.mergeObject(null, proto.message.HPBPInfoRequest.getSchema());
                    	instance.__bitField0 |= 65536;
                    	break;
                    case 30:
                    	instance.msgHPBPInfoResponse = input.mergeObject(null, proto.message.HPBPInfoResponse.getSchema());
                    	instance.__bitField0 |= 131072;
                    	break;
                    case 31:
                    	instance.msgHPBPUrlRequest = input.mergeObject(null, proto.message.HPBPUrlRequest.getSchema());
                    	instance.__bitField0 |= 262144;
                    	break;
                    case 32:
                    	instance.msgHPBPUrlResponse = input.mergeObject(null, proto.message.HPBPUrlResponse.getSchema());
                    	instance.__bitField0 |= 524288;
                    	break;
                    case 33:
                    	instance.msgHPBPBuyRequest = input.mergeObject(null, proto.message.HPBPBuyRequest.getSchema());
                    	instance.__bitField0 |= 1048576;
                    	break;
                    case 34:
                    	instance.msgHPBPBuyResponse = input.mergeObject(null, proto.message.HPBPBuyResponse.getSchema());
                    	instance.__bitField0 |= 2097152;
                    	break;
                    case 35:
                    	instance.msgHPLOMGlobalInfoRequest = input.mergeObject(null, proto.message.HPLOMGlobalInfoRequest.getSchema());
                    	instance.__bitField0 |= 4194304;
                    	break;
                    case 36:
                    	instance.msgHPLOMGlobalInfoResponse = input.mergeObject(null, proto.message.HPLOMGlobalInfoResponse.getSchema());
                    	instance.__bitField0 |= 8388608;
                    	break;
                    case 37:
                    	instance.msgHPLOMGlobalUrlRequest = input.mergeObject(null, proto.message.HPLOMGlobalUrlRequest.getSchema());
                    	instance.__bitField0 |= 16777216;
                    	break;
                    case 38:
                    	instance.msgHPLOMGlobalUrlResponse = input.mergeObject(null, proto.message.HPLOMGlobalUrlResponse.getSchema());
                    	instance.__bitField0 |= 33554432;
                    	break;
                    case 39:
                    	instance.msgHPLOMGlobalBuyRequest = input.mergeObject(null, proto.message.HPLOMGlobalBuyRequest.getSchema());
                    	instance.__bitField0 |= 67108864;
                    	break;
                    case 40:
                    	instance.msgHPLOMGlobalBuyResponse = input.mergeObject(null, proto.message.HPLOMGlobalBuyResponse.getSchema());
                    	instance.__bitField0 |= 134217728;
                    	break;
                    case 41:
                    	instance.msgHPPromotionInfoRequest = input.mergeObject(null, proto.message.HPPromotionInfoRequest.getSchema());
                    	instance.__bitField0 |= 268435456;
                    	break;
                    case 42:
                    	instance.msgHPPromotionInfoResponse = input.mergeObject(null, proto.message.HPPromotionInfoResponse.getSchema());
                    	instance.__bitField0 |= 536870912;
                    	break;
                    case 43:
                    	instance.msgHPBoosterPackInfoRequest = input.mergeObject(null, proto.message.HPBoosterPackInfoRequest.getSchema());
                    	instance.__bitField0 |= 1073741824;
                    	break;
                    case 44:
                    	instance.msgHPBoosterPackInforResponse = input.mergeObject(null, proto.message.HPBoosterPackInfoResponse.getSchema());
                    	instance.__bitField0 |= -2147483648;
                    	break;
                    case 45:
                    	instance.msgHPCDInfoRequest = input.mergeObject(null, proto.message.HPCDInfoRequest.getSchema());
                    	instance.__bitField1 |= 1;
                    	break;
                    case 46:
                    	instance.msgHPCDInfoResponse = input.mergeObject(null, proto.message.HPCDInfoResponse.getSchema());
                    	instance.__bitField1 |= 2;
                    	break;
                    case 47:
                    	instance.msgHPCDBuyRequest = input.mergeObject(null, proto.message.HPCDBuyRequest.getSchema());
                    	instance.__bitField1 |= 4;
                    	break;
                    case 48:
                    	instance.msgHPCDBuyResponse = input.mergeObject(null, proto.message.HPCDBuyResponse.getSchema());
                    	instance.__bitField1 |= 8;
                    	break;
                    case 49:
                    	instance.msgHPSpecialOfferPackInfoRequest = input.mergeObject(null, proto.message.HPSpecialOfferPackInfoRequest.getSchema());
                    	instance.__bitField1 |= 16;
                    	break;
                    case 50:
                    	instance.msgHPSpecialOfferPackInforResponse = input.mergeObject(null, proto.message.HPSpecialOfferPackInfoResponse.getSchema());
                    	instance.__bitField1 |= 32;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, HappyPlayMessage instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.command, false);
            }

            if((instance.__bitField0 & 2) == 2) {
            	output.writeObject(9, instance.msgHPAppleHPIAPInfoRequest, proto.message.HPAppleHPIAPInfoRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 4) == 4) {
            	output.writeObject(10, instance.msgHPAppleHPIAPInfoResponse, proto.message.HPAppleHPIAPInfoResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 8) == 8) {
            	output.writeObject(11, instance.msgHPAppleIAPBuyRequest, proto.message.HPAppleIAPBuyRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 16) == 16) {
            	output.writeObject(12, instance.msgHPAppleIAPBuyResponse, proto.message.HPAppleIAPBuyResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 32) == 32) {
            	output.writeObject(13, instance.msgHPGoogleHPIAPInfoRequest, proto.message.HPGoogleHPIAPInfoRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 64) == 64) {
            	output.writeObject(14, instance.msgHPGoogleHPIAPInfoResponse, proto.message.HPGoogleHPIAPInfoResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 128) == 128) {
            	output.writeObject(15, instance.msgHPGoogleIAPBuyRequest, proto.message.HPGoogleIAPBuyRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 256) == 256) {
            	output.writeObject(16, instance.msgHPGoogleIAPBuyResponse, proto.message.HPGoogleIAPBuyResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 512) == 512) {
                output.writeInt64(17, instance.clienttime, false);
            }

            if((instance.__bitField0 & 1024) == 1024) {
            	output.writeObject(23, instance.msgHPLOMInfoRequest, proto.message.HPLOMInfoRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 2048) == 2048) {
            	output.writeObject(24, instance.msgHPLOMInfoResponse, proto.message.HPLOMInfoResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 4096) == 4096) {
            	output.writeObject(25, instance.msgHPLOMUrlRequest, proto.message.HPLOMUrlRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 8192) == 8192) {
            	output.writeObject(26, instance.msgHPLOMUrlResponse, proto.message.HPLOMUrlResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 16384) == 16384) {
            	output.writeObject(27, instance.msgHPLOMBuyRequest, proto.message.HPLOMBuyRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 32768) == 32768) {
            	output.writeObject(28, instance.msgHPLOMBuyResponse, proto.message.HPLOMBuyResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 65536) == 65536) {
            	output.writeObject(29, instance.msgHPBPInfoRequest, proto.message.HPBPInfoRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 131072) == 131072) {
            	output.writeObject(30, instance.msgHPBPInfoResponse, proto.message.HPBPInfoResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 262144) == 262144) {
            	output.writeObject(31, instance.msgHPBPUrlRequest, proto.message.HPBPUrlRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 524288) == 524288) {
            	output.writeObject(32, instance.msgHPBPUrlResponse, proto.message.HPBPUrlResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 1048576) == 1048576) {
            	output.writeObject(33, instance.msgHPBPBuyRequest, proto.message.HPBPBuyRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 2097152) == 2097152) {
            	output.writeObject(34, instance.msgHPBPBuyResponse, proto.message.HPBPBuyResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 4194304) == 4194304) {
            	output.writeObject(35, instance.msgHPLOMGlobalInfoRequest, proto.message.HPLOMGlobalInfoRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 8388608) == 8388608) {
            	output.writeObject(36, instance.msgHPLOMGlobalInfoResponse, proto.message.HPLOMGlobalInfoResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 16777216) == 16777216) {
            	output.writeObject(37, instance.msgHPLOMGlobalUrlRequest, proto.message.HPLOMGlobalUrlRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 33554432) == 33554432) {
            	output.writeObject(38, instance.msgHPLOMGlobalUrlResponse, proto.message.HPLOMGlobalUrlResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 67108864) == 67108864) {
            	output.writeObject(39, instance.msgHPLOMGlobalBuyRequest, proto.message.HPLOMGlobalBuyRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 134217728) == 134217728) {
            	output.writeObject(40, instance.msgHPLOMGlobalBuyResponse, proto.message.HPLOMGlobalBuyResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 268435456) == 268435456) {
            	output.writeObject(41, instance.msgHPPromotionInfoRequest, proto.message.HPPromotionInfoRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 536870912) == 536870912) {
            	output.writeObject(42, instance.msgHPPromotionInfoResponse, proto.message.HPPromotionInfoResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 1073741824) == 1073741824) {
            	output.writeObject(43, instance.msgHPBoosterPackInfoRequest, proto.message.HPBoosterPackInfoRequest.getSchema(), false);
            }

            if((instance.__bitField0 & -2147483648) == -2147483648) {
            	output.writeObject(44, instance.msgHPBoosterPackInforResponse, proto.message.HPBoosterPackInfoResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 1) == 1) {
            	output.writeObject(45, instance.msgHPCDInfoRequest, proto.message.HPCDInfoRequest.getSchema(), false);
            }

            if((instance.__bitField1 & 2) == 2) {
            	output.writeObject(46, instance.msgHPCDInfoResponse, proto.message.HPCDInfoResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 4) == 4) {
            	output.writeObject(47, instance.msgHPCDBuyRequest, proto.message.HPCDBuyRequest.getSchema(), false);
            }

            if((instance.__bitField1 & 8) == 8) {
            	output.writeObject(48, instance.msgHPCDBuyResponse, proto.message.HPCDBuyResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 16) == 16) {
            	output.writeObject(49, instance.msgHPSpecialOfferPackInfoRequest, proto.message.HPSpecialOfferPackInfoRequest.getSchema(), false);
            }

            if((instance.__bitField1 & 32) == 32) {
            	output.writeObject(50, instance.msgHPSpecialOfferPackInforResponse, proto.message.HPSpecialOfferPackInfoResponse.getSchema(), false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "command";
        		case 9: return "msgHPAppleHPIAPInfoRequest";
        		case 10: return "msgHPAppleHPIAPInfoResponse";
        		case 11: return "msgHPAppleIAPBuyRequest";
        		case 12: return "msgHPAppleIAPBuyResponse";
        		case 13: return "msgHPGoogleHPIAPInfoRequest";
        		case 14: return "msgHPGoogleHPIAPInfoResponse";
        		case 15: return "msgHPGoogleIAPBuyRequest";
        		case 16: return "msgHPGoogleIAPBuyResponse";
        		case 17: return "clienttime";
        		case 23: return "msgHPLOMInfoRequest";
        		case 24: return "msgHPLOMInfoResponse";
        		case 25: return "msgHPLOMUrlRequest";
        		case 26: return "msgHPLOMUrlResponse";
        		case 27: return "msgHPLOMBuyRequest";
        		case 28: return "msgHPLOMBuyResponse";
        		case 29: return "msgHPBPInfoRequest";
        		case 30: return "msgHPBPInfoResponse";
        		case 31: return "msgHPBPUrlRequest";
        		case 32: return "msgHPBPUrlResponse";
        		case 33: return "msgHPBPBuyRequest";
        		case 34: return "msgHPBPBuyResponse";
        		case 35: return "msgHPLOMGlobalInfoRequest";
        		case 36: return "msgHPLOMGlobalInfoResponse";
        		case 37: return "msgHPLOMGlobalUrlRequest";
        		case 38: return "msgHPLOMGlobalUrlResponse";
        		case 39: return "msgHPLOMGlobalBuyRequest";
        		case 40: return "msgHPLOMGlobalBuyResponse";
        		case 41: return "msgHPPromotionInfoRequest";
        		case 42: return "msgHPPromotionInfoResponse";
        		case 43: return "msgHPBoosterPackInfoRequest";
        		case 44: return "msgHPBoosterPackInforResponse";
        		case 45: return "msgHPCDInfoRequest";
        		case 46: return "msgHPCDInfoResponse";
        		case 47: return "msgHPCDBuyRequest";
        		case 48: return "msgHPCDBuyResponse";
        		case 49: return "msgHPSpecialOfferPackInfoRequest";
        		case 50: return "msgHPSpecialOfferPackInforResponse";
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

        private int command;

        private proto.message.HPAppleHPIAPInfoRequest msgHPAppleHPIAPInfoRequest;

        private proto.message.HPAppleHPIAPInfoResponse msgHPAppleHPIAPInfoResponse;

        private proto.message.HPAppleIAPBuyRequest msgHPAppleIAPBuyRequest;

        private proto.message.HPAppleIAPBuyResponse msgHPAppleIAPBuyResponse;

        private proto.message.HPGoogleHPIAPInfoRequest msgHPGoogleHPIAPInfoRequest;

        private proto.message.HPGoogleHPIAPInfoResponse msgHPGoogleHPIAPInfoResponse;

        private proto.message.HPGoogleIAPBuyRequest msgHPGoogleIAPBuyRequest;

        private proto.message.HPGoogleIAPBuyResponse msgHPGoogleIAPBuyResponse;

        private long clienttime;

        private proto.message.HPLOMInfoRequest msgHPLOMInfoRequest;

        private proto.message.HPLOMInfoResponse msgHPLOMInfoResponse;

        private proto.message.HPLOMUrlRequest msgHPLOMUrlRequest;

        private proto.message.HPLOMUrlResponse msgHPLOMUrlResponse;

        private proto.message.HPLOMBuyRequest msgHPLOMBuyRequest;

        private proto.message.HPLOMBuyResponse msgHPLOMBuyResponse;

        private proto.message.HPBPInfoRequest msgHPBPInfoRequest;

        private proto.message.HPBPInfoResponse msgHPBPInfoResponse;

        private proto.message.HPBPUrlRequest msgHPBPUrlRequest;

        private proto.message.HPBPUrlResponse msgHPBPUrlResponse;

        private proto.message.HPBPBuyRequest msgHPBPBuyRequest;

        private proto.message.HPBPBuyResponse msgHPBPBuyResponse;

        private proto.message.HPLOMGlobalInfoRequest msgHPLOMGlobalInfoRequest;

        private proto.message.HPLOMGlobalInfoResponse msgHPLOMGlobalInfoResponse;

        private proto.message.HPLOMGlobalUrlRequest msgHPLOMGlobalUrlRequest;

        private proto.message.HPLOMGlobalUrlResponse msgHPLOMGlobalUrlResponse;

        private proto.message.HPLOMGlobalBuyRequest msgHPLOMGlobalBuyRequest;

        private proto.message.HPLOMGlobalBuyResponse msgHPLOMGlobalBuyResponse;

        private proto.message.HPPromotionInfoRequest msgHPPromotionInfoRequest;

        private proto.message.HPPromotionInfoResponse msgHPPromotionInfoResponse;

        private proto.message.HPBoosterPackInfoRequest msgHPBoosterPackInfoRequest;

        private proto.message.HPBoosterPackInfoResponse msgHPBoosterPackInforResponse;

        private proto.message.HPCDInfoRequest msgHPCDInfoRequest;

        private proto.message.HPCDInfoResponse msgHPCDInfoResponse;

        private proto.message.HPCDBuyRequest msgHPCDBuyRequest;

        private proto.message.HPCDBuyResponse msgHPCDBuyResponse;

        private proto.message.HPSpecialOfferPackInfoRequest msgHPSpecialOfferPackInfoRequest;

        private proto.message.HPSpecialOfferPackInfoResponse msgHPSpecialOfferPackInforResponse;

        private int __bitField0;
        private int __bitField1;

        private Builder() {
            this.command = proto.message.HPHappyPlayCommand.HAPPY_PLAY_REFUND_EVENT_REQUEST.getNumber();
            this.msgHPAppleHPIAPInfoRequest = proto.message.HPAppleHPIAPInfoRequest.getDefaultInstance();
            this.msgHPAppleHPIAPInfoResponse = proto.message.HPAppleHPIAPInfoResponse.getDefaultInstance();
            this.msgHPAppleIAPBuyRequest = proto.message.HPAppleIAPBuyRequest.getDefaultInstance();
            this.msgHPAppleIAPBuyResponse = proto.message.HPAppleIAPBuyResponse.getDefaultInstance();
            this.msgHPGoogleHPIAPInfoRequest = proto.message.HPGoogleHPIAPInfoRequest.getDefaultInstance();
            this.msgHPGoogleHPIAPInfoResponse = proto.message.HPGoogleHPIAPInfoResponse.getDefaultInstance();
            this.msgHPGoogleIAPBuyRequest = proto.message.HPGoogleIAPBuyRequest.getDefaultInstance();
            this.msgHPGoogleIAPBuyResponse = proto.message.HPGoogleIAPBuyResponse.getDefaultInstance();
            this.clienttime = 0L;
            this.msgHPLOMInfoRequest = proto.message.HPLOMInfoRequest.getDefaultInstance();
            this.msgHPLOMInfoResponse = proto.message.HPLOMInfoResponse.getDefaultInstance();
            this.msgHPLOMUrlRequest = proto.message.HPLOMUrlRequest.getDefaultInstance();
            this.msgHPLOMUrlResponse = proto.message.HPLOMUrlResponse.getDefaultInstance();
            this.msgHPLOMBuyRequest = proto.message.HPLOMBuyRequest.getDefaultInstance();
            this.msgHPLOMBuyResponse = proto.message.HPLOMBuyResponse.getDefaultInstance();
            this.msgHPBPInfoRequest = proto.message.HPBPInfoRequest.getDefaultInstance();
            this.msgHPBPInfoResponse = proto.message.HPBPInfoResponse.getDefaultInstance();
            this.msgHPBPUrlRequest = proto.message.HPBPUrlRequest.getDefaultInstance();
            this.msgHPBPUrlResponse = proto.message.HPBPUrlResponse.getDefaultInstance();
            this.msgHPBPBuyRequest = proto.message.HPBPBuyRequest.getDefaultInstance();
            this.msgHPBPBuyResponse = proto.message.HPBPBuyResponse.getDefaultInstance();
            this.msgHPLOMGlobalInfoRequest = proto.message.HPLOMGlobalInfoRequest.getDefaultInstance();
            this.msgHPLOMGlobalInfoResponse = proto.message.HPLOMGlobalInfoResponse.getDefaultInstance();
            this.msgHPLOMGlobalUrlRequest = proto.message.HPLOMGlobalUrlRequest.getDefaultInstance();
            this.msgHPLOMGlobalUrlResponse = proto.message.HPLOMGlobalUrlResponse.getDefaultInstance();
            this.msgHPLOMGlobalBuyRequest = proto.message.HPLOMGlobalBuyRequest.getDefaultInstance();
            this.msgHPLOMGlobalBuyResponse = proto.message.HPLOMGlobalBuyResponse.getDefaultInstance();
            this.msgHPPromotionInfoRequest = proto.message.HPPromotionInfoRequest.getDefaultInstance();
            this.msgHPPromotionInfoResponse = proto.message.HPPromotionInfoResponse.getDefaultInstance();
            this.msgHPBoosterPackInfoRequest = proto.message.HPBoosterPackInfoRequest.getDefaultInstance();
            this.msgHPBoosterPackInforResponse = proto.message.HPBoosterPackInfoResponse.getDefaultInstance();
            this.msgHPCDInfoRequest = proto.message.HPCDInfoRequest.getDefaultInstance();
            this.msgHPCDInfoResponse = proto.message.HPCDInfoResponse.getDefaultInstance();
            this.msgHPCDBuyRequest = proto.message.HPCDBuyRequest.getDefaultInstance();
            this.msgHPCDBuyResponse = proto.message.HPCDBuyResponse.getDefaultInstance();
            this.msgHPSpecialOfferPackInfoRequest = proto.message.HPSpecialOfferPackInfoRequest.getDefaultInstance();
            this.msgHPSpecialOfferPackInforResponse = proto.message.HPSpecialOfferPackInfoResponse.getDefaultInstance();
        }

        public Builder mergeFrom(HappyPlayMessage instance) {
            if (instance.hasCommand()) {
                this.setCommand(instance.getCommand());
            }

            if (instance.hasMsgHPAppleHPIAPInfoRequest()) {
                this.setMsgHPAppleHPIAPInfoRequest(instance.getMsgHPAppleHPIAPInfoRequest());
            }

            if (instance.hasMsgHPAppleHPIAPInfoResponse()) {
                this.setMsgHPAppleHPIAPInfoResponse(instance.getMsgHPAppleHPIAPInfoResponse());
            }

            if (instance.hasMsgHPAppleIAPBuyRequest()) {
                this.setMsgHPAppleIAPBuyRequest(instance.getMsgHPAppleIAPBuyRequest());
            }

            if (instance.hasMsgHPAppleIAPBuyResponse()) {
                this.setMsgHPAppleIAPBuyResponse(instance.getMsgHPAppleIAPBuyResponse());
            }

            if (instance.hasMsgHPGoogleHPIAPInfoRequest()) {
                this.setMsgHPGoogleHPIAPInfoRequest(instance.getMsgHPGoogleHPIAPInfoRequest());
            }

            if (instance.hasMsgHPGoogleHPIAPInfoResponse()) {
                this.setMsgHPGoogleHPIAPInfoResponse(instance.getMsgHPGoogleHPIAPInfoResponse());
            }

            if (instance.hasMsgHPGoogleIAPBuyRequest()) {
                this.setMsgHPGoogleIAPBuyRequest(instance.getMsgHPGoogleIAPBuyRequest());
            }

            if (instance.hasMsgHPGoogleIAPBuyResponse()) {
                this.setMsgHPGoogleIAPBuyResponse(instance.getMsgHPGoogleIAPBuyResponse());
            }

            if (instance.hasClienttime()) {
                this.setClienttime(instance.getClienttime());
            }

            if (instance.hasMsgHPLOMInfoRequest()) {
                this.setMsgHPLOMInfoRequest(instance.getMsgHPLOMInfoRequest());
            }

            if (instance.hasMsgHPLOMInfoResponse()) {
                this.setMsgHPLOMInfoResponse(instance.getMsgHPLOMInfoResponse());
            }

            if (instance.hasMsgHPLOMUrlRequest()) {
                this.setMsgHPLOMUrlRequest(instance.getMsgHPLOMUrlRequest());
            }

            if (instance.hasMsgHPLOMUrlResponse()) {
                this.setMsgHPLOMUrlResponse(instance.getMsgHPLOMUrlResponse());
            }

            if (instance.hasMsgHPLOMBuyRequest()) {
                this.setMsgHPLOMBuyRequest(instance.getMsgHPLOMBuyRequest());
            }

            if (instance.hasMsgHPLOMBuyResponse()) {
                this.setMsgHPLOMBuyResponse(instance.getMsgHPLOMBuyResponse());
            }

            if (instance.hasMsgHPBPInfoRequest()) {
                this.setMsgHPBPInfoRequest(instance.getMsgHPBPInfoRequest());
            }

            if (instance.hasMsgHPBPInfoResponse()) {
                this.setMsgHPBPInfoResponse(instance.getMsgHPBPInfoResponse());
            }

            if (instance.hasMsgHPBPUrlRequest()) {
                this.setMsgHPBPUrlRequest(instance.getMsgHPBPUrlRequest());
            }

            if (instance.hasMsgHPBPUrlResponse()) {
                this.setMsgHPBPUrlResponse(instance.getMsgHPBPUrlResponse());
            }

            if (instance.hasMsgHPBPBuyRequest()) {
                this.setMsgHPBPBuyRequest(instance.getMsgHPBPBuyRequest());
            }

            if (instance.hasMsgHPBPBuyResponse()) {
                this.setMsgHPBPBuyResponse(instance.getMsgHPBPBuyResponse());
            }

            if (instance.hasMsgHPLOMGlobalInfoRequest()) {
                this.setMsgHPLOMGlobalInfoRequest(instance.getMsgHPLOMGlobalInfoRequest());
            }

            if (instance.hasMsgHPLOMGlobalInfoResponse()) {
                this.setMsgHPLOMGlobalInfoResponse(instance.getMsgHPLOMGlobalInfoResponse());
            }

            if (instance.hasMsgHPLOMGlobalUrlRequest()) {
                this.setMsgHPLOMGlobalUrlRequest(instance.getMsgHPLOMGlobalUrlRequest());
            }

            if (instance.hasMsgHPLOMGlobalUrlResponse()) {
                this.setMsgHPLOMGlobalUrlResponse(instance.getMsgHPLOMGlobalUrlResponse());
            }

            if (instance.hasMsgHPLOMGlobalBuyRequest()) {
                this.setMsgHPLOMGlobalBuyRequest(instance.getMsgHPLOMGlobalBuyRequest());
            }

            if (instance.hasMsgHPLOMGlobalBuyResponse()) {
                this.setMsgHPLOMGlobalBuyResponse(instance.getMsgHPLOMGlobalBuyResponse());
            }

            if (instance.hasMsgHPPromotionInfoRequest()) {
                this.setMsgHPPromotionInfoRequest(instance.getMsgHPPromotionInfoRequest());
            }

            if (instance.hasMsgHPPromotionInfoResponse()) {
                this.setMsgHPPromotionInfoResponse(instance.getMsgHPPromotionInfoResponse());
            }

            if (instance.hasMsgHPBoosterPackInfoRequest()) {
                this.setMsgHPBoosterPackInfoRequest(instance.getMsgHPBoosterPackInfoRequest());
            }

            if (instance.hasMsgHPBoosterPackInforResponse()) {
                this.setMsgHPBoosterPackInforResponse(instance.getMsgHPBoosterPackInforResponse());
            }

            if (instance.hasMsgHPCDInfoRequest()) {
                this.setMsgHPCDInfoRequest(instance.getMsgHPCDInfoRequest());
            }

            if (instance.hasMsgHPCDInfoResponse()) {
                this.setMsgHPCDInfoResponse(instance.getMsgHPCDInfoResponse());
            }

            if (instance.hasMsgHPCDBuyRequest()) {
                this.setMsgHPCDBuyRequest(instance.getMsgHPCDBuyRequest());
            }

            if (instance.hasMsgHPCDBuyResponse()) {
                this.setMsgHPCDBuyResponse(instance.getMsgHPCDBuyResponse());
            }

            if (instance.hasMsgHPSpecialOfferPackInfoRequest()) {
                this.setMsgHPSpecialOfferPackInfoRequest(instance.getMsgHPSpecialOfferPackInfoRequest());
            }

            if (instance.hasMsgHPSpecialOfferPackInforResponse()) {
                this.setMsgHPSpecialOfferPackInforResponse(instance.getMsgHPSpecialOfferPackInforResponse());
            }

            return this;
        }

        public proto.message.HPHappyPlayCommand getCommand() {
            return proto.message.HPHappyPlayCommand.valueOf(command);
        }

        public int getCommandValue() {
            return command;
        }

        public Builder setCommand(proto.message.HPHappyPlayCommand value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#command to null");
            }

            if (value == proto.message.HPHappyPlayCommand.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set HappyPlayMessage#command to UNRECOGNIZED");
            }

            this.command = value.getNumber();
            __bitField0 |= 1;
            return this;
        }

        public Builder setCommandValue(int value) {
            this.command = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearCommand() {
            this.command = 0;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasCommand() {
            return (__bitField0 & 1) == 1;
        }

        public proto.message.HPAppleHPIAPInfoRequest getMsgHPAppleHPIAPInfoRequest() {
            return msgHPAppleHPIAPInfoRequest;
        }

        public Builder setMsgHPAppleHPIAPInfoRequest(proto.message.HPAppleHPIAPInfoRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPAppleHPIAPInfoRequest to null");
            }

            this.msgHPAppleHPIAPInfoRequest = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearMsgHPAppleHPIAPInfoRequest() {
            this.msgHPAppleHPIAPInfoRequest = proto.message.HPAppleHPIAPInfoRequest.getDefaultInstance();
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasMsgHPAppleHPIAPInfoRequest() {
            return (__bitField0 & 2) == 2;
        }

        public proto.message.HPAppleHPIAPInfoResponse getMsgHPAppleHPIAPInfoResponse() {
            return msgHPAppleHPIAPInfoResponse;
        }

        public Builder setMsgHPAppleHPIAPInfoResponse(proto.message.HPAppleHPIAPInfoResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPAppleHPIAPInfoResponse to null");
            }

            this.msgHPAppleHPIAPInfoResponse = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearMsgHPAppleHPIAPInfoResponse() {
            this.msgHPAppleHPIAPInfoResponse = proto.message.HPAppleHPIAPInfoResponse.getDefaultInstance();
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasMsgHPAppleHPIAPInfoResponse() {
            return (__bitField0 & 4) == 4;
        }

        public proto.message.HPAppleIAPBuyRequest getMsgHPAppleIAPBuyRequest() {
            return msgHPAppleIAPBuyRequest;
        }

        public Builder setMsgHPAppleIAPBuyRequest(proto.message.HPAppleIAPBuyRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPAppleIAPBuyRequest to null");
            }

            this.msgHPAppleIAPBuyRequest = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearMsgHPAppleIAPBuyRequest() {
            this.msgHPAppleIAPBuyRequest = proto.message.HPAppleIAPBuyRequest.getDefaultInstance();
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasMsgHPAppleIAPBuyRequest() {
            return (__bitField0 & 8) == 8;
        }

        public proto.message.HPAppleIAPBuyResponse getMsgHPAppleIAPBuyResponse() {
            return msgHPAppleIAPBuyResponse;
        }

        public Builder setMsgHPAppleIAPBuyResponse(proto.message.HPAppleIAPBuyResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPAppleIAPBuyResponse to null");
            }

            this.msgHPAppleIAPBuyResponse = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearMsgHPAppleIAPBuyResponse() {
            this.msgHPAppleIAPBuyResponse = proto.message.HPAppleIAPBuyResponse.getDefaultInstance();
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasMsgHPAppleIAPBuyResponse() {
            return (__bitField0 & 16) == 16;
        }

        public proto.message.HPGoogleHPIAPInfoRequest getMsgHPGoogleHPIAPInfoRequest() {
            return msgHPGoogleHPIAPInfoRequest;
        }

        public Builder setMsgHPGoogleHPIAPInfoRequest(proto.message.HPGoogleHPIAPInfoRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPGoogleHPIAPInfoRequest to null");
            }

            this.msgHPGoogleHPIAPInfoRequest = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearMsgHPGoogleHPIAPInfoRequest() {
            this.msgHPGoogleHPIAPInfoRequest = proto.message.HPGoogleHPIAPInfoRequest.getDefaultInstance();
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasMsgHPGoogleHPIAPInfoRequest() {
            return (__bitField0 & 32) == 32;
        }

        public proto.message.HPGoogleHPIAPInfoResponse getMsgHPGoogleHPIAPInfoResponse() {
            return msgHPGoogleHPIAPInfoResponse;
        }

        public Builder setMsgHPGoogleHPIAPInfoResponse(proto.message.HPGoogleHPIAPInfoResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPGoogleHPIAPInfoResponse to null");
            }

            this.msgHPGoogleHPIAPInfoResponse = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearMsgHPGoogleHPIAPInfoResponse() {
            this.msgHPGoogleHPIAPInfoResponse = proto.message.HPGoogleHPIAPInfoResponse.getDefaultInstance();
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasMsgHPGoogleHPIAPInfoResponse() {
            return (__bitField0 & 64) == 64;
        }

        public proto.message.HPGoogleIAPBuyRequest getMsgHPGoogleIAPBuyRequest() {
            return msgHPGoogleIAPBuyRequest;
        }

        public Builder setMsgHPGoogleIAPBuyRequest(proto.message.HPGoogleIAPBuyRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPGoogleIAPBuyRequest to null");
            }

            this.msgHPGoogleIAPBuyRequest = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearMsgHPGoogleIAPBuyRequest() {
            this.msgHPGoogleIAPBuyRequest = proto.message.HPGoogleIAPBuyRequest.getDefaultInstance();
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasMsgHPGoogleIAPBuyRequest() {
            return (__bitField0 & 128) == 128;
        }

        public proto.message.HPGoogleIAPBuyResponse getMsgHPGoogleIAPBuyResponse() {
            return msgHPGoogleIAPBuyResponse;
        }

        public Builder setMsgHPGoogleIAPBuyResponse(proto.message.HPGoogleIAPBuyResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPGoogleIAPBuyResponse to null");
            }

            this.msgHPGoogleIAPBuyResponse = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearMsgHPGoogleIAPBuyResponse() {
            this.msgHPGoogleIAPBuyResponse = proto.message.HPGoogleIAPBuyResponse.getDefaultInstance();
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasMsgHPGoogleIAPBuyResponse() {
            return (__bitField0 & 256) == 256;
        }

        public long getClienttime() {
            return clienttime;
        }

        public Builder setClienttime(long value) {
            this.clienttime = value;
            __bitField0 |= 512;
            return this;
        }

        public Builder clearClienttime() {
            this.clienttime = 0L;
            __bitField0 &= ~512;
            return this;
        }

        public boolean hasClienttime() {
            return (__bitField0 & 512) == 512;
        }

        public proto.message.HPLOMInfoRequest getMsgHPLOMInfoRequest() {
            return msgHPLOMInfoRequest;
        }

        public Builder setMsgHPLOMInfoRequest(proto.message.HPLOMInfoRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPLOMInfoRequest to null");
            }

            this.msgHPLOMInfoRequest = value;
            __bitField0 |= 1024;
            return this;
        }

        public Builder clearMsgHPLOMInfoRequest() {
            this.msgHPLOMInfoRequest = proto.message.HPLOMInfoRequest.getDefaultInstance();
            __bitField0 &= ~1024;
            return this;
        }

        public boolean hasMsgHPLOMInfoRequest() {
            return (__bitField0 & 1024) == 1024;
        }

        public proto.message.HPLOMInfoResponse getMsgHPLOMInfoResponse() {
            return msgHPLOMInfoResponse;
        }

        public Builder setMsgHPLOMInfoResponse(proto.message.HPLOMInfoResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPLOMInfoResponse to null");
            }

            this.msgHPLOMInfoResponse = value;
            __bitField0 |= 2048;
            return this;
        }

        public Builder clearMsgHPLOMInfoResponse() {
            this.msgHPLOMInfoResponse = proto.message.HPLOMInfoResponse.getDefaultInstance();
            __bitField0 &= ~2048;
            return this;
        }

        public boolean hasMsgHPLOMInfoResponse() {
            return (__bitField0 & 2048) == 2048;
        }

        public proto.message.HPLOMUrlRequest getMsgHPLOMUrlRequest() {
            return msgHPLOMUrlRequest;
        }

        public Builder setMsgHPLOMUrlRequest(proto.message.HPLOMUrlRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPLOMUrlRequest to null");
            }

            this.msgHPLOMUrlRequest = value;
            __bitField0 |= 4096;
            return this;
        }

        public Builder clearMsgHPLOMUrlRequest() {
            this.msgHPLOMUrlRequest = proto.message.HPLOMUrlRequest.getDefaultInstance();
            __bitField0 &= ~4096;
            return this;
        }

        public boolean hasMsgHPLOMUrlRequest() {
            return (__bitField0 & 4096) == 4096;
        }

        public proto.message.HPLOMUrlResponse getMsgHPLOMUrlResponse() {
            return msgHPLOMUrlResponse;
        }

        public Builder setMsgHPLOMUrlResponse(proto.message.HPLOMUrlResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPLOMUrlResponse to null");
            }

            this.msgHPLOMUrlResponse = value;
            __bitField0 |= 8192;
            return this;
        }

        public Builder clearMsgHPLOMUrlResponse() {
            this.msgHPLOMUrlResponse = proto.message.HPLOMUrlResponse.getDefaultInstance();
            __bitField0 &= ~8192;
            return this;
        }

        public boolean hasMsgHPLOMUrlResponse() {
            return (__bitField0 & 8192) == 8192;
        }

        public proto.message.HPLOMBuyRequest getMsgHPLOMBuyRequest() {
            return msgHPLOMBuyRequest;
        }

        public Builder setMsgHPLOMBuyRequest(proto.message.HPLOMBuyRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPLOMBuyRequest to null");
            }

            this.msgHPLOMBuyRequest = value;
            __bitField0 |= 16384;
            return this;
        }

        public Builder clearMsgHPLOMBuyRequest() {
            this.msgHPLOMBuyRequest = proto.message.HPLOMBuyRequest.getDefaultInstance();
            __bitField0 &= ~16384;
            return this;
        }

        public boolean hasMsgHPLOMBuyRequest() {
            return (__bitField0 & 16384) == 16384;
        }

        public proto.message.HPLOMBuyResponse getMsgHPLOMBuyResponse() {
            return msgHPLOMBuyResponse;
        }

        public Builder setMsgHPLOMBuyResponse(proto.message.HPLOMBuyResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPLOMBuyResponse to null");
            }

            this.msgHPLOMBuyResponse = value;
            __bitField0 |= 32768;
            return this;
        }

        public Builder clearMsgHPLOMBuyResponse() {
            this.msgHPLOMBuyResponse = proto.message.HPLOMBuyResponse.getDefaultInstance();
            __bitField0 &= ~32768;
            return this;
        }

        public boolean hasMsgHPLOMBuyResponse() {
            return (__bitField0 & 32768) == 32768;
        }

        public proto.message.HPBPInfoRequest getMsgHPBPInfoRequest() {
            return msgHPBPInfoRequest;
        }

        public Builder setMsgHPBPInfoRequest(proto.message.HPBPInfoRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPBPInfoRequest to null");
            }

            this.msgHPBPInfoRequest = value;
            __bitField0 |= 65536;
            return this;
        }

        public Builder clearMsgHPBPInfoRequest() {
            this.msgHPBPInfoRequest = proto.message.HPBPInfoRequest.getDefaultInstance();
            __bitField0 &= ~65536;
            return this;
        }

        public boolean hasMsgHPBPInfoRequest() {
            return (__bitField0 & 65536) == 65536;
        }

        public proto.message.HPBPInfoResponse getMsgHPBPInfoResponse() {
            return msgHPBPInfoResponse;
        }

        public Builder setMsgHPBPInfoResponse(proto.message.HPBPInfoResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPBPInfoResponse to null");
            }

            this.msgHPBPInfoResponse = value;
            __bitField0 |= 131072;
            return this;
        }

        public Builder clearMsgHPBPInfoResponse() {
            this.msgHPBPInfoResponse = proto.message.HPBPInfoResponse.getDefaultInstance();
            __bitField0 &= ~131072;
            return this;
        }

        public boolean hasMsgHPBPInfoResponse() {
            return (__bitField0 & 131072) == 131072;
        }

        public proto.message.HPBPUrlRequest getMsgHPBPUrlRequest() {
            return msgHPBPUrlRequest;
        }

        public Builder setMsgHPBPUrlRequest(proto.message.HPBPUrlRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPBPUrlRequest to null");
            }

            this.msgHPBPUrlRequest = value;
            __bitField0 |= 262144;
            return this;
        }

        public Builder clearMsgHPBPUrlRequest() {
            this.msgHPBPUrlRequest = proto.message.HPBPUrlRequest.getDefaultInstance();
            __bitField0 &= ~262144;
            return this;
        }

        public boolean hasMsgHPBPUrlRequest() {
            return (__bitField0 & 262144) == 262144;
        }

        public proto.message.HPBPUrlResponse getMsgHPBPUrlResponse() {
            return msgHPBPUrlResponse;
        }

        public Builder setMsgHPBPUrlResponse(proto.message.HPBPUrlResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPBPUrlResponse to null");
            }

            this.msgHPBPUrlResponse = value;
            __bitField0 |= 524288;
            return this;
        }

        public Builder clearMsgHPBPUrlResponse() {
            this.msgHPBPUrlResponse = proto.message.HPBPUrlResponse.getDefaultInstance();
            __bitField0 &= ~524288;
            return this;
        }

        public boolean hasMsgHPBPUrlResponse() {
            return (__bitField0 & 524288) == 524288;
        }

        public proto.message.HPBPBuyRequest getMsgHPBPBuyRequest() {
            return msgHPBPBuyRequest;
        }

        public Builder setMsgHPBPBuyRequest(proto.message.HPBPBuyRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPBPBuyRequest to null");
            }

            this.msgHPBPBuyRequest = value;
            __bitField0 |= 1048576;
            return this;
        }

        public Builder clearMsgHPBPBuyRequest() {
            this.msgHPBPBuyRequest = proto.message.HPBPBuyRequest.getDefaultInstance();
            __bitField0 &= ~1048576;
            return this;
        }

        public boolean hasMsgHPBPBuyRequest() {
            return (__bitField0 & 1048576) == 1048576;
        }

        public proto.message.HPBPBuyResponse getMsgHPBPBuyResponse() {
            return msgHPBPBuyResponse;
        }

        public Builder setMsgHPBPBuyResponse(proto.message.HPBPBuyResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPBPBuyResponse to null");
            }

            this.msgHPBPBuyResponse = value;
            __bitField0 |= 2097152;
            return this;
        }

        public Builder clearMsgHPBPBuyResponse() {
            this.msgHPBPBuyResponse = proto.message.HPBPBuyResponse.getDefaultInstance();
            __bitField0 &= ~2097152;
            return this;
        }

        public boolean hasMsgHPBPBuyResponse() {
            return (__bitField0 & 2097152) == 2097152;
        }

        public proto.message.HPLOMGlobalInfoRequest getMsgHPLOMGlobalInfoRequest() {
            return msgHPLOMGlobalInfoRequest;
        }

        public Builder setMsgHPLOMGlobalInfoRequest(proto.message.HPLOMGlobalInfoRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPLOMGlobalInfoRequest to null");
            }

            this.msgHPLOMGlobalInfoRequest = value;
            __bitField0 |= 4194304;
            return this;
        }

        public Builder clearMsgHPLOMGlobalInfoRequest() {
            this.msgHPLOMGlobalInfoRequest = proto.message.HPLOMGlobalInfoRequest.getDefaultInstance();
            __bitField0 &= ~4194304;
            return this;
        }

        public boolean hasMsgHPLOMGlobalInfoRequest() {
            return (__bitField0 & 4194304) == 4194304;
        }

        public proto.message.HPLOMGlobalInfoResponse getMsgHPLOMGlobalInfoResponse() {
            return msgHPLOMGlobalInfoResponse;
        }

        public Builder setMsgHPLOMGlobalInfoResponse(proto.message.HPLOMGlobalInfoResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPLOMGlobalInfoResponse to null");
            }

            this.msgHPLOMGlobalInfoResponse = value;
            __bitField0 |= 8388608;
            return this;
        }

        public Builder clearMsgHPLOMGlobalInfoResponse() {
            this.msgHPLOMGlobalInfoResponse = proto.message.HPLOMGlobalInfoResponse.getDefaultInstance();
            __bitField0 &= ~8388608;
            return this;
        }

        public boolean hasMsgHPLOMGlobalInfoResponse() {
            return (__bitField0 & 8388608) == 8388608;
        }

        public proto.message.HPLOMGlobalUrlRequest getMsgHPLOMGlobalUrlRequest() {
            return msgHPLOMGlobalUrlRequest;
        }

        public Builder setMsgHPLOMGlobalUrlRequest(proto.message.HPLOMGlobalUrlRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPLOMGlobalUrlRequest to null");
            }

            this.msgHPLOMGlobalUrlRequest = value;
            __bitField0 |= 16777216;
            return this;
        }

        public Builder clearMsgHPLOMGlobalUrlRequest() {
            this.msgHPLOMGlobalUrlRequest = proto.message.HPLOMGlobalUrlRequest.getDefaultInstance();
            __bitField0 &= ~16777216;
            return this;
        }

        public boolean hasMsgHPLOMGlobalUrlRequest() {
            return (__bitField0 & 16777216) == 16777216;
        }

        public proto.message.HPLOMGlobalUrlResponse getMsgHPLOMGlobalUrlResponse() {
            return msgHPLOMGlobalUrlResponse;
        }

        public Builder setMsgHPLOMGlobalUrlResponse(proto.message.HPLOMGlobalUrlResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPLOMGlobalUrlResponse to null");
            }

            this.msgHPLOMGlobalUrlResponse = value;
            __bitField0 |= 33554432;
            return this;
        }

        public Builder clearMsgHPLOMGlobalUrlResponse() {
            this.msgHPLOMGlobalUrlResponse = proto.message.HPLOMGlobalUrlResponse.getDefaultInstance();
            __bitField0 &= ~33554432;
            return this;
        }

        public boolean hasMsgHPLOMGlobalUrlResponse() {
            return (__bitField0 & 33554432) == 33554432;
        }

        public proto.message.HPLOMGlobalBuyRequest getMsgHPLOMGlobalBuyRequest() {
            return msgHPLOMGlobalBuyRequest;
        }

        public Builder setMsgHPLOMGlobalBuyRequest(proto.message.HPLOMGlobalBuyRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPLOMGlobalBuyRequest to null");
            }

            this.msgHPLOMGlobalBuyRequest = value;
            __bitField0 |= 67108864;
            return this;
        }

        public Builder clearMsgHPLOMGlobalBuyRequest() {
            this.msgHPLOMGlobalBuyRequest = proto.message.HPLOMGlobalBuyRequest.getDefaultInstance();
            __bitField0 &= ~67108864;
            return this;
        }

        public boolean hasMsgHPLOMGlobalBuyRequest() {
            return (__bitField0 & 67108864) == 67108864;
        }

        public proto.message.HPLOMGlobalBuyResponse getMsgHPLOMGlobalBuyResponse() {
            return msgHPLOMGlobalBuyResponse;
        }

        public Builder setMsgHPLOMGlobalBuyResponse(proto.message.HPLOMGlobalBuyResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPLOMGlobalBuyResponse to null");
            }

            this.msgHPLOMGlobalBuyResponse = value;
            __bitField0 |= 134217728;
            return this;
        }

        public Builder clearMsgHPLOMGlobalBuyResponse() {
            this.msgHPLOMGlobalBuyResponse = proto.message.HPLOMGlobalBuyResponse.getDefaultInstance();
            __bitField0 &= ~134217728;
            return this;
        }

        public boolean hasMsgHPLOMGlobalBuyResponse() {
            return (__bitField0 & 134217728) == 134217728;
        }

        public proto.message.HPPromotionInfoRequest getMsgHPPromotionInfoRequest() {
            return msgHPPromotionInfoRequest;
        }

        public Builder setMsgHPPromotionInfoRequest(proto.message.HPPromotionInfoRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPPromotionInfoRequest to null");
            }

            this.msgHPPromotionInfoRequest = value;
            __bitField0 |= 268435456;
            return this;
        }

        public Builder clearMsgHPPromotionInfoRequest() {
            this.msgHPPromotionInfoRequest = proto.message.HPPromotionInfoRequest.getDefaultInstance();
            __bitField0 &= ~268435456;
            return this;
        }

        public boolean hasMsgHPPromotionInfoRequest() {
            return (__bitField0 & 268435456) == 268435456;
        }

        public proto.message.HPPromotionInfoResponse getMsgHPPromotionInfoResponse() {
            return msgHPPromotionInfoResponse;
        }

        public Builder setMsgHPPromotionInfoResponse(proto.message.HPPromotionInfoResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPPromotionInfoResponse to null");
            }

            this.msgHPPromotionInfoResponse = value;
            __bitField0 |= 536870912;
            return this;
        }

        public Builder clearMsgHPPromotionInfoResponse() {
            this.msgHPPromotionInfoResponse = proto.message.HPPromotionInfoResponse.getDefaultInstance();
            __bitField0 &= ~536870912;
            return this;
        }

        public boolean hasMsgHPPromotionInfoResponse() {
            return (__bitField0 & 536870912) == 536870912;
        }

        public proto.message.HPBoosterPackInfoRequest getMsgHPBoosterPackInfoRequest() {
            return msgHPBoosterPackInfoRequest;
        }

        public Builder setMsgHPBoosterPackInfoRequest(proto.message.HPBoosterPackInfoRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPBoosterPackInfoRequest to null");
            }

            this.msgHPBoosterPackInfoRequest = value;
            __bitField0 |= 1073741824;
            return this;
        }

        public Builder clearMsgHPBoosterPackInfoRequest() {
            this.msgHPBoosterPackInfoRequest = proto.message.HPBoosterPackInfoRequest.getDefaultInstance();
            __bitField0 &= ~1073741824;
            return this;
        }

        public boolean hasMsgHPBoosterPackInfoRequest() {
            return (__bitField0 & 1073741824) == 1073741824;
        }

        public proto.message.HPBoosterPackInfoResponse getMsgHPBoosterPackInforResponse() {
            return msgHPBoosterPackInforResponse;
        }

        public Builder setMsgHPBoosterPackInforResponse(proto.message.HPBoosterPackInfoResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPBoosterPackInforResponse to null");
            }

            this.msgHPBoosterPackInforResponse = value;
            __bitField0 |= -2147483648;
            return this;
        }

        public Builder clearMsgHPBoosterPackInforResponse() {
            this.msgHPBoosterPackInforResponse = proto.message.HPBoosterPackInfoResponse.getDefaultInstance();
            __bitField0 &= ~-2147483648;
            return this;
        }

        public boolean hasMsgHPBoosterPackInforResponse() {
            return (__bitField0 & -2147483648) == -2147483648;
        }

        public proto.message.HPCDInfoRequest getMsgHPCDInfoRequest() {
            return msgHPCDInfoRequest;
        }

        public Builder setMsgHPCDInfoRequest(proto.message.HPCDInfoRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPCDInfoRequest to null");
            }

            this.msgHPCDInfoRequest = value;
            __bitField1 |= 1;
            return this;
        }

        public Builder clearMsgHPCDInfoRequest() {
            this.msgHPCDInfoRequest = proto.message.HPCDInfoRequest.getDefaultInstance();
            __bitField1 &= ~1;
            return this;
        }

        public boolean hasMsgHPCDInfoRequest() {
            return (__bitField1 & 1) == 1;
        }

        public proto.message.HPCDInfoResponse getMsgHPCDInfoResponse() {
            return msgHPCDInfoResponse;
        }

        public Builder setMsgHPCDInfoResponse(proto.message.HPCDInfoResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPCDInfoResponse to null");
            }

            this.msgHPCDInfoResponse = value;
            __bitField1 |= 2;
            return this;
        }

        public Builder clearMsgHPCDInfoResponse() {
            this.msgHPCDInfoResponse = proto.message.HPCDInfoResponse.getDefaultInstance();
            __bitField1 &= ~2;
            return this;
        }

        public boolean hasMsgHPCDInfoResponse() {
            return (__bitField1 & 2) == 2;
        }

        public proto.message.HPCDBuyRequest getMsgHPCDBuyRequest() {
            return msgHPCDBuyRequest;
        }

        public Builder setMsgHPCDBuyRequest(proto.message.HPCDBuyRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPCDBuyRequest to null");
            }

            this.msgHPCDBuyRequest = value;
            __bitField1 |= 4;
            return this;
        }

        public Builder clearMsgHPCDBuyRequest() {
            this.msgHPCDBuyRequest = proto.message.HPCDBuyRequest.getDefaultInstance();
            __bitField1 &= ~4;
            return this;
        }

        public boolean hasMsgHPCDBuyRequest() {
            return (__bitField1 & 4) == 4;
        }

        public proto.message.HPCDBuyResponse getMsgHPCDBuyResponse() {
            return msgHPCDBuyResponse;
        }

        public Builder setMsgHPCDBuyResponse(proto.message.HPCDBuyResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPCDBuyResponse to null");
            }

            this.msgHPCDBuyResponse = value;
            __bitField1 |= 8;
            return this;
        }

        public Builder clearMsgHPCDBuyResponse() {
            this.msgHPCDBuyResponse = proto.message.HPCDBuyResponse.getDefaultInstance();
            __bitField1 &= ~8;
            return this;
        }

        public boolean hasMsgHPCDBuyResponse() {
            return (__bitField1 & 8) == 8;
        }

        public proto.message.HPSpecialOfferPackInfoRequest getMsgHPSpecialOfferPackInfoRequest() {
            return msgHPSpecialOfferPackInfoRequest;
        }

        public Builder setMsgHPSpecialOfferPackInfoRequest(proto.message.HPSpecialOfferPackInfoRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPSpecialOfferPackInfoRequest to null");
            }

            this.msgHPSpecialOfferPackInfoRequest = value;
            __bitField1 |= 16;
            return this;
        }

        public Builder clearMsgHPSpecialOfferPackInfoRequest() {
            this.msgHPSpecialOfferPackInfoRequest = proto.message.HPSpecialOfferPackInfoRequest.getDefaultInstance();
            __bitField1 &= ~16;
            return this;
        }

        public boolean hasMsgHPSpecialOfferPackInfoRequest() {
            return (__bitField1 & 16) == 16;
        }

        public proto.message.HPSpecialOfferPackInfoResponse getMsgHPSpecialOfferPackInforResponse() {
            return msgHPSpecialOfferPackInforResponse;
        }

        public Builder setMsgHPSpecialOfferPackInforResponse(proto.message.HPSpecialOfferPackInfoResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set HappyPlayMessage#msgHPSpecialOfferPackInforResponse to null");
            }

            this.msgHPSpecialOfferPackInforResponse = value;
            __bitField1 |= 32;
            return this;
        }

        public Builder clearMsgHPSpecialOfferPackInforResponse() {
            this.msgHPSpecialOfferPackInforResponse = proto.message.HPSpecialOfferPackInfoResponse.getDefaultInstance();
            __bitField1 &= ~32;
            return this;
        }

        public boolean hasMsgHPSpecialOfferPackInforResponse() {
            return (__bitField1 & 32) == 32;
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
            if (!java.util.Objects.equals(this.command, that.command)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPAppleHPIAPInfoRequest, that.msgHPAppleHPIAPInfoRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPAppleHPIAPInfoResponse, that.msgHPAppleHPIAPInfoResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPAppleIAPBuyRequest, that.msgHPAppleIAPBuyRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPAppleIAPBuyResponse, that.msgHPAppleIAPBuyResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPGoogleHPIAPInfoRequest, that.msgHPGoogleHPIAPInfoRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPGoogleHPIAPInfoResponse, that.msgHPGoogleHPIAPInfoResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPGoogleIAPBuyRequest, that.msgHPGoogleIAPBuyRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPGoogleIAPBuyResponse, that.msgHPGoogleIAPBuyResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.clienttime, that.clienttime)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPLOMInfoRequest, that.msgHPLOMInfoRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPLOMInfoResponse, that.msgHPLOMInfoResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPLOMUrlRequest, that.msgHPLOMUrlRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPLOMUrlResponse, that.msgHPLOMUrlResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPLOMBuyRequest, that.msgHPLOMBuyRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPLOMBuyResponse, that.msgHPLOMBuyResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPBPInfoRequest, that.msgHPBPInfoRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPBPInfoResponse, that.msgHPBPInfoResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPBPUrlRequest, that.msgHPBPUrlRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPBPUrlResponse, that.msgHPBPUrlResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPBPBuyRequest, that.msgHPBPBuyRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPBPBuyResponse, that.msgHPBPBuyResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPLOMGlobalInfoRequest, that.msgHPLOMGlobalInfoRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPLOMGlobalInfoResponse, that.msgHPLOMGlobalInfoResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPLOMGlobalUrlRequest, that.msgHPLOMGlobalUrlRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPLOMGlobalUrlResponse, that.msgHPLOMGlobalUrlResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPLOMGlobalBuyRequest, that.msgHPLOMGlobalBuyRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPLOMGlobalBuyResponse, that.msgHPLOMGlobalBuyResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPPromotionInfoRequest, that.msgHPPromotionInfoRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPPromotionInfoResponse, that.msgHPPromotionInfoResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPBoosterPackInfoRequest, that.msgHPBoosterPackInfoRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPBoosterPackInforResponse, that.msgHPBoosterPackInforResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPCDInfoRequest, that.msgHPCDInfoRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPCDInfoResponse, that.msgHPCDInfoResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPCDBuyRequest, that.msgHPCDBuyRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPCDBuyResponse, that.msgHPCDBuyResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPSpecialOfferPackInfoRequest, that.msgHPSpecialOfferPackInfoRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgHPSpecialOfferPackInforResponse, that.msgHPSpecialOfferPackInforResponse)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.command);
            result = 31 * result + (this.msgHPAppleHPIAPInfoRequest == null ? 0 : this.msgHPAppleHPIAPInfoRequest.hashCode());
            result = 31 * result + (this.msgHPAppleHPIAPInfoResponse == null ? 0 : this.msgHPAppleHPIAPInfoResponse.hashCode());
            result = 31 * result + (this.msgHPAppleIAPBuyRequest == null ? 0 : this.msgHPAppleIAPBuyRequest.hashCode());
            result = 31 * result + (this.msgHPAppleIAPBuyResponse == null ? 0 : this.msgHPAppleIAPBuyResponse.hashCode());
            result = 31 * result + (this.msgHPGoogleHPIAPInfoRequest == null ? 0 : this.msgHPGoogleHPIAPInfoRequest.hashCode());
            result = 31 * result + (this.msgHPGoogleHPIAPInfoResponse == null ? 0 : this.msgHPGoogleHPIAPInfoResponse.hashCode());
            result = 31 * result + (this.msgHPGoogleIAPBuyRequest == null ? 0 : this.msgHPGoogleIAPBuyRequest.hashCode());
            result = 31 * result + (this.msgHPGoogleIAPBuyResponse == null ? 0 : this.msgHPGoogleIAPBuyResponse.hashCode());
            result = 31 * result + Long.hashCode(this.clienttime);
            result = 31 * result + (this.msgHPLOMInfoRequest == null ? 0 : this.msgHPLOMInfoRequest.hashCode());
            result = 31 * result + (this.msgHPLOMInfoResponse == null ? 0 : this.msgHPLOMInfoResponse.hashCode());
            result = 31 * result + (this.msgHPLOMUrlRequest == null ? 0 : this.msgHPLOMUrlRequest.hashCode());
            result = 31 * result + (this.msgHPLOMUrlResponse == null ? 0 : this.msgHPLOMUrlResponse.hashCode());
            result = 31 * result + (this.msgHPLOMBuyRequest == null ? 0 : this.msgHPLOMBuyRequest.hashCode());
            result = 31 * result + (this.msgHPLOMBuyResponse == null ? 0 : this.msgHPLOMBuyResponse.hashCode());
            result = 31 * result + (this.msgHPBPInfoRequest == null ? 0 : this.msgHPBPInfoRequest.hashCode());
            result = 31 * result + (this.msgHPBPInfoResponse == null ? 0 : this.msgHPBPInfoResponse.hashCode());
            result = 31 * result + (this.msgHPBPUrlRequest == null ? 0 : this.msgHPBPUrlRequest.hashCode());
            result = 31 * result + (this.msgHPBPUrlResponse == null ? 0 : this.msgHPBPUrlResponse.hashCode());
            result = 31 * result + (this.msgHPBPBuyRequest == null ? 0 : this.msgHPBPBuyRequest.hashCode());
            result = 31 * result + (this.msgHPBPBuyResponse == null ? 0 : this.msgHPBPBuyResponse.hashCode());
            result = 31 * result + (this.msgHPLOMGlobalInfoRequest == null ? 0 : this.msgHPLOMGlobalInfoRequest.hashCode());
            result = 31 * result + (this.msgHPLOMGlobalInfoResponse == null ? 0 : this.msgHPLOMGlobalInfoResponse.hashCode());
            result = 31 * result + (this.msgHPLOMGlobalUrlRequest == null ? 0 : this.msgHPLOMGlobalUrlRequest.hashCode());
            result = 31 * result + (this.msgHPLOMGlobalUrlResponse == null ? 0 : this.msgHPLOMGlobalUrlResponse.hashCode());
            result = 31 * result + (this.msgHPLOMGlobalBuyRequest == null ? 0 : this.msgHPLOMGlobalBuyRequest.hashCode());
            result = 31 * result + (this.msgHPLOMGlobalBuyResponse == null ? 0 : this.msgHPLOMGlobalBuyResponse.hashCode());
            result = 31 * result + (this.msgHPPromotionInfoRequest == null ? 0 : this.msgHPPromotionInfoRequest.hashCode());
            result = 31 * result + (this.msgHPPromotionInfoResponse == null ? 0 : this.msgHPPromotionInfoResponse.hashCode());
            result = 31 * result + (this.msgHPBoosterPackInfoRequest == null ? 0 : this.msgHPBoosterPackInfoRequest.hashCode());
            result = 31 * result + (this.msgHPBoosterPackInforResponse == null ? 0 : this.msgHPBoosterPackInforResponse.hashCode());
            result = 31 * result + (this.msgHPCDInfoRequest == null ? 0 : this.msgHPCDInfoRequest.hashCode());
            result = 31 * result + (this.msgHPCDInfoResponse == null ? 0 : this.msgHPCDInfoResponse.hashCode());
            result = 31 * result + (this.msgHPCDBuyRequest == null ? 0 : this.msgHPCDBuyRequest.hashCode());
            result = 31 * result + (this.msgHPCDBuyResponse == null ? 0 : this.msgHPCDBuyResponse.hashCode());
            result = 31 * result + (this.msgHPSpecialOfferPackInfoRequest == null ? 0 : this.msgHPSpecialOfferPackInfoRequest.hashCode());
            result = 31 * result + (this.msgHPSpecialOfferPackInforResponse == null ? 0 : this.msgHPSpecialOfferPackInforResponse.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasCommand()) {
                parts.add("command=" + getCommand() + '(' + getCommandValue() + ')');
            }
            if (hasMsgHPAppleHPIAPInfoRequest()) {
                parts.add("msgHPAppleHPIAPInfoRequest=" + getMsgHPAppleHPIAPInfoRequest());
            }
            if (hasMsgHPAppleHPIAPInfoResponse()) {
                parts.add("msgHPAppleHPIAPInfoResponse=" + getMsgHPAppleHPIAPInfoResponse());
            }
            if (hasMsgHPAppleIAPBuyRequest()) {
                parts.add("msgHPAppleIAPBuyRequest=" + getMsgHPAppleIAPBuyRequest());
            }
            if (hasMsgHPAppleIAPBuyResponse()) {
                parts.add("msgHPAppleIAPBuyResponse=" + getMsgHPAppleIAPBuyResponse());
            }
            if (hasMsgHPGoogleHPIAPInfoRequest()) {
                parts.add("msgHPGoogleHPIAPInfoRequest=" + getMsgHPGoogleHPIAPInfoRequest());
            }
            if (hasMsgHPGoogleHPIAPInfoResponse()) {
                parts.add("msgHPGoogleHPIAPInfoResponse=" + getMsgHPGoogleHPIAPInfoResponse());
            }
            if (hasMsgHPGoogleIAPBuyRequest()) {
                parts.add("msgHPGoogleIAPBuyRequest=" + getMsgHPGoogleIAPBuyRequest());
            }
            if (hasMsgHPGoogleIAPBuyResponse()) {
                parts.add("msgHPGoogleIAPBuyResponse=" + getMsgHPGoogleIAPBuyResponse());
            }
            if (hasClienttime()) {
                parts.add("clienttime=" + getClienttime());
            }
            if (hasMsgHPLOMInfoRequest()) {
                parts.add("msgHPLOMInfoRequest=" + getMsgHPLOMInfoRequest());
            }
            if (hasMsgHPLOMInfoResponse()) {
                parts.add("msgHPLOMInfoResponse=" + getMsgHPLOMInfoResponse());
            }
            if (hasMsgHPLOMUrlRequest()) {
                parts.add("msgHPLOMUrlRequest=" + getMsgHPLOMUrlRequest());
            }
            if (hasMsgHPLOMUrlResponse()) {
                parts.add("msgHPLOMUrlResponse=" + getMsgHPLOMUrlResponse());
            }
            if (hasMsgHPLOMBuyRequest()) {
                parts.add("msgHPLOMBuyRequest=" + getMsgHPLOMBuyRequest());
            }
            if (hasMsgHPLOMBuyResponse()) {
                parts.add("msgHPLOMBuyResponse=" + getMsgHPLOMBuyResponse());
            }
            if (hasMsgHPBPInfoRequest()) {
                parts.add("msgHPBPInfoRequest=" + getMsgHPBPInfoRequest());
            }
            if (hasMsgHPBPInfoResponse()) {
                parts.add("msgHPBPInfoResponse=" + getMsgHPBPInfoResponse());
            }
            if (hasMsgHPBPUrlRequest()) {
                parts.add("msgHPBPUrlRequest=" + getMsgHPBPUrlRequest());
            }
            if (hasMsgHPBPUrlResponse()) {
                parts.add("msgHPBPUrlResponse=" + getMsgHPBPUrlResponse());
            }
            if (hasMsgHPBPBuyRequest()) {
                parts.add("msgHPBPBuyRequest=" + getMsgHPBPBuyRequest());
            }
            if (hasMsgHPBPBuyResponse()) {
                parts.add("msgHPBPBuyResponse=" + getMsgHPBPBuyResponse());
            }
            if (hasMsgHPLOMGlobalInfoRequest()) {
                parts.add("msgHPLOMGlobalInfoRequest=" + getMsgHPLOMGlobalInfoRequest());
            }
            if (hasMsgHPLOMGlobalInfoResponse()) {
                parts.add("msgHPLOMGlobalInfoResponse=" + getMsgHPLOMGlobalInfoResponse());
            }
            if (hasMsgHPLOMGlobalUrlRequest()) {
                parts.add("msgHPLOMGlobalUrlRequest=" + getMsgHPLOMGlobalUrlRequest());
            }
            if (hasMsgHPLOMGlobalUrlResponse()) {
                parts.add("msgHPLOMGlobalUrlResponse=" + getMsgHPLOMGlobalUrlResponse());
            }
            if (hasMsgHPLOMGlobalBuyRequest()) {
                parts.add("msgHPLOMGlobalBuyRequest=" + getMsgHPLOMGlobalBuyRequest());
            }
            if (hasMsgHPLOMGlobalBuyResponse()) {
                parts.add("msgHPLOMGlobalBuyResponse=" + getMsgHPLOMGlobalBuyResponse());
            }
            if (hasMsgHPPromotionInfoRequest()) {
                parts.add("msgHPPromotionInfoRequest=" + getMsgHPPromotionInfoRequest());
            }
            if (hasMsgHPPromotionInfoResponse()) {
                parts.add("msgHPPromotionInfoResponse=" + getMsgHPPromotionInfoResponse());
            }
            if (hasMsgHPBoosterPackInfoRequest()) {
                parts.add("msgHPBoosterPackInfoRequest=" + getMsgHPBoosterPackInfoRequest());
            }
            if (hasMsgHPBoosterPackInforResponse()) {
                parts.add("msgHPBoosterPackInforResponse=" + getMsgHPBoosterPackInforResponse());
            }
            if (hasMsgHPCDInfoRequest()) {
                parts.add("msgHPCDInfoRequest=" + getMsgHPCDInfoRequest());
            }
            if (hasMsgHPCDInfoResponse()) {
                parts.add("msgHPCDInfoResponse=" + getMsgHPCDInfoResponse());
            }
            if (hasMsgHPCDBuyRequest()) {
                parts.add("msgHPCDBuyRequest=" + getMsgHPCDBuyRequest());
            }
            if (hasMsgHPCDBuyResponse()) {
                parts.add("msgHPCDBuyResponse=" + getMsgHPCDBuyResponse());
            }
            if (hasMsgHPSpecialOfferPackInfoRequest()) {
                parts.add("msgHPSpecialOfferPackInfoRequest=" + getMsgHPSpecialOfferPackInfoRequest());
            }
            if (hasMsgHPSpecialOfferPackInforResponse()) {
                parts.add("msgHPSpecialOfferPackInforResponse=" + getMsgHPSpecialOfferPackInforResponse());
            }
            return "HappyPlayMessage{" + String.join(", ", parts) + "}";
        }

        public HappyPlayMessage build() {
            proto.message.HappyPlayMessage result = new proto.message.HappyPlayMessage();
            result.__bitField0 = __bitField0;
            result.__bitField1 = __bitField1;
            result.command = this.command;
            result.msgHPAppleHPIAPInfoRequest = this.msgHPAppleHPIAPInfoRequest;
            result.msgHPAppleHPIAPInfoResponse = this.msgHPAppleHPIAPInfoResponse;
            result.msgHPAppleIAPBuyRequest = this.msgHPAppleIAPBuyRequest;
            result.msgHPAppleIAPBuyResponse = this.msgHPAppleIAPBuyResponse;
            result.msgHPGoogleHPIAPInfoRequest = this.msgHPGoogleHPIAPInfoRequest;
            result.msgHPGoogleHPIAPInfoResponse = this.msgHPGoogleHPIAPInfoResponse;
            result.msgHPGoogleIAPBuyRequest = this.msgHPGoogleIAPBuyRequest;
            result.msgHPGoogleIAPBuyResponse = this.msgHPGoogleIAPBuyResponse;
            result.clienttime = this.clienttime;
            result.msgHPLOMInfoRequest = this.msgHPLOMInfoRequest;
            result.msgHPLOMInfoResponse = this.msgHPLOMInfoResponse;
            result.msgHPLOMUrlRequest = this.msgHPLOMUrlRequest;
            result.msgHPLOMUrlResponse = this.msgHPLOMUrlResponse;
            result.msgHPLOMBuyRequest = this.msgHPLOMBuyRequest;
            result.msgHPLOMBuyResponse = this.msgHPLOMBuyResponse;
            result.msgHPBPInfoRequest = this.msgHPBPInfoRequest;
            result.msgHPBPInfoResponse = this.msgHPBPInfoResponse;
            result.msgHPBPUrlRequest = this.msgHPBPUrlRequest;
            result.msgHPBPUrlResponse = this.msgHPBPUrlResponse;
            result.msgHPBPBuyRequest = this.msgHPBPBuyRequest;
            result.msgHPBPBuyResponse = this.msgHPBPBuyResponse;
            result.msgHPLOMGlobalInfoRequest = this.msgHPLOMGlobalInfoRequest;
            result.msgHPLOMGlobalInfoResponse = this.msgHPLOMGlobalInfoResponse;
            result.msgHPLOMGlobalUrlRequest = this.msgHPLOMGlobalUrlRequest;
            result.msgHPLOMGlobalUrlResponse = this.msgHPLOMGlobalUrlResponse;
            result.msgHPLOMGlobalBuyRequest = this.msgHPLOMGlobalBuyRequest;
            result.msgHPLOMGlobalBuyResponse = this.msgHPLOMGlobalBuyResponse;
            result.msgHPPromotionInfoRequest = this.msgHPPromotionInfoRequest;
            result.msgHPPromotionInfoResponse = this.msgHPPromotionInfoResponse;
            result.msgHPBoosterPackInfoRequest = this.msgHPBoosterPackInfoRequest;
            result.msgHPBoosterPackInforResponse = this.msgHPBoosterPackInforResponse;
            result.msgHPCDInfoRequest = this.msgHPCDInfoRequest;
            result.msgHPCDInfoResponse = this.msgHPCDInfoResponse;
            result.msgHPCDBuyRequest = this.msgHPCDBuyRequest;
            result.msgHPCDBuyResponse = this.msgHPCDBuyResponse;
            result.msgHPSpecialOfferPackInfoRequest = this.msgHPSpecialOfferPackInfoRequest;
            result.msgHPSpecialOfferPackInforResponse = this.msgHPSpecialOfferPackInforResponse;
            return result;
        }

    }



}