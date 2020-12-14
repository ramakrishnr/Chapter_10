public class DemoHorse {
    public static void main(String[] args) {

        //declare
        Horse aHorse = new Horse();
        RaceHorse aRaceHorse = new RaceHorse();

        //initializze
        aHorse.setName("Jungle King");
        aHorse.setColor(Color.WHITE);
        aHorse.setBirthYear(1985);

        aRaceHorse.setName("Jowel");
        aRaceHorse.setColor(Color.BLUE);
        aRaceHorse.setBirthYear(1990);

        //display
        aHorse.display(aHorse.getName(), aHorse.getColor(), aHorse.getBirthYear());
        aRaceHorse.display(aRaceHorse.getName(), aRaceHorse.getColor(), aRaceHorse.getBirthYear());
        //Horse.display(aHorse.getName(), aHorse.getColor(), aHorse.getBirthYear());
        //RaceHorse.display(aRaceHorse.getName(), aRaceHorse.getColor(), aRaceHorse.getBirthYear());
    }
}
