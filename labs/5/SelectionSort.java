/**
 * file: SelectionSort.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 5
 * due date: March 28, 2017 @ 18:30
 * version: 1.0
 *
 * This java program takes an input of ten numbers into an array. The numbers 
 * are sorted using the selection sort method.
 */
/**
 * SelectionSort
 * 
 * This class takes an input of ten integers into an array. The numbers are 
 * sorted using the selectionSort method which takes each individual number, 
 * checks for the max integer, and sorts the numbers accordingly. 
 */
 
import java.util.Scanner;
public class SelectionSort {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int[] numbers = new int[10];
    System.out.print("Enter ten numbers: ");
    
    for(int i=0; i<numbers.length; i++) 
      numbers[i] = input.nextInt(); //Initializes each number as scanner input
    
    System.out.print("The sorted numbers are: ");
    
    selectionSort(numbers);
    for(int i=0; i<numbers.length; i++)
      System.out.print(numbers[i] + " ");
  }
  
  /**
   * selectionSort
   *
   * sorts the double array numbers from the array, numbers, using the selection
   * sort method
   *
   * Parameters: each individual number within the array 
   */
  public static void selectionSort(int[] nums) {
    for(int i=nums.length-1; i>0; i--) { //checks for the max number
      int max = nums[i];
      int maxIndex = i; 
      
      for(int j=0; j<i; j++) 
        if(max < nums[j]) {
          max = nums[j];
          maxIndex = j;
        }
      
      if(maxIndex != i) { //When necessary swaps numbers[i] with nums[maxIndex]
        nums[maxIndex] = nums[i];
        nums[i] = max;
      }
    }
  }
}