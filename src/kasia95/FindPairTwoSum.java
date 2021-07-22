package kasia95;

import java.util.Arrays;

import java.util.Scanner;

public class FindPairTwoSum {

  public static void findPair2(int Arraynum[], int sum) {
    Arrays.sort(Arraynum); // First sort the array

    int low = 0;
    int high = Arraynum.length - 1;

    while (low < high) {
      if (Arraynum[low] + Arraynum[high] == sum) {
        Arrays.sort(Arraynum);
        System.out.println("Sum found numbers are " + Arraynum[low] + " and " + Arraynum[high]);
        low++;
      } else if (Arraynum[low] + Arraynum[high] < sum) {
        low = low + 1;
      } else {
        high = high - 1;
      }
    }
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the length of the array:");
    int length = s.nextInt();
    int[] myArray = new int[length];
    System.out.println("Enter the elements of the array:");

    for (int i = 0; i < length; i++) {
      myArray[i] = s.nextInt();
    }
    System.out.println("Give sum for sum up ");
    int sum = s.nextInt();

    findPair2(myArray, sum);
  }
}