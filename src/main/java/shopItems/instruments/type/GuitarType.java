package shopItems.instruments.type;

public enum GuitarType {

    ACOUSTIC(6),
    ELECTRIC(6),
    CLASSICAL(6),
    BASS(4);

    private final int numberOfStrings;

    GuitarType(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

}
