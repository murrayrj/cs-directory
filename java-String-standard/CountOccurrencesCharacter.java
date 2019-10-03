import java.io.*;
import java.util.*;

public class CountOccurrencesCharacter {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] pair = line.split("\\|", -1);
                char characterToCount = pair[0].charAt(0);
                String string = pair[1];
                countOccurrences(string, characterToCount);
            }
        }
    }

    private static void countOccurrences(String string, char specificChar) {
        long count = string.chars().filter(ch -> Character.toLowerCase(ch) == specificChar).count();
        System.out.println(count);
    }
}