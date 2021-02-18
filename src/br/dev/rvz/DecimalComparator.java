package br.dev.rvz;

import java.text.DecimalFormat;

public class DecimalComparator {
    public static boolean areEqualByThreedecimalPlaces(double numberOne, double numberTwo) {

        DecimalFormat df = new DecimalFormat("#,###");
        double newNumberOne = Double.valueOf(df.format(numberOne).replace('.','.'));
        double newNumberTwo = Double.valueOf(df.format(numberTwo));

        if (newNumberOne == newNumberTwo) {
            return true;
        }

        return false;
    }
}
