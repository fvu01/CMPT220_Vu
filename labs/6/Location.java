/**
 * file: Location.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 6
 * due date: April 18, 2017 @ 18:30
 * version: 1.0
 *
 * This is the class Location which pertains to the java program LargestLocation
 */
/**
 * Location
 * 
 * This is the object oriented class which contains the row, column, and max 
 * value. The rows and columns are generated through a set of for-loops.
 */
 
public class Location {
  public int row;
  public int column;
  public double maxValue;
  
  public Location(int row, int column, double maxValue) {
    this.row = row;
    this.column = column;
    this.maxValue = maxValue;
  } 
  
  public static Location locateLargest(double[][] a) {
    int row = 0;
    int column = 0;
    double maxValue = a[row][column];
    
    for(int i=0; i<a.length; i++) //creates the rows and columns
      for(int j=0; j<a.length; j++) 
        if(maxValue < a[i][j]) {
          maxValue = a[i][j];
          row = i;
          column = j;
        }
    return new Location(row, column, maxValue);
  }
}