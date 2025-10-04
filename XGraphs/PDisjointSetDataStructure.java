package XGraphs;

import java.util.*;

public class PDisjointSetDataStructure {
  static class DisjointSet {
    private int[] parent, rank;

    public DisjointSet(int n) {
      parent = new int[n];
      rank = new int[n];
      for (int i = 0; i < n; i++) {
        parent[i] = i;
        rank[i] = 0;
      }
    }

    // Find with path compression
    public int find(int x) {
      if (parent[x] != x) {
        parent[x] = find(parent[x]);
      }
      return parent[x];
    }

    // Union by rank
    public void union(int x, int y) {
      int xRoot = find(x);
      int yRoot = find(y);
      if (xRoot == yRoot)
        return;

      if (rank[xRoot] < rank[yRoot]) {
        parent[xRoot] = yRoot;
      } else if (rank[xRoot] > rank[yRoot]) {
        parent[yRoot] = xRoot;
      } else {
        parent[yRoot] = xRoot;
        rank[xRoot]++;
      }
    }

    // Check if two elements are in the same set
    public boolean isConnected(int x, int y) {
      return find(x) == find(y);
    }
  }

  public static void main(String[] args) {
    DisjointSet ds = new DisjointSet(5); // 0,1,2,3,4

    ds.union(0, 2);
    ds.union(4, 2);
    ds.union(3, 1);

    System.out.println(ds.isConnected(4, 0)); // true
    System.out.println(ds.isConnected(1, 0)); // false

    ds.union(1, 0);
    System.out.println(ds.isConnected(1, 0)); // true

    System.out.println(ds.find(4)); // Should print the representative (root) of the set containing 4
    System.out.println(ds.find(3)); // Should print the representative (root) of the set containing 3
  }
}
