/**
 * file: TestBMI.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 7
 * due date: April 25, 2017 @ 18:30
 * version: 1.0
 *
 * This program outputs a name, age, weight, feet, inches, BMI, and BMI status 
 * of the already present information. 
 */
/**
 * TestBMI
 * 
 * 
 */
 
public class TestBMI {
  public static void main(String[] args) {
    BMI a = new BMI("Frances", 18, 112, 5, 2);
    System.out.println("Name:" + a.getName() + " Age:" + a.getAge() + " Weight:"
    + a.getWeight() + " Feet:" + a.getFeet() + " Inches:" + a.getInches() + 
    " BMI:" + a.getBMI() + " Status:" + a.getStatus());   
  }
}