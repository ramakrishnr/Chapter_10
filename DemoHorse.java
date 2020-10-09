public class DemoHorse {
    public static void main(String[] args) {
        RaceHorse aRaceHorse = new RaceHorse();
        aRaceHorse.setName("Pony");
        aRaceHorse.setColor("Blue");
        aRaceHorse.setBirthYear(1985);
        aRaceHorse.setCompletedRaces(5);

        System.out.println(aRaceHorse.getName());
        System.out.println(aRaceHorse.getColor());
        System.out.println(aRaceHorse.getBirthYear());
        System.out.println(aRaceHorse.getCompletedRaces());
    }
}
