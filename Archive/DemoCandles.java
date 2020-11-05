public class DemoCandles {
    public static void main(String[] args) {
        Candle aCandle = new Candle();
        ScentedCandle aScentedCandle = new ScentedCandle();

        aCandle.setColor("White");
        aCandle.setHeight(3);

        aScentedCandle.setColor("OffWhite");
        aScentedCandle.setHeight(5);
        aScentedCandle.setScent("Rose");
        
        System.out.println(aCandle.getColor());
        System.out.println(aCandle.getHeight());
        System.out.println(aCandle.getPrice());

        System.out.println();

        System.out.println(aScentedCandle.getColor());
        System.out.println(aScentedCandle.getHeight());
        System.out.println(aScentedCandle.getScent());
        System.out.println(aScentedCandle.getPrice());
    }
}
