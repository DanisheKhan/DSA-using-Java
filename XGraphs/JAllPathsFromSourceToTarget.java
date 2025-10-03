package XGraphs;

import java.util.*;

public class JAllPathsFromSourceToTarget {
  static class Graph {
    private final int V;
    private final List<List<Integer>> adj;

    public Graph(int V) {
      this.V = V;
      adj = new ArrayList<>();
      for (int i = 0; i < V; i++) {
        adj.add(new ArrayList<>());
      }
    }

    public void addEdge(int u, int v) {
      adj.get(u).add(v);
    }

    public List<List<Integer>> getAdjacencyList() {
      return adj;
    }
  }

  public static void main(String[] args) {
    Graph g = new Graph(4);
    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 3);
    g.addEdge(2, 3);

    System.out.println("Adjacency List:");
    List<List<Integer>> adj = g.getAdjacencyList();
    for (int i = 0; i < adj.size(); i++) {
      System.out.println(i + " -> " + adj.get(i));
    }
  }
}
