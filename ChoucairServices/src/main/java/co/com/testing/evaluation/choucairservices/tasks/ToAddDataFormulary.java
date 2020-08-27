package co.com.testing.evaluation.choucairservices.tasks;

import co.com.testing.evaluation.choucairservices.models.DataUser;
import co.com.testing.evaluation.choucairservices.userinterfaces.ServicesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ToAddDataFormulary  implements Task {
    private DataUser user;

    public ToAddDataFormulary(DataUser user) {
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ServicesPage.ICON.of("19")),
                Click.on(ServicesPage.BUTTON_COURSES)

        );
    }

    public static ToAddDataFormulary addData(DataUser user){
        return new ToAddDataFormulary(user);
    }

}
