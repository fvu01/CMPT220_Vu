/**
 * file: SquareNum.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 7
 * due date: April 25, 2017 @ 18:30
 * version: 1.0
 *
 * This program prints the first ten squared numbers which are larger than
 * Long.MAX_VALUE
 */
/**
 * SquareNum
 * 
 * This class uses BigInteger and uses a while-loop and an if-statement to 
 * find the first ten squared numbers which are larger than Long.MAX_VALUE
 */

import java.math.BigInteger;// BigInteger is imported
public class SquareNum {
  public static void main(String[] args) {
    BigInteger n = new BigInteger("3037000300"); 
    /* sets a starting point and helps in decreasing the overall execution of 
       the program */
    BigInteger longValue = new BigInteger(Long.MAX_VALUE + "");
    
    int count = 1; // count begins at 1, it increases with each number
    while(count<=10) {
      BigInteger nSquare = n.multiply(n); // computes squared number
      if(nSquare.compareTo(longValue) > 0) {
        System.out.println(count + ": " + n + "^2 = " + nSquare);
        count++;
      }
      n = n.add(BigInteger.ONE); // increments the number
    }
  }
}