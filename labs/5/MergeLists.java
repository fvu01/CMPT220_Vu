/**
 * file: MergeLists.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 5
 * due date: March 28, 2017 @ 18:30
 * version: 1.0
 *
 * This program takes two entered set of numbers and merges them into one set
 */
/**
 * MergeLists
 * 
 * This class uses arrays for two inputted set of lists. The first input within 
 * the list is the amount of total integers the list will contain. That first 
 * input is not included in the merge. The merge method takes list1 and list2 
 * and sorts them into a third list which is returned and outputted.
 */

import java.util.Scanner; 
public class MergeLists{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter list1: ");
    int[] list1 = new int[input.nextInt()];
    for(int i=0; i<list1.length; i++) //initializes list1 for input
      list1[i] = input.nextInt();
    
    System.out.print("Enter list2: ");
    int[] list2 = new int[input.nextInt()];
    for(int i=0; i<list2.length; i++) //initializes list2 for input
      list2[i] = input.nextInt();
    
    int[] list3 = merge(list1, list2);
    
    System.out.print("The merged list is ");
    
    for(int i=0; i<list3.length; i++)
      System.out.print(list3[i] + " ");
  }
  
  /**
   * merge
   *
   * merges two array lists into one list
   *
   * Parameters: 
   *  list1: the first array list
   *  list2: the second array list
   *
   * Return value: the merged list created from a combination of list1 and list2 
   */
  public static int[] merge(int[] list1, int[] list2) {
    int list3[] = new int[list1.length + list2.length];
    int j = 0, k = 0; //list1 and list2
    
    for(int i=0; i<list3.length; i++) {
      if((k>=list2.length) || (j<list1.length && list1[j]<=list2[k])) {
        list3[i] = list1[j];
        j++;
      }
      else {
        list3[i] = list2[k];
        k++;
      }
    }
    return list3;
  }
}