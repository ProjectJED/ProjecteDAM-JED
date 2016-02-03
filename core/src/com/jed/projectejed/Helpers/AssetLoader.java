package com.jed.projectejed.Helpers;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.utils.TiledDrawable;

public class AssetLoader {
    public static Texture img, floorimg, test;
    public static TiledDrawable floor;

    public static void load() {

        img = new Texture("badlogic.jpg");
        floorimg = new Texture("floor-tiles-20x20.png");
        floor = new TiledDrawable(new TextureRegion(floorimg, 260, 60, 20, 20));




    }


    public static void dispose(){
        img.dispose();
    }
}
