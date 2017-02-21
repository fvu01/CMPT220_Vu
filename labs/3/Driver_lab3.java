/**
 * file: Driver_lab3.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 3
 * due date: February 21, 2017 @ 18:30
 * version: 1.0
 *
 * 
 */
/**
 * Driver_lab3
 * 
 * 
 */

import java.util.Scanner;
public class Driver_lab3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter two sets of points followed by a p-value: ");
    // x1 y1 x2 y2 p
   
    double x1, y1, x2, y2, p;
    x1 = input.nextDouble();
    y1 = input.nextDouble();
    x2 = input.nextDouble();
    y2 = input.nextDouble();
    p = input.nextDouble();
    
    double pNorm = 0;
    while(x1 != 0){
      pNorm = Math.pow((Math.pow(Math.abs(x1-x2),p) + Math.pow(Math.abs(y1-y2), 
      p)), 1/p);
      break;
    } 
    System.out.printf("%.10f\n", pNorm);
  }
}