package OLinkedList;

public class EDoublyLinkedListBasics {
  public class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) { 
      this.data = data;
      this.next = null;
      this.prev = null;
    }
  }

  public static Node head;
  public static Node tail;
  public static int size;

  // Constructor
  public EDoublyLinkedListBasics() {
    head = null;
    tail = null;
    size = 0;
  }

  // Add node at the beginning
  public void addFirst(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
    } else {
      newNode.next = head;
      head.prev = newNode;
      head = newNode;
    }
    size++;
  }

  // Add node at the end
  public void addLast(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
    } else {
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
    }
    size++;
  }

  // Add node at specific position
  public void addAtPosition(int data, int position) {
    if (position < 0 || position > size) {
      System.out.println("Invalid position");
      return;
    }
    
    if (position == 0) {
      addFirst(data);
      return;
    }
    
    if (position == size) {
      addLast(data);
      return;
    }
    
    Node newNode = new Node(data);
    Node current = head;
    for (int i = 0; i < position - 1; i++) {
      current = current.next;
    }
    
    newNode.next = current.next;
    newNode.prev = current;
    current.next.prev = newNode;
    current.next = newNode;
    size++;
  }

  // Remove node from the beginning
  public int removeFirst() {
    if (head == null) {
      System.out.println("List is empty");
      return -1;
    }
    
    int data = head.data;
    if (head == tail) {
      head = tail = null;
    } else {
      head = head.next;
      head.prev = null;
    }
    size--;
    return data;
  }

  // Remove node from the end
  public int removeLast() {
    if (tail == null) {
      System.out.println("List is empty");
      return -1;
    }
    
    int data = tail.data;
    if (head == tail) {
      head = tail = null;
    } else {
      tail = tail.prev;
      tail.next = null;
    }
    size--;
    return data;
  }

  // Remove node from specific position
  public int removeAtPosition(int position) {
    if (position < 0 || position >= size) {
      System.out.println("Invalid position");
      return -1;
    }
    
    if (position == 0) {
      return removeFirst();
    }
    
    if (position == size - 1) {
      return removeLast();
    }
    
    Node current = head;
    for (int i = 0; i < position; i++) {
      current = current.next;
    }
    
    int data = current.data;
    current.prev.next = current.next;
    current.next.prev = current.prev;
    size--;
    return data;
  }

  // Search for a value
  public boolean search(int data) {
    Node current = head;
    while (current != null) {
      if (current.data == data) {
        return true;
      }
      current = current.next;
    }
    return false;
  }

  // Get size of the list
  public int getSize() {
    return size;
  }

  // Print list forward
  public void printForward() {
    Node current = head;
    System.out.print("Forward: ");
    while (current != null) {
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.println();
  }

  // Print list backward
  public void printBackward() {
    Node current = tail;
    System.out.print("Backward: ");
    while (current != null) {
      System.out.print(current.data + " ");
      current = current.prev;
    }
    System.out.println();
  }

  // Reverse the doubly linked list
  public void reverse() {
    if (head == null || head == tail) {
      return;
    }
    
    Node current = head;
    Node temp = null;
    
    while (current != null) {
      temp = current.prev;
      current.prev = current.next;
      current.next = temp;
      current = current.prev;
    }
    
    if (temp != null) {
      head = temp.prev;
    }
    
    // Swap head and tail
    Node swap = head;
    head = tail;
    tail = swap;
  }

  // Check if list is empty
  public boolean isEmpty() {
    return head == null;
  }

  // Get first element
  public int getFirst() {
    if (head == null) {
      System.out.println("List is empty");
      return -1;
    }
    return head.data;
  }

  // Get last element
  public int getLast() {
    if (tail == null) {
      System.out.println("List is empty");
      return -1;
    }
    return tail.data;
  }

  // Get element at specific position
  public int getAtPosition(int position) {
    if (position < 0 || position >= size) {
      System.out.println("Invalid position");
      return -1;
    }
    
    Node current = head;
    for (int i = 0; i < position; i++) {
      current = current.next;
    }
    return current.data;
  }

  public static void main(String[] args) {
    EDoublyLinkedListBasics dll = new EDoublyLinkedListBasics();
    
    // Test operations
    System.out.println("=== Testing Doubly Linked List Operations ===");
    
    // Add elements
    dll.addFirst(10);
    dll.addLast(20);
    dll.addLast(30);
    dll.addAtPosition(15, 1);
    
    System.out.println("After adding elements:");
    dll.printForward();
    dll.printBackward();
    System.out.println("Size: " + dll.getSize());
    
    // Search operations
    System.out.println("Search 15: " + dll.search(15));
    System.out.println("Search 25: " + dll.search(25));
    
    // Get operations
    System.out.println("First element: " + dll.getFirst());
    System.out.println("Last element: " + dll.getLast());
    System.out.println("Element at position 2: " + dll.getAtPosition(2));
    
    // Remove operations
    System.out.println("Removed first: " + dll.removeFirst());
    System.out.println("Removed last: " + dll.removeLast());
    System.out.println("Removed at position 1: " + dll.removeAtPosition(1));
    
    System.out.println("After removals:");
    dll.printForward();
    System.out.println("Size: " + dll.getSize());
    
    // Test reverse
    dll.addFirst(5);
    dll.addLast(25);
    dll.addLast(35);
    System.out.println("Before reverse:");
    dll.printForward();
    
    dll.reverse();
    System.out.println("After reverse:");
    dll.printForward();
    dll.printBackward();
    
    // Test empty list
    System.out.println("Is list empty: " + dll.isEmpty());
    while (!dll.isEmpty()) {
      dll.removeFirst();
    }
    System.out.println("After clearing, is list empty: " + dll.isEmpty());
  }
}
