package basic_calculator;

import java.util.stream.IntStream;

public class App {
  public static void main(String[] args) {
    multiply(20, 5);
    division(50, 6);
  }
  private static void multiply(int a, int b) {
    // without * sign
    int res = 0;
    for(int i = 0; i < b; i++) {
      res += a;
    }
    System.out.println("Result: " + res);
  }
  private static void division(int a, int b) {
    // a % b
    int rest = a;
    int result = 0;
    while(rest >= b) {
      rest = rest - b;
      ++result;
    }
    System.out.println("Result division: " + result);
  }
}
