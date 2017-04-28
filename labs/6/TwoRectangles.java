/**
 * file: TwoRectangles.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 6
 * due date: April 18, 2017 @ 18:30
 * version: 1.0
 *
 * 
 */
/**
 * TwoRectangles
 * 
 * 
 */
 
public class TwoRectangles {
  public static void main(String[] args) {
    
    Rectangle[] rectangles = new Rectangle[2];
    rectangles[0] = new Rectangle(4, 40);
    rectangles[1] = new Rectangle(3.5, 35.9);
    
    for(int i=0; i<2; i++) {// outputs the area and perimeters of the rectangles
      System.out.println("Rectangle " + (i+1) + ":");
      System.out.print("Area = " + rectangles[i].getArea() + " |");
      System.out.println(" Perimeter = " + rectangles[i].getPerimeter() + "\n");
    }
  }
} 