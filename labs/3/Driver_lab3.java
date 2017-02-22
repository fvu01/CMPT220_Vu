/**
 * file: Driver_lab3.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 3
 * due date: February 21, 2017 @ 18:30
 * version: 1.0
 *
 * This program calculates p-norm by taking multiple sets of inputs, each of 
 * which contains two sets of points and a p-value.
 */
/**
 * Driver_lab3
 * 
 * This class uses double inputs and the scanner to calculate p-norm. A 
 * while-loop is used to to check each input and to allow for continued inputs
 * and outputs until a 0 is entered, closing the scanner and ending the program.
 */

import java.util.Scanner;
public class Driver_lab3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    while(true) {
      double x1 = scan.nextDouble(); 
      // scan.nextDouble() scans each line rather than a single line input
      
      if (x1 == 0) // Ends the program when a 0 in inputted
        break;
      double y1 = scan.nextDouble();
      double x2 = scan.nextDouble();
      double y2 = scan.nextDouble();
      double p = scan.nextDouble();
	
      System.out.printf( "%.5f" , Math.pow(Math.pow(Math.abs(x1 - x2) , p) + 
      Math.pow(Math.abs(y1 - y2), p), 1 / p));
      // Calculates p-norm through the formula

      System.out.println(); // prints an empty line for the next input
    }
    
    scan.close(); // Closes the scanner
	}
}