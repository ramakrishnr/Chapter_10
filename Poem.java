public class Poem {
    //fields
    private String title;
    private int numLines;

    //constructor
    public Poem(String title, int numLines) {
        this.title = title;
        this.numLines = numLines;
    }

    //accessors
    public String getTitle() {
        return title;
    }
    public int getNumLines() {
        return numLines;
    }
    
}
