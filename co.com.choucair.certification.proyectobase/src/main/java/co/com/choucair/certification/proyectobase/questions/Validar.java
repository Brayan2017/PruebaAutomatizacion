package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Validar implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return SearchCoursePage.MENSAJE_ERROR_COURSE.resolveFor(actor).isVisible();
    }

    public static Validar mensajeError(){
        return new Validar();
    }
}
