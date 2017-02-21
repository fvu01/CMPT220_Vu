/**
 * file: LargestInteger.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 3
 * due date: February 21, 2017 @ 18:30
 * version: 1.0
 *
 * 
 */
/**
 * LargestInteger
 * 
 * 
 */
 
public class LargestInteger {
  public static void main(String[] args) {
    int n = 0;
    
    while(Math.pow(n, 3) < 12000) {
      n++;
    }
    n--;
    
    System.out.println("The largest integer, such that n^3 is less than 12,000 "
    + "is " + n);
  }
}