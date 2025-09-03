package QQueue;

class Node {
  int data;
  Node next;
  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class LinkedListQueue {
  private Node head, tail;
  private int size;

  public LinkedListQueue() {
    head = tail = null;
    size = 0;
  }

  // Add operation (enqueue)
  public void add(int data) {
    Node newNode = new Node(data);
    if (tail == null) {
      head = tail = newNode;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
    size++;
  }

  // Remove operation (dequeue)
  public int remove() {
    if (head == null) {
      throw new RuntimeException("Queue is empty");
    }
    int value = head.data;
    head = head.next;
    if (head == null) {
      tail = null;
    }
    size--;
    return value;
  }

  // Peek operation
  public int peek() {
    if (head == null) {
      throw new RuntimeException("Queue is empty");
    }
    return head.data;
  }

  // Check if queue is empty
  public boolean isEmpty() {
    return head == null;
  }

  // Size operation
  public int size() {
    return size;
  }

  // Display queue
  public void display() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    LinkedListQueue queue = new LinkedListQueue();
    queue.add(10);
    queue.add(20);
    queue.add(30);
    System.out.print("Queue: ");
    queue.display();

    System.out.println("Removed: " + queue.remove());
    System.out.print("Queue after remove: ");
    queue.display();

    System.out.println("Peek: " + queue.peek());
    System.out.println("Is queue empty? " + queue.isEmpty());
    System.out.println("Size: " + queue.size());
  }
}
