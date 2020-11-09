public class Haiku extends Poem{
    //fields
    private static final int HAIKU_LINES = 3;

    //constructor
    public Haiku(String title) {
        super(title, HAIKU_LINES);
        System.out.println(" This is executed in Haiku");
    }
}
