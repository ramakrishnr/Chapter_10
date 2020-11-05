public class DemoHSBaseballGame {
    public static void main(String[] args) {
        HighSchoolBaseballGame aHighSchoolBaseballGame = new HighSchoolBaseballGame();

        aHighSchoolBaseballGame.setTeamNameA("Wani");
        aHighSchoolBaseballGame.setInningListA(10, 0);
        aHighSchoolBaseballGame.setInningListA(11, 1);
        aHighSchoolBaseballGame.setInningListA(12, 2);
        aHighSchoolBaseballGame.setInningListA(13, 3);
        aHighSchoolBaseballGame.setInningListA(14, 4);
        aHighSchoolBaseballGame.setInningListA(15, 5);
        aHighSchoolBaseballGame.setInningListA(16, 6);
        //aHighSchoolBaseballGame.setInningListA(17, 7);
        //aHighSchoolBaseballGame.setInningListA(18, 8);

        aHighSchoolBaseballGame.setTeamNameB("Rama");
        aHighSchoolBaseballGame.setInningListB(20, 0);
        aHighSchoolBaseballGame.setInningListB(21, 1);
        aHighSchoolBaseballGame.setInningListB(22, 2);
        aHighSchoolBaseballGame.setInningListB(23, 3);
        aHighSchoolBaseballGame.setInningListB(24, 4);
        aHighSchoolBaseballGame.setInningListB(25, 5);
        aHighSchoolBaseballGame.setInningListB(26, 6);
        //aHighSchoolBaseballGame.setInningListB(27, 7);
        //aHighSchoolBaseballGame.setInningListB(28, 8);

        displayResult(aHighSchoolBaseballGame);
    }

    public static void displayResult(HighSchoolBaseballGame aBaseballGame) {
        System.out.println("Team A: " + aBaseballGame.getTeamNameA());
        for(int i = 0; i < aBaseballGame.getINNING_COUNT(); ++ i) {
            System.out.print(aBaseballGame.getInningAScore(i) + " ");
        }
        System.out.println("");

        System.out.println("Team B: " + aBaseballGame.getTeamNameB());
        for(int i = 0; i < aBaseballGame.getINNING_COUNT(); ++ i) {
            System.out.print(aBaseballGame.getInningBScore(i) + " ");
        }
        System.out.println("");

        aBaseballGame.determineWinner(aBaseballGame.getInningListA(), aBaseballGame.getInningListB());
    }
}
