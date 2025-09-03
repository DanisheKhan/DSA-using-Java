package QQueue;

public class AQueueUsingArrayBasics {

  // Queue using array
  static class ArrayQueue {
    private int[] arr;
    private int front, rear, size, capacity;

    public ArrayQueue(int capacity) {
      this.capacity = capacity;
      arr = new int[capacity];
      front = 0;
      rear = -1;
      size = 0;
    }

    public boolean isEmpty() {
      return size == 0;
    }

    public boolean isFull() {
      return size == capacity;
    }

    // add
    public void enqueue(int x) {
      if (isFull()) {
        System.out.println("Queue is full");
        return;
      }
      rear = (rear + 1) % capacity;
      arr[rear] = x;
      size++;
    }

    // remove
    public int dequeue() {
      if (isEmpty()) {
        System.out.println("Queue is empty");
        return -1;
      }
      int val = arr[front];
      front = (front + 1) % capacity;
      size--;
      return val;
    }

    public int peek() {
      if (isEmpty()) {
        System.out.println("Queue is empty");
        return -1;
      }
      return arr[front];
    }

    public void display() {
      if (isEmpty()) {
        System.out.println("Queue is empty");
        return;
      }
      System.out.print("Queue: ");
      for (int i = 0; i < size; i++) {
        System.out.print(arr[(front + i) % capacity] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    ArrayQueue q = new ArrayQueue(5);
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.display();
    System.out.println("Dequeued: " + q.dequeue());
    q.display();
    System.out.println("Front: " + q.peek());
    q.enqueue(40);
    q.enqueue(50);
    q.enqueue(60); // Should show "Queue is full"
    q.display();
  }
}
