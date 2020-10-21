public class HighSchoolBaseballGame extends BaseballGame{
    //fields
    private final int INNING_COUNT = 7;
    private int[] inningListA = new int[INNING_COUNT];
    private int[] inningListB = new int[INNING_COUNT];

    //mutators
    @Override
    public void setInningListA(int inningAScore, int inningAIndex) {
        this.inningListA[inningAIndex] = inningAScore;
    }

    @Override
    public void setInningListB(int inningBScore, int innningBIndex) {
        this.inningListB[innningBIndex] = inningBScore;
    }

    //accessors
    @Override
    public int getInningAScore(int inningAIndex) {
        return inningListA[inningAIndex];
    }

    @Override
    public int getInningBScore(int innningBIndex) {
        return inningListB[innningBIndex];
    }

    @Override
    public int[] getInningListA() {
        return inningListA;
    }

    @Override
    public int[] getInningListB() {
        return inningListB;
    }

    @Override
    public int getINNING_COUNT() {
        return this.INNING_COUNT;
    }
}
