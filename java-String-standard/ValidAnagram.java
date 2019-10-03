import java.io.*;
import java.util.*;

public class ValidAnagram {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] pair = line.split("\\|", -1);
                if (isAnagram(pair[0], pair[1])) {
                    System.out.println("✓ Is anagram");
                } else {
                    System.out.println("Not anagrams");
                }
            }
        }
    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] hash = new int[26];
        for (Character character : s.toCharArray()) {
            hash[character - 'a']++;
        }
        for (Character character : t.toCharArray()) {
            if (hash[character - 'a'] == 0) {
                return false;
            }
            hash[character - 'a']--;
        }
        return true;
    }
}