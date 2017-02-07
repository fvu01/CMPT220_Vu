/**
 * file: AverageLetterGrade.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 2
 * due date:February 7, 2017 @ 18:30
 * version: 1.0
 *
 * This java program calculates a weighted average from multiple inputted grades 
 * and outputs the corresponding letter grade for the average. 
 */
/**
 * AverageLetterGrade
 * 
 * This class calculates a weighted average by multiplying each input by its 
 * appropriate percentage. The if-else statements are used to output the 
 * corresponding letter for the average number. 
 */
 
import java.util.Scanner;
public class AverageLetterGrade {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter the following as a percentage...");
    
    System.out.print("midterm exam: "); 
    double midtermexam = input.nextDouble();
    midtermexam = (midtermexam * 0.2);
    System.out.print("final exam: ");
    double finalexam = input.nextDouble();
    finalexam = (finalexam * 0.2);
    System.out.print("projects: ");
    double projects = input.nextDouble();
    projects = (projects * 0.2);
    System.out.print("homework and labs: ");
    double hwandlabs = input.nextDouble();
    hwandlabs = (hwandlabs * 0.4);
    // Each of the grades are multiplied by the weighted percentage.
    double average = (midtermexam + finalexam + projects + hwandlabs);
    
    /* These if-else statements analyze the grade average and depending on which
       range it falls under, the final grade is outputted in the form of the
       letter grade. */
    if(average <= 100 && average >= 95)
      System.out.println("Your final grade is: A");
    if(average < 95 && average >= 90)
      System.out.println("Your final grade is: A-");
    if(average < 90 && average >= 87)
      System.out.println("Your final grade is: B+");
    if(average < 87 && average >= 83)
      System.out.println("Your final grade is: B");
    if(average < 83 && average >= 80)
      System.out.println("Your final grade is: B-");
    if(average < 80 && average >= 77)
      System.out.println("Your final grade is: C+");
    if(average < 77 && average >= 73)
      System.out.println("Your final grade is: C");
    if(average < 73 && average >= 70)
      System.out.println("Your final grade is: C-");
    if(average < 70 && average >= 65)
      System.out.println("Your final grade is: D+");
    if(average < 65 && average >= 60)
      System.out.println("Your final grade is: D");
    if(average < 60)
      System.out.println("Your final grade is: F");
  }
}