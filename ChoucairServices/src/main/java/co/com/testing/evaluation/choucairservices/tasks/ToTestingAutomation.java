package co.com.testing.evaluation.choucairservices.tasks;

import co.com.testing.evaluation.choucairservices.userinterfaces.ServicesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ToTestingAutomation implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ServicesPage.ICON.of("3")),
                Click.on(ServicesPage.ICON.of("13"))
        );
    }

    public static ToTestingAutomation testAutomation(){
        return new ToTestingAutomation();
    }
}
