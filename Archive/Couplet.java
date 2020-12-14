public class Couplet extends Poem{
    //fields
    private final static int COUPLET_LINES = 2;

    // constructor
    public Couplet(String title) {
        super(title, COUPLET_LINES);
        System.out.println(" This is executed in Couplet");
    }
}
