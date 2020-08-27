package co.com.testing.evaluation.choucairservices.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ServicesPage {
    public static final Target  ICON = Target.the("select icon for consult").locatedBy("(//h3[@class='elementor-image-box-title'])[{0}]");
    public static final Target TITLE = Target.the("Title compared").locatedBy("(//h2[@class='elementor-heading-title elementor-size-large'])[{0}]");
    public static final Target BUTTON_KNOW_MORE = Target.the("Button know more about digital performance monitoring").locatedBy("(//span[@class='elementor-button-content-wrapper'])[1]");
    public static final Target BUTTON_COURSES = Target.the("Button courses and certifications").locatedBy("(//span[@class='elementor-button-content-wrapper'])[2]");
}
