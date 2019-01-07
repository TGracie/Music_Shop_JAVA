package music_shop;

public class Piano extends instrument{
    private String make;

    public Piano (String type, String colour, int buyPrice, int sellPrice, int numberOfStrings, String make){
        super(type, colour, buyPrice, sellPrice);
        this.make = make;
    }

    public String getMake() {
        return make;
    }
}
