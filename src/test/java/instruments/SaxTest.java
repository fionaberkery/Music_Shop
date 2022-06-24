package instruments;

import org.junit.Before;
import org.junit.Test;
import shopItems.instruments.InstrumentType;
import shopItems.instruments.type.Sax;
import shopItems.instruments.type.SaxophoneType;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SaxTest {

    Sax sax;

    @Before
    public void before(){
        sax = new Sax(InstrumentType.WOODWIND, SaxophoneType.TENOR, "Beginners Tenor Saxophone", true, false, 554.80, 1099.99);
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.WOODWIND, sax.getInstrumentType());
    }

    @Test
    public void canGetSaxophoneType(){
        assertEquals(SaxophoneType.TENOR, sax.getSaxophoneType());
    }

    @Test
    public void canGetSaxophonePitchRange(){
        assertEquals("Ab2 to E5", sax.getSaxophoneType().getSaxPitch());
    }

    @Test
    public void isMouthPieceIncludedTRUE(){
        assertTrue(sax.isMouthpieceIncluded());
    }

    @Test
    public void canChangeSellingPrice(){
        sax.setPriceSellingFor(2020.99);
        assertEquals(2020.99, sax.getPriceSellingFor(), 0.01);
    }

    @Test
    public void canPlaySax(){
        assertEquals("Playing : toot toot", sax.play());
    }
}
