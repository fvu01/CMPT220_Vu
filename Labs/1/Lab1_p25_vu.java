/**
 * file: lab1_p25_vu.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 1
 * due date: January 24, 2017 @ 18:30
 * version: 1.0
 *
 * This file calculates a grand total by multiplying and adding a gratuity rate
 * to a subtotal.
 */
/**
 * 
 * Lab1_p25_vu
 * 
 * This class takes an inputted gratuity rate and a subtotal and calculates the 
 * total amount of gratuity. It then also calculates the grand total based off 
 * of the subtotal and the calculated amount of gratuity. 
 * 
 */

import java.util.Scanner;
// This imports the Scanner class for console input.

public class Lab1_p25_vu {
  private static Scanner input;
  public static void main(String[] args) {
    input = new Scanner(System.in);
    
    System.out.print("Enter the subtotal and a gratuity rate: ");
    /* This prompts the user to enter two numbers, the subtotal and gratuity 
       rate. */
    
    double subtotal = input.nextDouble();
    double gratuityRate = input.nextDouble();
    /* Both subtotal and gratuityRate are assigned as variables and made so that
       that can be assigned a number from the keyboard. */
    
    double gratuityTotal = subtotal * gratuityRate * .01;
    /* This calculates the total gratuity by multiplying the inputted subtotal 
       and gratuity by eachother and by .01. */
    
    double total = subtotal + gratuityTotal;
    /* This adds the original subtotal along with the newly calculated total 
       gratuity to create the grand total. */
    
    System.out.println("The gratuity is $" + gratuityTotal + " and the total is $"
    + total + ".");
    /* This outputs the final result in the form of a sentence and shows the 
       total along with the calculated amount of gratuity. */
  }
}