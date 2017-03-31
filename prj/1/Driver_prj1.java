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
      
    double[] vResult = convolveVectors(cResult); 
    for(int i=0; i<vResult.length; i++)
      System.out.print(vResult[i] + " ");
  }

  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
    int idx = 0;
    int shift = 0;
    
    // Iteration 1.1 idx = 0, shift = 0:
    cResult[0] = 0;    // initialize to zero
    cResult[0] += vFirst[0] * vSecond[0] == 1 * 1 = 1;
    
    // Iteration 1.2 idx = 0, shift = 1:
    cResult[0] = 0;    // initialize to zero
    cResult[0] += vFirst[-1] * vSecond[1] == 0 * 0 = 0;//careful: out of bounds!
    
    // Iteration 1.3 idx = 0, shift = 2:
    cResult[0] = 0;    // initialize to zero
    cResult[0] += vFirst[-2] * vSecond[2] == 0 * 1 = 0;//careful: out of bounds!
    // cResult[0] should be equal to 1
    
    
    // Iteration 2.1 idx = 1, shift = 0:
    cResult[1] = 0;    // initialize to zero
    cResult[1] += vFirst[1] * vSecond[0] == 1 * 1 = 1;
    
    // Iteration 2.2 idx = 1, shift = 1:
    cResult[1] = 0;    // initialize to zero
    cResult[1] += vFirst[0] * vSecond[1] == 1 * 0 = 0; 
    
    // Iteration 2.3 idx = 1, shift = 2:
    cResult[1] = 0;    // initialize to zero
    cResult[1] += vFirst[-1] * vSecond[2] == 0 * 1 = 0;//careful: out of bounds!
    // cResult[1] should be equal to 1
    
    
    // Iteration 3.1 idx = 2, shift = 0:
    cResult[2] = 0;    // initialize to zero
    cResult[2] += vFirst[2] * vSecond[0] == 1 * 1 = 1;
    
    // Iteration 3.2 idx = 2, shift = 1:
    cResult[2] = 0;    // initialize to zero
    cResult[2] += vFirst[1] * vSecond[1] == 1 * 0 = 0; 
    
    // Iteration 3.3 idx = 2, shift = 2:
    cResult[2] = 0;    // initialize to zero
    cResult[2] += vFirst[0] * vSecond[2] == 1 * 1 = 1; 
    // cResult[2] should be equal to 2
    
    
    // Iteration 4.1 idx = 3, shift = 0:
    cResult[3] = 0;    // initialize to zero
    cResult[3] += vFirst[3] * vSecond[0] == 0 * 1 = 0;//careful: out of bounds!
    
    // Iteration 4.2 idx = 3, shift = 1:
    cResult[3] = 0;    // initialize to zero
    cResult[3] += vFirst[2] * vSecond[1] == 1 * 0 = 0; 
    
    // Iteration 4.3 idx = 3, shift = 2:
    cResult[3] = 0;    // initialize to zero
    cResult[3] += vFirst[1] * vSecond[2] == 1 * 1 = 1;
    // cResult[3] should be equal to 1
    
    
    // Iteration 5.1 idx = 3, shift = 0:
    cResult[4] = 0;    // initialize to zero
    cResult[4] += vFirst[4] * vSecond[0] == 0 * 1 = 0;//careful: out of bounds!
    
    // Iteration 4.2 idx = 3, shift = 1:
    cResult[4] = 0;    // initialize to zero
    cResult[4] += vFirst[3] * vSecond[1] == 0 * 0 = 0;//careful: out of bounds!
    
    // Iteration 4.3 idx = 3, shift = 2:
    cResult[4] = 0;    // initialize to zero
    cResult[4] += vFirst[2] * vSecond[2] == 1 * 1 = 1 ;
    // cResult[4] should be equal to 1
    double[] cResult[idx] = sum (vFirst[idx - shift] * vSecond[shift]);
    
    int resultLength = (vFirst.length + vSecond.length) - 1;
    return vResult;  
  }
}