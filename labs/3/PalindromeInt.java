/**
 * file: PalindromeInt.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 3
 * due date: February 21, 2017 @ 18:30
 * version: 1.0
 *
 * 
 */
/**
 * PalindromeInt
 * 
 * 
 */

import java.util.Scanner;
public class PalindromeInt {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a integer: ");
    int n = input.nextInt();

    if(isPalindrome(n)) 
      System.out.println(n + " is a palindrome.");
    else 
    System.out.println(n + " is not a palindrome.");
  }
  
  public static int reverse(int number) {
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
  }
}