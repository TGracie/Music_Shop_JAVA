package music_shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<ISell> stock;
    private int cash;

    public Shop(String name, int cash) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
        this.cash = cash;
    }

    public String getName() {
        return name;
    }

    public int getCash() {
        return cash;
    }

    public int stockCount(){
        return this.stock.size();
    }

    public void addItemToStock(ISell item){
        this.stock.add(item);
    }

    public void removeStockItem(ISell item){
        this.stock.remove(item);
    }
}
