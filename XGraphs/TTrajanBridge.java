package XGraphs;

import java.util.*;

public class TTrajanBridge {
  static class Edge {
    int u, v;

    Edge(int u, int v) {
      this.u = u;
      this.v = v;
    }

    public String toString() {
      return u + " - " + v;
    }
  }

  static int time = 0;

  public static List<Edge> findBridges(int n, List<List<Integer>> adj) {
    int[] disc = new int[n];
    int[] low = new int[n];
    boolean[] visited = new boolean[n];
    List<Edge> bridges = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      if (!visited[i]) {
        dfs(i, -1, adj, visited, disc, low, bridges);
      }
    }
    return bridges;
  }

  private static void dfs(int u, int parent, List<List<Integer>> adj, boolean[] visited, int[] disc, int[] low,
      List<Edge> bridges) {
    visited[u] = true;
    disc[u] = low[u] = ++time;

    for (int v : adj.get(u)) {
      if (v == parent)
        continue;
      if (!visited[v]) {
        dfs(v, u, adj, visited, disc, low, bridges);
        low[u] = Math.min(low[u], low[v]);
        if (low[v] > disc[u]) {
          bridges.add(new Edge(u, v));
        }
      } else {
        low[u] = Math.min(low[u], disc[v]);
      }
    }
  }

  public static void main(String[] args) {
    // Example usage:
    int n = 5;
    List<List<Integer>> adj = new ArrayList<>();
    for (int i = 0; i < n; i++)
      adj.add(new ArrayList<>());
    // Add edges (undirected)
    adj.get(0).add(1);
    adj.get(1).add(0);
    adj.get(1).add(2);
    adj.get(2).add(1);
    adj.get(2).add(0);
    adj.get(0).add(2);
    adj.get(1).add(3);
    adj.get(3).add(1);
    adj.get(3).add(4);
    adj.get(4).add(3);

    List<Edge> bridges = findBridges(n, adj);
    System.out.println("Bridges in the graph:");
    for (Edge e : bridges) {
      System.out.println(e);
    }
  }
}
