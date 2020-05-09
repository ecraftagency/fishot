package jk.fishot.generator;

import java.util.List;
import java.util.Map;

import jk.fishot.common.Global;
import proto.message.AdsRewardClaimRequest;
import proto.message.ArchiveCollectionRequest;
import proto.message.BetCase;
import proto.message.H3TurnRequest;
import proto.message.ProfileCommand;
import proto.message.ProfileMessage;

public class PMG {
  public static BinaryMessage archiveColectRequest() {
    ArchiveCollectionRequest.Builder req = ArchiveCollectionRequest.newBuilder();
    ProfileMessage.Builder builder = ProfileMessage.newBuilder();
    builder.setCommand(ProfileCommand.PROFILE_ARCHIVE_COLLECTION_REQUEST).setMsgArchiveCollectionRequest(req.build());
    return new BinaryMessage(Global.MessageGroupCommand.PROFILE_MESSAGE_GROUP, builder.build());
  }

  public static BinaryMessage claimAdsRewadRequest() {
    AdsRewardClaimRequest.Builder req = AdsRewardClaimRequest.newBuilder();
    ProfileMessage.Builder builder = ProfileMessage.newBuilder();
    builder.setCommand(ProfileCommand.PROFILE_ADS_REWARD_CLAIM_REQUEST).setMsgAdsRewardClaimRequest(req.build());
    return new BinaryMessage(Global.MessageGroupCommand.PROFILE_MESSAGE_GROUP, builder.build());
  }

  public static BinaryMessage h3TurnRequest(List<Map.Entry<Integer, Integer>> betCases) {
    H3TurnRequest.Builder req = H3TurnRequest.newBuilder();
    if (betCases != null) {
      for (Map.Entry<Integer, Integer> _case : betCases) {
        BetCase.Builder betCase = BetCase.newBuilder();
        betCase.setCases(_case.getKey()).setBetMoney(_case.getValue());
        req.addBetCases(betCase.build());
      }
    }

    ProfileMessage.Builder builder = ProfileMessage.newBuilder();
    builder.setCommand(ProfileCommand.PROFILE_H3_TURN_REQUEST).setMsgH3TurnRequest(req.build());
    return new BinaryMessage(Global.MessageGroupCommand.PROFILE_MESSAGE_GROUP, builder.build());
  }
}
