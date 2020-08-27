package co.com.testing.evaluation.choucairservices.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class PrincipalComponent {
    public static final Target SERVICES = Target.the("Option services").locatedBy("(//a[contains(text(),'Servicios')])[1]");
}
