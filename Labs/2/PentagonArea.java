/**
 * file: PentagonArea.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 2
 * due date:February 7, 2017 @ 18:30
 * version: 1.0
 *
 * This java program prompts the user to input a length of a pentagon from the 
 * center to the vertex. The inputted length is used to calculate the length of
 * a side of the pentagon. The calculated side length is then used to calculate
 * the area of the pentagon.
 */
/**
 * PentagonArea
 * 
 * This class uses doubles, Math.sin, Math.PI, Math.pow, and Math.tan to 
 * caculate the area of a pentagon.
 */
 
import java.util.Scanner;
public class PentagonArea {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a pentagon length from the center to vertex:");
    double radius = input.nextDouble();
    
    // This calculates the length of a side by using the inputted radius.
    double side = 2 * radius * Math.sin(Math.PI / 5);
    
    // This takes the newly calculated side and uses it to calculate area.
    double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
    
    System.out.println("The area of the pentagon is " + area + ".");
  }
}