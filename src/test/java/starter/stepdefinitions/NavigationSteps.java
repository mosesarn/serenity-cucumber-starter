package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;
import starter.navigation.Navigate;

public class NavigationSteps {

    @Given("{actor} is on the homepage")
    public void trudy_is_on_the_homepage(Actor actor) {
       actor.attemptsTo(
               Navigate.toTheHomePage()
                      );
    }
}
