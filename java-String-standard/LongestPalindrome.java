import java.io.*;
import java.util.*;

public class LongestPalindrome {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String string;
            while ((string = br.readLine()) != null) {
                System.out.println(getPalindrome(string));
            }
        }
    }

    private static String getPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        int start = 0;
        int end = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (i - j <= 2 || dp[j + 1][i - 1]) {
                        dp[j][i] = true;
                    }
                }
                if (i - j + 1 > max) {
                    if (dp[j][i]) {
                        max = i - j + 1;
                        start = j;
                        end = i;
                    }
                }
            }
        }
        return s.substring(start, end + 1);
    }
}