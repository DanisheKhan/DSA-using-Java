package OLinkedList;

class Node {
  int data;
  Node next;
  Node(int data) { this.data = data; }
}

public class CMergeSortOnLinkedLIst {
  // Utility to print the list
  static void printList(Node head) {
    Node current = head;
    while (current != null) {
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.println();
  }

  // Merge two sorted lists
  static Node sortedMerge(Node first, Node second) {
    if (first == null) return second;
    if (second == null) return first;
    if (first.data <= second.data) {
      first.next = sortedMerge(first.next, second);
      return first;
    } else {
      second.next = sortedMerge(first, second.next);
      return second;
    }
  }

  // Split the list into halves
  static Node getMiddle(Node head) {
    if (head == null) return head;
    Node slowPointer = head, fastPointer = head.next;
    while (fastPointer != null && fastPointer.next != null) {
      slowPointer = slowPointer.next;
      fastPointer = fastPointer.next.next;
    }
    return slowPointer;
  }

  // Merge sort on linked list
  static Node mergeSort(Node head) {
    if (head == null || head.next == null) return head;
    Node middleNode = getMiddle(head);
    Node nextOfMiddle = middleNode.next;
    middleNode.next = null;
    Node leftSorted = mergeSort(head);
    Node rightSorted = mergeSort(nextOfMiddle);
    return sortedMerge(leftSorted, rightSorted);
  }

  public static void main(String[] args) {
    // Example usage
    Node head = new Node(4);
    head.next = new Node(2);
    head.next.next = new Node(1);
    head.next.next.next = new Node(3);

    System.out.print("Original List: ");
    printList(head);

    head = mergeSort(head);

    System.out.print("Sorted List: ");
    printList(head);
  }
}