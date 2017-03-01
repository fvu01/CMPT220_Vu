/**
 * file: CountLetters.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 4
 * due date: February 28, 2017 @ 18:30
 * version: 1.0
 *
 * This program takes an inputted string from the user. The total numbers of 
 * letters within the string is counted and outputted to the user.
 */
/**
 * CountLetters
 * 
 * This class takes an inputted string. Through the method countLetters, the 
 * total number of letters within the string is counted. The method isLetter
 * verifies that each letter is in fact a letter so that it can be counted.
 */
 
import java.util.Scanner;
public class CountLetters {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a string: ");
    String s = input.nextLine();
    
    System.out.println("The number of letters in the string is: " + 
    countLetters(s));
  }
  
  /**
   * countLetters
   * 
   * This method counts the amount of letters within an inputted string.
   * The string is defined as int countLetters(s)
   *
   * Parameters:
   *  s: the string whose amount of numbers or characters is counted
   * 
   * Return value: the total of countLetter from the number of characters 
   * counted from the string
   */
  public static int countLetters(String s) {
    int countLetter = 0;
    
    for(int i = 0; i < s.length(); i++) {
      if(isLetter(s.charAt(i))) 
        countLetter++; // Loops and counts the number of letters in the string
    }
    return countLetter; 
  }
  
  /**
   * isLetter
   *
   * This is a boolean method which when true, returns characters ch as an 
   * upper-case letter. 
   * 
   * Parameters:
   *  ch: the characters to be returned
   * 
   * Return value: the letters from a to z to be counted in the if-statement in 
   * the previous method
   */
  public static boolean isLetter(char ch) {
    ch = Character.toLowerCase(ch);
    return((ch<='z' && ch>='a'));
  }
}