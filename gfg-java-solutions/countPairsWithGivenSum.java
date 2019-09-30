import java.util.*;
import java.lang.*;
import java.io.*;

class countPairsWithGivenSum {
  public static void main(String[] args) {
    int t, size, sum;
    Scanner s = new Scanner(System.in);
    t = s.nextInt();
    while (t-- > 0) {
      size = s.nextInt();
      sum = s.nextInt();
      int count = 0;
      int array[] = new int[size];
      HashMap<Integer, Integer> map = new HashMap<>();
      for (int i = 0; i < size; i++) {
        array[i] = s.nextInt();
      }
      for (int j = 0; j < size; j++) {
        int i = array[j];
        Integer val = map.get(sum - i);
        if (val != null) {
          count += val;
        }
        if (map.get(i) != null) {
          map.put(i, map.get(i) + 1);
        } else {
          map.put(i, 1);
        }
      }
      System.out.println(count);
    }
  }
}