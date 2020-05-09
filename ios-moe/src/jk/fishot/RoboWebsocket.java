package jk.fishot;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;
import java.nio.ByteBuffer;

import jk.fishot.common.Websocket;

public class RoboWebsocket implements Websocket {
  private WebSocketClient ws;
  private Listener listener;
  @Override
  public void connect(String url) throws Exception {
    final RoboWebsocket _this = this;
    ws = new WebSocketClient(new URI(url)) {
      @Override
      public void onOpen(ServerHandshake handshakedata) {
        if (_this.listener != null)
          _this.listener.onOpen(_this);
      }

      @Override
      public void onMessage(String message) {
        if (_this.listener != null)
          _this.listener.onMessage(_this, message);
      }

      @Override
      public void onMessage(ByteBuffer bytes) {
        if (_this.listener != null)
          _this.listener.onMessage(_this, bytes);
      }

      @Override
      public void onClose(int code, String reason, boolean remote) {
        if (_this.listener != null)
          _this.listener.onCLose();
      }

      @Override
      public void onError(Exception ex) {

      }
    };

    ws.connect();
  }

  @Override
  public void addListener(Listener listener) {
    this.listener = listener;
  }

  @Override
  public void send(ByteBuffer data) {
    this.ws.send(data);
  }

  @Override
  public void send(String data) {
    this.ws.send(data);
  }
}
