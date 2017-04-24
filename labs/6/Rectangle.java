/**
 * file: Rectangle.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 6
 * due date: April 18, 2017 @ 18:30
 * version: 1.0
 *
 * 
 */
/**
 * Rectangle
 * 
 * 
 */
 
public class Rectangle {
  private double width;
  private double height;
   
  public Rectangle() {
    this.width = 1.0;
    this.height = 1.0;
  }
   
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }
   
  public double getArea() {
    return this.width * this.height;
  }
   
  public double getPerimeter() {
    return this.width * 2 + this.height * 2;
  }
}