package anagram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class App {
  public static void main(String[] args) {
    String wordA = "sadder";
    String wordB = "dreads";
    isAnagram(wordA, wordB);
    lettersCounter(wordA, wordB);
  }
  private static void isAnagram(String wordA, String wordB) {
    String[] listA = wordA.toLowerCase().split("");
    String[] listB = wordB.toLowerCase().split("");
    Arrays.sort(listA);
    Arrays.sort(listB);
    System.out.printf("%s is an Anagram of %s? -> %b%n",wordA, wordB, Arrays.equals(listA, listB));
  }
  private static void lettersCounter(String wordA, String wordB) {
    char[] listA = wordA.toCharArray();
    char[] listB = wordB.toCharArray();
    Map<Character, Integer> mapA = new HashMap<>();
    Map<Character, Integer> mapB = new HashMap<>();
    for(char letter : listA) {
    	if(mapA.containsKey(letter)){
        mapA.replace(letter, (mapA.get(letter) + 1));
      }
      else {
        mapA.put(letter, 1);
      }
    }
    for(char letter : listB) {
    	if(mapB.containsKey(letter)){
        mapB.replace(letter, (mapB.get(letter) + 1));
      }
      else {
        mapB.put(letter, 1);
      }
    }
    System.out.println(mapA);
    System.out.println(mapB);
    System.out.println(mapA.equals(mapB));
  }
}
