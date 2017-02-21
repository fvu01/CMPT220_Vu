/**
 * file: SmallestInteger.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 3
 * due date: February 21, 2017 @ 18:30
 * version: 1.0
 *
 * The program ouputs the smallest integer which is greater than 12000 when ^2.
 */
/**
 * SmallestInteger
 * 
 * This class uses a while loop and Math.pow to output the smallest integer 
 * which is greater than 12000 when squared.
 */

public class SmallestInteger {
  public static void main(String[] args) {
    int n = 0;
    
    // Loops n^2 to check if it is < 12000
    while(Math.pow(n, 2) < 12000) { 
      n++;
    }
    
    System.out.println("The smallest integer, such that n^2 is greater than" + 
    " 12,000, is " + n); 
    // The smallest integer when squared that is greater than 12000 is outputted
  }
}