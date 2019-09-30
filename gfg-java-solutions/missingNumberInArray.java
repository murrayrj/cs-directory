import java.util.*;
import java.lang.*;
import java.io.*;

class missingNumberInArray {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    while (t-- > 0) {
      int size = s.nextInt();
      int expectedSum = size * (size + 1) / 2;
      int actualSum = 0;
      for (int i = 0; i < size - 1; i++) {
        actualSum += s.nextInt();
      }
      System.out.println(expectedSum - actualSum);
    }
  }
}