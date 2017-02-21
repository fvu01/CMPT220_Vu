/**
 * file: PolygonArea.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 2
 * due date:February 7, 2017 @ 18:30
 * version: 1.0
 *
 * This java program prompts the user to input a amount of side of a regular 
 * polygon and the length of the sides. The inputted data is used to calculate 
 * the area of the polygon.
 */
/**
 * PolygonArea
 * 
 * This class calculates the area of a regular polygon, using math functions 
 * such as Math.pow(), Math.PI, and Math.tan, all of which are part of the 
 * formula used to calcuate area of a regular polygon.
 */
 
import java.util.Scanner;
public class PolygonArea {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the number of sides of a polygon: ");
    double number = input.nextDouble();
    
    System.out.println("Enter the length of the sides: ");
    double sideLength = input.nextDouble();
    
    /* This calculates area of a regular polygon by taking the inputted number 
       of sides and the length of the sides. */
    double area = ((number * Math.pow(sideLength, 2))/
    (4 * Math.tan(Math.PI/number)));
    
    System.out.println("The are of the polygon is " + area + ".");
  }
}