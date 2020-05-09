package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_ingame.proto")
public final class InGameMessage
        implements io.protostuff.Message<InGameMessage> {

    private static final InGameMessage DEFAULT_INSTANCE = newBuilder().build();

    private int command;

    private String userID;

    private proto.message.GetGameListResponse msgGetGameListResponse;

    private proto.message.JoinGameRequest msgJoinGameRequest;

    private proto.message.JoinGameResponse msgJoinGameResponse;

    private proto.message.JoinRoomRequest msgJoinRoomRequest;

    private proto.message.JoinRoomResponse msgJoinRoomResponse;

    private proto.message.JoinBoardRequest msgJoinBoardRequest;

    private proto.message.JoinBoardResponse msgJoinBoardResponse;

    private proto.message.StartGameResponse msgStartGameResponse;

    private proto.message.PlayerReadyRequest msgPlayerReadyRequest;

    private proto.message.PlayerReadyResponse msgPlayerReadyResponse;

    private proto.message.SetBetMoneyRequest msgSetBetMoneyRequest;

    private proto.message.SetBetMoneyResponse msgSetBetMoneyResponse;

    private proto.message.SetMaxPlayerRequest msgSetMaxPlayerRequest;

    private proto.message.SetMaxPlayerResponse msgSetMaxPlayerResponse;

    private proto.message.GetBoardInforResponse msgGetBoardInforResponse;

    private proto.message.GetFishHordeInforResponse msgGetFishHordeInforResponse;

    private proto.message.FireRequest msgFireRequest;

    private proto.message.FireResponse msgFireResponse;

    private proto.message.LeaveBoardRequest msgLeaveBoardRequest;

    private proto.message.LeaveBoardResponse msgLeaveBoardResponse;

    private proto.message.ChangeOwnerResponse msgChangeOwnerResponse;

    private proto.message.PlayerLeaveBoard msgPlayerLeaveBoard;

    private proto.message.LeaveRoomResponse msgLeaveRoomResponse;

    private proto.message.LeaveGameResponse msgLeaveGameResponse;

    private proto.message.OpenFireRequest msgOpenFireRequest;

    private proto.message.OutOfAmmoResponse msgOutOfAmmoResponse;

    private proto.message.OpenFireResponse msgOpenFireResponse;

    private proto.message.FinishGameRequest msgFinishGameRequest;

    private proto.message.FinishGameResponse msgFinishGameResponse;

    private proto.message.ChatRequest msgChatRequest;

    private proto.message.ChatResponse msgChatResponse;

    private proto.message.DonateMoneyResponse msgDonateMoneyResponse;

    private proto.message.GetBoardInforRequest msgGetBoarInforRequest;

    private proto.message.UserLevelUpResponse msgUserLevelUpResponse;

    private proto.message.GunChangeRequest msgGunChangeRequest;

    private proto.message.GunChangeResponse msgGunChangeResponse;

    private proto.message.BossKillResponse msgBossKillResponse;

    private proto.message.GetRoomListRequest msgGetRoomListRequest;

    private proto.message.GetRoomListResponse msgGetRoomListResponse;

    private proto.message.GetBoardListRequest msgGetBoardListRequest;

    private proto.message.GetBoardListResponse msgGetBoardListResponse;

    private proto.message.ChatEmoRequest msgChatEmoRequest;

    private proto.message.ChatEmoResponse msgChatEmoResponse;

    private proto.message.BetMakeConfirmRequest msgBetMakeConfirmRequest;

    private proto.message.BetMakeConfirmResponse msgBetMakeConfirmResponse;

    private proto.message.SoloRequest msgSoloRequest;

    private proto.message.SoloResponse msgSoloResponse;

    private proto.message.UseItemResquest msgUseItemRequest;

    private proto.message.UseItemResponse msgUseItemResponse;

    private proto.message.SoloConfirm msgSoloConfirm;

    private proto.message.ReviveBoardRequest msgReviveBoardRequest;

    private proto.message.ReviveBoardResponse msgReviveBoardResponse;

    private proto.message.ReviveBoardInfoResponse msgReviveBoardInfoResponse;

    private proto.message.RoomMoneyListRequest msgRoomMoneyListRequest;

    private proto.message.RoomMoneyListResponse msgRoomMoneyListResponse;

    private proto.message.IngameAvailableCannonsList msgIngameAvailableCannonsList;

    private proto.message.IngameCreateBoardRequest msgIngameCreateBoardRequest;

    private proto.message.IngameCreateBoardResponse msgIngameCreateBoardResponse;

    private long clienttime;

    private proto.message.IngameNetworkTime msgIngameNetworkTime;

    private proto.message.AccumulationResponse msgAccumulationResponse;

    private proto.message.OpenBombRequest msgOpenBombRequest;

    private proto.message.OpenBombResponse msgOpenBombResponse;

    private proto.message.BombExplodeResponse msgBombExplodeResponse;

    private proto.message.UdpEstablishRequest msgUdpEstablishRequest;

    private proto.message.UdpEstablishResponse msgUdpEstablishResponse;

    private long uDPInboundSeq;

    private int udpHashCode;

    private proto.message.IngameSkillResponse msgIngameSkillResponse;

    private proto.message.IngamePetRampagePreSkillResponse msgIngamePetRampagePreSkillResponse;

    private proto.message.IngamePetRampageBeginSkillResponse msgIngamePetRampageBeginSkillResponse;

    private proto.message.IngamePetRampageInSkillResponse msgIngamePetRampageInSkillResponse;

    private proto.message.IngamePetRampageEndSkillResponse msgIngamePetRampageEndSkillResponse;

    private proto.message.IngamePetRampageSkillBulletRequest msgIngamePetRampageSkillBulletRequest;

    private proto.message.IngamePetRampageSkillBulletResponse msgIngamePetRampageSkillBulletResponse;

    private proto.message.IngameCollectionItemDropResponse msgIngameCollectionItemDropResponse;

    private boolean __merge_lock = false;
    private int __bitField0;
    private int __bitField1;
    private int __bitField2;

    private InGameMessage() {
        this.command = proto.message.InGameCommand.INGAME_GET_GAME_LIST_REQUEST.getNumber();
        this.userID = "";
        this.msgGetGameListResponse = proto.message.GetGameListResponse.getDefaultInstance();
        this.msgJoinGameRequest = proto.message.JoinGameRequest.getDefaultInstance();
        this.msgJoinGameResponse = proto.message.JoinGameResponse.getDefaultInstance();
        this.msgJoinRoomRequest = proto.message.JoinRoomRequest.getDefaultInstance();
        this.msgJoinRoomResponse = proto.message.JoinRoomResponse.getDefaultInstance();
        this.msgJoinBoardRequest = proto.message.JoinBoardRequest.getDefaultInstance();
        this.msgJoinBoardResponse = proto.message.JoinBoardResponse.getDefaultInstance();
        this.msgStartGameResponse = proto.message.StartGameResponse.getDefaultInstance();
        this.msgPlayerReadyRequest = proto.message.PlayerReadyRequest.getDefaultInstance();
        this.msgPlayerReadyResponse = proto.message.PlayerReadyResponse.getDefaultInstance();
        this.msgSetBetMoneyRequest = proto.message.SetBetMoneyRequest.getDefaultInstance();
        this.msgSetBetMoneyResponse = proto.message.SetBetMoneyResponse.getDefaultInstance();
        this.msgSetMaxPlayerRequest = proto.message.SetMaxPlayerRequest.getDefaultInstance();
        this.msgSetMaxPlayerResponse = proto.message.SetMaxPlayerResponse.getDefaultInstance();
        this.msgGetBoardInforResponse = proto.message.GetBoardInforResponse.getDefaultInstance();
        this.msgGetFishHordeInforResponse = proto.message.GetFishHordeInforResponse.getDefaultInstance();
        this.msgFireRequest = proto.message.FireRequest.getDefaultInstance();
        this.msgFireResponse = proto.message.FireResponse.getDefaultInstance();
        this.msgLeaveBoardRequest = proto.message.LeaveBoardRequest.getDefaultInstance();
        this.msgLeaveBoardResponse = proto.message.LeaveBoardResponse.getDefaultInstance();
        this.msgChangeOwnerResponse = proto.message.ChangeOwnerResponse.getDefaultInstance();
        this.msgPlayerLeaveBoard = proto.message.PlayerLeaveBoard.getDefaultInstance();
        this.msgLeaveRoomResponse = proto.message.LeaveRoomResponse.getDefaultInstance();
        this.msgLeaveGameResponse = proto.message.LeaveGameResponse.getDefaultInstance();
        this.msgOpenFireRequest = proto.message.OpenFireRequest.getDefaultInstance();
        this.msgOutOfAmmoResponse = proto.message.OutOfAmmoResponse.getDefaultInstance();
        this.msgOpenFireResponse = proto.message.OpenFireResponse.getDefaultInstance();
        this.msgFinishGameRequest = proto.message.FinishGameRequest.getDefaultInstance();
        this.msgFinishGameResponse = proto.message.FinishGameResponse.getDefaultInstance();
        this.msgChatRequest = proto.message.ChatRequest.getDefaultInstance();
        this.msgChatResponse = proto.message.ChatResponse.getDefaultInstance();
        this.msgDonateMoneyResponse = proto.message.DonateMoneyResponse.getDefaultInstance();
        this.msgGetBoarInforRequest = proto.message.GetBoardInforRequest.getDefaultInstance();
        this.msgUserLevelUpResponse = proto.message.UserLevelUpResponse.getDefaultInstance();
        this.msgGunChangeRequest = proto.message.GunChangeRequest.getDefaultInstance();
        this.msgGunChangeResponse = proto.message.GunChangeResponse.getDefaultInstance();
        this.msgBossKillResponse = proto.message.BossKillResponse.getDefaultInstance();
        this.msgGetRoomListRequest = proto.message.GetRoomListRequest.getDefaultInstance();
        this.msgGetRoomListResponse = proto.message.GetRoomListResponse.getDefaultInstance();
        this.msgGetBoardListRequest = proto.message.GetBoardListRequest.getDefaultInstance();
        this.msgGetBoardListResponse = proto.message.GetBoardListResponse.getDefaultInstance();
        this.msgChatEmoRequest = proto.message.ChatEmoRequest.getDefaultInstance();
        this.msgChatEmoResponse = proto.message.ChatEmoResponse.getDefaultInstance();
        this.msgBetMakeConfirmRequest = proto.message.BetMakeConfirmRequest.getDefaultInstance();
        this.msgBetMakeConfirmResponse = proto.message.BetMakeConfirmResponse.getDefaultInstance();
        this.msgSoloRequest = proto.message.SoloRequest.getDefaultInstance();
        this.msgSoloResponse = proto.message.SoloResponse.getDefaultInstance();
        this.msgUseItemRequest = proto.message.UseItemResquest.getDefaultInstance();
        this.msgUseItemResponse = proto.message.UseItemResponse.getDefaultInstance();
        this.msgSoloConfirm = proto.message.SoloConfirm.getDefaultInstance();
        this.msgReviveBoardRequest = proto.message.ReviveBoardRequest.getDefaultInstance();
        this.msgReviveBoardResponse = proto.message.ReviveBoardResponse.getDefaultInstance();
        this.msgReviveBoardInfoResponse = proto.message.ReviveBoardInfoResponse.getDefaultInstance();
        this.msgRoomMoneyListRequest = proto.message.RoomMoneyListRequest.getDefaultInstance();
        this.msgRoomMoneyListResponse = proto.message.RoomMoneyListResponse.getDefaultInstance();
        this.msgIngameAvailableCannonsList = proto.message.IngameAvailableCannonsList.getDefaultInstance();
        this.msgIngameCreateBoardRequest = proto.message.IngameCreateBoardRequest.getDefaultInstance();
        this.msgIngameCreateBoardResponse = proto.message.IngameCreateBoardResponse.getDefaultInstance();
        this.clienttime = 0L;
        this.msgIngameNetworkTime = proto.message.IngameNetworkTime.getDefaultInstance();
        this.msgAccumulationResponse = proto.message.AccumulationResponse.getDefaultInstance();
        this.msgOpenBombRequest = proto.message.OpenBombRequest.getDefaultInstance();
        this.msgOpenBombResponse = proto.message.OpenBombResponse.getDefaultInstance();
        this.msgBombExplodeResponse = proto.message.BombExplodeResponse.getDefaultInstance();
        this.msgUdpEstablishRequest = proto.message.UdpEstablishRequest.getDefaultInstance();
        this.msgUdpEstablishResponse = proto.message.UdpEstablishResponse.getDefaultInstance();
        this.uDPInboundSeq = 0L;
        this.udpHashCode = 0;
        this.msgIngameSkillResponse = proto.message.IngameSkillResponse.getDefaultInstance();
        this.msgIngamePetRampagePreSkillResponse = proto.message.IngamePetRampagePreSkillResponse.getDefaultInstance();
        this.msgIngamePetRampageBeginSkillResponse = proto.message.IngamePetRampageBeginSkillResponse.getDefaultInstance();
        this.msgIngamePetRampageInSkillResponse = proto.message.IngamePetRampageInSkillResponse.getDefaultInstance();
        this.msgIngamePetRampageEndSkillResponse = proto.message.IngamePetRampageEndSkillResponse.getDefaultInstance();
        this.msgIngamePetRampageSkillBulletRequest = proto.message.IngamePetRampageSkillBulletRequest.getDefaultInstance();
        this.msgIngamePetRampageSkillBulletResponse = proto.message.IngamePetRampageSkillBulletResponse.getDefaultInstance();
        this.msgIngameCollectionItemDropResponse = proto.message.IngameCollectionItemDropResponse.getDefaultInstance();
    }

    private InGameMessage(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static InGameMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<InGameMessage> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public proto.message.InGameCommand getCommand() {
        return proto.message.InGameCommand.valueOf(command);
    }

    public int getCommandValue() {
        return command;
    }

    public boolean hasCommand() {
        return (__bitField0 & 1) == 1;
    }

    public InGameMessage withCommand(proto.message.InGameCommand value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setCommand(value)
            .build();
    }

    public String getUserID() {
        return userID;
    }

    public boolean hasUserID() {
        return (__bitField0 & 2) == 2;
    }

    public InGameMessage withUserID(String value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setUserID(value)
            .build();
    }

    public proto.message.GetGameListResponse getMsgGetGameListResponse() {
        return msgGetGameListResponse;
    }

    public boolean hasMsgGetGameListResponse() {
        return (__bitField0 & 4) == 4;
    }

    public InGameMessage withMsgGetGameListResponse(proto.message.GetGameListResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgGetGameListResponse(value)
            .build();
    }

    public proto.message.JoinGameRequest getMsgJoinGameRequest() {
        return msgJoinGameRequest;
    }

    public boolean hasMsgJoinGameRequest() {
        return (__bitField0 & 8) == 8;
    }

    public InGameMessage withMsgJoinGameRequest(proto.message.JoinGameRequest value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgJoinGameRequest(value)
            .build();
    }

    public proto.message.JoinGameResponse getMsgJoinGameResponse() {
        return msgJoinGameResponse;
    }

    public boolean hasMsgJoinGameResponse() {
        return (__bitField0 & 16) == 16;
    }

    public InGameMessage withMsgJoinGameResponse(proto.message.JoinGameResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgJoinGameResponse(value)
            .build();
    }

    public proto.message.JoinRoomRequest getMsgJoinRoomRequest() {
        return msgJoinRoomRequest;
    }

    public boolean hasMsgJoinRoomRequest() {
        return (__bitField0 & 32) == 32;
    }

    public InGameMessage withMsgJoinRoomRequest(proto.message.JoinRoomRequest value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgJoinRoomRequest(value)
            .build();
    }

    public proto.message.JoinRoomResponse getMsgJoinRoomResponse() {
        return msgJoinRoomResponse;
    }

    public boolean hasMsgJoinRoomResponse() {
        return (__bitField0 & 64) == 64;
    }

    public InGameMessage withMsgJoinRoomResponse(proto.message.JoinRoomResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgJoinRoomResponse(value)
            .build();
    }

    public proto.message.JoinBoardRequest getMsgJoinBoardRequest() {
        return msgJoinBoardRequest;
    }

    public boolean hasMsgJoinBoardRequest() {
        return (__bitField0 & 128) == 128;
    }

    public InGameMessage withMsgJoinBoardRequest(proto.message.JoinBoardRequest value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgJoinBoardRequest(value)
            .build();
    }

    public proto.message.JoinBoardResponse getMsgJoinBoardResponse() {
        return msgJoinBoardResponse;
    }

    public boolean hasMsgJoinBoardResponse() {
        return (__bitField0 & 256) == 256;
    }

    public InGameMessage withMsgJoinBoardResponse(proto.message.JoinBoardResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgJoinBoardResponse(value)
            .build();
    }

    public proto.message.StartGameResponse getMsgStartGameResponse() {
        return msgStartGameResponse;
    }

    public boolean hasMsgStartGameResponse() {
        return (__bitField0 & 512) == 512;
    }

    public InGameMessage withMsgStartGameResponse(proto.message.StartGameResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgStartGameResponse(value)
            .build();
    }

    public proto.message.PlayerReadyRequest getMsgPlayerReadyRequest() {
        return msgPlayerReadyRequest;
    }

    public boolean hasMsgPlayerReadyRequest() {
        return (__bitField0 & 1024) == 1024;
    }

    public InGameMessage withMsgPlayerReadyRequest(proto.message.PlayerReadyRequest value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgPlayerReadyRequest(value)
            .build();
    }

    public proto.message.PlayerReadyResponse getMsgPlayerReadyResponse() {
        return msgPlayerReadyResponse;
    }

    public boolean hasMsgPlayerReadyResponse() {
        return (__bitField0 & 2048) == 2048;
    }

    public InGameMessage withMsgPlayerReadyResponse(proto.message.PlayerReadyResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgPlayerReadyResponse(value)
            .build();
    }

    public proto.message.SetBetMoneyRequest getMsgSetBetMoneyRequest() {
        return msgSetBetMoneyRequest;
    }

    public boolean hasMsgSetBetMoneyRequest() {
        return (__bitField0 & 4096) == 4096;
    }

    public InGameMessage withMsgSetBetMoneyRequest(proto.message.SetBetMoneyRequest value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgSetBetMoneyRequest(value)
            .build();
    }

    public proto.message.SetBetMoneyResponse getMsgSetBetMoneyResponse() {
        return msgSetBetMoneyResponse;
    }

    public boolean hasMsgSetBetMoneyResponse() {
        return (__bitField0 & 8192) == 8192;
    }

    public InGameMessage withMsgSetBetMoneyResponse(proto.message.SetBetMoneyResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgSetBetMoneyResponse(value)
            .build();
    }

    public proto.message.SetMaxPlayerRequest getMsgSetMaxPlayerRequest() {
        return msgSetMaxPlayerRequest;
    }

    public boolean hasMsgSetMaxPlayerRequest() {
        return (__bitField0 & 16384) == 16384;
    }

    public InGameMessage withMsgSetMaxPlayerRequest(proto.message.SetMaxPlayerRequest value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgSetMaxPlayerRequest(value)
            .build();
    }

    public proto.message.SetMaxPlayerResponse getMsgSetMaxPlayerResponse() {
        return msgSetMaxPlayerResponse;
    }

    public boolean hasMsgSetMaxPlayerResponse() {
        return (__bitField0 & 32768) == 32768;
    }

    public InGameMessage withMsgSetMaxPlayerResponse(proto.message.SetMaxPlayerResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgSetMaxPlayerResponse(value)
            .build();
    }

    public proto.message.GetBoardInforResponse getMsgGetBoardInforResponse() {
        return msgGetBoardInforResponse;
    }

    public boolean hasMsgGetBoardInforResponse() {
        return (__bitField0 & 65536) == 65536;
    }

    public InGameMessage withMsgGetBoardInforResponse(proto.message.GetBoardInforResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgGetBoardInforResponse(value)
            .build();
    }

    public proto.message.GetFishHordeInforResponse getMsgGetFishHordeInforResponse() {
        return msgGetFishHordeInforResponse;
    }

    public boolean hasMsgGetFishHordeInforResponse() {
        return (__bitField0 & 131072) == 131072;
    }

    public InGameMessage withMsgGetFishHordeInforResponse(proto.message.GetFishHordeInforResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgGetFishHordeInforResponse(value)
            .build();
    }

    public proto.message.FireRequest getMsgFireRequest() {
        return msgFireRequest;
    }

    public boolean hasMsgFireRequest() {
        return (__bitField0 & 262144) == 262144;
    }

    public InGameMessage withMsgFireRequest(proto.message.FireRequest value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgFireRequest(value)
            .build();
    }

    public proto.message.FireResponse getMsgFireResponse() {
        return msgFireResponse;
    }

    public boolean hasMsgFireResponse() {
        return (__bitField0 & 524288) == 524288;
    }

    public InGameMessage withMsgFireResponse(proto.message.FireResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgFireResponse(value)
            .build();
    }

    public proto.message.LeaveBoardRequest getMsgLeaveBoardRequest() {
        return msgLeaveBoardRequest;
    }

    public boolean hasMsgLeaveBoardRequest() {
        return (__bitField0 & 1048576) == 1048576;
    }

    public InGameMessage withMsgLeaveBoardRequest(proto.message.LeaveBoardRequest value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgLeaveBoardRequest(value)
            .build();
    }

    public proto.message.LeaveBoardResponse getMsgLeaveBoardResponse() {
        return msgLeaveBoardResponse;
    }

    public boolean hasMsgLeaveBoardResponse() {
        return (__bitField0 & 2097152) == 2097152;
    }

    public InGameMessage withMsgLeaveBoardResponse(proto.message.LeaveBoardResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgLeaveBoardResponse(value)
            .build();
    }

    public proto.message.ChangeOwnerResponse getMsgChangeOwnerResponse() {
        return msgChangeOwnerResponse;
    }

    public boolean hasMsgChangeOwnerResponse() {
        return (__bitField0 & 4194304) == 4194304;
    }

    public InGameMessage withMsgChangeOwnerResponse(proto.message.ChangeOwnerResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgChangeOwnerResponse(value)
            .build();
    }

    public proto.message.PlayerLeaveBoard getMsgPlayerLeaveBoard() {
        return msgPlayerLeaveBoard;
    }

    public boolean hasMsgPlayerLeaveBoard() {
        return (__bitField0 & 8388608) == 8388608;
    }

    public InGameMessage withMsgPlayerLeaveBoard(proto.message.PlayerLeaveBoard value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgPlayerLeaveBoard(value)
            .build();
    }

    public proto.message.LeaveRoomResponse getMsgLeaveRoomResponse() {
        return msgLeaveRoomResponse;
    }

    public boolean hasMsgLeaveRoomResponse() {
        return (__bitField0 & 16777216) == 16777216;
    }

    public InGameMessage withMsgLeaveRoomResponse(proto.message.LeaveRoomResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgLeaveRoomResponse(value)
            .build();
    }

    public proto.message.LeaveGameResponse getMsgLeaveGameResponse() {
        return msgLeaveGameResponse;
    }

    public boolean hasMsgLeaveGameResponse() {
        return (__bitField0 & 33554432) == 33554432;
    }

    public InGameMessage withMsgLeaveGameResponse(proto.message.LeaveGameResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgLeaveGameResponse(value)
            .build();
    }

    public proto.message.OpenFireRequest getMsgOpenFireRequest() {
        return msgOpenFireRequest;
    }

    public boolean hasMsgOpenFireRequest() {
        return (__bitField0 & 67108864) == 67108864;
    }

    public InGameMessage withMsgOpenFireRequest(proto.message.OpenFireRequest value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgOpenFireRequest(value)
            .build();
    }

    public proto.message.OutOfAmmoResponse getMsgOutOfAmmoResponse() {
        return msgOutOfAmmoResponse;
    }

    public boolean hasMsgOutOfAmmoResponse() {
        return (__bitField0 & 134217728) == 134217728;
    }

    public InGameMessage withMsgOutOfAmmoResponse(proto.message.OutOfAmmoResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgOutOfAmmoResponse(value)
            .build();
    }

    public proto.message.OpenFireResponse getMsgOpenFireResponse() {
        return msgOpenFireResponse;
    }

    public boolean hasMsgOpenFireResponse() {
        return (__bitField0 & 268435456) == 268435456;
    }

    public InGameMessage withMsgOpenFireResponse(proto.message.OpenFireResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgOpenFireResponse(value)
            .build();
    }

    public proto.message.FinishGameRequest getMsgFinishGameRequest() {
        return msgFinishGameRequest;
    }

    public boolean hasMsgFinishGameRequest() {
        return (__bitField0 & 536870912) == 536870912;
    }

    public InGameMessage withMsgFinishGameRequest(proto.message.FinishGameRequest value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgFinishGameRequest(value)
            .build();
    }

    public proto.message.FinishGameResponse getMsgFinishGameResponse() {
        return msgFinishGameResponse;
    }

    public boolean hasMsgFinishGameResponse() {
        return (__bitField0 & 1073741824) == 1073741824;
    }

    public InGameMessage withMsgFinishGameResponse(proto.message.FinishGameResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgFinishGameResponse(value)
            .build();
    }

    public proto.message.ChatRequest getMsgChatRequest() {
        return msgChatRequest;
    }

    public boolean hasMsgChatRequest() {
        return (__bitField0 & -2147483648) == -2147483648;
    }

    public InGameMessage withMsgChatRequest(proto.message.ChatRequest value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgChatRequest(value)
            .build();
    }

    public proto.message.ChatResponse getMsgChatResponse() {
        return msgChatResponse;
    }

    public boolean hasMsgChatResponse() {
        return (__bitField1 & 1) == 1;
    }

    public InGameMessage withMsgChatResponse(proto.message.ChatResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgChatResponse(value)
            .build();
    }

    public proto.message.DonateMoneyResponse getMsgDonateMoneyResponse() {
        return msgDonateMoneyResponse;
    }

    public boolean hasMsgDonateMoneyResponse() {
        return (__bitField1 & 2) == 2;
    }

    public InGameMessage withMsgDonateMoneyResponse(proto.message.DonateMoneyResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgDonateMoneyResponse(value)
            .build();
    }

    public proto.message.GetBoardInforRequest getMsgGetBoarInforRequest() {
        return msgGetBoarInforRequest;
    }

    public boolean hasMsgGetBoarInforRequest() {
        return (__bitField1 & 4) == 4;
    }

    public InGameMessage withMsgGetBoarInforRequest(proto.message.GetBoardInforRequest value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgGetBoarInforRequest(value)
            .build();
    }

    public proto.message.UserLevelUpResponse getMsgUserLevelUpResponse() {
        return msgUserLevelUpResponse;
    }

    public boolean hasMsgUserLevelUpResponse() {
        return (__bitField1 & 8) == 8;
    }

    public InGameMessage withMsgUserLevelUpResponse(proto.message.UserLevelUpResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgUserLevelUpResponse(value)
            .build();
    }

    public proto.message.GunChangeRequest getMsgGunChangeRequest() {
        return msgGunChangeRequest;
    }

    public boolean hasMsgGunChangeRequest() {
        return (__bitField1 & 16) == 16;
    }

    public InGameMessage withMsgGunChangeRequest(proto.message.GunChangeRequest value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgGunChangeRequest(value)
            .build();
    }

    public proto.message.GunChangeResponse getMsgGunChangeResponse() {
        return msgGunChangeResponse;
    }

    public boolean hasMsgGunChangeResponse() {
        return (__bitField1 & 32) == 32;
    }

    public InGameMessage withMsgGunChangeResponse(proto.message.GunChangeResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgGunChangeResponse(value)
            .build();
    }

    public proto.message.BossKillResponse getMsgBossKillResponse() {
        return msgBossKillResponse;
    }

    public boolean hasMsgBossKillResponse() {
        return (__bitField1 & 64) == 64;
    }

    public InGameMessage withMsgBossKillResponse(proto.message.BossKillResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgBossKillResponse(value)
            .build();
    }

    public proto.message.GetRoomListRequest getMsgGetRoomListRequest() {
        return msgGetRoomListRequest;
    }

    public boolean hasMsgGetRoomListRequest() {
        return (__bitField1 & 128) == 128;
    }

    public InGameMessage withMsgGetRoomListRequest(proto.message.GetRoomListRequest value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgGetRoomListRequest(value)
            .build();
    }

    public proto.message.GetRoomListResponse getMsgGetRoomListResponse() {
        return msgGetRoomListResponse;
    }

    public boolean hasMsgGetRoomListResponse() {
        return (__bitField1 & 256) == 256;
    }

    public InGameMessage withMsgGetRoomListResponse(proto.message.GetRoomListResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgGetRoomListResponse(value)
            .build();
    }

    public proto.message.GetBoardListRequest getMsgGetBoardListRequest() {
        return msgGetBoardListRequest;
    }

    public boolean hasMsgGetBoardListRequest() {
        return (__bitField1 & 512) == 512;
    }

    public InGameMessage withMsgGetBoardListRequest(proto.message.GetBoardListRequest value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgGetBoardListRequest(value)
            .build();
    }

    public proto.message.GetBoardListResponse getMsgGetBoardListResponse() {
        return msgGetBoardListResponse;
    }

    public boolean hasMsgGetBoardListResponse() {
        return (__bitField1 & 1024) == 1024;
    }

    public InGameMessage withMsgGetBoardListResponse(proto.message.GetBoardListResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgGetBoardListResponse(value)
            .build();
    }

    public proto.message.ChatEmoRequest getMsgChatEmoRequest() {
        return msgChatEmoRequest;
    }

    public boolean hasMsgChatEmoRequest() {
        return (__bitField1 & 2048) == 2048;
    }

    public InGameMessage withMsgChatEmoRequest(proto.message.ChatEmoRequest value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgChatEmoRequest(value)
            .build();
    }

    public proto.message.ChatEmoResponse getMsgChatEmoResponse() {
        return msgChatEmoResponse;
    }

    public boolean hasMsgChatEmoResponse() {
        return (__bitField1 & 4096) == 4096;
    }

    public InGameMessage withMsgChatEmoResponse(proto.message.ChatEmoResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgChatEmoResponse(value)
            .build();
    }

    public proto.message.BetMakeConfirmRequest getMsgBetMakeConfirmRequest() {
        return msgBetMakeConfirmRequest;
    }

    public boolean hasMsgBetMakeConfirmRequest() {
        return (__bitField1 & 8192) == 8192;
    }

    public InGameMessage withMsgBetMakeConfirmRequest(proto.message.BetMakeConfirmRequest value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgBetMakeConfirmRequest(value)
            .build();
    }

    public proto.message.BetMakeConfirmResponse getMsgBetMakeConfirmResponse() {
        return msgBetMakeConfirmResponse;
    }

    public boolean hasMsgBetMakeConfirmResponse() {
        return (__bitField1 & 16384) == 16384;
    }

    public InGameMessage withMsgBetMakeConfirmResponse(proto.message.BetMakeConfirmResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgBetMakeConfirmResponse(value)
            .build();
    }

    public proto.message.SoloRequest getMsgSoloRequest() {
        return msgSoloRequest;
    }

    public boolean hasMsgSoloRequest() {
        return (__bitField1 & 32768) == 32768;
    }

    public InGameMessage withMsgSoloRequest(proto.message.SoloRequest value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgSoloRequest(value)
            .build();
    }

    public proto.message.SoloResponse getMsgSoloResponse() {
        return msgSoloResponse;
    }

    public boolean hasMsgSoloResponse() {
        return (__bitField1 & 65536) == 65536;
    }

    public InGameMessage withMsgSoloResponse(proto.message.SoloResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgSoloResponse(value)
            .build();
    }

    public proto.message.UseItemResquest getMsgUseItemRequest() {
        return msgUseItemRequest;
    }

    public boolean hasMsgUseItemRequest() {
        return (__bitField1 & 131072) == 131072;
    }

    public InGameMessage withMsgUseItemRequest(proto.message.UseItemResquest value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgUseItemRequest(value)
            .build();
    }

    public proto.message.UseItemResponse getMsgUseItemResponse() {
        return msgUseItemResponse;
    }

    public boolean hasMsgUseItemResponse() {
        return (__bitField1 & 262144) == 262144;
    }

    public InGameMessage withMsgUseItemResponse(proto.message.UseItemResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgUseItemResponse(value)
            .build();
    }

    public proto.message.SoloConfirm getMsgSoloConfirm() {
        return msgSoloConfirm;
    }

    public boolean hasMsgSoloConfirm() {
        return (__bitField1 & 524288) == 524288;
    }

    public InGameMessage withMsgSoloConfirm(proto.message.SoloConfirm value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgSoloConfirm(value)
            .build();
    }

    public proto.message.ReviveBoardRequest getMsgReviveBoardRequest() {
        return msgReviveBoardRequest;
    }

    public boolean hasMsgReviveBoardRequest() {
        return (__bitField1 & 1048576) == 1048576;
    }

    public InGameMessage withMsgReviveBoardRequest(proto.message.ReviveBoardRequest value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgReviveBoardRequest(value)
            .build();
    }

    public proto.message.ReviveBoardResponse getMsgReviveBoardResponse() {
        return msgReviveBoardResponse;
    }

    public boolean hasMsgReviveBoardResponse() {
        return (__bitField1 & 2097152) == 2097152;
    }

    public InGameMessage withMsgReviveBoardResponse(proto.message.ReviveBoardResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgReviveBoardResponse(value)
            .build();
    }

    public proto.message.ReviveBoardInfoResponse getMsgReviveBoardInfoResponse() {
        return msgReviveBoardInfoResponse;
    }

    public boolean hasMsgReviveBoardInfoResponse() {
        return (__bitField1 & 4194304) == 4194304;
    }

    public InGameMessage withMsgReviveBoardInfoResponse(proto.message.ReviveBoardInfoResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgReviveBoardInfoResponse(value)
            .build();
    }

    public proto.message.RoomMoneyListRequest getMsgRoomMoneyListRequest() {
        return msgRoomMoneyListRequest;
    }

    public boolean hasMsgRoomMoneyListRequest() {
        return (__bitField1 & 8388608) == 8388608;
    }

    public InGameMessage withMsgRoomMoneyListRequest(proto.message.RoomMoneyListRequest value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgRoomMoneyListRequest(value)
            .build();
    }

    public proto.message.RoomMoneyListResponse getMsgRoomMoneyListResponse() {
        return msgRoomMoneyListResponse;
    }

    public boolean hasMsgRoomMoneyListResponse() {
        return (__bitField1 & 16777216) == 16777216;
    }

    public InGameMessage withMsgRoomMoneyListResponse(proto.message.RoomMoneyListResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgRoomMoneyListResponse(value)
            .build();
    }

    public proto.message.IngameAvailableCannonsList getMsgIngameAvailableCannonsList() {
        return msgIngameAvailableCannonsList;
    }

    public boolean hasMsgIngameAvailableCannonsList() {
        return (__bitField1 & 33554432) == 33554432;
    }

    public InGameMessage withMsgIngameAvailableCannonsList(proto.message.IngameAvailableCannonsList value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgIngameAvailableCannonsList(value)
            .build();
    }

    public proto.message.IngameCreateBoardRequest getMsgIngameCreateBoardRequest() {
        return msgIngameCreateBoardRequest;
    }

    public boolean hasMsgIngameCreateBoardRequest() {
        return (__bitField1 & 67108864) == 67108864;
    }

    public InGameMessage withMsgIngameCreateBoardRequest(proto.message.IngameCreateBoardRequest value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgIngameCreateBoardRequest(value)
            .build();
    }

    public proto.message.IngameCreateBoardResponse getMsgIngameCreateBoardResponse() {
        return msgIngameCreateBoardResponse;
    }

    public boolean hasMsgIngameCreateBoardResponse() {
        return (__bitField1 & 134217728) == 134217728;
    }

    public InGameMessage withMsgIngameCreateBoardResponse(proto.message.IngameCreateBoardResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgIngameCreateBoardResponse(value)
            .build();
    }

    public long getClienttime() {
        return clienttime;
    }

    public boolean hasClienttime() {
        return (__bitField1 & 268435456) == 268435456;
    }

    public InGameMessage withClienttime(long value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setClienttime(value)
            .build();
    }

    public proto.message.IngameNetworkTime getMsgIngameNetworkTime() {
        return msgIngameNetworkTime;
    }

    public boolean hasMsgIngameNetworkTime() {
        return (__bitField1 & 536870912) == 536870912;
    }

    public InGameMessage withMsgIngameNetworkTime(proto.message.IngameNetworkTime value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgIngameNetworkTime(value)
            .build();
    }

    public proto.message.AccumulationResponse getMsgAccumulationResponse() {
        return msgAccumulationResponse;
    }

    public boolean hasMsgAccumulationResponse() {
        return (__bitField1 & 1073741824) == 1073741824;
    }

    public InGameMessage withMsgAccumulationResponse(proto.message.AccumulationResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgAccumulationResponse(value)
            .build();
    }

    public proto.message.OpenBombRequest getMsgOpenBombRequest() {
        return msgOpenBombRequest;
    }

    public boolean hasMsgOpenBombRequest() {
        return (__bitField1 & -2147483648) == -2147483648;
    }

    public InGameMessage withMsgOpenBombRequest(proto.message.OpenBombRequest value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgOpenBombRequest(value)
            .build();
    }

    public proto.message.OpenBombResponse getMsgOpenBombResponse() {
        return msgOpenBombResponse;
    }

    public boolean hasMsgOpenBombResponse() {
        return (__bitField2 & 1) == 1;
    }

    public InGameMessage withMsgOpenBombResponse(proto.message.OpenBombResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgOpenBombResponse(value)
            .build();
    }

    public proto.message.BombExplodeResponse getMsgBombExplodeResponse() {
        return msgBombExplodeResponse;
    }

    public boolean hasMsgBombExplodeResponse() {
        return (__bitField2 & 2) == 2;
    }

    public InGameMessage withMsgBombExplodeResponse(proto.message.BombExplodeResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgBombExplodeResponse(value)
            .build();
    }

    public proto.message.UdpEstablishRequest getMsgUdpEstablishRequest() {
        return msgUdpEstablishRequest;
    }

    public boolean hasMsgUdpEstablishRequest() {
        return (__bitField2 & 4) == 4;
    }

    public InGameMessage withMsgUdpEstablishRequest(proto.message.UdpEstablishRequest value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgUdpEstablishRequest(value)
            .build();
    }

    public proto.message.UdpEstablishResponse getMsgUdpEstablishResponse() {
        return msgUdpEstablishResponse;
    }

    public boolean hasMsgUdpEstablishResponse() {
        return (__bitField2 & 8) == 8;
    }

    public InGameMessage withMsgUdpEstablishResponse(proto.message.UdpEstablishResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgUdpEstablishResponse(value)
            .build();
    }

    public long getUDPInboundSeq() {
        return uDPInboundSeq;
    }

    public boolean hasUDPInboundSeq() {
        return (__bitField2 & 16) == 16;
    }

    public InGameMessage withUDPInboundSeq(long value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setUDPInboundSeq(value)
            .build();
    }

    public int getUdpHashCode() {
        return udpHashCode;
    }

    public boolean hasUdpHashCode() {
        return (__bitField2 & 32) == 32;
    }

    public InGameMessage withUdpHashCode(int value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setUdpHashCode(value)
            .build();
    }

    public proto.message.IngameSkillResponse getMsgIngameSkillResponse() {
        return msgIngameSkillResponse;
    }

    public boolean hasMsgIngameSkillResponse() {
        return (__bitField2 & 64) == 64;
    }

    public InGameMessage withMsgIngameSkillResponse(proto.message.IngameSkillResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgIngameSkillResponse(value)
            .build();
    }

    public proto.message.IngamePetRampagePreSkillResponse getMsgIngamePetRampagePreSkillResponse() {
        return msgIngamePetRampagePreSkillResponse;
    }

    public boolean hasMsgIngamePetRampagePreSkillResponse() {
        return (__bitField2 & 128) == 128;
    }

    public InGameMessage withMsgIngamePetRampagePreSkillResponse(proto.message.IngamePetRampagePreSkillResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgIngamePetRampagePreSkillResponse(value)
            .build();
    }

    public proto.message.IngamePetRampageBeginSkillResponse getMsgIngamePetRampageBeginSkillResponse() {
        return msgIngamePetRampageBeginSkillResponse;
    }

    public boolean hasMsgIngamePetRampageBeginSkillResponse() {
        return (__bitField2 & 256) == 256;
    }

    public InGameMessage withMsgIngamePetRampageBeginSkillResponse(proto.message.IngamePetRampageBeginSkillResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgIngamePetRampageBeginSkillResponse(value)
            .build();
    }

    public proto.message.IngamePetRampageInSkillResponse getMsgIngamePetRampageInSkillResponse() {
        return msgIngamePetRampageInSkillResponse;
    }

    public boolean hasMsgIngamePetRampageInSkillResponse() {
        return (__bitField2 & 512) == 512;
    }

    public InGameMessage withMsgIngamePetRampageInSkillResponse(proto.message.IngamePetRampageInSkillResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgIngamePetRampageInSkillResponse(value)
            .build();
    }

    public proto.message.IngamePetRampageEndSkillResponse getMsgIngamePetRampageEndSkillResponse() {
        return msgIngamePetRampageEndSkillResponse;
    }

    public boolean hasMsgIngamePetRampageEndSkillResponse() {
        return (__bitField2 & 1024) == 1024;
    }

    public InGameMessage withMsgIngamePetRampageEndSkillResponse(proto.message.IngamePetRampageEndSkillResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgIngamePetRampageEndSkillResponse(value)
            .build();
    }

    public proto.message.IngamePetRampageSkillBulletRequest getMsgIngamePetRampageSkillBulletRequest() {
        return msgIngamePetRampageSkillBulletRequest;
    }

    public boolean hasMsgIngamePetRampageSkillBulletRequest() {
        return (__bitField2 & 2048) == 2048;
    }

    public InGameMessage withMsgIngamePetRampageSkillBulletRequest(proto.message.IngamePetRampageSkillBulletRequest value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgIngamePetRampageSkillBulletRequest(value)
            .build();
    }

    public proto.message.IngamePetRampageSkillBulletResponse getMsgIngamePetRampageSkillBulletResponse() {
        return msgIngamePetRampageSkillBulletResponse;
    }

    public boolean hasMsgIngamePetRampageSkillBulletResponse() {
        return (__bitField2 & 4096) == 4096;
    }

    public InGameMessage withMsgIngamePetRampageSkillBulletResponse(proto.message.IngamePetRampageSkillBulletResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgIngamePetRampageSkillBulletResponse(value)
            .build();
    }

    public proto.message.IngameCollectionItemDropResponse getMsgIngameCollectionItemDropResponse() {
        return msgIngameCollectionItemDropResponse;
    }

    public boolean hasMsgIngameCollectionItemDropResponse() {
        return (__bitField2 & 8192) == 8192;
    }

    public InGameMessage withMsgIngameCollectionItemDropResponse(proto.message.IngameCollectionItemDropResponse value) {
        return InGameMessage.newBuilder()
            .mergeFrom(this)
            .setMsgIngameCollectionItemDropResponse(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<InGameMessage> cachedSchema() {
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
        InGameMessage that = (InGameMessage) obj;
        if (!java.util.Objects.equals(this.command, that.command)) {
            return false;
        }
        if (!java.util.Objects.equals(this.userID, that.userID)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgGetGameListResponse, that.msgGetGameListResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgJoinGameRequest, that.msgJoinGameRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgJoinGameResponse, that.msgJoinGameResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgJoinRoomRequest, that.msgJoinRoomRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgJoinRoomResponse, that.msgJoinRoomResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgJoinBoardRequest, that.msgJoinBoardRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgJoinBoardResponse, that.msgJoinBoardResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgStartGameResponse, that.msgStartGameResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgPlayerReadyRequest, that.msgPlayerReadyRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgPlayerReadyResponse, that.msgPlayerReadyResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgSetBetMoneyRequest, that.msgSetBetMoneyRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgSetBetMoneyResponse, that.msgSetBetMoneyResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgSetMaxPlayerRequest, that.msgSetMaxPlayerRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgSetMaxPlayerResponse, that.msgSetMaxPlayerResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgGetBoardInforResponse, that.msgGetBoardInforResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgGetFishHordeInforResponse, that.msgGetFishHordeInforResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgFireRequest, that.msgFireRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgFireResponse, that.msgFireResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgLeaveBoardRequest, that.msgLeaveBoardRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgLeaveBoardResponse, that.msgLeaveBoardResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgChangeOwnerResponse, that.msgChangeOwnerResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgPlayerLeaveBoard, that.msgPlayerLeaveBoard)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgLeaveRoomResponse, that.msgLeaveRoomResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgLeaveGameResponse, that.msgLeaveGameResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgOpenFireRequest, that.msgOpenFireRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgOutOfAmmoResponse, that.msgOutOfAmmoResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgOpenFireResponse, that.msgOpenFireResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgFinishGameRequest, that.msgFinishGameRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgFinishGameResponse, that.msgFinishGameResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgChatRequest, that.msgChatRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgChatResponse, that.msgChatResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgDonateMoneyResponse, that.msgDonateMoneyResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgGetBoarInforRequest, that.msgGetBoarInforRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgUserLevelUpResponse, that.msgUserLevelUpResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgGunChangeRequest, that.msgGunChangeRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgGunChangeResponse, that.msgGunChangeResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgBossKillResponse, that.msgBossKillResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgGetRoomListRequest, that.msgGetRoomListRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgGetRoomListResponse, that.msgGetRoomListResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgGetBoardListRequest, that.msgGetBoardListRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgGetBoardListResponse, that.msgGetBoardListResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgChatEmoRequest, that.msgChatEmoRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgChatEmoResponse, that.msgChatEmoResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgBetMakeConfirmRequest, that.msgBetMakeConfirmRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgBetMakeConfirmResponse, that.msgBetMakeConfirmResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgSoloRequest, that.msgSoloRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgSoloResponse, that.msgSoloResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgUseItemRequest, that.msgUseItemRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgUseItemResponse, that.msgUseItemResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgSoloConfirm, that.msgSoloConfirm)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgReviveBoardRequest, that.msgReviveBoardRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgReviveBoardResponse, that.msgReviveBoardResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgReviveBoardInfoResponse, that.msgReviveBoardInfoResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgRoomMoneyListRequest, that.msgRoomMoneyListRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgRoomMoneyListResponse, that.msgRoomMoneyListResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgIngameAvailableCannonsList, that.msgIngameAvailableCannonsList)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgIngameCreateBoardRequest, that.msgIngameCreateBoardRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgIngameCreateBoardResponse, that.msgIngameCreateBoardResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.clienttime, that.clienttime)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgIngameNetworkTime, that.msgIngameNetworkTime)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgAccumulationResponse, that.msgAccumulationResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgOpenBombRequest, that.msgOpenBombRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgOpenBombResponse, that.msgOpenBombResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgBombExplodeResponse, that.msgBombExplodeResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgUdpEstablishRequest, that.msgUdpEstablishRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgUdpEstablishResponse, that.msgUdpEstablishResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.uDPInboundSeq, that.uDPInboundSeq)) {
            return false;
        }
        if (!java.util.Objects.equals(this.udpHashCode, that.udpHashCode)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgIngameSkillResponse, that.msgIngameSkillResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgIngamePetRampagePreSkillResponse, that.msgIngamePetRampagePreSkillResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgIngamePetRampageBeginSkillResponse, that.msgIngamePetRampageBeginSkillResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgIngamePetRampageInSkillResponse, that.msgIngamePetRampageInSkillResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgIngamePetRampageEndSkillResponse, that.msgIngamePetRampageEndSkillResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgIngamePetRampageSkillBulletRequest, that.msgIngamePetRampageSkillBulletRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgIngamePetRampageSkillBulletResponse, that.msgIngamePetRampageSkillBulletResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgIngameCollectionItemDropResponse, that.msgIngameCollectionItemDropResponse)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.command);
        result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
        result = 31 * result + (this.msgGetGameListResponse == null ? 0 : this.msgGetGameListResponse.hashCode());
        result = 31 * result + (this.msgJoinGameRequest == null ? 0 : this.msgJoinGameRequest.hashCode());
        result = 31 * result + (this.msgJoinGameResponse == null ? 0 : this.msgJoinGameResponse.hashCode());
        result = 31 * result + (this.msgJoinRoomRequest == null ? 0 : this.msgJoinRoomRequest.hashCode());
        result = 31 * result + (this.msgJoinRoomResponse == null ? 0 : this.msgJoinRoomResponse.hashCode());
        result = 31 * result + (this.msgJoinBoardRequest == null ? 0 : this.msgJoinBoardRequest.hashCode());
        result = 31 * result + (this.msgJoinBoardResponse == null ? 0 : this.msgJoinBoardResponse.hashCode());
        result = 31 * result + (this.msgStartGameResponse == null ? 0 : this.msgStartGameResponse.hashCode());
        result = 31 * result + (this.msgPlayerReadyRequest == null ? 0 : this.msgPlayerReadyRequest.hashCode());
        result = 31 * result + (this.msgPlayerReadyResponse == null ? 0 : this.msgPlayerReadyResponse.hashCode());
        result = 31 * result + (this.msgSetBetMoneyRequest == null ? 0 : this.msgSetBetMoneyRequest.hashCode());
        result = 31 * result + (this.msgSetBetMoneyResponse == null ? 0 : this.msgSetBetMoneyResponse.hashCode());
        result = 31 * result + (this.msgSetMaxPlayerRequest == null ? 0 : this.msgSetMaxPlayerRequest.hashCode());
        result = 31 * result + (this.msgSetMaxPlayerResponse == null ? 0 : this.msgSetMaxPlayerResponse.hashCode());
        result = 31 * result + (this.msgGetBoardInforResponse == null ? 0 : this.msgGetBoardInforResponse.hashCode());
        result = 31 * result + (this.msgGetFishHordeInforResponse == null ? 0 : this.msgGetFishHordeInforResponse.hashCode());
        result = 31 * result + (this.msgFireRequest == null ? 0 : this.msgFireRequest.hashCode());
        result = 31 * result + (this.msgFireResponse == null ? 0 : this.msgFireResponse.hashCode());
        result = 31 * result + (this.msgLeaveBoardRequest == null ? 0 : this.msgLeaveBoardRequest.hashCode());
        result = 31 * result + (this.msgLeaveBoardResponse == null ? 0 : this.msgLeaveBoardResponse.hashCode());
        result = 31 * result + (this.msgChangeOwnerResponse == null ? 0 : this.msgChangeOwnerResponse.hashCode());
        result = 31 * result + (this.msgPlayerLeaveBoard == null ? 0 : this.msgPlayerLeaveBoard.hashCode());
        result = 31 * result + (this.msgLeaveRoomResponse == null ? 0 : this.msgLeaveRoomResponse.hashCode());
        result = 31 * result + (this.msgLeaveGameResponse == null ? 0 : this.msgLeaveGameResponse.hashCode());
        result = 31 * result + (this.msgOpenFireRequest == null ? 0 : this.msgOpenFireRequest.hashCode());
        result = 31 * result + (this.msgOutOfAmmoResponse == null ? 0 : this.msgOutOfAmmoResponse.hashCode());
        result = 31 * result + (this.msgOpenFireResponse == null ? 0 : this.msgOpenFireResponse.hashCode());
        result = 31 * result + (this.msgFinishGameRequest == null ? 0 : this.msgFinishGameRequest.hashCode());
        result = 31 * result + (this.msgFinishGameResponse == null ? 0 : this.msgFinishGameResponse.hashCode());
        result = 31 * result + (this.msgChatRequest == null ? 0 : this.msgChatRequest.hashCode());
        result = 31 * result + (this.msgChatResponse == null ? 0 : this.msgChatResponse.hashCode());
        result = 31 * result + (this.msgDonateMoneyResponse == null ? 0 : this.msgDonateMoneyResponse.hashCode());
        result = 31 * result + (this.msgGetBoarInforRequest == null ? 0 : this.msgGetBoarInforRequest.hashCode());
        result = 31 * result + (this.msgUserLevelUpResponse == null ? 0 : this.msgUserLevelUpResponse.hashCode());
        result = 31 * result + (this.msgGunChangeRequest == null ? 0 : this.msgGunChangeRequest.hashCode());
        result = 31 * result + (this.msgGunChangeResponse == null ? 0 : this.msgGunChangeResponse.hashCode());
        result = 31 * result + (this.msgBossKillResponse == null ? 0 : this.msgBossKillResponse.hashCode());
        result = 31 * result + (this.msgGetRoomListRequest == null ? 0 : this.msgGetRoomListRequest.hashCode());
        result = 31 * result + (this.msgGetRoomListResponse == null ? 0 : this.msgGetRoomListResponse.hashCode());
        result = 31 * result + (this.msgGetBoardListRequest == null ? 0 : this.msgGetBoardListRequest.hashCode());
        result = 31 * result + (this.msgGetBoardListResponse == null ? 0 : this.msgGetBoardListResponse.hashCode());
        result = 31 * result + (this.msgChatEmoRequest == null ? 0 : this.msgChatEmoRequest.hashCode());
        result = 31 * result + (this.msgChatEmoResponse == null ? 0 : this.msgChatEmoResponse.hashCode());
        result = 31 * result + (this.msgBetMakeConfirmRequest == null ? 0 : this.msgBetMakeConfirmRequest.hashCode());
        result = 31 * result + (this.msgBetMakeConfirmResponse == null ? 0 : this.msgBetMakeConfirmResponse.hashCode());
        result = 31 * result + (this.msgSoloRequest == null ? 0 : this.msgSoloRequest.hashCode());
        result = 31 * result + (this.msgSoloResponse == null ? 0 : this.msgSoloResponse.hashCode());
        result = 31 * result + (this.msgUseItemRequest == null ? 0 : this.msgUseItemRequest.hashCode());
        result = 31 * result + (this.msgUseItemResponse == null ? 0 : this.msgUseItemResponse.hashCode());
        result = 31 * result + (this.msgSoloConfirm == null ? 0 : this.msgSoloConfirm.hashCode());
        result = 31 * result + (this.msgReviveBoardRequest == null ? 0 : this.msgReviveBoardRequest.hashCode());
        result = 31 * result + (this.msgReviveBoardResponse == null ? 0 : this.msgReviveBoardResponse.hashCode());
        result = 31 * result + (this.msgReviveBoardInfoResponse == null ? 0 : this.msgReviveBoardInfoResponse.hashCode());
        result = 31 * result + (this.msgRoomMoneyListRequest == null ? 0 : this.msgRoomMoneyListRequest.hashCode());
        result = 31 * result + (this.msgRoomMoneyListResponse == null ? 0 : this.msgRoomMoneyListResponse.hashCode());
        result = 31 * result + (this.msgIngameAvailableCannonsList == null ? 0 : this.msgIngameAvailableCannonsList.hashCode());
        result = 31 * result + (this.msgIngameCreateBoardRequest == null ? 0 : this.msgIngameCreateBoardRequest.hashCode());
        result = 31 * result + (this.msgIngameCreateBoardResponse == null ? 0 : this.msgIngameCreateBoardResponse.hashCode());
        result = 31 * result + Long.hashCode(this.clienttime);
        result = 31 * result + (this.msgIngameNetworkTime == null ? 0 : this.msgIngameNetworkTime.hashCode());
        result = 31 * result + (this.msgAccumulationResponse == null ? 0 : this.msgAccumulationResponse.hashCode());
        result = 31 * result + (this.msgOpenBombRequest == null ? 0 : this.msgOpenBombRequest.hashCode());
        result = 31 * result + (this.msgOpenBombResponse == null ? 0 : this.msgOpenBombResponse.hashCode());
        result = 31 * result + (this.msgBombExplodeResponse == null ? 0 : this.msgBombExplodeResponse.hashCode());
        result = 31 * result + (this.msgUdpEstablishRequest == null ? 0 : this.msgUdpEstablishRequest.hashCode());
        result = 31 * result + (this.msgUdpEstablishResponse == null ? 0 : this.msgUdpEstablishResponse.hashCode());
        result = 31 * result + Long.hashCode(this.uDPInboundSeq);
        result = 31 * result + Integer.hashCode(this.udpHashCode);
        result = 31 * result + (this.msgIngameSkillResponse == null ? 0 : this.msgIngameSkillResponse.hashCode());
        result = 31 * result + (this.msgIngamePetRampagePreSkillResponse == null ? 0 : this.msgIngamePetRampagePreSkillResponse.hashCode());
        result = 31 * result + (this.msgIngamePetRampageBeginSkillResponse == null ? 0 : this.msgIngamePetRampageBeginSkillResponse.hashCode());
        result = 31 * result + (this.msgIngamePetRampageInSkillResponse == null ? 0 : this.msgIngamePetRampageInSkillResponse.hashCode());
        result = 31 * result + (this.msgIngamePetRampageEndSkillResponse == null ? 0 : this.msgIngamePetRampageEndSkillResponse.hashCode());
        result = 31 * result + (this.msgIngamePetRampageSkillBulletRequest == null ? 0 : this.msgIngamePetRampageSkillBulletRequest.hashCode());
        result = 31 * result + (this.msgIngamePetRampageSkillBulletResponse == null ? 0 : this.msgIngamePetRampageSkillBulletResponse.hashCode());
        result = 31 * result + (this.msgIngameCollectionItemDropResponse == null ? 0 : this.msgIngameCollectionItemDropResponse.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasCommand()) {
            parts.add("command=" + getCommand() + '(' + getCommandValue() + ')');
        }
        if (hasUserID()) {
            parts.add("userID=" + getUserID());
        }
        if (hasMsgGetGameListResponse()) {
            parts.add("msgGetGameListResponse=" + getMsgGetGameListResponse());
        }
        if (hasMsgJoinGameRequest()) {
            parts.add("msgJoinGameRequest=" + getMsgJoinGameRequest());
        }
        if (hasMsgJoinGameResponse()) {
            parts.add("msgJoinGameResponse=" + getMsgJoinGameResponse());
        }
        if (hasMsgJoinRoomRequest()) {
            parts.add("msgJoinRoomRequest=" + getMsgJoinRoomRequest());
        }
        if (hasMsgJoinRoomResponse()) {
            parts.add("msgJoinRoomResponse=" + getMsgJoinRoomResponse());
        }
        if (hasMsgJoinBoardRequest()) {
            parts.add("msgJoinBoardRequest=" + getMsgJoinBoardRequest());
        }
        if (hasMsgJoinBoardResponse()) {
            parts.add("msgJoinBoardResponse=" + getMsgJoinBoardResponse());
        }
        if (hasMsgStartGameResponse()) {
            parts.add("msgStartGameResponse=" + getMsgStartGameResponse());
        }
        if (hasMsgPlayerReadyRequest()) {
            parts.add("msgPlayerReadyRequest=" + getMsgPlayerReadyRequest());
        }
        if (hasMsgPlayerReadyResponse()) {
            parts.add("msgPlayerReadyResponse=" + getMsgPlayerReadyResponse());
        }
        if (hasMsgSetBetMoneyRequest()) {
            parts.add("msgSetBetMoneyRequest=" + getMsgSetBetMoneyRequest());
        }
        if (hasMsgSetBetMoneyResponse()) {
            parts.add("msgSetBetMoneyResponse=" + getMsgSetBetMoneyResponse());
        }
        if (hasMsgSetMaxPlayerRequest()) {
            parts.add("msgSetMaxPlayerRequest=" + getMsgSetMaxPlayerRequest());
        }
        if (hasMsgSetMaxPlayerResponse()) {
            parts.add("msgSetMaxPlayerResponse=" + getMsgSetMaxPlayerResponse());
        }
        if (hasMsgGetBoardInforResponse()) {
            parts.add("msgGetBoardInforResponse=" + getMsgGetBoardInforResponse());
        }
        if (hasMsgGetFishHordeInforResponse()) {
            parts.add("msgGetFishHordeInforResponse=" + getMsgGetFishHordeInforResponse());
        }
        if (hasMsgFireRequest()) {
            parts.add("msgFireRequest=" + getMsgFireRequest());
        }
        if (hasMsgFireResponse()) {
            parts.add("msgFireResponse=" + getMsgFireResponse());
        }
        if (hasMsgLeaveBoardRequest()) {
            parts.add("msgLeaveBoardRequest=" + getMsgLeaveBoardRequest());
        }
        if (hasMsgLeaveBoardResponse()) {
            parts.add("msgLeaveBoardResponse=" + getMsgLeaveBoardResponse());
        }
        if (hasMsgChangeOwnerResponse()) {
            parts.add("msgChangeOwnerResponse=" + getMsgChangeOwnerResponse());
        }
        if (hasMsgPlayerLeaveBoard()) {
            parts.add("msgPlayerLeaveBoard=" + getMsgPlayerLeaveBoard());
        }
        if (hasMsgLeaveRoomResponse()) {
            parts.add("msgLeaveRoomResponse=" + getMsgLeaveRoomResponse());
        }
        if (hasMsgLeaveGameResponse()) {
            parts.add("msgLeaveGameResponse=" + getMsgLeaveGameResponse());
        }
        if (hasMsgOpenFireRequest()) {
            parts.add("msgOpenFireRequest=" + getMsgOpenFireRequest());
        }
        if (hasMsgOutOfAmmoResponse()) {
            parts.add("msgOutOfAmmoResponse=" + getMsgOutOfAmmoResponse());
        }
        if (hasMsgOpenFireResponse()) {
            parts.add("msgOpenFireResponse=" + getMsgOpenFireResponse());
        }
        if (hasMsgFinishGameRequest()) {
            parts.add("msgFinishGameRequest=" + getMsgFinishGameRequest());
        }
        if (hasMsgFinishGameResponse()) {
            parts.add("msgFinishGameResponse=" + getMsgFinishGameResponse());
        }
        if (hasMsgChatRequest()) {
            parts.add("msgChatRequest=" + getMsgChatRequest());
        }
        if (hasMsgChatResponse()) {
            parts.add("msgChatResponse=" + getMsgChatResponse());
        }
        if (hasMsgDonateMoneyResponse()) {
            parts.add("msgDonateMoneyResponse=" + getMsgDonateMoneyResponse());
        }
        if (hasMsgGetBoarInforRequest()) {
            parts.add("msgGetBoarInforRequest=" + getMsgGetBoarInforRequest());
        }
        if (hasMsgUserLevelUpResponse()) {
            parts.add("msgUserLevelUpResponse=" + getMsgUserLevelUpResponse());
        }
        if (hasMsgGunChangeRequest()) {
            parts.add("msgGunChangeRequest=" + getMsgGunChangeRequest());
        }
        if (hasMsgGunChangeResponse()) {
            parts.add("msgGunChangeResponse=" + getMsgGunChangeResponse());
        }
        if (hasMsgBossKillResponse()) {
            parts.add("msgBossKillResponse=" + getMsgBossKillResponse());
        }
        if (hasMsgGetRoomListRequest()) {
            parts.add("msgGetRoomListRequest=" + getMsgGetRoomListRequest());
        }
        if (hasMsgGetRoomListResponse()) {
            parts.add("msgGetRoomListResponse=" + getMsgGetRoomListResponse());
        }
        if (hasMsgGetBoardListRequest()) {
            parts.add("msgGetBoardListRequest=" + getMsgGetBoardListRequest());
        }
        if (hasMsgGetBoardListResponse()) {
            parts.add("msgGetBoardListResponse=" + getMsgGetBoardListResponse());
        }
        if (hasMsgChatEmoRequest()) {
            parts.add("msgChatEmoRequest=" + getMsgChatEmoRequest());
        }
        if (hasMsgChatEmoResponse()) {
            parts.add("msgChatEmoResponse=" + getMsgChatEmoResponse());
        }
        if (hasMsgBetMakeConfirmRequest()) {
            parts.add("msgBetMakeConfirmRequest=" + getMsgBetMakeConfirmRequest());
        }
        if (hasMsgBetMakeConfirmResponse()) {
            parts.add("msgBetMakeConfirmResponse=" + getMsgBetMakeConfirmResponse());
        }
        if (hasMsgSoloRequest()) {
            parts.add("msgSoloRequest=" + getMsgSoloRequest());
        }
        if (hasMsgSoloResponse()) {
            parts.add("msgSoloResponse=" + getMsgSoloResponse());
        }
        if (hasMsgUseItemRequest()) {
            parts.add("msgUseItemRequest=" + getMsgUseItemRequest());
        }
        if (hasMsgUseItemResponse()) {
            parts.add("msgUseItemResponse=" + getMsgUseItemResponse());
        }
        if (hasMsgSoloConfirm()) {
            parts.add("msgSoloConfirm=" + getMsgSoloConfirm());
        }
        if (hasMsgReviveBoardRequest()) {
            parts.add("msgReviveBoardRequest=" + getMsgReviveBoardRequest());
        }
        if (hasMsgReviveBoardResponse()) {
            parts.add("msgReviveBoardResponse=" + getMsgReviveBoardResponse());
        }
        if (hasMsgReviveBoardInfoResponse()) {
            parts.add("msgReviveBoardInfoResponse=" + getMsgReviveBoardInfoResponse());
        }
        if (hasMsgRoomMoneyListRequest()) {
            parts.add("msgRoomMoneyListRequest=" + getMsgRoomMoneyListRequest());
        }
        if (hasMsgRoomMoneyListResponse()) {
            parts.add("msgRoomMoneyListResponse=" + getMsgRoomMoneyListResponse());
        }
        if (hasMsgIngameAvailableCannonsList()) {
            parts.add("msgIngameAvailableCannonsList=" + getMsgIngameAvailableCannonsList());
        }
        if (hasMsgIngameCreateBoardRequest()) {
            parts.add("msgIngameCreateBoardRequest=" + getMsgIngameCreateBoardRequest());
        }
        if (hasMsgIngameCreateBoardResponse()) {
            parts.add("msgIngameCreateBoardResponse=" + getMsgIngameCreateBoardResponse());
        }
        if (hasClienttime()) {
            parts.add("clienttime=" + getClienttime());
        }
        if (hasMsgIngameNetworkTime()) {
            parts.add("msgIngameNetworkTime=" + getMsgIngameNetworkTime());
        }
        if (hasMsgAccumulationResponse()) {
            parts.add("msgAccumulationResponse=" + getMsgAccumulationResponse());
        }
        if (hasMsgOpenBombRequest()) {
            parts.add("msgOpenBombRequest=" + getMsgOpenBombRequest());
        }
        if (hasMsgOpenBombResponse()) {
            parts.add("msgOpenBombResponse=" + getMsgOpenBombResponse());
        }
        if (hasMsgBombExplodeResponse()) {
            parts.add("msgBombExplodeResponse=" + getMsgBombExplodeResponse());
        }
        if (hasMsgUdpEstablishRequest()) {
            parts.add("msgUdpEstablishRequest=" + getMsgUdpEstablishRequest());
        }
        if (hasMsgUdpEstablishResponse()) {
            parts.add("msgUdpEstablishResponse=" + getMsgUdpEstablishResponse());
        }
        if (hasUDPInboundSeq()) {
            parts.add("uDPInboundSeq=" + getUDPInboundSeq());
        }
        if (hasUdpHashCode()) {
            parts.add("udpHashCode=" + getUdpHashCode());
        }
        if (hasMsgIngameSkillResponse()) {
            parts.add("msgIngameSkillResponse=" + getMsgIngameSkillResponse());
        }
        if (hasMsgIngamePetRampagePreSkillResponse()) {
            parts.add("msgIngamePetRampagePreSkillResponse=" + getMsgIngamePetRampagePreSkillResponse());
        }
        if (hasMsgIngamePetRampageBeginSkillResponse()) {
            parts.add("msgIngamePetRampageBeginSkillResponse=" + getMsgIngamePetRampageBeginSkillResponse());
        }
        if (hasMsgIngamePetRampageInSkillResponse()) {
            parts.add("msgIngamePetRampageInSkillResponse=" + getMsgIngamePetRampageInSkillResponse());
        }
        if (hasMsgIngamePetRampageEndSkillResponse()) {
            parts.add("msgIngamePetRampageEndSkillResponse=" + getMsgIngamePetRampageEndSkillResponse());
        }
        if (hasMsgIngamePetRampageSkillBulletRequest()) {
            parts.add("msgIngamePetRampageSkillBulletRequest=" + getMsgIngamePetRampageSkillBulletRequest());
        }
        if (hasMsgIngamePetRampageSkillBulletResponse()) {
            parts.add("msgIngamePetRampageSkillBulletResponse=" + getMsgIngamePetRampageSkillBulletResponse());
        }
        if (hasMsgIngameCollectionItemDropResponse()) {
            parts.add("msgIngameCollectionItemDropResponse=" + getMsgIngameCollectionItemDropResponse());
        }
        return "InGameMessage{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<InGameMessage>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("command", 1);
        	__fieldMap.put("userID", 2);
        	__fieldMap.put("msgGetGameListResponse", 3);
        	__fieldMap.put("msgJoinGameRequest", 5);
        	__fieldMap.put("msgJoinGameResponse", 6);
        	__fieldMap.put("msgJoinRoomRequest", 7);
        	__fieldMap.put("msgJoinRoomResponse", 8);
        	__fieldMap.put("msgJoinBoardRequest", 9);
        	__fieldMap.put("msgJoinBoardResponse", 10);
        	__fieldMap.put("msgStartGameResponse", 12);
        	__fieldMap.put("msgPlayerReadyRequest", 13);
        	__fieldMap.put("msgPlayerReadyResponse", 14);
        	__fieldMap.put("msgSetBetMoneyRequest", 15);
        	__fieldMap.put("msgSetBetMoneyResponse", 16);
        	__fieldMap.put("msgSetMaxPlayerRequest", 17);
        	__fieldMap.put("msgSetMaxPlayerResponse", 18);
        	__fieldMap.put("msgGetBoardInforResponse", 19);
        	__fieldMap.put("msgGetFishHordeInforResponse", 20);
        	__fieldMap.put("msgFireRequest", 21);
        	__fieldMap.put("msgFireResponse", 22);
        	__fieldMap.put("msgLeaveBoardRequest", 23);
        	__fieldMap.put("msgLeaveBoardResponse", 24);
        	__fieldMap.put("msgChangeOwnerResponse", 25);
        	__fieldMap.put("msgPlayerLeaveBoard", 26);
        	__fieldMap.put("msgLeaveRoomResponse", 27);
        	__fieldMap.put("msgLeaveGameResponse", 28);
        	__fieldMap.put("msgOpenFireRequest", 29);
        	__fieldMap.put("msgOutOfAmmoResponse", 30);
        	__fieldMap.put("msgOpenFireResponse", 31);
        	__fieldMap.put("msgFinishGameRequest", 32);
        	__fieldMap.put("msgFinishGameResponse", 33);
        	__fieldMap.put("msgChatRequest", 34);
        	__fieldMap.put("msgChatResponse", 35);
        	__fieldMap.put("msgDonateMoneyResponse", 36);
        	__fieldMap.put("msgGetBoarInforRequest", 39);
        	__fieldMap.put("msgUserLevelUpResponse", 41);
        	__fieldMap.put("msgGunChangeRequest", 42);
        	__fieldMap.put("msgGunChangeResponse", 43);
        	__fieldMap.put("msgBossKillResponse", 44);
        	__fieldMap.put("msgGetRoomListRequest", 45);
        	__fieldMap.put("msgGetRoomListResponse", 46);
        	__fieldMap.put("msgGetBoardListRequest", 47);
        	__fieldMap.put("msgGetBoardListResponse", 48);
        	__fieldMap.put("msgChatEmoRequest", 49);
        	__fieldMap.put("msgChatEmoResponse", 50);
        	__fieldMap.put("msgBetMakeConfirmRequest", 51);
        	__fieldMap.put("msgBetMakeConfirmResponse", 52);
        	__fieldMap.put("msgSoloRequest", 53);
        	__fieldMap.put("msgSoloResponse", 54);
        	__fieldMap.put("msgUseItemRequest", 55);
        	__fieldMap.put("msgUseItemResponse", 56);
        	__fieldMap.put("msgSoloConfirm", 57);
        	__fieldMap.put("msgReviveBoardRequest", 59);
        	__fieldMap.put("msgReviveBoardResponse", 60);
        	__fieldMap.put("msgReviveBoardInfoResponse", 61);
        	__fieldMap.put("msgRoomMoneyListRequest", 62);
        	__fieldMap.put("msgRoomMoneyListResponse", 63);
        	__fieldMap.put("msgIngameAvailableCannonsList", 64);
        	__fieldMap.put("msgIngameCreateBoardRequest", 65);
        	__fieldMap.put("msgIngameCreateBoardResponse", 66);
        	__fieldMap.put("clienttime", 67);
        	__fieldMap.put("msgIngameNetworkTime", 68);
        	__fieldMap.put("msgAccumulationResponse", 69);
        	__fieldMap.put("msgOpenBombRequest", 70);
        	__fieldMap.put("msgOpenBombResponse", 71);
        	__fieldMap.put("msgBombExplodeResponse", 72);
        	__fieldMap.put("msgUdpEstablishRequest", 73);
        	__fieldMap.put("msgUdpEstablishResponse", 74);
        	__fieldMap.put("uDPInboundSeq", 75);
        	__fieldMap.put("udpHashCode", 76);
        	__fieldMap.put("msgIngameSkillResponse", 77);
        	__fieldMap.put("msgIngamePetRampagePreSkillResponse", 78);
        	__fieldMap.put("msgIngamePetRampageBeginSkillResponse", 79);
        	__fieldMap.put("msgIngamePetRampageInSkillResponse", 80);
        	__fieldMap.put("msgIngamePetRampageEndSkillResponse", 81);
        	__fieldMap.put("msgIngamePetRampageSkillBulletRequest", 82);
        	__fieldMap.put("msgIngamePetRampageSkillBulletResponse", 83);
        	__fieldMap.put("msgIngameCollectionItemDropResponse", 84);
        }

        @Override
        public InGameMessage newMessage() {
            return new InGameMessage();
        }

        @Override
        public Class<InGameMessage> typeClass() {
            return InGameMessage.class;
        }

        @Override
        public String messageName() {
            return InGameMessage.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return InGameMessage.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(InGameMessage message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, InGameMessage instance) throws java.io.IOException {
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
                    	instance.userID = input.readString();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.msgGetGameListResponse = input.mergeObject(null, proto.message.GetGameListResponse.getSchema());
                    	instance.__bitField0 |= 4;
                    	break;
                    case 5:
                    	instance.msgJoinGameRequest = input.mergeObject(null, proto.message.JoinGameRequest.getSchema());
                    	instance.__bitField0 |= 8;
                    	break;
                    case 6:
                    	instance.msgJoinGameResponse = input.mergeObject(null, proto.message.JoinGameResponse.getSchema());
                    	instance.__bitField0 |= 16;
                    	break;
                    case 7:
                    	instance.msgJoinRoomRequest = input.mergeObject(null, proto.message.JoinRoomRequest.getSchema());
                    	instance.__bitField0 |= 32;
                    	break;
                    case 8:
                    	instance.msgJoinRoomResponse = input.mergeObject(null, proto.message.JoinRoomResponse.getSchema());
                    	instance.__bitField0 |= 64;
                    	break;
                    case 9:
                    	instance.msgJoinBoardRequest = input.mergeObject(null, proto.message.JoinBoardRequest.getSchema());
                    	instance.__bitField0 |= 128;
                    	break;
                    case 10:
                    	instance.msgJoinBoardResponse = input.mergeObject(null, proto.message.JoinBoardResponse.getSchema());
                    	instance.__bitField0 |= 256;
                    	break;
                    case 12:
                    	instance.msgStartGameResponse = input.mergeObject(null, proto.message.StartGameResponse.getSchema());
                    	instance.__bitField0 |= 512;
                    	break;
                    case 13:
                    	instance.msgPlayerReadyRequest = input.mergeObject(null, proto.message.PlayerReadyRequest.getSchema());
                    	instance.__bitField0 |= 1024;
                    	break;
                    case 14:
                    	instance.msgPlayerReadyResponse = input.mergeObject(null, proto.message.PlayerReadyResponse.getSchema());
                    	instance.__bitField0 |= 2048;
                    	break;
                    case 15:
                    	instance.msgSetBetMoneyRequest = input.mergeObject(null, proto.message.SetBetMoneyRequest.getSchema());
                    	instance.__bitField0 |= 4096;
                    	break;
                    case 16:
                    	instance.msgSetBetMoneyResponse = input.mergeObject(null, proto.message.SetBetMoneyResponse.getSchema());
                    	instance.__bitField0 |= 8192;
                    	break;
                    case 17:
                    	instance.msgSetMaxPlayerRequest = input.mergeObject(null, proto.message.SetMaxPlayerRequest.getSchema());
                    	instance.__bitField0 |= 16384;
                    	break;
                    case 18:
                    	instance.msgSetMaxPlayerResponse = input.mergeObject(null, proto.message.SetMaxPlayerResponse.getSchema());
                    	instance.__bitField0 |= 32768;
                    	break;
                    case 19:
                    	instance.msgGetBoardInforResponse = input.mergeObject(null, proto.message.GetBoardInforResponse.getSchema());
                    	instance.__bitField0 |= 65536;
                    	break;
                    case 20:
                    	instance.msgGetFishHordeInforResponse = input.mergeObject(null, proto.message.GetFishHordeInforResponse.getSchema());
                    	instance.__bitField0 |= 131072;
                    	break;
                    case 21:
                    	instance.msgFireRequest = input.mergeObject(null, proto.message.FireRequest.getSchema());
                    	instance.__bitField0 |= 262144;
                    	break;
                    case 22:
                    	instance.msgFireResponse = input.mergeObject(null, proto.message.FireResponse.getSchema());
                    	instance.__bitField0 |= 524288;
                    	break;
                    case 23:
                    	instance.msgLeaveBoardRequest = input.mergeObject(null, proto.message.LeaveBoardRequest.getSchema());
                    	instance.__bitField0 |= 1048576;
                    	break;
                    case 24:
                    	instance.msgLeaveBoardResponse = input.mergeObject(null, proto.message.LeaveBoardResponse.getSchema());
                    	instance.__bitField0 |= 2097152;
                    	break;
                    case 25:
                    	instance.msgChangeOwnerResponse = input.mergeObject(null, proto.message.ChangeOwnerResponse.getSchema());
                    	instance.__bitField0 |= 4194304;
                    	break;
                    case 26:
                    	instance.msgPlayerLeaveBoard = input.mergeObject(null, proto.message.PlayerLeaveBoard.getSchema());
                    	instance.__bitField0 |= 8388608;
                    	break;
                    case 27:
                    	instance.msgLeaveRoomResponse = input.mergeObject(null, proto.message.LeaveRoomResponse.getSchema());
                    	instance.__bitField0 |= 16777216;
                    	break;
                    case 28:
                    	instance.msgLeaveGameResponse = input.mergeObject(null, proto.message.LeaveGameResponse.getSchema());
                    	instance.__bitField0 |= 33554432;
                    	break;
                    case 29:
                    	instance.msgOpenFireRequest = input.mergeObject(null, proto.message.OpenFireRequest.getSchema());
                    	instance.__bitField0 |= 67108864;
                    	break;
                    case 30:
                    	instance.msgOutOfAmmoResponse = input.mergeObject(null, proto.message.OutOfAmmoResponse.getSchema());
                    	instance.__bitField0 |= 134217728;
                    	break;
                    case 31:
                    	instance.msgOpenFireResponse = input.mergeObject(null, proto.message.OpenFireResponse.getSchema());
                    	instance.__bitField0 |= 268435456;
                    	break;
                    case 32:
                    	instance.msgFinishGameRequest = input.mergeObject(null, proto.message.FinishGameRequest.getSchema());
                    	instance.__bitField0 |= 536870912;
                    	break;
                    case 33:
                    	instance.msgFinishGameResponse = input.mergeObject(null, proto.message.FinishGameResponse.getSchema());
                    	instance.__bitField0 |= 1073741824;
                    	break;
                    case 34:
                    	instance.msgChatRequest = input.mergeObject(null, proto.message.ChatRequest.getSchema());
                    	instance.__bitField0 |= -2147483648;
                    	break;
                    case 35:
                    	instance.msgChatResponse = input.mergeObject(null, proto.message.ChatResponse.getSchema());
                    	instance.__bitField1 |= 1;
                    	break;
                    case 36:
                    	instance.msgDonateMoneyResponse = input.mergeObject(null, proto.message.DonateMoneyResponse.getSchema());
                    	instance.__bitField1 |= 2;
                    	break;
                    case 39:
                    	instance.msgGetBoarInforRequest = input.mergeObject(null, proto.message.GetBoardInforRequest.getSchema());
                    	instance.__bitField1 |= 4;
                    	break;
                    case 41:
                    	instance.msgUserLevelUpResponse = input.mergeObject(null, proto.message.UserLevelUpResponse.getSchema());
                    	instance.__bitField1 |= 8;
                    	break;
                    case 42:
                    	instance.msgGunChangeRequest = input.mergeObject(null, proto.message.GunChangeRequest.getSchema());
                    	instance.__bitField1 |= 16;
                    	break;
                    case 43:
                    	instance.msgGunChangeResponse = input.mergeObject(null, proto.message.GunChangeResponse.getSchema());
                    	instance.__bitField1 |= 32;
                    	break;
                    case 44:
                    	instance.msgBossKillResponse = input.mergeObject(null, proto.message.BossKillResponse.getSchema());
                    	instance.__bitField1 |= 64;
                    	break;
                    case 45:
                    	instance.msgGetRoomListRequest = input.mergeObject(null, proto.message.GetRoomListRequest.getSchema());
                    	instance.__bitField1 |= 128;
                    	break;
                    case 46:
                    	instance.msgGetRoomListResponse = input.mergeObject(null, proto.message.GetRoomListResponse.getSchema());
                    	instance.__bitField1 |= 256;
                    	break;
                    case 47:
                    	instance.msgGetBoardListRequest = input.mergeObject(null, proto.message.GetBoardListRequest.getSchema());
                    	instance.__bitField1 |= 512;
                    	break;
                    case 48:
                    	instance.msgGetBoardListResponse = input.mergeObject(null, proto.message.GetBoardListResponse.getSchema());
                    	instance.__bitField1 |= 1024;
                    	break;
                    case 49:
                    	instance.msgChatEmoRequest = input.mergeObject(null, proto.message.ChatEmoRequest.getSchema());
                    	instance.__bitField1 |= 2048;
                    	break;
                    case 50:
                    	instance.msgChatEmoResponse = input.mergeObject(null, proto.message.ChatEmoResponse.getSchema());
                    	instance.__bitField1 |= 4096;
                    	break;
                    case 51:
                    	instance.msgBetMakeConfirmRequest = input.mergeObject(null, proto.message.BetMakeConfirmRequest.getSchema());
                    	instance.__bitField1 |= 8192;
                    	break;
                    case 52:
                    	instance.msgBetMakeConfirmResponse = input.mergeObject(null, proto.message.BetMakeConfirmResponse.getSchema());
                    	instance.__bitField1 |= 16384;
                    	break;
                    case 53:
                    	instance.msgSoloRequest = input.mergeObject(null, proto.message.SoloRequest.getSchema());
                    	instance.__bitField1 |= 32768;
                    	break;
                    case 54:
                    	instance.msgSoloResponse = input.mergeObject(null, proto.message.SoloResponse.getSchema());
                    	instance.__bitField1 |= 65536;
                    	break;
                    case 55:
                    	instance.msgUseItemRequest = input.mergeObject(null, proto.message.UseItemResquest.getSchema());
                    	instance.__bitField1 |= 131072;
                    	break;
                    case 56:
                    	instance.msgUseItemResponse = input.mergeObject(null, proto.message.UseItemResponse.getSchema());
                    	instance.__bitField1 |= 262144;
                    	break;
                    case 57:
                    	instance.msgSoloConfirm = input.mergeObject(null, proto.message.SoloConfirm.getSchema());
                    	instance.__bitField1 |= 524288;
                    	break;
                    case 59:
                    	instance.msgReviveBoardRequest = input.mergeObject(null, proto.message.ReviveBoardRequest.getSchema());
                    	instance.__bitField1 |= 1048576;
                    	break;
                    case 60:
                    	instance.msgReviveBoardResponse = input.mergeObject(null, proto.message.ReviveBoardResponse.getSchema());
                    	instance.__bitField1 |= 2097152;
                    	break;
                    case 61:
                    	instance.msgReviveBoardInfoResponse = input.mergeObject(null, proto.message.ReviveBoardInfoResponse.getSchema());
                    	instance.__bitField1 |= 4194304;
                    	break;
                    case 62:
                    	instance.msgRoomMoneyListRequest = input.mergeObject(null, proto.message.RoomMoneyListRequest.getSchema());
                    	instance.__bitField1 |= 8388608;
                    	break;
                    case 63:
                    	instance.msgRoomMoneyListResponse = input.mergeObject(null, proto.message.RoomMoneyListResponse.getSchema());
                    	instance.__bitField1 |= 16777216;
                    	break;
                    case 64:
                    	instance.msgIngameAvailableCannonsList = input.mergeObject(null, proto.message.IngameAvailableCannonsList.getSchema());
                    	instance.__bitField1 |= 33554432;
                    	break;
                    case 65:
                    	instance.msgIngameCreateBoardRequest = input.mergeObject(null, proto.message.IngameCreateBoardRequest.getSchema());
                    	instance.__bitField1 |= 67108864;
                    	break;
                    case 66:
                    	instance.msgIngameCreateBoardResponse = input.mergeObject(null, proto.message.IngameCreateBoardResponse.getSchema());
                    	instance.__bitField1 |= 134217728;
                    	break;
                    case 67:
                    	instance.clienttime = input.readInt64();
                    	instance.__bitField1 |= 268435456;
                    	break;
                    case 68:
                    	instance.msgIngameNetworkTime = input.mergeObject(null, proto.message.IngameNetworkTime.getSchema());
                    	instance.__bitField1 |= 536870912;
                    	break;
                    case 69:
                    	instance.msgAccumulationResponse = input.mergeObject(null, proto.message.AccumulationResponse.getSchema());
                    	instance.__bitField1 |= 1073741824;
                    	break;
                    case 70:
                    	instance.msgOpenBombRequest = input.mergeObject(null, proto.message.OpenBombRequest.getSchema());
                    	instance.__bitField1 |= -2147483648;
                    	break;
                    case 71:
                    	instance.msgOpenBombResponse = input.mergeObject(null, proto.message.OpenBombResponse.getSchema());
                    	instance.__bitField2 |= 1;
                    	break;
                    case 72:
                    	instance.msgBombExplodeResponse = input.mergeObject(null, proto.message.BombExplodeResponse.getSchema());
                    	instance.__bitField2 |= 2;
                    	break;
                    case 73:
                    	instance.msgUdpEstablishRequest = input.mergeObject(null, proto.message.UdpEstablishRequest.getSchema());
                    	instance.__bitField2 |= 4;
                    	break;
                    case 74:
                    	instance.msgUdpEstablishResponse = input.mergeObject(null, proto.message.UdpEstablishResponse.getSchema());
                    	instance.__bitField2 |= 8;
                    	break;
                    case 75:
                    	instance.uDPInboundSeq = input.readUInt64();
                    	instance.__bitField2 |= 16;
                    	break;
                    case 76:
                    	instance.udpHashCode = input.readUInt32();
                    	instance.__bitField2 |= 32;
                    	break;
                    case 77:
                    	instance.msgIngameSkillResponse = input.mergeObject(null, proto.message.IngameSkillResponse.getSchema());
                    	instance.__bitField2 |= 64;
                    	break;
                    case 78:
                    	instance.msgIngamePetRampagePreSkillResponse = input.mergeObject(null, proto.message.IngamePetRampagePreSkillResponse.getSchema());
                    	instance.__bitField2 |= 128;
                    	break;
                    case 79:
                    	instance.msgIngamePetRampageBeginSkillResponse = input.mergeObject(null, proto.message.IngamePetRampageBeginSkillResponse.getSchema());
                    	instance.__bitField2 |= 256;
                    	break;
                    case 80:
                    	instance.msgIngamePetRampageInSkillResponse = input.mergeObject(null, proto.message.IngamePetRampageInSkillResponse.getSchema());
                    	instance.__bitField2 |= 512;
                    	break;
                    case 81:
                    	instance.msgIngamePetRampageEndSkillResponse = input.mergeObject(null, proto.message.IngamePetRampageEndSkillResponse.getSchema());
                    	instance.__bitField2 |= 1024;
                    	break;
                    case 82:
                    	instance.msgIngamePetRampageSkillBulletRequest = input.mergeObject(null, proto.message.IngamePetRampageSkillBulletRequest.getSchema());
                    	instance.__bitField2 |= 2048;
                    	break;
                    case 83:
                    	instance.msgIngamePetRampageSkillBulletResponse = input.mergeObject(null, proto.message.IngamePetRampageSkillBulletResponse.getSchema());
                    	instance.__bitField2 |= 4096;
                    	break;
                    case 84:
                    	instance.msgIngameCollectionItemDropResponse = input.mergeObject(null, proto.message.IngameCollectionItemDropResponse.getSchema());
                    	instance.__bitField2 |= 8192;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, InGameMessage instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.command, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeString(2, instance.userID, false);
            }

            if((instance.__bitField0 & 4) == 4) {
            	output.writeObject(3, instance.msgGetGameListResponse, proto.message.GetGameListResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 8) == 8) {
            	output.writeObject(5, instance.msgJoinGameRequest, proto.message.JoinGameRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 16) == 16) {
            	output.writeObject(6, instance.msgJoinGameResponse, proto.message.JoinGameResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 32) == 32) {
            	output.writeObject(7, instance.msgJoinRoomRequest, proto.message.JoinRoomRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 64) == 64) {
            	output.writeObject(8, instance.msgJoinRoomResponse, proto.message.JoinRoomResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 128) == 128) {
            	output.writeObject(9, instance.msgJoinBoardRequest, proto.message.JoinBoardRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 256) == 256) {
            	output.writeObject(10, instance.msgJoinBoardResponse, proto.message.JoinBoardResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 512) == 512) {
            	output.writeObject(12, instance.msgStartGameResponse, proto.message.StartGameResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 1024) == 1024) {
            	output.writeObject(13, instance.msgPlayerReadyRequest, proto.message.PlayerReadyRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 2048) == 2048) {
            	output.writeObject(14, instance.msgPlayerReadyResponse, proto.message.PlayerReadyResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 4096) == 4096) {
            	output.writeObject(15, instance.msgSetBetMoneyRequest, proto.message.SetBetMoneyRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 8192) == 8192) {
            	output.writeObject(16, instance.msgSetBetMoneyResponse, proto.message.SetBetMoneyResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 16384) == 16384) {
            	output.writeObject(17, instance.msgSetMaxPlayerRequest, proto.message.SetMaxPlayerRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 32768) == 32768) {
            	output.writeObject(18, instance.msgSetMaxPlayerResponse, proto.message.SetMaxPlayerResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 65536) == 65536) {
            	output.writeObject(19, instance.msgGetBoardInforResponse, proto.message.GetBoardInforResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 131072) == 131072) {
            	output.writeObject(20, instance.msgGetFishHordeInforResponse, proto.message.GetFishHordeInforResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 262144) == 262144) {
            	output.writeObject(21, instance.msgFireRequest, proto.message.FireRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 524288) == 524288) {
            	output.writeObject(22, instance.msgFireResponse, proto.message.FireResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 1048576) == 1048576) {
            	output.writeObject(23, instance.msgLeaveBoardRequest, proto.message.LeaveBoardRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 2097152) == 2097152) {
            	output.writeObject(24, instance.msgLeaveBoardResponse, proto.message.LeaveBoardResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 4194304) == 4194304) {
            	output.writeObject(25, instance.msgChangeOwnerResponse, proto.message.ChangeOwnerResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 8388608) == 8388608) {
            	output.writeObject(26, instance.msgPlayerLeaveBoard, proto.message.PlayerLeaveBoard.getSchema(), false);
            }

            if((instance.__bitField0 & 16777216) == 16777216) {
            	output.writeObject(27, instance.msgLeaveRoomResponse, proto.message.LeaveRoomResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 33554432) == 33554432) {
            	output.writeObject(28, instance.msgLeaveGameResponse, proto.message.LeaveGameResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 67108864) == 67108864) {
            	output.writeObject(29, instance.msgOpenFireRequest, proto.message.OpenFireRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 134217728) == 134217728) {
            	output.writeObject(30, instance.msgOutOfAmmoResponse, proto.message.OutOfAmmoResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 268435456) == 268435456) {
            	output.writeObject(31, instance.msgOpenFireResponse, proto.message.OpenFireResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 536870912) == 536870912) {
            	output.writeObject(32, instance.msgFinishGameRequest, proto.message.FinishGameRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 1073741824) == 1073741824) {
            	output.writeObject(33, instance.msgFinishGameResponse, proto.message.FinishGameResponse.getSchema(), false);
            }

            if((instance.__bitField0 & -2147483648) == -2147483648) {
            	output.writeObject(34, instance.msgChatRequest, proto.message.ChatRequest.getSchema(), false);
            }

            if((instance.__bitField1 & 1) == 1) {
            	output.writeObject(35, instance.msgChatResponse, proto.message.ChatResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 2) == 2) {
            	output.writeObject(36, instance.msgDonateMoneyResponse, proto.message.DonateMoneyResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 4) == 4) {
            	output.writeObject(39, instance.msgGetBoarInforRequest, proto.message.GetBoardInforRequest.getSchema(), false);
            }

            if((instance.__bitField1 & 8) == 8) {
            	output.writeObject(41, instance.msgUserLevelUpResponse, proto.message.UserLevelUpResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 16) == 16) {
            	output.writeObject(42, instance.msgGunChangeRequest, proto.message.GunChangeRequest.getSchema(), false);
            }

            if((instance.__bitField1 & 32) == 32) {
            	output.writeObject(43, instance.msgGunChangeResponse, proto.message.GunChangeResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 64) == 64) {
            	output.writeObject(44, instance.msgBossKillResponse, proto.message.BossKillResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 128) == 128) {
            	output.writeObject(45, instance.msgGetRoomListRequest, proto.message.GetRoomListRequest.getSchema(), false);
            }

            if((instance.__bitField1 & 256) == 256) {
            	output.writeObject(46, instance.msgGetRoomListResponse, proto.message.GetRoomListResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 512) == 512) {
            	output.writeObject(47, instance.msgGetBoardListRequest, proto.message.GetBoardListRequest.getSchema(), false);
            }

            if((instance.__bitField1 & 1024) == 1024) {
            	output.writeObject(48, instance.msgGetBoardListResponse, proto.message.GetBoardListResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 2048) == 2048) {
            	output.writeObject(49, instance.msgChatEmoRequest, proto.message.ChatEmoRequest.getSchema(), false);
            }

            if((instance.__bitField1 & 4096) == 4096) {
            	output.writeObject(50, instance.msgChatEmoResponse, proto.message.ChatEmoResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 8192) == 8192) {
            	output.writeObject(51, instance.msgBetMakeConfirmRequest, proto.message.BetMakeConfirmRequest.getSchema(), false);
            }

            if((instance.__bitField1 & 16384) == 16384) {
            	output.writeObject(52, instance.msgBetMakeConfirmResponse, proto.message.BetMakeConfirmResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 32768) == 32768) {
            	output.writeObject(53, instance.msgSoloRequest, proto.message.SoloRequest.getSchema(), false);
            }

            if((instance.__bitField1 & 65536) == 65536) {
            	output.writeObject(54, instance.msgSoloResponse, proto.message.SoloResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 131072) == 131072) {
            	output.writeObject(55, instance.msgUseItemRequest, proto.message.UseItemResquest.getSchema(), false);
            }

            if((instance.__bitField1 & 262144) == 262144) {
            	output.writeObject(56, instance.msgUseItemResponse, proto.message.UseItemResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 524288) == 524288) {
            	output.writeObject(57, instance.msgSoloConfirm, proto.message.SoloConfirm.getSchema(), false);
            }

            if((instance.__bitField1 & 1048576) == 1048576) {
            	output.writeObject(59, instance.msgReviveBoardRequest, proto.message.ReviveBoardRequest.getSchema(), false);
            }

            if((instance.__bitField1 & 2097152) == 2097152) {
            	output.writeObject(60, instance.msgReviveBoardResponse, proto.message.ReviveBoardResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 4194304) == 4194304) {
            	output.writeObject(61, instance.msgReviveBoardInfoResponse, proto.message.ReviveBoardInfoResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 8388608) == 8388608) {
            	output.writeObject(62, instance.msgRoomMoneyListRequest, proto.message.RoomMoneyListRequest.getSchema(), false);
            }

            if((instance.__bitField1 & 16777216) == 16777216) {
            	output.writeObject(63, instance.msgRoomMoneyListResponse, proto.message.RoomMoneyListResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 33554432) == 33554432) {
            	output.writeObject(64, instance.msgIngameAvailableCannonsList, proto.message.IngameAvailableCannonsList.getSchema(), false);
            }

            if((instance.__bitField1 & 67108864) == 67108864) {
            	output.writeObject(65, instance.msgIngameCreateBoardRequest, proto.message.IngameCreateBoardRequest.getSchema(), false);
            }

            if((instance.__bitField1 & 134217728) == 134217728) {
            	output.writeObject(66, instance.msgIngameCreateBoardResponse, proto.message.IngameCreateBoardResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 268435456) == 268435456) {
                output.writeInt64(67, instance.clienttime, false);
            }

            if((instance.__bitField1 & 536870912) == 536870912) {
            	output.writeObject(68, instance.msgIngameNetworkTime, proto.message.IngameNetworkTime.getSchema(), false);
            }

            if((instance.__bitField1 & 1073741824) == 1073741824) {
            	output.writeObject(69, instance.msgAccumulationResponse, proto.message.AccumulationResponse.getSchema(), false);
            }

            if((instance.__bitField1 & -2147483648) == -2147483648) {
            	output.writeObject(70, instance.msgOpenBombRequest, proto.message.OpenBombRequest.getSchema(), false);
            }

            if((instance.__bitField2 & 1) == 1) {
            	output.writeObject(71, instance.msgOpenBombResponse, proto.message.OpenBombResponse.getSchema(), false);
            }

            if((instance.__bitField2 & 2) == 2) {
            	output.writeObject(72, instance.msgBombExplodeResponse, proto.message.BombExplodeResponse.getSchema(), false);
            }

            if((instance.__bitField2 & 4) == 4) {
            	output.writeObject(73, instance.msgUdpEstablishRequest, proto.message.UdpEstablishRequest.getSchema(), false);
            }

            if((instance.__bitField2 & 8) == 8) {
            	output.writeObject(74, instance.msgUdpEstablishResponse, proto.message.UdpEstablishResponse.getSchema(), false);
            }

            if((instance.__bitField2 & 16) == 16) {
                output.writeUInt64(75, instance.uDPInboundSeq, false);
            }

            if((instance.__bitField2 & 32) == 32) {
                output.writeUInt32(76, instance.udpHashCode, false);
            }

            if((instance.__bitField2 & 64) == 64) {
            	output.writeObject(77, instance.msgIngameSkillResponse, proto.message.IngameSkillResponse.getSchema(), false);
            }

            if((instance.__bitField2 & 128) == 128) {
            	output.writeObject(78, instance.msgIngamePetRampagePreSkillResponse, proto.message.IngamePetRampagePreSkillResponse.getSchema(), false);
            }

            if((instance.__bitField2 & 256) == 256) {
            	output.writeObject(79, instance.msgIngamePetRampageBeginSkillResponse, proto.message.IngamePetRampageBeginSkillResponse.getSchema(), false);
            }

            if((instance.__bitField2 & 512) == 512) {
            	output.writeObject(80, instance.msgIngamePetRampageInSkillResponse, proto.message.IngamePetRampageInSkillResponse.getSchema(), false);
            }

            if((instance.__bitField2 & 1024) == 1024) {
            	output.writeObject(81, instance.msgIngamePetRampageEndSkillResponse, proto.message.IngamePetRampageEndSkillResponse.getSchema(), false);
            }

            if((instance.__bitField2 & 2048) == 2048) {
            	output.writeObject(82, instance.msgIngamePetRampageSkillBulletRequest, proto.message.IngamePetRampageSkillBulletRequest.getSchema(), false);
            }

            if((instance.__bitField2 & 4096) == 4096) {
            	output.writeObject(83, instance.msgIngamePetRampageSkillBulletResponse, proto.message.IngamePetRampageSkillBulletResponse.getSchema(), false);
            }

            if((instance.__bitField2 & 8192) == 8192) {
            	output.writeObject(84, instance.msgIngameCollectionItemDropResponse, proto.message.IngameCollectionItemDropResponse.getSchema(), false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "command";
        		case 2: return "userID";
        		case 3: return "msgGetGameListResponse";
        		case 5: return "msgJoinGameRequest";
        		case 6: return "msgJoinGameResponse";
        		case 7: return "msgJoinRoomRequest";
        		case 8: return "msgJoinRoomResponse";
        		case 9: return "msgJoinBoardRequest";
        		case 10: return "msgJoinBoardResponse";
        		case 12: return "msgStartGameResponse";
        		case 13: return "msgPlayerReadyRequest";
        		case 14: return "msgPlayerReadyResponse";
        		case 15: return "msgSetBetMoneyRequest";
        		case 16: return "msgSetBetMoneyResponse";
        		case 17: return "msgSetMaxPlayerRequest";
        		case 18: return "msgSetMaxPlayerResponse";
        		case 19: return "msgGetBoardInforResponse";
        		case 20: return "msgGetFishHordeInforResponse";
        		case 21: return "msgFireRequest";
        		case 22: return "msgFireResponse";
        		case 23: return "msgLeaveBoardRequest";
        		case 24: return "msgLeaveBoardResponse";
        		case 25: return "msgChangeOwnerResponse";
        		case 26: return "msgPlayerLeaveBoard";
        		case 27: return "msgLeaveRoomResponse";
        		case 28: return "msgLeaveGameResponse";
        		case 29: return "msgOpenFireRequest";
        		case 30: return "msgOutOfAmmoResponse";
        		case 31: return "msgOpenFireResponse";
        		case 32: return "msgFinishGameRequest";
        		case 33: return "msgFinishGameResponse";
        		case 34: return "msgChatRequest";
        		case 35: return "msgChatResponse";
        		case 36: return "msgDonateMoneyResponse";
        		case 39: return "msgGetBoarInforRequest";
        		case 41: return "msgUserLevelUpResponse";
        		case 42: return "msgGunChangeRequest";
        		case 43: return "msgGunChangeResponse";
        		case 44: return "msgBossKillResponse";
        		case 45: return "msgGetRoomListRequest";
        		case 46: return "msgGetRoomListResponse";
        		case 47: return "msgGetBoardListRequest";
        		case 48: return "msgGetBoardListResponse";
        		case 49: return "msgChatEmoRequest";
        		case 50: return "msgChatEmoResponse";
        		case 51: return "msgBetMakeConfirmRequest";
        		case 52: return "msgBetMakeConfirmResponse";
        		case 53: return "msgSoloRequest";
        		case 54: return "msgSoloResponse";
        		case 55: return "msgUseItemRequest";
        		case 56: return "msgUseItemResponse";
        		case 57: return "msgSoloConfirm";
        		case 59: return "msgReviveBoardRequest";
        		case 60: return "msgReviveBoardResponse";
        		case 61: return "msgReviveBoardInfoResponse";
        		case 62: return "msgRoomMoneyListRequest";
        		case 63: return "msgRoomMoneyListResponse";
        		case 64: return "msgIngameAvailableCannonsList";
        		case 65: return "msgIngameCreateBoardRequest";
        		case 66: return "msgIngameCreateBoardResponse";
        		case 67: return "clienttime";
        		case 68: return "msgIngameNetworkTime";
        		case 69: return "msgAccumulationResponse";
        		case 70: return "msgOpenBombRequest";
        		case 71: return "msgOpenBombResponse";
        		case 72: return "msgBombExplodeResponse";
        		case 73: return "msgUdpEstablishRequest";
        		case 74: return "msgUdpEstablishResponse";
        		case 75: return "uDPInboundSeq";
        		case 76: return "udpHashCode";
        		case 77: return "msgIngameSkillResponse";
        		case 78: return "msgIngamePetRampagePreSkillResponse";
        		case 79: return "msgIngamePetRampageBeginSkillResponse";
        		case 80: return "msgIngamePetRampageInSkillResponse";
        		case 81: return "msgIngamePetRampageEndSkillResponse";
        		case 82: return "msgIngamePetRampageSkillBulletRequest";
        		case 83: return "msgIngamePetRampageSkillBulletResponse";
        		case 84: return "msgIngameCollectionItemDropResponse";
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

        private String userID;

        private proto.message.GetGameListResponse msgGetGameListResponse;

        private proto.message.JoinGameRequest msgJoinGameRequest;

        private proto.message.JoinGameResponse msgJoinGameResponse;

        private proto.message.JoinRoomRequest msgJoinRoomRequest;

        private proto.message.JoinRoomResponse msgJoinRoomResponse;

        private proto.message.JoinBoardRequest msgJoinBoardRequest;

        private proto.message.JoinBoardResponse msgJoinBoardResponse;

        private proto.message.StartGameResponse msgStartGameResponse;

        private proto.message.PlayerReadyRequest msgPlayerReadyRequest;

        private proto.message.PlayerReadyResponse msgPlayerReadyResponse;

        private proto.message.SetBetMoneyRequest msgSetBetMoneyRequest;

        private proto.message.SetBetMoneyResponse msgSetBetMoneyResponse;

        private proto.message.SetMaxPlayerRequest msgSetMaxPlayerRequest;

        private proto.message.SetMaxPlayerResponse msgSetMaxPlayerResponse;

        private proto.message.GetBoardInforResponse msgGetBoardInforResponse;

        private proto.message.GetFishHordeInforResponse msgGetFishHordeInforResponse;

        private proto.message.FireRequest msgFireRequest;

        private proto.message.FireResponse msgFireResponse;

        private proto.message.LeaveBoardRequest msgLeaveBoardRequest;

        private proto.message.LeaveBoardResponse msgLeaveBoardResponse;

        private proto.message.ChangeOwnerResponse msgChangeOwnerResponse;

        private proto.message.PlayerLeaveBoard msgPlayerLeaveBoard;

        private proto.message.LeaveRoomResponse msgLeaveRoomResponse;

        private proto.message.LeaveGameResponse msgLeaveGameResponse;

        private proto.message.OpenFireRequest msgOpenFireRequest;

        private proto.message.OutOfAmmoResponse msgOutOfAmmoResponse;

        private proto.message.OpenFireResponse msgOpenFireResponse;

        private proto.message.FinishGameRequest msgFinishGameRequest;

        private proto.message.FinishGameResponse msgFinishGameResponse;

        private proto.message.ChatRequest msgChatRequest;

        private proto.message.ChatResponse msgChatResponse;

        private proto.message.DonateMoneyResponse msgDonateMoneyResponse;

        private proto.message.GetBoardInforRequest msgGetBoarInforRequest;

        private proto.message.UserLevelUpResponse msgUserLevelUpResponse;

        private proto.message.GunChangeRequest msgGunChangeRequest;

        private proto.message.GunChangeResponse msgGunChangeResponse;

        private proto.message.BossKillResponse msgBossKillResponse;

        private proto.message.GetRoomListRequest msgGetRoomListRequest;

        private proto.message.GetRoomListResponse msgGetRoomListResponse;

        private proto.message.GetBoardListRequest msgGetBoardListRequest;

        private proto.message.GetBoardListResponse msgGetBoardListResponse;

        private proto.message.ChatEmoRequest msgChatEmoRequest;

        private proto.message.ChatEmoResponse msgChatEmoResponse;

        private proto.message.BetMakeConfirmRequest msgBetMakeConfirmRequest;

        private proto.message.BetMakeConfirmResponse msgBetMakeConfirmResponse;

        private proto.message.SoloRequest msgSoloRequest;

        private proto.message.SoloResponse msgSoloResponse;

        private proto.message.UseItemResquest msgUseItemRequest;

        private proto.message.UseItemResponse msgUseItemResponse;

        private proto.message.SoloConfirm msgSoloConfirm;

        private proto.message.ReviveBoardRequest msgReviveBoardRequest;

        private proto.message.ReviveBoardResponse msgReviveBoardResponse;

        private proto.message.ReviveBoardInfoResponse msgReviveBoardInfoResponse;

        private proto.message.RoomMoneyListRequest msgRoomMoneyListRequest;

        private proto.message.RoomMoneyListResponse msgRoomMoneyListResponse;

        private proto.message.IngameAvailableCannonsList msgIngameAvailableCannonsList;

        private proto.message.IngameCreateBoardRequest msgIngameCreateBoardRequest;

        private proto.message.IngameCreateBoardResponse msgIngameCreateBoardResponse;

        private long clienttime;

        private proto.message.IngameNetworkTime msgIngameNetworkTime;

        private proto.message.AccumulationResponse msgAccumulationResponse;

        private proto.message.OpenBombRequest msgOpenBombRequest;

        private proto.message.OpenBombResponse msgOpenBombResponse;

        private proto.message.BombExplodeResponse msgBombExplodeResponse;

        private proto.message.UdpEstablishRequest msgUdpEstablishRequest;

        private proto.message.UdpEstablishResponse msgUdpEstablishResponse;

        private long uDPInboundSeq;

        private int udpHashCode;

        private proto.message.IngameSkillResponse msgIngameSkillResponse;

        private proto.message.IngamePetRampagePreSkillResponse msgIngamePetRampagePreSkillResponse;

        private proto.message.IngamePetRampageBeginSkillResponse msgIngamePetRampageBeginSkillResponse;

        private proto.message.IngamePetRampageInSkillResponse msgIngamePetRampageInSkillResponse;

        private proto.message.IngamePetRampageEndSkillResponse msgIngamePetRampageEndSkillResponse;

        private proto.message.IngamePetRampageSkillBulletRequest msgIngamePetRampageSkillBulletRequest;

        private proto.message.IngamePetRampageSkillBulletResponse msgIngamePetRampageSkillBulletResponse;

        private proto.message.IngameCollectionItemDropResponse msgIngameCollectionItemDropResponse;

        private int __bitField0;
        private int __bitField1;
        private int __bitField2;

        private Builder() {
            this.command = proto.message.InGameCommand.INGAME_GET_GAME_LIST_REQUEST.getNumber();
            this.userID = "";
            this.msgGetGameListResponse = proto.message.GetGameListResponse.getDefaultInstance();
            this.msgJoinGameRequest = proto.message.JoinGameRequest.getDefaultInstance();
            this.msgJoinGameResponse = proto.message.JoinGameResponse.getDefaultInstance();
            this.msgJoinRoomRequest = proto.message.JoinRoomRequest.getDefaultInstance();
            this.msgJoinRoomResponse = proto.message.JoinRoomResponse.getDefaultInstance();
            this.msgJoinBoardRequest = proto.message.JoinBoardRequest.getDefaultInstance();
            this.msgJoinBoardResponse = proto.message.JoinBoardResponse.getDefaultInstance();
            this.msgStartGameResponse = proto.message.StartGameResponse.getDefaultInstance();
            this.msgPlayerReadyRequest = proto.message.PlayerReadyRequest.getDefaultInstance();
            this.msgPlayerReadyResponse = proto.message.PlayerReadyResponse.getDefaultInstance();
            this.msgSetBetMoneyRequest = proto.message.SetBetMoneyRequest.getDefaultInstance();
            this.msgSetBetMoneyResponse = proto.message.SetBetMoneyResponse.getDefaultInstance();
            this.msgSetMaxPlayerRequest = proto.message.SetMaxPlayerRequest.getDefaultInstance();
            this.msgSetMaxPlayerResponse = proto.message.SetMaxPlayerResponse.getDefaultInstance();
            this.msgGetBoardInforResponse = proto.message.GetBoardInforResponse.getDefaultInstance();
            this.msgGetFishHordeInforResponse = proto.message.GetFishHordeInforResponse.getDefaultInstance();
            this.msgFireRequest = proto.message.FireRequest.getDefaultInstance();
            this.msgFireResponse = proto.message.FireResponse.getDefaultInstance();
            this.msgLeaveBoardRequest = proto.message.LeaveBoardRequest.getDefaultInstance();
            this.msgLeaveBoardResponse = proto.message.LeaveBoardResponse.getDefaultInstance();
            this.msgChangeOwnerResponse = proto.message.ChangeOwnerResponse.getDefaultInstance();
            this.msgPlayerLeaveBoard = proto.message.PlayerLeaveBoard.getDefaultInstance();
            this.msgLeaveRoomResponse = proto.message.LeaveRoomResponse.getDefaultInstance();
            this.msgLeaveGameResponse = proto.message.LeaveGameResponse.getDefaultInstance();
            this.msgOpenFireRequest = proto.message.OpenFireRequest.getDefaultInstance();
            this.msgOutOfAmmoResponse = proto.message.OutOfAmmoResponse.getDefaultInstance();
            this.msgOpenFireResponse = proto.message.OpenFireResponse.getDefaultInstance();
            this.msgFinishGameRequest = proto.message.FinishGameRequest.getDefaultInstance();
            this.msgFinishGameResponse = proto.message.FinishGameResponse.getDefaultInstance();
            this.msgChatRequest = proto.message.ChatRequest.getDefaultInstance();
            this.msgChatResponse = proto.message.ChatResponse.getDefaultInstance();
            this.msgDonateMoneyResponse = proto.message.DonateMoneyResponse.getDefaultInstance();
            this.msgGetBoarInforRequest = proto.message.GetBoardInforRequest.getDefaultInstance();
            this.msgUserLevelUpResponse = proto.message.UserLevelUpResponse.getDefaultInstance();
            this.msgGunChangeRequest = proto.message.GunChangeRequest.getDefaultInstance();
            this.msgGunChangeResponse = proto.message.GunChangeResponse.getDefaultInstance();
            this.msgBossKillResponse = proto.message.BossKillResponse.getDefaultInstance();
            this.msgGetRoomListRequest = proto.message.GetRoomListRequest.getDefaultInstance();
            this.msgGetRoomListResponse = proto.message.GetRoomListResponse.getDefaultInstance();
            this.msgGetBoardListRequest = proto.message.GetBoardListRequest.getDefaultInstance();
            this.msgGetBoardListResponse = proto.message.GetBoardListResponse.getDefaultInstance();
            this.msgChatEmoRequest = proto.message.ChatEmoRequest.getDefaultInstance();
            this.msgChatEmoResponse = proto.message.ChatEmoResponse.getDefaultInstance();
            this.msgBetMakeConfirmRequest = proto.message.BetMakeConfirmRequest.getDefaultInstance();
            this.msgBetMakeConfirmResponse = proto.message.BetMakeConfirmResponse.getDefaultInstance();
            this.msgSoloRequest = proto.message.SoloRequest.getDefaultInstance();
            this.msgSoloResponse = proto.message.SoloResponse.getDefaultInstance();
            this.msgUseItemRequest = proto.message.UseItemResquest.getDefaultInstance();
            this.msgUseItemResponse = proto.message.UseItemResponse.getDefaultInstance();
            this.msgSoloConfirm = proto.message.SoloConfirm.getDefaultInstance();
            this.msgReviveBoardRequest = proto.message.ReviveBoardRequest.getDefaultInstance();
            this.msgReviveBoardResponse = proto.message.ReviveBoardResponse.getDefaultInstance();
            this.msgReviveBoardInfoResponse = proto.message.ReviveBoardInfoResponse.getDefaultInstance();
            this.msgRoomMoneyListRequest = proto.message.RoomMoneyListRequest.getDefaultInstance();
            this.msgRoomMoneyListResponse = proto.message.RoomMoneyListResponse.getDefaultInstance();
            this.msgIngameAvailableCannonsList = proto.message.IngameAvailableCannonsList.getDefaultInstance();
            this.msgIngameCreateBoardRequest = proto.message.IngameCreateBoardRequest.getDefaultInstance();
            this.msgIngameCreateBoardResponse = proto.message.IngameCreateBoardResponse.getDefaultInstance();
            this.clienttime = 0L;
            this.msgIngameNetworkTime = proto.message.IngameNetworkTime.getDefaultInstance();
            this.msgAccumulationResponse = proto.message.AccumulationResponse.getDefaultInstance();
            this.msgOpenBombRequest = proto.message.OpenBombRequest.getDefaultInstance();
            this.msgOpenBombResponse = proto.message.OpenBombResponse.getDefaultInstance();
            this.msgBombExplodeResponse = proto.message.BombExplodeResponse.getDefaultInstance();
            this.msgUdpEstablishRequest = proto.message.UdpEstablishRequest.getDefaultInstance();
            this.msgUdpEstablishResponse = proto.message.UdpEstablishResponse.getDefaultInstance();
            this.uDPInboundSeq = 0L;
            this.udpHashCode = 0;
            this.msgIngameSkillResponse = proto.message.IngameSkillResponse.getDefaultInstance();
            this.msgIngamePetRampagePreSkillResponse = proto.message.IngamePetRampagePreSkillResponse.getDefaultInstance();
            this.msgIngamePetRampageBeginSkillResponse = proto.message.IngamePetRampageBeginSkillResponse.getDefaultInstance();
            this.msgIngamePetRampageInSkillResponse = proto.message.IngamePetRampageInSkillResponse.getDefaultInstance();
            this.msgIngamePetRampageEndSkillResponse = proto.message.IngamePetRampageEndSkillResponse.getDefaultInstance();
            this.msgIngamePetRampageSkillBulletRequest = proto.message.IngamePetRampageSkillBulletRequest.getDefaultInstance();
            this.msgIngamePetRampageSkillBulletResponse = proto.message.IngamePetRampageSkillBulletResponse.getDefaultInstance();
            this.msgIngameCollectionItemDropResponse = proto.message.IngameCollectionItemDropResponse.getDefaultInstance();
        }

        public Builder mergeFrom(InGameMessage instance) {
            if (instance.hasCommand()) {
                this.setCommand(instance.getCommand());
            }

            if (instance.hasUserID()) {
                this.setUserID(instance.getUserID());
            }

            if (instance.hasMsgGetGameListResponse()) {
                this.setMsgGetGameListResponse(instance.getMsgGetGameListResponse());
            }

            if (instance.hasMsgJoinGameRequest()) {
                this.setMsgJoinGameRequest(instance.getMsgJoinGameRequest());
            }

            if (instance.hasMsgJoinGameResponse()) {
                this.setMsgJoinGameResponse(instance.getMsgJoinGameResponse());
            }

            if (instance.hasMsgJoinRoomRequest()) {
                this.setMsgJoinRoomRequest(instance.getMsgJoinRoomRequest());
            }

            if (instance.hasMsgJoinRoomResponse()) {
                this.setMsgJoinRoomResponse(instance.getMsgJoinRoomResponse());
            }

            if (instance.hasMsgJoinBoardRequest()) {
                this.setMsgJoinBoardRequest(instance.getMsgJoinBoardRequest());
            }

            if (instance.hasMsgJoinBoardResponse()) {
                this.setMsgJoinBoardResponse(instance.getMsgJoinBoardResponse());
            }

            if (instance.hasMsgStartGameResponse()) {
                this.setMsgStartGameResponse(instance.getMsgStartGameResponse());
            }

            if (instance.hasMsgPlayerReadyRequest()) {
                this.setMsgPlayerReadyRequest(instance.getMsgPlayerReadyRequest());
            }

            if (instance.hasMsgPlayerReadyResponse()) {
                this.setMsgPlayerReadyResponse(instance.getMsgPlayerReadyResponse());
            }

            if (instance.hasMsgSetBetMoneyRequest()) {
                this.setMsgSetBetMoneyRequest(instance.getMsgSetBetMoneyRequest());
            }

            if (instance.hasMsgSetBetMoneyResponse()) {
                this.setMsgSetBetMoneyResponse(instance.getMsgSetBetMoneyResponse());
            }

            if (instance.hasMsgSetMaxPlayerRequest()) {
                this.setMsgSetMaxPlayerRequest(instance.getMsgSetMaxPlayerRequest());
            }

            if (instance.hasMsgSetMaxPlayerResponse()) {
                this.setMsgSetMaxPlayerResponse(instance.getMsgSetMaxPlayerResponse());
            }

            if (instance.hasMsgGetBoardInforResponse()) {
                this.setMsgGetBoardInforResponse(instance.getMsgGetBoardInforResponse());
            }

            if (instance.hasMsgGetFishHordeInforResponse()) {
                this.setMsgGetFishHordeInforResponse(instance.getMsgGetFishHordeInforResponse());
            }

            if (instance.hasMsgFireRequest()) {
                this.setMsgFireRequest(instance.getMsgFireRequest());
            }

            if (instance.hasMsgFireResponse()) {
                this.setMsgFireResponse(instance.getMsgFireResponse());
            }

            if (instance.hasMsgLeaveBoardRequest()) {
                this.setMsgLeaveBoardRequest(instance.getMsgLeaveBoardRequest());
            }

            if (instance.hasMsgLeaveBoardResponse()) {
                this.setMsgLeaveBoardResponse(instance.getMsgLeaveBoardResponse());
            }

            if (instance.hasMsgChangeOwnerResponse()) {
                this.setMsgChangeOwnerResponse(instance.getMsgChangeOwnerResponse());
            }

            if (instance.hasMsgPlayerLeaveBoard()) {
                this.setMsgPlayerLeaveBoard(instance.getMsgPlayerLeaveBoard());
            }

            if (instance.hasMsgLeaveRoomResponse()) {
                this.setMsgLeaveRoomResponse(instance.getMsgLeaveRoomResponse());
            }

            if (instance.hasMsgLeaveGameResponse()) {
                this.setMsgLeaveGameResponse(instance.getMsgLeaveGameResponse());
            }

            if (instance.hasMsgOpenFireRequest()) {
                this.setMsgOpenFireRequest(instance.getMsgOpenFireRequest());
            }

            if (instance.hasMsgOutOfAmmoResponse()) {
                this.setMsgOutOfAmmoResponse(instance.getMsgOutOfAmmoResponse());
            }

            if (instance.hasMsgOpenFireResponse()) {
                this.setMsgOpenFireResponse(instance.getMsgOpenFireResponse());
            }

            if (instance.hasMsgFinishGameRequest()) {
                this.setMsgFinishGameRequest(instance.getMsgFinishGameRequest());
            }

            if (instance.hasMsgFinishGameResponse()) {
                this.setMsgFinishGameResponse(instance.getMsgFinishGameResponse());
            }

            if (instance.hasMsgChatRequest()) {
                this.setMsgChatRequest(instance.getMsgChatRequest());
            }

            if (instance.hasMsgChatResponse()) {
                this.setMsgChatResponse(instance.getMsgChatResponse());
            }

            if (instance.hasMsgDonateMoneyResponse()) {
                this.setMsgDonateMoneyResponse(instance.getMsgDonateMoneyResponse());
            }

            if (instance.hasMsgGetBoarInforRequest()) {
                this.setMsgGetBoarInforRequest(instance.getMsgGetBoarInforRequest());
            }

            if (instance.hasMsgUserLevelUpResponse()) {
                this.setMsgUserLevelUpResponse(instance.getMsgUserLevelUpResponse());
            }

            if (instance.hasMsgGunChangeRequest()) {
                this.setMsgGunChangeRequest(instance.getMsgGunChangeRequest());
            }

            if (instance.hasMsgGunChangeResponse()) {
                this.setMsgGunChangeResponse(instance.getMsgGunChangeResponse());
            }

            if (instance.hasMsgBossKillResponse()) {
                this.setMsgBossKillResponse(instance.getMsgBossKillResponse());
            }

            if (instance.hasMsgGetRoomListRequest()) {
                this.setMsgGetRoomListRequest(instance.getMsgGetRoomListRequest());
            }

            if (instance.hasMsgGetRoomListResponse()) {
                this.setMsgGetRoomListResponse(instance.getMsgGetRoomListResponse());
            }

            if (instance.hasMsgGetBoardListRequest()) {
                this.setMsgGetBoardListRequest(instance.getMsgGetBoardListRequest());
            }

            if (instance.hasMsgGetBoardListResponse()) {
                this.setMsgGetBoardListResponse(instance.getMsgGetBoardListResponse());
            }

            if (instance.hasMsgChatEmoRequest()) {
                this.setMsgChatEmoRequest(instance.getMsgChatEmoRequest());
            }

            if (instance.hasMsgChatEmoResponse()) {
                this.setMsgChatEmoResponse(instance.getMsgChatEmoResponse());
            }

            if (instance.hasMsgBetMakeConfirmRequest()) {
                this.setMsgBetMakeConfirmRequest(instance.getMsgBetMakeConfirmRequest());
            }

            if (instance.hasMsgBetMakeConfirmResponse()) {
                this.setMsgBetMakeConfirmResponse(instance.getMsgBetMakeConfirmResponse());
            }

            if (instance.hasMsgSoloRequest()) {
                this.setMsgSoloRequest(instance.getMsgSoloRequest());
            }

            if (instance.hasMsgSoloResponse()) {
                this.setMsgSoloResponse(instance.getMsgSoloResponse());
            }

            if (instance.hasMsgUseItemRequest()) {
                this.setMsgUseItemRequest(instance.getMsgUseItemRequest());
            }

            if (instance.hasMsgUseItemResponse()) {
                this.setMsgUseItemResponse(instance.getMsgUseItemResponse());
            }

            if (instance.hasMsgSoloConfirm()) {
                this.setMsgSoloConfirm(instance.getMsgSoloConfirm());
            }

            if (instance.hasMsgReviveBoardRequest()) {
                this.setMsgReviveBoardRequest(instance.getMsgReviveBoardRequest());
            }

            if (instance.hasMsgReviveBoardResponse()) {
                this.setMsgReviveBoardResponse(instance.getMsgReviveBoardResponse());
            }

            if (instance.hasMsgReviveBoardInfoResponse()) {
                this.setMsgReviveBoardInfoResponse(instance.getMsgReviveBoardInfoResponse());
            }

            if (instance.hasMsgRoomMoneyListRequest()) {
                this.setMsgRoomMoneyListRequest(instance.getMsgRoomMoneyListRequest());
            }

            if (instance.hasMsgRoomMoneyListResponse()) {
                this.setMsgRoomMoneyListResponse(instance.getMsgRoomMoneyListResponse());
            }

            if (instance.hasMsgIngameAvailableCannonsList()) {
                this.setMsgIngameAvailableCannonsList(instance.getMsgIngameAvailableCannonsList());
            }

            if (instance.hasMsgIngameCreateBoardRequest()) {
                this.setMsgIngameCreateBoardRequest(instance.getMsgIngameCreateBoardRequest());
            }

            if (instance.hasMsgIngameCreateBoardResponse()) {
                this.setMsgIngameCreateBoardResponse(instance.getMsgIngameCreateBoardResponse());
            }

            if (instance.hasClienttime()) {
                this.setClienttime(instance.getClienttime());
            }

            if (instance.hasMsgIngameNetworkTime()) {
                this.setMsgIngameNetworkTime(instance.getMsgIngameNetworkTime());
            }

            if (instance.hasMsgAccumulationResponse()) {
                this.setMsgAccumulationResponse(instance.getMsgAccumulationResponse());
            }

            if (instance.hasMsgOpenBombRequest()) {
                this.setMsgOpenBombRequest(instance.getMsgOpenBombRequest());
            }

            if (instance.hasMsgOpenBombResponse()) {
                this.setMsgOpenBombResponse(instance.getMsgOpenBombResponse());
            }

            if (instance.hasMsgBombExplodeResponse()) {
                this.setMsgBombExplodeResponse(instance.getMsgBombExplodeResponse());
            }

            if (instance.hasMsgUdpEstablishRequest()) {
                this.setMsgUdpEstablishRequest(instance.getMsgUdpEstablishRequest());
            }

            if (instance.hasMsgUdpEstablishResponse()) {
                this.setMsgUdpEstablishResponse(instance.getMsgUdpEstablishResponse());
            }

            if (instance.hasUDPInboundSeq()) {
                this.setUDPInboundSeq(instance.getUDPInboundSeq());
            }

            if (instance.hasUdpHashCode()) {
                this.setUdpHashCode(instance.getUdpHashCode());
            }

            if (instance.hasMsgIngameSkillResponse()) {
                this.setMsgIngameSkillResponse(instance.getMsgIngameSkillResponse());
            }

            if (instance.hasMsgIngamePetRampagePreSkillResponse()) {
                this.setMsgIngamePetRampagePreSkillResponse(instance.getMsgIngamePetRampagePreSkillResponse());
            }

            if (instance.hasMsgIngamePetRampageBeginSkillResponse()) {
                this.setMsgIngamePetRampageBeginSkillResponse(instance.getMsgIngamePetRampageBeginSkillResponse());
            }

            if (instance.hasMsgIngamePetRampageInSkillResponse()) {
                this.setMsgIngamePetRampageInSkillResponse(instance.getMsgIngamePetRampageInSkillResponse());
            }

            if (instance.hasMsgIngamePetRampageEndSkillResponse()) {
                this.setMsgIngamePetRampageEndSkillResponse(instance.getMsgIngamePetRampageEndSkillResponse());
            }

            if (instance.hasMsgIngamePetRampageSkillBulletRequest()) {
                this.setMsgIngamePetRampageSkillBulletRequest(instance.getMsgIngamePetRampageSkillBulletRequest());
            }

            if (instance.hasMsgIngamePetRampageSkillBulletResponse()) {
                this.setMsgIngamePetRampageSkillBulletResponse(instance.getMsgIngamePetRampageSkillBulletResponse());
            }

            if (instance.hasMsgIngameCollectionItemDropResponse()) {
                this.setMsgIngameCollectionItemDropResponse(instance.getMsgIngameCollectionItemDropResponse());
            }

            return this;
        }

        public proto.message.InGameCommand getCommand() {
            return proto.message.InGameCommand.valueOf(command);
        }

        public int getCommandValue() {
            return command;
        }

        public Builder setCommand(proto.message.InGameCommand value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#command to null");
            }

            if (value == proto.message.InGameCommand.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set InGameMessage#command to UNRECOGNIZED");
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

        public String getUserID() {
            return userID;
        }

        public Builder setUserID(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#userID to null");
            }

            this.userID = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearUserID() {
            this.userID = "";
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasUserID() {
            return (__bitField0 & 2) == 2;
        }

        public proto.message.GetGameListResponse getMsgGetGameListResponse() {
            return msgGetGameListResponse;
        }

        public Builder setMsgGetGameListResponse(proto.message.GetGameListResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgGetGameListResponse to null");
            }

            this.msgGetGameListResponse = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearMsgGetGameListResponse() {
            this.msgGetGameListResponse = proto.message.GetGameListResponse.getDefaultInstance();
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasMsgGetGameListResponse() {
            return (__bitField0 & 4) == 4;
        }

        public proto.message.JoinGameRequest getMsgJoinGameRequest() {
            return msgJoinGameRequest;
        }

        public Builder setMsgJoinGameRequest(proto.message.JoinGameRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgJoinGameRequest to null");
            }

            this.msgJoinGameRequest = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearMsgJoinGameRequest() {
            this.msgJoinGameRequest = proto.message.JoinGameRequest.getDefaultInstance();
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasMsgJoinGameRequest() {
            return (__bitField0 & 8) == 8;
        }

        public proto.message.JoinGameResponse getMsgJoinGameResponse() {
            return msgJoinGameResponse;
        }

        public Builder setMsgJoinGameResponse(proto.message.JoinGameResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgJoinGameResponse to null");
            }

            this.msgJoinGameResponse = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearMsgJoinGameResponse() {
            this.msgJoinGameResponse = proto.message.JoinGameResponse.getDefaultInstance();
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasMsgJoinGameResponse() {
            return (__bitField0 & 16) == 16;
        }

        public proto.message.JoinRoomRequest getMsgJoinRoomRequest() {
            return msgJoinRoomRequest;
        }

        public Builder setMsgJoinRoomRequest(proto.message.JoinRoomRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgJoinRoomRequest to null");
            }

            this.msgJoinRoomRequest = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearMsgJoinRoomRequest() {
            this.msgJoinRoomRequest = proto.message.JoinRoomRequest.getDefaultInstance();
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasMsgJoinRoomRequest() {
            return (__bitField0 & 32) == 32;
        }

        public proto.message.JoinRoomResponse getMsgJoinRoomResponse() {
            return msgJoinRoomResponse;
        }

        public Builder setMsgJoinRoomResponse(proto.message.JoinRoomResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgJoinRoomResponse to null");
            }

            this.msgJoinRoomResponse = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearMsgJoinRoomResponse() {
            this.msgJoinRoomResponse = proto.message.JoinRoomResponse.getDefaultInstance();
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasMsgJoinRoomResponse() {
            return (__bitField0 & 64) == 64;
        }

        public proto.message.JoinBoardRequest getMsgJoinBoardRequest() {
            return msgJoinBoardRequest;
        }

        public Builder setMsgJoinBoardRequest(proto.message.JoinBoardRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgJoinBoardRequest to null");
            }

            this.msgJoinBoardRequest = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearMsgJoinBoardRequest() {
            this.msgJoinBoardRequest = proto.message.JoinBoardRequest.getDefaultInstance();
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasMsgJoinBoardRequest() {
            return (__bitField0 & 128) == 128;
        }

        public proto.message.JoinBoardResponse getMsgJoinBoardResponse() {
            return msgJoinBoardResponse;
        }

        public Builder setMsgJoinBoardResponse(proto.message.JoinBoardResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgJoinBoardResponse to null");
            }

            this.msgJoinBoardResponse = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearMsgJoinBoardResponse() {
            this.msgJoinBoardResponse = proto.message.JoinBoardResponse.getDefaultInstance();
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasMsgJoinBoardResponse() {
            return (__bitField0 & 256) == 256;
        }

        public proto.message.StartGameResponse getMsgStartGameResponse() {
            return msgStartGameResponse;
        }

        public Builder setMsgStartGameResponse(proto.message.StartGameResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgStartGameResponse to null");
            }

            this.msgStartGameResponse = value;
            __bitField0 |= 512;
            return this;
        }

        public Builder clearMsgStartGameResponse() {
            this.msgStartGameResponse = proto.message.StartGameResponse.getDefaultInstance();
            __bitField0 &= ~512;
            return this;
        }

        public boolean hasMsgStartGameResponse() {
            return (__bitField0 & 512) == 512;
        }

        public proto.message.PlayerReadyRequest getMsgPlayerReadyRequest() {
            return msgPlayerReadyRequest;
        }

        public Builder setMsgPlayerReadyRequest(proto.message.PlayerReadyRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgPlayerReadyRequest to null");
            }

            this.msgPlayerReadyRequest = value;
            __bitField0 |= 1024;
            return this;
        }

        public Builder clearMsgPlayerReadyRequest() {
            this.msgPlayerReadyRequest = proto.message.PlayerReadyRequest.getDefaultInstance();
            __bitField0 &= ~1024;
            return this;
        }

        public boolean hasMsgPlayerReadyRequest() {
            return (__bitField0 & 1024) == 1024;
        }

        public proto.message.PlayerReadyResponse getMsgPlayerReadyResponse() {
            return msgPlayerReadyResponse;
        }

        public Builder setMsgPlayerReadyResponse(proto.message.PlayerReadyResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgPlayerReadyResponse to null");
            }

            this.msgPlayerReadyResponse = value;
            __bitField0 |= 2048;
            return this;
        }

        public Builder clearMsgPlayerReadyResponse() {
            this.msgPlayerReadyResponse = proto.message.PlayerReadyResponse.getDefaultInstance();
            __bitField0 &= ~2048;
            return this;
        }

        public boolean hasMsgPlayerReadyResponse() {
            return (__bitField0 & 2048) == 2048;
        }

        public proto.message.SetBetMoneyRequest getMsgSetBetMoneyRequest() {
            return msgSetBetMoneyRequest;
        }

        public Builder setMsgSetBetMoneyRequest(proto.message.SetBetMoneyRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgSetBetMoneyRequest to null");
            }

            this.msgSetBetMoneyRequest = value;
            __bitField0 |= 4096;
            return this;
        }

        public Builder clearMsgSetBetMoneyRequest() {
            this.msgSetBetMoneyRequest = proto.message.SetBetMoneyRequest.getDefaultInstance();
            __bitField0 &= ~4096;
            return this;
        }

        public boolean hasMsgSetBetMoneyRequest() {
            return (__bitField0 & 4096) == 4096;
        }

        public proto.message.SetBetMoneyResponse getMsgSetBetMoneyResponse() {
            return msgSetBetMoneyResponse;
        }

        public Builder setMsgSetBetMoneyResponse(proto.message.SetBetMoneyResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgSetBetMoneyResponse to null");
            }

            this.msgSetBetMoneyResponse = value;
            __bitField0 |= 8192;
            return this;
        }

        public Builder clearMsgSetBetMoneyResponse() {
            this.msgSetBetMoneyResponse = proto.message.SetBetMoneyResponse.getDefaultInstance();
            __bitField0 &= ~8192;
            return this;
        }

        public boolean hasMsgSetBetMoneyResponse() {
            return (__bitField0 & 8192) == 8192;
        }

        public proto.message.SetMaxPlayerRequest getMsgSetMaxPlayerRequest() {
            return msgSetMaxPlayerRequest;
        }

        public Builder setMsgSetMaxPlayerRequest(proto.message.SetMaxPlayerRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgSetMaxPlayerRequest to null");
            }

            this.msgSetMaxPlayerRequest = value;
            __bitField0 |= 16384;
            return this;
        }

        public Builder clearMsgSetMaxPlayerRequest() {
            this.msgSetMaxPlayerRequest = proto.message.SetMaxPlayerRequest.getDefaultInstance();
            __bitField0 &= ~16384;
            return this;
        }

        public boolean hasMsgSetMaxPlayerRequest() {
            return (__bitField0 & 16384) == 16384;
        }

        public proto.message.SetMaxPlayerResponse getMsgSetMaxPlayerResponse() {
            return msgSetMaxPlayerResponse;
        }

        public Builder setMsgSetMaxPlayerResponse(proto.message.SetMaxPlayerResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgSetMaxPlayerResponse to null");
            }

            this.msgSetMaxPlayerResponse = value;
            __bitField0 |= 32768;
            return this;
        }

        public Builder clearMsgSetMaxPlayerResponse() {
            this.msgSetMaxPlayerResponse = proto.message.SetMaxPlayerResponse.getDefaultInstance();
            __bitField0 &= ~32768;
            return this;
        }

        public boolean hasMsgSetMaxPlayerResponse() {
            return (__bitField0 & 32768) == 32768;
        }

        public proto.message.GetBoardInforResponse getMsgGetBoardInforResponse() {
            return msgGetBoardInforResponse;
        }

        public Builder setMsgGetBoardInforResponse(proto.message.GetBoardInforResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgGetBoardInforResponse to null");
            }

            this.msgGetBoardInforResponse = value;
            __bitField0 |= 65536;
            return this;
        }

        public Builder clearMsgGetBoardInforResponse() {
            this.msgGetBoardInforResponse = proto.message.GetBoardInforResponse.getDefaultInstance();
            __bitField0 &= ~65536;
            return this;
        }

        public boolean hasMsgGetBoardInforResponse() {
            return (__bitField0 & 65536) == 65536;
        }

        public proto.message.GetFishHordeInforResponse getMsgGetFishHordeInforResponse() {
            return msgGetFishHordeInforResponse;
        }

        public Builder setMsgGetFishHordeInforResponse(proto.message.GetFishHordeInforResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgGetFishHordeInforResponse to null");
            }

            this.msgGetFishHordeInforResponse = value;
            __bitField0 |= 131072;
            return this;
        }

        public Builder clearMsgGetFishHordeInforResponse() {
            this.msgGetFishHordeInforResponse = proto.message.GetFishHordeInforResponse.getDefaultInstance();
            __bitField0 &= ~131072;
            return this;
        }

        public boolean hasMsgGetFishHordeInforResponse() {
            return (__bitField0 & 131072) == 131072;
        }

        public proto.message.FireRequest getMsgFireRequest() {
            return msgFireRequest;
        }

        public Builder setMsgFireRequest(proto.message.FireRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgFireRequest to null");
            }

            this.msgFireRequest = value;
            __bitField0 |= 262144;
            return this;
        }

        public Builder clearMsgFireRequest() {
            this.msgFireRequest = proto.message.FireRequest.getDefaultInstance();
            __bitField0 &= ~262144;
            return this;
        }

        public boolean hasMsgFireRequest() {
            return (__bitField0 & 262144) == 262144;
        }

        public proto.message.FireResponse getMsgFireResponse() {
            return msgFireResponse;
        }

        public Builder setMsgFireResponse(proto.message.FireResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgFireResponse to null");
            }

            this.msgFireResponse = value;
            __bitField0 |= 524288;
            return this;
        }

        public Builder clearMsgFireResponse() {
            this.msgFireResponse = proto.message.FireResponse.getDefaultInstance();
            __bitField0 &= ~524288;
            return this;
        }

        public boolean hasMsgFireResponse() {
            return (__bitField0 & 524288) == 524288;
        }

        public proto.message.LeaveBoardRequest getMsgLeaveBoardRequest() {
            return msgLeaveBoardRequest;
        }

        public Builder setMsgLeaveBoardRequest(proto.message.LeaveBoardRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgLeaveBoardRequest to null");
            }

            this.msgLeaveBoardRequest = value;
            __bitField0 |= 1048576;
            return this;
        }

        public Builder clearMsgLeaveBoardRequest() {
            this.msgLeaveBoardRequest = proto.message.LeaveBoardRequest.getDefaultInstance();
            __bitField0 &= ~1048576;
            return this;
        }

        public boolean hasMsgLeaveBoardRequest() {
            return (__bitField0 & 1048576) == 1048576;
        }

        public proto.message.LeaveBoardResponse getMsgLeaveBoardResponse() {
            return msgLeaveBoardResponse;
        }

        public Builder setMsgLeaveBoardResponse(proto.message.LeaveBoardResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgLeaveBoardResponse to null");
            }

            this.msgLeaveBoardResponse = value;
            __bitField0 |= 2097152;
            return this;
        }

        public Builder clearMsgLeaveBoardResponse() {
            this.msgLeaveBoardResponse = proto.message.LeaveBoardResponse.getDefaultInstance();
            __bitField0 &= ~2097152;
            return this;
        }

        public boolean hasMsgLeaveBoardResponse() {
            return (__bitField0 & 2097152) == 2097152;
        }

        public proto.message.ChangeOwnerResponse getMsgChangeOwnerResponse() {
            return msgChangeOwnerResponse;
        }

        public Builder setMsgChangeOwnerResponse(proto.message.ChangeOwnerResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgChangeOwnerResponse to null");
            }

            this.msgChangeOwnerResponse = value;
            __bitField0 |= 4194304;
            return this;
        }

        public Builder clearMsgChangeOwnerResponse() {
            this.msgChangeOwnerResponse = proto.message.ChangeOwnerResponse.getDefaultInstance();
            __bitField0 &= ~4194304;
            return this;
        }

        public boolean hasMsgChangeOwnerResponse() {
            return (__bitField0 & 4194304) == 4194304;
        }

        public proto.message.PlayerLeaveBoard getMsgPlayerLeaveBoard() {
            return msgPlayerLeaveBoard;
        }

        public Builder setMsgPlayerLeaveBoard(proto.message.PlayerLeaveBoard value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgPlayerLeaveBoard to null");
            }

            this.msgPlayerLeaveBoard = value;
            __bitField0 |= 8388608;
            return this;
        }

        public Builder clearMsgPlayerLeaveBoard() {
            this.msgPlayerLeaveBoard = proto.message.PlayerLeaveBoard.getDefaultInstance();
            __bitField0 &= ~8388608;
            return this;
        }

        public boolean hasMsgPlayerLeaveBoard() {
            return (__bitField0 & 8388608) == 8388608;
        }

        public proto.message.LeaveRoomResponse getMsgLeaveRoomResponse() {
            return msgLeaveRoomResponse;
        }

        public Builder setMsgLeaveRoomResponse(proto.message.LeaveRoomResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgLeaveRoomResponse to null");
            }

            this.msgLeaveRoomResponse = value;
            __bitField0 |= 16777216;
            return this;
        }

        public Builder clearMsgLeaveRoomResponse() {
            this.msgLeaveRoomResponse = proto.message.LeaveRoomResponse.getDefaultInstance();
            __bitField0 &= ~16777216;
            return this;
        }

        public boolean hasMsgLeaveRoomResponse() {
            return (__bitField0 & 16777216) == 16777216;
        }

        public proto.message.LeaveGameResponse getMsgLeaveGameResponse() {
            return msgLeaveGameResponse;
        }

        public Builder setMsgLeaveGameResponse(proto.message.LeaveGameResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgLeaveGameResponse to null");
            }

            this.msgLeaveGameResponse = value;
            __bitField0 |= 33554432;
            return this;
        }

        public Builder clearMsgLeaveGameResponse() {
            this.msgLeaveGameResponse = proto.message.LeaveGameResponse.getDefaultInstance();
            __bitField0 &= ~33554432;
            return this;
        }

        public boolean hasMsgLeaveGameResponse() {
            return (__bitField0 & 33554432) == 33554432;
        }

        public proto.message.OpenFireRequest getMsgOpenFireRequest() {
            return msgOpenFireRequest;
        }

        public Builder setMsgOpenFireRequest(proto.message.OpenFireRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgOpenFireRequest to null");
            }

            this.msgOpenFireRequest = value;
            __bitField0 |= 67108864;
            return this;
        }

        public Builder clearMsgOpenFireRequest() {
            this.msgOpenFireRequest = proto.message.OpenFireRequest.getDefaultInstance();
            __bitField0 &= ~67108864;
            return this;
        }

        public boolean hasMsgOpenFireRequest() {
            return (__bitField0 & 67108864) == 67108864;
        }

        public proto.message.OutOfAmmoResponse getMsgOutOfAmmoResponse() {
            return msgOutOfAmmoResponse;
        }

        public Builder setMsgOutOfAmmoResponse(proto.message.OutOfAmmoResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgOutOfAmmoResponse to null");
            }

            this.msgOutOfAmmoResponse = value;
            __bitField0 |= 134217728;
            return this;
        }

        public Builder clearMsgOutOfAmmoResponse() {
            this.msgOutOfAmmoResponse = proto.message.OutOfAmmoResponse.getDefaultInstance();
            __bitField0 &= ~134217728;
            return this;
        }

        public boolean hasMsgOutOfAmmoResponse() {
            return (__bitField0 & 134217728) == 134217728;
        }

        public proto.message.OpenFireResponse getMsgOpenFireResponse() {
            return msgOpenFireResponse;
        }

        public Builder setMsgOpenFireResponse(proto.message.OpenFireResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgOpenFireResponse to null");
            }

            this.msgOpenFireResponse = value;
            __bitField0 |= 268435456;
            return this;
        }

        public Builder clearMsgOpenFireResponse() {
            this.msgOpenFireResponse = proto.message.OpenFireResponse.getDefaultInstance();
            __bitField0 &= ~268435456;
            return this;
        }

        public boolean hasMsgOpenFireResponse() {
            return (__bitField0 & 268435456) == 268435456;
        }

        public proto.message.FinishGameRequest getMsgFinishGameRequest() {
            return msgFinishGameRequest;
        }

        public Builder setMsgFinishGameRequest(proto.message.FinishGameRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgFinishGameRequest to null");
            }

            this.msgFinishGameRequest = value;
            __bitField0 |= 536870912;
            return this;
        }

        public Builder clearMsgFinishGameRequest() {
            this.msgFinishGameRequest = proto.message.FinishGameRequest.getDefaultInstance();
            __bitField0 &= ~536870912;
            return this;
        }

        public boolean hasMsgFinishGameRequest() {
            return (__bitField0 & 536870912) == 536870912;
        }

        public proto.message.FinishGameResponse getMsgFinishGameResponse() {
            return msgFinishGameResponse;
        }

        public Builder setMsgFinishGameResponse(proto.message.FinishGameResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgFinishGameResponse to null");
            }

            this.msgFinishGameResponse = value;
            __bitField0 |= 1073741824;
            return this;
        }

        public Builder clearMsgFinishGameResponse() {
            this.msgFinishGameResponse = proto.message.FinishGameResponse.getDefaultInstance();
            __bitField0 &= ~1073741824;
            return this;
        }

        public boolean hasMsgFinishGameResponse() {
            return (__bitField0 & 1073741824) == 1073741824;
        }

        public proto.message.ChatRequest getMsgChatRequest() {
            return msgChatRequest;
        }

        public Builder setMsgChatRequest(proto.message.ChatRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgChatRequest to null");
            }

            this.msgChatRequest = value;
            __bitField0 |= -2147483648;
            return this;
        }

        public Builder clearMsgChatRequest() {
            this.msgChatRequest = proto.message.ChatRequest.getDefaultInstance();
            __bitField0 &= ~-2147483648;
            return this;
        }

        public boolean hasMsgChatRequest() {
            return (__bitField0 & -2147483648) == -2147483648;
        }

        public proto.message.ChatResponse getMsgChatResponse() {
            return msgChatResponse;
        }

        public Builder setMsgChatResponse(proto.message.ChatResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgChatResponse to null");
            }

            this.msgChatResponse = value;
            __bitField1 |= 1;
            return this;
        }

        public Builder clearMsgChatResponse() {
            this.msgChatResponse = proto.message.ChatResponse.getDefaultInstance();
            __bitField1 &= ~1;
            return this;
        }

        public boolean hasMsgChatResponse() {
            return (__bitField1 & 1) == 1;
        }

        public proto.message.DonateMoneyResponse getMsgDonateMoneyResponse() {
            return msgDonateMoneyResponse;
        }

        public Builder setMsgDonateMoneyResponse(proto.message.DonateMoneyResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgDonateMoneyResponse to null");
            }

            this.msgDonateMoneyResponse = value;
            __bitField1 |= 2;
            return this;
        }

        public Builder clearMsgDonateMoneyResponse() {
            this.msgDonateMoneyResponse = proto.message.DonateMoneyResponse.getDefaultInstance();
            __bitField1 &= ~2;
            return this;
        }

        public boolean hasMsgDonateMoneyResponse() {
            return (__bitField1 & 2) == 2;
        }

        public proto.message.GetBoardInforRequest getMsgGetBoarInforRequest() {
            return msgGetBoarInforRequest;
        }

        public Builder setMsgGetBoarInforRequest(proto.message.GetBoardInforRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgGetBoarInforRequest to null");
            }

            this.msgGetBoarInforRequest = value;
            __bitField1 |= 4;
            return this;
        }

        public Builder clearMsgGetBoarInforRequest() {
            this.msgGetBoarInforRequest = proto.message.GetBoardInforRequest.getDefaultInstance();
            __bitField1 &= ~4;
            return this;
        }

        public boolean hasMsgGetBoarInforRequest() {
            return (__bitField1 & 4) == 4;
        }

        public proto.message.UserLevelUpResponse getMsgUserLevelUpResponse() {
            return msgUserLevelUpResponse;
        }

        public Builder setMsgUserLevelUpResponse(proto.message.UserLevelUpResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgUserLevelUpResponse to null");
            }

            this.msgUserLevelUpResponse = value;
            __bitField1 |= 8;
            return this;
        }

        public Builder clearMsgUserLevelUpResponse() {
            this.msgUserLevelUpResponse = proto.message.UserLevelUpResponse.getDefaultInstance();
            __bitField1 &= ~8;
            return this;
        }

        public boolean hasMsgUserLevelUpResponse() {
            return (__bitField1 & 8) == 8;
        }

        public proto.message.GunChangeRequest getMsgGunChangeRequest() {
            return msgGunChangeRequest;
        }

        public Builder setMsgGunChangeRequest(proto.message.GunChangeRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgGunChangeRequest to null");
            }

            this.msgGunChangeRequest = value;
            __bitField1 |= 16;
            return this;
        }

        public Builder clearMsgGunChangeRequest() {
            this.msgGunChangeRequest = proto.message.GunChangeRequest.getDefaultInstance();
            __bitField1 &= ~16;
            return this;
        }

        public boolean hasMsgGunChangeRequest() {
            return (__bitField1 & 16) == 16;
        }

        public proto.message.GunChangeResponse getMsgGunChangeResponse() {
            return msgGunChangeResponse;
        }

        public Builder setMsgGunChangeResponse(proto.message.GunChangeResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgGunChangeResponse to null");
            }

            this.msgGunChangeResponse = value;
            __bitField1 |= 32;
            return this;
        }

        public Builder clearMsgGunChangeResponse() {
            this.msgGunChangeResponse = proto.message.GunChangeResponse.getDefaultInstance();
            __bitField1 &= ~32;
            return this;
        }

        public boolean hasMsgGunChangeResponse() {
            return (__bitField1 & 32) == 32;
        }

        public proto.message.BossKillResponse getMsgBossKillResponse() {
            return msgBossKillResponse;
        }

        public Builder setMsgBossKillResponse(proto.message.BossKillResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgBossKillResponse to null");
            }

            this.msgBossKillResponse = value;
            __bitField1 |= 64;
            return this;
        }

        public Builder clearMsgBossKillResponse() {
            this.msgBossKillResponse = proto.message.BossKillResponse.getDefaultInstance();
            __bitField1 &= ~64;
            return this;
        }

        public boolean hasMsgBossKillResponse() {
            return (__bitField1 & 64) == 64;
        }

        public proto.message.GetRoomListRequest getMsgGetRoomListRequest() {
            return msgGetRoomListRequest;
        }

        public Builder setMsgGetRoomListRequest(proto.message.GetRoomListRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgGetRoomListRequest to null");
            }

            this.msgGetRoomListRequest = value;
            __bitField1 |= 128;
            return this;
        }

        public Builder clearMsgGetRoomListRequest() {
            this.msgGetRoomListRequest = proto.message.GetRoomListRequest.getDefaultInstance();
            __bitField1 &= ~128;
            return this;
        }

        public boolean hasMsgGetRoomListRequest() {
            return (__bitField1 & 128) == 128;
        }

        public proto.message.GetRoomListResponse getMsgGetRoomListResponse() {
            return msgGetRoomListResponse;
        }

        public Builder setMsgGetRoomListResponse(proto.message.GetRoomListResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgGetRoomListResponse to null");
            }

            this.msgGetRoomListResponse = value;
            __bitField1 |= 256;
            return this;
        }

        public Builder clearMsgGetRoomListResponse() {
            this.msgGetRoomListResponse = proto.message.GetRoomListResponse.getDefaultInstance();
            __bitField1 &= ~256;
            return this;
        }

        public boolean hasMsgGetRoomListResponse() {
            return (__bitField1 & 256) == 256;
        }

        public proto.message.GetBoardListRequest getMsgGetBoardListRequest() {
            return msgGetBoardListRequest;
        }

        public Builder setMsgGetBoardListRequest(proto.message.GetBoardListRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgGetBoardListRequest to null");
            }

            this.msgGetBoardListRequest = value;
            __bitField1 |= 512;
            return this;
        }

        public Builder clearMsgGetBoardListRequest() {
            this.msgGetBoardListRequest = proto.message.GetBoardListRequest.getDefaultInstance();
            __bitField1 &= ~512;
            return this;
        }

        public boolean hasMsgGetBoardListRequest() {
            return (__bitField1 & 512) == 512;
        }

        public proto.message.GetBoardListResponse getMsgGetBoardListResponse() {
            return msgGetBoardListResponse;
        }

        public Builder setMsgGetBoardListResponse(proto.message.GetBoardListResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgGetBoardListResponse to null");
            }

            this.msgGetBoardListResponse = value;
            __bitField1 |= 1024;
            return this;
        }

        public Builder clearMsgGetBoardListResponse() {
            this.msgGetBoardListResponse = proto.message.GetBoardListResponse.getDefaultInstance();
            __bitField1 &= ~1024;
            return this;
        }

        public boolean hasMsgGetBoardListResponse() {
            return (__bitField1 & 1024) == 1024;
        }

        public proto.message.ChatEmoRequest getMsgChatEmoRequest() {
            return msgChatEmoRequest;
        }

        public Builder setMsgChatEmoRequest(proto.message.ChatEmoRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgChatEmoRequest to null");
            }

            this.msgChatEmoRequest = value;
            __bitField1 |= 2048;
            return this;
        }

        public Builder clearMsgChatEmoRequest() {
            this.msgChatEmoRequest = proto.message.ChatEmoRequest.getDefaultInstance();
            __bitField1 &= ~2048;
            return this;
        }

        public boolean hasMsgChatEmoRequest() {
            return (__bitField1 & 2048) == 2048;
        }

        public proto.message.ChatEmoResponse getMsgChatEmoResponse() {
            return msgChatEmoResponse;
        }

        public Builder setMsgChatEmoResponse(proto.message.ChatEmoResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgChatEmoResponse to null");
            }

            this.msgChatEmoResponse = value;
            __bitField1 |= 4096;
            return this;
        }

        public Builder clearMsgChatEmoResponse() {
            this.msgChatEmoResponse = proto.message.ChatEmoResponse.getDefaultInstance();
            __bitField1 &= ~4096;
            return this;
        }

        public boolean hasMsgChatEmoResponse() {
            return (__bitField1 & 4096) == 4096;
        }

        public proto.message.BetMakeConfirmRequest getMsgBetMakeConfirmRequest() {
            return msgBetMakeConfirmRequest;
        }

        public Builder setMsgBetMakeConfirmRequest(proto.message.BetMakeConfirmRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgBetMakeConfirmRequest to null");
            }

            this.msgBetMakeConfirmRequest = value;
            __bitField1 |= 8192;
            return this;
        }

        public Builder clearMsgBetMakeConfirmRequest() {
            this.msgBetMakeConfirmRequest = proto.message.BetMakeConfirmRequest.getDefaultInstance();
            __bitField1 &= ~8192;
            return this;
        }

        public boolean hasMsgBetMakeConfirmRequest() {
            return (__bitField1 & 8192) == 8192;
        }

        public proto.message.BetMakeConfirmResponse getMsgBetMakeConfirmResponse() {
            return msgBetMakeConfirmResponse;
        }

        public Builder setMsgBetMakeConfirmResponse(proto.message.BetMakeConfirmResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgBetMakeConfirmResponse to null");
            }

            this.msgBetMakeConfirmResponse = value;
            __bitField1 |= 16384;
            return this;
        }

        public Builder clearMsgBetMakeConfirmResponse() {
            this.msgBetMakeConfirmResponse = proto.message.BetMakeConfirmResponse.getDefaultInstance();
            __bitField1 &= ~16384;
            return this;
        }

        public boolean hasMsgBetMakeConfirmResponse() {
            return (__bitField1 & 16384) == 16384;
        }

        public proto.message.SoloRequest getMsgSoloRequest() {
            return msgSoloRequest;
        }

        public Builder setMsgSoloRequest(proto.message.SoloRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgSoloRequest to null");
            }

            this.msgSoloRequest = value;
            __bitField1 |= 32768;
            return this;
        }

        public Builder clearMsgSoloRequest() {
            this.msgSoloRequest = proto.message.SoloRequest.getDefaultInstance();
            __bitField1 &= ~32768;
            return this;
        }

        public boolean hasMsgSoloRequest() {
            return (__bitField1 & 32768) == 32768;
        }

        public proto.message.SoloResponse getMsgSoloResponse() {
            return msgSoloResponse;
        }

        public Builder setMsgSoloResponse(proto.message.SoloResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgSoloResponse to null");
            }

            this.msgSoloResponse = value;
            __bitField1 |= 65536;
            return this;
        }

        public Builder clearMsgSoloResponse() {
            this.msgSoloResponse = proto.message.SoloResponse.getDefaultInstance();
            __bitField1 &= ~65536;
            return this;
        }

        public boolean hasMsgSoloResponse() {
            return (__bitField1 & 65536) == 65536;
        }

        public proto.message.UseItemResquest getMsgUseItemRequest() {
            return msgUseItemRequest;
        }

        public Builder setMsgUseItemRequest(proto.message.UseItemResquest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgUseItemRequest to null");
            }

            this.msgUseItemRequest = value;
            __bitField1 |= 131072;
            return this;
        }

        public Builder clearMsgUseItemRequest() {
            this.msgUseItemRequest = proto.message.UseItemResquest.getDefaultInstance();
            __bitField1 &= ~131072;
            return this;
        }

        public boolean hasMsgUseItemRequest() {
            return (__bitField1 & 131072) == 131072;
        }

        public proto.message.UseItemResponse getMsgUseItemResponse() {
            return msgUseItemResponse;
        }

        public Builder setMsgUseItemResponse(proto.message.UseItemResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgUseItemResponse to null");
            }

            this.msgUseItemResponse = value;
            __bitField1 |= 262144;
            return this;
        }

        public Builder clearMsgUseItemResponse() {
            this.msgUseItemResponse = proto.message.UseItemResponse.getDefaultInstance();
            __bitField1 &= ~262144;
            return this;
        }

        public boolean hasMsgUseItemResponse() {
            return (__bitField1 & 262144) == 262144;
        }

        public proto.message.SoloConfirm getMsgSoloConfirm() {
            return msgSoloConfirm;
        }

        public Builder setMsgSoloConfirm(proto.message.SoloConfirm value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgSoloConfirm to null");
            }

            this.msgSoloConfirm = value;
            __bitField1 |= 524288;
            return this;
        }

        public Builder clearMsgSoloConfirm() {
            this.msgSoloConfirm = proto.message.SoloConfirm.getDefaultInstance();
            __bitField1 &= ~524288;
            return this;
        }

        public boolean hasMsgSoloConfirm() {
            return (__bitField1 & 524288) == 524288;
        }

        public proto.message.ReviveBoardRequest getMsgReviveBoardRequest() {
            return msgReviveBoardRequest;
        }

        public Builder setMsgReviveBoardRequest(proto.message.ReviveBoardRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgReviveBoardRequest to null");
            }

            this.msgReviveBoardRequest = value;
            __bitField1 |= 1048576;
            return this;
        }

        public Builder clearMsgReviveBoardRequest() {
            this.msgReviveBoardRequest = proto.message.ReviveBoardRequest.getDefaultInstance();
            __bitField1 &= ~1048576;
            return this;
        }

        public boolean hasMsgReviveBoardRequest() {
            return (__bitField1 & 1048576) == 1048576;
        }

        public proto.message.ReviveBoardResponse getMsgReviveBoardResponse() {
            return msgReviveBoardResponse;
        }

        public Builder setMsgReviveBoardResponse(proto.message.ReviveBoardResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgReviveBoardResponse to null");
            }

            this.msgReviveBoardResponse = value;
            __bitField1 |= 2097152;
            return this;
        }

        public Builder clearMsgReviveBoardResponse() {
            this.msgReviveBoardResponse = proto.message.ReviveBoardResponse.getDefaultInstance();
            __bitField1 &= ~2097152;
            return this;
        }

        public boolean hasMsgReviveBoardResponse() {
            return (__bitField1 & 2097152) == 2097152;
        }

        public proto.message.ReviveBoardInfoResponse getMsgReviveBoardInfoResponse() {
            return msgReviveBoardInfoResponse;
        }

        public Builder setMsgReviveBoardInfoResponse(proto.message.ReviveBoardInfoResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgReviveBoardInfoResponse to null");
            }

            this.msgReviveBoardInfoResponse = value;
            __bitField1 |= 4194304;
            return this;
        }

        public Builder clearMsgReviveBoardInfoResponse() {
            this.msgReviveBoardInfoResponse = proto.message.ReviveBoardInfoResponse.getDefaultInstance();
            __bitField1 &= ~4194304;
            return this;
        }

        public boolean hasMsgReviveBoardInfoResponse() {
            return (__bitField1 & 4194304) == 4194304;
        }

        public proto.message.RoomMoneyListRequest getMsgRoomMoneyListRequest() {
            return msgRoomMoneyListRequest;
        }

        public Builder setMsgRoomMoneyListRequest(proto.message.RoomMoneyListRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgRoomMoneyListRequest to null");
            }

            this.msgRoomMoneyListRequest = value;
            __bitField1 |= 8388608;
            return this;
        }

        public Builder clearMsgRoomMoneyListRequest() {
            this.msgRoomMoneyListRequest = proto.message.RoomMoneyListRequest.getDefaultInstance();
            __bitField1 &= ~8388608;
            return this;
        }

        public boolean hasMsgRoomMoneyListRequest() {
            return (__bitField1 & 8388608) == 8388608;
        }

        public proto.message.RoomMoneyListResponse getMsgRoomMoneyListResponse() {
            return msgRoomMoneyListResponse;
        }

        public Builder setMsgRoomMoneyListResponse(proto.message.RoomMoneyListResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgRoomMoneyListResponse to null");
            }

            this.msgRoomMoneyListResponse = value;
            __bitField1 |= 16777216;
            return this;
        }

        public Builder clearMsgRoomMoneyListResponse() {
            this.msgRoomMoneyListResponse = proto.message.RoomMoneyListResponse.getDefaultInstance();
            __bitField1 &= ~16777216;
            return this;
        }

        public boolean hasMsgRoomMoneyListResponse() {
            return (__bitField1 & 16777216) == 16777216;
        }

        public proto.message.IngameAvailableCannonsList getMsgIngameAvailableCannonsList() {
            return msgIngameAvailableCannonsList;
        }

        public Builder setMsgIngameAvailableCannonsList(proto.message.IngameAvailableCannonsList value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgIngameAvailableCannonsList to null");
            }

            this.msgIngameAvailableCannonsList = value;
            __bitField1 |= 33554432;
            return this;
        }

        public Builder clearMsgIngameAvailableCannonsList() {
            this.msgIngameAvailableCannonsList = proto.message.IngameAvailableCannonsList.getDefaultInstance();
            __bitField1 &= ~33554432;
            return this;
        }

        public boolean hasMsgIngameAvailableCannonsList() {
            return (__bitField1 & 33554432) == 33554432;
        }

        public proto.message.IngameCreateBoardRequest getMsgIngameCreateBoardRequest() {
            return msgIngameCreateBoardRequest;
        }

        public Builder setMsgIngameCreateBoardRequest(proto.message.IngameCreateBoardRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgIngameCreateBoardRequest to null");
            }

            this.msgIngameCreateBoardRequest = value;
            __bitField1 |= 67108864;
            return this;
        }

        public Builder clearMsgIngameCreateBoardRequest() {
            this.msgIngameCreateBoardRequest = proto.message.IngameCreateBoardRequest.getDefaultInstance();
            __bitField1 &= ~67108864;
            return this;
        }

        public boolean hasMsgIngameCreateBoardRequest() {
            return (__bitField1 & 67108864) == 67108864;
        }

        public proto.message.IngameCreateBoardResponse getMsgIngameCreateBoardResponse() {
            return msgIngameCreateBoardResponse;
        }

        public Builder setMsgIngameCreateBoardResponse(proto.message.IngameCreateBoardResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgIngameCreateBoardResponse to null");
            }

            this.msgIngameCreateBoardResponse = value;
            __bitField1 |= 134217728;
            return this;
        }

        public Builder clearMsgIngameCreateBoardResponse() {
            this.msgIngameCreateBoardResponse = proto.message.IngameCreateBoardResponse.getDefaultInstance();
            __bitField1 &= ~134217728;
            return this;
        }

        public boolean hasMsgIngameCreateBoardResponse() {
            return (__bitField1 & 134217728) == 134217728;
        }

        public long getClienttime() {
            return clienttime;
        }

        public Builder setClienttime(long value) {
            this.clienttime = value;
            __bitField1 |= 268435456;
            return this;
        }

        public Builder clearClienttime() {
            this.clienttime = 0L;
            __bitField1 &= ~268435456;
            return this;
        }

        public boolean hasClienttime() {
            return (__bitField1 & 268435456) == 268435456;
        }

        public proto.message.IngameNetworkTime getMsgIngameNetworkTime() {
            return msgIngameNetworkTime;
        }

        public Builder setMsgIngameNetworkTime(proto.message.IngameNetworkTime value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgIngameNetworkTime to null");
            }

            this.msgIngameNetworkTime = value;
            __bitField1 |= 536870912;
            return this;
        }

        public Builder clearMsgIngameNetworkTime() {
            this.msgIngameNetworkTime = proto.message.IngameNetworkTime.getDefaultInstance();
            __bitField1 &= ~536870912;
            return this;
        }

        public boolean hasMsgIngameNetworkTime() {
            return (__bitField1 & 536870912) == 536870912;
        }

        public proto.message.AccumulationResponse getMsgAccumulationResponse() {
            return msgAccumulationResponse;
        }

        public Builder setMsgAccumulationResponse(proto.message.AccumulationResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgAccumulationResponse to null");
            }

            this.msgAccumulationResponse = value;
            __bitField1 |= 1073741824;
            return this;
        }

        public Builder clearMsgAccumulationResponse() {
            this.msgAccumulationResponse = proto.message.AccumulationResponse.getDefaultInstance();
            __bitField1 &= ~1073741824;
            return this;
        }

        public boolean hasMsgAccumulationResponse() {
            return (__bitField1 & 1073741824) == 1073741824;
        }

        public proto.message.OpenBombRequest getMsgOpenBombRequest() {
            return msgOpenBombRequest;
        }

        public Builder setMsgOpenBombRequest(proto.message.OpenBombRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgOpenBombRequest to null");
            }

            this.msgOpenBombRequest = value;
            __bitField1 |= -2147483648;
            return this;
        }

        public Builder clearMsgOpenBombRequest() {
            this.msgOpenBombRequest = proto.message.OpenBombRequest.getDefaultInstance();
            __bitField1 &= ~-2147483648;
            return this;
        }

        public boolean hasMsgOpenBombRequest() {
            return (__bitField1 & -2147483648) == -2147483648;
        }

        public proto.message.OpenBombResponse getMsgOpenBombResponse() {
            return msgOpenBombResponse;
        }

        public Builder setMsgOpenBombResponse(proto.message.OpenBombResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgOpenBombResponse to null");
            }

            this.msgOpenBombResponse = value;
            __bitField2 |= 1;
            return this;
        }

        public Builder clearMsgOpenBombResponse() {
            this.msgOpenBombResponse = proto.message.OpenBombResponse.getDefaultInstance();
            __bitField2 &= ~1;
            return this;
        }

        public boolean hasMsgOpenBombResponse() {
            return (__bitField2 & 1) == 1;
        }

        public proto.message.BombExplodeResponse getMsgBombExplodeResponse() {
            return msgBombExplodeResponse;
        }

        public Builder setMsgBombExplodeResponse(proto.message.BombExplodeResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgBombExplodeResponse to null");
            }

            this.msgBombExplodeResponse = value;
            __bitField2 |= 2;
            return this;
        }

        public Builder clearMsgBombExplodeResponse() {
            this.msgBombExplodeResponse = proto.message.BombExplodeResponse.getDefaultInstance();
            __bitField2 &= ~2;
            return this;
        }

        public boolean hasMsgBombExplodeResponse() {
            return (__bitField2 & 2) == 2;
        }

        public proto.message.UdpEstablishRequest getMsgUdpEstablishRequest() {
            return msgUdpEstablishRequest;
        }

        public Builder setMsgUdpEstablishRequest(proto.message.UdpEstablishRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgUdpEstablishRequest to null");
            }

            this.msgUdpEstablishRequest = value;
            __bitField2 |= 4;
            return this;
        }

        public Builder clearMsgUdpEstablishRequest() {
            this.msgUdpEstablishRequest = proto.message.UdpEstablishRequest.getDefaultInstance();
            __bitField2 &= ~4;
            return this;
        }

        public boolean hasMsgUdpEstablishRequest() {
            return (__bitField2 & 4) == 4;
        }

        public proto.message.UdpEstablishResponse getMsgUdpEstablishResponse() {
            return msgUdpEstablishResponse;
        }

        public Builder setMsgUdpEstablishResponse(proto.message.UdpEstablishResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgUdpEstablishResponse to null");
            }

            this.msgUdpEstablishResponse = value;
            __bitField2 |= 8;
            return this;
        }

        public Builder clearMsgUdpEstablishResponse() {
            this.msgUdpEstablishResponse = proto.message.UdpEstablishResponse.getDefaultInstance();
            __bitField2 &= ~8;
            return this;
        }

        public boolean hasMsgUdpEstablishResponse() {
            return (__bitField2 & 8) == 8;
        }

        public long getUDPInboundSeq() {
            return uDPInboundSeq;
        }

        public Builder setUDPInboundSeq(long value) {
            this.uDPInboundSeq = value;
            __bitField2 |= 16;
            return this;
        }

        public Builder clearUDPInboundSeq() {
            this.uDPInboundSeq = 0L;
            __bitField2 &= ~16;
            return this;
        }

        public boolean hasUDPInboundSeq() {
            return (__bitField2 & 16) == 16;
        }

        public int getUdpHashCode() {
            return udpHashCode;
        }

        public Builder setUdpHashCode(int value) {
            this.udpHashCode = value;
            __bitField2 |= 32;
            return this;
        }

        public Builder clearUdpHashCode() {
            this.udpHashCode = 0;
            __bitField2 &= ~32;
            return this;
        }

        public boolean hasUdpHashCode() {
            return (__bitField2 & 32) == 32;
        }

        public proto.message.IngameSkillResponse getMsgIngameSkillResponse() {
            return msgIngameSkillResponse;
        }

        public Builder setMsgIngameSkillResponse(proto.message.IngameSkillResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgIngameSkillResponse to null");
            }

            this.msgIngameSkillResponse = value;
            __bitField2 |= 64;
            return this;
        }

        public Builder clearMsgIngameSkillResponse() {
            this.msgIngameSkillResponse = proto.message.IngameSkillResponse.getDefaultInstance();
            __bitField2 &= ~64;
            return this;
        }

        public boolean hasMsgIngameSkillResponse() {
            return (__bitField2 & 64) == 64;
        }

        public proto.message.IngamePetRampagePreSkillResponse getMsgIngamePetRampagePreSkillResponse() {
            return msgIngamePetRampagePreSkillResponse;
        }

        public Builder setMsgIngamePetRampagePreSkillResponse(proto.message.IngamePetRampagePreSkillResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgIngamePetRampagePreSkillResponse to null");
            }

            this.msgIngamePetRampagePreSkillResponse = value;
            __bitField2 |= 128;
            return this;
        }

        public Builder clearMsgIngamePetRampagePreSkillResponse() {
            this.msgIngamePetRampagePreSkillResponse = proto.message.IngamePetRampagePreSkillResponse.getDefaultInstance();
            __bitField2 &= ~128;
            return this;
        }

        public boolean hasMsgIngamePetRampagePreSkillResponse() {
            return (__bitField2 & 128) == 128;
        }

        public proto.message.IngamePetRampageBeginSkillResponse getMsgIngamePetRampageBeginSkillResponse() {
            return msgIngamePetRampageBeginSkillResponse;
        }

        public Builder setMsgIngamePetRampageBeginSkillResponse(proto.message.IngamePetRampageBeginSkillResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgIngamePetRampageBeginSkillResponse to null");
            }

            this.msgIngamePetRampageBeginSkillResponse = value;
            __bitField2 |= 256;
            return this;
        }

        public Builder clearMsgIngamePetRampageBeginSkillResponse() {
            this.msgIngamePetRampageBeginSkillResponse = proto.message.IngamePetRampageBeginSkillResponse.getDefaultInstance();
            __bitField2 &= ~256;
            return this;
        }

        public boolean hasMsgIngamePetRampageBeginSkillResponse() {
            return (__bitField2 & 256) == 256;
        }

        public proto.message.IngamePetRampageInSkillResponse getMsgIngamePetRampageInSkillResponse() {
            return msgIngamePetRampageInSkillResponse;
        }

        public Builder setMsgIngamePetRampageInSkillResponse(proto.message.IngamePetRampageInSkillResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgIngamePetRampageInSkillResponse to null");
            }

            this.msgIngamePetRampageInSkillResponse = value;
            __bitField2 |= 512;
            return this;
        }

        public Builder clearMsgIngamePetRampageInSkillResponse() {
            this.msgIngamePetRampageInSkillResponse = proto.message.IngamePetRampageInSkillResponse.getDefaultInstance();
            __bitField2 &= ~512;
            return this;
        }

        public boolean hasMsgIngamePetRampageInSkillResponse() {
            return (__bitField2 & 512) == 512;
        }

        public proto.message.IngamePetRampageEndSkillResponse getMsgIngamePetRampageEndSkillResponse() {
            return msgIngamePetRampageEndSkillResponse;
        }

        public Builder setMsgIngamePetRampageEndSkillResponse(proto.message.IngamePetRampageEndSkillResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgIngamePetRampageEndSkillResponse to null");
            }

            this.msgIngamePetRampageEndSkillResponse = value;
            __bitField2 |= 1024;
            return this;
        }

        public Builder clearMsgIngamePetRampageEndSkillResponse() {
            this.msgIngamePetRampageEndSkillResponse = proto.message.IngamePetRampageEndSkillResponse.getDefaultInstance();
            __bitField2 &= ~1024;
            return this;
        }

        public boolean hasMsgIngamePetRampageEndSkillResponse() {
            return (__bitField2 & 1024) == 1024;
        }

        public proto.message.IngamePetRampageSkillBulletRequest getMsgIngamePetRampageSkillBulletRequest() {
            return msgIngamePetRampageSkillBulletRequest;
        }

        public Builder setMsgIngamePetRampageSkillBulletRequest(proto.message.IngamePetRampageSkillBulletRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgIngamePetRampageSkillBulletRequest to null");
            }

            this.msgIngamePetRampageSkillBulletRequest = value;
            __bitField2 |= 2048;
            return this;
        }

        public Builder clearMsgIngamePetRampageSkillBulletRequest() {
            this.msgIngamePetRampageSkillBulletRequest = proto.message.IngamePetRampageSkillBulletRequest.getDefaultInstance();
            __bitField2 &= ~2048;
            return this;
        }

        public boolean hasMsgIngamePetRampageSkillBulletRequest() {
            return (__bitField2 & 2048) == 2048;
        }

        public proto.message.IngamePetRampageSkillBulletResponse getMsgIngamePetRampageSkillBulletResponse() {
            return msgIngamePetRampageSkillBulletResponse;
        }

        public Builder setMsgIngamePetRampageSkillBulletResponse(proto.message.IngamePetRampageSkillBulletResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgIngamePetRampageSkillBulletResponse to null");
            }

            this.msgIngamePetRampageSkillBulletResponse = value;
            __bitField2 |= 4096;
            return this;
        }

        public Builder clearMsgIngamePetRampageSkillBulletResponse() {
            this.msgIngamePetRampageSkillBulletResponse = proto.message.IngamePetRampageSkillBulletResponse.getDefaultInstance();
            __bitField2 &= ~4096;
            return this;
        }

        public boolean hasMsgIngamePetRampageSkillBulletResponse() {
            return (__bitField2 & 4096) == 4096;
        }

        public proto.message.IngameCollectionItemDropResponse getMsgIngameCollectionItemDropResponse() {
            return msgIngameCollectionItemDropResponse;
        }

        public Builder setMsgIngameCollectionItemDropResponse(proto.message.IngameCollectionItemDropResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set InGameMessage#msgIngameCollectionItemDropResponse to null");
            }

            this.msgIngameCollectionItemDropResponse = value;
            __bitField2 |= 8192;
            return this;
        }

        public Builder clearMsgIngameCollectionItemDropResponse() {
            this.msgIngameCollectionItemDropResponse = proto.message.IngameCollectionItemDropResponse.getDefaultInstance();
            __bitField2 &= ~8192;
            return this;
        }

        public boolean hasMsgIngameCollectionItemDropResponse() {
            return (__bitField2 & 8192) == 8192;
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
            if (!java.util.Objects.equals(this.userID, that.userID)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgGetGameListResponse, that.msgGetGameListResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgJoinGameRequest, that.msgJoinGameRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgJoinGameResponse, that.msgJoinGameResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgJoinRoomRequest, that.msgJoinRoomRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgJoinRoomResponse, that.msgJoinRoomResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgJoinBoardRequest, that.msgJoinBoardRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgJoinBoardResponse, that.msgJoinBoardResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgStartGameResponse, that.msgStartGameResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgPlayerReadyRequest, that.msgPlayerReadyRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgPlayerReadyResponse, that.msgPlayerReadyResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgSetBetMoneyRequest, that.msgSetBetMoneyRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgSetBetMoneyResponse, that.msgSetBetMoneyResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgSetMaxPlayerRequest, that.msgSetMaxPlayerRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgSetMaxPlayerResponse, that.msgSetMaxPlayerResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgGetBoardInforResponse, that.msgGetBoardInforResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgGetFishHordeInforResponse, that.msgGetFishHordeInforResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgFireRequest, that.msgFireRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgFireResponse, that.msgFireResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgLeaveBoardRequest, that.msgLeaveBoardRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgLeaveBoardResponse, that.msgLeaveBoardResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgChangeOwnerResponse, that.msgChangeOwnerResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgPlayerLeaveBoard, that.msgPlayerLeaveBoard)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgLeaveRoomResponse, that.msgLeaveRoomResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgLeaveGameResponse, that.msgLeaveGameResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgOpenFireRequest, that.msgOpenFireRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgOutOfAmmoResponse, that.msgOutOfAmmoResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgOpenFireResponse, that.msgOpenFireResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgFinishGameRequest, that.msgFinishGameRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgFinishGameResponse, that.msgFinishGameResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgChatRequest, that.msgChatRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgChatResponse, that.msgChatResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgDonateMoneyResponse, that.msgDonateMoneyResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgGetBoarInforRequest, that.msgGetBoarInforRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgUserLevelUpResponse, that.msgUserLevelUpResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgGunChangeRequest, that.msgGunChangeRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgGunChangeResponse, that.msgGunChangeResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgBossKillResponse, that.msgBossKillResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgGetRoomListRequest, that.msgGetRoomListRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgGetRoomListResponse, that.msgGetRoomListResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgGetBoardListRequest, that.msgGetBoardListRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgGetBoardListResponse, that.msgGetBoardListResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgChatEmoRequest, that.msgChatEmoRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgChatEmoResponse, that.msgChatEmoResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgBetMakeConfirmRequest, that.msgBetMakeConfirmRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgBetMakeConfirmResponse, that.msgBetMakeConfirmResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgSoloRequest, that.msgSoloRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgSoloResponse, that.msgSoloResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgUseItemRequest, that.msgUseItemRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgUseItemResponse, that.msgUseItemResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgSoloConfirm, that.msgSoloConfirm)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgReviveBoardRequest, that.msgReviveBoardRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgReviveBoardResponse, that.msgReviveBoardResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgReviveBoardInfoResponse, that.msgReviveBoardInfoResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgRoomMoneyListRequest, that.msgRoomMoneyListRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgRoomMoneyListResponse, that.msgRoomMoneyListResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgIngameAvailableCannonsList, that.msgIngameAvailableCannonsList)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgIngameCreateBoardRequest, that.msgIngameCreateBoardRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgIngameCreateBoardResponse, that.msgIngameCreateBoardResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.clienttime, that.clienttime)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgIngameNetworkTime, that.msgIngameNetworkTime)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgAccumulationResponse, that.msgAccumulationResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgOpenBombRequest, that.msgOpenBombRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgOpenBombResponse, that.msgOpenBombResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgBombExplodeResponse, that.msgBombExplodeResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgUdpEstablishRequest, that.msgUdpEstablishRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgUdpEstablishResponse, that.msgUdpEstablishResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.uDPInboundSeq, that.uDPInboundSeq)) {
                return false;
            }
            if (!java.util.Objects.equals(this.udpHashCode, that.udpHashCode)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgIngameSkillResponse, that.msgIngameSkillResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgIngamePetRampagePreSkillResponse, that.msgIngamePetRampagePreSkillResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgIngamePetRampageBeginSkillResponse, that.msgIngamePetRampageBeginSkillResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgIngamePetRampageInSkillResponse, that.msgIngamePetRampageInSkillResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgIngamePetRampageEndSkillResponse, that.msgIngamePetRampageEndSkillResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgIngamePetRampageSkillBulletRequest, that.msgIngamePetRampageSkillBulletRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgIngamePetRampageSkillBulletResponse, that.msgIngamePetRampageSkillBulletResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgIngameCollectionItemDropResponse, that.msgIngameCollectionItemDropResponse)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.command);
            result = 31 * result + (this.userID == null ? 0 : this.userID.hashCode());
            result = 31 * result + (this.msgGetGameListResponse == null ? 0 : this.msgGetGameListResponse.hashCode());
            result = 31 * result + (this.msgJoinGameRequest == null ? 0 : this.msgJoinGameRequest.hashCode());
            result = 31 * result + (this.msgJoinGameResponse == null ? 0 : this.msgJoinGameResponse.hashCode());
            result = 31 * result + (this.msgJoinRoomRequest == null ? 0 : this.msgJoinRoomRequest.hashCode());
            result = 31 * result + (this.msgJoinRoomResponse == null ? 0 : this.msgJoinRoomResponse.hashCode());
            result = 31 * result + (this.msgJoinBoardRequest == null ? 0 : this.msgJoinBoardRequest.hashCode());
            result = 31 * result + (this.msgJoinBoardResponse == null ? 0 : this.msgJoinBoardResponse.hashCode());
            result = 31 * result + (this.msgStartGameResponse == null ? 0 : this.msgStartGameResponse.hashCode());
            result = 31 * result + (this.msgPlayerReadyRequest == null ? 0 : this.msgPlayerReadyRequest.hashCode());
            result = 31 * result + (this.msgPlayerReadyResponse == null ? 0 : this.msgPlayerReadyResponse.hashCode());
            result = 31 * result + (this.msgSetBetMoneyRequest == null ? 0 : this.msgSetBetMoneyRequest.hashCode());
            result = 31 * result + (this.msgSetBetMoneyResponse == null ? 0 : this.msgSetBetMoneyResponse.hashCode());
            result = 31 * result + (this.msgSetMaxPlayerRequest == null ? 0 : this.msgSetMaxPlayerRequest.hashCode());
            result = 31 * result + (this.msgSetMaxPlayerResponse == null ? 0 : this.msgSetMaxPlayerResponse.hashCode());
            result = 31 * result + (this.msgGetBoardInforResponse == null ? 0 : this.msgGetBoardInforResponse.hashCode());
            result = 31 * result + (this.msgGetFishHordeInforResponse == null ? 0 : this.msgGetFishHordeInforResponse.hashCode());
            result = 31 * result + (this.msgFireRequest == null ? 0 : this.msgFireRequest.hashCode());
            result = 31 * result + (this.msgFireResponse == null ? 0 : this.msgFireResponse.hashCode());
            result = 31 * result + (this.msgLeaveBoardRequest == null ? 0 : this.msgLeaveBoardRequest.hashCode());
            result = 31 * result + (this.msgLeaveBoardResponse == null ? 0 : this.msgLeaveBoardResponse.hashCode());
            result = 31 * result + (this.msgChangeOwnerResponse == null ? 0 : this.msgChangeOwnerResponse.hashCode());
            result = 31 * result + (this.msgPlayerLeaveBoard == null ? 0 : this.msgPlayerLeaveBoard.hashCode());
            result = 31 * result + (this.msgLeaveRoomResponse == null ? 0 : this.msgLeaveRoomResponse.hashCode());
            result = 31 * result + (this.msgLeaveGameResponse == null ? 0 : this.msgLeaveGameResponse.hashCode());
            result = 31 * result + (this.msgOpenFireRequest == null ? 0 : this.msgOpenFireRequest.hashCode());
            result = 31 * result + (this.msgOutOfAmmoResponse == null ? 0 : this.msgOutOfAmmoResponse.hashCode());
            result = 31 * result + (this.msgOpenFireResponse == null ? 0 : this.msgOpenFireResponse.hashCode());
            result = 31 * result + (this.msgFinishGameRequest == null ? 0 : this.msgFinishGameRequest.hashCode());
            result = 31 * result + (this.msgFinishGameResponse == null ? 0 : this.msgFinishGameResponse.hashCode());
            result = 31 * result + (this.msgChatRequest == null ? 0 : this.msgChatRequest.hashCode());
            result = 31 * result + (this.msgChatResponse == null ? 0 : this.msgChatResponse.hashCode());
            result = 31 * result + (this.msgDonateMoneyResponse == null ? 0 : this.msgDonateMoneyResponse.hashCode());
            result = 31 * result + (this.msgGetBoarInforRequest == null ? 0 : this.msgGetBoarInforRequest.hashCode());
            result = 31 * result + (this.msgUserLevelUpResponse == null ? 0 : this.msgUserLevelUpResponse.hashCode());
            result = 31 * result + (this.msgGunChangeRequest == null ? 0 : this.msgGunChangeRequest.hashCode());
            result = 31 * result + (this.msgGunChangeResponse == null ? 0 : this.msgGunChangeResponse.hashCode());
            result = 31 * result + (this.msgBossKillResponse == null ? 0 : this.msgBossKillResponse.hashCode());
            result = 31 * result + (this.msgGetRoomListRequest == null ? 0 : this.msgGetRoomListRequest.hashCode());
            result = 31 * result + (this.msgGetRoomListResponse == null ? 0 : this.msgGetRoomListResponse.hashCode());
            result = 31 * result + (this.msgGetBoardListRequest == null ? 0 : this.msgGetBoardListRequest.hashCode());
            result = 31 * result + (this.msgGetBoardListResponse == null ? 0 : this.msgGetBoardListResponse.hashCode());
            result = 31 * result + (this.msgChatEmoRequest == null ? 0 : this.msgChatEmoRequest.hashCode());
            result = 31 * result + (this.msgChatEmoResponse == null ? 0 : this.msgChatEmoResponse.hashCode());
            result = 31 * result + (this.msgBetMakeConfirmRequest == null ? 0 : this.msgBetMakeConfirmRequest.hashCode());
            result = 31 * result + (this.msgBetMakeConfirmResponse == null ? 0 : this.msgBetMakeConfirmResponse.hashCode());
            result = 31 * result + (this.msgSoloRequest == null ? 0 : this.msgSoloRequest.hashCode());
            result = 31 * result + (this.msgSoloResponse == null ? 0 : this.msgSoloResponse.hashCode());
            result = 31 * result + (this.msgUseItemRequest == null ? 0 : this.msgUseItemRequest.hashCode());
            result = 31 * result + (this.msgUseItemResponse == null ? 0 : this.msgUseItemResponse.hashCode());
            result = 31 * result + (this.msgSoloConfirm == null ? 0 : this.msgSoloConfirm.hashCode());
            result = 31 * result + (this.msgReviveBoardRequest == null ? 0 : this.msgReviveBoardRequest.hashCode());
            result = 31 * result + (this.msgReviveBoardResponse == null ? 0 : this.msgReviveBoardResponse.hashCode());
            result = 31 * result + (this.msgReviveBoardInfoResponse == null ? 0 : this.msgReviveBoardInfoResponse.hashCode());
            result = 31 * result + (this.msgRoomMoneyListRequest == null ? 0 : this.msgRoomMoneyListRequest.hashCode());
            result = 31 * result + (this.msgRoomMoneyListResponse == null ? 0 : this.msgRoomMoneyListResponse.hashCode());
            result = 31 * result + (this.msgIngameAvailableCannonsList == null ? 0 : this.msgIngameAvailableCannonsList.hashCode());
            result = 31 * result + (this.msgIngameCreateBoardRequest == null ? 0 : this.msgIngameCreateBoardRequest.hashCode());
            result = 31 * result + (this.msgIngameCreateBoardResponse == null ? 0 : this.msgIngameCreateBoardResponse.hashCode());
            result = 31 * result + Long.hashCode(this.clienttime);
            result = 31 * result + (this.msgIngameNetworkTime == null ? 0 : this.msgIngameNetworkTime.hashCode());
            result = 31 * result + (this.msgAccumulationResponse == null ? 0 : this.msgAccumulationResponse.hashCode());
            result = 31 * result + (this.msgOpenBombRequest == null ? 0 : this.msgOpenBombRequest.hashCode());
            result = 31 * result + (this.msgOpenBombResponse == null ? 0 : this.msgOpenBombResponse.hashCode());
            result = 31 * result + (this.msgBombExplodeResponse == null ? 0 : this.msgBombExplodeResponse.hashCode());
            result = 31 * result + (this.msgUdpEstablishRequest == null ? 0 : this.msgUdpEstablishRequest.hashCode());
            result = 31 * result + (this.msgUdpEstablishResponse == null ? 0 : this.msgUdpEstablishResponse.hashCode());
            result = 31 * result + Long.hashCode(this.uDPInboundSeq);
            result = 31 * result + Integer.hashCode(this.udpHashCode);
            result = 31 * result + (this.msgIngameSkillResponse == null ? 0 : this.msgIngameSkillResponse.hashCode());
            result = 31 * result + (this.msgIngamePetRampagePreSkillResponse == null ? 0 : this.msgIngamePetRampagePreSkillResponse.hashCode());
            result = 31 * result + (this.msgIngamePetRampageBeginSkillResponse == null ? 0 : this.msgIngamePetRampageBeginSkillResponse.hashCode());
            result = 31 * result + (this.msgIngamePetRampageInSkillResponse == null ? 0 : this.msgIngamePetRampageInSkillResponse.hashCode());
            result = 31 * result + (this.msgIngamePetRampageEndSkillResponse == null ? 0 : this.msgIngamePetRampageEndSkillResponse.hashCode());
            result = 31 * result + (this.msgIngamePetRampageSkillBulletRequest == null ? 0 : this.msgIngamePetRampageSkillBulletRequest.hashCode());
            result = 31 * result + (this.msgIngamePetRampageSkillBulletResponse == null ? 0 : this.msgIngamePetRampageSkillBulletResponse.hashCode());
            result = 31 * result + (this.msgIngameCollectionItemDropResponse == null ? 0 : this.msgIngameCollectionItemDropResponse.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasCommand()) {
                parts.add("command=" + getCommand() + '(' + getCommandValue() + ')');
            }
            if (hasUserID()) {
                parts.add("userID=" + getUserID());
            }
            if (hasMsgGetGameListResponse()) {
                parts.add("msgGetGameListResponse=" + getMsgGetGameListResponse());
            }
            if (hasMsgJoinGameRequest()) {
                parts.add("msgJoinGameRequest=" + getMsgJoinGameRequest());
            }
            if (hasMsgJoinGameResponse()) {
                parts.add("msgJoinGameResponse=" + getMsgJoinGameResponse());
            }
            if (hasMsgJoinRoomRequest()) {
                parts.add("msgJoinRoomRequest=" + getMsgJoinRoomRequest());
            }
            if (hasMsgJoinRoomResponse()) {
                parts.add("msgJoinRoomResponse=" + getMsgJoinRoomResponse());
            }
            if (hasMsgJoinBoardRequest()) {
                parts.add("msgJoinBoardRequest=" + getMsgJoinBoardRequest());
            }
            if (hasMsgJoinBoardResponse()) {
                parts.add("msgJoinBoardResponse=" + getMsgJoinBoardResponse());
            }
            if (hasMsgStartGameResponse()) {
                parts.add("msgStartGameResponse=" + getMsgStartGameResponse());
            }
            if (hasMsgPlayerReadyRequest()) {
                parts.add("msgPlayerReadyRequest=" + getMsgPlayerReadyRequest());
            }
            if (hasMsgPlayerReadyResponse()) {
                parts.add("msgPlayerReadyResponse=" + getMsgPlayerReadyResponse());
            }
            if (hasMsgSetBetMoneyRequest()) {
                parts.add("msgSetBetMoneyRequest=" + getMsgSetBetMoneyRequest());
            }
            if (hasMsgSetBetMoneyResponse()) {
                parts.add("msgSetBetMoneyResponse=" + getMsgSetBetMoneyResponse());
            }
            if (hasMsgSetMaxPlayerRequest()) {
                parts.add("msgSetMaxPlayerRequest=" + getMsgSetMaxPlayerRequest());
            }
            if (hasMsgSetMaxPlayerResponse()) {
                parts.add("msgSetMaxPlayerResponse=" + getMsgSetMaxPlayerResponse());
            }
            if (hasMsgGetBoardInforResponse()) {
                parts.add("msgGetBoardInforResponse=" + getMsgGetBoardInforResponse());
            }
            if (hasMsgGetFishHordeInforResponse()) {
                parts.add("msgGetFishHordeInforResponse=" + getMsgGetFishHordeInforResponse());
            }
            if (hasMsgFireRequest()) {
                parts.add("msgFireRequest=" + getMsgFireRequest());
            }
            if (hasMsgFireResponse()) {
                parts.add("msgFireResponse=" + getMsgFireResponse());
            }
            if (hasMsgLeaveBoardRequest()) {
                parts.add("msgLeaveBoardRequest=" + getMsgLeaveBoardRequest());
            }
            if (hasMsgLeaveBoardResponse()) {
                parts.add("msgLeaveBoardResponse=" + getMsgLeaveBoardResponse());
            }
            if (hasMsgChangeOwnerResponse()) {
                parts.add("msgChangeOwnerResponse=" + getMsgChangeOwnerResponse());
            }
            if (hasMsgPlayerLeaveBoard()) {
                parts.add("msgPlayerLeaveBoard=" + getMsgPlayerLeaveBoard());
            }
            if (hasMsgLeaveRoomResponse()) {
                parts.add("msgLeaveRoomResponse=" + getMsgLeaveRoomResponse());
            }
            if (hasMsgLeaveGameResponse()) {
                parts.add("msgLeaveGameResponse=" + getMsgLeaveGameResponse());
            }
            if (hasMsgOpenFireRequest()) {
                parts.add("msgOpenFireRequest=" + getMsgOpenFireRequest());
            }
            if (hasMsgOutOfAmmoResponse()) {
                parts.add("msgOutOfAmmoResponse=" + getMsgOutOfAmmoResponse());
            }
            if (hasMsgOpenFireResponse()) {
                parts.add("msgOpenFireResponse=" + getMsgOpenFireResponse());
            }
            if (hasMsgFinishGameRequest()) {
                parts.add("msgFinishGameRequest=" + getMsgFinishGameRequest());
            }
            if (hasMsgFinishGameResponse()) {
                parts.add("msgFinishGameResponse=" + getMsgFinishGameResponse());
            }
            if (hasMsgChatRequest()) {
                parts.add("msgChatRequest=" + getMsgChatRequest());
            }
            if (hasMsgChatResponse()) {
                parts.add("msgChatResponse=" + getMsgChatResponse());
            }
            if (hasMsgDonateMoneyResponse()) {
                parts.add("msgDonateMoneyResponse=" + getMsgDonateMoneyResponse());
            }
            if (hasMsgGetBoarInforRequest()) {
                parts.add("msgGetBoarInforRequest=" + getMsgGetBoarInforRequest());
            }
            if (hasMsgUserLevelUpResponse()) {
                parts.add("msgUserLevelUpResponse=" + getMsgUserLevelUpResponse());
            }
            if (hasMsgGunChangeRequest()) {
                parts.add("msgGunChangeRequest=" + getMsgGunChangeRequest());
            }
            if (hasMsgGunChangeResponse()) {
                parts.add("msgGunChangeResponse=" + getMsgGunChangeResponse());
            }
            if (hasMsgBossKillResponse()) {
                parts.add("msgBossKillResponse=" + getMsgBossKillResponse());
            }
            if (hasMsgGetRoomListRequest()) {
                parts.add("msgGetRoomListRequest=" + getMsgGetRoomListRequest());
            }
            if (hasMsgGetRoomListResponse()) {
                parts.add("msgGetRoomListResponse=" + getMsgGetRoomListResponse());
            }
            if (hasMsgGetBoardListRequest()) {
                parts.add("msgGetBoardListRequest=" + getMsgGetBoardListRequest());
            }
            if (hasMsgGetBoardListResponse()) {
                parts.add("msgGetBoardListResponse=" + getMsgGetBoardListResponse());
            }
            if (hasMsgChatEmoRequest()) {
                parts.add("msgChatEmoRequest=" + getMsgChatEmoRequest());
            }
            if (hasMsgChatEmoResponse()) {
                parts.add("msgChatEmoResponse=" + getMsgChatEmoResponse());
            }
            if (hasMsgBetMakeConfirmRequest()) {
                parts.add("msgBetMakeConfirmRequest=" + getMsgBetMakeConfirmRequest());
            }
            if (hasMsgBetMakeConfirmResponse()) {
                parts.add("msgBetMakeConfirmResponse=" + getMsgBetMakeConfirmResponse());
            }
            if (hasMsgSoloRequest()) {
                parts.add("msgSoloRequest=" + getMsgSoloRequest());
            }
            if (hasMsgSoloResponse()) {
                parts.add("msgSoloResponse=" + getMsgSoloResponse());
            }
            if (hasMsgUseItemRequest()) {
                parts.add("msgUseItemRequest=" + getMsgUseItemRequest());
            }
            if (hasMsgUseItemResponse()) {
                parts.add("msgUseItemResponse=" + getMsgUseItemResponse());
            }
            if (hasMsgSoloConfirm()) {
                parts.add("msgSoloConfirm=" + getMsgSoloConfirm());
            }
            if (hasMsgReviveBoardRequest()) {
                parts.add("msgReviveBoardRequest=" + getMsgReviveBoardRequest());
            }
            if (hasMsgReviveBoardResponse()) {
                parts.add("msgReviveBoardResponse=" + getMsgReviveBoardResponse());
            }
            if (hasMsgReviveBoardInfoResponse()) {
                parts.add("msgReviveBoardInfoResponse=" + getMsgReviveBoardInfoResponse());
            }
            if (hasMsgRoomMoneyListRequest()) {
                parts.add("msgRoomMoneyListRequest=" + getMsgRoomMoneyListRequest());
            }
            if (hasMsgRoomMoneyListResponse()) {
                parts.add("msgRoomMoneyListResponse=" + getMsgRoomMoneyListResponse());
            }
            if (hasMsgIngameAvailableCannonsList()) {
                parts.add("msgIngameAvailableCannonsList=" + getMsgIngameAvailableCannonsList());
            }
            if (hasMsgIngameCreateBoardRequest()) {
                parts.add("msgIngameCreateBoardRequest=" + getMsgIngameCreateBoardRequest());
            }
            if (hasMsgIngameCreateBoardResponse()) {
                parts.add("msgIngameCreateBoardResponse=" + getMsgIngameCreateBoardResponse());
            }
            if (hasClienttime()) {
                parts.add("clienttime=" + getClienttime());
            }
            if (hasMsgIngameNetworkTime()) {
                parts.add("msgIngameNetworkTime=" + getMsgIngameNetworkTime());
            }
            if (hasMsgAccumulationResponse()) {
                parts.add("msgAccumulationResponse=" + getMsgAccumulationResponse());
            }
            if (hasMsgOpenBombRequest()) {
                parts.add("msgOpenBombRequest=" + getMsgOpenBombRequest());
            }
            if (hasMsgOpenBombResponse()) {
                parts.add("msgOpenBombResponse=" + getMsgOpenBombResponse());
            }
            if (hasMsgBombExplodeResponse()) {
                parts.add("msgBombExplodeResponse=" + getMsgBombExplodeResponse());
            }
            if (hasMsgUdpEstablishRequest()) {
                parts.add("msgUdpEstablishRequest=" + getMsgUdpEstablishRequest());
            }
            if (hasMsgUdpEstablishResponse()) {
                parts.add("msgUdpEstablishResponse=" + getMsgUdpEstablishResponse());
            }
            if (hasUDPInboundSeq()) {
                parts.add("uDPInboundSeq=" + getUDPInboundSeq());
            }
            if (hasUdpHashCode()) {
                parts.add("udpHashCode=" + getUdpHashCode());
            }
            if (hasMsgIngameSkillResponse()) {
                parts.add("msgIngameSkillResponse=" + getMsgIngameSkillResponse());
            }
            if (hasMsgIngamePetRampagePreSkillResponse()) {
                parts.add("msgIngamePetRampagePreSkillResponse=" + getMsgIngamePetRampagePreSkillResponse());
            }
            if (hasMsgIngamePetRampageBeginSkillResponse()) {
                parts.add("msgIngamePetRampageBeginSkillResponse=" + getMsgIngamePetRampageBeginSkillResponse());
            }
            if (hasMsgIngamePetRampageInSkillResponse()) {
                parts.add("msgIngamePetRampageInSkillResponse=" + getMsgIngamePetRampageInSkillResponse());
            }
            if (hasMsgIngamePetRampageEndSkillResponse()) {
                parts.add("msgIngamePetRampageEndSkillResponse=" + getMsgIngamePetRampageEndSkillResponse());
            }
            if (hasMsgIngamePetRampageSkillBulletRequest()) {
                parts.add("msgIngamePetRampageSkillBulletRequest=" + getMsgIngamePetRampageSkillBulletRequest());
            }
            if (hasMsgIngamePetRampageSkillBulletResponse()) {
                parts.add("msgIngamePetRampageSkillBulletResponse=" + getMsgIngamePetRampageSkillBulletResponse());
            }
            if (hasMsgIngameCollectionItemDropResponse()) {
                parts.add("msgIngameCollectionItemDropResponse=" + getMsgIngameCollectionItemDropResponse());
            }
            return "InGameMessage{" + String.join(", ", parts) + "}";
        }

        public InGameMessage build() {
            proto.message.InGameMessage result = new proto.message.InGameMessage();
            result.__bitField0 = __bitField0;
            result.__bitField1 = __bitField1;
            result.__bitField2 = __bitField2;
            result.command = this.command;
            result.userID = this.userID;
            result.msgGetGameListResponse = this.msgGetGameListResponse;
            result.msgJoinGameRequest = this.msgJoinGameRequest;
            result.msgJoinGameResponse = this.msgJoinGameResponse;
            result.msgJoinRoomRequest = this.msgJoinRoomRequest;
            result.msgJoinRoomResponse = this.msgJoinRoomResponse;
            result.msgJoinBoardRequest = this.msgJoinBoardRequest;
            result.msgJoinBoardResponse = this.msgJoinBoardResponse;
            result.msgStartGameResponse = this.msgStartGameResponse;
            result.msgPlayerReadyRequest = this.msgPlayerReadyRequest;
            result.msgPlayerReadyResponse = this.msgPlayerReadyResponse;
            result.msgSetBetMoneyRequest = this.msgSetBetMoneyRequest;
            result.msgSetBetMoneyResponse = this.msgSetBetMoneyResponse;
            result.msgSetMaxPlayerRequest = this.msgSetMaxPlayerRequest;
            result.msgSetMaxPlayerResponse = this.msgSetMaxPlayerResponse;
            result.msgGetBoardInforResponse = this.msgGetBoardInforResponse;
            result.msgGetFishHordeInforResponse = this.msgGetFishHordeInforResponse;
            result.msgFireRequest = this.msgFireRequest;
            result.msgFireResponse = this.msgFireResponse;
            result.msgLeaveBoardRequest = this.msgLeaveBoardRequest;
            result.msgLeaveBoardResponse = this.msgLeaveBoardResponse;
            result.msgChangeOwnerResponse = this.msgChangeOwnerResponse;
            result.msgPlayerLeaveBoard = this.msgPlayerLeaveBoard;
            result.msgLeaveRoomResponse = this.msgLeaveRoomResponse;
            result.msgLeaveGameResponse = this.msgLeaveGameResponse;
            result.msgOpenFireRequest = this.msgOpenFireRequest;
            result.msgOutOfAmmoResponse = this.msgOutOfAmmoResponse;
            result.msgOpenFireResponse = this.msgOpenFireResponse;
            result.msgFinishGameRequest = this.msgFinishGameRequest;
            result.msgFinishGameResponse = this.msgFinishGameResponse;
            result.msgChatRequest = this.msgChatRequest;
            result.msgChatResponse = this.msgChatResponse;
            result.msgDonateMoneyResponse = this.msgDonateMoneyResponse;
            result.msgGetBoarInforRequest = this.msgGetBoarInforRequest;
            result.msgUserLevelUpResponse = this.msgUserLevelUpResponse;
            result.msgGunChangeRequest = this.msgGunChangeRequest;
            result.msgGunChangeResponse = this.msgGunChangeResponse;
            result.msgBossKillResponse = this.msgBossKillResponse;
            result.msgGetRoomListRequest = this.msgGetRoomListRequest;
            result.msgGetRoomListResponse = this.msgGetRoomListResponse;
            result.msgGetBoardListRequest = this.msgGetBoardListRequest;
            result.msgGetBoardListResponse = this.msgGetBoardListResponse;
            result.msgChatEmoRequest = this.msgChatEmoRequest;
            result.msgChatEmoResponse = this.msgChatEmoResponse;
            result.msgBetMakeConfirmRequest = this.msgBetMakeConfirmRequest;
            result.msgBetMakeConfirmResponse = this.msgBetMakeConfirmResponse;
            result.msgSoloRequest = this.msgSoloRequest;
            result.msgSoloResponse = this.msgSoloResponse;
            result.msgUseItemRequest = this.msgUseItemRequest;
            result.msgUseItemResponse = this.msgUseItemResponse;
            result.msgSoloConfirm = this.msgSoloConfirm;
            result.msgReviveBoardRequest = this.msgReviveBoardRequest;
            result.msgReviveBoardResponse = this.msgReviveBoardResponse;
            result.msgReviveBoardInfoResponse = this.msgReviveBoardInfoResponse;
            result.msgRoomMoneyListRequest = this.msgRoomMoneyListRequest;
            result.msgRoomMoneyListResponse = this.msgRoomMoneyListResponse;
            result.msgIngameAvailableCannonsList = this.msgIngameAvailableCannonsList;
            result.msgIngameCreateBoardRequest = this.msgIngameCreateBoardRequest;
            result.msgIngameCreateBoardResponse = this.msgIngameCreateBoardResponse;
            result.clienttime = this.clienttime;
            result.msgIngameNetworkTime = this.msgIngameNetworkTime;
            result.msgAccumulationResponse = this.msgAccumulationResponse;
            result.msgOpenBombRequest = this.msgOpenBombRequest;
            result.msgOpenBombResponse = this.msgOpenBombResponse;
            result.msgBombExplodeResponse = this.msgBombExplodeResponse;
            result.msgUdpEstablishRequest = this.msgUdpEstablishRequest;
            result.msgUdpEstablishResponse = this.msgUdpEstablishResponse;
            result.uDPInboundSeq = this.uDPInboundSeq;
            result.udpHashCode = this.udpHashCode;
            result.msgIngameSkillResponse = this.msgIngameSkillResponse;
            result.msgIngamePetRampagePreSkillResponse = this.msgIngamePetRampagePreSkillResponse;
            result.msgIngamePetRampageBeginSkillResponse = this.msgIngamePetRampageBeginSkillResponse;
            result.msgIngamePetRampageInSkillResponse = this.msgIngamePetRampageInSkillResponse;
            result.msgIngamePetRampageEndSkillResponse = this.msgIngamePetRampageEndSkillResponse;
            result.msgIngamePetRampageSkillBulletRequest = this.msgIngamePetRampageSkillBulletRequest;
            result.msgIngamePetRampageSkillBulletResponse = this.msgIngamePetRampageSkillBulletResponse;
            result.msgIngameCollectionItemDropResponse = this.msgIngameCollectionItemDropResponse;
            return result;
        }

    }



}