package jk.fishot.generator;


import jk.fishot.common.Global;
import proto.message.LoginRequest;
import proto.message.PingTestRequest;
import proto.message.SystemCommand;
import proto.message.SystemMessage;

public class SMG {
  public static BinaryMessage loginRequest(String id, String pwd) {
    LoginRequest.Builder req = LoginRequest.newBuilder();
    req.setUserID(id).setPassword(pwd).setBuildSource("TH").setClientVersion("152");
    SystemMessage.Builder builder = SystemMessage.newBuilder();
    builder.setCommand(SystemCommand.SYSTEM_MSG_LOGIN_REQUEST).setMsgLoginRequest(req.build());
    return new BinaryMessage(Global.MessageGroupCommand.SYSTEM_MESSAGE_GROUP, builder.build());
  }

  public static BinaryMessage pingTestRequest(long id) {
    PingTestRequest.Builder req = PingTestRequest.newBuilder();
    req.setId(id);
    SystemMessage.Builder builder = SystemMessage.newBuilder();
    builder.setCommand(SystemCommand.SYSTEM_MSG_PING_TEST_REQUEST).setMsgPingTestRequest(req.build());
    return new BinaryMessage(Global.MessageGroupCommand.SYSTEM_MESSAGE_GROUP, builder.build());
  }
}