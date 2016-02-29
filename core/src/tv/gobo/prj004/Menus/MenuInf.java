package tv.gobo.prj004.Menus;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import tv.gobo.prj004.Screens.Clinica;
import tv.gobo.prj004.Screens.Estudios;
import tv.gobo.prj004.Screens.Inicio;
import tv.gobo.prj004.Utils.Globales;
import tv.gobo.prj004.Utils.ScreenManager;

/**
 * Created by Carlos Santos Mateo // GOBO.TV on 26/02/2016.
 */
public class MenuInf extends Stage {

    private static TextButton inicio, estudios, about, clinica;
    public static Table tabla;


    private static MenuInf instance;

    private MenuInf() {
        super();
    }

    public static MenuInf getInstance() {
        if (instance == null) {
            instance = new MenuInf();

        }


        return instance;
    }

    public Table tabla() {

        tabla = new Table();
        tabla.setWidth(Gdx.graphics.getWidth());
        tabla.setHeight(45 * Globales.dpi);

        if (Globales.tipoPantalla == 0) {
            tabla.setPosition(0, -45 * Globales.dpi);
        } else {
            tabla.setPosition(0, 0);
        }

        inicio = new TextButton("Inicio", Globales.skin);
        estudios = new TextButton("Estudios", Globales.skin);
        about = new TextButton("About", Globales.skin);
        clinica = new TextButton("Clínica", Globales.skin);

        tabla.add(inicio).expand().fill();
        tabla.add(estudios).expand().fill();
        tabla.add(about).expand().fill();
        tabla.add(clinica).expand().fill();

        tabla.debug();

        clinica.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                ScreenManager.getInstance().showScreen(new Clinica());
            }
        });

        inicio.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                ScreenManager.getInstance().showScreen(new Inicio());
            }
        });

        estudios.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                ScreenManager.getInstance().showScreen(new Estudios());
            }
        });


        about.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                ScreenManager.getInstance().showScreen(new Inicio());
            }
        });

        return tabla;
    }


}
