/**
 * file: SortedIntegers.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 2
 * due date:February 7, 2017 @ 18:30
 * version: 1.0
 *
 * This java program prompts the user to input three separate integers. The 
 * integers are then ordered in increasing order and displayed to the user.
 */
/**
 * SortedIntegers
 * 
 * This class orders three inputted integers in increasing order.
 */

import java.util.Scanner;
public class SortedIntegers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three integers:");
		
		int int1 = input.nextInt();
		int int2 = input.nextInt();
		int int3 = input.nextInt();
		
		if(int1 > int2) {
			int value = int1; // The value is a placeholder for the integer.
			int1 = int2;
			int2 = value;
		}
		if(int2 > int3) {
			int value = int2;
			int2 = int3;
			int3 = value;
		}
		if(int1 > int2) {
			int value = int1;
			int1 = int2;
			int2 = value;
		}
		
		System.out.println("The sorted numbers are: " + int1 + " "  + int2 + " " + 
		int3);
	}
}