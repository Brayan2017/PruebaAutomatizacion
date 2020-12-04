package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC=Target.the("Selecciona la universidad chocair")
            .located(By.xpath("//div[@id='universidad']//strong"));

    public static final Target INPUT_COURSE=Target.the("Buscar el curso")
            .located(By.id("coursesearchbox"));

    public static final Target BUTTON_GO=Target.the("da click para buscar el curso")
            .located(By.id("//button[@class='btn btn-secondary']"));

    public static final Target SELECT_COURSE=Target.the("Selecciona la universidad chocair")
            .located(By.xpath("//h4[contains(text(),'Recursos Automatización Bancolombia')]"));

    public static final Target MENSAJE_ERROR_COURSE=Target.the("Error de permisos")
            .located(By.xpath("p[text()='Usted no tiene permiso para ver esta lista de cursos.']"));

}

//p[text()='Usted no tiene permiso para ver esta lista de cursos.']