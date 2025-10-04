package XGraphs;

import java.util.*;

class Edge implements Comparable<Edge> {
  int src, dest, weight;

  Edge(int s, int d, int w) {
    src = s;
    dest = d;
    weight = w;
  }

  public int compareTo(Edge other) {
    return this.weight - other.weight;
  }
}

class DisjointSet {
  int[] parent, rank;

  DisjointSet(int n) {
    parent = new int[n];
    rank = new int[n];
    for (int i = 0; i < n; i++)
      parent[i] = i;
  }

  int find(int x) {
    if (parent[x] != x)
      parent[x] = find(parent[x]);
    return parent[x];
  }

  void union(int x, int y) {
    int xr = find(x), yr = find(y);
    if (xr == yr)
      return;
    if (rank[xr] < rank[yr])
      parent[xr] = yr;
    else if (rank[xr] > rank[yr])
      parent[yr] = xr;
    else {
      parent[yr] = xr;
      rank[xr]++;
    }
  }
}

public class QKruskalsAlgorithm {
  public static void main(String[] args) {
    int V = 4; // Number of vertices
    List<Edge> edges = new ArrayList<>();
    // Example edges: (src, dest, weight)
    edges.add(new Edge(0, 1, 10));
    edges.add(new Edge(0, 2, 6));
    edges.add(new Edge(0, 3, 5));
    edges.add(new Edge(1, 3, 15));
    edges.add(new Edge(2, 3, 4));

    Collections.sort(edges);

    DisjointSet ds = new DisjointSet(V);
    List<Edge> mst = new ArrayList<>();
    int mstWeight = 0;

    for (Edge e : edges) {
      if (ds.find(e.src) != ds.find(e.dest)) {
        mst.add(e);
        mstWeight += e.weight;
        ds.union(e.src, e.dest);
      }
    }

    System.out.println("Edges in MST:");
    for (Edge e : mst) {
      System.out.println(e.src + " - " + e.dest + " : " + e.weight);
    }
    System.out.println("Total weight: " + mstWeight);
  }
}
