public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        int upperLimit = summer ? 45 : 35;
        if (temperature >= 25 && temperature <= upperLimit) {
            return true;
        }
        return false;
    }
}
