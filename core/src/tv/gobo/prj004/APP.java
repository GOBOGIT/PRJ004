package tv.gobo.prj004;


import com.badlogic.gdx.Game;
import tv.gobo.prj004.Screens.Inicio;
import tv.gobo.prj004.Utils.ScreenManager;

public class APP extends Game {


    @Override
    public void create() {

        //MenuInf.getInstance().initialize(this);
        // es singlenton, se ejcuta una única vez


        ScreenManager.getInstance().initialize(this);

        ScreenManager.getInstance().showScreen(new Inicio());

    }


}
