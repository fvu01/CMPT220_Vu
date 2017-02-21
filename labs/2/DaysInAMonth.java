/**
 * file: DaysInAMonth.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 2
 * due date:February 7, 2017 @ 18:30
 * version: 1.0
 *
 * This java program prompts the user to enter a month number and a year number.
 * The inputted numbers are then put through the switch-case to output the 
 * spelled out name of the month and the amount of days in that month, also 
 * taking into account leap years.
 */
/**
 * DaysInAMonth
 * 
 * This class uses switch-case to output to the user a month name, and the 
 * amount of days in that month based on the inputted year.
 */

import java.util.Scanner;
public class DaysInAMonth {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
		
    System.out.println("Enter a month number and a year number: ");
		
    int numOfDaysInMonth = 0;
    String nameOfMonth = "Unknown";
    // These two lines above are placeholders for month and year.
		
    int month = input.nextInt();
    int year = input.nextInt();
		
    /* The switch-case take the month number and equates it to the corresponding
       month name and number of days in that month. */
    switch(month) {
      case 1: 
      nameOfMonth = "January";
      numOfDaysInMonth = 31;
      break;
      case 2: 
      nameOfMonth = "February";
      if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
        numOfDaysInMonth = 29; // This calculates a leap year.
      }
      else {
        numOfDaysInMonth = 28;
      }
      break;
      case 3:
      nameOfMonth = "March";
      numOfDaysInMonth = 31;
      break;
      case 4:
      nameOfMonth = "April";
      numOfDaysInMonth = 30;
      break;
      case 5:
      nameOfMonth = "May";
      numOfDaysInMonth = 31;
      break;
      case 6:
      nameOfMonth = "June";
      numOfDaysInMonth = 30;
      break;
      case 7:
      nameOfMonth = "July";
      numOfDaysInMonth = 31;
      break;
      case 8:
      nameOfMonth = "August";
      numOfDaysInMonth = 31;
      break;
      case 9:
      nameOfMonth = "September";
      numOfDaysInMonth = 30;
      break;
      case 10:
      nameOfMonth = "October";
      numOfDaysInMonth = 31;
      break;
      case 11:
      nameOfMonth = "November";
      numOfDaysInMonth = 30;
      break;
      case 12:
      nameOfMonth = "December";
      numOfDaysInMonth = 31;
      break;
    }
    System.out.println(nameOfMonth + " " + year + " has " + numOfDaysInMonth + 
    " days.");
  }
}