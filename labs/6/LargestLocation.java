/**
 * file: LargestLocation.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 6
 * due date: April 18, 2017 @ 18:30
 * version: 1.0
 *
 * 
 */
/**
 * LargestLocation
 * 
 * 
 */
 
import java.util.Scanner;
public class LargestLocation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the number of rows and coclumns in the array: ");
    int row = input.nextInt();
    int column = input.nextInt();
    double[][] array = new double[row][column];
    
    System.out.println("Enter the array:");
    for(int i=0; i<array.length; i++)
      for(int j=0; j<array[i].length; j++)
        array[i][j] = input.nextDouble();
      
    Location location = Location.locateLargest(array);
    
    System.out.print("The location of the largest element is " + 
    location.maxValue + " at (" + location.row + ", " + location.column + ")");
  }
}