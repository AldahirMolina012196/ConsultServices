package co.com.testing.evaluation.choucairservices.questions;

import co.com.testing.evaluation.choucairservices.userinterfaces.PrincipalComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class VerifySectionServicesQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(PrincipalComponent.SERVICES).viewedBy(actor).asBoolean();
    }

    public static VerifySectionServicesQuestion comparedServices(){
        return new VerifySectionServicesQuestion();
    }
}
