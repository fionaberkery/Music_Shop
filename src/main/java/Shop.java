import shopItems.ISell;
import shopItems.accessories.type.DrumSticks;
import shopItems.instruments.type.Guitar;

import java.util.ArrayList;

public class Shop {


    private String name;
    private ArrayList<ISell> stock;
    private double till;

    public Shop(String name, ArrayList<ISell> stock, double till) {
        this.name = name;
        this.stock = stock;
        this.till = till;
    }

    public String getName() {
        return name;
    }

    public int getAmountOfStock(){
        return stock.size();
    }

    public double getTill() {
        return till;
    }


    public void setTill(double till) {
        this.till = till;
    }

    public void addItem(ISell newItem) {
        this.stock.add(newItem);
    }

    public void removeItem(ISell itemToRemove) {
        this.stock.remove(itemToRemove);
    }

}
