package shopItems.instruments.type;
import shopItems.instruments.Instrument;
import shopItems.instruments.InstrumentType;

public class Drum extends Instrument {

    private boolean drumCaseIncluded;


    public Drum(InstrumentType instrumentType, String description, boolean drumCaseIncluded, boolean availableOnFinance, double priceBoughtAt, double priceSellingFor) {
        super(instrumentType, description, availableOnFinance, priceBoughtAt, priceSellingFor);
        this.drumCaseIncluded = drumCaseIncluded;
    }

    public boolean isDrumCaseIncluded() {
        return drumCaseIncluded;
    }

    @Override
    public String play() {
        return super.play() + "bang bang";
    }
}
