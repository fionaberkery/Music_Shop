package accessories;

import org.junit.Before;
import org.junit.Test;
import shopItems.accessories.type.Genre;
import shopItems.accessories.type.SheetMusic;
import shopItems.instruments.InstrumentType;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("Jingle Bells", InstrumentType.PERCUSSION, Genre.CHRISTMAS, true, 0.13, 1.99);
    }

    @Test
    public void canGetName(){
        assertEquals("Jingle Bells", sheetMusic.getName());
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.PERCUSSION, sheetMusic.getInstrumentType());
    }

    @Test
    public void canFindOutIfItsADigitalCopy(){
        assertTrue(sheetMusic.isDigitalCopy());
    }

    @Test
    public void canGetGenre(){
        assertEquals(Genre.CHRISTMAS, sheetMusic.getGenre());
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(1.86, sheetMusic.calculateMarkup(), 0.01);
    }
}
