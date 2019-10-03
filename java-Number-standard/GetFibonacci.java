import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class GetFibonacci {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    int n = Integer.parseInt(line);
                    System.out.println("F(" + n + ") = " +  nthFibonacciNumber(n));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please try again");
                }
            }
        }
    }

    private static int nthFibonacciNumber(int number) {
        Stream<int[]> stream = Stream.iterate(new int[]{0, 1}, pairFibonacci -> new int[]{pairFibonacci[1], pairFibonacci[0] + pairFibonacci[1]});
        return stream.limit(number).skip(number - 1).findFirst().get()[1];
    }
}