/**
 * file: AsciiCode.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 2
 * due date:February 7, 2017 @ 18:30
 * version: 1.0
 *
 * This program prompts the user to input an ASCII code and outputs the
 * appropriate character for the ASCII code. 
 */
/**
 * AsciiCode
 * 
 * This class outputs an character for an ASCII code by using (char) in the 
 * System.out.println.
 */
 
import java.util.Scanner;
public class AsciiCode {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a ADCII code: ");
    int num = input.nextInt();
    
    // Using (char) finds the character for the inputted ASCII code.
    System.out.println("The character for ASCII code " + num + " is " + (char) 
    num);
  }
}