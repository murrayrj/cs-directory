public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        double firstToThreeDecimalPlaces = (double) ((int) (first * 1000)) / 1000;
        double secondToThreeDecimalPlaces = (double) ((int) (second * 1000)) / 1000;
        return firstToThreeDecimalPlaces == secondToThreeDecimalPlaces;
    }
}