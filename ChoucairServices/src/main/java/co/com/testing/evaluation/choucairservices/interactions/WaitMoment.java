package co.com.testing.evaluation.choucairservices.interactions;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class WaitMoment implements Interaction {
    private int ms;

    public WaitMoment(int ms) {
        this.ms = ms;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor(ms);
    }

    public static WaitMoment just(int ms){
        return new WaitMoment(ms);
    }
}
