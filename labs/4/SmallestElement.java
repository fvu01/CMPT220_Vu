/**
 * file: SmallestElement.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 4
 * due date: February 28, 2017 @ 18:30
 * version: 1.0
 *
 *
 */
/**
 * SmallestElement
 * 
 *
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
  
  public static double min(double[] array) {
    double min = array[0];
    
    for(int i = 1; i < array.length; i++) {
      if(min > array[i])
        min = array[i];
    }
    return min;
  }
}