import java.io.*;
import java.util.*;

public class Permutations {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
                Set<String> uniqueStrings = new HashSet<>();
                String str = line;
                permute("", str, uniqueStrings);
            }
        }
    }

    private static void permute(String prefix, String str, Set<String> set) {
        int n = str.length();
        if (n == 0) {
            if (!set.contains(prefix)) {
                System.out.println(prefix);
                set.add(prefix);
            }
        } else {
            for (int i = 0; i < n; i++)
                permute(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), set);
        }
    }
}