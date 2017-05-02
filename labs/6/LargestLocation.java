/**
 * file: LargestLocation.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 6
 * due date: April 18, 2017 @ 18:30
 * version: 1.0
 *
 * This program prompts the user for an input of a certain number of rows and 
 * columns. Afterwards, the user inputs arrays in which the location of the 
 * largest element is outputed.
 */
/**
 * LargestLocation
 * 
 * This class takes the user's input of a number of rows and columns along with 
 * the corresponding set of numbers. The location of the largest element or the
 * largest number is located by its exact row and column number by calling the
 * method from the Location class. 
 */
 
import java.util.Scanner;
public class LargestLocation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the number of rows and coclumns in the array: ");
    int row = input.nextInt();
    int column = input.nextInt();
    double[][] array = new double[row][column];
    // creates rows and columns based on input
    
    System.out.println("Enter the array:");
    //allows for the array(s) to be inputted
    for(int i=0; i<array.length; i++)
      for(int j=0; j<array[i].length; j++)
        array[i][j] = input.nextDouble();
      
    Location location = Location.locateLargest(array);
    //calls from Location.java to locate the largest element or max value
    
    System.out.print("The location of the largest element is " + 
    location.maxValue + " at (" + location.row + ", " + location.column + ")");
  }
}