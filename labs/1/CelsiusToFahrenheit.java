/**
 * file: CelsiusToFahrenheit.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 1
 * due date: January 24, 2017 @ 18:30
 * version: 1.0
 *
 * This file converts an inputted temperature in celsius to fahrenheit.
 */
/**
 * 
 * CelsiusToFahrenheit
 * 
 * This class has an output which asks for a degree in celsius and it converts 
 * that number into degrees in fahrenheit.
 * 
 */

import java.util.Scanner; 
// This imports the Scanner class for console input.

public class CelsiusToFahrenheit {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    // This initializes and inputs the scanner.
    
    System.out.print("Enter a degree in Celsius: "); 
    double celsius = input.nextDouble();
    
    
    double fahrenheit = (9.0/5.0) * celsius + 32.0; 
    // This code converts degrees celsius to degrees fahrenheit.
    System.out.println(celsius + " degrees celsius is equal to " + fahrenheit + 
    " degrees fahrenheit.");
  }
}