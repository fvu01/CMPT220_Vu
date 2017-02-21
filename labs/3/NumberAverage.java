/**
 * file: NumberAverage.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 3
 * due date: February 21, 2017 @ 18:30
 * version: 1.0
 *
 * 
 */
/**
 * NumberAverage
 * 
 * 
 */
 
import java.util.Scanner;
public class NumberAverage {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
     
    System.out.print("Enter an integer, the input ends if it is 0: ");
    
    int n, posCount = 0, negCount = 0;
    float sum = 0;
    boolean zero = false;
     
    do {
      n = input.nextInt();
      if(n > 0) {
        posCount++;
        sum += n;
      }
      else if(n < 0) {
        negCount++;
        sum += n;
      }
    } while (n != 0); 
     
    if(sum != 0) {
      System.out.println("The number of positives is " + posCount);
      System.out.println("The number of negatives is " + negCount);
      System.out.println("The total is " + sum);
      System.out.println("The average is " + (sum/(posCount + negCount)));
    }
    else {
      zero = true;
      System.out.println("No numbers are entered except 0");
      System.exit(0);
    }  
  }
}