/**
 * file: NumberAverage.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 3
 * due date: February 21, 2017 @ 18:30
 * version: 1.0
 *
 * This program prompts the user to input integers, either positive or negative,
 * it doesn't matter. The number of positive and negative numbers are counted, 
 * and the total number of each along with the sum and the average is outputted.
 */
/**
 * NumberAverage
 * 
 * This class utilizes a do-while loop and if-else statements to count positive 
 * and negative numbers. A boolean value is used to determine whether or not the
 * program ends immediately based off of the input. A total number of positive 
 * numbers, negative numbers, the sum, and the average is outputted.
 */
 
import java.util.Scanner;
public class NumberAverage {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
     
    System.out.print("Enter an integer, the input ends if it is 0: ");
    
    int n, posCount = 0, negCount = 0;
    float sum = 0; // The sum is a float value
    boolean zero = false; // This detects if a 0 is inputted to end the program.
     
    do {
      n = input.nextInt();
      if(n > 0) { // If the n is > 0, then it is a + # and 1 is + to posCount
        posCount++; 
        sum += n; // 1 is added to the sum every time there is a positive
      }
      else if(n < 0) {
        negCount++; // If n is < 0, the it is a - # and 1 is + to negCount
        sum += n; // 1 is added to the sum every time there is a negative
      }
    } while (n != 0); // This loop only occurs when n is not = to 0.
     
    // outputs the # of +, -, the sum as a floating point #, and the average 
    if(sum != 0) { 
      System.out.println("The number of positives is " + posCount);
      System.out.println("The number of negatives is " + negCount);
      System.out.println("The total is " + sum);
      System.out.println("The average is " + (sum/(posCount + negCount)));
    }
    else {
      zero = true;// When a 0 is inputted then the boolean is true; program ends
      System.out.println("No numbers are entered except 0");
      System.exit(0);
    }  
  }
}