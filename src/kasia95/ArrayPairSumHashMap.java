package kasia95;

import java.util.HashMap;
import java.util.Map;

public class ArrayPairSumHashMap {

  public static void main(String[] args) {

    int[] a = {1, 2, 10, 3, 7, 5, 6, 6, 13, 0};
    printSumPairsHashMap(a, 13);
  }

  public static void printSumPairsHashMap(int[] inputnum, int k) {
    Map<Integer, Integer> twopairs = new HashMap<Integer, Integer>();

    for (int i = 0; i < inputnum.length; i++) {

      if (twopairs.containsKey(inputnum[i])) System.out.println(inputnum[i] + ", " + twopairs.get(inputnum[i]));
      else twopairs.put(k - inputnum[i], inputnum[i]);
    }
  }
}
