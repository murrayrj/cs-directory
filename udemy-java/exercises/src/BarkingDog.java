public class BarkingDog {
    public static boolean shouldWakeUp(boolean isDogCurrentlyBarking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) return false;
        if (isDogCurrentlyBarking) {
            if (hourOfDay < 8 || hourOfDay > 22) {
                return true;
            }
        }
        return false;
    }
}
