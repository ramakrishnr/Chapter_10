public class SugarSmashPlayer {
    //fields
    private int playerID;
    private String screenName;
    final int MAX_LEVEL = 10;
    private int[] highestScorePerLevel = new int[MAX_LEVEL];

    //mutator
    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }
    public void setHighestScorePerLevel(int score, int gameLevel) {
        if (gameLevel < 0 || gameLevel > 9) {
            System.out.println("Wrong level...");
        }
        else {
            //boolean continueCheck = true;
            while(getHighestScorePerLevel(highestScorePerLevel[gameLevel - 1]) < 100 && gameLevel != 0) {
                System.out.println(" Game Level " + gameLevel + " has score less than 100.");
                System.out.println(" Can't set score in locked level. Earn 100 of more score on lower level to unlock this level.\n Moving to the level below...");
                if (gameLevel != 0) {
                    gameLevel -= 1;
                    //System.out.println("Down");
                    //continueCheck = false;
                }
                // else {
                //     gameLevel = 0;
                //     continueCheck = false;
                // }
            }
            this.highestScorePerLevel[gameLevel] = score;
        }
    }

    //accessor
    public int getPlayerID() {
        return playerID;
    }
    public String getScreenName() {
        return screenName;
    }
    public int getHighestScorePerLevel(int gameLevel) {
        if (gameLevel < 0 || gameLevel > 9) {
            System.out.println("Wrong level...");
            return 0;
        }
        else {
            return highestScorePerLevel[gameLevel];
        }
    }
    public int getMAX_LEVEL() {
        return MAX_LEVEL;
    }

    //method
    public void display() {
        for(int i = highestScorePerLevel.length - 1; i >= 0; i--) {
            System.out.println("Level: " + i + " " + "Score: " + getHighestScorePerLevel(i));
        }
    }
}
