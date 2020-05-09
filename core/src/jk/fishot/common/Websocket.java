package jk.fishot.common;

import java.nio.ByteBuffer;

public interface Websocket {
  void connect(String url) throws Exception;
  void addListener(Listener listener);
  void send(ByteBuffer data);
  void send(String data);

  interface Listener {
    void onOpen(Websocket socket);
    void onCLose();
    void onMessage(Websocket socket, ByteBuffer data);
    void onMessage(Websocket socket, String data);
    void onError();
  }
}
