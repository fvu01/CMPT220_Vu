/**
 * file: Java.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 1
 * due date: January 24, 2017 @ 18:30
 * version: 1.0
 * 
 * This file outputs the word "JAVA" printed using letters forming each letter 
 * for "JAVA".
 */
/**
 * Java
 * 
 * This class implements multiple lines of System.out.println to display the 
 * letters J, A, and V forming a pattern of the word JAVA.
 */

public class Java {
  public static void main(String[] args) {
    System.out.println("    J    A  V     V  A");
    System.out.println("    J   A A  V   V  A A");
    System.out.println("J   J  AAAAA  V V  AAAAA");
    System.out.println(" J J  A     A  V  A     A");
    /* Each one of these System.out.println outputs the letters J, A, and V in 
       different orders and at different spaces to form the word JAVA when 
       compiled together. */
  }
}