package PStacks;

public class BStrackBasicsUsingLinkedList {
  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  static class Stack {

    static Node head = null;

    public static boolean isEmpty() {
      return head == null;
    }

    // push
    public static void push(int data) {
      Node newNode = new Node(data);
      if (isEmpty()) {
        head = newNode;
        return;
      }
      newNode.next = head;
      head = newNode;
    }
    // pop
    public static int pop() {
      if (isEmpty()) {
      System.out.println("Stack is empty");
      return -1;
      }
      int top = head.data;
      head = head.next;
      return top;
    }

    // peek
    public static int peek() {
      if (isEmpty()) {
      System.out.println("Stack is empty");
      return -1;
      }
      return head.data;
    }
  }

  public static void main(String[] args) {
    Stack.push(10);
    Stack.push(20);
    Stack.push(30);

    Node temp = Stack.head;
    System.out.print("Stack elements: ");
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
    System.out.println("Top element: " + Stack.peek());
    System.out.println("Popped: " + Stack.pop());
    System.out.println("Top element after pop: " + Stack.peek());
    System.out.println("Is stack empty? " + Stack.isEmpty());
  }
}
