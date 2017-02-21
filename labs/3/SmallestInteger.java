/**
 * file: SmallestInteger.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 3
 * due date: February 21, 2017 @ 18:30
 * version: 1.0
 *
 * 
 */
/**
 * SmallestInteger
 * 
 * 
 */

public class SmallestInteger {
  public static void main(String[] args) {
    int n = 0;
    
    while(Math.pow(n, 2) < 12000) {
      n++;
    }
    
    System.out.println("The smallest integer, such that n^2 is greater than" + 
    " 12,000, is " + n);
  }
}