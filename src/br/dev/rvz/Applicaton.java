package br.dev.rvz;

public class Applicaton {
    public static void main(String[] args) {
        System.out.println("sua pontução final foi: " + calculateScore(true,8, 5, 100));
        System.out.println("");
        System.out.println("sua pontuação final foi: " + calculateScore(true, 10000, 8, 200));;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = -1;
        if (gameOver) {
            finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
        return finalScore;
    }
}