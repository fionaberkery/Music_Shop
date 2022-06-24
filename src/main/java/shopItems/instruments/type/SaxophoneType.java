package shopItems.instruments.type;

public enum SaxophoneType {

    SOPRANO("Ab3 to E6"),
    ALTO("Db3 to Ab5"),
    TENOR("Ab2 to E5"),
    BARITONE("E");

    private final String saxPitch;

    SaxophoneType(String saxPitch) {
        this.saxPitch = saxPitch;
    }

    public String getSaxPitch() {
        return saxPitch;
    }

}
