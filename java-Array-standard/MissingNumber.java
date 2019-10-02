import java.util.*;
import java.lang.*;
import java.io.*;

class MissingNumber {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String string;
            while ((string = br.readLine()) != null) {
                int[] numbers = Arrays.stream(string.split("\\s")).mapToInt(Integer::parseInt).toArray();
                System.out.println(missingNumber(numbers));
            }
        }
    }

    private static int missingNumber(int[] nums) {
        int expectedSum = (nums.length + 1) * (nums.length + 2) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}