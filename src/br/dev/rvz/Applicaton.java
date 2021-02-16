package br.dev.rvz;

public class Applicaton {
    public static void main(String[] args) {
        calculateScore(true,8, 5, 100);
        System.out.println("");
        calculateScore(true, 10000, 8, 200);
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (score < 500) {
            System.out.println("Your socre is 5000");
        } else if (score < 1000 && score >= 5000) {
            System.out.println("Your score was less than 1000");
        }else {
            System.out.println("Go here");
        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Yor final score was " + finalScore);
        }
    }
}