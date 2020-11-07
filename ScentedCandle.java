public class ScentedCandle extends Candle{
    //fields
    private String scent;
    private double price;
    private final int RATE_PER_INCH = 3;

    //mutator
    public void setScent(String scent) {
        this.scent = scent;
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        this.price = height * RATE_PER_INCH;
    }

    //accessor
    public String getScent() {
        return scent;
    }
    
    @Override
    public double getPrice() {
        return price;
    }
}
