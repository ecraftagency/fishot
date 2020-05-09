package jk.fishot.codec;

import io.protostuff.Message;
import io.protostuff.Schema;
import jk.fishot.common.Global;
import proto.message.ProfileMessage;
import proto.message.SystemMessage;

public class MessageGroupFilter {
  public static int LookupMessageGroupIDFromPrototype(Object prototype) {
    if (prototype instanceof SystemMessage)
      return Global.MessageGroupCommand.SYSTEM_MESSAGE_GROUP;
    if (prototype instanceof ProfileMessage)
      return Global.MessageGroupCommand.PROFILE_MESSAGE_GROUP;
    return Global.MessageGroupCommand.INVALID_MESSAGE_GROUP;
  }

  private final static Schema<SystemMessage> systemSchema = SystemMessage.getSchema();
  private final static Schema<ProfileMessage> profileScheme = ProfileMessage.getSchema();

  public static Schema<?> getParserFromMessageGroup(int messageGroup) {
    if(messageGroup == Global.MessageGroupCommand.SYSTEM_MESSAGE_GROUP)
      return systemSchema;
    if(messageGroup == Global.MessageGroupCommand.PROFILE_MESSAGE_GROUP)
      return profileScheme;
    return null;
  }

  public static Message getInstance(int messageGroup) {
    if(messageGroup == Global.MessageGroupCommand.SYSTEM_MESSAGE_GROUP)
      return SystemMessage.newBuilder().build();
    if(messageGroup == Global.MessageGroupCommand.PROFILE_MESSAGE_GROUP)
      return ProfileMessage.newBuilder().build();
    return null;
  }
}
