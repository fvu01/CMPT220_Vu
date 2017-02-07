/**
 * file: ComputeChange.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 2
 * due date:February 7, 2017 @ 18:30
 * version: 1.0
 *
 * This program calculates change based off of an amount in double which the 
 * user inputs. The amount of dollars, quarters, dimes, nickels, and pennies are
 * all outputted to the user.
 */
/**
 * ComputeChange
 * 
 * This class uses Integer.parseInt, .substring, and .indexOf to calculate the 
 * exact amount of change from an inputted number in double. 
 */
 
import java.util.Scanner; 
public class ComputeChange {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a number in double, for example 11.56: ");
    String amount = input.next();
    
    int numberOfOneDollars = Integer.parseInt(amount.substring(0, amount.indexOf
    ('.')));
    int numberOfCents = Integer.parseInt(amount.substring( amount.indexOf('.') + 
    1));
    
    // This pulls out the number the number of cents for each cent type.
    int numberOfQuarters = numberOfCents / 25;
    numberOfCents = numberOfCents % 25;
    int numberOfDimes = numberOfCents / 10;
    numberOfCents = numberOfCents % 10;
    int numberOfNickels = numberOfCents / 5;
    numberOfCents = numberOfCents % 5;
    int numberOfPennies = numberOfCents;
    
    // This outputs the dollars and each individual cent amount. 
    System.out.println("Your amount " + amount + " consists of");
    System.out.println("    " + numberOfOneDollars + " dollars");
    System.out.println("    " + numberOfQuarters + " quarters");
    System.out.println("    " + numberOfDimes + " dimes");
    System.out.println("    " + numberOfNickels + " nickels");
    System.out.println("    " + numberOfPennies + " pennies");
  }
}