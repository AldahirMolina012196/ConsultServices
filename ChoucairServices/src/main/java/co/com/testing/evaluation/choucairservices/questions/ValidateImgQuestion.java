package co.com.testing.evaluation.choucairservices.questions;

import co.com.testing.evaluation.choucairservices.userinterfaces.ServicesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ValidateImgQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(ServicesPage.IMG_AUTOMATION).viewedBy(actor).asBoolean();
    }

    public static ValidateImgQuestion imgExistence(){
        return new ValidateImgQuestion();
    }
}
