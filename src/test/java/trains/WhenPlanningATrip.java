package trains;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

@RunWith(SerenityRunner.class)
public class WhenPlanningATrip {
    Actor moses = Actor.named("Moses");
    @Managed
    WebDriver browser;


    @Test
    public void the_tfl_page_title_should_be_visible(){
        moses.can(BrowseTheWeb.with(browser));
        moses.attemptsTo(Open.url("https://tfl.gov.uk/"));
        moses.should(seeThat(TheWebPage.title(),containsString("Transport for London")));
    }
    @Test
    public void the_tfl_overground_status_page_title_should_be_visible(){
        moses.can(BrowseTheWeb.with(browser));
        moses.attemptsTo(Open.url("https://tfl.gov.uk/tube-dlr-overground/status/"));
        moses.should(seeThat(TheWebPage.title(),containsString("status updates")));
    }
    }

