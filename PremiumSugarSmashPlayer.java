public class PremiumSugarSmashPlayer extends SugarSmashPlayer{
    private final int MAX_GAME_LEVEL = 40;
    private int[] highestScoreList = new int[this.MAX_GAME_LEVEL];
    private final int MAX_ARRAY_INDEX = this.highestScoreList.length - 1;

    @Override
    public void setHighestScore(int highestScore, int levelIndex) {
        //final int OVER_ARRAY_SIZE = highestScoreList.length - 1; 
        if(levelIndex > this.MAX_ARRAY_INDEX || levelIndex < 0) {
            System.out.println("Wrong level entered");
        } else {
            if(levelIndex == 0) {
                this.highestScoreList[levelIndex] = highestScore;
            } else {
                if(this.highestScoreList[levelIndex - 1] > MAX_LEVEL_SCORE) {
                    this.highestScoreList[levelIndex] = highestScore;
                } else {
                    System.out.println("This level is not available for you yet.");
                }
            }
        }
    }

    @Override
    public int getHighestScoreList(int levelIndex) {
        // final int OVER_ARRAY_SIZE = highestScoreList.length - 1;
        if (levelIndex > this.MAX_ARRAY_INDEX || levelIndex < 0) {
            System.out.println("Wrong level entered");
            return 0;
        } else {
            return this.highestScoreList[levelIndex];
        }
    }

    public int getMaxLevel() {
        return MAX_GAME_LEVEL;
    }
}
