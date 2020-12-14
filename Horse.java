enum Color {AMBER, BLACK, BLUE, WHITE};

public class Horse {
    //fields
    private String name;
    private Color color;
    private int birthYear;
    private static int count = 0;
    private int horseID;
    
    //constructor
    public Horse() {
        count++;
        setHorseID(count);
    }
    //mutator
    public void setName(String name) {
        this.name = name;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public void setHorseID(int count) {
        this.horseID = count;
    }

    //accessor
    public String getName() {
        return name;
    }
    public Color getColor() {
        return color;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public int getHorseID() {
        return horseID;
    }

    public void display(String name, Color color, int birthYear) {
        System.out.print(name + " " + color + " " + birthYear + " HorseID: ");
        System.out.printf("%4d & Count: %d\n", horseID, count);
    }
}
