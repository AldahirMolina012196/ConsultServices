package co.com.testing.evaluation.choucairservices.stepdefinitions;

import co.com.testing.evaluation.choucairservices.questions.VerifySectionServicesQuestion;
import co.com.testing.evaluation.choucairservices.questions.VerifyTitleDigitalQuestion;
import co.com.testing.evaluation.choucairservices.questions.VerifyTitleSectionQuestion;
import co.com.testing.evaluation.choucairservices.tasks.ToDigitalPerformance;
import co.com.testing.evaluation.choucairservices.tasks.ToServices;
import co.com.testing.evaluation.choucairservices.userinterfaces.PrincipalComponent;
import co.com.testing.evaluation.choucairservices.userinterfaces.ServicesPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;

import org.hamcrest.Matchers;
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

    @When("^Advance to Services$")
    public void advanceToServices() {
        OnStage.theActorInTheSpotlight().attemptsTo(ToServices.goToServices());
    }

    @Then("^Verify the existence section Services$")
    public void verifyTheExistenceSectionServices() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifySectionServicesQuestion.comparedServices()));
    }

    @When("^The capabilities icon is selected (.*)$")
    public void theCapabilitiesIconIsSelected(String number) {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ServicesPage.ICON.of(number)));
    }


    @Then("^Verify title section capabilities number (.*) and (.*)$")
    public void verifyTitleSectionCapabilitiesCapacidadesDePruebasDeSoftwareCentradasEnElNegocio(String number, String title) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyTitleSectionQuestion.comparedTitle(number), Matchers.containsString(title)));
    }

    @When("^The section of how we do it is selected (.*)$")
    public void theSectionOfHowWeDoItIsSelected(String number) {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ServicesPage.ICON.of(number)));
    }

    @Then("^Verify title section how we do it number (.*) and (.*)$")
    public void verifyTitleSectionHowWeDoItCmoLoHacemos(String number, String title) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyTitleSectionQuestion.comparedTitle(number), Matchers.containsString(title)));
    }

    @When("^Solutions portfolio is selected (.*)$")
    public void solutionsPortfolioIsSelected(String number) {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ServicesPage.ICON.of(number)));
    }


    @Then("^Verify title section Portfolio of solutions number (.*) and (.*)$")
    public void verifyTitleSectionPortfolioOfSolutionsNumberAndPortafolioDeSoluciones(String number, String title) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyTitleSectionQuestion.comparedTitle(number), Matchers.containsString(title)));
    }

    @When("^Digital performance is select$")
    public void digitalPerformanceIsSelect() {
        OnStage.theActorInTheSpotlight().attemptsTo(ToDigitalPerformance.performanceMonitoring());
    }


    @Then("^Verify title section priority (.*)$")
    public void verifyTitleSectionPriorityDigitalPerformanceMonitoring(String title) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyTitleDigitalQuestion.digitalPerformanceTitle(), Matchers.containsString(title)));
    }


}
