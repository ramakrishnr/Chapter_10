public class Limerick extends Poem{
    //fields
    private static final int LIMERICK_LINES = 5;

    //contructor
    public Limerick(String title) {
        super(title, LIMERICK_LINES);
        System.out.println(" This is executed in Limerick");
    }
}
