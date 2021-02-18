package br.dev.rvz;

public class MinutesYearToDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long days = (minutes / 1440L);
            long year = days / 365;
            days = days - (year * 365);
            System.out.println(minutes + " min = " + year + " y and " + days + " d");
        }
    }
}
