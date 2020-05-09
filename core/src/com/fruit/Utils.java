package com.fruit;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;

public class Utils {
  public static BitmapFont genBitmapFont(int size, int space, boolean haveBorder, Color color, Color borderColor, float borderWidth) {
    FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("go3v2.ttf"));
    FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
    parameter.characters = FreeTypeFontGenerator.DEFAULT_CHARS + "ưừứ";
    parameter.size = size;
    parameter.spaceX = space;
    parameter.genMipMaps = true;
    parameter.minFilter = Texture.TextureFilter.MipMapLinearNearest;
    parameter.magFilter = Texture.TextureFilter.Linear;
    parameter.borderStraight = haveBorder;
    parameter.borderColor = borderColor;
    parameter.color = color;
    parameter.borderWidth = borderWidth;
    BitmapFont output =  generator.generateFont(parameter); // font size 12 pixels
    generator.dispose();
    return output;
  }
}
