package QQueue;

import java.util.Deque;
import java.util.LinkedList;

public class JStackAndQueueUsingDeque {

  // Queue implementation using Deque
  static class MyQueue {
    Deque<Integer> deque = new LinkedList<>();

    public void add(int data) {
      deque.addLast(data);
    }

    public int remove() {
      return deque.removeFirst();
    }

    public int peek() {
      return deque.getFirst();
    }
  }

  // Stack implementation using Deque
  static class MyStack {
    Deque<Integer> deque = new LinkedList<>();

    public void push(int data) {
      deque.addLast(data);
    }

    public int pop() {
      return deque.removeLast();
    }

    public int peek() {
      return deque.getLast();
    }
  }

  public static void main(String[] args) {
    // Queue demo
    MyQueue queue = new MyQueue();
    queue.add(10);
    queue.add(20);
    queue.add(30);
    System.out.println("Queue peek: " + queue.peek()); // 10
    System.out.println("Queue remove: " + queue.remove()); // 10
    System.out.println("Queue remove: " + queue.remove()); // 20
    System.out.println("Queue peek: " + queue.peek()); // 30

    // Stack demo
    MyStack stack = new MyStack();
    stack.push(100);
    stack.push(200);
    stack.push(300);
    System.out.println("Stack peek: " + stack.peek()); // 300
    System.out.println("Stack pop: " + stack.pop()); // 300
    System.out.println("Stack pop: " + stack.pop()); // 200
    System.out.println("Stack peek: " + stack.peek()); // 100
  }
}