package proto.message;

@javax.annotation.Generated("/Users/vunguyen/project/gdxsocket/core/src/proto/msg_profile.proto")
public final class ProfileMessage
        implements io.protostuff.Message<ProfileMessage> {

    private static final ProfileMessage DEFAULT_INSTANCE = newBuilder().build();

    private int command;

    private proto.message.GetUserMoneyRequest msgGetUserMoneyRequest;

    private proto.message.GetUserMoneyResponse msgGetUserMoneyResponse;

    private proto.message.GetUserProfileRequest msgGetUserProfileRequest;

    private proto.message.GetUserProfileResponse msgGetUserProfileResponse;

    private proto.message.LevelUpResponse msgLevelUpResponse;

    private proto.message.GetUserInboxResponse msgGetUserInboxResponse;

    private proto.message.UpdateProfileFBRequest msgUpdateProfileFBRequest;

    private proto.message.UpdateProfileFBResponse msgUpdateProfileFBResponse;

    private proto.message.UpdateUserNameRequest msgUpdateUserNameRequest;

    private proto.message.UpdateUserNameResponse msgUpdateUserNameResponse;

    private proto.message.ClaimInboxRequest msgClaimInboxRequest;

    private proto.message.ClaimInboxResponse msgClaimInboxResponse;

    private proto.message.FriendListRawResponse msgFriendListRawResponse;

    private proto.message.FriendListDetailRequest msgFriendListDetailRequest;

    private proto.message.FriendListDetailResponse msgFriendListDetailResponse;

    private proto.message.FriendActionRequest msgFriendActionRequest;

    private proto.message.FriendActionResponse msgFriendActionResponse;

    private proto.message.FriendSearchRequest msgFriendSearchRequest;

    private proto.message.FriendSearchResponse msgFriendSearchResponse;

    private proto.message.FriendUnlockMoneySendRequest msgFriendUnlockMoneySendRequest;

    private proto.message.FriendUnlockMoneySendResponse msgFriendUnlockMoneySendResponse;

    private proto.message.FriendMessageSendRequest msgFriendMessageSendRequest;

    private proto.message.DailyQuestInfoResponse msgDailyQuestInfoResponse;

    private proto.message.DailyQuestReceiveRequest msgDailyQuestReceiveRequest;

    private proto.message.DailyQuestReceiveResponse msgDailyQuestReceiveResponse;

    private proto.message.DailySnsFriendInviteRequest msgDailySnsFriendInviteRequest;

    private proto.message.DailySnsFriendInviteResponse msgDailySnsFriendInviteResponse;

    private proto.message.GiftCodeRequest msgGiftCodeRequest;

    private proto.message.GiftCodeResponse msgGiftCodeResponse;

    private proto.message.GetUserInventoryResponse msgGetUserInventoryResponse;

    private proto.message.GetCannonDataResponse msgGetCannonDataResponse;

    private proto.message.CannonUnlockRequest msgCannonUnlockRequest;

    private proto.message.CannonUnlockResponse msgCannonUnlockResponse;

    private proto.message.CannonUpgradeRequest msgCannonUpgradeRequest;

    private proto.message.CannonUpgradeResponse msgCannonUpgradeResponse;

    private long clienttime;

    private proto.message.WheelEnterRequest msgWheelEnterRequest;

    private proto.message.WheelEnterResponse msgWheelEnterResponse;

    private proto.message.WheelLeaveRequest msgWheelLeaveRequest;

    private proto.message.WheelLeaveResponse msgWheelLeaveResponse;

    private proto.message.WheelTurnRequest msgWheelTurnRequest;

    private proto.message.WheelTurnResponse msgWheelTurnResponse;

    private proto.message.WheelGetRequest msgWheelGetRequest;

    private proto.message.WheelGetResponse msgWheelGetResponse;

    private proto.message.WheelIngameRequest msgWheelIngameRequest;

    private proto.message.WheelIngameResponse msgWheelIngameResponse;

    private proto.message.WheelCarrierRequest msgWheelCarrierRequest;

    private proto.message.WheelCarrierResponse msgWheelCarrierResponse;

    private proto.message.SoccerTeamsResponse msgSoccerTeamsResponse;

    private proto.message.SoccerEnterRequest msgSoccerEnterRequest;

    private proto.message.SoccerEnterResponse msgSoccerEnterResponse;

    private proto.message.SoccerMatchesRequest msgSoccerMatchesRequest;

    private proto.message.SoccerMatchesResponse msgSoccerMatchesResponse;

    private proto.message.SoccerBetRequest msgSoccerBetRequest;

    private proto.message.SoccerBetResponse msgSoccerBetResponse;

    private proto.message.SoccerBetCountResponse msgSoccerBetCountResponse;

    private proto.message.SoccerReceiveRequest msgSoccerReceiveRequest;

    private proto.message.SoccerReceiveResponse msgSoccerReceiveResponse;

    private proto.message.SoccerReddotRequest msgSoccerReddotRequest;

    private proto.message.SoccerReddotResponse msgSoccerReddotResponse;

    private proto.message.PetInfoRequest msgPetInfoRequest;

    private proto.message.PetInfoResponse msgPetInfoResponse;

    private proto.message.PetUpdateResponse msgPetUpdateResponse;

    private proto.message.PetUnlockRequest msgPetUnlockRequest;

    private proto.message.PetUnlockResponse msgPetUnlockResponse;

    private proto.message.PetGiftReceiveRequest msgPetGiftReceiveRequest;

    private proto.message.PetGiftReceiveResponse msgPetGiftReceiveResponse;

    private proto.message.PetGiftAskingResponse msgPetGiftAskingResponse;

    private proto.message.ClientActionLogRequest msgClientActionLogRequest;

    private proto.message.AdsViewRequest msgAdsViewRequest;

    private proto.message.AdsViewResponse msgAdsViewResponse;

    private proto.message.PetLevelUpResponse msgPetLevelUpResponse;

    private proto.message.DailySupportResponse msgDailySupportResponse;

    private proto.message.DailyBonusRequest msgDailyBonusRequest;

    private proto.message.DailyBonusResponse msgDailyBonusResponse;

    private proto.message.ClaimDailyBonusRequest msgClaimDailyBonusRequest;

    private proto.message.ClaimDailyBonusResponse msgClaimDailyBonusResponse;

    private proto.message.CollectionInfoRequest msgCollectionInfoRequest;

    private proto.message.CollectionInfoResponse msgCollectionInfoResponse;

    private proto.message.ClaimCollectionPrizeRequest msgClaimCollectionPrizeRequest;

    private proto.message.ClaimCollectionPrizeResponse msgClaimCollectionPrizeResponse;

    private proto.message.DonateFriendListDetailRequest msgDonateFriendListDetailRequest;

    private proto.message.DonateFriendListDetailResponse msgDonateFriendListDetailResponse;

    private proto.message.DonateFriendReceiveItemsRequest msgDonateFriendReceiveItemsRequest;

    private proto.message.DonateFriendReceiveItemsResponse msgDonateFriendReceiveItemsResponse;

    private proto.message.DonateFriendSendItemsRequest msgDonateFriendSendItemsRequest;

    private proto.message.DonateFriendSendItemsResponse msgDonateFriendSendItemsResponse;

    private proto.message.DonateFriendCheckGiftRequest msgDonateFriendCheckGiftRequest;

    private proto.message.DonateFriendCheckGiftResponse msgDonateFriendCheckGiftResponse;

    private proto.message.DonateListFriendSendItemsRequest msgDonateListFriendSendItemsRequest;

    private proto.message.DonateListFriendSendItemsResponse msgDonateListFriendSendItemsResponse;

    private proto.message.AccumulatePromotionRequest msgAccumulatePromotionRequest;

    private proto.message.AccumulatePromotionResponse msgAccumulatePromotionResponse;

    private proto.message.AccumulateClaimRequest msgAccumulateClaimRequest;

    private proto.message.AccumulateClaimResponse msgAccumulateClaimResponse;

    private proto.message.LeaderBoardRequest msgLeaderBoardRequest;

    private proto.message.LeaderBoardResponse msgLeaderBoardResponse;

    private proto.message.ArchiveCollectionRequest msgArchiveCollectionRequest;

    private proto.message.ArchiveCollectionResponse msgArchiveCollectionResponse;

    private proto.message.AdsInfoRequest msgAdsInfoRequest;

    private proto.message.AdsInfoResponse msgAdsInfoResponse;

    private proto.message.AdsRewardClaimRequest msgAdsRewardClaimRequest;

    private proto.message.H3EnterRequest msgH3EnterRequest;

    private proto.message.H3EnterResponse msgH3EnterResponse;

    private proto.message.H3LeaveRequest msgH3LeaveRequest;

    private proto.message.H3LeaveResponse msgH3LeaveResponse;

    private proto.message.H3TurnRequest msgH3TurnRequest;

    private proto.message.H3TurnResponse msgH3TurnResponse;

    private boolean __merge_lock = false;
    private int __bitField0;
    private int __bitField1;
    private int __bitField2;
    private int __bitField3;

    private ProfileMessage() {
        this.command = proto.message.ProfileCommand.PROFILE_GET_USER_MONEY_REQUEST.getNumber();
        this.msgGetUserMoneyRequest = proto.message.GetUserMoneyRequest.getDefaultInstance();
        this.msgGetUserMoneyResponse = proto.message.GetUserMoneyResponse.getDefaultInstance();
        this.msgGetUserProfileRequest = proto.message.GetUserProfileRequest.getDefaultInstance();
        this.msgGetUserProfileResponse = proto.message.GetUserProfileResponse.getDefaultInstance();
        this.msgLevelUpResponse = proto.message.LevelUpResponse.getDefaultInstance();
        this.msgGetUserInboxResponse = proto.message.GetUserInboxResponse.getDefaultInstance();
        this.msgUpdateProfileFBRequest = proto.message.UpdateProfileFBRequest.getDefaultInstance();
        this.msgUpdateProfileFBResponse = proto.message.UpdateProfileFBResponse.getDefaultInstance();
        this.msgUpdateUserNameRequest = proto.message.UpdateUserNameRequest.getDefaultInstance();
        this.msgUpdateUserNameResponse = proto.message.UpdateUserNameResponse.getDefaultInstance();
        this.msgClaimInboxRequest = proto.message.ClaimInboxRequest.getDefaultInstance();
        this.msgClaimInboxResponse = proto.message.ClaimInboxResponse.getDefaultInstance();
        this.msgFriendListRawResponse = proto.message.FriendListRawResponse.getDefaultInstance();
        this.msgFriendListDetailRequest = proto.message.FriendListDetailRequest.getDefaultInstance();
        this.msgFriendListDetailResponse = proto.message.FriendListDetailResponse.getDefaultInstance();
        this.msgFriendActionRequest = proto.message.FriendActionRequest.getDefaultInstance();
        this.msgFriendActionResponse = proto.message.FriendActionResponse.getDefaultInstance();
        this.msgFriendSearchRequest = proto.message.FriendSearchRequest.getDefaultInstance();
        this.msgFriendSearchResponse = proto.message.FriendSearchResponse.getDefaultInstance();
        this.msgFriendUnlockMoneySendRequest = proto.message.FriendUnlockMoneySendRequest.getDefaultInstance();
        this.msgFriendUnlockMoneySendResponse = proto.message.FriendUnlockMoneySendResponse.getDefaultInstance();
        this.msgFriendMessageSendRequest = proto.message.FriendMessageSendRequest.getDefaultInstance();
        this.msgDailyQuestInfoResponse = proto.message.DailyQuestInfoResponse.getDefaultInstance();
        this.msgDailyQuestReceiveRequest = proto.message.DailyQuestReceiveRequest.getDefaultInstance();
        this.msgDailyQuestReceiveResponse = proto.message.DailyQuestReceiveResponse.getDefaultInstance();
        this.msgDailySnsFriendInviteRequest = proto.message.DailySnsFriendInviteRequest.getDefaultInstance();
        this.msgDailySnsFriendInviteResponse = proto.message.DailySnsFriendInviteResponse.getDefaultInstance();
        this.msgGiftCodeRequest = proto.message.GiftCodeRequest.getDefaultInstance();
        this.msgGiftCodeResponse = proto.message.GiftCodeResponse.getDefaultInstance();
        this.msgGetUserInventoryResponse = proto.message.GetUserInventoryResponse.getDefaultInstance();
        this.msgGetCannonDataResponse = proto.message.GetCannonDataResponse.getDefaultInstance();
        this.msgCannonUnlockRequest = proto.message.CannonUnlockRequest.getDefaultInstance();
        this.msgCannonUnlockResponse = proto.message.CannonUnlockResponse.getDefaultInstance();
        this.msgCannonUpgradeRequest = proto.message.CannonUpgradeRequest.getDefaultInstance();
        this.msgCannonUpgradeResponse = proto.message.CannonUpgradeResponse.getDefaultInstance();
        this.clienttime = 0L;
        this.msgWheelEnterRequest = proto.message.WheelEnterRequest.getDefaultInstance();
        this.msgWheelEnterResponse = proto.message.WheelEnterResponse.getDefaultInstance();
        this.msgWheelLeaveRequest = proto.message.WheelLeaveRequest.getDefaultInstance();
        this.msgWheelLeaveResponse = proto.message.WheelLeaveResponse.getDefaultInstance();
        this.msgWheelTurnRequest = proto.message.WheelTurnRequest.getDefaultInstance();
        this.msgWheelTurnResponse = proto.message.WheelTurnResponse.getDefaultInstance();
        this.msgWheelGetRequest = proto.message.WheelGetRequest.getDefaultInstance();
        this.msgWheelGetResponse = proto.message.WheelGetResponse.getDefaultInstance();
        this.msgWheelIngameRequest = proto.message.WheelIngameRequest.getDefaultInstance();
        this.msgWheelIngameResponse = proto.message.WheelIngameResponse.getDefaultInstance();
        this.msgWheelCarrierRequest = proto.message.WheelCarrierRequest.getDefaultInstance();
        this.msgWheelCarrierResponse = proto.message.WheelCarrierResponse.getDefaultInstance();
        this.msgSoccerTeamsResponse = proto.message.SoccerTeamsResponse.getDefaultInstance();
        this.msgSoccerEnterRequest = proto.message.SoccerEnterRequest.getDefaultInstance();
        this.msgSoccerEnterResponse = proto.message.SoccerEnterResponse.getDefaultInstance();
        this.msgSoccerMatchesRequest = proto.message.SoccerMatchesRequest.getDefaultInstance();
        this.msgSoccerMatchesResponse = proto.message.SoccerMatchesResponse.getDefaultInstance();
        this.msgSoccerBetRequest = proto.message.SoccerBetRequest.getDefaultInstance();
        this.msgSoccerBetResponse = proto.message.SoccerBetResponse.getDefaultInstance();
        this.msgSoccerBetCountResponse = proto.message.SoccerBetCountResponse.getDefaultInstance();
        this.msgSoccerReceiveRequest = proto.message.SoccerReceiveRequest.getDefaultInstance();
        this.msgSoccerReceiveResponse = proto.message.SoccerReceiveResponse.getDefaultInstance();
        this.msgSoccerReddotRequest = proto.message.SoccerReddotRequest.getDefaultInstance();
        this.msgSoccerReddotResponse = proto.message.SoccerReddotResponse.getDefaultInstance();
        this.msgPetInfoRequest = proto.message.PetInfoRequest.getDefaultInstance();
        this.msgPetInfoResponse = proto.message.PetInfoResponse.getDefaultInstance();
        this.msgPetUpdateResponse = proto.message.PetUpdateResponse.getDefaultInstance();
        this.msgPetUnlockRequest = proto.message.PetUnlockRequest.getDefaultInstance();
        this.msgPetUnlockResponse = proto.message.PetUnlockResponse.getDefaultInstance();
        this.msgPetGiftReceiveRequest = proto.message.PetGiftReceiveRequest.getDefaultInstance();
        this.msgPetGiftReceiveResponse = proto.message.PetGiftReceiveResponse.getDefaultInstance();
        this.msgPetGiftAskingResponse = proto.message.PetGiftAskingResponse.getDefaultInstance();
        this.msgClientActionLogRequest = proto.message.ClientActionLogRequest.getDefaultInstance();
        this.msgAdsViewRequest = proto.message.AdsViewRequest.getDefaultInstance();
        this.msgAdsViewResponse = proto.message.AdsViewResponse.getDefaultInstance();
        this.msgPetLevelUpResponse = proto.message.PetLevelUpResponse.getDefaultInstance();
        this.msgDailySupportResponse = proto.message.DailySupportResponse.getDefaultInstance();
        this.msgDailyBonusRequest = proto.message.DailyBonusRequest.getDefaultInstance();
        this.msgDailyBonusResponse = proto.message.DailyBonusResponse.getDefaultInstance();
        this.msgClaimDailyBonusRequest = proto.message.ClaimDailyBonusRequest.getDefaultInstance();
        this.msgClaimDailyBonusResponse = proto.message.ClaimDailyBonusResponse.getDefaultInstance();
        this.msgCollectionInfoRequest = proto.message.CollectionInfoRequest.getDefaultInstance();
        this.msgCollectionInfoResponse = proto.message.CollectionInfoResponse.getDefaultInstance();
        this.msgClaimCollectionPrizeRequest = proto.message.ClaimCollectionPrizeRequest.getDefaultInstance();
        this.msgClaimCollectionPrizeResponse = proto.message.ClaimCollectionPrizeResponse.getDefaultInstance();
        this.msgDonateFriendListDetailRequest = proto.message.DonateFriendListDetailRequest.getDefaultInstance();
        this.msgDonateFriendListDetailResponse = proto.message.DonateFriendListDetailResponse.getDefaultInstance();
        this.msgDonateFriendReceiveItemsRequest = proto.message.DonateFriendReceiveItemsRequest.getDefaultInstance();
        this.msgDonateFriendReceiveItemsResponse = proto.message.DonateFriendReceiveItemsResponse.getDefaultInstance();
        this.msgDonateFriendSendItemsRequest = proto.message.DonateFriendSendItemsRequest.getDefaultInstance();
        this.msgDonateFriendSendItemsResponse = proto.message.DonateFriendSendItemsResponse.getDefaultInstance();
        this.msgDonateFriendCheckGiftRequest = proto.message.DonateFriendCheckGiftRequest.getDefaultInstance();
        this.msgDonateFriendCheckGiftResponse = proto.message.DonateFriendCheckGiftResponse.getDefaultInstance();
        this.msgDonateListFriendSendItemsRequest = proto.message.DonateListFriendSendItemsRequest.getDefaultInstance();
        this.msgDonateListFriendSendItemsResponse = proto.message.DonateListFriendSendItemsResponse.getDefaultInstance();
        this.msgAccumulatePromotionRequest = proto.message.AccumulatePromotionRequest.getDefaultInstance();
        this.msgAccumulatePromotionResponse = proto.message.AccumulatePromotionResponse.getDefaultInstance();
        this.msgAccumulateClaimRequest = proto.message.AccumulateClaimRequest.getDefaultInstance();
        this.msgAccumulateClaimResponse = proto.message.AccumulateClaimResponse.getDefaultInstance();
        this.msgLeaderBoardRequest = proto.message.LeaderBoardRequest.getDefaultInstance();
        this.msgLeaderBoardResponse = proto.message.LeaderBoardResponse.getDefaultInstance();
        this.msgArchiveCollectionRequest = proto.message.ArchiveCollectionRequest.getDefaultInstance();
        this.msgArchiveCollectionResponse = proto.message.ArchiveCollectionResponse.getDefaultInstance();
        this.msgAdsInfoRequest = proto.message.AdsInfoRequest.getDefaultInstance();
        this.msgAdsInfoResponse = proto.message.AdsInfoResponse.getDefaultInstance();
        this.msgAdsRewardClaimRequest = proto.message.AdsRewardClaimRequest.getDefaultInstance();
        this.msgH3EnterRequest = proto.message.H3EnterRequest.getDefaultInstance();
        this.msgH3EnterResponse = proto.message.H3EnterResponse.getDefaultInstance();
        this.msgH3LeaveRequest = proto.message.H3LeaveRequest.getDefaultInstance();
        this.msgH3LeaveResponse = proto.message.H3LeaveResponse.getDefaultInstance();
        this.msgH3TurnRequest = proto.message.H3TurnRequest.getDefaultInstance();
        this.msgH3TurnResponse = proto.message.H3TurnResponse.getDefaultInstance();
    }

    private ProfileMessage(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static ProfileMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<ProfileMessage> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public proto.message.ProfileCommand getCommand() {
        return proto.message.ProfileCommand.valueOf(command);
    }

    public int getCommandValue() {
        return command;
    }

    public boolean hasCommand() {
        return (__bitField0 & 1) == 1;
    }

    public ProfileMessage withCommand(proto.message.ProfileCommand value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setCommand(value)
            .build();
    }

    public proto.message.GetUserMoneyRequest getMsgGetUserMoneyRequest() {
        return msgGetUserMoneyRequest;
    }

    public boolean hasMsgGetUserMoneyRequest() {
        return (__bitField0 & 2) == 2;
    }

    public ProfileMessage withMsgGetUserMoneyRequest(proto.message.GetUserMoneyRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgGetUserMoneyRequest(value)
            .build();
    }

    public proto.message.GetUserMoneyResponse getMsgGetUserMoneyResponse() {
        return msgGetUserMoneyResponse;
    }

    public boolean hasMsgGetUserMoneyResponse() {
        return (__bitField0 & 4) == 4;
    }

    public ProfileMessage withMsgGetUserMoneyResponse(proto.message.GetUserMoneyResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgGetUserMoneyResponse(value)
            .build();
    }

    public proto.message.GetUserProfileRequest getMsgGetUserProfileRequest() {
        return msgGetUserProfileRequest;
    }

    public boolean hasMsgGetUserProfileRequest() {
        return (__bitField0 & 8) == 8;
    }

    public ProfileMessage withMsgGetUserProfileRequest(proto.message.GetUserProfileRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgGetUserProfileRequest(value)
            .build();
    }

    public proto.message.GetUserProfileResponse getMsgGetUserProfileResponse() {
        return msgGetUserProfileResponse;
    }

    public boolean hasMsgGetUserProfileResponse() {
        return (__bitField0 & 16) == 16;
    }

    public ProfileMessage withMsgGetUserProfileResponse(proto.message.GetUserProfileResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgGetUserProfileResponse(value)
            .build();
    }

    public proto.message.LevelUpResponse getMsgLevelUpResponse() {
        return msgLevelUpResponse;
    }

    public boolean hasMsgLevelUpResponse() {
        return (__bitField0 & 32) == 32;
    }

    public ProfileMessage withMsgLevelUpResponse(proto.message.LevelUpResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgLevelUpResponse(value)
            .build();
    }

    public proto.message.GetUserInboxResponse getMsgGetUserInboxResponse() {
        return msgGetUserInboxResponse;
    }

    public boolean hasMsgGetUserInboxResponse() {
        return (__bitField0 & 64) == 64;
    }

    public ProfileMessage withMsgGetUserInboxResponse(proto.message.GetUserInboxResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgGetUserInboxResponse(value)
            .build();
    }

    public proto.message.UpdateProfileFBRequest getMsgUpdateProfileFBRequest() {
        return msgUpdateProfileFBRequest;
    }

    public boolean hasMsgUpdateProfileFBRequest() {
        return (__bitField0 & 128) == 128;
    }

    public ProfileMessage withMsgUpdateProfileFBRequest(proto.message.UpdateProfileFBRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgUpdateProfileFBRequest(value)
            .build();
    }

    public proto.message.UpdateProfileFBResponse getMsgUpdateProfileFBResponse() {
        return msgUpdateProfileFBResponse;
    }

    public boolean hasMsgUpdateProfileFBResponse() {
        return (__bitField0 & 256) == 256;
    }

    public ProfileMessage withMsgUpdateProfileFBResponse(proto.message.UpdateProfileFBResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgUpdateProfileFBResponse(value)
            .build();
    }

    public proto.message.UpdateUserNameRequest getMsgUpdateUserNameRequest() {
        return msgUpdateUserNameRequest;
    }

    public boolean hasMsgUpdateUserNameRequest() {
        return (__bitField0 & 512) == 512;
    }

    public ProfileMessage withMsgUpdateUserNameRequest(proto.message.UpdateUserNameRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgUpdateUserNameRequest(value)
            .build();
    }

    public proto.message.UpdateUserNameResponse getMsgUpdateUserNameResponse() {
        return msgUpdateUserNameResponse;
    }

    public boolean hasMsgUpdateUserNameResponse() {
        return (__bitField0 & 1024) == 1024;
    }

    public ProfileMessage withMsgUpdateUserNameResponse(proto.message.UpdateUserNameResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgUpdateUserNameResponse(value)
            .build();
    }

    public proto.message.ClaimInboxRequest getMsgClaimInboxRequest() {
        return msgClaimInboxRequest;
    }

    public boolean hasMsgClaimInboxRequest() {
        return (__bitField0 & 2048) == 2048;
    }

    public ProfileMessage withMsgClaimInboxRequest(proto.message.ClaimInboxRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgClaimInboxRequest(value)
            .build();
    }

    public proto.message.ClaimInboxResponse getMsgClaimInboxResponse() {
        return msgClaimInboxResponse;
    }

    public boolean hasMsgClaimInboxResponse() {
        return (__bitField0 & 4096) == 4096;
    }

    public ProfileMessage withMsgClaimInboxResponse(proto.message.ClaimInboxResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgClaimInboxResponse(value)
            .build();
    }

    public proto.message.FriendListRawResponse getMsgFriendListRawResponse() {
        return msgFriendListRawResponse;
    }

    public boolean hasMsgFriendListRawResponse() {
        return (__bitField0 & 8192) == 8192;
    }

    public ProfileMessage withMsgFriendListRawResponse(proto.message.FriendListRawResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgFriendListRawResponse(value)
            .build();
    }

    public proto.message.FriendListDetailRequest getMsgFriendListDetailRequest() {
        return msgFriendListDetailRequest;
    }

    public boolean hasMsgFriendListDetailRequest() {
        return (__bitField0 & 16384) == 16384;
    }

    public ProfileMessage withMsgFriendListDetailRequest(proto.message.FriendListDetailRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgFriendListDetailRequest(value)
            .build();
    }

    public proto.message.FriendListDetailResponse getMsgFriendListDetailResponse() {
        return msgFriendListDetailResponse;
    }

    public boolean hasMsgFriendListDetailResponse() {
        return (__bitField0 & 32768) == 32768;
    }

    public ProfileMessage withMsgFriendListDetailResponse(proto.message.FriendListDetailResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgFriendListDetailResponse(value)
            .build();
    }

    public proto.message.FriendActionRequest getMsgFriendActionRequest() {
        return msgFriendActionRequest;
    }

    public boolean hasMsgFriendActionRequest() {
        return (__bitField0 & 65536) == 65536;
    }

    public ProfileMessage withMsgFriendActionRequest(proto.message.FriendActionRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgFriendActionRequest(value)
            .build();
    }

    public proto.message.FriendActionResponse getMsgFriendActionResponse() {
        return msgFriendActionResponse;
    }

    public boolean hasMsgFriendActionResponse() {
        return (__bitField0 & 131072) == 131072;
    }

    public ProfileMessage withMsgFriendActionResponse(proto.message.FriendActionResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgFriendActionResponse(value)
            .build();
    }

    public proto.message.FriendSearchRequest getMsgFriendSearchRequest() {
        return msgFriendSearchRequest;
    }

    public boolean hasMsgFriendSearchRequest() {
        return (__bitField0 & 262144) == 262144;
    }

    public ProfileMessage withMsgFriendSearchRequest(proto.message.FriendSearchRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgFriendSearchRequest(value)
            .build();
    }

    public proto.message.FriendSearchResponse getMsgFriendSearchResponse() {
        return msgFriendSearchResponse;
    }

    public boolean hasMsgFriendSearchResponse() {
        return (__bitField0 & 524288) == 524288;
    }

    public ProfileMessage withMsgFriendSearchResponse(proto.message.FriendSearchResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgFriendSearchResponse(value)
            .build();
    }

    public proto.message.FriendUnlockMoneySendRequest getMsgFriendUnlockMoneySendRequest() {
        return msgFriendUnlockMoneySendRequest;
    }

    public boolean hasMsgFriendUnlockMoneySendRequest() {
        return (__bitField0 & 1048576) == 1048576;
    }

    public ProfileMessage withMsgFriendUnlockMoneySendRequest(proto.message.FriendUnlockMoneySendRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgFriendUnlockMoneySendRequest(value)
            .build();
    }

    public proto.message.FriendUnlockMoneySendResponse getMsgFriendUnlockMoneySendResponse() {
        return msgFriendUnlockMoneySendResponse;
    }

    public boolean hasMsgFriendUnlockMoneySendResponse() {
        return (__bitField0 & 2097152) == 2097152;
    }

    public ProfileMessage withMsgFriendUnlockMoneySendResponse(proto.message.FriendUnlockMoneySendResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgFriendUnlockMoneySendResponse(value)
            .build();
    }

    public proto.message.FriendMessageSendRequest getMsgFriendMessageSendRequest() {
        return msgFriendMessageSendRequest;
    }

    public boolean hasMsgFriendMessageSendRequest() {
        return (__bitField0 & 4194304) == 4194304;
    }

    public ProfileMessage withMsgFriendMessageSendRequest(proto.message.FriendMessageSendRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgFriendMessageSendRequest(value)
            .build();
    }

    public proto.message.DailyQuestInfoResponse getMsgDailyQuestInfoResponse() {
        return msgDailyQuestInfoResponse;
    }

    public boolean hasMsgDailyQuestInfoResponse() {
        return (__bitField0 & 8388608) == 8388608;
    }

    public ProfileMessage withMsgDailyQuestInfoResponse(proto.message.DailyQuestInfoResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgDailyQuestInfoResponse(value)
            .build();
    }

    public proto.message.DailyQuestReceiveRequest getMsgDailyQuestReceiveRequest() {
        return msgDailyQuestReceiveRequest;
    }

    public boolean hasMsgDailyQuestReceiveRequest() {
        return (__bitField0 & 16777216) == 16777216;
    }

    public ProfileMessage withMsgDailyQuestReceiveRequest(proto.message.DailyQuestReceiveRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgDailyQuestReceiveRequest(value)
            .build();
    }

    public proto.message.DailyQuestReceiveResponse getMsgDailyQuestReceiveResponse() {
        return msgDailyQuestReceiveResponse;
    }

    public boolean hasMsgDailyQuestReceiveResponse() {
        return (__bitField0 & 33554432) == 33554432;
    }

    public ProfileMessage withMsgDailyQuestReceiveResponse(proto.message.DailyQuestReceiveResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgDailyQuestReceiveResponse(value)
            .build();
    }

    public proto.message.DailySnsFriendInviteRequest getMsgDailySnsFriendInviteRequest() {
        return msgDailySnsFriendInviteRequest;
    }

    public boolean hasMsgDailySnsFriendInviteRequest() {
        return (__bitField0 & 67108864) == 67108864;
    }

    public ProfileMessage withMsgDailySnsFriendInviteRequest(proto.message.DailySnsFriendInviteRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgDailySnsFriendInviteRequest(value)
            .build();
    }

    public proto.message.DailySnsFriendInviteResponse getMsgDailySnsFriendInviteResponse() {
        return msgDailySnsFriendInviteResponse;
    }

    public boolean hasMsgDailySnsFriendInviteResponse() {
        return (__bitField0 & 134217728) == 134217728;
    }

    public ProfileMessage withMsgDailySnsFriendInviteResponse(proto.message.DailySnsFriendInviteResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgDailySnsFriendInviteResponse(value)
            .build();
    }

    public proto.message.GiftCodeRequest getMsgGiftCodeRequest() {
        return msgGiftCodeRequest;
    }

    public boolean hasMsgGiftCodeRequest() {
        return (__bitField0 & 268435456) == 268435456;
    }

    public ProfileMessage withMsgGiftCodeRequest(proto.message.GiftCodeRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgGiftCodeRequest(value)
            .build();
    }

    public proto.message.GiftCodeResponse getMsgGiftCodeResponse() {
        return msgGiftCodeResponse;
    }

    public boolean hasMsgGiftCodeResponse() {
        return (__bitField0 & 536870912) == 536870912;
    }

    public ProfileMessage withMsgGiftCodeResponse(proto.message.GiftCodeResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgGiftCodeResponse(value)
            .build();
    }

    public proto.message.GetUserInventoryResponse getMsgGetUserInventoryResponse() {
        return msgGetUserInventoryResponse;
    }

    public boolean hasMsgGetUserInventoryResponse() {
        return (__bitField0 & 1073741824) == 1073741824;
    }

    public ProfileMessage withMsgGetUserInventoryResponse(proto.message.GetUserInventoryResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgGetUserInventoryResponse(value)
            .build();
    }

    public proto.message.GetCannonDataResponse getMsgGetCannonDataResponse() {
        return msgGetCannonDataResponse;
    }

    public boolean hasMsgGetCannonDataResponse() {
        return (__bitField0 & -2147483648) == -2147483648;
    }

    public ProfileMessage withMsgGetCannonDataResponse(proto.message.GetCannonDataResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgGetCannonDataResponse(value)
            .build();
    }

    public proto.message.CannonUnlockRequest getMsgCannonUnlockRequest() {
        return msgCannonUnlockRequest;
    }

    public boolean hasMsgCannonUnlockRequest() {
        return (__bitField1 & 1) == 1;
    }

    public ProfileMessage withMsgCannonUnlockRequest(proto.message.CannonUnlockRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgCannonUnlockRequest(value)
            .build();
    }

    public proto.message.CannonUnlockResponse getMsgCannonUnlockResponse() {
        return msgCannonUnlockResponse;
    }

    public boolean hasMsgCannonUnlockResponse() {
        return (__bitField1 & 2) == 2;
    }

    public ProfileMessage withMsgCannonUnlockResponse(proto.message.CannonUnlockResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgCannonUnlockResponse(value)
            .build();
    }

    public proto.message.CannonUpgradeRequest getMsgCannonUpgradeRequest() {
        return msgCannonUpgradeRequest;
    }

    public boolean hasMsgCannonUpgradeRequest() {
        return (__bitField1 & 4) == 4;
    }

    public ProfileMessage withMsgCannonUpgradeRequest(proto.message.CannonUpgradeRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgCannonUpgradeRequest(value)
            .build();
    }

    public proto.message.CannonUpgradeResponse getMsgCannonUpgradeResponse() {
        return msgCannonUpgradeResponse;
    }

    public boolean hasMsgCannonUpgradeResponse() {
        return (__bitField1 & 8) == 8;
    }

    public ProfileMessage withMsgCannonUpgradeResponse(proto.message.CannonUpgradeResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgCannonUpgradeResponse(value)
            .build();
    }

    public long getClienttime() {
        return clienttime;
    }

    public boolean hasClienttime() {
        return (__bitField1 & 16) == 16;
    }

    public ProfileMessage withClienttime(long value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setClienttime(value)
            .build();
    }

    public proto.message.WheelEnterRequest getMsgWheelEnterRequest() {
        return msgWheelEnterRequest;
    }

    public boolean hasMsgWheelEnterRequest() {
        return (__bitField1 & 32) == 32;
    }

    public ProfileMessage withMsgWheelEnterRequest(proto.message.WheelEnterRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgWheelEnterRequest(value)
            .build();
    }

    public proto.message.WheelEnterResponse getMsgWheelEnterResponse() {
        return msgWheelEnterResponse;
    }

    public boolean hasMsgWheelEnterResponse() {
        return (__bitField1 & 64) == 64;
    }

    public ProfileMessage withMsgWheelEnterResponse(proto.message.WheelEnterResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgWheelEnterResponse(value)
            .build();
    }

    public proto.message.WheelLeaveRequest getMsgWheelLeaveRequest() {
        return msgWheelLeaveRequest;
    }

    public boolean hasMsgWheelLeaveRequest() {
        return (__bitField1 & 128) == 128;
    }

    public ProfileMessage withMsgWheelLeaveRequest(proto.message.WheelLeaveRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgWheelLeaveRequest(value)
            .build();
    }

    public proto.message.WheelLeaveResponse getMsgWheelLeaveResponse() {
        return msgWheelLeaveResponse;
    }

    public boolean hasMsgWheelLeaveResponse() {
        return (__bitField1 & 256) == 256;
    }

    public ProfileMessage withMsgWheelLeaveResponse(proto.message.WheelLeaveResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgWheelLeaveResponse(value)
            .build();
    }

    public proto.message.WheelTurnRequest getMsgWheelTurnRequest() {
        return msgWheelTurnRequest;
    }

    public boolean hasMsgWheelTurnRequest() {
        return (__bitField1 & 512) == 512;
    }

    public ProfileMessage withMsgWheelTurnRequest(proto.message.WheelTurnRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgWheelTurnRequest(value)
            .build();
    }

    public proto.message.WheelTurnResponse getMsgWheelTurnResponse() {
        return msgWheelTurnResponse;
    }

    public boolean hasMsgWheelTurnResponse() {
        return (__bitField1 & 1024) == 1024;
    }

    public ProfileMessage withMsgWheelTurnResponse(proto.message.WheelTurnResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgWheelTurnResponse(value)
            .build();
    }

    public proto.message.WheelGetRequest getMsgWheelGetRequest() {
        return msgWheelGetRequest;
    }

    public boolean hasMsgWheelGetRequest() {
        return (__bitField1 & 2048) == 2048;
    }

    public ProfileMessage withMsgWheelGetRequest(proto.message.WheelGetRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgWheelGetRequest(value)
            .build();
    }

    public proto.message.WheelGetResponse getMsgWheelGetResponse() {
        return msgWheelGetResponse;
    }

    public boolean hasMsgWheelGetResponse() {
        return (__bitField1 & 4096) == 4096;
    }

    public ProfileMessage withMsgWheelGetResponse(proto.message.WheelGetResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgWheelGetResponse(value)
            .build();
    }

    public proto.message.WheelIngameRequest getMsgWheelIngameRequest() {
        return msgWheelIngameRequest;
    }

    public boolean hasMsgWheelIngameRequest() {
        return (__bitField1 & 8192) == 8192;
    }

    public ProfileMessage withMsgWheelIngameRequest(proto.message.WheelIngameRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgWheelIngameRequest(value)
            .build();
    }

    public proto.message.WheelIngameResponse getMsgWheelIngameResponse() {
        return msgWheelIngameResponse;
    }

    public boolean hasMsgWheelIngameResponse() {
        return (__bitField1 & 16384) == 16384;
    }

    public ProfileMessage withMsgWheelIngameResponse(proto.message.WheelIngameResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgWheelIngameResponse(value)
            .build();
    }

    public proto.message.WheelCarrierRequest getMsgWheelCarrierRequest() {
        return msgWheelCarrierRequest;
    }

    public boolean hasMsgWheelCarrierRequest() {
        return (__bitField1 & 32768) == 32768;
    }

    public ProfileMessage withMsgWheelCarrierRequest(proto.message.WheelCarrierRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgWheelCarrierRequest(value)
            .build();
    }

    public proto.message.WheelCarrierResponse getMsgWheelCarrierResponse() {
        return msgWheelCarrierResponse;
    }

    public boolean hasMsgWheelCarrierResponse() {
        return (__bitField1 & 65536) == 65536;
    }

    public ProfileMessage withMsgWheelCarrierResponse(proto.message.WheelCarrierResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgWheelCarrierResponse(value)
            .build();
    }

    public proto.message.SoccerTeamsResponse getMsgSoccerTeamsResponse() {
        return msgSoccerTeamsResponse;
    }

    public boolean hasMsgSoccerTeamsResponse() {
        return (__bitField1 & 131072) == 131072;
    }

    public ProfileMessage withMsgSoccerTeamsResponse(proto.message.SoccerTeamsResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgSoccerTeamsResponse(value)
            .build();
    }

    public proto.message.SoccerEnterRequest getMsgSoccerEnterRequest() {
        return msgSoccerEnterRequest;
    }

    public boolean hasMsgSoccerEnterRequest() {
        return (__bitField1 & 262144) == 262144;
    }

    public ProfileMessage withMsgSoccerEnterRequest(proto.message.SoccerEnterRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgSoccerEnterRequest(value)
            .build();
    }

    public proto.message.SoccerEnterResponse getMsgSoccerEnterResponse() {
        return msgSoccerEnterResponse;
    }

    public boolean hasMsgSoccerEnterResponse() {
        return (__bitField1 & 524288) == 524288;
    }

    public ProfileMessage withMsgSoccerEnterResponse(proto.message.SoccerEnterResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgSoccerEnterResponse(value)
            .build();
    }

    public proto.message.SoccerMatchesRequest getMsgSoccerMatchesRequest() {
        return msgSoccerMatchesRequest;
    }

    public boolean hasMsgSoccerMatchesRequest() {
        return (__bitField1 & 1048576) == 1048576;
    }

    public ProfileMessage withMsgSoccerMatchesRequest(proto.message.SoccerMatchesRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgSoccerMatchesRequest(value)
            .build();
    }

    public proto.message.SoccerMatchesResponse getMsgSoccerMatchesResponse() {
        return msgSoccerMatchesResponse;
    }

    public boolean hasMsgSoccerMatchesResponse() {
        return (__bitField1 & 2097152) == 2097152;
    }

    public ProfileMessage withMsgSoccerMatchesResponse(proto.message.SoccerMatchesResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgSoccerMatchesResponse(value)
            .build();
    }

    public proto.message.SoccerBetRequest getMsgSoccerBetRequest() {
        return msgSoccerBetRequest;
    }

    public boolean hasMsgSoccerBetRequest() {
        return (__bitField1 & 4194304) == 4194304;
    }

    public ProfileMessage withMsgSoccerBetRequest(proto.message.SoccerBetRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgSoccerBetRequest(value)
            .build();
    }

    public proto.message.SoccerBetResponse getMsgSoccerBetResponse() {
        return msgSoccerBetResponse;
    }

    public boolean hasMsgSoccerBetResponse() {
        return (__bitField1 & 8388608) == 8388608;
    }

    public ProfileMessage withMsgSoccerBetResponse(proto.message.SoccerBetResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgSoccerBetResponse(value)
            .build();
    }

    public proto.message.SoccerBetCountResponse getMsgSoccerBetCountResponse() {
        return msgSoccerBetCountResponse;
    }

    public boolean hasMsgSoccerBetCountResponse() {
        return (__bitField1 & 16777216) == 16777216;
    }

    public ProfileMessage withMsgSoccerBetCountResponse(proto.message.SoccerBetCountResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgSoccerBetCountResponse(value)
            .build();
    }

    public proto.message.SoccerReceiveRequest getMsgSoccerReceiveRequest() {
        return msgSoccerReceiveRequest;
    }

    public boolean hasMsgSoccerReceiveRequest() {
        return (__bitField1 & 33554432) == 33554432;
    }

    public ProfileMessage withMsgSoccerReceiveRequest(proto.message.SoccerReceiveRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgSoccerReceiveRequest(value)
            .build();
    }

    public proto.message.SoccerReceiveResponse getMsgSoccerReceiveResponse() {
        return msgSoccerReceiveResponse;
    }

    public boolean hasMsgSoccerReceiveResponse() {
        return (__bitField1 & 67108864) == 67108864;
    }

    public ProfileMessage withMsgSoccerReceiveResponse(proto.message.SoccerReceiveResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgSoccerReceiveResponse(value)
            .build();
    }

    public proto.message.SoccerReddotRequest getMsgSoccerReddotRequest() {
        return msgSoccerReddotRequest;
    }

    public boolean hasMsgSoccerReddotRequest() {
        return (__bitField1 & 134217728) == 134217728;
    }

    public ProfileMessage withMsgSoccerReddotRequest(proto.message.SoccerReddotRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgSoccerReddotRequest(value)
            .build();
    }

    public proto.message.SoccerReddotResponse getMsgSoccerReddotResponse() {
        return msgSoccerReddotResponse;
    }

    public boolean hasMsgSoccerReddotResponse() {
        return (__bitField1 & 268435456) == 268435456;
    }

    public ProfileMessage withMsgSoccerReddotResponse(proto.message.SoccerReddotResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgSoccerReddotResponse(value)
            .build();
    }

    public proto.message.PetInfoRequest getMsgPetInfoRequest() {
        return msgPetInfoRequest;
    }

    public boolean hasMsgPetInfoRequest() {
        return (__bitField1 & 536870912) == 536870912;
    }

    public ProfileMessage withMsgPetInfoRequest(proto.message.PetInfoRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgPetInfoRequest(value)
            .build();
    }

    public proto.message.PetInfoResponse getMsgPetInfoResponse() {
        return msgPetInfoResponse;
    }

    public boolean hasMsgPetInfoResponse() {
        return (__bitField1 & 1073741824) == 1073741824;
    }

    public ProfileMessage withMsgPetInfoResponse(proto.message.PetInfoResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgPetInfoResponse(value)
            .build();
    }

    public proto.message.PetUpdateResponse getMsgPetUpdateResponse() {
        return msgPetUpdateResponse;
    }

    public boolean hasMsgPetUpdateResponse() {
        return (__bitField1 & -2147483648) == -2147483648;
    }

    public ProfileMessage withMsgPetUpdateResponse(proto.message.PetUpdateResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgPetUpdateResponse(value)
            .build();
    }

    public proto.message.PetUnlockRequest getMsgPetUnlockRequest() {
        return msgPetUnlockRequest;
    }

    public boolean hasMsgPetUnlockRequest() {
        return (__bitField2 & 1) == 1;
    }

    public ProfileMessage withMsgPetUnlockRequest(proto.message.PetUnlockRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgPetUnlockRequest(value)
            .build();
    }

    public proto.message.PetUnlockResponse getMsgPetUnlockResponse() {
        return msgPetUnlockResponse;
    }

    public boolean hasMsgPetUnlockResponse() {
        return (__bitField2 & 2) == 2;
    }

    public ProfileMessage withMsgPetUnlockResponse(proto.message.PetUnlockResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgPetUnlockResponse(value)
            .build();
    }

    public proto.message.PetGiftReceiveRequest getMsgPetGiftReceiveRequest() {
        return msgPetGiftReceiveRequest;
    }

    public boolean hasMsgPetGiftReceiveRequest() {
        return (__bitField2 & 4) == 4;
    }

    public ProfileMessage withMsgPetGiftReceiveRequest(proto.message.PetGiftReceiveRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgPetGiftReceiveRequest(value)
            .build();
    }

    public proto.message.PetGiftReceiveResponse getMsgPetGiftReceiveResponse() {
        return msgPetGiftReceiveResponse;
    }

    public boolean hasMsgPetGiftReceiveResponse() {
        return (__bitField2 & 8) == 8;
    }

    public ProfileMessage withMsgPetGiftReceiveResponse(proto.message.PetGiftReceiveResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgPetGiftReceiveResponse(value)
            .build();
    }

    public proto.message.PetGiftAskingResponse getMsgPetGiftAskingResponse() {
        return msgPetGiftAskingResponse;
    }

    public boolean hasMsgPetGiftAskingResponse() {
        return (__bitField2 & 16) == 16;
    }

    public ProfileMessage withMsgPetGiftAskingResponse(proto.message.PetGiftAskingResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgPetGiftAskingResponse(value)
            .build();
    }

    public proto.message.ClientActionLogRequest getMsgClientActionLogRequest() {
        return msgClientActionLogRequest;
    }

    public boolean hasMsgClientActionLogRequest() {
        return (__bitField2 & 32) == 32;
    }

    public ProfileMessage withMsgClientActionLogRequest(proto.message.ClientActionLogRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgClientActionLogRequest(value)
            .build();
    }

    public proto.message.AdsViewRequest getMsgAdsViewRequest() {
        return msgAdsViewRequest;
    }

    public boolean hasMsgAdsViewRequest() {
        return (__bitField2 & 64) == 64;
    }

    public ProfileMessage withMsgAdsViewRequest(proto.message.AdsViewRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgAdsViewRequest(value)
            .build();
    }

    public proto.message.AdsViewResponse getMsgAdsViewResponse() {
        return msgAdsViewResponse;
    }

    public boolean hasMsgAdsViewResponse() {
        return (__bitField2 & 128) == 128;
    }

    public ProfileMessage withMsgAdsViewResponse(proto.message.AdsViewResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgAdsViewResponse(value)
            .build();
    }

    public proto.message.PetLevelUpResponse getMsgPetLevelUpResponse() {
        return msgPetLevelUpResponse;
    }

    public boolean hasMsgPetLevelUpResponse() {
        return (__bitField2 & 256) == 256;
    }

    public ProfileMessage withMsgPetLevelUpResponse(proto.message.PetLevelUpResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgPetLevelUpResponse(value)
            .build();
    }

    public proto.message.DailySupportResponse getMsgDailySupportResponse() {
        return msgDailySupportResponse;
    }

    public boolean hasMsgDailySupportResponse() {
        return (__bitField2 & 512) == 512;
    }

    public ProfileMessage withMsgDailySupportResponse(proto.message.DailySupportResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgDailySupportResponse(value)
            .build();
    }

    public proto.message.DailyBonusRequest getMsgDailyBonusRequest() {
        return msgDailyBonusRequest;
    }

    public boolean hasMsgDailyBonusRequest() {
        return (__bitField2 & 1024) == 1024;
    }

    public ProfileMessage withMsgDailyBonusRequest(proto.message.DailyBonusRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgDailyBonusRequest(value)
            .build();
    }

    public proto.message.DailyBonusResponse getMsgDailyBonusResponse() {
        return msgDailyBonusResponse;
    }

    public boolean hasMsgDailyBonusResponse() {
        return (__bitField2 & 2048) == 2048;
    }

    public ProfileMessage withMsgDailyBonusResponse(proto.message.DailyBonusResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgDailyBonusResponse(value)
            .build();
    }

    public proto.message.ClaimDailyBonusRequest getMsgClaimDailyBonusRequest() {
        return msgClaimDailyBonusRequest;
    }

    public boolean hasMsgClaimDailyBonusRequest() {
        return (__bitField2 & 4096) == 4096;
    }

    public ProfileMessage withMsgClaimDailyBonusRequest(proto.message.ClaimDailyBonusRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgClaimDailyBonusRequest(value)
            .build();
    }

    public proto.message.ClaimDailyBonusResponse getMsgClaimDailyBonusResponse() {
        return msgClaimDailyBonusResponse;
    }

    public boolean hasMsgClaimDailyBonusResponse() {
        return (__bitField2 & 8192) == 8192;
    }

    public ProfileMessage withMsgClaimDailyBonusResponse(proto.message.ClaimDailyBonusResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgClaimDailyBonusResponse(value)
            .build();
    }

    public proto.message.CollectionInfoRequest getMsgCollectionInfoRequest() {
        return msgCollectionInfoRequest;
    }

    public boolean hasMsgCollectionInfoRequest() {
        return (__bitField2 & 16384) == 16384;
    }

    public ProfileMessage withMsgCollectionInfoRequest(proto.message.CollectionInfoRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgCollectionInfoRequest(value)
            .build();
    }

    public proto.message.CollectionInfoResponse getMsgCollectionInfoResponse() {
        return msgCollectionInfoResponse;
    }

    public boolean hasMsgCollectionInfoResponse() {
        return (__bitField2 & 32768) == 32768;
    }

    public ProfileMessage withMsgCollectionInfoResponse(proto.message.CollectionInfoResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgCollectionInfoResponse(value)
            .build();
    }

    public proto.message.ClaimCollectionPrizeRequest getMsgClaimCollectionPrizeRequest() {
        return msgClaimCollectionPrizeRequest;
    }

    public boolean hasMsgClaimCollectionPrizeRequest() {
        return (__bitField2 & 65536) == 65536;
    }

    public ProfileMessage withMsgClaimCollectionPrizeRequest(proto.message.ClaimCollectionPrizeRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgClaimCollectionPrizeRequest(value)
            .build();
    }

    public proto.message.ClaimCollectionPrizeResponse getMsgClaimCollectionPrizeResponse() {
        return msgClaimCollectionPrizeResponse;
    }

    public boolean hasMsgClaimCollectionPrizeResponse() {
        return (__bitField2 & 131072) == 131072;
    }

    public ProfileMessage withMsgClaimCollectionPrizeResponse(proto.message.ClaimCollectionPrizeResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgClaimCollectionPrizeResponse(value)
            .build();
    }

    public proto.message.DonateFriendListDetailRequest getMsgDonateFriendListDetailRequest() {
        return msgDonateFriendListDetailRequest;
    }

    public boolean hasMsgDonateFriendListDetailRequest() {
        return (__bitField2 & 262144) == 262144;
    }

    public ProfileMessage withMsgDonateFriendListDetailRequest(proto.message.DonateFriendListDetailRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgDonateFriendListDetailRequest(value)
            .build();
    }

    public proto.message.DonateFriendListDetailResponse getMsgDonateFriendListDetailResponse() {
        return msgDonateFriendListDetailResponse;
    }

    public boolean hasMsgDonateFriendListDetailResponse() {
        return (__bitField2 & 524288) == 524288;
    }

    public ProfileMessage withMsgDonateFriendListDetailResponse(proto.message.DonateFriendListDetailResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgDonateFriendListDetailResponse(value)
            .build();
    }

    public proto.message.DonateFriendReceiveItemsRequest getMsgDonateFriendReceiveItemsRequest() {
        return msgDonateFriendReceiveItemsRequest;
    }

    public boolean hasMsgDonateFriendReceiveItemsRequest() {
        return (__bitField2 & 1048576) == 1048576;
    }

    public ProfileMessage withMsgDonateFriendReceiveItemsRequest(proto.message.DonateFriendReceiveItemsRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgDonateFriendReceiveItemsRequest(value)
            .build();
    }

    public proto.message.DonateFriendReceiveItemsResponse getMsgDonateFriendReceiveItemsResponse() {
        return msgDonateFriendReceiveItemsResponse;
    }

    public boolean hasMsgDonateFriendReceiveItemsResponse() {
        return (__bitField2 & 2097152) == 2097152;
    }

    public ProfileMessage withMsgDonateFriendReceiveItemsResponse(proto.message.DonateFriendReceiveItemsResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgDonateFriendReceiveItemsResponse(value)
            .build();
    }

    public proto.message.DonateFriendSendItemsRequest getMsgDonateFriendSendItemsRequest() {
        return msgDonateFriendSendItemsRequest;
    }

    public boolean hasMsgDonateFriendSendItemsRequest() {
        return (__bitField2 & 4194304) == 4194304;
    }

    public ProfileMessage withMsgDonateFriendSendItemsRequest(proto.message.DonateFriendSendItemsRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgDonateFriendSendItemsRequest(value)
            .build();
    }

    public proto.message.DonateFriendSendItemsResponse getMsgDonateFriendSendItemsResponse() {
        return msgDonateFriendSendItemsResponse;
    }

    public boolean hasMsgDonateFriendSendItemsResponse() {
        return (__bitField2 & 8388608) == 8388608;
    }

    public ProfileMessage withMsgDonateFriendSendItemsResponse(proto.message.DonateFriendSendItemsResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgDonateFriendSendItemsResponse(value)
            .build();
    }

    public proto.message.DonateFriendCheckGiftRequest getMsgDonateFriendCheckGiftRequest() {
        return msgDonateFriendCheckGiftRequest;
    }

    public boolean hasMsgDonateFriendCheckGiftRequest() {
        return (__bitField2 & 16777216) == 16777216;
    }

    public ProfileMessage withMsgDonateFriendCheckGiftRequest(proto.message.DonateFriendCheckGiftRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgDonateFriendCheckGiftRequest(value)
            .build();
    }

    public proto.message.DonateFriendCheckGiftResponse getMsgDonateFriendCheckGiftResponse() {
        return msgDonateFriendCheckGiftResponse;
    }

    public boolean hasMsgDonateFriendCheckGiftResponse() {
        return (__bitField2 & 33554432) == 33554432;
    }

    public ProfileMessage withMsgDonateFriendCheckGiftResponse(proto.message.DonateFriendCheckGiftResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgDonateFriendCheckGiftResponse(value)
            .build();
    }

    public proto.message.DonateListFriendSendItemsRequest getMsgDonateListFriendSendItemsRequest() {
        return msgDonateListFriendSendItemsRequest;
    }

    public boolean hasMsgDonateListFriendSendItemsRequest() {
        return (__bitField2 & 67108864) == 67108864;
    }

    public ProfileMessage withMsgDonateListFriendSendItemsRequest(proto.message.DonateListFriendSendItemsRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgDonateListFriendSendItemsRequest(value)
            .build();
    }

    public proto.message.DonateListFriendSendItemsResponse getMsgDonateListFriendSendItemsResponse() {
        return msgDonateListFriendSendItemsResponse;
    }

    public boolean hasMsgDonateListFriendSendItemsResponse() {
        return (__bitField2 & 134217728) == 134217728;
    }

    public ProfileMessage withMsgDonateListFriendSendItemsResponse(proto.message.DonateListFriendSendItemsResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgDonateListFriendSendItemsResponse(value)
            .build();
    }

    public proto.message.AccumulatePromotionRequest getMsgAccumulatePromotionRequest() {
        return msgAccumulatePromotionRequest;
    }

    public boolean hasMsgAccumulatePromotionRequest() {
        return (__bitField2 & 268435456) == 268435456;
    }

    public ProfileMessage withMsgAccumulatePromotionRequest(proto.message.AccumulatePromotionRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgAccumulatePromotionRequest(value)
            .build();
    }

    public proto.message.AccumulatePromotionResponse getMsgAccumulatePromotionResponse() {
        return msgAccumulatePromotionResponse;
    }

    public boolean hasMsgAccumulatePromotionResponse() {
        return (__bitField2 & 536870912) == 536870912;
    }

    public ProfileMessage withMsgAccumulatePromotionResponse(proto.message.AccumulatePromotionResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgAccumulatePromotionResponse(value)
            .build();
    }

    public proto.message.AccumulateClaimRequest getMsgAccumulateClaimRequest() {
        return msgAccumulateClaimRequest;
    }

    public boolean hasMsgAccumulateClaimRequest() {
        return (__bitField2 & 1073741824) == 1073741824;
    }

    public ProfileMessage withMsgAccumulateClaimRequest(proto.message.AccumulateClaimRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgAccumulateClaimRequest(value)
            .build();
    }

    public proto.message.AccumulateClaimResponse getMsgAccumulateClaimResponse() {
        return msgAccumulateClaimResponse;
    }

    public boolean hasMsgAccumulateClaimResponse() {
        return (__bitField2 & -2147483648) == -2147483648;
    }

    public ProfileMessage withMsgAccumulateClaimResponse(proto.message.AccumulateClaimResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgAccumulateClaimResponse(value)
            .build();
    }

    public proto.message.LeaderBoardRequest getMsgLeaderBoardRequest() {
        return msgLeaderBoardRequest;
    }

    public boolean hasMsgLeaderBoardRequest() {
        return (__bitField3 & 1) == 1;
    }

    public ProfileMessage withMsgLeaderBoardRequest(proto.message.LeaderBoardRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgLeaderBoardRequest(value)
            .build();
    }

    public proto.message.LeaderBoardResponse getMsgLeaderBoardResponse() {
        return msgLeaderBoardResponse;
    }

    public boolean hasMsgLeaderBoardResponse() {
        return (__bitField3 & 2) == 2;
    }

    public ProfileMessage withMsgLeaderBoardResponse(proto.message.LeaderBoardResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgLeaderBoardResponse(value)
            .build();
    }

    public proto.message.ArchiveCollectionRequest getMsgArchiveCollectionRequest() {
        return msgArchiveCollectionRequest;
    }

    public boolean hasMsgArchiveCollectionRequest() {
        return (__bitField3 & 4) == 4;
    }

    public ProfileMessage withMsgArchiveCollectionRequest(proto.message.ArchiveCollectionRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgArchiveCollectionRequest(value)
            .build();
    }

    public proto.message.ArchiveCollectionResponse getMsgArchiveCollectionResponse() {
        return msgArchiveCollectionResponse;
    }

    public boolean hasMsgArchiveCollectionResponse() {
        return (__bitField3 & 8) == 8;
    }

    public ProfileMessage withMsgArchiveCollectionResponse(proto.message.ArchiveCollectionResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgArchiveCollectionResponse(value)
            .build();
    }

    public proto.message.AdsInfoRequest getMsgAdsInfoRequest() {
        return msgAdsInfoRequest;
    }

    public boolean hasMsgAdsInfoRequest() {
        return (__bitField3 & 16) == 16;
    }

    public ProfileMessage withMsgAdsInfoRequest(proto.message.AdsInfoRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgAdsInfoRequest(value)
            .build();
    }

    public proto.message.AdsInfoResponse getMsgAdsInfoResponse() {
        return msgAdsInfoResponse;
    }

    public boolean hasMsgAdsInfoResponse() {
        return (__bitField3 & 32) == 32;
    }

    public ProfileMessage withMsgAdsInfoResponse(proto.message.AdsInfoResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgAdsInfoResponse(value)
            .build();
    }

    public proto.message.AdsRewardClaimRequest getMsgAdsRewardClaimRequest() {
        return msgAdsRewardClaimRequest;
    }

    public boolean hasMsgAdsRewardClaimRequest() {
        return (__bitField3 & 64) == 64;
    }

    public ProfileMessage withMsgAdsRewardClaimRequest(proto.message.AdsRewardClaimRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgAdsRewardClaimRequest(value)
            .build();
    }

    public proto.message.H3EnterRequest getMsgH3EnterRequest() {
        return msgH3EnterRequest;
    }

    public boolean hasMsgH3EnterRequest() {
        return (__bitField3 & 128) == 128;
    }

    public ProfileMessage withMsgH3EnterRequest(proto.message.H3EnterRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgH3EnterRequest(value)
            .build();
    }

    public proto.message.H3EnterResponse getMsgH3EnterResponse() {
        return msgH3EnterResponse;
    }

    public boolean hasMsgH3EnterResponse() {
        return (__bitField3 & 256) == 256;
    }

    public ProfileMessage withMsgH3EnterResponse(proto.message.H3EnterResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgH3EnterResponse(value)
            .build();
    }

    public proto.message.H3LeaveRequest getMsgH3LeaveRequest() {
        return msgH3LeaveRequest;
    }

    public boolean hasMsgH3LeaveRequest() {
        return (__bitField3 & 512) == 512;
    }

    public ProfileMessage withMsgH3LeaveRequest(proto.message.H3LeaveRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgH3LeaveRequest(value)
            .build();
    }

    public proto.message.H3LeaveResponse getMsgH3LeaveResponse() {
        return msgH3LeaveResponse;
    }

    public boolean hasMsgH3LeaveResponse() {
        return (__bitField3 & 1024) == 1024;
    }

    public ProfileMessage withMsgH3LeaveResponse(proto.message.H3LeaveResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgH3LeaveResponse(value)
            .build();
    }

    public proto.message.H3TurnRequest getMsgH3TurnRequest() {
        return msgH3TurnRequest;
    }

    public boolean hasMsgH3TurnRequest() {
        return (__bitField3 & 2048) == 2048;
    }

    public ProfileMessage withMsgH3TurnRequest(proto.message.H3TurnRequest value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgH3TurnRequest(value)
            .build();
    }

    public proto.message.H3TurnResponse getMsgH3TurnResponse() {
        return msgH3TurnResponse;
    }

    public boolean hasMsgH3TurnResponse() {
        return (__bitField3 & 4096) == 4096;
    }

    public ProfileMessage withMsgH3TurnResponse(proto.message.H3TurnResponse value) {
        return ProfileMessage.newBuilder()
            .mergeFrom(this)
            .setMsgH3TurnResponse(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<ProfileMessage> cachedSchema() {
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
        ProfileMessage that = (ProfileMessage) obj;
        if (!java.util.Objects.equals(this.command, that.command)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgGetUserMoneyRequest, that.msgGetUserMoneyRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgGetUserMoneyResponse, that.msgGetUserMoneyResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgGetUserProfileRequest, that.msgGetUserProfileRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgGetUserProfileResponse, that.msgGetUserProfileResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgLevelUpResponse, that.msgLevelUpResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgGetUserInboxResponse, that.msgGetUserInboxResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgUpdateProfileFBRequest, that.msgUpdateProfileFBRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgUpdateProfileFBResponse, that.msgUpdateProfileFBResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgUpdateUserNameRequest, that.msgUpdateUserNameRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgUpdateUserNameResponse, that.msgUpdateUserNameResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgClaimInboxRequest, that.msgClaimInboxRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgClaimInboxResponse, that.msgClaimInboxResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgFriendListRawResponse, that.msgFriendListRawResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgFriendListDetailRequest, that.msgFriendListDetailRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgFriendListDetailResponse, that.msgFriendListDetailResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgFriendActionRequest, that.msgFriendActionRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgFriendActionResponse, that.msgFriendActionResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgFriendSearchRequest, that.msgFriendSearchRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgFriendSearchResponse, that.msgFriendSearchResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgFriendUnlockMoneySendRequest, that.msgFriendUnlockMoneySendRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgFriendUnlockMoneySendResponse, that.msgFriendUnlockMoneySendResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgFriendMessageSendRequest, that.msgFriendMessageSendRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgDailyQuestInfoResponse, that.msgDailyQuestInfoResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgDailyQuestReceiveRequest, that.msgDailyQuestReceiveRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgDailyQuestReceiveResponse, that.msgDailyQuestReceiveResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgDailySnsFriendInviteRequest, that.msgDailySnsFriendInviteRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgDailySnsFriendInviteResponse, that.msgDailySnsFriendInviteResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgGiftCodeRequest, that.msgGiftCodeRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgGiftCodeResponse, that.msgGiftCodeResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgGetUserInventoryResponse, that.msgGetUserInventoryResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgGetCannonDataResponse, that.msgGetCannonDataResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgCannonUnlockRequest, that.msgCannonUnlockRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgCannonUnlockResponse, that.msgCannonUnlockResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgCannonUpgradeRequest, that.msgCannonUpgradeRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgCannonUpgradeResponse, that.msgCannonUpgradeResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.clienttime, that.clienttime)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgWheelEnterRequest, that.msgWheelEnterRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgWheelEnterResponse, that.msgWheelEnterResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgWheelLeaveRequest, that.msgWheelLeaveRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgWheelLeaveResponse, that.msgWheelLeaveResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgWheelTurnRequest, that.msgWheelTurnRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgWheelTurnResponse, that.msgWheelTurnResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgWheelGetRequest, that.msgWheelGetRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgWheelGetResponse, that.msgWheelGetResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgWheelIngameRequest, that.msgWheelIngameRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgWheelIngameResponse, that.msgWheelIngameResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgWheelCarrierRequest, that.msgWheelCarrierRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgWheelCarrierResponse, that.msgWheelCarrierResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgSoccerTeamsResponse, that.msgSoccerTeamsResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgSoccerEnterRequest, that.msgSoccerEnterRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgSoccerEnterResponse, that.msgSoccerEnterResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgSoccerMatchesRequest, that.msgSoccerMatchesRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgSoccerMatchesResponse, that.msgSoccerMatchesResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgSoccerBetRequest, that.msgSoccerBetRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgSoccerBetResponse, that.msgSoccerBetResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgSoccerBetCountResponse, that.msgSoccerBetCountResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgSoccerReceiveRequest, that.msgSoccerReceiveRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgSoccerReceiveResponse, that.msgSoccerReceiveResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgSoccerReddotRequest, that.msgSoccerReddotRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgSoccerReddotResponse, that.msgSoccerReddotResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgPetInfoRequest, that.msgPetInfoRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgPetInfoResponse, that.msgPetInfoResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgPetUpdateResponse, that.msgPetUpdateResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgPetUnlockRequest, that.msgPetUnlockRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgPetUnlockResponse, that.msgPetUnlockResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgPetGiftReceiveRequest, that.msgPetGiftReceiveRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgPetGiftReceiveResponse, that.msgPetGiftReceiveResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgPetGiftAskingResponse, that.msgPetGiftAskingResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgClientActionLogRequest, that.msgClientActionLogRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgAdsViewRequest, that.msgAdsViewRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgAdsViewResponse, that.msgAdsViewResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgPetLevelUpResponse, that.msgPetLevelUpResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgDailySupportResponse, that.msgDailySupportResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgDailyBonusRequest, that.msgDailyBonusRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgDailyBonusResponse, that.msgDailyBonusResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgClaimDailyBonusRequest, that.msgClaimDailyBonusRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgClaimDailyBonusResponse, that.msgClaimDailyBonusResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgCollectionInfoRequest, that.msgCollectionInfoRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgCollectionInfoResponse, that.msgCollectionInfoResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgClaimCollectionPrizeRequest, that.msgClaimCollectionPrizeRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgClaimCollectionPrizeResponse, that.msgClaimCollectionPrizeResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgDonateFriendListDetailRequest, that.msgDonateFriendListDetailRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgDonateFriendListDetailResponse, that.msgDonateFriendListDetailResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgDonateFriendReceiveItemsRequest, that.msgDonateFriendReceiveItemsRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgDonateFriendReceiveItemsResponse, that.msgDonateFriendReceiveItemsResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgDonateFriendSendItemsRequest, that.msgDonateFriendSendItemsRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgDonateFriendSendItemsResponse, that.msgDonateFriendSendItemsResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgDonateFriendCheckGiftRequest, that.msgDonateFriendCheckGiftRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgDonateFriendCheckGiftResponse, that.msgDonateFriendCheckGiftResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgDonateListFriendSendItemsRequest, that.msgDonateListFriendSendItemsRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgDonateListFriendSendItemsResponse, that.msgDonateListFriendSendItemsResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgAccumulatePromotionRequest, that.msgAccumulatePromotionRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgAccumulatePromotionResponse, that.msgAccumulatePromotionResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgAccumulateClaimRequest, that.msgAccumulateClaimRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgAccumulateClaimResponse, that.msgAccumulateClaimResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgLeaderBoardRequest, that.msgLeaderBoardRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgLeaderBoardResponse, that.msgLeaderBoardResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgArchiveCollectionRequest, that.msgArchiveCollectionRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgArchiveCollectionResponse, that.msgArchiveCollectionResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgAdsInfoRequest, that.msgAdsInfoRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgAdsInfoResponse, that.msgAdsInfoResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgAdsRewardClaimRequest, that.msgAdsRewardClaimRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgH3EnterRequest, that.msgH3EnterRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgH3EnterResponse, that.msgH3EnterResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgH3LeaveRequest, that.msgH3LeaveRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgH3LeaveResponse, that.msgH3LeaveResponse)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgH3TurnRequest, that.msgH3TurnRequest)) {
            return false;
        }
        if (!java.util.Objects.equals(this.msgH3TurnResponse, that.msgH3TurnResponse)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Integer.hashCode(this.command);
        result = 31 * result + (this.msgGetUserMoneyRequest == null ? 0 : this.msgGetUserMoneyRequest.hashCode());
        result = 31 * result + (this.msgGetUserMoneyResponse == null ? 0 : this.msgGetUserMoneyResponse.hashCode());
        result = 31 * result + (this.msgGetUserProfileRequest == null ? 0 : this.msgGetUserProfileRequest.hashCode());
        result = 31 * result + (this.msgGetUserProfileResponse == null ? 0 : this.msgGetUserProfileResponse.hashCode());
        result = 31 * result + (this.msgLevelUpResponse == null ? 0 : this.msgLevelUpResponse.hashCode());
        result = 31 * result + (this.msgGetUserInboxResponse == null ? 0 : this.msgGetUserInboxResponse.hashCode());
        result = 31 * result + (this.msgUpdateProfileFBRequest == null ? 0 : this.msgUpdateProfileFBRequest.hashCode());
        result = 31 * result + (this.msgUpdateProfileFBResponse == null ? 0 : this.msgUpdateProfileFBResponse.hashCode());
        result = 31 * result + (this.msgUpdateUserNameRequest == null ? 0 : this.msgUpdateUserNameRequest.hashCode());
        result = 31 * result + (this.msgUpdateUserNameResponse == null ? 0 : this.msgUpdateUserNameResponse.hashCode());
        result = 31 * result + (this.msgClaimInboxRequest == null ? 0 : this.msgClaimInboxRequest.hashCode());
        result = 31 * result + (this.msgClaimInboxResponse == null ? 0 : this.msgClaimInboxResponse.hashCode());
        result = 31 * result + (this.msgFriendListRawResponse == null ? 0 : this.msgFriendListRawResponse.hashCode());
        result = 31 * result + (this.msgFriendListDetailRequest == null ? 0 : this.msgFriendListDetailRequest.hashCode());
        result = 31 * result + (this.msgFriendListDetailResponse == null ? 0 : this.msgFriendListDetailResponse.hashCode());
        result = 31 * result + (this.msgFriendActionRequest == null ? 0 : this.msgFriendActionRequest.hashCode());
        result = 31 * result + (this.msgFriendActionResponse == null ? 0 : this.msgFriendActionResponse.hashCode());
        result = 31 * result + (this.msgFriendSearchRequest == null ? 0 : this.msgFriendSearchRequest.hashCode());
        result = 31 * result + (this.msgFriendSearchResponse == null ? 0 : this.msgFriendSearchResponse.hashCode());
        result = 31 * result + (this.msgFriendUnlockMoneySendRequest == null ? 0 : this.msgFriendUnlockMoneySendRequest.hashCode());
        result = 31 * result + (this.msgFriendUnlockMoneySendResponse == null ? 0 : this.msgFriendUnlockMoneySendResponse.hashCode());
        result = 31 * result + (this.msgFriendMessageSendRequest == null ? 0 : this.msgFriendMessageSendRequest.hashCode());
        result = 31 * result + (this.msgDailyQuestInfoResponse == null ? 0 : this.msgDailyQuestInfoResponse.hashCode());
        result = 31 * result + (this.msgDailyQuestReceiveRequest == null ? 0 : this.msgDailyQuestReceiveRequest.hashCode());
        result = 31 * result + (this.msgDailyQuestReceiveResponse == null ? 0 : this.msgDailyQuestReceiveResponse.hashCode());
        result = 31 * result + (this.msgDailySnsFriendInviteRequest == null ? 0 : this.msgDailySnsFriendInviteRequest.hashCode());
        result = 31 * result + (this.msgDailySnsFriendInviteResponse == null ? 0 : this.msgDailySnsFriendInviteResponse.hashCode());
        result = 31 * result + (this.msgGiftCodeRequest == null ? 0 : this.msgGiftCodeRequest.hashCode());
        result = 31 * result + (this.msgGiftCodeResponse == null ? 0 : this.msgGiftCodeResponse.hashCode());
        result = 31 * result + (this.msgGetUserInventoryResponse == null ? 0 : this.msgGetUserInventoryResponse.hashCode());
        result = 31 * result + (this.msgGetCannonDataResponse == null ? 0 : this.msgGetCannonDataResponse.hashCode());
        result = 31 * result + (this.msgCannonUnlockRequest == null ? 0 : this.msgCannonUnlockRequest.hashCode());
        result = 31 * result + (this.msgCannonUnlockResponse == null ? 0 : this.msgCannonUnlockResponse.hashCode());
        result = 31 * result + (this.msgCannonUpgradeRequest == null ? 0 : this.msgCannonUpgradeRequest.hashCode());
        result = 31 * result + (this.msgCannonUpgradeResponse == null ? 0 : this.msgCannonUpgradeResponse.hashCode());
        result = 31 * result + Long.hashCode(this.clienttime);
        result = 31 * result + (this.msgWheelEnterRequest == null ? 0 : this.msgWheelEnterRequest.hashCode());
        result = 31 * result + (this.msgWheelEnterResponse == null ? 0 : this.msgWheelEnterResponse.hashCode());
        result = 31 * result + (this.msgWheelLeaveRequest == null ? 0 : this.msgWheelLeaveRequest.hashCode());
        result = 31 * result + (this.msgWheelLeaveResponse == null ? 0 : this.msgWheelLeaveResponse.hashCode());
        result = 31 * result + (this.msgWheelTurnRequest == null ? 0 : this.msgWheelTurnRequest.hashCode());
        result = 31 * result + (this.msgWheelTurnResponse == null ? 0 : this.msgWheelTurnResponse.hashCode());
        result = 31 * result + (this.msgWheelGetRequest == null ? 0 : this.msgWheelGetRequest.hashCode());
        result = 31 * result + (this.msgWheelGetResponse == null ? 0 : this.msgWheelGetResponse.hashCode());
        result = 31 * result + (this.msgWheelIngameRequest == null ? 0 : this.msgWheelIngameRequest.hashCode());
        result = 31 * result + (this.msgWheelIngameResponse == null ? 0 : this.msgWheelIngameResponse.hashCode());
        result = 31 * result + (this.msgWheelCarrierRequest == null ? 0 : this.msgWheelCarrierRequest.hashCode());
        result = 31 * result + (this.msgWheelCarrierResponse == null ? 0 : this.msgWheelCarrierResponse.hashCode());
        result = 31 * result + (this.msgSoccerTeamsResponse == null ? 0 : this.msgSoccerTeamsResponse.hashCode());
        result = 31 * result + (this.msgSoccerEnterRequest == null ? 0 : this.msgSoccerEnterRequest.hashCode());
        result = 31 * result + (this.msgSoccerEnterResponse == null ? 0 : this.msgSoccerEnterResponse.hashCode());
        result = 31 * result + (this.msgSoccerMatchesRequest == null ? 0 : this.msgSoccerMatchesRequest.hashCode());
        result = 31 * result + (this.msgSoccerMatchesResponse == null ? 0 : this.msgSoccerMatchesResponse.hashCode());
        result = 31 * result + (this.msgSoccerBetRequest == null ? 0 : this.msgSoccerBetRequest.hashCode());
        result = 31 * result + (this.msgSoccerBetResponse == null ? 0 : this.msgSoccerBetResponse.hashCode());
        result = 31 * result + (this.msgSoccerBetCountResponse == null ? 0 : this.msgSoccerBetCountResponse.hashCode());
        result = 31 * result + (this.msgSoccerReceiveRequest == null ? 0 : this.msgSoccerReceiveRequest.hashCode());
        result = 31 * result + (this.msgSoccerReceiveResponse == null ? 0 : this.msgSoccerReceiveResponse.hashCode());
        result = 31 * result + (this.msgSoccerReddotRequest == null ? 0 : this.msgSoccerReddotRequest.hashCode());
        result = 31 * result + (this.msgSoccerReddotResponse == null ? 0 : this.msgSoccerReddotResponse.hashCode());
        result = 31 * result + (this.msgPetInfoRequest == null ? 0 : this.msgPetInfoRequest.hashCode());
        result = 31 * result + (this.msgPetInfoResponse == null ? 0 : this.msgPetInfoResponse.hashCode());
        result = 31 * result + (this.msgPetUpdateResponse == null ? 0 : this.msgPetUpdateResponse.hashCode());
        result = 31 * result + (this.msgPetUnlockRequest == null ? 0 : this.msgPetUnlockRequest.hashCode());
        result = 31 * result + (this.msgPetUnlockResponse == null ? 0 : this.msgPetUnlockResponse.hashCode());
        result = 31 * result + (this.msgPetGiftReceiveRequest == null ? 0 : this.msgPetGiftReceiveRequest.hashCode());
        result = 31 * result + (this.msgPetGiftReceiveResponse == null ? 0 : this.msgPetGiftReceiveResponse.hashCode());
        result = 31 * result + (this.msgPetGiftAskingResponse == null ? 0 : this.msgPetGiftAskingResponse.hashCode());
        result = 31 * result + (this.msgClientActionLogRequest == null ? 0 : this.msgClientActionLogRequest.hashCode());
        result = 31 * result + (this.msgAdsViewRequest == null ? 0 : this.msgAdsViewRequest.hashCode());
        result = 31 * result + (this.msgAdsViewResponse == null ? 0 : this.msgAdsViewResponse.hashCode());
        result = 31 * result + (this.msgPetLevelUpResponse == null ? 0 : this.msgPetLevelUpResponse.hashCode());
        result = 31 * result + (this.msgDailySupportResponse == null ? 0 : this.msgDailySupportResponse.hashCode());
        result = 31 * result + (this.msgDailyBonusRequest == null ? 0 : this.msgDailyBonusRequest.hashCode());
        result = 31 * result + (this.msgDailyBonusResponse == null ? 0 : this.msgDailyBonusResponse.hashCode());
        result = 31 * result + (this.msgClaimDailyBonusRequest == null ? 0 : this.msgClaimDailyBonusRequest.hashCode());
        result = 31 * result + (this.msgClaimDailyBonusResponse == null ? 0 : this.msgClaimDailyBonusResponse.hashCode());
        result = 31 * result + (this.msgCollectionInfoRequest == null ? 0 : this.msgCollectionInfoRequest.hashCode());
        result = 31 * result + (this.msgCollectionInfoResponse == null ? 0 : this.msgCollectionInfoResponse.hashCode());
        result = 31 * result + (this.msgClaimCollectionPrizeRequest == null ? 0 : this.msgClaimCollectionPrizeRequest.hashCode());
        result = 31 * result + (this.msgClaimCollectionPrizeResponse == null ? 0 : this.msgClaimCollectionPrizeResponse.hashCode());
        result = 31 * result + (this.msgDonateFriendListDetailRequest == null ? 0 : this.msgDonateFriendListDetailRequest.hashCode());
        result = 31 * result + (this.msgDonateFriendListDetailResponse == null ? 0 : this.msgDonateFriendListDetailResponse.hashCode());
        result = 31 * result + (this.msgDonateFriendReceiveItemsRequest == null ? 0 : this.msgDonateFriendReceiveItemsRequest.hashCode());
        result = 31 * result + (this.msgDonateFriendReceiveItemsResponse == null ? 0 : this.msgDonateFriendReceiveItemsResponse.hashCode());
        result = 31 * result + (this.msgDonateFriendSendItemsRequest == null ? 0 : this.msgDonateFriendSendItemsRequest.hashCode());
        result = 31 * result + (this.msgDonateFriendSendItemsResponse == null ? 0 : this.msgDonateFriendSendItemsResponse.hashCode());
        result = 31 * result + (this.msgDonateFriendCheckGiftRequest == null ? 0 : this.msgDonateFriendCheckGiftRequest.hashCode());
        result = 31 * result + (this.msgDonateFriendCheckGiftResponse == null ? 0 : this.msgDonateFriendCheckGiftResponse.hashCode());
        result = 31 * result + (this.msgDonateListFriendSendItemsRequest == null ? 0 : this.msgDonateListFriendSendItemsRequest.hashCode());
        result = 31 * result + (this.msgDonateListFriendSendItemsResponse == null ? 0 : this.msgDonateListFriendSendItemsResponse.hashCode());
        result = 31 * result + (this.msgAccumulatePromotionRequest == null ? 0 : this.msgAccumulatePromotionRequest.hashCode());
        result = 31 * result + (this.msgAccumulatePromotionResponse == null ? 0 : this.msgAccumulatePromotionResponse.hashCode());
        result = 31 * result + (this.msgAccumulateClaimRequest == null ? 0 : this.msgAccumulateClaimRequest.hashCode());
        result = 31 * result + (this.msgAccumulateClaimResponse == null ? 0 : this.msgAccumulateClaimResponse.hashCode());
        result = 31 * result + (this.msgLeaderBoardRequest == null ? 0 : this.msgLeaderBoardRequest.hashCode());
        result = 31 * result + (this.msgLeaderBoardResponse == null ? 0 : this.msgLeaderBoardResponse.hashCode());
        result = 31 * result + (this.msgArchiveCollectionRequest == null ? 0 : this.msgArchiveCollectionRequest.hashCode());
        result = 31 * result + (this.msgArchiveCollectionResponse == null ? 0 : this.msgArchiveCollectionResponse.hashCode());
        result = 31 * result + (this.msgAdsInfoRequest == null ? 0 : this.msgAdsInfoRequest.hashCode());
        result = 31 * result + (this.msgAdsInfoResponse == null ? 0 : this.msgAdsInfoResponse.hashCode());
        result = 31 * result + (this.msgAdsRewardClaimRequest == null ? 0 : this.msgAdsRewardClaimRequest.hashCode());
        result = 31 * result + (this.msgH3EnterRequest == null ? 0 : this.msgH3EnterRequest.hashCode());
        result = 31 * result + (this.msgH3EnterResponse == null ? 0 : this.msgH3EnterResponse.hashCode());
        result = 31 * result + (this.msgH3LeaveRequest == null ? 0 : this.msgH3LeaveRequest.hashCode());
        result = 31 * result + (this.msgH3LeaveResponse == null ? 0 : this.msgH3LeaveResponse.hashCode());
        result = 31 * result + (this.msgH3TurnRequest == null ? 0 : this.msgH3TurnRequest.hashCode());
        result = 31 * result + (this.msgH3TurnResponse == null ? 0 : this.msgH3TurnResponse.hashCode());

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasCommand()) {
            parts.add("command=" + getCommand() + '(' + getCommandValue() + ')');
        }
        if (hasMsgGetUserMoneyRequest()) {
            parts.add("msgGetUserMoneyRequest=" + getMsgGetUserMoneyRequest());
        }
        if (hasMsgGetUserMoneyResponse()) {
            parts.add("msgGetUserMoneyResponse=" + getMsgGetUserMoneyResponse());
        }
        if (hasMsgGetUserProfileRequest()) {
            parts.add("msgGetUserProfileRequest=" + getMsgGetUserProfileRequest());
        }
        if (hasMsgGetUserProfileResponse()) {
            parts.add("msgGetUserProfileResponse=" + getMsgGetUserProfileResponse());
        }
        if (hasMsgLevelUpResponse()) {
            parts.add("msgLevelUpResponse=" + getMsgLevelUpResponse());
        }
        if (hasMsgGetUserInboxResponse()) {
            parts.add("msgGetUserInboxResponse=" + getMsgGetUserInboxResponse());
        }
        if (hasMsgUpdateProfileFBRequest()) {
            parts.add("msgUpdateProfileFBRequest=" + getMsgUpdateProfileFBRequest());
        }
        if (hasMsgUpdateProfileFBResponse()) {
            parts.add("msgUpdateProfileFBResponse=" + getMsgUpdateProfileFBResponse());
        }
        if (hasMsgUpdateUserNameRequest()) {
            parts.add("msgUpdateUserNameRequest=" + getMsgUpdateUserNameRequest());
        }
        if (hasMsgUpdateUserNameResponse()) {
            parts.add("msgUpdateUserNameResponse=" + getMsgUpdateUserNameResponse());
        }
        if (hasMsgClaimInboxRequest()) {
            parts.add("msgClaimInboxRequest=" + getMsgClaimInboxRequest());
        }
        if (hasMsgClaimInboxResponse()) {
            parts.add("msgClaimInboxResponse=" + getMsgClaimInboxResponse());
        }
        if (hasMsgFriendListRawResponse()) {
            parts.add("msgFriendListRawResponse=" + getMsgFriendListRawResponse());
        }
        if (hasMsgFriendListDetailRequest()) {
            parts.add("msgFriendListDetailRequest=" + getMsgFriendListDetailRequest());
        }
        if (hasMsgFriendListDetailResponse()) {
            parts.add("msgFriendListDetailResponse=" + getMsgFriendListDetailResponse());
        }
        if (hasMsgFriendActionRequest()) {
            parts.add("msgFriendActionRequest=" + getMsgFriendActionRequest());
        }
        if (hasMsgFriendActionResponse()) {
            parts.add("msgFriendActionResponse=" + getMsgFriendActionResponse());
        }
        if (hasMsgFriendSearchRequest()) {
            parts.add("msgFriendSearchRequest=" + getMsgFriendSearchRequest());
        }
        if (hasMsgFriendSearchResponse()) {
            parts.add("msgFriendSearchResponse=" + getMsgFriendSearchResponse());
        }
        if (hasMsgFriendUnlockMoneySendRequest()) {
            parts.add("msgFriendUnlockMoneySendRequest=" + getMsgFriendUnlockMoneySendRequest());
        }
        if (hasMsgFriendUnlockMoneySendResponse()) {
            parts.add("msgFriendUnlockMoneySendResponse=" + getMsgFriendUnlockMoneySendResponse());
        }
        if (hasMsgFriendMessageSendRequest()) {
            parts.add("msgFriendMessageSendRequest=" + getMsgFriendMessageSendRequest());
        }
        if (hasMsgDailyQuestInfoResponse()) {
            parts.add("msgDailyQuestInfoResponse=" + getMsgDailyQuestInfoResponse());
        }
        if (hasMsgDailyQuestReceiveRequest()) {
            parts.add("msgDailyQuestReceiveRequest=" + getMsgDailyQuestReceiveRequest());
        }
        if (hasMsgDailyQuestReceiveResponse()) {
            parts.add("msgDailyQuestReceiveResponse=" + getMsgDailyQuestReceiveResponse());
        }
        if (hasMsgDailySnsFriendInviteRequest()) {
            parts.add("msgDailySnsFriendInviteRequest=" + getMsgDailySnsFriendInviteRequest());
        }
        if (hasMsgDailySnsFriendInviteResponse()) {
            parts.add("msgDailySnsFriendInviteResponse=" + getMsgDailySnsFriendInviteResponse());
        }
        if (hasMsgGiftCodeRequest()) {
            parts.add("msgGiftCodeRequest=" + getMsgGiftCodeRequest());
        }
        if (hasMsgGiftCodeResponse()) {
            parts.add("msgGiftCodeResponse=" + getMsgGiftCodeResponse());
        }
        if (hasMsgGetUserInventoryResponse()) {
            parts.add("msgGetUserInventoryResponse=" + getMsgGetUserInventoryResponse());
        }
        if (hasMsgGetCannonDataResponse()) {
            parts.add("msgGetCannonDataResponse=" + getMsgGetCannonDataResponse());
        }
        if (hasMsgCannonUnlockRequest()) {
            parts.add("msgCannonUnlockRequest=" + getMsgCannonUnlockRequest());
        }
        if (hasMsgCannonUnlockResponse()) {
            parts.add("msgCannonUnlockResponse=" + getMsgCannonUnlockResponse());
        }
        if (hasMsgCannonUpgradeRequest()) {
            parts.add("msgCannonUpgradeRequest=" + getMsgCannonUpgradeRequest());
        }
        if (hasMsgCannonUpgradeResponse()) {
            parts.add("msgCannonUpgradeResponse=" + getMsgCannonUpgradeResponse());
        }
        if (hasClienttime()) {
            parts.add("clienttime=" + getClienttime());
        }
        if (hasMsgWheelEnterRequest()) {
            parts.add("msgWheelEnterRequest=" + getMsgWheelEnterRequest());
        }
        if (hasMsgWheelEnterResponse()) {
            parts.add("msgWheelEnterResponse=" + getMsgWheelEnterResponse());
        }
        if (hasMsgWheelLeaveRequest()) {
            parts.add("msgWheelLeaveRequest=" + getMsgWheelLeaveRequest());
        }
        if (hasMsgWheelLeaveResponse()) {
            parts.add("msgWheelLeaveResponse=" + getMsgWheelLeaveResponse());
        }
        if (hasMsgWheelTurnRequest()) {
            parts.add("msgWheelTurnRequest=" + getMsgWheelTurnRequest());
        }
        if (hasMsgWheelTurnResponse()) {
            parts.add("msgWheelTurnResponse=" + getMsgWheelTurnResponse());
        }
        if (hasMsgWheelGetRequest()) {
            parts.add("msgWheelGetRequest=" + getMsgWheelGetRequest());
        }
        if (hasMsgWheelGetResponse()) {
            parts.add("msgWheelGetResponse=" + getMsgWheelGetResponse());
        }
        if (hasMsgWheelIngameRequest()) {
            parts.add("msgWheelIngameRequest=" + getMsgWheelIngameRequest());
        }
        if (hasMsgWheelIngameResponse()) {
            parts.add("msgWheelIngameResponse=" + getMsgWheelIngameResponse());
        }
        if (hasMsgWheelCarrierRequest()) {
            parts.add("msgWheelCarrierRequest=" + getMsgWheelCarrierRequest());
        }
        if (hasMsgWheelCarrierResponse()) {
            parts.add("msgWheelCarrierResponse=" + getMsgWheelCarrierResponse());
        }
        if (hasMsgSoccerTeamsResponse()) {
            parts.add("msgSoccerTeamsResponse=" + getMsgSoccerTeamsResponse());
        }
        if (hasMsgSoccerEnterRequest()) {
            parts.add("msgSoccerEnterRequest=" + getMsgSoccerEnterRequest());
        }
        if (hasMsgSoccerEnterResponse()) {
            parts.add("msgSoccerEnterResponse=" + getMsgSoccerEnterResponse());
        }
        if (hasMsgSoccerMatchesRequest()) {
            parts.add("msgSoccerMatchesRequest=" + getMsgSoccerMatchesRequest());
        }
        if (hasMsgSoccerMatchesResponse()) {
            parts.add("msgSoccerMatchesResponse=" + getMsgSoccerMatchesResponse());
        }
        if (hasMsgSoccerBetRequest()) {
            parts.add("msgSoccerBetRequest=" + getMsgSoccerBetRequest());
        }
        if (hasMsgSoccerBetResponse()) {
            parts.add("msgSoccerBetResponse=" + getMsgSoccerBetResponse());
        }
        if (hasMsgSoccerBetCountResponse()) {
            parts.add("msgSoccerBetCountResponse=" + getMsgSoccerBetCountResponse());
        }
        if (hasMsgSoccerReceiveRequest()) {
            parts.add("msgSoccerReceiveRequest=" + getMsgSoccerReceiveRequest());
        }
        if (hasMsgSoccerReceiveResponse()) {
            parts.add("msgSoccerReceiveResponse=" + getMsgSoccerReceiveResponse());
        }
        if (hasMsgSoccerReddotRequest()) {
            parts.add("msgSoccerReddotRequest=" + getMsgSoccerReddotRequest());
        }
        if (hasMsgSoccerReddotResponse()) {
            parts.add("msgSoccerReddotResponse=" + getMsgSoccerReddotResponse());
        }
        if (hasMsgPetInfoRequest()) {
            parts.add("msgPetInfoRequest=" + getMsgPetInfoRequest());
        }
        if (hasMsgPetInfoResponse()) {
            parts.add("msgPetInfoResponse=" + getMsgPetInfoResponse());
        }
        if (hasMsgPetUpdateResponse()) {
            parts.add("msgPetUpdateResponse=" + getMsgPetUpdateResponse());
        }
        if (hasMsgPetUnlockRequest()) {
            parts.add("msgPetUnlockRequest=" + getMsgPetUnlockRequest());
        }
        if (hasMsgPetUnlockResponse()) {
            parts.add("msgPetUnlockResponse=" + getMsgPetUnlockResponse());
        }
        if (hasMsgPetGiftReceiveRequest()) {
            parts.add("msgPetGiftReceiveRequest=" + getMsgPetGiftReceiveRequest());
        }
        if (hasMsgPetGiftReceiveResponse()) {
            parts.add("msgPetGiftReceiveResponse=" + getMsgPetGiftReceiveResponse());
        }
        if (hasMsgPetGiftAskingResponse()) {
            parts.add("msgPetGiftAskingResponse=" + getMsgPetGiftAskingResponse());
        }
        if (hasMsgClientActionLogRequest()) {
            parts.add("msgClientActionLogRequest=" + getMsgClientActionLogRequest());
        }
        if (hasMsgAdsViewRequest()) {
            parts.add("msgAdsViewRequest=" + getMsgAdsViewRequest());
        }
        if (hasMsgAdsViewResponse()) {
            parts.add("msgAdsViewResponse=" + getMsgAdsViewResponse());
        }
        if (hasMsgPetLevelUpResponse()) {
            parts.add("msgPetLevelUpResponse=" + getMsgPetLevelUpResponse());
        }
        if (hasMsgDailySupportResponse()) {
            parts.add("msgDailySupportResponse=" + getMsgDailySupportResponse());
        }
        if (hasMsgDailyBonusRequest()) {
            parts.add("msgDailyBonusRequest=" + getMsgDailyBonusRequest());
        }
        if (hasMsgDailyBonusResponse()) {
            parts.add("msgDailyBonusResponse=" + getMsgDailyBonusResponse());
        }
        if (hasMsgClaimDailyBonusRequest()) {
            parts.add("msgClaimDailyBonusRequest=" + getMsgClaimDailyBonusRequest());
        }
        if (hasMsgClaimDailyBonusResponse()) {
            parts.add("msgClaimDailyBonusResponse=" + getMsgClaimDailyBonusResponse());
        }
        if (hasMsgCollectionInfoRequest()) {
            parts.add("msgCollectionInfoRequest=" + getMsgCollectionInfoRequest());
        }
        if (hasMsgCollectionInfoResponse()) {
            parts.add("msgCollectionInfoResponse=" + getMsgCollectionInfoResponse());
        }
        if (hasMsgClaimCollectionPrizeRequest()) {
            parts.add("msgClaimCollectionPrizeRequest=" + getMsgClaimCollectionPrizeRequest());
        }
        if (hasMsgClaimCollectionPrizeResponse()) {
            parts.add("msgClaimCollectionPrizeResponse=" + getMsgClaimCollectionPrizeResponse());
        }
        if (hasMsgDonateFriendListDetailRequest()) {
            parts.add("msgDonateFriendListDetailRequest=" + getMsgDonateFriendListDetailRequest());
        }
        if (hasMsgDonateFriendListDetailResponse()) {
            parts.add("msgDonateFriendListDetailResponse=" + getMsgDonateFriendListDetailResponse());
        }
        if (hasMsgDonateFriendReceiveItemsRequest()) {
            parts.add("msgDonateFriendReceiveItemsRequest=" + getMsgDonateFriendReceiveItemsRequest());
        }
        if (hasMsgDonateFriendReceiveItemsResponse()) {
            parts.add("msgDonateFriendReceiveItemsResponse=" + getMsgDonateFriendReceiveItemsResponse());
        }
        if (hasMsgDonateFriendSendItemsRequest()) {
            parts.add("msgDonateFriendSendItemsRequest=" + getMsgDonateFriendSendItemsRequest());
        }
        if (hasMsgDonateFriendSendItemsResponse()) {
            parts.add("msgDonateFriendSendItemsResponse=" + getMsgDonateFriendSendItemsResponse());
        }
        if (hasMsgDonateFriendCheckGiftRequest()) {
            parts.add("msgDonateFriendCheckGiftRequest=" + getMsgDonateFriendCheckGiftRequest());
        }
        if (hasMsgDonateFriendCheckGiftResponse()) {
            parts.add("msgDonateFriendCheckGiftResponse=" + getMsgDonateFriendCheckGiftResponse());
        }
        if (hasMsgDonateListFriendSendItemsRequest()) {
            parts.add("msgDonateListFriendSendItemsRequest=" + getMsgDonateListFriendSendItemsRequest());
        }
        if (hasMsgDonateListFriendSendItemsResponse()) {
            parts.add("msgDonateListFriendSendItemsResponse=" + getMsgDonateListFriendSendItemsResponse());
        }
        if (hasMsgAccumulatePromotionRequest()) {
            parts.add("msgAccumulatePromotionRequest=" + getMsgAccumulatePromotionRequest());
        }
        if (hasMsgAccumulatePromotionResponse()) {
            parts.add("msgAccumulatePromotionResponse=" + getMsgAccumulatePromotionResponse());
        }
        if (hasMsgAccumulateClaimRequest()) {
            parts.add("msgAccumulateClaimRequest=" + getMsgAccumulateClaimRequest());
        }
        if (hasMsgAccumulateClaimResponse()) {
            parts.add("msgAccumulateClaimResponse=" + getMsgAccumulateClaimResponse());
        }
        if (hasMsgLeaderBoardRequest()) {
            parts.add("msgLeaderBoardRequest=" + getMsgLeaderBoardRequest());
        }
        if (hasMsgLeaderBoardResponse()) {
            parts.add("msgLeaderBoardResponse=" + getMsgLeaderBoardResponse());
        }
        if (hasMsgArchiveCollectionRequest()) {
            parts.add("msgArchiveCollectionRequest=" + getMsgArchiveCollectionRequest());
        }
        if (hasMsgArchiveCollectionResponse()) {
            parts.add("msgArchiveCollectionResponse=" + getMsgArchiveCollectionResponse());
        }
        if (hasMsgAdsInfoRequest()) {
            parts.add("msgAdsInfoRequest=" + getMsgAdsInfoRequest());
        }
        if (hasMsgAdsInfoResponse()) {
            parts.add("msgAdsInfoResponse=" + getMsgAdsInfoResponse());
        }
        if (hasMsgAdsRewardClaimRequest()) {
            parts.add("msgAdsRewardClaimRequest=" + getMsgAdsRewardClaimRequest());
        }
        if (hasMsgH3EnterRequest()) {
            parts.add("msgH3EnterRequest=" + getMsgH3EnterRequest());
        }
        if (hasMsgH3EnterResponse()) {
            parts.add("msgH3EnterResponse=" + getMsgH3EnterResponse());
        }
        if (hasMsgH3LeaveRequest()) {
            parts.add("msgH3LeaveRequest=" + getMsgH3LeaveRequest());
        }
        if (hasMsgH3LeaveResponse()) {
            parts.add("msgH3LeaveResponse=" + getMsgH3LeaveResponse());
        }
        if (hasMsgH3TurnRequest()) {
            parts.add("msgH3TurnRequest=" + getMsgH3TurnRequest());
        }
        if (hasMsgH3TurnResponse()) {
            parts.add("msgH3TurnResponse=" + getMsgH3TurnResponse());
        }
        return "ProfileMessage{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<ProfileMessage>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("command", 1);
        	__fieldMap.put("msgGetUserMoneyRequest", 2);
        	__fieldMap.put("msgGetUserMoneyResponse", 3);
        	__fieldMap.put("msgGetUserProfileRequest", 4);
        	__fieldMap.put("msgGetUserProfileResponse", 5);
        	__fieldMap.put("msgLevelUpResponse", 6);
        	__fieldMap.put("msgGetUserInboxResponse", 7);
        	__fieldMap.put("msgUpdateProfileFBRequest", 8);
        	__fieldMap.put("msgUpdateProfileFBResponse", 9);
        	__fieldMap.put("msgUpdateUserNameRequest", 10);
        	__fieldMap.put("msgUpdateUserNameResponse", 11);
        	__fieldMap.put("msgClaimInboxRequest", 12);
        	__fieldMap.put("msgClaimInboxResponse", 13);
        	__fieldMap.put("msgFriendListRawResponse", 14);
        	__fieldMap.put("msgFriendListDetailRequest", 15);
        	__fieldMap.put("msgFriendListDetailResponse", 16);
        	__fieldMap.put("msgFriendActionRequest", 17);
        	__fieldMap.put("msgFriendActionResponse", 18);
        	__fieldMap.put("msgFriendSearchRequest", 19);
        	__fieldMap.put("msgFriendSearchResponse", 20);
        	__fieldMap.put("msgFriendUnlockMoneySendRequest", 21);
        	__fieldMap.put("msgFriendUnlockMoneySendResponse", 22);
        	__fieldMap.put("msgFriendMessageSendRequest", 23);
        	__fieldMap.put("msgDailyQuestInfoResponse", 24);
        	__fieldMap.put("msgDailyQuestReceiveRequest", 25);
        	__fieldMap.put("msgDailyQuestReceiveResponse", 26);
        	__fieldMap.put("msgDailySnsFriendInviteRequest", 27);
        	__fieldMap.put("msgDailySnsFriendInviteResponse", 28);
        	__fieldMap.put("msgGiftCodeRequest", 29);
        	__fieldMap.put("msgGiftCodeResponse", 30);
        	__fieldMap.put("msgGetUserInventoryResponse", 31);
        	__fieldMap.put("msgGetCannonDataResponse", 32);
        	__fieldMap.put("msgCannonUnlockRequest", 33);
        	__fieldMap.put("msgCannonUnlockResponse", 34);
        	__fieldMap.put("msgCannonUpgradeRequest", 35);
        	__fieldMap.put("msgCannonUpgradeResponse", 36);
        	__fieldMap.put("clienttime", 37);
        	__fieldMap.put("msgWheelEnterRequest", 38);
        	__fieldMap.put("msgWheelEnterResponse", 39);
        	__fieldMap.put("msgWheelLeaveRequest", 40);
        	__fieldMap.put("msgWheelLeaveResponse", 41);
        	__fieldMap.put("msgWheelTurnRequest", 42);
        	__fieldMap.put("msgWheelTurnResponse", 43);
        	__fieldMap.put("msgWheelGetRequest", 44);
        	__fieldMap.put("msgWheelGetResponse", 45);
        	__fieldMap.put("msgWheelIngameRequest", 46);
        	__fieldMap.put("msgWheelIngameResponse", 47);
        	__fieldMap.put("msgWheelCarrierRequest", 48);
        	__fieldMap.put("msgWheelCarrierResponse", 49);
        	__fieldMap.put("msgSoccerTeamsResponse", 50);
        	__fieldMap.put("msgSoccerEnterRequest", 51);
        	__fieldMap.put("msgSoccerEnterResponse", 52);
        	__fieldMap.put("msgSoccerMatchesRequest", 53);
        	__fieldMap.put("msgSoccerMatchesResponse", 54);
        	__fieldMap.put("msgSoccerBetRequest", 55);
        	__fieldMap.put("msgSoccerBetResponse", 56);
        	__fieldMap.put("msgSoccerBetCountResponse", 57);
        	__fieldMap.put("msgSoccerReceiveRequest", 58);
        	__fieldMap.put("msgSoccerReceiveResponse", 59);
        	__fieldMap.put("msgSoccerReddotRequest", 60);
        	__fieldMap.put("msgSoccerReddotResponse", 61);
        	__fieldMap.put("msgPetInfoRequest", 62);
        	__fieldMap.put("msgPetInfoResponse", 63);
        	__fieldMap.put("msgPetUpdateResponse", 64);
        	__fieldMap.put("msgPetUnlockRequest", 65);
        	__fieldMap.put("msgPetUnlockResponse", 66);
        	__fieldMap.put("msgPetGiftReceiveRequest", 67);
        	__fieldMap.put("msgPetGiftReceiveResponse", 68);
        	__fieldMap.put("msgPetGiftAskingResponse", 70);
        	__fieldMap.put("msgClientActionLogRequest", 71);
        	__fieldMap.put("msgAdsViewRequest", 72);
        	__fieldMap.put("msgAdsViewResponse", 73);
        	__fieldMap.put("msgPetLevelUpResponse", 74);
        	__fieldMap.put("msgDailySupportResponse", 75);
        	__fieldMap.put("msgDailyBonusRequest", 76);
        	__fieldMap.put("msgDailyBonusResponse", 77);
        	__fieldMap.put("msgClaimDailyBonusRequest", 78);
        	__fieldMap.put("msgClaimDailyBonusResponse", 79);
        	__fieldMap.put("msgCollectionInfoRequest", 80);
        	__fieldMap.put("msgCollectionInfoResponse", 81);
        	__fieldMap.put("msgClaimCollectionPrizeRequest", 82);
        	__fieldMap.put("msgClaimCollectionPrizeResponse", 83);
        	__fieldMap.put("msgDonateFriendListDetailRequest", 84);
        	__fieldMap.put("msgDonateFriendListDetailResponse", 85);
        	__fieldMap.put("msgDonateFriendReceiveItemsRequest", 86);
        	__fieldMap.put("msgDonateFriendReceiveItemsResponse", 87);
        	__fieldMap.put("msgDonateFriendSendItemsRequest", 88);
        	__fieldMap.put("msgDonateFriendSendItemsResponse", 89);
        	__fieldMap.put("msgDonateFriendCheckGiftRequest", 90);
        	__fieldMap.put("msgDonateFriendCheckGiftResponse", 91);
        	__fieldMap.put("msgDonateListFriendSendItemsRequest", 92);
        	__fieldMap.put("msgDonateListFriendSendItemsResponse", 93);
        	__fieldMap.put("msgAccumulatePromotionRequest", 94);
        	__fieldMap.put("msgAccumulatePromotionResponse", 95);
        	__fieldMap.put("msgAccumulateClaimRequest", 96);
        	__fieldMap.put("msgAccumulateClaimResponse", 97);
        	__fieldMap.put("msgLeaderBoardRequest", 98);
        	__fieldMap.put("msgLeaderBoardResponse", 99);
        	__fieldMap.put("msgArchiveCollectionRequest", 100);
        	__fieldMap.put("msgArchiveCollectionResponse", 101);
        	__fieldMap.put("msgAdsInfoRequest", 102);
        	__fieldMap.put("msgAdsInfoResponse", 103);
        	__fieldMap.put("msgAdsRewardClaimRequest", 104);
        	__fieldMap.put("msgH3EnterRequest", 105);
        	__fieldMap.put("msgH3EnterResponse", 106);
        	__fieldMap.put("msgH3LeaveRequest", 107);
        	__fieldMap.put("msgH3LeaveResponse", 108);
        	__fieldMap.put("msgH3TurnRequest", 109);
        	__fieldMap.put("msgH3TurnResponse", 110);
        }

        @Override
        public ProfileMessage newMessage() {
            return new ProfileMessage();
        }

        @Override
        public Class<ProfileMessage> typeClass() {
            return ProfileMessage.class;
        }

        @Override
        public String messageName() {
            return ProfileMessage.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return ProfileMessage.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(ProfileMessage message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, ProfileMessage instance) throws java.io.IOException {
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
                    	instance.msgGetUserMoneyRequest = input.mergeObject(null, proto.message.GetUserMoneyRequest.getSchema());
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.msgGetUserMoneyResponse = input.mergeObject(null, proto.message.GetUserMoneyResponse.getSchema());
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.msgGetUserProfileRequest = input.mergeObject(null, proto.message.GetUserProfileRequest.getSchema());
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.msgGetUserProfileResponse = input.mergeObject(null, proto.message.GetUserProfileResponse.getSchema());
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.msgLevelUpResponse = input.mergeObject(null, proto.message.LevelUpResponse.getSchema());
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.msgGetUserInboxResponse = input.mergeObject(null, proto.message.GetUserInboxResponse.getSchema());
                    	instance.__bitField0 |= 64;
                    	break;
                    case 8:
                    	instance.msgUpdateProfileFBRequest = input.mergeObject(null, proto.message.UpdateProfileFBRequest.getSchema());
                    	instance.__bitField0 |= 128;
                    	break;
                    case 9:
                    	instance.msgUpdateProfileFBResponse = input.mergeObject(null, proto.message.UpdateProfileFBResponse.getSchema());
                    	instance.__bitField0 |= 256;
                    	break;
                    case 10:
                    	instance.msgUpdateUserNameRequest = input.mergeObject(null, proto.message.UpdateUserNameRequest.getSchema());
                    	instance.__bitField0 |= 512;
                    	break;
                    case 11:
                    	instance.msgUpdateUserNameResponse = input.mergeObject(null, proto.message.UpdateUserNameResponse.getSchema());
                    	instance.__bitField0 |= 1024;
                    	break;
                    case 12:
                    	instance.msgClaimInboxRequest = input.mergeObject(null, proto.message.ClaimInboxRequest.getSchema());
                    	instance.__bitField0 |= 2048;
                    	break;
                    case 13:
                    	instance.msgClaimInboxResponse = input.mergeObject(null, proto.message.ClaimInboxResponse.getSchema());
                    	instance.__bitField0 |= 4096;
                    	break;
                    case 14:
                    	instance.msgFriendListRawResponse = input.mergeObject(null, proto.message.FriendListRawResponse.getSchema());
                    	instance.__bitField0 |= 8192;
                    	break;
                    case 15:
                    	instance.msgFriendListDetailRequest = input.mergeObject(null, proto.message.FriendListDetailRequest.getSchema());
                    	instance.__bitField0 |= 16384;
                    	break;
                    case 16:
                    	instance.msgFriendListDetailResponse = input.mergeObject(null, proto.message.FriendListDetailResponse.getSchema());
                    	instance.__bitField0 |= 32768;
                    	break;
                    case 17:
                    	instance.msgFriendActionRequest = input.mergeObject(null, proto.message.FriendActionRequest.getSchema());
                    	instance.__bitField0 |= 65536;
                    	break;
                    case 18:
                    	instance.msgFriendActionResponse = input.mergeObject(null, proto.message.FriendActionResponse.getSchema());
                    	instance.__bitField0 |= 131072;
                    	break;
                    case 19:
                    	instance.msgFriendSearchRequest = input.mergeObject(null, proto.message.FriendSearchRequest.getSchema());
                    	instance.__bitField0 |= 262144;
                    	break;
                    case 20:
                    	instance.msgFriendSearchResponse = input.mergeObject(null, proto.message.FriendSearchResponse.getSchema());
                    	instance.__bitField0 |= 524288;
                    	break;
                    case 21:
                    	instance.msgFriendUnlockMoneySendRequest = input.mergeObject(null, proto.message.FriendUnlockMoneySendRequest.getSchema());
                    	instance.__bitField0 |= 1048576;
                    	break;
                    case 22:
                    	instance.msgFriendUnlockMoneySendResponse = input.mergeObject(null, proto.message.FriendUnlockMoneySendResponse.getSchema());
                    	instance.__bitField0 |= 2097152;
                    	break;
                    case 23:
                    	instance.msgFriendMessageSendRequest = input.mergeObject(null, proto.message.FriendMessageSendRequest.getSchema());
                    	instance.__bitField0 |= 4194304;
                    	break;
                    case 24:
                    	instance.msgDailyQuestInfoResponse = input.mergeObject(null, proto.message.DailyQuestInfoResponse.getSchema());
                    	instance.__bitField0 |= 8388608;
                    	break;
                    case 25:
                    	instance.msgDailyQuestReceiveRequest = input.mergeObject(null, proto.message.DailyQuestReceiveRequest.getSchema());
                    	instance.__bitField0 |= 16777216;
                    	break;
                    case 26:
                    	instance.msgDailyQuestReceiveResponse = input.mergeObject(null, proto.message.DailyQuestReceiveResponse.getSchema());
                    	instance.__bitField0 |= 33554432;
                    	break;
                    case 27:
                    	instance.msgDailySnsFriendInviteRequest = input.mergeObject(null, proto.message.DailySnsFriendInviteRequest.getSchema());
                    	instance.__bitField0 |= 67108864;
                    	break;
                    case 28:
                    	instance.msgDailySnsFriendInviteResponse = input.mergeObject(null, proto.message.DailySnsFriendInviteResponse.getSchema());
                    	instance.__bitField0 |= 134217728;
                    	break;
                    case 29:
                    	instance.msgGiftCodeRequest = input.mergeObject(null, proto.message.GiftCodeRequest.getSchema());
                    	instance.__bitField0 |= 268435456;
                    	break;
                    case 30:
                    	instance.msgGiftCodeResponse = input.mergeObject(null, proto.message.GiftCodeResponse.getSchema());
                    	instance.__bitField0 |= 536870912;
                    	break;
                    case 31:
                    	instance.msgGetUserInventoryResponse = input.mergeObject(null, proto.message.GetUserInventoryResponse.getSchema());
                    	instance.__bitField0 |= 1073741824;
                    	break;
                    case 32:
                    	instance.msgGetCannonDataResponse = input.mergeObject(null, proto.message.GetCannonDataResponse.getSchema());
                    	instance.__bitField0 |= -2147483648;
                    	break;
                    case 33:
                    	instance.msgCannonUnlockRequest = input.mergeObject(null, proto.message.CannonUnlockRequest.getSchema());
                    	instance.__bitField1 |= 1;
                    	break;
                    case 34:
                    	instance.msgCannonUnlockResponse = input.mergeObject(null, proto.message.CannonUnlockResponse.getSchema());
                    	instance.__bitField1 |= 2;
                    	break;
                    case 35:
                    	instance.msgCannonUpgradeRequest = input.mergeObject(null, proto.message.CannonUpgradeRequest.getSchema());
                    	instance.__bitField1 |= 4;
                    	break;
                    case 36:
                    	instance.msgCannonUpgradeResponse = input.mergeObject(null, proto.message.CannonUpgradeResponse.getSchema());
                    	instance.__bitField1 |= 8;
                    	break;
                    case 37:
                    	instance.clienttime = input.readInt64();
                    	instance.__bitField1 |= 16;
                    	break;
                    case 38:
                    	instance.msgWheelEnterRequest = input.mergeObject(null, proto.message.WheelEnterRequest.getSchema());
                    	instance.__bitField1 |= 32;
                    	break;
                    case 39:
                    	instance.msgWheelEnterResponse = input.mergeObject(null, proto.message.WheelEnterResponse.getSchema());
                    	instance.__bitField1 |= 64;
                    	break;
                    case 40:
                    	instance.msgWheelLeaveRequest = input.mergeObject(null, proto.message.WheelLeaveRequest.getSchema());
                    	instance.__bitField1 |= 128;
                    	break;
                    case 41:
                    	instance.msgWheelLeaveResponse = input.mergeObject(null, proto.message.WheelLeaveResponse.getSchema());
                    	instance.__bitField1 |= 256;
                    	break;
                    case 42:
                    	instance.msgWheelTurnRequest = input.mergeObject(null, proto.message.WheelTurnRequest.getSchema());
                    	instance.__bitField1 |= 512;
                    	break;
                    case 43:
                    	instance.msgWheelTurnResponse = input.mergeObject(null, proto.message.WheelTurnResponse.getSchema());
                    	instance.__bitField1 |= 1024;
                    	break;
                    case 44:
                    	instance.msgWheelGetRequest = input.mergeObject(null, proto.message.WheelGetRequest.getSchema());
                    	instance.__bitField1 |= 2048;
                    	break;
                    case 45:
                    	instance.msgWheelGetResponse = input.mergeObject(null, proto.message.WheelGetResponse.getSchema());
                    	instance.__bitField1 |= 4096;
                    	break;
                    case 46:
                    	instance.msgWheelIngameRequest = input.mergeObject(null, proto.message.WheelIngameRequest.getSchema());
                    	instance.__bitField1 |= 8192;
                    	break;
                    case 47:
                    	instance.msgWheelIngameResponse = input.mergeObject(null, proto.message.WheelIngameResponse.getSchema());
                    	instance.__bitField1 |= 16384;
                    	break;
                    case 48:
                    	instance.msgWheelCarrierRequest = input.mergeObject(null, proto.message.WheelCarrierRequest.getSchema());
                    	instance.__bitField1 |= 32768;
                    	break;
                    case 49:
                    	instance.msgWheelCarrierResponse = input.mergeObject(null, proto.message.WheelCarrierResponse.getSchema());
                    	instance.__bitField1 |= 65536;
                    	break;
                    case 50:
                    	instance.msgSoccerTeamsResponse = input.mergeObject(null, proto.message.SoccerTeamsResponse.getSchema());
                    	instance.__bitField1 |= 131072;
                    	break;
                    case 51:
                    	instance.msgSoccerEnterRequest = input.mergeObject(null, proto.message.SoccerEnterRequest.getSchema());
                    	instance.__bitField1 |= 262144;
                    	break;
                    case 52:
                    	instance.msgSoccerEnterResponse = input.mergeObject(null, proto.message.SoccerEnterResponse.getSchema());
                    	instance.__bitField1 |= 524288;
                    	break;
                    case 53:
                    	instance.msgSoccerMatchesRequest = input.mergeObject(null, proto.message.SoccerMatchesRequest.getSchema());
                    	instance.__bitField1 |= 1048576;
                    	break;
                    case 54:
                    	instance.msgSoccerMatchesResponse = input.mergeObject(null, proto.message.SoccerMatchesResponse.getSchema());
                    	instance.__bitField1 |= 2097152;
                    	break;
                    case 55:
                    	instance.msgSoccerBetRequest = input.mergeObject(null, proto.message.SoccerBetRequest.getSchema());
                    	instance.__bitField1 |= 4194304;
                    	break;
                    case 56:
                    	instance.msgSoccerBetResponse = input.mergeObject(null, proto.message.SoccerBetResponse.getSchema());
                    	instance.__bitField1 |= 8388608;
                    	break;
                    case 57:
                    	instance.msgSoccerBetCountResponse = input.mergeObject(null, proto.message.SoccerBetCountResponse.getSchema());
                    	instance.__bitField1 |= 16777216;
                    	break;
                    case 58:
                    	instance.msgSoccerReceiveRequest = input.mergeObject(null, proto.message.SoccerReceiveRequest.getSchema());
                    	instance.__bitField1 |= 33554432;
                    	break;
                    case 59:
                    	instance.msgSoccerReceiveResponse = input.mergeObject(null, proto.message.SoccerReceiveResponse.getSchema());
                    	instance.__bitField1 |= 67108864;
                    	break;
                    case 60:
                    	instance.msgSoccerReddotRequest = input.mergeObject(null, proto.message.SoccerReddotRequest.getSchema());
                    	instance.__bitField1 |= 134217728;
                    	break;
                    case 61:
                    	instance.msgSoccerReddotResponse = input.mergeObject(null, proto.message.SoccerReddotResponse.getSchema());
                    	instance.__bitField1 |= 268435456;
                    	break;
                    case 62:
                    	instance.msgPetInfoRequest = input.mergeObject(null, proto.message.PetInfoRequest.getSchema());
                    	instance.__bitField1 |= 536870912;
                    	break;
                    case 63:
                    	instance.msgPetInfoResponse = input.mergeObject(null, proto.message.PetInfoResponse.getSchema());
                    	instance.__bitField1 |= 1073741824;
                    	break;
                    case 64:
                    	instance.msgPetUpdateResponse = input.mergeObject(null, proto.message.PetUpdateResponse.getSchema());
                    	instance.__bitField1 |= -2147483648;
                    	break;
                    case 65:
                    	instance.msgPetUnlockRequest = input.mergeObject(null, proto.message.PetUnlockRequest.getSchema());
                    	instance.__bitField2 |= 1;
                    	break;
                    case 66:
                    	instance.msgPetUnlockResponse = input.mergeObject(null, proto.message.PetUnlockResponse.getSchema());
                    	instance.__bitField2 |= 2;
                    	break;
                    case 67:
                    	instance.msgPetGiftReceiveRequest = input.mergeObject(null, proto.message.PetGiftReceiveRequest.getSchema());
                    	instance.__bitField2 |= 4;
                    	break;
                    case 68:
                    	instance.msgPetGiftReceiveResponse = input.mergeObject(null, proto.message.PetGiftReceiveResponse.getSchema());
                    	instance.__bitField2 |= 8;
                    	break;
                    case 70:
                    	instance.msgPetGiftAskingResponse = input.mergeObject(null, proto.message.PetGiftAskingResponse.getSchema());
                    	instance.__bitField2 |= 16;
                    	break;
                    case 71:
                    	instance.msgClientActionLogRequest = input.mergeObject(null, proto.message.ClientActionLogRequest.getSchema());
                    	instance.__bitField2 |= 32;
                    	break;
                    case 72:
                    	instance.msgAdsViewRequest = input.mergeObject(null, proto.message.AdsViewRequest.getSchema());
                    	instance.__bitField2 |= 64;
                    	break;
                    case 73:
                    	instance.msgAdsViewResponse = input.mergeObject(null, proto.message.AdsViewResponse.getSchema());
                    	instance.__bitField2 |= 128;
                    	break;
                    case 74:
                    	instance.msgPetLevelUpResponse = input.mergeObject(null, proto.message.PetLevelUpResponse.getSchema());
                    	instance.__bitField2 |= 256;
                    	break;
                    case 75:
                    	instance.msgDailySupportResponse = input.mergeObject(null, proto.message.DailySupportResponse.getSchema());
                    	instance.__bitField2 |= 512;
                    	break;
                    case 76:
                    	instance.msgDailyBonusRequest = input.mergeObject(null, proto.message.DailyBonusRequest.getSchema());
                    	instance.__bitField2 |= 1024;
                    	break;
                    case 77:
                    	instance.msgDailyBonusResponse = input.mergeObject(null, proto.message.DailyBonusResponse.getSchema());
                    	instance.__bitField2 |= 2048;
                    	break;
                    case 78:
                    	instance.msgClaimDailyBonusRequest = input.mergeObject(null, proto.message.ClaimDailyBonusRequest.getSchema());
                    	instance.__bitField2 |= 4096;
                    	break;
                    case 79:
                    	instance.msgClaimDailyBonusResponse = input.mergeObject(null, proto.message.ClaimDailyBonusResponse.getSchema());
                    	instance.__bitField2 |= 8192;
                    	break;
                    case 80:
                    	instance.msgCollectionInfoRequest = input.mergeObject(null, proto.message.CollectionInfoRequest.getSchema());
                    	instance.__bitField2 |= 16384;
                    	break;
                    case 81:
                    	instance.msgCollectionInfoResponse = input.mergeObject(null, proto.message.CollectionInfoResponse.getSchema());
                    	instance.__bitField2 |= 32768;
                    	break;
                    case 82:
                    	instance.msgClaimCollectionPrizeRequest = input.mergeObject(null, proto.message.ClaimCollectionPrizeRequest.getSchema());
                    	instance.__bitField2 |= 65536;
                    	break;
                    case 83:
                    	instance.msgClaimCollectionPrizeResponse = input.mergeObject(null, proto.message.ClaimCollectionPrizeResponse.getSchema());
                    	instance.__bitField2 |= 131072;
                    	break;
                    case 84:
                    	instance.msgDonateFriendListDetailRequest = input.mergeObject(null, proto.message.DonateFriendListDetailRequest.getSchema());
                    	instance.__bitField2 |= 262144;
                    	break;
                    case 85:
                    	instance.msgDonateFriendListDetailResponse = input.mergeObject(null, proto.message.DonateFriendListDetailResponse.getSchema());
                    	instance.__bitField2 |= 524288;
                    	break;
                    case 86:
                    	instance.msgDonateFriendReceiveItemsRequest = input.mergeObject(null, proto.message.DonateFriendReceiveItemsRequest.getSchema());
                    	instance.__bitField2 |= 1048576;
                    	break;
                    case 87:
                    	instance.msgDonateFriendReceiveItemsResponse = input.mergeObject(null, proto.message.DonateFriendReceiveItemsResponse.getSchema());
                    	instance.__bitField2 |= 2097152;
                    	break;
                    case 88:
                    	instance.msgDonateFriendSendItemsRequest = input.mergeObject(null, proto.message.DonateFriendSendItemsRequest.getSchema());
                    	instance.__bitField2 |= 4194304;
                    	break;
                    case 89:
                    	instance.msgDonateFriendSendItemsResponse = input.mergeObject(null, proto.message.DonateFriendSendItemsResponse.getSchema());
                    	instance.__bitField2 |= 8388608;
                    	break;
                    case 90:
                    	instance.msgDonateFriendCheckGiftRequest = input.mergeObject(null, proto.message.DonateFriendCheckGiftRequest.getSchema());
                    	instance.__bitField2 |= 16777216;
                    	break;
                    case 91:
                    	instance.msgDonateFriendCheckGiftResponse = input.mergeObject(null, proto.message.DonateFriendCheckGiftResponse.getSchema());
                    	instance.__bitField2 |= 33554432;
                    	break;
                    case 92:
                    	instance.msgDonateListFriendSendItemsRequest = input.mergeObject(null, proto.message.DonateListFriendSendItemsRequest.getSchema());
                    	instance.__bitField2 |= 67108864;
                    	break;
                    case 93:
                    	instance.msgDonateListFriendSendItemsResponse = input.mergeObject(null, proto.message.DonateListFriendSendItemsResponse.getSchema());
                    	instance.__bitField2 |= 134217728;
                    	break;
                    case 94:
                    	instance.msgAccumulatePromotionRequest = input.mergeObject(null, proto.message.AccumulatePromotionRequest.getSchema());
                    	instance.__bitField2 |= 268435456;
                    	break;
                    case 95:
                    	instance.msgAccumulatePromotionResponse = input.mergeObject(null, proto.message.AccumulatePromotionResponse.getSchema());
                    	instance.__bitField2 |= 536870912;
                    	break;
                    case 96:
                    	instance.msgAccumulateClaimRequest = input.mergeObject(null, proto.message.AccumulateClaimRequest.getSchema());
                    	instance.__bitField2 |= 1073741824;
                    	break;
                    case 97:
                    	instance.msgAccumulateClaimResponse = input.mergeObject(null, proto.message.AccumulateClaimResponse.getSchema());
                    	instance.__bitField2 |= -2147483648;
                    	break;
                    case 98:
                    	instance.msgLeaderBoardRequest = input.mergeObject(null, proto.message.LeaderBoardRequest.getSchema());
                    	instance.__bitField3 |= 1;
                    	break;
                    case 99:
                    	instance.msgLeaderBoardResponse = input.mergeObject(null, proto.message.LeaderBoardResponse.getSchema());
                    	instance.__bitField3 |= 2;
                    	break;
                    case 100:
                    	instance.msgArchiveCollectionRequest = input.mergeObject(null, proto.message.ArchiveCollectionRequest.getSchema());
                    	instance.__bitField3 |= 4;
                    	break;
                    case 101:
                    	instance.msgArchiveCollectionResponse = input.mergeObject(null, proto.message.ArchiveCollectionResponse.getSchema());
                    	instance.__bitField3 |= 8;
                    	break;
                    case 102:
                    	instance.msgAdsInfoRequest = input.mergeObject(null, proto.message.AdsInfoRequest.getSchema());
                    	instance.__bitField3 |= 16;
                    	break;
                    case 103:
                    	instance.msgAdsInfoResponse = input.mergeObject(null, proto.message.AdsInfoResponse.getSchema());
                    	instance.__bitField3 |= 32;
                    	break;
                    case 104:
                    	instance.msgAdsRewardClaimRequest = input.mergeObject(null, proto.message.AdsRewardClaimRequest.getSchema());
                    	instance.__bitField3 |= 64;
                    	break;
                    case 105:
                    	instance.msgH3EnterRequest = input.mergeObject(null, proto.message.H3EnterRequest.getSchema());
                    	instance.__bitField3 |= 128;
                    	break;
                    case 106:
                    	instance.msgH3EnterResponse = input.mergeObject(null, proto.message.H3EnterResponse.getSchema());
                    	instance.__bitField3 |= 256;
                    	break;
                    case 107:
                    	instance.msgH3LeaveRequest = input.mergeObject(null, proto.message.H3LeaveRequest.getSchema());
                    	instance.__bitField3 |= 512;
                    	break;
                    case 108:
                    	instance.msgH3LeaveResponse = input.mergeObject(null, proto.message.H3LeaveResponse.getSchema());
                    	instance.__bitField3 |= 1024;
                    	break;
                    case 109:
                    	instance.msgH3TurnRequest = input.mergeObject(null, proto.message.H3TurnRequest.getSchema());
                    	instance.__bitField3 |= 2048;
                    	break;
                    case 110:
                    	instance.msgH3TurnResponse = input.mergeObject(null, proto.message.H3TurnResponse.getSchema());
                    	instance.__bitField3 |= 4096;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
        }

        @Override
        public void writeTo(io.protostuff.Output output, ProfileMessage instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
            	output.writeEnum(1, instance.command, false);
            }

            if((instance.__bitField0 & 2) == 2) {
            	output.writeObject(2, instance.msgGetUserMoneyRequest, proto.message.GetUserMoneyRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 4) == 4) {
            	output.writeObject(3, instance.msgGetUserMoneyResponse, proto.message.GetUserMoneyResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 8) == 8) {
            	output.writeObject(4, instance.msgGetUserProfileRequest, proto.message.GetUserProfileRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 16) == 16) {
            	output.writeObject(5, instance.msgGetUserProfileResponse, proto.message.GetUserProfileResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 32) == 32) {
            	output.writeObject(6, instance.msgLevelUpResponse, proto.message.LevelUpResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 64) == 64) {
            	output.writeObject(7, instance.msgGetUserInboxResponse, proto.message.GetUserInboxResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 128) == 128) {
            	output.writeObject(8, instance.msgUpdateProfileFBRequest, proto.message.UpdateProfileFBRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 256) == 256) {
            	output.writeObject(9, instance.msgUpdateProfileFBResponse, proto.message.UpdateProfileFBResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 512) == 512) {
            	output.writeObject(10, instance.msgUpdateUserNameRequest, proto.message.UpdateUserNameRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 1024) == 1024) {
            	output.writeObject(11, instance.msgUpdateUserNameResponse, proto.message.UpdateUserNameResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 2048) == 2048) {
            	output.writeObject(12, instance.msgClaimInboxRequest, proto.message.ClaimInboxRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 4096) == 4096) {
            	output.writeObject(13, instance.msgClaimInboxResponse, proto.message.ClaimInboxResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 8192) == 8192) {
            	output.writeObject(14, instance.msgFriendListRawResponse, proto.message.FriendListRawResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 16384) == 16384) {
            	output.writeObject(15, instance.msgFriendListDetailRequest, proto.message.FriendListDetailRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 32768) == 32768) {
            	output.writeObject(16, instance.msgFriendListDetailResponse, proto.message.FriendListDetailResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 65536) == 65536) {
            	output.writeObject(17, instance.msgFriendActionRequest, proto.message.FriendActionRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 131072) == 131072) {
            	output.writeObject(18, instance.msgFriendActionResponse, proto.message.FriendActionResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 262144) == 262144) {
            	output.writeObject(19, instance.msgFriendSearchRequest, proto.message.FriendSearchRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 524288) == 524288) {
            	output.writeObject(20, instance.msgFriendSearchResponse, proto.message.FriendSearchResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 1048576) == 1048576) {
            	output.writeObject(21, instance.msgFriendUnlockMoneySendRequest, proto.message.FriendUnlockMoneySendRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 2097152) == 2097152) {
            	output.writeObject(22, instance.msgFriendUnlockMoneySendResponse, proto.message.FriendUnlockMoneySendResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 4194304) == 4194304) {
            	output.writeObject(23, instance.msgFriendMessageSendRequest, proto.message.FriendMessageSendRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 8388608) == 8388608) {
            	output.writeObject(24, instance.msgDailyQuestInfoResponse, proto.message.DailyQuestInfoResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 16777216) == 16777216) {
            	output.writeObject(25, instance.msgDailyQuestReceiveRequest, proto.message.DailyQuestReceiveRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 33554432) == 33554432) {
            	output.writeObject(26, instance.msgDailyQuestReceiveResponse, proto.message.DailyQuestReceiveResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 67108864) == 67108864) {
            	output.writeObject(27, instance.msgDailySnsFriendInviteRequest, proto.message.DailySnsFriendInviteRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 134217728) == 134217728) {
            	output.writeObject(28, instance.msgDailySnsFriendInviteResponse, proto.message.DailySnsFriendInviteResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 268435456) == 268435456) {
            	output.writeObject(29, instance.msgGiftCodeRequest, proto.message.GiftCodeRequest.getSchema(), false);
            }

            if((instance.__bitField0 & 536870912) == 536870912) {
            	output.writeObject(30, instance.msgGiftCodeResponse, proto.message.GiftCodeResponse.getSchema(), false);
            }

            if((instance.__bitField0 & 1073741824) == 1073741824) {
            	output.writeObject(31, instance.msgGetUserInventoryResponse, proto.message.GetUserInventoryResponse.getSchema(), false);
            }

            if((instance.__bitField0 & -2147483648) == -2147483648) {
            	output.writeObject(32, instance.msgGetCannonDataResponse, proto.message.GetCannonDataResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 1) == 1) {
            	output.writeObject(33, instance.msgCannonUnlockRequest, proto.message.CannonUnlockRequest.getSchema(), false);
            }

            if((instance.__bitField1 & 2) == 2) {
            	output.writeObject(34, instance.msgCannonUnlockResponse, proto.message.CannonUnlockResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 4) == 4) {
            	output.writeObject(35, instance.msgCannonUpgradeRequest, proto.message.CannonUpgradeRequest.getSchema(), false);
            }

            if((instance.__bitField1 & 8) == 8) {
            	output.writeObject(36, instance.msgCannonUpgradeResponse, proto.message.CannonUpgradeResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 16) == 16) {
                output.writeInt64(37, instance.clienttime, false);
            }

            if((instance.__bitField1 & 32) == 32) {
            	output.writeObject(38, instance.msgWheelEnterRequest, proto.message.WheelEnterRequest.getSchema(), false);
            }

            if((instance.__bitField1 & 64) == 64) {
            	output.writeObject(39, instance.msgWheelEnterResponse, proto.message.WheelEnterResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 128) == 128) {
            	output.writeObject(40, instance.msgWheelLeaveRequest, proto.message.WheelLeaveRequest.getSchema(), false);
            }

            if((instance.__bitField1 & 256) == 256) {
            	output.writeObject(41, instance.msgWheelLeaveResponse, proto.message.WheelLeaveResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 512) == 512) {
            	output.writeObject(42, instance.msgWheelTurnRequest, proto.message.WheelTurnRequest.getSchema(), false);
            }

            if((instance.__bitField1 & 1024) == 1024) {
            	output.writeObject(43, instance.msgWheelTurnResponse, proto.message.WheelTurnResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 2048) == 2048) {
            	output.writeObject(44, instance.msgWheelGetRequest, proto.message.WheelGetRequest.getSchema(), false);
            }

            if((instance.__bitField1 & 4096) == 4096) {
            	output.writeObject(45, instance.msgWheelGetResponse, proto.message.WheelGetResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 8192) == 8192) {
            	output.writeObject(46, instance.msgWheelIngameRequest, proto.message.WheelIngameRequest.getSchema(), false);
            }

            if((instance.__bitField1 & 16384) == 16384) {
            	output.writeObject(47, instance.msgWheelIngameResponse, proto.message.WheelIngameResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 32768) == 32768) {
            	output.writeObject(48, instance.msgWheelCarrierRequest, proto.message.WheelCarrierRequest.getSchema(), false);
            }

            if((instance.__bitField1 & 65536) == 65536) {
            	output.writeObject(49, instance.msgWheelCarrierResponse, proto.message.WheelCarrierResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 131072) == 131072) {
            	output.writeObject(50, instance.msgSoccerTeamsResponse, proto.message.SoccerTeamsResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 262144) == 262144) {
            	output.writeObject(51, instance.msgSoccerEnterRequest, proto.message.SoccerEnterRequest.getSchema(), false);
            }

            if((instance.__bitField1 & 524288) == 524288) {
            	output.writeObject(52, instance.msgSoccerEnterResponse, proto.message.SoccerEnterResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 1048576) == 1048576) {
            	output.writeObject(53, instance.msgSoccerMatchesRequest, proto.message.SoccerMatchesRequest.getSchema(), false);
            }

            if((instance.__bitField1 & 2097152) == 2097152) {
            	output.writeObject(54, instance.msgSoccerMatchesResponse, proto.message.SoccerMatchesResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 4194304) == 4194304) {
            	output.writeObject(55, instance.msgSoccerBetRequest, proto.message.SoccerBetRequest.getSchema(), false);
            }

            if((instance.__bitField1 & 8388608) == 8388608) {
            	output.writeObject(56, instance.msgSoccerBetResponse, proto.message.SoccerBetResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 16777216) == 16777216) {
            	output.writeObject(57, instance.msgSoccerBetCountResponse, proto.message.SoccerBetCountResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 33554432) == 33554432) {
            	output.writeObject(58, instance.msgSoccerReceiveRequest, proto.message.SoccerReceiveRequest.getSchema(), false);
            }

            if((instance.__bitField1 & 67108864) == 67108864) {
            	output.writeObject(59, instance.msgSoccerReceiveResponse, proto.message.SoccerReceiveResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 134217728) == 134217728) {
            	output.writeObject(60, instance.msgSoccerReddotRequest, proto.message.SoccerReddotRequest.getSchema(), false);
            }

            if((instance.__bitField1 & 268435456) == 268435456) {
            	output.writeObject(61, instance.msgSoccerReddotResponse, proto.message.SoccerReddotResponse.getSchema(), false);
            }

            if((instance.__bitField1 & 536870912) == 536870912) {
            	output.writeObject(62, instance.msgPetInfoRequest, proto.message.PetInfoRequest.getSchema(), false);
            }

            if((instance.__bitField1 & 1073741824) == 1073741824) {
            	output.writeObject(63, instance.msgPetInfoResponse, proto.message.PetInfoResponse.getSchema(), false);
            }

            if((instance.__bitField1 & -2147483648) == -2147483648) {
            	output.writeObject(64, instance.msgPetUpdateResponse, proto.message.PetUpdateResponse.getSchema(), false);
            }

            if((instance.__bitField2 & 1) == 1) {
            	output.writeObject(65, instance.msgPetUnlockRequest, proto.message.PetUnlockRequest.getSchema(), false);
            }

            if((instance.__bitField2 & 2) == 2) {
            	output.writeObject(66, instance.msgPetUnlockResponse, proto.message.PetUnlockResponse.getSchema(), false);
            }

            if((instance.__bitField2 & 4) == 4) {
            	output.writeObject(67, instance.msgPetGiftReceiveRequest, proto.message.PetGiftReceiveRequest.getSchema(), false);
            }

            if((instance.__bitField2 & 8) == 8) {
            	output.writeObject(68, instance.msgPetGiftReceiveResponse, proto.message.PetGiftReceiveResponse.getSchema(), false);
            }

            if((instance.__bitField2 & 16) == 16) {
            	output.writeObject(70, instance.msgPetGiftAskingResponse, proto.message.PetGiftAskingResponse.getSchema(), false);
            }

            if((instance.__bitField2 & 32) == 32) {
            	output.writeObject(71, instance.msgClientActionLogRequest, proto.message.ClientActionLogRequest.getSchema(), false);
            }

            if((instance.__bitField2 & 64) == 64) {
            	output.writeObject(72, instance.msgAdsViewRequest, proto.message.AdsViewRequest.getSchema(), false);
            }

            if((instance.__bitField2 & 128) == 128) {
            	output.writeObject(73, instance.msgAdsViewResponse, proto.message.AdsViewResponse.getSchema(), false);
            }

            if((instance.__bitField2 & 256) == 256) {
            	output.writeObject(74, instance.msgPetLevelUpResponse, proto.message.PetLevelUpResponse.getSchema(), false);
            }

            if((instance.__bitField2 & 512) == 512) {
            	output.writeObject(75, instance.msgDailySupportResponse, proto.message.DailySupportResponse.getSchema(), false);
            }

            if((instance.__bitField2 & 1024) == 1024) {
            	output.writeObject(76, instance.msgDailyBonusRequest, proto.message.DailyBonusRequest.getSchema(), false);
            }

            if((instance.__bitField2 & 2048) == 2048) {
            	output.writeObject(77, instance.msgDailyBonusResponse, proto.message.DailyBonusResponse.getSchema(), false);
            }

            if((instance.__bitField2 & 4096) == 4096) {
            	output.writeObject(78, instance.msgClaimDailyBonusRequest, proto.message.ClaimDailyBonusRequest.getSchema(), false);
            }

            if((instance.__bitField2 & 8192) == 8192) {
            	output.writeObject(79, instance.msgClaimDailyBonusResponse, proto.message.ClaimDailyBonusResponse.getSchema(), false);
            }

            if((instance.__bitField2 & 16384) == 16384) {
            	output.writeObject(80, instance.msgCollectionInfoRequest, proto.message.CollectionInfoRequest.getSchema(), false);
            }

            if((instance.__bitField2 & 32768) == 32768) {
            	output.writeObject(81, instance.msgCollectionInfoResponse, proto.message.CollectionInfoResponse.getSchema(), false);
            }

            if((instance.__bitField2 & 65536) == 65536) {
            	output.writeObject(82, instance.msgClaimCollectionPrizeRequest, proto.message.ClaimCollectionPrizeRequest.getSchema(), false);
            }

            if((instance.__bitField2 & 131072) == 131072) {
            	output.writeObject(83, instance.msgClaimCollectionPrizeResponse, proto.message.ClaimCollectionPrizeResponse.getSchema(), false);
            }

            if((instance.__bitField2 & 262144) == 262144) {
            	output.writeObject(84, instance.msgDonateFriendListDetailRequest, proto.message.DonateFriendListDetailRequest.getSchema(), false);
            }

            if((instance.__bitField2 & 524288) == 524288) {
            	output.writeObject(85, instance.msgDonateFriendListDetailResponse, proto.message.DonateFriendListDetailResponse.getSchema(), false);
            }

            if((instance.__bitField2 & 1048576) == 1048576) {
            	output.writeObject(86, instance.msgDonateFriendReceiveItemsRequest, proto.message.DonateFriendReceiveItemsRequest.getSchema(), false);
            }

            if((instance.__bitField2 & 2097152) == 2097152) {
            	output.writeObject(87, instance.msgDonateFriendReceiveItemsResponse, proto.message.DonateFriendReceiveItemsResponse.getSchema(), false);
            }

            if((instance.__bitField2 & 4194304) == 4194304) {
            	output.writeObject(88, instance.msgDonateFriendSendItemsRequest, proto.message.DonateFriendSendItemsRequest.getSchema(), false);
            }

            if((instance.__bitField2 & 8388608) == 8388608) {
            	output.writeObject(89, instance.msgDonateFriendSendItemsResponse, proto.message.DonateFriendSendItemsResponse.getSchema(), false);
            }

            if((instance.__bitField2 & 16777216) == 16777216) {
            	output.writeObject(90, instance.msgDonateFriendCheckGiftRequest, proto.message.DonateFriendCheckGiftRequest.getSchema(), false);
            }

            if((instance.__bitField2 & 33554432) == 33554432) {
            	output.writeObject(91, instance.msgDonateFriendCheckGiftResponse, proto.message.DonateFriendCheckGiftResponse.getSchema(), false);
            }

            if((instance.__bitField2 & 67108864) == 67108864) {
            	output.writeObject(92, instance.msgDonateListFriendSendItemsRequest, proto.message.DonateListFriendSendItemsRequest.getSchema(), false);
            }

            if((instance.__bitField2 & 134217728) == 134217728) {
            	output.writeObject(93, instance.msgDonateListFriendSendItemsResponse, proto.message.DonateListFriendSendItemsResponse.getSchema(), false);
            }

            if((instance.__bitField2 & 268435456) == 268435456) {
            	output.writeObject(94, instance.msgAccumulatePromotionRequest, proto.message.AccumulatePromotionRequest.getSchema(), false);
            }

            if((instance.__bitField2 & 536870912) == 536870912) {
            	output.writeObject(95, instance.msgAccumulatePromotionResponse, proto.message.AccumulatePromotionResponse.getSchema(), false);
            }

            if((instance.__bitField2 & 1073741824) == 1073741824) {
            	output.writeObject(96, instance.msgAccumulateClaimRequest, proto.message.AccumulateClaimRequest.getSchema(), false);
            }

            if((instance.__bitField2 & -2147483648) == -2147483648) {
            	output.writeObject(97, instance.msgAccumulateClaimResponse, proto.message.AccumulateClaimResponse.getSchema(), false);
            }

            if((instance.__bitField3 & 1) == 1) {
            	output.writeObject(98, instance.msgLeaderBoardRequest, proto.message.LeaderBoardRequest.getSchema(), false);
            }

            if((instance.__bitField3 & 2) == 2) {
            	output.writeObject(99, instance.msgLeaderBoardResponse, proto.message.LeaderBoardResponse.getSchema(), false);
            }

            if((instance.__bitField3 & 4) == 4) {
            	output.writeObject(100, instance.msgArchiveCollectionRequest, proto.message.ArchiveCollectionRequest.getSchema(), false);
            }

            if((instance.__bitField3 & 8) == 8) {
            	output.writeObject(101, instance.msgArchiveCollectionResponse, proto.message.ArchiveCollectionResponse.getSchema(), false);
            }

            if((instance.__bitField3 & 16) == 16) {
            	output.writeObject(102, instance.msgAdsInfoRequest, proto.message.AdsInfoRequest.getSchema(), false);
            }

            if((instance.__bitField3 & 32) == 32) {
            	output.writeObject(103, instance.msgAdsInfoResponse, proto.message.AdsInfoResponse.getSchema(), false);
            }

            if((instance.__bitField3 & 64) == 64) {
            	output.writeObject(104, instance.msgAdsRewardClaimRequest, proto.message.AdsRewardClaimRequest.getSchema(), false);
            }

            if((instance.__bitField3 & 128) == 128) {
            	output.writeObject(105, instance.msgH3EnterRequest, proto.message.H3EnterRequest.getSchema(), false);
            }

            if((instance.__bitField3 & 256) == 256) {
            	output.writeObject(106, instance.msgH3EnterResponse, proto.message.H3EnterResponse.getSchema(), false);
            }

            if((instance.__bitField3 & 512) == 512) {
            	output.writeObject(107, instance.msgH3LeaveRequest, proto.message.H3LeaveRequest.getSchema(), false);
            }

            if((instance.__bitField3 & 1024) == 1024) {
            	output.writeObject(108, instance.msgH3LeaveResponse, proto.message.H3LeaveResponse.getSchema(), false);
            }

            if((instance.__bitField3 & 2048) == 2048) {
            	output.writeObject(109, instance.msgH3TurnRequest, proto.message.H3TurnRequest.getSchema(), false);
            }

            if((instance.__bitField3 & 4096) == 4096) {
            	output.writeObject(110, instance.msgH3TurnResponse, proto.message.H3TurnResponse.getSchema(), false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "command";
        		case 2: return "msgGetUserMoneyRequest";
        		case 3: return "msgGetUserMoneyResponse";
        		case 4: return "msgGetUserProfileRequest";
        		case 5: return "msgGetUserProfileResponse";
        		case 6: return "msgLevelUpResponse";
        		case 7: return "msgGetUserInboxResponse";
        		case 8: return "msgUpdateProfileFBRequest";
        		case 9: return "msgUpdateProfileFBResponse";
        		case 10: return "msgUpdateUserNameRequest";
        		case 11: return "msgUpdateUserNameResponse";
        		case 12: return "msgClaimInboxRequest";
        		case 13: return "msgClaimInboxResponse";
        		case 14: return "msgFriendListRawResponse";
        		case 15: return "msgFriendListDetailRequest";
        		case 16: return "msgFriendListDetailResponse";
        		case 17: return "msgFriendActionRequest";
        		case 18: return "msgFriendActionResponse";
        		case 19: return "msgFriendSearchRequest";
        		case 20: return "msgFriendSearchResponse";
        		case 21: return "msgFriendUnlockMoneySendRequest";
        		case 22: return "msgFriendUnlockMoneySendResponse";
        		case 23: return "msgFriendMessageSendRequest";
        		case 24: return "msgDailyQuestInfoResponse";
        		case 25: return "msgDailyQuestReceiveRequest";
        		case 26: return "msgDailyQuestReceiveResponse";
        		case 27: return "msgDailySnsFriendInviteRequest";
        		case 28: return "msgDailySnsFriendInviteResponse";
        		case 29: return "msgGiftCodeRequest";
        		case 30: return "msgGiftCodeResponse";
        		case 31: return "msgGetUserInventoryResponse";
        		case 32: return "msgGetCannonDataResponse";
        		case 33: return "msgCannonUnlockRequest";
        		case 34: return "msgCannonUnlockResponse";
        		case 35: return "msgCannonUpgradeRequest";
        		case 36: return "msgCannonUpgradeResponse";
        		case 37: return "clienttime";
        		case 38: return "msgWheelEnterRequest";
        		case 39: return "msgWheelEnterResponse";
        		case 40: return "msgWheelLeaveRequest";
        		case 41: return "msgWheelLeaveResponse";
        		case 42: return "msgWheelTurnRequest";
        		case 43: return "msgWheelTurnResponse";
        		case 44: return "msgWheelGetRequest";
        		case 45: return "msgWheelGetResponse";
        		case 46: return "msgWheelIngameRequest";
        		case 47: return "msgWheelIngameResponse";
        		case 48: return "msgWheelCarrierRequest";
        		case 49: return "msgWheelCarrierResponse";
        		case 50: return "msgSoccerTeamsResponse";
        		case 51: return "msgSoccerEnterRequest";
        		case 52: return "msgSoccerEnterResponse";
        		case 53: return "msgSoccerMatchesRequest";
        		case 54: return "msgSoccerMatchesResponse";
        		case 55: return "msgSoccerBetRequest";
        		case 56: return "msgSoccerBetResponse";
        		case 57: return "msgSoccerBetCountResponse";
        		case 58: return "msgSoccerReceiveRequest";
        		case 59: return "msgSoccerReceiveResponse";
        		case 60: return "msgSoccerReddotRequest";
        		case 61: return "msgSoccerReddotResponse";
        		case 62: return "msgPetInfoRequest";
        		case 63: return "msgPetInfoResponse";
        		case 64: return "msgPetUpdateResponse";
        		case 65: return "msgPetUnlockRequest";
        		case 66: return "msgPetUnlockResponse";
        		case 67: return "msgPetGiftReceiveRequest";
        		case 68: return "msgPetGiftReceiveResponse";
        		case 70: return "msgPetGiftAskingResponse";
        		case 71: return "msgClientActionLogRequest";
        		case 72: return "msgAdsViewRequest";
        		case 73: return "msgAdsViewResponse";
        		case 74: return "msgPetLevelUpResponse";
        		case 75: return "msgDailySupportResponse";
        		case 76: return "msgDailyBonusRequest";
        		case 77: return "msgDailyBonusResponse";
        		case 78: return "msgClaimDailyBonusRequest";
        		case 79: return "msgClaimDailyBonusResponse";
        		case 80: return "msgCollectionInfoRequest";
        		case 81: return "msgCollectionInfoResponse";
        		case 82: return "msgClaimCollectionPrizeRequest";
        		case 83: return "msgClaimCollectionPrizeResponse";
        		case 84: return "msgDonateFriendListDetailRequest";
        		case 85: return "msgDonateFriendListDetailResponse";
        		case 86: return "msgDonateFriendReceiveItemsRequest";
        		case 87: return "msgDonateFriendReceiveItemsResponse";
        		case 88: return "msgDonateFriendSendItemsRequest";
        		case 89: return "msgDonateFriendSendItemsResponse";
        		case 90: return "msgDonateFriendCheckGiftRequest";
        		case 91: return "msgDonateFriendCheckGiftResponse";
        		case 92: return "msgDonateListFriendSendItemsRequest";
        		case 93: return "msgDonateListFriendSendItemsResponse";
        		case 94: return "msgAccumulatePromotionRequest";
        		case 95: return "msgAccumulatePromotionResponse";
        		case 96: return "msgAccumulateClaimRequest";
        		case 97: return "msgAccumulateClaimResponse";
        		case 98: return "msgLeaderBoardRequest";
        		case 99: return "msgLeaderBoardResponse";
        		case 100: return "msgArchiveCollectionRequest";
        		case 101: return "msgArchiveCollectionResponse";
        		case 102: return "msgAdsInfoRequest";
        		case 103: return "msgAdsInfoResponse";
        		case 104: return "msgAdsRewardClaimRequest";
        		case 105: return "msgH3EnterRequest";
        		case 106: return "msgH3EnterResponse";
        		case 107: return "msgH3LeaveRequest";
        		case 108: return "msgH3LeaveResponse";
        		case 109: return "msgH3TurnRequest";
        		case 110: return "msgH3TurnResponse";
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

        private proto.message.GetUserMoneyRequest msgGetUserMoneyRequest;

        private proto.message.GetUserMoneyResponse msgGetUserMoneyResponse;

        private proto.message.GetUserProfileRequest msgGetUserProfileRequest;

        private proto.message.GetUserProfileResponse msgGetUserProfileResponse;

        private proto.message.LevelUpResponse msgLevelUpResponse;

        private proto.message.GetUserInboxResponse msgGetUserInboxResponse;

        private proto.message.UpdateProfileFBRequest msgUpdateProfileFBRequest;

        private proto.message.UpdateProfileFBResponse msgUpdateProfileFBResponse;

        private proto.message.UpdateUserNameRequest msgUpdateUserNameRequest;

        private proto.message.UpdateUserNameResponse msgUpdateUserNameResponse;

        private proto.message.ClaimInboxRequest msgClaimInboxRequest;

        private proto.message.ClaimInboxResponse msgClaimInboxResponse;

        private proto.message.FriendListRawResponse msgFriendListRawResponse;

        private proto.message.FriendListDetailRequest msgFriendListDetailRequest;

        private proto.message.FriendListDetailResponse msgFriendListDetailResponse;

        private proto.message.FriendActionRequest msgFriendActionRequest;

        private proto.message.FriendActionResponse msgFriendActionResponse;

        private proto.message.FriendSearchRequest msgFriendSearchRequest;

        private proto.message.FriendSearchResponse msgFriendSearchResponse;

        private proto.message.FriendUnlockMoneySendRequest msgFriendUnlockMoneySendRequest;

        private proto.message.FriendUnlockMoneySendResponse msgFriendUnlockMoneySendResponse;

        private proto.message.FriendMessageSendRequest msgFriendMessageSendRequest;

        private proto.message.DailyQuestInfoResponse msgDailyQuestInfoResponse;

        private proto.message.DailyQuestReceiveRequest msgDailyQuestReceiveRequest;

        private proto.message.DailyQuestReceiveResponse msgDailyQuestReceiveResponse;

        private proto.message.DailySnsFriendInviteRequest msgDailySnsFriendInviteRequest;

        private proto.message.DailySnsFriendInviteResponse msgDailySnsFriendInviteResponse;

        private proto.message.GiftCodeRequest msgGiftCodeRequest;

        private proto.message.GiftCodeResponse msgGiftCodeResponse;

        private proto.message.GetUserInventoryResponse msgGetUserInventoryResponse;

        private proto.message.GetCannonDataResponse msgGetCannonDataResponse;

        private proto.message.CannonUnlockRequest msgCannonUnlockRequest;

        private proto.message.CannonUnlockResponse msgCannonUnlockResponse;

        private proto.message.CannonUpgradeRequest msgCannonUpgradeRequest;

        private proto.message.CannonUpgradeResponse msgCannonUpgradeResponse;

        private long clienttime;

        private proto.message.WheelEnterRequest msgWheelEnterRequest;

        private proto.message.WheelEnterResponse msgWheelEnterResponse;

        private proto.message.WheelLeaveRequest msgWheelLeaveRequest;

        private proto.message.WheelLeaveResponse msgWheelLeaveResponse;

        private proto.message.WheelTurnRequest msgWheelTurnRequest;

        private proto.message.WheelTurnResponse msgWheelTurnResponse;

        private proto.message.WheelGetRequest msgWheelGetRequest;

        private proto.message.WheelGetResponse msgWheelGetResponse;

        private proto.message.WheelIngameRequest msgWheelIngameRequest;

        private proto.message.WheelIngameResponse msgWheelIngameResponse;

        private proto.message.WheelCarrierRequest msgWheelCarrierRequest;

        private proto.message.WheelCarrierResponse msgWheelCarrierResponse;

        private proto.message.SoccerTeamsResponse msgSoccerTeamsResponse;

        private proto.message.SoccerEnterRequest msgSoccerEnterRequest;

        private proto.message.SoccerEnterResponse msgSoccerEnterResponse;

        private proto.message.SoccerMatchesRequest msgSoccerMatchesRequest;

        private proto.message.SoccerMatchesResponse msgSoccerMatchesResponse;

        private proto.message.SoccerBetRequest msgSoccerBetRequest;

        private proto.message.SoccerBetResponse msgSoccerBetResponse;

        private proto.message.SoccerBetCountResponse msgSoccerBetCountResponse;

        private proto.message.SoccerReceiveRequest msgSoccerReceiveRequest;

        private proto.message.SoccerReceiveResponse msgSoccerReceiveResponse;

        private proto.message.SoccerReddotRequest msgSoccerReddotRequest;

        private proto.message.SoccerReddotResponse msgSoccerReddotResponse;

        private proto.message.PetInfoRequest msgPetInfoRequest;

        private proto.message.PetInfoResponse msgPetInfoResponse;

        private proto.message.PetUpdateResponse msgPetUpdateResponse;

        private proto.message.PetUnlockRequest msgPetUnlockRequest;

        private proto.message.PetUnlockResponse msgPetUnlockResponse;

        private proto.message.PetGiftReceiveRequest msgPetGiftReceiveRequest;

        private proto.message.PetGiftReceiveResponse msgPetGiftReceiveResponse;

        private proto.message.PetGiftAskingResponse msgPetGiftAskingResponse;

        private proto.message.ClientActionLogRequest msgClientActionLogRequest;

        private proto.message.AdsViewRequest msgAdsViewRequest;

        private proto.message.AdsViewResponse msgAdsViewResponse;

        private proto.message.PetLevelUpResponse msgPetLevelUpResponse;

        private proto.message.DailySupportResponse msgDailySupportResponse;

        private proto.message.DailyBonusRequest msgDailyBonusRequest;

        private proto.message.DailyBonusResponse msgDailyBonusResponse;

        private proto.message.ClaimDailyBonusRequest msgClaimDailyBonusRequest;

        private proto.message.ClaimDailyBonusResponse msgClaimDailyBonusResponse;

        private proto.message.CollectionInfoRequest msgCollectionInfoRequest;

        private proto.message.CollectionInfoResponse msgCollectionInfoResponse;

        private proto.message.ClaimCollectionPrizeRequest msgClaimCollectionPrizeRequest;

        private proto.message.ClaimCollectionPrizeResponse msgClaimCollectionPrizeResponse;

        private proto.message.DonateFriendListDetailRequest msgDonateFriendListDetailRequest;

        private proto.message.DonateFriendListDetailResponse msgDonateFriendListDetailResponse;

        private proto.message.DonateFriendReceiveItemsRequest msgDonateFriendReceiveItemsRequest;

        private proto.message.DonateFriendReceiveItemsResponse msgDonateFriendReceiveItemsResponse;

        private proto.message.DonateFriendSendItemsRequest msgDonateFriendSendItemsRequest;

        private proto.message.DonateFriendSendItemsResponse msgDonateFriendSendItemsResponse;

        private proto.message.DonateFriendCheckGiftRequest msgDonateFriendCheckGiftRequest;

        private proto.message.DonateFriendCheckGiftResponse msgDonateFriendCheckGiftResponse;

        private proto.message.DonateListFriendSendItemsRequest msgDonateListFriendSendItemsRequest;

        private proto.message.DonateListFriendSendItemsResponse msgDonateListFriendSendItemsResponse;

        private proto.message.AccumulatePromotionRequest msgAccumulatePromotionRequest;

        private proto.message.AccumulatePromotionResponse msgAccumulatePromotionResponse;

        private proto.message.AccumulateClaimRequest msgAccumulateClaimRequest;

        private proto.message.AccumulateClaimResponse msgAccumulateClaimResponse;

        private proto.message.LeaderBoardRequest msgLeaderBoardRequest;

        private proto.message.LeaderBoardResponse msgLeaderBoardResponse;

        private proto.message.ArchiveCollectionRequest msgArchiveCollectionRequest;

        private proto.message.ArchiveCollectionResponse msgArchiveCollectionResponse;

        private proto.message.AdsInfoRequest msgAdsInfoRequest;

        private proto.message.AdsInfoResponse msgAdsInfoResponse;

        private proto.message.AdsRewardClaimRequest msgAdsRewardClaimRequest;

        private proto.message.H3EnterRequest msgH3EnterRequest;

        private proto.message.H3EnterResponse msgH3EnterResponse;

        private proto.message.H3LeaveRequest msgH3LeaveRequest;

        private proto.message.H3LeaveResponse msgH3LeaveResponse;

        private proto.message.H3TurnRequest msgH3TurnRequest;

        private proto.message.H3TurnResponse msgH3TurnResponse;

        private int __bitField0;
        private int __bitField1;
        private int __bitField2;
        private int __bitField3;

        private Builder() {
            this.command = proto.message.ProfileCommand.PROFILE_GET_USER_MONEY_REQUEST.getNumber();
            this.msgGetUserMoneyRequest = proto.message.GetUserMoneyRequest.getDefaultInstance();
            this.msgGetUserMoneyResponse = proto.message.GetUserMoneyResponse.getDefaultInstance();
            this.msgGetUserProfileRequest = proto.message.GetUserProfileRequest.getDefaultInstance();
            this.msgGetUserProfileResponse = proto.message.GetUserProfileResponse.getDefaultInstance();
            this.msgLevelUpResponse = proto.message.LevelUpResponse.getDefaultInstance();
            this.msgGetUserInboxResponse = proto.message.GetUserInboxResponse.getDefaultInstance();
            this.msgUpdateProfileFBRequest = proto.message.UpdateProfileFBRequest.getDefaultInstance();
            this.msgUpdateProfileFBResponse = proto.message.UpdateProfileFBResponse.getDefaultInstance();
            this.msgUpdateUserNameRequest = proto.message.UpdateUserNameRequest.getDefaultInstance();
            this.msgUpdateUserNameResponse = proto.message.UpdateUserNameResponse.getDefaultInstance();
            this.msgClaimInboxRequest = proto.message.ClaimInboxRequest.getDefaultInstance();
            this.msgClaimInboxResponse = proto.message.ClaimInboxResponse.getDefaultInstance();
            this.msgFriendListRawResponse = proto.message.FriendListRawResponse.getDefaultInstance();
            this.msgFriendListDetailRequest = proto.message.FriendListDetailRequest.getDefaultInstance();
            this.msgFriendListDetailResponse = proto.message.FriendListDetailResponse.getDefaultInstance();
            this.msgFriendActionRequest = proto.message.FriendActionRequest.getDefaultInstance();
            this.msgFriendActionResponse = proto.message.FriendActionResponse.getDefaultInstance();
            this.msgFriendSearchRequest = proto.message.FriendSearchRequest.getDefaultInstance();
            this.msgFriendSearchResponse = proto.message.FriendSearchResponse.getDefaultInstance();
            this.msgFriendUnlockMoneySendRequest = proto.message.FriendUnlockMoneySendRequest.getDefaultInstance();
            this.msgFriendUnlockMoneySendResponse = proto.message.FriendUnlockMoneySendResponse.getDefaultInstance();
            this.msgFriendMessageSendRequest = proto.message.FriendMessageSendRequest.getDefaultInstance();
            this.msgDailyQuestInfoResponse = proto.message.DailyQuestInfoResponse.getDefaultInstance();
            this.msgDailyQuestReceiveRequest = proto.message.DailyQuestReceiveRequest.getDefaultInstance();
            this.msgDailyQuestReceiveResponse = proto.message.DailyQuestReceiveResponse.getDefaultInstance();
            this.msgDailySnsFriendInviteRequest = proto.message.DailySnsFriendInviteRequest.getDefaultInstance();
            this.msgDailySnsFriendInviteResponse = proto.message.DailySnsFriendInviteResponse.getDefaultInstance();
            this.msgGiftCodeRequest = proto.message.GiftCodeRequest.getDefaultInstance();
            this.msgGiftCodeResponse = proto.message.GiftCodeResponse.getDefaultInstance();
            this.msgGetUserInventoryResponse = proto.message.GetUserInventoryResponse.getDefaultInstance();
            this.msgGetCannonDataResponse = proto.message.GetCannonDataResponse.getDefaultInstance();
            this.msgCannonUnlockRequest = proto.message.CannonUnlockRequest.getDefaultInstance();
            this.msgCannonUnlockResponse = proto.message.CannonUnlockResponse.getDefaultInstance();
            this.msgCannonUpgradeRequest = proto.message.CannonUpgradeRequest.getDefaultInstance();
            this.msgCannonUpgradeResponse = proto.message.CannonUpgradeResponse.getDefaultInstance();
            this.clienttime = 0L;
            this.msgWheelEnterRequest = proto.message.WheelEnterRequest.getDefaultInstance();
            this.msgWheelEnterResponse = proto.message.WheelEnterResponse.getDefaultInstance();
            this.msgWheelLeaveRequest = proto.message.WheelLeaveRequest.getDefaultInstance();
            this.msgWheelLeaveResponse = proto.message.WheelLeaveResponse.getDefaultInstance();
            this.msgWheelTurnRequest = proto.message.WheelTurnRequest.getDefaultInstance();
            this.msgWheelTurnResponse = proto.message.WheelTurnResponse.getDefaultInstance();
            this.msgWheelGetRequest = proto.message.WheelGetRequest.getDefaultInstance();
            this.msgWheelGetResponse = proto.message.WheelGetResponse.getDefaultInstance();
            this.msgWheelIngameRequest = proto.message.WheelIngameRequest.getDefaultInstance();
            this.msgWheelIngameResponse = proto.message.WheelIngameResponse.getDefaultInstance();
            this.msgWheelCarrierRequest = proto.message.WheelCarrierRequest.getDefaultInstance();
            this.msgWheelCarrierResponse = proto.message.WheelCarrierResponse.getDefaultInstance();
            this.msgSoccerTeamsResponse = proto.message.SoccerTeamsResponse.getDefaultInstance();
            this.msgSoccerEnterRequest = proto.message.SoccerEnterRequest.getDefaultInstance();
            this.msgSoccerEnterResponse = proto.message.SoccerEnterResponse.getDefaultInstance();
            this.msgSoccerMatchesRequest = proto.message.SoccerMatchesRequest.getDefaultInstance();
            this.msgSoccerMatchesResponse = proto.message.SoccerMatchesResponse.getDefaultInstance();
            this.msgSoccerBetRequest = proto.message.SoccerBetRequest.getDefaultInstance();
            this.msgSoccerBetResponse = proto.message.SoccerBetResponse.getDefaultInstance();
            this.msgSoccerBetCountResponse = proto.message.SoccerBetCountResponse.getDefaultInstance();
            this.msgSoccerReceiveRequest = proto.message.SoccerReceiveRequest.getDefaultInstance();
            this.msgSoccerReceiveResponse = proto.message.SoccerReceiveResponse.getDefaultInstance();
            this.msgSoccerReddotRequest = proto.message.SoccerReddotRequest.getDefaultInstance();
            this.msgSoccerReddotResponse = proto.message.SoccerReddotResponse.getDefaultInstance();
            this.msgPetInfoRequest = proto.message.PetInfoRequest.getDefaultInstance();
            this.msgPetInfoResponse = proto.message.PetInfoResponse.getDefaultInstance();
            this.msgPetUpdateResponse = proto.message.PetUpdateResponse.getDefaultInstance();
            this.msgPetUnlockRequest = proto.message.PetUnlockRequest.getDefaultInstance();
            this.msgPetUnlockResponse = proto.message.PetUnlockResponse.getDefaultInstance();
            this.msgPetGiftReceiveRequest = proto.message.PetGiftReceiveRequest.getDefaultInstance();
            this.msgPetGiftReceiveResponse = proto.message.PetGiftReceiveResponse.getDefaultInstance();
            this.msgPetGiftAskingResponse = proto.message.PetGiftAskingResponse.getDefaultInstance();
            this.msgClientActionLogRequest = proto.message.ClientActionLogRequest.getDefaultInstance();
            this.msgAdsViewRequest = proto.message.AdsViewRequest.getDefaultInstance();
            this.msgAdsViewResponse = proto.message.AdsViewResponse.getDefaultInstance();
            this.msgPetLevelUpResponse = proto.message.PetLevelUpResponse.getDefaultInstance();
            this.msgDailySupportResponse = proto.message.DailySupportResponse.getDefaultInstance();
            this.msgDailyBonusRequest = proto.message.DailyBonusRequest.getDefaultInstance();
            this.msgDailyBonusResponse = proto.message.DailyBonusResponse.getDefaultInstance();
            this.msgClaimDailyBonusRequest = proto.message.ClaimDailyBonusRequest.getDefaultInstance();
            this.msgClaimDailyBonusResponse = proto.message.ClaimDailyBonusResponse.getDefaultInstance();
            this.msgCollectionInfoRequest = proto.message.CollectionInfoRequest.getDefaultInstance();
            this.msgCollectionInfoResponse = proto.message.CollectionInfoResponse.getDefaultInstance();
            this.msgClaimCollectionPrizeRequest = proto.message.ClaimCollectionPrizeRequest.getDefaultInstance();
            this.msgClaimCollectionPrizeResponse = proto.message.ClaimCollectionPrizeResponse.getDefaultInstance();
            this.msgDonateFriendListDetailRequest = proto.message.DonateFriendListDetailRequest.getDefaultInstance();
            this.msgDonateFriendListDetailResponse = proto.message.DonateFriendListDetailResponse.getDefaultInstance();
            this.msgDonateFriendReceiveItemsRequest = proto.message.DonateFriendReceiveItemsRequest.getDefaultInstance();
            this.msgDonateFriendReceiveItemsResponse = proto.message.DonateFriendReceiveItemsResponse.getDefaultInstance();
            this.msgDonateFriendSendItemsRequest = proto.message.DonateFriendSendItemsRequest.getDefaultInstance();
            this.msgDonateFriendSendItemsResponse = proto.message.DonateFriendSendItemsResponse.getDefaultInstance();
            this.msgDonateFriendCheckGiftRequest = proto.message.DonateFriendCheckGiftRequest.getDefaultInstance();
            this.msgDonateFriendCheckGiftResponse = proto.message.DonateFriendCheckGiftResponse.getDefaultInstance();
            this.msgDonateListFriendSendItemsRequest = proto.message.DonateListFriendSendItemsRequest.getDefaultInstance();
            this.msgDonateListFriendSendItemsResponse = proto.message.DonateListFriendSendItemsResponse.getDefaultInstance();
            this.msgAccumulatePromotionRequest = proto.message.AccumulatePromotionRequest.getDefaultInstance();
            this.msgAccumulatePromotionResponse = proto.message.AccumulatePromotionResponse.getDefaultInstance();
            this.msgAccumulateClaimRequest = proto.message.AccumulateClaimRequest.getDefaultInstance();
            this.msgAccumulateClaimResponse = proto.message.AccumulateClaimResponse.getDefaultInstance();
            this.msgLeaderBoardRequest = proto.message.LeaderBoardRequest.getDefaultInstance();
            this.msgLeaderBoardResponse = proto.message.LeaderBoardResponse.getDefaultInstance();
            this.msgArchiveCollectionRequest = proto.message.ArchiveCollectionRequest.getDefaultInstance();
            this.msgArchiveCollectionResponse = proto.message.ArchiveCollectionResponse.getDefaultInstance();
            this.msgAdsInfoRequest = proto.message.AdsInfoRequest.getDefaultInstance();
            this.msgAdsInfoResponse = proto.message.AdsInfoResponse.getDefaultInstance();
            this.msgAdsRewardClaimRequest = proto.message.AdsRewardClaimRequest.getDefaultInstance();
            this.msgH3EnterRequest = proto.message.H3EnterRequest.getDefaultInstance();
            this.msgH3EnterResponse = proto.message.H3EnterResponse.getDefaultInstance();
            this.msgH3LeaveRequest = proto.message.H3LeaveRequest.getDefaultInstance();
            this.msgH3LeaveResponse = proto.message.H3LeaveResponse.getDefaultInstance();
            this.msgH3TurnRequest = proto.message.H3TurnRequest.getDefaultInstance();
            this.msgH3TurnResponse = proto.message.H3TurnResponse.getDefaultInstance();
        }

        public Builder mergeFrom(ProfileMessage instance) {
            if (instance.hasCommand()) {
                this.setCommand(instance.getCommand());
            }

            if (instance.hasMsgGetUserMoneyRequest()) {
                this.setMsgGetUserMoneyRequest(instance.getMsgGetUserMoneyRequest());
            }

            if (instance.hasMsgGetUserMoneyResponse()) {
                this.setMsgGetUserMoneyResponse(instance.getMsgGetUserMoneyResponse());
            }

            if (instance.hasMsgGetUserProfileRequest()) {
                this.setMsgGetUserProfileRequest(instance.getMsgGetUserProfileRequest());
            }

            if (instance.hasMsgGetUserProfileResponse()) {
                this.setMsgGetUserProfileResponse(instance.getMsgGetUserProfileResponse());
            }

            if (instance.hasMsgLevelUpResponse()) {
                this.setMsgLevelUpResponse(instance.getMsgLevelUpResponse());
            }

            if (instance.hasMsgGetUserInboxResponse()) {
                this.setMsgGetUserInboxResponse(instance.getMsgGetUserInboxResponse());
            }

            if (instance.hasMsgUpdateProfileFBRequest()) {
                this.setMsgUpdateProfileFBRequest(instance.getMsgUpdateProfileFBRequest());
            }

            if (instance.hasMsgUpdateProfileFBResponse()) {
                this.setMsgUpdateProfileFBResponse(instance.getMsgUpdateProfileFBResponse());
            }

            if (instance.hasMsgUpdateUserNameRequest()) {
                this.setMsgUpdateUserNameRequest(instance.getMsgUpdateUserNameRequest());
            }

            if (instance.hasMsgUpdateUserNameResponse()) {
                this.setMsgUpdateUserNameResponse(instance.getMsgUpdateUserNameResponse());
            }

            if (instance.hasMsgClaimInboxRequest()) {
                this.setMsgClaimInboxRequest(instance.getMsgClaimInboxRequest());
            }

            if (instance.hasMsgClaimInboxResponse()) {
                this.setMsgClaimInboxResponse(instance.getMsgClaimInboxResponse());
            }

            if (instance.hasMsgFriendListRawResponse()) {
                this.setMsgFriendListRawResponse(instance.getMsgFriendListRawResponse());
            }

            if (instance.hasMsgFriendListDetailRequest()) {
                this.setMsgFriendListDetailRequest(instance.getMsgFriendListDetailRequest());
            }

            if (instance.hasMsgFriendListDetailResponse()) {
                this.setMsgFriendListDetailResponse(instance.getMsgFriendListDetailResponse());
            }

            if (instance.hasMsgFriendActionRequest()) {
                this.setMsgFriendActionRequest(instance.getMsgFriendActionRequest());
            }

            if (instance.hasMsgFriendActionResponse()) {
                this.setMsgFriendActionResponse(instance.getMsgFriendActionResponse());
            }

            if (instance.hasMsgFriendSearchRequest()) {
                this.setMsgFriendSearchRequest(instance.getMsgFriendSearchRequest());
            }

            if (instance.hasMsgFriendSearchResponse()) {
                this.setMsgFriendSearchResponse(instance.getMsgFriendSearchResponse());
            }

            if (instance.hasMsgFriendUnlockMoneySendRequest()) {
                this.setMsgFriendUnlockMoneySendRequest(instance.getMsgFriendUnlockMoneySendRequest());
            }

            if (instance.hasMsgFriendUnlockMoneySendResponse()) {
                this.setMsgFriendUnlockMoneySendResponse(instance.getMsgFriendUnlockMoneySendResponse());
            }

            if (instance.hasMsgFriendMessageSendRequest()) {
                this.setMsgFriendMessageSendRequest(instance.getMsgFriendMessageSendRequest());
            }

            if (instance.hasMsgDailyQuestInfoResponse()) {
                this.setMsgDailyQuestInfoResponse(instance.getMsgDailyQuestInfoResponse());
            }

            if (instance.hasMsgDailyQuestReceiveRequest()) {
                this.setMsgDailyQuestReceiveRequest(instance.getMsgDailyQuestReceiveRequest());
            }

            if (instance.hasMsgDailyQuestReceiveResponse()) {
                this.setMsgDailyQuestReceiveResponse(instance.getMsgDailyQuestReceiveResponse());
            }

            if (instance.hasMsgDailySnsFriendInviteRequest()) {
                this.setMsgDailySnsFriendInviteRequest(instance.getMsgDailySnsFriendInviteRequest());
            }

            if (instance.hasMsgDailySnsFriendInviteResponse()) {
                this.setMsgDailySnsFriendInviteResponse(instance.getMsgDailySnsFriendInviteResponse());
            }

            if (instance.hasMsgGiftCodeRequest()) {
                this.setMsgGiftCodeRequest(instance.getMsgGiftCodeRequest());
            }

            if (instance.hasMsgGiftCodeResponse()) {
                this.setMsgGiftCodeResponse(instance.getMsgGiftCodeResponse());
            }

            if (instance.hasMsgGetUserInventoryResponse()) {
                this.setMsgGetUserInventoryResponse(instance.getMsgGetUserInventoryResponse());
            }

            if (instance.hasMsgGetCannonDataResponse()) {
                this.setMsgGetCannonDataResponse(instance.getMsgGetCannonDataResponse());
            }

            if (instance.hasMsgCannonUnlockRequest()) {
                this.setMsgCannonUnlockRequest(instance.getMsgCannonUnlockRequest());
            }

            if (instance.hasMsgCannonUnlockResponse()) {
                this.setMsgCannonUnlockResponse(instance.getMsgCannonUnlockResponse());
            }

            if (instance.hasMsgCannonUpgradeRequest()) {
                this.setMsgCannonUpgradeRequest(instance.getMsgCannonUpgradeRequest());
            }

            if (instance.hasMsgCannonUpgradeResponse()) {
                this.setMsgCannonUpgradeResponse(instance.getMsgCannonUpgradeResponse());
            }

            if (instance.hasClienttime()) {
                this.setClienttime(instance.getClienttime());
            }

            if (instance.hasMsgWheelEnterRequest()) {
                this.setMsgWheelEnterRequest(instance.getMsgWheelEnterRequest());
            }

            if (instance.hasMsgWheelEnterResponse()) {
                this.setMsgWheelEnterResponse(instance.getMsgWheelEnterResponse());
            }

            if (instance.hasMsgWheelLeaveRequest()) {
                this.setMsgWheelLeaveRequest(instance.getMsgWheelLeaveRequest());
            }

            if (instance.hasMsgWheelLeaveResponse()) {
                this.setMsgWheelLeaveResponse(instance.getMsgWheelLeaveResponse());
            }

            if (instance.hasMsgWheelTurnRequest()) {
                this.setMsgWheelTurnRequest(instance.getMsgWheelTurnRequest());
            }

            if (instance.hasMsgWheelTurnResponse()) {
                this.setMsgWheelTurnResponse(instance.getMsgWheelTurnResponse());
            }

            if (instance.hasMsgWheelGetRequest()) {
                this.setMsgWheelGetRequest(instance.getMsgWheelGetRequest());
            }

            if (instance.hasMsgWheelGetResponse()) {
                this.setMsgWheelGetResponse(instance.getMsgWheelGetResponse());
            }

            if (instance.hasMsgWheelIngameRequest()) {
                this.setMsgWheelIngameRequest(instance.getMsgWheelIngameRequest());
            }

            if (instance.hasMsgWheelIngameResponse()) {
                this.setMsgWheelIngameResponse(instance.getMsgWheelIngameResponse());
            }

            if (instance.hasMsgWheelCarrierRequest()) {
                this.setMsgWheelCarrierRequest(instance.getMsgWheelCarrierRequest());
            }

            if (instance.hasMsgWheelCarrierResponse()) {
                this.setMsgWheelCarrierResponse(instance.getMsgWheelCarrierResponse());
            }

            if (instance.hasMsgSoccerTeamsResponse()) {
                this.setMsgSoccerTeamsResponse(instance.getMsgSoccerTeamsResponse());
            }

            if (instance.hasMsgSoccerEnterRequest()) {
                this.setMsgSoccerEnterRequest(instance.getMsgSoccerEnterRequest());
            }

            if (instance.hasMsgSoccerEnterResponse()) {
                this.setMsgSoccerEnterResponse(instance.getMsgSoccerEnterResponse());
            }

            if (instance.hasMsgSoccerMatchesRequest()) {
                this.setMsgSoccerMatchesRequest(instance.getMsgSoccerMatchesRequest());
            }

            if (instance.hasMsgSoccerMatchesResponse()) {
                this.setMsgSoccerMatchesResponse(instance.getMsgSoccerMatchesResponse());
            }

            if (instance.hasMsgSoccerBetRequest()) {
                this.setMsgSoccerBetRequest(instance.getMsgSoccerBetRequest());
            }

            if (instance.hasMsgSoccerBetResponse()) {
                this.setMsgSoccerBetResponse(instance.getMsgSoccerBetResponse());
            }

            if (instance.hasMsgSoccerBetCountResponse()) {
                this.setMsgSoccerBetCountResponse(instance.getMsgSoccerBetCountResponse());
            }

            if (instance.hasMsgSoccerReceiveRequest()) {
                this.setMsgSoccerReceiveRequest(instance.getMsgSoccerReceiveRequest());
            }

            if (instance.hasMsgSoccerReceiveResponse()) {
                this.setMsgSoccerReceiveResponse(instance.getMsgSoccerReceiveResponse());
            }

            if (instance.hasMsgSoccerReddotRequest()) {
                this.setMsgSoccerReddotRequest(instance.getMsgSoccerReddotRequest());
            }

            if (instance.hasMsgSoccerReddotResponse()) {
                this.setMsgSoccerReddotResponse(instance.getMsgSoccerReddotResponse());
            }

            if (instance.hasMsgPetInfoRequest()) {
                this.setMsgPetInfoRequest(instance.getMsgPetInfoRequest());
            }

            if (instance.hasMsgPetInfoResponse()) {
                this.setMsgPetInfoResponse(instance.getMsgPetInfoResponse());
            }

            if (instance.hasMsgPetUpdateResponse()) {
                this.setMsgPetUpdateResponse(instance.getMsgPetUpdateResponse());
            }

            if (instance.hasMsgPetUnlockRequest()) {
                this.setMsgPetUnlockRequest(instance.getMsgPetUnlockRequest());
            }

            if (instance.hasMsgPetUnlockResponse()) {
                this.setMsgPetUnlockResponse(instance.getMsgPetUnlockResponse());
            }

            if (instance.hasMsgPetGiftReceiveRequest()) {
                this.setMsgPetGiftReceiveRequest(instance.getMsgPetGiftReceiveRequest());
            }

            if (instance.hasMsgPetGiftReceiveResponse()) {
                this.setMsgPetGiftReceiveResponse(instance.getMsgPetGiftReceiveResponse());
            }

            if (instance.hasMsgPetGiftAskingResponse()) {
                this.setMsgPetGiftAskingResponse(instance.getMsgPetGiftAskingResponse());
            }

            if (instance.hasMsgClientActionLogRequest()) {
                this.setMsgClientActionLogRequest(instance.getMsgClientActionLogRequest());
            }

            if (instance.hasMsgAdsViewRequest()) {
                this.setMsgAdsViewRequest(instance.getMsgAdsViewRequest());
            }

            if (instance.hasMsgAdsViewResponse()) {
                this.setMsgAdsViewResponse(instance.getMsgAdsViewResponse());
            }

            if (instance.hasMsgPetLevelUpResponse()) {
                this.setMsgPetLevelUpResponse(instance.getMsgPetLevelUpResponse());
            }

            if (instance.hasMsgDailySupportResponse()) {
                this.setMsgDailySupportResponse(instance.getMsgDailySupportResponse());
            }

            if (instance.hasMsgDailyBonusRequest()) {
                this.setMsgDailyBonusRequest(instance.getMsgDailyBonusRequest());
            }

            if (instance.hasMsgDailyBonusResponse()) {
                this.setMsgDailyBonusResponse(instance.getMsgDailyBonusResponse());
            }

            if (instance.hasMsgClaimDailyBonusRequest()) {
                this.setMsgClaimDailyBonusRequest(instance.getMsgClaimDailyBonusRequest());
            }

            if (instance.hasMsgClaimDailyBonusResponse()) {
                this.setMsgClaimDailyBonusResponse(instance.getMsgClaimDailyBonusResponse());
            }

            if (instance.hasMsgCollectionInfoRequest()) {
                this.setMsgCollectionInfoRequest(instance.getMsgCollectionInfoRequest());
            }

            if (instance.hasMsgCollectionInfoResponse()) {
                this.setMsgCollectionInfoResponse(instance.getMsgCollectionInfoResponse());
            }

            if (instance.hasMsgClaimCollectionPrizeRequest()) {
                this.setMsgClaimCollectionPrizeRequest(instance.getMsgClaimCollectionPrizeRequest());
            }

            if (instance.hasMsgClaimCollectionPrizeResponse()) {
                this.setMsgClaimCollectionPrizeResponse(instance.getMsgClaimCollectionPrizeResponse());
            }

            if (instance.hasMsgDonateFriendListDetailRequest()) {
                this.setMsgDonateFriendListDetailRequest(instance.getMsgDonateFriendListDetailRequest());
            }

            if (instance.hasMsgDonateFriendListDetailResponse()) {
                this.setMsgDonateFriendListDetailResponse(instance.getMsgDonateFriendListDetailResponse());
            }

            if (instance.hasMsgDonateFriendReceiveItemsRequest()) {
                this.setMsgDonateFriendReceiveItemsRequest(instance.getMsgDonateFriendReceiveItemsRequest());
            }

            if (instance.hasMsgDonateFriendReceiveItemsResponse()) {
                this.setMsgDonateFriendReceiveItemsResponse(instance.getMsgDonateFriendReceiveItemsResponse());
            }

            if (instance.hasMsgDonateFriendSendItemsRequest()) {
                this.setMsgDonateFriendSendItemsRequest(instance.getMsgDonateFriendSendItemsRequest());
            }

            if (instance.hasMsgDonateFriendSendItemsResponse()) {
                this.setMsgDonateFriendSendItemsResponse(instance.getMsgDonateFriendSendItemsResponse());
            }

            if (instance.hasMsgDonateFriendCheckGiftRequest()) {
                this.setMsgDonateFriendCheckGiftRequest(instance.getMsgDonateFriendCheckGiftRequest());
            }

            if (instance.hasMsgDonateFriendCheckGiftResponse()) {
                this.setMsgDonateFriendCheckGiftResponse(instance.getMsgDonateFriendCheckGiftResponse());
            }

            if (instance.hasMsgDonateListFriendSendItemsRequest()) {
                this.setMsgDonateListFriendSendItemsRequest(instance.getMsgDonateListFriendSendItemsRequest());
            }

            if (instance.hasMsgDonateListFriendSendItemsResponse()) {
                this.setMsgDonateListFriendSendItemsResponse(instance.getMsgDonateListFriendSendItemsResponse());
            }

            if (instance.hasMsgAccumulatePromotionRequest()) {
                this.setMsgAccumulatePromotionRequest(instance.getMsgAccumulatePromotionRequest());
            }

            if (instance.hasMsgAccumulatePromotionResponse()) {
                this.setMsgAccumulatePromotionResponse(instance.getMsgAccumulatePromotionResponse());
            }

            if (instance.hasMsgAccumulateClaimRequest()) {
                this.setMsgAccumulateClaimRequest(instance.getMsgAccumulateClaimRequest());
            }

            if (instance.hasMsgAccumulateClaimResponse()) {
                this.setMsgAccumulateClaimResponse(instance.getMsgAccumulateClaimResponse());
            }

            if (instance.hasMsgLeaderBoardRequest()) {
                this.setMsgLeaderBoardRequest(instance.getMsgLeaderBoardRequest());
            }

            if (instance.hasMsgLeaderBoardResponse()) {
                this.setMsgLeaderBoardResponse(instance.getMsgLeaderBoardResponse());
            }

            if (instance.hasMsgArchiveCollectionRequest()) {
                this.setMsgArchiveCollectionRequest(instance.getMsgArchiveCollectionRequest());
            }

            if (instance.hasMsgArchiveCollectionResponse()) {
                this.setMsgArchiveCollectionResponse(instance.getMsgArchiveCollectionResponse());
            }

            if (instance.hasMsgAdsInfoRequest()) {
                this.setMsgAdsInfoRequest(instance.getMsgAdsInfoRequest());
            }

            if (instance.hasMsgAdsInfoResponse()) {
                this.setMsgAdsInfoResponse(instance.getMsgAdsInfoResponse());
            }

            if (instance.hasMsgAdsRewardClaimRequest()) {
                this.setMsgAdsRewardClaimRequest(instance.getMsgAdsRewardClaimRequest());
            }

            if (instance.hasMsgH3EnterRequest()) {
                this.setMsgH3EnterRequest(instance.getMsgH3EnterRequest());
            }

            if (instance.hasMsgH3EnterResponse()) {
                this.setMsgH3EnterResponse(instance.getMsgH3EnterResponse());
            }

            if (instance.hasMsgH3LeaveRequest()) {
                this.setMsgH3LeaveRequest(instance.getMsgH3LeaveRequest());
            }

            if (instance.hasMsgH3LeaveResponse()) {
                this.setMsgH3LeaveResponse(instance.getMsgH3LeaveResponse());
            }

            if (instance.hasMsgH3TurnRequest()) {
                this.setMsgH3TurnRequest(instance.getMsgH3TurnRequest());
            }

            if (instance.hasMsgH3TurnResponse()) {
                this.setMsgH3TurnResponse(instance.getMsgH3TurnResponse());
            }

            return this;
        }

        public proto.message.ProfileCommand getCommand() {
            return proto.message.ProfileCommand.valueOf(command);
        }

        public int getCommandValue() {
            return command;
        }

        public Builder setCommand(proto.message.ProfileCommand value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#command to null");
            }

            if (value == proto.message.ProfileCommand.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set ProfileMessage#command to UNRECOGNIZED");
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

        public proto.message.GetUserMoneyRequest getMsgGetUserMoneyRequest() {
            return msgGetUserMoneyRequest;
        }

        public Builder setMsgGetUserMoneyRequest(proto.message.GetUserMoneyRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgGetUserMoneyRequest to null");
            }

            this.msgGetUserMoneyRequest = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearMsgGetUserMoneyRequest() {
            this.msgGetUserMoneyRequest = proto.message.GetUserMoneyRequest.getDefaultInstance();
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasMsgGetUserMoneyRequest() {
            return (__bitField0 & 2) == 2;
        }

        public proto.message.GetUserMoneyResponse getMsgGetUserMoneyResponse() {
            return msgGetUserMoneyResponse;
        }

        public Builder setMsgGetUserMoneyResponse(proto.message.GetUserMoneyResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgGetUserMoneyResponse to null");
            }

            this.msgGetUserMoneyResponse = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearMsgGetUserMoneyResponse() {
            this.msgGetUserMoneyResponse = proto.message.GetUserMoneyResponse.getDefaultInstance();
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasMsgGetUserMoneyResponse() {
            return (__bitField0 & 4) == 4;
        }

        public proto.message.GetUserProfileRequest getMsgGetUserProfileRequest() {
            return msgGetUserProfileRequest;
        }

        public Builder setMsgGetUserProfileRequest(proto.message.GetUserProfileRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgGetUserProfileRequest to null");
            }

            this.msgGetUserProfileRequest = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearMsgGetUserProfileRequest() {
            this.msgGetUserProfileRequest = proto.message.GetUserProfileRequest.getDefaultInstance();
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasMsgGetUserProfileRequest() {
            return (__bitField0 & 8) == 8;
        }

        public proto.message.GetUserProfileResponse getMsgGetUserProfileResponse() {
            return msgGetUserProfileResponse;
        }

        public Builder setMsgGetUserProfileResponse(proto.message.GetUserProfileResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgGetUserProfileResponse to null");
            }

            this.msgGetUserProfileResponse = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearMsgGetUserProfileResponse() {
            this.msgGetUserProfileResponse = proto.message.GetUserProfileResponse.getDefaultInstance();
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasMsgGetUserProfileResponse() {
            return (__bitField0 & 16) == 16;
        }

        public proto.message.LevelUpResponse getMsgLevelUpResponse() {
            return msgLevelUpResponse;
        }

        public Builder setMsgLevelUpResponse(proto.message.LevelUpResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgLevelUpResponse to null");
            }

            this.msgLevelUpResponse = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearMsgLevelUpResponse() {
            this.msgLevelUpResponse = proto.message.LevelUpResponse.getDefaultInstance();
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasMsgLevelUpResponse() {
            return (__bitField0 & 32) == 32;
        }

        public proto.message.GetUserInboxResponse getMsgGetUserInboxResponse() {
            return msgGetUserInboxResponse;
        }

        public Builder setMsgGetUserInboxResponse(proto.message.GetUserInboxResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgGetUserInboxResponse to null");
            }

            this.msgGetUserInboxResponse = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearMsgGetUserInboxResponse() {
            this.msgGetUserInboxResponse = proto.message.GetUserInboxResponse.getDefaultInstance();
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasMsgGetUserInboxResponse() {
            return (__bitField0 & 64) == 64;
        }

        public proto.message.UpdateProfileFBRequest getMsgUpdateProfileFBRequest() {
            return msgUpdateProfileFBRequest;
        }

        public Builder setMsgUpdateProfileFBRequest(proto.message.UpdateProfileFBRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgUpdateProfileFBRequest to null");
            }

            this.msgUpdateProfileFBRequest = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearMsgUpdateProfileFBRequest() {
            this.msgUpdateProfileFBRequest = proto.message.UpdateProfileFBRequest.getDefaultInstance();
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasMsgUpdateProfileFBRequest() {
            return (__bitField0 & 128) == 128;
        }

        public proto.message.UpdateProfileFBResponse getMsgUpdateProfileFBResponse() {
            return msgUpdateProfileFBResponse;
        }

        public Builder setMsgUpdateProfileFBResponse(proto.message.UpdateProfileFBResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgUpdateProfileFBResponse to null");
            }

            this.msgUpdateProfileFBResponse = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearMsgUpdateProfileFBResponse() {
            this.msgUpdateProfileFBResponse = proto.message.UpdateProfileFBResponse.getDefaultInstance();
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasMsgUpdateProfileFBResponse() {
            return (__bitField0 & 256) == 256;
        }

        public proto.message.UpdateUserNameRequest getMsgUpdateUserNameRequest() {
            return msgUpdateUserNameRequest;
        }

        public Builder setMsgUpdateUserNameRequest(proto.message.UpdateUserNameRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgUpdateUserNameRequest to null");
            }

            this.msgUpdateUserNameRequest = value;
            __bitField0 |= 512;
            return this;
        }

        public Builder clearMsgUpdateUserNameRequest() {
            this.msgUpdateUserNameRequest = proto.message.UpdateUserNameRequest.getDefaultInstance();
            __bitField0 &= ~512;
            return this;
        }

        public boolean hasMsgUpdateUserNameRequest() {
            return (__bitField0 & 512) == 512;
        }

        public proto.message.UpdateUserNameResponse getMsgUpdateUserNameResponse() {
            return msgUpdateUserNameResponse;
        }

        public Builder setMsgUpdateUserNameResponse(proto.message.UpdateUserNameResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgUpdateUserNameResponse to null");
            }

            this.msgUpdateUserNameResponse = value;
            __bitField0 |= 1024;
            return this;
        }

        public Builder clearMsgUpdateUserNameResponse() {
            this.msgUpdateUserNameResponse = proto.message.UpdateUserNameResponse.getDefaultInstance();
            __bitField0 &= ~1024;
            return this;
        }

        public boolean hasMsgUpdateUserNameResponse() {
            return (__bitField0 & 1024) == 1024;
        }

        public proto.message.ClaimInboxRequest getMsgClaimInboxRequest() {
            return msgClaimInboxRequest;
        }

        public Builder setMsgClaimInboxRequest(proto.message.ClaimInboxRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgClaimInboxRequest to null");
            }

            this.msgClaimInboxRequest = value;
            __bitField0 |= 2048;
            return this;
        }

        public Builder clearMsgClaimInboxRequest() {
            this.msgClaimInboxRequest = proto.message.ClaimInboxRequest.getDefaultInstance();
            __bitField0 &= ~2048;
            return this;
        }

        public boolean hasMsgClaimInboxRequest() {
            return (__bitField0 & 2048) == 2048;
        }

        public proto.message.ClaimInboxResponse getMsgClaimInboxResponse() {
            return msgClaimInboxResponse;
        }

        public Builder setMsgClaimInboxResponse(proto.message.ClaimInboxResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgClaimInboxResponse to null");
            }

            this.msgClaimInboxResponse = value;
            __bitField0 |= 4096;
            return this;
        }

        public Builder clearMsgClaimInboxResponse() {
            this.msgClaimInboxResponse = proto.message.ClaimInboxResponse.getDefaultInstance();
            __bitField0 &= ~4096;
            return this;
        }

        public boolean hasMsgClaimInboxResponse() {
            return (__bitField0 & 4096) == 4096;
        }

        public proto.message.FriendListRawResponse getMsgFriendListRawResponse() {
            return msgFriendListRawResponse;
        }

        public Builder setMsgFriendListRawResponse(proto.message.FriendListRawResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgFriendListRawResponse to null");
            }

            this.msgFriendListRawResponse = value;
            __bitField0 |= 8192;
            return this;
        }

        public Builder clearMsgFriendListRawResponse() {
            this.msgFriendListRawResponse = proto.message.FriendListRawResponse.getDefaultInstance();
            __bitField0 &= ~8192;
            return this;
        }

        public boolean hasMsgFriendListRawResponse() {
            return (__bitField0 & 8192) == 8192;
        }

        public proto.message.FriendListDetailRequest getMsgFriendListDetailRequest() {
            return msgFriendListDetailRequest;
        }

        public Builder setMsgFriendListDetailRequest(proto.message.FriendListDetailRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgFriendListDetailRequest to null");
            }

            this.msgFriendListDetailRequest = value;
            __bitField0 |= 16384;
            return this;
        }

        public Builder clearMsgFriendListDetailRequest() {
            this.msgFriendListDetailRequest = proto.message.FriendListDetailRequest.getDefaultInstance();
            __bitField0 &= ~16384;
            return this;
        }

        public boolean hasMsgFriendListDetailRequest() {
            return (__bitField0 & 16384) == 16384;
        }

        public proto.message.FriendListDetailResponse getMsgFriendListDetailResponse() {
            return msgFriendListDetailResponse;
        }

        public Builder setMsgFriendListDetailResponse(proto.message.FriendListDetailResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgFriendListDetailResponse to null");
            }

            this.msgFriendListDetailResponse = value;
            __bitField0 |= 32768;
            return this;
        }

        public Builder clearMsgFriendListDetailResponse() {
            this.msgFriendListDetailResponse = proto.message.FriendListDetailResponse.getDefaultInstance();
            __bitField0 &= ~32768;
            return this;
        }

        public boolean hasMsgFriendListDetailResponse() {
            return (__bitField0 & 32768) == 32768;
        }

        public proto.message.FriendActionRequest getMsgFriendActionRequest() {
            return msgFriendActionRequest;
        }

        public Builder setMsgFriendActionRequest(proto.message.FriendActionRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgFriendActionRequest to null");
            }

            this.msgFriendActionRequest = value;
            __bitField0 |= 65536;
            return this;
        }

        public Builder clearMsgFriendActionRequest() {
            this.msgFriendActionRequest = proto.message.FriendActionRequest.getDefaultInstance();
            __bitField0 &= ~65536;
            return this;
        }

        public boolean hasMsgFriendActionRequest() {
            return (__bitField0 & 65536) == 65536;
        }

        public proto.message.FriendActionResponse getMsgFriendActionResponse() {
            return msgFriendActionResponse;
        }

        public Builder setMsgFriendActionResponse(proto.message.FriendActionResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgFriendActionResponse to null");
            }

            this.msgFriendActionResponse = value;
            __bitField0 |= 131072;
            return this;
        }

        public Builder clearMsgFriendActionResponse() {
            this.msgFriendActionResponse = proto.message.FriendActionResponse.getDefaultInstance();
            __bitField0 &= ~131072;
            return this;
        }

        public boolean hasMsgFriendActionResponse() {
            return (__bitField0 & 131072) == 131072;
        }

        public proto.message.FriendSearchRequest getMsgFriendSearchRequest() {
            return msgFriendSearchRequest;
        }

        public Builder setMsgFriendSearchRequest(proto.message.FriendSearchRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgFriendSearchRequest to null");
            }

            this.msgFriendSearchRequest = value;
            __bitField0 |= 262144;
            return this;
        }

        public Builder clearMsgFriendSearchRequest() {
            this.msgFriendSearchRequest = proto.message.FriendSearchRequest.getDefaultInstance();
            __bitField0 &= ~262144;
            return this;
        }

        public boolean hasMsgFriendSearchRequest() {
            return (__bitField0 & 262144) == 262144;
        }

        public proto.message.FriendSearchResponse getMsgFriendSearchResponse() {
            return msgFriendSearchResponse;
        }

        public Builder setMsgFriendSearchResponse(proto.message.FriendSearchResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgFriendSearchResponse to null");
            }

            this.msgFriendSearchResponse = value;
            __bitField0 |= 524288;
            return this;
        }

        public Builder clearMsgFriendSearchResponse() {
            this.msgFriendSearchResponse = proto.message.FriendSearchResponse.getDefaultInstance();
            __bitField0 &= ~524288;
            return this;
        }

        public boolean hasMsgFriendSearchResponse() {
            return (__bitField0 & 524288) == 524288;
        }

        public proto.message.FriendUnlockMoneySendRequest getMsgFriendUnlockMoneySendRequest() {
            return msgFriendUnlockMoneySendRequest;
        }

        public Builder setMsgFriendUnlockMoneySendRequest(proto.message.FriendUnlockMoneySendRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgFriendUnlockMoneySendRequest to null");
            }

            this.msgFriendUnlockMoneySendRequest = value;
            __bitField0 |= 1048576;
            return this;
        }

        public Builder clearMsgFriendUnlockMoneySendRequest() {
            this.msgFriendUnlockMoneySendRequest = proto.message.FriendUnlockMoneySendRequest.getDefaultInstance();
            __bitField0 &= ~1048576;
            return this;
        }

        public boolean hasMsgFriendUnlockMoneySendRequest() {
            return (__bitField0 & 1048576) == 1048576;
        }

        public proto.message.FriendUnlockMoneySendResponse getMsgFriendUnlockMoneySendResponse() {
            return msgFriendUnlockMoneySendResponse;
        }

        public Builder setMsgFriendUnlockMoneySendResponse(proto.message.FriendUnlockMoneySendResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgFriendUnlockMoneySendResponse to null");
            }

            this.msgFriendUnlockMoneySendResponse = value;
            __bitField0 |= 2097152;
            return this;
        }

        public Builder clearMsgFriendUnlockMoneySendResponse() {
            this.msgFriendUnlockMoneySendResponse = proto.message.FriendUnlockMoneySendResponse.getDefaultInstance();
            __bitField0 &= ~2097152;
            return this;
        }

        public boolean hasMsgFriendUnlockMoneySendResponse() {
            return (__bitField0 & 2097152) == 2097152;
        }

        public proto.message.FriendMessageSendRequest getMsgFriendMessageSendRequest() {
            return msgFriendMessageSendRequest;
        }

        public Builder setMsgFriendMessageSendRequest(proto.message.FriendMessageSendRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgFriendMessageSendRequest to null");
            }

            this.msgFriendMessageSendRequest = value;
            __bitField0 |= 4194304;
            return this;
        }

        public Builder clearMsgFriendMessageSendRequest() {
            this.msgFriendMessageSendRequest = proto.message.FriendMessageSendRequest.getDefaultInstance();
            __bitField0 &= ~4194304;
            return this;
        }

        public boolean hasMsgFriendMessageSendRequest() {
            return (__bitField0 & 4194304) == 4194304;
        }

        public proto.message.DailyQuestInfoResponse getMsgDailyQuestInfoResponse() {
            return msgDailyQuestInfoResponse;
        }

        public Builder setMsgDailyQuestInfoResponse(proto.message.DailyQuestInfoResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgDailyQuestInfoResponse to null");
            }

            this.msgDailyQuestInfoResponse = value;
            __bitField0 |= 8388608;
            return this;
        }

        public Builder clearMsgDailyQuestInfoResponse() {
            this.msgDailyQuestInfoResponse = proto.message.DailyQuestInfoResponse.getDefaultInstance();
            __bitField0 &= ~8388608;
            return this;
        }

        public boolean hasMsgDailyQuestInfoResponse() {
            return (__bitField0 & 8388608) == 8388608;
        }

        public proto.message.DailyQuestReceiveRequest getMsgDailyQuestReceiveRequest() {
            return msgDailyQuestReceiveRequest;
        }

        public Builder setMsgDailyQuestReceiveRequest(proto.message.DailyQuestReceiveRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgDailyQuestReceiveRequest to null");
            }

            this.msgDailyQuestReceiveRequest = value;
            __bitField0 |= 16777216;
            return this;
        }

        public Builder clearMsgDailyQuestReceiveRequest() {
            this.msgDailyQuestReceiveRequest = proto.message.DailyQuestReceiveRequest.getDefaultInstance();
            __bitField0 &= ~16777216;
            return this;
        }

        public boolean hasMsgDailyQuestReceiveRequest() {
            return (__bitField0 & 16777216) == 16777216;
        }

        public proto.message.DailyQuestReceiveResponse getMsgDailyQuestReceiveResponse() {
            return msgDailyQuestReceiveResponse;
        }

        public Builder setMsgDailyQuestReceiveResponse(proto.message.DailyQuestReceiveResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgDailyQuestReceiveResponse to null");
            }

            this.msgDailyQuestReceiveResponse = value;
            __bitField0 |= 33554432;
            return this;
        }

        public Builder clearMsgDailyQuestReceiveResponse() {
            this.msgDailyQuestReceiveResponse = proto.message.DailyQuestReceiveResponse.getDefaultInstance();
            __bitField0 &= ~33554432;
            return this;
        }

        public boolean hasMsgDailyQuestReceiveResponse() {
            return (__bitField0 & 33554432) == 33554432;
        }

        public proto.message.DailySnsFriendInviteRequest getMsgDailySnsFriendInviteRequest() {
            return msgDailySnsFriendInviteRequest;
        }

        public Builder setMsgDailySnsFriendInviteRequest(proto.message.DailySnsFriendInviteRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgDailySnsFriendInviteRequest to null");
            }

            this.msgDailySnsFriendInviteRequest = value;
            __bitField0 |= 67108864;
            return this;
        }

        public Builder clearMsgDailySnsFriendInviteRequest() {
            this.msgDailySnsFriendInviteRequest = proto.message.DailySnsFriendInviteRequest.getDefaultInstance();
            __bitField0 &= ~67108864;
            return this;
        }

        public boolean hasMsgDailySnsFriendInviteRequest() {
            return (__bitField0 & 67108864) == 67108864;
        }

        public proto.message.DailySnsFriendInviteResponse getMsgDailySnsFriendInviteResponse() {
            return msgDailySnsFriendInviteResponse;
        }

        public Builder setMsgDailySnsFriendInviteResponse(proto.message.DailySnsFriendInviteResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgDailySnsFriendInviteResponse to null");
            }

            this.msgDailySnsFriendInviteResponse = value;
            __bitField0 |= 134217728;
            return this;
        }

        public Builder clearMsgDailySnsFriendInviteResponse() {
            this.msgDailySnsFriendInviteResponse = proto.message.DailySnsFriendInviteResponse.getDefaultInstance();
            __bitField0 &= ~134217728;
            return this;
        }

        public boolean hasMsgDailySnsFriendInviteResponse() {
            return (__bitField0 & 134217728) == 134217728;
        }

        public proto.message.GiftCodeRequest getMsgGiftCodeRequest() {
            return msgGiftCodeRequest;
        }

        public Builder setMsgGiftCodeRequest(proto.message.GiftCodeRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgGiftCodeRequest to null");
            }

            this.msgGiftCodeRequest = value;
            __bitField0 |= 268435456;
            return this;
        }

        public Builder clearMsgGiftCodeRequest() {
            this.msgGiftCodeRequest = proto.message.GiftCodeRequest.getDefaultInstance();
            __bitField0 &= ~268435456;
            return this;
        }

        public boolean hasMsgGiftCodeRequest() {
            return (__bitField0 & 268435456) == 268435456;
        }

        public proto.message.GiftCodeResponse getMsgGiftCodeResponse() {
            return msgGiftCodeResponse;
        }

        public Builder setMsgGiftCodeResponse(proto.message.GiftCodeResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgGiftCodeResponse to null");
            }

            this.msgGiftCodeResponse = value;
            __bitField0 |= 536870912;
            return this;
        }

        public Builder clearMsgGiftCodeResponse() {
            this.msgGiftCodeResponse = proto.message.GiftCodeResponse.getDefaultInstance();
            __bitField0 &= ~536870912;
            return this;
        }

        public boolean hasMsgGiftCodeResponse() {
            return (__bitField0 & 536870912) == 536870912;
        }

        public proto.message.GetUserInventoryResponse getMsgGetUserInventoryResponse() {
            return msgGetUserInventoryResponse;
        }

        public Builder setMsgGetUserInventoryResponse(proto.message.GetUserInventoryResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgGetUserInventoryResponse to null");
            }

            this.msgGetUserInventoryResponse = value;
            __bitField0 |= 1073741824;
            return this;
        }

        public Builder clearMsgGetUserInventoryResponse() {
            this.msgGetUserInventoryResponse = proto.message.GetUserInventoryResponse.getDefaultInstance();
            __bitField0 &= ~1073741824;
            return this;
        }

        public boolean hasMsgGetUserInventoryResponse() {
            return (__bitField0 & 1073741824) == 1073741824;
        }

        public proto.message.GetCannonDataResponse getMsgGetCannonDataResponse() {
            return msgGetCannonDataResponse;
        }

        public Builder setMsgGetCannonDataResponse(proto.message.GetCannonDataResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgGetCannonDataResponse to null");
            }

            this.msgGetCannonDataResponse = value;
            __bitField0 |= -2147483648;
            return this;
        }

        public Builder clearMsgGetCannonDataResponse() {
            this.msgGetCannonDataResponse = proto.message.GetCannonDataResponse.getDefaultInstance();
            __bitField0 &= ~-2147483648;
            return this;
        }

        public boolean hasMsgGetCannonDataResponse() {
            return (__bitField0 & -2147483648) == -2147483648;
        }

        public proto.message.CannonUnlockRequest getMsgCannonUnlockRequest() {
            return msgCannonUnlockRequest;
        }

        public Builder setMsgCannonUnlockRequest(proto.message.CannonUnlockRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgCannonUnlockRequest to null");
            }

            this.msgCannonUnlockRequest = value;
            __bitField1 |= 1;
            return this;
        }

        public Builder clearMsgCannonUnlockRequest() {
            this.msgCannonUnlockRequest = proto.message.CannonUnlockRequest.getDefaultInstance();
            __bitField1 &= ~1;
            return this;
        }

        public boolean hasMsgCannonUnlockRequest() {
            return (__bitField1 & 1) == 1;
        }

        public proto.message.CannonUnlockResponse getMsgCannonUnlockResponse() {
            return msgCannonUnlockResponse;
        }

        public Builder setMsgCannonUnlockResponse(proto.message.CannonUnlockResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgCannonUnlockResponse to null");
            }

            this.msgCannonUnlockResponse = value;
            __bitField1 |= 2;
            return this;
        }

        public Builder clearMsgCannonUnlockResponse() {
            this.msgCannonUnlockResponse = proto.message.CannonUnlockResponse.getDefaultInstance();
            __bitField1 &= ~2;
            return this;
        }

        public boolean hasMsgCannonUnlockResponse() {
            return (__bitField1 & 2) == 2;
        }

        public proto.message.CannonUpgradeRequest getMsgCannonUpgradeRequest() {
            return msgCannonUpgradeRequest;
        }

        public Builder setMsgCannonUpgradeRequest(proto.message.CannonUpgradeRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgCannonUpgradeRequest to null");
            }

            this.msgCannonUpgradeRequest = value;
            __bitField1 |= 4;
            return this;
        }

        public Builder clearMsgCannonUpgradeRequest() {
            this.msgCannonUpgradeRequest = proto.message.CannonUpgradeRequest.getDefaultInstance();
            __bitField1 &= ~4;
            return this;
        }

        public boolean hasMsgCannonUpgradeRequest() {
            return (__bitField1 & 4) == 4;
        }

        public proto.message.CannonUpgradeResponse getMsgCannonUpgradeResponse() {
            return msgCannonUpgradeResponse;
        }

        public Builder setMsgCannonUpgradeResponse(proto.message.CannonUpgradeResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgCannonUpgradeResponse to null");
            }

            this.msgCannonUpgradeResponse = value;
            __bitField1 |= 8;
            return this;
        }

        public Builder clearMsgCannonUpgradeResponse() {
            this.msgCannonUpgradeResponse = proto.message.CannonUpgradeResponse.getDefaultInstance();
            __bitField1 &= ~8;
            return this;
        }

        public boolean hasMsgCannonUpgradeResponse() {
            return (__bitField1 & 8) == 8;
        }

        public long getClienttime() {
            return clienttime;
        }

        public Builder setClienttime(long value) {
            this.clienttime = value;
            __bitField1 |= 16;
            return this;
        }

        public Builder clearClienttime() {
            this.clienttime = 0L;
            __bitField1 &= ~16;
            return this;
        }

        public boolean hasClienttime() {
            return (__bitField1 & 16) == 16;
        }

        public proto.message.WheelEnterRequest getMsgWheelEnterRequest() {
            return msgWheelEnterRequest;
        }

        public Builder setMsgWheelEnterRequest(proto.message.WheelEnterRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgWheelEnterRequest to null");
            }

            this.msgWheelEnterRequest = value;
            __bitField1 |= 32;
            return this;
        }

        public Builder clearMsgWheelEnterRequest() {
            this.msgWheelEnterRequest = proto.message.WheelEnterRequest.getDefaultInstance();
            __bitField1 &= ~32;
            return this;
        }

        public boolean hasMsgWheelEnterRequest() {
            return (__bitField1 & 32) == 32;
        }

        public proto.message.WheelEnterResponse getMsgWheelEnterResponse() {
            return msgWheelEnterResponse;
        }

        public Builder setMsgWheelEnterResponse(proto.message.WheelEnterResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgWheelEnterResponse to null");
            }

            this.msgWheelEnterResponse = value;
            __bitField1 |= 64;
            return this;
        }

        public Builder clearMsgWheelEnterResponse() {
            this.msgWheelEnterResponse = proto.message.WheelEnterResponse.getDefaultInstance();
            __bitField1 &= ~64;
            return this;
        }

        public boolean hasMsgWheelEnterResponse() {
            return (__bitField1 & 64) == 64;
        }

        public proto.message.WheelLeaveRequest getMsgWheelLeaveRequest() {
            return msgWheelLeaveRequest;
        }

        public Builder setMsgWheelLeaveRequest(proto.message.WheelLeaveRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgWheelLeaveRequest to null");
            }

            this.msgWheelLeaveRequest = value;
            __bitField1 |= 128;
            return this;
        }

        public Builder clearMsgWheelLeaveRequest() {
            this.msgWheelLeaveRequest = proto.message.WheelLeaveRequest.getDefaultInstance();
            __bitField1 &= ~128;
            return this;
        }

        public boolean hasMsgWheelLeaveRequest() {
            return (__bitField1 & 128) == 128;
        }

        public proto.message.WheelLeaveResponse getMsgWheelLeaveResponse() {
            return msgWheelLeaveResponse;
        }

        public Builder setMsgWheelLeaveResponse(proto.message.WheelLeaveResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgWheelLeaveResponse to null");
            }

            this.msgWheelLeaveResponse = value;
            __bitField1 |= 256;
            return this;
        }

        public Builder clearMsgWheelLeaveResponse() {
            this.msgWheelLeaveResponse = proto.message.WheelLeaveResponse.getDefaultInstance();
            __bitField1 &= ~256;
            return this;
        }

        public boolean hasMsgWheelLeaveResponse() {
            return (__bitField1 & 256) == 256;
        }

        public proto.message.WheelTurnRequest getMsgWheelTurnRequest() {
            return msgWheelTurnRequest;
        }

        public Builder setMsgWheelTurnRequest(proto.message.WheelTurnRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgWheelTurnRequest to null");
            }

            this.msgWheelTurnRequest = value;
            __bitField1 |= 512;
            return this;
        }

        public Builder clearMsgWheelTurnRequest() {
            this.msgWheelTurnRequest = proto.message.WheelTurnRequest.getDefaultInstance();
            __bitField1 &= ~512;
            return this;
        }

        public boolean hasMsgWheelTurnRequest() {
            return (__bitField1 & 512) == 512;
        }

        public proto.message.WheelTurnResponse getMsgWheelTurnResponse() {
            return msgWheelTurnResponse;
        }

        public Builder setMsgWheelTurnResponse(proto.message.WheelTurnResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgWheelTurnResponse to null");
            }

            this.msgWheelTurnResponse = value;
            __bitField1 |= 1024;
            return this;
        }

        public Builder clearMsgWheelTurnResponse() {
            this.msgWheelTurnResponse = proto.message.WheelTurnResponse.getDefaultInstance();
            __bitField1 &= ~1024;
            return this;
        }

        public boolean hasMsgWheelTurnResponse() {
            return (__bitField1 & 1024) == 1024;
        }

        public proto.message.WheelGetRequest getMsgWheelGetRequest() {
            return msgWheelGetRequest;
        }

        public Builder setMsgWheelGetRequest(proto.message.WheelGetRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgWheelGetRequest to null");
            }

            this.msgWheelGetRequest = value;
            __bitField1 |= 2048;
            return this;
        }

        public Builder clearMsgWheelGetRequest() {
            this.msgWheelGetRequest = proto.message.WheelGetRequest.getDefaultInstance();
            __bitField1 &= ~2048;
            return this;
        }

        public boolean hasMsgWheelGetRequest() {
            return (__bitField1 & 2048) == 2048;
        }

        public proto.message.WheelGetResponse getMsgWheelGetResponse() {
            return msgWheelGetResponse;
        }

        public Builder setMsgWheelGetResponse(proto.message.WheelGetResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgWheelGetResponse to null");
            }

            this.msgWheelGetResponse = value;
            __bitField1 |= 4096;
            return this;
        }

        public Builder clearMsgWheelGetResponse() {
            this.msgWheelGetResponse = proto.message.WheelGetResponse.getDefaultInstance();
            __bitField1 &= ~4096;
            return this;
        }

        public boolean hasMsgWheelGetResponse() {
            return (__bitField1 & 4096) == 4096;
        }

        public proto.message.WheelIngameRequest getMsgWheelIngameRequest() {
            return msgWheelIngameRequest;
        }

        public Builder setMsgWheelIngameRequest(proto.message.WheelIngameRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgWheelIngameRequest to null");
            }

            this.msgWheelIngameRequest = value;
            __bitField1 |= 8192;
            return this;
        }

        public Builder clearMsgWheelIngameRequest() {
            this.msgWheelIngameRequest = proto.message.WheelIngameRequest.getDefaultInstance();
            __bitField1 &= ~8192;
            return this;
        }

        public boolean hasMsgWheelIngameRequest() {
            return (__bitField1 & 8192) == 8192;
        }

        public proto.message.WheelIngameResponse getMsgWheelIngameResponse() {
            return msgWheelIngameResponse;
        }

        public Builder setMsgWheelIngameResponse(proto.message.WheelIngameResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgWheelIngameResponse to null");
            }

            this.msgWheelIngameResponse = value;
            __bitField1 |= 16384;
            return this;
        }

        public Builder clearMsgWheelIngameResponse() {
            this.msgWheelIngameResponse = proto.message.WheelIngameResponse.getDefaultInstance();
            __bitField1 &= ~16384;
            return this;
        }

        public boolean hasMsgWheelIngameResponse() {
            return (__bitField1 & 16384) == 16384;
        }

        public proto.message.WheelCarrierRequest getMsgWheelCarrierRequest() {
            return msgWheelCarrierRequest;
        }

        public Builder setMsgWheelCarrierRequest(proto.message.WheelCarrierRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgWheelCarrierRequest to null");
            }

            this.msgWheelCarrierRequest = value;
            __bitField1 |= 32768;
            return this;
        }

        public Builder clearMsgWheelCarrierRequest() {
            this.msgWheelCarrierRequest = proto.message.WheelCarrierRequest.getDefaultInstance();
            __bitField1 &= ~32768;
            return this;
        }

        public boolean hasMsgWheelCarrierRequest() {
            return (__bitField1 & 32768) == 32768;
        }

        public proto.message.WheelCarrierResponse getMsgWheelCarrierResponse() {
            return msgWheelCarrierResponse;
        }

        public Builder setMsgWheelCarrierResponse(proto.message.WheelCarrierResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgWheelCarrierResponse to null");
            }

            this.msgWheelCarrierResponse = value;
            __bitField1 |= 65536;
            return this;
        }

        public Builder clearMsgWheelCarrierResponse() {
            this.msgWheelCarrierResponse = proto.message.WheelCarrierResponse.getDefaultInstance();
            __bitField1 &= ~65536;
            return this;
        }

        public boolean hasMsgWheelCarrierResponse() {
            return (__bitField1 & 65536) == 65536;
        }

        public proto.message.SoccerTeamsResponse getMsgSoccerTeamsResponse() {
            return msgSoccerTeamsResponse;
        }

        public Builder setMsgSoccerTeamsResponse(proto.message.SoccerTeamsResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgSoccerTeamsResponse to null");
            }

            this.msgSoccerTeamsResponse = value;
            __bitField1 |= 131072;
            return this;
        }

        public Builder clearMsgSoccerTeamsResponse() {
            this.msgSoccerTeamsResponse = proto.message.SoccerTeamsResponse.getDefaultInstance();
            __bitField1 &= ~131072;
            return this;
        }

        public boolean hasMsgSoccerTeamsResponse() {
            return (__bitField1 & 131072) == 131072;
        }

        public proto.message.SoccerEnterRequest getMsgSoccerEnterRequest() {
            return msgSoccerEnterRequest;
        }

        public Builder setMsgSoccerEnterRequest(proto.message.SoccerEnterRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgSoccerEnterRequest to null");
            }

            this.msgSoccerEnterRequest = value;
            __bitField1 |= 262144;
            return this;
        }

        public Builder clearMsgSoccerEnterRequest() {
            this.msgSoccerEnterRequest = proto.message.SoccerEnterRequest.getDefaultInstance();
            __bitField1 &= ~262144;
            return this;
        }

        public boolean hasMsgSoccerEnterRequest() {
            return (__bitField1 & 262144) == 262144;
        }

        public proto.message.SoccerEnterResponse getMsgSoccerEnterResponse() {
            return msgSoccerEnterResponse;
        }

        public Builder setMsgSoccerEnterResponse(proto.message.SoccerEnterResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgSoccerEnterResponse to null");
            }

            this.msgSoccerEnterResponse = value;
            __bitField1 |= 524288;
            return this;
        }

        public Builder clearMsgSoccerEnterResponse() {
            this.msgSoccerEnterResponse = proto.message.SoccerEnterResponse.getDefaultInstance();
            __bitField1 &= ~524288;
            return this;
        }

        public boolean hasMsgSoccerEnterResponse() {
            return (__bitField1 & 524288) == 524288;
        }

        public proto.message.SoccerMatchesRequest getMsgSoccerMatchesRequest() {
            return msgSoccerMatchesRequest;
        }

        public Builder setMsgSoccerMatchesRequest(proto.message.SoccerMatchesRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgSoccerMatchesRequest to null");
            }

            this.msgSoccerMatchesRequest = value;
            __bitField1 |= 1048576;
            return this;
        }

        public Builder clearMsgSoccerMatchesRequest() {
            this.msgSoccerMatchesRequest = proto.message.SoccerMatchesRequest.getDefaultInstance();
            __bitField1 &= ~1048576;
            return this;
        }

        public boolean hasMsgSoccerMatchesRequest() {
            return (__bitField1 & 1048576) == 1048576;
        }

        public proto.message.SoccerMatchesResponse getMsgSoccerMatchesResponse() {
            return msgSoccerMatchesResponse;
        }

        public Builder setMsgSoccerMatchesResponse(proto.message.SoccerMatchesResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgSoccerMatchesResponse to null");
            }

            this.msgSoccerMatchesResponse = value;
            __bitField1 |= 2097152;
            return this;
        }

        public Builder clearMsgSoccerMatchesResponse() {
            this.msgSoccerMatchesResponse = proto.message.SoccerMatchesResponse.getDefaultInstance();
            __bitField1 &= ~2097152;
            return this;
        }

        public boolean hasMsgSoccerMatchesResponse() {
            return (__bitField1 & 2097152) == 2097152;
        }

        public proto.message.SoccerBetRequest getMsgSoccerBetRequest() {
            return msgSoccerBetRequest;
        }

        public Builder setMsgSoccerBetRequest(proto.message.SoccerBetRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgSoccerBetRequest to null");
            }

            this.msgSoccerBetRequest = value;
            __bitField1 |= 4194304;
            return this;
        }

        public Builder clearMsgSoccerBetRequest() {
            this.msgSoccerBetRequest = proto.message.SoccerBetRequest.getDefaultInstance();
            __bitField1 &= ~4194304;
            return this;
        }

        public boolean hasMsgSoccerBetRequest() {
            return (__bitField1 & 4194304) == 4194304;
        }

        public proto.message.SoccerBetResponse getMsgSoccerBetResponse() {
            return msgSoccerBetResponse;
        }

        public Builder setMsgSoccerBetResponse(proto.message.SoccerBetResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgSoccerBetResponse to null");
            }

            this.msgSoccerBetResponse = value;
            __bitField1 |= 8388608;
            return this;
        }

        public Builder clearMsgSoccerBetResponse() {
            this.msgSoccerBetResponse = proto.message.SoccerBetResponse.getDefaultInstance();
            __bitField1 &= ~8388608;
            return this;
        }

        public boolean hasMsgSoccerBetResponse() {
            return (__bitField1 & 8388608) == 8388608;
        }

        public proto.message.SoccerBetCountResponse getMsgSoccerBetCountResponse() {
            return msgSoccerBetCountResponse;
        }

        public Builder setMsgSoccerBetCountResponse(proto.message.SoccerBetCountResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgSoccerBetCountResponse to null");
            }

            this.msgSoccerBetCountResponse = value;
            __bitField1 |= 16777216;
            return this;
        }

        public Builder clearMsgSoccerBetCountResponse() {
            this.msgSoccerBetCountResponse = proto.message.SoccerBetCountResponse.getDefaultInstance();
            __bitField1 &= ~16777216;
            return this;
        }

        public boolean hasMsgSoccerBetCountResponse() {
            return (__bitField1 & 16777216) == 16777216;
        }

        public proto.message.SoccerReceiveRequest getMsgSoccerReceiveRequest() {
            return msgSoccerReceiveRequest;
        }

        public Builder setMsgSoccerReceiveRequest(proto.message.SoccerReceiveRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgSoccerReceiveRequest to null");
            }

            this.msgSoccerReceiveRequest = value;
            __bitField1 |= 33554432;
            return this;
        }

        public Builder clearMsgSoccerReceiveRequest() {
            this.msgSoccerReceiveRequest = proto.message.SoccerReceiveRequest.getDefaultInstance();
            __bitField1 &= ~33554432;
            return this;
        }

        public boolean hasMsgSoccerReceiveRequest() {
            return (__bitField1 & 33554432) == 33554432;
        }

        public proto.message.SoccerReceiveResponse getMsgSoccerReceiveResponse() {
            return msgSoccerReceiveResponse;
        }

        public Builder setMsgSoccerReceiveResponse(proto.message.SoccerReceiveResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgSoccerReceiveResponse to null");
            }

            this.msgSoccerReceiveResponse = value;
            __bitField1 |= 67108864;
            return this;
        }

        public Builder clearMsgSoccerReceiveResponse() {
            this.msgSoccerReceiveResponse = proto.message.SoccerReceiveResponse.getDefaultInstance();
            __bitField1 &= ~67108864;
            return this;
        }

        public boolean hasMsgSoccerReceiveResponse() {
            return (__bitField1 & 67108864) == 67108864;
        }

        public proto.message.SoccerReddotRequest getMsgSoccerReddotRequest() {
            return msgSoccerReddotRequest;
        }

        public Builder setMsgSoccerReddotRequest(proto.message.SoccerReddotRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgSoccerReddotRequest to null");
            }

            this.msgSoccerReddotRequest = value;
            __bitField1 |= 134217728;
            return this;
        }

        public Builder clearMsgSoccerReddotRequest() {
            this.msgSoccerReddotRequest = proto.message.SoccerReddotRequest.getDefaultInstance();
            __bitField1 &= ~134217728;
            return this;
        }

        public boolean hasMsgSoccerReddotRequest() {
            return (__bitField1 & 134217728) == 134217728;
        }

        public proto.message.SoccerReddotResponse getMsgSoccerReddotResponse() {
            return msgSoccerReddotResponse;
        }

        public Builder setMsgSoccerReddotResponse(proto.message.SoccerReddotResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgSoccerReddotResponse to null");
            }

            this.msgSoccerReddotResponse = value;
            __bitField1 |= 268435456;
            return this;
        }

        public Builder clearMsgSoccerReddotResponse() {
            this.msgSoccerReddotResponse = proto.message.SoccerReddotResponse.getDefaultInstance();
            __bitField1 &= ~268435456;
            return this;
        }

        public boolean hasMsgSoccerReddotResponse() {
            return (__bitField1 & 268435456) == 268435456;
        }

        public proto.message.PetInfoRequest getMsgPetInfoRequest() {
            return msgPetInfoRequest;
        }

        public Builder setMsgPetInfoRequest(proto.message.PetInfoRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgPetInfoRequest to null");
            }

            this.msgPetInfoRequest = value;
            __bitField1 |= 536870912;
            return this;
        }

        public Builder clearMsgPetInfoRequest() {
            this.msgPetInfoRequest = proto.message.PetInfoRequest.getDefaultInstance();
            __bitField1 &= ~536870912;
            return this;
        }

        public boolean hasMsgPetInfoRequest() {
            return (__bitField1 & 536870912) == 536870912;
        }

        public proto.message.PetInfoResponse getMsgPetInfoResponse() {
            return msgPetInfoResponse;
        }

        public Builder setMsgPetInfoResponse(proto.message.PetInfoResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgPetInfoResponse to null");
            }

            this.msgPetInfoResponse = value;
            __bitField1 |= 1073741824;
            return this;
        }

        public Builder clearMsgPetInfoResponse() {
            this.msgPetInfoResponse = proto.message.PetInfoResponse.getDefaultInstance();
            __bitField1 &= ~1073741824;
            return this;
        }

        public boolean hasMsgPetInfoResponse() {
            return (__bitField1 & 1073741824) == 1073741824;
        }

        public proto.message.PetUpdateResponse getMsgPetUpdateResponse() {
            return msgPetUpdateResponse;
        }

        public Builder setMsgPetUpdateResponse(proto.message.PetUpdateResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgPetUpdateResponse to null");
            }

            this.msgPetUpdateResponse = value;
            __bitField1 |= -2147483648;
            return this;
        }

        public Builder clearMsgPetUpdateResponse() {
            this.msgPetUpdateResponse = proto.message.PetUpdateResponse.getDefaultInstance();
            __bitField1 &= ~-2147483648;
            return this;
        }

        public boolean hasMsgPetUpdateResponse() {
            return (__bitField1 & -2147483648) == -2147483648;
        }

        public proto.message.PetUnlockRequest getMsgPetUnlockRequest() {
            return msgPetUnlockRequest;
        }

        public Builder setMsgPetUnlockRequest(proto.message.PetUnlockRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgPetUnlockRequest to null");
            }

            this.msgPetUnlockRequest = value;
            __bitField2 |= 1;
            return this;
        }

        public Builder clearMsgPetUnlockRequest() {
            this.msgPetUnlockRequest = proto.message.PetUnlockRequest.getDefaultInstance();
            __bitField2 &= ~1;
            return this;
        }

        public boolean hasMsgPetUnlockRequest() {
            return (__bitField2 & 1) == 1;
        }

        public proto.message.PetUnlockResponse getMsgPetUnlockResponse() {
            return msgPetUnlockResponse;
        }

        public Builder setMsgPetUnlockResponse(proto.message.PetUnlockResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgPetUnlockResponse to null");
            }

            this.msgPetUnlockResponse = value;
            __bitField2 |= 2;
            return this;
        }

        public Builder clearMsgPetUnlockResponse() {
            this.msgPetUnlockResponse = proto.message.PetUnlockResponse.getDefaultInstance();
            __bitField2 &= ~2;
            return this;
        }

        public boolean hasMsgPetUnlockResponse() {
            return (__bitField2 & 2) == 2;
        }

        public proto.message.PetGiftReceiveRequest getMsgPetGiftReceiveRequest() {
            return msgPetGiftReceiveRequest;
        }

        public Builder setMsgPetGiftReceiveRequest(proto.message.PetGiftReceiveRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgPetGiftReceiveRequest to null");
            }

            this.msgPetGiftReceiveRequest = value;
            __bitField2 |= 4;
            return this;
        }

        public Builder clearMsgPetGiftReceiveRequest() {
            this.msgPetGiftReceiveRequest = proto.message.PetGiftReceiveRequest.getDefaultInstance();
            __bitField2 &= ~4;
            return this;
        }

        public boolean hasMsgPetGiftReceiveRequest() {
            return (__bitField2 & 4) == 4;
        }

        public proto.message.PetGiftReceiveResponse getMsgPetGiftReceiveResponse() {
            return msgPetGiftReceiveResponse;
        }

        public Builder setMsgPetGiftReceiveResponse(proto.message.PetGiftReceiveResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgPetGiftReceiveResponse to null");
            }

            this.msgPetGiftReceiveResponse = value;
            __bitField2 |= 8;
            return this;
        }

        public Builder clearMsgPetGiftReceiveResponse() {
            this.msgPetGiftReceiveResponse = proto.message.PetGiftReceiveResponse.getDefaultInstance();
            __bitField2 &= ~8;
            return this;
        }

        public boolean hasMsgPetGiftReceiveResponse() {
            return (__bitField2 & 8) == 8;
        }

        public proto.message.PetGiftAskingResponse getMsgPetGiftAskingResponse() {
            return msgPetGiftAskingResponse;
        }

        public Builder setMsgPetGiftAskingResponse(proto.message.PetGiftAskingResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgPetGiftAskingResponse to null");
            }

            this.msgPetGiftAskingResponse = value;
            __bitField2 |= 16;
            return this;
        }

        public Builder clearMsgPetGiftAskingResponse() {
            this.msgPetGiftAskingResponse = proto.message.PetGiftAskingResponse.getDefaultInstance();
            __bitField2 &= ~16;
            return this;
        }

        public boolean hasMsgPetGiftAskingResponse() {
            return (__bitField2 & 16) == 16;
        }

        public proto.message.ClientActionLogRequest getMsgClientActionLogRequest() {
            return msgClientActionLogRequest;
        }

        public Builder setMsgClientActionLogRequest(proto.message.ClientActionLogRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgClientActionLogRequest to null");
            }

            this.msgClientActionLogRequest = value;
            __bitField2 |= 32;
            return this;
        }

        public Builder clearMsgClientActionLogRequest() {
            this.msgClientActionLogRequest = proto.message.ClientActionLogRequest.getDefaultInstance();
            __bitField2 &= ~32;
            return this;
        }

        public boolean hasMsgClientActionLogRequest() {
            return (__bitField2 & 32) == 32;
        }

        public proto.message.AdsViewRequest getMsgAdsViewRequest() {
            return msgAdsViewRequest;
        }

        public Builder setMsgAdsViewRequest(proto.message.AdsViewRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgAdsViewRequest to null");
            }

            this.msgAdsViewRequest = value;
            __bitField2 |= 64;
            return this;
        }

        public Builder clearMsgAdsViewRequest() {
            this.msgAdsViewRequest = proto.message.AdsViewRequest.getDefaultInstance();
            __bitField2 &= ~64;
            return this;
        }

        public boolean hasMsgAdsViewRequest() {
            return (__bitField2 & 64) == 64;
        }

        public proto.message.AdsViewResponse getMsgAdsViewResponse() {
            return msgAdsViewResponse;
        }

        public Builder setMsgAdsViewResponse(proto.message.AdsViewResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgAdsViewResponse to null");
            }

            this.msgAdsViewResponse = value;
            __bitField2 |= 128;
            return this;
        }

        public Builder clearMsgAdsViewResponse() {
            this.msgAdsViewResponse = proto.message.AdsViewResponse.getDefaultInstance();
            __bitField2 &= ~128;
            return this;
        }

        public boolean hasMsgAdsViewResponse() {
            return (__bitField2 & 128) == 128;
        }

        public proto.message.PetLevelUpResponse getMsgPetLevelUpResponse() {
            return msgPetLevelUpResponse;
        }

        public Builder setMsgPetLevelUpResponse(proto.message.PetLevelUpResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgPetLevelUpResponse to null");
            }

            this.msgPetLevelUpResponse = value;
            __bitField2 |= 256;
            return this;
        }

        public Builder clearMsgPetLevelUpResponse() {
            this.msgPetLevelUpResponse = proto.message.PetLevelUpResponse.getDefaultInstance();
            __bitField2 &= ~256;
            return this;
        }

        public boolean hasMsgPetLevelUpResponse() {
            return (__bitField2 & 256) == 256;
        }

        public proto.message.DailySupportResponse getMsgDailySupportResponse() {
            return msgDailySupportResponse;
        }

        public Builder setMsgDailySupportResponse(proto.message.DailySupportResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgDailySupportResponse to null");
            }

            this.msgDailySupportResponse = value;
            __bitField2 |= 512;
            return this;
        }

        public Builder clearMsgDailySupportResponse() {
            this.msgDailySupportResponse = proto.message.DailySupportResponse.getDefaultInstance();
            __bitField2 &= ~512;
            return this;
        }

        public boolean hasMsgDailySupportResponse() {
            return (__bitField2 & 512) == 512;
        }

        public proto.message.DailyBonusRequest getMsgDailyBonusRequest() {
            return msgDailyBonusRequest;
        }

        public Builder setMsgDailyBonusRequest(proto.message.DailyBonusRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgDailyBonusRequest to null");
            }

            this.msgDailyBonusRequest = value;
            __bitField2 |= 1024;
            return this;
        }

        public Builder clearMsgDailyBonusRequest() {
            this.msgDailyBonusRequest = proto.message.DailyBonusRequest.getDefaultInstance();
            __bitField2 &= ~1024;
            return this;
        }

        public boolean hasMsgDailyBonusRequest() {
            return (__bitField2 & 1024) == 1024;
        }

        public proto.message.DailyBonusResponse getMsgDailyBonusResponse() {
            return msgDailyBonusResponse;
        }

        public Builder setMsgDailyBonusResponse(proto.message.DailyBonusResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgDailyBonusResponse to null");
            }

            this.msgDailyBonusResponse = value;
            __bitField2 |= 2048;
            return this;
        }

        public Builder clearMsgDailyBonusResponse() {
            this.msgDailyBonusResponse = proto.message.DailyBonusResponse.getDefaultInstance();
            __bitField2 &= ~2048;
            return this;
        }

        public boolean hasMsgDailyBonusResponse() {
            return (__bitField2 & 2048) == 2048;
        }

        public proto.message.ClaimDailyBonusRequest getMsgClaimDailyBonusRequest() {
            return msgClaimDailyBonusRequest;
        }

        public Builder setMsgClaimDailyBonusRequest(proto.message.ClaimDailyBonusRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgClaimDailyBonusRequest to null");
            }

            this.msgClaimDailyBonusRequest = value;
            __bitField2 |= 4096;
            return this;
        }

        public Builder clearMsgClaimDailyBonusRequest() {
            this.msgClaimDailyBonusRequest = proto.message.ClaimDailyBonusRequest.getDefaultInstance();
            __bitField2 &= ~4096;
            return this;
        }

        public boolean hasMsgClaimDailyBonusRequest() {
            return (__bitField2 & 4096) == 4096;
        }

        public proto.message.ClaimDailyBonusResponse getMsgClaimDailyBonusResponse() {
            return msgClaimDailyBonusResponse;
        }

        public Builder setMsgClaimDailyBonusResponse(proto.message.ClaimDailyBonusResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgClaimDailyBonusResponse to null");
            }

            this.msgClaimDailyBonusResponse = value;
            __bitField2 |= 8192;
            return this;
        }

        public Builder clearMsgClaimDailyBonusResponse() {
            this.msgClaimDailyBonusResponse = proto.message.ClaimDailyBonusResponse.getDefaultInstance();
            __bitField2 &= ~8192;
            return this;
        }

        public boolean hasMsgClaimDailyBonusResponse() {
            return (__bitField2 & 8192) == 8192;
        }

        public proto.message.CollectionInfoRequest getMsgCollectionInfoRequest() {
            return msgCollectionInfoRequest;
        }

        public Builder setMsgCollectionInfoRequest(proto.message.CollectionInfoRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgCollectionInfoRequest to null");
            }

            this.msgCollectionInfoRequest = value;
            __bitField2 |= 16384;
            return this;
        }

        public Builder clearMsgCollectionInfoRequest() {
            this.msgCollectionInfoRequest = proto.message.CollectionInfoRequest.getDefaultInstance();
            __bitField2 &= ~16384;
            return this;
        }

        public boolean hasMsgCollectionInfoRequest() {
            return (__bitField2 & 16384) == 16384;
        }

        public proto.message.CollectionInfoResponse getMsgCollectionInfoResponse() {
            return msgCollectionInfoResponse;
        }

        public Builder setMsgCollectionInfoResponse(proto.message.CollectionInfoResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgCollectionInfoResponse to null");
            }

            this.msgCollectionInfoResponse = value;
            __bitField2 |= 32768;
            return this;
        }

        public Builder clearMsgCollectionInfoResponse() {
            this.msgCollectionInfoResponse = proto.message.CollectionInfoResponse.getDefaultInstance();
            __bitField2 &= ~32768;
            return this;
        }

        public boolean hasMsgCollectionInfoResponse() {
            return (__bitField2 & 32768) == 32768;
        }

        public proto.message.ClaimCollectionPrizeRequest getMsgClaimCollectionPrizeRequest() {
            return msgClaimCollectionPrizeRequest;
        }

        public Builder setMsgClaimCollectionPrizeRequest(proto.message.ClaimCollectionPrizeRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgClaimCollectionPrizeRequest to null");
            }

            this.msgClaimCollectionPrizeRequest = value;
            __bitField2 |= 65536;
            return this;
        }

        public Builder clearMsgClaimCollectionPrizeRequest() {
            this.msgClaimCollectionPrizeRequest = proto.message.ClaimCollectionPrizeRequest.getDefaultInstance();
            __bitField2 &= ~65536;
            return this;
        }

        public boolean hasMsgClaimCollectionPrizeRequest() {
            return (__bitField2 & 65536) == 65536;
        }

        public proto.message.ClaimCollectionPrizeResponse getMsgClaimCollectionPrizeResponse() {
            return msgClaimCollectionPrizeResponse;
        }

        public Builder setMsgClaimCollectionPrizeResponse(proto.message.ClaimCollectionPrizeResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgClaimCollectionPrizeResponse to null");
            }

            this.msgClaimCollectionPrizeResponse = value;
            __bitField2 |= 131072;
            return this;
        }

        public Builder clearMsgClaimCollectionPrizeResponse() {
            this.msgClaimCollectionPrizeResponse = proto.message.ClaimCollectionPrizeResponse.getDefaultInstance();
            __bitField2 &= ~131072;
            return this;
        }

        public boolean hasMsgClaimCollectionPrizeResponse() {
            return (__bitField2 & 131072) == 131072;
        }

        public proto.message.DonateFriendListDetailRequest getMsgDonateFriendListDetailRequest() {
            return msgDonateFriendListDetailRequest;
        }

        public Builder setMsgDonateFriendListDetailRequest(proto.message.DonateFriendListDetailRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgDonateFriendListDetailRequest to null");
            }

            this.msgDonateFriendListDetailRequest = value;
            __bitField2 |= 262144;
            return this;
        }

        public Builder clearMsgDonateFriendListDetailRequest() {
            this.msgDonateFriendListDetailRequest = proto.message.DonateFriendListDetailRequest.getDefaultInstance();
            __bitField2 &= ~262144;
            return this;
        }

        public boolean hasMsgDonateFriendListDetailRequest() {
            return (__bitField2 & 262144) == 262144;
        }

        public proto.message.DonateFriendListDetailResponse getMsgDonateFriendListDetailResponse() {
            return msgDonateFriendListDetailResponse;
        }

        public Builder setMsgDonateFriendListDetailResponse(proto.message.DonateFriendListDetailResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgDonateFriendListDetailResponse to null");
            }

            this.msgDonateFriendListDetailResponse = value;
            __bitField2 |= 524288;
            return this;
        }

        public Builder clearMsgDonateFriendListDetailResponse() {
            this.msgDonateFriendListDetailResponse = proto.message.DonateFriendListDetailResponse.getDefaultInstance();
            __bitField2 &= ~524288;
            return this;
        }

        public boolean hasMsgDonateFriendListDetailResponse() {
            return (__bitField2 & 524288) == 524288;
        }

        public proto.message.DonateFriendReceiveItemsRequest getMsgDonateFriendReceiveItemsRequest() {
            return msgDonateFriendReceiveItemsRequest;
        }

        public Builder setMsgDonateFriendReceiveItemsRequest(proto.message.DonateFriendReceiveItemsRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgDonateFriendReceiveItemsRequest to null");
            }

            this.msgDonateFriendReceiveItemsRequest = value;
            __bitField2 |= 1048576;
            return this;
        }

        public Builder clearMsgDonateFriendReceiveItemsRequest() {
            this.msgDonateFriendReceiveItemsRequest = proto.message.DonateFriendReceiveItemsRequest.getDefaultInstance();
            __bitField2 &= ~1048576;
            return this;
        }

        public boolean hasMsgDonateFriendReceiveItemsRequest() {
            return (__bitField2 & 1048576) == 1048576;
        }

        public proto.message.DonateFriendReceiveItemsResponse getMsgDonateFriendReceiveItemsResponse() {
            return msgDonateFriendReceiveItemsResponse;
        }

        public Builder setMsgDonateFriendReceiveItemsResponse(proto.message.DonateFriendReceiveItemsResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgDonateFriendReceiveItemsResponse to null");
            }

            this.msgDonateFriendReceiveItemsResponse = value;
            __bitField2 |= 2097152;
            return this;
        }

        public Builder clearMsgDonateFriendReceiveItemsResponse() {
            this.msgDonateFriendReceiveItemsResponse = proto.message.DonateFriendReceiveItemsResponse.getDefaultInstance();
            __bitField2 &= ~2097152;
            return this;
        }

        public boolean hasMsgDonateFriendReceiveItemsResponse() {
            return (__bitField2 & 2097152) == 2097152;
        }

        public proto.message.DonateFriendSendItemsRequest getMsgDonateFriendSendItemsRequest() {
            return msgDonateFriendSendItemsRequest;
        }

        public Builder setMsgDonateFriendSendItemsRequest(proto.message.DonateFriendSendItemsRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgDonateFriendSendItemsRequest to null");
            }

            this.msgDonateFriendSendItemsRequest = value;
            __bitField2 |= 4194304;
            return this;
        }

        public Builder clearMsgDonateFriendSendItemsRequest() {
            this.msgDonateFriendSendItemsRequest = proto.message.DonateFriendSendItemsRequest.getDefaultInstance();
            __bitField2 &= ~4194304;
            return this;
        }

        public boolean hasMsgDonateFriendSendItemsRequest() {
            return (__bitField2 & 4194304) == 4194304;
        }

        public proto.message.DonateFriendSendItemsResponse getMsgDonateFriendSendItemsResponse() {
            return msgDonateFriendSendItemsResponse;
        }

        public Builder setMsgDonateFriendSendItemsResponse(proto.message.DonateFriendSendItemsResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgDonateFriendSendItemsResponse to null");
            }

            this.msgDonateFriendSendItemsResponse = value;
            __bitField2 |= 8388608;
            return this;
        }

        public Builder clearMsgDonateFriendSendItemsResponse() {
            this.msgDonateFriendSendItemsResponse = proto.message.DonateFriendSendItemsResponse.getDefaultInstance();
            __bitField2 &= ~8388608;
            return this;
        }

        public boolean hasMsgDonateFriendSendItemsResponse() {
            return (__bitField2 & 8388608) == 8388608;
        }

        public proto.message.DonateFriendCheckGiftRequest getMsgDonateFriendCheckGiftRequest() {
            return msgDonateFriendCheckGiftRequest;
        }

        public Builder setMsgDonateFriendCheckGiftRequest(proto.message.DonateFriendCheckGiftRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgDonateFriendCheckGiftRequest to null");
            }

            this.msgDonateFriendCheckGiftRequest = value;
            __bitField2 |= 16777216;
            return this;
        }

        public Builder clearMsgDonateFriendCheckGiftRequest() {
            this.msgDonateFriendCheckGiftRequest = proto.message.DonateFriendCheckGiftRequest.getDefaultInstance();
            __bitField2 &= ~16777216;
            return this;
        }

        public boolean hasMsgDonateFriendCheckGiftRequest() {
            return (__bitField2 & 16777216) == 16777216;
        }

        public proto.message.DonateFriendCheckGiftResponse getMsgDonateFriendCheckGiftResponse() {
            return msgDonateFriendCheckGiftResponse;
        }

        public Builder setMsgDonateFriendCheckGiftResponse(proto.message.DonateFriendCheckGiftResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgDonateFriendCheckGiftResponse to null");
            }

            this.msgDonateFriendCheckGiftResponse = value;
            __bitField2 |= 33554432;
            return this;
        }

        public Builder clearMsgDonateFriendCheckGiftResponse() {
            this.msgDonateFriendCheckGiftResponse = proto.message.DonateFriendCheckGiftResponse.getDefaultInstance();
            __bitField2 &= ~33554432;
            return this;
        }

        public boolean hasMsgDonateFriendCheckGiftResponse() {
            return (__bitField2 & 33554432) == 33554432;
        }

        public proto.message.DonateListFriendSendItemsRequest getMsgDonateListFriendSendItemsRequest() {
            return msgDonateListFriendSendItemsRequest;
        }

        public Builder setMsgDonateListFriendSendItemsRequest(proto.message.DonateListFriendSendItemsRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgDonateListFriendSendItemsRequest to null");
            }

            this.msgDonateListFriendSendItemsRequest = value;
            __bitField2 |= 67108864;
            return this;
        }

        public Builder clearMsgDonateListFriendSendItemsRequest() {
            this.msgDonateListFriendSendItemsRequest = proto.message.DonateListFriendSendItemsRequest.getDefaultInstance();
            __bitField2 &= ~67108864;
            return this;
        }

        public boolean hasMsgDonateListFriendSendItemsRequest() {
            return (__bitField2 & 67108864) == 67108864;
        }

        public proto.message.DonateListFriendSendItemsResponse getMsgDonateListFriendSendItemsResponse() {
            return msgDonateListFriendSendItemsResponse;
        }

        public Builder setMsgDonateListFriendSendItemsResponse(proto.message.DonateListFriendSendItemsResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgDonateListFriendSendItemsResponse to null");
            }

            this.msgDonateListFriendSendItemsResponse = value;
            __bitField2 |= 134217728;
            return this;
        }

        public Builder clearMsgDonateListFriendSendItemsResponse() {
            this.msgDonateListFriendSendItemsResponse = proto.message.DonateListFriendSendItemsResponse.getDefaultInstance();
            __bitField2 &= ~134217728;
            return this;
        }

        public boolean hasMsgDonateListFriendSendItemsResponse() {
            return (__bitField2 & 134217728) == 134217728;
        }

        public proto.message.AccumulatePromotionRequest getMsgAccumulatePromotionRequest() {
            return msgAccumulatePromotionRequest;
        }

        public Builder setMsgAccumulatePromotionRequest(proto.message.AccumulatePromotionRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgAccumulatePromotionRequest to null");
            }

            this.msgAccumulatePromotionRequest = value;
            __bitField2 |= 268435456;
            return this;
        }

        public Builder clearMsgAccumulatePromotionRequest() {
            this.msgAccumulatePromotionRequest = proto.message.AccumulatePromotionRequest.getDefaultInstance();
            __bitField2 &= ~268435456;
            return this;
        }

        public boolean hasMsgAccumulatePromotionRequest() {
            return (__bitField2 & 268435456) == 268435456;
        }

        public proto.message.AccumulatePromotionResponse getMsgAccumulatePromotionResponse() {
            return msgAccumulatePromotionResponse;
        }

        public Builder setMsgAccumulatePromotionResponse(proto.message.AccumulatePromotionResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgAccumulatePromotionResponse to null");
            }

            this.msgAccumulatePromotionResponse = value;
            __bitField2 |= 536870912;
            return this;
        }

        public Builder clearMsgAccumulatePromotionResponse() {
            this.msgAccumulatePromotionResponse = proto.message.AccumulatePromotionResponse.getDefaultInstance();
            __bitField2 &= ~536870912;
            return this;
        }

        public boolean hasMsgAccumulatePromotionResponse() {
            return (__bitField2 & 536870912) == 536870912;
        }

        public proto.message.AccumulateClaimRequest getMsgAccumulateClaimRequest() {
            return msgAccumulateClaimRequest;
        }

        public Builder setMsgAccumulateClaimRequest(proto.message.AccumulateClaimRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgAccumulateClaimRequest to null");
            }

            this.msgAccumulateClaimRequest = value;
            __bitField2 |= 1073741824;
            return this;
        }

        public Builder clearMsgAccumulateClaimRequest() {
            this.msgAccumulateClaimRequest = proto.message.AccumulateClaimRequest.getDefaultInstance();
            __bitField2 &= ~1073741824;
            return this;
        }

        public boolean hasMsgAccumulateClaimRequest() {
            return (__bitField2 & 1073741824) == 1073741824;
        }

        public proto.message.AccumulateClaimResponse getMsgAccumulateClaimResponse() {
            return msgAccumulateClaimResponse;
        }

        public Builder setMsgAccumulateClaimResponse(proto.message.AccumulateClaimResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgAccumulateClaimResponse to null");
            }

            this.msgAccumulateClaimResponse = value;
            __bitField2 |= -2147483648;
            return this;
        }

        public Builder clearMsgAccumulateClaimResponse() {
            this.msgAccumulateClaimResponse = proto.message.AccumulateClaimResponse.getDefaultInstance();
            __bitField2 &= ~-2147483648;
            return this;
        }

        public boolean hasMsgAccumulateClaimResponse() {
            return (__bitField2 & -2147483648) == -2147483648;
        }

        public proto.message.LeaderBoardRequest getMsgLeaderBoardRequest() {
            return msgLeaderBoardRequest;
        }

        public Builder setMsgLeaderBoardRequest(proto.message.LeaderBoardRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgLeaderBoardRequest to null");
            }

            this.msgLeaderBoardRequest = value;
            __bitField3 |= 1;
            return this;
        }

        public Builder clearMsgLeaderBoardRequest() {
            this.msgLeaderBoardRequest = proto.message.LeaderBoardRequest.getDefaultInstance();
            __bitField3 &= ~1;
            return this;
        }

        public boolean hasMsgLeaderBoardRequest() {
            return (__bitField3 & 1) == 1;
        }

        public proto.message.LeaderBoardResponse getMsgLeaderBoardResponse() {
            return msgLeaderBoardResponse;
        }

        public Builder setMsgLeaderBoardResponse(proto.message.LeaderBoardResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgLeaderBoardResponse to null");
            }

            this.msgLeaderBoardResponse = value;
            __bitField3 |= 2;
            return this;
        }

        public Builder clearMsgLeaderBoardResponse() {
            this.msgLeaderBoardResponse = proto.message.LeaderBoardResponse.getDefaultInstance();
            __bitField3 &= ~2;
            return this;
        }

        public boolean hasMsgLeaderBoardResponse() {
            return (__bitField3 & 2) == 2;
        }

        public proto.message.ArchiveCollectionRequest getMsgArchiveCollectionRequest() {
            return msgArchiveCollectionRequest;
        }

        public Builder setMsgArchiveCollectionRequest(proto.message.ArchiveCollectionRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgArchiveCollectionRequest to null");
            }

            this.msgArchiveCollectionRequest = value;
            __bitField3 |= 4;
            return this;
        }

        public Builder clearMsgArchiveCollectionRequest() {
            this.msgArchiveCollectionRequest = proto.message.ArchiveCollectionRequest.getDefaultInstance();
            __bitField3 &= ~4;
            return this;
        }

        public boolean hasMsgArchiveCollectionRequest() {
            return (__bitField3 & 4) == 4;
        }

        public proto.message.ArchiveCollectionResponse getMsgArchiveCollectionResponse() {
            return msgArchiveCollectionResponse;
        }

        public Builder setMsgArchiveCollectionResponse(proto.message.ArchiveCollectionResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgArchiveCollectionResponse to null");
            }

            this.msgArchiveCollectionResponse = value;
            __bitField3 |= 8;
            return this;
        }

        public Builder clearMsgArchiveCollectionResponse() {
            this.msgArchiveCollectionResponse = proto.message.ArchiveCollectionResponse.getDefaultInstance();
            __bitField3 &= ~8;
            return this;
        }

        public boolean hasMsgArchiveCollectionResponse() {
            return (__bitField3 & 8) == 8;
        }

        public proto.message.AdsInfoRequest getMsgAdsInfoRequest() {
            return msgAdsInfoRequest;
        }

        public Builder setMsgAdsInfoRequest(proto.message.AdsInfoRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgAdsInfoRequest to null");
            }

            this.msgAdsInfoRequest = value;
            __bitField3 |= 16;
            return this;
        }

        public Builder clearMsgAdsInfoRequest() {
            this.msgAdsInfoRequest = proto.message.AdsInfoRequest.getDefaultInstance();
            __bitField3 &= ~16;
            return this;
        }

        public boolean hasMsgAdsInfoRequest() {
            return (__bitField3 & 16) == 16;
        }

        public proto.message.AdsInfoResponse getMsgAdsInfoResponse() {
            return msgAdsInfoResponse;
        }

        public Builder setMsgAdsInfoResponse(proto.message.AdsInfoResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgAdsInfoResponse to null");
            }

            this.msgAdsInfoResponse = value;
            __bitField3 |= 32;
            return this;
        }

        public Builder clearMsgAdsInfoResponse() {
            this.msgAdsInfoResponse = proto.message.AdsInfoResponse.getDefaultInstance();
            __bitField3 &= ~32;
            return this;
        }

        public boolean hasMsgAdsInfoResponse() {
            return (__bitField3 & 32) == 32;
        }

        public proto.message.AdsRewardClaimRequest getMsgAdsRewardClaimRequest() {
            return msgAdsRewardClaimRequest;
        }

        public Builder setMsgAdsRewardClaimRequest(proto.message.AdsRewardClaimRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgAdsRewardClaimRequest to null");
            }

            this.msgAdsRewardClaimRequest = value;
            __bitField3 |= 64;
            return this;
        }

        public Builder clearMsgAdsRewardClaimRequest() {
            this.msgAdsRewardClaimRequest = proto.message.AdsRewardClaimRequest.getDefaultInstance();
            __bitField3 &= ~64;
            return this;
        }

        public boolean hasMsgAdsRewardClaimRequest() {
            return (__bitField3 & 64) == 64;
        }

        public proto.message.H3EnterRequest getMsgH3EnterRequest() {
            return msgH3EnterRequest;
        }

        public Builder setMsgH3EnterRequest(proto.message.H3EnterRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgH3EnterRequest to null");
            }

            this.msgH3EnterRequest = value;
            __bitField3 |= 128;
            return this;
        }

        public Builder clearMsgH3EnterRequest() {
            this.msgH3EnterRequest = proto.message.H3EnterRequest.getDefaultInstance();
            __bitField3 &= ~128;
            return this;
        }

        public boolean hasMsgH3EnterRequest() {
            return (__bitField3 & 128) == 128;
        }

        public proto.message.H3EnterResponse getMsgH3EnterResponse() {
            return msgH3EnterResponse;
        }

        public Builder setMsgH3EnterResponse(proto.message.H3EnterResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgH3EnterResponse to null");
            }

            this.msgH3EnterResponse = value;
            __bitField3 |= 256;
            return this;
        }

        public Builder clearMsgH3EnterResponse() {
            this.msgH3EnterResponse = proto.message.H3EnterResponse.getDefaultInstance();
            __bitField3 &= ~256;
            return this;
        }

        public boolean hasMsgH3EnterResponse() {
            return (__bitField3 & 256) == 256;
        }

        public proto.message.H3LeaveRequest getMsgH3LeaveRequest() {
            return msgH3LeaveRequest;
        }

        public Builder setMsgH3LeaveRequest(proto.message.H3LeaveRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgH3LeaveRequest to null");
            }

            this.msgH3LeaveRequest = value;
            __bitField3 |= 512;
            return this;
        }

        public Builder clearMsgH3LeaveRequest() {
            this.msgH3LeaveRequest = proto.message.H3LeaveRequest.getDefaultInstance();
            __bitField3 &= ~512;
            return this;
        }

        public boolean hasMsgH3LeaveRequest() {
            return (__bitField3 & 512) == 512;
        }

        public proto.message.H3LeaveResponse getMsgH3LeaveResponse() {
            return msgH3LeaveResponse;
        }

        public Builder setMsgH3LeaveResponse(proto.message.H3LeaveResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgH3LeaveResponse to null");
            }

            this.msgH3LeaveResponse = value;
            __bitField3 |= 1024;
            return this;
        }

        public Builder clearMsgH3LeaveResponse() {
            this.msgH3LeaveResponse = proto.message.H3LeaveResponse.getDefaultInstance();
            __bitField3 &= ~1024;
            return this;
        }

        public boolean hasMsgH3LeaveResponse() {
            return (__bitField3 & 1024) == 1024;
        }

        public proto.message.H3TurnRequest getMsgH3TurnRequest() {
            return msgH3TurnRequest;
        }

        public Builder setMsgH3TurnRequest(proto.message.H3TurnRequest value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgH3TurnRequest to null");
            }

            this.msgH3TurnRequest = value;
            __bitField3 |= 2048;
            return this;
        }

        public Builder clearMsgH3TurnRequest() {
            this.msgH3TurnRequest = proto.message.H3TurnRequest.getDefaultInstance();
            __bitField3 &= ~2048;
            return this;
        }

        public boolean hasMsgH3TurnRequest() {
            return (__bitField3 & 2048) == 2048;
        }

        public proto.message.H3TurnResponse getMsgH3TurnResponse() {
            return msgH3TurnResponse;
        }

        public Builder setMsgH3TurnResponse(proto.message.H3TurnResponse value) {
            if (value == null) {
                throw new NullPointerException("Cannot set ProfileMessage#msgH3TurnResponse to null");
            }

            this.msgH3TurnResponse = value;
            __bitField3 |= 4096;
            return this;
        }

        public Builder clearMsgH3TurnResponse() {
            this.msgH3TurnResponse = proto.message.H3TurnResponse.getDefaultInstance();
            __bitField3 &= ~4096;
            return this;
        }

        public boolean hasMsgH3TurnResponse() {
            return (__bitField3 & 4096) == 4096;
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
            if (!java.util.Objects.equals(this.msgGetUserMoneyRequest, that.msgGetUserMoneyRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgGetUserMoneyResponse, that.msgGetUserMoneyResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgGetUserProfileRequest, that.msgGetUserProfileRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgGetUserProfileResponse, that.msgGetUserProfileResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgLevelUpResponse, that.msgLevelUpResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgGetUserInboxResponse, that.msgGetUserInboxResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgUpdateProfileFBRequest, that.msgUpdateProfileFBRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgUpdateProfileFBResponse, that.msgUpdateProfileFBResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgUpdateUserNameRequest, that.msgUpdateUserNameRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgUpdateUserNameResponse, that.msgUpdateUserNameResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgClaimInboxRequest, that.msgClaimInboxRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgClaimInboxResponse, that.msgClaimInboxResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgFriendListRawResponse, that.msgFriendListRawResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgFriendListDetailRequest, that.msgFriendListDetailRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgFriendListDetailResponse, that.msgFriendListDetailResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgFriendActionRequest, that.msgFriendActionRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgFriendActionResponse, that.msgFriendActionResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgFriendSearchRequest, that.msgFriendSearchRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgFriendSearchResponse, that.msgFriendSearchResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgFriendUnlockMoneySendRequest, that.msgFriendUnlockMoneySendRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgFriendUnlockMoneySendResponse, that.msgFriendUnlockMoneySendResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgFriendMessageSendRequest, that.msgFriendMessageSendRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgDailyQuestInfoResponse, that.msgDailyQuestInfoResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgDailyQuestReceiveRequest, that.msgDailyQuestReceiveRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgDailyQuestReceiveResponse, that.msgDailyQuestReceiveResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgDailySnsFriendInviteRequest, that.msgDailySnsFriendInviteRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgDailySnsFriendInviteResponse, that.msgDailySnsFriendInviteResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgGiftCodeRequest, that.msgGiftCodeRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgGiftCodeResponse, that.msgGiftCodeResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgGetUserInventoryResponse, that.msgGetUserInventoryResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgGetCannonDataResponse, that.msgGetCannonDataResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgCannonUnlockRequest, that.msgCannonUnlockRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgCannonUnlockResponse, that.msgCannonUnlockResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgCannonUpgradeRequest, that.msgCannonUpgradeRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgCannonUpgradeResponse, that.msgCannonUpgradeResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.clienttime, that.clienttime)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgWheelEnterRequest, that.msgWheelEnterRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgWheelEnterResponse, that.msgWheelEnterResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgWheelLeaveRequest, that.msgWheelLeaveRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgWheelLeaveResponse, that.msgWheelLeaveResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgWheelTurnRequest, that.msgWheelTurnRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgWheelTurnResponse, that.msgWheelTurnResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgWheelGetRequest, that.msgWheelGetRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgWheelGetResponse, that.msgWheelGetResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgWheelIngameRequest, that.msgWheelIngameRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgWheelIngameResponse, that.msgWheelIngameResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgWheelCarrierRequest, that.msgWheelCarrierRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgWheelCarrierResponse, that.msgWheelCarrierResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgSoccerTeamsResponse, that.msgSoccerTeamsResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgSoccerEnterRequest, that.msgSoccerEnterRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgSoccerEnterResponse, that.msgSoccerEnterResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgSoccerMatchesRequest, that.msgSoccerMatchesRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgSoccerMatchesResponse, that.msgSoccerMatchesResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgSoccerBetRequest, that.msgSoccerBetRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgSoccerBetResponse, that.msgSoccerBetResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgSoccerBetCountResponse, that.msgSoccerBetCountResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgSoccerReceiveRequest, that.msgSoccerReceiveRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgSoccerReceiveResponse, that.msgSoccerReceiveResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgSoccerReddotRequest, that.msgSoccerReddotRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgSoccerReddotResponse, that.msgSoccerReddotResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgPetInfoRequest, that.msgPetInfoRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgPetInfoResponse, that.msgPetInfoResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgPetUpdateResponse, that.msgPetUpdateResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgPetUnlockRequest, that.msgPetUnlockRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgPetUnlockResponse, that.msgPetUnlockResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgPetGiftReceiveRequest, that.msgPetGiftReceiveRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgPetGiftReceiveResponse, that.msgPetGiftReceiveResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgPetGiftAskingResponse, that.msgPetGiftAskingResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgClientActionLogRequest, that.msgClientActionLogRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgAdsViewRequest, that.msgAdsViewRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgAdsViewResponse, that.msgAdsViewResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgPetLevelUpResponse, that.msgPetLevelUpResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgDailySupportResponse, that.msgDailySupportResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgDailyBonusRequest, that.msgDailyBonusRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgDailyBonusResponse, that.msgDailyBonusResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgClaimDailyBonusRequest, that.msgClaimDailyBonusRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgClaimDailyBonusResponse, that.msgClaimDailyBonusResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgCollectionInfoRequest, that.msgCollectionInfoRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgCollectionInfoResponse, that.msgCollectionInfoResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgClaimCollectionPrizeRequest, that.msgClaimCollectionPrizeRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgClaimCollectionPrizeResponse, that.msgClaimCollectionPrizeResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgDonateFriendListDetailRequest, that.msgDonateFriendListDetailRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgDonateFriendListDetailResponse, that.msgDonateFriendListDetailResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgDonateFriendReceiveItemsRequest, that.msgDonateFriendReceiveItemsRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgDonateFriendReceiveItemsResponse, that.msgDonateFriendReceiveItemsResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgDonateFriendSendItemsRequest, that.msgDonateFriendSendItemsRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgDonateFriendSendItemsResponse, that.msgDonateFriendSendItemsResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgDonateFriendCheckGiftRequest, that.msgDonateFriendCheckGiftRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgDonateFriendCheckGiftResponse, that.msgDonateFriendCheckGiftResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgDonateListFriendSendItemsRequest, that.msgDonateListFriendSendItemsRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgDonateListFriendSendItemsResponse, that.msgDonateListFriendSendItemsResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgAccumulatePromotionRequest, that.msgAccumulatePromotionRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgAccumulatePromotionResponse, that.msgAccumulatePromotionResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgAccumulateClaimRequest, that.msgAccumulateClaimRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgAccumulateClaimResponse, that.msgAccumulateClaimResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgLeaderBoardRequest, that.msgLeaderBoardRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgLeaderBoardResponse, that.msgLeaderBoardResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgArchiveCollectionRequest, that.msgArchiveCollectionRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgArchiveCollectionResponse, that.msgArchiveCollectionResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgAdsInfoRequest, that.msgAdsInfoRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgAdsInfoResponse, that.msgAdsInfoResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgAdsRewardClaimRequest, that.msgAdsRewardClaimRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgH3EnterRequest, that.msgH3EnterRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgH3EnterResponse, that.msgH3EnterResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgH3LeaveRequest, that.msgH3LeaveRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgH3LeaveResponse, that.msgH3LeaveResponse)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgH3TurnRequest, that.msgH3TurnRequest)) {
                return false;
            }
            if (!java.util.Objects.equals(this.msgH3TurnResponse, that.msgH3TurnResponse)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Integer.hashCode(this.command);
            result = 31 * result + (this.msgGetUserMoneyRequest == null ? 0 : this.msgGetUserMoneyRequest.hashCode());
            result = 31 * result + (this.msgGetUserMoneyResponse == null ? 0 : this.msgGetUserMoneyResponse.hashCode());
            result = 31 * result + (this.msgGetUserProfileRequest == null ? 0 : this.msgGetUserProfileRequest.hashCode());
            result = 31 * result + (this.msgGetUserProfileResponse == null ? 0 : this.msgGetUserProfileResponse.hashCode());
            result = 31 * result + (this.msgLevelUpResponse == null ? 0 : this.msgLevelUpResponse.hashCode());
            result = 31 * result + (this.msgGetUserInboxResponse == null ? 0 : this.msgGetUserInboxResponse.hashCode());
            result = 31 * result + (this.msgUpdateProfileFBRequest == null ? 0 : this.msgUpdateProfileFBRequest.hashCode());
            result = 31 * result + (this.msgUpdateProfileFBResponse == null ? 0 : this.msgUpdateProfileFBResponse.hashCode());
            result = 31 * result + (this.msgUpdateUserNameRequest == null ? 0 : this.msgUpdateUserNameRequest.hashCode());
            result = 31 * result + (this.msgUpdateUserNameResponse == null ? 0 : this.msgUpdateUserNameResponse.hashCode());
            result = 31 * result + (this.msgClaimInboxRequest == null ? 0 : this.msgClaimInboxRequest.hashCode());
            result = 31 * result + (this.msgClaimInboxResponse == null ? 0 : this.msgClaimInboxResponse.hashCode());
            result = 31 * result + (this.msgFriendListRawResponse == null ? 0 : this.msgFriendListRawResponse.hashCode());
            result = 31 * result + (this.msgFriendListDetailRequest == null ? 0 : this.msgFriendListDetailRequest.hashCode());
            result = 31 * result + (this.msgFriendListDetailResponse == null ? 0 : this.msgFriendListDetailResponse.hashCode());
            result = 31 * result + (this.msgFriendActionRequest == null ? 0 : this.msgFriendActionRequest.hashCode());
            result = 31 * result + (this.msgFriendActionResponse == null ? 0 : this.msgFriendActionResponse.hashCode());
            result = 31 * result + (this.msgFriendSearchRequest == null ? 0 : this.msgFriendSearchRequest.hashCode());
            result = 31 * result + (this.msgFriendSearchResponse == null ? 0 : this.msgFriendSearchResponse.hashCode());
            result = 31 * result + (this.msgFriendUnlockMoneySendRequest == null ? 0 : this.msgFriendUnlockMoneySendRequest.hashCode());
            result = 31 * result + (this.msgFriendUnlockMoneySendResponse == null ? 0 : this.msgFriendUnlockMoneySendResponse.hashCode());
            result = 31 * result + (this.msgFriendMessageSendRequest == null ? 0 : this.msgFriendMessageSendRequest.hashCode());
            result = 31 * result + (this.msgDailyQuestInfoResponse == null ? 0 : this.msgDailyQuestInfoResponse.hashCode());
            result = 31 * result + (this.msgDailyQuestReceiveRequest == null ? 0 : this.msgDailyQuestReceiveRequest.hashCode());
            result = 31 * result + (this.msgDailyQuestReceiveResponse == null ? 0 : this.msgDailyQuestReceiveResponse.hashCode());
            result = 31 * result + (this.msgDailySnsFriendInviteRequest == null ? 0 : this.msgDailySnsFriendInviteRequest.hashCode());
            result = 31 * result + (this.msgDailySnsFriendInviteResponse == null ? 0 : this.msgDailySnsFriendInviteResponse.hashCode());
            result = 31 * result + (this.msgGiftCodeRequest == null ? 0 : this.msgGiftCodeRequest.hashCode());
            result = 31 * result + (this.msgGiftCodeResponse == null ? 0 : this.msgGiftCodeResponse.hashCode());
            result = 31 * result + (this.msgGetUserInventoryResponse == null ? 0 : this.msgGetUserInventoryResponse.hashCode());
            result = 31 * result + (this.msgGetCannonDataResponse == null ? 0 : this.msgGetCannonDataResponse.hashCode());
            result = 31 * result + (this.msgCannonUnlockRequest == null ? 0 : this.msgCannonUnlockRequest.hashCode());
            result = 31 * result + (this.msgCannonUnlockResponse == null ? 0 : this.msgCannonUnlockResponse.hashCode());
            result = 31 * result + (this.msgCannonUpgradeRequest == null ? 0 : this.msgCannonUpgradeRequest.hashCode());
            result = 31 * result + (this.msgCannonUpgradeResponse == null ? 0 : this.msgCannonUpgradeResponse.hashCode());
            result = 31 * result + Long.hashCode(this.clienttime);
            result = 31 * result + (this.msgWheelEnterRequest == null ? 0 : this.msgWheelEnterRequest.hashCode());
            result = 31 * result + (this.msgWheelEnterResponse == null ? 0 : this.msgWheelEnterResponse.hashCode());
            result = 31 * result + (this.msgWheelLeaveRequest == null ? 0 : this.msgWheelLeaveRequest.hashCode());
            result = 31 * result + (this.msgWheelLeaveResponse == null ? 0 : this.msgWheelLeaveResponse.hashCode());
            result = 31 * result + (this.msgWheelTurnRequest == null ? 0 : this.msgWheelTurnRequest.hashCode());
            result = 31 * result + (this.msgWheelTurnResponse == null ? 0 : this.msgWheelTurnResponse.hashCode());
            result = 31 * result + (this.msgWheelGetRequest == null ? 0 : this.msgWheelGetRequest.hashCode());
            result = 31 * result + (this.msgWheelGetResponse == null ? 0 : this.msgWheelGetResponse.hashCode());
            result = 31 * result + (this.msgWheelIngameRequest == null ? 0 : this.msgWheelIngameRequest.hashCode());
            result = 31 * result + (this.msgWheelIngameResponse == null ? 0 : this.msgWheelIngameResponse.hashCode());
            result = 31 * result + (this.msgWheelCarrierRequest == null ? 0 : this.msgWheelCarrierRequest.hashCode());
            result = 31 * result + (this.msgWheelCarrierResponse == null ? 0 : this.msgWheelCarrierResponse.hashCode());
            result = 31 * result + (this.msgSoccerTeamsResponse == null ? 0 : this.msgSoccerTeamsResponse.hashCode());
            result = 31 * result + (this.msgSoccerEnterRequest == null ? 0 : this.msgSoccerEnterRequest.hashCode());
            result = 31 * result + (this.msgSoccerEnterResponse == null ? 0 : this.msgSoccerEnterResponse.hashCode());
            result = 31 * result + (this.msgSoccerMatchesRequest == null ? 0 : this.msgSoccerMatchesRequest.hashCode());
            result = 31 * result + (this.msgSoccerMatchesResponse == null ? 0 : this.msgSoccerMatchesResponse.hashCode());
            result = 31 * result + (this.msgSoccerBetRequest == null ? 0 : this.msgSoccerBetRequest.hashCode());
            result = 31 * result + (this.msgSoccerBetResponse == null ? 0 : this.msgSoccerBetResponse.hashCode());
            result = 31 * result + (this.msgSoccerBetCountResponse == null ? 0 : this.msgSoccerBetCountResponse.hashCode());
            result = 31 * result + (this.msgSoccerReceiveRequest == null ? 0 : this.msgSoccerReceiveRequest.hashCode());
            result = 31 * result + (this.msgSoccerReceiveResponse == null ? 0 : this.msgSoccerReceiveResponse.hashCode());
            result = 31 * result + (this.msgSoccerReddotRequest == null ? 0 : this.msgSoccerReddotRequest.hashCode());
            result = 31 * result + (this.msgSoccerReddotResponse == null ? 0 : this.msgSoccerReddotResponse.hashCode());
            result = 31 * result + (this.msgPetInfoRequest == null ? 0 : this.msgPetInfoRequest.hashCode());
            result = 31 * result + (this.msgPetInfoResponse == null ? 0 : this.msgPetInfoResponse.hashCode());
            result = 31 * result + (this.msgPetUpdateResponse == null ? 0 : this.msgPetUpdateResponse.hashCode());
            result = 31 * result + (this.msgPetUnlockRequest == null ? 0 : this.msgPetUnlockRequest.hashCode());
            result = 31 * result + (this.msgPetUnlockResponse == null ? 0 : this.msgPetUnlockResponse.hashCode());
            result = 31 * result + (this.msgPetGiftReceiveRequest == null ? 0 : this.msgPetGiftReceiveRequest.hashCode());
            result = 31 * result + (this.msgPetGiftReceiveResponse == null ? 0 : this.msgPetGiftReceiveResponse.hashCode());
            result = 31 * result + (this.msgPetGiftAskingResponse == null ? 0 : this.msgPetGiftAskingResponse.hashCode());
            result = 31 * result + (this.msgClientActionLogRequest == null ? 0 : this.msgClientActionLogRequest.hashCode());
            result = 31 * result + (this.msgAdsViewRequest == null ? 0 : this.msgAdsViewRequest.hashCode());
            result = 31 * result + (this.msgAdsViewResponse == null ? 0 : this.msgAdsViewResponse.hashCode());
            result = 31 * result + (this.msgPetLevelUpResponse == null ? 0 : this.msgPetLevelUpResponse.hashCode());
            result = 31 * result + (this.msgDailySupportResponse == null ? 0 : this.msgDailySupportResponse.hashCode());
            result = 31 * result + (this.msgDailyBonusRequest == null ? 0 : this.msgDailyBonusRequest.hashCode());
            result = 31 * result + (this.msgDailyBonusResponse == null ? 0 : this.msgDailyBonusResponse.hashCode());
            result = 31 * result + (this.msgClaimDailyBonusRequest == null ? 0 : this.msgClaimDailyBonusRequest.hashCode());
            result = 31 * result + (this.msgClaimDailyBonusResponse == null ? 0 : this.msgClaimDailyBonusResponse.hashCode());
            result = 31 * result + (this.msgCollectionInfoRequest == null ? 0 : this.msgCollectionInfoRequest.hashCode());
            result = 31 * result + (this.msgCollectionInfoResponse == null ? 0 : this.msgCollectionInfoResponse.hashCode());
            result = 31 * result + (this.msgClaimCollectionPrizeRequest == null ? 0 : this.msgClaimCollectionPrizeRequest.hashCode());
            result = 31 * result + (this.msgClaimCollectionPrizeResponse == null ? 0 : this.msgClaimCollectionPrizeResponse.hashCode());
            result = 31 * result + (this.msgDonateFriendListDetailRequest == null ? 0 : this.msgDonateFriendListDetailRequest.hashCode());
            result = 31 * result + (this.msgDonateFriendListDetailResponse == null ? 0 : this.msgDonateFriendListDetailResponse.hashCode());
            result = 31 * result + (this.msgDonateFriendReceiveItemsRequest == null ? 0 : this.msgDonateFriendReceiveItemsRequest.hashCode());
            result = 31 * result + (this.msgDonateFriendReceiveItemsResponse == null ? 0 : this.msgDonateFriendReceiveItemsResponse.hashCode());
            result = 31 * result + (this.msgDonateFriendSendItemsRequest == null ? 0 : this.msgDonateFriendSendItemsRequest.hashCode());
            result = 31 * result + (this.msgDonateFriendSendItemsResponse == null ? 0 : this.msgDonateFriendSendItemsResponse.hashCode());
            result = 31 * result + (this.msgDonateFriendCheckGiftRequest == null ? 0 : this.msgDonateFriendCheckGiftRequest.hashCode());
            result = 31 * result + (this.msgDonateFriendCheckGiftResponse == null ? 0 : this.msgDonateFriendCheckGiftResponse.hashCode());
            result = 31 * result + (this.msgDonateListFriendSendItemsRequest == null ? 0 : this.msgDonateListFriendSendItemsRequest.hashCode());
            result = 31 * result + (this.msgDonateListFriendSendItemsResponse == null ? 0 : this.msgDonateListFriendSendItemsResponse.hashCode());
            result = 31 * result + (this.msgAccumulatePromotionRequest == null ? 0 : this.msgAccumulatePromotionRequest.hashCode());
            result = 31 * result + (this.msgAccumulatePromotionResponse == null ? 0 : this.msgAccumulatePromotionResponse.hashCode());
            result = 31 * result + (this.msgAccumulateClaimRequest == null ? 0 : this.msgAccumulateClaimRequest.hashCode());
            result = 31 * result + (this.msgAccumulateClaimResponse == null ? 0 : this.msgAccumulateClaimResponse.hashCode());
            result = 31 * result + (this.msgLeaderBoardRequest == null ? 0 : this.msgLeaderBoardRequest.hashCode());
            result = 31 * result + (this.msgLeaderBoardResponse == null ? 0 : this.msgLeaderBoardResponse.hashCode());
            result = 31 * result + (this.msgArchiveCollectionRequest == null ? 0 : this.msgArchiveCollectionRequest.hashCode());
            result = 31 * result + (this.msgArchiveCollectionResponse == null ? 0 : this.msgArchiveCollectionResponse.hashCode());
            result = 31 * result + (this.msgAdsInfoRequest == null ? 0 : this.msgAdsInfoRequest.hashCode());
            result = 31 * result + (this.msgAdsInfoResponse == null ? 0 : this.msgAdsInfoResponse.hashCode());
            result = 31 * result + (this.msgAdsRewardClaimRequest == null ? 0 : this.msgAdsRewardClaimRequest.hashCode());
            result = 31 * result + (this.msgH3EnterRequest == null ? 0 : this.msgH3EnterRequest.hashCode());
            result = 31 * result + (this.msgH3EnterResponse == null ? 0 : this.msgH3EnterResponse.hashCode());
            result = 31 * result + (this.msgH3LeaveRequest == null ? 0 : this.msgH3LeaveRequest.hashCode());
            result = 31 * result + (this.msgH3LeaveResponse == null ? 0 : this.msgH3LeaveResponse.hashCode());
            result = 31 * result + (this.msgH3TurnRequest == null ? 0 : this.msgH3TurnRequest.hashCode());
            result = 31 * result + (this.msgH3TurnResponse == null ? 0 : this.msgH3TurnResponse.hashCode());

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasCommand()) {
                parts.add("command=" + getCommand() + '(' + getCommandValue() + ')');
            }
            if (hasMsgGetUserMoneyRequest()) {
                parts.add("msgGetUserMoneyRequest=" + getMsgGetUserMoneyRequest());
            }
            if (hasMsgGetUserMoneyResponse()) {
                parts.add("msgGetUserMoneyResponse=" + getMsgGetUserMoneyResponse());
            }
            if (hasMsgGetUserProfileRequest()) {
                parts.add("msgGetUserProfileRequest=" + getMsgGetUserProfileRequest());
            }
            if (hasMsgGetUserProfileResponse()) {
                parts.add("msgGetUserProfileResponse=" + getMsgGetUserProfileResponse());
            }
            if (hasMsgLevelUpResponse()) {
                parts.add("msgLevelUpResponse=" + getMsgLevelUpResponse());
            }
            if (hasMsgGetUserInboxResponse()) {
                parts.add("msgGetUserInboxResponse=" + getMsgGetUserInboxResponse());
            }
            if (hasMsgUpdateProfileFBRequest()) {
                parts.add("msgUpdateProfileFBRequest=" + getMsgUpdateProfileFBRequest());
            }
            if (hasMsgUpdateProfileFBResponse()) {
                parts.add("msgUpdateProfileFBResponse=" + getMsgUpdateProfileFBResponse());
            }
            if (hasMsgUpdateUserNameRequest()) {
                parts.add("msgUpdateUserNameRequest=" + getMsgUpdateUserNameRequest());
            }
            if (hasMsgUpdateUserNameResponse()) {
                parts.add("msgUpdateUserNameResponse=" + getMsgUpdateUserNameResponse());
            }
            if (hasMsgClaimInboxRequest()) {
                parts.add("msgClaimInboxRequest=" + getMsgClaimInboxRequest());
            }
            if (hasMsgClaimInboxResponse()) {
                parts.add("msgClaimInboxResponse=" + getMsgClaimInboxResponse());
            }
            if (hasMsgFriendListRawResponse()) {
                parts.add("msgFriendListRawResponse=" + getMsgFriendListRawResponse());
            }
            if (hasMsgFriendListDetailRequest()) {
                parts.add("msgFriendListDetailRequest=" + getMsgFriendListDetailRequest());
            }
            if (hasMsgFriendListDetailResponse()) {
                parts.add("msgFriendListDetailResponse=" + getMsgFriendListDetailResponse());
            }
            if (hasMsgFriendActionRequest()) {
                parts.add("msgFriendActionRequest=" + getMsgFriendActionRequest());
            }
            if (hasMsgFriendActionResponse()) {
                parts.add("msgFriendActionResponse=" + getMsgFriendActionResponse());
            }
            if (hasMsgFriendSearchRequest()) {
                parts.add("msgFriendSearchRequest=" + getMsgFriendSearchRequest());
            }
            if (hasMsgFriendSearchResponse()) {
                parts.add("msgFriendSearchResponse=" + getMsgFriendSearchResponse());
            }
            if (hasMsgFriendUnlockMoneySendRequest()) {
                parts.add("msgFriendUnlockMoneySendRequest=" + getMsgFriendUnlockMoneySendRequest());
            }
            if (hasMsgFriendUnlockMoneySendResponse()) {
                parts.add("msgFriendUnlockMoneySendResponse=" + getMsgFriendUnlockMoneySendResponse());
            }
            if (hasMsgFriendMessageSendRequest()) {
                parts.add("msgFriendMessageSendRequest=" + getMsgFriendMessageSendRequest());
            }
            if (hasMsgDailyQuestInfoResponse()) {
                parts.add("msgDailyQuestInfoResponse=" + getMsgDailyQuestInfoResponse());
            }
            if (hasMsgDailyQuestReceiveRequest()) {
                parts.add("msgDailyQuestReceiveRequest=" + getMsgDailyQuestReceiveRequest());
            }
            if (hasMsgDailyQuestReceiveResponse()) {
                parts.add("msgDailyQuestReceiveResponse=" + getMsgDailyQuestReceiveResponse());
            }
            if (hasMsgDailySnsFriendInviteRequest()) {
                parts.add("msgDailySnsFriendInviteRequest=" + getMsgDailySnsFriendInviteRequest());
            }
            if (hasMsgDailySnsFriendInviteResponse()) {
                parts.add("msgDailySnsFriendInviteResponse=" + getMsgDailySnsFriendInviteResponse());
            }
            if (hasMsgGiftCodeRequest()) {
                parts.add("msgGiftCodeRequest=" + getMsgGiftCodeRequest());
            }
            if (hasMsgGiftCodeResponse()) {
                parts.add("msgGiftCodeResponse=" + getMsgGiftCodeResponse());
            }
            if (hasMsgGetUserInventoryResponse()) {
                parts.add("msgGetUserInventoryResponse=" + getMsgGetUserInventoryResponse());
            }
            if (hasMsgGetCannonDataResponse()) {
                parts.add("msgGetCannonDataResponse=" + getMsgGetCannonDataResponse());
            }
            if (hasMsgCannonUnlockRequest()) {
                parts.add("msgCannonUnlockRequest=" + getMsgCannonUnlockRequest());
            }
            if (hasMsgCannonUnlockResponse()) {
                parts.add("msgCannonUnlockResponse=" + getMsgCannonUnlockResponse());
            }
            if (hasMsgCannonUpgradeRequest()) {
                parts.add("msgCannonUpgradeRequest=" + getMsgCannonUpgradeRequest());
            }
            if (hasMsgCannonUpgradeResponse()) {
                parts.add("msgCannonUpgradeResponse=" + getMsgCannonUpgradeResponse());
            }
            if (hasClienttime()) {
                parts.add("clienttime=" + getClienttime());
            }
            if (hasMsgWheelEnterRequest()) {
                parts.add("msgWheelEnterRequest=" + getMsgWheelEnterRequest());
            }
            if (hasMsgWheelEnterResponse()) {
                parts.add("msgWheelEnterResponse=" + getMsgWheelEnterResponse());
            }
            if (hasMsgWheelLeaveRequest()) {
                parts.add("msgWheelLeaveRequest=" + getMsgWheelLeaveRequest());
            }
            if (hasMsgWheelLeaveResponse()) {
                parts.add("msgWheelLeaveResponse=" + getMsgWheelLeaveResponse());
            }
            if (hasMsgWheelTurnRequest()) {
                parts.add("msgWheelTurnRequest=" + getMsgWheelTurnRequest());
            }
            if (hasMsgWheelTurnResponse()) {
                parts.add("msgWheelTurnResponse=" + getMsgWheelTurnResponse());
            }
            if (hasMsgWheelGetRequest()) {
                parts.add("msgWheelGetRequest=" + getMsgWheelGetRequest());
            }
            if (hasMsgWheelGetResponse()) {
                parts.add("msgWheelGetResponse=" + getMsgWheelGetResponse());
            }
            if (hasMsgWheelIngameRequest()) {
                parts.add("msgWheelIngameRequest=" + getMsgWheelIngameRequest());
            }
            if (hasMsgWheelIngameResponse()) {
                parts.add("msgWheelIngameResponse=" + getMsgWheelIngameResponse());
            }
            if (hasMsgWheelCarrierRequest()) {
                parts.add("msgWheelCarrierRequest=" + getMsgWheelCarrierRequest());
            }
            if (hasMsgWheelCarrierResponse()) {
                parts.add("msgWheelCarrierResponse=" + getMsgWheelCarrierResponse());
            }
            if (hasMsgSoccerTeamsResponse()) {
                parts.add("msgSoccerTeamsResponse=" + getMsgSoccerTeamsResponse());
            }
            if (hasMsgSoccerEnterRequest()) {
                parts.add("msgSoccerEnterRequest=" + getMsgSoccerEnterRequest());
            }
            if (hasMsgSoccerEnterResponse()) {
                parts.add("msgSoccerEnterResponse=" + getMsgSoccerEnterResponse());
            }
            if (hasMsgSoccerMatchesRequest()) {
                parts.add("msgSoccerMatchesRequest=" + getMsgSoccerMatchesRequest());
            }
            if (hasMsgSoccerMatchesResponse()) {
                parts.add("msgSoccerMatchesResponse=" + getMsgSoccerMatchesResponse());
            }
            if (hasMsgSoccerBetRequest()) {
                parts.add("msgSoccerBetRequest=" + getMsgSoccerBetRequest());
            }
            if (hasMsgSoccerBetResponse()) {
                parts.add("msgSoccerBetResponse=" + getMsgSoccerBetResponse());
            }
            if (hasMsgSoccerBetCountResponse()) {
                parts.add("msgSoccerBetCountResponse=" + getMsgSoccerBetCountResponse());
            }
            if (hasMsgSoccerReceiveRequest()) {
                parts.add("msgSoccerReceiveRequest=" + getMsgSoccerReceiveRequest());
            }
            if (hasMsgSoccerReceiveResponse()) {
                parts.add("msgSoccerReceiveResponse=" + getMsgSoccerReceiveResponse());
            }
            if (hasMsgSoccerReddotRequest()) {
                parts.add("msgSoccerReddotRequest=" + getMsgSoccerReddotRequest());
            }
            if (hasMsgSoccerReddotResponse()) {
                parts.add("msgSoccerReddotResponse=" + getMsgSoccerReddotResponse());
            }
            if (hasMsgPetInfoRequest()) {
                parts.add("msgPetInfoRequest=" + getMsgPetInfoRequest());
            }
            if (hasMsgPetInfoResponse()) {
                parts.add("msgPetInfoResponse=" + getMsgPetInfoResponse());
            }
            if (hasMsgPetUpdateResponse()) {
                parts.add("msgPetUpdateResponse=" + getMsgPetUpdateResponse());
            }
            if (hasMsgPetUnlockRequest()) {
                parts.add("msgPetUnlockRequest=" + getMsgPetUnlockRequest());
            }
            if (hasMsgPetUnlockResponse()) {
                parts.add("msgPetUnlockResponse=" + getMsgPetUnlockResponse());
            }
            if (hasMsgPetGiftReceiveRequest()) {
                parts.add("msgPetGiftReceiveRequest=" + getMsgPetGiftReceiveRequest());
            }
            if (hasMsgPetGiftReceiveResponse()) {
                parts.add("msgPetGiftReceiveResponse=" + getMsgPetGiftReceiveResponse());
            }
            if (hasMsgPetGiftAskingResponse()) {
                parts.add("msgPetGiftAskingResponse=" + getMsgPetGiftAskingResponse());
            }
            if (hasMsgClientActionLogRequest()) {
                parts.add("msgClientActionLogRequest=" + getMsgClientActionLogRequest());
            }
            if (hasMsgAdsViewRequest()) {
                parts.add("msgAdsViewRequest=" + getMsgAdsViewRequest());
            }
            if (hasMsgAdsViewResponse()) {
                parts.add("msgAdsViewResponse=" + getMsgAdsViewResponse());
            }
            if (hasMsgPetLevelUpResponse()) {
                parts.add("msgPetLevelUpResponse=" + getMsgPetLevelUpResponse());
            }
            if (hasMsgDailySupportResponse()) {
                parts.add("msgDailySupportResponse=" + getMsgDailySupportResponse());
            }
            if (hasMsgDailyBonusRequest()) {
                parts.add("msgDailyBonusRequest=" + getMsgDailyBonusRequest());
            }
            if (hasMsgDailyBonusResponse()) {
                parts.add("msgDailyBonusResponse=" + getMsgDailyBonusResponse());
            }
            if (hasMsgClaimDailyBonusRequest()) {
                parts.add("msgClaimDailyBonusRequest=" + getMsgClaimDailyBonusRequest());
            }
            if (hasMsgClaimDailyBonusResponse()) {
                parts.add("msgClaimDailyBonusResponse=" + getMsgClaimDailyBonusResponse());
            }
            if (hasMsgCollectionInfoRequest()) {
                parts.add("msgCollectionInfoRequest=" + getMsgCollectionInfoRequest());
            }
            if (hasMsgCollectionInfoResponse()) {
                parts.add("msgCollectionInfoResponse=" + getMsgCollectionInfoResponse());
            }
            if (hasMsgClaimCollectionPrizeRequest()) {
                parts.add("msgClaimCollectionPrizeRequest=" + getMsgClaimCollectionPrizeRequest());
            }
            if (hasMsgClaimCollectionPrizeResponse()) {
                parts.add("msgClaimCollectionPrizeResponse=" + getMsgClaimCollectionPrizeResponse());
            }
            if (hasMsgDonateFriendListDetailRequest()) {
                parts.add("msgDonateFriendListDetailRequest=" + getMsgDonateFriendListDetailRequest());
            }
            if (hasMsgDonateFriendListDetailResponse()) {
                parts.add("msgDonateFriendListDetailResponse=" + getMsgDonateFriendListDetailResponse());
            }
            if (hasMsgDonateFriendReceiveItemsRequest()) {
                parts.add("msgDonateFriendReceiveItemsRequest=" + getMsgDonateFriendReceiveItemsRequest());
            }
            if (hasMsgDonateFriendReceiveItemsResponse()) {
                parts.add("msgDonateFriendReceiveItemsResponse=" + getMsgDonateFriendReceiveItemsResponse());
            }
            if (hasMsgDonateFriendSendItemsRequest()) {
                parts.add("msgDonateFriendSendItemsRequest=" + getMsgDonateFriendSendItemsRequest());
            }
            if (hasMsgDonateFriendSendItemsResponse()) {
                parts.add("msgDonateFriendSendItemsResponse=" + getMsgDonateFriendSendItemsResponse());
            }
            if (hasMsgDonateFriendCheckGiftRequest()) {
                parts.add("msgDonateFriendCheckGiftRequest=" + getMsgDonateFriendCheckGiftRequest());
            }
            if (hasMsgDonateFriendCheckGiftResponse()) {
                parts.add("msgDonateFriendCheckGiftResponse=" + getMsgDonateFriendCheckGiftResponse());
            }
            if (hasMsgDonateListFriendSendItemsRequest()) {
                parts.add("msgDonateListFriendSendItemsRequest=" + getMsgDonateListFriendSendItemsRequest());
            }
            if (hasMsgDonateListFriendSendItemsResponse()) {
                parts.add("msgDonateListFriendSendItemsResponse=" + getMsgDonateListFriendSendItemsResponse());
            }
            if (hasMsgAccumulatePromotionRequest()) {
                parts.add("msgAccumulatePromotionRequest=" + getMsgAccumulatePromotionRequest());
            }
            if (hasMsgAccumulatePromotionResponse()) {
                parts.add("msgAccumulatePromotionResponse=" + getMsgAccumulatePromotionResponse());
            }
            if (hasMsgAccumulateClaimRequest()) {
                parts.add("msgAccumulateClaimRequest=" + getMsgAccumulateClaimRequest());
            }
            if (hasMsgAccumulateClaimResponse()) {
                parts.add("msgAccumulateClaimResponse=" + getMsgAccumulateClaimResponse());
            }
            if (hasMsgLeaderBoardRequest()) {
                parts.add("msgLeaderBoardRequest=" + getMsgLeaderBoardRequest());
            }
            if (hasMsgLeaderBoardResponse()) {
                parts.add("msgLeaderBoardResponse=" + getMsgLeaderBoardResponse());
            }
            if (hasMsgArchiveCollectionRequest()) {
                parts.add("msgArchiveCollectionRequest=" + getMsgArchiveCollectionRequest());
            }
            if (hasMsgArchiveCollectionResponse()) {
                parts.add("msgArchiveCollectionResponse=" + getMsgArchiveCollectionResponse());
            }
            if (hasMsgAdsInfoRequest()) {
                parts.add("msgAdsInfoRequest=" + getMsgAdsInfoRequest());
            }
            if (hasMsgAdsInfoResponse()) {
                parts.add("msgAdsInfoResponse=" + getMsgAdsInfoResponse());
            }
            if (hasMsgAdsRewardClaimRequest()) {
                parts.add("msgAdsRewardClaimRequest=" + getMsgAdsRewardClaimRequest());
            }
            if (hasMsgH3EnterRequest()) {
                parts.add("msgH3EnterRequest=" + getMsgH3EnterRequest());
            }
            if (hasMsgH3EnterResponse()) {
                parts.add("msgH3EnterResponse=" + getMsgH3EnterResponse());
            }
            if (hasMsgH3LeaveRequest()) {
                parts.add("msgH3LeaveRequest=" + getMsgH3LeaveRequest());
            }
            if (hasMsgH3LeaveResponse()) {
                parts.add("msgH3LeaveResponse=" + getMsgH3LeaveResponse());
            }
            if (hasMsgH3TurnRequest()) {
                parts.add("msgH3TurnRequest=" + getMsgH3TurnRequest());
            }
            if (hasMsgH3TurnResponse()) {
                parts.add("msgH3TurnResponse=" + getMsgH3TurnResponse());
            }
            return "ProfileMessage{" + String.join(", ", parts) + "}";
        }

        public ProfileMessage build() {
            proto.message.ProfileMessage result = new proto.message.ProfileMessage();
            result.__bitField0 = __bitField0;
            result.__bitField1 = __bitField1;
            result.__bitField2 = __bitField2;
            result.__bitField3 = __bitField3;
            result.command = this.command;
            result.msgGetUserMoneyRequest = this.msgGetUserMoneyRequest;
            result.msgGetUserMoneyResponse = this.msgGetUserMoneyResponse;
            result.msgGetUserProfileRequest = this.msgGetUserProfileRequest;
            result.msgGetUserProfileResponse = this.msgGetUserProfileResponse;
            result.msgLevelUpResponse = this.msgLevelUpResponse;
            result.msgGetUserInboxResponse = this.msgGetUserInboxResponse;
            result.msgUpdateProfileFBRequest = this.msgUpdateProfileFBRequest;
            result.msgUpdateProfileFBResponse = this.msgUpdateProfileFBResponse;
            result.msgUpdateUserNameRequest = this.msgUpdateUserNameRequest;
            result.msgUpdateUserNameResponse = this.msgUpdateUserNameResponse;
            result.msgClaimInboxRequest = this.msgClaimInboxRequest;
            result.msgClaimInboxResponse = this.msgClaimInboxResponse;
            result.msgFriendListRawResponse = this.msgFriendListRawResponse;
            result.msgFriendListDetailRequest = this.msgFriendListDetailRequest;
            result.msgFriendListDetailResponse = this.msgFriendListDetailResponse;
            result.msgFriendActionRequest = this.msgFriendActionRequest;
            result.msgFriendActionResponse = this.msgFriendActionResponse;
            result.msgFriendSearchRequest = this.msgFriendSearchRequest;
            result.msgFriendSearchResponse = this.msgFriendSearchResponse;
            result.msgFriendUnlockMoneySendRequest = this.msgFriendUnlockMoneySendRequest;
            result.msgFriendUnlockMoneySendResponse = this.msgFriendUnlockMoneySendResponse;
            result.msgFriendMessageSendRequest = this.msgFriendMessageSendRequest;
            result.msgDailyQuestInfoResponse = this.msgDailyQuestInfoResponse;
            result.msgDailyQuestReceiveRequest = this.msgDailyQuestReceiveRequest;
            result.msgDailyQuestReceiveResponse = this.msgDailyQuestReceiveResponse;
            result.msgDailySnsFriendInviteRequest = this.msgDailySnsFriendInviteRequest;
            result.msgDailySnsFriendInviteResponse = this.msgDailySnsFriendInviteResponse;
            result.msgGiftCodeRequest = this.msgGiftCodeRequest;
            result.msgGiftCodeResponse = this.msgGiftCodeResponse;
            result.msgGetUserInventoryResponse = this.msgGetUserInventoryResponse;
            result.msgGetCannonDataResponse = this.msgGetCannonDataResponse;
            result.msgCannonUnlockRequest = this.msgCannonUnlockRequest;
            result.msgCannonUnlockResponse = this.msgCannonUnlockResponse;
            result.msgCannonUpgradeRequest = this.msgCannonUpgradeRequest;
            result.msgCannonUpgradeResponse = this.msgCannonUpgradeResponse;
            result.clienttime = this.clienttime;
            result.msgWheelEnterRequest = this.msgWheelEnterRequest;
            result.msgWheelEnterResponse = this.msgWheelEnterResponse;
            result.msgWheelLeaveRequest = this.msgWheelLeaveRequest;
            result.msgWheelLeaveResponse = this.msgWheelLeaveResponse;
            result.msgWheelTurnRequest = this.msgWheelTurnRequest;
            result.msgWheelTurnResponse = this.msgWheelTurnResponse;
            result.msgWheelGetRequest = this.msgWheelGetRequest;
            result.msgWheelGetResponse = this.msgWheelGetResponse;
            result.msgWheelIngameRequest = this.msgWheelIngameRequest;
            result.msgWheelIngameResponse = this.msgWheelIngameResponse;
            result.msgWheelCarrierRequest = this.msgWheelCarrierRequest;
            result.msgWheelCarrierResponse = this.msgWheelCarrierResponse;
            result.msgSoccerTeamsResponse = this.msgSoccerTeamsResponse;
            result.msgSoccerEnterRequest = this.msgSoccerEnterRequest;
            result.msgSoccerEnterResponse = this.msgSoccerEnterResponse;
            result.msgSoccerMatchesRequest = this.msgSoccerMatchesRequest;
            result.msgSoccerMatchesResponse = this.msgSoccerMatchesResponse;
            result.msgSoccerBetRequest = this.msgSoccerBetRequest;
            result.msgSoccerBetResponse = this.msgSoccerBetResponse;
            result.msgSoccerBetCountResponse = this.msgSoccerBetCountResponse;
            result.msgSoccerReceiveRequest = this.msgSoccerReceiveRequest;
            result.msgSoccerReceiveResponse = this.msgSoccerReceiveResponse;
            result.msgSoccerReddotRequest = this.msgSoccerReddotRequest;
            result.msgSoccerReddotResponse = this.msgSoccerReddotResponse;
            result.msgPetInfoRequest = this.msgPetInfoRequest;
            result.msgPetInfoResponse = this.msgPetInfoResponse;
            result.msgPetUpdateResponse = this.msgPetUpdateResponse;
            result.msgPetUnlockRequest = this.msgPetUnlockRequest;
            result.msgPetUnlockResponse = this.msgPetUnlockResponse;
            result.msgPetGiftReceiveRequest = this.msgPetGiftReceiveRequest;
            result.msgPetGiftReceiveResponse = this.msgPetGiftReceiveResponse;
            result.msgPetGiftAskingResponse = this.msgPetGiftAskingResponse;
            result.msgClientActionLogRequest = this.msgClientActionLogRequest;
            result.msgAdsViewRequest = this.msgAdsViewRequest;
            result.msgAdsViewResponse = this.msgAdsViewResponse;
            result.msgPetLevelUpResponse = this.msgPetLevelUpResponse;
            result.msgDailySupportResponse = this.msgDailySupportResponse;
            result.msgDailyBonusRequest = this.msgDailyBonusRequest;
            result.msgDailyBonusResponse = this.msgDailyBonusResponse;
            result.msgClaimDailyBonusRequest = this.msgClaimDailyBonusRequest;
            result.msgClaimDailyBonusResponse = this.msgClaimDailyBonusResponse;
            result.msgCollectionInfoRequest = this.msgCollectionInfoRequest;
            result.msgCollectionInfoResponse = this.msgCollectionInfoResponse;
            result.msgClaimCollectionPrizeRequest = this.msgClaimCollectionPrizeRequest;
            result.msgClaimCollectionPrizeResponse = this.msgClaimCollectionPrizeResponse;
            result.msgDonateFriendListDetailRequest = this.msgDonateFriendListDetailRequest;
            result.msgDonateFriendListDetailResponse = this.msgDonateFriendListDetailResponse;
            result.msgDonateFriendReceiveItemsRequest = this.msgDonateFriendReceiveItemsRequest;
            result.msgDonateFriendReceiveItemsResponse = this.msgDonateFriendReceiveItemsResponse;
            result.msgDonateFriendSendItemsRequest = this.msgDonateFriendSendItemsRequest;
            result.msgDonateFriendSendItemsResponse = this.msgDonateFriendSendItemsResponse;
            result.msgDonateFriendCheckGiftRequest = this.msgDonateFriendCheckGiftRequest;
            result.msgDonateFriendCheckGiftResponse = this.msgDonateFriendCheckGiftResponse;
            result.msgDonateListFriendSendItemsRequest = this.msgDonateListFriendSendItemsRequest;
            result.msgDonateListFriendSendItemsResponse = this.msgDonateListFriendSendItemsResponse;
            result.msgAccumulatePromotionRequest = this.msgAccumulatePromotionRequest;
            result.msgAccumulatePromotionResponse = this.msgAccumulatePromotionResponse;
            result.msgAccumulateClaimRequest = this.msgAccumulateClaimRequest;
            result.msgAccumulateClaimResponse = this.msgAccumulateClaimResponse;
            result.msgLeaderBoardRequest = this.msgLeaderBoardRequest;
            result.msgLeaderBoardResponse = this.msgLeaderBoardResponse;
            result.msgArchiveCollectionRequest = this.msgArchiveCollectionRequest;
            result.msgArchiveCollectionResponse = this.msgArchiveCollectionResponse;
            result.msgAdsInfoRequest = this.msgAdsInfoRequest;
            result.msgAdsInfoResponse = this.msgAdsInfoResponse;
            result.msgAdsRewardClaimRequest = this.msgAdsRewardClaimRequest;
            result.msgH3EnterRequest = this.msgH3EnterRequest;
            result.msgH3EnterResponse = this.msgH3EnterResponse;
            result.msgH3LeaveRequest = this.msgH3LeaveRequest;
            result.msgH3LeaveResponse = this.msgH3LeaveResponse;
            result.msgH3TurnRequest = this.msgH3TurnRequest;
            result.msgH3TurnResponse = this.msgH3TurnResponse;
            return result;
        }

    }



}