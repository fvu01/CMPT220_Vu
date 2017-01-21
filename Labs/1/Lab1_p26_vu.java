/**
 * file: lab1_p26_vu.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 1
 * due date: January 24, 2017 @ 18:30
 * version: 1.0
 *
 * This file calculates the sum of the digits within a number.
 */
/**
 * Lab1_p26_vu
 * 
 * This class outputs a sum which is made up of the numbers within an integer
 * variable.
 */

import java.util.Scanner;
// This imports the Scanner class for console input. 

public class Lab1_p26_vu {
  private static Scanner input;
  public static void main(String[] args) {
    input = new Scanner(System.in);
    
    System.out.print("Enter a number between 0 and 1000: ");
    int number = input.nextInt();
    
    int firstNumber = number % 10;
    int remainder = number / 10;
    int secondNumber = remainder % 10;
    remainder = remainder / 10;
    int thirdNumber = remainder % 10;
    /* Each individual number is made into integer variables and they are 
       divided by 10 using / and the modulo % for remainders. */
    
    int sum = firstNumber + secondNumber + thirdNumber;
    /* This makes sum an integer variable and adds each individual number to
       create a sum. */ 
    
    System.out.println("The sum of the digits is " + sum + ".");
  }
}