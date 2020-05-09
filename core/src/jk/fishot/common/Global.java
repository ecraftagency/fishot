package jk.fishot.common;

import com.badlogic.gdx.Application;

import java.util.function.Supplier;

import io.protostuff.LinkedBuffer;

public class Global {
  private static final int MAX_READ_BUFFER = 16*1024;
  // public static ThreadLocal<byte[]> byteBuf = ThreadLocal.withInitial(() -> new byte[MAX_READ_BUFFER]);
  //public static ThreadLocal<LinkedBuffer> linkedBuf = ThreadLocal.withInitial(() -> LinkedBuffer.allocate(MAX_READ_BUFFER));
  public static byte[] linkedBuf = new byte[MAX_READ_BUFFER];

  public static Application.ApplicationType platform;

  public class MessageGroupCommand {
    public static final int INVALID_MESSAGE_GROUP = 0;
    public static final int SYSTEM_MESSAGE_GROUP = 1;
    public static final int PROFILE_MESSAGE_GROUP = 2;
    public static final int INGAME_MESSAGE_GROUP = 3;
    public static final int PAYMENT_MESSAGE_GROUP = 4;
    public static final int SCOREBOARD_MESSAGE_GROUP = 5;
    public static final int HAPPY_PLAY_MESSAGE_GROUP = 6;
    public static final int BOT_MESSAGE_GROUP = 7;
  }
}
