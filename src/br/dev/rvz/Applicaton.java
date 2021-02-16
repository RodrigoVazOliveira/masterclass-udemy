package br.dev.rvz;

public class Applicaton {
    public static void main(String[] args) {
        /*System.out.println("sua pontução final foi: " + calculateScore(true,8, 5, 100));
        System.out.println("");
        System.out.println("sua pontuação final foi: " + calculateScore(true, 10000, 8, 200));;
    */
        displayHighScorePosition("José",
                calculateHighScorePosition(1500));
        displayHighScorePosition("Maria",
                calculateHighScorePosition(900));
        displayHighScorePosition("Carlos",
                calculateHighScorePosition(400));
        displayHighScorePosition("Junior",
                calculateHighScorePosition(50));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = -1;
        if (gameOver) {
            finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
        return finalScore;
    }

    public static void displayHighScorePosition(String namePlayer, int position) {
        System.out.println(namePlayer + " managed to get into position "
                + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore > 1000) {
            return 1;
        } else if (playerScore > 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            return  3;
        } else {
            return 4;
        }
    }
}