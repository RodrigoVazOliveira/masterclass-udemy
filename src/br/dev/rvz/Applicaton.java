package br.dev.rvz;

import java.util.Scanner;

public class Applicaton {
    public static void main(String[] args) {
        double pounds = new Scanner(System.in).nextDouble();
        double kg = pounds * 0.45d;
        System.out.println(pounds + "Libras é igual a " + kg + " kilogramas");
    }
}
