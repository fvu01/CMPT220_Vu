/**
 * file: BubbleSort.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 4
 * due date: February 28, 2017 @ 18:30
 * version: 1.0
 *
 * This program takes an input of 10 integers and places them into an array. 
 * The array is then sorted using the bubble-sort method. 
 */
/**
 * BubbleSort
 * 
 * This class uses for-loops within the main method to initialize each input 
 * into the array n. The sorted array is also printed through the main method.
 * The method bubbleSort is used to sort the array by checking each individual
 * number. If one is greater than the next, then they are swapped or vice versa
 * depending on the order of the numbers. 
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
    bubbleSort(n); // sorts array n with the method bubbleSort from below
    
    System.out.print("Bubble-sorted array: ");
    for(int i = 0; i < n.length; i++) {
      System.out.print(n[i] + " ");
    }
  }
  
  /**
   * bubbleSort
   *
   * sorts the double array numbers from the array, numbers, using the bubble 
   * sort method
   *
   * Parameters: 
   *  numbers: the double array of inputted numbers which is bubble-sorted
   */
  public static void bubbleSort(double[] numbers) {
    int n = numbers.length-1;
    
    while(n != 0) { // loops and sorts array as long as there there is input > 0
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