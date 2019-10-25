public class TeenNumberChecker {
    public static boolean isTeen(int number) {
        return number >= 13 && number <= 19;
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        return isTeen(num1) || isTeen(num2) || isTeen(num3);
    }
}