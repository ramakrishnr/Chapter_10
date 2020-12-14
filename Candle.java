enum CandleColor {WHITE, YELLOW, BLACK, PINK, BLUE}

public class Candle {
    //fields
    private CandleColor color;
    private int height;
    protected double price;
    final double PRICE_PER_INCH = 2.00;

    //constructor

    //mutator
    public void setColor(CandleColor color) {
        this.color = color;
    }
    public void setHeight(int height) {
        this.height = height;
        price = height * PRICE_PER_INCH;
        System.out.println(price);
    }

    //accessor
    public CandleColor getColor() {
        return color;
    }
    public int getHeight() {
        return height;
    }
    public double getPrice() {
        return price;
    }

    //method
    public void display() {
        System.out.println(getColor() + " " + getHeight() + " " + getPrice());
    }
}
