package instruments;

import org.junit.Before;
import org.junit.Test;
import shopItems.instruments.InstrumentType;
import shopItems.instruments.type.Drum;

import static org.junit.Assert.*;

public class DrumTest {

    Drum drum;

    @Before
    public void before(){
        drum = new Drum(InstrumentType.PERCUSSION,"Snare Drum", true, false,50.54, 82.99);
    }

    @Test
    public void canGetInstrumentDescription(){
        assertEquals("Snare Drum", drum.getDescription());
    }

    @Test
    public void canFindOutIfItemIsAvailableOnFinance(){
        assertFalse(drum.isItemAvailableOnFinance());
    }

    @Test
    public void canGetType(){
        assertEquals(InstrumentType.PERCUSSION, drum.getInstrumentType());
    }

    @Test
    public void canGetPriceSellingFor(){
        assertEquals(82.99, drum.getPriceSellingFor(), 0.01);
    }

    @Test
    public void canCheckIfCaseIncluded(){
        assertTrue(drum.isDrumCaseIncluded());
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(32.45, drum.calculateMarkup(), 0.01);
    }

    @Test
    public void canPlayDrum(){
        assertEquals("Playing : bang bang", drum.play());
    }

    @Test
    public void canChangeSellPrice(){
        drum.setPriceSellingFor(90.99);
        assertEquals(90.99, drum.getPriceSellingFor(), 0.01);
    }
}
