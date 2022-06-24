package shopItems.instruments.type;
import shopItems.instruments.Instrument;
import shopItems.instruments.InstrumentType;

public class Guitar extends Instrument {

    GuitarType guitarType;
    private boolean strapIncluded;

    public Guitar(GuitarType guitarType, InstrumentType instrumentType, String description, boolean strapIncluded, boolean availableOnFinance, double priceBoughtAt, double priceSellingFor) {
        super(instrumentType, description, availableOnFinance, priceBoughtAt, priceSellingFor);
        this.guitarType = guitarType;
        this.strapIncluded = strapIncluded;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public boolean isStrapIncluded() {
        return strapIncluded;
    }

    @Override
    public String play() {
        return super.play() + "wowowowow";
    }
}
