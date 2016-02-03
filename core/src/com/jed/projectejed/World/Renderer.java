package com.jed.projectejed.World;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.jed.projectejed.Helpers.AssetLoader;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.jed.projectejed.Screens.MenuScreen;


public class Renderer {
    private SpriteBatch batch;
    private int gameHeight, gameWidth;
    public Renderer(int gameHeight, int midPointY, int gameWidth) {
        batch = new SpriteBatch();
        this.gameHeight = gameHeight;
        this.gameWidth = gameWidth;
    }

    public void render() {


        //img badlogic
        batch.begin();
        AssetLoader.floor.draw(batch, 0, 0, 640, 480);
        batch.end();
    }
}
