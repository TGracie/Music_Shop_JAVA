package music_shop;

public class Piano extends instrument{
    private String make;
    private String style;

    public Piano (String type, String colour, int buyPrice, int sellPrice, String make, String style){
        super(type, colour, buyPrice, sellPrice);
        this.make = make;
        this.style = style;
    }

    public String getMake() {
        return make;
    }

    public String getStyle() {
        return style;
    }

}
