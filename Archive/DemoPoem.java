public class DemoPoem {
    public static void main(String[] args) {
        Poem aPoem = new Poem("Just a poem", 1);
        Couplet aCouplet = new Couplet("A couplet poem");
        Limerick aLimerick = new Limerick("A limerick poem");
        Haiku aHaiku = new Haiku("A haiku poem");

        System.out.println();
        displayPoem(aPoem);
        System.out.println();
        displayPoem(aCouplet);
        System.out.println();
        displayPoem(aLimerick);
        System.out.println();
        displayPoem(aHaiku);
        System.out.println();
    }

    private static void displayPoem(Poem xPoem) {
        System.out.println(xPoem.getTitle() + " " + xPoem.getLines() + " lines.");
    }
}
