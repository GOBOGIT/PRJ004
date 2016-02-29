package tv.gobo.prj004.Utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.StretchViewport;

/**
 * Created by Carlos Santos Mateo // GOBO.TV on 26/02/2016.
 */
public abstract class AbstractScreen extends Stage implements Screen {

    protected AbstractScreen() {
        super(new StretchViewport(480, 800, new OrthographicCamera()));
    }

    public abstract void buildStage();

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        Globales.stage.act();
        Globales.stage.draw();

        super.act();
        super.draw();
    }

    @Override
    public void show() {
        Gdx.input.setInputProcessor(Globales.stage);
    }

    @Override
    public void resize(int width, int height) {
        getViewport().update(width, height, true);
    }

    @Override
    public void hide() {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void dispose() {
    }
}
