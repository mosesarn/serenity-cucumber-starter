package trains.ui;

import net.serenitybdd.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CookiesDialog extends PageObject {

    public static final Target ACCEPT_ALL_COOKIES = Target.the("Accept All Cookies Button").locatedBy(".cb-button.cb-right");
    public static final Target DONE = Target.the("Accept All Cookies Button").locatedBy("//strong [contains(.,'Done')]");
}
