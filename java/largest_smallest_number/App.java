package largest_smallest_number;

import java.util.Collections;
import java.util.List;

public class App {
  public static void main(String[] args) {
    List<Integer> numbers = List.of(23, 2, 43, 29, 94, 23, 87, 53, -6);
    largestSmallestNumber(numbers);
  }
  private static void largestSmallestNumber(List<Integer> numbers) {
    // direct method
    System.out.println("Largest number: " + Collections.max(numbers));
    System.out.println("Smallest number: " + Collections.min(numbers));
    // custom method
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for(Integer number : numbers) {
      // max
      if(number > max) {
        max = number;
      }
      if(number < min) {
        min = number;
      }
    }
    System.out.println("Max: " + max);
    System.out.println("Min: " + min);
  }
}
