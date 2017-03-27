/**
 * file: LargestElement.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 5
 * due date: March 28, 2017 @ 18:30
 * version: 1.0
 *
 * This program prompts the user for an input of rows and colums. For example, 
 * 3 4 results in 3 rows and 4 columns, which means three rows of input with 
 * four integers in each row. The inputted integers are sorted through with the
 * locateLargest method to find the location of the largest inputted integer. 
 */
/**
 * LargestElement
 * 
 * This class uses a double array for a rows and columns of array inputs. From 
 * the locateLargest method, a for-loop is used to find the largest integer 
 * within the arrays of numbers. The largest integer's location is returned.
 */

import java.util.Scanner; 
public class LargestElement {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the number of rows and columns of the array: ");
    int rows = input.nextInt();
    int columns = input.nextInt();
    double[][] array = new double[rows][columns];
    
    System.out.println("Enter the array: ");
    for(int i=0; i<rows; i++) //loops for the rows
      for(int j=0; j<columns; j++) //loop for the columns
        array[i][j] = input.nextDouble();
    
    int[] position = locateLargest(array); //calls the locateLargest method
    System.out.println("The location of the largest element is at (" + 
    position[0] + ", " + position[1] + ")");
  }
  
  /**
   * locateLargest
   *
   * loops through the rows and columns of a double array to locate the position
   * of the largest element to be returned
   *
   * Parameters:
   *  a: the local variable for the array starting at 0, 0
   *
   * Return value: the position of the largest element from the arrays
   *
   */
  public static int[] locateLargest(double[][] a) {
    double largest = a[0][0];
    int row = 0;
    int column = 0;
    
    for(int i=0; i<a.length; i++) //finds the location of the largest element
      for(int j=0; j<a[i].length; j++)
        if(a[i][j] > largest) {
          largest = a[i][j];
          row = i;
          column = j;
        }
    
    int[] position = {row, column};
    return position; //returns largest element's position
  }
}