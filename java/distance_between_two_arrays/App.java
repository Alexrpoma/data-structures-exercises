package distance_between_two_arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
  public static void main(String[] args) {
    int[] numbersA = {23, 12, 4, 41, 5, 84, 37, 16, 7};
    int[] numbersB = {86, 34, 57, 4, 56, 83, 21, 49, 21};
    maxDistance0(numbersA, numbersB);
    maxDistance1(numbersA, numbersB);
    maxDistance2(numbersA, numbersB);
  }
  private static void maxDistance0(int[] numbersA, int[] numbersB) {
    int max = Integer.MIN_VALUE;
    int indexA = 0;
    int indexB = 0;
    for(Integer numberA : numbersA) {
      for(Integer numberB: numbersB) {
        int result = Math.abs(numberA - numberB);
        if(result > max) {
          max = result;
          indexA = numberA;
          indexB = numberB;
        }
      }
    }
    System.out.printf("""
        Max distance: %d
        Element A: %d
        Element B: %d
        %n""", max, indexA, indexB);
  }
  private static void maxDistance1(int[] numbersA, int[] numbersB) {
    Arrays.sort(numbersA);
    Arrays.sort(numbersB);
    int res0 = numbersA[numbersA.length -1] - numbersB[0];
    int res1 = numbersB[numbersB.length -1] - numbersA[0];
    System.out.println("Max: " + Math.max(res0, res1));
  }
  private static void maxDistance2(int[] numbersA, int[] numbersB) {
    int maxA = Arrays.stream(numbersA).max().orElse(0);
    int minA = Arrays.stream(numbersA).min().orElse(0);
    int maxB = Arrays.stream(numbersB).max().orElse(0);
    int minB = Arrays.stream(numbersB).min().orElse(0);
    System.out.println("Max: " + Math.max((maxA - minB), (maxB - minA)));
  }
}
