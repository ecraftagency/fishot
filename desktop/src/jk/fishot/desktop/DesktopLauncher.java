package jk.fishot.desktop;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.fruit.FruitGame;

import jk.fishot.Fishot;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		//new LwjglApplication(new Fishot(new DesktopWebsocket(), Application.ApplicationType.Desktop), config);
		config.width = 1026;
		config.height = 576;
		new LwjglApplication(new FruitGame(), config);
	}
}
