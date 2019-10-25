public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        long milesPerHour;
        if (kilometersPerHour < 0) {
            milesPerHour = (long) -1;
        } else {
            milesPerHour = Math.round(kilometersPerHour / 1.609);
        }
        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}