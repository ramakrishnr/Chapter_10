public class Candle {
    //fields
    private String color;
    private int height;
    protected double price;
    private final int PRICE_PER_INCH = 2;

    //accessor
    public String getColor() {
        return color;
    }
    public int getHeight() {
        return height;
    }
    public double getPrice() {
        return price;
    }

    //mutator
    public void setColor(String color) {
        this.color = color;
    }
    public void setHeight(int height) {
        this.height = height;
        this.price = height * PRICE_PER_INCH;
    }

}
