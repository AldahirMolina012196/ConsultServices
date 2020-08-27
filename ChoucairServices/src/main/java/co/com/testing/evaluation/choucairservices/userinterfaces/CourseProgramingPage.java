package co.com.testing.evaluation.choucairservices.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CourseProgramingPage {
    public static final Target LIST_COURSES = Target.the("Select course for consult").locatedBy("//option[@value='704240008']");
    public static final Target INPUT_NAME = Target.the("Add name in input name").locatedBy("(//input[@class='lp-form-fieldInput'])[1]");
    public static final Target INPUT_LAST_NAME = Target.the("Add lastname in input lastname").locatedBy("(//input[@class='lp-form-fieldInput'])[2]");
    public static final Target INPUT_CITY = Target.the("Add city in input city").locatedBy("//input[@class='lp-form-fieldInput celular']");
    
}
