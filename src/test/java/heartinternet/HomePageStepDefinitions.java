package heartinternet;

import heartinternet.model.PricePackage;
import heartinternet.pricing.PriceListPageComponent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import heartinternet.navigation.NavigateActions;

import java.util.List;

public class HomePageStepDefinitions {
    @Steps
    NavigateActions navigate;

    @Given("Daniel is on the HeartInternet homepage")
    public void daniel_is_on_the_heart_internet_homepage() {
        navigate.toTheHomePage();
    }
//    List<PricePackage> visiblePricePackage;
//    PriceListPageComponent priceList;

    @When("he views the currently available packages")
    public void he_views_the_currently_available_packages() {
       // visiblePricePackage = priceList.currentOffers();

    }
    @Then("he should be presented with")
    public void he_should_be_presented_with(io.cucumber.datatable.DataTable dataTable) {

    }

}
