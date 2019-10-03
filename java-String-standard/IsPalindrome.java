import java.io.*;
import java.util.*;

public class IsPalindrome {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (isPalindrome(line)) {
                    System.out.println("✓ Is a palindrome");
                } else {
                    System.out.println("Not a palindrome");
                }
            }
        }
    }

    private static boolean isPalindrome(String s) {
        char[] charMap = new char[256];
        for (int i = 0; i < 10; i++) {
            charMap['0' + i] = (char) (1 + i);  // numeric - don't use 0 as it's reserved for illegal chars
        }
        for (int i = 0; i < 26; i++) {
            charMap['a' + i] = charMap['A' + i] = (char) (11 + i);  //alphabetic, ignore cases, continue from 11
        }
        for (int start = 0, end = s.length() - 1; start < end; ) {
            if (charMap[s.charAt(start)] == 0) {
                start++;
            } else if (charMap[s.charAt(end)] == 0) {
                end--;
            } else if (charMap[s.charAt(start++)] != charMap[s.charAt(end--)]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindromeWithMethods(String s) {
        char[] charArray = s.toCharArray();
        for (int start = 0, end = charArray.length - 1; start < end; ) {
            if (!Character.isLetterOrDigit(charArray[start])) {
                start++;
            } else if (!Character.isLetterOrDigit(charArray[end])) {
                end--;
            } else if (Character.toLowerCase(charArray[start++]) != Character.toLowerCase(charArray[end--])) {
                return false;
            }
        }
        return true;
    }
}
