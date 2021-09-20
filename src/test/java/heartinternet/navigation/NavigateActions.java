package heartinternet.navigation;

import net.serenitybdd.core.steps.UIInteractionSteps;

public class NavigateActions extends UIInteractionSteps {
    public void toTheHomePage() {
        //openUrl("https://heartinternet.uk");
        openPageNamed("home");
    }
}
