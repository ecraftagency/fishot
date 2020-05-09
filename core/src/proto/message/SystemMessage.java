package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_system.proto")
public final class SystemMessage
        implements io.protostuff.Message<SystemMessage> {

    private static final SystemMessage DEFAULT_INSTANCE = newBuilder().build();

    private int command;

    private proto.message.ErrorResponse msgErrorResponse;

    private proto.message.LoginRequest msgLoginRequest;

    private proto.message.LoginResponse msgLoginResponse;

    private proto.message.PushMessage msgPushMessageResponse;

    private proto.message.PushMessage msgMaintainResponse;

    private proto.message.GameFuncResponse msgGameFuncResponse;

    private proto.message.OrbitDataChecksum msgOrbitDataChecksum;

    private proto.message.AppflyerLog msgAppflyerRequest;

    private proto.message.SnsServerTokenRequest msgSnsServerTokenRequest;

    private proto.message.SnsServerTokenResponse msgSnsServerTokenResponse;

    private proto.message.NotificationRequest msgNotificationRequest;

    private proto.message.NotificationResponse msgNotificationResponse;

    private long clienttime;

    private proto.message.PushMessageRequest msgPushMessageRequest;

    private proto.message.ServerStatusResponse msgServerStatusResponse;

    private proto.message.ImageShareRequest msgImageShareRequest;

    private proto.message.NotifyMessageSoccerResponse msgNotifyMessageSoccerResponse;

    private proto.message.ImageShareInfoRequest msgImageShareInfoRequest;

    private proto.message.ImageShareInfoResponse msgImageShareInfoResponse;

    private proto.message.ImageShareResponse msgImageShareResponse;

    private proto.message.ImageShareBoardResponse msgImageShareBoardResponse;

    private proto.message.LanguageChangeRequest msgLanguageChangeRequest;

    private proto.message.LanguageChangeResponse msgLanguageChangeResponse;

    private proto.message.PingTestRequest msgPingTestRequest;

    private proto.message.PingTestResponse msgPingTestResponse;

    private proto.message.NetworkLoggerRequest msgNetworkLoggerRequest;

    private boolean __merge_lock = false;
    private int __bitField0;

    private SystemMessage() {
        this.command = proto.message.SystemCommand.SYSTEM_MSG_PING.getNumber();
        this.msgErrorResponse = proto.message.ErrorResponse.getDefaultInstance();
        this.msgLoginRequest = proto.message.LoginRequest.getDefaultInstance();
        this.msgLoginResponse = proto.message.LoginResponse.getDefaultInstance();
        this.msgPushMessageResponse = proto.message.PushMessage.getDefaultInstance();
        this.msgMaintainResponse = proto.message.PushMessage.getDefaultInstance();
        this.msgGameFuncResponse = proto.message.GameFuncResponse.getDefaultInstance();
        this.msgOrbitDataChecksum = proto.message.OrbitDataChecksum.getDefaultInstance();
        this.msgAppflyerRequest = proto.message.AppflyerLog.getDefaultInstance();
        this.msgSnsServerTokenRequest = proto.message.SnsServerTokenRequest.getDefaultInstance();
        this.msgSnsServerTokenResponse = proto.message.SnsServerTokenResponse.getDefaultInstance();
        this.msgNotificationRequest = proto.message.NotificationRequest.getDefaultInstance();
        this.msgNotificationResponse = proto.message.NotificationResponse.getDefaultInstance();
        this.clienttime = 0L;
        this.msgPushMessageRequest = proto.message.PushMessageRequest.getDefaultInstance();
        this.msgServerStatusResponse = proto.message.ServerStatusResponse.getDefaultInstance();
        this.msgImageShareRequest = proto.message.ImageShareRequest.getDefaultInstance();
        this.msgNotifyMessageSoccerResponse = proto.message.NotifyMessageSoccerResponse.getDefaultInstance();
        this.msgImageShareInfoRequest = proto.message.ImageShareInfoRequest.getDefaultInstance();
        this.msgImageShareInfoResponse = proto.message.ImageShareInfoResponse.getDefaultInstance();
        this.msgImageShareResponse = proto.message.ImageShareResponse.getDefaultInstance();
        this.msgImageShareBoardResponse = proto.message.ImageShareBoardResponse.getDefaultInstance();
        this.msgLanguageChangeRequest = proto.message.LanguageChangeRequest.getDefaultInstance();
        this.msgLanguageChangeResponse = proto.message.LanguageChangeResponse.getDefaultInstance();
        this.msgPingTestRequest = proto.message.PingTestRequest.getDefaultInstance();
        this.msgPingTestResponse = proto.message.PingTestResponse.getDefaultInstance();
        this.msgNetworkLoggerRequest = proto.message.NetworkLoggerRequest.getDefaultInstance();
    }

    private SystemMessage(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static SystemMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<SystemMessage> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public proto.message.SystemCommand getCommand() {
        return proto.message.SystemCommand.valueOf(command);
    }

    public int getCommandValue() {
        return command;
    }

    public boolean hasCommand() {
        return (__bitField0 & 1) == 1;
    }

    public SystemMessage withCommand(proto.message.SystemCommand value) {
        return SystemMessage.newBuilder()
            .mergeFrom(this)
            .setCommand(value)
            .build();
    }

    public proto.message.ErrorResponse getMsgErrorResponse() {
        return msgErrorResponse;
    }

    public boolean hasMsgErrorResponse() {
        return (__bitField0 & 2) == 2;
    }

    public SystemMessage withMsgErrorResponse(proto.message.ErrorResponse value) {
        return SystemMessage.newBuilder()
            .mergeFrom(this)
            .setMsgErrorResponse(value)
            .build();
    }

    public proto.message.LoginRequest getMsgLoginRequest() {
        return msgLoginRequest;
    }

    public boolean hasMsgLoginRequest() {
        return (__bitField0 & 4) == 4;
    }

    public SystemMessage withMsgLoginRequest(proto.message.LoginRequest value) {
        return SystemMessage.newBuilder()
            .mergeFrom(this)
            .setMsgLoginRequest(value)
            .build();
    }

    public proto.message.LoginResponse getMsgLoginResponse() {
        return msgLoginResponse;
    }

    public boolean hasMsgLoginResponse() {
        return (__bitField0 & 8) == 8;
    }

    public SystemMessage withMsgLoginResponse(proto.message.LoginResponse value) {
        return SystemMessage.newBuilder()
            .mergeFrom(this)
            .setMsgLoginResponse(value)
            .build();
    }

    public proto.message.PushMessage getMsgPushMessageResponse() {
        return msgPushMessageResponse;
    }

    public boolean hasMsgPushMessageResponse() {
        return (__bitField0 & 16) == 16;
    }

    public SystemMessage withMsgPushMessageResponse(proto.message.PushMessage value) {
        return SystemMessage.newBuilder()
            .mergeFrom(this)
            .setMsgPushMessageResponse(value)
            .build();
    }

    public proto.message.PushMessage getMsgMaintainResponse() {
        return msgMaintainResponse;
    }

    public boolean hasMsgMaintainResponse() {
        return (__bitField0 & 32) == 32;
    }

    public SystemMessage withMsgMaintainResponse(proto.message.PushMessage value) {
        return SystemMessage.newBuilder()
            .mergeFrom(this)
            .setMsgMaintainResponse(value)
            .build();
    }

    public proto.message.GameFuncResponse getMsgGameFuncResponse() {
        return msgGameFuncResponse;
    }

    public boolean hasMsgGameFuncResponse() {
        return (__bitField0 & 64) == 64;
    }

    public SystemMessage withMsgGameFuncResponse(proto.message.GameFuncResponse value) {
        return SystemMessage.newBuilder()
            .mergeFrom(this)
            .setMsgGameFuncResponse(value)
            .build();
    }

    public proto.message.OrbitDataChecksum getMsgOrbitDataChecksum() {
        return msgOrbitDataChecksum;
    }

    public boolean hasMsgOrbitDataChecksum() {
        return (__bitField0 & 128) == 128;
    }

    public SystemMessage withMsgOrbitDataChecksum(proto.message.OrbitDataChecksum value) {
        return SystemMessage.newBuilder()
            .mergeFrom(this)
            .setMsgOrbitDataChecksum(value)
            .build();
    }

    public proto.message.AppflyerLog getMsgAppflyerRequest() {
        return msgAppflyerRequest;
    }

    public boolean hasMsgAppflyerRequest() {
        return (__bitField0 & 256) == 256;
    }

    public SystemMessage withMsgAppflyerRequest(proto.message.AppflyerLog value) {
        return SystemMessage.newBuilder()
            .mergeFrom(this)
            .setMsgAppflyerRequest(value)
            .build();
    }

    public proto.message.SnsServerTokenRequest getMsgSnsServerTokenRequest() {
        return msgSnsServerTokenRequest;
    }

    public boolean hasMsgSnsServerTokenRequest() {
        return (__bitField0 & 512) == 512;
    }

    public SystemMessage withMsgSnsServerTokenRequest(proto.message.SnsServerTokenRequest value) {
        return SystemMessage.newBuilder()
            .mergeFrom(this)
            .setMsgSnsServerTokenRequest(value)
            .build();
    }

    public proto.message.SnsServerTokenResponse getMsgSnsServerTokenResponse() {
        return msgSnsServerTokenResponse;
    }

    public boolean hasMsgSnsServerTokenResponse() {
        return (__bitField0 & 1024) == 1024;
    }

    public SystemMessage withMsgSnsServerTokenResponse(proto.message.SnsServerTokenResponse value) {
        return SystemMessage.newBuilder()
            .mergeFrom(this)
            .setMsgSnsServerTokenResponse(value)
            .build();
    }

    public proto.message.NotificationRequest getMsgNotificationRequest() {
        return msgNotificationRequest;
    }

    public boolean hasMsgNotificationRequest() {
        return (__bitField0 & 2048) == 2048;
    }

    public SystemMessage withMsgNotificationRequest(proto.message.NotificationRequest value) {
        return SystemMessage.newBuilder()
            .mergeFrom(this)
            .setMsgNotificationRequest(value)
            .build();
    }

    public proto.message.NotificationResponse getMsgNotificationResponse() {
        return msgNotificationResponse;
    }

    public boolean hasMsgNotificationResponse() {
        return (__bitField0 & 4096) == 4096;
    }

    public SystemMessage withMsgNotificationResponse(proto.message.NotificationResponse value) {
        return SystemMessage.newBuilder()
            .mergeFrom(this)
            .setMsgNotificationResponse(value)
            .build();
    }

    public long getClienttime() {
        return clienttime;
    }

    public boolean hasClienttime() {
        return (__bitField0 & 8192) == 8192;
    }

    public SystemMessage withClienttime(long value) {
        return SystemMessage.newBuilder()
            .mergeFrom(this)
            .setClienttime(value)
            .build();
    }

    public proto.message.PushMessageRequest getMsgPushMessageRequest() {
        return msgPushMessageRequest;
    }

    public boolean hasMsgPushMessageRequest() {
        return (__bitField0 & 16384) == 16384;
    }

    public SystemMessage withMsgPushMessageRequest(proto.message.PushMessageRequest value) {
        return SystemMessage.newBuilder()
            .mergeFrom(this)
            .setMsgPushMessageRequest(value)
            .build();
    }

    public proto.message.ServerStatusResponse getMsgServerStatusResponse() {
        return msgServerStatusResponse;
    }

    public boolean hasMsgServerStatusResponse() {
        return (__bitField0 & 32768) == 32768;
    }

    public SystemMessage withMsgServerStatusResponse(proto.message.ServerStatusResponse value) {
        return SystemMessage.newBuilder()
            .mergeFrom(this)
            .setMsgServerStatusResponse(value)
            .build();
    }

    public proto.message.ImageShareRequest getMsgImageShareRequest() {
        return msgImageShareRequest;
    }

    public boolean hasMsgImageShareRequest() {
        return (__bitField0 & 65536) == 65536;
    }

    public SystemMessage withMsgImageShareRequest(proto.message.ImageShareRequest value) {
        return SystemMessage.newBuilder()
            .mergeFrom(this)
            .setMsgImageShareRequest(value)
            .build();
    }

    public proto.message.NotifyMessageSoccerResponse getMsgNotifyMessageSoccerResponse() {
        return msgNotifyMessageSoccerResponse;
    }

    public boolean hasMsgNotifyMessageSoccerResponse() {
        return (__bitField0 & 131072) == 131072;
    }

    public SystemMessage withMsgNotifyMessageSoccerResponse(proto.message.NotifyMessageSoccerResponse value) {
        return SystemMessage.newBuilder()
            .mergeFrom(this)
            .setMsgNotifyMessageSoccerResponse(value)
            .build();
    }

    public proto.message.ImageShareInfoRequest getMsgImageShareInfoRequest() {
        return msgImageShareInfoRequest;
    }

    public boolean hasMsgImageShareInfoRequest() {
        return (__bitField0 & 262144) == 262144;
    }

    public SystemMessage withMsgImageShareInfoRequest(proto.message.ImageShareInfoRequest value) {
        return SystemMessage.newBuilder()
            .mergeFrom(this)
            .setMsgImageShareInfoRequest(value)
            .build();
    }

    public proto.message.ImageShareInfoResponse getMsgImageShareInfoResponse() {
        return msgImageShareInfoResponse;
    }

    public boolean hasMsgImageShareInfoResponse() {
        return (__bitField0 & 524288) == 524288;
    }

    public SystemMessage withMsgImageShareInfoResponse(proto.message.ImageShareInfoResponse value) {
        return SystemMessage.newBuilder()
            .mergeFrom(this)
            .setMsgImageShareInfoResponse(value)
            .build();
    }

    public proto.message.ImageShareResponse getMsgImageShareResponse() {
        return msgImageShareResponse;
    }

    public boolean hasMsgImageShareResponse() {
        return (__bitField0 & 1048576) == 1048576;
    }

    public SystemMessage withMsgImageShareResponse(proto.message.ImageShareResponse value) {
        return SystemMessage.newBuilder()
            .mergeFrom(this)
            .setMsgImageShareResponse(value)
            .build();
    }

    public proto.message.ImageShareBoardResponse getMsgImageShareBoardResponse() {
        return msgImageShareBoardResponse;
    }

    public boolean hasMsgImageShareBoardResponse() {
        return (__bitField0 & 2097152) == 2097152;
    }

    public SystemMessage withMsgImageShareBoardResponse(proto.message.ImageShareBoardResponse value) {
        return SystemMessage.newBuilder()
            .mergeFrom(this)
            .setMsgImageShareBoardResponse(value)
            .build();
    }

    public proto.message.LanguageChangeRequest getMsgLanguageChangeRequest() {
        return msgLanguageChangeRequest;
    }

    public boolean hasMsgLanguageChangeRequest() {
        return (__bitField0 & 4194304) == 4194304;
    }

    public SystemMessage withMsgLanguageChangeRequest(proto.message.LanguageChangeRequest value) {
        return SystemMessage.newBuilder()
            .mergeFrom(this)
            .setMsgLanguageChangeRequest(value)
            .build();
    }

    public proto.message.LanguageChangeResponse getMsgLanguageChangeResponse() {
        return msgLanguageChangeResponse;
    }

    public boolean hasMsgLanguageChangeResponse() {
        return (__bitField0 & 8388608) == 8388608;
    }

    public SystemMessage withMsgLanguageChangeResponse(proto.message.LanguageChangeResponse value) {
        return SystemMessage.newBuilder()
            .mergeFrom(this)
            .setMsgLanguageChangeResponse(value)
            .build();
    }

    public proto.message.PingTestRequest getMsgPingTestRequest() {
        return msgPingTestRequest;
    }

    public boolean hasMsgPingTestRequest() {
        return (__bitField0 & 16777216) == 16777216;
    }

    public SystemMessage withMsgPingTestRequest(proto.message.PingTestRequest value) {
        return SystemMessage.newBuilder()
            .mergeFrom(this)
            .setMsgPingTestRequest(value)
            .build();
    }

    public proto.message.PingTestResponse getMsgPingTestResponse() {
        return msgPingTestResponse;
    }

    public boolean hasMsgPingTestResponse() {
        return (__bitField0 & 33554432) == 33554432;
    }

    public SystemMessage withMsgPingTestResponse(proto.message.PingTestResponse value) {
        return SystemMessage.newBuilder()
            .mergeFrom(this)
            .setMsgPingTestResponse(value)
            .build();
    }

    public proto.message.NetworkLoggerRequest getMsgNetworkLoggerRequest() {
        return msgNetworkLoggerRequest;
    }

    public boolean hasMsgNetworkLoggerRequest() {
        return (__bitField0 & 67108864) == 67108864;
    }

    public SystemMessage withMsgNetworkLoggerRequest(proto.message.NetworkLoggerRequest value) {
        return SystemMessage.newBuilder()
            .mergeFrom(this)
            .setMsgNetworkLoggerRequest(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<SystemMessage> cachedSchema() {
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
        SystemMessage that = (SystemMessage) obj;
        if (!java.util.Objects.equals(this.command, that.command)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgErrorResponse, that.msgErrorResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgLoginRequest, that.msgLoginRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgLoginResponse, that.msgLoginResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgPushMessageResponse, that.msgPushMessageResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgMaintainResponse, that.msgMaintainResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgGameFuncResponse, that.msgGameFuncResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgOrbitDataChecksum, that.msgOrbitDataChecksum)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgAppflyerRequest, that.msgAppflyerRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgSnsServerTokenRequest, that.msgSnsServerTokenRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgSnsServerTokenResponse, that.msgSnsServerTokenResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgNotificationRequest, that.msgNotificationRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgNotificationResponse, that.msgNotificationResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.clienttime, that.clienttime)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgPushMessageRequest, that.msgPushMessageRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgServerStatusResponse, that.msgServerStatusResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgImageShareRequest, that.msgImageShareRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgNotifyMessageSoccerResponse, that.msgNotifyMessageSoccerResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgImageShareInfoRequest, that.msgImageShareInfoRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgImageShareInfoResponse, that.msgImageShareInfoResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgImageShareResponse, that.msgImageShareResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgImageShareBoardResponse, that.msgImageShareBoardResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgLanguageChangeRequest, that.msgLanguageChangeRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgLanguageChangeResponse, that.msgLanguageChangeResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgPingTestRequest, that.msgPingTestRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgPingTestResponse, that.msgPingTestResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgNetworkLoggerRequest, that.msgNetworkLoggerRequest)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.command);
        result = 31 * result + (this.msgErrorResponse == null ? 0 : this.msgErrorResponse.hashCode());
        result = 31 * result + (this.msgLoginRequest == null ? 0 : this.msgLoginRequest.hashCode());
        result = 31 * result + (this.msgLoginResponse == null ? 0 : this.msgLoginResponse.hashCode());
        result = 31 * result + (this.msgPushMessageResponse == null ? 0 : this.msgPushMessageResponse.hashCode());
        result = 31 * result + (this.msgMaintainResponse == null ? 0 : this.msgMaintainResponse.hashCode());
        result = 31 * result + (this.msgGameFuncResponse == null ? 0 : this.msgGameFuncResponse.hashCode());
        result = 31 * result + (this.msgOrbitDataChecksum == null ? 0 : this.msgOrbitDataChecksum.hashCode());
        result = 31 * result + (this.msgAppflyerRequest == null ? 0 : this.msgAppflyerRequest.hashCode());
        result = 31 * result + (this.msgSnsServerTokenRequest == null ? 0 : this.msgSnsServerTokenRequest.hashCode());
        result = 31 * result + (this.msgSnsServerTokenResponse == null ? 0 : this.msgSnsServerTokenResponse.hashCode());
        result = 31 * result + (this.msgNotificationRequest == null ? 0 : this.msgNotificationRequest.hashCode());
        result = 31 * result + (this.msgNotificationResponse == null ? 0 : this.msgNotificationResponse.hashCode());
        result = 31 * result + Long.hashCode(this.clienttime);
        result = 31 * result + (this.msgPushMessageRequest == null ? 0 : this.msgPushMessageRequest.hashCode());
        result = 31 * result + (this.msgServerStatusResponse == null ? 0 : this.msgServerStatusResponse.hashCode());
        result = 31 * result + (this.msgImageShareRequest == null ? 0 : this.msgImageShareRequest.hashCode());
        result = 31 * result + (this.msgNotifyMessageSoccerResponse == null ? 0 : this.msgNotifyMessageSoccerResponse.hashCode());
        result = 31 * result + (this.msgImageShareInfoRequest == null ? 0 : this.msgImageShareInfoRequest.hashCode());
        result = 31 * result + (this.msgImageShareInfoResponse == null ? 0 : this.msgImageShareInfoResponse.hashCode());
        result = 31 * result + (this.msgImageShareResponse == null ? 0 : this.msgImageShareResponse.hashCode());
        result = 31 * result + (this.msgImageShareBoardResponse == null ? 0 : this.msgImageShareBoardResponse.hashCode());
        result = 31 * result + (this.msgLanguageChangeRequest == null ? 0 : this.msgLanguageChangeRequest.hashCode());
        result = 31 * result + (this.msgLanguageChangeResponse == null ? 0 : this.msgLanguageChangeResponse.hashCode());
        result = 31 * result + (this.msgPingTestRequest == null ? 0 : this.msgPingTestRequest.hashCode());
        result = 31 * result + (this.msgPingTestResponse == null ? 0 : this.msgPingTestResponse.hashCode());
        result = 31 * result + (this.msgNetworkLoggerRequest == null ? 0 : this.msgNetworkLoggerRequest.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasCommand()) {
            parts.add("command=" + getCommand() + '(' + getCommandValue() + ')');
        }
        if (hasMsgErrorResponse()) {
            parts.add("msgErrorResponse=" + getMsgErrorResponse());
        }
        if (hasMsgLoginRequest()) {
            parts.add("msgLoginRequest=" + getMsgLoginRequest());
        }
        if (hasMsgLoginResponse()) {
            parts.add("msgLoginResponse=" + getMsgLoginResponse());
        }
        if (hasMsgPushMessageResponse()) {
            parts.add("msgPushMessageResponse=" + getMsgPushMessageResponse());
        }
        if (hasMsgMaintainResponse()) {
            parts.add("msgMaintainResponse=" + getMsgMaintainResponse());
        }
        if (hasMsgGameFuncResponse()) {
            parts.add("msgGameFuncResponse=" + getMsgGameFuncResponse());
        }
        if (hasMsgOrbitDataChecksum()) {
            parts.add("msgOrbitDataChecksum=" + getMsgOrbitDataChecksum());
        }
        if (hasMsgAppflyerRequest()) {
            parts.add("msgAppflyerRequest=" + getMsgAppflyerRequest());
        }
        if (hasMsgSnsServerTokenRequest()) {
            parts.add("msgSnsServerTokenRequest=" + getMsgSnsServerTokenRequest());
        }
        if (hasMsgSnsServerTokenResponse()) {
            parts.add("msgSnsServerTokenResponse=" + getMsgSnsServerTokenResponse());
        }
        if (hasMsgNotificationRequest()) {
            parts.add("msgNotificationRequest=" + getMsgNotificationRequest());
        }
        if (hasMsgNotificationResponse()) {
            parts.add("msgNotificationResponse=" + getMsgNotificationResponse());
        }
        if (hasClienttime()) {
            parts.add("clienttime=" + getClienttime());
        }
        if (hasMsgPushMessageRequest()) {
            parts.add("msgPushMessageRequest=" + getMsgPushMessageRequest());
        }
        if (hasMsgServerStatusResponse()) {
            parts.add("msgServerStatusResponse=" + getMsgServerStatusResponse());
        }
        if (hasMsgImageShareRequest()) {
            parts.add("msgImageShareRequest=" + getMsgImageShareRequest());
        }
        if (hasMsgNotifyMessageSoccerResponse()) {
            parts.add("msgNotifyMessageSoccerResponse=" + getMsgNotifyMessageSoccerResponse());
        }
        if (hasMsgImageShareInfoRequest()) {
            parts.add("msgImageShareInfoRequest=" + getMsgImageShareInfoRequest());
        }
        if (hasMsgImageShareInfoResponse()) {
            parts.add("msgImageShareInfoResponse=" + getMsgImageShareInfoResponse());
        }
        if (hasMsgImageShareResponse()) {
            parts.add("msgImageShareResponse=" + getMsgImageShareResponse());
        }
        if (hasMsgImageShareBoardResponse()) {
            parts.add("msgImageShareBoardResponse=" + getMsgImageShareBoardResponse());
        }
        if (hasMsgLanguageChangeRequest()) {
            parts.add("msgLanguageChangeRequest=" + getMsgLanguageChangeRequest());
        }
        if (hasMsgLanguageChangeResponse()) {
            parts.add("msgLanguageChangeResponse=" + getMsgLanguageChangeResponse());
        }
        if (hasMsgPingTestRequest()) {
            parts.add("msgPingTestRequest=" + getMsgPingTestRequest());
        }
        if (hasMsgPingTestResponse()) {
            parts.add("msgPingTestResponse=" + getMsgPingTestResponse());
        }
        if (hasMsgNetworkLoggerRequest()) {
            parts.add("msgNetworkLoggerRequest=" + getMsgNetworkLoggerRequest());
        }
        return "SystemMessage{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<SystemMessage>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("command", 1);
        	__fieldMap.put("msgErrorResponse", 2);
        	__fieldMap.put("msgLoginRequest", 3);
        	__fieldMap.put("msgLoginResponse", 4);
        	__fieldMap.put("msgPushMessageResponse", 5);
        	__fieldMap.put("msgMaintainResponse", 6);
        	__fieldMap.put("msgGameFuncResponse", 7);
        	__fieldMap.put("msgOrbitDataChecksum", 8);
        	__fieldMap.put("msgAppflyerRequest", 9);
        	__fieldMap.put("msgSnsServerTokenRequest", 10);
        	__fieldMap.put("msgSnsServerTokenResponse", 11);
        	__fieldMap.put("msgNotificationRequest", 12);
        	__fieldMap.put("msgNotificationResponse", 13);
        	__fieldMap.put("clienttime", 14);
        	__fieldMap.put("msgPushMessageRequest", 15);
        	__fieldMap.put("msgServerStatusResponse", 16);
        	__fieldMap.put("msgImageShareRequest", 17);
        	__fieldMap.put("msgNotifyMessageSoccerResponse", 18);
        	__fieldMap.put("msgImageShareInfoRequest", 19);
        	__fieldMap.put("msgImageShareInfoResponse", 20);
        	__fieldMap.put("msgImageShareResponse", 21);
        	__fieldMap.put("msgImageShareBoardResponse", 22);
        	__fieldMap.put("msgLanguageChangeRequest", 23);
        	__fieldMap.put("msgLanguageChangeResponse", 24);
        	__fieldMap.put("msgPingTestRequest", 25);
        	__fieldMap.put("msgPingTestResponse", 26);
        	__fieldMap.put("msgNetworkLoggerRequest", 27);
        }

        @Override
        public SystemMessage newMessage() {
            return new SystemMessage();
        }

        @Override
        public Class<SystemMessage> typeClass() {
            return SystemMessage.class;
        }

        @Override
        public String messageName() {
            return SystemMessage.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return SystemMessage.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(SystemMessage message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, SystemMessage instance) throws java.io.IOException {
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
                    case 2:
                    	instance.msgErrorResponse = input.mergeObject(null, proto.message.ErrorResponse.getSchema());
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.msgLoginRequest = input.mergeObject(null, proto.message.LoginRequest.getSchema());
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.msgLoginResponse = input.mergeObject(null, proto.message.LoginResponse.getSchema());
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.msgPushMessageResponse = input.mergeObject(null, proto.message.PushMessage.getSchema());
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.msgMaintainResponse = input.mergeObject(null, proto.message.PushMessage.getSchema());
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.msgGameFuncResponse = input.mergeObject(null, proto.message.GameFuncResponse.getSchema());
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.msgOrbitDataChecksum = input.mergeObject(null, proto.message.OrbitDataChecksum.getSchema());
                    	instance.__bitField0 |= 128;
                    	break;
                    case 9:
                    	instance.msgAppflyerRequest = input.mergeObject(null, proto.message.AppflyerLog.getSchema());
                    	instance.__bitField0 |= 256;
                    	break;
                    case 10:
                    	instance.msgSnsServerTokenRequest = input.mergeObject(null, proto.message.SnsServerTokenRequest.getSchema());
                    	instance.__bitField0 |= 512;
                    	break;
                    case 11:
                    	instance.msgSnsServerTokenResponse = input.mergeObject(null, proto.message.SnsServerTokenResponse.getSchema());
                    	instance.__bitField0 |= 1024;
                    	break;
                    case 12:
                    	instance.msgNotificationRequest = input.mergeObject(null, proto.message.NotificationRequest.getSchema());
                    	instance.__bitField0 |= 2048;
                    	break;
                    case 13:
                    	instance.msgNotificationResponse = input.mergeObject(null, proto.message.NotificationResponse.getSchema());
                    	instance.__bitField0 |= 4096;
                    	break;
                    case 14:
                    	instance.clienttime = input.readInt64();
                    	instance.__bitField0 |= 8192;
                    	break;
                    case 15:
                    	instance.msgPushMessageRequest = input.mergeObject(null, proto.message.PushMessageRequest.getSchema());
                    	instance.__bitField0 |= 16384;
                    	break;
                    case 16:
                    	instance.msgServerStatusResponse = input.mergeObject(null, proto.message.ServerStatusResponse.getSchema());
                    	instance.__bitField0 |= 32768;
                    	break;
                    case 17:
                    	instance.msgImageShareRequest = input.mergeObject(null, proto.message.ImageShareRequest.getSchema());
                    	instance.__bitField0 |= 65536;
                    	break;
                    case 18:
                    	instance.msgNotifyMessageSoccerResponse = input.mergeObject(null, proto.message.NotifyMessageSoccerResponse.getSchema());
                    	instance.__bitField0 |= 131072;
                    	break;
                    case 19:
                    	instance.msgImageShareInfoRequest = input.mergeObject(null, proto.message.ImageShareInfoRequest.getSchema());
                    	instance.__bitField0 |= 262144;
                    	break;
                    case 20:
                    	instance.msgImageShareInfoResponse = input.mergeObject(null, proto.message.ImageShareInfoResponse.getSchema());
                    	instance.__bitField0 |= 524288;
                    	break;
                    case 21:
                    	instance.msgImageShareResponse = input.mergeObject(null, proto.message.ImageShareResponse.getSchema());
                    	instance.__bitField0 |= 1048576;
                    	break;
                    case 22:
                    	instance.msgImageShareBoardResponse = input.mergeObject(null, proto.message.ImageShareBoardResponse.getSchema());
                    	instance.__bitField0 |= 2097152;
                    	break;
                    case 23:
                    	instance.msgLanguageChangeRequest = input.mergeObject(null, proto.message.LanguageChangeRequest.getSchema());
                    	instance.__bitField0 |= 4194304;
                    	break;
                    case 24:
                    	instance.msgLanguageChangeResponse = input.mergeObject(null, proto.message.LanguageChangeResponse.getSchema());
                    	instance.__bitField0 |= 8388608;
                    	break;
                    case 25:
                    	instance.msgPingTestRequest = input.mergeObject(null, proto.message.PingTestRequest.getSchema());
                    	instance.__bitField0 |= 16777216;
                    	break;
                    case 26:
                    	instance.msgPingTestResponse = input.mergeObject(null, proto.message.PingTestResponse.getSchema());
                    	instance.__bitField0 |= 33554432;
                    	break;
                    case 27:
                    	instance.msgNetworkLoggerRequest = input.mergeObject(null, proto.message.NetworkLoggerRequest.getSchema());
                    	instance.__bitField0 |= 67108864;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, SystemMessage instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.command, false);
            }

            if((instance.__bitField0 & 2) == 2) {
            	output.writeObject(2, instance.msgErrorResponse, proto.message.ErrorResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 4) == 4) {
            	output.writeObject(3, instance.msgLoginRequest, proto.message.LoginRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 8) == 8) {
            	output.writeObject(4, instance.msgLoginResponse, proto.message.LoginResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 16) == 16) {
            	output.writeObject(5, instance.msgPushMessageResponse, proto.message.PushMessage.getSchema(), false);
            }

            if((instance.__bitField0 & 32) == 32) {
            	output.writeObject(6, instance.msgMaintainResponse, proto.message.PushMessage.getSchema(), false);
            }

            if((instance.__bitField0 & 64) == 64) {
            	output.writeObject(7, instance.msgGameFuncResponse, proto.message.GameFuncResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 128) == 128) {
            	output.writeObject(8, instance.msgOrbitDataChecksum, proto.message.OrbitDataChecksum.getSchema(), false);
            }

            if((instance.__bitField0 & 256) == 256) {
            	output.writeObject(9, instance.msgAppflyerRequest, proto.message.AppflyerLog.getSchema(), false);
            }

            if((instance.__bitField0 & 512) == 512) {
            	output.writeObject(10, instance.msgSnsServerTokenRequest, proto.message.SnsServerTokenRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 1024) == 1024) {
            	output.writeObject(11, instance.msgSnsServerTokenResponse, proto.message.SnsServerTokenResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 2048) == 2048) {
            	output.writeObject(12, instance.msgNotificationRequest, proto.message.NotificationRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 4096) == 4096) {
            	output.writeObject(13, instance.msgNotificationResponse, proto.message.NotificationResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 8192) == 8192) {
                output.writeInt64(14, instance.clienttime, false);
            }

            if((instance.__bitField0 & 16384) == 16384) {
            	output.writeObject(15, instance.msgPushMessageRequest, proto.message.PushMessageRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 32768) == 32768) {
            	output.writeObject(16, instance.msgServerStatusResponse, proto.message.ServerStatusResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 65536) == 65536) {
            	output.writeObject(17, instance.msgImageShareRequest, proto.message.ImageShareRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 131072) == 131072) {
            	output.writeObject(18, instance.msgNotifyMessageSoccerResponse, proto.message.NotifyMessageSoccerResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 262144) == 262144) {
            	output.writeObject(19, instance.msgImageShareInfoRequest, proto.message.ImageShareInfoRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 524288) == 524288) {
            	output.writeObject(20, instance.msgImageShareInfoResponse, proto.message.ImageShareInfoResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 1048576) == 1048576) {
            	output.writeObject(21, instance.msgImageShareResponse, proto.message.ImageShareResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 2097152) == 2097152) {
            	output.writeObject(22, instance.msgImageShareBoardResponse, proto.message.ImageShareBoardResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 4194304) == 4194304) {
            	output.writeObject(23, instance.msgLanguageChangeRequest, proto.message.LanguageChangeRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 8388608) == 8388608) {
            	output.writeObject(24, instance.msgLanguageChangeResponse, proto.message.LanguageChangeResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 16777216) == 16777216) {
            	output.writeObject(25, instance.msgPingTestRequest, proto.message.PingTestRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 33554432) == 33554432) {
            	output.writeObject(26, instance.msgPingTestResponse, proto.message.PingTestResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 67108864) == 67108864) {
            	output.writeObject(27, instance.msgNetworkLoggerRequest, proto.message.NetworkLoggerRequest.getSchema(), false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "command";
        		case 2: return "msgErrorResponse";
        		case 3: return "msgLoginRequest";
        		case 4: return "msgLoginResponse";
        		case 5: return "msgPushMessageResponse";
        		case 6: return "msgMaintainResponse";
        		case 7: return "msgGameFuncResponse";
        		case 8: return "msgOrbitDataChecksum";
        		case 9: return "msgAppflyerRequest";
        		case 10: return "msgSnsServerTokenRequest";
        		case 11: return "msgSnsServerTokenResponse";
        		case 12: return "msgNotificationRequest";
        		case 13: return "msgNotificationResponse";
        		case 14: return "clienttime";
        		case 15: return "msgPushMessageRequest";
        		case 16: return "msgServerStatusResponse";
        		case 17: return "msgImageShareRequest";
        		case 18: return "msgNotifyMessageSoccerResponse";
        		case 19: return "msgImageShareInfoRequest";
        		case 20: return "msgImageShareInfoResponse";
        		case 21: return "msgImageShareResponse";
        		case 22: return "msgImageShareBoardResponse";
        		case 23: return "msgLanguageChangeRequest";
        		case 24: return "msgLanguageChangeResponse";
        		case 25: return "msgPingTestRequest";
        		case 26: return "msgPingTestResponse";
        		case 27: return "msgNetworkLoggerRequest";
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

        private proto.message.ErrorResponse msgErrorResponse;

        private proto.message.LoginRequest msgLoginRequest;

        private proto.message.LoginResponse msgLoginResponse;

        private proto.message.PushMessage msgPushMessageResponse;

        private proto.message.PushMessage msgMaintainResponse;

        private proto.message.GameFuncResponse msgGameFuncResponse;

        private proto.message.OrbitDataChecksum msgOrbitDataChecksum;

        private proto.message.AppflyerLog msgAppflyerRequest;

        private proto.message.SnsServerTokenRequest msgSnsServerTokenRequest;

        private proto.message.SnsServerTokenResponse msgSnsServerTokenResponse;

        private proto.message.NotificationRequest msgNotificationRequest;

        private proto.message.NotificationResponse msgNotificationResponse;

        private long clienttime;

        private proto.message.PushMessageRequest msgPushMessageRequest;

        private proto.message.ServerStatusResponse msgServerStatusResponse;

        private proto.message.ImageShareRequest msgImageShareRequest;

        private proto.message.NotifyMessageSoccerResponse msgNotifyMessageSoccerResponse;

        private proto.message.ImageShareInfoRequest msgImageShareInfoRequest;

        private proto.message.ImageShareInfoResponse msgImageShareInfoResponse;

        private proto.message.ImageShareResponse msgImageShareResponse;

        private proto.message.ImageShareBoardResponse msgImageShareBoardResponse;

        private proto.message.LanguageChangeRequest msgLanguageChangeRequest;

        private proto.message.LanguageChangeResponse msgLanguageChangeResponse;

        private proto.message.PingTestRequest msgPingTestRequest;

        private proto.message.PingTestResponse msgPingTestResponse;

        private proto.message.NetworkLoggerRequest msgNetworkLoggerRequest;

        private int __bitField0;

        private Builder() {
            this.command = proto.message.SystemCommand.SYSTEM_MSG_PING.getNumber();
            this.msgErrorResponse = proto.message.ErrorResponse.getDefaultInstance();
            this.msgLoginRequest = proto.message.LoginRequest.getDefaultInstance();
            this.msgLoginResponse = proto.message.LoginResponse.getDefaultInstance();
            this.msgPushMessageResponse = proto.message.PushMessage.getDefaultInstance();
            this.msgMaintainResponse = proto.message.PushMessage.getDefaultInstance();
            this.msgGameFuncResponse = proto.message.GameFuncResponse.getDefaultInstance();
            this.msgOrbitDataChecksum = proto.message.OrbitDataChecksum.getDefaultInstance();
            this.msgAppflyerRequest = proto.message.AppflyerLog.getDefaultInstance();
            this.msgSnsServerTokenRequest = proto.message.SnsServerTokenRequest.getDefaultInstance();
            this.msgSnsServerTokenResponse = proto.message.SnsServerTokenResponse.getDefaultInstance();
            this.msgNotificationRequest = proto.message.NotificationRequest.getDefaultInstance();
            this.msgNotificationResponse = proto.message.NotificationResponse.getDefaultInstance();
            this.clienttime = 0L;
            this.msgPushMessageRequest = proto.message.PushMessageRequest.getDefaultInstance();
            this.msgServerStatusResponse = proto.message.ServerStatusResponse.getDefaultInstance();
            this.msgImageShareRequest = proto.message.ImageShareRequest.getDefaultInstance();
            this.msgNotifyMessageSoccerResponse = proto.message.NotifyMessageSoccerResponse.getDefaultInstance();
            this.msgImageShareInfoRequest = proto.message.ImageShareInfoRequest.getDefaultInstance();
            this.msgImageShareInfoResponse = proto.message.ImageShareInfoResponse.getDefaultInstance();
            this.msgImageShareResponse = proto.message.ImageShareResponse.getDefaultInstance();
            this.msgImageShareBoardResponse = proto.message.ImageShareBoardResponse.getDefaultInstance();
            this.msgLanguageChangeRequest = proto.message.LanguageChangeRequest.getDefaultInstance();
            this.msgLanguageChangeResponse = proto.message.LanguageChangeResponse.getDefaultInstance();
            this.msgPingTestRequest = proto.message.PingTestRequest.getDefaultInstance();
            this.msgPingTestResponse = proto.message.PingTestResponse.getDefaultInstance();
            this.msgNetworkLoggerRequest = proto.message.NetworkLoggerRequest.getDefaultInstance();
        }

        public Builder mergeFrom(SystemMessage instance) {
            if (instance.hasCommand()) {
                this.setCommand(instance.getCommand());
            }

            if (instance.hasMsgErrorResponse()) {
                this.setMsgErrorResponse(instance.getMsgErrorResponse());
            }

            if (instance.hasMsgLoginRequest()) {
                this.setMsgLoginRequest(instance.getMsgLoginRequest());
            }

            if (instance.hasMsgLoginResponse()) {
                this.setMsgLoginResponse(instance.getMsgLoginResponse());
            }

            if (instance.hasMsgPushMessageResponse()) {
                this.setMsgPushMessageResponse(instance.getMsgPushMessageResponse());
            }

            if (instance.hasMsgMaintainResponse()) {
                this.setMsgMaintainResponse(instance.getMsgMaintainResponse());
            }

            if (instance.hasMsgGameFuncResponse()) {
                this.setMsgGameFuncResponse(instance.getMsgGameFuncResponse());
            }

            if (instance.hasMsgOrbitDataChecksum()) {
                this.setMsgOrbitDataChecksum(instance.getMsgOrbitDataChecksum());
            }

            if (instance.hasMsgAppflyerRequest()) {
                this.setMsgAppflyerRequest(instance.getMsgAppflyerRequest());
            }

            if (instance.hasMsgSnsServerTokenRequest()) {
                this.setMsgSnsServerTokenRequest(instance.getMsgSnsServerTokenRequest());
            }

            if (instance.hasMsgSnsServerTokenResponse()) {
                this.setMsgSnsServerTokenResponse(instance.getMsgSnsServerTokenResponse());
            }

            if (instance.hasMsgNotificationRequest()) {
                this.setMsgNotificationRequest(instance.getMsgNotificationRequest());
            }

            if (instance.hasMsgNotificationResponse()) {
                this.setMsgNotificationResponse(instance.getMsgNotificationResponse());
            }

            if (instance.hasClienttime()) {
                this.setClienttime(instance.getClienttime());
            }

            if (instance.hasMsgPushMessageRequest()) {
                this.setMsgPushMessageRequest(instance.getMsgPushMessageRequest());
            }

            if (instance.hasMsgServerStatusResponse()) {
                this.setMsgServerStatusResponse(instance.getMsgServerStatusResponse());
            }

            if (instance.hasMsgImageShareRequest()) {
                this.setMsgImageShareRequest(instance.getMsgImageShareRequest());
            }

            if (instance.hasMsgNotifyMessageSoccerResponse()) {
                this.setMsgNotifyMessageSoccerResponse(instance.getMsgNotifyMessageSoccerResponse());
            }

            if (instance.hasMsgImageShareInfoRequest()) {
                this.setMsgImageShareInfoRequest(instance.getMsgImageShareInfoRequest());
            }

            if (instance.hasMsgImageShareInfoResponse()) {
                this.setMsgImageShareInfoResponse(instance.getMsgImageShareInfoResponse());
            }

            if (instance.hasMsgImageShareResponse()) {
                this.setMsgImageShareResponse(instance.getMsgImageShareResponse());
            }

            if (instance.hasMsgImageShareBoardResponse()) {
                this.setMsgImageShareBoardResponse(instance.getMsgImageShareBoardResponse());
            }

            if (instance.hasMsgLanguageChangeRequest()) {
                this.setMsgLanguageChangeRequest(instance.getMsgLanguageChangeRequest());
            }

            if (instance.hasMsgLanguageChangeResponse()) {
                this.setMsgLanguageChangeResponse(instance.getMsgLanguageChangeResponse());
            }

            if (instance.hasMsgPingTestRequest()) {
                this.setMsgPingTestRequest(instance.getMsgPingTestRequest());
            }

            if (instance.hasMsgPingTestResponse()) {
                this.setMsgPingTestResponse(instance.getMsgPingTestResponse());
            }

            if (instance.hasMsgNetworkLoggerRequest()) {
                this.setMsgNetworkLoggerRequest(instance.getMsgNetworkLoggerRequest());
            }

            return this;
        }

        public proto.message.SystemCommand getCommand() {
            return proto.message.SystemCommand.valueOf(command);
        }

        public int getCommandValue() {
            return command;
        }

        public Builder setCommand(proto.message.SystemCommand value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SystemMessage#command to null");
            }

            if (value == proto.message.SystemCommand.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set SystemMessage#command to UNRECOGNIZED");
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

        public proto.message.ErrorResponse getMsgErrorResponse() {
            return msgErrorResponse;
        }

        public Builder setMsgErrorResponse(proto.message.ErrorResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SystemMessage#msgErrorResponse to null");
            }

            this.msgErrorResponse = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearMsgErrorResponse() {
            this.msgErrorResponse = proto.message.ErrorResponse.getDefaultInstance();
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasMsgErrorResponse() {
            return (__bitField0 & 2) == 2;
        }

        public proto.message.LoginRequest getMsgLoginRequest() {
            return msgLoginRequest;
        }

        public Builder setMsgLoginRequest(proto.message.LoginRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SystemMessage#msgLoginRequest to null");
            }

            this.msgLoginRequest = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearMsgLoginRequest() {
            this.msgLoginRequest = proto.message.LoginRequest.getDefaultInstance();
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasMsgLoginRequest() {
            return (__bitField0 & 4) == 4;
        }

        public proto.message.LoginResponse getMsgLoginResponse() {
            return msgLoginResponse;
        }

        public Builder setMsgLoginResponse(proto.message.LoginResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SystemMessage#msgLoginResponse to null");
            }

            this.msgLoginResponse = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearMsgLoginResponse() {
            this.msgLoginResponse = proto.message.LoginResponse.getDefaultInstance();
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasMsgLoginResponse() {
            return (__bitField0 & 8) == 8;
        }

        public proto.message.PushMessage getMsgPushMessageResponse() {
            return msgPushMessageResponse;
        }

        public Builder setMsgPushMessageResponse(proto.message.PushMessage value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SystemMessage#msgPushMessageResponse to null");
            }

            this.msgPushMessageResponse = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearMsgPushMessageResponse() {
            this.msgPushMessageResponse = proto.message.PushMessage.getDefaultInstance();
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasMsgPushMessageResponse() {
            return (__bitField0 & 16) == 16;
        }

        public proto.message.PushMessage getMsgMaintainResponse() {
            return msgMaintainResponse;
        }

        public Builder setMsgMaintainResponse(proto.message.PushMessage value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SystemMessage#msgMaintainResponse to null");
            }

            this.msgMaintainResponse = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearMsgMaintainResponse() {
            this.msgMaintainResponse = proto.message.PushMessage.getDefaultInstance();
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasMsgMaintainResponse() {
            return (__bitField0 & 32) == 32;
        }

        public proto.message.GameFuncResponse getMsgGameFuncResponse() {
            return msgGameFuncResponse;
        }

        public Builder setMsgGameFuncResponse(proto.message.GameFuncResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SystemMessage#msgGameFuncResponse to null");
            }

            this.msgGameFuncResponse = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearMsgGameFuncResponse() {
            this.msgGameFuncResponse = proto.message.GameFuncResponse.getDefaultInstance();
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasMsgGameFuncResponse() {
            return (__bitField0 & 64) == 64;
        }

        public proto.message.OrbitDataChecksum getMsgOrbitDataChecksum() {
            return msgOrbitDataChecksum;
        }

        public Builder setMsgOrbitDataChecksum(proto.message.OrbitDataChecksum value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SystemMessage#msgOrbitDataChecksum to null");
            }

            this.msgOrbitDataChecksum = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearMsgOrbitDataChecksum() {
            this.msgOrbitDataChecksum = proto.message.OrbitDataChecksum.getDefaultInstance();
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasMsgOrbitDataChecksum() {
            return (__bitField0 & 128) == 128;
        }

        public proto.message.AppflyerLog getMsgAppflyerRequest() {
            return msgAppflyerRequest;
        }

        public Builder setMsgAppflyerRequest(proto.message.AppflyerLog value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SystemMessage#msgAppflyerRequest to null");
            }

            this.msgAppflyerRequest = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearMsgAppflyerRequest() {
            this.msgAppflyerRequest = proto.message.AppflyerLog.getDefaultInstance();
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasMsgAppflyerRequest() {
            return (__bitField0 & 256) == 256;
        }

        public proto.message.SnsServerTokenRequest getMsgSnsServerTokenRequest() {
            return msgSnsServerTokenRequest;
        }

        public Builder setMsgSnsServerTokenRequest(proto.message.SnsServerTokenRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SystemMessage#msgSnsServerTokenRequest to null");
            }

            this.msgSnsServerTokenRequest = value;
            __bitField0 |= 512;
            return this;
        }

        public Builder clearMsgSnsServerTokenRequest() {
            this.msgSnsServerTokenRequest = proto.message.SnsServerTokenRequest.getDefaultInstance();
            __bitField0 &= ~512;
            return this;
        }

        public boolean hasMsgSnsServerTokenRequest() {
            return (__bitField0 & 512) == 512;
        }

        public proto.message.SnsServerTokenResponse getMsgSnsServerTokenResponse() {
            return msgSnsServerTokenResponse;
        }

        public Builder setMsgSnsServerTokenResponse(proto.message.SnsServerTokenResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SystemMessage#msgSnsServerTokenResponse to null");
            }

            this.msgSnsServerTokenResponse = value;
            __bitField0 |= 1024;
            return this;
        }

        public Builder clearMsgSnsServerTokenResponse() {
            this.msgSnsServerTokenResponse = proto.message.SnsServerTokenResponse.getDefaultInstance();
            __bitField0 &= ~1024;
            return this;
        }

        public boolean hasMsgSnsServerTokenResponse() {
            return (__bitField0 & 1024) == 1024;
        }

        public proto.message.NotificationRequest getMsgNotificationRequest() {
            return msgNotificationRequest;
        }

        public Builder setMsgNotificationRequest(proto.message.NotificationRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SystemMessage#msgNotificationRequest to null");
            }

            this.msgNotificationRequest = value;
            __bitField0 |= 2048;
            return this;
        }

        public Builder clearMsgNotificationRequest() {
            this.msgNotificationRequest = proto.message.NotificationRequest.getDefaultInstance();
            __bitField0 &= ~2048;
            return this;
        }

        public boolean hasMsgNotificationRequest() {
            return (__bitField0 & 2048) == 2048;
        }

        public proto.message.NotificationResponse getMsgNotificationResponse() {
            return msgNotificationResponse;
        }

        public Builder setMsgNotificationResponse(proto.message.NotificationResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SystemMessage#msgNotificationResponse to null");
            }

            this.msgNotificationResponse = value;
            __bitField0 |= 4096;
            return this;
        }

        public Builder clearMsgNotificationResponse() {
            this.msgNotificationResponse = proto.message.NotificationResponse.getDefaultInstance();
            __bitField0 &= ~4096;
            return this;
        }

        public boolean hasMsgNotificationResponse() {
            return (__bitField0 & 4096) == 4096;
        }

        public long getClienttime() {
            return clienttime;
        }

        public Builder setClienttime(long value) {
            this.clienttime = value;
            __bitField0 |= 8192;
            return this;
        }

        public Builder clearClienttime() {
            this.clienttime = 0L;
            __bitField0 &= ~8192;
            return this;
        }

        public boolean hasClienttime() {
            return (__bitField0 & 8192) == 8192;
        }

        public proto.message.PushMessageRequest getMsgPushMessageRequest() {
            return msgPushMessageRequest;
        }

        public Builder setMsgPushMessageRequest(proto.message.PushMessageRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SystemMessage#msgPushMessageRequest to null");
            }

            this.msgPushMessageRequest = value;
            __bitField0 |= 16384;
            return this;
        }

        public Builder clearMsgPushMessageRequest() {
            this.msgPushMessageRequest = proto.message.PushMessageRequest.getDefaultInstance();
            __bitField0 &= ~16384;
            return this;
        }

        public boolean hasMsgPushMessageRequest() {
            return (__bitField0 & 16384) == 16384;
        }

        public proto.message.ServerStatusResponse getMsgServerStatusResponse() {
            return msgServerStatusResponse;
        }

        public Builder setMsgServerStatusResponse(proto.message.ServerStatusResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SystemMessage#msgServerStatusResponse to null");
            }

            this.msgServerStatusResponse = value;
            __bitField0 |= 32768;
            return this;
        }

        public Builder clearMsgServerStatusResponse() {
            this.msgServerStatusResponse = proto.message.ServerStatusResponse.getDefaultInstance();
            __bitField0 &= ~32768;
            return this;
        }

        public boolean hasMsgServerStatusResponse() {
            return (__bitField0 & 32768) == 32768;
        }

        public proto.message.ImageShareRequest getMsgImageShareRequest() {
            return msgImageShareRequest;
        }

        public Builder setMsgImageShareRequest(proto.message.ImageShareRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SystemMessage#msgImageShareRequest to null");
            }

            this.msgImageShareRequest = value;
            __bitField0 |= 65536;
            return this;
        }

        public Builder clearMsgImageShareRequest() {
            this.msgImageShareRequest = proto.message.ImageShareRequest.getDefaultInstance();
            __bitField0 &= ~65536;
            return this;
        }

        public boolean hasMsgImageShareRequest() {
            return (__bitField0 & 65536) == 65536;
        }

        public proto.message.NotifyMessageSoccerResponse getMsgNotifyMessageSoccerResponse() {
            return msgNotifyMessageSoccerResponse;
        }

        public Builder setMsgNotifyMessageSoccerResponse(proto.message.NotifyMessageSoccerResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SystemMessage#msgNotifyMessageSoccerResponse to null");
            }

            this.msgNotifyMessageSoccerResponse = value;
            __bitField0 |= 131072;
            return this;
        }

        public Builder clearMsgNotifyMessageSoccerResponse() {
            this.msgNotifyMessageSoccerResponse = proto.message.NotifyMessageSoccerResponse.getDefaultInstance();
            __bitField0 &= ~131072;
            return this;
        }

        public boolean hasMsgNotifyMessageSoccerResponse() {
            return (__bitField0 & 131072) == 131072;
        }

        public proto.message.ImageShareInfoRequest getMsgImageShareInfoRequest() {
            return msgImageShareInfoRequest;
        }

        public Builder setMsgImageShareInfoRequest(proto.message.ImageShareInfoRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SystemMessage#msgImageShareInfoRequest to null");
            }

            this.msgImageShareInfoRequest = value;
            __bitField0 |= 262144;
            return this;
        }

        public Builder clearMsgImageShareInfoRequest() {
            this.msgImageShareInfoRequest = proto.message.ImageShareInfoRequest.getDefaultInstance();
            __bitField0 &= ~262144;
            return this;
        }

        public boolean hasMsgImageShareInfoRequest() {
            return (__bitField0 & 262144) == 262144;
        }

        public proto.message.ImageShareInfoResponse getMsgImageShareInfoResponse() {
            return msgImageShareInfoResponse;
        }

        public Builder setMsgImageShareInfoResponse(proto.message.ImageShareInfoResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SystemMessage#msgImageShareInfoResponse to null");
            }

            this.msgImageShareInfoResponse = value;
            __bitField0 |= 524288;
            return this;
        }

        public Builder clearMsgImageShareInfoResponse() {
            this.msgImageShareInfoResponse = proto.message.ImageShareInfoResponse.getDefaultInstance();
            __bitField0 &= ~524288;
            return this;
        }

        public boolean hasMsgImageShareInfoResponse() {
            return (__bitField0 & 524288) == 524288;
        }

        public proto.message.ImageShareResponse getMsgImageShareResponse() {
            return msgImageShareResponse;
        }

        public Builder setMsgImageShareResponse(proto.message.ImageShareResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SystemMessage#msgImageShareResponse to null");
            }

            this.msgImageShareResponse = value;
            __bitField0 |= 1048576;
            return this;
        }

        public Builder clearMsgImageShareResponse() {
            this.msgImageShareResponse = proto.message.ImageShareResponse.getDefaultInstance();
            __bitField0 &= ~1048576;
            return this;
        }

        public boolean hasMsgImageShareResponse() {
            return (__bitField0 & 1048576) == 1048576;
        }

        public proto.message.ImageShareBoardResponse getMsgImageShareBoardResponse() {
            return msgImageShareBoardResponse;
        }

        public Builder setMsgImageShareBoardResponse(proto.message.ImageShareBoardResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SystemMessage#msgImageShareBoardResponse to null");
            }

            this.msgImageShareBoardResponse = value;
            __bitField0 |= 2097152;
            return this;
        }

        public Builder clearMsgImageShareBoardResponse() {
            this.msgImageShareBoardResponse = proto.message.ImageShareBoardResponse.getDefaultInstance();
            __bitField0 &= ~2097152;
            return this;
        }

        public boolean hasMsgImageShareBoardResponse() {
            return (__bitField0 & 2097152) == 2097152;
        }

        public proto.message.LanguageChangeRequest getMsgLanguageChangeRequest() {
            return msgLanguageChangeRequest;
        }

        public Builder setMsgLanguageChangeRequest(proto.message.LanguageChangeRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SystemMessage#msgLanguageChangeRequest to null");
            }

            this.msgLanguageChangeRequest = value;
            __bitField0 |= 4194304;
            return this;
        }

        public Builder clearMsgLanguageChangeRequest() {
            this.msgLanguageChangeRequest = proto.message.LanguageChangeRequest.getDefaultInstance();
            __bitField0 &= ~4194304;
            return this;
        }

        public boolean hasMsgLanguageChangeRequest() {
            return (__bitField0 & 4194304) == 4194304;
        }

        public proto.message.LanguageChangeResponse getMsgLanguageChangeResponse() {
            return msgLanguageChangeResponse;
        }

        public Builder setMsgLanguageChangeResponse(proto.message.LanguageChangeResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SystemMessage#msgLanguageChangeResponse to null");
            }

            this.msgLanguageChangeResponse = value;
            __bitField0 |= 8388608;
            return this;
        }

        public Builder clearMsgLanguageChangeResponse() {
            this.msgLanguageChangeResponse = proto.message.LanguageChangeResponse.getDefaultInstance();
            __bitField0 &= ~8388608;
            return this;
        }

        public boolean hasMsgLanguageChangeResponse() {
            return (__bitField0 & 8388608) == 8388608;
        }

        public proto.message.PingTestRequest getMsgPingTestRequest() {
            return msgPingTestRequest;
        }

        public Builder setMsgPingTestRequest(proto.message.PingTestRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SystemMessage#msgPingTestRequest to null");
            }

            this.msgPingTestRequest = value;
            __bitField0 |= 16777216;
            return this;
        }

        public Builder clearMsgPingTestRequest() {
            this.msgPingTestRequest = proto.message.PingTestRequest.getDefaultInstance();
            __bitField0 &= ~16777216;
            return this;
        }

        public boolean hasMsgPingTestRequest() {
            return (__bitField0 & 16777216) == 16777216;
        }

        public proto.message.PingTestResponse getMsgPingTestResponse() {
            return msgPingTestResponse;
        }

        public Builder setMsgPingTestResponse(proto.message.PingTestResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SystemMessage#msgPingTestResponse to null");
            }

            this.msgPingTestResponse = value;
            __bitField0 |= 33554432;
            return this;
        }

        public Builder clearMsgPingTestResponse() {
            this.msgPingTestResponse = proto.message.PingTestResponse.getDefaultInstance();
            __bitField0 &= ~33554432;
            return this;
        }

        public boolean hasMsgPingTestResponse() {
            return (__bitField0 & 33554432) == 33554432;
        }

        public proto.message.NetworkLoggerRequest getMsgNetworkLoggerRequest() {
            return msgNetworkLoggerRequest;
        }

        public Builder setMsgNetworkLoggerRequest(proto.message.NetworkLoggerRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set SystemMessage#msgNetworkLoggerRequest to null");
            }

            this.msgNetworkLoggerRequest = value;
            __bitField0 |= 67108864;
            return this;
        }

        public Builder clearMsgNetworkLoggerRequest() {
            this.msgNetworkLoggerRequest = proto.message.NetworkLoggerRequest.getDefaultInstance();
            __bitField0 &= ~67108864;
            return this;
        }

        public boolean hasMsgNetworkLoggerRequest() {
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
            if (!java.util.Objects.equals(this.command, that.command)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgErrorResponse, that.msgErrorResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgLoginRequest, that.msgLoginRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgLoginResponse, that.msgLoginResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgPushMessageResponse, that.msgPushMessageResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgMaintainResponse, that.msgMaintainResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgGameFuncResponse, that.msgGameFuncResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgOrbitDataChecksum, that.msgOrbitDataChecksum)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgAppflyerRequest, that.msgAppflyerRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgSnsServerTokenRequest, that.msgSnsServerTokenRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgSnsServerTokenResponse, that.msgSnsServerTokenResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgNotificationRequest, that.msgNotificationRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgNotificationResponse, that.msgNotificationResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.clienttime, that.clienttime)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgPushMessageRequest, that.msgPushMessageRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgServerStatusResponse, that.msgServerStatusResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgImageShareRequest, that.msgImageShareRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgNotifyMessageSoccerResponse, that.msgNotifyMessageSoccerResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgImageShareInfoRequest, that.msgImageShareInfoRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgImageShareInfoResponse, that.msgImageShareInfoResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgImageShareResponse, that.msgImageShareResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgImageShareBoardResponse, that.msgImageShareBoardResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgLanguageChangeRequest, that.msgLanguageChangeRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgLanguageChangeResponse, that.msgLanguageChangeResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgPingTestRequest, that.msgPingTestRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgPingTestResponse, that.msgPingTestResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgNetworkLoggerRequest, that.msgNetworkLoggerRequest)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.command);
            result = 31 * result + (this.msgErrorResponse == null ? 0 : this.msgErrorResponse.hashCode());
            result = 31 * result + (this.msgLoginRequest == null ? 0 : this.msgLoginRequest.hashCode());
            result = 31 * result + (this.msgLoginResponse == null ? 0 : this.msgLoginResponse.hashCode());
            result = 31 * result + (this.msgPushMessageResponse == null ? 0 : this.msgPushMessageResponse.hashCode());
            result = 31 * result + (this.msgMaintainResponse == null ? 0 : this.msgMaintainResponse.hashCode());
            result = 31 * result + (this.msgGameFuncResponse == null ? 0 : this.msgGameFuncResponse.hashCode());
            result = 31 * result + (this.msgOrbitDataChecksum == null ? 0 : this.msgOrbitDataChecksum.hashCode());
            result = 31 * result + (this.msgAppflyerRequest == null ? 0 : this.msgAppflyerRequest.hashCode());
            result = 31 * result + (this.msgSnsServerTokenRequest == null ? 0 : this.msgSnsServerTokenRequest.hashCode());
            result = 31 * result + (this.msgSnsServerTokenResponse == null ? 0 : this.msgSnsServerTokenResponse.hashCode());
            result = 31 * result + (this.msgNotificationRequest == null ? 0 : this.msgNotificationRequest.hashCode());
            result = 31 * result + (this.msgNotificationResponse == null ? 0 : this.msgNotificationResponse.hashCode());
            result = 31 * result + Long.hashCode(this.clienttime);
            result = 31 * result + (this.msgPushMessageRequest == null ? 0 : this.msgPushMessageRequest.hashCode());
            result = 31 * result + (this.msgServerStatusResponse == null ? 0 : this.msgServerStatusResponse.hashCode());
            result = 31 * result + (this.msgImageShareRequest == null ? 0 : this.msgImageShareRequest.hashCode());
            result = 31 * result + (this.msgNotifyMessageSoccerResponse == null ? 0 : this.msgNotifyMessageSoccerResponse.hashCode());
            result = 31 * result + (this.msgImageShareInfoRequest == null ? 0 : this.msgImageShareInfoRequest.hashCode());
            result = 31 * result + (this.msgImageShareInfoResponse == null ? 0 : this.msgImageShareInfoResponse.hashCode());
            result = 31 * result + (this.msgImageShareResponse == null ? 0 : this.msgImageShareResponse.hashCode());
            result = 31 * result + (this.msgImageShareBoardResponse == null ? 0 : this.msgImageShareBoardResponse.hashCode());
            result = 31 * result + (this.msgLanguageChangeRequest == null ? 0 : this.msgLanguageChangeRequest.hashCode());
            result = 31 * result + (this.msgLanguageChangeResponse == null ? 0 : this.msgLanguageChangeResponse.hashCode());
            result = 31 * result + (this.msgPingTestRequest == null ? 0 : this.msgPingTestRequest.hashCode());
            result = 31 * result + (this.msgPingTestResponse == null ? 0 : this.msgPingTestResponse.hashCode());
            result = 31 * result + (this.msgNetworkLoggerRequest == null ? 0 : this.msgNetworkLoggerRequest.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasCommand()) {
                parts.add("command=" + getCommand() + '(' + getCommandValue() + ')');
            }
            if (hasMsgErrorResponse()) {
                parts.add("msgErrorResponse=" + getMsgErrorResponse());
            }
            if (hasMsgLoginRequest()) {
                parts.add("msgLoginRequest=" + getMsgLoginRequest());
            }
            if (hasMsgLoginResponse()) {
                parts.add("msgLoginResponse=" + getMsgLoginResponse());
            }
            if (hasMsgPushMessageResponse()) {
                parts.add("msgPushMessageResponse=" + getMsgPushMessageResponse());
            }
            if (hasMsgMaintainResponse()) {
                parts.add("msgMaintainResponse=" + getMsgMaintainResponse());
            }
            if (hasMsgGameFuncResponse()) {
                parts.add("msgGameFuncResponse=" + getMsgGameFuncResponse());
            }
            if (hasMsgOrbitDataChecksum()) {
                parts.add("msgOrbitDataChecksum=" + getMsgOrbitDataChecksum());
            }
            if (hasMsgAppflyerRequest()) {
                parts.add("msgAppflyerRequest=" + getMsgAppflyerRequest());
            }
            if (hasMsgSnsServerTokenRequest()) {
                parts.add("msgSnsServerTokenRequest=" + getMsgSnsServerTokenRequest());
            }
            if (hasMsgSnsServerTokenResponse()) {
                parts.add("msgSnsServerTokenResponse=" + getMsgSnsServerTokenResponse());
            }
            if (hasMsgNotificationRequest()) {
                parts.add("msgNotificationRequest=" + getMsgNotificationRequest());
            }
            if (hasMsgNotificationResponse()) {
                parts.add("msgNotificationResponse=" + getMsgNotificationResponse());
            }
            if (hasClienttime()) {
                parts.add("clienttime=" + getClienttime());
            }
            if (hasMsgPushMessageRequest()) {
                parts.add("msgPushMessageRequest=" + getMsgPushMessageRequest());
            }
            if (hasMsgServerStatusResponse()) {
                parts.add("msgServerStatusResponse=" + getMsgServerStatusResponse());
            }
            if (hasMsgImageShareRequest()) {
                parts.add("msgImageShareRequest=" + getMsgImageShareRequest());
            }
            if (hasMsgNotifyMessageSoccerResponse()) {
                parts.add("msgNotifyMessageSoccerResponse=" + getMsgNotifyMessageSoccerResponse());
            }
            if (hasMsgImageShareInfoRequest()) {
                parts.add("msgImageShareInfoRequest=" + getMsgImageShareInfoRequest());
            }
            if (hasMsgImageShareInfoResponse()) {
                parts.add("msgImageShareInfoResponse=" + getMsgImageShareInfoResponse());
            }
            if (hasMsgImageShareResponse()) {
                parts.add("msgImageShareResponse=" + getMsgImageShareResponse());
            }
            if (hasMsgImageShareBoardResponse()) {
                parts.add("msgImageShareBoardResponse=" + getMsgImageShareBoardResponse());
            }
            if (hasMsgLanguageChangeRequest()) {
                parts.add("msgLanguageChangeRequest=" + getMsgLanguageChangeRequest());
            }
            if (hasMsgLanguageChangeResponse()) {
                parts.add("msgLanguageChangeResponse=" + getMsgLanguageChangeResponse());
            }
            if (hasMsgPingTestRequest()) {
                parts.add("msgPingTestRequest=" + getMsgPingTestRequest());
            }
            if (hasMsgPingTestResponse()) {
                parts.add("msgPingTestResponse=" + getMsgPingTestResponse());
            }
            if (hasMsgNetworkLoggerRequest()) {
                parts.add("msgNetworkLoggerRequest=" + getMsgNetworkLoggerRequest());
            }
            return "SystemMessage{" + String.join(", ", parts) + "}";
        }

        public SystemMessage build() {
            proto.message.SystemMessage result = new proto.message.SystemMessage();
            result.__bitField0 = __bitField0;
            result.command = this.command;
            result.msgErrorResponse = this.msgErrorResponse;
            result.msgLoginRequest = this.msgLoginRequest;
            result.msgLoginResponse = this.msgLoginResponse;
            result.msgPushMessageResponse = this.msgPushMessageResponse;
            result.msgMaintainResponse = this.msgMaintainResponse;
            result.msgGameFuncResponse = this.msgGameFuncResponse;
            result.msgOrbitDataChecksum = this.msgOrbitDataChecksum;
            result.msgAppflyerRequest = this.msgAppflyerRequest;
            result.msgSnsServerTokenRequest = this.msgSnsServerTokenRequest;
            result.msgSnsServerTokenResponse = this.msgSnsServerTokenResponse;
            result.msgNotificationRequest = this.msgNotificationRequest;
            result.msgNotificationResponse = this.msgNotificationResponse;
            result.clienttime = this.clienttime;
            result.msgPushMessageRequest = this.msgPushMessageRequest;
            result.msgServerStatusResponse = this.msgServerStatusResponse;
            result.msgImageShareRequest = this.msgImageShareRequest;
            result.msgNotifyMessageSoccerResponse = this.msgNotifyMessageSoccerResponse;
            result.msgImageShareInfoRequest = this.msgImageShareInfoRequest;
            result.msgImageShareInfoResponse = this.msgImageShareInfoResponse;
            result.msgImageShareResponse = this.msgImageShareResponse;
            result.msgImageShareBoardResponse = this.msgImageShareBoardResponse;
            result.msgLanguageChangeRequest = this.msgLanguageChangeRequest;
            result.msgLanguageChangeResponse = this.msgLanguageChangeResponse;
            result.msgPingTestRequest = this.msgPingTestRequest;
            result.msgPingTestResponse = this.msgPingTestResponse;
            result.msgNetworkLoggerRequest = this.msgNetworkLoggerRequest;
            return result;
        }

    }



}