/**
 * file: Lab2_p38_vu.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 2
 * due date:February 7, 2017 @ 18:30
 * version: 1.0
 *
 *  
 */
/**
 * Lab2_p38_vu
 * 
 * 
 */

import java.util.Scanner;
public class Lab2_p38_vu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three integers:");
		
		int int1 = input.nextInt();
		int int2 = input.nextInt();
		int int3 = input.nextInt();
		
		if(int1 > int2) {
			int temp = int1;
			int1 = int2;
			int2 = temp;
		}
		if(int2 > int3) {
			int temp = int2;
			int2 = int3;
			int3 = temp;
		}
		if(int1 > int2) {
			int temp = int1;
			int1 = int2;
			int2 = temp;
		}
		
		System.out.println("The sorted numbers are: " + int1 + " "  + int2 + " " + 
		int3);
	}
}