package br.dev.rvz;

public class Applicaton {
    public static void main(String[] args) {
        SpeedConverter speedConverter = new SpeedConverter();
        speedConverter.printConversion(1.5);
        speedConverter.printConversion(10.25);
        speedConverter.printConversion(-5.6);
        speedConverter.printConversion(25.42);
        speedConverter.printConversion(75.114);
        speedConverter.printConversion(0.0);
    }
}