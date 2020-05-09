package jk.fishot.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.badlogic.gdx.graphics.g2d.freetype.gwt.FreetypeInjector;
import com.fruit.FruitGame;

import jk.fishot.Fishot;

public class HtmlLauncher extends GwtApplication {

        @Override
        public GwtApplicationConfiguration getConfig () {
                return new GwtApplicationConfiguration(1280, 720);
        }

        @Override
        public void onModuleLoad () {
                FreetypeInjector.inject(() -> {
                        // Replace HtmlLauncher with the class name
                        // If your class is called FooBar.java than the line should be FooBar.super.onModuleLoad();
                        HtmlLauncher.super.onModuleLoad();
                });
        }

        @Override
        public ApplicationListener createApplicationListener () {
                //return new Fishot(new GwtWebsocket(), ApplicationType.WebGL);
                return new FruitGame();

        }
}