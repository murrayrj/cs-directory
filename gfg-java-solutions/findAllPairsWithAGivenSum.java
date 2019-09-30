import java.util.*;
import java.lang.*;
import java.io.*;

class findAllPairsWithAGivenSum {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int t = Integer.parseInt(br.readLine());
            while (t-- > 0) {
                String input[] = br.readLine().split(" ");
                int sizeA = Integer.parseInt(input[0]);
                int sizeB = Integer.parseInt(input[1]);
                int givenSum = Integer.parseInt(input[2]);
                int a[] = new int[sizeA];
                int b[] = new int[sizeB];
                input = br.readLine().split(" ");
                for (int i = 0; i < sizeA; i++) {
                    a[i] = Integer.parseInt(input[i]);
                }
                input = br.readLine().split(" ");
                for (int i = 0; i < sizeB; i++) {
                    b[i] = Integer.parseInt(input[i]);
                }
                Arrays.sort(b);
                HashSet<Integer> hashSet = new HashSet<Integer>();
                for (int i = 0; i < sizeA; i++) {
                    hashSet.add(a[i]);
                }
                int c = 0;
                boolean found = false;
                for (int i = sizeB - 1; i >= 0; i--) {
                    int complement = givenSum - b[i];
                    if (hashSet.contains(complement)) {
                        found = true;
                        if (c != 0) {
                            System.out.print(", " + complement + " " + b[i]);
                        } else {
                            c++;
                            System.out.print(complement + " " + b[i]);
                        }
                    }
                }
                if (found == false) {
                    System.out.println(-1);
                } else {
                    System.out.println();
                }
            }
        }
    }
}