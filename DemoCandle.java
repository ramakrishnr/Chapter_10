import java.awt.Color;

public class DemoCandle {
    public static void main(String[] args) {
        Candle aCandle = new Candle();
        ScentedCandle aScentedCandle = new ScentedCandle();

        aCandle.setColor(CandleColor.BLACK);
        aCandle.setHeight(2);

        aScentedCandle.setColor(CandleColor.BLUE);
        aScentedCandle.setHeight(2);
        aScentedCandle.setScent(Scent.HOMEGOMY);

        aCandle.display();
        aScentedCandle.display();
    }
}
