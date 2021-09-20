package heartinternet.pricing;

import heartinternet.model.PricePackage;
import net.serenitybdd.core.pages.PageObject;

import java.util.List;
import java.util.stream.Collectors;

public class PriceListPageComponent extends PageObject {
    public List<PricePackage> currentOffers() {
        List<String> prices = $$("//price").texts();
        return prices.stream().map(price -> new PricePackage("",price)).collect(Collectors.toList());
    }
}
