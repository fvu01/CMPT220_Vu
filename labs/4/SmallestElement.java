/**
 * file: SmallestElement.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 4
 * due date: February 28, 2017 @ 18:30
 * version: 1.0
 *
 * This program takes an input of ten numbers and places them within an array. 
 * The smallest number within the array is outputted to the user.
 */
/**
 * SmallestElement
 * 
 * This class uses a double array for an input of 10 numbers. The method min is
 * used to find the smallest number within the array; that number is returned.
 */

import java.util.Scanner; 
public class SmallestElement {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter ten numbers: ");
    double[] n = new double[10];
    
    for(int i = 0; i < n.length; i++) {
      n[i] = input.nextDouble();
    }
    System.out.println("The minimum number is: " + min(n));
  }
  
  /**
   * min
   * 
   * find the smallest number or element within the array, numbers
   *
   * Parameters:
   *  numbers: the array of numbers in which the smallest element is found
   * 
   * Return value: min --> The smallest element of the array, numbers
   */
  public static double min(double[] numbers) {
    double min = numbers[0];
    
    for(int i = 1; i < numbers.length; i++) {
      if(min > numbers[i])
        min = numbers[i];
    }
    return min;
  }
}