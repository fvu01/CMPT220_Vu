/**
 * file: Lab2_p34_vu.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 2
 * due date:February 7, 2017 @ 18:30
 * version: 1.0
 *
 * This java program displays a month according to the corresponding random 
 * integer generated.
 */
/**
 * Lab2_p34_vu
 * 
 * This class generates a random integer and displays the corresponding month.
 */
 
public class Lab2_p34_vu {
	public static void main(String[] args) {
		 int randomMonth = (int) ((Math.random() * 12) + 1);
		 // This Math.random generates a random integer from 1 to 12
		 
		 if(randomMonth == 1) {
			 System.out.println("January");
		 }
		 else if(randomMonth == 2) {
			 System.out.println("February");
		 }
		 else if(randomMonth == 3) {
			 System.out.println("March");
		 }
		 else if(randomMonth == 4) {
			 System.out.println("April");
		 }
		 else if(randomMonth == 5) {
			 System.out.println("May");
		 }
		 else if(randomMonth == 6) {
			 System.out.println("June");
		 }
		 else if(randomMonth == 7) {
			 System.out.println("July");
		 }
		 else if(randomMonth == 8) {
			 System.out.println("August");
		 }
		 else if(randomMonth == 9) {
			 System.out.println("September");
		 }
		 else if(randomMonth == 10) {
			 System.out.println("October");
		 }
		 else if(randomMonth == 11) {
			 System.out.println("November");
		 }
		 else {
			 System.out.println("December");
		 }
		 /* The random integer generated from the Math.random is analyzed through 
		    the if-else statements. Depending on the random integer generated, the 
		    corresponding month for the integer is displayed. */
	}
}