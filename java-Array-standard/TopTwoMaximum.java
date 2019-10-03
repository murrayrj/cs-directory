import java.io.*;
import java.util.*;

public class TopTwoMaximum {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String string;
            while ((string = br.readLine()) != null) {
                int[] numbers = Arrays.stream(string.split("\\s")).mapToInt(Integer::parseInt).toArray();
                System.out.println(Arrays.toString(getTopTwoMax(numbers)));
            }
        }
    }

    private static int[] getTopTwoMax(int[] numbers) {
        int maxA = Integer.MIN_VALUE;
        int maxB = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > maxB) {
                maxA = maxB;
                maxB = number;
            } else if (number > maxA) {
                maxA = number;
            }
        }
        return new int[]{maxA, maxB};
    }
}