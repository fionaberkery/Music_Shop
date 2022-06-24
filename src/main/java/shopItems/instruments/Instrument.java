package shopItems.instruments;
import shopItems.ShopItem;

public class Instrument extends ShopItem implements IPlay{

    InstrumentType instrumentType;
    private String description;
    private boolean availableOnFinance;

    public Instrument(InstrumentType instrumentType, String description, boolean availableOnFinance, double priceBoughtAt, double priceSellingFor) {
        super(priceBoughtAt, priceSellingFor);
        this.instrumentType = instrumentType;
        this.description = description;
        this.availableOnFinance = availableOnFinance;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public String getDescription() {
        return description;
    }

    public boolean isItemAvailableOnFinance(){
        return this.availableOnFinance;
    }

    @Override
    public String play() {
        return "Playing : ";
    }
}
