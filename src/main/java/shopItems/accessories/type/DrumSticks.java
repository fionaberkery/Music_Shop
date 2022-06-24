package shopItems.accessories.type;
import shopItems.accessories.Accessories;

public class DrumSticks extends Accessories {

    private StickLength stickLength;
    private String colour;

    public DrumSticks(String name, StickLength stickLength, String colour, double priceBoughtAt, double priceSellingFor) {
        super(name, priceBoughtAt, priceSellingFor);
        this.stickLength = stickLength;
        this.colour = colour;
    }

    public StickLength getStickLength() {
        return stickLength;
    }

    public String getColour() {
        return colour;
    }
}
