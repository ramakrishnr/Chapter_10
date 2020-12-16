public class DemoSugarSmash {
    public static void main(String[] args) {
        SugarSmashPlayer aSmashPlayer = new SugarSmashPlayer();
        PremiumSugarSmashPlayer aPremiumSugarSmashPlayer = new PremiumSugarSmashPlayer();

        aSmashPlayer.setHighestScorePerLevel(100, 9);
        aSmashPlayer.setHighestScorePerLevel(40, 9);
        //aPremiumSugarSmashPlayer.setHighestScorePerLevel(40, 10);

        aSmashPlayer.display();
        System.out.println("");
        //aPremiumSugarSmashPlayer.display();
    }
}
