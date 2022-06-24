package instruments;

import org.junit.Before;
import org.junit.Test;
import shopItems.instruments.InstrumentType;
import shopItems.instruments.type.Guitar;
import shopItems.instruments.type.GuitarType;

import static org.junit.Assert.*;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(GuitarType.ELECTRIC, InstrumentType.STRINGS, "Preowned Electric Guitar", false, true, 250.54, 399.99);
    }

    @Test
    public void canGetGuitarType(){
        assertEquals(GuitarType.ELECTRIC, guitar.getGuitarType());
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.STRINGS, guitar.getInstrumentType());
    }

    @Test
    public void canGetGuitarDescription(){
        assertEquals("Preowned Electric Guitar", guitar.getDescription());
    }

    @Test
    public void canFindOutIfStrapIncluded(){
        assertFalse(guitar.isStrapIncluded());
    }

    @Test
    public void isGuitarAvailableOnFinanceTRUE(){
        assertTrue(guitar.isItemAvailableOnFinance());
    }

    @Test
    public void canGetMarkUpValue(){
        assertEquals(149.45, guitar.calculateMarkup(), 0.01);
    }

    @Test
    public void canGetNumberOfStringsOnGuitar(){
        assertEquals(6, guitar.getGuitarType().getNumberOfStrings());
    }

    @Test
    public void canPlayGuitar(){
        assertEquals("Playing : wowowowow", guitar.play());
    }

}
