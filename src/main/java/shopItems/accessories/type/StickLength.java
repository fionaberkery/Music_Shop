package shopItems.accessories.type;

public enum StickLength {

    NUMBER_1("16.75-17.25 inches"),
    NUMBER_2("16.00-16.50 inches"),
    NUMBER_3("15.50-17.00 inches");

    private final String lengthInInches;

    StickLength(String lengthInInches) {
        this.lengthInInches = lengthInInches;
    }

    public String getInches() {
        return this.lengthInInches;
    }
}
