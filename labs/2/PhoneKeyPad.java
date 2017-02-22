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
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a capital letter: ");
    
    String invalid = input.next();
    // Places the input in a string to identify invalid inputs
    
    char letter = invalid.toUpperCase().charAt(0);
    // Makes the input an uppercase letter
    
    int number;
    
    //The switch-case checks the inputted letter and assigns a numbers to it.
    switch(letter) {  
      case 'A':        
      case 'B':
      case 'C':
        number = 2;
        break; 
      case 'D':
      case 'E':
      case 'F':
        number = 3;
        break;
      case 'G':
      case 'H':
      case 'I':
        number = 4;
        break;
      case 'J':
      case 'K':
      case 'L':
        number = 5;
        break;
      case 'M':
      case 'N':
      case 'O':
        number = 6;
        break;
      case 'P':
      case 'Q':
      case 'R':
      case 'S':
        number = 7;
        break;
      case 'T':
      case 'U':
      case 'V':
        number = 8;
        break;
      case 'W':
      case 'X':
      case 'Y':
      case 'Z':
        number = 9;
        break;
      default:
        number = 0;
        break;
    }
    
    if(number != 0) { // Outputs the keypad number for each letter
      System.out.print("The corresponding number is " + number);
      System.exit(0);
    }
    
    // Outputs invalid key
    System.out.print(invalid + " is an invalid input");
  }
}