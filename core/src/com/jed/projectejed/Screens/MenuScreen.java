package com.jed.projectejed.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.jed.projectejed.World.GameWorld;
import com.jed.projectejed.World.Renderer;


public class MenuScreen implements Screen {
    Renderer renderer;
    GameWorld world;
    public MenuScreen() {

        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        float gameWidth = 136;
        float gameHeight = screenHeight / (screenWidth / gameWidth);
        int midPointY = (int) (gameHeight / 2);

        world = new GameWorld();
        renderer = new Renderer((int) gameHeight, midPointY, (int) gameWidth);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

        world.update(delta);
        renderer.render();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
