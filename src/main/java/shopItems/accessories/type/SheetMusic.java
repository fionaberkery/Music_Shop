package shopItems.accessories.type;
import shopItems.accessories.Accessories;
import shopItems.instruments.InstrumentType;

public class SheetMusic extends Accessories {

    InstrumentType instrumentType;
    Genre genre;
    private boolean digitalCopy;

    public SheetMusic(String name, InstrumentType instrumentType, Genre genre, boolean digitalCopy, double priceBoughtAt, double priceSellingFor) {
        super(name, priceBoughtAt, priceSellingFor);
        this.instrumentType = instrumentType;
        this.genre = genre;
        this.digitalCopy = digitalCopy;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public Genre getGenre() {
        return genre;
    }

    public boolean isDigitalCopy() {
        return digitalCopy;
    }
}
