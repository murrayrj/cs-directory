import java.util.*;
import java.lang.*;
import java.io.*;

class SumNaturalNumbers {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    int number = Integer.parseInt(line);
                    System.out.println(sumOfNumbers(number));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please try again");
                }
            }
        }
    }

    private static int sumOfNumbers(int number) {
        return number * (number + 1) / 2;
    }
}
