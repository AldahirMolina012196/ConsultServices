package co.com.testing.evaluation.choucairservices.questions;

import co.com.testing.evaluation.choucairservices.userinterfaces.DigitalPerformancePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerifyTitleDigitalQuestion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(DigitalPerformancePage.TITLE_PRINCIPAL).viewedBy(actor).asString();
    }

    public static VerifyTitleDigitalQuestion digitalPerformanceTitle(){
        return new VerifyTitleDigitalQuestion();
    }
}
