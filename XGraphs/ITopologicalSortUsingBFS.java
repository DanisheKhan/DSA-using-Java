// Kahn's Algorithm (Topological Sort using BFS)
package XGraphs;

import java.util.*;

public class ITopologicalSortUsingBFS {
  public static void main(String[] args) {
    // Example graph: 6 vertices, edges as adjacency list
    int V = 6;
    List<List<Integer>> adj = new ArrayList<>();
    for (int i = 0; i < V; i++)
      adj.add(new ArrayList<>());
    // Sample edges: 5->2, 5->0, 4->0, 4->1, 2->3, 3->1
    adj.get(5).add(2);
    adj.get(5).add(0);
    adj.get(4).add(0);
    adj.get(4).add(1);
    adj.get(2).add(3);
    adj.get(3).add(1);

    List<Integer> topoOrder = topologicalSort(V, adj);
    System.out.println("Topological Sort: " + topoOrder);
  }

  public static List<Integer> topologicalSort(int V, List<List<Integer>> adj) {
    int[] indegree = new int[V];
    for (int u = 0; u < V; u++) {
      for (int v : adj.get(u)) {
        indegree[v]++;
      }
    }

    Queue<Integer> q = new LinkedList<>();
    for (int i = 0; i < V; i++) {
      if (indegree[i] == 0)
        q.add(i);
    }

    List<Integer> topo = new ArrayList<>();
    while (!q.isEmpty()) {
      int u = q.poll();
      topo.add(u);
      for (int v : adj.get(u)) {
        indegree[v]--;
        if (indegree[v] == 0)
          q.add(v);
      }
    }

    if (topo.size() != V) {
      throw new RuntimeException("Graph has a cycle, topological sort not possible.");
    }
    return topo;
  }
}
