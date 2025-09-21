package UHeap;

public class BOperationsInHeap {
  // Function to insert a new element into the min heap
  public static void insert(int[] heap, int n, int value) {
    n = n + 1;
    heap[n] = value;
    int i = n;
    while (i > 1 && heap[i / 2] > heap[i]) { // Change < to >
      // Swap with parent if current node is smaller
      int temp = heap[i / 2];
      heap[i / 2] = heap[i];
      heap[i] = temp;
      i = i / 2;
    }
  }

  // Function to print the heap
  public static void printHeap(int[] heap, int n) {
    for (int i = 1; i <= n; i++) {
      System.out.print(heap[i] + " ");
    }
    System.out.println();
  }

  // Function to get the minimum element (peek) from the min heap
  public static int peek(int[] heap, int n) {
    if (n < 1) {
      throw new IllegalStateException("Heap is empty");
    }
    return heap[1];
  }

  // Function to heapify a subtree rooted with node i (1-based indexing)
  public static void heapify(int[] heap, int n, int i) {
    int smallest = i;
    int left = 2 * i;
    int right = 2 * i + 1;

    if (left <= n && heap[left] < heap[smallest]) { // Change > to <
      smallest = left;
    }
    if (right <= n && heap[right] < heap[smallest]) { // Change > to <
      smallest = right;
    }
    if (smallest != i) {
      int temp = heap[i];
      heap[i] = heap[smallest];
      heap[smallest] = temp;
      heapify(heap, n, smallest);
    }
  }

  // Function to remove and return the minimum element from the min heap
  public static int remove(int[] heap, int n) {
    if (n < 1) {
      throw new IllegalStateException("Heap is empty");
    }
    int min = heap[1];
    heap[1] = heap[n];
    heap[n] = 0; // Optional: clear the last element
    heapify(heap, n - 1, 1);
    return min;
  }

  public static void main(String[] args) {
    int capacity = 10;
    int[] heap = new int[capacity + 1]; // 1-based indexing
    int n = 0; // Current size of heap

    // Insert elements
    insert(heap, n++, 20);
    insert(heap, n++, 15);
    insert(heap, n++, 30);
    insert(heap, n++, 40);
    insert(heap, n++, 10);

    System.out.print("Heap after insertions: ");
    printHeap(heap, n);

    // Peek minimum element
    System.out.println("Peek min: " + peek(heap, n));

    // Remove minimum element
    int removed = remove(heap, n);
    n--; // Decrement heap size after removal
    System.out.println("Removed min: " + removed);

    System.out.print("Heap after removal: ");
    printHeap(heap, n);

    // Heapify (re-heapify from root)
    heapify(heap, n, 1);
    System.out.print("Heap after heapify: ");
    printHeap(heap, n);
  }
}
