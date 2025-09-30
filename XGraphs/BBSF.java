package XGraphs;

import java.util.*;

public class BBSF {
  static class Edge {
    int src, dest, wt;
    public Edge(int s, int d, int w) {
      this.src = s;
      this.dest = d;
      this.wt = w;
    }
  }

  public static void createGraph(ArrayList<Edge>[] graph) {
    for (int i = 0; i < graph.length; i++) {
      graph[i] = new ArrayList<>();
    }
    graph[0].add(new Edge(0, 1, 5));
    graph[0].add(new Edge(0, 2, 1));
    graph[1].add(new Edge(1, 0, 5));
    graph[1].add(new Edge(1, 2, 1));
    graph[1].add(new Edge(1, 3, 3));
    graph[2].add(new Edge(2, 0, 1));
    graph[2].add(new Edge(2, 1, 1));
    graph[2].add(new Edge(2, 3, 1));
    graph[2].add(new Edge(2, 4, 2));
    graph[3].add(new Edge(3, 1, 3));
    graph[3].add(new Edge(3, 2, 1));
    graph[4].add(new Edge(4, 2, 2));
  }

  public static void bfs(ArrayList<Edge>[] graph, int V, int start) {
    boolean[] visited = new boolean[V];
    Queue<Integer> q = new LinkedList<>();
    q.add(start);
    visited[start] = true;

    while (!q.isEmpty()) {
      int curr = q.remove();
      System.out.print(curr + " ");
      for (Edge e : graph[curr]) {
        if (!visited[e.dest]) {
          q.add(e.dest);
          visited[e.dest] = true;
        }
      }
    }
  }

  public static void main(String[] args) {
    int V = 5;
    ArrayList<Edge>[] graph = new ArrayList[V];
    createGraph(graph);
    System.out.print("BFS traversal: ");
    bfs(graph, V, 0);
  }
}