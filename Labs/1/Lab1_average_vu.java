/**
 * file: lab1_average_vu.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 1
 * due date: January 24, 2017 @ 18:30
 * version: 1.0
 *
 * This file averages multiple inputted grades.
 */
/**
 * Lab1_average_vu
 * 
 * This class takes various inputted grades and outputs the average.
 */
import java.util.Scanner;
// This imports the Scanner for console input.

public class Lab1_average_vu {
  private static Scanner input;
  public static void main(String[] args) {
    input = new Scanner(System.in);
    
    System.out.println("Please enter the following as a percentage...");
    // This the beginning line which simply prompts the user.
    
    System.out.print("midterm exams: ");
    double midtermexams = input.nextDouble();
    midtermexams = (midtermexams * 0.2);
    // The grade for midterm exams is multiplied by 20%.
    
    System.out.print("final exams: ");
    double finalexams = input.nextDouble();
    finalexams = (finalexams * 0.2);
    // The grade for final exams is multiplied by 20%
    
    System.out.print("projects: ");
    double projects = input.nextDouble();
    projects = (projects * 0.2);
    // The grade for projects is multiplied by 20%.
    
    System.out.print("homework and labs: ");
    double hwandlabs = input.nextDouble();
    hwandlabs = (hwandlabs * 0.4);
    // The grade for homework and labs is multiplied by 40%.
    
    double average = (midtermexams + finalexams + projects + hwandlabs);
    /* All the calculated grades by their weighted percentages are added
       together to calculate the total average. */
        
    System.out.println("Your final grade is: " + average);
    // The final grade is outputted.
  }
}