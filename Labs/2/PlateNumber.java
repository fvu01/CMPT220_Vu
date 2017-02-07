/**
 * file: PlateNumber.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 2
 * due date:February 7, 2017 @ 18:30
 * version: 1.0
 *
 * This java program generates a random license plate number, assuming that a 
 * license plate begins with three letters and ends with four numbers. 
 */
/**
 * PlateNumber
 * 
 * This class generates a three random letters and four random numbers using the
 * Math.random() function to create a license plate number.
 */
 
public class PlateNumber {
  public static void main(String[] args) {
    
    // This generates the random letters .
    char letter1 = (char) ((int) (Math.random() * 26 + 65));
    char letter2 = (char) ((int) (Math.random() * 26 + 65));
    char letter3 = (char) ((int) (Math.random() * 26 + 65));
    
    // This generates the random numbers.
    int numbers = (int) (Math.random() * 10000);
    
    // This formats the generated integers into a four-digit string.
    String stringNums = String.format("%04d", numbers);
    
    System.out.println("The plate number is " + letter1 + letter2 + letter3 +
    numbers);
  }
}