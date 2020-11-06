public class RaceHorse extends Horse{
    //fields
    private int completedRaces;

    //constructors
    
    //mutators
    public void setCompletedRaces(int completedRaces) {
        this.completedRaces = completedRaces;
    }

    //accessors
    public int getCompletedRaces() {
        return completedRaces;
    }

    //methods
    public void displayResult(RaceHorse a) {
        System.out.println(a.getName());
        System.out.println(a.getColor());
        System.out.println(a.getBirthYear());
        System.out.println(a.getCompletedRaces());
    }

}
