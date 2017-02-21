/**
 * file: FutureTuition.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 3
 * due date: February 21, 2017 @ 18:30
 * version: 1.0
 *
 * 
 */
/**
 * FutureTuition
 * 
 * 
 */
 
public class FutureTuition {
  public static void main(String[] args) {
    int yearlyCost = 10000;
    int totalCost = 0;
    
    for(int i = 1; i <= 14; i++) {
      yearlyCost += yearlyCost * .05;
      if(i == 10)
        System.out.println("The tuition in ten years is $" + yearlyCost);
      if(i > 10) 
        totalCost = totalCost + yearlyCost;
    }    
    System.out.println("The total cost of four years tuition after the tenth" + 
    " year is $" + totalCost);
  }
}