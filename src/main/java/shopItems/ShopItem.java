package shopItems;

public abstract class ShopItem implements ISell {

    private double priceBoughtAt;
    private double priceSellingFor;

    public ShopItem(double priceBoughtAt, double priceSellingFor) {
        this.priceBoughtAt = priceBoughtAt;
        this.priceSellingFor = priceSellingFor;
    }

    public double getPriceBoughtAt() {
        return priceBoughtAt;
    }

    public double getPriceSellingFor() {
        return priceSellingFor;
    }

    public void setPriceBoughtAt(double priceBoughtAt) {
        this.priceBoughtAt = priceBoughtAt;
    }

    public void setPriceSellingFor(double priceSellingFor) {
        this.priceSellingFor = priceSellingFor;
    }

    @Override
    public double calculateMarkup() {
        return this.priceSellingFor - this.priceBoughtAt ;
    }
}
