package jk.fishot;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.utils.Timer;

import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.protostuff.Message;
import jk.fishot.codec.Codec;
import jk.fishot.common.Global;
import jk.fishot.common.Websocket;
import jk.fishot.generator.BinaryMessage;
import jk.fishot.generator.PMG;
import jk.fishot.generator.SMG;
import proto.message.ArchiveCollectionResponse;
import proto.message.BetCase;
import proto.message.GetUserMoneyResponse;
import proto.message.H3TurnResponse;
import proto.message.LoginResponse;
import proto.message.PingTestResponse;
import proto.message.ProfileMessage;
import proto.message.SystemMessage;

public class Fishot extends ApplicationAdapter {
	public Fishot(Websocket ws, Application.ApplicationType platform) {
		this.ws = ws;
		Global.platform = platform;
	}

	private Websocket ws;
	private SpriteBatch batch;
	private BitmapFont font12;
	private Timer runner;
	private int sendC = 0;
	private int revC = 0;
	@Override
	public void create () {
		batch = new SpriteBatch();
		runner = new Timer();
		final Fishot _this = this;
		ws.addListener(new Websocket.Listener() {
			@Override
			public void onOpen(Websocket socket) {
				Gdx.app.error("ws", "connection established");
				socket.send(Codec.encode(SMG.loginRequest("0", "")));
				//socket.send(Codec.encode(SMG.pingTestRequest(12)));
			}

			@Override
			public void onCLose() {
				Gdx.app.error("ws", "connection close");
			}

			@Override
			public void onMessage(Websocket socket, ByteBuffer data) {
				//Gdx.app.error("WS", "Incomming Message");
				try {
					Message resp = Codec.decode(data);
					if (resp instanceof SystemMessage) {
						SystemMessage sys = (SystemMessage)resp;
						switch (sys.getCommandValue()) {
							case 2://login
								LoginResponse lr = sys.getMsgLoginResponse();
								Gdx.app.error("Thế Giới Cá", lr.getNotifyMsg());
								socket.send(Codec.encode(PMG.archiveColectRequest()));
								socket.send(Codec.encode(PMG.claimAdsRewadRequest()));
								runner.scheduleTask(new Timer.Task() {
									@Override
									public void run() {
										ws.send(Codec.encode(PMG.archiveColectRequest()));
										_this.sendC++;

									}
								}, 1, 0.1f);


								sendH3Bet(socket);
								break;
							case 25: //ping test
								PingTestResponse ptr = sys.getMsgPingTestResponse();
								Gdx.app.error("Thế Giới Cá", ptr.getId() + "");
							default:
								break;
						}
					}
					else if (resp instanceof ProfileMessage) {
						ProfileMessage pro = (ProfileMessage)resp;
						switch (pro.getCommandValue()) {
							case 119://archive
								ArchiveCollectionResponse acr = pro.getMsgArchiveCollectionResponse();
								//Gdx.app.error("Thế Giới Cá" ,acr.getEndDate());
								_this.revC++;
								break;
							case 2: //get user money resp
								GetUserMoneyResponse umr = pro.getMsgGetUserMoneyResponse();
								Gdx.app.error("Thế Giới Cá", umr.getGold1() + " " + umr.getGold2() + " " + umr.getGold3());
								break;
							case 128: //h3TurnResponse
								H3TurnResponse htr = pro.getMsgH3TurnResponse();
								for (BetCase bc : htr.getResCasesList()) {
									System.out.print(cases.get(bc.getCases()) + " ");
								}
								Gdx.app.error("Tiền còn lại", htr.getGold() + "");
								break;
							default:
								break;
						}
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			@Override
			public void onMessage(Websocket socket, String data) {
			}

			@Override
			public void onError() {

			}
		});


		try {
			//ws.connect("ws://127.0.0.1:8887/websocket");
			ws.connect("ws://128.199.191.93:8080/websocket");
			//ws.connect("ws://192.168.1.4:8887/websocket");
		} catch (Exception e) {
			e.printStackTrace();
		}

		FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("opensans.ttf"));
		FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
		parameter.size = 48;
		parameter.spaceX = 1;
		parameter.genMipMaps = true;
		parameter.minFilter = Texture.TextureFilter.MipMapLinearNearest;
		parameter.magFilter = Texture.TextureFilter.Linear;
		font12 = generator.generateFont(parameter); // font size 12 pixels
		generator.dispose(); // don't forget to dispose to avoid memory leaks!
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		font12.draw(batch, "send count: " + sendC, 200, 200);
		font12.draw(batch, "rev count: " + revC, 200, 400);
		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
	}

	public static HashMap<Integer, String> cases = new HashMap<>();
	static {
		cases.put(0, "BẦU");
		cases.put(1, "CUA");
		cases.put(2, "TÔM");
		cases.put(3, "CÁ");
		cases.put(4, "GÀ");
		cases.put(5, "NAI");
	}


	public static void sendH3Bet(Websocket socket) {
		List<Map.Entry<Integer, Integer>> bet = Arrays.asList(
						new AbstractMap.SimpleEntry<>(0, 0), //bau
						new AbstractMap.SimpleEntry<>(1, 0), //cua
						new AbstractMap.SimpleEntry<>(2, 0), //tom
						new AbstractMap.SimpleEntry<>(3, 0), //ca
						new AbstractMap.SimpleEntry<>(4, 0), //ga
						new AbstractMap.SimpleEntry<>(5, 0) //nai
		);
		int b1 = 1000;
		int b2 = 100;
		int b3 = 100;
		int c1 = 0;
		int c2 = 1;
		int c3 = 2;
		bet.get(c1).setValue(b1);
		bet.get(c2).setValue(b2);
		bet.get(c3).setValue(b3);
		for (Map.Entry<Integer, Integer> entry : bet) {
			System.out.println("Đặt " + cases.get(entry.getKey()) + " " + entry.getValue() + " Xu");
		}
		BinaryMessage msg = PMG.h3TurnRequest(bet);
		socket.send(Codec.encode(msg));
	}
}
