package XGraphs;

import java.util.*;

public class HTopologicalSorting {
  public static void main(String[] args) {
    int V = 6;
    List<List<Integer>> adj = new ArrayList<>();
    for (int i = 0; i < V; i++)
      adj.add(new ArrayList<>());

    // Example graph
    adj.get(5).add(2);
    adj.get(5).add(0);
    adj.get(4).add(0);
    adj.get(4).add(1);
    adj.get(2).add(3);
    adj.get(3).add(1);

    List<Integer> topoOrder = topologicalSortUsingStack(V, adj);
    System.out.println("Topological Sort (using stack): " + topoOrder);
  }

  static List<Integer> topologicalSortUsingStack(int V, List<List<Integer>> adj) {
    boolean[] visited = new boolean[V];
    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < V; i++) {
      if (!visited[i]) {
        dfs(i, adj, visited, stack);
      }
    }

    List<Integer> topo = new ArrayList<>();
    while (!stack.isEmpty()) {
      topo.add(stack.pop());
    }
    return topo;
  }

  static void dfs(int u, List<List<Integer>> adj, boolean[] visited, Stack<Integer> stack) {
    visited[u] = true;
    for (int v : adj.get(u)) {
      if (!visited[v]) {
        dfs(v, adj, visited, stack);
      }
    }
    stack.push(u);
  }
}
