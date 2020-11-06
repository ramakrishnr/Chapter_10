public class Horse {
    //fields
    private String name;
    private String color;
    private int birthYear;

    //contructors

    //mutators
    // public void setName(String name) {
    //     this.name = name;
    // }
    public void setName(String name) {
        this.name = name;
    }
    // public void setColor(String color) {
    //     this.color = color;
    // }
    public void setColor(String color) {
        this.color = color;
    }
    // public void setBirthYear(int birthYear) {
    //     this.birthYear = birthYear;
    // }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    //accessor
    // public String getName() {
    //     return name;
    // }
    public String getName() {
        return name;
    }
    // public String getColor() {
    //     return color;
    // }
    public String getColor() {
        return color;
    }
    // public int getBirthYear() {
    //     return birthYear;
    // }
    public int getBirthYear() {
        return birthYear;
    }

    //methods
    public void displayResult(Horse a) {
        System.out.println(a.getName());
        System.out.println(a.getColor());
        System.out.println(a.getBirthYear());
    }
}