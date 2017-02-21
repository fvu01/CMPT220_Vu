/**
 * file: PhoneKeyPad.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 2
 * due date:February 7, 2017 @ 18:30
 * version: 1.0
 *
 * This progam prompts the user to enter a letter, and the corresponding number
 * from a keypad is outputted.
 */
/**
 * PhoneKeyPad
 * 
 * This class uses if-else statements to output a number depending on the letter
 * inputted by the user. 
 */
 
import java.util.Scanner;
public class PhoneKeyPad {
  private static final int INVALID_KEY = -1; // This identifies invalid inputs.
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a letter: ");
    char letter = input.next().charAt(0);
    
    int numberPressed = correspondingNumber(letter);
    
    /* This if-else statement outputs the corresponding number to the inputted 
       letter. If the input is not a letter, then it is invalid. */
    if(numberPressed != INVALID_KEY) {
      System.out.println("The corresponding number is " + numberPressed);
    }
    else {
      System.out.println(letter + " is an invalid input.");
    }
  }
  public static int correspondingNumber(char letter) {
    /* If an lowercase letter in inputted, this makes it uppercase so that it a
       valid input. */    
    letter = Character.toUpperCase(letter);
    
    /* Depending on the letter, the corresponding number is returned through 
       these if statements. */
    if(letter >= 'A' && letter <= 'C')
      return 2;
    if(letter >= 'D' && letter <= 'F')
      return 3;
    if(letter >= 'G' && letter <= 'I') 
      return 4;
    if(letter >= 'J' && letter <= 'L') 
      return 5;
    if(letter >= 'M' && letter <= 'O') 
      return 6;
    if(letter >= 'P' && letter <= 'S') 
      return 7;
    if(letter >= 'T' && letter <= 'V') 
      return 8;
    if(letter >= 'W' && letter <= 'Z') 
      return 9;
    
    return INVALID_KEY;
  }
}