/**
 * file: GuessBirthday.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 2
 * due date:February 7, 2017 @ 18:30
 * version: 1.0
 *
 * This program contains five string sets with numerous numbers meant to 
 * represent days. The if-else statements ask the user to answer yes or no
 * depending on if their day of birth is within the numbers within the string
 * sets. After answering all of the questions, the user's day of birth is 
 * outputted based on how they answered the questions. 
 */
/**
 * GuessBirthday
 * 
 * This class uses string sets, system.out.prinln, and if statements to guess
 * the user's day of birth.
 */
 
import java.util.Scanner;
public class GuessBirthday {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // These string sets are for the questions that will be asked to the user.
    String set1 = 
    " 1  3  5  7\n" + 
    " 9 11 13 15\n" + 
    "17 19 21 23\n" +
    "25 27 29 31";
    
    String set2 = 
    " 2  3  6  7\n" +
    "10 11 14 15\n" +
    "18 19 22 23\n" +
    "26 27 30 31\n";
    
    String set3 =
    " 4  5  6  7\n" +
    "12 13 14 15\n" +
    "20 21 22 23\n" +
    "28 29 30 31\n";
    
    String set4 = 
    " 8  9 10 11\n" +
    "12 13 14 15\n" +
    "24 25 26 27\n" +
    "28 29 30 31\n";
    
    String set5 =
    "16 17 18 19\n" +
    "20 21 22 23\n" +
    "24 25 26 27\n" +
    "28 29 30 31\n";
    
    // This is the beginning placeholder which will change depending on inputs.
    int day = 0; 
    
    // This prompts the user to answer the questions using characters Y and N.
    System.out.print("Is your birthday in Set1?\n");
    System.out.print(set1);
    System.out.print("\nEnter N for No and Y for Yes: ");
    char answer = input.next().charAt(0);
    if(answer == 'Y' || answer == 'y') {
      day += 1;
    }
    
    System.out.print("Is your birthday in Set2?\n");
    System.out.print(set1);
    System.out.print("\nEnter N for No and Y for Yes: ");
    answer = input.next().charAt(0);
    if(answer == 'Y' || answer == 'y') {
      day += 2;
    }
    
    System.out.print("Is your birthday in Set3?\n");
    System.out.print(set1);
    System.out.print("\nEnter N for No and Y for Yes: ");
    answer = input.next().charAt(0);
    if(answer == 'Y' || answer == 'y') {
      day += 4;
    }
    
    System.out.print("Is your birthday in Set4?\n");
    System.out.print(set1);
    System.out.print("\nEnter N for No and Y for Yes: ");
    answer = input.next().charAt(0);
    if(answer == 'Y' || answer == 'y') {
      day += 8;
    }
    
    System.out.print("Is your birthday in Set5?\n");
    System.out.print(set1);
    System.out.print("\nEnter N for No and Y for Yes: ");
    answer = input.next().charAt(0);
    if(answer == 'Y' || answer == 'y') {
      day += 16;
    }
    
    // The final result is displayed depending on the inputs. 
    System.out.println("Your birthday is " + day + "!");
  }
}