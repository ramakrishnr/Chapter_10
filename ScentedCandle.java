public class ScentedCandle extends Candle{
    //fields
    private String scent;
    private final int PRICE_PER_INCH_SCENT = 3;
    //private double price;

    //mutator
    public void setScent(String scent) {
        this.scent = scent;
    }
    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        price = super.getHeight() * PRICE_PER_INCH_SCENT;
    }

    //accessor
    public String getScent() {
        return scent;
    }
}
