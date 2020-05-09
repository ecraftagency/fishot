package jk.fishot.client;

import java.nio.ByteBuffer;
import java.util.List;

import elemental2.core.Uint8Array;
import elemental2.dom.Blob;
import elemental2.dom.FileReader;
import elemental2.dom.WebSocket;
import jk.fishot.common.Websocket;

public class GwtWebsocket implements Websocket {
  private WebSocket ws = null;
  private Listener listener = null;
  private static ThreadLocal<byte[]> byteBuf = ThreadLocal.withInitial(() -> new byte[1024*16]);
  @Override
  public void connect(String url) throws Exception {

    ws = new WebSocket(url);
    final Websocket _this = this;
    ws.onopen = e -> {
      if (listener != null)
        listener.onOpen(_this);
      return true;
    };

    ws.onmessage = e -> {
      FileReader fr = new FileReader();

      fr.onload = p0 -> { //////REALLY REALLY REALLY REALLY FUCKED UP
        if (listener != null) {

          //solution 1 100% safe but need mote ALLOCATION

          /*ArrayBuffer ab = fr.result.asArrayBuffer();
          Uint8Array bytes = new Uint8Array(ab);
          Byte[] resp = bytes.asList().stream().map(d -> (byte)(double)d).toArray(Byte[]::new); // loop + alloc
          byte[] prev = new byte[resp.length]; // alloc
          for (int i = 0; i < resp.length; i++) // loop
            prev[i] = resp[i];
          listener.onMessage(_this, ByteBuffer.wrap(prev));*/

          //solution 2 unknown but less ALLOCATION

          Uint8Array bytes = new Uint8Array(fr.result.asArrayBuffer());
          List<Double> doubles = bytes.asList();
          byte[] out = byteBuf.get();
          int len = doubles.size();

          for (int i = 0; i < len; i++)//ok for overflow, v8 not crash as jvm
            out[i] = doubles.get(i).byteValue();
          listener.onMessage(_this, ByteBuffer.wrap(out, 0, len));
        }
        return null;
      };

      fr.readAsArrayBuffer((Blob) e.data);
      return null;
    };
  }

  @Override
  public void addListener(Listener listener) {
    this.listener = listener;
  }

  @Override
  public void send(ByteBuffer data) {
    double[] da = new double[data.array().length]; //alloc
    Uint8Array array = new Uint8Array(data.array().length); //loop
    for (int i = 0; i < data.array().length; i++) {
      da[i] = data.array()[i];
    }
    array.set(da);
    ws.send(array);
  }

  @Override
  public void send(String data) {
    if (ws != null)
      ws.send(data);
  }
}
