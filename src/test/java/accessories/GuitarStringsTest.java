package accessories;
import org.junit.Before;
import org.junit.Test;
import shopItems.accessories.type.GuitarStrings;
import shopItems.accessories.type.StringType;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings("Acoustic Strings", StringType.ACOUSTIC, 5.99, 10.99);
    }

    @Test
    public void canGetName(){
        assertEquals("Acoustic Strings", guitarStrings.getName());
    }

    @Test
    public void canGetStringType(){
        assertEquals(StringType.ACOUSTIC, guitarStrings.getStringType());
    }

    @Test
    public void canGetPriceBoughtFor(){
        assertEquals(5.99, guitarStrings.getPriceBoughtAt(), 0.01);
    }

}
