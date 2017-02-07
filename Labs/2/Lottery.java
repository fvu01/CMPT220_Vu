/**
 * file: Lottery.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 2
 * due date:February 7, 2017 @ 18:30
 * version: 1.0
 *
 * This java program generates a random three-digit number and prompts the user 
 * to input their guess as to what that number is. Depending on how the guess 
 * does or does not match to the generated random number, it is outputted that 
 * the user wins or does not win a certain amount of money. 
 */
/**
 * Lottery
 * 
 * This class generate a random number using Math.random. The random number is 
 * analyzed along with the number inputted by the user in if-else statements.
 * The switchc-case is used to output to the user the result of the if-else.
 */
 
import java.util.Scanner;
public class Lottery {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int lottery = 100 + (int) (Math.random() * ((999 - 100) + 1));
    
    System.out.println("Enter your lottery pick of a three-digit number: ");
    int guess = input.nextInt();
    
    // This retrieves each digit for the lottery number.
    int lottery1 = lottery;
    int lotteryDigit1 = lottery1 % 10;
    lottery1 = lottery1 / 10;
    int lotteryDigit2 = lottery1 % 10;
    lottery1 = lottery1 / 10;
    int lotteryDigit3 = lottery1;
    
    // This retrieves each digit for the inputted guess number.
    int guess1 = guess;
    int guessDigit1 = guess1 % 10;
    guess1 = guess1 / 10;
    int guessDigit2 = guess1 % 10;
    guess1 = guess1 / 10;
    int guessDigit3 = guess1;
    
    System.out.println("The lottery number is " + lottery);
    
    /* The if-else statement verifies if the guess matches the lottery number 
       by exact, all digits, or one-digit. */
    if(guess == lottery) {
      guess = 1;
    }
    else if(((lotteryDigit1 == guessDigit1) || (lotteryDigit1 == guessDigit2) ||
    (lotteryDigit1 == guessDigit3)) && ((lotteryDigit2 == guessDigit1) || 
    (lotteryDigit2 == guessDigit2) || (lotteryDigit2 == guessDigit3)) && 
    ((lotteryDigit3 == guessDigit1) || (lotteryDigit3 == guessDigit2) ||
    (lotteryDigit3 == guessDigit3))) {
      guess = 2;
    }
    else if(lotteryDigit1 == guessDigit1 || lotteryDigit1 == guessDigit2 || 
    lotteryDigit1 == guessDigit3 || lotteryDigit2 == guessDigit1 || 
    lotteryDigit2 == guessDigit2 || lotteryDigit2 == guessDigit3 ||
    lotteryDigit3 == guessDigit1 || lotteryDigit3 == guessDigit2 ||
    lotteryDigit3 == guessDigit3) {
      guess = 3;
    }
    else {
      guess = 4;
    }
    
    /* The switch-case goes through the guess cases and outputs if there is a 
       match or not */
    switch(guess) {
      case 1:
      System.out.println("You have an exact match. You win $10,000!");
      break;
      case 2:
      System.out.println("You matched all digits. You win $3,000!");
      break;
      case 3:
      System.out.println("You matched one digit. You win $1,000!");
      break;
      case 4:
      System.out.println("Sorry, you did not match any number.");
      break;
    }
  }
}