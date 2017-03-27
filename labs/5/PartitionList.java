/**
 * file: PartitionList.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 5
 * due date: March 28, 2017 @ 18:30
 * version: 1.0
 *
 * This program takes an inputted list and rearranges all the elements within 
 * list so that the elements within the list are partitioned. 
 */
/**
 * PartitionList
 * 
 * This class takes an inputed array list. The partition method rearranges the 
 * elements within that array so that all numbers before the pivot are less than
 * or equal to the pivot, and all elements after the pivot are greater than the
 * pivot. A while-loop and if-else statements are used to partition the numbers.
 */

import java.util.Scanner; 
public class PartitionList {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter list: ");
    int[] list = new int[input.nextInt()];
    for(int i=0; i<list.length; i++)
      list[i] = input.nextInt();
    
    int[] partitionList = partition(list); //calls the partition method
    
    System.out.print("After the partition, the list is ");
    for(int i=0; i<partitionList.length; i++)
      System.out.print(partitionList[i] + " "); //outputs partitioned list
  }
  
  /**
   * partition
   *
   * takes a list of integers and rearranges them so that all the numbers before
   * the pivot are <= the pivot and the elements after the pivot are > the pivot
   *
   * Parameters: 
   *  list: the list of numbers or integers rearranged in the method
   *
   * Return value: the completely partitioned list
   */
  public static int[] partition(int[] list) {
    int pivot = list[0];
    int i = 1;
    int j = list.length-1;
    
    while(i < j) {
      if(list[i] > pivot) {
        if(list[j] <= pivot) {
          int temp = list[i];
          list[i] = list[j];
          list[j] = temp;
          j--;
        }
        else {
          j--;
          i--;
        }
      }
      i++;
    }
    int temp = pivot;
    list[0] = list[i-1];
    list[i-1] = temp;

    return list;
  }
}