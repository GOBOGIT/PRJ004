package tv.gobo.prj004.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import tv.gobo.prj004.Menus.MenuInf;
import tv.gobo.prj004.Utils.AbstractScreen;
import tv.gobo.prj004.Utils.Globales;
import tv.gobo.prj004.Utils.ScreenManager;

/**
 * Created by Carlos Santos Mateo // GOBO.TV on 24/02/2016.
 */
public class Inicio extends AbstractScreen {

    Stage stageInicio;
    TextButton botonInicio;

    public Inicio() {
        super();
        Globales.tipoPantalla = 0;


    }

    @Override
    public void buildStage() {
        stageInicio = new Stage();
        Globales.stage = stageInicio;

        botonInicio = new TextButton("iniciar", Globales.skin);
        botonInicio.setWidth(200);
        botonInicio.setHeight(50);


        botonInicio.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                ScreenManager.getInstance().showScreen(new Clinica());
            }
        });
        botonInicio.setPosition(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2);
        stageInicio.addActor(botonInicio);
        stageInicio.addActor(MenuInf.getInstance().tabla());
    }

    @Override
    public void dispose() {
        super.dispose();
        stageInicio.dispose();
    }
}
