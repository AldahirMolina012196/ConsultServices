package co.com.testing.evaluation.choucairservices.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CourseProgramingPage {
    public static final Target ICON_QUESTIONS = Target.the("Select button question").locatedBy("(//h3[@class='elementor-image-box-title'])[3]");
    public static final Target SELECT_LIST = Target.the("Select list of courses").locatedBy("(//div[@class='lp-form-field']/select[@class='lp-form-fieldInput select'])[1]");
    public static final Target LIST_COURSES = Target.the("Select course for consult").locatedBy("//option[@value='704240008']");
    public static final Target INPUT_NAME = Target.the("Add name in the input name").locatedBy("(//input[@class='lp-form-fieldInput'])[1]");
    public static final Target INPUT_LAST_NAME = Target.the("Add lastname in the input lastname").locatedBy("(//input[@class='lp-form-fieldInput'])[2]");
    public static final Target INPUT_CITY = Target.the("Add city in the input city").locatedBy("//input[@class='lp-form-fieldInput celular']");
    public static final Target INPUT_NUMBER_PHONE = Target.the("Add number phone in the input").locatedBy("(//input[@class='lp-form-fieldInput'])[3]");
    public static final Target INPUT_EMAIL = Target.the("Add number phone in the input").locatedBy("//input[@placeholder='Correo electrónico']");
    public static final Target INPUT_BUSINESS = Target.the("Add businnes in the input").locatedBy("//input[@placeholder='Empresa']");
    public static final Target INPUT_MESSAGE = Target.the("Add description message in the input").locatedBy("//textarea[@placeholder='Mensaje']");
    public static final Target BUTTON_SEND = Target.the("Select button send").locatedBy("//button[contains(text(),'Enviar')]");
}
