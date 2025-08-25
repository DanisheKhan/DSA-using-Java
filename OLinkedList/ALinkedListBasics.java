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

  public static void main(String[] args) {
    ALinkedListBasics ll = new ALinkedListBasics();
    ll.addFirst(2);
    ll.addFirst(1);
    ll.addLast(3);
    ll.addLast(4);
    ll.add(2, 50);
    ll.print();
    // System.out.println(size);
    // ll.removeFirst();
    // ll.print();
    // ll.removeLast();
    // ll.print();
  }
}