package tv.gobo.prj004.Utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.utils.viewport.StretchViewport;

/**
 * Created by Carlos Santos Mateo // GOBO.TV on 26/02/2016.
 */
public class Globales {
    public static Stage stage = new Stage(new StretchViewport(Gdx.graphics.getWidth(), Gdx.graphics.getHeight()));
    public static final Skin skin = new Skin(Gdx.files.internal("skin/uiskin.json"));
    public static int tipoPantalla;
    public static float dpi = Math.round(Gdx.graphics.getDensity());
}
