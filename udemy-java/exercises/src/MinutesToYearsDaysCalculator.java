public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        long minutesInADay = 60 * 24;
        long minutesInAYear = minutesInADay * 365;
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long timeInYears = minutes / minutesInAYear;
            long timeInDays = (minutes - (timeInYears * minutesInAYear)) / minutesInADay;
            System.out.println(minutes + " min = " + timeInYears + " y and " + timeInDays + " d");
        }
    }
}
