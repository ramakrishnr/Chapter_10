public class DemoPoems {
    public static void main(String[] args) {
        Poem aPoem = new Poem("Master", 1);
        Couplet aCouplet = new Couplet("Couplety");
        Limerick aLimerick = new Limerick("Limericky");
        Haiku aHaiku = new Haiku("Haikui");

        aPoem.display();
        aCouplet.display();
        aLimerick.display();
        aHaiku.display();
    }
}
