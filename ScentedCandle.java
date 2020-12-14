enum Scent {ROSE, HOMEGOMY, SANDAL, EUCYLPS}

public class ScentedCandle extends Candle {
    //fields
    private Scent scent;
    final double PRICE_PER_INCH = 3.00;


    //mutator
    public void setScent(Scent scent) {
        this.scent = scent;
    }
    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        price = height * this.PRICE_PER_INCH;
    }

    //accessor
    public Scent getScent() {
        return scent;
    }

}
