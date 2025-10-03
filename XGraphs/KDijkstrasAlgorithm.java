package XGraphs;

import java.util.*;

public class KDijkstrasAlgorithm {
  static class Edge {
    int to, weight;

    Edge(int to, int weight) {
      this.to = to;
      this.weight = weight;
    }
  }

  public static int[] dijkstra(List<List<Edge>> graph, int source) {
    int n = graph.size();
    int[] dist = new int[n];
    Arrays.fill(dist, Integer.MAX_VALUE);
    dist[source] = 0;

    PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
    pq.offer(new int[] { source, 0 });

    while (!pq.isEmpty()) {
      int[] curr = pq.poll();
      int u = curr[0], d = curr[1];
      if (d > dist[u])
        continue;
      for (Edge edge : graph.get(u)) {
        int v = edge.to, w = edge.weight;
        if (dist[u] + w < dist[v]) {
          dist[v] = dist[u] + w;
          pq.offer(new int[] { v, dist[v] });
        }
      }
    }
    return dist;
  }

  // Example usage
  public static void main(String[] args) {
    int n = 5;
    List<List<Edge>> graph = new ArrayList<>();
    for (int i = 0; i < n; i++)
      graph.add(new ArrayList<>());
    // Add edges: graph.get(from).add(new Edge(to, weight));
    graph.get(0).add(new Edge(1, 10));
    graph.get(0).add(new Edge(2, 3));
    graph.get(1).add(new Edge(2, 1));
    graph.get(1).add(new Edge(3, 2));
    graph.get(2).add(new Edge(1, 4));
    graph.get(2).add(new Edge(3, 8));
    graph.get(2).add(new Edge(4, 2));
    graph.get(3).add(new Edge(4, 7));
    graph.get(4).add(new Edge(3, 9));

    int[] dist = dijkstra(graph, 0);
    System.out.println("Shortest distances from node 0:");
    for (int i = 0; i < dist.length; i++) {
      System.out.println("To node " + i + ": " + dist[i]);
    }
  }
}
