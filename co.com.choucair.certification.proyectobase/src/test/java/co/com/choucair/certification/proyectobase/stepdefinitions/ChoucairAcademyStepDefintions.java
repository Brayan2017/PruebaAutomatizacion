package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.questions.Validar;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefintions {

    @Before
    public void setStage(){OnStage.setTheStage(new OnlineCast());}

    @Given("^Than Brayan wants to learn automation at the academy Choucair$")
    public void thanBrayanWantsToLearnAutomationAtTheAcademyChoucair() {
        OnStage.theActorCalled("Brayan").wasAbleTo(OpenUp.thePage(),(Login.onThePage()));
    }

    @When("^he search for the course (.*) on the choucair academy plaform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlaform(String course) {
       OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));

    }

    @Then("^he finds the course called resources Recursos Automatizacion Bancolombia$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validar.mensajeError()));
    }
}
