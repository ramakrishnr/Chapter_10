public class SugarSmashPlayer {
    //fields
    private final int MAX_LEVEL = 10;
    private int playerID;
    private String screenName;
    private int[] highestScore = new int[MAX_LEVEL];

    //mutator
    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }
    public void setLevelHighestScore(int level, int score) {
        if(level < 1 || level > 10) {
            this.highestScore[level - 1] = checkScore(level, score);;
        } else {
            System.out.println("Invalid error");
        }
    }

   //accessor
    public int getPlayerID() {
        return playerID;
    }
    public String getScreenName() {
        return screenName;
    }
    public int getLevelHighestScore(int level, int score) {
        if(level < 1 || level > 10) {
            return highestScore[level - 1];
        } else {
            System.out.println("Invalid error");
            return -1;
        }
    }

    //method
    private static int checkScore(int level, int score) {
        if(level == 0 && score <= 100) {
            
        }
        return score;
    }
}
