package distance_between_two_lists;

import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    List<Integer> numberA = new ArrayList<>(List.of(23, 4, 51, 34, 59, 29, 3));
    List<Integer> numberB = new ArrayList<>(List.of(53, 12, 89, 70, 31, 67, 20));
    minDistance(numberA, numberB);
  }
  private static void minDistance(List<Integer> numbersA, List<Integer> numbersB) {
    int min = Integer.MAX_VALUE;
    int ElmA = 0;
    int ElmB = 0;
    for(int numberA : numbersA) {
      for(int numberB : numbersB) {
        int res = Math.abs(numberA - numberB);
        if(res < min) {
          min = res;
          ElmA = numberA;
          ElmB = numberB;
        }
      }
    }
    System.out.printf("""
        Min distance: %d
        Element A: %d
        Element b: %d
        %n""", min, ElmA, ElmB);
  }
}
