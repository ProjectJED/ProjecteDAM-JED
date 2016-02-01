package com.jed.projectejed.JEDGame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.loaders.AssetLoader;

public class JEDGame extends Game{
    @Override
    public void create() {
        Gdx.app.log("JEDGame", "created");
        //TODO Generate AssetLoader
        //AssetLoader.load();
        //TODO Generate First Screen
        //setScreen(new GameScreen());
    }

    @Override
    public void dispose() {
        super.dispose();
        //AssetLoader.dispose();
    }

}
