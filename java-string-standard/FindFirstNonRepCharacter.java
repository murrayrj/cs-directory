import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.concurrent.atomic.AtomicInteger;

public class FindFirstNonRepCharacter {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String string;
            while ((string = br.readLine()) != null) {
                Character firstUniqueChar = getFirstUniqueChar(string);
                if (firstUniqueChar != null) {
                    System.out.println("Character is " + firstUniqueChar);
                } else {
                    System.out.println("No non-repeating character found");
                }
            }
        }
    }

    private static char getFirstUniqueChar(String string) {
        Map<Character, AtomicInteger> charMap = new LinkedHashMap<Character, AtomicInteger>();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            AtomicInteger n = charMap.get(c);
            if (n == null) {
                n = new AtomicInteger(0);
                charMap.put(c, n);
            }
            n.incrementAndGet();
        }

        for (Map.Entry<Character, AtomicInteger> entry : charMap.entrySet()) {
            if (entry.getValue().get() == 1) {
                return entry.getKey();
            }
        }
        throw new RuntimeException("No non-repeated characters found");
    }
}