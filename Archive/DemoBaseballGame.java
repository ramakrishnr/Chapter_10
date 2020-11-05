
public class DemoBaseballGame {
    public static void main(String[] args) {
        BaseballGame aBaseballGame = new BaseballGame();

        aBaseballGame.setTeamNameA("Wani");
        
        aBaseballGame.setInningListA(10, 0);
        aBaseballGame.setInningListA(11, 1);
        aBaseballGame.setInningListA(12, 2);
        aBaseballGame.setInningListA(13, 3);
        aBaseballGame.setInningListA(14, 4);
        aBaseballGame.setInningListA(15, 5);
        aBaseballGame.setInningListA(16, 6);
        aBaseballGame.setInningListA(17, 7);
        aBaseballGame.setInningListA(18, 8);

        aBaseballGame.setTeamNameB("Rama");
        aBaseballGame.setInningListB(20, 0);
        aBaseballGame.setInningListB(21, 1);
        aBaseballGame.setInningListB(22, 2);
        aBaseballGame.setInningListB(23, 3);
        aBaseballGame.setInningListB(24, 4);
        aBaseballGame.setInningListB(25, 5);
        aBaseballGame.setInningListB(26, 6);
        aBaseballGame.setInningListB(27, 7);
        aBaseballGame.setInningListB(28, 8);

        displayResult(aBaseballGame);
    }

    public static void displayResult(BaseballGame aBaseballGame) {
        System.out.println("Team A: " + aBaseballGame.getTeamNameA());
        for(int i = 0; i < 9; ++ i) {
            System.out.print(aBaseballGame.getInningAScore(i) + " ");
        }
        System.out.println("");

        System.out.println("Team B: " + aBaseballGame.getTeamNameB());
        for(int i = 0; i < 9; ++ i) {
            System.out.print(aBaseballGame.getInningBScore(i) + " ");
        }
        System.out.println("");

        aBaseballGame.determineWinner(aBaseballGame.getInningListA(), aBaseballGame.getInningListB());
    }
}
