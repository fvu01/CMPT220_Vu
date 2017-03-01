/**
 * file: CelsiusFahrenheit.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 4
 * due date: February 28, 2017 @ 18:30
 * version: 1.0
 *
 * This program converts from degrees celsisus to degrees fahrenheit and 
 * vice-versa. The results are displayed within a formatted string, showing the 
 * conversions from celsius 40 - 31 and fahrenheit 120 - 30.
 */
/**
 * CelsiusFahrenheit
 * 
 * This class creates formatted strings in which the conversion from celsius to
 * fahrenheit is printed and vice-versa. The methods, celsiusToFahrenheit and
 * fahrenheitToCelsius are used for the conversions.  
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
  
  /**
   * celsiusToFahrenheit
   *
   * converts degrees celsius to degrees fahrenheit
   *
   * Parameters:
   *  celsius: degrees celsius which is converted to fahrenheit
   * 
   * Return value: The result of the conversion from celsisus to fahrenheit
   */
  public static double celsiusToFahrenheit(double celsius) {
    return(9.0/5) * celsius + 32;// Converts from celsius to fahrenheit
  }
  
  /**
   * fahrenheitToCelsius
   *
   * converts degrees fahrenheit to degrees celsisus
   *
   * Parameters:
   *  fahrenheit: degrees fahrenheit which is converted to celsisus
   * 
   * Return value: The result of the conversion from fahrenheit to celsisus
   */
  public static double fahrenheitToCelsius(double fahrenheit) {
    return(5.0/9) * (fahrenheit-32);// Converts from fahrenheit to celsius
  }
}