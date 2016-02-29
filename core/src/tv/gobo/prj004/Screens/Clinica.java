package tv.gobo.prj004.Screens;

import com.badlogic.gdx.scenes.scene2d.Stage;
import tv.gobo.prj004.Menus.MenuInf;
import tv.gobo.prj004.Utils.AbstractScreen;
import tv.gobo.prj004.Utils.Globales;

/**
 * Created by Carlos Santos Mateo // GOBO.TV on 26/02/2016.
 */
public class Clinica extends AbstractScreen {

    Stage stageClinica;

    public Clinica() {
        super();
        Globales.tipoPantalla = 1;
    }

    @Override
    public void buildStage() {


        stageClinica = new Stage();
        Globales.stage = stageClinica;
        stageClinica.addActor(MenuInf.getInstance().tabla());
    }

    @Override
    public void dispose() {
        super.dispose();
        stageClinica.dispose();
    }
}
