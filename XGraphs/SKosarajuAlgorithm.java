package XGraphs;

import java.util.*;

public class SKosarajuAlgorithm {
  // Graph class to represent a directed graph
  static class Graph {
    int V; // Number of vertices
    List<List<Integer>> adj; // Adjacency list

    // Constructor to initialize the graph
    Graph(int V) {
      this.V = V;
      adj = new ArrayList<>();
      for (int i = 0; i < V; i++)
        adj.add(new ArrayList<>());
    }

    // Function to add a directed edge from u to v
    void addEdge(int u, int v) {
      adj.get(u).add(v);
    }

    // Function to get the transpose of the graph
    Graph getTranspose() {
      Graph g = new Graph(V);
      for (int v = 0; v < V; v++) {
        for (int u : adj.get(v)) {
          g.adj.get(u).add(v); // Reverse the edge
        }
      }
      return g;
    }

    // DFS utility to fill vertices in stack according to their finishing times
    void fillOrder(int v, boolean[] visited, Stack<Integer> stack) {
      visited[v] = true;
      for (int u : adj.get(v)) {
        if (!visited[u])
          fillOrder(u, visited, stack);
      }
      stack.push(v); // Push vertex to stack after visiting all descendants
    }

    // DFS utility to collect all reachable vertices from v
    void DFSUtil(int v, boolean[] visited, List<Integer> component) {
      visited[v] = true;
      component.add(v);
      for (int u : adj.get(v)) {
        if (!visited[u])
          DFSUtil(u, visited, component);
      }
    }

    // Function to print all Strongly Connected Components (SCCs)
    void printSCCs() {
      Stack<Integer> stack = new Stack<>();
      boolean[] visited = new boolean[V];

      // Fill vertices in stack according to their finishing times
      for (int i = 0; i < V; i++)
        if (!visited[i])
          fillOrder(i, visited, stack);

      // Get the transpose of the graph
      Graph gr = getTranspose();
      Arrays.fill(visited, false); // Mark all vertices as not visited for second DFS

      // Process all vertices in order defined by Stack
      while (!stack.isEmpty()) {
        int v = stack.pop();
        if (!visited[v]) {
          List<Integer> component = new ArrayList<>();
          gr.DFSUtil(v, visited, component); // Get all reachable vertices from v
          System.out.println(component); // Print current SCC
        }
      }
    }
  }

  // Main method to test the algorithm
  public static void main(String[] args) {
    Graph g = new Graph(5);
    g.addEdge(1, 0);
    g.addEdge(0, 2);
    g.addEdge(2, 1);
    g.addEdge(0, 3);
    g.addEdge(3, 4);

    System.out.println("Strongly Connected Components:");
    g.printSCCs();
  }
}
