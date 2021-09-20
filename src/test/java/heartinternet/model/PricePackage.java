package heartinternet.model;

public class PricePackage {
    private final String name;
    private final String price;

    public PricePackage(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
}
