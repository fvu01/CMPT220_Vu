/**
 * file: Driver_prj1.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Project 1
 * due date: March 28, 2017 @ 18:30
 * version: 1.0
 *
 *
 */
/**
 * Driver_prj1
 * 
 * 
 */

import java.util.Scanner;
public class Driver_prj1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int rows = input.nextInt();
    int columns = input.nextInt();
    
    System.out.println("\n");
    
    double[][] vFirst = new double[rows][columns];
    double[][] vSecond = new double[rows][columns];
    
    for(int i=0; i<rows; i++)
      for(int j=0; j<columns; j++) {
        vFirst[i][j] = input.nextDouble();
        vSecond[i][j] = input.nextDouble();
      }  
      
    double[] cResult = convolveVectors(vResult); 
    for(int i=0; i<vResult.length; i++)
      System.out.print(vResult[i] + " ");
  }

  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
    
    resultLength = (vFirst.length + vSecond.length) - 1;
    return vResult;  
  }
}