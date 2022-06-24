package shopItems.accessories;
import shopItems.ShopItem;

public class Accessories extends ShopItem {

    private String name;

    public Accessories(String name, double priceBoughtAt, double priceSellingFor) {
        super(priceBoughtAt, priceSellingFor);
        this.name = name;
    }

    public String getName() {
        return name;
    }

}


