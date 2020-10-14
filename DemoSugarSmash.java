
public class DemoSugarSmash {
    public static void main(String[] args) {
        SugarSmashPlayer aSugarSmashPlayer = new SugarSmashPlayer();
        aSugarSmashPlayer.setIdNum(1111);
        aSugarSmashPlayer.setScreenName("John");
        aSugarSmashPlayer.setHighestScore(101, 0);
        aSugarSmashPlayer.setHighestScore(102, 1);
        aSugarSmashPlayer.setHighestScore(103, 2);
        aSugarSmashPlayer.setHighestScore(104, 3);
        display(aSugarSmashPlayer);
        System.out.println();

        PremiumSugarSmashPlayer aPremiumSugarSmashPlayer = new PremiumSugarSmashPlayer();
        aPremiumSugarSmashPlayer.setIdNum(2222);
        aPremiumSugarSmashPlayer.setScreenName("John Paul");
        aPremiumSugarSmashPlayer.setHighestScore(111, 0);
        aPremiumSugarSmashPlayer.setHighestScore(112, 1);
        aPremiumSugarSmashPlayer.setHighestScore(113, 2);
        aPremiumSugarSmashPlayer.setHighestScore(114, 3);
        display(aPremiumSugarSmashPlayer);
        System.out.println();
    }

    public static void display(SugarSmashPlayer aPlayer) {
        System.out.println("ID: " + aPlayer.getIdNum());
        System.out.println("Screen name: " + aPlayer.getScreenName());
        System.out.println("Scores----");
        //for(int i = 0; i < aPlayer.maxGameLevel; ++i){
        for(int i = 0; i < aPlayer.getMaxLevel(); ++i){
            System.out.println("Level: " + (i + 1) + "    Score: " + aPlayer.getHighestScoreList(i));
        }
    }
}
