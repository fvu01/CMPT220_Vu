/**
 * file: TestQueue.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 7
 * due date: April 25, 2017 @ 18:30
 * version: 1.0
 *
 * This program takes a queue of numbers and outputs them as rows of four with
 * five elements in each row. 
 */
/**
 * TestQueue
 * 
 * This class takes Queue.java and uses it to output the resulting queue by 
 * using for-loops and an if-statement. 
 */
 
public class TestQueue {
  public static void main(String[] args) {
    Queue queue = new Queue();
    
    for(int i=0; i<20; i++) 
      queue.enqueue(i);
    
    for(int i=0; i<20; i++) {
      System.out.printf("%2d ", queue.dequeue());
      if((i+1) % 5 == 0)
        System.out.printf("\n");
    }
  }
}