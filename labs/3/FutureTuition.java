/**
 * file: FutureTuition.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 3
 * due date: February 21, 2017 @ 18:30
 * version: 1.0
 *
 * This program calculate tuition for fourteen years with a interest rate of 5%.
 * The cost of tuition in 10 years is outputted along with the cost of tuition 
 * in four years after the 10th year.
 */
/**
 * FutureTuition
 * 
 * This class uses a for-loop to calculate a tuition rate for fourteen years
 * including and interest rate of 5%. The if statements are used to output 10 
 * years tuition and so that four years of tuition afte the 10th year could be 
 * outputted. 
 */
 
public class FutureTuition {
  public static void main(String[] args) {
    int yearlyCost = 10000;
    int totalCost = 0;
    
    for(int i = 1; i <= 14; i++) { // Calculates tuition for up to 14 years
      yearlyCost += yearlyCost * .05; // Calculates the interest rate
      if(i == 10) // Outputs 10 years tuition
        System.out.println("The tuition in ten years is $" + yearlyCost);
      if(i > 10) 
        totalCost = totalCost + yearlyCost;
    }    
    System.out.println("The total cost of four years tuition after the tenth" + 
    " year is $" + totalCost); // Outputs 4 years of tuition after 10th year
  }
}