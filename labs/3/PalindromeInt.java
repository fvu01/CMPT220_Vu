/**
 * file: PalindromeInt.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 3
 * due date: February 21, 2017 @ 18:30
 * version: 1.0
 *
 * This program prompts the user to input a number. If the reverse of the 
 * inputted number is the same as the number, then it is a palindrome. It is 
 * outputted to the user whether or not the number is a palindrome.
 */
/**
 * PalindromeInt
 * 
 * This class uses the method, public static int reverse(int number), to check
 * the reverse of the inputted number. The other method, public static boolean
 * isPalindrome(int number), returns that is a number is a palindrome is the 
 * number is = to the reverse of the number.
 */

import java.util.Scanner;
public class PalindromeInt {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a integer: ");
    int n = input.nextInt();

    if(isPalindrome(n)) // outputs if the inputted number is a palindrome or not
      System.out.println(n + " is a palindrome.");
    else 
    System.out.println(n + " is not a palindrome.");
  }
  
  public static int reverse(int number) {
    // This method check if a number is a palindrome by reversing it.
    
    int reverse = 0;
    
    while(number != 0) {
      reverse = reverse * 10;
      reverse += number % 10;
      number = number / 10;
    }
    return reverse;
  }
  
  public static boolean isPalindrome(int number) {
    return (number == reverse(number));
    // If the reverse of a # is the same as the #, then it's a palindrome
  }
}