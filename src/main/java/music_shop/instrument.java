package music_shop;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class instrument implements IPlay, ISell {
    protected String type;
    protected String colour;
    protected int buyPrice;
    protected int sellPrice;

    public instrument (String type, String colour, int buyPrice, int sellPrice){
        this.type = type;
        this.colour = colour;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getType() {
        return type;
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
}
