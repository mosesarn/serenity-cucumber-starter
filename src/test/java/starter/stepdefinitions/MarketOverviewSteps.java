package starter.stepdefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.TextContent;
import tickers.TickerPanel;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MarketOverviewSteps {
    List<String> tickerNames;
    @When("{actor} consults the markets overview")
    public void consults_the_markets_overview(Actor actor) {

       //Question<List<String>> tickerNames = Text.of(".ticker-name").asAList();
           tickerNames =  actor.asksFor(TickerPanel.tickerNames());
    }
    @Then("she would see the summary data for:")
    public void she_would_see_the_summary_data_for(List<String> tickerItems) {
        assertThat(tickerNames).containsExactlyElementsOf(tickerItems);
    }

}
