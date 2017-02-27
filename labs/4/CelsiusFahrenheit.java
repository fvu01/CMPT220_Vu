/**
 * file: CelsiusFahrenheit.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 4
 * due date: February 28, 2017 @ 18:30
 * version: 1.0
 *
 *
 */
/**
 * CelsiusFahrenheit
 * 
 *
 */
 
public class CelsiusFahrenheit {
  public static void main(String[] args) {
    
    String c = "Celsius";
    String f = "Fahrenheit";
    System.out.printf("%-15s%-15s|    %-15s%-15s\n", c, f, f, c);
    // Formats the string and prints the headers
    
    System.out.println(String.format("%62s", " ").replace(' ', '-'));
    // Prints a line of dashes
    
    for(int cels=40, fahr= 120; cels>= 31; cels--, fahr-=10) {
          System.out.printf("%-15.1f%-15.1f|    %-15.1f%-15.2f\n", (float)cels,
          celsiusToFahrenheit(cels), (float)fahr, fahrenheitToCelsius(fahr));
          // Loops the convsersion and prints into a formatted string
    }
  }
  
  public static double celsiusToFahrenheit(double celsius) {
    return(9.0/5) * celsius + 32;// Converts from celsius to fahrenheit
  }
  
  public static double fahrenheitToCelsius(double fahrenheit) {
    return(5.0/9) * (fahrenheit-32);// Converts from fahrenheit to celsius
  }
}