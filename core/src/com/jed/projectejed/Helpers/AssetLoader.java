package com.jed.projectejed.Helpers;


import com.badlogic.gdx.graphics.Texture;

public class AssetLoader {
    public static Texture img;

    public static void load() {
        img = new Texture("badlogic.jpg");
    }


    public static void dispose(){
        img.dispose();
    }
}
