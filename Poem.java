public class Poem {
    //fields
    private String title;
    private int numOfLines;

    //contructors
    public Poem(String title, int numOfLines) {
        this.title = title;
        this.numOfLines = numOfLines;
    }
    //mutator
    //accessor
    public String getTitle() {
        return title;
    }
    public int getNumOfLines() {
        return numOfLines;
    }
    //methods
    public void display() {
        System.out.println(getTitle() + " " + getNumOfLines());
    }
}
