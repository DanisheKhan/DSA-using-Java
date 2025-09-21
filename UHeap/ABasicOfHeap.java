package UHeap;

import java.util.PriorityQueue;
import java.util.Comparator;

public class ABasicOfHeap {
  static class Student implements Comparable<Student> {
    String name;
    int rank;

    public Student(String name, int rank) {
      this.name = name;
      this.rank = rank;
    }

    @Override
    public int compareTo(Student other) {
      // Lower rank means higher priority
      return Integer.compare(this.rank, other.rank);
    }

    @Override
    public String toString() {
      return name + " (Rank: " + rank + ")";
    }
  }

  public static void main(String[] args) {
    // Integer max-heap
    PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

    pq.add(3);
    pq.add(4);
    pq.add(1);
    pq.add(7);

    System.out.println("Integer PriorityQueue:");
    while (!pq.isEmpty()) {
      System.out.println(pq.peek());
      pq.remove();
    }

    // Student min-heap (by rank)
    PriorityQueue<Student> studentPQ = new PriorityQueue<>();
    studentPQ.add(new Student("Alice", 2));
    studentPQ.add(new Student("Bob", 1));
    studentPQ.add(new Student("Charlie", 3));

    System.out.println("\nStudent PriorityQueue:");
    while (!studentPQ.isEmpty()) {
      System.out.println(studentPQ.peek());
      studentPQ.remove();
    }
  }
}