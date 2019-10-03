import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class FindDuplicateNumbers {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String string;
            while ((string = br.readLine()) != null) {
                int[] numbers = Arrays.stream(string.split("\\s")).mapToInt(Integer::parseInt).toArray();
                duplicateNumbers(numbers);
            }
        }
    }

    private static void duplicateNumbers(int[] numbers) {
        Map<Integer, AtomicInteger> numberAndCount = new HashMap<>();
        for (Integer number : numbers) {
            AtomicInteger count = numberAndCount.get(number);
            if (count == null) {
                count = new AtomicInteger(0);
                numberAndCount.put(number, count);
            }
            count.incrementAndGet();
        }
        Set<Map.Entry<Integer, AtomicInteger>> entrySet = numberAndCount.entrySet();
        for (Map.Entry<Integer, AtomicInteger> entry : entrySet) {
            if (entry.getValue().get() > 1) {
                System.out.println("Duplicate element from array : " + entry.getKey());
            }
        }
    }
}