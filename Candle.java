public class Candle {
    //fields
    private String color;
    private double height;
    private double price;
    private final int RATE_PER_INCH = 2;

    //accessors
    public String getColor() {
        return color;
    }
    public double getHeight() {
        return height;
    }
    public double getPrice() {
        return price;
    }

    //mutators
    public void setColor(String color) {
        this.color = color;
    }
    public void setHeight(double height) {
        this.height = height;
        this.price = height * RATE_PER_INCH;
    }
}
