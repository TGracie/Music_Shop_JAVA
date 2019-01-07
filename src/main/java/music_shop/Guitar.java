package music_shop;

public class Guitar extends instrument{
    private int numberOfStrings;
    private String model;

    public Guitar (String type, String colour, int buyPrice, int sellPrice, int numberOfStrings, String model){
        super(type, colour, buyPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
        this.model = model;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String getModel() {
        return model;
    }

    public String play(){
        return "Feelings!";
    }

    public int calculateMarkup(){
        return (this.sellPrice - this.buyPrice);
    }
}
