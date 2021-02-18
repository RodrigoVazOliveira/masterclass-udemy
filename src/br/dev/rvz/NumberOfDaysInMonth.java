package br.dev.rvz;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        } else if (year < 1 || year > 9999) {
            return -1;
        } else {
            if (month == 1 || month == 3 || month == 5
                    || month == 7 || month == 8 || month == 12
            || month == 10) {
                return 31;
            } else if (month == 2) {
                if (isLeapYear(year)) {
                    return 29;
                }
                return 28;
            } else if (month == 4 || month == 6
                    || month == 9 || month == 11) {
                return 30;
            } else {
                return -1;
            }
        }
    }
}
