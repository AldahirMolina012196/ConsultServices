package co.com.testing.evaluation.choucairservices.questions;

import co.com.testing.evaluation.choucairservices.userinterfaces.ServicesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerifyTitleSectionQuestion implements Question<String>{
    private String number;

    public VerifyTitleSectionQuestion(String number) {
        this.number = number;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ServicesPage.TITLE.of(number)).viewedBy(actor).asString();
    }

    public static VerifyTitleSectionQuestion comparedTitle(String number){
        return new VerifyTitleSectionQuestion(number);
    }
}
