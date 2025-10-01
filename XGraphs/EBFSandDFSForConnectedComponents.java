package XGraphs;

import java.util.*;

public class EBFSandDFSForConnectedComponents {

  // Graph representation using adjacency list
  static class Graph {
    private int V; // Number of vertices
    private ArrayList<ArrayList<Integer>> adj;

    public Graph(int v) {
      V = v;
      adj = new ArrayList<>(v);
      for (int i = 0; i < v; i++) {
        adj.add(new ArrayList<>());
      }
    }

    // Add an edge to the graph
    void addEdge(int v, int w) {
      adj.get(v).add(w);
      adj.get(w).add(v); // For undirected graph
    }

    // BFS traversal from a given source
    void BFS(int s, boolean[] visited) {
      LinkedList<Integer> queue = new LinkedList<>();

      visited[s] = true;
      queue.add(s);

      while (!queue.isEmpty()) {
        s = queue.poll();
        System.out.print(s + " ");

        for (Integer neighbor : adj.get(s)) {
          if (!visited[neighbor]) {
            visited[neighbor] = true;
            queue.add(neighbor);
          }
        }
      }
    }

    // DFS traversal from a given vertex
    void DFSUtil(int v, boolean[] visited) {
      visited[v] = true;
      System.out.print(v + " ");

      for (Integer neighbor : adj.get(v)) {
        if (!visited[neighbor]) {
          DFSUtil(neighbor, visited);
        }
      }
    }

    // Find connected components using BFS
    void findConnectedComponentsBFS() {
      boolean[] visited = new boolean[V];
      int components = 0;

      System.out.println("Connected Components (BFS):");
      for (int v = 0; v < V; v++) {
        if (!visited[v]) {
          components++;
          System.out.print("Component " + components + ": ");
          BFS(v, visited);
          System.out.println();
        }
      }
      System.out.println("Total number of connected components: " + components);
    }

    // Find connected components using DFS
    void findConnectedComponentsDFS() {
      boolean[] visited = new boolean[V];
      int components = 0;

      System.out.println("Connected Components (DFS):");
      for (int v = 0; v < V; v++) {
        if (!visited[v]) {
          components++;
          System.out.print("Component " + components + ": ");
          DFSUtil(v, visited);
          System.out.println();
        }
      }
      System.out.println("Total number of connected components: " + components);
    }
  }

  public static void main(String[] args) {
    // Create a graph with 8 vertices
    Graph g = new Graph(8);

    // Add edges to create multiple connected components
    // Component 1: 0-1-2
    g.addEdge(0, 1);
    g.addEdge(1, 2);

    // Component 2: 3-4
    g.addEdge(3, 4);

    // Component 3: 5-6-7
    g.addEdge(5, 6);
    g.addEdge(6, 7);

    // Find connected components using BFS
    g.findConnectedComponentsBFS();
    System.out.println();

    // Find connected components using DFS
    g.findConnectedComponentsDFS();
  }
}
