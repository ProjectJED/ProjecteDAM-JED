package com.jed.projectejed.JEDGame;

import com.jed.projectejed.Helpers.AssetLoader;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.jed.projectejed.Screens.MenuScreen;

public class JEDGame extends Game{
    @Override
    public void create() {
        Gdx.app.log("JEDGame", "created");
        AssetLoader.load();
        setScreen(new MenuScreen());
    }

    @Override
    public void dispose() {
        super.dispose();
        AssetLoader.dispose();
    }

}
