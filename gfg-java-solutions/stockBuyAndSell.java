import java.util.*;
import java.lang.*;
import java.io.*;

class stockBuyAndSell {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int t = Integer.parseInt(br.readLine());
            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine());
                int arr[] = new int[n];
                String str[] = br.readLine().trim().split(" ");
                for (int i = 0; i < n; i++) {
                    arr[i] = Integer.parseInt(str[i]);
                }
                int i = 1;
                String ans = "";
                while (i < n) {
                    while (i < n && arr[i - 1] >= arr[i]) {
                        i++;
                    }
                    if (i != n) {
                        ans = ans + "(" + (i - 1) + " ";
                    }
                    i++;
                    while (i < n && arr[i - 1] < arr[i]) {
                        i++;
                    }
                    if (i != n + 1) {
                        ans = ans + (i - 1) + ") ";
                    }
                    i++;
                }
                if (ans.length() != 0) {
                    System.out.println(ans);
                } else {
                    System.out.println("No Profit");
                }
            }
        }
    }
}