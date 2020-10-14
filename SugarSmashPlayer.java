public class SugarSmashPlayer {
    //fields
    private int idNum;
    private String screenName;
    private final int MAX_GAME_LEVEL = 10;
    private int[] highestScoreList = new int[MAX_GAME_LEVEL];
    private final int MAX_ARRAY_INDEX = highestScoreList.length - 1; 
    final int MAX_LEVEL_SCORE = 100;

    //mutator
    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }
    public void setHighestScore(int highestScore, int levelIndex) {
        //final int OVER_ARRAY_SIZE = highestScoreList.length - 1; 
        if(levelIndex > MAX_ARRAY_INDEX || levelIndex < 0) {
            System.out.println("Wrong level entered");
        } else {
            if(levelIndex == 0) {
                highestScoreList[levelIndex] = highestScore;
            } else {
                if(highestScoreList[levelIndex - 1] > MAX_LEVEL_SCORE) {
                    highestScoreList[levelIndex] = highestScore;
                } else {
                    System.out.println("This level is not available for you yet.");
                }
            }
        }
    }

    // accessor
    public int getIdNum() {
        return idNum;
    }
    public String getScreenName() {
        return screenName;
    }
    public int getHighestScoreList(int levelIndex) {
        if (levelIndex > MAX_ARRAY_INDEX || levelIndex < 0) {
            System.out.println("Wrong level entered");
            return 0;
        } else {
            return highestScoreList[levelIndex];
        }
    }
    public int getMaxLevel() {
        return MAX_GAME_LEVEL;
    }
}
