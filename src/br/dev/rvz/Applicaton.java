package br.dev.rvz;

public class Applicaton {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

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

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            System.out.println("Your final socre was " + (score + (levelCompleted * bonus)));
        }
    }
}