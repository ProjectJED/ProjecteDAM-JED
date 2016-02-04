package com.jed.projectejed.World;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.jed.projectejed.Helpers.AssetLoader;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.jed.projectejed.Screens.MenuScreen;


public class Renderer {
    private SpriteBatch batch;
    private int gameHeight, gameWidth;
    private OrthographicCamera cam;


    public Renderer(int gameHeight, int midPointY, int gameWidth) {
        batch = new SpriteBatch();
        this.gameHeight = gameHeight;
        this.gameWidth = gameWidth;
        cam = new OrthographicCamera();
        cam.setToOrtho(true, 136, gameHeight);
        batch.setProjectionMatrix(cam.combined);
    }

    public void render() {


        //img badlogic
        batch.begin();
        AssetLoader.floor.draw(batch, 0, 0, 640, 480);
        batch.end();
    }
}
