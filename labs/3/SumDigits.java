/**
 * file: SumDigits.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 3
 * due date: February 21, 2017 @ 18:30
 * version: 1.0
 *
 * This program prompts the user to enter an integer. The digits from the 
 * integer are added together and the sum is outputted. 
 */
/**
 * SumDigits
 * 
 * This class uses the method, public static in sumDigits(long n), to calculate
 * the sum of digits and returns the sum. 
 */
 
import java.util.Scanner;
public class SumDigits {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter an integer: ");
    long n = input.nextLong();
    
    System.out.print("The sum of the digits is " + sumDigits(n));
  }
  
  /**
   * sumDigits
   *
   * finds each individual digit within a larger digit such as 25 or 988 and 
   * counts those individual digits to find the sum of the whole digit
   *
   * Parameters:
   *  n: The digit in which the individual digits are checked and added together
   *
   * Return value: The sum of the digits from the main digit in which the 
   * numbers are added together.
   */
  public static int sumDigits(long n) { 
  // This method is used to return the sum of all the digits the user inputs.
    int sum = 0;
    
    while(n != 0) { // Takes each individual digit so that they can be added.
      sum += n % 10;
      n = n / 10;
    }
    return sum;
  }
}