package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenplaySupport {
    @Before
    public void setTheStage(){
        Cast castOfActors = new OnlineCast();
        OnStage.setTheStage(castOfActors);
    }
    @ParameterType(".*")
    public Actor actor(String actorName){
//        WebDriver webDriver = new ChromeDriver();
//        Actor actor = Actor.named(actorName);
//        actor.can(BrowseTheWeb.with(webDriver));
//        return actor;
        return OnStage.theActorCalled(actorName); //this will do all the above three lines.

    }

}
