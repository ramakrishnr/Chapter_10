public class DemoPoem {
    public static void main(String[] args) {
        Poem aPoem = new Poem("Original poem", 1);
        Couplet aCouplet = new Couplet("Couplet poem", 3);
        LimeRick aLimeRick = new LimeRick("LimeRick poem", 5);
        Haiku aHaiku = new Haiku("Haiku poem", 2);

        System.out.println(aPoem.getTitle() + " " + aPoem.getNumLines());
        System.out.println(aCouplet.getTitle() + " " + aCouplet.getNumLines());
        System.out.println(aLimeRick.getTitle() + " " + aLimeRick.getNumLines());
        System.out.println(aHaiku.getTitle() + " " + aHaiku.getNumLines());
    }
}
