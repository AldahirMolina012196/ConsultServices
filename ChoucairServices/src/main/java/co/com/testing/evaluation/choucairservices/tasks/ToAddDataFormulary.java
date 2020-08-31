package co.com.testing.evaluation.choucairservices.tasks;

import co.com.testing.evaluation.choucairservices.interactions.WaitMoment;
import co.com.testing.evaluation.choucairservices.models.DataUser;

import co.com.testing.evaluation.choucairservices.userinterfaces.CourseProgramingPage;
import co.com.testing.evaluation.choucairservices.userinterfaces.ServicesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ToAddDataFormulary  implements Task {
    private DataUser user;

    public ToAddDataFormulary(DataUser user) {
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ServicesPage.ICON.of("19")),
                Click.on(ServicesPage.BUTTON_COURSES),
                Click.on(CourseProgramingPage.ICON_QUESTIONS),
                WaitMoment.just(5000),
                Click.on(CourseProgramingPage.SELECT_LIST),
                Click.on(CourseProgramingPage.LIST_COURSES),
                Click.on(CourseProgramingPage.INPUT_NAME),
                Enter.keyValues(user.getName()).into(CourseProgramingPage.INPUT_NAME),
                Enter.theValue(user.getLastName()).into(CourseProgramingPage.INPUT_LAST_NAME),
                Enter.theValue(user.getCity()).into(CourseProgramingPage.INPUT_CITY),
                Enter.theValue(user.getNumberPhone()).into(CourseProgramingPage.INPUT_NUMBER_PHONE),
                Enter.theValue(user.getEmail()).into(CourseProgramingPage.INPUT_EMAIL),
                Enter.theValue(user.getBusiness()).into(CourseProgramingPage.INPUT_BUSINESS),
                Enter.theValue(user.getMessage()).into(CourseProgramingPage.INPUT_MESSAGE),
                Click.on(CourseProgramingPage.BUTTON_SEND)
        );
    }

    public static ToAddDataFormulary addData(DataUser user){
        return new ToAddDataFormulary(user);
    }
}
