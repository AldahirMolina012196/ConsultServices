package co.com.testing.evaluation.choucairservices.tasks;

import co.com.testing.evaluation.choucairservices.userinterfaces.AcceptCookiesComponent;
import co.com.testing.evaluation.choucairservices.userinterfaces.PrincipalComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ToServices implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AcceptCookiesComponent.BUTTON_ACCEPT),
                Click.on(PrincipalComponent.SERVICES)
        );
    }
    public static ToServices goToServices(){
        return new ToServices();
    }
}
