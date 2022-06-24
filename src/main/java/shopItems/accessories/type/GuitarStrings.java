package shopItems.accessories.type;
import shopItems.accessories.Accessories;

public class GuitarStrings extends Accessories {

    private StringType stringType;

    public GuitarStrings(String name, StringType stringType, double priceBoughtAt, double priceSellingFor) {
        super(name, priceBoughtAt, priceSellingFor);
        this.stringType = stringType;
    }

    public StringType getStringType() {
        return this.stringType;
    }
}
