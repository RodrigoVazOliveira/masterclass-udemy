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

        System.out.println("print Equals");
        EqualityPrinter.printEqual(1,1,1);
        EqualityPrinter.printEqual(1,1,2);
        EqualityPrinter.printEqual(-1,-1,-1);
        EqualityPrinter.printEqual(1,2,3);

        System.out.println("Playing Cat");
        System.out.println(PlayingCat.isCatPlaying(true, 10));
        System.out.println(PlayingCat.isCatPlaying(false, 36));
        System.out.println(PlayingCat.isCatPlaying(false, 35));

        char letter = 'a';

        switch (letter) {
            case 'A':
                System.out.println("Letra localizada");
                break;
            case 'B':
                System.out.println("Letra localizada");
                break;
            case 'C':
                System.out.println("letra localizada");

                break;
            case 'D':
                System.out.println("letra localizada");
                break;
            case 'E':
                System.out.println("Letra localizada");
                break;
            default:
                System.out.println("Not found letter");
                break;
        }

        System.out.println("Dias das semanas");

        for (int i = 0; i < 7; i++) {
            DaysWeek.printDayOfTheWeek(i);
        }

        System.out.println("número por extenso");
        for(int i = 0; i < 11; i++) {
            Word.printNumberInWord(i);
        }
    }
}