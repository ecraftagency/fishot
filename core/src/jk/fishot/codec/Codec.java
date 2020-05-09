package jk.fishot.codec;

import com.badlogic.gdx.Application;

import java.nio.ByteBuffer;

import io.protostuff.Message;
import io.protostuff.ProtobufIOUtil;
import io.protostuff.Schema;
import jk.fishot.common.Global;
import jk.fishot.generator.BinaryMessage;

public class Codec {
  public static Application.ApplicationType platform;
  public static Message decode(ByteBuffer byteBuf) {
    byte groupId = byteBuf.get();
    int protoSize = byteBuf.remaining();

    //Option1 using ThreadLocal: +threadsafe, -slow(copy), -moe not support ThreadLocal
    //byte[] protoData = Global.byteBuf.get();
    //byteBuf.get(protoData, 0, protoSize);

    //Option2 direct access: -not threadsafe, +fast(no copy)
    byte[] in = byteBuf.array();

    Message out = MessageGroupFilter.getInstance(groupId); //alloc ok!
    Schema schema = MessageGroupFilter.getParserFromMessageGroup(groupId);
    ProtobufIOUtil.mergeFrom(in, 1, protoSize, out, schema);
    return out;
  }

  public static ByteBuffer encode(BinaryMessage bMsg) {
    byte[] protoData = bMsg.protobufData;
    int payloadSize = bMsg.protobufSize + 1;

    //Direct Buffer not support by GWT
    ByteBuffer out = (Global.platform == Application.ApplicationType.WebGL) ? ByteBuffer.allocate(payloadSize) : ByteBuffer.allocateDirect(payloadSize);

    out.put((byte) bMsg.hGroupId).put(protoData);
    out.flip();
    return out;
  }
}
