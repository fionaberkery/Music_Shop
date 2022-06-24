package shopItems.instruments.type;
import shopItems.instruments.Instrument;
import shopItems.instruments.InstrumentType;

public class Flute extends Instrument {

    FluteBrand fluteBrand;

    public Flute(InstrumentType instrumentType, String description, FluteBrand fluteBrand, boolean availableOnFinance, double priceBoughtAt, double priceSellingFor) {
        super(instrumentType, description, availableOnFinance, priceBoughtAt, priceSellingFor);
        this.fluteBrand = fluteBrand;
    }

    public FluteBrand getFluteBrand() {
        return fluteBrand;
    }

    @Override
    public String play() {
        return super.play() + "flutter flutter";
    }
}
