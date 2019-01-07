package music_shop;

import behaviours.ISell;

public class Book implements ISell {
    private String title;
    private int buyPrice;
    private int sellPrice;

    public Book(String title, int buyPrice, int sellPrice) {
        this.title = title;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getTitle() {
        return title;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public int calculateMarkup(){
        return (this.sellPrice - this.buyPrice);
    }
}
