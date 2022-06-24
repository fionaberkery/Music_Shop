package shopItems.instruments.type;
import shopItems.instruments.Instrument;
import shopItems.instruments.InstrumentType;

public class Sax extends Instrument {

    SaxophoneType saxophoneType;
    private boolean mouthpieceIncluded;

    public Sax(InstrumentType instrumentType, SaxophoneType saxophoneType, String description, boolean mouthpieceIncluded, boolean availableOnFinance, double priceBoughtAt, double priceSellingFor) {
        super(instrumentType, description, availableOnFinance, priceBoughtAt, priceSellingFor);
        this.saxophoneType = saxophoneType;
        this.mouthpieceIncluded = mouthpieceIncluded;
    }

    public SaxophoneType getSaxophoneType() {
        return saxophoneType;
    }

    public boolean isMouthpieceIncluded() {
        return mouthpieceIncluded;
    }

    @Override
    public String play() {
        return super.play() + "toot toot";
    }
}
