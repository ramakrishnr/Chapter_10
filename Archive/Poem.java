public class Poem {
    //fields
    private String title;
    private int lines;

    //contructor
    public Poem(String title, int lines) {
        this.title = title;
        this.lines = lines;
        System.out.println("This is executed in POEM");
    }

    //mutator

    //accessor
    public String getTitle() {
        return title;
    }
    public int getLines() {
        return lines;
    }
}
