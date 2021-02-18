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

        MegaByteConverter.printMegaBytesAndKiloBytes(2500);
        MegaByteConverter.printMegaBytesAndKiloBytes(-1024);
        MegaByteConverter.printMegaBytesAndKiloBytes(5000);

        LeapYearCalculator.isLeapYear(-1600);
        LeapYearCalculator.isLeapYear(1600);
        LeapYearCalculator.isLeapYear(2017);
        LeapYearCalculator.isLeapYear(2000);
        LeapYearCalculator.isLeapYear(-1600);

        System.out.println(DecimalComparator.areEqualByThreedecimalPlaces(-3.1756, -3.175));
        System.out.println(DecimalComparator.areEqualByThreedecimalPlaces(3.175, 3.176));

        System.out.println("calcular area");
        System.out.println(AreaCalculator.area(5.0));
        System.out.println(AreaCalculator.area(-1));
        System.out.println(AreaCalculator.area(5.0, 4.0));
        System.out.println(AreaCalculator.area(-1.0, 4.0));

        System.out.println("conversão de minutos para dia e ano");
        MinutesYearToDaysCalculator.printYearsAndDays(525600);
        MinutesYearToDaysCalculator.printYearsAndDays(1051200);
        MinutesYearToDaysCalculator.printYearsAndDays(561600);
        MinutesYearToDaysCalculator.printYearsAndDays(-561600);



    }
}