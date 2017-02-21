/**
 * file: LargestInteger.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 3
 * due date: February 21, 2017 @ 18:30
 * version: 1.0
 *
 * The program ouputs the largest integer which is less than 12000 when ^3.
 */
/**
 * LargestInteger
 * 
 * This class uses a while loop and Math.pow to output the largest integer 
 * which is less than 12000 when cubed.
 */
 
public class LargestInteger {
  public static void main(String[] args) {
    int n = 0;
    
    // Loops n^3 to check if it is < 12000
    while(Math.pow(n, 3) < 12000) {
      n++;
    }
    n--;
    
    System.out.println("The largest integer, such that n^3 is less than 12,000 "
    + "is " + n);
    // The largest integer when cubed that is less than 12000 is outputted
  }
}