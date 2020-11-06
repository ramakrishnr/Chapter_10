public class ScentedCandle extends Candle{
    //fields
    private String scent;
    private double price;
    private double height;
    private final int RATE_PER_INCH = 3;

    //mutator
    public void setScent(String scent) {
        this.scent = scent;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
        this.price = height * RATE_PER_INCH;
    }

    //accessor
    public String getScent() {
        return scent;
    } 

    public double getHeight() {
        return height;
    }
    public double getPrice() {
        return price;
    }
}
