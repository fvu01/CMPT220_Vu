/**
 * file: SumDigits.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 3
 * due date: February 21, 2017 @ 18:30
 * version: 1.0
 *
 * 
 */
/**
 * SumDigits
 * 
 * 
 */
 
import java.util.Scanner;
public class SumDigits {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter an integer: ");
    long n = input.nextLong();
    
    System.out.print("The sum of the digits is " + sumDigits(n));
  }
  
  public static int sumDigits(long n) {
    int sum = 0;
    
    while(n != 0) {
      sum += n % 10;
      n = n / 10;
    }
    return sum;
  }
}