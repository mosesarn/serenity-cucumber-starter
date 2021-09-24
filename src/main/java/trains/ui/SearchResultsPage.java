package trains.ui;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchResultsPage {
    public static final Target SEARCH_RESULTS_HEADING = Target.the("search headline").located(By.className("hero-headline"));
}
