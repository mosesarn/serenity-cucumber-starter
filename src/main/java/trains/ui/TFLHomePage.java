package trains.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://tfl.gov.uk/")
public class TFLHomePage extends PageObject {
    public static final Target SEARCH = Target.the("search field").located(By.id("q"));
}
