package music_shop;

import behaviours.ISell;

public class Stand implements ISell {
    private String colour;
    private int buyPrice;
    private int sellPrice;

    public Stand(String colour, int buyPrice, int sellPrice) {
        this.colour = colour;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getColour() {
        return colour;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    public int calculateMarkup(){
        return (this.sellPrice - this.buyPrice);
    }
}
