package com.jed.projectejed.World;

import com.jed.projectejed.Helpers.AssetLoader;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class Renderer {
    private SpriteBatch batch;

    public Renderer(int gameHeight, int midPointY) {
        batch = new SpriteBatch();
    }

    public void render() {
        //background color
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        //img badlogic
        batch.begin();
        batch.draw(AssetLoader.img, 0, 0);
        batch.end();
    }
}
