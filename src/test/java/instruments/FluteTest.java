package instruments;

import org.junit.Before;
import org.junit.Test;
import shopItems.instruments.Instrument;
import shopItems.instruments.InstrumentType;
import shopItems.instruments.type.Flute;
import shopItems.instruments.type.FluteBrand;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;

    @Before
    public void before(){
        flute = new Flute(InstrumentType.WOODWIND, "Beginners Yamaha Flute", FluteBrand.YAMAHA, true, 99.95, 250.00);
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.WOODWIND, flute.getInstrumentType());
    }

    @Test
    public void canGetDescriptionOfFlute(){
        assertEquals("Beginners Yamaha Flute", flute.getDescription());
    }

    @Test
    public void canGetFluteBrand(){
        assertEquals(FluteBrand.YAMAHA, flute.getFluteBrand());
    }

    @Test
    public void canGetMarkUpValue(){
        assertEquals(150.05, flute.calculateMarkup(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("Playing : flutter flutter", flute.play());
    }

}
