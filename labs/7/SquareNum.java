/**
 * file: SquareNum.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 7
 * due date: April 25, 2017 @ 18:30
 * version: 1.0
 *
 * 
 */
/**
 * SquareNum
 * 
 * 
 */

import java.math.BigInteger; 
public class SquareNum {
  public static void main(String[] args) {
    BigInteger n = new BigInteger("3037000300");
    BigInteger longValue = new BigInteger(Long.MAX_VALUE + "");
    
    int count = 1;
    while(count<=10) {
      BigInteger nSquare = n.multiply(n);
      if(nSquare.compareTo(longValue) > 0) {
        System.out.println(count + ": " + n + "^2 = " + nSquare);
        count++;
      }
      n = n.add(BigInteger.ONE);
    }
  }
}