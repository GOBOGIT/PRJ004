package tv.gobo.prj004.Utils;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;


/**
 * Created by Carlos Santos Mateo // GOBO.TV on 26/02/2016.
 */
public class ScreenManager {

    private Game game;

    // Singleton
    private static ScreenManager instance;

    private ScreenManager() {
        super();
    }

    public static ScreenManager getInstance() {
        if (instance == null)
            instance = new ScreenManager();

        return instance;
    }

    public void initialize(Game game) {
        this.game = game;
    }

    public void showScreen(AbstractScreen pantalla) {

        Screen pantallaActual = game.getScreen();

        pantalla.buildStage();

        System.out.println(pantalla);

        game.setScreen(pantalla);

        if (pantallaActual != null)
            pantallaActual.dispose();

    }

}
