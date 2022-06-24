package accessories;
import org.junit.Before;
import org.junit.Test;
import shopItems.accessories.type.DrumSticks;
import shopItems.accessories.type.StickLength;
import static org.junit.Assert.assertEquals;
public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks("Drumsticks", StickLength.NUMBER_1, "natural", 2.95, 6.95);
    }

    @Test
    public void canGetStickLength(){
        assertEquals(StickLength.NUMBER_1, drumSticks.getStickLength());
    }

    @Test
    public void canGetLengthInInches(){
        assertEquals("16.75-17.25 inches", drumSticks.getStickLength().getInches());
    }

    @Test
    public void canGetNameOfAccessory(){
        assertEquals("Drumsticks", drumSticks.getName());
    }

    @Test
    public void canGetColour(){
        assertEquals("natural", drumSticks.getColour());
    }

    @Test
    public void canGetMarkUpValue(){
        assertEquals(4, drumSticks.calculateMarkup(), 0.01);
    }

}
