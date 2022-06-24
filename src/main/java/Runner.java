import shopItems.ISell;
import shopItems.accessories.type.*;
import shopItems.instruments.InstrumentType;
import shopItems.instruments.type.*;


import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        Shop shop;
        ArrayList<ISell> stock;
        Guitar electricGuitar;
        Guitar acousticGuitar;
        Flute flute;
        Sax sax;
        Drum drum;
        SheetMusic sheetMusic;
        GuitarStrings guitarStrings;
        DrumSticks drumSticks;

        stock = new ArrayList<>();
        electricGuitar = new Guitar(GuitarType.ELECTRIC, InstrumentType.STRINGS, "Preowned Electric Guitar", false, true, 250.54, 399.99);
        sax = new Sax(InstrumentType.WOODWIND, SaxophoneType.TENOR, "Beginners Tenor Saxophone", true, false, 554.80, 1099.99);
        flute = new Flute(InstrumentType.WOODWIND, "Beginners Yamaha Flute", FluteBrand.YAMAHA, true, 99.95, 250.00);
        drum = new Drum(InstrumentType.PERCUSSION,"Snare Drum", true, false,50.54, 82.99);
        sheetMusic = new SheetMusic("Jingle Bells", InstrumentType.PERCUSSION, Genre.CHRISTMAS, true, 0.13, 1.99);
        drumSticks = new DrumSticks("Drumsticks", StickLength.NUMBER_1, "natural", 2.95, 6.9);
        guitarStrings = new GuitarStrings("Acoustic Strings", StringType.ACOUSTIC, 5.99, 10.99);
        stock.add(electricGuitar);
        stock.add(sax);
        stock.add(flute);
        stock.add(drum);
        stock.add(sheetMusic);
        stock.add(drumSticks);
        stock.add(guitarStrings);
        shop = new Shop("Rays Music Exchange", stock, 5000.00);

        stock.stream()
                .forEach(name -> System.out.println(name));
        System.out.println(shop);

        stock.remove(electricGuitar);

        stock.stream()
                .forEach(name -> System.out.println(name));
        System.out.println(shop);



    }
}
