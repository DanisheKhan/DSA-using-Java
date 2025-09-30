package XGraphs;

import java.util.*;

public class DHasPath {
  // Build adjacency list for the given graph
  static List<List<Integer>> buildGraph() {
    int n = 7;
    List<List<Integer>> graph = new ArrayList<>();
    for (int i = 0; i < n; i++)
      graph.add(new ArrayList<>());
    // Edges from the image
    graph.get(0).add(1);
    graph.get(0).add(2);
    graph.get(1).add(0);
    graph.get(1).add(3);
    graph.get(2).add(0);
    graph.get(2).add(4);
    graph.get(3).add(1);
    graph.get(3).add(4);
    graph.get(3).add(5);
    graph.get(4).add(2);
    graph.get(4).add(3);
    graph.get(4).add(5);
    graph.get(5).add(3);
    graph.get(5).add(4);
    graph.get(5).add(6);
    graph.get(6).add(5);
    return graph;
  }

  // DFS to check if path exists from src to dest
  static boolean hasPath(List<List<Integer>> graph, int src, int dest, boolean[] visited) {
    if (src == dest)
      return true;
    visited[src] = true;
    for (int nbr : graph.get(src)) {
      if (!visited[nbr]) {
        if (hasPath(graph, nbr, dest, visited))
          return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    List<List<Integer>> graph = buildGraph();
    int src = 0, dest = 5;
    boolean[] visited = new boolean[graph.size()];
    boolean result = hasPath(graph, src, dest, visited);
    System.out.println("Path from " + src + " to " + dest + ": " + result);
  }
}
