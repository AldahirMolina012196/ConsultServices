package co.com.testing.evaluation.choucairservices.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;

import org.openqa.selenium.WebDriver;

public class ChoucairServicesStepDefinition {
    @Managed
    private WebDriver myDriver;
    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(myDriver));
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.choucairtesting.com/"));
    }
    @Given("^cuando pruebo$")
    public void cuandoPruebo() {

    }


    @Then("^llamo la tarea$")
    public void llamoLaTarea() {

    }

}
