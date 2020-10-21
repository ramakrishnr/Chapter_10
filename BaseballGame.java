
public class BaseballGame {
    //fields
    private String teamNameA;
    private String teamNameB;
    private final int INNING_COUNT = 9;
    private int[] inningListA = new int[INNING_COUNT];
    private int[] inningListB = new int[INNING_COUNT];
    
    //constructor

    //mutator
    public void setTeamNameA(String teamNameA) {
        this.teamNameA = teamNameA;
    }
    public void setTeamNameB(String teamNameB) {
        this.teamNameB = teamNameB;
    }
    public void setInningListA(int inningAScore, int inningAIndex) {
        this.inningListA[inningAIndex] = inningAScore;
    }
    public void setInningListB(int inningBScore, int innningBIndex) {
        this.inningListB[innningBIndex] = inningBScore;
    }

    //accessors
    public String getTeamNameA() {
        return teamNameA;
    }
    public String getTeamNameB() {
        return teamNameB;
    }
    public int getInningAScore(int inningAIndex) {
        return inningListA[inningAIndex];
    }
    public int getInningBScore(int innningBIndex) {
        return inningListB[innningBIndex];
    }

    public int[] getInningListA() {
        return inningListA;
    }

    public int[] getInningListB() {
        return inningListB;
    }

    public int getINNING_COUNT() {
        return INNING_COUNT;
    }

    //methods
    public void determineWinner(int[] inningListA, int[] inningListB) {
        int totalA = 0;
        for(int i = 0; i < inningListA.length; ++i) {
            totalA += inningListA[i];
        }
        int totalB = 0;
        for(int i = 0; i < inningListB.length; ++i) {
            totalB += inningListB[i];
        }

        if (totalA > totalB) {
            System.out.println("Team B is the winner.");
        } else if(totalA < totalB) {
            System.out.println("Team B is the winner.");
        } else if( totalA == totalB) {
            System.out.println("It is a tie.");
        }
    }
}
