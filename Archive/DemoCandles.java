public class DemoCandles {
    public static void main(String[] args) {
        Candle aCandle = new Candle();
        ScentedCandle aScentedCandle = new ScentedCandle();

        String color;
        double height;

        color = "White";
        height = 5;
        aCandle.setColor(color);
        aCandle.setHeight(height);

        color = "Pink";
        height = 5;
        aScentedCandle.setColor(color);
        aScentedCandle.setHeight(height);

        System.out.println();
        System.out.println(aCandle.getColor());
        System.out.println(aCandle.getHeight());
        System.out.println(aCandle.getPrice());
        System.out.println();

        System.out.println();
        System.out.println(aScentedCandle.getColor());
        System.out.println(aScentedCandle.getHeight());
        System.out.println(aScentedCandle.getPrice());
        System.out.println(); 
    }
}
