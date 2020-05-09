package jk.fishot.generator;

import java.nio.ByteBuffer;

import io.protostuff.LinkedBuffer;
import io.protostuff.Message;
import io.protostuff.ProtobufIOUtil;
import jk.fishot.common.Global;

public class BinaryMessage {
  public int hGroupId;
  public byte[] protobufData;
  public int protobufSize;
  public ByteBuffer wrap;

  public BinaryMessage(int groupId, final Message msg) {
    hGroupId = groupId;
    byte[] out;

    //option 1 thread local: -moe not support), -alloc, +threadsafe
    //LinkedBuffer lb = Global.linkedBuf.get();

    //option 2 normal alloc: -slow -leak potential, -alloc, +support all platform
    //LinkedBuffer lb = LinkedBuffer.allocate(16*1024);

    //option 3 static array wrapper: -not threadsafe, +support all, +fast, +no alloc
    LinkedBuffer lb = LinkedBuffer.wrap(Global.linkedBuf, 0, 0);

    try {
      out = ProtobufIOUtil.toByteArray(msg, msg.cachedSchema(), lb);
    }
    finally {
      lb.clear();
    }
    protobufData = out;
    protobufSize = protobufData.length;
  }
}
