package co.com.testing.evaluation.choucairservices.tasks;

import co.com.testing.evaluation.choucairservices.userinterfaces.ServicesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ToDigitalPerformance implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ServicesPage.ICON.of("3")),
                Click.on(ServicesPage.ICON.of("4")),
                Click.on(ServicesPage.BUTTON_KNOW_MORE)
        );
    }

    public static ToDigitalPerformance performanceMonitoring(){
        return new ToDigitalPerformance();
    }
}
