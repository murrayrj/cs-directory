import java.io.*;
import java.util.*;

public class BinaryGap {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    int number = Integer.parseInt(line);
                    System.out.println(getBinaryGap(number));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please try again");
                }
            }
        }
    }

    private static int getBinaryGap(int number) {
        number = removeTrailingZeroes(number);
        int steps = 0;
        while ((number & (number + 1)) != 0) {
            number = fillLeftmostZero(number);
            steps++;
        }
        return steps;
    }

    private static int removeTrailingZeroes(int n) {
        return n >> Integer.numberOfTrailingZeros(n);
    }

    private static int fillLeftmostZero(int n) {
        return n | n >> 1;
    }
}
