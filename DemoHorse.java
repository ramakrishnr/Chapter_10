public class DemoHorse {
    public static void main(String[] args) {

        //declare variables
        Horse aHorse = new Horse();
        RaceHorse aRaceHorse = new RaceHorse();

        String name;
        String color;
        int birthYear;
        int completedRaces;

        //assign values to variables
        name = "Normal Horse";
        color = "white";
        birthYear = 1985;

        //populate aHorse
        aHorse.setName(name);
        aHorse.setColor(color);
        aHorse.setBirthYear(birthYear);
        
        //assign diffent values to the variables
        name = "Running Horse";
        color = "Red";
        birthYear = 2020;
        completedRaces = 6;

        //populate aRacehorse
        aRaceHorse.setName(name);
        aRaceHorse.setColor(color);
        aRaceHorse.setBirthYear(birthYear);
        aRaceHorse.setCompletedRaces(completedRaces);

        //display results
        System.out.println();
        aHorse.displayResult(aHorse);
        System.out.println();
        aRaceHorse.displayResult(aRaceHorse);
        System.out.println();
    }
}
