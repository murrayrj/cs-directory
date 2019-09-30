import java.util.*;
import java.lang.*;
import java.io.*;

class maximumDifference {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int t = Integer.parseInt(br.readLine());
            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine());
                int arr[] = new int[n];
                int maxDiff = Integer.MIN_VALUE;
                String str = br.readLine();
                String ar[] = str.trim().split(" ");
                for (int i = 0; i < n; i++) {
                    arr[i] = Integer.parseInt(ar[i]);
                }
                int minTillNow = arr[0];
                for (int i = 1; i < n; i++) {
                    maxDiff = Math.max(maxDiff, arr[i] - minTillNow);
                    minTillNow = Math.min(minTillNow, arr[i]);
                }
                System.out.println(maxDiff);
            }
        }
    }
}