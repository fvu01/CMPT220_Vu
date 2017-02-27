/**
 * file: BubbleSort.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 4
 * due date: February 28, 2017 @ 18:30
 * version: 1.0
 *
 *
 */
/**
 * BubbleSort
 * 
 *
 */

import java.util.Scanner;
public class BubbleSort {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter ten numbers: ");
    double[] n = new double[10];
    
    for(int i = 0; i < n.length; i++) {
      n[i] = input.nextDouble();
    }
    bubbleSort(n);
    
    System.out.println("The sorted array is:");
    for(int i = 0; i < n.length; i++) {
      System.out.println(n[i]);
    }
  }
  
  public static void bubbleSort(double[] numbers) {
    int n = numbers.length-1;
    
    while(n != 0) {
      int i;
      for(i = 0; i < n; i++) {
        if(numbers[i] > numbers[i+1]) {
          double value = numbers[i];
          numbers[i] = numbers[i+1];
          numbers[i+1] = value;
        }
      }
      n = i - 1;
    }
  }
}