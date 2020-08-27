package co.com.testing.evaluation.choucairservices.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src\\test\\resources\\features\\consult_services.feature",
        glue ="co.com.testing.evaluation.choucairservices.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        dryRun = false,
        tags="@Verify_Digital"
)
public class ChoucairServicesRunner {

}
