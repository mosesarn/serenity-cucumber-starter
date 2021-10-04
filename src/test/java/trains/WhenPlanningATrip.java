package trains;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import trains.ui.CookiesDialog;
import trains.ui.SearchResultsPage;
import trains.ui.TFLHomePage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SerenityRunner.class)
public class WhenPlanningATrip {
    Actor moses = Actor.named("Moses");
    @Managed
    WebDriver browser;
    @Before
    public void setTheStage(){
        moses.can(BrowseTheWeb.with(browser));
    }

    @Test
    public void the_tfl_page_title_should_be_visible(){
        moses.attemptsTo(Open.browserOn().the(TFLHomePage.class));
        moses.should(seeThat(TheWebPage.title(),containsString("Transport for London")));
    }
    @Test
    public void should_be_able_to_search_for_the_station_details(){
        moses.attemptsTo(Open.browserOn().the(TFLHomePage.class),
                Click.on(CookiesDialog.ACCEPT_ALL_COOKIES),
                Click.on(CookiesDialog.DONE),
                Enter.theValue("Waterloo").into(TFLHomePage.SEARCH).thenHit(Keys.ENTER)
                );
        moses.should(
                seeThat(
                        TheTarget.textOf(SearchResultsPage.SEARCH_RESULTS_HEADING), equalTo("Search: Waterloo")
                ));
    }
    @Test
    public void should_list_all_relavent_station_information(){
        moses.attemptsTo(Open.browserOn().the(TFLHomePage.class),
                Click.on(CookiesDialog.ACCEPT_ALL_COOKIES),
                Click.on(CookiesDialog.DONE),
                Enter.theValue("jubilee").into(TFLHomePage.SEARCH).thenHit(Keys.ENTER)
        );
        moses.should(
                seeThat(
                        Text.of(SearchResultsPage.FIRST_ARTICLE_HEADING).asAString(), containsString("Jubilee Greenway")
                ));
    }
    @Test
    public void the_tfl_overground_status_page_title_should_be_visible(){
        moses.attemptsTo(Open.url("https://tfl.gov.uk/tube-dlr-overground/status/"));
        moses.should(seeThat(TheWebPage.title(),containsString("status updates")));
    }
    }

