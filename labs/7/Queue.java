/**
 * file: Queue.java
 * author: Frances Vu
 * course: CMPT 220
 * assignment: Lab 7
 * due date: April 25, 2017 @ 18:30
 * version: 1.0
 *
 * 
 */
/**
 * Queue
 * 
 * 
 */
 
public class Queue {
  private int[] elements;
  private int size;
  private int capacity;

  public Queue(int capacity) {
    this.capacity = capacity;
    elements = new int[capacity];
  }

  public Queue() {
    this(8);
  }

  public void enqueue(int v) {
    if (size >= elements.length) {
      int[] temp = new int[size * 2];
      System.arraycopy(elements, 0, temp, 0, size);
      elements = temp;
    }
    elements[size++] = v;

  }

  public int dequeue() {
    int v = elements[0];
    size--;
    for(int i=0; i<size; i++)
      elements[i] = elements[i + 1];
    return v;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public int getSize() {
    return size;
  }

  public int getCapacity() {
    return capacity;
  }
}