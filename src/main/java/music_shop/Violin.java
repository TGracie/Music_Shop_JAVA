package music_shop;

public class Violin extends instrument{
    private double size;

    public Violin (String type, String colour, int buyPrice, int sellPrice, double size){
        super(type, colour, buyPrice, sellPrice);
        this.size = size;
    }

    public double getSize() {
        return size;
    }
}
