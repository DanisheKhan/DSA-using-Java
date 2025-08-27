package OLinkedList;

import java.util.*;

public class ALinkedListBasics {

  public static class Node {

    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;
  public static int size;

  // methods
  // addFirst
  public void addFirst(int data) {
    // one - create new node
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }

    // two - newNode next = head
    newNode.next = head; // link

    // three - head=newNode
    head = newNode;
  }

  // addLast
  public void addLast(int data) {
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }
    tail.next = newNode;
    tail = newNode;
  }

  // print
  public void print() {
    if (head == null) {
      System.out.println("LL is empty");
      return;
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  // add in the middle
  public void add(int idx, int data) {
    if (idx == 0) {
      addFirst(data);
      return;
    }

    Node newNode = new Node(data);
    size++;
    Node temp = head;
    int i = 0;

    while (i < idx - 1 && temp != null) {
      temp = temp.next;
      i++;
    }

    newNode.next = temp.next;
    temp.next = newNode;

  }

  // removeFirst
  public int removeFirst() {
    if (head == null) {
      System.out.println("LL is empty");
      return -1;
    }
    size--;
    if (head == tail) {
      int val = head.data;
      head = tail = null;
      return val;
    }
    int val = head.data;
    head = head.next;
    return val;
  }

  // remove last
  public int removeLast() {
    if (head == null) {
      System.out.println("LL is empty");
      return -1;
    }
    size--;
    if (head == tail) {
      int val = head.data;
      head = tail = null;
      return val;
    }
    Node prev = head;
    while (prev.next != tail) {
      prev = prev.next;
    }
    int val = tail.data;
    prev.next = null;
    tail = prev;
    return val;
  }

  // iterative search
  public int iterativeSearch(int key) {
    Node temp = head;
    int idx = 0;
    while (temp != null) {
      if (temp.data == key) {
        return idx;
      }
      temp = temp.next;
      idx++;
    }
    return -1;
  }

  // recursive search
  public int recursiveSearch(int key) {
    return recursiveSearchHelper(head, key, 0);
  }

  private int recursiveSearchHelper(Node node, int key, int idx) {
    if (node == null) {
      return -1;
    }
    if (node.data == key) {
      return idx;
    }
    return recursiveSearchHelper(node.next, key, idx + 1);
  }

  // reverse
  public void reverse() {
    Node prev = null;
    Node curr = head;
    tail = head;
    while (curr != null) {
      Node next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    head = prev;
  }

  // Find and remove nth node form end
  public void removeNthFromEnd(int n) {
    if (head == null || n <= 0) {
      System.out.println("Invalid operation");
      return;
    }
    // Step 1: Find size
    Node temp = head;
    int len = 0;
    while (temp != null) {
      len++;
      temp = temp.next;
    }
    if (n > len) {
      System.out.println("n is greater than the length of the list");
      return;
    }
    // Step 2: Remove (len-n)th node from start
    if (n == len) {
      removeFirst();
      return;
    }
    int idx = len - n;
    Node prev = head;
    for (int i = 1; i < idx; i++) {
      prev = prev.next;
    }
    Node toRemove = prev.next;
    prev.next = toRemove.next;
    if (toRemove == tail) {
      tail = prev;
    }
    size--;
  }

  // check if LL is a palindrome
  public boolean isPalindrome() {
    if (head == null || head.next == null) {
      return true;
    }
    // Find middle
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    // Reverse second half
    Node prev = null;
    Node curr = slow;
    while (curr != null) {
      Node next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    // Compare halves
    Node left = head;
    Node right = prev;
    while (right != null) {
      if (left.data != right.data) {
        return false;
      }
      left = left.next;
      right = right.next;
    }
    return true;
  }

  // detect cycle exists or not(Floyd's cycle algorithm)
  public boolean isCycle() {
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        return true;
      }
    }
    return false;
  }

  // remove a loop or cycle in LL
  public void removeCycle() {
    if (head == null || head.next == null) return;

    Node slow = head;
    Node fast = head;
    boolean cycleExists = false;

    // Detect cycle
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        cycleExists = true;
        break;
      }
    }

    if (!cycleExists) return;

    // Find start of cycle
    slow = head;
    Node prev = null;
    while (slow != fast) {
      prev = fast;
      slow = slow.next;
      fast = fast.next;
    }

    // Remove cycle
    prev.next = null;
  }



  public static void main(String[] args) {
    ALinkedListBasics ll = new ALinkedListBasics();
    // ll.addFirst(2);
    // ll.addFirst(1);
    // ll.addLast(3);
    // ll.addLast(4);
    // ll.add(2, 50);
    // ll.print();
    // System.out.println(size);
    // ll.removeFirst();
    // ll.print();
    // ll.removeLast();
    // ll.print();

    // System.out.println("at index : f"+ll.iterativeSearch(50));

    // ll.reverse();
    // ll.print();

    // Example: Create a cycle in the linked list and check for cycle
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);

    // Creating a cycle: tail.next points to head
    tail.next = head;

    if (ll.isCycle()) {
      System.out.println("Cycle detected in the linked list.");
    } else {
      System.out.println("No cycle detected.");
    }
  }

}